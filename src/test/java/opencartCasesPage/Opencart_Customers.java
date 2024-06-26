package opencartCasesPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.surveillance.utilitiy.GenericKeywordsWithPage;

public class Opencart_Customers 
{
	WebDriver driver;
	public Opencart_Customers(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	GenericKeywordsWithPage keys = new GenericKeywordsWithPage("Opencart_Customers");
	
	@FindBy(xpath="//a[text()=' Customers']")
	WebElement customers;
	public void clickon_Customers()
	{
		keys.jsClick(customers);
	}
	
	@FindBy(xpath="//a[text()='Customers']")
	WebElement downcust;
	public void clickon_DownCustomers()
	{
		keys.jsClick(downcust);
	}
	
	@FindBy(xpath="//div[@class='table-responsive']//tbody//td[text()='. .']/parent::tr//td//div/a")
	WebElement editbtn;
	public void clickon_EditBtn()
	{
		keys.jsClick(editbtn);
	}
	
	@FindBy(xpath="//input[@name='firstname']")
	WebElement firstname;
	public void enter_Firstname(String fname)
	{
		keys.clearEnter(firstname, fname);
	}
	
	@FindBy(xpath="//input[@name='lastname']")
	WebElement lastname;
	public void enter_Lastname(String lname)
	{
		keys.clearEnter(lastname, lname);
	}
	
	@FindBy(xpath="//input[@name='password']")
	WebElement pwd;
	public void enter_CustPwd(String passdata)
	{
		keys.clearEnter(pwd, passdata);
	}
	
	@FindBy(xpath="//input[@name='confirm']")
	WebElement cofrmpwd;
	public void enter_CofrmCustPwd(String cofrmpass)
	{
		keys.clearEnter(cofrmpwd, cofrmpass);
	}
	
	@FindBy(xpath="//div[@class='float-end']/button")
	WebElement savebtn;
	public void clickon_CustSave()
	{
		keys.jsClick(savebtn);
	}
}
