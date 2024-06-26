package Pagepackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.surveillance.utilitiy.GenericKeywordsWithPage;

public class opencartpage 
{
	
	public opencartpage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}

	
	
	@FindBy(name="username")
	WebElement userName;
	
	@FindBy(name="password")
	WebElement password;
	  
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement login;
	 
	GenericKeywordsWithPage key = new GenericKeywordsWithPage("opencart1");

	
	
	
	
//	public void enterUsername(String enteruserId) throws Throwable
//	{
//		WebElement userNameEnterdata = key.driver.findElement(By.xpath("//input[@id='input-username']"));
//		userNameEnterdata.click();
//
//		Actions act = new Actions(key.driver);
//		act.doubleClick(userNameEnterdata).perform();
//		Thread.sleep(4000);
//		key.enterData(userNameEnterdata, enteruserId);
//	}
//	
//	public void enterPassword(String enterpassword) throws InterruptedException
//	{
//		WebElement passwordEnterdata = key.driver.findElement(By.xpath("//input[@id='input-password']"));
//		passwordEnterdata.click();
//		Actions act = new Actions(key.driver);
//		act.doubleClick(passwordEnterdata).perform();
//		Thread.sleep(4000);
//		key.enterData(passwordEnterdata, enterpassword);
//	}
//	
	
	public void enterPassword(String enterpassword) 
	{
		
		key.clearEnter(userName, enterpassword);
	}
	
	
	public void enterUsername(String enteruserId) 
	{
		
		key.clearEnter(password, enteruserId);
	}

	
	public void loginButton()
	{
		key.click(login);
	}

}
