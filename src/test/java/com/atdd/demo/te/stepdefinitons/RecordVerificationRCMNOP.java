package com.atdd.demo.te.stepdefinitons;

import com.optumrx.autofusion.core.te.util.Mainframe_GlobalFunctionLib;

import cucumber.api.java.en.Then;

public class RecordVerificationRCMNOP {
	
	@Then("^I verify PA record in RCMNOP \"([^\"]*)\"$")
	public void add_new_reason_code_profile(String MemberID) throws Throwable{
		Mainframe_GlobalFunctionLib.sendText(21, 7, "STRSQL");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(16, 7, "SELECT C2CJST FROM rcmnop WHERE C2ABCD = '" +MemberID+ "'");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
	
	}
}
