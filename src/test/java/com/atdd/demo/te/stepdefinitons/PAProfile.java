package com.atdd.demo.te.stepdefinitons;

import com.optumrx.autofusion.core.te.util.Mainframe_GlobalFunctionLib;

import cucumber.api.java.en.And;

public class PAProfile {
	
	@And("^I create a new PA profile with Drug status \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void add_new_reason_code_profile(String CarrierID,String AccountID, String GroupID, String Initial_PAP_drug_status) throws Throwable{
		Mainframe_GlobalFunctionLib.sendText(21, 7, "8");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(21, 7, "13");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Mainframe_GlobalFunctionLib.sendText(13, 14, CarrierID);
		Mainframe_GlobalFunctionLib.sendText(14, 14, AccountID);
		Mainframe_GlobalFunctionLib.sendText(15, 14, GroupID);
		Mainframe_GlobalFunctionLib.pressKey("Enter");	
		Mainframe_GlobalFunctionLib.sendText(17, 32, Initial_PAP_drug_status);
		Mainframe_GlobalFunctionLib.pressKey("Enter");	
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F12");		
	}


}
