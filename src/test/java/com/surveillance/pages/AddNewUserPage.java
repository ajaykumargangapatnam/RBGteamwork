package com.surveillance.pages;

import com.surveillance.utilitiy.GenericKeywords;
import com.surveillance.utilitiy.PropertySingleton;

public class AddNewUserPage 
{
PropertySingleton _instance = null;
	
	public AddNewUserPage() 
	{
		_instance = PropertySingleton.getInstance();
	}

	public GenericKeywords keywords = new GenericKeywords("CameraPage");
	
	
	public AddNewUserPage enterEmailAddress(String Data)
	{
		keywords.enterData("xpath", _instance.getValue("AddNewUser.Edit_EmailAddress"),Data);
		return this;
	}
	
	public AddNewUserPage clickOnOTS()
	{
		keywords.jsClick("xpath", _instance.getValue("AddNewUser.checkTOS"));
		return this;
	}
	
	public AddNewUserPage selectClients(String Data)
	{
		keywords.SelectDropDown("xpath", _instance.getValue("AddNewUser.DropDown_Clients"),Data);
		return this;
	}
	
	public AddNewUserPage enterName(String Data)
	{
		keywords.enterData("xpath", _instance.getValue("AddNewUser.Edit_Name"),Data);
		return this;
	}
	
	public AddNewUserPage enterTitle(String Data)
	{
		keywords.enterData("xpath", _instance.getValue("AddNewUser.Edit_Title"),Data);
		return this;
	}
	
	public AddNewUserPage selectSteamingPlayer(String Data)
	{
		keywords.SelectDropDown("xpath", _instance.getValue("AddNewUser.Dropdown_SteamingPlayer"),Data);
		return this;
	}
	
	public AddNewUserPage enterStreetAddress(String Data)
	{
		keywords.enterData("xpath", _instance.getValue("AddNewUser.Edit_StreetAddress"),Data);
		return this;
	}
	
	
	public AddNewUserPage enterInternationalQuadrant(String Data)
	{
		keywords.enterData("xpath", _instance.getValue("AddNewUser.Edit_InternationalQuadrant"),Data);
		return this;
	}
	
	public AddNewUserPage enterCity(String Data)
	{
		keywords.enterData("xpath", _instance.getValue("AddNewUser.Edit_City"),Data);
		return this;
	}
	
	public AddNewUserPage selectState(String Data)
	{
		keywords.SelectDropDown("xpath", _instance.getValue("AddNewUser.DropDown_State"),Data);
		return this;
	}
	
	public AddNewUserPage enterZip(String Data)
	{
		keywords.enterData("xpath", _instance.getValue("AddNewUser.Edit_Zip"),Data);
		return this;
	}
	public AddNewUserPage selectCountry(String Data)
	{
		keywords.SelectDropDown("xpath", _instance.getValue("AddNewUser.DropDown_Country"),Data);
		return this;
	}
	public AddNewUserPage selectTimeZon(String Data)
	{
		keywords.SelectDropDown("xpath", _instance.getValue("AddNewUser.DropDown_TimeZone"),Data);
		return this;
	}
	
	public AddNewUserPage enterPhoneNumber(String Data)
	{
		keywords.enterData("xpath", _instance.getValue("AddNewUser.Edit_Phone"),Data);
		return this;
	}
	
	public AddNewUserPage enterMobileNumber(String Data)
	{
		keywords.enterData("xpath", _instance.getValue("AddNewUser.Edit_Mobile"),Data);
		return this;
	}
	
	public AddNewUserPage selectExpMonth(String Data)
	{
		keywords.SelectDropDown("xpath", _instance.getValue("AddNewUser.DropDown_ExpMonth"),Data);
		return this;
	}
	public AddNewUserPage selectExpDay(String Data)
	{
		keywords.SelectDropDown("xpath", _instance.getValue("AddNewUser.DropDown_ExpDay"),Data);
		return this;
	}
	public AddNewUserPage selectExpYear(String Data)
	{
		keywords.SelectDropDown("xpath", _instance.getValue("AddNewUser.DropDown_ExpYear"),Data);
		return this;
	}
	public AddNewUserPage selectRole(String Data)
	{
		keywords.SelectDropDown("xpath", _instance.getValue("AddNewUser.DropDown_Role"),Data);
		return this;
	}
	
	
	public AddNewUserPage selectNotificationProtocol(String Data)
	{
		keywords.SelectDropDown("xpath", _instance.getValue("AddNewUser.DropDown_NotificationProtocol"),Data);
		return this;
	}
	
	
	public AddNewUserPage clickD3Coomand()
	{
		keywords.jsClick("xpath", _instance.getValue("AddNewUser.Chek_D3Coomand"));
		return this;
	}
	
	public AddNewUserPage enterDefaultlandingPage(String Data)
	{
		keywords.enterData("xpath", _instance.getValue("AddNewUser.Edit_DefaultlandingPage"),Data);
		return this;
	}
	
	public AddNewUserPage clickonCancel()
	{
		keywords.jsClick("xpath", _instance.getValue("AddNewUser.BTN_cancel"));
		return this;
	}
	
	public AddNewUserPage clickonAddNewUser()
	{
		keywords.jsClick("xpath", _instance.getValue("AddNewUser.BTN_AddNewUser"));
		return this;
	}
	
	public AddNewUserPage clickonAddNewUserAndEdituserCameraRights()
	{
		keywords.jsClick("xpath", _instance.getValue("AddNewUser.BTN_AddNewUserAndEdituserCameraRights"));
		return this;
	}
		
}
