package testRun;

import java.io.IOException;

import Base.basePage;
import Pages.constants;
import Utility.utilityPage;

public class Test3 extends basePage{

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		//Flights
		
		
		basePage.initalize();
		constants.creation();
		constants.home.pagetitle();
		constants.home.clickFlightTab();
		constants.home.pagetitle();
		utilityPage.closing();
		
		
		
		
		

	}

}
