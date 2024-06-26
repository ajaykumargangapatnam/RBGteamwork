package pagepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.surveillance.utilitiy.GenericKeywordsWithPage;

public class OpencartPage1 {
	



	WebDriver driver;
	public OpencartPage1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	GenericKeywordsWithPage keys = new GenericKeywordsWithPage("OpenCart_Catalogs");
@FindBy(xpath="//input[@id='input-username']")
WebElement uname;
	public void click_on_username(String userName)
	{
	keys.click(uname);
	keys.clearEnter(uname, userName);
	}
	@FindBy(xpath="//input[@id='input-password']")
	WebElement pswrd;
	public void click_on_password(String password)
	{
		keys.click(pswrd);
		keys.clearEnter(pswrd, password);
		}
	@FindBy(xpath="//button[@type='submit']")
	WebElement submitBtn;
	public void click_on_submit()
	{
		keys.click(submitBtn);
	}
	@FindBy(xpath="//a[text()=' Catalog']")
	WebElement catalog;
	public void clickon_Catalog()
	{
		keys.click(catalog);
	}
	
	@FindBy(xpath="//a[text()='Categories']")
	WebElement category;
	public void clickon_Categories()
	{
		keys.click(category);
	}
	
	@FindBy(xpath="//div[@class='table-responsive']//td[text()='Cameras']//parent::tr//td//a")
	WebElement camedit;
	public void clickon_CameraEdit()
	{
		keys.click(camedit);
	}
	
	@FindBy(xpath="//a[text()='Data']")
	WebElement data;
	public void clickon_Data()
	{
		keys.click(data);
	}
	
	@FindBy(xpath="//input[@id='input-parent']")
	WebElement parentbox;
	public void clickandenter_ParentBox(String cdata)
	{
		keys.click(parentbox);
		keys.enterData(parentbox, cdata);
	}
	
	
	@FindBy(xpath="//input[@id='input-filter']")
	WebElement filterbox;
	public void enter_FilterBox(String filtname)
	{
		keys.enterData(filterbox, filtname);
	}
	
	@FindBy(xpath="//label[text()='Default']")
	WebElement storiesbox;
	public void click_StoriesBox()
	{
		keys.click(storiesbox);
	}
	
	@FindBy(xpath="//button[text()=' Edit']")
	WebElement edit;
	@FindBy(xpath="//div//a//i[@class='fa-solid fa-folder fa-5x']")
	WebElement demo;
	@FindBy(xpath="//a/img[@title='apple_logo.jpg']")
	WebElement appleimg;
	public void clickandadd_Image() throws InterruptedException
	{
		keys.clickForAlert(edit);
		keys.click(edit);
		Thread.sleep(3000);
		keys.click(demo);
		Thread.sleep(3000);
		keys.click(appleimg);
	}
	
	@FindBy(xpath="//input[@id='input-column']")
	WebElement columnbox;
	public void enterDataIn_Column(String cdata)
	{
		
		keys.enterData(columnbox, cdata);
	}
	
	@FindBy(xpath="//input[@id='input-sort-order']")
	WebElement sortbox;
	public void enterDataIn_SortBox(String sdata)
	{
		
		keys.enterData(sortbox, sdata);
	}
	
