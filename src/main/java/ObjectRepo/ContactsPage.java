package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactsPage {

	
	@FindBy(xpath = "//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement createNewContactsIcon;
	
	public ContactsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getCreateNewContactsIcon() {
		return createNewContactsIcon;
	}
	
	/**
	 * This business library method used to create new Contacts
	 */
	public void clickOnContactsIcon() {
		getCreateNewContactsIcon().click();
	}
}
