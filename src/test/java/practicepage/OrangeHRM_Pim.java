package practicepage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.surveillance.utilitiy.GenericKeywordsWithPage;

public class OrangeHRM_Pim 
{
	public OrangeHRM_Pim(WebDriver driver) 
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
	
	@FindBy(xpath="//a[@href='/web/index.php/pim/viewPimModule']")
	WebElement pimPage;
	
	
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

	public void pimelement()
	{
		pimPage.click();
	}
}
