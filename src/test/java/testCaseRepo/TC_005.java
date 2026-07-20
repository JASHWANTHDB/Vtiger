package testCaseRepo;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import ObjectRepo.CreateNewContactsPOM;
import ObjectRepo.HomePagePOM;
import ObjectRepo.LeadsPagePOM;
import genericUtility.BaseClass;

public class TC_005 extends BaseClass {

	@Test
	public void CON_002() throws EncryptedDocumentException, IOException {
		HomePagePOM hp = new HomePagePOM(driver);
		hp.clickOnContactsmenu();
		
		LeadsPagePOM lp = new LeadsPagePOM(driver);
		lp.clickOnCreateNewLeadIcon();
		
		CreateNewContactsPOM cr = new CreateNewContactsPOM(driver);
		String lname = eutil.getDataFromExcel("Contacts", 4, 1);
		String dept = eutil.getDataFromExcel("Contacts", 4, 2);
		String email = eutil.getDataFromExcel("Contacts", 4, 3);
		String mobile = eutil.getDataFromExcel("Contacts", 4, 4);
		cr.createNewContacts(lname, dept, email, mobile);
	}
}
