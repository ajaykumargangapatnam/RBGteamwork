package Pagepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.surveillance.utilitiy.GenericKeywordsWithPage;

public class SpecialOrangeHrmLoginPage 
{
	public SpecialOrangeHrmLoginPage(WebDriver driver)
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
	
}
