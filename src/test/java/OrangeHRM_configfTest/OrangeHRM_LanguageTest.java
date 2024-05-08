package OrangeHRM_configfTest;

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

import OrangeHRM_ConfigPage.OrangeHRM_LanguagePage;

public class OrangeHRM_LanguageTest extends BaseTest
{
	OrangeHRM_LanguagePage lp;
	PropertySingleton _instance = null;
	SoftAssert s_Assert = new SoftAssert();
	
	public OrangeHRM_LanguageTest()
	{
		_instance = PropertySingleton.getInstance();
	}
	
	@BeforeClass
	public void startReport()
	{
		beforeClassForChild(this);
	}
	
	@DataProvider
	public Object[][] setData0() 
	{
		Xls_Reader xls = new Xls_Reader(System.getProperty("user.dir") + "/TestData/testdata.xlsx");
		
		return ReadData.getData("OrangeHRM_AllTestcases", "OrangeHRM_ConfigTestCases", xls);
	}
	
	@Test(priority=7,dataProvider="setData0")
	public void ClickonLanguagePackages(Hashtable<String, String>h1) throws Throwable
	{
		extentLoggerECP = parentExtentLogger.createNode("user can click on LanguagePackages ");
		
		lp = new OrangeHRM_LanguagePage(GenericKeywordsWithPage.driver);
		
		lp.enter_Username(h1.get("userName"));
		passLog("username enterded");
		lp.enter_Password(h1.get("password"));
		passLog("password entered");
		lp.click_Login();
		passLog("clicked on login");
		lp.Clickon_Admin();
		passLog("clicked on admin");
		lp.Clickon_Configuration();
		passLog("clicked on configuration");
		Thread.sleep(3000);
		lp.Clickon_LanguagePackages();
		passLog("clicked on language");
		Thread.sleep(3000);
		lp.Clickon_LPAddBtn();
		passLog("clicked on LDAPAdd");
		Thread.sleep(3000);
		lp.Enter_language();
		passLog("language entered");
		Thread.sleep(3000);
		lp.Clickon_LangSaveBox();
		passLog("clickon lang save");
		Thread.sleep(10000);
	}

}
