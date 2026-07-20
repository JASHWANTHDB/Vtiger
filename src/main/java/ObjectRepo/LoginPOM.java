package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOM {

	//locate
	@FindBy(name = "user_name")
	private WebElement usernameTF;
	
	@FindBy(name = "user_password")
	private WebElement passwordTF;
	
	@FindBy(id = "submitButton")
	private WebElement loginBtn;
	
	//initializing
	public LoginPOM(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	
	//Utilizing
	
	public WebElement getUsernameTF() {
		return usernameTF;
	}

	public WebElement getPasswordTF() {
		return passwordTF;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}
	
	/**
	 * this is business method 
	 * @param UN
	 * @param pwd
	 */
	public void getLoginToApplication(String un, String pwd) {
		getUsernameTF().sendKeys(un);
	    getPasswordTF().sendKeys(pwd);
	    getLoginBtn().click();
	}
	
	
}
