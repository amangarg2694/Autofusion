package com.atdd.te.screenHelpers;

import java.io.IOException;

import org.testng.Assert;

import com.cucumber.listener.Reporter;
import com.optumrx.autofusion.core.te.util.Mainframe_GlobalFunctionLib;
import com.optumrx.autofusion.core.te.util.Screenshot;
import com.optumrx.autofusion.core.util.ReadPropertyFile;

public class CommonHelper {
	
	public static String ScreenshotOption = null;		
	public static void login() throws IOException{

	String Username = ReadPropertyFile.getUsername();
	String Password = ReadPropertyFile.getPassword();
	String env = ReadPropertyFile.getEnv();
	
	String[] coordinates = null;
	
	switch(env){
		
		case "SXCD1" :
			
		try {
			String envOption = ReadPropertyFile.getEnvOption();
			System.out.println("Logging to SXCD1");
		Mainframe_GlobalFunctionLib.launchTE(env);
		coordinates = ReadPropertyFile.getProperty("Login" , "Username");			
		Mainframe_GlobalFunctionLib.sendText(coordinates[0] ,coordinates[1] , Username);			
    	coordinates = ReadPropertyFile.getProperty("Login" , "Password");
    	Mainframe_GlobalFunctionLib.sendText(coordinates[0] ,coordinates[1] , Password);				
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		try{
			if(Mainframe_GlobalFunctionLib.getText(19, 2).contains("Press Enter to continue")){							
			Mainframe_GlobalFunctionLib.pressKey("Enter");
		}
		}
		catch(Exception e){
			System.out.println("Select the environment");
		}
		Mainframe_GlobalFunctionLib.sendText(21, 7 , envOption);
		Mainframe_GlobalFunctionLib.Transmit();
		if(envOption.equalsIgnoreCase("6")){
			String modNumber = ReadPropertyFile.getModNumber();
			Mainframe_GlobalFunctionLib.sendText(6, 41 , modNumber);
			Mainframe_GlobalFunctionLib.pressKey("Enter");
		}
		
		
		
		Mainframe_GlobalFunctionLib.sendText(21, 7 ,"20" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		//if(ScreenshotOption.equalsIgnoreCase("Always")){
			//Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			//}
			}catch(Exception e){
				e.printStackTrace();
				//Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				//Assert.fail("Login is not successful.");
				
			}
	
	
	break;	
case "BOOK1" :
		
		try {
			
			System.out.println("Logging to BOOK1");
		Mainframe_GlobalFunctionLib.launchTE(env);
		coordinates = ReadPropertyFile.getProperty("Login" , "Book1_Username");			
		Mainframe_GlobalFunctionLib.sendText(coordinates[0] ,coordinates[1] , Username);			
    	coordinates = ReadPropertyFile.getProperty("Login" , "Book1_Password");
    	Mainframe_GlobalFunctionLib.sendText(coordinates[0] ,coordinates[1] , Password);				
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		try{
			if(Mainframe_GlobalFunctionLib.getText(19, 2).contains("Press Enter to continue")){							
			Mainframe_GlobalFunctionLib.pressKey("Enter");
		}
		}
		catch(Exception e){
			System.out.println("Select the env");
		}
		Mainframe_GlobalFunctionLib.sendText(21, 7 ,"1" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		
		
		if(ScreenshotOption.equalsIgnoreCase("Always")){
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			}
			}catch(Exception e){
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				Assert.fail("Login is not successful.");
				
			}
	
		break;
		
case "BOOK2" :
	
		try {
			
			System.out.println("Logging to BOOK2");
		Mainframe_GlobalFunctionLib.launchTE(env);
		coordinates = ReadPropertyFile.getProperty("Login" , "Book1_Username");			
		Mainframe_GlobalFunctionLib.sendText(coordinates[0] ,coordinates[1] , Username);			
    	coordinates = ReadPropertyFile.getProperty("Login" , "Book1_Password");
    	Mainframe_GlobalFunctionLib.sendText(coordinates[0] ,coordinates[1] , Password);				
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		try{
			if(Mainframe_GlobalFunctionLib.getText(19, 2).contains("Press Enter to continue")){							
			Mainframe_GlobalFunctionLib.pressKey("Enter");
		}
		}
		catch(Exception e){
			System.out.println("Select the env");
		}
		Mainframe_GlobalFunctionLib.sendText(21, 7 ,"2" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		if(ScreenshotOption.equalsIgnoreCase("Always")){
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			}
			}catch(Exception e){
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				Assert.fail("Login is not successful.");
				
			}
	break;
		}
	
}
}