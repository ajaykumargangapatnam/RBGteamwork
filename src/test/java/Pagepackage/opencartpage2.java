package Pagepackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.surveillance.utilitiy.GenericKeywordsWithPage;

public class opencartpage2 
{

	public opencartpage2(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}



	@FindBy(name="username")
	WebElement userName;

	@FindBy(name="password")
	WebElement password;


	@FindBy(xpath = "//button[@type='submit']")
	WebElement login;

	@FindBy(xpath = "//a[text()=' Catalog']")
	WebElement catalogs;

	@FindBy(xpath ="(//a[text()='Categories'])[1]")
	WebElement catagories;

	@FindBy(xpath ="//div[@class='table-responsive']//td[text()='Cameras']//parent::tr//td//a")
	WebElement editimage;


	@FindBy(xpath ="//a[text()='Data']")
	WebElement databutton;

	@FindBy(xpath ="//input[@id='input-parent']")
	WebElement parent;

	@FindBy(xpath ="//input[@id='input-filter']")
	WebElement filter;

	@FindBy(xpath ="//input[@id='input-store-0']")
	WebElement stores;

	@FindBy(xpath ="//button[@class='btn btn-primary btn-sm btn-block']")
	WebElement image;

	@FindBy(xpath ="//a//img[@title='cart.png']")
	WebElement imagebox;

	@FindBy(xpath ="//input[@id='input-column']")
	WebElement coloumns;


	@FindBy(xpath ="//button[@type='submit']")
	WebElement save;
	
	@FindBy(xpath ="//input[@id='input-sort-order']")
	WebElement sortorder;



	GenericKeywordsWithPage key = new GenericKeywordsWithPage("opencart1");





	//	public void enterUsername(String enteruserId) throws Throwable
	//	{
	//		WebElement userNameEnterdata = key.driver.findElement(By.xpath("//input[@id='input-username']"));
	//		userNameEnterdata.click();
	//
	//		Actions act = new Actions(key.driver);
	//		act.doubleClick(userNameEnterdata).perform();
	//		Thread.sleep(4000);
	//		key.enterData(userNameEnterdata, enteruserId);
	//	}
	//	
	//	public void enterPassword(String enterpassword) throws InterruptedException
	//	{
	//		WebElement passwordEnterdata = key.driver.findElement(By.xpath("//input[@id='input-password']"));
	//		passwordEnterdata.click();
	//		Actions act = new Actions(key.driver);
	//		act.doubleClick(passwordEnterdata).perform();
	//		Thread.sleep(4000);
	//		key.enterData(passwordEnterdata, enterpassword);
	//	}
	//	

	public void enterPassword(String enterpassword) 
	{

		key.clearEnter(userName, enterpassword);
	}


	public void enterUsername(String enteruserId) 
	{

		key.clearEnter(password, enteruserId);
	}


	public void loginButton()
	{
		key.click(login);
	}

	public void catalogsButton()
	{
		key.click(catalogs);
	}


	public void catagoriesButton()
	{
		key.click(catagories);
	}


	public void editImage()
	{
		key.click(editimage);
	}

	public void data()
	{
		key.click(databutton);
	}

	public void parentButton(String enterparentdata)
	{
		key.enterData(parent, enterparentdata);
	}

	public void filterButton(String enterfilterdata)
	{
		key.enterData(filter, enterfilterdata);
	}


	public void storiesButton()
	{
		//key.click(stores);
	}


	public void imageedit() throws Exception
	{
		Thread.sleep(5000);
		key.jsClick(image);
	}

	public void imageBox () throws Exception
	{
		Thread.sleep(5000);
		key.click(imagebox);
	}

	public void coloumnBox (String data )	
	{
		key.clearEnter(coloumns, data);
	}
	
	public void sortOrderBox (String data )	
	{
		key.clearEnter(sortorder, data);
	}


	public void saveButton ()
	{
		key.click(save);
	}








}
