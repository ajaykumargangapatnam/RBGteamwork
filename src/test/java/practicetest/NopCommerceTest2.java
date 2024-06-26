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

import Pagepackage.NopCommercePage2;



public class NopCommerceTest2 extends BaseTest
{

	NopCommercePage2 s1;
	PropertySingleton _instance=null;
	SoftAssert s_assert =  new  SoftAssert();
	public NopCommerceTest2() throws Throwable
	{
		_instance = PropertySingleton.getInstance();
		s1= new NopCommercePage2(GenericKeywordsWithPage.driver);
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
		s1=new NopCommercePage2(GenericKeywordsWithPage.driver);
		s1.registers();
		passLog("registers");
		s1.genderSelected();
		passLog("genderSelected");
		s1.firstName(h1.get("firstName"));
		passLog("firstName");
		s1.lastNames(h1.get("lastName"));
		passLog("lastNames");
		s1.datess(h1.get("dates"));
		passLog("datess");
		s1.monthss(h1.get("month"));
		passLog("monthss");
		s1.yearss(h1.get("yearr"));
		passLog("yearss");
		s1.mailss(h1.get("mails"));
		passLog("mailss");
		s1.company(h1.get("CompName"));
		passLog("company");
		s1.passWords(h1.get("passwords"));
		passLog("passWords");
		s1.confirmPassword(h1.get("cPassword"));
		passLog("confirmPassword");
		s1.registerButton();
		passLog("confirmPassword");

		s1.continuebutton();
		passLog("continuebutton");

		s1.computers();
		passLog("continuebutton");

		s1.notebooks();
		passLog("notebooks");

		s1.cpuCheckBox();
		passLog("cpuCheckBox");
		s1.memorySelection();
		passLog("memorySelection");
		s1.sortBy();
		passLog("sortBy");

		s1.pagesSize();
		Thread.sleep(12000);
		passLog("pagesSize");
		s1.addToCart2();
		passLog("addToCart2");
		s1.ShoppingCarts();
		passLog("ShoppingCarts");
	
		
	}
	@DataProvider
	public Object[][] setData1()
	{
		Xls_Reader xls=new Xls_Reader(System.getProperty("user.dir")+"\\TestData\\testdata.xlsx");
		return ReadData.getData("nopCommerce2","nop_Commerce_Tests" , xls);
	}
}


