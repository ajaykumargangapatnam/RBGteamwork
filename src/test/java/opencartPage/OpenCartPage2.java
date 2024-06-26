package opencartPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.internal.WebElementToJsonConverter;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.surveillance.utilitiy.GenericKeywordsWithPage;

public class OpenCartPage2 
{
	public OpenCartPage2(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}


	@FindBy(xpath = "//button[@type='submit']")
	WebElement login;

	@FindBy(xpath="//a[text()=' Catalog']")
	WebElement catalog;
	
	@FindBy(xpath="//a[text()='Categories']")
	WebElement category;
	
	@FindBy(xpath="//div[@class='table-responsive']//td[text()='Cameras']//parent::tr//td//a")
	WebElement cameraedit;
	
	@FindBy(xpath="//a[text()='Data']")
	WebElement data;
	
	@FindBy(xpath="//input[@id='input-parent']")
	WebElement parent;
	
	@FindBy(xpath="//input[@id='input-filter']")
	WebElement filterbox;
	
	@FindBy(xpath="//label[text()='Default']")
	WebElement storiesbox;
	
	@FindBy(xpath="//button[text()=' Edit']")
	WebElement edit;
	
	@FindBy(xpath="//i[@class='fa-solid fa-folder fa-5x']")
	WebElement demo;
	
	@FindBy(xpath="//a//img[@title='apple_logo.jpg']")
	WebElement cartimg;
	
	@FindBy(xpath="//input[@id='input-column']")
	WebElement columnbox;
	
	@FindBy(xpath="//input[@id='input-sort-order']")
	WebElement sortorder;
	
	@FindBy(xpath="//div[@class='float-end']//button")
	WebElement savebutton;
	
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
	public void clickon_Catalog()
	{
		keys.click(catalog);
	}
	public void clickon_Categories()
	{
		keys.click(category);
	}
	public void clickon_CamEdit()
	{
		keys.click(cameraedit);
	}
	public void clickon_Data()
	{
		keys.click(data);
	}
	
	/*public void enterparent()
	{
		parent.click();
		List<WebElement> alloptions = keys.driver.findElements(By.xpath("//datalist[@id='list-parent']"));
		
		for(WebElement option : alloptions)
		{
			String text = option.getText();
			System.out.println(text);
			if(text.equals("Cameras"))
			{
				option.click();
				break;
			}
		}
		
	}*/
	public void clickandenter_ParentBox(String cdata)
	{
		keys.click(parent);
		keys.enterData(parent, cdata);
	}
	public void enter_FilterBox(String filtname)
	{
		keys.enterData(filterbox, filtname);
	}
	public void click_StoriesBox()
	{
		keys.click(storiesbox);
	}
	public void clickandadd_Image() throws InterruptedException
	{
		//keys.clickForAlert(edit);
		keys.jsClick(edit);
		Thread.sleep(3000);
		keys.jsClick(demo);
		Thread.sleep(3000);
		keys.jsClick(cartimg);
	}
	public void enterDataIn_Column(String cdata)
	{
		keys.clearData(columnbox);
		keys.enterData(columnbox, cdata);
	}
	public void enterDataIn_SortBox(String sdata)
	{
		keys.clearData(sortorder);
		keys.enterData(sortorder, sdata);
	}
	
	public void clickon_SaveBtn()
	{
		keys.jsClick(savebutton);
	}
	
}
