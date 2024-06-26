package opencartPage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.internal.WebElementToJsonConverter;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.surveillance.utilitiy.GenericKeywordsWithPage;

public class OpenCartPage5 
{
	public OpenCartPage5(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='input-username']")
	WebElement userName;
	
	@FindBy(xpath = "//input[@id='input-password']")
	WebElement password;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement login;
	
	@FindBy(xpath = "//span[text() = 'Logout']")
	WebElement logout;
	
	GenericKeywordsWithPage keys = new GenericKeywordsWithPage("OpenCartPage1");


	public void enterUsername(String enteruserId) throws Throwable
	{

       keys.clearEnter(userName, enteruserId);
	}
	public void enterPassword(String enterpassword) throws InterruptedException
	{
		
		keys.clearEnter(password, enterpassword);
	}
	public void clickbutton()
	{
		keys.click(login);
	}
	public void clicklogout()
	{
		keys.click(logout);
	}
		
}
