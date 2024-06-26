package Pagepackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.surveillance.utilitiy.GenericKeywordsWithPage;

public class OpenStore1 
{
	
	public OpenStore1(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}

	
	
	@FindBy(xpath="//span[text()='My Account']")
	WebElement account;
	
	@FindBy(xpath="//ul//a[text()='Login']")
	WebElement loginoption;
	  
	
	@FindBy(xpath="//input[@id='input-email']")
	WebElement email;
	
	@FindBy(xpath="//input[@id='input-password']")
	WebElement password;
	
	@FindBy(xpath="//button[text()='Login']")
	WebElement login;

	
	
	 
	GenericKeywordsWithPage key = new GenericKeywordsWithPage("opencart1");

	
	
	
	

	
	public void accountButton() 
	{
		
		key.click(account);
	}
	
	
	public void loginButton1() throws Throwable 
	{
		Thread.sleep(3000);
		key.jsClick(loginoption);
	}

	
	public void emailBox(String eml)
	{
		key.clearEnter(email, eml);
	}
	
	public void passwordBox(String pwd)
	{
		key.clearEnter(password, pwd);
	}

	public void loginButton()
	{
		key.jsClick(login);
	}

}
