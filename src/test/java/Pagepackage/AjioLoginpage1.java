package Pagepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.surveillance.utilitiy.GenericKeywordsWithPage;

public class AjioLoginpage1 
{
	public AjioLoginpage1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
    @FindBy(xpath = "//span[text() = 'Sign In / Join AJIO']")
    WebElement login;
	
	@FindBy(xpath = "//label[text() = 'Enter Mobile Number *']/input")
	WebElement phonenumber;
	
	@FindBy(xpath = "//input[@type='submit']")
	WebElement clickcontinue;
	
	@FindBy(xpath = "//input[@type='submit']")
	WebElement otpclick;
	
	GenericKeywordsWithPage keys=new GenericKeywordsWithPage("AjioLoginpage1");
	
	public void ajiologin() throws Throwable
	{
		keys.click(login);
		Thread.sleep(4000);
	}
	public void entermobilenum(String num) throws Throwable
	{
		keys.enterData(phonenumber, num);
		Thread.sleep(4000);
	}
	public void clicklogin() 
	{
		keys.click(clickcontinue);
		
	}
	public void clickotp()
	{
		keys.click(otpclick);
	}
	
}
