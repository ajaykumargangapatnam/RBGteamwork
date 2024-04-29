package practicepage;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.surveillance.utilitiy.ApplicationKeywords;
import com.surveillance.utilitiy.GenericKeywordsWithPage;

public class OrangeHRM_Login extends ApplicationKeywords
{
	public OrangeHRM_Login(WebDriver driver) 
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
	WebElement Adminlink;
	
	@FindBy(xpath="(//span[@class='oxd-topbar-body-nav-tab-item'])[4]")
	WebElement qualificationlist;
	
	@FindBy(xpath="(//a[@class='oxd-topbar-body-nav-tab-link'])[1]")
	WebElement skills;
	
	@FindBy(xpath="//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")
	WebElement AddBtn;
	
	@FindBy(xpath="(//input[@class='oxd-input oxd-input--active'])[2]")
	WebElement skillname;
	
	@FindBy(xpath="//textarea[@placeholder='Type description here']")
	WebElement descripbox;
	
	@FindBy(xpath="//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")
	WebElement savebtn;
	
	@FindBy(xpath="(//button[@class='oxd-icon-button oxd-table-cell-action-space'])[2]")
	WebElement editbtn;
	
	@FindBy(xpath="(//input[@class='oxd-input oxd-input--active'])[2]")
	WebElement clearskill;
			
	@FindBy(xpath="(//input[@class='oxd-input oxd-input--active'])[2]")
	WebElement updateskill;
	
	@FindBy(xpath="//textarea[@placeholder='Type description here']")
	WebElement cleardescription;
	
	@FindBy(xpath="//textarea[@placeholder='Type description here']")
	WebElement updatedescription;
	
	@FindBy(xpath="(//a[@class='oxd-topbar-body-nav-tab-link'])[2]")
	WebElement education;
	
	@FindBy(xpath="(//input[@class='oxd-input oxd-input--active'])[2]")
	WebElement levelbox;
	
	@FindBy(xpath="(//button[@class='oxd-icon-button oxd-table-cell-action-space'])[8]")
	WebElement edueditbtn;
	
	@FindBy(xpath="(//a[@class='oxd-topbar-body-nav-tab-link'])[3]")
	WebElement licence;
	
	@FindBy(xpath="(//input[@class='oxd-input oxd-input--active'])[2]")
	WebElement namebox;
	
	@FindBy(xpath="(//button[@class='oxd-icon-button oxd-table-cell-action-space'])[4]")
	WebElement editlicence;
	
	@FindBy(xpath="(//input[@class='oxd-input oxd-input--active'])[2]")
	WebElement editnamebox;
	
	@FindBy(xpath="(//a[@class='oxd-topbar-body-nav-tab-link'])[4]")
	WebElement language;
	
	@FindBy(xpath="(//a[@class='oxd-topbar-body-nav-tab-link'])[4]")
	WebElement langname;
	
	@FindBy(xpath="(//button[@class='oxd-icon-button oxd-table-cell-action-space'])[10]")
	WebElement editlang;
	
	@FindBy(xpath="(//a[@class='oxd-topbar-body-nav-tab-link'])[5]")
	WebElement membership;
	
	@FindBy(xpath="(//input[@class='oxd-input oxd-input--active'])[2]")
	WebElement membername;
	
	@FindBy(xpath="(//button[@class='oxd-icon-button oxd-table-cell-action-space'])[10]")
	WebElement editmembership;
	
	GenericKeywordsWithPage keywords = new GenericKeywordsWithPage("OrangeHRM_Login");

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
		keywords.click(Adminlink);
	}
	
	public void Clickon_QualList()
	{
		keywords.click(qualificationlist);
	}
	
	public void Clickon_Skills()
	{
		keywords.click(skills);
	}
	
	public void Clickon_Addbtn()
	{
		keywords.click(AddBtn);
	}
	
	public void Enter_Skillname(String sname) throws Throwable
	{
		keywords.enterData(skillname, sname);
		
	}
	
	public void Enter_Description(String data) throws Throwable
	{
		keywords.enterData(descripbox, data);
	}
	
	public void Clickon_Save()
	{
		keywords.click(savebtn);
	}
	
	public void Clickon_Editbtn()
	{
		keywords.click(editbtn);
	}
	public void ClearandEnter_skill(String uname) throws Throwable
	{
		keywords.click(skillname);
		Actions a1 = new Actions(keywords.driver);
		a1.keyDown(Keys.CONTROL);
		a1.sendKeys("a");
		a1.keyUp(Keys.CONTROL).perform();
		Thread.sleep(3000);
		a1.keyDown(Keys.BACK_SPACE).perform();
		
		Thread.sleep(3000);
		a1.keyUp(Keys.CONTROL).sendKeys(uname);
		a1.keyUp(Keys.CONTROL).perform();	
	}
	
	public void ClearandEnter_Description(String udname) throws Throwable
	{
		keywords.click(descripbox);
		Actions a1 = new Actions(keywords.driver);
		a1.keyDown(Keys.CONTROL);
		a1.sendKeys("a");
		a1.keyUp(Keys.CONTROL).perform();
		Thread.sleep(3000);
		a1.keyDown(Keys.BACK_SPACE).perform();
		
		Thread.sleep(3000);
		a1.keyUp(Keys.CONTROL).sendKeys(udname);
		a1.keyUp(Keys.CONTROL).perform();
		
	}
	
	public void ReEnter_skillname(String skname)
	{
		keywords.enterData(updateskill, skname);
	}
	
	public void ReEnter_Description(String dsname)
	{
		keywords.enterData(updatedescription, dsname);
	}
	
	public void Clickon_Education()
	{
		keywords.click(education);
	}
	
	public void Enter_Level(String lname)
	{
		keywords.enterData(levelbox, lname);
	}
	
	public void Clickon_editEducation()
	{
		keywords.click(edueditbtn);
	}
	
	public void Clickon_Licence()
	{
		keywords.click(licence);
	}
	
	public void Enter_Name(String name)
	{
		keywords.enterData(namebox, name);
	}
	public void Clickon_EditLicence()
	{
		keywords.click(editlicence);
	}
	
	public void Edit_Name(String ename)
	{
		keywords.enterData(editnamebox, ename);
	}
	
	public void Clickon_language()
	{
		keywords.click(language);
	}
	
	public void Enter_language(String elang)
	{
		keywords.enterData(langname, elang);
	}
	
	public void clickon_editlang()
	{
		keywords.click(editlang);
	}
	
	public void clickon_Membership()
	{
		keywords.click(membership);
	}
	
	public void Enter_membername(String mname)
	{
		keywords.enterData(membername, mname);
	}
	
	public void Edit_Membership()
	{
		keywords.click(editmembership);
	}
}
