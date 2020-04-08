package com.surveillance.pages;

import org.openqa.selenium.WebElement;

import com.surveillance.utilitiy.GenericKeywords;
import com.surveillance.utilitiy.PropertySingleton;

public class DealerRepo {
	PropertySingleton _instance = null;

	public DealerRepo() {
		_instance = PropertySingleton.getInstance();
	}

	public GenericKeywords keywords = new GenericKeywords("DealerRepo");

	public DealerRepo mousehoverDealerMenu() throws Exception {
		System.out.println(_instance.getValue("SearchDealer.Dealers"));
		keywords.movetoElement("xpath", _instance.getValue("SearchDealer.Dealers"));
		return this;
	}

	public DealerRepo clicksearchDealerMenu() throws Exception {
		keywords.click("xpath", _instance.getValue("SearchDealer.SearchDealers"));
		return this;
	}

	public DealerRepo Wait() throws Exception {
		Thread.sleep(1500);
		return this;
	}

	// Data Hard coded from code*****************************************
	/*
	 * public DealerRepo crdSearch() throws Exception { keywords.clearEnter("id",
	 * _instance.getValue("SearchDealer.DealerCode"), "33397UDD"); return this; }
	 * 
	 * public DealerRepo searchLookupType() throws Exception {
	 * System.out.println(_instance.getValue("SearchDealer.Searchdd"));
	 * keywords.SelectDropDown("id", _instance.getValue("SearchDealer.Searchdd"),
	 * "TXTDealer Code"); return this;
	 * 
	 * }
	 * 
	 * public DealerRepo dataForSearchLookup() throws Exception {
	 * keywords.clearEnter("id", _instance.getValue("SearchDealer.SearchText"),
	 * "33397UD"); return this; }
	 * 
	 * public DealerRepo dealerCodSearch() throws Exception {
	 * keywords.clearEnter("id", _instance.getValue("SearchDealer.DealerCode"),
	 * "33397UD"); return this; }
	 */
	// Data Hard coded from
	// code********************************************************

	// Below methods to read test data from excel
	// file*********************************
	public DealerRepo excelSearchLookupType(String value) throws Exception {
		System.out.println(_instance.getValue("SearchDealer.Searchdd"));
		keywords.SelectDropDown("id", _instance.getValue("SearchDealer.Searchdd"), value);
		return this;

	}

	public DealerRepo exceldataforSearchLookup(String value) throws Exception {
		keywords.clearEnter("id", _instance.getValue("SearchDealer.SearchText"), value);
		return this;
	}

	public DealerRepo clickLookup() throws Exception {
		keywords.click("id", _instance.getValue("SearchDealer.Lookup"));
		return this;
	}

	public String checkSearchResult() throws Exception {
		String DealerCode = keywords.getAttribute("id", _instance.getValue("SearchDealer.DealerCode"), "value");
		return DealerCode;
	}

	public DealerRepo crdSearch(String value) throws Exception {
		keywords.clearEnter("id", _instance.getValue("SearchDealer.crd"), value);
		return this;
	}

	public DealerRepo certSearch(String value) throws Exception {
		keywords.clearEnter("id", _instance.getValue("SearchDealer.cert"), value);
		return this;
	}

	public DealerRepo dealerCodeSearch(String value) throws Exception {
		keywords.clearEnter("id", _instance.getValue("SearchDealer.DealerCode"), value);
		return this;
	}

	public DealerRepo dealerNameSearch(String value) throws Exception {
		keywords.clearEnter("id", _instance.getValue("SearchDealer.DealerName"), value);
		return this;
	}

	public String dealerPageName() throws Throwable {
		String PageName = keywords.getAttribute("id", _instance.getValue("SearchDealer.pageName"), "value");
		return PageName;
	}

	public DealerRepo SearchButton() throws Exception {
		keywords.click("id", _instance.getValue("SearchDealer.Search"));
		return this;
	}

	public DealerRepo dealerType(String value) throws Exception {
		System.out.println(_instance.getValue("SearchDealer.dealerType"));
		keywords.SelectDropDown("id", _instance.getValue("SearchDealer.dealerType"), value);
		return this;
	}

	public DealerRepo firmChannelType(String value) throws Exception {
		System.out.println(_instance.getValue("SearchDealer.firmChannel"));
		keywords.SelectDropDown("id", _instance.getValue("SearchDealer.firmChannel"), value);
		return this;
	}

	public DealerRepo dealerChannelType(String value) throws Exception {
		System.out.println(_instance.getValue("SearchDealer.dealerChannels"));
		keywords.SelectDropDown("id", _instance.getValue("SearchDealer.dealerChannels"), value);
		return this;
	}

	// Above methods to read test data from excel
	// file*********************************
	// Methods for merge dealer

	public DealerRepo clickMergeDealerMenu() throws Exception {
		keywords.click("xpath", _instance.getValue("MergeDealer.MergeDealer"));
		return this;
	}

