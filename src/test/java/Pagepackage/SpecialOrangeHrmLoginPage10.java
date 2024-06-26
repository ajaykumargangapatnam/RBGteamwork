package Pagepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.surveillance.utilitiy.GenericKeywordsWithPage;

public class SpecialOrangeHrmLoginPage10 
{
	public SpecialOrangeHrmLoginPage10(WebDriver driver)
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
	
	@FindBy(xpath="//a[text()='LDAP Configuration']")
	WebElement ldapconfig;
	public void Clickon_LDAPConfig()
	{
		keywords.click(ldapconfig);
	}
	
	@FindBy(xpath="//label[text()='Host']/parent::div/following-sibling::div/input")
	WebElement hostname;
	public void Enter_HostName(String hname) throws Throwable
	{
		keywords.click(hostname);
		Thread.sleep(3000);

		
		keywords.backspace(hostname);
		keywords.enterData(hostname, hname);
	}
	
	@FindBy(xpath="//label[text()='Port']/parent::div/following-sibling::div/input")
	WebElement portname;
	public void Enter_PortBox(String pname) throws Throwable
	{
		keywords.click(portname);
		Thread.sleep(3000);

		
		keywords.backspace(portname);
		keywords.enterData(portname, pname);
	}
	
	@FindBy(xpath="//label[text()='Encryption']/parent::div/following-sibling::div/child::div/div/child::div[text()='-- Select --']")
	WebElement encrypt;
	public void Clickon_Encryption()
	{
		keywords.click(encrypt);
	}
	
	@FindBy(xpath="//span[text()='TLS']")
	WebElement tlsbox;
	public void Clickon_TLS()
	{
		keywords.click(tlsbox);
	}
	
	//div[text()='Open LDAP v3']
	
	@FindBy(xpath="//div[text()='Open LDAP v3']")
	WebElement openbox;
	public void Clickon_OpenLDAP()
	{
		keywords.click(openbox);
	}
	
	@FindBy(xpath="//span[text()='MS Active Directory']")
	WebElement implement;
	public void Clickon_Implementation()
	{
		keywords.click(implement);
	}
	
	@FindBy(xpath="//label[text()='Distinguished Name']/parent::div/following-sibling::div/input")
	WebElement distinguishbox;
	public void Clickon_DistinguishedName(String dname)
	{
		keywords.enterData(distinguishbox, dname);
	}
	
	@FindBy(xpath="//label[text()='Password']/parent::div/following-sibling::div/input")
	WebElement passwordbox;
	public void Clickon_PasswordName(String pass)
	{
		keywords.enterData(passwordbox,pass);
	}
	
	@FindBy(xpath="//label[text()='Base Distinguished Name']/parent::div/following-sibling::div/input")
	WebElement basebox;
	public void Clickon_BaseDistinguishedName(String bdata)
	{
		keywords.enterData(basebox,bdata);
	}
	
	@FindBy(xpath="//div[text()='Subtree']")
	WebElement subtreebox;
	public void Clickon_Subtree()
	{
		keywords.click(subtreebox);
	}
	
	@FindBy(xpath="//span[text()='One level']")
	WebElement searchbox;
	public void Clickon_OneLevelName()
	{
		keywords.click(searchbox);
	}
	
	@FindBy(xpath="//label[text()='User Name Attribute']/parent::div/following-sibling::div/input")
	WebElement usernamebox;
	public void Enter_UserAttributeName(String uname) throws Throwable
	{
		keywords.click(usernamebox);
		Thread.sleep(3000);

		
		keywords.backspace(usernamebox);
		keywords.enterData(usernamebox, uname);
	}
	
	@FindBy(xpath="//label[text()='User Search Filter']/parent::div/following-sibling::div/input")
	WebElement usersearchbox;
	public void Enter_UserSearchBox(String usname) throws Throwable
	{
		keywords.click(usersearchbox);
		Thread.sleep(3000);

		keywords.backspace(usersearchbox);
		keywords.enterData(usersearchbox, usname);
	}
	
	@FindBy(xpath="//label[text()='User Unique ID Attribute']/parent::div/following-sibling::div/input")
	WebElement useruniquebox;
	public void Enter_UserUniqueBox(String uqname) throws Throwable
	{
		keywords.enterData(useruniquebox, uqname);
	}
	
	@FindBy(xpath="//p[text()='First Name']/parent::div/following-sibling::div[1]/child::div/child::div/following-sibling::div/input")
	WebElement firstbox;
	public void Enter_FirstName(String fname) throws Throwable
	{
		keywords.click(firstbox);
		Thread.sleep(3000);

		
		keywords.backspace(firstbox);
		keywords.enterData(firstbox, fname);
		
	}
	
	@FindBy(xpath="//p[text()='Middle Name']/parent::div/following-sibling::div[1]/child::div/child::div/following-sibling::div/input")
	WebElement middlebox;
	public void Enter_MiddleName(String mname) throws Throwable
	{
		keywords.enterData(middlebox, mname);
	}
	
	@FindBy(xpath="//p[text()='Last Name']/parent::div/following-sibling::div[1]/child::div/child::div/following-sibling::div/input")
	WebElement lastbox;
	public void Enter_LastName(String lname) throws Throwable
	{
		keywords.click(lastbox);
		Thread.sleep(3000);

		
		keywords.backspace(lastbox);
		keywords.enterData(lastbox, lname);
		
	}
	@FindBy(xpath="//p[text()='User Status']/parent::div/following-sibling::div[1]/child::div/child::div/following-sibling::div/input")
	WebElement userstatusbox;
	public void Enter_UserStatusBox(String wname) throws Throwable
	{
		keywords.enterData(userstatusbox, wname);
	}
	
	@FindBy(xpath="//p[text()='Work Email']/parent::div/following-sibling::div[1]/child::div/child::div/following-sibling::div/input")
	WebElement workemailbox;
	public void Enter_WorkEmailBox(String wname) throws Throwable
	{
		keywords.enterData(workemailbox, wname);
	}
	
	@FindBy(xpath="//p[text()='Employee Id']/parent::div/following-sibling::div[1]/child::div/child::div/following-sibling::div/input")
	WebElement employidbox;
	public void Enter_EmployIdBox(String iname) throws Throwable
	{
		keywords.enterData(employidbox, iname);
	}
	
	@FindBy(xpath="//label[text()='Sync Interval (in Hours)']/parent::div/following-sibling::div/input")
	WebElement syncbox;
	public void Enter_SyncIntervalBox(String siname) throws Throwable
	{
		keywords.click(syncbox);
		Thread.sleep(3000);

		
		keywords.backspace(syncbox);
		keywords.enterData(syncbox, siname);
	}
	
	@FindBy(xpath="//button[text()=' Save ']")
	WebElement savebox;
	public void Clickon_Save()
	{
		keywords.click(savebox);
	}
	


}
