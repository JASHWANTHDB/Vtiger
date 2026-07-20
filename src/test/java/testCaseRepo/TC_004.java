package testCaseRepo;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import ObjectRepo.CreateNewContactsPOM;
import ObjectRepo.HomePagePOM;
import ObjectRepo.LeadsPagePOM;
import genericUtility.BaseClass;

public class TC_004 extends BaseClass {

	
	@Test(groups= {"Sanity"})
	public void CON_001() throws EncryptedDocumentException, IOException {
		HomePagePOM hp = new HomePagePOM(driver);
		hp.clickOnContactsmenu();
		
		LeadsPagePOM lp = new LeadsPagePOM(driver);
		lp.clickOnCreateNewLeadIcon();
		
		CreateNewContactsPOM cr = new CreateNewContactsPOM(driver);
		String fname = eutil.getDataFromExcel("Contacts",1 , 1);
		String lname = eutil.getDataFromExcel("Contacts",1 , 1);
		String title = eutil.getDataFromExcel("Contacts",1 , 1);
		cr.createNewContacts(fname, lname, title);
	}
}

