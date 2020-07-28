package com.surveillance.Test;

import java.util.Hashtable;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.surveillance.pages.BoxPage;
import com.surveillance.pages.HomePage;
import com.surveillance.pages.HomePageTestPage;
import com.surveillance.pages.ModemPage;
import com.surveillance.utilitiy.PropertySingleton;
import com.surveillance.utilitiy.ReadData;
import com.surveillance.utilitiy.Xls_Reader;

public class ModemPageTest  extends BaseTest{

	SoftAssert s_assert = new SoftAssert();
	PropertySingleton _instance = null;
	
	LoginTest loginTest=new LoginTest();
	HomePage homePage =new HomePage();
	HomePageTestPage homepagetestpage=new HomePageTestPage();
	BoxPage boxpage=new BoxPage();
	ModemPage modempage=new ModemPage();
	public ModemPageTest() throws Throwable 
	{
		_instance = PropertySingleton.getInstance();
	}
	

	@BeforeClass
	public void startReport()
	{
		beforeClassForChild(this);
		
	}
	
       @Test(priority = 0, dataProvider = "setData1")
	public void ModemPageTest1(Hashtable<String, String> h2) throws Throwable 
	{
	extentLoggerECP = parentExtentLogger.createNode("Modem Page Test");

	loginTest.logintest(h2);
	passLog();
	homepagetestpage.clickOnSYSTEMADMIN();
	passLog();
	boxpage.clickonHardware();
	passLog();
	modempage.clickonmodems();
	passLog();
	modempage.clickonAddaModem();
	passLog();
	modempage.enterName(h2.get("Name"));
     passLog();
      modempage.SelectModemMftrs(h2.get("ModemMftrs"));
        passLog(); 
        modempage.enterSerialNumber(h2.get("SerialNumber"));
        passLog();
        modempage.enterMEID(h2.get("MEID"));
        passLog();
        modempage.enterSIM1(h2.get("SIM1"));
        passLog();
        modempage.enterSIM2(h2.get("SIM2"));
        passLog();
        modempage.enterWANMACAddress(h2.get("WANMACAddress"));
        passLog();
        modempage.enterWLANMACAddress(h2.get("WLANMACAddress"));
        passLog();
        modempage.enterFirmwareVersion(h2.get("FirmwareVersion"));
        passLog();
        modempage.SelectOwnedbyClient(h2.get("OwnedbyClient"));
        passLog();
//        modempage.enterCalculatedIPAddress(h2.get("CalculatedIPAddress"));
//        passLog();
        modempage.enterVPNIPAddress(h2.get("VPNIPAddress"));
        passLog();
        modempage.enterDVNIPAddress(h2.get("DVNIPAddress"));
        passLog();
        modempage.enterLANIPAddress(h2.get("LANIPAddress"));
        passLog();
        modempage.enterLANSubnetMask(h2.get("LANSubnetMask"));
        passLog();
        modempage.enterLANGateway(h2.get("LANGateway"));
        passLog();
        modempage.SelectVpnServers(h2.get("VpnServers"));
        passLog();
        modempage.ClickonSettoDHCP("ON");
        passLog();
        modempage.enterWANIPAddress(h2.get("WANIPAddress"));
        passLog();
        modempage.enterWANSubnetMask(h2.get("WANSubnetMask"));
        passLog();
        modempage.enterWANGateway(h2.get("WANGateway"));
        passLog();
        modempage.enterWANDNS1(h2.get("WANDNS1"));
        passLog();
        modempage.enterWANDNS2(h2.get("WANDNS2"));
        
        passLog();
        modempage.enterWANDNS3(h2.get("WANDNS3"));
        passLog();
        modempage.enterWANPort(h2.get("WANPort"));
        passLog();
        modempage.ClickonUsesHTTPS("ON");
        passLog();
        modempage.enterRelayNumber(h2.get("RelayNumber"));
        passLog();
        modempage.enterWirelessSSID(h2.get("WirelessSSID"));
        passLog();
        modempage.SelectWirelessChannel(h2.get("WirelessChannel"));
        passLog();
        modempage.enterWirelessEncryptionID(h2.get("WirelessEncryptionID"));
        passLog();
        modempage.enterWirelessPassword(h2.get("WirelessPassword"));
        passLog();
        modempage.enterAdministrationUserName(h2.get("AdministrationUserName"));
        passLog();
        modempage.enterAdministrationPassword(h2.get("AdministrationPassword"));
        passLog();
        modempage.SelectISP(h2.get("ISP"));
        passLog();
        modempage.enterISPAccountNumber(h2.get("ISPAccountNumber"));
        passLog();
        modempage.ClickonIsISPAccountOwnedbyClient("ON");
        passLog();
        modempage.SelectDateModemwasPurchasedMonth("January");
        passLog();
        modempage.SelectDateModemwasPurchasedDate("2");
        passLog();
        modempage.SelectDateModemwasPurchasedYear("2020");
        passLog();
        modempage.enterPurchaseOrderNumber(h2.get("PurchaseOrderNumber"));
        passLog();
        modempage.enterFullnameofpersonwholasttestedModem(h2.get("FullnameofpersonwholasttestedModem"));
        passLog();
        modempage.SelectDatewaslasttestedMonth("January");
        passLog();
        modempage.SelectDatewaslasttestedDate("3");
        passLog();
        modempage.SelectDatewaslasttestedYear("2020");
        passLog();
        modempage.enterUsageHistoryofModem(h2.get("UsageHistoryofModem"));
        passLog();
        modempage.enterNotes(h2.get("Notes"));
        passLog();
//        modempage.clickonAddNewModem();
//        passLog();
        modempage.clickonCancel();
        passLog();
}

    @Test(priority = 0, dataProvider = "setData1")
	public void AddMultipleNewModems (Hashtable<String, String> h2) throws Throwable 
	{
	extentLoggerECP = parentExtentLogger.createNode("Add Multiple New Modems");

	loginTest.logintest(h2);
	passLog();
	homepagetestpage.clickOnSYSTEMADMIN();
	passLog();
	boxpage.clickonHardware();
	passLog();
	modempage.clickonmodems();
	passLog();
	modempage.clickonAddMultipleNewModems();
	passLog();
	modempage.SelectMultipleModemMftrs(h2.get("MultipleModemMftrs"));
	passLog();
	modempage.enterSerialNumbers(h2.get("SerialNumbers"));
	passLog();
	modempage.SelectOwnedbyClient(h2.get("OwnedbyClient"));
	passLog();
	modempage.SelectMultipleDatemodemwaspurchasedMonth("January");
	modempage.SelectMultipleDatemodemwaspurchasedDate("2");
	passLog();
	modempage.SelectMultipleDatemodemwaspurchasedYear("2020");
	passLog();
	modempage.enterMultiplePurchaseOrderNumber(h2.get("MultiplePurchaseOrderNumber"));
	passLog();
	modempage.enterMultipleNotes("MultipleNotes");
	passLog();
//	modempage.clickonMultipleCancel();
//	passLog();
	modempage.clickonMultipleAddNewModems();
	passLog();
	
	}
       @DataProvider
   	public Object[][] setData1() {
   		Xls_Reader xls = new Xls_Reader(System.getProperty("user.dir") + "\\TestData\\testdata.xlsx");
   		return ReadData.getData("ModemPageTest", "ModemPage", xls);
   	}
}