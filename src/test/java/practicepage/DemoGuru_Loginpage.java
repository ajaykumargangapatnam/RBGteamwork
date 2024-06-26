package practicepage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.surveillance.utilitiy.GenericKeywordsWithPage;

public class DemoGuru_Loginpage 
{
	public DemoGuru_Loginpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//input[@name='uid']")
	WebElement usernameInpotBox;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement passwordInpotBox;
	
	@FindBy(xpath="//input[@name='btnLogin']")
	WebElement loginBtn;
	
	@FindBy(xpath="//a[@href='addcustomerpage.php']")
	WebElement newCustomer;
	
	@FindBy(xpath="//*[@id='dismiss-button']")
	WebElement alertBtn;
	
	@FindBy(xpath="//input[@name='name']")
	WebElement customerInputBox;
	
	@FindBy(xpath="//input[@value='m']")
	WebElement radioBtn;
	
	@FindBy(xpath="//input[@id='dob']")
	WebElement dateInputBox;
	
	@FindBy(xpath="//textarea[@name='addr']")
	WebElement addressTextBOx;
	
	@FindBy(xpath="//input[@name='city']")
	WebElement cityInputBox;
	
	@FindBy(xpath="//input[@name='state']")
	WebElement stateInputBox;
	
	@FindBy(xpath="//input[@name='pinno']")
	WebElement pinInputBox;
	
	@FindBy(xpath="//input[@name='telephoneno']")
	WebElement telephoneInputBox;
	
	@FindBy(xpath="//input[@name='emailid']")
	WebElement emailInputBox;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement passwordInputBox;
	
	@FindBy(xpath="//input[@value='Submit']")
	WebElement submitBox;
	
	GenericKeywordsWithPage keywords  = new GenericKeywordsWithPage("DemoGuru_Loginpage");
	
	public void enterUsername(String user)
	{
		keywords.enterData(usernameInpotBox, user);
	}
	
	public void enterPAssword(String pass)
	{
		keywords.enterData(passwordInpotBox, pass);
	}
	
	public void clickonLogin()
	{
		keywords.click(loginBtn);
	}

	public void click_NewCustomerName()
	{
		keywords.click(newCustomer);
	}
	
	public void click_Alert()
	{
		keywords.click(alertBtn);
	}
	
	public void enterCustomerName(String name)
	{
		keywords.enterData(customerInputBox, name);
	}
	
	public void clickonRdBtn()
	{
		keywords.click(radioBtn);
	}
	
	public void enterDate(String date)
	{
		keywords.enterData(dateInputBox, date);
	}
	
	public void enterAddress(String adds)
	{
		keywords.enterData(addressTextBOx, adds);
	}
	
	public void enterCityName(String citydata)
	{
		keywords.enterData(cityInputBox, citydata);
	}
	
	public void enterStateName(String statedata)
	{
		keywords.enterData(stateInputBox, statedata);
	}
	
	public void enterPinNum(String pindata)
	{
		keywords.enterData(pinInputBox, pindata);
	}
	
	public void enterMobileNum(String mobiledata)
	{
		keywords.enterData(telephoneInputBox, mobiledata);
	}
	
	public void enterEmailId(String emaildata)
	{
		keywords.enterData(emailInputBox, emaildata);
	}
	
	public void enterEmailPassword(String passdata)
	{
		keywords.enterData(passwordInpotBox, passdata);
	}
	
	public void submitBtn_Click()
	{
		keywords.click(submitBox);
	}
}
