package practicepage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.surveillance.utilitiy.GenericKeywordsWithPage;

public class Genericsforajio
{
	public Genericsforajio(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	GenericKeywordsWithPage ajiokeywords = new GenericKeywordsWithPage("Genericsforajio");
	
	@FindBy(xpath="//span[@id='loginAjio']")
	WebElement SigninBtn;
	public void ClickonSignin()
	{
		ajiokeywords.click(SigninBtn);
	}
	
	@FindBy(xpath="//input[@name='username']")
	WebElement NumberBox;
	public void EnterNumber(String Enum)
	{
		ajiokeywords.enterData(NumberBox, Enum);	
	}
	
	@FindBy(xpath="//input[@class='login-btn']")
	WebElement Continuebtn;
	public void ClickonContinue()
	{
		ajiokeywords.click(Continuebtn);
	}
	
	@FindBy(xpath="//input[@name='otp']")
	WebElement OtpBox;
	public void EnterOTP(String otp) throws Throwable
	{
		ajiokeywords.enterData(OtpBox, otp);
		Thread.sleep(10000);
	}
	
	@FindBy(xpath="//input[@class='login-form-inputs login-btn']")
	WebElement Startbtn;
	public void ClickonStartshop() throws Throwable
	{
		ajiokeywords.click(Startbtn);
		Thread.sleep(5000);
	}
	
	@FindBy(xpath="//a[@href='/shop/men']")
	WebElement MensBtn;
	public void MousehoverMens() throws Throwable
	{
		ajiokeywords.movetoElement(MensBtn);
		Thread.sleep(3000);
	}
	
	@FindBy(xpath="(//a[@data-test='navigation-list'])[1]")
	WebElement Categorieslink;
	public void ClickonCategories() throws Throwable
	{
		ajiokeywords.click(Categorieslink);
		Thread.sleep(3000);
	}
	
	@FindBy(xpath="(//a[@aria-label='Puma and USPA min 45'])[2]")
	WebElement Pumalink;
	public void ClickonPuma() throws Throwable
	{
		ajiokeywords.click(Pumalink);
		Thread.sleep(5000);
	}
	
	@FindBy(xpath="//label[@for='Men']")
	WebElement Genderbox;
	public void ClickOnMens() throws Throwable
	{
		ajiokeywords.click(Genderbox);
		Thread.sleep(3000);
	}
	
	@FindBy(xpath="//label[@for='Men - Jeans']")
	WebElement Categorybox;
	public void ClickOnJeans() throws Throwable
	{
		ajiokeywords.click(Categorybox);
		Thread.sleep(3000);
	}
	
	@FindBy(xpath="(//div[@class='facet-head '])[1]")
	WebElement Pricebtn;
	public void ClickOnPrice() throws Throwable
	{
		ajiokeywords.click(Pricebtn);
		Thread.sleep(3000);
	}
	
	@FindBy(xpath="//label[@for='Rs.1501-2000']")
	WebElement Ratebox;
	public void ClickOnbelow500() throws Throwable
	{
		ajiokeywords.click(Ratebox);
		Thread.sleep(3000);
	}
	
	@FindBy(xpath="(//div[@class='facet-head '])[1]")
	WebElement Brandsbox;
	public void ClickOnBrands() throws Throwable
	{
		ajiokeywords.click(Brandsbox);
		Thread.sleep(3000);
	}
	
	@FindBy(xpath="//label[@for='U.S. Polo Assn.']")
	WebElement BrandPumabox;
	public void ClickOnPumaBox() throws Throwable
	{
		ajiokeywords.click(BrandPumabox);
		Thread.sleep(3000);
	}
	
	@FindBy(xpath="(//div[@class='facet-head '])[1]")
	WebElement Ocassionbox;
	public void ClickOnOcassion() throws Throwable
	{
		ajiokeywords.click(Ocassionbox);
		Thread.sleep(3000);
	}
	
	@FindBy(xpath="//label[@for='Casual']")
	WebElement Casualbox;
	public void ClickOnCasuals() throws Throwable
	{
		ajiokeywords.click(Casualbox);
		Thread.sleep(3000);
	}
	
	@FindBy(xpath="(//div[@class='facet-head '])[1]")
	WebElement Discountbox;
	public void ClickOnDiscount() throws Throwable
	{
		ajiokeywords.click(Discountbox);
		Thread.sleep(3000);
	}
	
	@FindBy(xpath="//label[@for='41-50%']")
	WebElement percentbox;
	public void ClickOnPercentage() throws Throwable
	{
		ajiokeywords.click(percentbox);
		Thread.sleep(3000);
	}
	
	@FindBy(xpath="(//div[@class='facet-head '])[1]")
	WebElement Colourbox;
	public void ClickOnColour() throws Throwable
	{
		ajiokeywords.click(Colourbox);
		Thread.sleep(3000);
	}
	
	@FindBy(xpath="//label[@for='Blue']")
	WebElement Bluebox;
	public void ClickOnBlue() throws Throwable
	{
		ajiokeywords.click(Bluebox);
		Thread.sleep(3000);
	}
	
	@FindBy(xpath="(//div[@class='facet-head '])[1]")
	WebElement Sizebox;
	public void ClickOnSize() throws Throwable
	{
		ajiokeywords.click(Sizebox);
		Thread.sleep(3000);
	}
	
	@FindBy(xpath="//label[@for='36']")
	WebElement Largebox;
	public void ClickOn36() throws Throwable
	{
		ajiokeywords.click(Largebox);
		Thread.sleep(3000);
	}
	
	@FindBy(xpath="(//div[@class='facet-head '])[1]")
	WebElement Ratingbox;
	public void ClickOnRatings() throws Throwable  
	{
		ajiokeywords.click(Ratingbox);
		Thread.sleep(3000);
	}
	
	@FindBy(xpath="//input[@id='1 star & above']")
	WebElement starbox;
	public void ClickOn4star() throws Throwable
	{
		ajiokeywords.click(starbox);
		Thread.sleep(3000);
	}
	
	@FindBy(xpath="(//img[@class='rilrtl-lazy-img  rilrtl-lazy-img-loaded'])[1]")
	WebElement TrouserLink;
	public void ClickonTrouser() throws Throwable
	{
		ajiokeywords.click(TrouserLink);
		Thread.sleep(3000);
	}
	
	public void SwitchtoChild()
	{
		ajiokeywords.ChildWindowHandles();
	}
	
	@FindBy(xpath="(//div[@class='circle size-variant-item size-instock '])[4]")
	WebElement Selectsize;
	public void Clickonbox()
	{
		ajiokeywords.click(Selectsize);
	}
			
	@FindBy(xpath="//div[@class='btn-gold']")
	WebElement Addtobagbtn;
	public void ClickonAdd() throws Throwable
	{
		ajiokeywords.click(Addtobagbtn);
		Thread.sleep(5000);
	}
	
	public void SwitchtoParent()
	{
		ajiokeywords.ParentWindowHandles();
	}
	
	@FindBy(xpath="//a[@href='/cart']")
	WebElement CartBtn;
	public void ClickonCart()
	{
		//ajiokeywords.ParentWindowHandles();
		ajiokeywords.click(CartBtn);
	}
	
	@FindBy(xpath="//span[@aria-label='Qty']")
	WebElement QtyBtn;
	public void clickonQty()
	{
		ajiokeywords.click(QtyBtn);
	}
	
	@FindBy(xpath="(//div[@class='circle size-variant-item size-instock '])[3]")
	WebElement SizeBtn;
	public void clickonSizeUpdate()
	{
		ajiokeywords.click(SizeBtn);
	}
	
	@FindBy(xpath="//button[@class='increment button']")
	WebElement Incrementbtn;
	public void clickonAlert()
	{
		ajiokeywords.alertclick(Incrementbtn);
	}
	
	@FindBy(xpath="//button[@class='decrement button']")
	WebElement Decrementbtn;
	public void clickonDecrement() throws Throwable
	{
		ajiokeywords.alertclick(Decrementbtn);
		Thread.sleep(2000);
		ajiokeywords.alertclick(Decrementbtn);
		Thread.sleep(2000);
	}
	
	@FindBy(xpath="//button[@class='full-width-button']")
	WebElement updatebtn;
	public void ClickonUpdate()
	{
		ajiokeywords.click(updatebtn);
	}
	
	@FindBy(xpath="//button[@class='rilrtl-button button shipping-button']")
	WebElement Shippingbtn;
	public void ClickonShiping()
	{
		ajiokeywords.click(Shippingbtn);
	}
	
	@FindBy(xpath="//div[@class='change-address-section']")
	WebElement Adressbtn;
	public void ClickonAddress()
	{
		ajiokeywords.click(Adressbtn);
	}
	
	@FindBy(xpath="//input[@name='postalCode']")
	WebElement Pincodebox;
	public void EnterPincode(String pinvalue)
	{
		ajiokeywords.enterData(Pincodebox, pinvalue);
	}
	
	@FindBy(xpath="//textarea[@name='line2']")
	WebElement Localitybox;
	public void EnterLocality(String localvalue)
	{
		ajiokeywords.enterData(Localitybox, localvalue);
	}
	
	@FindBy(xpath="//input[@name='line1']")
	WebElement Flatbox;
	public void EnterFlatnum(String flatvalue)
	{
		ajiokeywords.enterData(Flatbox, flatvalue);
	}
	
	@FindBy(xpath="//input[@name='district']")
	WebElement Districtbox;
	public void EnterDistrict(String Distvalue)
	{
		ajiokeywords.enterData(Districtbox, Distvalue);
	}
	
	@FindBy(xpath="//input[@name='state']")
	WebElement Statebox;
	public void EnterState(String statevalue)
	{
		ajiokeywords.enterData(Statebox, statevalue);
	}
	
	@FindBy(xpath="//button[@class='rilrtl-button button mobaddaddr-save']")
	WebElement Savebtn;
	public void ClickonSave()
	{
		ajiokeywords.click(Savebtn);
	}
	
	@FindBy(xpath="//div[@class='change-address-section']")
	WebElement changebtn;
	public void ClickonChangeAddress()
	{
		ajiokeywords.click(changebtn);
	}
	
	@FindBy(xpath="//div[@class='add-address']")
	WebElement Addadressbtn;
	public void ClickonAddAddress()
	{
		ajiokeywords.click(Addadressbtn);
	}
	
	@FindBy(xpath="//input[@name='phone']")
	WebElement clearbox;
	public void ClickonPhonenum()
	{
		ajiokeywords.clearAndTabout(clearbox);
	}
	
	@FindBy(xpath="//input[@name='phone']")
	WebElement Addnum;
	public void EnterPhonenum(String phnum)
	{
		ajiokeywords.enterData(Addnum, phnum);
	}
	
	@FindBy(xpath="//input[@name='postalCode']")
	WebElement UpdatePincodebox;
	public void EnterUpdatePincode(String Updatepinvalue)
	{
		ajiokeywords.enterData(UpdatePincodebox, Updatepinvalue);
	}
	
	@FindBy(xpath="//textarea[@name='line2']")
	WebElement UpdateLocalitybox;
	public void EnterUpdateLocalbox(String Updatelocalvalue)
	{
		ajiokeywords.enterData(UpdateLocalitybox, Updatelocalvalue);
	}
	
	@FindBy(xpath="//input[@name='line1']")
	WebElement UpdateFlatbox;
	public void EnterUpdateFlatbox(String Updateflatvalue)
	{
		ajiokeywords.enterData(UpdateFlatbox, Updateflatvalue);
	}
	
	@FindBy(xpath="//input[@name='defaultAddress']")
	WebElement defaultbtn;
	public void Clickondefaultbtn()
	{
		ajiokeywords.click(defaultbtn);
	}
	@FindBy(xpath="//span[@class='mobaddr-editc']")
	WebElement editbtn;
	public void ClickondeEdit()
	{
		ajiokeywords.click(editbtn);
	}
	
	@FindBy(xpath="//input[@name='postalCode']")
	WebElement Clrandupdbox;
	public void ClickclrupdPincode()
	{
		ajiokeywords.clearAndTabout(Clrandupdbox);
	}
	
	@FindBy(xpath="//input[@name='postalCode']")
	WebElement Addpin;
	public void EnterPinvalue(String addpinvalue)
	{
		ajiokeywords.enterData(Addpin, addpinvalue);
	}
	
	@FindBy(xpath="//input[@name='landmark']")
	WebElement landmarkbox;
	public void EnterLandamrk(String Landmarkvalue)
	{
		ajiokeywords.enterData(landmarkbox, Landmarkvalue);
	}
	
	@FindBy(xpath="//input[@aria-label='work']")
	WebElement typebtn;
	public void Clickondeworkbtn()
	{
		ajiokeywords.click(typebtn);
	}
	
	//input[@aria-label='work']
	//input[@name='landmark']
	//span[@class='mobaddr-editc']
	//div[@class='ic-cart ']clickocart
	//span[@aria-label='Qty']clickonquantity
	//button[@class='increment button']clickonplus Before this use alertcode
	//button[@class='full-width-button']clickonupdatebtn
	//button[@class='rilrtl-button button shipping-button']clickonshippingbtn
	//div[@class='change-address-section']clickonaddaddress
	//input[@name='postalCode'] enterpincode
	//input[@name='line2'] enterlocalityname
	//textarea[@name='line1']enterFlatnum
	//input[@name='district']enterdistrict
	//input[@name='state'] enterstate
	//button[@class='rilrtl-button button mobaddaddr-save'] clickonsave
	//div[@class='change-address-section'] click on change address
	//div[@class='add-address'] click on add new address
	//input[@name='phone'] clear phone inputbox
	//input[@name='defaultAddress'] clickon defaultcheckbox
}