package Testpackage;

import java.util.Hashtable;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.surveillance.Test.BaseTest;
import com.surveillance.utilitiy.GenericKeywordsWithPage;
import com.surveillance.utilitiy.PropertySingleton;
import com.surveillance.utilitiy.ReadData;
import com.surveillance.utilitiy.Xls_Reader;

import pagepackage.OpencartPage1;




public class OpenCartTest1 extends BaseTest
{
	OpencartPage1 lp;
	PropertySingleton _instance ;
	SoftAssert s_Assert = new SoftAssert();

	public OpenCartTest1(WebDriver driver)
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

		return ReadData.getData("OpencartTest", "OpenCart_Test_Case", xls);
	}

	@Test(dataProvider="setData0")
	public void enterValidDetails(Hashtable<String, String>h1) throws Throwable
	{
		extentLoggerECP = parentExtentLogger.createNode("User enter Details And Login");

		lp = new OpencartPage1(GenericKeywordsWithPage.driver);
		lp.click_on_username(h1.get("username"));
		passLog("user enter the username");
		lp.click_on_password(h1.get("password"));
		passLog("user enter the password");
		lp.click_on_submit();
		passLog("user clicked on login");
		Thread.sleep(5000);
		lp.clickon_Catalog();
		passLog("user clicked on Catalog");
		Thread.sleep(3000);
		lp.clickon_Categories();
		passLog("user clicked on Categories");
		Thread.sleep(3000);
		lp.clickon_CameraEdit();
		passLog("user clicked on Edit");
		Thread.sleep(3000);
		lp.clickon_Data();
		passLog("user clicked on data");
		Thread.sleep(3000);
		lp.clickandenter_ParentBox(h1.get("Parent"));
		passLog("user clicked on ParentBox");
		Thread.sleep(3000);
		lp.enter_FilterBox(h1.get("FilterBox"));
		passLog("data entered in filterbox");
		Thread.sleep(3000);
		lp.click_StoriesBox();
		passLog("user clicked on Stories");
		Thread.sleep(3000);
		lp.clickandadd_Image();
		passLog("Image clicked and Add");
		Thread.sleep(3000);
		lp.enterDataIn_Column(h1.get("ColumnData"));
		passLog("User entered Data in Column Box");
		Thread.sleep(3000);
		lp.enterDataIn_SortBox(h1.get("SortData"));
		passLog("User Entered data in SortBox");
		Thread.sleep(3000);
		lp.clickon_SaveBtn();
		passLog("User clicked on Save");
		Thread.sleep(3000);
		lp.click_on_customers();
		passLog("User clicked on Customers");
		Thread.sleep(3000);
		lp.click_on_cutomers_under();
		passLog("User click on customers under customers");
		Thread.sleep(3000);
		lp.click_on_edit_pencil1();
		passLog("User click on edit");
		Thread.sleep(3000);
		lp.click_on_store();
		passLog("User click on store");
		Thread.sleep(3000);
		lp.enter_first_name(h1.get("firstname"));
		passLog("User edits firstname");
		Thread.sleep(3000);
		lp.enter_last_name(h1.get("lastname"));
		passLog("User edits lastname");
		Thread.sleep(3000);
		lp.enter_email_id(h1.get("emailID"));
		passLog("user enters emailID");
		Thread.sleep(3000);
		lp.enter_mobile_number(h1.get("telephoneNum"));
		passLog("user enters telephoneNum");
		Thread.sleep(3000);
		lp.enter_password(h1.get("passwordss"));
		passLog("user enters passwords");
		Thread.sleep(3000);
		lp.enter_confirm_password(h1.get("confirmPassword"));
		passLog("user enters confirmPassword");
		Thread.sleep(3000);
		Thread.sleep(3000);
		lp.user_click_savebutton();
		passLog("user click saveButton");
		Thread.sleep(3000);
		lp.user_click_dropdown();
		passLog("user click dropdown");
		Thread.sleep(3000);
		lp.user_click_your_profile();
		passLog("user click profile");
		Thread.sleep(3000);
		lp.click_on_username(h1.get("Ussername"));
		passLog("user click username");
		Thread.sleep(3000);
		lp.user_click_first_name(h1.get("First_Name"));
		passLog("user click Firstname");
		Thread.sleep(3000);
		lp.user_click_last_name(h1.get("last_names"));
		passLog("user click last name");
		Thread.sleep(3000);
		lp.user_clicks_input_email(h1.get("_email"));
		passLog("user click email");
		Thread.sleep(3000);
		lp.user_click_edit_button();
		passLog("user click edit button");
		Thread.sleep(3000);
		lp.user_selected_a_image();
		passLog("user click edit image");
		Thread.sleep(3000);
		lp.user_able_to_edit_password(h1.get("passswordss"));
		passLog("user click edit passwords");
		Thread.sleep(3000);
        lp.user_able_to_confirm_password(h1.get("confirm_password"));
        passLog("user click confrm passwrds");
        Thread.sleep(3000);
        lp.user_clicks_submit_button();
        passLog();
        Thread.sleep(3000);
        lp.user_clicks_log_out();
        Thread.sleep(3000);

	}

	
}
