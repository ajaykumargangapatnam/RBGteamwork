package OrangeHRM_JobPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.surveillance.utilitiy.GenericKeywordsWithPage;

public class OrangeHRM_PayGradesPage
{
	public OrangeHRM_PayGradesPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	GenericKeywordsWithPage keys = new GenericKeywordsWithPage("OrangeHRM_PayGradesPage");
	
	@FindBy(xpath="//a[text()='Pay Grades']")
	WebElement paygrade;
	public void Clickon_PayGrade()
	{
		keys.click(paygrade);
	}
	
	@FindBy(xpath="//button[text()=' Add ']")
	WebElement addbtn;
	public void Clickon_AddBtn()
	{
		keys.click(addbtn);
	}
	
	@FindBy(xpath="//label[text()='Name']/parent::div/following-sibling::div/input")
	WebElement nameinputbox;
	public void Enterdata_NameBox(String ndata)
	{
		keys.enterData(nameinputbox,ndata);
	}
	
	@FindBy(xpath="//button[text()=' Save ']")
	WebElement savebtn;
	public void Clickon_Save()
	{
		keys.click(savebtn);
	}
	
}
