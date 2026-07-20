package practice;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import ObjectRepo.CreateNewLeadPOM;
import ObjectRepo.HomePagePOM;
import ObjectRepo.LeadsPagePOM;
import genericUtility.BaseClass;

public class TC_002_Practice extends BaseClass {

	
	@Test
	public void LC_002() throws EncryptedDocumentException, IOException {
		HomePagePOM hp = new HomePagePOM(driver);
		hp.clickOnLeadsMenu();
		
		LeadsPagePOM lp = new LeadsPagePOM(driver);
		lp.clickOnCreateNewLeadIcon();
		
		CreateNewLeadPOM cr = new CreateNewLeadPOM(driver);
		
		cr.createNewLead(eutil.getDataFromExcel("Leads", 5, 1), eutil.getDataFromExcel("Leads", 5, 2), eutil.getDataFromExcel("Leads", 5, 3), eutil.getDataFromExcel("Leads", 5, 4), 
				eutil.getDataFromExcel("Leads", 5, 5), eutil.getDataFromExcel("Leads", 5, 6), eutil.getDataFromExcel("Leads", 5, 7), eutil.getDataFromExcel("Leads", 5, 8));
	}
}
