package com.surveillance.pages;

import com.surveillance.utilitiy.GenericKeywords;
import com.surveillance.utilitiy.PropertySingleton;

public class LoginPage 
{
	PropertySingleton _instance = null;

	public LoginPage() {
		_instance = PropertySingleton.getInstance();
	}

	public GenericKeywords keywords = new GenericKeywords("LoginPage");
	
	
	
	public LoginPage enterLoginEmail(String value) throws Exception {
		keywords.clearEnter("xpath", _instance.getValue("loginPage.Edit_userName"), value);
		return this;
	}
	
	public LoginPage clickOnLogin() throws Exception {
		keywords.jsClick("xpath", _instance.getValue("loginPage.BTN_Login"));
		return this;
	}
	
	public LoginPage enterPassword(String value) throws Exception {
		keywords.enterData("xpath", _instance.getValue("loginPage.Edit_Password"), value);
		return this;
	}
	
//	public LoginPage enterPassword(String value) throws Exception {
//		keywords.enterData("xpath", _instance.getValue("loginPage.Edit_Password"), value);
//		return this;
//	}
	
}
