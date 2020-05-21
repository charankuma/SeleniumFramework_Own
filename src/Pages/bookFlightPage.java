package Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.basePage;

public class bookFlightPage extends basePage {
	
	
@FindBy(name="passFirst0")
WebElement FirstName;

@FindBy(name="passLast0")
WebElement LastName;

@FindBy(name="creditnumber")
WebElement CreditNumber;

@FindBy(name="buyFlights")
WebElement securePurchase;
public bookFlightPage()
{
	PageFactory.initElements(driver, this);
}

public void pageTitle()
	{
		driver.getTitle();
	}

public void details(String fname,String lname,String Cnumber)
{
	FirstName.sendKeys(fname);
	LastName.sendKeys(lname);
	CreditNumber.sendKeys(Cnumber);
	
}


public conformationPage clickbuyFlights() throws IOException 
{
	securePurchase.click();
	return new conformationPage();
}













}
