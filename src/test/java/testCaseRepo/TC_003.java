package testCaseRepo;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import ObjectRepo.CreateNewLeadPOM;
import ObjectRepo.HomePagePOM;
import ObjectRepo.LeadsPagePOM;
import genericUtility.BaseClass;

public class TC_003 extends BaseClass {

	
	@Test(groups = {"Regression"})
	public void LE_003() throws EncryptedDocumentException, IOException {
		HomePagePOM hp = new HomePagePOM(driver);
		hp.clickOnLeadsMenu();
		
		LeadsPagePOM lp = new LeadsPagePOM(driver);
		lp.clickOnCreateNewLeadIcon();
		
		CreateNewLeadPOM cr = new CreateNewLeadPOM(driver);
		String firstNameDropDown = eutil.getDataFromExcel("Leads", 8, 1);
		String firstName = eutil.getDataFromExcel("Leads", 8, 2);
		String lastName = eutil.getDataFromExcel("Leads", 8, 3);
		String companyName = eutil.getDataFromExcel("Leads", 8, 4);
		String mobile = eutil.getDataFromExcel("Leads", 8, 5);
		String email = eutil.getDataFromExcel("Leads", 8, 6);
		String designation = eutil.getDataFromExcel("Leads", 8, 7);
		String noofemp = eutil.getDataFromExcel("Leads", 8, 8);
		String leadsSourceDropDown = eutil.getDataFromExcel("Leads", 8, 9);
		String country = eutil.getDataFromExcel("Leads", 8, 10);
		String state = eutil.getDataFromExcel("Leads", 8, 11);
		String city = eutil.getDataFromExcel("Leads", 8, 12);
		cr.createNewLead(firstNameDropDown, firstName, lastName, companyName, mobile, email, designation, noofemp, leadsSourceDropDown, country, state, city);
	}

	
}
