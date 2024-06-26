package opencartCasesPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.surveillance.utilitiy.GenericKeywordsWithPage;

public class OpenCart_LoginPage 
{
	public OpenCart_LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	GenericKeywordsWithPage keys = new GenericKeywordsWithPage("OpenCart_LoginPage");
	
	@FindBy(xpath="//input[@name='username']")
	WebElement username;
	public void enter_Username(String uname) throws Throwable
	{
		keys.clearData(username);
		keys.enterData(username, uname);
	}
	
	@FindBy(xpath="//input[@name='password']")
	WebElement paswd;
	public void enter_Password(String pname)
	{
		keys.clearData(paswd);
		keys.enterData(paswd, pname);
	}
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement submitbtn;
	public void clickon_Login()
	{
		keys.click(submitbtn);
	}

}
