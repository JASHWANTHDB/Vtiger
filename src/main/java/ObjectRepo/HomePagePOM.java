package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtility.SeleniumUtility;

public class HomePagePOM {

	
	@FindBy(xpath = "//td[@class = 'tabUnSelected']/a[text()='Leads']")
	private WebElement leadsMenu;
	
	@FindBy(xpath = "//a[text()='Contacts']")
	private WebElement contactsmenu;
	
	@FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']")
	private WebElement accountsIcon;
	
	@FindBy(xpath = "//a[text() = 'Sign Out']")
	private WebElement signout;
	
	public HomePagePOM(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getLeadsMenu() {
		return leadsMenu;
	}

	public WebElement getContactsmenu() {
		return contactsmenu;
	}

	public WebElement getAccountsIcon() {
		return accountsIcon;
	}

	public WebElement getSignout() {
		return signout;
	}
	
	
	/**
	 * this is used to click on LeadsMenu
	 * 
	 */
	public void clickOnLeadsMenu() {
		getLeadsMenu().click();
	}
	

	/**
	 * this is used to click on ContactsMenu
	 * 
	 */
	public void clickOnContactsmenu() {
		getContactsmenu().click();
	}
	

	/**
	 * this is used to signout from site
	 * @return WebElemet
	 */
	public void SignoutOperation(WebDriver driver) {
		SeleniumUtility sutil = new SeleniumUtility();
		sutil.mouseHovering(driver, accountsIcon);
		//getAccountsIcon().click();
		getSignout().click();
	}
}
