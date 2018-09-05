package com.atdd.demo.te.stepdefinitons;

import com.atdd.te.screenHelpers.FunctionalLibrary;
import com.optumrx.autofusion.core.te.util.Mainframe_GlobalFunctionLib;

import cucumber.api.java.en.When;

public class Sample {
	@When("^I send Option \"([^\"]*)\" to navigate to \"([^\"]*)\"$")
	public void i_send_Option_to_navigate_to(String option, String arg2) throws Throwable {
		FunctionalLibrary.enterText(21,7 ,option );
		FunctionalLibrary.pressEnter();
	}
	
	@When("^I input \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\"$")
	public void i_input(String Calender, String CalenderDescription, String Type) throws Throwable {
		Mainframe_GlobalFunctionLib.sendText(8,20,Calender);
		Mainframe_GlobalFunctionLib.sendText(9,20,CalenderDescription);
		Mainframe_GlobalFunctionLib.sendText(10,20,Type);
		FunctionalLibrary.pressEnter();
		Mainframe_GlobalFunctionLib.sendText(11,28,"X");
		Mainframe_GlobalFunctionLib.sendText(11,31,"X");
		Mainframe_GlobalFunctionLib.sendText(11,34,"X");
		Mainframe_GlobalFunctionLib.sendText(11,37,"X");
		Mainframe_GlobalFunctionLib.sendText(11,40,"X");
		Mainframe_GlobalFunctionLib.sendText(11,43,"X");
		Mainframe_GlobalFunctionLib.sendText(11,46,"X");
		FunctionalLibrary.pressEnter();
		Mainframe_GlobalFunctionLib.sendText(24,73,"Y");
		FunctionalLibrary.pressEnter();
		
	}
}
