package Testscripts.regression;

import java.util.HashMap;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Pages.LoginPage;
import Pages.RegistrationPage;
import base.BaseTest;
import utils.UtilKit;


public class ValidateRegistrationusingPOM extends BaseTest{
	
	
	@Test(dataProvider="getData")
	public void registrationtest(HashMap<String, String> dataMap) throws InterruptedException
	{
		
		LoginPage loginPage=new LoginPage();
		
		loginPage.registrationLink();
		Thread.sleep(3000);
		
		RegistrationPage registrationPage=new RegistrationPage();
		
		//Assert.assertTrue(false);
		
		registrationPage.validateTitle(dataMap.get("Expected Title"));
		
		registrationPage.usernametextbox(dataMap.get("Username"));
		registrationPage.passwordtextbox(dataMap.get("Password"));
		registrationPage.confirmPasswordtextbox(dataMap.get("Confirm Password"));
		//Assert.assertTrue(false);
		registrationPage.fullNametextbox(dataMap.get("Full Name"));
		registrationPage.emailtextbox(dataMap.get("Email Address"));
		registrationPage.captchatextbox(dataMap.get("Captcha Text"));
		registrationPage.termsAndConditionscheckbox();
		
		
		
	}
	
@DataProvider
public Object[][] getData()
{
	Object[][] data=new Object[1][1];
	data [0][0]=UtilKit.getTestData("TC-101");
	
	return data;
}
	
	
	

}
