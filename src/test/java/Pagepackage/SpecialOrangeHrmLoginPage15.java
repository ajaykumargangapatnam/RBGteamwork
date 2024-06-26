package Pagepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.surveillance.utilitiy.GenericKeywordsWithPage;

public class SpecialOrangeHrmLoginPage15 
{
	public SpecialOrangeHrmLoginPage15(WebDriver driver)
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
	
	@FindBy(xpath = "//div[text() = 'Certified Digital Marketing Professional (CDMP)']/parent::div/following-sibling::div/child::div/button/following-sibling::button/i")
	WebElement editbutton;
	
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
	public void clickeditbutton()
	{
		keys.click(editbutton);
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
