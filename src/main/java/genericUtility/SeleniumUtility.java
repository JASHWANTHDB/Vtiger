package genericUtility;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

/**
 * Helper Class
 * @author Jashwanth
 */
public class SeleniumUtility {
	/**
	 * this is a method to access the browser
	 * @param driver
	 * @param url
	 */
	
	public void accessApplocation(WebDriver driver,String url)
	{
		driver.get(url);
	}
	/**
	 * this is a method to maximize window
	 * @param driver
	 */
	
	public void maximizeWindow(WebDriver driver)
	{
		driver.manage().window().maximize();
	}
	/**
	 * this is a method to apply implicit wait
	 * @param driver
	 * @param maxsec
	 */
	public void implicitWait(WebDriver driver,int maxsec)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(maxsec));
	}
	/**
	 * this is a method to close the browser
	 * @param driver
	 */
	
	public void closeBrower(WebDriver driver)
	{
		driver.quit();
	}
	
	/////////DropDown/////
	/**
	 * This is a method to select a option in dropdown by by value attribute 
	 * @param dropdownElement
	 * @param value
	 */
	public void selectOptionByValue(WebElement dropdownElement,String value)
	{
		Select s= new Select(dropdownElement);
		s.selectByValue(value);
	}
	
	/**
	 * This is a method to select a option in dropdown by index attribute 
	 * @param dropElement
	 */
	public void selectOptionByIndex(WebElement dropElement,int index )
	{
		Select s= new Select(dropElement);
		s.selectByIndex(index);
	}
	
	///////////////Mouse Actions///////////////
	
	/*
	 * This is a method to perform mouse hovering action on a webelement
	 */
	public void mouseHovering(WebDriver driver,WebElement element)
	{
		new Actions(driver).moveToElement(element).perform();
	}
	/**
	 * This is a method to perform right click action on a web element
	 * @param driver
	 * @param element
	 */
	public void rightClick(WebDriver driver, WebElement element)
	{
		new Actions(driver).contextClick(element).perform();
	}
/**
 * This is a method to scroll the web page
 * @param driver
 * @param element
 */
	public void scrollWebPage(WebDriver driver,WebElement element)
	{
		new Actions(driver).scrollToElement(element);
	}
///////////////Alert///////
/**
 * This is a method to accept an alert popup
 * @param driver
 */
	public void acceptAlert(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}
	/**
	 * This is a method to cancle an alert popup
	 * @param driver
	 */
	public void cancleAlert(WebDriver driver)
	{
		driver.switchTo().alert().dismiss();
	}
	
	/////////////Frames/////////
	
	/**
	 * This is a method to switch the control in a frame using index
	 * @param driver
	 * @param index
	 */
	public void switchToFrameUsingIndex(WebDriver driver,int index)
	{
		driver.switchTo().frame(index);
	}
	/**
	 * This is a method to switch frames using name or index
	 * @param driver
	 * @param nameOrid
	 */
	public void switchToFrameUsingNameorId(WebDriver driver,String nameOrid)
	{
		driver.switchTo().frame(nameOrid);
	}
	
	///////////////File Upload////////////
	/**
	 * This is a method to upload a file to a webpage
	 * @param fileuoloadEle
	 * @param filepath
	 */
	public void uploadFile(WebElement fileuoloadEle,String filepath)
	{
		fileuoloadEle.sendKeys(filepath);
	}
	
	public void refresh(WebDriver driver) {
		driver.navigate().refresh();
	}
	
	/////////Multiple Windows///////
	/**
	 * This is a method to switch the control to second tab
	 * @param driver
	 */
	public void switchToAnotherTabWhenTwoTabs(WebDriver driver,int index)
	{
		String pid=driver.getWindowHandle();
		Set<String> allIds=driver.getWindowHandles();
		for(String Id:allIds)
		{
			if(!Id.equals(pid))
			{
				driver.switchTo().window(Id);
			}
		}
	}
	/*
	 * Screenshot method
	 */
	public String takeWebpageScreenshot(WebDriver driver,String name) throws IOException {
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		String dest = "F:\\selenium\\VTiger\\Screenshot\\"+name+".png";
		File destination = new File(dest);
		Files.copy(src, destination);
		return dest;
	}
}