package practice;

import java.io.IOException;

//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import ObjectRepo.CreateNewLeadPOM;
import ObjectRepo.HomePagePOM;
import ObjectRepo.LeadsPagePOM;

//import ObjectRepo.LoginPOM;
import genericUtility.BaseClass;
//import genericUtility.ExcelUtility;
//import genericUtility.PropertiesUtility;
//import genericUtility.SeleniumUtility;

public class TC_003_Practice extends BaseClass {

	@Test
	public void LE_003() throws IOException, InterruptedException {

		
//		SeleniumUtility sutil = new SeleniumUtility();
//		PropertiesUtility putil = new PropertiesUtility();
//		WebDriver driver = new ChromeDriver();
//		sutil.maximizeWindow(driver);
//		sutil.implicitWait(driver, 10);
//		String url =  putil.getDataFromProperties("url");
//		sutil.accessApplocation(driver, url);
		
		
		
		//LoginPOM lp = new LoginPOM(driver);
//		String un = putil.getDataFromProperties("username");
//		String pwd = putil.getDataFromProperties("password");
//		lp.getLoginToApplication(un , pwd );

		
		sutil.refresh(driver);
		
		HomePagePOM hm = new HomePagePOM(driver);
		
		
		hm.clickOnLeadsMenu();
		
		LeadsPagePOM lppom = new LeadsPagePOM(driver);
		lppom.clickOnCreateNewLeadIcon();
		
		CreateNewLeadPOM cnl = new CreateNewLeadPOM(driver);
		
		
		
		
		//cnl.createNewLead(excel.getDataFromExcel("Leads", 1, 2), excel.getDataFromExcel("Leads", 1, 3), excel.getDataFromExcel("Leads", 1, 4));
		cnl.createNewLead(eutil.getDataFromExcel("Leads", 8, 1),eutil.getDataFromExcel("Leads", 8, 2), eutil.getDataFromExcel("Leads", 8, 3), 
				eutil.getDataFromExcel("Leads", 8, 4), eutil.getDataFromExcel("Leads", 8, 5), eutil.getDataFromExcel("Leads", 8, 6), 
				eutil.getDataFromExcel("Leads", 8, 7), eutil.getDataFromExcel("Leads", 8, 8), eutil.getDataFromExcel("Leads", 8, 9),
				eutil.getDataFromExcel("Leads", 8, 10), eutil.getDataFromExcel("Leads", 8,11),eutil.getDataFromExcel("Leads", 8, 12));
		//hm.SignoutOperation(driver);
	
	}

}
