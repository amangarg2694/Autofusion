package com.atdd.demo.te.stepdefinitons;

import org.testng.Assert;

import com.atdd.te.screenHelpers.CommonHelper;
import com.atdd.te.screenHelpers.FunctionalLibrary;
import com.cucumber.listener.Reporter;
import com.optumrx.autofusion.core.te.util.Mainframe_GlobalFunctionLib;
import com.optumrx.autofusion.core.te.util.Screenshot;

import cucumber.api.java.en.When;

public class DERFAndECLChanges extends CommonHelper{
	
	@When("^I submit a claim \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_submit_a_claim(String bin, String proc, String group, String pharmacyID, String rxNbr, String refill, String memberID, String productID, String dspQty, String ds, String psc, String cost) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    try {
	    	Mainframe_GlobalFunctionLib.pressKey("F6");
			Mainframe_GlobalFunctionLib.click(11, 14 );
			Mainframe_GlobalFunctionLib.pressKey("F4");

			Mainframe_GlobalFunctionLib.sendText(4, 4, bin);
			Mainframe_GlobalFunctionLib.sendText(4, 11, proc);
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(10, 2,"1" );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(11, 59,group );
			Mainframe_GlobalFunctionLib.click(12, 14 );
			Mainframe_GlobalFunctionLib.pressKey("F4");
		
			Mainframe_GlobalFunctionLib.sendText(4, 4, pharmacyID);
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(9, 2,"1" );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			
			Mainframe_GlobalFunctionLib.sendText(12, 41,rxNbr );
			Mainframe_GlobalFunctionLib.sendText(12, 59,refill );
			
			Mainframe_GlobalFunctionLib.click(14, 41 );
			Mainframe_GlobalFunctionLib.pressKey("F4");
			
			Mainframe_GlobalFunctionLib.sendText(3, 4, memberID);
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			
			Mainframe_GlobalFunctionLib.sendText(8, 2,"1" );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
		    Mainframe_GlobalFunctionLib.click(11, 20 );
			Mainframe_GlobalFunctionLib.pressKey("F4");
			Mainframe_GlobalFunctionLib.waitTillReady();
			Mainframe_GlobalFunctionLib.pressKey("F16");
			Mainframe_GlobalFunctionLib.sendText(4, 4, productID);
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(9, 2,"1" );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
		
			Mainframe_GlobalFunctionLib.sendText(12, 11,dspQty );
			Mainframe_GlobalFunctionLib.sendText(12, 26,ds );
			Mainframe_GlobalFunctionLib.sendText(14, 6,psc );
			
			Mainframe_GlobalFunctionLib.sendText(10, 47,cost );
			
			Mainframe_GlobalFunctionLib.waitTillReady();
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.pressKey("F6");
			Mainframe_GlobalFunctionLib.pressKey("F7");
			Mainframe_GlobalFunctionLib.pressKey("F7");
			Mainframe_GlobalFunctionLib.sendText(4, 23, "6");
			FunctionalLibrary.pressEnter();
			if(ScreenshotOption.equalsIgnoreCase("Always")){
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	    	}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			Assert.fail("An error has occured while creating the caim transaction.Screenshot is captured");
		}
	}
	@When("^I verify the communication log$")
	public void i_verify_the_communication_log() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

}
