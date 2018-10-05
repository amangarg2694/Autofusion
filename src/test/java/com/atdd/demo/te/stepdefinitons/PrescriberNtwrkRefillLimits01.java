package com.atdd.demo.te.stepdefinitons;

import com.cucumber.listener.Reporter;
import com.optumrx.autofusion.core.te.util.Mainframe_GlobalFunctionLib;
import com.optumrx.autofusion.core.te.util.Screenshot;

import cucumber.api.java.en.When;

public class PrescriberNtwrkRefillLimits01 {
	
	@When("^I enter \"([^\"]*)\" & select Refill Limts$")
public void i_enter_select_Refill_Limts(String plancode) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
         Mainframe_GlobalFunctionLib.sendText(4, 5, plancode);
		 Mainframe_GlobalFunctionLib.pressKey("Enter");
		 Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		 Mainframe_GlobalFunctionLib.sendText(11, 2, "2");
		 Mainframe_GlobalFunctionLib.pressKey("Enter");
		 Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		 Mainframe_GlobalFunctionLib.sendText(10, 51, "Y");
		 Mainframe_GlobalFunctionLib.pressKey("Enter");
		 Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		 Mainframe_GlobalFunctionLib.sendText(16, 64, "Y");
		 Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		 }
@When("^I verify the message is on Refill Limits$")
public void i_verify_the_message_is_on_Refill_Limits() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	 Mainframe_GlobalFunctionLib.sendText(7, 21, "15"); 
	 Mainframe_GlobalFunctionLib.pressKey("Enter");
	 Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	 Mainframe_GlobalFunctionLib.sendText(9, 48, ">GOPIPULE");
	 Mainframe_GlobalFunctionLib.sendText(9, 64, "A");
	 Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	 Mainframe_GlobalFunctionLib.pressKey("Enter");
	 Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	 Mainframe_GlobalFunctionLib.pressKey("F3");
	 Thread.sleep(3000);
	 Mainframe_GlobalFunctionLib.pressKey("F3");
	 Thread.sleep(3000);
	 Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
}
@When("^I verify the message indicator on the \"([^\"]*)\" screen must be turned ON for Refill limits$")
public void i_verify_the_message_indicator_on_the_screen_must_be_turned_ON_for_Refill_limits(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    Mainframe_GlobalFunctionLib.sendText(11, 2, "2");
    Mainframe_GlobalFunctionLib.pressKey("Enter");
   /* Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
    Mainframe_GlobalFunctionLib.sendText(11, 24, "Y");
    Mainframe_GlobalFunctionLib.pressKey("Enter");*/
    Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
    /*Mainframe_GlobalFunctionLib.sendText(16, 64, "Y");*/
    Mainframe_GlobalFunctionLib.pressKey("F8");
    Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
    Mainframe_GlobalFunctionLib.pressKey("F3");
}
@When("^I select Refill Limits & enter the message code$")
public void i_select_Refill_Limits_enter_the_message_code() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	Mainframe_GlobalFunctionLib.sendText(7, 21, "15"); 
    Mainframe_GlobalFunctionLib.pressKey("Enter");
    Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
    Mainframe_GlobalFunctionLib.pressKey("PageDown");
    Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
    Mainframe_GlobalFunctionLib.sendText(8, 16, ">GOPIPULE"); 
    Mainframe_GlobalFunctionLib.sendText(8, 39, "A");
    Mainframe_GlobalFunctionLib.pressKey("Enter");
    Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
    Mainframe_GlobalFunctionLib.pressKey("F3");
    Mainframe_GlobalFunctionLib.pressKey("F3");
}
@When("^I go to Plan Options menu & select Refill limts$")
public void i_go_to_Plan_Options_menu_select_Refill_limts() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	Mainframe_GlobalFunctionLib.sendText(7, 21, "15"); 
    Mainframe_GlobalFunctionLib.pressKey("Enter");
    Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
    Mainframe_GlobalFunctionLib.pressKey("F8");
    Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
    Mainframe_GlobalFunctionLib.pressKey("F6");
    Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
    Mainframe_GlobalFunctionLib.pressKey("F4");
    Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
    Mainframe_GlobalFunctionLib.sendText(13, 3, "X");
    Mainframe_GlobalFunctionLib.pressKey("Enter");
    Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
    Mainframe_GlobalFunctionLib.pressKey("Enter");
    Mainframe_GlobalFunctionLib.sendText(7, 13, "010118"); 
    Mainframe_GlobalFunctionLib.sendText(7, 41, "123118");
    Mainframe_GlobalFunctionLib.pressKey("Enter");
    Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
    Mainframe_GlobalFunctionLib.sendText(7, 26, "10");
    Mainframe_GlobalFunctionLib.sendText(7, 45, ">GOPIPULE");
    Mainframe_GlobalFunctionLib.sendText(7, 62, "A");
    Mainframe_GlobalFunctionLib.pressKey("Enter");
    Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
    Mainframe_GlobalFunctionLib.pressKey("F3");
    Mainframe_GlobalFunctionLib.pressKey("F3");
}

