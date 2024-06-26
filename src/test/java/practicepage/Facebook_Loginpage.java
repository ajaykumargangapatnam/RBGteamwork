package practicepage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.surveillance.utilitiy.GenericKeywordsWithPage;

public class Facebook_Loginpage 
{
	public Facebook_Loginpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='email']")
	WebElement usernameInputBox;
	
	@FindBy(xpath="//input[@id='pass']")
	WebElement passwordInputBox;
	
	@FindBy(xpath="//button[@name='login']")
	WebElement submitButton;

	GenericKeywordsWithPage keywords = new GenericKeywordsWithPage("Facebook_Loginpage");
	public void enterUsername(String user)
	{
		keywords.enterData(usernameInputBox, user);
	}
	
	public void enterPassword(String pass)
	{
		keywords.enterData(passwordInputBox, pass);
	}
	public void clickLogin()
    {
		keywords.click(submitButton);
    }
	
}
