package com.surveillance.pages;

import com.surveillance.utilitiy.GenericKeywords;
import com.surveillance.utilitiy.PropertySingleton;

public class ModemPage {
	
		
		PropertySingleton _instance = null;

		public ModemPage() 
		{
			_instance = PropertySingleton.getInstance();
		}

		public GenericKeywords keywords = new GenericKeywords("BoxPage");
		
		public ModemPage clickonmodems()
		{
			keywords.jsClick("xpath", _instance.getValue("ModemPage.BTN_modems"));
			keywords.waitForPageLoad();
			return this;
		}
		public ModemPage clickonAddaModem()
		{
			keywords.jsClick("xpath", _instance.getValue("ModemPage.BTN_AddaModem"));
			keywords.waitForPageLoad();
			return this;
		}
		public ModemPage enterName(String value) throws Exception
		{
			keywords.enterData("xpath", _instance.getValue("ModemPage.Edit_Name"), value);
			return this;
	}
		public ModemPage SelectModemMftrs(String Data) throws Throwable
		{
			
			keywords.SelectDropDown("xpath", _instance.getValue("ModemPage.DropDown_ModemMftrs"), Data);
			return this;
		}
		public ModemPage enterMEID(String value) throws Exception

		{
			keywords.enterData("xpath", _instance.getValue("ModemPage.Edit_MEID"), value);
			return this;
	}
		public ModemPage enterSerialNumber(String value) throws Exception

	{
		keywords.enterData("xpath", _instance.getValue("ModemPage.Edit_SerialNumber"), value);
		return this;

	}
		public ModemPage enterSIM1(String value) throws Exception

		{
			keywords.enterData("xpath", _instance.getValue("ModemPage.Edit_SIM1"), value);
			return this;
	
		}
		public ModemPage enterSIM2(String value) throws Exception

		{
			keywords.enterData("xpath", _instance.getValue("ModemPage.Edit_SIM2"), value);
			return this;
	}
		public ModemPage enterWANMACAddress(String value) throws Exception

		{
			keywords.enterData("xpath", _instance.getValue("ModemPage.Edit_WANMACAddress"), value);
			return this;
	}
		public ModemPage enterWLANMACAddress(String value) throws Exception
		{
		keywords.enterData("xpath", _instance.getValue("ModemPage.Edit_WLANMACAddress"), value);
		return this;
		}
		public ModemPage enterFirmwareVersion(String value) throws Exception
		{
		keywords.enterData("xpath", _instance.getValue("ModemPage.Edit_FirmwareVersion"), value);
		return this;
		}
		public ModemPage clickonClearLiveUnit()
		{
			keywords.jsClick("xpath", _instance.getValue("ModemPage.BTN_ClearLiveUnit"));
			keywords.waitForPageLoad();
			return this;
		}
		public ModemPage clickonSelectLiveUnit()
		{
			keywords.jsClick("xpath", _instance.getValue("ModemPage.BTN_SelectLiveUnit"));
			keywords.waitForPageLoad();
			return this;
		}

		public ModemPage SelectOwnedbyClient(String Data) throws Throwable
		{
			
			keywords.SelectDropDown("xpath", _instance.getValue("ModemPage.DropDown_OwnedbyClient"), Data);
			return this;
		}
		
