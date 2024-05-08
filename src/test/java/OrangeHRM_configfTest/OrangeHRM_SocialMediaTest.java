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
	
	@Test(priority=10 , dataProvider="setData0")
	public void ClickonSspialMediaAuthentication(Hashtable<String, String>h1) throws Throwable
	{
		extentLoggerECP = parentExtentLogger.createNode("user can click on SocialMediaAuthentication ");
		
		sp = new OrangeHRM_SocialMediaPage(GenericKeywordsWithPage.driver);
		
		sp.enter_Username(h1.get("userName"));
		passLog("username entered");
		sp.enter_Password(h1.get("password"));
		passLog("password entered");
		sp.click_Login();
		passLog("clicked on login");
		sp.Clickon_Admin();
		passLog("clicked on Admin");
		sp.Clickon_Configuration();
		passLog("clicked on configuration");
		Thread.sleep(3000);
		sp.SocialMediaAuthentication();
		passLog("clicke don social media");
		sp.SocialAddBtn();
		passLog("clicked on addbtn");
		sp.NameInputBox(h1.get("SocialName"));
		passLog("socialname entered");
		sp.ProviderInputBox(h1.get("ProvideURL"));
		passLog("provideurl entered");
		sp.ClientInputBox(h1.get("ClientID"));
		passLog("clientid entered");
		sp.ClientsecretInputBox(h1.get("ClientSecret"));
		passLog("clientsecret entered");
		sp.Clickon_SocialSave();
		passLog("clicked on socialsave");
		Thread.sleep(15000);
	}
	
	@Test(priority=11 , dataProvider="setData0")
	public void ClickAgainOnSspialMediaAuthentication(Hashtable<String, String>h1) throws Throwable
	{
		extentLoggerECP = parentExtentLogger.createNode("user can click Again on SocialMediaAuthentication ");
		
		sp = new OrangeHRM_SocialMediaPage(GenericKeywordsWithPage.driver);
		
		sp.enter_Username(h1.get("userName"));
		passLog("username entered");
		sp.enter_Password(h1.get("password"));
		passLog("password entered");
		sp.click_Login();
		passLog("clicked on login");
		sp.Clickon_Admin();
		passLog("clicked on Admin");
		sp.Clickon_Configuration();
		passLog("clicked on configuration");
		Thread.sleep(3000);
		sp.SocialMediaAuthentication();
		passLog("clicke don social media");
		sp.SocialAddBtn();
		passLog("clicked on addbtn");
		Thread.sleep(3000);
		sp.EditNameInputBox(h1.get("UpdateSocialName"));
		Thread.sleep(3000);
		passLog("updatesocialname entered");
		sp.EditProviderInputBox(h1.get("UpdateProvideURL"));
		Thread.sleep(3000);
		passLog("updateprovideurl entered");
		sp.EditClientInputBox(h1.get("UpdateClientID"));
		Thread.sleep(3000);
		passLog("updateid entered");
		sp.EditClientsecretInputBox(h1.get("UpdateClientSecret"));
		Thread.sleep(3000);
		passLog("updatesecret entered");
		sp.Clickon_SocialSave();
		passLog("clicked on socialsave");
		Thread.sleep(15000);
	}

}
