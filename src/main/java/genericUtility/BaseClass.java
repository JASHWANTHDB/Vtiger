package genericUtility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import ObjectRepo.HomePagePOM;
import ObjectRepo.LoginPOM;

public class BaseClass {

	protected SeleniumUtility sutil = new SeleniumUtility();
	protected ExcelUtility eutil = new ExcelUtility();
	protected PropertiesUtility putil = new PropertiesUtility();
	protected WebDriver driver;
	public static WebDriver sdriver;

	@BeforeSuite(alwaysRun = true)
	public void bsConfig() {
		System.out.println("DB Connected");
	}

	@Parameters("browser")
	@BeforeClass(alwaysRun = true)
	public void bcConfig(@Optional("chrome") String Browser) throws IOException {
		if (Browser.equals("chrome")) {
			driver = new ChromeDriver();
			System.setProperty("webdriver.edge,driver", "");
		} else if (Browser.equals("edge")) {
			driver = new EdgeDriver();
		} else if (Browser.equals("Firefox")) {
			driver = new FirefoxDriver();
		} else {
			driver = new EdgeDriver();
		}
		sdriver = driver;
		sutil.maximizeWindow(driver);
		sutil.implicitWait(driver, 10);
		String url = putil.getDataFromProperties("url");
		sutil.accessApplocation(driver, url);
		System.out.println("Launched browser Successfully");
	}

	@BeforeMethod(alwaysRun = true)
	public void bmConfig() throws IOException {
		String un = putil.getDataFromProperties("username");
		String pwd = putil.getDataFromProperties("password");
		LoginPOM lp = new LoginPOM(driver);
		lp.getLoginToApplication(un, pwd);
		System.out.println("Login successfully");
	}

	@AfterMethod(alwaysRun = true)
	public void amConfig() {
		HomePagePOM hp = new HomePagePOM(driver);
		// hp.getAccountsIcon();
		hp.SignoutOperation(driver);
		System.out.println("Signout Successfully");
	}

	@AfterClass(alwaysRun = true)
	public void acConfig() {
		sutil.closeBrower(driver);
		System.out.println("Browser Closed Successfully");
	}

	@AfterSuite(alwaysRun = true)
	public void asConfig() {
		System.out.println("DB disconnected");
	}
}
