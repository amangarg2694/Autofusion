package com.atdd.demo.te.stepdefinitons;

import java.io.IOException;
import java.sql.SQLException;

import com.hp.lft.report.ReportException;
import com.hp.lft.sdk.GeneralLeanFtException;
import com.optumrx.autofusion.core.te.util.Mainframe_GlobalFunctionLib;
import com.optumrx.autofusion.core.util.ReadPropertyFile;

public class CommonHelper2 {
	
	static String Username = null;
	static String Password = null;
	static String envOption = null;
	static String ModNumber = null;
	static String QADEVPRDenv = null;
	public static String ScreenshotOption = null;
	public static String env = null;
	
	public String configFile = "src//test//resources//te//config_sxcd1.properties";
	
	public void login() throws Exception{
	
		ReadPropertyFile.setPropertyMap(System.getProperty("user.dir")+"//src//test//resources//features//RxClaim//OR");  		 
		ReadPropertyFile.configFileReader(configFile); 

		
		Username = ReadPropertyFile.getUsername();
		Password = ReadPropertyFile.getPassword();
		env = ReadPropertyFile.getEnv();
		envOption = ReadPropertyFile.getEnvOption();
		ModNumber = ReadPropertyFile.getModNumber();
		QADEVPRDenv = ReadPropertyFile.getQADEVPRDEnv();
		System.out.println("After Username"+Username);
	
	
	
	
		


	
	
		
		//	String envOption = "8404";
			if(System.getProperty("envOption") !=null){
				envOption = System.getProperty("envOption");
			}else
			{
				envOption = ReadPropertyFile.getEnvOption();
			}
			
			System.out.println("Logging to SXCD1");
		Mainframe_GlobalFunctionLib.launchTE(env);
		
		Mainframe_GlobalFunctionLib.sendText(6 ,33 , Username);			
    	
    	Mainframe_GlobalFunctionLib.sendText(7 ,33 , Password);				
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		
			if(Mainframe_GlobalFunctionLib.getText(19, 2).contains("Press Enter to continue")){							
			Mainframe_GlobalFunctionLib.pressKey("Enter");
		
		
			System.out.println("Select the environment");
		
			}
		//Mainframe_GlobalFunctionLib.sendText(21, 7 , envOption);
		//Mainframe_GlobalFunctionLib.Transmit();
/*		if(envOption.equalsIgnoreCase("6"))
		{

			

			

			Mainframe_GlobalFunctionLib.sendText(6, 41 , ModNumber);
		
			Mainframe_GlobalFunctionLib.sendText(12, 41 , QADEVPRDenv);
		}
			Mainframe_GlobalFunctionLib.pressKey("Enter");
		
		
		
		Mainframe_GlobalFunctionLib.sendText(21, 7 ,"20" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		
		
		//if(ScreenshotOption.equalsIgnoreCase("Always")){
			//}
			
	*/
		
		
	
	
	}
}
