package keywords;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class ValidationKeywords extends GenericKeywords{
	
	//WebDriver driver;
	public void validateTitle(String expTitle)
	{
		
		Assert.assertEquals(driver.getTitle(), expTitle);
		
	}
	
	

}
