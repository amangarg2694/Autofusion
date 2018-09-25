package com.atdd.demo.te.stepdefinitons;

import com.cucumber.listener.Reporter;
import com.optumrx.autofusion.core.te.util.Mainframe_GlobalFunctionLib;
import com.optumrx.autofusion.core.te.util.Screenshot;

import cucumber.api.java.en.When;

public class SR41885A {
	@When("^I enter plan code in \"([^\"]*)\"$")
	public void i_enter_plan_code_in(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    Mainframe_GlobalFunctionLib.sendText(4, 5, "SR41885B1");
	    Mainframe_GlobalFunctionLib.pressKey("Enter");
	    Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	    Mainframe_GlobalFunctionLib.sendText(11, 2, "2");
	    Mainframe_GlobalFunctionLib.pressKey("Enter");
	    Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	    Mainframe_GlobalFunctionLib.sendText(11, 24, "Y");
	    Mainframe_GlobalFunctionLib.pressKey("F7");
	    Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	    Mainframe_GlobalFunctionLib.sendText(7, 21, "6");
	    Mainframe_GlobalFunctionLib.pressKey("Enter");
	    Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	    Mainframe_GlobalFunctionLib.pressKey("F6");
	    Mainframe_GlobalFunctionLib.sendText(14, 2, "1");
	    Mainframe_GlobalFunctionLib.pressKey("Enter");
	    Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	    Mainframe_GlobalFunctionLib.pressKey("Enter");
	    Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	    Mainframe_GlobalFunctionLib.pressKey("F4");
	    Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	    Mainframe_GlobalFunctionLib.sendText(13, 3, "X");
	    Mainframe_GlobalFunctionLib.pressKey("Enter");
	    Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	    Mainframe_GlobalFunctionLib.sendText(18, 26, ">GOPIPULE");
	    Mainframe_GlobalFunctionLib.pressKey("Enter");
	    Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	    Mainframe_GlobalFunctionLib.sendText(16, 64, "Y");
	    Mainframe_GlobalFunctionLib.pressKey("Enter");
	    Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	    Mainframe_GlobalFunctionLib.pressKey("F3");
	    Mainframe_GlobalFunctionLib.pressKey("F3");
	}

@When("^I verify the message is on prescriber network$")
public void i_verify_the_message_is_on_prescriber_network() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	Mainframe_GlobalFunctionLib.sendText(11, 2, "2");
    Mainframe_GlobalFunctionLib.pressKey("Enter");
    Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
    Mainframe_GlobalFunctionLib.sendText(11, 24, "Y");
    Mainframe_GlobalFunctionLib.pressKey("Enter");
    Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
    Mainframe_GlobalFunctionLib.sendText(16, 64, "Y");
    Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
    Mainframe_GlobalFunctionLib.pressKey("F8");
    Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
    Mainframe_GlobalFunctionLib.pressKey("F3");
  }
@When("^I select the prescriber network$")
public void i_select_the_prescriber_network() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    Mainframe_GlobalFunctionLib.sendText(7, 21, "6"); 
    Mainframe_GlobalFunctionLib.pressKey("Enter");
    Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
    Mainframe_GlobalFunctionLib.sendText(14, 2, "2"); 
    Mainframe_GlobalFunctionLib.pressKey("Enter");
    Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
    Mainframe_GlobalFunctionLib.pressKey("F7");
    Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
    Mainframe_GlobalFunctionLib.pressKey("F6");
    Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
    Mainframe_GlobalFunctionLib.sendText(10, 13, "010118"); 
    Mainframe_GlobalFunctionLib.sendText(10, 43, "123139");
    Mainframe_GlobalFunctionLib.sendText(18, 17, ">GOPIPULE");
    Mainframe_GlobalFunctionLib.sendText(19, 17, "A");
    Mainframe_GlobalFunctionLib.pressKey("Enter");
    Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
    Mainframe_GlobalFunctionLib.pressKey("F3");
    Mainframe_GlobalFunctionLib.pressKey("F3");
    Mainframe_GlobalFunctionLib.pressKey("F3");
     }
@When("^I select the prescriber network & override the network$")
public void i_select_the_prescriber_network_override_the_network() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	 Mainframe_GlobalFunctionLib.sendText(7, 21, "6");
	 Mainframe_GlobalFunctionLib.pressKey("Enter");
	 Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	 Mainframe_GlobalFunctionLib.pressKey("F9");
	 Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	 Mainframe_GlobalFunctionLib.sendText(6, 15, ">GOPIPULE");
	 Mainframe_GlobalFunctionLib.sendText(7, 15, "A");
	 Mainframe_GlobalFunctionLib.sendText(8, 19, "00");
	 Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	 Mainframe_GlobalFunctionLib.pressKey("Enter");
	 Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	 Mainframe_GlobalFunctionLib.pressKey("F3");
	 Mainframe_GlobalFunctionLib.pressKey("F3");
	 
}
}


