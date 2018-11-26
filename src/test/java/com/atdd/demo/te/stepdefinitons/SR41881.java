package com.atdd.demo.te.stepdefinitons;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.testng.Assert;

import com.atdd.te.screenHelpers.FunctionalLibrary;
import com.cucumber.listener.Reporter;
import com.optumrx.autofusion.core.te.util.Mainframe_GlobalFunctionLib;
import com.optumrx.autofusion.core.te.util.Screenshot;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class SR41881 {
	String ActJob;
	static int a;
	
	@When("^I enter the command \"([^\"]*)\" in command line$")
	public void i_enter_the_command_in_command_line(String Command) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		Mainframe_GlobalFunctionLib.sendText(21,7,Command);
		
		Thread.sleep(3000);
	}

	@Then("^I Validate the job \"([^\"]*)\" in 'Work with Subsystem Jobs' screen as ACTIVE status \"([^\"]*)\"$")
	public void i_Validate_the_job_in_Work_with_Subsystem_Jobs_screen_as_ACTIVE_status(String Job, String Status) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		//a=0;
	label1:	for (int j = 11; j < 40; ++j) {
			Mainframe_GlobalFunctionLib.pressKey("PageDown");
			 for (int i = 11; i < 19; ++i) {
			String ActJob= Mainframe_GlobalFunctionLib.getText(i, 7);
				
				if(ActJob.equals(Job))
					{
						System.out.println("Job is found: "+ActJob);
						String ActStatus = Mainframe_GlobalFunctionLib.getText(i, 40);
							if(ActStatus.equals(Status)) 
							{
								System.out.println("Job is status is correct: "+ActStatus);
								//a=1;
								break label1;
								
							}
							else
							{
								System.out.println("Job is status is incorrect: "+ActStatus);	
							}
								
					}
				else
				{
				System.out.println("Relevent job not found : "+ActJob);
				}
			
					
			}
		//if(a==1)
			//break;
			
	}
	FunctionalLibrary.navigateToRxClaimPlanAdministrator();
	}
	
	@Given("^I am on Work with Subsystem Jobs screen$")
	public void i_am_on_Work_with_Subsystem_Jobs_screen() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.validateText("1", "29", "Work with Subsystem Jobs");
	
	}
	@When("^I delete the work object \"([^\"]*)\"$")
	public void i_delete_the_work_object(String Workobj) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		Mainframe_GlobalFunctionLib.validateText("1", "29", Workobj);
		Mainframe_GlobalFunctionLib.sendText(8, 2,"4");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F5");
		
		
	}
	
	@Then("^Exit the screen$")
	public void exit_the_screen() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F3");
	}

}
