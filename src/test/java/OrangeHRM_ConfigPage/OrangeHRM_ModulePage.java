package OrangeHRM_ConfigPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.surveillance.utilitiy.GenericKeywordsWithPage;

public class OrangeHRM_ModulePage 
{
	public OrangeHRM_ModulePage(WebDriver driver) 
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

}
