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

import OrangeHRM_ConfigPage.OrangeHRM_SocialMediaPage;



public class OrangeHRM_SocialMediaTest extends BaseTest
{
	OrangeHRM_SocialMediaPage sp;
	PropertySingleton _instance = null;
	SoftAssert s1 = new SoftAssert();
	
	public OrangeHRM_SocialMediaTest()
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
	
	@Test(priority=0 , dataProvider="setData0")
	public void ClickonSspialMediaAuthentication(Hashtable<String, String>h1) throws Throwable
	{
		extentLoggerECP = parentExtentLogger.createNode("user can click on SspialMediaAuthentication ");
		
		sp = new OrangeHRM_SocialMediaPage(GenericKeywordsWithPage.driver);
		
		sp.enter_Username(h1.get("userName"));
		sp.enter_Password(h1.get("password"));
		sp.click_Login();
		sp.Clickon_Admin();
		sp.Clickon_Configuration();
		Thread.sleep(3000);
		sp.SocialMediaAuthentication();
		sp.SocialAddBtn();
		sp.NameInputBox(h1.get("SspialName"));
		sp.ProviderInputBox(h1.get("ProvideURL"));
		sp.ClientInputBox(h1.get("ClientID"));
		sp.ClientsecretInputBox(h1.get("ClientSecret"));
		sp.Clickon_SocialSave();
		Thread.sleep(15000);
	}
	
	@Test(priority=1 , dataProvider="setData0")
	public void ClickAgainOnSspialMediaAuthentication(Hashtable<String, String>h1) throws Throwable
	{
		extentLoggerECP = parentExtentLogger.createNode("user can click Again on SspialMediaAuthentication ");
		
		sp = new OrangeHRM_SocialMediaPage(GenericKeywordsWithPage.driver);
		
		sp.enter_Username(h1.get("userName"));
		sp.enter_Password(h1.get("password"));
		sp.click_Login();
		sp.Clickon_Admin();
		sp.Clickon_Configuration();
		Thread.sleep(3000);
		sp.SocialMediaAuthentication();
		sp.Clickon_EditBtn();
		Thread.sleep(3000);
		sp.EditNameInputBox(h1.get("UpdateSspialName"));
		sp.EditProviderInputBox(h1.get("UpdateProvideURL"));
		sp.EditClientInputBox(h1.get("UpdateClientID"));
		sp.EditClientsecretInputBox(h1.get("UpdateClientSecret"));
		sp.Clickon_SocialSave();
		Thread.sleep(15000);
	}

}
