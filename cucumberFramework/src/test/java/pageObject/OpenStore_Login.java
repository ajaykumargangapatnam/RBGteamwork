package pageObject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OpenStore_Login 
{
	public WebDriver Idriver;
	
	public OpenStore_Login(WebDriver rdriver)
	{
		Idriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	@FindBy(xpath = "//span[text()='My Account']")
	WebElement myaccnt;
	public void clickon_MyAccount()
	{
		myaccnt.click();
	}
	
	@FindBy(xpath ="//a[text()='Login']")
	WebElement login;
	public void clickon_Login()
	{
		login.click();
	}
	
	@FindBy(xpath = "//input[@id='input-email']")
	WebElement username;
	public void enter_UserName(String uname)
	{
		WebDriverWait wait = new WebDriverWait(Idriver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='input-email']")));
		username.sendKeys(uname);
	}
	
	@FindBy(xpath = "//input[@id='input-password']")
	WebElement password;
	public void enter_password(String pname)
	{
		WebDriverWait wait = new WebDriverWait(Idriver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='input-password']")));
		password.sendKeys(pname);
	}
	
	@FindBy(xpath = "//button[text()='Login']")
	WebElement loginbtn;
	public void clickon_LoginBtn() 
	{
		loginbtn.click();
	}
}
