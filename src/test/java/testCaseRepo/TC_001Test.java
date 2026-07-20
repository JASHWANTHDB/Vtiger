package testCaseRepo;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
//import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import ObjectRepo.CreateNewLeadPOM;
import ObjectRepo.HomePagePOM;
import ObjectRepo.LeadsPagePOM;
import genericUtility.BaseClass;

@Listeners(genericUtility.ListenersImplementation.class)
public class TC_001Test extends BaseClass {

	
	int n =0;
	
	@Test(groups= {"Smoke","Sanity"},retryAnalyzer = genericUtility.RetryAnayzerImplementation.class)
	public void LE_001() throws EncryptedDocumentException, IOException {
		HomePagePOM hp = new HomePagePOM(driver);
		hp.clickOnLeadsMenu();
		
		LeadsPagePOM lp = new LeadsPagePOM(driver);
		lp.clickOnCreateNewLeadIcon();
		
		CreateNewLeadPOM cr = new CreateNewLeadPOM(driver);
		String firstNameDropDown = eutil.getDataFromExcel("Leads", 1, 1);
		String firstName = eutil.getDataFromExcel("Leads", 1, 2);
		String lastName = eutil.getDataFromExcel("Leads", 1, 3);
		String companyName = eutil.getDataFromExcel("Leads", 1, 4);
		cr.createNewLead(firstNameDropDown, firstName, lastName, companyName);
	}
}
