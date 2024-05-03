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
	
	@Test(dataProvider="setData0")
	public void ClickonLanguagePackages(Hashtable<String, String>h1) throws Throwable
	{
		extentLoggerECP = parentExtentLogger.createNode("user can click on LanguagePackages ");
		
		lp = new OrangeHRM_LanguagePage(GenericKeywordsWithPage.driver);
		
		lp.enter_Username(h1.get("userName"));
		lp.enter_Password(h1.get("password"));
		lp.click_Login();
		lp.Clickon_Admin();
		lp.Clickon_Configuration();
		Thread.sleep(3000);
		lp.Clickon_LanguagePackages();
		Thread.sleep(3000);
		lp.Clickon_LPAddBtn();
		Thread.sleep(3000);
		lp.Enter_language();
		Thread.sleep(3000);
		lp.Clickon_LangSaveBox();
		Thread.sleep(10000);
	}

}
