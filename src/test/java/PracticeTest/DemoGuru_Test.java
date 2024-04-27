package PracticeTest;

import java.util.Hashtable;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.surveillance.Test.BaseTest;
import com.surveillance.utilitiy.GenericKeywordsWithPage;
import com.surveillance.utilitiy.PropertySingleton;
import com.surveillance.utilitiy.ReadData;
import com.surveillance.utilitiy.Xls_Reader;

import practicepage.DemoGuru_Loginpage;

public class DemoGuru_Test extends BaseTest 
{
	DemoGuru_Loginpage d1;
	PropertySingleton _instance = null;
	SoftAssert s_Assert = new SoftAssert();
	
	public  DemoGuru_Test()
	{
		_instance = PropertySingleton.getInstance(); 
	}
	
	@BeforeClass
	public void startReport()
	{
		beforeClassForChild(this);
	}
	
	@Test(dataProvider="setData")
	public void loginWithValidCredentials(Hashtable<String, String>h1) throws Throwable
	{
//		f1 = new DemoGuru_Loginpage(GenericKeywordsWithPage.driver);
//		f1.enterUsername("mngr476674");
//		f1.enterPAssword("UsyhymA");
//		f1.clickonLogin();
		
		extentLoggerECP = parentExtentLogger.createNode("login With Valid Credentials");
		s_Assert = new SoftAssert();
		d1 = new DemoGuru_Loginpage(GenericKeywordsWithPage.driver);
		d1.enterUsername(h1.get("userName"));
		passLog();
		d1.enterPAssword(h1.get("password"));
		passLog();
		d1.clickonLogin();
		passLog();
		
		
		Thread.sleep(3000);
		
		d1.click_NewCustomerName();
		passLog();
		//d1.click_Alert();            //*[@id="dismiss-button"]/div/svg
		d1.enterCustomerName(h1.get("customerName"));
		passLog();
		d1.clickonRdBtn();
		passLog();
		d1.enterDate(h1.get("DateOfBirth"));
		passLog();
		d1.enterAddress(h1.get("Address"));
		passLog();
		d1.enterCityName(h1.get("City"));
		passLog();
		d1.enterStateName(h1.get("State"));
		passLog();
		d1.enterPinNum(h1.get("Pin"));
		passLog();
		d1.enterMobileNum(h1.get("Mobile_Number"));
		passLog();
		d1.enterEmailId(h1.get("Email"));
		passLog();
		d1.enterEmailPassword(h1.get("Password"));
		passLog();
		d1.submitBtn_Click();
		passLog();
		s_Assert.assertAll();
		
	}


	@DataProvider
	public Object[][] setData()
	{
		Xls_Reader xls = new Xls_Reader( System.getProperty("user.dir")+"/TestData/testdata.xlsx");
		return ReadData.getData("Guru99Bank", "Guru99Bank_TESTCASES", xls);
		
	}
}
