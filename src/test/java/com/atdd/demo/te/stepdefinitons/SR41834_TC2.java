package com.atdd.demo.te.stepdefinitons;

import com.optumrx.autofusion.core.te.util.Mainframe_GlobalFunctionLib;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SR41834_TC2 {
	
	@When("^I enter fromDate \"([^\"]*)\", thruDate \"([^\"]*)\", carrierFrom \"([^\"]*)\", carrierThru \"([^\"]*)\", fileFormat \"([^\"]*)\", libraryName \"([^\"]*)\"$")
	public void i_enter_fromDate_thruDate_carrierFrom_carrierThru_fileFormat_libraryName(String FromDate, String ThruDate, String Carrierfrom, String Carrierthru, String fileFormat, String libraryName) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.sendText(05, 21, FromDate);
		Mainframe_GlobalFunctionLib.sendText(05, 39, ThruDate);
		Mainframe_GlobalFunctionLib.sendText(06, 21, Carrierfrom);
		Mainframe_GlobalFunctionLib.sendText(06, 39, Carrierthru);
		Mainframe_GlobalFunctionLib.sendText(11, 21, fileFormat);
		Mainframe_GlobalFunctionLib.sendText(16, 21, libraryName);
	}


    @Then("^I verify the message when file name is not entered$")
    public void i_verify_the_message_when_file_name_is_not_entered() throws Throwable {
   // Write code here that turns the phrase above into concrete actions
    	String expectedmsg="File Name is required.";
    	String actmsg=Mainframe_GlobalFunctionLib.getText(24, 02);
    	if(expectedmsg.equals(actmsg))
    	{
    		System.out.println("The error message displayed as:"+actmsg);
    	}
    	else
    	{
    		System.out.println("The error message not displayed");
    	}
    		
    }
}

