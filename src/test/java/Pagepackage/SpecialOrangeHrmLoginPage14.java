package Pagepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.surveillance.utilitiy.GenericKeywordsWithPage;

public class SpecialOrangeHrmLoginPage14 
{
	public SpecialOrangeHrmLoginPage14(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@name='username']")
	WebElement loginUserName;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement loginPassword;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement loginSubmitBtn;
	
	@FindBy(xpath = "//span[text() ='Admin']")
	WebElement admin;
	
	@FindBy(xpath = "//span[text() ='Qualifications ']")
	WebElement qualifications;
	
	@FindBy(xpath = "//a[text() = 'Licenses']")
	WebElement license;
	
	@FindBy(xpath = "//i[@class='oxd-icon bi-plus oxd-button-icon']")
	WebElement addbutton;
	
	@FindBy(xpath = "//label[text() = 'Name']/parent::div/following-sibling::div/input")
	WebElement name;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement savebutton;
	
	
	GenericKeywordsWithPage keys = new GenericKeywordsWithPage("SpecialOrangeHrmLoginPage14");
	
	public void enter_Username(String user)
	{
		keys.enterData(loginUserName, user);
	}
	
	public void enter_Password(String pass)
	{
		keys.enterData(loginPassword, pass);
	}
	
	public void click_Login()
	{
		keys.click(loginSubmitBtn);
	}
	public void clickadmin() throws InterruptedException
	{
		keys.click(admin);
		Thread.sleep(4000);
	}
	public void clickqualifications()
	{
		keys.click(qualifications);
		
	}
	public void clicklicense()
	{
		keys.click(license);
	}
	public void clickaddbutton()
	{
		keys.click(addbutton);
	}
	public void entername(String licname)
	{
		keys.enterData(name, licname);
	}
	public void clicksave()
	{
		keys.click(savebutton);
	}
	
	
}