	public DealerRepo fromDealer(String value) throws Exception {

		keywords.clearEnter("xpath", _instance.getValue("MergeDealer.FromDealer"), value);
		// keywords.keyEnter();

		return this;
	}

	public DealerRepo clickFromCRD() throws Exception {
		keywords.click("id", _instance.getValue("MergeDealer.Fromcrd"));
		return this;
	}

	public DealerRepo toDealer(String value) throws Exception {
		keywords.clearEnter("xpath", _instance.getValue("MergeDealer.ToDealer"), value);
		return this;
	}

	public DealerRepo clickToCRD() throws Exception {
		keywords.click("id", _instance.getValue("MergeDealer.Tocrd"));
		return this;
	}

	public DealerRepo nextMergeDealer() throws Exception {
		keywords.click("id", _instance.getValue("MergeDealer.Next"));
		return this;
	}

	public DealerRepo updateMergeDealer() throws Exception {
		keywords.click("xpath", _instance.getValue("MergeDealer.Update"));
		return this;
	}

	public DealerRepo enterComments(String value) throws Exception {
		keywords.clearEnter("xpath", _instance.getValue("MergeDealer.comments"), value);
		return this;
	}

	public DealerRepo update2MergeDealer() throws Exception {
		keywords.click("xpath", _instance.getValue("MergeDealer.Update2"));
		return this;
	}

	public DealerRepo clickMergedDataTab() throws Exception {
		keywords.click("xpath", _instance.getValue("MergeDealer.mergedDataLink"));
		return this;
	}

	public String mergedDealer() throws Exception {
		String searchresult = keywords.getAttribute("xpath", _instance.getValue("MergeDealer.DealerCodeLink"), "value");
		return searchresult;
	}

	public String text() throws Exception {
		String acttext = keywords.getText("xpath", _instance.getValue("MergeDealer.ErrorMsg"));
		return acttext;

	}

//	public String checkStatus() throws Exception {
//		String Status = keywords.getAttribute("xpath", _instance.getValue("SearchDealer.Status"), "value");
//		return Status;
//	}
//	public String checkStatus() throws Exception {
//		String Status = keywords.verifyDropDownVisibleText("xpath", _instance.getValue("SearchDealer.Status"), "value");
//		return Status;
//	}
	public String checkStatus() throws Exception {
		String Status = keywords.getDropDownVisibleText("xpath", _instance.getValue("SearchDealer.Status"));
		return Status;
	}
//	public String mergeRIAtoDCIO() throws Exception {
//		String Status = keywords.getDropDownVisibleText("xpath", _instance.getValue("MergeDealer.RIAtoDCIO"));
//		return Status;
//	}
	

	// ----------------Create Dealer---------------------------------//

	// Click on Create Dealer Menu

	public DealerRepo clickCreateDealerMenu() throws Exception {
		keywords.click("xpath", _instance.getValue("createdealer.CreateDealerMenu"));
		return this;
	}

	// Enter Dealer Name
	public DealerRepo enterDealerName(String value) throws Exception {
		keywords.clearEnter("xpath", _instance.getValue("createdealer.DealerName"), value);
		return this;
	}

	// Select Dealer Type DropdownBox
	public DealerRepo SelectDealerType(String value) throws Exception {
		keywords.SelectDropDown("xpath", _instance.getValue("createdealer.DealerType"), value);
		return this;
	}

	// Enter CRD#
	public DealerRepo enterCRD(String value) throws Exception {
		keywords.enterData("xpath", _instance.getValue("createdealer.CRD"), value);
		return this;
	}

	// Select VAIO Segment
	public DealerRepo VAIOsegment(String value) throws Exception {
		keywords.SelectDropDown("xpath", _instance.getValue("createdealer.VaioSegment"), value);
		return this;
	}

	// Click on Next Button
	public DealerRepo nextButton() throws Exception {
		keywords.click("xpath", _instance.getValue("createdealer.NextButton"));
		return this;
	}

	// Enter Address

	public DealerRepo enterAdd(String add1, String add2, String add3, String city, String zip, String zipx)
			throws Exception {
		keywords.clearEnter("xpath", _instance.getValue("createdealer.Address1"), add1);
		keywords.clearEnter("xpath", _instance.getValue("createdealer.Address2"), add2);
		keywords.clearEnter("xpath", _instance.getValue("createdealer.Address3"), add3);
		keywords.clearEnter("xpath", _instance.getValue("createdealer.City"), city);
		keywords.clearEnter("xpath", _instance.getValue("createdealer.Zip"), zip);
		keywords.clearEnter("xpath", _instance.getValue("createdealer.Zip+"), zipx);
		return this;

	}

	// Select State in Address
	public DealerRepo SelectState(String value) throws Exception {
		keywords.SelectDropDown("xpath", _instance.getValue("createdealer.State"), value);
		return this;
	}

	// Select Country in Address
	public DealerRepo SelectCountry(String value) throws Exception {
		keywords.SelectDropDown("xpath", _instance.getValue("createdealer.Country"), value);
		return this;
	}

