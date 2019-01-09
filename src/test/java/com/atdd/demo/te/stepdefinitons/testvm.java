package com.atdd.demo.te.stepdefinitons;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

import com.atdd.te.screenHelpers.FunctionalLibrary;
import com.optumrx.autofusion.core.te.util.Mainframe_GlobalFunctionLib;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class testvm {
	
	@Then("^I update Plan override \"([^\"]*)\"$")
	public void i_update_Plan_override(String PlanOverride) throws Throwable {
	Mainframe_GlobalFunctionLib.sendText(15, 2, "2");
	Mainframe_GlobalFunctionLib.pressKey("Enter");
	Mainframe_GlobalFunctionLib.click(12, 14);
	Mainframe_GlobalFunctionLib.pressKey("F4");
	Mainframe_GlobalFunctionLib.sendText(4, 5, "          ");
	Mainframe_GlobalFunctionLib.sendText(4, 5, PlanOverride);
	Mainframe_GlobalFunctionLib.pressKey("Enter");
	Mainframe_GlobalFunctionLib.sendText(10, 2, "1");
	Mainframe_GlobalFunctionLib.pressKey("Enter");
	Mainframe_GlobalFunctionLib.sendText(16, 26, "YYYYY");
	Mainframe_GlobalFunctionLib.pressKey("Enter");
	Mainframe_GlobalFunctionLib.pressKey("F12");
	FunctionalLibrary.navigateToRxClaimPlanAdministrator();
	}
	
	@When("^I call Plan \"([^\"]*)\"$")
	public void i_call_Plan(String PlanIDExisting) throws Throwable {
		Mainframe_GlobalFunctionLib.sendText(4, 5, PlanIDExisting);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(11, 2, "3");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
	
	}
	
	@When("^I navigate back$")
	public void i_navigate_back() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		FunctionalLibrary.navigateToRxClaimPlanAdministrator();
	}
	@Then("^I Submit Standard Extract Job test \"([^\"]*)\"$")
	public void i_Submit_Standard_Extract_Job_test(String arg1) throws Throwable {
		SimpleDateFormat formatter = new SimpleDateFormat("ddmmyy", Locale.getDefault());
		 Calendar currentDate = java.util.Calendar.getInstance();
		 String timeString = formatter.format(currentDate.getTime());
		 System.out.println("timeString is: "+timeString);
		 String TofileName="SR"+timeString;
	}
	
}	
