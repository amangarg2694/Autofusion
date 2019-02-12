package com.atdd.demo.te.stepdefinitons;

import com.atdd.te.screenHelpers.FunctionalLibrary;
import com.optumrx.autofusion.core.te.util.Mainframe_GlobalFunctionLib;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestPlan {
	
	@When("^I want to create plan \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_want_to_create_plan(String plancode, String fromdate, String des) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		FunctionalLibrary.func_NavigateToAScreen("4-1");
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Mainframe_GlobalFunctionLib.sendText(13, 19, plancode);
		Mainframe_GlobalFunctionLib.sendText(14, 19, fromdate);
		Mainframe_GlobalFunctionLib.sendText(15, 19, des);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(16, 64, "Y");
	}

	@Then("^I validate plan code \"([^\"]*)\"$")
	public void i_validate_plan_code(String plancode) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    FunctionalLibrary.validateText("3", "13", plancode);
	    
	    
	    
	}


}