@When("^I verify the message is present on the \"([^\"]*)\"$")
public void i_verify_the_message_is_present_on_the(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	Mainframe_GlobalFunctionLib.sendText(7, 21, "15"); 
    Mainframe_GlobalFunctionLib.pressKey("Enter");
    Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
    Mainframe_GlobalFunctionLib.pressKey("F7");
    Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
    Mainframe_GlobalFunctionLib.sendText(16, 20, "1");
    Mainframe_GlobalFunctionLib.pressKey("Enter");
    Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
    Mainframe_GlobalFunctionLib.pressKey("F6");
    Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
    Mainframe_GlobalFunctionLib.sendText(11, 29, "10");
    Mainframe_GlobalFunctionLib.pressKey("Enter");
    Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
    Mainframe_GlobalFunctionLib.pressKey("F4");
    Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
    Mainframe_GlobalFunctionLib.sendText(19, 2, "1");
    Mainframe_GlobalFunctionLib.pressKey("Enter");
    Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
    Mainframe_GlobalFunctionLib.PressTabKey();
    Mainframe_GlobalFunctionLib.pressKey("F4");
    Mainframe_GlobalFunctionLib.sendText(13, 3, "X");
    Mainframe_GlobalFunctionLib.pressKey("Enter");
    Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
    Mainframe_GlobalFunctionLib.pressKey("Enter");
    Mainframe_GlobalFunctionLib.sendText(16, 2, "5");
    Mainframe_GlobalFunctionLib.pressKey("Enter");
    Mainframe_GlobalFunctionLib.pressKey("F3");
    Mainframe_GlobalFunctionLib.validateText("2", "38", "Carrier");
    Mainframe_GlobalFunctionLib.pressKey("F3");
    Mainframe_GlobalFunctionLib.pressKey("F3");
    Mainframe_GlobalFunctionLib.pressKey("F3");
    Mainframe_GlobalFunctionLib.pressKey("F3");
    Mainframe_GlobalFunctionLib.pressKey("F3");
    Mainframe_GlobalFunctionLib.sendText(21, 7, "1"); 
    Mainframe_GlobalFunctionLib.pressKey("Enter");
    Mainframe_GlobalFunctionLib.sendText(4, 5, "SR41885B1");
    Mainframe_GlobalFunctionLib.pressKey("Enter");
    }
@When("^I verify if a new menu option F(\\d+) \"([^\"]*)\" is availaible on the  \"([^\"]*)\"$")
public void i_verify_if_a_new_menu_option_F_is_availaible_on_the(int arg1, String arg2, String arg3) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	Mainframe_GlobalFunctionLib.sendText(8, 21, "8"); 
    Mainframe_GlobalFunctionLib.pressKey("Enter");
    Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
    Mainframe_GlobalFunctionLib.pressKey("F8");
    Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
    Mainframe_GlobalFunctionLib.sendText(11, 2, "5");
    Mainframe_GlobalFunctionLib.pressKey("Enter");
    Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
    Mainframe_GlobalFunctionLib.pressKey("F3");
    Mainframe_GlobalFunctionLib.pressKey("F3");
}

@When("^I verify if a new menu option F(\\d+) \"([^\"]*)\" is availaible on the Refill/Fill Limits Page (\\d+) of (\\d+)$")
public void i_verify_if_a_new_menu_option_F_is_availaible_on_the_Refill_Fill_Limits_Page_of(int arg1, String arg2, int arg3, int arg4) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	Mainframe_GlobalFunctionLib.sendText(8, 21, "8"); 
    Mainframe_GlobalFunctionLib.pressKey("Enter");
    Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
    Mainframe_GlobalFunctionLib.pressKey("F7");
    Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
    Mainframe_GlobalFunctionLib.sendText(16, 20, "1");
    Mainframe_GlobalFunctionLib.pressKey("Enter");
    Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
    Mainframe_GlobalFunctionLib.sendText(16, 2, "5");
    Mainframe_GlobalFunctionLib.pressKey("Enter");
    Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
    Mainframe_GlobalFunctionLib.pressKey("F3");
    Mainframe_GlobalFunctionLib.pressKey("F3");
    
}
}
