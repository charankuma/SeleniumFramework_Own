package testRun;

import java.io.IOException;

import Base.basePage;
import Pages.constants;
import Utility.utilityPage;

public class Test4 {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		//Hotels
		
		basePage.initalize();
		constants.creation();
		constants.home.pagetitle();
		constants.home.HotelsTab();
		constants.home.pagetitle();
		constants.home.backToHome();
		constants.home.pagetitle();
		utilityPage.closing();
		
	}

}
