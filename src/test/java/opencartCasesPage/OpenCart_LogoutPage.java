package opencartCasesPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.surveillance.utilitiy.GenericKeywordsWithPage;

public class OpenCart_LogoutPage 
{
	public OpenCart_LogoutPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	GenericKeywordsWithPage keys = new GenericKeywordsWithPage("OpenCart_LoginPage");
	
	@FindBy(xpath="//span[text()='Logout']")
	WebElement logout;
	public void clickon_LogOut()
	{
		keys.jsClick(logout);
	}
}
