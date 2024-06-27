package Pagepackage;


	import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.remote.internal.WebElementToJsonConverter;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	import com.surveillance.utilitiy.GenericKeywordsWithPage;

	public class openCartPage4 
	{
		public openCartPage4(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}

		@FindBy(xpath = "//input[@id='input-username']")
		WebElement userName;
		
		@FindBy(xpath = "//input[@id='input-password']")
		WebElement password;

		@FindBy(xpath = "//button[@type='submit']")
		WebElement login;
		
		@FindBy(xpath = "//span[contains(text(), 'demo demo')]")
		WebElement demofield;
		
		@FindBy(xpath="//a[text()=' Your Profile']")
		WebElement profile;
		
		@FindBy(xpath="//input[@name='username']")
		WebElement username;
		
		@FindBy(xpath = "//input[@id='input-firstname']")
		WebElement firstName;
		
		@FindBy(xpath = "//input[@id='input-lastname']")
		WebElement lastName;
		
		@FindBy(xpath = "//input[@id='input-email']")
		WebElement email;
		
		@FindBy(xpath="//button[text()=' Edit']")
		WebElement edit;
		
		@FindBy(xpath="//i[@class='fa-solid fa-folder fa-5x']")
		WebElement demo;
		
		@FindBy(xpath="//a//img[@title='apple_logo.jpg']")
		WebElement cartimg;
		
		@FindBy(xpath="//input[@name='password']")
		WebElement password2;

		@FindBy(xpath="//input[@name='confirm']")
		WebElement conformpwd;
		
		
		
		GenericKeywordsWithPage key = new GenericKeywordsWithPage("OpenCartPage1");


		public void enterUsername(String enteruserId) throws Throwable
		{

	       key.clearEnter(userName, enteruserId);
		}
		
		public void enterPassword(String enterpassword) throws InterruptedException
		{
			
			key.clearEnter(password, enterpassword);
		}
		
		public void clickbutton()
		{
			key.click(login);
		}
		
		public void clickdemo()
		{
			key.click(demofield);
		}
		
		public void Profile()
		{
			key.click(profile);
		}
		
		public void Username(String uname)
		{
			key.clearEnter(username, uname);
		}
		
		public void firstname(String first)
		{
			key.clearEnter(firstName, first);
		}
		
		public void lastname(String name)
		{
			key.clearEnter(lastName, name);
		}
		
		public void Email(String edata)
		{
			key.clearEnter(email, edata);
		}
		
		public void Image() throws InterruptedException
		{
			
			key.jsClick(edit);
			Thread.sleep(3000);
			key.jsClick(demo);
			Thread.sleep(3000);
			key.jsClick(cartimg);
		}
		public void CustomerPassword(String data)
		{
			key.clearEnter(password2, data);
		}
		public void ConformCustmerPwd(String conformpass)
		{
			key.clearEnter(conformpwd, conformpass);
		}
			
	
}
