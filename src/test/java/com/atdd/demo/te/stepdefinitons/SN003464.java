package com.atdd.demo.te.stepdefinitons;

import com.cucumber.listener.Reporter;
import com.optumrx.autofusion.core.te.util.Mainframe_GlobalFunctionLib;
import com.optumrx.autofusion.core.te.util.Screenshot;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SN003464 {
	
	@Then("^Validating the Communication Preferred Method and read only field Communication Digital Address in member screen with \"([^\"]*)\"$")
	public void validating_the_Communication_Preferred_Method_and_read_only_field_Communication_Digital_Address_in_member_screen_with(String memid) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.sendText(4, 4, memid);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(10, 2, "5");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F8");
		Mainframe_GlobalFunctionLib.sendText(4, 20, "10");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(4, 20, "5");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		String actualtext_1 = Mainframe_GlobalFunctionLib.getText(15, 2);
		String actualtext_2 = Mainframe_GlobalFunctionLib.getText(16, 2);
		String actualtext_3 = Mainframe_GlobalFunctionLib.getText(17, 2);
		if(actualtext_1.equals("Communication:") & actualtext_2.equals("Preferred Method") & actualtext_3.equals("Digital Address"))
		{
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());

		}
		else
		{
			System.out.println("Validation not successful");
		}
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.sendText(21, 7, "20");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		
	}

	@When("^I enter command \"([^\"]*)\" to Work with Database File with \"([^\"]*)\",\"([^\"]*)\"$")
	public void i_enter_command_to_Work_with_Database_File_with(String InputfileCmd, String filename, String libraryname) throws Throwable {
		Mainframe_GlobalFunctionLib.sendText(21, 7,InputfileCmd);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(5, 37,filename);
		Mainframe_GlobalFunctionLib.sendText(6, 39,libraryname);
	}
	
@Then("^loading the job with \"([^\"]*)\",\"([^\"]*)\"$")
public void loading_the_job_with(String filename, String libraryname) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	Mainframe_GlobalFunctionLib.sendText(7, 41,filename);
	Mainframe_GlobalFunctionLib.sendText(8, 41,libraryname);
	
	Mainframe_GlobalFunctionLib.pressKey("F6");
	Mainframe_GlobalFunctionLib.sendText(21, 7,"WS");
	Mainframe_GlobalFunctionLib.pressKey("Enter");
	Mainframe_GlobalFunctionLib.sendText(11, 3, "5");
	Mainframe_GlobalFunctionLib.pressKey("Enter");
	Mainframe_GlobalFunctionLib.sendText(21, 7, "4");
	Mainframe_GlobalFunctionLib.pressKey("Enter");
	Mainframe_GlobalFunctionLib.sendText(11, 3, "5");
	Mainframe_GlobalFunctionLib.pressKey("Enter");
	
	
}

@Then("^I Work with Job Spooled Files$")
public void i_Work_with_Job_Spooled_Files() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
}
@Then("^validating email id updated with \"([^\"]*)\"$")
public void validating_email_id_updated_with(String Member) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	
	Mainframe_GlobalFunctionLib.sendText(4, 4,Member);
	Mainframe_GlobalFunctionLib.pressKey("Enter");
	Mainframe_GlobalFunctionLib.sendText(10, 2,"5");
	Mainframe_GlobalFunctionLib.pressKey("Enter");
	Mainframe_GlobalFunctionLib.pressKey("F8");
	Mainframe_GlobalFunctionLib.sendText(4, 20,"10");
	Mainframe_GlobalFunctionLib.pressKey("Enter");
	Mainframe_GlobalFunctionLib.sendText(4, 20,"5");
	Mainframe_GlobalFunctionLib.pressKey("Enter");
	String emailAddr=Mainframe_GlobalFunctionLib.getText(17, 20);
	System.out.println("Email address is: "+emailAddr);
	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	Mainframe_GlobalFunctionLib.pressKey("F3");
	Mainframe_GlobalFunctionLib.pressKey("F3");
	Mainframe_GlobalFunctionLib.pressKey("F3");
	Mainframe_GlobalFunctionLib.pressKey("F3");
	Mainframe_GlobalFunctionLib.pressKey("F3");
	Mainframe_GlobalFunctionLib.pressKey("F3");
	
}	

@Then("^I enter query \"([^\"]*)\"$")
public void i_enter_query(String DBU_Query) throws Throwable {
	Mainframe_GlobalFunctionLib.sendText(21, 7,DBU_Query);
	Mainframe_GlobalFunctionLib.pressKey("Enter");
}
    
	
}
