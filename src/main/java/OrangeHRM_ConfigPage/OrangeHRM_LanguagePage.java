package OrangeHRM_ConfigPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.surveillance.utilitiy.GenericKeywordsWithPage;

public class OrangeHRM_LanguagePage 
{
	public OrangeHRM_LanguagePage(WebDriver driver) 
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
	
	@FindBy(xpath="//a[text()='Language Packages']")
	WebElement langpackages;
	
	@FindBy(xpath="//button[text()=' Add ']")
	WebElement lpaddbtn;
	
	@FindBy(xpath="//label[text()='Name']/following::div/div/div/div[@class='oxd-select-text-input']")
	WebElement addlanguage;
	
	@FindBy(xpath="//span[text()='Afrikaans (Namibia) - Afrikaans (Namibië)']")
	WebElement arabicdata;
	
	@FindBy(xpath="//button[text()=' Save ']")
	WebElement langsave;
	
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
	
	public void Clickon_LanguagePackages()
	{
		keywords.click(langpackages);
	}
	
	public void Clickon_LPAddBtn()
	{
		keywords.click(lpaddbtn);
	}
	
	public void Enter_language() throws Throwable
	{
		keywords.click(addlanguage);
		Thread.sleep(3000);
		keywords.click(arabicdata);
	}
	
	public void Clickon_LangSaveBox()
	{
		keywords.click(langsave);
	}

}
