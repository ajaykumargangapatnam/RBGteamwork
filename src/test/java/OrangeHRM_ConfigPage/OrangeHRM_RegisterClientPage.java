package OrangeHRM_ConfigPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.surveillance.utilitiy.GenericKeywordsWithPage;

public class OrangeHRM_RegisterClientPage 
{
	public OrangeHRM_RegisterClientPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@name='username']")
	WebElement loginUserName;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement loginPassword;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement loginSubmitBtn;
	
	@FindBy(xpath="//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']")
	WebElement loginForgotBtn;
	
	@FindBy(xpath="//a[@href='/web/index.php/admin/viewAdminModule']")
	WebElement adminlink;
	
	@FindBy(xpath="//span[contains(text(),'Configuration')]")
	WebElement configuration;
	
	GenericKeywordsWithPage keywords = new GenericKeywordsWithPage("OrangeHRM_RegisterClientPage");

	public void enter_Username(String user)
	{
		keywords.enterData(loginUserName, user);
	}
	
	public void enter_Password(String pass)
	{
		keywords.enterData(loginPassword, pass);
	}
	
	public void click_Login()
	{
		keywords.click(loginSubmitBtn);
	}
	
	public void Clickon_Admin()
	{
		keywords.click(adminlink);
	}
	
	public void Clickon_Configuration()
	{
		keywords.click(configuration);
	}
	
	@FindBy(xpath="//a[text()='Register OAuth Client']")
	WebElement registerclient;
	public void RegisterOAuthClient()
	{
		keywords.click(registerclient);
	}
	
	@FindBy(xpath="//button[text()=' Add ']")
	WebElement OAuthAddbtn;
	public void OAuthAddbtn()
	{
		keywords.click(OAuthAddbtn);
	}
	
	@FindBy(xpath="//label[text()='Name']/parent::div/following::div[1]/input")
	WebElement oauthinputbox;
	public void Enter_OAuthInputName(String oadata)
	{
		keywords.enterData(oauthinputbox, oadata);
	}
	
	@FindBy(xpath="//label[text()='Redirect URI']/parent::div/following::div[1]/input")
	WebElement requiredinputbox;
	public void Enter_RedirectURIName(String rdata)
	{
		keywords.enterData(requiredinputbox, rdata);
	}
	
	@FindBy(xpath="//button[text()=' Save ']")
	WebElement oauthsavebtn;
	public void OAuthSavebtn()
	{
		keywords.click(oauthsavebtn);
	}
	
	@FindBy(xpath="//div[@class='oxd-table-header']/child::div/child::div/child::div/label/child::span")
	WebElement checkbox;
	public void Clickon_Checkbox()
	{
		keywords.click(checkbox);
	}
	
	@FindBy(xpath="//div[text()='raaju']/parent::div/following-sibling::div/following-sibling::div/following-sibling::div/div/button/following-sibling::button")
	WebElement editbtn;
	public void Clickon_EditBtn()
	{
		keywords.click(editbtn);
	}
	
	public void UpdateEnter_OAuthInputName(String oadata) throws Throwable
	{
		keywords.click(oauthinputbox);
		Thread.sleep(3000);
		keywords.backspace(oauthinputbox);
		keywords.enterData(oauthinputbox, oadata);
	}
	
	public void UpdateEnter_RedirectURIName(String rdata) throws Throwable
	{
		keywords.click(requiredinputbox);
		Thread.sleep(3000);
		keywords.backspace(requiredinputbox);
		keywords.enterData(requiredinputbox, rdata);
	}

}
