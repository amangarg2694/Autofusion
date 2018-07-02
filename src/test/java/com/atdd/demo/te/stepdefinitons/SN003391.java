package com.atdd.demo.te.stepdefinitons;

import com.optumrx.autofusion.core.te.util.Mainframe_GlobalFunctionLib;

import cucumber.api.java.en.When;

public class SN003391 {
	@When("^I enter \"([^\"]*)\" to library list$")
	public void i_enter_to_library_list(String Library) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String addlibQuery="addlible";
		 Mainframe_GlobalFunctionLib.sendText(21, 7,addlibQuery+" "+Library);
		 Mainframe_GlobalFunctionLib.pressKey("Enter");
		 Mainframe_GlobalFunctionLib.pressKey("End");
	}
	
	@When("^I verify adding \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" to DBU$")
	public void i_verify_adding_to_DBU(String ACMP_Table, String carrier, String account, String group) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String adddbuQuery="DBU";
		Mainframe_GlobalFunctionLib.sendText(21, 7,adddbuQuery+" "+ACMP_Table);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(21, 7,carrier);
		Mainframe_GlobalFunctionLib.sendText(21, 7,account);
		Mainframe_GlobalFunctionLib.sendText(21, 7,group);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.sendText(8, 7,"1");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
	}
	
	
}
