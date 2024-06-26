package opencartCasesPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

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
	
	@FindBy(xpath="//select[@name='store_id']")
	WebElement store;
	public void clickon_Store()
	{
		Select s1 = new Select(store);
		keys.jsClick(store);
		s1.selectByVisibleText("Default");
	}
	
	@FindBy(xpath="//select[@name='customer_group_id']")
	WebElement custstore;
	public void clickon_CustomerStore()
	{
		Select s1 = new Select(custstore);
		keys.jsClick(custstore);
		s1.selectByVisibleText("Default");
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
	
	@FindBy(xpath="//input[@name='email']")
	WebElement email;
	public void enter_CustomerEmail(String ename)
	{
		keys.clearEnter(email, ename);
	}
	
	@FindBy(xpath="//input[@name='telephone']")
	WebElement telephone;
	public void enter_Telephone(String tname)
	{
		keys.clearEnter(telephone, tname);
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
