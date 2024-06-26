package opencartPage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.internal.WebElementToJsonConverter;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.surveillance.utilitiy.GenericKeywordsWithPage;

public class OpenCartPage4 
{
	public OpenCartPage4(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='input-username']")
	WebElement userName;
	
	@FindBy(xpath = "//input[@id='input-password']")
	WebElement password;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement login;
	
	@FindBy(xpath = "//span[contains(text(), 'demo demo')]")
	WebElement demofield;
	
	@FindBy(xpath="//a[text()=' Your Profile']")
	WebElement profile;
	
	@FindBy(xpath="//input[@name='username']")
	WebElement username;
	
	@FindBy(xpath = "//input[@id='input-firstname']")
	WebElement firstName;
	
	@FindBy(xpath = "//input[@id='input-lastname']")
	WebElement lastName;
	
	@FindBy(xpath = "//input[@id='input-email']")
	WebElement email;
	
	@FindBy(xpath="//button[text()=' Edit']")
	WebElement edit;
	
	@FindBy(xpath="//i[@class='fa-solid fa-folder fa-5x']")
	WebElement demo;
	
	@FindBy(xpath="//a//img[@title='apple_logo.jpg']")
	WebElement cartimg;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement pwd;

	@FindBy(xpath="//input[@name='confirm']")
	WebElement cofrmpwd;
	
	@FindBy(xpath="//div[@class='float-end']/button")
	WebElement savebtn;
	
	GenericKeywordsWithPage keys = new GenericKeywordsWithPage("OpenCartPage1");


	public void enterUsername(String enteruserId) throws Throwable
	{

       keys.clearEnter(userName, enteruserId);
	}
	public void enterPassword(String enterpassword) throws InterruptedException
	{
		
		keys.clearEnter(password, enterpassword);
	}
	public void clickbutton()
	{
		keys.click(login);
	}
	public void clickdemo()
	{
		keys.click(demofield);
	}
	public void clickon_Profile()
	{
		keys.click(profile);
	}
	public void enterdata_Username(String uname)
	{
		keys.clearEnter(username, uname);
	}
	public void enterdata_firstname(String fname)
	{
		keys.clearEnter(firstName, fname);
	}
	public void enterdata_lastname(String lname)
	{
		keys.clearEnter(lastName, lname);
	}
	public void enterdata_Email(String ename)
	{
		keys.clearEnter(email, ename);
	}
	public void clickandadd_Image() throws InterruptedException
	{
		//keys.clickForAlert(edit);
		keys.jsClick(edit);
		Thread.sleep(3000);
		keys.jsClick(demo);
		Thread.sleep(3000);
		keys.jsClick(cartimg);
	}
	public void enter_CustPwd(String passdata)
	{
		keys.clearEnter(pwd, passdata);
	}
	public void enter_CofrmCustPwd(String cofrmpass)
	{
		keys.clearEnter(cofrmpwd, cofrmpass);
	}
		
}
