package opencartCasesTest;

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

import opencartCasesPage.OpenCart_Catalogs;
import opencartCasesPage.OpenCart_LoginPage;

public class OpenCart_CatalogTest extends BaseTest
{
	OpenCart_LoginPage lp;
	OpenCart_Catalogs op;
	PropertySingleton _instance ;
	SoftAssert s_Assert = new SoftAssert();
	
	public OpenCart_CatalogTest()
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
		
		return ReadData.getData("OpenCart_TestCases", "OPENCART_ALLTESTCASES", xls);
	}
	
	@Test(dataProvider="setData0")
	public void enterValidDetails(Hashtable<String, String>h1) throws Throwable
	{
        extentLoggerECP = parentExtentLogger.createNode("User enter Details And Login");
		
		lp = new OpenCart_LoginPage(GenericKeywordsWithPage.driver);
		op = new OpenCart_Catalogs(GenericKeywordsWithPage.driver);
		lp.enter_Username(h1.get("UserName"));
		passLog("user enter the username");
		lp.enter_Password(h1.get("Password"));
		passLog("user enter the password");
		lp.clickon_Login();
		passLog("user clicked on login");
		Thread.sleep(5000);
		op.clickon_Catalog();
		passLog("user clicked on Catalog");
		Thread.sleep(3000);
		op.clickon_Categories();
		passLog("user clicked on Categories");
		Thread.sleep(3000);
		op.clickon_CameraEdit();
		passLog("user clicked on Edit");
		Thread.sleep(3000);
		op.clickon_Data();
		passLog("user clicked on data");
		Thread.sleep(3000);
		op.clickandenter_ParentBox(h1.get("Parent"));
		passLog("user clicked on ParentBox");
		Thread.sleep(3000);
		op.enter_FilterBox(h1.get("FilterBox"));
		passLog("data entered in filterbox");
		Thread.sleep(3000);
		op.click_StoriesBox();
		passLog("user clicked on Stories");
		Thread.sleep(3000);
		op.clickandadd_Image();
		passLog("Image clicked and Add");
		Thread.sleep(3000);
		op.enterDataIn_Column(h1.get("ColumnData"));
		passLog("User entered Data in Column Box");
		Thread.sleep(3000);
		op.enterDataIn_SortBox(h1.get("SortData"));
		passLog("User Entered data in SortBox");
		Thread.sleep(3000);
		op.clickon_SaveBtn();
		passLog("User clicked on Save");
		Thread.sleep(3000);
	}

}
