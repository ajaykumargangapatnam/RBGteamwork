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
	
	@Test(priority=9,dataProvider="setData0")
	public void ClickonRegisterOAuthClient(Hashtable<String, String>h1) throws Throwable
	{
		extentLoggerECP = parentExtentLogger.createNode("user can click Again on RegisterOAuthClient ");
		
		rc = new OrangeHRM_RegisterClientPage(GenericKeywordsWithPage.driver);
		
		rc.enter_Username(h1.get("userName"));
		passLog("username entered");
		rc.enter_Password(h1.get("password"));
		passLog("password entered");
		rc.click_Login();
		passLog("clicked on login");
		rc.Clickon_Admin();
		passLog("clicked on admin");
		rc.Clickon_Configuration();
		passLog("clicked on configuration");
		Thread.sleep(3000);
		rc.RegisterOAuthClient();
		passLog("clicked on registerclient");
		rc.OAuthAddbtn();
		passLog("clicked on add");
		rc.Enter_OAuthInputName(h1.get("OAuthName"));
		passLog("Oauthname entered");
		rc.Enter_RedirectURIName(h1.get("RequiredURI"));
		passLog("requiredURI entered");
		rc.OAuthSavebtn();
		passLog("clicked on OAutsave");
		Thread.sleep(15000);
		rc.Clickon_Configuration();
		passLog("clicked on configuration");
		Thread.sleep(3000);
		rc.RegisterOAuthClient();
		passLog("clicked on registerclient");
		Thread.sleep(3000);
		rc.Clickon_Checkbox();
		passLog("checkbox clicked");
		Thread.sleep(3000);
		rc.Clickon_EditBtn();
		passLog("editbtn clicked");
		Thread.sleep(3000);
		rc.UpdateEnter_OAuthInputName(h1.get("UpdateOAuthName"));
		passLog("updateOauthname entered");
		rc.UpdateEnter_RedirectURIName(h1.get("UpdateReqiuredURI"));
		passLog("UpdateReqiuredURI entered");
		Thread.sleep(10000);
	}

}
