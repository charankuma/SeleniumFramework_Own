package testRun;

import java.io.IOException;

import Base.basePage;
import Pages.constants;
import Utility.utilityPage;

public class Test5 {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		
		basePage.initalize();
		constants.creation();
		constants.home.pagetitle();
		constants.register.clickRegister();
		constants.register.pageTitle();
		constants.register.inputDetails("charan","kumar","8189817100","asd@gmail.com","Address","Address1","chennai","TamilNadu","600096");
	    constants.register.dropdownValues();
	   constants.register.UserData("Hari","Hari,","Hari");
	    constants.register.submitButton();
	    constants.register.compareContent();
	    constants.register.msgSign();
	    constants.sign.pagetitle();
	    constants.sign.userName("Hari", "Hari");
	    constants.sign.signIN();
	    
	  utilityPage.closing();
	   
	}

}
