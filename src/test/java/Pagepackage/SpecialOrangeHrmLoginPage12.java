package Pagepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.surveillance.utilitiy.GenericKeywordsWithPage;

public class SpecialOrangeHrmLoginPage12 
{
	public SpecialOrangeHrmLoginPage12(WebDriver driver)
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
	
	@FindBy(xpath = "//a[text() = 'Skills']")
	WebElement	skill;
	
	@FindBy(xpath = "//div[text() = 'Content Creation']/parent::div/following-sibling::div/following-sibling::div/div/child::button/following-sibling::button")
	WebElement editButton;
	
	@FindBy(xpath = "//label[text() = 'Name']/parent::div/following-sibling::div/input")
	WebElement name;
	
	@FindBy(xpath = "//label[text() = 'Description']/parent::div/following-sibling::div/textarea")
	WebElement description;
	
	@FindBy(xpath = "//button[text() = ' Save ']")
	WebElement savebutton;
	
    GenericKeywordsWithPage keys = new GenericKeywordsWithPage("SpecialOrangeHrmLoginPage11");
	
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
	public void clickskill()
	{
		keys.click(skill);
	}
    public void clickeditbutton()
    {
    	keys.click(editButton);
    }
    public void skillname(String qualskillname)
    {
    	keys.enterData(name, qualskillname);
    }
	public void enterdescription(String skilldescription)
	{
		keys.enterData(description, skilldescription);
	}
   public void clicksave()
   {
	   keys.click(savebutton);
   }
}
