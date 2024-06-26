package Pagepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.surveillance.utilitiy.GenericKeywordsWithPage;


public class FbloginPage 
{
	public FbloginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);

	}
	@FindBy(xpath="//input[@id='email']")
	WebElement userId;

	@FindBy(xpath="//input[@id='pass']")
	WebElement password;
	

	@FindBy(xpath="//button[@name='login']")
	WebElement button;
	

	GenericKeywordsWithPage keys=new GenericKeywordsWithPage("FbloginPage");
	
	public void fbuserName(String enterUserId) 
	{
		keys.enterData(userId, enterUserId);
	}
	public void fbPassword(String enterPassword)
	{
		keys.enterData(password, enterPassword);

	}
	public void submitButton()
	{
		keys.click(button);
	}


}