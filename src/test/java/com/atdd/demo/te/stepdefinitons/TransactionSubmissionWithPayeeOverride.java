package com.atdd.demo.te.stepdefinitons;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;

import com.atdd.te.screenHelpers.FunctionalLibrary;
import com.cucumber.listener.Reporter;
import com.optumrx.autofusion.core.te.util.Mainframe_GlobalFunctionLib;
import com.optumrx.autofusion.core.te.util.Screenshot;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TransactionSubmissionWithPayeeOverride {
	@When("^I submit subrogation transaction with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_submit_subrogation_transaction_with(String bin, String pcn, String group, String pharmacy, String refill, String fillDate,String memberID, String payeeOverride, String subrogationFlag, String productID, String dspQty, String ds, String psc, String cost, String due, String ucw, String fee) throws Throwable {
		try{		
		FunctionalLibrary.navigateToScreen("3");
			FunctionalLibrary.navigateToScreen("2");
			FunctionalLibrary.navigateToScreen("10");
			if(FunctionalLibrary.func_SearchForMemberID("4,4" ,memberID ,"9,4" , memberID))
			{
				Mainframe_GlobalFunctionLib.sendText("13", "021",payeeOverride);
				Mainframe_GlobalFunctionLib.sendText("16", "021",subrogationFlag);
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText("16", "064","Y");
				Mainframe_GlobalFunctionLib.sendText("03", "12","      ");
				Mainframe_GlobalFunctionLib.sendText("03", "29","          ");
				Mainframe_GlobalFunctionLib.sendText("03", "44","          ");
				Mainframe_GlobalFunctionLib.sendText("04", "24","            ");
				Mainframe_GlobalFunctionLib.sendText("03", "12",bin);
				Mainframe_GlobalFunctionLib.sendText("03", "29",pcn);
				Mainframe_GlobalFunctionLib.sendText("03", "44",group);
				Mainframe_GlobalFunctionLib.sendText("04", "24",pharmacy);
			}
			else{
			Mainframe_GlobalFunctionLib.pressKey("F6");			
			Mainframe_GlobalFunctionLib.sendText("04", "11",bin);
			Mainframe_GlobalFunctionLib.sendText("04", "38",pcn);
			Mainframe_GlobalFunctionLib.sendText("04", "56",group);
			Mainframe_GlobalFunctionLib.sendText("05", "11",pharmacy);
			Mainframe_GlobalFunctionLib.sendText("05", "38",FunctionalLibrary.func_GenerateDynamicRxNo());
			Mainframe_GlobalFunctionLib.sendText("05", "56",refill);
			Mainframe_GlobalFunctionLib.sendText("07", "38",memberID);
			Mainframe_GlobalFunctionLib.sendText("09", "17",payeeOverride);
			Mainframe_GlobalFunctionLib.sendText("10", "17",subrogationFlag);
			Mainframe_GlobalFunctionLib.pressKey("Enter");	
	}
			
			
			Mainframe_GlobalFunctionLib.sendText(5, 24,FunctionalLibrary.func_GenerateDynamicRxNo());			
			Mainframe_GlobalFunctionLib.click(7, 12 );
			Mainframe_GlobalFunctionLib.pressKey("F4");
			Thread.sleep(1000);
			Mainframe_GlobalFunctionLib.sendText(3, 4, memberID);
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(8, 2,"1" );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			System.out.println("fillDate:"+ fillDate);
			Mainframe_GlobalFunctionLib.sendText(4 , 53 ,"          ");
			Mainframe_GlobalFunctionLib.sendText(4, 53, fillDate);			
			Mainframe_GlobalFunctionLib.sendText(11, 20,productID );
			Mainframe_GlobalFunctionLib.sendText(12, 11,"           " );
			Mainframe_GlobalFunctionLib.sendText(12, 11,dspQty );
			Mainframe_GlobalFunctionLib.sendText(12, 26,ds );
			Mainframe_GlobalFunctionLib.sendText(14, 6,psc );
			Mainframe_GlobalFunctionLib.sendText(10, 47,"         " );
			Mainframe_GlobalFunctionLib.sendText(10, 47,cost );
			Mainframe_GlobalFunctionLib.sendText(11 , 47 ,"         ");
			 Mainframe_GlobalFunctionLib.sendText(19 , 47 ,"         ");
			 Mainframe_GlobalFunctionLib.sendText(20 , 47 ,"         ");
			 Mainframe_GlobalFunctionLib.sendText(11 , 47 ,fee);
			 Mainframe_GlobalFunctionLib.sendText(19 , 47 ,due);
			 Mainframe_GlobalFunctionLib.sendText(20 , 47 ,ucw);
			
			 FunctionalLibrary.submitClaim();
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			
			}catch(Exception e)
			{	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		e.printStackTrace();
				Assert.fail("An error has occured while creating the subrogation claim transaction.Screenshot is captured");
			}
			
		
	}
	}

