
	package Pagepackage;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	import com.surveillance.utilitiy.GenericKeywordsWithPage;

	public class opencartpage5
	{
		
		public opencartpage5(WebDriver driver) 
		{
			PageFactory.initElements(driver, this);
		}

		
		
		@FindBy(name="username")
		WebElement userName;
		
		@FindBy(name="password")
		WebElement password;
		  
		
		@FindBy(xpath = "//button[@type='submit']")
		WebElement login;
		
		
		@FindBy(xpath = "//span[text()='Logout']")
		WebElement logout;
		 
		GenericKeywordsWithPage key = new GenericKeywordsWithPage("opencart5");

			
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
		
		public void logoutButton()
		{
			key.click(logout);
		}

	}


