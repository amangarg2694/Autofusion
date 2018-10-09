package com.atdd.te.screenHelpers;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.StringTokenizer;

import org.testng.Assert;

import com.cucumber.listener.Reporter;
import com.hp.lft.sdk.GeneralLeanFtException;
import com.optumrx.autofusion.core.te.util.Mainframe_GlobalFunctionLib;
import com.optumrx.autofusion.core.te.util.Screenshot;
import com.optumrx.autofusion.core.util.ReadPropertyFile;

public class FunctionalLibrary extends CommonHelper{

	
	public static void navigateToRxClaimPlanAdministrator() throws Exception  {
		try{
		String text = Mainframe_GlobalFunctionLib.getText(1, 13);				
		while(!(text.equalsIgnoreCase("RxClaim Plan Administrator Menu"))){
			
			Mainframe_GlobalFunctionLib.pressKey("F12");
			text = Mainframe_GlobalFunctionLib.getText(1, 13);
			break;
		}
		if(ScreenshotOption.equalsIgnoreCase("Always")){
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		}
		}catch(Exception e)
		{	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			Assert.fail("We could not reach to RxClaimAdministrator screen.Screenshot captured");
			
		}
}
	public static void memberPartitionForFiles() throws Exception  {
		// need to add common code here
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
				Assert.fail("The CAG is not created successfully.Screenshot is captured");
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
				Mainframe_GlobalFunctionLib.sendText(5,29, rxNbr);
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
			Mainframe_GlobalFunctionLib.sendText(12, 41,rxNbr );
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
				Mainframe_GlobalFunctionLib.sendText(5,29, rxNbr);
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
			Mainframe_GlobalFunctionLib.sendText(12, 41,rxNbr );
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
					Mainframe_GlobalFunctionLib.sendText(5,29, rxNbr);
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
				Mainframe_GlobalFunctionLib.sendText(12, 41,rxNbr );
				Mainframe_GlobalFunctionLib.sendText(12, 59,refill );
				Mainframe_GlobalFunctionLib.sendText(14, 41,memberID );
				Mainframe_GlobalFunctionLib.pressKey("Enter");
			}
		//	Thread.sleep(10000);
			
