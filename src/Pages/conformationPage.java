package Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.basePage;

public class conformationPage extends basePage {
	
	@FindBy(xpath="/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[7]/td/table/tbody/tr/td[3]/a/img")
WebElement Logout;
	
public 	conformationPage() throws IOException
{
	PageFactory.initElements(driver, this);
}

public void pageTitle()
{
	driver.getTitle();
}
	
	
public homepage clicklogout() throws IOException
{
	Logout.click();
	return new homepage();

}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
