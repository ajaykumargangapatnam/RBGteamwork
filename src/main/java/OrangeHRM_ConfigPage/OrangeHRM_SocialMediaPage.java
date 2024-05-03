package OrangeHRM_ConfigPage;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.surveillance.utilitiy.GenericKeywordsWithPage;

public class OrangeHRM_SocialMediaPage 
{
	public OrangeHRM_SocialMediaPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@name='username']")
	WebElement loginUserName;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement loginPassword;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement loginSubmitBtn;
	
	@FindBy(xpath="//a[@href='/web/index.php/admin/viewAdminModule']")
	WebElement adminlink;
	
	@FindBy(xpath="//span[contains(text(),'Configuration')]")
	WebElement configuration;
	
	GenericKeywordsWithPage keywords = new GenericKeywordsWithPage("OrangeHRM_LoginPage");

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
	
	@FindBy(xpath="//a[text()='Social Media Authentication']")
	WebElement socialauthentication;
	public void SocialMediaAuthentication()
	{
		keywords.click(socialauthentication);
	}
	
	@FindBy(xpath="//button[text()=' Add ']")
	WebElement socialaddbtn;
	public void SocialAddBtn()
	{
		keywords.click(socialaddbtn);
	}
	
	@FindBy(xpath="//label[text()='Name']/parent::div/parent::div[@class='oxd-input-group oxd-input-field-bottom-space']/child::div/following-sibling::div/input")
	WebElement nameinputbox;
	public void NameInputBox(String ndata)
	{
		keywords.enterData(nameinputbox,ndata);
	}
	
	@FindBy(xpath="//label[text()='Provider URL']/parent::div/parent::div[@class='oxd-input-group oxd-input-field-bottom-space']/child::div/following-sibling::div/input")
	WebElement providerinputbox;
	public void ProviderInputBox(String pdata)
	{
		keywords.enterData(providerinputbox,pdata);
	}
	
	@FindBy(xpath="//label[text()='Client ID']/parent::div/parent::div[@class='oxd-input-group oxd-input-field-bottom-space']/child::div/following-sibling::div/input")
	WebElement clientinputbox;
	public void ClientInputBox(String cdata)
	{
		keywords.enterData(clientinputbox,cdata);
	}
	
	@FindBy(xpath="//label[text()='Client Secret']/parent::div/parent::div[@class='oxd-input-group oxd-input-field-bottom-space']/child::div/following-sibling::div/input")
	WebElement clientsecterinputbox;
	public void ClientsecretInputBox(String csdata)
	{
		keywords.enterData(clientsecterinputbox, csdata);
	}
	
	@FindBy(xpath="//button[text()=' Save ']")
	WebElement socialsave;
	public void Clickon_SocialSave()
	{
		keywords.click(socialsave);
	}
		
	@FindBy(xpath="//div[text()='Actions']/following::div/div/div/div/following-sibling::div/following-sibling::div/child::div[@class='oxd-table-cell-actions']/button/following::button")
	WebElement editbtn;
	public void Clickon_EditBtn()
	{
		keywords.click(editbtn);
	}
	
	public void EditNameInputBox(String ndata) throws Throwable
	{
		keywords.click(nameinputbox);
		Thread.sleep(3000);
		Actions a1 = new Actions(keywords.driver);
		a1.keyDown(Keys.CONTROL);
		a1.sendKeys("a");
		a1.keyUp(Keys.CONTROL).perform();
		Thread.sleep(3000);
		a1.keyDown(Keys.BACK_SPACE).perform();
		
		Thread.sleep(3000);
		a1.keyUp(Keys.CONTROL).sendKeys(ndata);
		a1.keyUp(Keys.CONTROL).perform();
		
	}
	
	public void EditProviderInputBox(String pdata) throws Throwable
	{
		keywords.click(providerinputbox);
		Thread.sleep(3000);
		Actions a1 = new Actions(keywords.driver);
		a1.keyDown(Keys.CONTROL);
		a1.sendKeys("a");
		a1.keyUp(Keys.CONTROL).perform();
		Thread.sleep(3000);
		a1.keyDown(Keys.BACK_SPACE).perform();
		
		Thread.sleep(3000);
		a1.keyUp(Keys.CONTROL).sendKeys(pdata);
		a1.keyUp(Keys.CONTROL).perform();
	}
	
	
	public void EditClientInputBox(String cdata) throws Throwable
	{
		keywords.click(clientinputbox);
		Thread.sleep(3000);
		Actions a1 = new Actions(keywords.driver);
		a1.keyDown(Keys.CONTROL);
		a1.sendKeys("a");
		a1.keyUp(Keys.CONTROL).perform();
		Thread.sleep(3000);
		a1.keyDown(Keys.BACK_SPACE).perform();
		
		Thread.sleep(3000);
		a1.keyUp(Keys.CONTROL).sendKeys(cdata);
		a1.keyUp(Keys.CONTROL).perform();
	}
	
	public void EditClientsecretInputBox(String csdata) throws Throwable
	{
		keywords.click(clientsecterinputbox);
		Thread.sleep(3000);
		Actions a1 = new Actions(keywords.driver);
		a1.keyDown(Keys.CONTROL);
		a1.sendKeys("a");
		a1.keyUp(Keys.CONTROL).perform();
		Thread.sleep(3000);
		a1.keyDown(Keys.BACK_SPACE).perform();
		
		Thread.sleep(3000);
		a1.keyUp(Keys.CONTROL).sendKeys(csdata);
		a1.keyUp(Keys.CONTROL).perform();
	}

}
