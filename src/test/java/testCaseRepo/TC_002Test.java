package testCaseRepo;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import ObjectRepo.CreateNewLeadPOM;
import ObjectRepo.HomePagePOM;
import ObjectRepo.LeadsPagePOM;
import genericUtility.BaseClass;

public class TC_002Test extends BaseClass {
	@Test(groups = {"Smoke"})
	public void LC_002() throws EncryptedDocumentException, IOException {
		HomePagePOM hp = new HomePagePOM(driver);
		hp.clickOnLeadsMenu();
		
		LeadsPagePOM lp = new LeadsPagePOM(driver);
		lp.clickOnCreateNewLeadIcon();
		
		CreateNewLeadPOM cr = new CreateNewLeadPOM(driver);
		
		String firstNameDropDown = eutil.getDataFromExcel("Leads", 5, 1);
		String firstName = eutil.getDataFromExcel("Leads", 5, 2);
		String lastName = eutil.getDataFromExcel("Leads", 5, 3);
		String companyName = eutil.getDataFromExcel("Leads", 5, 4);
		String mobile = eutil.getDataFromExcel("Leads", 5, 5);
		String email = eutil.getDataFromExcel("Leads", 5, 6);
		String designation = eutil.getDataFromExcel("Leads", 5, 7);
		String nofoEmp = eutil.getDataFromExcel("Leads", 5, 8);
		cr.createNewLead(firstNameDropDown, firstName, lastName,companyName,mobile,email,designation,nofoEmp);
	}
}
