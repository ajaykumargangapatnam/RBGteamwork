package TestPackage;



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
import Pagepackage.opencartpage2;

public class opencartTest2 extends BaseTest
{
	
	opencartpage2 p1;
	PropertySingleton _instance = null;
	SoftAssert s_assert = new SoftAssert();

	public void opencart1() throws Throwable 
	{
		_instance = PropertySingleton.getInstance();
		p1 = new opencartpage2(GenericKeywordsWithPage.driver);
	}

	@BeforeClass
	public void startReport()
	{
		beforeClassForChild(this);

	}

	//@Test(dataProvider="setData")
	@Test
	public void opencart11() throws Throwable 
	{
		extentLoggerECP = parentExtentLogger.createNode("login With creditials");
		s_assert = new SoftAssert();
		p1 = new opencartpage2 (GenericKeywordsWithPage.driver);
		
	
		 p1.enterUsername("demo");
		 p1.enterPassword("demo");
		 p1.loginButton();
		 p1.catalogsButton();
		 p1.catagoriesButton();
		 p1.editImage();
		 p1.data();
		 p1.parentButton("Cameras");
		 p1.filterButton("megapixcel");
		 p1.storiesButton();
		 p1.imageedit();
		 p1.imageBox();
		 p1.coloumnBox("4");
		 p1.sortOrderBox("1");
		 p1.saveButton();
		
		
		

	}
	
	
//	@DataProvider
//	public Object[][] setData() 
//	{
//		Xls_Reader xls = new Xls_Reader(System.getProperty("user.dir") + "\\TestData\\testdata.xlsx");
//		return ReadData.getData("OpenCart", "opencartTestcases", xls);
//	}
//	
//	
//	
	
	

}
