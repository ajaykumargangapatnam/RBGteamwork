package PracticeTest;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import com.surveillance.Test.BaseTest;
import com.surveillance.utilitiy.GenericKeywordsWithPage;
import com.surveillance.utilitiy.PropertySingleton;

import practicepage.GenericNopcommerces;

public class Genericnopcommerce_Test extends BaseTest
{

	GenericNopcommerces gn1;
	PropertySingleton _instance = null;
	SoftAssert s_Assert = new SoftAssert();
	
	public Genericnopcommerce_Test()
	{
		_instance=PropertySingleton.getInstance();
	}
	
	@BeforeClass
	public void StartReport()
	{
		beforeClassForChild(this);
	}
	
	@Test
	public void Loginwithvalidcredentials() throws Throwable
	{
		extentLoggerECP=parentExtentLogger.createNode("login with valide credentials on Nopcommerces");
		
		gn1 = new GenericNopcommerces(GenericKeywordsWithPage.driver);
		
		gn1.ClickonRegister();
		
		Thread.sleep(2000);
		
		gn1.ClickonRadioBtn();
		
		gn1.EnterFirstname("Raja");
		
		gn1.EnterLastname("Sekhar");
		
		gn1.Dropdownforbirthdate("14");
		
		gn1.Dropdownforbirthmonth("2");
		
		gn1.Dropdownforbirthyear("2000");
		
		gn1.EnterEmail("ram123@gmail.com");
		
		gn1.EnterCompanyname("RBGtechnologies");
		
		gn1.EnterPassword("12345678");
		
		gn1.EnterConfirmpassword("12345678");
		
		gn1.RegisterButton();
		
		Thread.sleep(3000);
		
		gn1.ClickonLogin();
		
		gn1.EnterLoginEmail("ram123@gmail.com");
		
		gn1.EnterLoginPassword("12345678");
		
		gn1.Loginbutton();
		
		gn1.ClickComputerLink();
		
		Thread.sleep(2000);
		 
		gn1.ClickonDesktop();
		
		gn1.ClickAddtocart();
		
		Thread.sleep(2000);
		
		gn1.DropdownforProcessor("1");
		
		gn1.DropdownforRam("3");
		
		gn1.ClickonHDDRadioBtn();
		
		gn1.ClickOSRadioBtn();
		
		gn1.SoftwareARbox();
		
		gn1.SoftwareTCbox();
		
		gn1.AddtocartBtn();
		
		Thread.sleep(3000);
		
		gn1.ClickShopcartlink();
		
		Thread.sleep(3000);
		
		gn1.ClickEditlink();
		
		gn1.UpdateforProcessor("2");
		
		gn1.UpadteforRam("4");
		
		gn1.UpadteHDDRadioBtn();
		
		gn1.UpdateOSRadioBtn();
		
		gn1.SoftwareMobox();
		
		Thread.sleep(3000);
		
		gn1.UpdateCart();
		
		Thread.sleep(5000);
		
		gn1.AgainComputer();
		
		Thread.sleep(3000);
		
		gn1.ClickonNotebook();
		
		gn1.CpuTypecheckbox();
		
		gn1.MemoryTypecheckbox();
		
		gn1.SortbyPosition("5");
		
		gn1.DisplayPerpage("9");
		
		Thread.sleep(3000);
		
		gn1.AppleProductLink();
		
		Thread.sleep(3000);
		
		gn1.AppleCartBtn();
		
		Thread.sleep(3000);
		
		gn1.NotebookCart();
		
		gn1.ClearData();
		
		gn1.NoteQuant("5");
		
		Thread.sleep(3000);
		
		gn1.UpdateQuantBtn();
		
		s_Assert.assertAll();
	}

	
}
