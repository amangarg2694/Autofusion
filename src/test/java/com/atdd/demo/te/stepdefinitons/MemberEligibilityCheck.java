package com.atdd.demo.te.stepdefinitons;

import java.io.IOException;

import org.testng.Assert;

import com.atdd.te.screenHelpers.CommonHelper;
import com.atdd.te.screenHelpers.FunctionalLibrary;
import com.cucumber.listener.Reporter;
import com.hp.lft.sdk.GeneralLeanFtException;
import com.optumrx.autofusion.core.te.util.Mainframe_GlobalFunctionLib;
import com.optumrx.autofusion.core.te.util.Screenshot;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MemberEligibilityCheck extends CommonHelper {
	
	
	@When("^I do manual claim with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_do_manual_claim_with(String bin, String proc, String group, String pharmacyID, String rxNbr, String refill, String fillDate, String memberID, String productID, String dspQty, String ds, String psc, String cost, String qual) throws Throwable
	{
	      try {
				Mainframe_GlobalFunctionLib.pressKey("F6");
				Mainframe_GlobalFunctionLib.click(11, 14 );
				Mainframe_GlobalFunctionLib.pressKey("F4");
				Thread.sleep(3000);
				Mainframe_GlobalFunctionLib.sendText(4, 4, bin);
				Mainframe_GlobalFunctionLib.sendText(4, 11, proc);
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(10, 2,"1" );
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(11, 59,group );
				Mainframe_GlobalFunctionLib.click(12, 14 );
				Mainframe_GlobalFunctionLib.pressKey("F4");
				Thread.sleep(3000);
				Mainframe_GlobalFunctionLib.sendText(4, 4, pharmacyID);
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(9, 2,"1" );
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				
				Mainframe_GlobalFunctionLib.sendText(12, 41,rxNbr );
				Mainframe_GlobalFunctionLib.sendText(12, 59,refill );
				
				Mainframe_GlobalFunctionLib.click(14, 41 );
				Mainframe_GlobalFunctionLib.pressKey("F4");
				Thread.sleep(3000);
				Mainframe_GlobalFunctionLib.sendText(3, 4, memberID);
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				
				Mainframe_GlobalFunctionLib.sendText(8, 2,"1" );
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				//Mainframe_GlobalFunctionLib.pressKey("Enter");
				Thread.sleep(5000);
				//Mainframe_GlobalFunctionLib.waitTillReady();
				//System.out.println("Reached here");
				//Thread.sleep(5000);
				//Mainframe_GlobalFunctionLib.pressKey("Enter");
				//Mainframe_GlobalFunctionLib.sendText(4, 65, fillDate+"  ");	
				System.out.println("Entered fill date");
				Mainframe_GlobalFunctionLib.click(11, 20 );
				Mainframe_GlobalFunctionLib.pressKey("F4");
				Mainframe_GlobalFunctionLib.waitTillReady();
				Mainframe_GlobalFunctionLib.pressKey("F16");
				Mainframe_GlobalFunctionLib.sendText(4, 4, productID);
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(9, 2,"1" );
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Thread.sleep(3000);
				Mainframe_GlobalFunctionLib.sendText(12, 11,dspQty );
				Mainframe_GlobalFunctionLib.sendText(12, 26,ds );
				Mainframe_GlobalFunctionLib.sendText(14, 6,psc );
				Thread.sleep(5000);
				Mainframe_GlobalFunctionLib.sendText(10, 47,cost );
				Mainframe_GlobalFunctionLib.sendText(5, 22,qual );
				Mainframe_GlobalFunctionLib.waitTillReady();
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.pressKey("F6");
				
				System.out.println("Claim is created");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				Assert.fail("An error has occured while creating the caim transaction.Screenshot is captured");
				
			}
	      
			
		}
	/*public static void MemberDetailsCheck() throws IOException
	{
		
	try{

	   Mainframe_GlobalFunctionLib.sendText(21, 7 ,"STRSQL" );
	   Mainframe_GlobalFunctionLib.pressKey("Enter");
	   Mainframe_GlobalFunctionLib.sendText(16, 7 ,"SELECT * FROM TCL8402FIL/RCMBRP WHERE ABA1TX ='CHANDRA'" );
	   Mainframe_GlobalFunctionLib.pressKey("Enter");
	   Mainframe_GlobalFunctionLib.waitTillReady();
	   Mainframe_GlobalFunctionLib.pressKey("F20");
	   Mainframe_GlobalFunctionLib.pressKey("F20");
	   
	   if(ScreenshotOption.equalsIgnoreCase("Always"))
	   {
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		}
	}catch(Exception e)
			{	
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				Assert.fail("An error has occured while creating the caim transaction.Screenshot is captured");
				
			}
}*/
	/*@Then("^I copy a Member with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_copy_a_Member_with(String memberID, String carrierID, String accountID, String groupID, String FromDate, String ThruDate) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		FunctionalLibrary.CopyMember(memberID, carrierID, accountID, groupID, FromDate, ThruDate);                     
		
}*/
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
	
	}
