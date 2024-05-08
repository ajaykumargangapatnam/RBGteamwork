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
	
	@Test(priority=8,dataProvider="setData0")
	public void ClickonModules(Hashtable<String, String>h1) throws Throwable
	{
		extentLoggerECP = parentExtentLogger.createNode("user can click on Modules ");
		
		mp = new OrangeHRM_ModulePage(GenericKeywordsWithPage.driver);
		
		mp.enter_Username(h1.get("userName"));
		passLog("username entered");
		mp.enter_Password(h1.get("password"));
		passLog("password entered");
		mp.click_Login();
		passLog("clicked on login");
		mp.Clickon_Admin();
		passLog("clicked on admin");
		mp.Clickon_Configuration();
		passLog("clicked on configuration");
		Thread.sleep(3000);
		mp.Clickon_Modules();
		passLog("clicked on modules");
		Thread.sleep(3000);
		mp.Clickon_LeaveModule();
		passLog("clicked on leave modules");
		Thread.sleep(3000);
		mp.Clickon_TimeModule();
		passLog("clicked on time module");
		Thread.sleep(3000);
		mp.Clickon_RecruitmentModule();
		passLog("clicked on recruitment module");
		Thread.sleep(3000);
		mp.Clickon_PerformanceModule();
		passLog("clicked on performance moodule");
		Thread.sleep(3000);
		mp.Clickon_DirectoryModule();
		passLog("clicked on directory module");
		Thread.sleep(3000);
		mp.Clickon_maintananceModule();
		passLog("clicked on maintainance module");
		Thread.sleep(3000);
		mp.Clickon_MobileModule();
		passLog("clicked omn mobile module");
		Thread.sleep(3000);
		mp.Clickon_ClaimModule();
		passLog("clicked on clain module");
		Thread.sleep(3000);
		mp.Clickon_ModuleSave();
		passLog("clicked on module save");
		Thread.sleep(5000);
	}

}
