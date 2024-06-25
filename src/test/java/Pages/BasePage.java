package Pages;

import org.testng.Assert;

import base.BaseTest;

public class BasePage extends BaseTest{
	
	public void validateTitle(String expTitle) {

		Assert.assertEquals(driver.getTitle(), expTitle);
        test.info("Titles Matched"); 
	}

}