		public ModemPage enterCalculatedIPAddress(String value) throws Exception
		{
		keywords.enterData("xpath", _instance.getValue("ModemPage.Edit_CalculatedIPAddress"), value);
		return this;
		}
		
		
		public ModemPage enterVPNIPAddress(String value) throws Exception
		{
		keywords.enterData("xpath", _instance.getValue("ModemPage.Edit_VPNIPAddress"), value);
		return this;
		}
		public ModemPage enterDVNIPAddress(String value) throws Exception
		{
		keywords.enterData("xpath", _instance.getValue("ModemPage.Edit_DVNIPAddress"), value);
		return this;
		}
		public ModemPage enterLANIPAddress(String value) throws Exception
		{
		keywords.enterData("xpath", _instance.getValue("ModemPage.Edit_LANIPAddress"), value);
		return this;
		}
		public ModemPage enterLANSubnetMask(String value) throws Exception
		{
		keywords.enterData("xpath", _instance.getValue("ModemPage.Edit_LANSubnetMask"), value);
		return this;
		}
		public ModemPage enterLANGateway(String value) throws Exception
		{
		keywords.enterData("xpath", _instance.getValue("ModemPage.Edit_LANGateway"), value);
		return this;
		}
		public ModemPage SelectVpnServers(String Data) throws Throwable
		{
			keywords.SelectDropDown("xpath", _instance.getValue("ModemPage.DropDown_VpnServers"), Data);
			return this;
		}
		public ModemPage ClickonSettoDHCP(String value) throws Exception 
		{
			keywords.checkClick("xpath", _instance.getValue("ModemPage.CheckBox_SettoDHCP"), value);
			return this;
		}
		public ModemPage enterWANIPAddress(String value) throws Exception
		{
		keywords.enterData("xpath", _instance.getValue("ModemPage.Edit_WANIPAddress"), value);
		return this;
		}
		public ModemPage enterWANSubnetMask(String value) throws Exception
		{
		keywords.enterData("xpath", _instance.getValue("ModemPage.Edit_WANSubnetMask"), value);
		return this;
		}
		public ModemPage enterWANGateway(String value) throws Exception
		{
		keywords.enterData("xpath", _instance.getValue("ModemPage.Edit_WANGateway"), value);
		return this;
		}
		public ModemPage enterWANDNS1(String value) throws Exception
		{
		keywords.enterData("xpath", _instance.getValue("ModemPage.Edit_WANDNS1"), value);
		return this;
		}
		public ModemPage enterWANDNS2(String value) throws Exception
		{
		keywords.enterData("xpath", _instance.getValue("ModemPage.Edit_WANDNS2"), value);
		return this;
		}
		public ModemPage enterWANDNS3(String value) throws Exception
		{
		keywords.enterData("xpath", _instance.getValue("ModemPage.Edit_WANDNS3"), value);
		return this;
		}
		public ModemPage enterWANPort(String value) throws Exception
		{
		keywords.enterData("xpath", _instance.getValue("ModemPage.Edit_WANPort"), value);
		return this;
		}
		public ModemPage ClickonUsesHTTPS(String value) throws Exception 
		{
			keywords.checkClick("xpath", _instance.getValue("ModemPage.CheckBox_UsesHTTPS"), value);
			return this;
		}
		public ModemPage enterRelayNumber(String value) throws Exception
		{
		keywords.enterData("xpath", _instance.getValue("ModemPage.Edit_RelayNumber"), value);
		return this;
		}
		public ModemPage enterWirelessSSID(String value) throws Exception
		{
		keywords.enterData("xpath", _instance.getValue("ModemPage.Edit_WirelessSSID"), value);
		return this;
		}
		public ModemPage SelectWirelessChannel(String Data) throws Throwable
		{
			keywords.SelectDropDown("xpath", _instance.getValue("ModemPage.DropDown_WirelessChannel"), Data);
			return this;
		}
		public ModemPage enterWirelessEncryptionID(String value) throws Exception
		{
		keywords.enterData("xpath", _instance.getValue("ModemPage.Edit_WirelessEncryptionID"), value);
		return this;
		}
		public ModemPage enterWirelessPassword(String value) throws Exception
		{
		keywords.enterData("xpath", _instance.getValue("ModemPage.Edit_WirelessPassword"), value);
		return this;
		}
		public ModemPage enterAdministrationUserName(String value) throws Exception
		{
		keywords.enterData("xpath", _instance.getValue("ModemPage.Edit_AdministrationUserName"), value);
		return this;
		}
		public ModemPage enterAdministrationPassword(String value) throws Exception
		{
		keywords.enterData("xpath", _instance.getValue("ModemPage.Edit_AdministrationPassword"), value);
		return this;
		}
		public ModemPage SelectISP(String Data) throws Throwable
		{
			keywords.SelectDropDown("xpath", _instance.getValue("ModemPage.DropDown_ISP"), Data);
			return this;
		}
		public ModemPage enterISPAccountNumber(String value) throws Exception
		{
		keywords.enterData("xpath", _instance.getValue("ModemPage.Edit_ISPAccountNumber"), value);
		return this;
		}
           public ModemPage ClickonIsISPAccountOwnedbyClient(String value) throws Exception 
        {
	keywords.checkClick("xpath", _instance.getValue("ModemPage.CheckBox_IsISPAccountOwnedbyClient"), value);
	return this;
        }
        public ModemPage SelectDateModemwasPurchasedMonth(String Data) throws Throwable
		{
			keywords.SelectDropDown("xpath", _instance.getValue("ModemPage.DropDown_DateModemwasPurchasedMonth"), Data);
			return this;
		}
        public ModemPage SelectDateModemwasPurchasedDate(String Data) throws Throwable
		{
			keywords.SelectDropDown("xpath", _instance.getValue("ModemPage.DropDown_DateModemwasPurchasedDate"), Data);
			return this;
		}
        public ModemPage SelectDateModemwasPurchasedYear(String Data) throws Throwable
		{
			keywords.SelectDropDown("xpath", _instance.getValue("ModemPage.DropDown_DateModemwasPurchasedYear"), Data);
			return this;
		}
		public ModemPage enterPurchaseOrderNumber(String value) throws Exception
		{
		keywords.enterData("xpath", _instance.getValue("ModemPage.Edit_PurchaseOrderNumber"), value);
		return this;
		}
		public ModemPage enterFullnameofpersonwholasttestedModem(String value) throws Exception
		{
		keywords.enterData("xpath", _instance.getValue("ModemPage.Edit_FullnameofpersonwholasttestedModem"), value);
		return this;
		}
		public ModemPage SelectDatewaslasttestedMonth(String Data) throws Throwable
		{
			keywords.SelectDropDown("xpath", _instance.getValue("ModemPage.DropDown_DatewaslasttestedMonth"), Data);
			return this;
		}
		public ModemPage SelectDatewaslasttestedDate(String Data) throws Throwable
		{
			keywords.SelectDropDown("xpath", _instance.getValue("ModemPage.DropDown_DatewaslasttestedDate"), Data);
			return this;
		}
		public ModemPage SelectDatewaslasttestedYear(String Data) throws Throwable
		{
			keywords.SelectDropDown("xpath", _instance.getValue("ModemPage.DropDown_DatewaslasttestedYear"), Data);
			return this;
		}
		public ModemPage enterUsageHistoryofModem(String value) throws Exception
		{
		keywords.enterData("xpath", _instance.getValue("ModemPage.Edit_UsageHistoryofModem"), value);
		return this;
		}
		public ModemPage enterNotes(String value) throws Exception
		{
		keywords.enterData("xpath", _instance.getValue("ModemPage.Edit_Notes"), value);
		return this;
		}
		public ModemPage clickonCancel()
		{
			keywords.jsClick("xpath", _instance.getValue("ModemPage.BTN_Cancel"));
			
			return this;
		}
		public ModemPage clickonAddNewModem()
		{
			keywords.jsClick("xpath", _instance.getValue("ModemPage.BTN_AddNewModem"));
			
			return this;
		}

public ModemPage clickonAddMultipleNewModems()
{
	keywords.jsClick("xpath", _instance.getValue("AddMultipleNewModemPage.BTN_AddMultipleNewModems"));
	
	return this;
}

