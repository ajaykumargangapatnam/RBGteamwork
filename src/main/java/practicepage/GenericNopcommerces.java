package practicepage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.surveillance.utilitiy.GenericKeywordsWithPage;

public class GenericNopcommerces
{
	public GenericNopcommerces(WebDriver driver)
	{ 
		PageFactory.initElements(driver , this);
	}
	
	GenericKeywordsWithPage keywordsPage = new GenericKeywordsWithPage("GenericNopcommerces");
	
	@FindBy(xpath="//a[@href='/register?returnUrl=%2F']")
	WebElement Registerlink;
	public void ClickonRegister() 
	{
		keywordsPage.click(Registerlink);
	}
	
	@FindBy(xpath="//input[@id='gender-male']")
	WebElement GenderradioBtn;
	public void ClickonRadioBtn()
	{
		keywordsPage.click(GenderradioBtn);
	}
	
	@FindBy(xpath="//input[@id='FirstName']")
	WebElement FirstNameBox;
	public void EnterFirstname(String fname)
	{
		keywordsPage.enterData(FirstNameBox , fname);
	}
	
	@FindBy(xpath="//input[@id='LastName']")
	WebElement LastNameBox;
	public void EnterLastname(String Lname)
	{
		keywordsPage.enterData(LastNameBox , Lname);
	}
	
	@FindBy(xpath="//select[@name='DateOfBirthDay']")
	WebElement Birthdaybox;
	public void Dropdownforbirthdate(String value)
	{
		Select s1 = new Select(Birthdaybox);
		s1.selectByValue(value);
	}
	
	@FindBy(xpath="//select[@name='DateOfBirthMonth']")
	WebElement Birthmonthbox;
	public void Dropdownforbirthmonth(String value)
	{
		Select s2 = new Select(Birthmonthbox);
		s2.selectByValue(value);
		
	}
	
	@FindBy(xpath="//select[@name='DateOfBirthYear']")
	WebElement Birthyearbox;
	public void Dropdownforbirthyear(String value)
	{
		Select s3 = new Select(Birthyearbox);
		s3.selectByValue(value);
	}
	
	@FindBy(xpath="//input[@id='Email']")
	WebElement EmailInputbox;
	public void EnterEmail(String Ename)
	{
		keywordsPage.enterData(EmailInputbox , Ename);
	}
	
	@FindBy(xpath="//input[@id='Company']")
	WebElement CompanyInputbox;
	public void EnterCompanyname(String Cname)
	{
		keywordsPage.enterData(CompanyInputbox , Cname);
	}
	
	@FindBy(xpath="//input[@id='Password']")
	WebElement PasswordInputbox;
	
	public void EnterPassword(String Pname)
	{
		keywordsPage.enterData(PasswordInputbox , Pname);
	}
	
	@FindBy(xpath="//input[@id='ConfirmPassword']")
	WebElement ConfirmPasswordInputbox;
	
	public void EnterConfirmpassword(String CPname)
	{
		keywordsPage.enterData(ConfirmPasswordInputbox , CPname);
	}
	
	@FindBy(xpath="//button[@id='register-button']")
	WebElement RegisterBtn;
	public void RegisterButton()
	{
		keywordsPage.click(RegisterBtn);
	}
	
	@FindBy(xpath="//a[@href='/login?returnUrl=%2F']")
	WebElement Loginlink;
	public void ClickonLogin()
	{
		keywordsPage.click(Loginlink);
	}
	
	@FindBy(xpath="//input[@id='Email']")
	WebElement LoginEmailBox;	
	public void EnterLoginEmail(String LEname)
	{
		keywordsPage.enterData(LoginEmailBox , LEname);
	}
	
	@FindBy(xpath="//input[@id='Password']")
	WebElement LoginPasswordBox;	
	public void EnterLoginPassword(String PEname)
	{
		keywordsPage.enterData(LoginPasswordBox , PEname);
	}
	
	@FindBy(xpath="//button[@class='button-1 login-button']")
	WebElement Submitbtn;	
	public void Loginbutton()
	{
		keywordsPage.click(Submitbtn);
	}
	
	@FindBy(xpath="(//a[@href='/computers'])[1]")
	WebElement ComputerLink;
	public void ClickComputerLink()
	{
		keywordsPage.click(ComputerLink);
	}
	
	@FindBy(xpath="(//a[@href='/desktops'])[4]")
	WebElement DesktopLink;
	public void ClickonDesktop()
	{
		keywordsPage.click(DesktopLink);
	}
	
