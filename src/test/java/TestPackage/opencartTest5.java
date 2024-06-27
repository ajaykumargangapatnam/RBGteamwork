package TestPackage;


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



	import Pagepackage.opencartpage;
import Pagepackage.opencartpage5;

	public class opencartTest5 extends BaseTest
	{
		
		opencartpage5 p1;
		PropertySingleton _instance = null;
		SoftAssert s_assert = new SoftAssert();

		public void opencart1() throws Throwable 
		{
			_instance = PropertySingleton.getInstance();
			p1 = new opencartpage5(GenericKeywordsWithPage.driver);
		}

		@BeforeClass
		public void startReport()
		{
			beforeClassForChild(this);

		}

	//	@Test(dataProvider="setData")
	@Test
		public void opencart11() throws Throwable 
		{
			extentLoggerECP = parentExtentLogger.createNode("login With creditials");
			s_assert = new SoftAssert();
			p1 = new opencartpage5 (GenericKeywordsWithPage.driver);
			
			
			 p1.enterUsername("demo");
			 p1.enterPassword("demo");
			 p1.loginButton();
			 p1.logoutButton();
			
			
			

		}
		
		
//		@DataProvider
//		public Object[][] setData() 
//		{
//			Xls_Reader xls = new Xls_Reader(System.getProperty("user.dir") + "//TestData//testdata.xlsx");
//		
//			return ReadData.getData("OpenCart", "opencartTestcases", xls);
//		}
//		
//		

		
		

	}



