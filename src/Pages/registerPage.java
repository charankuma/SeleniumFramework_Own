package Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Base.basePage;
import Utility.utilityPage;

public class registerPage extends basePage {
	
	
	
	
	@FindBy(linkText="REGISTER")
	WebElement registerTab;
	
	@FindBy(name="firstName")
	WebElement FirstName;
	
	@FindBy(name="lastName")
	WebElement LastName;
	
	@FindBy(name="phone")
	WebElement Phone;
	
	@FindBy(name="userName")
	WebElement Email;
	
	@FindBy(name="address1")
	WebElement Address;
	
	@FindBy(name="address2")
	WebElement Address1;
	
	@FindBy(name="city")
	WebElement City;
	
	@FindBy(name="state")
	WebElement State;
	
	@FindBy(name="postalCode")
	WebElement PostalCode;
	
	@FindBy(name="country")
	static
	WebElement Country;
	
	@FindBy(name="email")
	WebElement Username;
	
	@FindBy(name="password")
	WebElement Password;
	
	@FindBy(name="confirmPassword")
	WebElement ConformPassword;
	
	@FindBy(name="register")
	WebElement submitButton;
	
//	@FindBy(xpath="/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[2]/font/a[1]")
	//WebElement Signin;
	
	
	@FindBy(linkText=" sign-in ")
	WebElement Signin;
@FindBy(xpath="/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[3]/a/font/b")	
WebElement ccontent;


	public registerPage()
	{
		
		PageFactory.initElements(driver, this);
	}
	
	public void pageTitle()
	{
		
		System.out.println(driver.getTitle());
		
	}
	
	public void clickRegister() throws IOException
	{
		registerTab.click();
		utilityPage.pics();
	}
	
	public void inputDetails(String fname,String lname,String cell,String email,String Addr,String Addr1,String ci,String st,String post) throws Throwable
	{
		
		FirstName.sendKeys(fname);
		LastName.sendKeys(lname);
		Phone.sendKeys(cell);
		Email.sendKeys(email);
		Address.sendKeys(Addr);
		Address1.sendKeys(Addr1);
		City.sendKeys(ci);
		State.sendKeys(st);
		PostalCode.sendKeys(post);
		//Country.sendKeys(coun);
	utilityPage.pics();
		}
	
	public static void dropdownValues()
	{
		Select oselect =new Select(Country);
		oselect.selectByValue("92");
		
	}
	
	public void UserData(String user,String pass,String confo)
	{
		Username.sendKeys(user);
		Password.sendKeys(pass);
		ConformPassword.sendKeys(confo);
	
		
		}
	
	public void submitButton() throws InterruptedException
	{
		Thread.sleep(3000);
		submitButton.click();
	}
	
	public void compareContent()
	{
		String value=	Username.getText();
		String actual=ccontent.getText();
		System.out.println(actual);
		String Expected="Note: Your user name is "+value+".";
		System.out.println(Expected);
		if(Expected.equalsIgnoreCase(actual))
		{
			System.out.println("Working Fine");
		}
	}
	
	
	public void msgSign() throws InterruptedException
	{
		Thread.sleep(3000);
		Signin.click();
	}
	

	
	
	
	
	

}