	@FindBy(xpath="(//button[@class='button-2 product-box-add-to-cart-button'])[1]")
	WebElement AddtocartBtn;
	public void  ClickAddtocart()
	{
		keywordsPage.click(AddtocartBtn);
	}
	
	@FindBy(xpath="//select[@name='product_attribute_1']")
	WebElement ProcessorDopdown;
	public void DropdownforProcessor(String value)
	{
		Select s4 = new Select(ProcessorDopdown);
		s4.selectByValue(value);
	}
	
	@FindBy(xpath="//select[@name='product_attribute_2']")
	WebElement RamDropdown;
	public void DropdownforRam(String value)
	{
		Select s5 = new Select(RamDropdown);
		s5.selectByValue(value);
	}
	
	@FindBy(xpath="(//input[@type='radio'])[2]")
	WebElement HDDradioBtn;
	public void ClickonHDDRadioBtn()
	{
		keywordsPage.click(HDDradioBtn);
	}
	
	@FindBy(xpath="(//input[@type='radio'])[4]")
	WebElement OSradioBtn;
	public void ClickOSRadioBtn()
	{
		keywordsPage.click(OSradioBtn);
	}
	
//	@FindBy(xpath="//input[@id='product_attribute_5_10']")
//	WebElement MOCheckbox;
//	public void SoftwareMobox() throws Throwable
//	{
//		MOCheckbox.isSelected();
//		Thread.sleep(2000);
//		MOCheckbox.isSelected();
//	}
	
	@FindBy(xpath="//input[@id='product_attribute_5_11']")
	WebElement AcrobatCheckbox;
	public void SoftwareARbox()
	{
		//AcrobatCheckbox.isSelected();
		AcrobatCheckbox.click();
	}
	
	@FindBy(xpath="//input[@id='product_attribute_5_12']")
	WebElement TotalCheckbox;
	public void SoftwareTCbox()
	{
		//TotalCheckbox.isSelected();
		TotalCheckbox.click();
	}
	
	@FindBy(xpath="//button[@id='add-to-cart-button-1']")
	WebElement AddtocartBtn1;
	public void  AddtocartBtn()
	{
		keywordsPage.click(AddtocartBtn1);
	}
	
	@FindBy(xpath="(//a[@href='/cart'])[1]")
	WebElement ShopcartLink;
	public void  ClickShopcartlink()
	{
		keywordsPage.click(ShopcartLink);
	}
	
	@FindBy(xpath="//div[@class='edit-item']/a")
	WebElement EditLink;
	public void  ClickEditlink()
	{
		keywordsPage.click(EditLink);
	}
	
	@FindBy(xpath="//select[@name='product_attribute_1']")
	WebElement UpadteProcessorDopdown;
	public void UpdateforProcessor(String value)
	{
		Select s4 = new Select(UpadteProcessorDopdown);
		s4.selectByValue(value);
	}
	
	@FindBy(xpath="//select[@name='product_attribute_2']")
	WebElement UpadteRamDropdown;
	public void UpadteforRam(String value)
	{
		Select s5 = new Select(UpadteRamDropdown);
		s5.selectByValue(value);
	}
	
	@FindBy(xpath="(//input[@type='radio'])[1]")
	WebElement UpdateHDDradioBtn;
	public void UpadteHDDRadioBtn()
	{
		keywordsPage.click(UpdateHDDradioBtn);
	}
	
	@FindBy(xpath="(//input[@type='radio'])[3]")
	WebElement UpdateOSradioBtn;
	public void UpdateOSRadioBtn()
	{
		keywordsPage.click(UpdateOSradioBtn);
	}
	
	@FindBy(xpath="//input[@id='product_attribute_5_10']")
	WebElement MOCheckbox;
	public void SoftwareMobox() throws Throwable
	{
		MOCheckbox.isSelected();
	}
	
	@FindBy(xpath="//button[@id='add-to-cart-button-1']")
	WebElement UpdateAddtocart;
	public void  UpdateCart()
	{
		keywordsPage.click(UpdateAddtocart);
	}
	
	@FindBy(xpath="(//a[@href='/computers'])[1]")
	WebElement AgainComputerLink;
	public void AgainComputer()
	{
		keywordsPage.click(AgainComputerLink);
	}
	
	@FindBy(xpath="(//a[@href='/notebooks'])[4]")
	WebElement NotebookLink;
	public void ClickonNotebook()
	{
		keywordsPage.click(NotebookLink);
	}
	
