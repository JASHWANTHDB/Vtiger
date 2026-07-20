package testCaseRepo;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import ObjectRepo.CreateNewContactsPOM;
import ObjectRepo.HomePagePOM;
import ObjectRepo.LeadsPagePOM;
import genericUtility.BaseClass;

public class TC_006 extends BaseClass{
	
	@Test
	public void CON_003() throws EncryptedDocumentException, IOException {
		HomePagePOM hp = new HomePagePOM(driver);
		hp.clickOnContactsmenu();
		
		LeadsPagePOM lp = new LeadsPagePOM(driver);
		lp.clickOnCreateNewLeadIcon();
		
		CreateNewContactsPOM cr = new CreateNewContactsPOM(driver);
		String lname = eutil.getDataFromExcel("Contacts", 7, 1);
		String title = eutil.getDataFromExcel("Contacts", 7, 2);
		String email =  eutil.getDataFromExcel("Contacts", 7, 3);
		String mailingcity = eutil.getDataFromExcel("Contacts", 7, 4);
		String mailingstate = eutil.getDataFromExcel("Contacts", 7, 5);
		String mailingcountry = eutil.getDataFromExcel("Contacts", 7, 6);
		cr.createNewContacts(lname, title, email, mailingcity, mailingstate, mailingcountry);
	}

}
