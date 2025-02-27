package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {
	

	public LoginPage()
	{
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@name='username']")
	WebElement usernameTextbox;
    
	@FindBy(xpath="//input[@name='password']")
	WebElement passwordTextbox;
	
	@FindBy(xpath="//input[@name='login']")
	WebElement loginButton;
	
	@FindBy(xpath="//a[text()='New User Register Here']")
	WebElement registrationLink;
	
	public void usernameTextbox(String text)
	{
		usernameTextbox.sendKeys(text);
		test.info("Entered Text "+ text);
	}
	public void passwordTextbox(String text)
	{
		passwordTextbox.sendKeys(text);
		test.info("Entered text "+ text);
	}
	public void loginButton()
	{
		loginButton.click();
		test.info("Clicked login Button");
	}
	
	public void registrationLink()
	{
		registrationLink.click();
		test.info("Clicked Registration Button");
	}

	
	
}
