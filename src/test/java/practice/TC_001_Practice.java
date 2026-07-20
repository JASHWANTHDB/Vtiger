package practice;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import ObjectRepo.CreateNewLeadPOM;
import ObjectRepo.HomePagePOM;
import ObjectRepo.LeadsPagePOM;
import genericUtility.BaseClass;

public class TC_001_Practice extends BaseClass {

	@Test
	public void LE_001() throws EncryptedDocumentException, IOException {
		HomePagePOM hp = new HomePagePOM(driver);
		hp.clickOnLeadsMenu();
		
		LeadsPagePOM lp = new LeadsPagePOM(driver);
		lp.clickOnCreateNewLeadIcon();
		
		CreateNewLeadPOM cr = new CreateNewLeadPOM(driver);
		String firstnamedrop = eutil.getDataFromExcel("Leads", 1, 1);
		String firstname = eutil.getDataFromExcel("Leads", 1, 2);
		String lastname = eutil.getDataFromExcel("Leads", 1, 3);
		String company = eutil.getDataFromExcel("Leads", 1, 4);
		cr.createNewLead(firstnamedrop,firstname ,lastname , company);
	}
}
