package opencartTest;

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
import opencartPage.*;

public class OpenCartTest2 extends BaseTest
{
	OpenCartPage2 s1;
	PropertySingleton _instance = null;
	SoftAssert s_assert = new SoftAssert();

	public void OpenCartPage2() throws Throwable
	{
		_instance = PropertySingleton.getInstance();
		s1 = new opencartPage.OpenCartPage2(GenericKeywordsWithPage.driver);
	}
	@BeforeClass
	public void startReport()
	{
		beforeClassForChild(this);
	}

	@Test(dataProvider = "setData1")
	public void OpenCartPage2(Hashtable<String , String> h1) throws Throwable
	{
		extentLoggerECP = parentExtentLogger.createNode("Login With Invalid Credentials");
		s_assert = new SoftAssert();
		OpenCartPage2();
		s1.enterUsername(h1.get("UserName"));
		passLog("enterUsername");
		s1.enterPassword(h1.get("Password"));
		passLog("enterPassword");
		s1.clickbutton();
		passLog("login");
		s1.clickon_Catalog();
		passLog("user clicked on Catalog");
		
		s1.clickon_Categories();
		passLog("user clicked on Categories");
		
		s1.clickon_CamEdit();
		passLog("user clicked on Edit");
	
		s1.clickon_Data();
		passLog("user clicked on data");
		
		s1.clickandenter_ParentBox(h1.get("Parent"));
		passLog("user clicked on ParentBox");
		Thread.sleep(3000);
		s1.enter_FilterBox(h1.get("FilterBox"));
		passLog("data entered in filterbox");
		Thread.sleep(3000);
		s1.click_StoriesBox();
		passLog("user clicked on Stories");
		Thread.sleep(3000);
		s1.clickandadd_Image();
		passLog("Image clicked and Add");
		Thread.sleep(3000);
		s1.enterDataIn_Column(h1.get("ColumnData"));
		passLog("User entered Data in Column Box");
		Thread.sleep(3000);
		s1.enterDataIn_SortBox(h1.get("SortData"));
		passLog("User Entered data in SortBox");
		Thread.sleep(3000);
		s1.clickon_SaveBtn();
		passLog("User clicked on Save");
		Thread.sleep(3000);
}
	
	@DataProvider
	public Object[][] setData1()
	{
		Xls_Reader xls = new Xls_Reader(System.getProperty("user.dir") + "//TestData//testdata.xlsx");
		return ReadData.getData("OpenCart", "OpenCartTestCases", xls);	
	}
}
