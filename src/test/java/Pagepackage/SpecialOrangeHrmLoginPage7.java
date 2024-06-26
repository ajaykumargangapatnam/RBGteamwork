package Pagepackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.surveillance.utilitiy.GenericKeywordsWithPage;

public class SpecialOrangeHrmLoginPage7 
{
	public SpecialOrangeHrmLoginPage7(WebDriver driver)
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
	
	@FindBy(xpath = "//a[text() = 'Modules']")
	WebElement modules;

	@FindBy(xpath = "//p[text() = 'Leave Module']/parent::div/div/label/span")
	WebElement leavemodule;
	
	@FindBy(xpath = "//p[text() = 'Time Module']/parent::div/div/label/span")
	WebElement timemodule;
    
	@FindBy(xpath ="//p[text() = 'Recruitment Module']/parent::div/div/label/span")
	WebElement recuritmentmodule;
	
	@FindBy(xpath = "//p[text() = 'Performance Module']/parent::div/div/label/span")
    WebElement performancemodule;
	
	@FindBy(xpath = "//p[text() = 'Directory Module']/parent::div/div/label/span")
	WebElement directorymodule;
	
	@FindBy(xpath = "//p[text() = 'Maintenance Module']/parent::div/div/label/span")
	WebElement maintanencemodule;
	
	@FindBy(xpath = "//p[text() = 'Mobile']/parent::div/div/label/span")
	WebElement mobile;
	
	@FindBy(xpath = "//p[text() = 'Claim Module']/parent::div/div/label/span")
	WebElement claimmodule;
	
	@FindBy(xpath ="//button[@type='submit']")
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
	public void moduleclick()
	{
		keys.click(modules);
	
	}
	public void clickleavemodule() throws InterruptedException
	{
		keys.click(leavemodule);
		Thread.sleep(7000);
	}
	public void clicktimemodule()
	{
		keys.click(timemodule);
	}
	public void clickreccuritmentmodule()
	{
		keys.click(recuritmentmodule);
	}
	public void clickperformancemodule()
	{
		keys.click(performancemodule);
	}
	public void clickdirectorymodule()
	{
		keys.click(directorymodule);
	}
	public void clickmaintanencemodule()
	{
		keys.click(maintanencemodule);
	}
	public void clickmobile()
	{
		keys.click(mobile);
	}
	public void clickclaimmodule() throws InterruptedException
	{
		keys.click(claimmodule);
		Thread.sleep(4000);
	}
	public void clicksavebutton()
	{
		keys.click(savebutton);
	}
}
