package Pagepackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.surveillance.utilitiy.GenericKeywordsWithPage;

public class SpecialOrangeHrmLoginPage5 
{
	public SpecialOrangeHrmLoginPage5(WebDriver driver)
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
	
	
	
	@FindBy(xpath = "//a[text() = 'Email Subscriptions']")
	WebElement subscription;
	
	@FindBy(xpath = "//div[text()='Leave Applications']/parent::div/following-sibling::div/following-sibling::div/div//child::div/label/input")
	WebElement leaveApplications;
	
	@FindBy(xpath = "//div[text()='Leave Approvals']/parent::div/following-sibling::div/following-sibling::div/div//child::div/label/input")
	WebElement leaveApprovals;
	
	@FindBy(xpath = "//div[text()='Leave Assignments']/parent::div/following-sibling::div/following-sibling::div/div//child::div/label/input")
	WebElement leaveassignments;
	
	@FindBy(xpath = "//div[text()='Leave Cancellations']/parent::div/following-sibling::div/following-sibling::div/div//child::div/label/input")
	WebElement leavecancellations;
	
	@FindBy(xpath ="//div[text()='Leave Rejections']/parent::div/following-sibling::div/following-sibling::div/div//child::div/label/input")
	WebElement leaverejections;
	
	GenericKeywordsWithPage keys = new GenericKeywordsWithPage("SpecialOrangeHrmLoginPage5");
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
	public void emailsubscriptions() 
	{
		keys.click(subscription);
		
	}
	public void clickleavepplications() 
	{
		keys.click(leaveApplications);
		
	}
	
	public void clickleaveapprovals() 
	{
		keys.click(leaveApprovals);
		
	}
	public void clickleaveassignments() 
	{
		keys.click(leaveassignments);
		
	}
	public void clickleavecancellation() 
	{
		keys.click(leavecancellations);
		
	}
	public void clickleaverejections() throws InterruptedException
	{
		keys.click(leaverejections);
		Thread.sleep(4000);
	}
}
