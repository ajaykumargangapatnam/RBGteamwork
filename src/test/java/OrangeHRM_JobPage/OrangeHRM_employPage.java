package OrangeHRM_JobPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.surveillance.utilitiy.GenericKeywordsWithPage;

public class OrangeHRM_employPage 
{
	public OrangeHRM_employPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	GenericKeywordsWithPage keyword = new GenericKeywordsWithPage("OrangeHRM_employPage");
	
	@FindBy(xpath="//a[text()='Employment Status']")
	WebElement employment;
	public void Clickon_EmploymentStatus()
	{
		keyword.click(employment);
	}
	
	@FindBy(xpath="//button[text()=' Add ']")
	WebElement addbtn;
	public void Clickon_AddBtn()
	{
		keyword.click(addbtn);
	}

	@FindBy(xpath="//label[text()='Name']/parent::div/following-sibling::div/input")
	WebElement employname;
	public void Enter_EmployName(String edata)
	{
		keyword.enterData(employname, edata);
	}
	
	@FindBy(xpath="//button[text()=' Save ']")
	WebElement savebtn;
	public void Clickon_SaveBtn()
	{
		keyword.click(savebtn);
	}
	
}
