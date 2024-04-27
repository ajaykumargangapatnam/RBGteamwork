package PracticeTest;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.surveillance.Test.BaseTest;
import com.surveillance.utilitiy.GenericKeywordsWithPage;
import com.surveillance.utilitiy.PropertySingleton;

import practicepage.Genericsforajio;

public class Ajio_Test extends BaseTest
{
	Genericsforajio gj1;
	PropertySingleton _instance = null;
	SoftAssert s_Assert = new SoftAssert();
	
	public Ajio_Test()
	{
		_instance = PropertySingleton.getInstance();
	}
	
	@BeforeClass
	public void Startclass()
	{
		beforeClassForChild(this);
	}
	
	@Test
	public void Loginwithvalidcredentials() throws Throwable 
	{
		extentLoggerECP = parentExtentLogger.createNode("login with validcredentials on Ajio");
		
		gj1= new Genericsforajio(GenericKeywordsWithPage.driver);
		
		gj1.ClickonSignin();
		
		gj1.EnterNumber("9100554129");
		
		gj1.ClickonContinue();
		
		Thread.sleep(10000);
		
		gj1.ClickonStartshop();
		Thread.sleep(3000);
		
		gj1.MousehoverMens();
		Thread.sleep(3000);
		gj1.ClickonCategories();
		Thread.sleep(3000);
		gj1.ClickonPuma();
		Thread.sleep(3000);
		gj1.ClickOnMens();
		Thread.sleep(3000);
		gj1.ClickOnJeans();
		Thread.sleep(3000);
		gj1.ClickOnPrice();
		Thread.sleep(3000);
		gj1.ClickOnbelow500();
		gj1.ClickOnBrands();
		gj1.ClickOnPumaBox();
		Thread.sleep(3000);
		gj1.ClickOnOcassion();
		Thread.sleep(3000);
		gj1.ClickOnCasuals();
		Thread.sleep(3000);
		gj1.ClickOnDiscount();
		Thread.sleep(3000);
		gj1.ClickOnPercentage();
		Thread.sleep(3000);
		gj1.ClickOnColour();
		Thread.sleep(3000);
		gj1.ClickOnBlue();
		Thread.sleep(3000);
		gj1.ClickOnSize();
		Thread.sleep(3000);
		gj1.ClickOn36();
		Thread.sleep(3000);
		gj1.ClickOnRatings();
		Thread.sleep(3000);
		gj1.ClickOn4star();
		Thread.sleep(3000);
		gj1.ClickonTrouser();
		Thread.sleep(3000);
		gj1.SwitchtoChild();
		Thread.sleep(3000);
		gj1.Clickonbox();
		Thread.sleep(3000);
		gj1.ClickonAdd();
		Thread.sleep(3000);
		gj1.ClickonCart();
		Thread.sleep(3000);
		gj1.clickonQty();
		Thread.sleep(3000);
		gj1.clickonSizeUpdate();
		Thread.sleep(3000);
		gj1.clickonAlert();
		Thread.sleep(3000);
		gj1.clickonDecrement();
		Thread.sleep(3000);
		gj1.ClickonUpdate();
		Thread.sleep(3000);
		gj1.ClickonShiping();
		Thread.sleep(3000);
		gj1.ClickonAddress();
		Thread.sleep(3000);
		gj1.EnterPincode("500001");
		Thread.sleep(3000);
		gj1.EnterLocality("kukatpally");
		Thread.sleep(3000);
		gj1.EnterFlatnum("302");
		Thread.sleep(3000);
		gj1.ClickonSave();
		Thread.sleep(3000);
		gj1.ClickonChangeAddress();
		Thread.sleep(3000);
		gj1.ClickonAddAddress();
		Thread.sleep(3000);
		gj1.ClickonPhonenum();
		Thread.sleep(3000);
		gj1.EnterPhonenum("9100554129");
		Thread.sleep(3000);
		gj1.EnterUpdatePincode("500002");
		Thread.sleep(3000);
		gj1.EnterUpdateLocalbox("KPHB");
		Thread.sleep(3000);
		gj1.EnterUpdateFlatbox("023");
		Thread.sleep(3000);
		gj1.Clickondefaultbtn();
		Thread.sleep(3000);
		gj1.ClickonSave();
		Thread.sleep(3000);
		gj1.SwitchtoParent();
		Thread.sleep(3000);
		gj1.ClickonCart();
		Thread.sleep(3000);
		gj1.ClickonShiping();
		Thread.sleep(3000);
		gj1.ClickonChangeAddress();
		Thread.sleep(3000);
		gj1.ClickondeEdit();
		Thread.sleep(3000);
		gj1.ClickclrupdPincode();
		Thread.sleep(3000);
		gj1.EnterPinvalue("500003");
		Thread.sleep(3000);
		gj1.EnterLandamrk("oppositemetro");
		Thread.sleep(3000);
		gj1.Clickondeworkbtn();
		Thread.sleep(3000);
		gj1.ClickonSave();
		Thread.sleep(3000);
	}

}
