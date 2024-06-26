package Pagepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.surveillance.utilitiy.GenericKeywordsWithPage;

public class SpecialOrangeHrmLoginPage13 
{
	public SpecialOrangeHrmLoginPage13(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@name='username']")
	WebElement loginUserName;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement loginPassword;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement loginSubmitBtn;
	
	@FindBy(xpath = "//span[text() ='Admin']")
	WebElement admin;
	
	@FindBy(xpath = "//span[text() ='Qualifications ']")
	WebElement qualifications;
	
	@FindBy(xpath = "//a[text() = 'Education']")
	WebElement education;
	
	@FindBy(xpath = "//i[@class='oxd-icon bi-plus oxd-button-icon']")
	WebElement addButton;
	
	@FindBy(xpath = "//label[text() = 'Level']/parent::div/following-sibling::div/input")
	WebElement educationlevel;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement savebutton;
	
	
    GenericKeywordsWithPage keys = new GenericKeywordsWithPage("SpecialOrangeHrmLoginPage13");
	
	public void enter_Username(String user)
	{
		keys.enterData(loginUserName, user);
	}
	
	public void enter_Password(String pass)
	{
		keys.enterData(loginPassword, pass);
	}
	
	public void click_Login()
	{
		keys.click(loginSubmitBtn);
	}
	public void clickadmin() throws InterruptedException
	{
		keys.click(admin);
		Thread.sleep(4000);
	}
	public void clickqualifications()
	{
		keys.click(qualifications);
		
	}
	public void clickeducation()
	{
		keys.click(education);
	}
	public void clickaddbutton()
	{
		keys.click(addButton);
	}
	public void entereducationlevel(String level)
	{
		keys.enterData(educationlevel, level);
	}
	public void save()
	{
		keys.click(savebutton);
	}
	
	
}
