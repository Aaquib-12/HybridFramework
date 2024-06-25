package keywords;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import base.BaseTest;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GenericKeywords extends BaseTest {
	
	public void openBrowser()
	{
		
		String browserName=configProperties.getProperty("browser");
		
		if(browserName.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		
		}
	
		public void launchapp() {
			driver.get(configProperties.getProperty("url"));
			driver.manage().window().maximize();
			driver.manage().timeouts()
					.implicitlyWait(Duration.ofSeconds(Long.parseLong(configProperties.getProperty("implicitWait"))));

		}	

	public WebElement getElement(String locatorkey)
	{
		WebElement element=null;
		
	   element=driver.findElement(getlocator(locatorkey));	
		
		
		return element;
		
	}
		
	public By getlocator(String locatorkey)
	{
		By by=null;
		
		if(locatorkey.endsWith("_id"))
		{
			by=By.id(locatorProperties.getProperty(locatorkey));
		}
		else if(locatorkey.endsWith("_name"))
		{
			by=By.name(locatorProperties.getProperty(locatorkey));
		}
		else if(locatorkey.endsWith("_linktext"))
		{
			by=By.linkText(locatorProperties.getProperty(locatorkey));
		}
		else if(locatorkey.endsWith("_xpath"))
		{
			by=By.xpath(locatorProperties.getProperty(locatorkey));
		}
		else
		{
			by=By.xpath(locatorProperties.getProperty(locatorkey));
		}
		return by;
	}
		
	public void click(String locatorkey)
	{
		getElement(locatorkey).click();
		
	}
	
	public void clear(String locatorkey)
	{
		getElement(locatorkey).clear();		
	}
	
	public void type(String locatorkey, String text)
	{
		getElement(locatorkey).sendKeys(text);
	}
	
	public void selectOptionFromDropdown(String locatorkey, String option)
	{
		new Select(getElement(locatorkey)).selectByVisibleText(option);
	}
	
	public void close()
	{
		driver.quit();
	}
	
}
