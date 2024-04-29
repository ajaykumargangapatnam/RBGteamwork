package PracticeTest;

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

import practicepage.OrangeHRM_Login;

public class GenericsOrangeHRM_Test extends BaseTest
{
	OrangeHRM_Login o1;
	PropertySingleton _instance = null;
	SoftAssert s1 = new SoftAssert();
	
	public GenericsOrangeHRM_Test()
	{
		_instance = PropertySingleton.getInstance();
	}
	
	@BeforeClass
	public void startReport()
	{
		beforeClassForChild(this);
	}
	
//	@Test(priority=0 , dataProvider = "setData0")
//	public void LoginwithvalidCredentials(Hashtable<String, String>h1) throws Throwable
//	{
//		extentLoggerECP =parentExtentLogger.createNode("User can login with valid credentials");
//		
//		o1 = new OrangeHRM_Login(GenericKeywordsWithPage.driver);
//		
//		o1.enter_Username(h1.get("userName"));
//		passLog();
//		Thread.sleep(3000);
//		o1.enter_Password(h1.get("password"));
//		passLog();
//		Thread.sleep(3000);
//		o1.click_Login();
//		Thread.sleep(3000);
//		passLog();
//	}
//	
//	@DataProvider
//	public Object[][] setData0() 
//	{
//		Xls_Reader xls = new Xls_Reader(System.getProperty("user.dir") + "/TestData/testdata.xlsx");
//		
//		return ReadData.getData("OrangeHRM_AllTestcases", "OrangeHRM_TESTCASES", xls);
//	}
//	
//	@Test(priority=1 , dataProvider = "setData1")
//	public void LoginwithinvalidDetails(Hashtable<String, String>h1) throws Throwable
//	{
//		extentLoggerECP =parentExtentLogger.createNode("User cannot login with invalid credentials");
//		
//		o1 = new OrangeHRM_Login(GenericKeywordsWithPage.driver);
//		
//		o1.enter_Username(h1.get("InvaliduserName"));
//		passLog();
//		o1.enter_Password(h1.get("InvalidPassword"));
//		passLog();
//		o1.click_Login();
//		passLog();
//		Thread.sleep(3000);
//		passLog();
//		Thread.sleep(3000);
//		passLog();
//	}
//	
//	@DataProvider
//	public Object[][] setData1() 
//	{
//		Xls_Reader xls = new Xls_Reader(System.getProperty("user.dir") + "/TestData/testdata.xlsx");
//		
//		return ReadData.getData("OrangeHRM_AllTestcases", "OrangeHRM_TESTCASES", xls);
//	}
//	
//	@Test(priority=2 , dataProvider="setData2")
//	public void LoginAgainwithinvalidDetails(Hashtable<String, String>h1) throws Throwable
//	{
//		extentLoggerECP =parentExtentLogger.createNode("User cannot login and click on forgot password");
//		
//		o1 = new OrangeHRM_Login(GenericKeywordsWithPage.driver);
//		
//		o1.enter_Username(h1.get("InvaliduserName"));
//		passLog();
//		o1.enter_Password(h1.get("InvalidPassword"));
//		passLog();
//		o1.click_Login();
//		Thread.sleep(3000);
//		passLog();
//		o1.click_ForgotBtn();
//		passLog();
//		Thread.sleep(3000);
//		passLog();
//	}
//	
//	@DataProvider
//	public Object[][] setData2() 
//	{
//		Xls_Reader xls = new Xls_Reader(System.getProperty("user.dir") + "/TestData/testdata.xlsx");
//		
//		return ReadData.getData("OrangeHRM_AllTestcases", "OrangeHRM_TESTCASES", xls);
//	}
	
