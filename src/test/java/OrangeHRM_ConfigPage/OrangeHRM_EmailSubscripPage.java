package OrangeHRM_ConfigPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.surveillance.utilitiy.GenericKeywordsWithPage;

public class OrangeHRM_EmailSubscripPage 
{
	public OrangeHRM_EmailSubscripPage(WebDriver driver) 
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
	
	@FindBy(xpath="//div[text()='Leave Applications']/parent::div/following-sibling::div/following-sibling::div/div/child::div/label/input")
	WebElement  apllicationsbtn;
	
	@FindBy(xpath="//div[text()='Leave Approvals']/parent::div/following-sibling::div/following-sibling::div/div/child::div/label/input")
	WebElement  approvalsbtn;
	
	@FindBy(xpath="//div[text()='Leave Assignments']/parent::div/following-sibling::div/following-sibling::div/div/child::div/label/input")
	WebElement  assignmentsbtn;
	
	@FindBy(xpath="//div[text()='Leave Cancellations']/parent::div/following-sibling::div/following-sibling::div/div/child::div/label/input")
	WebElement  cancellationsbtn;
	
	@FindBy(xpath="//div[text()='Leave Rejections']/parent::div/following-sibling::div/following-sibling::div/div/child::div/label/input")
	WebElement  rejectionsbtn;
	
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
	
	public void Clickon_Applications()
	{
		keywords.click(apllicationsbtn);
	}
	
	public void Clickon_Approvals()
	{
		keywords.click(approvalsbtn);
	}
	
	public void Clickon_Assignments()
	{
		keywords.click(assignmentsbtn);
	}
	
	public void Clickon_Cancellations()
	{
		keywords.click(cancellationsbtn);
	}
	
	public void Clickon_Rejections()
	{
		keywords.click(rejectionsbtn);
	}
	

}
