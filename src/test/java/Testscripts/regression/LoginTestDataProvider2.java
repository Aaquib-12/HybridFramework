package Testscripts.regression;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTestDataProvider2 extends BaseTest{


WebDriver driver;

@BeforeMethod	
public void setUp()
{
	String browserName=configProperties.getProperty("browser");
	
	if(browserName.equals("chrome"))
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
	}
	
	else if(browserName.equals("edge"))
	{
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
	}
	
	else if(browserName.equals("firefox"))
	{
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
	}
	
	
	driver.get(configProperties.getProperty("url"));
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Long.parseLong(configProperties.getProperty("implicitWait"))));

}
	
 @Test(dataProvider="getData")
 public void logintest(String uName, String pwd, String expTitle)
 {
    driver.findElement(By.name("username")).sendKeys(uName);
    driver.findElement(By.name("password")).sendKeys(pwd);
	driver.findElement(By.name("login")).click(); 
	 
	
	Assert.assertEquals(driver.getTitle(), expTitle);
	
}
	
@DataProvider
public Object[][] getData()
{
	
	Object[][] data=new Object[4][3];
	
	data[0][0]="Aaquib123";
	data[0][1]="Aaquib12@";
	data[0][2]="Adactin.com - Search Hotel";
			
	data[1][0]="Aaquib123";		
	data[1][1]="Aaquib125";
	data[1][2]="Adactin.com - Hotel Reservation System";
	
	data[2][0]="Aaquib129";	
	data[2][1]="Aaquib12@";	
	data[2][2]="Adactin.com - Hotel Reservation System";
	
	
	data[3][0]="Aaquib456";
	data[3][1]="Aaquib987";
	data[3][2]="Adactin.com - Hotel Reservation System";
	
	
	return data;
	
	
}

@AfterMethod	
public void tearDown() 
{
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	driver.quit();
}












}