					Mainframe_GlobalFunctionLib.sendText(4 , 65 ,"          ");
					Mainframe_GlobalFunctionLib.sendText(4, 65, fillDate);
					//Mainframe_GlobalFunctionLib.sendText(5,29, rxNbr);
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
							Mainframe_GlobalFunctionLib.sendText(5,29, rxNbr);
							Mainframe_GlobalFunctionLib.sendText(5, 47, refill);	
					}
					else
					{
						Mainframe_GlobalFunctionLib.pressKey("F6");
						Mainframe_GlobalFunctionLib.sendText(11, 14,bin );
						Mainframe_GlobalFunctionLib.sendText(11, 41,proc );
						Mainframe_GlobalFunctionLib.sendText(11, 59,group );
						Mainframe_GlobalFunctionLib.sendText(12, 14,pharmacyID );
						Mainframe_GlobalFunctionLib.sendText(12, 41,rxNbr );
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
	// Code for Adding Messages to Product
	public static void addMessagesProduct(String ProductID,String FromDate,String ThruDate,String Carrier,String MessageCode,String Seqno,String MessageType) throws IOException
	
	{			
		try {
			navigateToRxClaimPlanAdministrator();
		} catch (Exception e) {
			e.printStackTrace();
		}
		try{
					FunctionalLibrary.enterText(21, 7, "2" );
					FunctionalLibrary.pressKey("Enter");
					FunctionalLibrary.enterText(21, 7, "1" );
					FunctionalLibrary.pressKey("Enter");
					FunctionalLibrary.pressKey("F15");
					FunctionalLibrary.enterText(4, 5, ProductID );
					FunctionalLibrary.pressKey("Enter");
					String ProdId = FunctionalLibrary.getText(11, 5);
					String ProdctId = ProdId.replace("-","");
					if (ProductID.equals(ProdctId))
					{
					//FunctionalLibrary.validateText("11" ,"5" , ProdctId );
					FunctionalLibrary.enterText(11, 2, "16" );
					FunctionalLibrary.pressKey("Enter");
					FunctionalLibrary.pressKey("F6");
					FunctionalLibrary.enterText(11, 17, FromDate );
					FunctionalLibrary.enterText(12, 17, ThruDate );
					Mainframe_GlobalFunctionLib.click(13, 17 );
					Mainframe_GlobalFunctionLib.pressKey("F4");	
					FunctionalLibrary.enterText(4, 6, Carrier );
					FunctionalLibrary.pressKey("Enter");
					FunctionalLibrary.validateText("9" ,"6" , Carrier );
					FunctionalLibrary.enterText(9, 2, "1" );
					FunctionalLibrary.pressKey("Enter");
					Mainframe_GlobalFunctionLib.click(15, 17 );
					Mainframe_GlobalFunctionLib.pressKey("F4");
					FunctionalLibrary.enterText(3, 6, MessageCode );
					FunctionalLibrary.pressKey("Enter");
					FunctionalLibrary.validateText("7" ,"5" , MessageCode );
					FunctionalLibrary.enterText(7, 2, "1" );
					FunctionalLibrary.pressKey("Enter");
					FunctionalLibrary.enterText(16, 17, Seqno );
					Mainframe_GlobalFunctionLib.click(17, 17 );
					Mainframe_GlobalFunctionLib.pressKey("F4");	
					FunctionalLibrary.enterText(7, 4, MessageType );
					FunctionalLibrary.pressKey("Enter");
					FunctionalLibrary.validateText("13" ,"5" , MessageType );
					FunctionalLibrary.enterText(13, 3, "X" );
					FunctionalLibrary.pressKey("Enter");
					FunctionalLibrary.pressKey("Enter");
					FunctionalLibrary.enterText(24, 73, "Y" );
					}
					else
					{
						System.out.println("Product Id is not found");
					}
										
			}
		catch(Exception e)
				{	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		e.printStackTrace();
			Assert.fail("Message is not added to the Product.Screenshot is captured");
				}
	}	
	//Code for Comparing the value is in Range or not
			public static void compareDate(String PartMember,int low,int high,int Value1) throws IOException
			{
				if (Value1 >= low && Value1 <=high)
				{
					System.out.println("The Value is in the range of" + PartMember + "is" + " " + Value1);
				}
			}
			
	// Code for validating date range for VCH and VSR File
		public static void validateDateRange(String PartMember,String FN) throws IOException
		
		{			
			try{
				if (PartMember.equals("PART000001"))
				{
					int low= 0;
					int high=1199999;
					if (FN.equals("VCH"))
					{
					String Date1 = FunctionalLibrary.getText(9,41);
					int Value1=Integer.parseInt(Date1);
					FunctionalLibrary.compareDate(PartMember,low,high,Value1);	
					}
					else if (FN.equals("VSR"))
					{
					String Date1 = FunctionalLibrary.getText(18,41);
					int Value1=Integer.parseInt(Date1);	
					FunctionalLibrary.compareDate(PartMember,low,high,Value1);
					}
								
				}
				else if (PartMember.equals("PART000002"))
				{
					int low= 1200000;
					int high=1209999;
					if (FN.equals("VCH"))
					{
					String Date1 = FunctionalLibrary.getText(9,41);
					int Value1=Integer.parseInt(Date1);
					FunctionalLibrary.compareDate(PartMember,low,high,Value1);	
					}
					else if (FN.equals("VSR"))
					{
					String Date1 = FunctionalLibrary.getText(18,41);
					int Value1=Integer.parseInt(Date1);	
					FunctionalLibrary.compareDate(PartMember,low,high,Value1);
					}
				}
				else if (PartMember.equals("PART000003"))
				{
					int low= 1210000;
					int high=1219999;
					if (FN.equals("VCH"))
					{
					String Date1 = FunctionalLibrary.getText(9,41);
					int Value1=Integer.parseInt(Date1);
					FunctionalLibrary.compareDate(PartMember,low,high,Value1);	
					}
					else if (FN.equals("VSR"))
					{
					String Date1 = FunctionalLibrary.getText(18,41);
					int Value1=Integer.parseInt(Date1);	
					FunctionalLibrary.compareDate(PartMember,low,high,Value1);
					}
				}
				else if (PartMember.equals("PART000004"))
				{
					int low= 1220000;
					int high=1229999;
					if (FN.equals("VCH"))
					{
					String Date1 = FunctionalLibrary.getText(9,41);
					int Value1=Integer.parseInt(Date1);
					FunctionalLibrary.compareDate(PartMember,low,high,Value1);	
					}
					else if (FN.equals("VSR"))
					{
					String Date1 = FunctionalLibrary.getText(18,41);
					int Value1=Integer.parseInt(Date1);	
					FunctionalLibrary.compareDate(PartMember,low,high,Value1);
					}
				}
				else if (PartMember.equals("PART000005"))
				{
					int low= 1230000;
					int high=1239999;
					if (FN.equals("VCH"))
					{
					String Date1 = FunctionalLibrary.getText(9,41);
					int Value1=Integer.parseInt(Date1);
					FunctionalLibrary.compareDate(PartMember,low,high,Value1);	
					}
					else if (FN.equals("VSR"))
					{
					String Date1 = FunctionalLibrary.getText(18,41);
					int Value1=Integer.parseInt(Date1);	
					FunctionalLibrary.compareDate(PartMember,low,high,Value1);
					}
				}
				else if (PartMember.equals("PART000006"))
				{
					int low= 1240000;
					int high=9999999;
					if (FN.equals("VCH"))
					{
					String Date1 = FunctionalLibrary.getText(9,41);
					int Value1=Integer.parseInt(Date1);
					FunctionalLibrary.compareDate(PartMember,low,high,Value1);	
					}
					else if (FN.equals("VSR"))
					{
					String Date1 = FunctionalLibrary.getText(18,41);
					int Value1=Integer.parseInt(Date1);	
					FunctionalLibrary.compareDate(PartMember,low,high,Value1);
					}
				}
				
				else
				{
					System.out.println("Partition Not Found");
					Assert.fail();
					
				}
				FunctionalLibrary.pressKey("F3");
				FunctionalLibrary.pressKey("F3");
			}
			catch(Exception e)
					{	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			e.printStackTrace();
				Assert.fail("Partition Not Found.Screenshot is captured");
					}
		}	
		
	
		
	// Code for fetching the reject messages
		public static void getRejectMessages() throws IOException
		
		{			
			try{
				
				FunctionalLibrary.pressKey("F7");
				FunctionalLibrary.pressKey("F7");
				FunctionalLibrary.enterText(4, 23, "7" );
				FunctionalLibrary.pressKey("Enter");
				
								
				String rejectmsg = FunctionalLibrary.getText(16,2);
				int loopcount = 0;
				if ((rejectmsg.length()) > 0);
				{
					loopcount++;
				}
				
				String plusSymbol= FunctionalLibrary.getText(20,79);
				if (loopcount == 4) if (plusSymbol.equals("+"));
				{
					loopcount = 0;
					FunctionalLibrary.pressKey("PageDown");
				}
									
		}
	catch(Exception e)
			{	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	e.printStackTrace();
		Assert.fail("Reject Messages are not displayed.Screenshot is captured");
			}
			
			
		}	
		
		
		

}
