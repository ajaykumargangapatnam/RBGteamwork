package Pagepackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.surveillance.utilitiy.GenericKeywordsWithPage;

public class SpecialOrangeHrmLoginPage4 
{
	public SpecialOrangeHrmLoginPage4(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath ="//input[@name='username']")
	WebElement username;
	
	@FindBy(xpath = "//input[@name='password']")
	WebElement passWord;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement login;
	
	@FindBy(xpath = "//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']")
	WebElement forgotPassword;
	
	@FindBy(xpath = "//span[text()='Admin']")
	WebElement adMin;
	
	@FindBy(xpath = "//span[text()='Configuration ']")
	WebElement config;
	
	@FindBy(xpath = "//a[text()='Email Configuration']")
	WebElement emailConfig;
	
	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
	WebElement mailId;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement saveButton;
	
	GenericKeywordsWithPage keys = new GenericKeywordsWithPage("SpecialOrangeHrmLoginPage");
	public void orusername(String enteruserId) 
	{
		keys.enterData(username, enteruserId);

	}
	public void orpassword(String enterpassword) 
	{
		keys.enterData(passWord, enterpassword);

	}
	public void loginbutton() 
	{
		keys.click(login);

	}
	public void forgotpassword()
	{
		keys.click(forgotPassword);
	}
	public void admin() 
	{
		keys.click(adMin);
		
	}
	public void configuration()
	{
		keys.click(config);
	}
	public void emailconfiguration()
	{
		keys.click(emailConfig);
		
	}
	public void entermailId(String entermailId) throws InterruptedException
	{
		//keys.enterData(mailId, entermailId);
		
		keys.click(mailId);
		Actions act = new Actions(keys.driver);
		//act.doubleClick(emailaddress).perform();
		//Thread.sleep(3000);
		act.keyDown(Keys.CONTROL);
		act.sendKeys("a");
		act.keyUp(Keys.CONTROL);
		act.perform();
		act.keyUp(Keys.CONTROL);
		act.perform();
		act.keyDown(Keys.BACK_SPACE).perform();
		Thread.sleep(4000);
		act.keyUp(Keys.CONTROL).sendKeys(entermailId).perform();
		//keys.enterData(mailId, entermailId);
		
	}
	public void save()
	{
		keys.click(saveButton);
	}
	
}
