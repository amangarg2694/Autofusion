package com.atdd.demo.te.stepdefinitons;

import com.optumrx.autofusion.core.te.util.Mainframe_GlobalFunctionLib;

import cucumber.api.java.en.When;


public class MemberCreation {
	@When("^I create a new member \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void add_new_reason_code_profile(String CarrierID,String AccountID, String GroupID,String MemberID,String LastName,String FirstName,String Sex,String DOB,String fromdate,String thrudate) throws Throwable{
		Mainframe_GlobalFunctionLib.sendText(21, 7, "1");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(21, 7, "2");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Mainframe_GlobalFunctionLib.sendText(4, 10, CarrierID);
		Mainframe_GlobalFunctionLib.sendText(5, 10, AccountID);
		Mainframe_GlobalFunctionLib.sendText(6, 10, GroupID);
		Mainframe_GlobalFunctionLib.sendText(7, 10, MemberID);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(6, 29, LastName);
		Mainframe_GlobalFunctionLib.sendText(6, 57, FirstName);
		Mainframe_GlobalFunctionLib.sendText(7, 33, Sex);
		Mainframe_GlobalFunctionLib.sendText(7, 40, DOB);
		Mainframe_GlobalFunctionLib.sendText(20, 2, fromdate);
		Mainframe_GlobalFunctionLib.sendText(20, 12, thrudate);
		Mainframe_GlobalFunctionLib.pressKey("Enter");	
		Mainframe_GlobalFunctionLib.sendText(16, 64, "Y");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F12");
	}
	
}
	

	
	

