package opencartCasesPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.surveillance.utilitiy.GenericKeywordsWithPage;

public class OpenCart_ProfilePage 
{
	WebDriver driver;
	public OpenCart_ProfilePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	GenericKeywordsWithPage keys = new GenericKeywordsWithPage("OpenCart_ProfilePage");
	
	@FindBy(xpath="//span[contains(text(),'demo demo')]")
	WebElement demo;
	public void clickon_Demo()
	{
		keys.click(demo);
	}
	
	@FindBy(xpath="//a[text()=' Your Profile']")
	WebElement profile;
	public void clickon_Profile()
	{
		keys.click(profile);
	}
	
	@FindBy(xpath="//input[@name='username']")
	WebElement username;
	public void enterdata_Username(String uname)
	{
		keys.clearEnter(username, uname);
	}
	
	@FindBy(xpath="//input[@name='email']")
	WebElement email;
	public void enterdata_Email(String ename)
	{
		keys.clearEnter(email, ename);
	}
}
