package Testscripts.regression;

import org.testng.annotations.Test;

import base.BaseTest;
import keywords.ApplicationKeywords;

public class ValidateLoginUsingKeywordDriven extends BaseTest{

	@Test
	public void validateLoginTest()
	{
		
		ApplicationKeywords app=new ApplicationKeywords();
		
		app.openBrowser();
		app.launchapp();
		
		app.type("username_textbox", "Aaquib123");
		app.type("password_textbox", "Aaquib12@");
	    app.click("login_button");
		
	   app.validateTitle("Adactin.com - Search Hotel");
		
	    app.close();
	}
}