		public ModemPage SelectMultipleModemMftrs(String Data) throws Throwable
		{
			keywords.SelectDropDown("xpath", _instance.getValue("AddMultipleNewModemPage.DropDown_MultipleModemMftrs"), Data);
			return this;
		}
		public ModemPage enterSerialNumbers(String value) throws Exception
		{
		keywords.enterData("xpath", _instance.getValue("AddMultipleNewModemPage.Edit_SerialNumbers"), value);
		return this;
		}
		public ModemPage enterOwnedbyClient(String value) throws Exception
		{
		keywords.enterData("xpath", _instance.getValue("AddMultipleNewModemPage.Edit_OwnedbyClient"), value);
		return this;
		}
		public ModemPage SelectMultipleDatemodemwaspurchasedMonth(String Data) throws Throwable
		{
			keywords.SelectDropDown("xpath", _instance.getValue("AddMultipleNewModemPage.DropDown_MultipleDatemodemwaspurchasedMonth"), Data);
			return this;
		}
		public ModemPage SelectMultipleDatemodemwaspurchasedDate(String Data) throws Throwable
		{
			keywords.SelectDropDown("xpath", _instance.getValue("AddMultipleNewModemPage.DropDown_MultipleDatemodemwaspurchasedDate"), Data);
			return this;
		}
		public ModemPage SelectMultipleDatemodemwaspurchasedYear(String Data) throws Throwable
		{
			keywords.SelectDropDown("xpath", _instance.getValue("AddMultipleNewModemPage.DropDown_MultipleDatemodemwaspurchasedYear"), Data);
			return this;
		}
		public ModemPage enterMultiplePurchaseOrderNumber(String value) throws Exception
		{
		keywords.enterData("xpath", _instance.getValue("AddMultipleNewModemPage.Edit_MultiplePurchaseOrderNumber"), value);
		return this;
		}
		public ModemPage enterMultipleNotes(String value) throws Exception
		{
			keywords.enterData("xpath", _instance.getValue("AddMultipleNewModemPage.Edit_MultipleNotes"), value);
			return this;
			}
		public ModemPage clickonMultipleCancel()
			{
				keywords.jsClick("xpath", _instance.getValue("AddMultipleNewModemPage.BTN_MultipleCancel"));
				
				return this;
			}

			public ModemPage clickonMultipleAddNewModems()
			{
				keywords.jsClick("xpath", _instance.getValue("AddMultipleNewModemPage.BTN_MultipleAddNewModems"));
				
				return this;
			}

}
