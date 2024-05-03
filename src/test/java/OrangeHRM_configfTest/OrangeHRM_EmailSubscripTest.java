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

import OrangeHRM_ConfigPage.OrangeHRM_EmailSubscripPage;
import practicepage.OrangeHRM_LoginPage;

public class OrangeHRM_EmailSubscripTest extends BaseTest
{
	OrangeHRM_EmailSubscripPage es;
	PropertySingleton _instance = null;
	SoftAssert s_Assert = new SoftAssert();
	
	public OrangeHRM_EmailSubscripTest()
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
	public void ClickonEmialSubscription(Hashtable<String, String>h1) throws Throwable
	{
		extentLoggerECP = parentExtentLogger.createNode("user can click on Email Configuration");
		
		es = new OrangeHRM_EmailSubscripPage(GenericKeywordsWithPage.driver);
		
		es.enter_Username(h1.get("userName"));
		es.enter_Password(h1.get("password"));
		es.click_Login();
		es.Clickon_Admin();
		es.Clickon_Configuration();
		Thread.sleep(3000);
		es.Clickon_EmailSubscription();
		Thread.sleep(3000);
		es.Clickon_Applications();
		Thread.sleep(3000);
		es.Clickon_Approvals();
		Thread.sleep(3000);
		es.Clickon_Assignments();
		Thread.sleep(3000);
		es.Clickon_Cancellations();
		Thread.sleep(3000);
		es.Clickon_Rejections();
		Thread.sleep(10000);
		
	}

}
