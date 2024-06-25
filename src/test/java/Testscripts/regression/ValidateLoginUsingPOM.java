package Testscripts.regression;

import java.util.HashMap;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Pages.LoginPage;
import base.BaseTest;
import utils.UtilKit;


public class ValidateLoginUsingPOM extends BaseTest{

	
@Test(dataProvider="getData")	
public void logintest(HashMap<String, String> dataMap)
{
	
	LoginPage loginpage=PageFactory.initElements(driver, LoginPage.class);
	
	loginpage.usernameTextbox(dataMap.get("username"));
	loginpage.passwordTextbox(dataMap.get("password"));
	loginpage.loginButton();
	
	
	loginpage.validateTitle(dataMap.get("Expected Title"));
	
	
}
	
@DataProvider
public Object[][] getData()
{
	Object[][] data=new Object[1][1];
	data[0][0]=UtilKit.getTestData("TC-100");
	
	return data;
}
	
	
}