	@Test(priority=3,dataProvider="setData3")
	public void EnterCredentials(Hashtable<String, String>h1) throws Throwable
	{
		extentLoggerECP =parentExtentLogger.createNode("User can Enter Skills credentials");
		
		o1 = new OrangeHRM_Login(GenericKeywordsWithPage.driver);
		
		o1.enter_Username(h1.get("userName"));
		passLog();
		o1.enter_Password(h1.get("password"));
		passLog();
		o1.click_Login();
		passLog();
		Thread.sleep(3000);
		o1.Clickon_Admin();
		passLog();
		Thread.sleep(3000);
		o1.Clickon_QualList();
		passLog();
		Thread.sleep(3000);
		o1.Clickon_Skills();
		passLog();
		Thread.sleep(3000);
		o1.Clickon_Addbtn();
		passLog();
		Thread.sleep(3000);
		o1.Enter_Skillname(h1.get("Skillname"));
		passLog();
		Thread.sleep(3000);
		o1.Enter_Description(h1.get("Description"));
		passLog();
		Thread.sleep(3000);
		o1.Clickon_Save();
		passLog();
		Thread.sleep(3000);
		o1.Clickon_Editbtn();
		passLog();
		o1.ClearandEnter_skill(h1.get("UpdateSkillname"));
		Thread.sleep(3000);
		o1.ClearandEnter_Description(h1.get("UpdateDescription"));
		Thread.sleep(3000);
//		o1.ReEnter_skillname(h1.get("UpdateSkillname"));
//		passLog();
//		Thread.sleep(3000);
//		o1.ReEnter_Description(h1.get("UpdateDescription"));
//		passLog();
//		Thread.sleep(3000);
		o1.Clickon_Save();
		passLog();
		Thread.sleep(3000);
		
	}
	
