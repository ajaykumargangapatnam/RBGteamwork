package com.surveillance.pages;

import com.surveillance.utilitiy.GenericKeywords;
import com.surveillance.utilitiy.PropertySingleton;

public class UserInformationPage 
{
	PropertySingleton _instance = null;

	public UserInformationPage() {
		_instance = PropertySingleton.getInstance();
	}

	public GenericKeywords keywords = new GenericKeywords("UserInformationPage");
	
	
	public UserInformationPage clickOnEdit() throws Throwable
	{
		keywords.scrollElementfound("xpath", _instance.getValue("UserInformationPage.BTN_Edit"));
		keywords.jsClick("xpath", _instance.getValue("UserInformationPage.BTN_Edit"));
		return this;
	}
	
	public UserInformationPage clickOnD3CommandCenter() throws Throwable
	{
		keywords.scrollElementfound("xpath", _instance.getValue("UserInformationPage.CHK_D3CommandCenter"));
		keywords.jsClick("xpath", _instance.getValue("UserInformationPage.CHK_D3CommandCenter"));
		return this;
	}
	
	public UserInformationPage SelectPolicie(String Data) throws Throwable
	{
		keywords.scrollElementfound("xpath", _instance.getValue("UserInformationPage.Select_Policies"));
		keywords.SelectDropDown("xpath", _instance.getValue("UserInformationPage.Select_Policies"), Data);
		return this;
	}
	
	public UserInformationPage SelectQueues(String Data)
	{
		keywords.SelectDropDown("xpath", _instance.getValue("UserInformationPage.Select_Queues"), Data);
		return this;
	}
	
	public UserInformationPage clickOnPolicieAdd()
	{
		keywords.jsClick("xpath", _instance.getValue("UserInformationPage.BTN_PoliciesAdd"));
		return this;
	}
	
	public UserInformationPage clickOnQueuesAdd()
	{
		keywords.jsClick("xpath", _instance.getValue("UserInformationPage.Select_QueuesAdd"));
		return this;
	}
}