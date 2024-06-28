package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.OpenStore_Login;

public class OpenStoreSteps 
{
	public WebDriver driver;
	public OpenStore_Login ol;

	@Given("User Open Chrome Browser")
	public void user_open_chrome_browser()
	{
		driver = new ChromeDriver();
		ol = new OpenStore_Login(driver);
	}
	
	@When("User Opens URL {string}")
	public void user_opens_url(String url)
	{
	    driver.get(url);
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Then("User click on MyAccount")
	public void user_click_on_my_account() 
	{
		ol.clickon_MyAccount();
	}
	
	@Then("User Click Login")
	public void user_click_login() 
	{
		ol.clickon_Login();
	}
	
	@When("Enter UserName {string} and Password {string}")
	public void enter_user_name_and_password(String uname, String pname) 
	{
		ol.enter_UserName(uname);
		ol.enter_password(pname);
	}
	
	@Then("Click on Loginbutton")
	public void click_on_loginbutton() 
	{
		ol.clickon_LoginBtn();
	}
	
	@Then("Close The browser")
	public void close_the_browser()
	{
		driver.quit();
	}
	
}
