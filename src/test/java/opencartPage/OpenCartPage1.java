package opencartPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.surveillance.utilitiy.GenericKeywordsWithPage;

public class OpenCartPage1 
{
	public OpenCartPage1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}


	@FindBy(xpath = "//button[@type='submit']")
	WebElement login;

	GenericKeywordsWithPage keys = new GenericKeywordsWithPage("OpenCartPage1");


	public void enterUsername(String enteruserId) throws Throwable
	{
		WebElement userNameEnterdata = keys.driver.findElement(By.xpath("//input[@id='input-username']"));
		userNameEnterdata.click();

		Actions act = new Actions(keys.driver);
		act.doubleClick(userNameEnterdata).perform();
		Thread.sleep(4000);
		keys.enterData(userNameEnterdata, enteruserId);
	}
	public void enterPassword(String enterpassword) throws InterruptedException
	{
		WebElement passwordEnterdata = keys.driver.findElement(By.xpath("//input[@id='input-password']"));
		passwordEnterdata.click();
		Actions act = new Actions(keys.driver);
		act.doubleClick(passwordEnterdata).perform();
		Thread.sleep(4000);
		keys.enterData(passwordEnterdata, enterpassword);
	}
	public void clickbutton()
	{
		keys.click(login);
	}
}
