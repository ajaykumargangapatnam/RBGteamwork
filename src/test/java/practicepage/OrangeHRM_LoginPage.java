package practicepage;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.surveillance.utilitiy.ApplicationKeywords;
import com.surveillance.utilitiy.GenericKeywordsWithPage;

public class OrangeHRM_LoginPage extends ApplicationKeywords
{
	public OrangeHRM_LoginPage(WebDriver driver) 
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
	
	@FindBy(xpath="//a[contains(text(),'Email Configuration')]")
	WebElement emailconfig;
	
	@FindBy(xpath="//label[contains(text(),'Mail Sent As')]/following::div/input")
	WebElement clearemail;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement savebtn;
	
	@FindBy(xpath="(//button[@type='button'])[3]")
	WebElement resetbtn;
	
	@FindBy(xpath="//a[contains(text(),'Email Subscriptions')]")
	WebElement emailsubscrip;
	
	@FindBy(xpath="(//button[@type='button'])[3]")
	WebElement subsripbtn;
	
	@FindBy(xpath="(//button[@type='button'])[3]")
	WebElement addbtn;
	
	@FindBy(xpath="//label[contains(text(),'Name')]/following::div[1]/input")
	WebElement namebox;
	
	@FindBy(xpath="//label[contains(text(),'Email')]/following::div[1]/input")
	WebElement emailbox;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement  emailsavebtn;
	
	@FindBy(xpath="(//span[@class='oxd-switch-input oxd-switch-input--active --label-right'])[1]")
	WebElement  subscripadd;
	
	@FindBy(xpath="//a[text()='Localization']")
	WebElement  localization;
	
	@FindBy(xpath="//div[text()='English (United States)']/following::div[1]/i")
	WebElement langbox;
	
	@FindBy(xpath="//span[text()='Dutch - Nederlands']")
	WebElement language;
	
	@FindBy(xpath="//div[text()='yyyy-dd-mm ( 2024-01-05 )']/following::div[1]/i")
	WebElement  datebox; 
	
	@FindBy(xpath="//span[text()='mm-dd-yyyy ( 05-01-2024 )']")
	WebElement  dateyear;
	
	@FindBy(xpath="//button[text()=' Save ']")
	WebElement  localsave;
	
	@FindBy(xpath="//a[text()='Language Packages']")
	WebElement langpackages;
	
	@FindBy(xpath="//button[text()=' Add ']")
	WebElement lpaddbtn;
	
	@FindBy(xpath="//label[text()='Name']/following::div/div/div/div[@class='oxd-select-text-input']")
	WebElement addlanguage;
	
	@FindBy(xpath="//span[text()='Afrikaans (Namibia) - Afrikaans (Namibië)']")
	WebElement arabicdata;
	
	@FindBy(xpath="//button[text()=' Save ']")
	WebElement langsave;
	
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
	
	public void click_ForgotBtn()
	{
		keywords.click(loginForgotBtn);
	}
	
	public void Clickon_Admin()
	{
		keywords.click(adminlink);
	}
	
	public void Clickon_Configuration()
	{
		keywords.click(configuration);
	}
	
	public void Clickon_EmailConfig()
	{
		keywords.click(emailconfig);
	}
	
	public void ClearandEnter_Email(String ename) throws Throwable
	{
		keywords.click(clearemail);
		Thread.sleep(3000);
		Actions a1 = new Actions(keywords.driver);
		a1.keyDown(Keys.CONTROL);
		a1.sendKeys("a");
		a1.keyUp(Keys.CONTROL).perform();
		Thread.sleep(3000);
		a1.keyDown(Keys.BACK_SPACE).perform();
		
		Thread.sleep(3000);
		a1.keyUp(Keys.CONTROL).sendKeys(ename);
		a1.keyUp(Keys.CONTROL).perform();
		keywords.click(savebtn);
	}
	
	public void Clickon_Save()
	{
		keywords.click(savebtn);
	}
	
	public void Clickon_Reset()
	{
		keywords.click(resetbtn);
	}
	
	public void Clickon_EmailSubscription()
	{
		keywords.click(emailsubscrip);
	}
	
	public void Clickon_Subscripbtn()
	{
		keywords.click(subsripbtn);
	}
	
	public void clickon_Addbtn()
	{
		keywords.click(addbtn);
	}
	
	public void Enter_InputName(String name)
	{
		keywords.enterData(namebox, name);
	}

	public void Enter_EmailName(String ename)
	{
		keywords.enterData(emailbox, ename);
	}
	
	public void Clickon_Emailsave()
	{
		keywords.click(emailsavebtn);
	}
	
	public void Clickon_Localization()
	{
		keywords.click(localization);
	}
	
	public void Enter_CountryLanguage() throws Throwable
	{
		keywords.click(langbox);
		Thread.sleep(10000);
		keywords.click(language);
	}
	
	public void Enter_DOY() throws Throwable
	{
		keywords.click(datebox);
		Thread.sleep(10000);
		keywords.click(dateyear);
	}
	
	public void Clickon_LocalSave()
	{
		keywords.click(localsave);
	}
	
	public void Clickon_LanguagePackages()
	{
		keywords.click(langpackages);
	}
	
	public void Clickon_LPAddBtn()
	{
		keywords.click(addbtn);
	}
	
	public void Enter_language() throws Throwable
	{
		keywords.click(addlanguage);
		Thread.sleep(3000);
		//keywords.movetoElement(arabicdata);
		keywords.click(arabicdata);
	}
	
	public void Clickon_LangSaveBox()
	{
		keywords.click(langsave);
	}
	
	@FindBy(xpath="//a[text()='Modules']")
	WebElement modules;
	public void Clickon_Modules()
	{
		keywords.click(modules);
	}
	
	@FindBy(xpath="//p[text()='Leave Module']/parent::div/div/label/span")
	WebElement leavemodule;
	public void Clickon_LeaveModule()
	{
		keywords.click(leavemodule);
	}
	
	@FindBy(xpath="//p[text()='Time Module']/parent::div/div/label/span")
	WebElement time;
	public void Clickon_TimeModule()
	{
		keywords.click(time);
	}
	
	@FindBy(xpath="//p[text()='Recruitment Module']/parent::div/div/label/span")
	WebElement recruitmodule;
	public void Clickon_RecruitmentModule()
	{
		keywords.click(recruitmodule);
	}
	
	@FindBy(xpath="//p[text()='Performance Module']/parent::div/div/label/span")
	WebElement performsncemodule;
	public void Clickon_PerformanceModule()
	{
		keywords.click(performsncemodule);
	}
	
	@FindBy(xpath="//p[text()='Directory Module']/parent::div/div/label/span")
	WebElement directorymodule;
	public void Clickon_DirectoryModule()
	{
		keywords.click(directorymodule);
	}
	
	@FindBy(xpath="//p[text()='Maintenance Module']/parent::div/div/label/span")
	WebElement maintanancemodule;
	public void Clickon_maintananceModule()
	{
		keywords.click(maintanancemodule);
	}
	
	@FindBy(xpath="//p[text()='Mobile']/parent::div/div/label/span")
	WebElement mobile;
	public void Clickon_MobileModule()
	{
		keywords.click(mobile);
	}
	
	@FindBy(xpath="//p[text()='Claim Module']/parent::div/div/label/span")
	WebElement claimmodule;
	public void Clickon_ClaimModule()
	{
		keywords.click(claimmodule);
	}
	
	@FindBy(xpath="//button[text()=' Save ']")
	WebElement modulesave;
	public void Clickon_ModuleSave()
	{
		keywords.click(modulesave);
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
}
