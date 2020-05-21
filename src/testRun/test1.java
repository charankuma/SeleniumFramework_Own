package testRun;

import java.io.IOException;

import org.openqa.selenium.WebElement;

import Base.basePage;
import Pages.bookFlightPage;
import Pages.constants;
import Utility.utilityPage;

public class test1 extends basePage {
	
//End to End Flow Scenario

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub

		basePage.initalize();
	    constants.creation();
		constants.home.pagetitle();
		constants.home.clickSign();
		constants.sign.pagetitle();
		constants.sign.userName("charan", "charan");
		constants.sign.signIN();
		constants.flight.pageTitle();
		constants.flight.clickContinue();
		constants.sel.clickContinue();
		constants.book.pageTitle();
		constants.book.details("charan", "kumar","123456");
		constants.book.clickbuyFlights();
		constants.conform.pageTitle();
		constants.conform.clicklogout();
		utilityPage.closing();
		
		
	
		
		
		
		
		
	}

}
