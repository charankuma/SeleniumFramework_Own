package testRun;

import java.io.IOException;

import Base.basePage;
import Pages.constants;
import Utility.utilityPage;

public class Test2 extends basePage {
	
	//Home Tab

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		basePage.initalize();
	    constants.creation();
		constants.home.pagetitle();
		constants.home.clickHomeTab();
		constants.home.pagetitle();
		constants.home.totalLinks();
		constants.home.images();
		constants.home.brokenLinks();
		utilityPage.closing();
		

	}

}
