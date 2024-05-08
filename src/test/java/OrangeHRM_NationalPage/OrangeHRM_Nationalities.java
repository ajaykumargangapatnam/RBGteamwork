package OrangeHRM_NationalPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.surveillance.utilitiy.GenericKeywordsWithPage;

public class OrangeHRM_Nationalities 
{
	public OrangeHRM_Nationalities(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	GenericKeywordsWithPage keys = new GenericKeywordsWithPage("OrangeHRM_Nationalities");
	
	@FindBy(xpath="//input[@name='username']")
	WebElement username;
	public void Enter_Username(String udata)
	{
		keys.enterData(username, udata);
	}
	
	@FindBy(xpath="//input[@name='password']")
	WebElement password;
	public void Enter_Password(String pdata)
	{
		keys.enterData(password, pdata);
	}
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement loginbtn;
	public void Clickon_Login()
	{
		keys.click(loginbtn);
	}
	
	@FindBy(xpath="//p[text()='Forgot your password? ']")
	WebElement forgotbtn;
	public void Clickon_ForgotPassword()
	{
		keys.click(forgotbtn);
	}
	
	@FindBy(xpath="//span[text()='Admin']")
	WebElement adminbtn;
	public void Clickon_AdminBtn()
	{
		keys.click(adminbtn);
	}
	
	@FindBy(xpath="//a[text()='Nationalities']")
	WebElement nationalities;
	public void Clickon_NAtionalities()
	{
		keys.click(nationalities);
	}
	
	@FindBy(xpath="//button[text()=' Add ']")
	WebElement addbtn;
	public void Clickon_AddBtn()
	{
		keys.click(addbtn);
	}
	
	@FindBy(xpath="//label[text()='Name']/parent::div/following-sibling::div/input")
	WebElement namebox;
	public void Enter_Name(String ndata)
	{
		keys.enterData(namebox, ndata);
	}
	
	@FindBy(xpath="//button[text()=' Save ']")
	WebElement savebtn;
	public void Clickon_SaveBtn()
	{
		keys.click(savebtn);
	}
}
