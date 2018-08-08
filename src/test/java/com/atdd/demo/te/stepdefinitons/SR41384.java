package com.atdd.demo.te.stepdefinitons;

import org.testng.Assert;

import com.cucumber.listener.Reporter;
import com.optumrx.autofusion.core.te.util.Mainframe_GlobalFunctionLib;
import com.optumrx.autofusion.core.te.util.Screenshot;

import cucumber.api.java.en.When;

public class SR41384 {
	
	@When("^I submit a claim with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_submit_a_claim_with(String BIN, String ProcCtrl, String Group, String PharmacyID, String RxNo, String Refill, String FillDate, String MemberID, String ProductID, String DspQty, String DS, String PSC, String Cost, String Fee) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
		try{
			Mainframe_GlobalFunctionLib.sendText(21, 7 ,"3" );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(21, 7 ,"2" );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(21, 7 ,"1" );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.pressKey("F6");
		    Mainframe_GlobalFunctionLib.sendText(11, 14,BIN );
				Mainframe_GlobalFunctionLib.sendText(11, 41,ProcCtrl );
				Mainframe_GlobalFunctionLib.sendText(11, 59,Group );
				Mainframe_GlobalFunctionLib.sendText(12, 14,PharmacyID );
				Mainframe_GlobalFunctionLib.sendText(12, 41,RxNo );
				Mainframe_GlobalFunctionLib.sendText(12, 59,Refill );
				Mainframe_GlobalFunctionLib.sendText(14, 41,MemberID);
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				//Mainframe_GlobalFunctionLib.click(7, 12 );
				//Mainframe_GlobalFunctionLib.pressKey("F4");
				//Thread.sleep(1000);
				//Mainframe_GlobalFunctionLib.sendText(3, 4, memberID);
				//Mainframe_GlobalFunctionLib.pressKey("Enter");
				//Mainframe_GlobalFunctionLib.sendText(8, 2,"1" );
				//Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(4 , 65 ,"          ");
				Mainframe_GlobalFunctionLib.sendText(4, 65, FillDate);			
				Mainframe_GlobalFunctionLib.sendText(11, 20,ProductID );
				Mainframe_GlobalFunctionLib.sendText(12, 11,DspQty );
				Mainframe_GlobalFunctionLib.sendText(12, 26,DS );
				Mainframe_GlobalFunctionLib.sendText(14, 6,PSC );
				Mainframe_GlobalFunctionLib.sendText(10, 47,"         " );
				Mainframe_GlobalFunctionLib.sendText(10, 47,Cost );
				Mainframe_GlobalFunctionLib.sendText(11, 51, Fee);
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.pressKey("F6");
				
				
		}catch(Exception e)
					{	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
						Assert.fail("An error has occured while creating the caim transaction.Screenshot is captured");
						
					}	
	
		
		
		
	}


}
