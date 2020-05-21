package Utility;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;



import Base.basePage;
import testConstants.testConstantsPage;

public class utilityPage extends basePage {
	
	
	

	public static  void  supersmartWait(WebElement ele)
	{
	System.out.println(ele);
		
		WebDriverWait wait=new WebDriverWait(driver,testConstantsPage.timeunit);
		
		System.out.println(testConstantsPage.timeunit);
		
		wait.until(ExpectedConditions.elementToBeClickable(ele));
		
		System.out.println(ele);
	}
	
	
	public static void pics() throws IOException 
{
		TakesScreenshot screen=(TakesScreenshot)driver;
		
	java.io.File file=	screen.getScreenshotAs(OutputType.FILE);
		

	FileHandler.copy(file, new java.io.File("./Scrrenshots/"+timestamp()+".png"));
	SimpleDateFormat format=new SimpleDateFormat();

	
	System.out.println("Screenshot taken");
}
	public static String timestamp() 
	{
	    return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
	}
	
	
	public static void closing()
	{
		driver.close();
	}
	
	public static void quitting()
	{
		driver.quit();
	}
	
	
	

}
