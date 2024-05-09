package OrangeHRM_ConfigPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.surveillance.utilitiy.GenericKeywordsWithPage;

public class OrangeHRM_EmailConfigPage 
{
	public OrangeHRM_EmailConfigPage(WebDriver driver) 
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
	
	@FindBy(xpath="//a[contains(text(),'Email Configuration')]")
	WebElement emailconfig;
	
	@FindBy(xpath="//label[contains(text(),'Mail Sent As')]/following::div/input")
	WebElement clearemail;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement savebtn;
	
	@FindBy(xpath="(//button[@type='button'])[3]")
	WebElement resetbtn;
	
	GenericKeywordsWithPage keywords = new GenericKeywordsWithPage("OrangeHRM_LoginCases");
	
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
	
	public void Clickon_EmailConfig()
	{
		keywords.click(emailconfig);
	}
	
	public void ClearandEnter_Email(String ename) throws Throwable
	{
		keywords.click(clearemail);
//		Thread.sleep(3000);
//		Actions a1 = new Actions(keywords.driver);
//		a1.keyDown(Keys.CONTROL);
//		a1.sendKeys("a");
//		a1.keyUp(Keys.CONTROL).perform();
//		Thread.sleep(3000);
//		a1.keyDown(Keys.BACK_SPACE).perform();
//		
//		Thread.sleep(3000);
//		a1.keyUp(Keys.CONTROL).sendKeys(ename);
//		a1.keyUp(Keys.CONTROL).perform();
		
		keywords.backspace(clearemail);
		keywords.enterData(clearemail, ename);
		keywords.click(savebtn);
	}
	
	public void Clickon_Save()
	{
		keywords.click(savebtn);
	}
	
	public void Clickon_Reset()
	{
		keywords.click(resetbtn);
	}

}
