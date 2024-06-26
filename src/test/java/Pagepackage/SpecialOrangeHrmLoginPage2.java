package Pagepackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.surveillance.utilitiy.GenericKeywordsWithPage;

public class SpecialOrangeHrmLoginPage2 
{

	public SpecialOrangeHrmLoginPage2(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath ="//input[@name='username']")
	WebElement username;
	
	@FindBy(xpath = "//input[@name='password']")
	WebElement passWord;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement login;
	
	@FindBy(xpath = "//span[text() = 'Admin']")
	WebElement adMin;
	
	@FindBy(xpath = "//a[text()='Nationalities']")
	WebElement nationAlities;
	
	@FindBy(xpath = "//button[text()=' Add ']")
	WebElement nationalitiesAdd;
	
	@FindBy(xpath = "//label[text()= 'Name']//following::div//input")
	WebElement nationalitiesName;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement saveButton;
	
	
	GenericKeywordsWithPage keys = new GenericKeywordsWithPage("SpecialOrangeHrmLoginPage");
	public void orusername(String enteruserId) 
	{
		keys.enterData(username, enteruserId);

	}
	public void orpassword(String enterpassword) 
	{
		keys.enterData(passWord, enterpassword);

	}
	public void loginbutton() 
	{
		keys.click(login);

	}
	
	public void admin()
	{
		keys.click(adMin);
	}
	public void nationalities()
	{
		keys.click(nationAlities);
	}
	public void nationalitiesadd() throws InterruptedException
	{
		keys.click(nationalitiesAdd);
		Thread.sleep(4000);
	}
	public void enternationalitiesname(String nationalityname) 
	{
		keys.enterData(nationalitiesName, nationalityname);
		
	}
	public void removeandaddnationalitiesname(String nationalityname) throws InterruptedException
	{
		WebElement nationalitiesenterdata = keys.driver.findElement(By.xpath("//label[text() = 'Name']//following::div//input"));
		nationalitiesenterdata.click();
		Actions act = new Actions(keys.driver);
		act.doubleClick(nationalitiesenterdata).perform();
		Thread.sleep(4000);
		keys.enterData(nationalitiesenterdata, nationalityname);
	}
	
	public void savebutton()
	{
		keys.click(saveButton);
	}
}
