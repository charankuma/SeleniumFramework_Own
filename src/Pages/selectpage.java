package Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.basePage;

public class selectpage extends basePage {
	
	@FindBy(name="reserveFlights")
	WebElement ReserveFlights;
	
	public selectpage() 
	{
		PageFactory.initElements(driver, this);
	}
	
	public bookFlightPage clickContinue() throws IOException
	{
		ReserveFlights.click();
		return new bookFlightPage();
	}

}
