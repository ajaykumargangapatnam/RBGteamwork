package OrangeHRM_JobPage;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.surveillance.utilitiy.GenericKeywordsWithPage;

public class OrangeHRM_JobTitlePage 
{
	public OrangeHRM_JobTitlePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	GenericKeywordsWithPage keyword = new GenericKeywordsWithPage("OrangeHRM_JobTitlePage");
	
	@FindBy(xpath="//span[text()='Job ']")
	WebElement jobbtn;
	public void clickon_Job()
	{
		keyword.click(jobbtn);
	}
	
	@FindBy(xpath="//a[text()='Job Titles']")
	WebElement jobtiltle;
	public void clickon_JobTitles()
	{
		keyword.click(jobtiltle);
	}
	
	@FindBy(xpath="//button[text()=' Add ']")
	WebElement addbtn;
	public void clickon_Add()
	{
		keyword.click(addbtn);
	}
	
	@FindBy(xpath="//label[text()='Job Title']/parent::div/following-sibling::div/input")
	WebElement jobname;
	public void Enter_JobTilte(String jdata)
	{
		keyword.enterData(jobname, jdata);
	}
	
	@FindBy(xpath="//label[text()='Job Description']/parent::div/following-sibling::div/textarea")
	WebElement decripname;
	public void Enter_description(String dsdata)
	{
		keyword.enterData(decripname, dsdata);
	}
	
	@FindBy(xpath="//div[text()='Browse']")
	WebElement browse;
	public void clickon_Browse() throws IOException  
	{
		keyword.click(browse);
		//browse.sendKeys("C:\\Users\\91994\\Pictures\\Screenshots\\Untitled.png");
		Runtime.getRuntime().exec("C:\\Users\\91994\\Pictures\\Screenshots\\Untitled.png");
	}
	
	@FindBy(xpath="//label[text()='Note']/parent::div/following-sibling::div/textarea")
	WebElement note;
	public void Enter_Note(String ndata)
	{
		keyword.enterData(note, ndata);
	}
	
	@FindBy(xpath="//button[text()=' Save ']")
	WebElement savebtn;
	public void Clcikon_Save()
	{
		keyword.click(savebtn);
	}
	
}
