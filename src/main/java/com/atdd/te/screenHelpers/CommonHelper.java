package com.atdd.te.screenHelpers;

import java.io.IOException;

import com.optumrx.autofusion.core.te.util.Mainframe_GlobalFunctionLib;
import com.optumrx.autofusion.core.util.ReadPropertyFile;

public class CommonHelper {
	
	public static String ScreenshotOption = null;
	public static String env = null;	
	public static void login() throws IOException{
	
	
	String Username = null;
	if(System.getProperty("Username") !=null){
		Username = System.getProperty("Username");
	}else
	{
		Username = ReadPropertyFile.getUsername();
	}
	
	String Password = null;
	if(System.getProperty("Password") !=null){
		Password = System.getProperty("Password");
	}else
	{
		Password = ReadPropertyFile.getPassword();
	}
	
	String env = null;
	if(System.getProperty("env") !=null){
		env = System.getProperty("env");
	}else
	{
		env = ReadPropertyFile.getEnv();
	}


	String[] coordinates = null;
	
	switch(env){
		
		case "SXCD1" :
			
		try {
			String envOption = null;
			if(System.getProperty("envOption") !=null){
				envOption = System.getProperty("envOption");
			}else
			{
				envOption = ReadPropertyFile.getEnvOption();
			}
			
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

			String modNumber = null;
			String QADEVPRDEnv = null;

			if(System.getProperty("ModNumber") !=null){
				modNumber = System.getProperty("ModNumber");
			}else
			{
				modNumber = ReadPropertyFile.getModNumber();
			}
			if(System.getProperty("QADEVPRDEnv") !=null){
				QADEVPRDEnv = System.getProperty("QADEVPRDEnv");
			}else
			{
				QADEVPRDEnv = ReadPropertyFile.getQADEVPRDEnv();
			}

			Mainframe_GlobalFunctionLib.sendText(6, 41 , modNumber);
			Mainframe_GlobalFunctionLib.sendText(12, 41 , QADEVPRDEnv);
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
		
		
		/*if(ScreenshotOption.equalsIgnoreCase("Always")){
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			}
			*/
			}catch(Exception e){
				e.printStackTrace();
			//	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			//	Assert.fail("Login is not successful.");
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
	/*	if(ScreenshotOption.equalsIgnoreCase("Always")){
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			}
			*/
			}catch(Exception e){
				e.printStackTrace();
			//	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			//	Assert.fail("Login is not successful.");
				
			}
	break;
	
	case "BK1TST" :
	
try {
			
			System.out.println("Logging to BK1TST");
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

			}catch(Exception e){
				e.printStackTrace();
			
			}
	
		break;
		}
	
}
}