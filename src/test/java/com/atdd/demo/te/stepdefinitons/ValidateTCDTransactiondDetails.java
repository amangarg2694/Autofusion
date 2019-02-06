package com.atdd.demo.te.stepdefinitons;

import com.optumrx.autofusion.core.te.util.Mainframe_GlobalFunctionLib;

import cucumber.api.java.en.When;

public class ValidateTCDTransactiondDetails {
	@When("^Validate Transaction Claim Detils$")
	public void validate_Transaction_Claim_Detils() throws Throwable {
		Mainframe_GlobalFunctionLib.pressKey("F7");
		Mainframe_GlobalFunctionLib.pressKey("F7");
		Mainframe_GlobalFunctionLib.sendText(4, 23,"8");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F9");
	}

}
