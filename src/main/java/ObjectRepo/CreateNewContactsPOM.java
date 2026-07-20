package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//import genericUtility.SeleniumUtility;

/**
 * Helper POM Class
 * @author Jashwanth
 */
public class CreateNewContactsPOM {

	@FindBy(className = "small")
	private WebElement fNameDropDown;
	
	@FindBy(name = "firstname")
	private WebElement fNameTF;
	
	@FindBy(name = "lastname")
	private WebElement lNameTF;
	
	
	
	@FindBy(xpath = "//td[@class='dvtCellInfo']/select[@name='leadsource']")
	private WebElement leadSourceSelect;
	
	@FindBy(name = "title")
	private WebElement titleTF;
	
	@FindBy(name = "department")
	private WebElement departmentTF;
	
	@FindBy(id = "mobile")
	private WebElement mobileTF;
	
	@FindBy(id = "email")
	private WebElement emailTF;
	
	@FindBy(id = "mailingstate")
	private WebElement mailingStateTF;
	
	@FindBy(id = "mailingcity")
	private WebElement mailingCityTF;
	
	@FindBy(css = "#mailingcountry")
	private WebElement mailingCountryTF;
	
	@FindBy(xpath = "//input[@title='Save [Alt+S]']")
	private WebElement saveBtn;
	
	public CreateNewContactsPOM(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}


	public WebElement getfNameTF() {
		return fNameTF;
	}

	public WebElement getlNameTF() {
		return lNameTF;
	}

	public WebElement getLeadSourceSelect() {
		return leadSourceSelect;
	}

	public WebElement getTitleTF() {
		return titleTF;
	}

	public WebElement getDepartmentTF() {
		return departmentTF;
	}

	public WebElement getMobileTF() {
		return mobileTF;
	}

	public WebElement getEmailTF() {
		return emailTF;
	}

	public WebElement getMailingStateTF() {
		return mailingStateTF;
	}

	public WebElement getMailingCityTF() {
		return mailingCityTF;
	}

	public WebElement getMailingCountryTF() {
		return mailingCountryTF;
	}

	public WebElement getSaveBtn() {
		return saveBtn;
	}
	
	/**
	 * This business library method helps to create new contact
	 * @param fName
	 * @param lName
	 * @param title
	 */
	public void createNewContacts(String fName, String lName,String title) {
		getfNameTF().sendKeys(fName);
		getlNameTF().sendKeys(lName);
		getTitleTF().sendKeys(title);
		getSaveBtn().click();
	}
	
	/**
	 * This business library method helps to create new contact
	 * @param lName
	 * @param department
	 * @param email
	 * @param mobile
	 */
	public void createNewContacts(String lName, String department,String email,String mobile) {
		
		getlNameTF().sendKeys(lName);
		getDepartmentTF().sendKeys(department);
		getEmailTF().sendKeys(email);
		getMobileTF().sendKeys(mobile);
		getSaveBtn().click();
	}
	
	/**
	 * This business library method helps to create new contact
	 * @param lName
	 * @param title
	 * @param email
	 * @param mailingcity
	 * @param mailingstate
	 * @param mailingcountry
	 */
	public void createNewContacts(String lName,String title,String email,String mailingCity,String mailingState, String mailingCountry) {
		
		getlNameTF().sendKeys(lName);
		getTitleTF().sendKeys(title);
		getEmailTF().sendKeys(email);
		getMailingCityTF().sendKeys(mailingCity);
		getMailingStateTF().sendKeys(mailingState);
		getMailingCountryTF().sendKeys(mailingCountry);
		getSaveBtn().click();
	}

}