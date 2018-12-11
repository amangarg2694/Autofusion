package com.atdd.te.screenHelpers;

import java.io.IOException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Calendar;
import java.util.StringTokenizer;

import org.testng.Assert;

import com.cucumber.listener.Reporter;
import com.hp.lft.report.ReportException;
import com.hp.lft.sdk.GeneralLeanFtException;

import com.optumrx.autofusion.core.te.util.Mainframe_GlobalFunctionLib;
import com.optumrx.autofusion.core.te.util.Screenshot;
import com.optumrx.autofusion.core.util.ReadPropertyFile;

public class FunctionalLibrary extends CommonHelper{

	public static String sPriorAuthNumber="";
	public static void navigateToRxClaimPlanAdministrator() throws Exception  {
		try{
		String text = Mainframe_GlobalFunctionLib.getText(1, 13).trim();
		if(!(text.equalsIgnoreCase("RxClaim Plan Administrator Menu"))){
		while(!(text.equalsIgnoreCase("RxClaim Plan Administrator Menu"))){
			Mainframe_GlobalFunctionLib.pressKey("F12");
			text = Mainframe_GlobalFunctionLib.getText(1, 13);
			//break;
		}
		}
		if(ScreenshotOption.equalsIgnoreCase("Always")){
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		}
		}catch(Exception e)
		{	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			Assert.fail("We could not reach to RxClaimAdministrator screen.Screenshot captured");
			
		}
}
		
		public static void navigateToScreen(String option) throws Exception  {
			try{
			Mainframe_GlobalFunctionLib.sendText(21, 7 ,option );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			if(ScreenshotOption.equalsIgnoreCase("Always")){
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			}
			}
			catch(Exception e){
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				Assert.fail("We could not navigate to next screen using option "+ option+".Screenshot captured");
				
			}
		}
		
		
		
