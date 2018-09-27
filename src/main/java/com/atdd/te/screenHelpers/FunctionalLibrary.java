package com.atdd.te.screenHelpers;

import java.io.IOException;
import java.sql.SQLException;
import java.util.StringTokenizer;

import org.testng.Assert;

import com.cucumber.listener.Reporter;
import com.hp.lft.report.ReportException;
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
	
	
	
	
	
	
	
	public static void navigateToMainMenu()
	{
		try{
			 Mainframe_GlobalFunctionLib.pressKey("F12");
			 Mainframe_GlobalFunctionLib.pressKey("F12");
			 Mainframe_GlobalFunctionLib.pressKey("F12");
			 Thread.sleep(5000);
			 Mainframe_GlobalFunctionLib.pressKey("F3");
			 Thread.sleep(2000);
			 String sysName=Mainframe_GlobalFunctionLib.getText(3, 70);
			 if(sysName=="RXDV1")
			 {
				 System.out.println("User navigated to main menu");
			 }
			 else{
				 System.out.println("User navigated to another menu");
			 }
			 
		}	 
			 catch (Exception e) {
					
					e.printStackTrace();
			 
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
		
		if(!(func_SearchAndSelectADataEditMode("4,4" ,memberID ,"9,4" , memberID))){
			
			Mainframe_GlobalFunctionLib.pressKey("F6");
			Mainframe_GlobalFunctionLib.sendText(11, 14,bin );
			Mainframe_GlobalFunctionLib.sendText(11, 41,proc );
			Mainframe_GlobalFunctionLib.sendText(11, 59,group );
			Mainframe_GlobalFunctionLib.sendText(12, 14,pharmacyID );
			Mainframe_GlobalFunctionLib.sendText(12, 41,rxNbr );
			Mainframe_GlobalFunctionLib.sendText(12, 59,refill );
			Mainframe_GlobalFunctionLib.sendText(14, 41,memberID );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			//Mainframe_GlobalFunctionLib.click(7, 12 );
			//Mainframe_GlobalFunctionLib.pressKey("F4");
			//Thread.sleep(1000);
			//Mainframe_GlobalFunctionLib.sendText(3, 4, memberID);
			//Mainframe_GlobalFunctionLib.pressKey("Enter");
			//Mainframe_GlobalFunctionLib.sendText(8, 2,"1" );
			//Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(4 , 65 ,"          ");
			Mainframe_GlobalFunctionLib.sendText(4, 65, fillDate + "   ");			
			Mainframe_GlobalFunctionLib.sendText(11, 20,productId );
			Mainframe_GlobalFunctionLib.sendText(12, 11,dspQty );
			Mainframe_GlobalFunctionLib.sendText(12, 26,ds );
			Mainframe_GlobalFunctionLib.sendText(14, 6,psc );
			Mainframe_GlobalFunctionLib.sendText(10, 47,"         " );
			Mainframe_GlobalFunctionLib.sendText(10, 47,cost );
			
		}
		else{
			
		Mainframe_GlobalFunctionLib.sendText(9, 2,"1" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Thread.sleep(1000);
		Mainframe_GlobalFunctionLib.click(4, 29 );
			Mainframe_GlobalFunctionLib.sendText(4, 29, pharmacyID);
			///Thread.sleep(3000);
			Mainframe_GlobalFunctionLib.sendText(4 , 65 ,"          ");
			Mainframe_GlobalFunctionLib.sendText(4, 65, fillDate);
			Mainframe_GlobalFunctionLib.sendText(5,29, rxNbr);
			Mainframe_GlobalFunctionLib.sendText(5, 47, refill);			
			//Mainframe_GlobalFunctionLib.click(7, 12 );
			Mainframe_GlobalFunctionLib.sendText(7, 12, memberID);
			Thread.sleep(4000);
			//Mainframe_GlobalFunctionLib.pressKey("F4");
			//Mainframe_GlobalFunctionLib.sendText(3, 4, memberID);
			//Mainframe_GlobalFunctionLib.pressKey("Enter");         
			//Mainframe_GlobalFunctionLib.sendText(8, 2,"1" );
			//Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(11, 20,productId );
			Mainframe_GlobalFunctionLib.sendText(12, 11,"           " );
			Mainframe_GlobalFunctionLib.sendText(12, 11,dspQty );
			Mainframe_GlobalFunctionLib.sendText(12, 26,"   " );
			Mainframe_GlobalFunctionLib.sendText(12, 26,ds);
			Mainframe_GlobalFunctionLib.sendText(14, 6,psc );
			Mainframe_GlobalFunctionLib.sendText(10, 47,"         " );
			Mainframe_GlobalFunctionLib.sendText(10, 47,cost );
			//Mainframe_GlobalFunctionLib.pressKey("F6");
            
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
	
	
	
	
	
	public static void CopyMember(String memberID, String carrierID, String accountID, String groupID, String FromDate, String ThruDate) throws Throwable
	{	
				
			try {
				Mainframe_GlobalFunctionLib.sendText(10, 2,"3" );
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(10, 52, carrierID );
				Mainframe_GlobalFunctionLib.sendText(11, 52, accountID );
				Mainframe_GlobalFunctionLib.sendText(12, 52, groupID );
				Mainframe_GlobalFunctionLib.sendText(14, 52, FromDate );
				Mainframe_GlobalFunctionLib.sendText(15, 52, ThruDate );
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				System.out.println("Member Added");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				Assert.fail("An error has occured while creating the caim transaction.Screenshot is captured");
				
			}
			
			
			
		}
		
	
			
		
	public static void submitClaim() throws GeneralLeanFtException, InterruptedException, IOException{
		try{
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Thread.sleep(2000);
		Mainframe_GlobalFunctionLib.pressKey("F7");
		
		
		if(ScreenshotOption.equalsIgnoreCase("Always")){
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			}
			}catch(Exception e)
			{	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			
				Assert.fail("The Claim is not submitted successfully.Screenshot is captured");
				
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
				Mainframe_GlobalFunctionLib.validateText(row ,col , text );	
				if(ScreenshotOption.equalsIgnoreCase("Always")){
					Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
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
		//keep6
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
		//keep8
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
		//keep7
		public static void SetPBP(String carrierID,String contract,String pbp,String benefityear, String medicaretype,String SubmitterID) throws Throwable
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
					
					Mainframe_GlobalFunctionLib.sendText(12, 16, SubmitterID);
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
		//keep8
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
					Mainframe_GlobalFunctionLib.sendText(8, 13, "       ");
					Mainframe_GlobalFunctionLib.sendText(8, 13, masterprofilefromdate);
					Mainframe_GlobalFunctionLib.sendText(8, 41, "       ");
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
					//Mainframe_GlobalFunctionLib.sendText(7, 13, plancode);
					Thread.sleep(5000);
					Mainframe_GlobalFunctionLib.sendText(7, 70, fromdate+"  ");
					Mainframe_GlobalFunctionLib.sendText(8, 13, masterprofilefromdate);
					Mainframe_GlobalFunctionLib.sendText(8, 41, masterprofilethrudate);
					Mainframe_GlobalFunctionLib.sendText(14, 34, drugcoveragestatusschedule);
					Mainframe_GlobalFunctionLib.click(9, 11 );
					Mainframe_GlobalFunctionLib.pressKey("F4");
					Mainframe_GlobalFunctionLib.sendText(4, 5, contract);
					Mainframe_GlobalFunctionLib.sendText(4, 16, pbp);
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					Mainframe_GlobalFunctionLib.click(10, 2 );
					//func_SearchAndSelectContractAndPBP(contract,pbp);
					Mainframe_GlobalFunctionLib.sendText(10, 2, "1");
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					
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
		//keep4
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
		
		
		//Yes
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
					Thread.sleep(2000);
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
					System.out.println("Reached 1");
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					Mainframe_GlobalFunctionLib.pressKey("F12");
					Mainframe_GlobalFunctionLib.sendText(21, 12 ,"3" );
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					Mainframe_GlobalFunctionLib.pressKey("F6");
					System.out.println("Reached 2");
					Mainframe_GlobalFunctionLib.sendText(9, 2, fromdate);
					Mainframe_GlobalFunctionLib.sendText(9, 12, thruDate);
					Mainframe_GlobalFunctionLib.sendText(9, 22 ,patientpayschedule);
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					Mainframe_GlobalFunctionLib.sendText(16, 64 ,"Y");
					System.out.println("Reached 3");
					Mainframe_GlobalFunctionLib.pressKey("F12");
					System.out.println("Reached 4");
					Mainframe_GlobalFunctionLib.pressKey("F12");
					Mainframe_GlobalFunctionLib.pressKey("F12");
					/*System.out.println("Reached 5");
					Mainframe_GlobalFunctionLib.pressKey("F12");
					System.out.println("Reached 6");*/
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
					System.out.println("Reached here");
					Mainframe_GlobalFunctionLib.pressKey("F12");
					Mainframe_GlobalFunctionLib.sendText(21, 12 ,"3" );
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					Mainframe_GlobalFunctionLib.pressKey("F6");
					Mainframe_GlobalFunctionLib.sendText(9, 2, fromdate);
					Mainframe_GlobalFunctionLib.sendText(9, 12, thruDate);
					Mainframe_GlobalFunctionLib.sendText(9, 22 ,patientpayschedule);
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					System.out.println("reached till here");
					Mainframe_GlobalFunctionLib.sendText(16, 64 ,"Y");
					Thread.sleep(2000);
					Mainframe_GlobalFunctionLib.pressKey("F12");
					Mainframe_GlobalFunctionLib.pressKey("F12");
					System.out.println("till aaa");
					Thread.sleep(2000);
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
		
		//keep2
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
		
		//keep3
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
				Mainframe_GlobalFunctionLib.sendText(12, 23, CPPPatientPaySchedule);
				Mainframe_GlobalFunctionLib.sendText(13, 23, CPPTrOOPSchedule);
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
//					Mainframe_GlobalFunctionLib.pressKey("F12");
//					Mainframe_GlobalFunctionLib.pressKey("F12");
					System.out.println("Member is created");
					Reporter.addStepLog("Member is created");
				}
			else{
//				Mainframe_GlobalFunctionLib.pressKey("F12");
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
