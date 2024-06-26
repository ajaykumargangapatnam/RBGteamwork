package practicetest;

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

import Pagepackage.NopCommercePage1;





public class NopCommerceTest1 extends BaseTest
{
	NopCommercePage1 orl;
	PropertySingleton _instance=null;
	SoftAssert s_assert =  new  SoftAssert();
	public NopCommerceTest1() throws Throwable
	{
		_instance = PropertySingleton.getInstance();
		orl= new NopCommercePage1(GenericKeywordsWithPage.driver);
	}
	@BeforeClass
	public void startReport()
	{
		beforeClassForChild(this);
	}
	@Test(dataProvider="setData1")
	public void loginWithValidCredentials(Hashtable<String, String> h1) throws Throwable 
	{
		extentLoggerECP = parentExtentLogger.createNode("login With Valid Credentials");
		s_assert = new SoftAssert();
		orl=new NopCommercePage1(GenericKeywordsWithPage.driver);
		orl.registers();

		orl.genderSelected();
		passLog("genderSelected");
		orl.enterfirstName(h1.get("firstname"));
		passLog("enterfirstName");
		orl.lastNames(h1.get("lastName"));
		passLog("lastNames");
		orl.datess(h1.get("dates"));
		passLog("datess");
		orl.monthss(h1.get("month"));
		passLog("monthss");
		orl.yearss(h1.get("yearr"));
		passLog("yearss");
		orl.mailss(h1.get("mails"));
		passLog("mailss");
		orl.company(h1.get("CompName"));
		passLog("company");
		orl.enterpasswords("sandeep");
		passLog("enterpasswords");
		orl.confirmPassword("sandeep");
		passLog("confirmPassword");
		orl.registerButton();
		passLog("registerButton");

		orl.continuebutton();
		passLog("continuebutton");
		orl.computers();
		passLog("computers");
		orl.addToCart();
		passLog("addToCart");
		orl.ram();
		passLog("ram");
		orl.hDD();
		passLog("hDD");
		orl.os();
		passLog("os");
		orl.software();
		passLog("software");
		orl.addToCart2();
		passLog("addToCart2");
		orl.addedToCart();
		passLog("addedToCart");
		orl.editables();
		passLog("editables");
		orl.ramEdit();
		passLog("ramEdit");
		orl.osEditable();
		passLog("osEditable");
		orl.softwareEditable();
		passLog("softwareEditable");
	}
	@DataProvider
	public Object[][] setData1()
	{
		Xls_Reader xls=new Xls_Reader(System.getProperty("user.dir")+"\\TestData\\testdata.xlsx");
		return ReadData.getData("nopCommerce","nop_Commerce_Tests" , xls);
	}

}

