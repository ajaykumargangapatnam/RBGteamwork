package PracticeTest;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.surveillance.Test.BaseTest;
import com.surveillance.utilitiy.GenericKeywordsWithPage;
import com.surveillance.utilitiy.PropertySingleton;

import practicepage.Facebook_Loginpage;

public class FbLoginTest extends BaseTest 
{
	Facebook_Loginpage f1;
	PropertySingleton _instance = null;
	SoftAssert s_Assert = new SoftAssert();
	
	public  FbLoginTest()
	{
		_instance = PropertySingleton.getInstance(); 
	}
	
	@BeforeClass
	public void startReport()
	{
		beforeClassForChild(this);
	}
	
	@Test
	public void loginWithValidCredentials() throws Throwable
	{
		f1 = new Facebook_Loginpage(GenericKeywordsWithPage.driver);
		f1.enterUsername("username");
		f1.enterPassword("Password");
		f1.clickLogin();
	}
}


