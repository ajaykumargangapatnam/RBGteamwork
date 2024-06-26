package Pagepackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.surveillance.utilitiy.GenericKeywordsWithPage;

public class SpecialOrangeHrmLoginPage9 
{
	public SpecialOrangeHrmLoginPage9(WebDriver driver)
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
	
	@FindBy(xpath = "//a[text() = 'Register OAuth Client']")
	WebElement registerOauth;
	
	@FindBy(xpath = "//button[text() = ' Add ']")
	WebElement add;
	
	@FindBy(xpath = "//label[text() = 'Name']/parent::div/following-sibling::div/input")
    WebElement oauthName;
	
	@FindBy(xpath = "//label[text() = 'Redirect URI']/parent::div/following-sibling::div/input")
	WebElement redirecturi;
	
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
	public void clickconfig()
	{
		keys.click(config);
	}
	public void clickregister()
	{
		keys.click(registerOauth);
	}
	public void clickadd()
	{
		keys.click(add);
	}
	public void enteroauthname(String oauth) 
	{
		keys.enterData(oauthName, oauth);
		
	}
	public void enteruri(String orredirecturi)
	{
		keys.enterData(redirecturi, orredirecturi);
	}
	public void clicksave()
	{
		keys.click(savebutton);
	}
	
	
}


