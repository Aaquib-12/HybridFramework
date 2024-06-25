package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SearchHotelPage extends BasePage{
	
	
public 	SearchHotelPage()
{
	
	PageFactory.initElements(driver, this);
}
	
	
	
@FindBy(xpath="//select[@name='location']")	
WebElement 	locationDropDown;
	
@FindBy(xpath="//select[@name='hotels']")	
WebElement hotelDropDown ;

@FindBy(xpath="//select[@name='room_type']")	
WebElement roomtypeDropDown ;
	
@FindBy(xpath="//select[@name='room_nos']")	
WebElement noOfRoomsDropDown ;

@FindBy(xpath="//input[@name='datepick_in']")	
WebElement checkInDateTextBox ;

@FindBy(xpath="//input[@name='datepick_out']")	
WebElement checkOutDateTextBox ;

@FindBy(xpath="//select[@name='adult_room']")	
WebElement adultperRoomDropDown;

@FindBy(xpath="//select[@name='child_room']")	
WebElement childrenperRoomDropDown;

@FindBy(xpath="//input[@name='Submit']")
WebElement searchhotelbutton;


public void locationDropDown(String option)

{
	new Select(locationDropDown).selectByVisibleText(option);
}

public void hotelDropDown(String option)

{
	new Select(hotelDropDown).selectByVisibleText(option);
}

public void roomtypeDropDown(String option)

{
	new Select(roomtypeDropDown).selectByVisibleText(option);
}

public void noOfRoomsDropDown(String option)

{
	new Select(noOfRoomsDropDown).selectByVisibleText(option);
}

public void checkInDateTextBox(String date)

{
	checkInDateTextBox.clear(); 
	checkInDateTextBox.sendKeys(date); 
}

public void checkOutDateTextBox(String date)

{
	checkOutDateTextBox.clear(); 
	checkOutDateTextBox.sendKeys(date); 
}

public void adultperRoomDropDown(String option)

{
	new Select(adultperRoomDropDown).selectByVisibleText(option);
}

public void childrenperRoomDropDown(String option)

{
	new Select(childrenperRoomDropDown).selectByVisibleText(option);
}

public void searchhotelbutton()
{
	searchhotelbutton.click();
}


}
