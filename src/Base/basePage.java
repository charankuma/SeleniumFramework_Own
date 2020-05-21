package Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Utility.utilityPage;
import testConstants.testConstantsPage;
public class basePage  {
	
public static WebDriver driver;
public static Properties prop;
	
//Loading Proerty File



public static void initalize() throws IOException
	{
	
	
prop=new Properties();
FileInputStream fs=new FileInputStream("D:/Framework/newTour.properties");
prop.load(fs);
	
System.setProperty("webdriver.chrome.driver","D://chromeDriver for 83 version browser//chromedriver.exe");	


driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().deleteAllCookies();
//driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
//driver.manage().timeouts().implicitlyWait(testConstantsPage.timeunit1,TimeUnit.SECONDS);
driver.get(prop.getProperty("url"));
utilityPage.pics();

}
		
}
	

