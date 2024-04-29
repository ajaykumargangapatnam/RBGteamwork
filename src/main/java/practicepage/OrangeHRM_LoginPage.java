package practicepage;

import org.openqa.selenium.By;
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
	
	public void Clear_Email(String email) throws Throwable
	{
		keywords.click(clearemail);
		Thread.sleep(3000);
	    driver.findElement(By.xpath("//label[contains(text(),'Mail Sent As')]/following::div/input"));
		Actions a1 = new Actions(driver);
		a1.keyDown(Keys.CONTROL);
		keywords.clearData(clearemail);
		a1.sendKeys(email);
		a1.perform();
	}

}
