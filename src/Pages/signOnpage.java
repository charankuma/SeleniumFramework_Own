package Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.basePage;
import Utility.utilityPage;

public class signOnpage extends basePage {
	
	
	@FindBy(name="userName")
	WebElement Username;
		
	@FindBy(name="password")	
	WebElement Password;

	@FindBy(name="login")
	WebElement submit;
	
	public signOnpage()
	{
		
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	
	public void pagetitle()
	{
		driver.getTitle();
	}
	
	public void userName(String useID,String pwd)
	{
		System.out.println();
		Username.sendKeys(useID);
System.out.println(Username);
		Password.sendKeys(pwd);
	}

	public flightFinderpage signIN() throws IOException, InterruptedException 
	{
	//	Thread.sleep(3000);
		//utilityPage.supersmartWait(submit);
	submit.click();
	utilityPage.pics();
		return new flightFinderpage();
	}
	

}