	@FindBy(xpath="//div[@class='float-end']//button")
	WebElement savebtn;
	public void clickon_SaveBtn()
	{
		keys.jsClick(savebtn);
	}
@FindBy(xpath="//a[text()=' Customers']")
WebElement Customers;
public void click_on_customers()
{
	keys.jsClick(Customers);
}
@FindBy(xpath="//ul/li/a[text()='Customers']")
WebElement customers2;
public void click_on_cutomers_under()
{
keys.jsClick(customers2);
}
@FindBy(xpath="(//td/div/a/i[@class='fa-solid fa-pencil'])[1]")
WebElement editPencil;
public void click_on_edit_pencil1()
{
	keys.click(editPencil);
}
@FindBy(xpath="//select[@id='input-store']")
WebElement inputStore;
public void click_on_store()
{
keys.click(inputStore);	
Select set=new Select(inputStore);
set.selectByValue("0");
}
@FindBy(xpath="//select[@id='input-customer-group']")
WebElement customerGroup;
public void click_on_customer_group()
{
	keys.click(customerGroup);
	Select sct=new Select(customerGroup);
	sct.selectByVisibleText("Default");
	
}
@FindBy(xpath="//input[@id='input-firstname']")
WebElement inputFirstName;
public void enter_first_name(String firstname)
{
keys.clearEnter(inputFirstName, firstname);	
}
@FindBy(xpath="//input[@id='input-lastname']")
WebElement lastname;
public void enter_last_name(String lastName)
{
	keys.enterData(lastname, lastName);
}
@FindBy(xpath="//input[@id='input-email']")
WebElement emailInput;
public void enter_email_id(String email)
{
keys.enterData(emailInput, email);	
}
@FindBy(xpath="//input[@id='input-telephone']")
WebElement telephone;
public void enter_mobile_number(String telephoneNum)
{
	keys.enterData(telephone, telephoneNum);
}
@FindBy(xpath="//input[@id='input-password']")
WebElement passwords;
public void enter_password(String passwordss)
{
	keys.enterData(passwords, passwordss);
}
@FindBy(xpath="//input[@id='input-confirm']")
WebElement inputConfirm;
public void enter_confirm_password(String confirmPassword)
{
	keys.enterData(inputConfirm, confirmPassword);
}
@FindBy(xpath="(//button[@type='submit'])[1]")
WebElement saveButton;
public void user_click_savebutton()
{
	keys.jsClick(saveButton);
}
@FindBy(xpath="//i[@class='fa-solid fa-caret-down fa-fw']")
WebElement dropdown;
public void user_click_dropdown()
{
	keys.jsClick(dropdown);
}
@FindBy(xpath="//ul//li//a[@class='dropdown-item']//i[@class='fa-solid fa-user-circle fa-fw']")
WebElement username2;
public void user_click_your_profile()
{
	keys.click(username2);
}
@FindBy(xpath="//input[@id='input-username']")
WebElement userName;
public void user_click_userName(String Ussername)
{
	keys.clearEnter(userName, Ussername);
}	
@FindBy(xpath="//input[@id='input-firstname']")
WebElement FirstName;
public void user_click_first_name(String First_Name)
{
keys.clearEnter(FirstName, First_Name);	
}
@FindBy(xpath="//input[@id='input-lastname']")
WebElement lastnames;
public void user_click_last_name(String last_names)
{
	keys.clearEnter(lastnames, last_names);
}
@FindBy(xpath="//input[@id='input-email']")
WebElement input_email;
public void user_clicks_input_email(String _email)
{
	keys.clearEnter(input_email,_email);
}
@FindBy(xpath="//div/div/button/i[@class='fa-solid fa-pencil']")
	WebElement edit_button;
public void user_click_edit_button()
{
	keys.jsClick(edit_button);
}
@FindBy(xpath="//img[@title='opencart-logo.png']")
WebElement img_selected;
public void user_selected_a_image()
{
	keys.click(img_selected);
	}
@FindBy(xpath="//input[@id='input-password']")
WebElement editpass_word;
public void user_able_to_edit_password(String editpasswrd)
{
	keys.enterData(editpass_word, editpasswrd);
}
@FindBy(xpath="//input[@id='input-confirm']")
WebElement confmpaswrd;
public void user_able_to_confirm_password(String confirm_password)
{
	keys.enterData(confmpaswrd,confirm_password);
}
@FindBy(xpath="//button[@type='submit']")
WebElement submit_button;
public void user_clicks_submit_button()
{
	keys.jsClick(submit_button);
}
@FindBy(xpath="//span[text()='Logout']")
WebElement log_out;
public void user_clicks_log_out()
{
keys.jsClick(log_out);	
}
}