	// Cleansed Address Button
	public DealerRepo ButtonCleansedAddress() throws Exception {
		keywords.click("xpath", _instance.getValue("createdealer.CleansedAddess"));
		return this;
	}

	// Original Address Button
	public DealerRepo OriginalAddress() throws Exception {
		keywords.click("xpath", _instance.getValue("createdealer.originalAddress"));
		return this;
	}

	// Enter Dealer Contact Information

	public DealerRepo DealerPhoneandFax(String val1, String val2, String val3) throws Exception {
		keywords.clearEnter("xpath", _instance.getValue("createdealer.DealerPhoneNumber"), val1);
		keywords.clearEnter("xpath", _instance.getValue("createdealer.DPNx"), val2);
		keywords.clearEnter("xpath", _instance.getValue("createdealer.DealerFaxNumber"), val3);
		return this;
	}

	// Enter Dealers Website

	public DealerRepo DealerWebAddress(String value) throws Exception {
		keywords.enterData("xpath", _instance.getValue("createdealer.WebsiteAddress"), value);

		return this;
	}

	// Select Channel

	public DealerRepo SelectChannel(String value) throws Exception {
		keywords.SelectDropDown("xpath", _instance.getValue("createdealer.Channel"), value);
		return this;
	}

	// Add Channel Button

	public DealerRepo ChannelButton() throws Exception {
		keywords.click("xpath", _instance.getValue("createdealer.AddChannel"));
		return this;
	}
	// Select Radio Button ---- by default set for 1st radio

	public DealerRepo PrimaryRadio() throws Exception {
		keywords.radioClick("id", _instance.getValue("createdealer.primaryRadio"));
		return this;
	}

	// Click on Submit Button
	public DealerRepo submitButton() throws Exception {
		keywords.click("xpath", _instance.getValue("createdealer.SubmitButton"));
		return this;
	}

	// Select Activate Terminate Status
	public DealerRepo Status(String value) throws Exception {
		keywords.SelectDropDown("xpath", _instance.getValue("createdealer.activateterminate"), value);
		return this;
	}

	// Dealer Present Status

	public String presentStatus() throws Exception {
		WebElement actualheading = keywords.elementFind("xpath", _instance.getValue("createdealer.statusofdealer"));
		String aheading = actualheading.getText();
		return aheading;
	}

	// get value of heading
	public String MaintainHeading() throws Exception {
		WebElement heading = keywords.elementFind("xpath", _instance.getValue("createdealer.maintainheading"));
		String hey = heading.getText();
		return hey;
	}

	// get value of dealer name from the text box
	public String getdealerName() throws Exception {
		String getdlername = keywords.getAttribute("xpath", _instance.getValue("createdealer.getdealername"), "value");
		return getdlername;
	}

	// get value of dealer code from the text box
	public String getdealercode() throws Exception {
		String getdlercode = keywords.getAttribute("xpath", _instance.getValue("createdealer.getdealercode"), "value");
		return getdlercode;
	}

	// get value of dealer name from the text box
	public String getsalesdealerName() throws Exception {
		String getdlername = keywords.getAttribute("xpath", _instance.getValue("createdealer.salesdealer"), "value");
		return getdlername;
	}

	// get value of dealer name from the text box
	public String getdealername() throws Exception {
		String getdlercode = keywords.getAttribute("xpath", _instance.getValue("createdealer.DealerName"), "value");
		return getdlercode;
	}

	// get value of Maintain full message
	public String actualHeading() throws Exception {
		WebElement actualheading = keywords.elementFind("xpath", _instance.getValue("createdealer.heading"));
		String aheading = actualheading.getText();
		return aheading;
	}

	// Dealer Success Notification
	public String notificationDealer() throws Exception {
		WebElement actualheading = keywords.elementFind("xpath",
				_instance.getValue("createdealer.notificationsuccess"));
		String aheading = actualheading.getText();
		return aheading;

	}

	// Clear and Enter new CRD
	public DealerRepo enterCRD1(String value) throws Exception {
		keywords.clearEnter("xpath", _instance.getValue("createdealer.CRD"), value);
		return this;
	}

	// Click on Update Button
	public DealerRepo updateButton() throws Exception {
		keywords.click("xpath", _instance.getValue("createdealer.update"));
		return this;
	}

	// Click on Search Below Button
	public DealerRepo searchBelowButton() throws Exception {
		keywords.click("xpath", _instance.getValue("createdealer.searchbelow"));
		return this;
	}

	// Click on Search Link
	public DealerRepo searchLink() throws Exception {
		keywords.elementFind("xpath", _instance.getValue("createdealer.searchlink")).click();
		;
		return this;
	}
	// Clear and Enter Sales Dealer

	public DealerRepo enterSalesDealer(String value) throws Exception {
		keywords.clearEnter("xpath", _instance.getValue("createdealer.salesdealer"), value);
		return this;
	}
}
