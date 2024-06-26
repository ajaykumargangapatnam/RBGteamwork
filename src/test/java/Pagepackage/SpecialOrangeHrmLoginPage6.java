package Pagepackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.surveillance.utilitiy.GenericKeywordsWithPage;

public class SpecialOrangeHrmLoginPage6 
{
	public SpecialOrangeHrmLoginPage6(WebDriver driver)
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

	@FindBy(xpath = "//a[text() = 'Localization']")
	WebElement localization;

	@FindBy(xpath = "(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[1]")
	WebElement language;

	@FindBy(xpath ="//span[text()='English (United States)']")
	WebElement selectlanguage;
	
	@FindBy(xpath = "//div[text() = 'dd-mm-yyyy ( 02-05-2024 )']")
	WebElement date;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement save;

	GenericKeywordsWithPage keys = new GenericKeywordsWithPage("SpecialOrangeHrmLoginPage6");
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

	public void clicklocalization() throws InterruptedException
	{
		keys.click(localization);
		Thread.sleep(4000);
	}
	public void clicklanguage() 
	{
		keys.click(language);
		
	}
	public void clickselectlanguage() 
	{
		keys.click(selectlanguage);
		
	}
	public void enterdate() throws InterruptedException
	{
		keys.click(date);
		Thread.sleep(4000);
	}
	public void savebutton()
	{
		keys.click(save);
	}
}
