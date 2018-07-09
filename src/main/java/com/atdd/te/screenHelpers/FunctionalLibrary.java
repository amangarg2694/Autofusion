package com.atdd.te.screenHelpers;

import java.io.IOException;
import java.sql.SQLException;
import java.util.StringTokenizer;

import org.testng.Assert;

import com.cucumber.listener.Reporter;
import com.hp.lft.report.ReportException;
import com.hp.lft.sdk.GeneralLeanFtException;
import com.itextpdf.text.log.SysoLogger;
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
	
	
	public static void editMemberAddress(String memberID, String address2) throws Throwable
	{	
		/*try {
			navigateToRxClaimPlanAdministrator();
		} catch (Exception e) {
			
			e.printStackTrace();
		}*/
		try{

		   Mainframe_GlobalFunctionLib.sendText(21, 7 ,"1" );
		   Mainframe_GlobalFunctionLib.pressKey("Enter");
		   Mainframe_GlobalFunctionLib.sendText(21, 7 ,"2" );
		   Mainframe_GlobalFunctionLib.pressKey("Enter");
		   Mainframe_GlobalFunctionLib.waitTillReady();
           Mainframe_GlobalFunctionLib.click(4, 4 );
           Mainframe_GlobalFunctionLib.sendText(4, 4 ,memberID );
           Mainframe_GlobalFunctionLib.pressKey("Enter");
           Mainframe_GlobalFunctionLib.waitTillReady();
		   Mainframe_GlobalFunctionLib.pressKey("F8");
		   Mainframe_GlobalFunctionLib.sendText(10, 2,"2" );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(10, 10,address2 );
			Mainframe_GlobalFunctionLib.pressKey("F24");
			Mainframe_GlobalFunctionLib.pressKey("F12");
			Mainframe_GlobalFunctionLib.sendText(10, 2,"5" );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			String address3=Mainframe_GlobalFunctionLib.getText(9, 10);
					if(address3=="test")
					{
						System.out.println("Address updated");
					}
					else
					{
						System.out.println("Address not updated and working as expected");
					}
							
		   if(ScreenshotOption.equalsIgnoreCase("Always")){
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				}
				}catch(Exception e)
				{	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
					Assert.fail("An error has occured while creating the caim transaction.Screenshot is captured");
					
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
	
	public static void CreateTransaction1(String bin, String proc, String group, String pharmacyID, String rxNbr, String refill, String fillDate, String memberID, String productId, String dspQty, String ds, String psc, String cost, String qual) throws Throwable
	{	
				
			try {
				Mainframe_GlobalFunctionLib.pressKey("F6");
				Mainframe_GlobalFunctionLib.click(11, 14 );
				Mainframe_GlobalFunctionLib.pressKey("F4");
				Thread.sleep(1000);
				Mainframe_GlobalFunctionLib.sendText(4, 4, bin);
				Mainframe_GlobalFunctionLib.sendText(4, 11, proc);
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(10, 2,"1" );
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(11, 59,group );
				Mainframe_GlobalFunctionLib.click(12, 14 );
				Mainframe_GlobalFunctionLib.pressKey("F4");
				Thread.sleep(1000);
				Mainframe_GlobalFunctionLib.sendText(4, 4, pharmacyID);
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(9, 2,"1" );
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				
				Mainframe_GlobalFunctionLib.sendText(12, 41,rxNbr );
				Mainframe_GlobalFunctionLib.sendText(12, 59,refill );
				
				Mainframe_GlobalFunctionLib.click(14, 41 );
				Mainframe_GlobalFunctionLib.pressKey("F4");
				Thread.sleep(1000);
				Mainframe_GlobalFunctionLib.sendText(3, 4, memberID);
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				
				Mainframe_GlobalFunctionLib.sendText(8, 2,"1" );
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.waitTillReady();
				Mainframe_GlobalFunctionLib.sendText(4, 65, fillDate + "   ");	
				Mainframe_GlobalFunctionLib.click(11, 20 );
				Mainframe_GlobalFunctionLib.pressKey("F4");
				Mainframe_GlobalFunctionLib.waitTillReady();
				Mainframe_GlobalFunctionLib.sendText(4, 4, productId);
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(9, 2,"1" );
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Thread.sleep(1000);
				Mainframe_GlobalFunctionLib.sendText(12, 11,dspQty );
				Mainframe_GlobalFunctionLib.sendText(12, 26,ds );
				Mainframe_GlobalFunctionLib.sendText(14, 6,psc );
				Thread.sleep(5000);
				Mainframe_GlobalFunctionLib.sendText(10, 47,cost );
				Mainframe_GlobalFunctionLib.sendText(5, 22,qual );
				Mainframe_GlobalFunctionLib.waitTillReady();
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				
				System.out.println("Claim is created");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
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
		
	public static void editMember(String memberID, String FromDate, String ThruDate) throws ClassNotFoundException, GeneralLeanFtException, SQLException, ReportException, InterruptedException, IOException 
	{
		
		
		try {
			Mainframe_GlobalFunctionLib.sendText(21, 7 ,"1" );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(21, 7 ,"2" );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(4, 4 ,memberID );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.pressKey("F8");
			Mainframe_GlobalFunctionLib.sendText(10, 2 ,"2" );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.pressKey("F7");
			Mainframe_GlobalFunctionLib.sendText(15, 2 ,"2" );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(10, 15 ,FromDate+"   " );
			Mainframe_GlobalFunctionLib.sendText(10, 38 ,ThruDate+"    ");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.pressKey("F12");
			Mainframe_GlobalFunctionLib.pressKey("F12");
			Mainframe_GlobalFunctionLib.pressKey("F12");
			Mainframe_GlobalFunctionLib.pressKey("F12");
			Mainframe_GlobalFunctionLib.pressKey("F12");
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
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
