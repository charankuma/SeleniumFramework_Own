package Pages;

import java.io.IOException;

import Base.basePage;

public  class  constants extends basePage {
	
	public static homepage home;
	
	public static signOnpage sign;
	
	public static flightFinderpage flight;
	
	public static selectpage sel;
	
	public static bookFlightPage book;
	
	public static conformationPage conform;
	
	public static registerPage register;
	
	public static void creation() throws IOException

		{
			 home=new homepage();
			
			 sel=new selectpage();
			
			 sign=new signOnpage();
			
			 flight=new flightFinderpage();
			
			 book=new bookFlightPage();
			
			 conform=new conformationPage();
			 
			 register=new registerPage();
		}
	}
	
	
	
	
	
	
	

