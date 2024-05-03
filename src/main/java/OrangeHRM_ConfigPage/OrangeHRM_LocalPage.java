package OrangeHRM_ConfigPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.surveillance.utilitiy.GenericKeywordsWithPage;

public class OrangeHRM_LocalPage 
{
	public OrangeHRM_LocalPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@name='username']")
	WebElement loginUserName;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement loginPassword;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement loginSubmitBtn;
	
	@FindBy(xpath="//a[@href='/web/index.php/admin/viewAdminModule']")
	WebElement adminlink;
	
	@FindBy(xpath="//span[contains(text(),'Configuration')]")
	WebElement configuration;
	
	@FindBy(xpath="//a[text()='Localization']")
	WebElement  localization;
	
	@FindBy(xpath="//div[text()='English (United States)']/following::div[1]/i")
	WebElement langbox;
	
	@FindBy(xpath="//span[text()='Dutch - Nederlands']")
	WebElement language;
	
	@FindBy(xpath="//label[text()='Date Format']/parent::div/following-sibling::div/child::div/child::div/child::div[@class='oxd-select-text-input']")
	WebElement  datebox; 
	
	@FindBy(xpath="//span[text()='dd-mm-yyyy ( 03-05-2024 )']")
	WebElement  dateyear;
	
	@FindBy(xpath="//button[text()=' Save ']")
	WebElement  localsave;
	
	GenericKeywordsWithPage keywords = new GenericKeywordsWithPage("OrangeHRM_LoginPage");

	public void enter_Username(String user)
	{
		keywords.enterData(loginUserName, user);
	}
	
	public void enter_Password(String pass)
	{
		keywords.enterData(loginPassword, pass);
	}
	
	public void click_Login()
	{
		keywords.click(loginSubmitBtn);
	}
	
	public void Clickon_Admin()
	{
		keywords.click(adminlink);
	}
	
	public void Clickon_Configuration()
	{
		keywords.click(configuration);
	}
	
	public void Clickon_Localization()
	{
		keywords.click(localization);
	}
	
	public void Enter_CountryLanguage() throws Throwable
	{
		keywords.click(langbox);
		Thread.sleep(10000);
		keywords.click(language);
	}
	
	public void Enter_DOY() throws Throwable
	{
		keywords.click(datebox);
		Thread.sleep(10000);
		keywords.click(dateyear);
	}
	
	public void Clickon_LocalSave()
	{
		keywords.click(localsave);
	}

}
