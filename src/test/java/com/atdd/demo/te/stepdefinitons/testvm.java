package com.atdd.demo.te.stepdefinitons;

import com.atdd.te.screenHelpers.FunctionalLibrary;
import com.optumrx.autofusion.core.te.util.Mainframe_GlobalFunctionLib;

import cucumber.api.java.en.Then;

public class testvm {
	
	@Then("^I update Plan override \"([^\"]*)\"$")
	public void i_update_Plan_override(String PlanOverride) throws Throwable {
	Mainframe_GlobalFunctionLib.sendText(15, 2, "2");
	Mainframe_GlobalFunctionLib.pressKey("Enter");
	Mainframe_GlobalFunctionLib.click(12, 14);
	Mainframe_GlobalFunctionLib.pressKey("F4");
	Mainframe_GlobalFunctionLib.sendText(4, 5, PlanOverride);
	Mainframe_GlobalFunctionLib.pressKey("Enter");
	Mainframe_GlobalFunctionLib.sendText(10, 2, "1");
	Mainframe_GlobalFunctionLib.pressKey("Enter");
	Mainframe_GlobalFunctionLib.sendText(16, 26, "YYYYY");
	Mainframe_GlobalFunctionLib.pressKey("Enter");
	Mainframe_GlobalFunctionLib.pressKey("F12");
	FunctionalLibrary.navigateToRxClaimPlanAdministrator();
	}

}
