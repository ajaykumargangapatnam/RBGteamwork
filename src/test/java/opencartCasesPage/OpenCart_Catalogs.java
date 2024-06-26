package opencartCasesPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.surveillance.utilitiy.GenericKeywordsWithPage;

public class OpenCart_Catalogs
{
	WebDriver driver;
	public OpenCart_Catalogs(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	GenericKeywordsWithPage keys = new GenericKeywordsWithPage("OpenCart_Catalogs");

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
	@FindBy(xpath="//i[@class='fa-solid fa-folder fa-5x']")
	WebElement demo;
	@FindBy(xpath="//a//img[@title='apple_logo.jpg']")
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
		keys.clearData(columnbox);
		keys.enterData(columnbox, cdata);
	}
	
	@FindBy(xpath="//input[@id='input-sort-order']")
	WebElement sortbox;
	public void enterDataIn_SortBox(String sdata)
	{
		keys.clearData(sortbox);
		keys.enterData(sortbox, sdata);
	}
	
	@FindBy(xpath="//div[@class='float-end']//button")
	WebElement savebtn;
	public void clickon_SaveBtn()
	{
		keys.jsClick(savebtn);
	}
}
