package com.surveillance.pages;

import com.surveillance.utilitiy.GenericKeywords;
import com.surveillance.utilitiy.PropertySingleton;

public class BoxPage {
	
		PropertySingleton _instance = null;

		public BoxPage() 
		{
			_instance = PropertySingleton.getInstance();
		}

		public GenericKeywords keywords = new GenericKeywords("BoxPage");
		
		public BoxPage clickonNewBox()
		{
			keywords.jsClick("xpath", _instance.getValue("BoxesPage.BTN_NewBox"));
			keywords.waitForPageLoad();
			return this;
		}
		public BoxPage enterBoxVersion(String value) throws Exception
		{
			keywords.enterData("xpath", _instance.getValue("BoxesPage.LBL_BoxVersion"), value);
			keywords.waitForPageLoad();
			return this;
	}
		public BoxPage enterRevisionNumber(String value) throws Exception
		{
			keywords.enterData("xpath", _instance.getValue("BoxesPage.LBL_RevisionNumber"), value);
			return this;
	}
		public BoxPage enterDescription(String value) throws Exception
		{
			keywords.enterData("xpath", _instance.getValue("BoxesPage.LBL_Description"), value);
			return this;
	}

		public BoxPage enterDocumentationURL(String value) throws Exception
		{
			keywords.enterData("xpath", _instance.getValue("BoxesPage.LBL_DocumentationURL"), value);
			return this;
	}
		public BoxPage clickonSave()
		{
			keywords.jsClick("xpath", _instance.getValue("BoxesPage.BTN_Save"));
			return this;
		}
		public BoxPage clickonHardware()
		{
			keywords.jsClick("xpath", _instance.getValue("BoxesPage.BTN_Hardware"));
			keywords.waitForPageLoad();
			return this;
		}
		public BoxPage clickonBoxes()
		{
			keywords.jsClick("xpath", _instance.getValue("BoxesPage.BTN_Boxes"));
			keywords.waitForPageLoad();
			return this;
		}
		public BoxPage enterBoxes(String value) throws Exception
		{
			keywords.enterData("xpath", _instance.getValue("BoxesPage.LBL_Boxes"), value);
			return this;
	}
		public BoxPage clickonSearch()
		{
			keywords.jsClick("xpath", _instance.getValue("BoxesPage.BTN_Search"));
			keywords.waitForPageLoad();
			return this;
		}
		 public String verifyBoxVersionisrequired() throws Exception {
		    	String Data= keywords.getText("xpath", _instance.getValue("BoxesPage.LBL_BoxVersionisrequired"));
		    	return Data;
		 }
		
}
