package com.atdd.demo.te.stepdefinitons;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import com.cucumber.listener.Reporter;
import com.optumrx.autofusion.core.te.util.Mainframe_GlobalFunctionLib;
import com.optumrx.autofusion.core.te.util.Screenshot;

import cucumber.api.java.en.Then;

public class HIXReprocessing {
	
	@Then("^Validating the error message when qualifier does not exist when CFT is Y with \"([^\"]*)\"$")
	public void validating_the_error_message_when_qualifier_does_not_exist_when_CFT_is_Y_with(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.sendText("10","02","7");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.click(18,34);
		Robot ro = new Robot();
		ro.keyPress(KeyEvent.VK_DELETE);
		ro.keyRelease(KeyEvent.VK_DELETE);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
	    Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	}
	
	@Then("^Validating the error message when qualifier does not exist when CFT is N with \"([^\"]*)\",\"([^\"]*)\"$")
	public void validating_the_error_message_when_qualifier_does_not_exist_when_CFT_is_N_with(String flag, String qualifier) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.sendText("18","21",flag);
		Mainframe_GlobalFunctionLib.sendText("18","34",qualifier);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
	    Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	    
	}
	
	@Then("^Validating the error message for batch when qualifier does not exist when CFT is N with \"([^\"]*)\",\"([^\"]*)\"$")
	public void validating_the_error_message_for_batch_when_qualifier_does_not_exist_when_CFT_is_N_with(String flag, String qualifier) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    Mainframe_GlobalFunctionLib.sendText("19","21",flag);
		Mainframe_GlobalFunctionLib.sendText("19","33",qualifier);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	   
	}
	
	@Then("^Validating the error message when CFT is Y and no qualifier exists with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void validating_the_error_message_when_CFT_is_Y_and_no_qualifier_exists_with(String fdate, String tdate, String flag) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.sendText("06","26",fdate);
		Mainframe_GlobalFunctionLib.sendText("06","48",tdate);
		Mainframe_GlobalFunctionLib.sendText("19","21",flag);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
	    Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	}
}