	public static void createCAG(String carrierID,String carrierName,String processor,String mail,String city,String state,String zip,String contractFromDate,String contractThruDate, String contractEnt,String businessType,String accountID,String accountName ,String groupID,String groupName,String gFromDate,String gThruDate,String planCode) throws Throwable
	{			
		try {
			navigateToRxClaimPlanAdministrator();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		try{
		Mainframe_GlobalFunctionLib.sendText(21, 7 ,"1" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(21, 7 ,"1" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(21, 7 ,"1" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		
		if(!(func_SearchAndSelectADataEditMode("4,6" ,carrierID ,"10,6" , carrierID))){
			Mainframe_GlobalFunctionLib.pressKey("F6");			
			Mainframe_GlobalFunctionLib.sendText(13, 14, carrierID);
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(4, 24, carrierName);
			Mainframe_GlobalFunctionLib.sendText(5, 12, processor);
			Mainframe_GlobalFunctionLib.sendText("11", "15", mail);			
			Mainframe_GlobalFunctionLib.sendText("12", "15", city);          
			Mainframe_GlobalFunctionLib.sendText("12", "47", state);          
			Mainframe_GlobalFunctionLib.sendText("12", "56", zip);                               
			Mainframe_GlobalFunctionLib.sendText("19", "27", contractFromDate);
			Mainframe_GlobalFunctionLib.sendText("19", "42", contractThruDate);
			Mainframe_GlobalFunctionLib.sendText("19", "65", contractEnt);
			Mainframe_GlobalFunctionLib.pressKey("Enter");           
			Mainframe_GlobalFunctionLib.pressKey("F15");
			Mainframe_GlobalFunctionLib.pressKey("PageDown");
			Mainframe_GlobalFunctionLib.sendText("12", "61", businessType);
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.pressKey("PageUp");
			Mainframe_GlobalFunctionLib.pressKey("F12");
			
            
		}else
		{
			Mainframe_GlobalFunctionLib.pressKey("F12");
		}
			
			
		//Create new account
		
		Mainframe_GlobalFunctionLib.sendText("4", "6", carrierID);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		
			Mainframe_GlobalFunctionLib.sendText("10", "2", "7");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			
			if(!(func_SearchAndSelectADataEditMode("6,5" ,accountID ,"11,5" , accountID))){
				
				Mainframe_GlobalFunctionLib.pressKey("F6");
				Mainframe_GlobalFunctionLib.sendText(15, 32, accountID);
				Mainframe_GlobalFunctionLib.pressKey("Enter");	
				Mainframe_GlobalFunctionLib.sendText(6, 27, accountName);
				Mainframe_GlobalFunctionLib.pressKey("Enter");
			}
			else
			{
				Mainframe_GlobalFunctionLib.pressKey("F12");
			}
			
			//Create new group
			Mainframe_GlobalFunctionLib.sendText("11", "2", "7");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			if(!(func_SearchAndSelectADataEditMode("7,4" ,groupID ,"12,4" , groupID))){
			
				Mainframe_GlobalFunctionLib.pressKey("F6");				
				Mainframe_GlobalFunctionLib.sendText(16, 15, groupID);
				Mainframe_GlobalFunctionLib.pressKey("Enter");					
				Mainframe_GlobalFunctionLib.sendText(7, 27, groupName);
				Mainframe_GlobalFunctionLib.sendText(17, 2, gFromDate);
				Mainframe_GlobalFunctionLib.sendText(17, 12, gThruDate);
				Mainframe_GlobalFunctionLib.click(17, 22 );
  				Mainframe_GlobalFunctionLib.pressKey("F4");				
				Mainframe_GlobalFunctionLib.sendText(4, 5, planCode);
				Mainframe_GlobalFunctionLib.pressKey("Enter");				
				Mainframe_GlobalFunctionLib.sendText(10, 2, "1");
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.pressKey("Enter");				
				Mainframe_GlobalFunctionLib.sendText(16, 64, "Y");
				Mainframe_GlobalFunctionLib.pressKey("F12");
				Thread.sleep(1000);
				Mainframe_GlobalFunctionLib.sendText(12, 2, "2");				
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				
				
				
		}
		
			if(ScreenshotOption.equalsIgnoreCase("Always")){
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				}
				}catch(Exception e)
				{	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
					Assert.fail("The CAG is not created successfully.Screenshot is captured");
					
				}
	}
	
	public static void addCarrier(String carrierID,String carrierName,String processor,String mail,String city,String state,String zip,String contractFromDate,String contractThruDate, String contractEnt,String businessType) throws IOException
	//,String accountID,String accountName ,String groupID,String groupName,String gFromDate,String gThruDate,String planCode) throws Throwable
	{			
		try {
			navigateToRxClaimPlanAdministrator();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		try{
		Mainframe_GlobalFunctionLib.sendText(21, 7 ,"1" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(21, 7 ,"1" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(21, 7 ,"1" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		
		if(!(func_SearchAndSelectADataEditMode("4,6" ,carrierID ,"10,6" , carrierID))){
			Mainframe_GlobalFunctionLib.pressKey("F6");			
			Mainframe_GlobalFunctionLib.sendText(13, 14, carrierID);
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(4, 24, carrierName);
			Mainframe_GlobalFunctionLib.sendText(5, 12, processor);
			Mainframe_GlobalFunctionLib.sendText("11", "15", mail);			
			Mainframe_GlobalFunctionLib.sendText("12", "15", city);          
			Mainframe_GlobalFunctionLib.sendText("12", "47", state);          
			Mainframe_GlobalFunctionLib.sendText("12", "56", zip);                               
			Mainframe_GlobalFunctionLib.sendText("19", "27", contractFromDate);
			Mainframe_GlobalFunctionLib.sendText("19", "42", contractThruDate);
			Mainframe_GlobalFunctionLib.sendText("19", "65", contractEnt);
			Mainframe_GlobalFunctionLib.pressKey("Enter");           
			Mainframe_GlobalFunctionLib.pressKey("F15");
			Mainframe_GlobalFunctionLib.pressKey("PageDown");
			Mainframe_GlobalFunctionLib.sendText("12", "61", businessType);
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.pressKey("PageUp");
			Mainframe_GlobalFunctionLib.pressKey("F12");
			
            
		}else
		{
			Mainframe_GlobalFunctionLib.pressKey("F12");
		}
			
		if(ScreenshotOption.equalsIgnoreCase("Always")){
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			}
			}catch(Exception e)
			{	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				Assert.fail("The Carrier is not created successfully.Screenshot is captured");
				
			}
}		
		//Create new account
	public static void addAccount(String carrierID ,String accountID,String accountName) throws IOException	{
		
		try {
			navigateToRxClaimPlanAdministrator();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		try{
		Mainframe_GlobalFunctionLib.sendText(21, 7 ,"1" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(21, 7 ,"1" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(21, 7 ,"2" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		
		//Mainframe_GlobalFunctionLib.sendText("4", "5", accountID);
		//Mainframe_GlobalFunctionLib.pressKey("Enter");
		
			//Mainframe_GlobalFunctionLib.sendText("10", "2", "7");
			//Mainframe_GlobalFunctionLib.pressKey("Enter");
			
			if(!(func_SearchAndSelectADataEditMode("4,5" ,accountID ,"9,5" , accountID))){
				
				Mainframe_GlobalFunctionLib.pressKey("F6");
				Mainframe_GlobalFunctionLib.sendText(13, 14, carrierID);
				//Mainframe_GlobalFunctionLib.pressKey("Enter");	
				Mainframe_GlobalFunctionLib.sendText(14, 14, accountID);
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(6, 27, accountName);
				Mainframe_GlobalFunctionLib.pressKey("Enter");
			}
			else
			{
				Mainframe_GlobalFunctionLib.pressKey("F12");
			}
			
			if(ScreenshotOption.equalsIgnoreCase("Always")){
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				}
				}catch(Exception e)
				{	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
					Assert.fail("The Account is not created successfully.Screenshot is captured");
					
				}
	}
	
	public static void addGroup(String carrierID , String accountID ,String groupID,String groupName,String gFromDate,String gThruDate,String planCode ) throws IOException
	{		//Create new group
	System.out.println("test 123");
	try {
		navigateToRxClaimPlanAdministrator();
	} catch (Exception e) {
		
		e.printStackTrace();
	}
	try{
	Mainframe_GlobalFunctionLib.sendText(21, 7 ,"1" );
	Mainframe_GlobalFunctionLib.pressKey("Enter");
	Mainframe_GlobalFunctionLib.sendText(21, 7 ,"1" );
	Mainframe_GlobalFunctionLib.pressKey("Enter");
	Mainframe_GlobalFunctionLib.sendText(21, 7 ,"3" );
	Mainframe_GlobalFunctionLib.pressKey("Enter");
	
	
		//	Mainframe_GlobalFunctionLib.sendText("11", "2", "7");
		//	Mainframe_GlobalFunctionLib.pressKey("Enter");
			if(!(func_SearchAndSelectADataEditMode("4,4" ,groupID ,"9,4" , groupID))){
			
				Mainframe_GlobalFunctionLib.pressKey("F6");	
				Mainframe_GlobalFunctionLib.sendText(13, 14, carrierID);
				Mainframe_GlobalFunctionLib.sendText(14, 14, accountID);
				Mainframe_GlobalFunctionLib.sendText(15, 14, groupID);
				Mainframe_GlobalFunctionLib.pressKey("Enter");					
				Mainframe_GlobalFunctionLib.sendText(7, 27, groupName);
				Mainframe_GlobalFunctionLib.sendText(17, 2, gFromDate);
				Mainframe_GlobalFunctionLib.sendText(17, 12, gThruDate);
				Mainframe_GlobalFunctionLib.click(17, 22 );
  				Mainframe_GlobalFunctionLib.pressKey("F4");				
				Mainframe_GlobalFunctionLib.sendText(4, 5, planCode);
				Mainframe_GlobalFunctionLib.pressKey("Enter");				
				Mainframe_GlobalFunctionLib.sendText(10, 2, "1");
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.pressKey("Enter");				
				Mainframe_GlobalFunctionLib.sendText(16, 64, "Y");
				Mainframe_GlobalFunctionLib.pressKey("F12");
				Mainframe_GlobalFunctionLib.waitTillReady();
				//Mainframe_GlobalFunctionLib.sendText(12, 2, "2");				
				//Mainframe_GlobalFunctionLib.pressKey("Enter");
				
				
				
		}
			else{
				Mainframe_GlobalFunctionLib.pressKey("F12");
			}
		
			if(ScreenshotOption.equalsIgnoreCase("Always")){
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				}
				}catch(Exception e)
				{	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
					Assert.fail("The CAG is not created successfully.Screenshot is captured");
					
				}
	}
	
	public static void CreateMember(String carrierID, String accountID, String groupID, String memberID, String firstName, String lastName, String dob, String fromDate, String thruDate) throws Throwable
	{	
		try {
			navigateToRxClaimPlanAdministrator();
		} catch (Exception e) {
			e.printStackTrace();
		}
		try{
		Mainframe_GlobalFunctionLib.sendText(21, 7 ,"1" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(21, 7 ,"2" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		if(!(func_SearchAndSelectADataEditMode("4,4" ,memberID ,"10,4" , memberID)))
		{
				Thread.sleep(1000);
				Mainframe_GlobalFunctionLib.pressKey("F6");
				Mainframe_GlobalFunctionLib.sendText(4, 10, carrierID);
				Mainframe_GlobalFunctionLib.sendText(5, 10, accountID);
				Mainframe_GlobalFunctionLib.sendText(6, 10, groupID);
				Mainframe_GlobalFunctionLib.sendText(7, 10, memberID);
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(6 , 29 ,lastName);
				Mainframe_GlobalFunctionLib.sendText(6, 57, firstName);
				Mainframe_GlobalFunctionLib.sendText(7,40, dob);
				Mainframe_GlobalFunctionLib.sendText(20, 2, fromDate);			
				Mainframe_GlobalFunctionLib.sendText(20, 12, thruDate);
				Mainframe_GlobalFunctionLib.pressKey("Enter");				
				Mainframe_GlobalFunctionLib.sendText(16, 64, "Y");
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.pressKey("F12");
				Mainframe_GlobalFunctionLib.pressKey("F12");
				System.out.println("Member is created");
				Reporter.addStepLog("Member is created");
				}
		else{
			Mainframe_GlobalFunctionLib.pressKey("F12");
			System.out.println("Member exists");
			Reporter.addStepLog("Member exists");
		}
						
		
			if(ScreenshotOption.equalsIgnoreCase("Always")){
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				}
				}catch(Exception e)
				{	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
					Assert.fail("An error has occured while creating a member.Screenshot is captured");
					e.printStackTrace();
				}
	}
	
	public static void createMemberWithOverridePlan(String carrierID, String accountID, String groupID, String memberID, String firstName, String lastName, String dob, String fromDate, String thruDate,String overridePlan) throws Throwable
	{	
		try {
			navigateToRxClaimPlanAdministrator();
		} catch (Exception e) {
			e.printStackTrace();
		}
		try{
		Mainframe_GlobalFunctionLib.sendText(21, 7 ,"1" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(21, 7 ,"2" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		if(!(func_SearchAndSelectADataEditMode("4,4" ,memberID ,"10,4" , memberID)))
		{
				Thread.sleep(1000);
				Mainframe_GlobalFunctionLib.pressKey("F6");
				Mainframe_GlobalFunctionLib.sendText(4, 10, carrierID);
				Mainframe_GlobalFunctionLib.sendText(5, 10, accountID);
				Mainframe_GlobalFunctionLib.sendText(6, 10, groupID);
				Mainframe_GlobalFunctionLib.sendText(7, 10, memberID);
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(6 , 29 ,lastName);
				Mainframe_GlobalFunctionLib.sendText(6, 57, firstName);
				Mainframe_GlobalFunctionLib.sendText(7,40, dob);
				Mainframe_GlobalFunctionLib.sendText(20, 2, fromDate);			
				Mainframe_GlobalFunctionLib.sendText(20, 12, thruDate);
				Mainframe_GlobalFunctionLib.sendText(20, 22, overridePlan);
				
				Mainframe_GlobalFunctionLib.pressKey("Enter");				
				Mainframe_GlobalFunctionLib.sendText(16, 64, "Y");
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.pressKey("F12");
				Mainframe_GlobalFunctionLib.pressKey("F12");
				System.out.println("Member is created");
				Reporter.addStepLog("Member is created");
				}
		else{
			Mainframe_GlobalFunctionLib.pressKey("F12");
			System.out.println("Member exists");
			Reporter.addStepLog("Member exists");
		}
						
		
			if(ScreenshotOption.equalsIgnoreCase("Always")){
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				}
				}catch(Exception e)
				{	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
					Assert.fail("An error has occured while creating a member.Screenshot is captured");
					e.printStackTrace();
				}
	}
	
	//PA Member
	public static void CreateMemberPA(String carrierID, String accountID, String groupID, String memberID, String firstName, String lastName, String dob, String fromDate, String thruDate) throws Throwable
	{	
		try {
			navigateToRxClaimPlanAdministrator();
		} catch (Exception e) {
			e.printStackTrace();
		}
		try{
		Mainframe_GlobalFunctionLib.sendText(21, 7 ,"1" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(21, 7 ,"2" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		if(!(func_SearchAndSelectADataEditMode("4,4" ,memberID ,"10,4" , memberID)))
		{
				Thread.sleep(1000);
				Mainframe_GlobalFunctionLib.pressKey("F6");
				Mainframe_GlobalFunctionLib.sendText(4, 10, carrierID);
				Mainframe_GlobalFunctionLib.sendText(5, 10, accountID);
				Mainframe_GlobalFunctionLib.sendText(6, 10, groupID);
				Mainframe_GlobalFunctionLib.sendText(7, 10, memberID);
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(6 , 29 ,lastName);
				Mainframe_GlobalFunctionLib.sendText(6, 57, firstName);
				Mainframe_GlobalFunctionLib.sendText(7,40, dob);
				Mainframe_GlobalFunctionLib.sendText(20, 2, fromDate);			
				Mainframe_GlobalFunctionLib.sendText(20, 12, thruDate);
				Mainframe_GlobalFunctionLib.pressKey("Enter");				
				Mainframe_GlobalFunctionLib.sendText(16, 64, "Y");
				Mainframe_GlobalFunctionLib.pressKey("Enter");
//				Mainframe_GlobalFunctionLib.pressKey("F12");
//				Mainframe_GlobalFunctionLib.pressKey("F12");
				System.out.println("Member is created");
				Reporter.addStepLog("Member is created");
			}
		else{
//			Mainframe_GlobalFunctionLib.pressKey("F12");
			System.out.println("Member exists");
			Reporter.addStepLog("Member exists");
		}
						
		
			if(ScreenshotOption.equalsIgnoreCase("Always")){
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				}
				}catch(Exception e)
				{	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
					Assert.fail("An error has occured while creating a member.Screenshot is captured");
					e.printStackTrace();
				}
		
		
	}

	public static void SetSupplementalIDbyType(String SupplementalIDFromDate,String SupplementalIDThruDate,String SupplementalIDType,String SupplementalID, String Text) throws Throwable
	{
	try{
			Mainframe_GlobalFunctionLib.pressKey("F8");
			Mainframe_GlobalFunctionLib.sendText(4, 20 ,"10");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(4, 20 ,"3" );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.pressKey("F6");
			Mainframe_GlobalFunctionLib.sendText(10, 12, SupplementalIDFromDate);
			Mainframe_GlobalFunctionLib.sendText(10, 33, SupplementalIDThruDate);
			Mainframe_GlobalFunctionLib.sendText(12, 19, SupplementalIDType);
			Mainframe_GlobalFunctionLib.sendText(13, 19, SupplementalID);
			
			if(Text.length()==0) {  
				Mainframe_GlobalFunctionLib.sendText(15, 19, "    ");  
			}
			else{
				Mainframe_GlobalFunctionLib.sendText(15, 19, Text);
			}
			
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.pressKey("F12");
			Mainframe_GlobalFunctionLib.pressKey("F12");
			Mainframe_GlobalFunctionLib.pressKey("F12");
			Mainframe_GlobalFunctionLib.pressKey("F12");
		  	if(ScreenshotOption.equalsIgnoreCase("Always")){
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			}
			}catch(Exception e)
			{	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				Assert.fail("The Supplemental ID by Type is not set successfully.Screenshot is captured");
			}
	}
	
	public static void func_SetMedicare(String memberID,String PARTDfromdate,String PARTDthrudate,String contract, String pbp, String segment, String subsidylevel, String copaycategory, String PARTDeffectivedate, String enrollmentsource) throws Throwable
	{
		try {
			navigateToRxClaimPlanAdministrator();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		Mainframe_GlobalFunctionLib.sendText(21, 7 ,"1" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(21, 7 ,"2" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
	try{
			Mainframe_GlobalFunctionLib.sendText(4, 4, memberID);
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(10, 2 ,"2" );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.pressKey("F8");
			Mainframe_GlobalFunctionLib.sendText(4, 20 ,"17");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(4, 20 ,"4" );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.pressKey("F6");
			Mainframe_GlobalFunctionLib.sendText(10, 17, PARTDfromdate);
			Mainframe_GlobalFunctionLib.sendText(10, 41, PARTDthrudate);
			Mainframe_GlobalFunctionLib.sendText(12, 20, contract);
			Mainframe_GlobalFunctionLib.sendText(13, 22, pbp);
			if(segment.length()==0) {  
				Mainframe_GlobalFunctionLib.sendText(15, 22, "    ");  
			}
			else{
				Mainframe_GlobalFunctionLib.sendText(15, 22, segment);
			}
			
			if(subsidylevel.length()==0) {  
				Mainframe_GlobalFunctionLib.sendText(16, 22, "    ");  
			}
			else{
				Mainframe_GlobalFunctionLib.sendText(16, 22, subsidylevel);
			}
			
			if(copaycategory.length()==0) {  
				Mainframe_GlobalFunctionLib.sendText(18, 24, "    ");  
			}
			else{
				Mainframe_GlobalFunctionLib.sendText(18, 24, copaycategory);
			}
			if(PARTDeffectivedate.length()==0) {  
				Mainframe_GlobalFunctionLib.sendText(19, 17, "    ");  
			}
			else{
				Mainframe_GlobalFunctionLib.sendText(19, 17, PARTDeffectivedate);
			}
			if(enrollmentsource.length()==0) {  
				Mainframe_GlobalFunctionLib.sendText(21, 24, " ");  
			}
			else{
				Mainframe_GlobalFunctionLib.sendText(21, 24, enrollmentsource);
			}
			
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.pressKey("F12");
			Mainframe_GlobalFunctionLib.pressKey("F12");
			Mainframe_GlobalFunctionLib.pressKey("F12");
			Mainframe_GlobalFunctionLib.pressKey("F12");
			Mainframe_GlobalFunctionLib.pressKey("F12");
		  	if(ScreenshotOption.equalsIgnoreCase("Always")){
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			}
			}catch(Exception e)
			{	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				Assert.fail("The Medicare is not set successfully.Screenshot is captured");
			}
	
	}
	public static void SetPBP(String carrierID,String contract,String pbp,String benefityear, String medicaretype, String submitterid) throws Throwable
	{
		try {
			navigateToRxClaimPlanAdministrator();
		} catch (Exception e) {
			e.printStackTrace();
		}
		try{
			Mainframe_GlobalFunctionLib.sendText(21, 7 ,"4" );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(21, 7 ,"14" );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(21, 7 ,"16" );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			if(func_SearchAndEditContractAndPBP(contract,pbp))
			{
				Mainframe_GlobalFunctionLib.sendText(5, 16, carrierID);
				Mainframe_GlobalFunctionLib.sendText(11, 16, medicaretype);
				if(submitterid.length()==0) {  
					Mainframe_GlobalFunctionLib.sendText(12, 16, "     ");  
				}
				else{
					Mainframe_GlobalFunctionLib.sendText(12, 16, submitterid);
				}
				Mainframe_GlobalFunctionLib.pressKey("F12");
				Mainframe_GlobalFunctionLib.pressKey("F12");
			}
			else
			{
				Mainframe_GlobalFunctionLib.pressKey("F6");
				Mainframe_GlobalFunctionLib.sendText(5, 16, carrierID);
				Mainframe_GlobalFunctionLib.sendText(7, 16, contract);
				Mainframe_GlobalFunctionLib.sendText(8, 16, pbp);
				Mainframe_GlobalFunctionLib.sendText(10, 16, benefityear);
				Mainframe_GlobalFunctionLib.sendText(11, 16, medicaretype);
				if(submitterid.length()==0) {  
					Mainframe_GlobalFunctionLib.sendText(12, 16, "     ");  
				}
				else{
					Mainframe_GlobalFunctionLib.sendText(12, 16, submitterid);
				}
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.pressKey("F12");
				Mainframe_GlobalFunctionLib.pressKey("F12");
			}
			
		  	if(ScreenshotOption.equalsIgnoreCase("Always")){
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			}
			}catch(Exception e)
			{	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				Assert.fail("The PBP is not set successfully.Screenshot is captured");
			}
	}
	
	public static void func_SetPartDMasterProfileDetail(String carrierID,String accountID,String groupID,String plancode,String fromdate,String masterprofilefromdate, String masterprofilethrudate, String drugcoveragestatusschedule, String contract, String pbp) throws Throwable
	{
		try {
			navigateToRxClaimPlanAdministrator();
		} catch (Exception e) {
			e.printStackTrace();
		}
		try{
			Mainframe_GlobalFunctionLib.sendText(21, 7 ,"4" );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(21, 7 ,"14" );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(21, 7 ,"1" );
			Mainframe_GlobalFunctionLib.pressKey("Enter");

			if(func_SearchAndEditPartDMasterProfile(carrierID,accountID,groupID,plancode))
			{
				Mainframe_GlobalFunctionLib.sendText(8, 13, "        ");
				Mainframe_GlobalFunctionLib.sendText(8, 13, masterprofilefromdate);
				Mainframe_GlobalFunctionLib.sendText(8, 41, "        ");
				Mainframe_GlobalFunctionLib.sendText(8, 41, masterprofilethrudate);
				Mainframe_GlobalFunctionLib.sendText(14, 34, drugcoveragestatusschedule);
				Mainframe_GlobalFunctionLib.pressKey("Enter");
			}
			else
			{
				Mainframe_GlobalFunctionLib.pressKey("F6");
				Mainframe_GlobalFunctionLib.sendText(4, 13, carrierID);
				Mainframe_GlobalFunctionLib.sendText(5, 13, accountID);
				Mainframe_GlobalFunctionLib.sendText(6, 13, groupID);
				Mainframe_GlobalFunctionLib.click(7, 13 );
				Mainframe_GlobalFunctionLib.pressKey("F4");
				Mainframe_GlobalFunctionLib.sendText(4, 5, plancode);
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(10, 2, "1");
				Mainframe_GlobalFunctionLib.pressKey("Enter");
//				Mainframe_GlobalFunctionLib.sendText(7, 13, plancode);
//				Mainframe_GlobalFunctionLib.sendText(7, 70, fromdate);
				Mainframe_GlobalFunctionLib.sendText(8, 13, masterprofilefromdate);
				Mainframe_GlobalFunctionLib.sendText(8, 41, masterprofilethrudate);
				Mainframe_GlobalFunctionLib.sendText(14, 34, drugcoveragestatusschedule);
				Mainframe_GlobalFunctionLib.click(9, 11 );
				Mainframe_GlobalFunctionLib.pressKey("F4");
				func_SearchAndSelectContractAndPBP(contract,pbp);
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				
			}
			
		  	if(ScreenshotOption.equalsIgnoreCase("Always")){
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			}
			}catch(Exception e)
			{	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				Assert.fail("The Part D Master Profile Detail is not set successfully.Screenshot is captured");
			}
	}
	public static void SetPatientPaySchedule(String PPdetailschedule,String PPdetaildescription,String planusequalifier) throws Throwable
	{
	try {
		navigateToRxClaimPlanAdministrator();
	} catch (Exception e) {
		e.printStackTrace();
	}
	try{
			Mainframe_GlobalFunctionLib.sendText(21, 7 ,"5" );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(21, 7 ,"2" );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(21, 7 ,"1" );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			
			if(!(func_SearchAndSelectADataEditMode("4,6" ,PPdetailschedule ,"10,6" , PPdetailschedule)))
			{
				Mainframe_GlobalFunctionLib.pressKey("F6");
				Mainframe_GlobalFunctionLib.sendText(5, 12, PPdetailschedule);
				Mainframe_GlobalFunctionLib.sendText(5, 25, PPdetaildescription);
				if(planusequalifier.length()==0) {  
					Mainframe_GlobalFunctionLib.sendText(7, 21, "    ");  
				}
				else{
					Mainframe_GlobalFunctionLib.sendText(7, 21, planusequalifier);
				}
				Mainframe_GlobalFunctionLib.pressKey("Enter");
			}
			else
			{
				Mainframe_GlobalFunctionLib.pressKey("F12");	
			}
	
		  	if(ScreenshotOption.equalsIgnoreCase("Always")){
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			}
			}catch(Exception e)
			{	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				Assert.fail("The Patient Pay Schedule is not set successfully.Screenshot is captured");
			}
	}
	
	public static void Createplanwithmembereligibilityandpricingoption(String plancode,String fromdate,String description,String thruDate, String pricechedule, String patientpayschedule) throws Throwable
	{
	try {
		navigateToRxClaimPlanAdministrator();
	} catch (Exception e) {
		e.printStackTrace();
	}
	try{
			
			Mainframe_GlobalFunctionLib.sendText(21, 7 ,"4" );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(21, 7 ,"1" );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			if(!(func_SearchAndSelectADataEditMode("4,5" ,plancode ,"11,6" , plancode)))
			{
				Mainframe_GlobalFunctionLib.pressKey("F6");
				Mainframe_GlobalFunctionLib.sendText(13, 19 ,plancode);
				Mainframe_GlobalFunctionLib.sendText(14, 19, fromdate);
				Mainframe_GlobalFunctionLib.sendText(15, 19 ,description);
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(16, 64 ,"Y");
				Thread.sleep(3);
				Mainframe_GlobalFunctionLib.sendText(7, 24 ,"Y");
				Mainframe_GlobalFunctionLib.sendText(13, 77 ,"Y");
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(16, 64 ,"Y");
				Mainframe_GlobalFunctionLib.pressKey("F7");
				Mainframe_GlobalFunctionLib.sendText(7, 21 ,"28" );
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(21, 12 ,"1" );
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.pressKey("F6");
				Mainframe_GlobalFunctionLib.sendText(8, 12, fromdate);
				Mainframe_GlobalFunctionLib.sendText(8, 36, thruDate);
				Mainframe_GlobalFunctionLib.sendText(10, 26 ,pricechedule);
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.pressKey("F12");
				Mainframe_GlobalFunctionLib.sendText(21, 12 ,"3" );
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.pressKey("F6");
				Mainframe_GlobalFunctionLib.sendText(9, 2, fromdate);
				Mainframe_GlobalFunctionLib.sendText(9, 12, thruDate);
				Mainframe_GlobalFunctionLib.sendText(9, 22 ,patientpayschedule);
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(16, 64 ,"Y");
				Mainframe_GlobalFunctionLib.pressKey("F12");
				Mainframe_GlobalFunctionLib.pressKey("F12");
				Mainframe_GlobalFunctionLib.pressKey("F12");
//				Mainframe_GlobalFunctionLib.pressKey("F12");				
			}
			
			else
			{
				Mainframe_GlobalFunctionLib.sendText(7, 24 ,"Y");
				Mainframe_GlobalFunctionLib.sendText(13, 77 ,"Y");
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(16, 64 ,"Y");
				Mainframe_GlobalFunctionLib.pressKey("F7");
				Mainframe_GlobalFunctionLib.sendText(7, 21 ,"28" );
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(21, 12 ,"1" );
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.pressKey("F6");
				Mainframe_GlobalFunctionLib.sendText(8, 12, fromdate);
				Mainframe_GlobalFunctionLib.sendText(8, 36, thruDate);
				Mainframe_GlobalFunctionLib.sendText(10, 26 ,pricechedule);
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.pressKey("F12");
				Mainframe_GlobalFunctionLib.sendText(21, 12 ,"3" );
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.pressKey("F6");
				Mainframe_GlobalFunctionLib.sendText(9, 2, fromdate);
				Mainframe_GlobalFunctionLib.sendText(9, 12, thruDate);
				Mainframe_GlobalFunctionLib.sendText(9, 22 ,patientpayschedule);
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(16, 64 ,"Y");
				Mainframe_GlobalFunctionLib.pressKey("F12");
				Mainframe_GlobalFunctionLib.pressKey("F12");
				Mainframe_GlobalFunctionLib.pressKey("F12");
				
			}
	
		  	if(ScreenshotOption.equalsIgnoreCase("Always")){
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			}
			}catch(Exception e)
			{	
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				Assert.fail("The Plan edit 2 Member Eligibility and 28 Pricing are not set successfully.Screenshot is captured");
			}
	}
	
	public static void func_setMemberEligibility() throws ClassNotFoundException, GeneralLeanFtException, SQLException, ReportException, InterruptedException
	{
		Mainframe_GlobalFunctionLib.sendText(7, 24 ,"Y");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(16, 64 ,"Y");	
	}
	
	public static void func_setPricing() throws ClassNotFoundException, GeneralLeanFtException, SQLException, ReportException, InterruptedException
	{
		Mainframe_GlobalFunctionLib.sendText(13, 77 ,"Y");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(16, 64 ,"Y");
	}
	public static void Createplanwithpricing(String plancode,String fromdate,String description,String thruDate, String pricechedule, String patientpayschedule) throws Throwable
	{
	try {
		navigateToRxClaimPlanAdministrator();
	} catch (Exception e) {
		e.printStackTrace();
	}
	try{
			Mainframe_GlobalFunctionLib.sendText(21, 7 ,"4" );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(21, 7 ,"1" );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			if(!(func_SearchAndSelectADataEditMode("4,5" ,plancode ,"11,6" , plancode)))
			{
				Mainframe_GlobalFunctionLib.pressKey("F6");
				Mainframe_GlobalFunctionLib.sendText(13, 19 ,plancode);
				Mainframe_GlobalFunctionLib.sendText(14, 19, fromdate);
				Mainframe_GlobalFunctionLib.sendText(15, 19 ,description);
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(16, 64 ,"Y");
				Mainframe_GlobalFunctionLib.sendText(7, 24 ,"Y");
				Mainframe_GlobalFunctionLib.sendText(13, 77 ,"Y");
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(16, 64 ,"Y");
				Mainframe_GlobalFunctionLib.pressKey("F7");
				Mainframe_GlobalFunctionLib.sendText(7, 21 ,"28" );
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(21, 12 ,"1" );
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.pressKey("F6");
				Mainframe_GlobalFunctionLib.sendText(8, 12, fromdate);
				Mainframe_GlobalFunctionLib.sendText(8, 36, thruDate);
				Mainframe_GlobalFunctionLib.sendText(10, 26 ,pricechedule);
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				FunctionalLibrary.validateText("12" ,"27" , pricechedule );
				Mainframe_GlobalFunctionLib.pressKey("F12");
				Mainframe_GlobalFunctionLib.sendText(21, 12 ,"3" );
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.pressKey("F6");
				Mainframe_GlobalFunctionLib.sendText(9, 2, fromdate);
				Mainframe_GlobalFunctionLib.sendText(9, 12, thruDate);
				Mainframe_GlobalFunctionLib.sendText(9, 22 ,patientpayschedule);
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(16, 64 ,"Y");
				FunctionalLibrary.validateText("11" ,"23" , patientpayschedule );
				Mainframe_GlobalFunctionLib.pressKey("F12");
				Mainframe_GlobalFunctionLib.pressKey("F12");
				Mainframe_GlobalFunctionLib.pressKey("F12");
				Mainframe_GlobalFunctionLib.pressKey("F12");				
			}
			
			else
			{
				Mainframe_GlobalFunctionLib.sendText(7, 24 ,"Y");
				Mainframe_GlobalFunctionLib.sendText(13, 77 ,"Y");
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(16, 64 ,"Y");
				Mainframe_GlobalFunctionLib.pressKey("F7");
				Mainframe_GlobalFunctionLib.sendText(7, 21 ,"28" );
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(21, 12 ,"1" );
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.pressKey("F6");
				Mainframe_GlobalFunctionLib.sendText(8, 12, fromdate);
				Mainframe_GlobalFunctionLib.sendText(8, 36, thruDate);
				Mainframe_GlobalFunctionLib.sendText(10, 26 ,pricechedule);
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.pressKey("F12");
				Mainframe_GlobalFunctionLib.sendText(21, 12 ,"3" );
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.pressKey("F6");
				Mainframe_GlobalFunctionLib.sendText(9, 2, fromdate);
				Mainframe_GlobalFunctionLib.sendText(9, 12, thruDate);
				Mainframe_GlobalFunctionLib.sendText(9, 22 ,patientpayschedule);
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(16, 64 ,"Y");
				Mainframe_GlobalFunctionLib.pressKey("F12");
				Mainframe_GlobalFunctionLib.pressKey("F12");
				Mainframe_GlobalFunctionLib.pressKey("F12");
				
			}
	
		  	if(ScreenshotOption.equalsIgnoreCase("Always")){
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			}
			}catch(Exception e)
			{	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				Assert.fail("The Plan edit 2 Member Eligibility and 28 Pricing are not set successfully.Screenshot is captured");
			}
	}
	public static void SetupPlanEdit10(String plancode,String ndclist,String ndcfromdate,String ndcstatus) throws Throwable
	{
	try {
		navigateToRxClaimPlanAdministrator();
	} catch (Exception e) {
		e.printStackTrace();
	}
	try{
			Mainframe_GlobalFunctionLib.sendText(21, 7 ,"4" );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(21, 7 ,"1" );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			func_SearchAndSelectADataEditMode("4,5" ,plancode ,"11,6" , plancode);
			Mainframe_GlobalFunctionLib.pressKey("F7");
			Mainframe_GlobalFunctionLib.sendText(7, 21 ,"10" );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(7, 8, ndclist);
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(11, 2 ,"7" );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(11, 2 ,"2" );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(6, 57 ,"          ");
			Mainframe_GlobalFunctionLib.sendText(6, 57, ndcfromdate);
			Mainframe_GlobalFunctionLib.sendText(6, 78, ndcstatus);
			Mainframe_GlobalFunctionLib.pressKey("Enter");
	
		  	if(ScreenshotOption.equalsIgnoreCase("Always")){
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			}
			}catch(Exception e)
			{	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				Assert.fail("The Plan edit 10 is not set successfully.Screenshot is captured");
			}
	}
	
	public static void PlanWithNDCList(String plancode,String ndclist,String ndcsq, String ndcfromdate,String ndcthrudate) throws Throwable
	{
	try {
		navigateToRxClaimPlanAdministrator();
	} catch (Exception e) {
		e.printStackTrace();
	}
	try{
			Mainframe_GlobalFunctionLib.sendText(21, 7 ,"4" );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(21, 7 ,"1" );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			func_SearchAndSelectADataEditMode("4,5" ,plancode ,"11,6" , plancode);
			Mainframe_GlobalFunctionLib.sendText(15, 24 ,"Y" );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(16, 64 ,"Y" );
			Mainframe_GlobalFunctionLib.pressKey("F7");
			Mainframe_GlobalFunctionLib.sendText(7, 21 ,"10" );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			if(func_SearchAndEditPlanNDCGPIList(ndclist))
			{
				Mainframe_GlobalFunctionLib.sendText(13, 17 ,"   ");
				Mainframe_GlobalFunctionLib.sendText(13, 17, ndcsq);
				Mainframe_GlobalFunctionLib.sendText(14, 17 ,"        ");
				Mainframe_GlobalFunctionLib.sendText(14, 17, ndcfromdate);
				Mainframe_GlobalFunctionLib.sendText(14, 41 ,"        ");
				Mainframe_GlobalFunctionLib.sendText(14, 41, ndcthrudate);
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(16, 64 ,"Y" );
			}
			else
			{
				Mainframe_GlobalFunctionLib.pressKey("F6");
				func_SearchAndSelectMode("4, 5" ,ndclist ,"9,5" , ndclist);
				Mainframe_GlobalFunctionLib.sendText(13, 17 ,"   ");
				Mainframe_GlobalFunctionLib.sendText(13, 17, ndcsq);
				Mainframe_GlobalFunctionLib.sendText(14, 17 ,"        ");
				Mainframe_GlobalFunctionLib.sendText(14, 17, ndcfromdate);
				Mainframe_GlobalFunctionLib.sendText(14, 41 ,"        ");
				Mainframe_GlobalFunctionLib.sendText(14, 41, ndcthrudate);
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(16, 64 ,"Y" );
				Mainframe_GlobalFunctionLib.pressKey("F12");
			}	
		  	if(ScreenshotOption.equalsIgnoreCase("Always")){
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			}
			}catch(Exception e)
			{	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				Assert.fail("The Plan with NDC List is not set successfully.Screenshot is captured");
			}
	}
	
	public static void CreatePlanWithNDCList(String ndclist,String ndcsq, String ndcfromdate,String ndcthrudate) throws Throwable
	{
	
	try{
			Mainframe_GlobalFunctionLib.sendText(15, 24 ,"Y" );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(16, 64 ,"Y" );
			Mainframe_GlobalFunctionLib.pressKey("F7");
			Mainframe_GlobalFunctionLib.sendText(7, 21 ,"10" );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			if(func_SearchAndEditPlanNDCGPIList(ndclist))
			{
				Mainframe_GlobalFunctionLib.sendText(13, 17 ,"   ");
				Mainframe_GlobalFunctionLib.sendText(13, 17, ndcsq);
				Mainframe_GlobalFunctionLib.sendText(14, 17 ,"        ");
				Mainframe_GlobalFunctionLib.sendText(14, 17, ndcfromdate);
				Mainframe_GlobalFunctionLib.sendText(14, 41 ,"        ");
				Mainframe_GlobalFunctionLib.sendText(14, 41, ndcthrudate);
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(16, 64 ,"Y" );
			}
			else
			{
				Mainframe_GlobalFunctionLib.pressKey("F6");
				func_SearchAndSelectMode("4, 5" ,ndclist ,"9,5" , ndclist);
				Mainframe_GlobalFunctionLib.sendText(13, 17 ,"   ");
				Mainframe_GlobalFunctionLib.sendText(13, 17, ndcsq);
				Mainframe_GlobalFunctionLib.sendText(14, 17 ,"        ");
				Mainframe_GlobalFunctionLib.sendText(14, 17, ndcfromdate);
				Mainframe_GlobalFunctionLib.sendText(14, 41 ,"        ");
				Mainframe_GlobalFunctionLib.sendText(14, 41, ndcthrudate);
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(16, 64 ,"Y" );
				Mainframe_GlobalFunctionLib.pressKey("F12");
			}	
		  	if(ScreenshotOption.equalsIgnoreCase("Always")){
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			}
			}catch(Exception e)
			{	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				Assert.fail("The Add Plan with NDC List is not set successfully.Screenshot is captured");
			}
	}
	
	public static void PlanWithGPIList(String plancode,String gpilist,String gpisq, String gpifromdate,String gpithrudate) throws Throwable
	{
	try {
		navigateToRxClaimPlanAdministrator();
	} catch (Exception e) {
		e.printStackTrace();
	}
	try{
			Mainframe_GlobalFunctionLib.sendText(21, 7 ,"4" );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(21, 7 ,"1" );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			func_SearchAndSelectADataEditMode("4,5" ,plancode ,"11,6" , plancode);
			Mainframe_GlobalFunctionLib.sendText(6, 51 ,"Y" );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(16, 64 ,"Y" );
			Mainframe_GlobalFunctionLib.pressKey("F7");
			Mainframe_GlobalFunctionLib.sendText(7, 21 ,"11" );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			if(func_SearchAndEditPlanNDCGPIList(gpilist))
			{
				Mainframe_GlobalFunctionLib.sendText(13, 17 ,"   ");
				Mainframe_GlobalFunctionLib.sendText(13, 17, gpisq);
				Mainframe_GlobalFunctionLib.sendText(14, 17 ,"        ");
				Mainframe_GlobalFunctionLib.sendText(14, 17, gpifromdate);
				Mainframe_GlobalFunctionLib.sendText(14, 41 ,"        ");
				Mainframe_GlobalFunctionLib.sendText(14, 41, gpithrudate);
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(16, 64 ,"Y" );
			}
			else
			{
				Mainframe_GlobalFunctionLib.pressKey("F6");
				func_SearchAndSelectMode("4, 5" ,gpilist ,"9,5" , gpilist);
				Mainframe_GlobalFunctionLib.sendText(13, 17 ,"   ");
				Mainframe_GlobalFunctionLib.sendText(13, 17, gpisq);
				Mainframe_GlobalFunctionLib.sendText(14, 17 ,"        ");
				Mainframe_GlobalFunctionLib.sendText(14, 17, gpifromdate);
				Mainframe_GlobalFunctionLib.sendText(14, 41 ,"        ");
				Mainframe_GlobalFunctionLib.sendText(14, 41, gpithrudate);
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(16, 64 ,"Y" );
				Mainframe_GlobalFunctionLib.pressKey("F12");
			}	
		  	if(ScreenshotOption.equalsIgnoreCase("Always")){
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			}
			}catch(Exception e)
			{	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				Assert.fail("The Plan with NDC List is not set successfully.Screenshot is captured");
			}
	}
	public static void SetupPlanEdit15(String plancode,String maxrefill,String period,String effectivedate) throws Throwable
	{
	try {
		navigateToRxClaimPlanAdministrator();
	} catch (Exception e) {
		e.printStackTrace();
	}
	try{
			Mainframe_GlobalFunctionLib.sendText(21, 7 ,"4" );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(21, 7 ,"1" );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			func_SearchAndSelectADataEditMode("4,5" ,plancode ,"11,6" , plancode);
			Mainframe_GlobalFunctionLib.pressKey("F7");
			Mainframe_GlobalFunctionLib.sendText(7, 21 ,"15" );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(7, 22, maxrefill);
			Mainframe_GlobalFunctionLib.sendText(8, 22, period);
			Mainframe_GlobalFunctionLib.sendText(9, 22 ,"          ");
			Mainframe_GlobalFunctionLib.sendText(9, 22, effectivedate);
			Mainframe_GlobalFunctionLib.pressKey("Enter");
	
		  	if(ScreenshotOption.equalsIgnoreCase("Always")){
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			}
			}catch(Exception e)
			{	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				Assert.fail("The CAG is not created successfully.Screenshot is captured");
			}
	}
	
	public static void addAccumulators(String TrOOPfromdate,String TrOOPthrudate,String accumulationlevel,String accumulationcode, String TrOOPschedule,String CMSlabelerlist) throws Throwable
	{
	try{
			
			Mainframe_GlobalFunctionLib.sendText(14, 77 ,"Y");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(16, 64 ,"Y");
			Mainframe_GlobalFunctionLib.pressKey("F7");
			Mainframe_GlobalFunctionLib.sendText(7, 21 ,"29" );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(15, 12 ,"6" );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.pressKey("F6");
			Mainframe_GlobalFunctionLib.sendText(8, 13, TrOOPfromdate);
			Mainframe_GlobalFunctionLib.sendText(8, 41, TrOOPthrudate);
			Mainframe_GlobalFunctionLib.sendText(10, 28, accumulationlevel);
			/*System.out.println("size of Accumulation Code"+accumulationcode.length());
			if(accumulationcode.length()>0) {  
				Mainframe_GlobalFunctionLib.sendText(12, 28, accumulationcode);  
			} */ 
			if(accumulationcode.length()==0) {  
				Mainframe_GlobalFunctionLib.sendText(12, 28, "    ");  
			}
			else{
				Mainframe_GlobalFunctionLib.sendText(12, 28, accumulationcode);
			}
			Mainframe_GlobalFunctionLib.sendText(14, 28, TrOOPschedule);
			Mainframe_GlobalFunctionLib.sendText(16, 28, CMSlabelerlist);
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.pressKey("F12");
			Mainframe_GlobalFunctionLib.pressKey("F12");
			Mainframe_GlobalFunctionLib.pressKey("F12");
			
		  	if(ScreenshotOption.equalsIgnoreCase("Always")){
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			}
			}catch(Exception e)
			{	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				Assert.fail("The Plan edit 29 is not set successfully.Screenshot is captured");
			}
	}
	
	public static void SetCoveredPlanPaidAmount(String CPPFromDate,String CPPThruDate,String CPPAccumulationLevel,String CPPAccumulationCode, String CPPPatientPaySchedule,String CPPTrOOPSchedule, String Qualifier) throws Throwable
	{
	try{
			Mainframe_GlobalFunctionLib.pressKey("F19");
			Mainframe_GlobalFunctionLib.sendText(13, 34 ,"Y");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.pressKey("F7");
			Mainframe_GlobalFunctionLib.sendText(8, 21 ,"6");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.pressKey("F6");
			Mainframe_GlobalFunctionLib.sendText(7, 13, CPPFromDate);
			Mainframe_GlobalFunctionLib.sendText(7, 40, CPPThruDate);
			Mainframe_GlobalFunctionLib.sendText(8, 23, CPPAccumulationLevel);
			if(CPPAccumulationCode.length()==0) {  
				Mainframe_GlobalFunctionLib.sendText(10, 23, "    ");  
			}
			else{
				Mainframe_GlobalFunctionLib.sendText(10, 23, CPPAccumulationCode);
			}
			Mainframe_GlobalFunctionLib.sendText(13, 23, CPPPatientPaySchedule);
			Mainframe_GlobalFunctionLib.sendText(12, 23, CPPTrOOPSchedule);
			Mainframe_GlobalFunctionLib.sendText(15, 23, Qualifier);
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.pressKey("F12");
			Mainframe_GlobalFunctionLib.pressKey("F12");
			Mainframe_GlobalFunctionLib.pressKey("F12");
			Mainframe_GlobalFunctionLib.pressKey("F12");
			Mainframe_GlobalFunctionLib.pressKey("F12");
			Mainframe_GlobalFunctionLib.pressKey("F12");
		  	if(ScreenshotOption.equalsIgnoreCase("Always")){
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			}
			}catch(Exception e)
			{	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				Assert.fail("The Set Covered Plan Paid Amount is not set successfully.Screenshot is captured");
			}
	}
	public static void func_CreatePlanWithRefill(String plancode,String maxrefill,String period,String effectivedate) throws Throwable
	{
	try {
		navigateToRxClaimPlanAdministrator();
	} catch (Exception e) {
		e.printStackTrace();
	}
	try{
			Mainframe_GlobalFunctionLib.sendText(21, 7 ,"4" );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(21, 7 ,"1" );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			func_SearchAndSelectADataEditMode("4,5" ,plancode ,"11,6" , plancode);
			Mainframe_GlobalFunctionLib.pressKey("F7");
			Mainframe_GlobalFunctionLib.sendText(7, 21 ,"15" );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(7, 22, maxrefill);
			Mainframe_GlobalFunctionLib.sendText(8, 22, period);
			Mainframe_GlobalFunctionLib.sendText(9, 22 ,"          ");
			Mainframe_GlobalFunctionLib.sendText(9, 22, effectivedate);
			Mainframe_GlobalFunctionLib.pressKey("Enter");
	
		  	if(ScreenshotOption.equalsIgnoreCase("Always")){
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			}
			}catch(Exception e)
			{	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				Assert.fail("The Max Refill is not created successfully.Screenshot is captured");
			}
	}
	public static void CreateTransaction(String bin, String proc, String group, String pharmacyID, String rxNbr, String refill, String fillDate, String memberID, String productId, String dspQty, String ds, String psc, String cost) throws Throwable
	{	
		try {
			navigateToRxClaimPlanAdministrator();
		} catch (Exception e) {
			e.printStackTrace();
		}
		try{
		Mainframe_GlobalFunctionLib.sendText(21, 7 ,"3" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(21, 7 ,"2" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(21, 7 ,"1" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		if(func_SearchForMemberID("4,4" ,memberID ,"9,4" , memberID))
		{
				Thread.sleep(1000);
				Mainframe_GlobalFunctionLib.click(4, 29 );
				Mainframe_GlobalFunctionLib.sendText(4, 29, pharmacyID);
				///Thread.sleep(3000);
				Mainframe_GlobalFunctionLib.sendText(4 , 65 ,"          ");
				Mainframe_GlobalFunctionLib.sendText(4, 65, fillDate);
				Mainframe_GlobalFunctionLib.sendText(5,29, func_GenerateDynamicRxNo());
				Mainframe_GlobalFunctionLib.sendText(5, 47, refill);			
				Mainframe_GlobalFunctionLib.click(7, 12 );
				Mainframe_GlobalFunctionLib.sendText(7, 12, memberID);
				Mainframe_GlobalFunctionLib.pressKey("F4");
				Mainframe_GlobalFunctionLib.sendText(3, 4, memberID);
				Mainframe_GlobalFunctionLib.pressKey("Enter");         
				Mainframe_GlobalFunctionLib.sendText(8, 2,"1" );
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(11, 20,productId );
				Mainframe_GlobalFunctionLib.sendText(12, 11,"           " );
				Mainframe_GlobalFunctionLib.sendText(12, 11,dspQty );
				Mainframe_GlobalFunctionLib.sendText(12, 26,"   " );
				Mainframe_GlobalFunctionLib.sendText(12, 26,ds);
				Mainframe_GlobalFunctionLib.sendText(14, 6,psc );
//				Mainframe_GlobalFunctionLib.sendText(14, 14,"0" );
				Mainframe_GlobalFunctionLib.sendText(10, 47,"         " );
				Mainframe_GlobalFunctionLib.sendText(10, 47,cost );
		}
		else{
			Mainframe_GlobalFunctionLib.pressKey("F6");
			Mainframe_GlobalFunctionLib.sendText(11, 14,bin );
			Mainframe_GlobalFunctionLib.sendText(11, 41,proc );
			Mainframe_GlobalFunctionLib.sendText(11, 59,group );
			Mainframe_GlobalFunctionLib.sendText(12, 14,pharmacyID );
			Mainframe_GlobalFunctionLib.sendText(12, 41,func_GenerateDynamicRxNo());
			Mainframe_GlobalFunctionLib.sendText(12, 59,refill );
			Mainframe_GlobalFunctionLib.sendText(14, 41,memberID );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.click(7, 12 );
			Mainframe_GlobalFunctionLib.pressKey("F4");
			Thread.sleep(1000);
			Mainframe_GlobalFunctionLib.sendText(3, 4, memberID);
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(8, 2,"1" );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(4 , 65 ,"          ");
			Mainframe_GlobalFunctionLib.sendText(4, 65, fillDate);			
			Mainframe_GlobalFunctionLib.sendText(11, 20,productId );
			Mainframe_GlobalFunctionLib.sendText(12, 11,dspQty );
			Mainframe_GlobalFunctionLib.sendText(12, 26,ds );
			Mainframe_GlobalFunctionLib.sendText(14, 6,psc );
			Mainframe_GlobalFunctionLib.sendText(10, 47,"         " );
			Mainframe_GlobalFunctionLib.sendText(10, 47,cost );
		}
			System.out.println("Claim is created");
			if(ScreenshotOption.equalsIgnoreCase("Always")){
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				}
				}catch(Exception e)
				{	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
					Assert.fail("An error has occured while creating the caim transaction.Screenshot is captured");
				}
	}
	
	//Paid Claim with Retail Pharmacy
	public static void CreateTransactionRetailMOPharmacy(String bin, String proc, String group, String pharmacyID, String rxNbr, String refill, String fillDate, String memberID, String productId, String dspQty, String ds, String psc, String cost, String prequal, String preid, String ucw) throws Throwable
	{	
		try {
			navigateToRxClaimPlanAdministrator();
		} catch (Exception e) {
			e.printStackTrace();
		}
		try{
		Mainframe_GlobalFunctionLib.sendText(21, 7 ,"3" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(21, 7 ,"2" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(21, 7 ,"1" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		if(func_SearchForMemberID("4,4" ,memberID ,"9,4" , memberID))
		{
				Thread.sleep(1000);
				Mainframe_GlobalFunctionLib.click(4, 29 );
				Mainframe_GlobalFunctionLib.sendText(4, 29, pharmacyID);
				///Thread.sleep(3000);
				Mainframe_GlobalFunctionLib.sendText(4 , 65 ,"          ");
				Mainframe_GlobalFunctionLib.sendText(4, 65, fillDate);
				Mainframe_GlobalFunctionLib.sendText(5,29, func_GenerateDynamicRxNo());
				Mainframe_GlobalFunctionLib.sendText(5, 47, refill);			
				Mainframe_GlobalFunctionLib.click(7, 12 );
				Mainframe_GlobalFunctionLib.sendText(7, 12, memberID);
				Mainframe_GlobalFunctionLib.pressKey("F4");
				Mainframe_GlobalFunctionLib.sendText(3, 4, memberID);
				Mainframe_GlobalFunctionLib.pressKey("Enter");         
				Mainframe_GlobalFunctionLib.sendText(8, 2,"1" );
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(11, 20,productId );
				Mainframe_GlobalFunctionLib.sendText(12, 11,"           " );
				Mainframe_GlobalFunctionLib.sendText(12, 11,dspQty );
				Mainframe_GlobalFunctionLib.sendText(12, 26,"   " );
				Mainframe_GlobalFunctionLib.sendText(12, 26,ds);
				Mainframe_GlobalFunctionLib.sendText(14, 6,psc );
				Mainframe_GlobalFunctionLib.sendText(10, 47,"         " );
				Mainframe_GlobalFunctionLib.sendText(10, 47,cost );
				Mainframe_GlobalFunctionLib.sendText(19, 19,prequal );
				Mainframe_GlobalFunctionLib.sendText(19, 26,preid );
				Mainframe_GlobalFunctionLib.sendText(20, 47,"         " );
				Mainframe_GlobalFunctionLib.sendText(20, 47,ucw );
		}
		else{
			Mainframe_GlobalFunctionLib.pressKey("F6");
			Mainframe_GlobalFunctionLib.sendText(11, 14,bin );
			Mainframe_GlobalFunctionLib.sendText(11, 41,proc );
			Mainframe_GlobalFunctionLib.sendText(11, 59,group );
			Mainframe_GlobalFunctionLib.sendText(12, 14,pharmacyID );
			Mainframe_GlobalFunctionLib.sendText(12, 41,func_GenerateDynamicRxNo());
			Mainframe_GlobalFunctionLib.sendText(12, 59,refill );
			Mainframe_GlobalFunctionLib.sendText(14, 41,memberID );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.click(7, 12 );
			Mainframe_GlobalFunctionLib.pressKey("F4");
			Thread.sleep(1000);
			Mainframe_GlobalFunctionLib.sendText(3, 4, memberID);
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(8, 2,"1" );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(4 , 65 ,"          ");
			Mainframe_GlobalFunctionLib.sendText(4, 65, fillDate);			
			Mainframe_GlobalFunctionLib.sendText(11, 20,productId );
			Mainframe_GlobalFunctionLib.sendText(12, 11,dspQty );
			Mainframe_GlobalFunctionLib.sendText(12, 26,ds );
			Mainframe_GlobalFunctionLib.sendText(14, 6,psc );
			Mainframe_GlobalFunctionLib.sendText(10, 47,"         " );
			Mainframe_GlobalFunctionLib.sendText(10, 47,cost );
			Mainframe_GlobalFunctionLib.sendText(19, 19,prequal );
			Mainframe_GlobalFunctionLib.sendText(19, 26,preid );
			Mainframe_GlobalFunctionLib.sendText(20, 47,"         " );
			Mainframe_GlobalFunctionLib.sendText(20, 47,ucw );
		}
			System.out.println("Claim is created");
			if(ScreenshotOption.equalsIgnoreCase("Always")){
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				}
				}catch(Exception e)
				{	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
					Assert.fail("An error has occured while creating the caim transaction.Screenshot is captured");
				}
	}
	
	//Compound Claim 
		public static void createCompoundClaim(String bin, String proc, String group, String pharmacyID, String rxNbr, String refill, String fillDate, String memberID, String productId, String dspQty, String ds, String psc, String cost, String prequal, String preid, String ucw , String compQualID , String compProductID , String compQuantity ,String compCost , String compBasisOfCost) throws Throwable
		{	
			try {
				navigateToRxClaimPlanAdministrator();
			} catch (Exception e) {
				e.printStackTrace();
			}
			try{
			Mainframe_GlobalFunctionLib.sendText(21, 7 ,"3" );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(21, 7 ,"2" );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(21, 7 ,"1" );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			if(func_SearchForMemberID("4,4" ,memberID ,"9,4" , memberID))
			{
					Thread.sleep(1000);
					Mainframe_GlobalFunctionLib.click(4, 29 );
					Mainframe_GlobalFunctionLib.sendText(4, 29, pharmacyID);
					Mainframe_GlobalFunctionLib.sendText(5,29, func_GenerateDynamicRxNo());
					Mainframe_GlobalFunctionLib.sendText(5, 47, refill);	
			}
			else
			{
				Mainframe_GlobalFunctionLib.pressKey("F6");
				//Mainframe_GlobalFunctionLib.pressKey("F4");
				Mainframe_GlobalFunctionLib.sendText(11, 14,bin );
				Mainframe_GlobalFunctionLib.sendText(11, 41,proc );
				Mainframe_GlobalFunctionLib.sendText(11, 59,group );
				Mainframe_GlobalFunctionLib.sendText(12, 14,pharmacyID );
				Mainframe_GlobalFunctionLib.sendText(12, 41,func_GenerateDynamicRxNo());
				Mainframe_GlobalFunctionLib.sendText(12, 59,refill );
				Mainframe_GlobalFunctionLib.sendText(14, 41,memberID );
				Mainframe_GlobalFunctionLib.pressKey("Enter");
			}
		//	Thread.sleep(10000);
			
					Mainframe_GlobalFunctionLib.sendText(4 , 65 ,"          ");
					Mainframe_GlobalFunctionLib.sendText(4, 65, fillDate);
					//Mainframe_GlobalFunctionLib.sendText(5,29, func_GenerateDynamicRxNo());
					//Mainframe_GlobalFunctionLib.sendText(5, 47, refill);			
					Mainframe_GlobalFunctionLib.click(7, 12 );
					Mainframe_GlobalFunctionLib.sendText(7, 12, memberID);
					Mainframe_GlobalFunctionLib.pressKey("F4");
					Mainframe_GlobalFunctionLib.sendText(3, 4, memberID);
					Mainframe_GlobalFunctionLib.pressKey("Enter");         
					Mainframe_GlobalFunctionLib.sendText(8, 2,"1" );
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					Mainframe_GlobalFunctionLib.sendText(11, 20,productId );
					Mainframe_GlobalFunctionLib.sendText(12, 11,"           " );
					Mainframe_GlobalFunctionLib.sendText(12, 11,dspQty );
					Mainframe_GlobalFunctionLib.sendText(12, 26,"   " );
					Mainframe_GlobalFunctionLib.sendText(12, 26,ds);
					Mainframe_GlobalFunctionLib.sendText(14, 6,psc );
					Mainframe_GlobalFunctionLib.sendText(14, 14,"1" );
					Mainframe_GlobalFunctionLib.sendText(10, 47,"         " );
					Mainframe_GlobalFunctionLib.sendText(10, 47,cost );
					Mainframe_GlobalFunctionLib.sendText(19, 19,prequal );
					Mainframe_GlobalFunctionLib.sendText(19, 26,preid );
					Mainframe_GlobalFunctionLib.sendText(20, 47,"         " );
					Mainframe_GlobalFunctionLib.sendText(20, 47,ucw );
					Mainframe_GlobalFunctionLib.pressKey("F14");
					Mainframe_GlobalFunctionLib.sendText(5, 23,"5" );
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					Mainframe_GlobalFunctionLib.pressKey("F6");
					Mainframe_GlobalFunctionLib.sendText(12, 20,compQualID );
					Mainframe_GlobalFunctionLib.sendText(13, 20,compProductID );
					Mainframe_GlobalFunctionLib.sendText(15, 20,compQuantity );
					Mainframe_GlobalFunctionLib.sendText(16, 20,compCost);
					Mainframe_GlobalFunctionLib.sendText(18, 20,compBasisOfCost);
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					Mainframe_GlobalFunctionLib.pressKey("F12");
					Mainframe_GlobalFunctionLib.pressKey("F12");
					System.out.println("Compound Claim is submitted");
				if(ScreenshotOption.equalsIgnoreCase("Always")){
					Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
					}
					}catch(Exception e)
			
					{	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
					e.printStackTrace();
						Assert.fail("An error has occured while creating the claim transaction.Screenshot is captured");
					}
		}
		
		
				//Compound Claim with Multi Ingredient 
				public static void compoundClaimWithMultiIngredient(String bin, String proc, String group, String pharmacyID, String rxNbr, String refill, String fillDate, String memberID, String productId, String dspQty, String ds, String psc, String cost, String prequal, String preid, String ucw , String compQualID_1 , String compProductID_1 , String compQuantity_1 ,String compCost_1 , String compBasisOfCost_1 , String compQualID_2 , String compProductID_2 , String compQuantity_2 ,String compCost_2 , String compBasisOfCost_2) throws Throwable
				{	
					try {
						navigateToRxClaimPlanAdministrator();
					} catch (Exception e) {
						e.printStackTrace();
					}
					try{
					Mainframe_GlobalFunctionLib.sendText(21, 7 ,"3" );
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					Mainframe_GlobalFunctionLib.sendText(21, 7 ,"2" );
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					Mainframe_GlobalFunctionLib.sendText(21, 7 ,"1" );
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					if(func_SearchForMemberID("4,4" ,memberID ,"9,4" , memberID))
					{
							Thread.sleep(1000);
							Mainframe_GlobalFunctionLib.click(4, 29 );
							Mainframe_GlobalFunctionLib.sendText(4, 29, pharmacyID);
							Mainframe_GlobalFunctionLib.sendText(5,29, func_GenerateDynamicRxNo());
							Mainframe_GlobalFunctionLib.sendText(5, 47, refill);	
					}
					else
					{
						Mainframe_GlobalFunctionLib.pressKey("F6");
						Mainframe_GlobalFunctionLib.sendText(11, 14,bin );
						Mainframe_GlobalFunctionLib.sendText(11, 41,proc );
						Mainframe_GlobalFunctionLib.sendText(11, 59,group );
						Mainframe_GlobalFunctionLib.sendText(12, 14,pharmacyID );
						Mainframe_GlobalFunctionLib.sendText(12, 41,func_GenerateDynamicRxNo());
						Mainframe_GlobalFunctionLib.sendText(12, 59,refill );
						Mainframe_GlobalFunctionLib.sendText(14, 41,memberID );
						Mainframe_GlobalFunctionLib.pressKey("Enter");
					}
				
							Mainframe_GlobalFunctionLib.sendText(4 , 65 ,"          ");
							Mainframe_GlobalFunctionLib.sendText(4, 65, fillDate);			
							Mainframe_GlobalFunctionLib.click(7, 12 );
							Mainframe_GlobalFunctionLib.sendText(7, 12, memberID);
							Mainframe_GlobalFunctionLib.pressKey("F4");
							Mainframe_GlobalFunctionLib.sendText(3, 4, memberID);
							Mainframe_GlobalFunctionLib.pressKey("Enter");         
							Mainframe_GlobalFunctionLib.sendText(8, 2,"1" );
							Mainframe_GlobalFunctionLib.pressKey("Enter");
							Mainframe_GlobalFunctionLib.sendText(11, 20,productId );
							Mainframe_GlobalFunctionLib.sendText(12, 11,"           " );
							Mainframe_GlobalFunctionLib.sendText(12, 11,dspQty );
							Mainframe_GlobalFunctionLib.sendText(12, 26,"   " );
							Mainframe_GlobalFunctionLib.sendText(12, 26,ds);
							Mainframe_GlobalFunctionLib.sendText(14, 6,psc );
							Mainframe_GlobalFunctionLib.sendText(14, 14,"1" );
							Mainframe_GlobalFunctionLib.sendText(10, 47,"         " );
							Mainframe_GlobalFunctionLib.sendText(10, 47,cost );
							Mainframe_GlobalFunctionLib.sendText(19, 19,prequal );
							Mainframe_GlobalFunctionLib.sendText(19, 26,preid );
							Mainframe_GlobalFunctionLib.sendText(20, 47,"         " );
							Mainframe_GlobalFunctionLib.sendText(20, 47,ucw );
							Mainframe_GlobalFunctionLib.pressKey("F14");
							Mainframe_GlobalFunctionLib.sendText(5, 23,"5" );
							Mainframe_GlobalFunctionLib.pressKey("Enter");
							Mainframe_GlobalFunctionLib.pressKey("F6");
							Mainframe_GlobalFunctionLib.sendText(12, 20,compQualID_1 );
							Mainframe_GlobalFunctionLib.sendText(13, 20,compProductID_1 );
							Mainframe_GlobalFunctionLib.sendText(15, 20,compQuantity_1 );
							Mainframe_GlobalFunctionLib.sendText(16, 20,compCost_1);
							Mainframe_GlobalFunctionLib.sendText(18, 20,compBasisOfCost_1);
							Mainframe_GlobalFunctionLib.pressKey("Enter");
							Mainframe_GlobalFunctionLib.pressKey("F6");
							Mainframe_GlobalFunctionLib.sendText(12, 20,compQualID_2 );
							Mainframe_GlobalFunctionLib.sendText(13, 20,compProductID_2 );
							Mainframe_GlobalFunctionLib.sendText(15, 20,compQuantity_2 );
							Mainframe_GlobalFunctionLib.sendText(16, 20,compCost_2);
							Mainframe_GlobalFunctionLib.sendText(18, 20,compBasisOfCost_2);
							Mainframe_GlobalFunctionLib.pressKey("Enter");
							Mainframe_GlobalFunctionLib.pressKey("F12");
							Mainframe_GlobalFunctionLib.pressKey("F12");
							
						System.out.println("Compound Claim is submitted");
						if(ScreenshotOption.equalsIgnoreCase("Always")){
							Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
							}
							}catch(Exception e)
					
							{	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
							e.printStackTrace();
								Assert.fail("An error has occured while creating the claim transaction.Screenshot is captured");
							}
				}
		
	public static void submitClaim() throws GeneralLeanFtException, InterruptedException, IOException{
		try{
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Thread.sleep(2000);
		
		if(ScreenshotOption.equalsIgnoreCase("Always")){
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			Reporter.addStepLog("RxClaim Number :"+ Mainframe_GlobalFunctionLib.getText(20, 12));
			
			}
			}catch(Exception e)
			{	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			
				Assert.fail("The Claim is not submitted successfully.Screenshot is captured");
				
			}
	}
	
	
	public static void submitClaimF18() throws GeneralLeanFtException, InterruptedException, IOException{
		try{
			Mainframe_GlobalFunctionLib.pressKey("PageDown");
			Mainframe_GlobalFunctionLib.sendText(4, 55,"1" );
			Mainframe_GlobalFunctionLib.pressKey("PageUp");
			
		Mainframe_GlobalFunctionLib.pressKey("F18");
		Thread.sleep(2000);
		
		if(ScreenshotOption.equalsIgnoreCase("Always")){
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			}
			}catch(Exception e)
			{	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			
				Assert.fail("The Claim is not submitted successfully.Screenshot is captured");
				
			}
	}
	
	public static void submitClaimF18WithoutRxOrigin() throws GeneralLeanFtException, InterruptedException, IOException{
		try{
						
		Mainframe_GlobalFunctionLib.pressKey("F18");
		Thread.sleep(2000);
		
		if(ScreenshotOption.equalsIgnoreCase("Always")){
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			}
			}catch(Exception e)
			{	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			
				Assert.fail("The Claim is not submitted successfully.Screenshot is captured");
				
			}
	}
	public static void submitReversalClaim() throws GeneralLeanFtException, InterruptedException, IOException{
		try{
			Mainframe_GlobalFunctionLib.pressKey("F7");
			Mainframe_GlobalFunctionLib.pressKey("F6");
			Mainframe_GlobalFunctionLib.pressKey("F6");
			
		Thread.sleep(2000);
		
		if(ScreenshotOption.equalsIgnoreCase("Always")){
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			}
			}catch(Exception e)
			{	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			
				Assert.fail("The Reverse Claim is not submitted successfully.Screenshot is captured");
				
			}
	}
	public static boolean func_SearchAndSelectADataEditMode(String RowColOfData,String Data,String StartRowColToSearch,String DataSearch) throws IOException
	{
	boolean bRes=false;
	try{
	
	StringTokenizer stData=new StringTokenizer(RowColOfData,",");
	StringTokenizer stDataSearch=new StringTokenizer(StartRowColToSearch,",");
	int row=Integer.valueOf(stDataSearch.nextToken());
	String col=stDataSearch.nextToken();
	
	
		Mainframe_GlobalFunctionLib.sendText(stData.nextToken(),stData.nextToken(), Data);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
	
 System.out.println("check the row value"+row);
	
		if(Mainframe_GlobalFunctionLib.getText(row, Integer.parseInt(col)).trim().toLowerCase().contentEquals(DataSearch.trim().toLowerCase()))
	{
	
	bRes=true;
	Mainframe_GlobalFunctionLib.sendText(row, 2, "2");
	Mainframe_GlobalFunctionLib.pressKey("Enter");
	Thread.sleep(2000);
	}
	}
	catch(Exception e){
		
		return bRes;
		
	}
	
	
	 return bRes;
	}
	
	public static boolean func_SearchAndEditPlanNDCGPIList(String ndcgpilist) throws IOException
	{

		boolean bResult= false;
		try{
		Mainframe_GlobalFunctionLib.sendText(7, 8, ndcgpilist);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		
		Loop:	for (int i = 11; i <=12; i++) {

			if(Mainframe_GlobalFunctionLib.getText(i, 8).trim().toLowerCase().contains(ndcgpilist.toLowerCase()))
			{

				bResult= true;
				Mainframe_GlobalFunctionLib.sendText(i, 2, "2");
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				break Loop;
			}
			i=i+1;
		}
		}
		catch(Exception e){
			
			return bResult;
			
		}
		return bResult;
	}
	public static boolean func_SearchAndSelectMode(String RowColOfData,String Data,String StartRowColToSearch,String DataSearch) throws IOException
	{
	boolean bRes=false;
	try{
	
	StringTokenizer stData=new StringTokenizer(RowColOfData,",");
	StringTokenizer stDataSearch=new StringTokenizer(StartRowColToSearch,",");
	int row=Integer.valueOf(stDataSearch.nextToken());
	String col=stDataSearch.nextToken();
	
	
		Mainframe_GlobalFunctionLib.sendText(stData.nextToken(),stData.nextToken(), Data);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
	
 System.out.println("check the row value"+row);
	
		if(Mainframe_GlobalFunctionLib.getText(row, Integer.parseInt(col)).trim().toLowerCase().contentEquals(DataSearch.trim().toLowerCase()))
	{
	
	bRes=true;
	Mainframe_GlobalFunctionLib.sendText(row, 2, "1");
	Mainframe_GlobalFunctionLib.pressKey("Enter");
	Thread.sleep(2000);
	}
	}
	catch(Exception e){
		
		return bRes;
		
	}
	
	
	 return bRes;
	}
	
	public static boolean func_SearchAndEditContractAndPBP(String contract, String pbp) throws IOException
	{

		boolean bRes=false;
		try{
		
		/*StringTokenizer stData=new StringTokenizer(RowColOfData,",");
		StringTokenizer stDataSearch=new StringTokenizer(StartRowColToSearch,",");*/
//		int row=Integer.valueOf(stDataSearch.nextToken());
//		String col=stDataSearch.nextToken();
		
		
//			Mainframe_GlobalFunctionLib.sendText(stData.nextToken(),stData.nextToken(), Data);
			Mainframe_GlobalFunctionLib.sendText(4, 5, contract);
			Mainframe_GlobalFunctionLib.sendText(4, 16, pbp);
			Mainframe_GlobalFunctionLib.pressKey("Enter");
		
//	 System.out.println("check the row value"+row);
		
			if(Mainframe_GlobalFunctionLib.getText(10,5).trim().toLowerCase().contentEquals(contract.trim().toLowerCase())&&Mainframe_GlobalFunctionLib.getText(10,15).trim().toLowerCase().contentEquals(pbp.trim().toLowerCase()))
		{
		
		bRes=true;
		Mainframe_GlobalFunctionLib.sendText(10, 2, "2");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Thread.sleep(2000);
		}
		}
		catch(Exception e){
			
			return bRes;
			
		}
		
		
		 return bRes;
		
	}
	
	
	public static boolean func_SearchAndEditProfileAndType(String profile, String type) throws IOException
	{
		boolean bRes=false;
		try{
			Mainframe_GlobalFunctionLib.sendText(4, 5, profile);
			Mainframe_GlobalFunctionLib.sendText(4, 50, type);
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			if(Mainframe_GlobalFunctionLib.getText(9,5).trim().toLowerCase().contentEquals(profile.trim().toLowerCase())&&Mainframe_GlobalFunctionLib.getText(9,50).trim().toLowerCase().contentEquals(type.trim().toLowerCase()))
		{
		bRes=true;
		Mainframe_GlobalFunctionLib.sendText(10, 2, "2");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Thread.sleep(2000);
		}
		}
		catch(Exception e){
			return bRes;	
		}
		 return bRes;
		
	}
	public static boolean func_SearchAndSelectContractAndPBP(String contract, String pbp) throws IOException
	{

		boolean bResult= false;
		try{
		Mainframe_GlobalFunctionLib.sendText(4, 5, contract);
		Mainframe_GlobalFunctionLib.sendText(4, 16, pbp);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		
		Loop:	for (int i = 10; i <=11; i++) {

			if(Mainframe_GlobalFunctionLib.getText(i, 5).trim().toLowerCase().contains(contract.toLowerCase())&&Mainframe_GlobalFunctionLib.getText(i, 16).trim().toLowerCase().contains(pbp.toLowerCase()))
			{

				bResult= true;
				Mainframe_GlobalFunctionLib.sendText(i, 2, "1");
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				break Loop;
			}
			i=i+3;
		}
		}
		catch(Exception e){
			
			return bResult;
			
		}
		return bResult;
	}
	
	public static boolean func_SearchAndEditPartDMasterProfile(String carrierID, String accountID, String groupID, String plancode) throws IOException
	{

		boolean bResult= false;
		try{
		Mainframe_GlobalFunctionLib.sendText(4, 5, carrierID);
		Mainframe_GlobalFunctionLib.sendText(4, 16, accountID);
		Mainframe_GlobalFunctionLib.sendText(4, 33, groupID);
		Mainframe_GlobalFunctionLib.sendText(4, 50, plancode);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		
		Loop:	for (int i = 9; i <=10; i++) {

			if(Mainframe_GlobalFunctionLib.getText(i, 5).trim().toLowerCase().contains(carrierID.toLowerCase())&&Mainframe_GlobalFunctionLib.getText(i, 16).trim().toLowerCase().contains(accountID.toLowerCase())&&Mainframe_GlobalFunctionLib.getText(i, 33).trim().toLowerCase().contains(groupID.toLowerCase())&&Mainframe_GlobalFunctionLib.getText(i, 50).trim().toLowerCase().contains(plancode.toLowerCase()))
			{

				bResult= true;
				Mainframe_GlobalFunctionLib.sendText(i, 2, "2");
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				break Loop;
			}
			i=i+1;
		}
		}
		catch(Exception e){
			
			return bResult;
			
		}
		return bResult;
	}
	public static boolean func_SearchForMemberID(String RowColOfData,String Data,String StartRowColToSearch,String DataSearch) throws IOException
	{
	boolean bRes=false;
	try{
	
		
	StringTokenizer stData=new StringTokenizer(RowColOfData,",");
	StringTokenizer stDataSearch=new StringTokenizer(StartRowColToSearch,",");
	int row=Integer.valueOf(stDataSearch.nextToken());
	String col=stDataSearch.nextToken();
	
	
		Mainframe_GlobalFunctionLib.sendText(stData.nextToken(),stData.nextToken(), Data);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
	
 System.out.println("check the row value"+row);
	
		if(Mainframe_GlobalFunctionLib.getText(row, Integer.parseInt(col)).trim().toLowerCase().contentEquals(DataSearch.trim().toLowerCase()))
	{
	
	bRes=true;
	Mainframe_GlobalFunctionLib.sendText(row, 2, "1");
	Mainframe_GlobalFunctionLib.pressKey("Enter");
	Thread.sleep(2000);
	}
	}
	catch(Exception e){
		
		return bRes;
		
	}
	
	
	 return bRes;
	}
/*	public static void enterText(int i, int j, String string) throws Exception  {
		try{
		String[] coordinates = null;
		coordinates = ReadPropertyFile.getProperty(string , j);			
		Mainframe_GlobalFunctionLib.sendText(coordinates[0] ,coordinates[1] , i);
		//test.log(LogStatus.PASS,"Entered text in field "+ fieldName+" on screen "+screenName  ,test.addScreenCapture(Screenshot.screenshot()));
		Reporter.addStepLog("Entered text in field "+ j+ "at position "+coordinates[0]+","+coordinates[1]+" on screen "+ string);
		if(ScreenshotOption.equalsIgnoreCase("Always")){
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		}
		}catch(Exception e){
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			//Reporter.addStepLog(Assert.fail("The text is not entered.Screenshot captured");
			Assert.fail("The text is not entered.Screenshot captured");
			
		}
	}*/
	
	public static void enterText(int row, int col, String fieldValue) throws Exception  {
		try{
					
		Mainframe_GlobalFunctionLib.sendText(row , col , fieldValue);
		//test.log(LogStatus.PASS,"Entered text in field "+ fieldName+" on screen "+screenName  ,test.addScreenCapture(Screenshot.screenshot()));
		Reporter.addStepLog("Entered text at position "+ row+","+col+ "on screen ");
		if(ScreenshotOption.equalsIgnoreCase("Always")){
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		}
		}catch(Exception e){
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			Assert.fail("The text is not entered.Screenshot captured");
			
		}
	}
		public static void validateText(String row , String col , String text) throws IOException{
			try{
				//boolean b = 
				Reporter.addStepLog("Expected Value :" +text);
				Reporter.addStepLog("Actual Value :" +Mainframe_GlobalFunctionLib.getText(Integer.parseInt(row), Integer.parseInt(col)));
					Mainframe_GlobalFunctionLib.validateText(row ,col , text );	
				 if(ScreenshotOption.equalsIgnoreCase("Always")){
					Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
					//if( b == false)
						//Assert.fail("The text "+ text +" does not match on the screen.Screenshot captured.");
						
					}
					}catch(Exception e){
						Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
						Assert.fail("The text "+ text +" does not match on the screen.Screenshot captured.");
						
					}
		
			
		}

		public static boolean msgvalidation(String row , String col , String text) throws IOException{
			try{
				boolean bRes= false;
					Mainframe_GlobalFunctionLib.validateText(row ,col , text );	
				if(ScreenshotOption.equalsIgnoreCase("Always")){
					Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
					//if( b == false)
						//Assert.fail("The text "+ text +" does not match on the screen.Screenshot captured.");
					
					}
					}catch(Exception e){
						Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
						Assert.fail("The text "+ text +" does not match on the screen.Screenshot captured.");
						
					}
			return true;
		
			
		}
		public static String getText(int row , int col) throws IOException{
			String text = null;
			try{
				text = Mainframe_GlobalFunctionLib.getText(row ,col);	
				if(ScreenshotOption.equalsIgnoreCase("Always")){
					Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
					}
				
					}catch(Exception e){
						Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
						Assert.fail("The text is not fetched from screen position "+ row + ","+col+".Screenshot captured.");
						
					}
			return text;
		
			
		}
		
		
		public static void pressKey(String key) throws IOException{
			try{
				Mainframe_GlobalFunctionLib.pressKey(key);
				if(ScreenshotOption.equalsIgnoreCase("Always")){
					Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
					}
					}catch(Exception e){
						Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
						Assert.fail("The key "+key+" is not pressed.Screenshot captured.");
						
					}
		
			
		}

		public static void pressEnter() throws IOException{
			try{
				Mainframe_GlobalFunctionLib.Transmit();
				if(ScreenshotOption.equalsIgnoreCase("Always")){
					Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
					}
					}catch(Exception e){
						Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
						Assert.fail("The Enter key is not pressed.Screenshot captured.");
						
					}
		
			
		}
		
				
		public static void closeTE() throws IOException{
			try{
				Mainframe_GlobalFunctionLib.closeTE();
				if(ScreenshotOption.equalsIgnoreCase("Always")){
					Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
					}
					}catch(Exception e){
						Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
						Assert.fail("The Terminal sesssion is not closed.Screenshot captured.");
						
					}
		
			
		}
		
		//Dynamic RxNumber
		public static String func_GenerateDynamicRxNo()throws Throwable
		{

			long seconds = 1299671538L;
			Calendar currentDate = java.util.Calendar.getInstance();
			SimpleDateFormat formatter = new SimpleDateFormat("hmmss", Locale.getDefault());
			String dateString = formatter.format(currentDate.getTime());
			return (func_GetJulianDateFromCurrentDate()+dateString);

		}
		public static String func_GetJulianDateFromCurrentDate() throws Throwable
		{

			int M=Integer.valueOf(func_GetCurrentMonth());
			int Y=Integer.valueOf(func_GetCurrentYear());
			int D=Integer.valueOf(func_GetCurrentDay());

			int M1 = (M-14)/12;
			int Y1 = Y + 4800 ;

			//Then the Julian date J is

			int J = 1451*(Y1+M1)/4 + 367*(M-2-12*M1)/12 - (3*((Y1+M1+100)/100))/4
			+ D - 32075  ;
			return Integer.toString(J);

		}
		
		public static String func_GetCurrentMonth( )throws Throwable
		{
			try
			{


				Calendar calendar = Calendar.getInstance();

				return(String.format("%02d",calendar.get(Calendar.MONTH)+1));

			}
			catch(Throwable e)
			{
//				logInfo("<font size=2 face=Tahoma Color=Red>File Name:SAPDate,Error at Line Number: " + Thread.currentThread().getStackTrace()[2].getLineNumber()+"</font>");
				throw e;
			}
		}
		public static String func_GetCurrentDay( )throws Throwable
		{
			try
			{


				Calendar calendar = Calendar.getInstance();

				return(String.format("%02d",calendar.get(Calendar.DATE)));

			}
			catch(Throwable e)
			{
//				logInfo("<font size=2 face=Tahoma Color=Red>File Name:SAPDate,Error at Line Number: " + Thread.currentThread().getStackTrace()[2].getLineNumber()+"</font>");
				throw e;
			}
		}
		
		public static void enterText(String fieldValue, String fieldName, String screenName) throws Exception  {
			try{
			String[] coordinates = null;
			coordinates = ReadPropertyFile.getProperty(screenName , fieldName); 
			Mainframe_GlobalFunctionLib.sendText(coordinates[0] ,coordinates[1] , fieldValue);
			//test.log(LogStatus.PASS,"Entered text in field "+ fieldName+" on screen "+screenName  ,test.addScreenCapture(Screenshot.screenshot()));
			Reporter.addStepLog("Entered text in field "+ fieldName+ "at position "+coordinates[0]+","+coordinates[1]+" on screen "+ screenName);
			if(ScreenshotOption.equalsIgnoreCase("Always")){
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			}
			}catch(Exception e){
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			//Reporter.addStepLog(Assert.fail("The text is not entered.Screenshot captured");
			Assert.fail("The text is not entered.Screenshot captured");

			}
			}

		public static String func_GetCurrentYear( )throws Throwable
		{
			try

			{
				Calendar calendar = Calendar.getInstance();
				int iSAPDate=calendar.get(Calendar.YEAR);
				return (Integer.toString(iSAPDate));
			}
			catch(Throwable e)
			{
//				logInfo("<font size=2 face=Tahoma Color=Red>File Name:SAPDate,Error at Line Number: " + Thread.currentThread().getStackTrace()[2].getLineNumber()+"</font>");
				throw e;
			}
		}
		//Member PA Creation
		public static void func_SetPriorAuth(String number, String type, String ndcgpilist, String from, String thru, String agent, String reason, String ignoredrugstatus) throws Throwable
		{

			String sValue=number;
			Mainframe_GlobalFunctionLib.pressKey("F8");
			Mainframe_GlobalFunctionLib.sendText(4, 20 ,"9" );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.pressKey("F6");
			
			if(!(func_ValidateAnyPAAttached(number)))
			{

				try{
					Mainframe_GlobalFunctionLib.sendText(9, 5 ,sValue);
				}
				catch (Exception e) {
					Mainframe_GlobalFunctionLib.pressKey("F6");
					Mainframe_GlobalFunctionLib.sendText(9, 5 ,sValue);
				}
				Mainframe_GlobalFunctionLib.pressKey("F6");
				Mainframe_GlobalFunctionLib.sendText(16, 5,"           " );
				Mainframe_GlobalFunctionLib.sendText(16, 5 ,sValue);
				Mainframe_GlobalFunctionLib.sendText(16, 23,"*");
				Mainframe_GlobalFunctionLib.sendText(16, 18, type);
				Mainframe_GlobalFunctionLib.sendText(16, 26, ndcgpilist);
				Mainframe_GlobalFunctionLib.sendText(16, 42,"        " );
				Mainframe_GlobalFunctionLib.sendText(16, 42, from);
				Mainframe_GlobalFunctionLib.sendText(16, 51,"        " );
				Mainframe_GlobalFunctionLib.sendText(16, 51, thru);
				Mainframe_GlobalFunctionLib.sendText(16, 61, agent);
				Mainframe_GlobalFunctionLib.sendText(16, 66, reason);
				Mainframe_GlobalFunctionLib.sendText(16, 71, ignoredrugstatus);
				Mainframe_GlobalFunctionLib.pressKey("Enter");
							
				/*while(msgvalidation("24","2","Member Prior Authorization number already exists"))
				{
					sValue=Integer.toString(Integer.valueOf(sValue)+1);
					Mainframe_GlobalFunctionLib.sendText(16, 5 ,sValue);
					Mainframe_GlobalFunctionLib.pressKey("Enter");
				}
				Mainframe_GlobalFunctionLib.pressKey("F12");
				Mainframe_GlobalFunctionLib.pressKey("F12");
				Mainframe_GlobalFunctionLib.pressKey("F12");
				Mainframe_GlobalFunctionLib.pressKey("F12");*/
				sPriorAuthNumber=sValue;

			}
			sPriorAuthNumber=sValue;
		}
		
		// Set PA with MNC and OTC.Addition of OTC Field in release 8403
		public static void func_SetPriorAuth(String number, String type, String msc , String otc, String ndcgpilist, String from, String thru,
				String agent, String reason, String ignoredrugstatus) throws Throwable {
			try {
				String sValue = number;
				if (Mainframe_GlobalFunctionLib.getText(1, 2).equalsIgnoreCase("RCMBR009")) {
					Mainframe_GlobalFunctionLib.pressKey("F8");
					Mainframe_GlobalFunctionLib.sendText(4, 20, "9");
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					// Mainframe_GlobalFunctionLib.pressKey("F6");
				} else if (Mainframe_GlobalFunctionLib.getText(1, 2).equalsIgnoreCase("RCMPP001"))
					Mainframe_GlobalFunctionLib.pressKey("F12");
				else if (Mainframe_GlobalFunctionLib.getText(1, 2).trim().contentEquals("RCMGO002")
						|| Mainframe_GlobalFunctionLib.getText(1, 2).trim().contentEquals("RCMNO002")) {
					Mainframe_GlobalFunctionLib.pressKey("F12");
					Mainframe_GlobalFunctionLib.pressKey("F12");
				}
				if (!(func_ValidateAnyPAAttached(number))) {

					try {
						Mainframe_GlobalFunctionLib.sendText(9, 5, sValue);
					} catch (Exception e) {
						Mainframe_GlobalFunctionLib.pressKey("F6");
						Mainframe_GlobalFunctionLib.sendText(9, 5, sValue);
					}
					Mainframe_GlobalFunctionLib.pressKey("F6");
					Mainframe_GlobalFunctionLib.sendText(16, 5, "           ");
					Mainframe_GlobalFunctionLib.sendText(16, 5, sValue);
					if(msc.length()==0)
					Mainframe_GlobalFunctionLib.sendText(16, 23, "*");
					else
						Mainframe_GlobalFunctionLib.sendText(16, 23, msc);
					if(otc.length()==0)
					Mainframe_GlobalFunctionLib.sendText(16, 27, "*");
					else
						Mainframe_GlobalFunctionLib.sendText(16, 27, otc);
					Mainframe_GlobalFunctionLib.sendText(16, 18, type);
					Mainframe_GlobalFunctionLib.sendText(16, 30, ndcgpilist);
					Mainframe_GlobalFunctionLib.sendText(16, 46, "        ");
					Mainframe_GlobalFunctionLib.sendText(16, 46, from);
					Mainframe_GlobalFunctionLib.sendText(16, 55, "        ");
					Mainframe_GlobalFunctionLib.sendText(16, 55, thru);
					Mainframe_GlobalFunctionLib.sendText(16, 65, agent);
					Mainframe_GlobalFunctionLib.sendText(16, 70, reason);
					Mainframe_GlobalFunctionLib.sendText(16, 75, ignoredrugstatus);
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					sPriorAuthNumber = sValue;
					Reporter.addStepLog("PA Number " + number + " is added.");
				} else
					Reporter.addStepLog("PA Number " + number + " exists.");
				sPriorAuthNumber = sValue;

				if (ScreenshotOption.equalsIgnoreCase("Always")) {
					Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				}
			} catch (Exception e)

			{
				e.printStackTrace();
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				Assert.fail("PA Number" + number + " is not added.Screenshot captured.");
			}
		}
		
		public static boolean func_ValidateAnyPAAttached(String Number)throws Throwable
		{
		boolean bRes= false;
		try
		{
			Mainframe_GlobalFunctionLib.sendText(9, 5 ,Number);
			Mainframe_GlobalFunctionLib.pressKey("Enter");
		}
		catch (Exception e) {
			Mainframe_GlobalFunctionLib.pressKey("F6");
			Mainframe_GlobalFunctionLib.sendText(9, 5 ,Number);
			Mainframe_GlobalFunctionLib.pressKey("Enter");
		}

		Loop:for(int i=16; i<=20;i++)
		{
			try
			{
				Mainframe_GlobalFunctionLib.getText(1, 13);
				
				if (Mainframe_GlobalFunctionLib.getText(16, 5).trim().contentEquals(Number)) {

					bRes= true;
					break Loop;
				}
				i=i+1;
			}
			catch (Exception e) {
				break Loop;
			}
		}
		return bRes;

		}
		
		public static void submitsqlquerywithftp(String filename, String libraryname, String FTPCmd) throws ClassNotFoundException, GeneralLeanFtException, SQLException, ReportException, InterruptedException
		{
			Mainframe_GlobalFunctionLib.sendText(21, 7 ,"STRSQL" );  
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			//FOR QUERY
			Mainframe_GlobalFunctionLib.pressKey("F13");
			Mainframe_GlobalFunctionLib.sendText(21, 7 ,"1" );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(6, 37 ,"3" );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(9, 37 ,"          " );
			Mainframe_GlobalFunctionLib.sendText(9, 37 ,filename );
			Mainframe_GlobalFunctionLib.sendText(10, 39 ,"          " );
			Mainframe_GlobalFunctionLib.sendText(10, 39 , libraryname );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.pressKey("F12");
			Mainframe_GlobalFunctionLib.sendText(5, 7 ,"SELECT RXCLAIMNBR,MBRFSTNME,MBRLSTNME,MBRBIRTH,MEMBERID,MBRZIP FROM clmprdext2/rce11808 WHERE DATESBM ='20180826' and CARRIERID = 'PSI2500'and CLAIMSTS = 'P'" ); 
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.pressKey("F12");
			Mainframe_GlobalFunctionLib.sendText(5, 31 ," " );
			Mainframe_GlobalFunctionLib.sendText(5, 31 ,"2" ); 
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			
			//FTP Steps
			Mainframe_GlobalFunctionLib.sendText(21, 7 ,"edtlibl");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(7, 12 ,"ZMODLIB10");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.pressKey("F12");
			Mainframe_GlobalFunctionLib.sendText(21, 7 ,"STRFTPSSN RMTSYS(RXSNT01)");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Thread.sleep(1000);
			Mainframe_GlobalFunctionLib.sendText(21, 7 ,"CHGRDIR RMTDIR('depts/common/QA')");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Thread.sleep(1000);
			Mainframe_GlobalFunctionLib.sendText(21, 7 ,FTPCmd);
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Thread.sleep(2000);
			Mainframe_GlobalFunctionLib.sendText(21, 7 ,"ENDFTPSSN");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Thread.sleep(1000);
			Mainframe_GlobalFunctionLib.sendText(21, 7 ,"ENDFTPSSN");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Thread.sleep(1000);
		}
		
		public static void func_NavigateToAScreen(String sPathNameSeparatedByDash) throws Exception
		{
			
			StringTokenizer stPath= new StringTokenizer(sPathNameSeparatedByDash, "-");
			while (stPath.hasMoreTokens()) {
				func_SetCommandLine(stPath.nextToken());
				
			}
			
		}
		
		public static void func_AttachDSTOnPA(String memberID, String paNumber, String dstTable) throws Throwable {
			try {
				String sValue = paNumber;
				if (Mainframe_GlobalFunctionLib.getText(1, 2).trim().contentEquals("RCMPA001")) {
					
					Mainframe_GlobalFunctionLib.sendText(9, 5, "           ");
					Mainframe_GlobalFunctionLib.sendText(9, 5, sValue);
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					Mainframe_GlobalFunctionLib.sendText(16, 2, "2");				
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					Mainframe_GlobalFunctionLib.pressKey("F7");
					Mainframe_GlobalFunctionLib.sendText(7, 67, "             ");
					Mainframe_GlobalFunctionLib.sendText(7, 67, dstTable);
					Mainframe_GlobalFunctionLib.pressKey("Enter");

				} else if (Mainframe_GlobalFunctionLib.getText(1, 2).trim().contentEquals("RCMPP001")) {
					Mainframe_GlobalFunctionLib.pressKey("F7");
					Mainframe_GlobalFunctionLib.sendText(7, 67, "             ");
					Mainframe_GlobalFunctionLib.sendText(7, 67, dstTable);
					Mainframe_GlobalFunctionLib.pressKey("Enter");

				} else if (Mainframe_GlobalFunctionLib.getText(1, 2).trim().contentEquals("RCMBR009")) {
					Mainframe_GlobalFunctionLib.pressKey("F24");
					Mainframe_GlobalFunctionLib.pressKey("F16");
					Mainframe_GlobalFunctionLib.sendText(9, 5, sValue);
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					Mainframe_GlobalFunctionLib.sendText(16, 2, "2");
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					Mainframe_GlobalFunctionLib.pressKey("F7");
					Mainframe_GlobalFunctionLib.sendText(7, 67, "             ");
					Mainframe_GlobalFunctionLib.sendText(7, 67, dstTable);
					Mainframe_GlobalFunctionLib.pressKey("Enter");
				} else {
					FunctionalLibrary.navigateToRxClaimPlanAdministrator();

					Mainframe_GlobalFunctionLib.sendText(21, 7, "1");
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					Mainframe_GlobalFunctionLib.sendText(21, 7, "2");
					Mainframe_GlobalFunctionLib.pressKey("Enter");

					if (!(func_SearchAndSelectADataEditMode("4,4", memberID, "10,4", memberID))) {
						Assert.fail("Member does not exists");
					}
					Mainframe_GlobalFunctionLib.pressKey("F24");
					Mainframe_GlobalFunctionLib.pressKey("F16");
					Mainframe_GlobalFunctionLib.sendText(9, 5, sValue);
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					Mainframe_GlobalFunctionLib.sendText(16, 2, "2");
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					Mainframe_GlobalFunctionLib.pressKey("F7");
					Mainframe_GlobalFunctionLib.sendText(7, 67, "             ");
					Mainframe_GlobalFunctionLib.sendText(7, 67, dstTable);
					Mainframe_GlobalFunctionLib.pressKey("Enter");

				}
				if (ScreenshotOption.equalsIgnoreCase("Always")) {
					Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
					if (dstTable.trim().length() == 0)
						Reporter.addStepLog("DSt Table not attached on PA " + paNumber);
					else
						Reporter.addStepLog("DST Table " + dstTable + " is attached on PA " + paNumber);
				}
			} catch (Exception e)

			{
				e.printStackTrace();
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				Assert.fail("DSt Table " + dstTable + " is not attached on PA " + paNumber);
			}

		}

		public static void addDrugStatusOnPA(String memberID, String paNumber, String drugStatus) throws Throwable {
			try {

				if (Mainframe_GlobalFunctionLib.getText(1, 2).trim().contentEquals("RCMGO002")) {
					if (Mainframe_GlobalFunctionLib.getText(2, 16).trim().contains("Detail Page 1 of 3")) {

						Mainframe_GlobalFunctionLib.sendText(6, 78, drugStatus);
					} else if (Mainframe_GlobalFunctionLib.getText(2, 16).trim().contains("Detail Page 3 of 3")) {
						Mainframe_GlobalFunctionLib.pressKey("PageUp");
						Mainframe_GlobalFunctionLib.pressKey("PageUp");
						Mainframe_GlobalFunctionLib.sendText(6, 78, drugStatus);
						Mainframe_GlobalFunctionLib.pressKey("Enter");
					}

				} else if (Mainframe_GlobalFunctionLib.getText(1, 2).trim().contentEquals("RCMNO002")) {
					if (Mainframe_GlobalFunctionLib.getText(2, 14).trim().contains("Detail Page 1 of 3")) {

						Mainframe_GlobalFunctionLib.sendText(6, 78, drugStatus);
					} else if (Mainframe_GlobalFunctionLib.getText(2, 14).trim().contains("Detail Page 3 of 3")) {
						Mainframe_GlobalFunctionLib.pressKey("PageUp");
						Mainframe_GlobalFunctionLib.pressKey("PageUp");
						Mainframe_GlobalFunctionLib.sendText(6, 78, drugStatus);
						Mainframe_GlobalFunctionLib.pressKey("Enter");
					}
				} else if (Mainframe_GlobalFunctionLib.getText(1, 2).trim().contentEquals("RCMPP001")) {
					Mainframe_GlobalFunctionLib.pressKey("F7");
					Mainframe_GlobalFunctionLib.sendText(6, 78, drugStatus);
					Mainframe_GlobalFunctionLib.pressKey("Enter");

				} else if (Mainframe_GlobalFunctionLib.getText(1, 2).trim().contentEquals("RCMPA001")) {
					Mainframe_GlobalFunctionLib.sendText(9, 5, paNumber);
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					Mainframe_GlobalFunctionLib.sendText(16, 2, "2");
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					Mainframe_GlobalFunctionLib.pressKey("F7");
					Mainframe_GlobalFunctionLib.sendText(6, 78, drugStatus);
					Mainframe_GlobalFunctionLib.pressKey("Enter");

				} else if (Mainframe_GlobalFunctionLib.getText(1, 2).trim().contentEquals("RCMPP001")) {
					Mainframe_GlobalFunctionLib.pressKey("F7");
					Mainframe_GlobalFunctionLib.sendText(6, 78, drugStatus);
					Mainframe_GlobalFunctionLib.pressKey("Enter");

				} else if (Mainframe_GlobalFunctionLib.getText(1, 2).trim().contentEquals("RCMBR009")) {
					Mainframe_GlobalFunctionLib.pressKey("F24");
					Mainframe_GlobalFunctionLib.pressKey("F16");
					Mainframe_GlobalFunctionLib.sendText(9, 5, paNumber);
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					Mainframe_GlobalFunctionLib.sendText(16, 2, "2");
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					Mainframe_GlobalFunctionLib.pressKey("F7");
					Mainframe_GlobalFunctionLib.sendText(6, 78, drugStatus);
					Mainframe_GlobalFunctionLib.pressKey("Enter");

				} else {
					FunctionalLibrary.navigateToRxClaimPlanAdministrator();

					Mainframe_GlobalFunctionLib.sendText(21, 7, "1");
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					Mainframe_GlobalFunctionLib.sendText(21, 7, "2");
					Mainframe_GlobalFunctionLib.pressKey("Enter");

					if (!(func_SearchAndSelectADataEditMode("4,4", memberID, "10,4", memberID))) {
						Assert.fail("Member does not exists");
					}
					Mainframe_GlobalFunctionLib.pressKey("F24");
					Mainframe_GlobalFunctionLib.pressKey("F16");
					Mainframe_GlobalFunctionLib.sendText(9, 5, paNumber);
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					Mainframe_GlobalFunctionLib.sendText(16, 2, "2");
					Mainframe_GlobalFunctionLib.pressKey("F7");
					Mainframe_GlobalFunctionLib.sendText(6, 78, drugStatus);
					Mainframe_GlobalFunctionLib.pressKey("Enter");

				}
				if (ScreenshotOption.equalsIgnoreCase("Always")) {
					Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
					Reporter.addStepLog("Drug Status " + drugStatus + " is set on PA " + paNumber);
				}
			} catch (Exception e)

			{
				e.printStackTrace();
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				Assert.fail("Drug Status " + drugStatus + " is not added on PA " + paNumber);
			}

		}

		public static void func_AttachPRCListOnPA(String memberID, String paNumber, String prcList, String prcListQual)
				throws Throwable {
			try {
				String sValue = paNumber;
				if (prcListQual.length() == 0) {
					prcListQual = " ";
				}
				if (Mainframe_GlobalFunctionLib.getText(1, 2).trim().contentEquals("RCMGO002")) {
					if (Mainframe_GlobalFunctionLib.getText(2, 16).trim().endsWith("Detail Page 1 of 3")) {
						Mainframe_GlobalFunctionLib.pressKey("PageDown");
						Mainframe_GlobalFunctionLib.pressKey("PageDown");
						Mainframe_GlobalFunctionLib.sendText(18, 21, "          ");
						Mainframe_GlobalFunctionLib.sendText(18, 21, prcList);
						Mainframe_GlobalFunctionLib.sendText(18, 64, prcListQual);
						Mainframe_GlobalFunctionLib.pressKey("Enter");
					} else if (Mainframe_GlobalFunctionLib.getText(2, 16).trim().endsWith("Detail Page 3 of 3")) {
						Mainframe_GlobalFunctionLib.sendText(18, 21, "          ");
						Mainframe_GlobalFunctionLib.sendText(18, 21, prcList);
						Mainframe_GlobalFunctionLib.sendText(18, 64, prcListQual);
						Mainframe_GlobalFunctionLib.pressKey("Enter");
					}

				} else if (Mainframe_GlobalFunctionLib.getText(1, 2).trim().contentEquals("RCMNO002")) {
					if (Mainframe_GlobalFunctionLib.getText(2, 14).trim().endsWith("Detail Page 1 of 3")) {

						Mainframe_GlobalFunctionLib.pressKey("PageDown");
						Mainframe_GlobalFunctionLib.pressKey("PageDown");
						Mainframe_GlobalFunctionLib.sendText(18, 21, "          ");
						Mainframe_GlobalFunctionLib.sendText(18, 21, prcList);
						Mainframe_GlobalFunctionLib.sendText(18, 64, prcListQual);
						Mainframe_GlobalFunctionLib.pressKey("Enter");
					} else if (Mainframe_GlobalFunctionLib.getText(2, 14).trim().endsWith("Detail Page 3 of 3")) {
						Mainframe_GlobalFunctionLib.sendText(18, 21, "          ");
						Mainframe_GlobalFunctionLib.sendText(18, 21, prcList);
						Mainframe_GlobalFunctionLib.sendText(18, 64, prcListQual);
						Mainframe_GlobalFunctionLib.pressKey("Enter");
					}

				} else if (Mainframe_GlobalFunctionLib.getText(1, 2).trim().contentEquals("RCMPP001")) {
					Mainframe_GlobalFunctionLib.pressKey("F7");
					Mainframe_GlobalFunctionLib.pressKey("PageDown");
					Mainframe_GlobalFunctionLib.pressKey("PageDown");
					Mainframe_GlobalFunctionLib.sendText(18, 21, "          ");
					Mainframe_GlobalFunctionLib.sendText(18, 21, prcList);
					Mainframe_GlobalFunctionLib.sendText(18, 21, prcListQual);
					Mainframe_GlobalFunctionLib.pressKey("Enter");

				} else if (Mainframe_GlobalFunctionLib.getText(1, 2).trim().contentEquals("RCMPA001")) {
					Mainframe_GlobalFunctionLib.sendText(9, 5, sValue);
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					Mainframe_GlobalFunctionLib.sendText(16, 2, "2");
					Mainframe_GlobalFunctionLib.pressKey("F7");
					Mainframe_GlobalFunctionLib.pressKey("PageDown");
					Mainframe_GlobalFunctionLib.pressKey("PageDown");
					Mainframe_GlobalFunctionLib.sendText(18, 21, "          ");
					Mainframe_GlobalFunctionLib.sendText(18, 21, prcList);
					Mainframe_GlobalFunctionLib.sendText(18, 21, prcListQual);
					Mainframe_GlobalFunctionLib.pressKey("Enter");

				} else if (Mainframe_GlobalFunctionLib.getText(1, 2).trim().contentEquals("RCMBR009")) {
					Mainframe_GlobalFunctionLib.pressKey("F24");
					Mainframe_GlobalFunctionLib.pressKey("F16");
					Mainframe_GlobalFunctionLib.sendText(9, 5, sValue);
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					Mainframe_GlobalFunctionLib.sendText(16, 2, "2");
					Mainframe_GlobalFunctionLib.pressKey("F7");
					Mainframe_GlobalFunctionLib.pressKey("PageDown");
					Mainframe_GlobalFunctionLib.pressKey("PageDown");
					Mainframe_GlobalFunctionLib.sendText(18, 21, "          ");
					Mainframe_GlobalFunctionLib.sendText(18, 21, prcList);
					Mainframe_GlobalFunctionLib.sendText(18, 21, prcListQual);
					Mainframe_GlobalFunctionLib.pressKey("Enter");

				} else {
					FunctionalLibrary.navigateToRxClaimPlanAdministrator();

					Mainframe_GlobalFunctionLib.sendText(21, 7, "1");
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					Mainframe_GlobalFunctionLib.sendText(21, 7, "2");
					Mainframe_GlobalFunctionLib.pressKey("Enter");

					if (!(func_SearchAndSelectADataEditMode("4,4", memberID, "10,4", memberID))) {
						Assert.fail("Member does not exists");
					}
					Mainframe_GlobalFunctionLib.pressKey("F24");
					Mainframe_GlobalFunctionLib.pressKey("F16");
					Mainframe_GlobalFunctionLib.sendText(9, 5, sValue);
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					Mainframe_GlobalFunctionLib.sendText(16, 2, "2");
					Mainframe_GlobalFunctionLib.pressKey("F7");
					Mainframe_GlobalFunctionLib.pressKey("PageDown");
					Mainframe_GlobalFunctionLib.pressKey("PageDown");
					Mainframe_GlobalFunctionLib.sendText(18, 21, "          ");
					Mainframe_GlobalFunctionLib.sendText(18, 21, prcList);
					Mainframe_GlobalFunctionLib.sendText(18, 21, prcListQual);
					Mainframe_GlobalFunctionLib.pressKey("Enter");

				}
				if (ScreenshotOption.equalsIgnoreCase("Always")) {
					Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
					if (prcList.trim().length() == 0)
						Reporter.addStepLog("PRC List not attached on PA " + paNumber);
					else {
						Reporter.addStepLog("PRC List " + prcList + " is attached on PA " + paNumber);
						Reporter.addStepLog("PRC List Qualifier is " + prcListQual);
					}
				}
			} catch (Exception e)

			{
				e.printStackTrace();
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				Assert.fail("PRC List " + prcList + " is not attached on PA " + paNumber);
			}

		}


		public static void func_SetCommandLine(String sCommand) throws Exception
		{
			
			Mainframe_GlobalFunctionLib.click(21, 7 );
			Mainframe_GlobalFunctionLib.pressKey("Delete");
			Mainframe_GlobalFunctionLib.pressKey("Tab");
			Mainframe_GlobalFunctionLib.sendText(21, 7 ,sCommand);
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			
		}
		
		public static void func_CompareStrings(String sActualStr,String sExpectedStr)throws Throwable
		{
			Reporter.addStepLog("Expected Value :" +sExpectedStr);
			Reporter.addStepLog("Actual Value :" +sActualStr);
//			if(sActualStr.contains(sExpectedStr))
			if(sActualStr.equals(sExpectedStr))
			{
				
				System.out.println("String matching");
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			}
			else
			{
				System.out.println("String is not same");
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				Assert.fail("The text "+ sExpectedStr +" does not match on the screen.Screenshot captured.");
			}
		}
		public static void submitjobcmd() throws ClassNotFoundException, GeneralLeanFtException, SQLException, ReportException, InterruptedException
		{
			Mainframe_GlobalFunctionLib.pressKey("F10");
		}
		public static void SubrogationTypeValidation(int row,int lastrow,String arg1) throws Exception 
		{
	        try{
	               do{
	                     try{
	                     if(row<lastrow)
	                            {
	                                   
	                    	 		
	                    	 		String getValue;
									try {
										getValue = Mainframe_GlobalFunctionLib.getText(row,50);
										if(getValue != null && getValue !="" && !getValue.isEmpty() && !getValue.trim().isEmpty())
		                                   {
		                                          if(getValue.equals(arg1))
		                                          {
		                                          }else
		                                          {
		                                                 Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		                                                 Assert.fail("The Terminal sesssion is not closed.Screenshot captured.");
		                                                 break;
		                                          }
		                                   }else
		                                   {
		                                          break;
		                                   }
									} catch (Exception e) {
										// TODO Auto-generated catch block
										System.out.println("Value not found on screen");
										break;
									}
	                                   
	                                                                    
	                            }else
	                            {
	                                   String pageDownCheck = Mainframe_GlobalFunctionLib.getText(21,79);
	                                   if(pageDownCheck != null && !pageDownCheck.isEmpty() && !pageDownCheck.trim().isEmpty())
	                                   {
	                                          row = 9; 
	                                          Mainframe_GlobalFunctionLib.pressKey("PageDown");
	                                          Thread.sleep(3000);
	                                   }else
	                                   {
	                                          break;
	                                   }
	                            }
	                     }catch(Exception e){}

	                     row++;
	                     }while(row<23);
	               
	               Reporter.addScreenCaptureFromPath(Screenshot.screenshot());

	               }catch(Exception e){}
		}
		
		public static void logoffTE() throws Exception
		{
			FunctionalLibrary.navigateToRxClaimPlanAdministrator();
			Mainframe_GlobalFunctionLib.pressKey("F3");
			Mainframe_GlobalFunctionLib.pressKey("F3");
			Mainframe_GlobalFunctionLib.pressKey("F3");
			try {
				Mainframe_GlobalFunctionLib.sendText(20, 7 ,"90" );
			} catch (Exception e) {
				Mainframe_GlobalFunctionLib.sendText(21, 7 ,"90" );
				
			}
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			
		}
		
	public static void main(String args[]) throws Throwable{
		
		FunctionalLibrary fb = new FunctionalLibrary();
		//Mainframe_GlobalFunctionLib.launchTE("Book1");
		
		//fb.login();
		fb.createCAG("TESTAUTC2","Test Carrier","9999999999","MAIL ADD","City","IL","78654","010101","123139","*DEFAULT","*DEFAULT","TESTAUTA1","Test Account","TE124","Test Group","010101","123139","AUTOEGWP");
		Mainframe_GlobalFunctionLib.validateText("5" ,"11" , "TESTAUTC2" );
		Mainframe_GlobalFunctionLib.validateText("6" ,"11" , "TESTAUTA1" );
		Mainframe_GlobalFunctionLib.validateText("7" ,"11" , "TESTAUTG1" );
		//fb.CreateTransaction("777777","QET","*ALL", "APHARM","765488367432", "00", "060116", "AUTOMEM0012","00777310402","30","30","00","100");
		//fb.submitClaim();
		//Mainframe_GlobalFunctionLib.validateText("21" ,"6" , "R" );
	}

	

}
