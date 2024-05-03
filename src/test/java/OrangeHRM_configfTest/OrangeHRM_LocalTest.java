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

import OrangeHRM_ConfigPage.OrangeHRM_LocalPage;

public class OrangeHRM_LocalTest extends BaseTest
{
	OrangeHRM_LocalPage lp;
	PropertySingleton _instance = null;
	SoftAssert s1 = new SoftAssert();
	
	public OrangeHRM_LocalTest()
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
	public void ClickonLocalization(Hashtable<String, String>h1) throws Throwable
	{
		extentLoggerECP = parentExtentLogger.createNode("user can click on Llpalization");
		
		lp = new OrangeHRM_LocalPage(GenericKeywordsWithPage.driver);
		
		lp.enter_Username(h1.get("userName"));
		lp.enter_Password(h1.get("password"));
		lp.click_Login();
		lp.Clickon_Admin();
		lp.Clickon_Configuration();
		Thread.sleep(3000);
		lp.Clickon_Localization();
		Thread.sleep(3000);
		lp.Enter_CountryLanguage();
		Thread.sleep(3000);
		lp.Enter_DOY();
		Thread.sleep(3000);
		lp.Clickon_LocalSave();
		Thread.sleep(5000);
	}
}
