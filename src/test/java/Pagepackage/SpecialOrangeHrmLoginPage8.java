package Pagepackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.surveillance.utilitiy.GenericKeywordsWithPage;

public class SpecialOrangeHrmLoginPage8 
{
	public SpecialOrangeHrmLoginPage8(WebDriver driver)
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
	
	@FindBy(xpath = "//a[text() = 'Social Media Authentication']")
	WebElement socialmedia;
	
	@FindBy(xpath = "//button[text() = ' Add ']")
	WebElement addbutton;
	
	@FindBy(xpath = "//label[text() ='Name']/parent::div/following-sibling::div/input")
	WebElement name;
	
	@FindBy(xpath = "//label[text() = 'Provider URL']/parent::div/following-sibling::div/input")
	WebElement url;
	
	@FindBy(xpath = "//label[text() = 'Client ID']/parent::div/following-sibling::div/input")
	WebElement clientId;
	
	@FindBy(xpath = "//label[text() = 'Client Secret']/parent::div/following-sibling::div/input")
	WebElement clientserver;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement savebutton;
	
	GenericKeywordsWithPage keys = new GenericKeywordsWithPage("SpecialOrangeHrmLoginPage7");
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
	public void socialmediaconfig()
	{
		keys.click(socialmedia);
		
	}
	public void clickadd() 
	{
		keys.click(addbutton);
		
	}
	
	public void entername(String socialmedianame) 
	{
		keys.enterData(name, socialmedianame);
		
	}
	public void enterurl(String socialmediaurl) 
	{
		keys.enterData(url, socialmediaurl);
		
	}
	public void enterclientid(String socialmediaclient) 
	{
		keys.enterData(clientId, socialmediaclient);
	
	}
	public void enterclientserver(String socialmediaclientserver) 
	{
		keys.enterData(clientserver, socialmediaclientserver);
		
	}
	public void clicksave() throws InterruptedException
	{
		keys.click(savebutton);
		Thread.sleep(3000);
	}
	
}
