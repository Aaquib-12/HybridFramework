package Testscripts.regression;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;
import utils.UtilKit;


public class LoginTestDataProviderExcel extends BaseTest{
	

//WebDriver driver;


@Test(dataProvider="getData")
public void logintest(HashMap<String, String> dataMap)
{
	
   driver.findElement(By.name("username")).sendKeys(dataMap.get("username"));	
   driver.findElement(By.name("password")).sendKeys(dataMap.get("password"));	
   driver.findElement(By.name("login")).click();	
	
   Assert.assertEquals(driver.getTitle(), dataMap.get("Expected Title"));
   
   
}
	

@DataProvider

public Object[][] getData()
{
	
	Object[][] data=new Object[1][1];	
	
	data[0][0]=UtilKit.getTestData("TC-100");
	
	
	return data;
}



	

}
