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

import OrangeHRM_ConfigPage.OrangeHRM_ModulePage;
import practicepage.OrangeHRM_LoginPage;

public class OrangeHRM_ModuleTest extends BaseTest
{
	OrangeHRM_ModulePage mp;
	PropertySingleton _instance = null;
	SoftAssert s1 = new SoftAssert();
	
	public OrangeHRM_ModuleTest()
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
	public void ClickonModules(Hashtable<String, String>h1) throws Throwable
	{
		extentLoggerECP = parentExtentLogger.createNode("user can click on Modules ");
		
		mp = new OrangeHRM_ModulePage(GenericKeywordsWithPage.driver);
		
		mp.enter_Username(h1.get("userName"));
		mp.enter_Password(h1.get("password"));
		mp.click_Login();
		mp.Clickon_Admin();
		mp.Clickon_Configuration();
		Thread.sleep(3000);
		mp.Clickon_Modules();
		Thread.sleep(3000);
		mp.Clickon_LeaveModule();
		Thread.sleep(3000);
		mp.Clickon_TimeModule();
		Thread.sleep(3000);
		mp.Clickon_RecruitmentModule();
		Thread.sleep(3000);
		mp.Clickon_PerformanceModule();
		Thread.sleep(3000);
		mp.Clickon_DirectoryModule();
		Thread.sleep(3000);
		mp.Clickon_maintananceModule();
		Thread.sleep(3000);
		mp.Clickon_MobileModule();
		Thread.sleep(3000);
		mp.Clickon_ClaimModule();
		Thread.sleep(3000);
		mp.Clickon_ModuleSave();
		Thread.sleep(5000);
	}

}
