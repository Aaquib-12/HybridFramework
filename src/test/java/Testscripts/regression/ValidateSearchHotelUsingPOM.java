package Testscripts.regression;

import java.util.HashMap;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Pages.LoginPage;
import Pages.SearchHotelPage;
import base.BaseTest;
import utils.UtilKit;


public class ValidateSearchHotelUsingPOM extends BaseTest{
	
	
@Test(dataProvider="getData")
public void validatesearchhotel(HashMap<String, String> dataMap) throws InterruptedException
{
	
	
	LoginPage loginPage=new LoginPage();
	loginPage.usernameTextbox(dataMap.get("username"));
	loginPage.passwordTextbox(dataMap.get("password"));
	loginPage.loginButton();
	Thread.sleep(3000);
	
	SearchHotelPage searchHotelPage=new SearchHotelPage();
	
//	Assert.assertTrue(false);
	
	searchHotelPage.validateTitle(dataMap.get("Expected Title1"));
	
	searchHotelPage.locationDropDown(dataMap.get("Location"));
	searchHotelPage.hotelDropDown(dataMap.get("Hotels"));
	searchHotelPage.roomtypeDropDown(dataMap.get("Room Type"));
	searchHotelPage.noOfRoomsDropDown(dataMap.get("Number of Rooms"));
	searchHotelPage.checkInDateTextBox(dataMap.get("Check In Date"));
	searchHotelPage.checkOutDateTextBox(dataMap.get("Check Out Date"));
	searchHotelPage.adultperRoomDropDown(dataMap.get("Adults per Room"));
	searchHotelPage.childrenperRoomDropDown(dataMap.get("Children per Room"));
	searchHotelPage.searchhotelbutton();
	
	
}
	
	
@DataProvider
public Object[][] getData()
{
	Object[][] data=new Object[1][1];
	data[0][0]=UtilKit.getTestData("TC-102");
	
return data;
}
	
	
	
	
	
	
	

}
