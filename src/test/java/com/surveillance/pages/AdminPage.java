package com.surveillance.pages;

import com.surveillance.utilitiy.GenericKeywords;
import com.surveillance.utilitiy.PropertySingleton;

public class AdminPage 
{
	PropertySingleton _instance = null;

	public AdminPage() 
	{
		_instance = PropertySingleton.getInstance();
	}

	public GenericKeywords keywords = new GenericKeywords("AdminPage");
	
	public AdminPage clickOnUsersLink()
	{
		keywords.jsClick("xpath", _instance.getValue("AdminPage.Users"));
		return this;
	}
	
	
	public AdminPage enterTheDataForFiletr(String Data)
	{
		keywords.enterData("xpath", _instance.getValue("AdminPage.Edit_Filter"),Data);
		return this;
	}
	
	public AdminPage clickNotificationFirstLink()
	{
		keywords.jsClick("xpath", _instance.getValue("AdminPage.NotificationFirstLink"));
		return this;
	}
	
	
}
