package practicepage;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.surveillance.utilitiy.ApplicationKeywords;
import com.surveillance.utilitiy.GenericKeywordsWithPage;

public class OrangeHRM_LoginPage extends ApplicationKeywords
{
	public OrangeHRM_LoginPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@name='username']")
	WebElement loginUserName;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement loginPassword;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement loginSubmitBtn;
	
	@FindBy(xpath="//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']")
	WebElement loginForgotBtn;
	
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
	
	@FindBy(xpath="//a[contains(text(),'Email Subscriptions')]")
	WebElement emailsubscrip;
	
	@FindBy(xpath="(//button[@type='button'])[3]")
	WebElement subsripbtn;
	
	@FindBy(xpath="(//button[@type='button'])[3]")
	WebElement addbtn;
	
	@FindBy(xpath="//label[contains(text(),'Name')]/following::div[1]/input")
	WebElement namebox;
	
	@FindBy(xpath="//label[contains(text(),'Email')]/following::div[1]/input")
	WebElement emailbox;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement  emailsavebtn;
	
	@FindBy(xpath="(//span[@class='oxd-switch-input oxd-switch-input--active --label-right'])[1]")
	WebElement  subscripadd;
	
	GenericKeywordsWithPage keywords = new GenericKeywordsWithPage("OrangeHRM_Login");

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
	
	public void click_ForgotBtn()
	{
		keywords.click(loginForgotBtn);
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
		Thread.sleep(3000);
		Actions a1 = new Actions(keywords.driver);
		a1.keyDown(Keys.CONTROL);
		a1.sendKeys("a");
		a1.keyUp(Keys.CONTROL).perform();
		Thread.sleep(3000);
		a1.keyDown(Keys.BACK_SPACE).perform();
		
		Thread.sleep(3000);
		a1.keyUp(Keys.CONTROL).sendKeys(ename);
		a1.keyUp(Keys.CONTROL).perform();
		keywords.click(savebtn);
	}
	
	public void Clickon_Reset()
	{
		keywords.click(resetbtn);
	}
	
	public void Clickon_EmailSubscription()
	{
		keywords.click(emailsubscrip);
	}
	
	public void Clickon_Subscripbtn()
	{
		keywords.click(subsripbtn);
	}
	
	public void clickon_Addbtn()
	{
		keywords.click(addbtn);
	}
	
	public void Enter_InputName(String name)
	{
		keywords.enterData(namebox, name);
	}

	public void Enter_EmailName(String ename)
	{
		keywords.enterData(emailbox, ename);
	}
	
	public void Clickon_Emailsave()
	{
		keywords.click(emailsavebtn);
	}
	
	
}
