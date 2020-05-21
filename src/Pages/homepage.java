package Pages;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.basePage;

public class homepage extends basePage {
	
//pageFactory or Object Repository


@FindBy(linkText="SIGN-ON")
WebElement signOn;

@FindBy(linkText="Home")
WebElement HomeButton;

@FindBy(xpath="/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[1]/td/font/b")
WebElement Text;

@FindBy(linkText="Flights")
WebElement Flight;

@FindBy(xpath="//img[@src='/images/forms/home.gif']")

WebElement BacktoHome;

@FindBy(linkText="Hotels")
WebElement Hotels;

//Initializing the above webElements by using PageFactory:

public homepage() throws IOException
{
	PageFactory.initElements(driver, this);
}

//Methods or actions related to the Home page

public void pagetitle()
{
	System.out.println( driver.getTitle());
}

public void clickHomeTab()
{
	HomeButton.click();
	System.out.println(Text.getText());
	
}

public void totalLinks()
{
	List<WebElement> ls=driver.findElements(By.tagName("a"));
	System.out.println(ls.size());
	for (WebElement ese : ls) {
		System.out.println(ese.getAttribute("href"));
		}
	
}

public void brokenLinks() throws Throwable
{
	List<WebElement> ls=driver.findElements(By.tagName("a"));
	System.out.println(ls.size());
	for (WebElement ese : ls) {
		String activeLinks=ese.getAttribute("href");
		
		URL uRl=new URL(activeLinks);
		
		HttpURLConnection httpurl=(HttpURLConnection)uRl
				.openConnection();
		
		httpurl.setConnectTimeout(5000);
		
		httpurl.connect();
		
		String response=httpurl.getResponseMessage();
		
		httpurl.disconnect();
		
		System.out.println(ese.getAttribute("href")+".........."+response);
		
	}
	
}


public void images()
{
	List<WebElement> images=driver.findElements(By.tagName("img"));
	System.out.println(images.size());
	for  (WebElement im : images) {
		
		System.out.println(im.getAttribute("src"));
		
		
		
	}
}

public void clickFlightTab()
{
	Flight.click();
}

public void HotelsTab()
{
	Hotels.click();
}

public void backToHome()
{
	BacktoHome.click();
}


public signOnpage clickSign() throws IOException
{
	signOn.click();
	return new signOnpage();
}
















}
