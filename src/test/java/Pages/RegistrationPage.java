package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage extends BasePage{
	

	public RegistrationPage()
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//input[@name='username']")
	WebElement usernametextbox;

	@FindBy(xpath="//input[@name='password']")
	WebElement passwordtextbox;

	@FindBy(xpath="//input[@name='re_password']")
	WebElement confirmPasswordtextbox;

	@FindBy(xpath="//input[@name='full_name']")
	WebElement fullNametextbox;
	
	@FindBy(xpath="//input[@name='email_add']")
	WebElement emailtextbox;
	
	@FindBy(xpath="//input[@name='captcha']")
	WebElement captchatextbox;
	
	@FindBy(xpath="//input[@name='tnc_box']")
	WebElement termsAndConditionscheckbox;
	
	@FindBy(xpath="//input[@name='Submit']")
	WebElement registerbutton;
	
	
	public void usernametextbox(String text)
	{
		usernametextbox.sendKeys(text);
		test.info("Entered Text "+ text);
	}
	
	public void passwordtextbox(String text)
	{
		passwordtextbox.sendKeys(text);
		test.info("Entered Text "+ text);
	}
	public void confirmPasswordtextbox(String text)
	{
		confirmPasswordtextbox.sendKeys(text);
		test.info("Entered Text "+ text);
	}
	public void fullNametextbox(String text)
	{
		fullNametextbox.sendKeys(text);
		test.info("Entered Text "+ text);
	}
	public void emailtextbox(String text)
	{
		emailtextbox.sendKeys(text);
		test.info("Entered Text "+ text);
	}
	public void captchatextbox(String text)
	{
		captchatextbox.sendKeys(text);
		test.info("Entered Text "+ text);
	}
	public void termsAndConditionscheckbox()
	{
		captchatextbox.click();
		test.info("Clicked Checkbox");
	}
	
	public void registerbutton()
	{
		registerbutton.click();
		test.info("Clicked submit button");
	}
}