	@FindBy(xpath="//input[@id='attribute-option-6']")
	WebElement CpuCheckbox;
	public void CpuTypecheckbox()
	{
		//AcrobatCheckbox.isSelected();
		CpuCheckbox.click();
	}
	
	@FindBy(xpath="//input[@id='attribute-option-8']")
	WebElement MemoryCheckbox;
	public void MemoryTypecheckbox()
	{
		//AcrobatCheckbox.isSelected();
		MemoryCheckbox.click();
	}
	
	@FindBy(xpath="//select[@id='products-orderby']")
	WebElement PositionDropdown;
	public void SortbyPosition(String value)
	{
		Select s6 = new Select(PositionDropdown);
		s6.selectByValue(value);
	}
	
	@FindBy(xpath="//select[@id='products-pagesize']")
	WebElement DisplayDropdown;
	public void DisplayPerpage(String value)
	{
		Select s7 = new Select(DisplayDropdown);
		s7.selectByValue(value);
	}
	
	@FindBy(xpath="//a[@href='/apple-macbook-pro-13-inch']")
	WebElement ProductLink;
	public void AppleProductLink()
	{
		keywordsPage.click(ProductLink);
	}
	
	@FindBy(xpath="//button[@id='add-to-cart-button-4']")
	WebElement Appleaddtocart;
	public void AppleCartBtn()
	{
		keywordsPage.click(Appleaddtocart);
	}
	
	@FindBy(xpath="(//a[@href='/cart'])[1]")
	WebElement AgainShopcart;
	public void NotebookCart()
	{
		keywordsPage.click(AgainShopcart);
	}
	
	@FindBy(xpath="(//input[@class='qty-input'])[2]")
	WebElement ClearBox;
	public void ClearData()
	{
		keywordsPage.clearAndTabout(ClearBox);
	}
	
	@FindBy(xpath="(//input[@class='qty-input'])[2]")
	WebElement NotebookQuan;
	public void NoteQuant(String quantity)
	{
		keywordsPage.enterData(NotebookQuan, quantity);
	}
	
	
	@FindBy(xpath="//button[@id='updatecart']")
	WebElement UpdateQuan;
	public void UpdateQuantBtn()
	{
		keywordsPage.click(UpdateQuan);
	}
	
}	
	

	

















































//	
//	public void ClickonRegister()
//	{
//		keywordsPage.click(Registerlink);
//	}
//	public void ClickonRadioBtn()
//	{
//		keywordsPage.click(GenderradioBtn);
//	}
//	
//	public void EnterFirstname(String fname)
//	{
//		keywordsPage.enterData(FirstNameBox , fname);
//	}
//	
//	public void EnterLastname(String Lname)
//	{
//		keywordsPage.enterData(LastNameBox , Lname);
//	}
//	
//	public void Dropdownforbirthdate(String value)
//	{
//		Select s1 = new Select(Birthdaybox);
//		s1.selectByValue(value);
//	}
//	
//	public void Dropdownforbirthmonth(String value)
//	{
//		Select s2 = new Select(Birthmonthbox);
//		s2.selectByValue(value);
//		
//	}
//	
//	public void Dropdownforbirthyear(String value)
//	{
//		Select s3 = new Select(Birthyearbox);
//		s3.selectByValue(value);
//	}
//	
//	public void EnterEmail(String Ename)
//	{
//		keywordsPage.enterData(EmailInputbox , Ename);
//	}
//	
//	public void EnterCompanyname(String Cname)
//	{
//		keywordsPage.enterData(CompanyInputbox , Cname);
//	}
//	
//	public void EnterPassword(String Pname)
//	{
//		keywordsPage.enterData(PasswordInputbox , Pname);
//	}
//	
//	public void EnterConfirmpassword(String CPname)
//	{
//		keywordsPage.enterData(ConfirmPasswordInputbox , CPname);
//	}
//	
//	public void RegisterButton()
//	{
//		keywordsPage.click(RegisterBtn);
//	}
//	
//	public void ClickonLogin()
//	{
//		keywordsPage.click(Loginlink);
//	}
//	
//	public void EnterLoginEmail(String LEname)
//	{
//		keywordsPage.enterData(LoginEmailBox , LEname);
//	}
//	
//	public void EnterLoginPassword(String PEname)
//	{
//		keywordsPage.enterData(LoginPasswordBox , PEname);
//	}
//	
//	public void Loginbutton()
//	{
//		keywordsPage.click(Submitbtn);
//	}

