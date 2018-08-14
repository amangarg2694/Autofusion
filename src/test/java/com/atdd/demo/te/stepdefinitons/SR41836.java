package com.atdd.demo.te.stepdefinitons;

import com.cucumber.listener.Reporter;
import com.optumrx.autofusion.core.te.util.Mainframe_GlobalFunctionLib;
import com.optumrx.autofusion.core.te.util.Screenshot;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SR41836 {
	@When("^I enter values \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_enter_values(String DateFrom, String DateThru, String CarrierFrom, String CarrierThru, String AccountFrom, String AccountThru, String GroupFrom, String GroupThru, String Netpaidonly, String Paid, String Rejected, String Reversed, String Captured, String FileName, String Library) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    Mainframe_GlobalFunctionLib.sendText(5, 15, DateFrom);
	    Mainframe_GlobalFunctionLib.sendText(5, 34, DateThru);
	    Mainframe_GlobalFunctionLib.sendText(6, 15, CarrierFrom);
	    Mainframe_GlobalFunctionLib.sendText(6, 34, CarrierThru);
	    Mainframe_GlobalFunctionLib.sendText(7, 15, AccountFrom);
	    Mainframe_GlobalFunctionLib.sendText(7, 34, AccountThru);
	    Mainframe_GlobalFunctionLib.sendText(8, 15, GroupFrom);
	    Mainframe_GlobalFunctionLib.sendText(8, 34, GroupThru);
	    Mainframe_GlobalFunctionLib.sendText(11, 20, Netpaidonly);
	    Mainframe_GlobalFunctionLib.sendText(12, 20, Paid);
	    Mainframe_GlobalFunctionLib.sendText(13, 20, Rejected);
	    Mainframe_GlobalFunctionLib.sendText(14, 20, Reversed);
	    Mainframe_GlobalFunctionLib.sendText(15, 20, Captured);
	    Mainframe_GlobalFunctionLib.sendText(12, 20, Paid);
	    Mainframe_GlobalFunctionLib.sendText(17, 15, FileName);
	    Mainframe_GlobalFunctionLib.sendText(18, 15, Library);
	    
	   	}

@When("^I verify job status & spooled file to generate the records$")
public void i_verify_job_status_spooled_file_to_generate_the_records() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	Mainframe_GlobalFunctionLib.sendText(21, 7, "ws");
	Mainframe_GlobalFunctionLib.pressKey("Enter");
	Mainframe_GlobalFunctionLib.sendText(11, 3, "8");
	Mainframe_GlobalFunctionLib.pressKey("Enter");
	Mainframe_GlobalFunctionLib.sendText(11, 3, "5");
	Mainframe_GlobalFunctionLib.pressKey("Enter");
	Mainframe_GlobalFunctionLib.sendText(3, 22, "w20");
	Mainframe_GlobalFunctionLib.pressKey("Enter");
	Mainframe_GlobalFunctionLib.pressKey("PageDown");
	Mainframe_GlobalFunctionLib.pressKey("PageDown");
	
}

 @Then("^I verify the records in the file$")
 public void i_verify_the_records_in_the_file() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	 Mainframe_GlobalFunctionLib.sendText(21, 7, "runqry *n anilalib/dtest01");
	 Mainframe_GlobalFunctionLib.pressKey("Enter");
	 Mainframe_GlobalFunctionLib.sendText(3, 32, "1");
	 Mainframe_GlobalFunctionLib.pressKey("Enter");
	 Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	 Mainframe_GlobalFunctionLib.sendText(3, 74, "79");
     Mainframe_GlobalFunctionLib.pressKey("Enter");
     Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
     Mainframe_GlobalFunctionLib.sendText(3, 74, "157");
     Mainframe_GlobalFunctionLib.pressKey("Enter");
     Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
     Mainframe_GlobalFunctionLib.sendText(3, 74, "235");
     Mainframe_GlobalFunctionLib.pressKey("Enter");
     Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
     Mainframe_GlobalFunctionLib.sendText(3, 74, "313");
     Mainframe_GlobalFunctionLib.pressKey("Enter");
     Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
     
     }
 }
