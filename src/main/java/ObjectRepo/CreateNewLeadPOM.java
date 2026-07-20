package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtility.SeleniumUtility;

/**
 * Helper POM Class
 * @author Jashwanth
 */
public class CreateNewLeadPOM {

	@FindBy(xpath = "(//select[@class='small'])[2]")
	private WebElement fNameDropDown;
	
	@FindBy(name = "firstname")
	private WebElement fNameTF;
	
	@FindBy(name = "lastname")
	private WebElement lNameTF;
	
	@FindBy(name = "company")
	private WebElement companyTF;
	
	@FindBy(xpath = "(//select[@class='small'])[3]")
	private WebElement leadSourceSelect;
	
	@FindBy(name = "designation")
	private WebElement titleTF;
	
	@FindBy(id = "noofemployees")
	private WebElement noOfEmployees;
	
	@FindBy(id = "mobile")
	private WebElement mobileTF;
	
	@FindBy(id = "email")
	private WebElement emailTF;
	
	@FindBy(id = "state")
	private WebElement stateTF;
	
	@FindBy(id = "city")
	private WebElement cityTF;
	
	@FindBy(css = "#country")
	private WebElement countryTF;
	
	@FindBy(xpath = "//input[@title='Save [Alt+S]']")
	private WebElement saveBtn;
	
	public CreateNewLeadPOM(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getfNameDropDown() {
		return fNameDropDown;
	}

	public WebElement getfNameTF() {
		return fNameTF;
	}

	public WebElement getlNameTF() {
		return lNameTF;
	}

	public WebElement getCompanyTF() {
		return companyTF;
	}

	public WebElement getLeadSourceSelect() {
		return leadSourceSelect;
	}

	public WebElement getTitleTF() {
		return titleTF;
	}

	public WebElement getNoOfEmployees() {
		return noOfEmployees;
	}

	public WebElement getMobileTF() {
		return mobileTF;
	}

	public WebElement getEmailTF() {
		return emailTF;
	}

	public WebElement getStateTF() {
		return stateTF;
	}

	public WebElement getCityTF() {
		return cityTF;
	}

	public WebElement getCountryTF() {
		return countryTF;
	}

	public WebElement getSaveBtn() {
		return saveBtn;
	}
	
	/**
	 * This method pass arguments like
	 * @param fnameDropDown
	 * @param fname
	 * @param lname
	 * @param company
	 */
	public void createNewLead(String fnameDD, String fname, String lname, String company) {
		new SeleniumUtility().selectOptionByValue(fNameDropDown, fnameDD); 
		getfNameTF().sendKeys(fname);
		getlNameTF().sendKeys(lname);
		getCompanyTF().sendKeys(company);
		getSaveBtn().click();
	}
	
	/**
	 * This is overloaded method 
	 * @param fnameDropDown
	 * @param fname
	 * @param lname
	 * @param company
	 * @param mobile
	 * @param email
	 * @param designation
	 * @param numofEmp
	 */
	public void createNewLead(String fnameDD, String fname, String lname, String company,String mobile,String email,String designation,String numofEmp) {
		new SeleniumUtility().selectOptionByValue(fNameDropDown, fnameDD); 
		getfNameTF().sendKeys(fname);
		getlNameTF().sendKeys(lname);
		getCompanyTF().sendKeys(company);
		getMobileTF().sendKeys(mobile);
		getEmailTF().sendKeys(email);
		getTitleTF().sendKeys(designation);
		getNoOfEmployees().sendKeys(numofEmp);
		
		getSaveBtn().click();
	}
	
	/**
	 * this is overloaded method
	 * @param fnameDropDown
	 * @param fname
	 * @param lname
	 * @param company
	 * @param mobile
	 * @param email
	 * @param designation
	 * @param numofEmp
	 * @param leadSource
	 * @param country
	 * @param state
	 * @param city
	 */
	public void createNewLead(String fnameDD, String fname, String lname, String company,String mobile,String email,String designation,String numofEmp
			,String leadSource, String country,String state, String city) {
		new SeleniumUtility().selectOptionByValue(fNameDropDown, fnameDD); 
		getfNameTF().sendKeys(fname);
		getlNameTF().sendKeys(lname);
		getCompanyTF().sendKeys(company);
		getMobileTF().sendKeys(mobile);
		getEmailTF().sendKeys(email);
		getTitleTF().sendKeys(designation);
		getNoOfEmployees().sendKeys(numofEmp);
		new SeleniumUtility().selectOptionByValue(leadSourceSelect, leadSource); 
		getCountryTF().sendKeys(country);
		getStateTF().sendKeys(state);
		getCityTF().sendKeys(city);
		getSaveBtn().click();
	}
}