	@DataProvider
	public Object[][] setData3() 
	{
		Xls_Reader xls = new Xls_Reader(System.getProperty("user.dir") + "/TestData/testdata.xlsx");
		
		return ReadData.getData("OrangeHRM_AllTestcases", "OrangeHRM_TESTCASES", xls);
	}
	
//	@Test(priority=4,dataProvider="setData4")
//	public void EnterEducationDetails(Hashtable<String, String>h1) throws Throwable
//	{
//		extentLoggerECP =parentExtentLogger.createNode("User can Enter Education Details");
//		
//		o1 = new OrangeHRM_Login(GenericKeywordsWithPage.driver);
//		
//		o1.enter_Username(h1.get("userName"));
//		passLog();
//		o1.enter_Password(h1.get("password"));
//		passLog();
//		o1.click_Login();
//		passLog();
//		Thread.sleep(3000);
//		o1.Clickon_Admin();
//		passLog();
//		Thread.sleep(3000);
//		o1.Clickon_QualList();
//		passLog();
//		Thread.sleep(3000);
//		o1.Clickon_Education();
//		passLog();
//		Thread.sleep(3000);
//		o1.Clickon_Addbtn();
//		passLog();
//		Thread.sleep(3000);
//		o1.Enter_Level(h1.get("Education"));
//		passLog();
//		Thread.sleep(3000);
//		o1.Clickon_Save();
//		passLog();
//		Thread.sleep(10000);
//		o1.Clickon_editEducation();
//		passLog();
//		Thread.sleep(10000);
//		o1.Enter_Level(h1.get("UpdateEducation"));
//		passLog();
//		Thread.sleep(10000);
//		o1.Clickon_Save();
//		passLog();
//		Thread.sleep(10000);
//	}
//	
//	@DataProvider
//	public Object[][] setData4() 
//	{
//		Xls_Reader xls = new Xls_Reader(System.getProperty("user.dir") + "/TestData/testdata.xlsx");
//		
//		return ReadData.getData("OrangeHRM_AllTestcases", "OrangeHRM_TESTCASES", xls);
//	}
//	
//	@Test(priority=5,dataProvider="setData5")
//	public void EnterlicenceData(Hashtable<String, String>h1) throws Throwable
//	{
//		extentLoggerECP =parentExtentLogger.createNode("User can Give Licence Details");
//		
//		o1 = new OrangeHRM_Login(GenericKeywordsWithPage.driver);
//		o1.enter_Username(h1.get("userName"));
//		passLog();
//		o1.enter_Password(h1.get("password"));
//		passLog();
//		o1.click_Login();
//		passLog();
//		Thread.sleep(3000);
//		o1.Clickon_Admin();
//		passLog();
//		Thread.sleep(3000);
//		o1.Clickon_QualList();
//		passLog();
//		Thread.sleep(3000);
//		o1.Clickon_Licence();
//		passLog();
//		Thread.sleep(3000);
//		o1.Clickon_Addbtn();
//		passLog();
//		Thread.sleep(3000);
//		o1.Enter_Level(h1.get("LicenceName"));
//		passLog();
//		Thread.sleep(3000);
//		o1.Clickon_Save();
//		passLog();
//		Thread.sleep(3000);
//		o1.Clickon_EditLicence();
//		passLog();
//		Thread.sleep(3000);
//		o1.Edit_Name(h1.get("EditLicenceName"));
//		o1.Clickon_Save();
//		passLog();
//		Thread.sleep(3000);
//	}
//	
//	@DataProvider
//	public Object[][] setData5() 
//	{
//		Xls_Reader xls = new Xls_Reader(System.getProperty("user.dir") + "/TestData/testdata.xlsx");
//		
//		return ReadData.getData("OrangeHRM_AllTestcases", "OrangeHRM_TESTCASES", xls);
//	}
//	
//	@Test(priority=6,dataProvider="setData6")
//	public void EnterLanguage(Hashtable<String, String>h1) throws Throwable
//	{
//		extentLoggerECP =parentExtentLogger.createNode("User can Give language Details");
//		
//		o1 = new OrangeHRM_Login(GenericKeywordsWithPage.driver);
//		o1.enter_Username(h1.get("userName"));
//		passLog();
//		o1.enter_Password(h1.get("password"));
//		passLog();
//		o1.click_Login();
//		passLog();
//		Thread.sleep(3000);
//		o1.Clickon_Admin();
//		passLog();
//		Thread.sleep(3000);
//		o1.Clickon_QualList();
//		passLog();
//		Thread.sleep(3000);
//		o1.Clickon_language();
//		passLog();
//		Thread.sleep(3000);
//		o1.Clickon_Addbtn();
//		passLog();
//		Thread.sleep(3000);
//		o1.Enter_Level(h1.get("LanguageName"));
//		passLog();
//		Thread.sleep(3000);
//		o1.Clickon_Save();
//		passLog();
//		Thread.sleep(7000);
//		o1.clickon_editlang();
//		passLog();
//		Thread.sleep(3000);
//		o1.Enter_Level(h1.get("EditLanguage"));
//		passLog();
//		Thread.sleep(3000);
//		o1.Clickon_Save();
//		passLog();
//		Thread.sleep(10000);
//	}
//	
//	@DataProvider
//	public Object[][] setData6() 
//	{
//		Xls_Reader xls = new Xls_Reader(System.getProperty("user.dir") + "/TestData/testdata.xlsx");
//		
//		return ReadData.getData("OrangeHRM_AllTestcases", "OrangeHRM_TESTCASES", xls);
//	}
//	
//	@Test(priority=6,dataProvider="setData7")
//	public void EnterMembership(Hashtable<String, String>h1) throws Throwable
//	{
//		extentLoggerECP =parentExtentLogger.createNode("User can Give Membership Details");
//		
//		o1 = new OrangeHRM_Login(GenericKeywordsWithPage.driver);
//		o1.enter_Username(h1.get("userName"));
//		passLog();
//		o1.enter_Password(h1.get("password"));
//		passLog();
//		o1.click_Login();
//		passLog();
//		Thread.sleep(3000);
//		o1.Clickon_Admin();
//		passLog();
//		Thread.sleep(3000);
//		o1.Clickon_QualList();
//		passLog();
//		Thread.sleep(3000);
//		o1.clickon_Membership();
//		passLog();
//		Thread.sleep(3000);
//		o1.Clickon_Addbtn();
//		passLog();
//		Thread.sleep(3000);
//		o1.Enter_membername(h1.get("Membership"));
//		passLog();
//		Thread.sleep(3000);
//		o1.Clickon_Save();
//		passLog();
//		Thread.sleep(3000);
//		o1.Edit_Membership();
//		passLog();
//		Thread.sleep(3000);
//		o1.Enter_membername(h1.get("EditMembership"));
//		passLog();
//		Thread.sleep(3000);
//		o1.Clickon_Save();
//		passLog();
//		Thread.sleep(10000);
//	}
//	
//	@DataProvider
//	public Object[][] setData7() 
//	{
//		Xls_Reader xls = new Xls_Reader(System.getProperty("user.dir") + "/TestData/testdata.xlsx");
//		
//		return ReadData.getData("OrangeHRM_AllTestcases", "OrangeHRM_TESTCASES", xls);
//	}
	
//	@AfterMethod
//	public void endreport()
//	{
//		beforeClassForChild(this);
//	}

}
