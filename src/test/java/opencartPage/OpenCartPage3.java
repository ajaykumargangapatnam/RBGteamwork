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

public class OpenCartPage3 
{
	public OpenCartPage3(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='input-username']")
	WebElement userName;
	
	@FindBy(xpath = "//input[@id='input-password']")
	WebElement password;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement login;
	
	@FindBy(xpath="//a[text()=' Customers']")
	WebElement customers;
	
	@FindBy(xpath="//a[text()='Customers']")
	WebElement downcust;
	
	@FindBy(xpath="//div[@class='table-responsive']//tbody//td[text()='. .']/parent::tr//td//div/a")
	WebElement editbtn;
	
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
	WebElement pwd;

	@FindBy(xpath="//input[@name='confirm']")
	WebElement cofrmpwd;
	
	@FindBy(xpath="//div[@class='float-end']/button")
	WebElement savebtn;
	
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
	public void clickon_Customers()
	{
		keys.jsClick(customers);
	}
	public void clickon_DownCustomers()
	{
		keys.jsClick(downcust);
	}
	public void clickon_EditBtn()
	{
		keys.jsClick(editbtn);
	}
	public void clickStore()
	{
		keys.jsClick(store);
	}
	public void clickcustomerGroup()
	{
		keys.jsClick(customerGroup);
	}
	public void enter_Firstname(String fname)
	{
		keys.clearEnter(firstname, fname);
	}
	public void enter_Lastname(String lname)
	{
		keys.clearEnter(lastname, lname);
	}
	public void enter_emailName(String emailId)
	{
		keys.clearEnter(email, emailId);
	}
	public void enter_CustPwd(String passdata)
	{
		keys.clearEnter(pwd, passdata);
	}
	public void enter_CofrmCustPwd(String cofrmpass)
	{
		keys.clearEnter(cofrmpwd, cofrmpass);
	}
	public void clickon_CustSave()
	{
		keys.jsClick(savebtn);
	}
}
