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

import OrangeHRM_ConfigPage.OrangeHRM_RegisterClientPage;



public class OrangeHRM_RegisterClientTest extends BaseTest
{
	OrangeHRM_RegisterClientPage rc;
	PropertySingleton _instance = null;
	SoftAssert s1 = new SoftAssert();
	
	public OrangeHRM_RegisterClientTest()
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
	public void ClickonRegisterOAuthClient(Hashtable<String, String>h1) throws Throwable
	{
		extentLoggerECP = parentExtentLogger.createNode("user can click Again on RegisterOAuthClient ");
		
		rc = new OrangeHRM_RegisterClientPage(GenericKeywordsWithPage.driver);
		
		rc.enter_Username(h1.get("userName"));
		rc.enter_Password(h1.get("password"));
		rc.click_Login();
		rc.Clickon_Admin();
		rc.Clickon_Configuration();
		Thread.sleep(3000);
		rc.RegisterOAuthClient();
		rc.OAuthAddbtn();
		rc.Enter_OAuthInputName(h1.get("OAuthName"));
		rc.Enter_RedirectURIName(h1.get("RequiredURI"));
		rc.OAuthSavebtn();
		Thread.sleep(15000);
		rc.Clickon_Configuration();
		Thread.sleep(3000);
		rc.RegisterOAuthClient();
		Thread.sleep(3000);
		rc.Clickon_Checkbox();
		Thread.sleep(3000);
		rc.Clickon_EditBtn();
		Thread.sleep(3000);
		rc.UpdateEnter_OAuthInputName(h1.get("OAuthName"));
		rc.UpdateEnter_RedirectURIName(h1.get("OAuthName"));
	}

}
