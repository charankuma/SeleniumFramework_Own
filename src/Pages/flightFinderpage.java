package Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.basePage;

public class flightFinderpage extends basePage {
	
	@FindBy(xpath="//input[@value=\'roundtrip\']")
	WebElement RoundTrip;
	
	@FindBy(xpath="//input[@value=\'oneway\']")
	WebElement OneWay;
	
	@FindBy(name="findFlights")
	WebElement Continue;
	
	public flightFinderpage() throws IOException
	{
		
		PageFactory.initElements(driver, this);
	}
	
	public void pageTitle()
	{
		driver.getTitle();
	}
	
	public selectpage clickContinue() throws InterruptedException, IOException
	{
		
		Continue.click();
		return new selectpage();
		
	}

}
