package Pagepackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.surveillance.utilitiy.GenericKeywordsWithPage;

public class opencartpage3 
{
	
	public opencartpage3(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}

	
	
	@FindBy(name="username")
	WebElement userName;
	
	@FindBy(name="password")
	WebElement password;
	  
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement login;
	 
	@FindBy(xpath = "//a[text()='Customers']")
	WebElement customers;
	
	@FindBy(xpath = "(//a[text()='Customers'])[1]")
	WebElement downlist;
	
	@FindBy(xpath="//div[@class='table-responsive']//tbody//td[text()='. .']/parent::tr//td//div/a")
	WebElement editbutton;
	
	@FindBy(xpath = "//select[@id='input-store']")
	WebElement store;
	
	@FindBy(xpath = "//select[@id='input-customer-group']")
	WebElement customerGroup;
	
	@FindBy(xpath="//input[@name='firstname']")
	WebElement firstname;
	
	@FindBy(xpath="//input[@name='lastname']")
	WebElement lastname;
	
	@FindBy(xpath = "//input[@id='input-email']")
	WebElement email;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement passwrd;

	@FindBy(xpath="//input[@name='confirm']")
	WebElement conformpassword;
	
	@FindBy(xpath="//div[@class='float-end']/button")
	WebElement save;
	
	
	
	GenericKeywordsWithPage key = new GenericKeywordsWithPage("opencart1");

	
	
	
	

	
	public void enterPassword(String enterpassword) 
	{
		
		key.clearEnter(userName, enterpassword);
	}
	
	
	public void enterUsername(String enteruserId) 
	{
		
		key.clearEnter(password, enteruserId);
	}

	
	public void loginButton()
	{
		key.click(login);
	}
	
	public void customersButton()
	{
		key.jsClick(customers);
	}

	public void customerlist()
	{
		key.click(downlist);
	}
	
	public void EditButton()
	{
		key.jsClick(editbutton);
	}
	
	public void StoreBox()
	{
		key.jsClick(store);
	}
	
	public void customerGroup()
	{
		key.jsClick(customerGroup);
	}
	
	public void Firstname(String fname)
	{
		key.clearEnter(firstname, fname);
	}
	
	public void Lastname(String lname)
	{
		key.clearEnter(lastname, lname);
	}
	
	public void emailName(String emailid)
	{
		key.clearEnter(email, emailid);
	}
	
	public void customerpassword(String passdata)
	{
		key.clearEnter(passwrd, passdata);
	}
	
	public void ConformCustmerPwd(String conformpass)
	{
		key.clearEnter(conformpassword, conformpass);
	}
	
	public void CustomerSave()
	{
		key.jsClick(save);
	}
}
