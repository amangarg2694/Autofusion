package com.atdd.demo.te.stepdefinitons;

import com.optumrx.autofusion.core.te.util.Mainframe_GlobalFunctionLib;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UpdateBatchClaimLoadOverrideSubmissionDays {
	public String cmdToCallPgm= "CALL   PGM(RX12215C1) PARM('20180604' '20180604' '0000001' '0009999' 'RX12215PF2' 'CUSTLIB' 'RX12215PFR' 'CUSTLIB' '19970101' 'N' 'INPQ')";
	public String cmdToCallPgm1= "CALL   PGM(RX12215C1) PARM('20180604' '20180604' '0000001' '0009999' 'RX12      215PF2' 'CUSTLIB' 'RX12215PFR' 'CUSTLIB' '19970101' 'N' 'INPQ')";
	public String cmdToCallPgmLib= "CALL   PGM(IRIPRDOBJ/RX12215C1) PARM('20180604' '20180604' '0000001' '0009999' 'RX12215PF2' 'CUSTLIB' 'RX12215PFR' 'CUSTLIB' '19970101' 'N' 'INPQ')";
	public String cmdToCallPgmLib1= "CALL   PGM(IRIPRDOBJ/RX12215C1) PARM('20180604' '20180604' '0000001' '000      9999' 'RX12215PF2' 'CUSTLIB' 'RX12215PFR' 'CUSTLIB' '19970101' 'N' 'INPQ')";
	
	@When("^I call program from command line$")
	public void i_call_program_from_command_line() throws Throwable {
	   	String callQuery= "CALL";
	    Mainframe_GlobalFunctionLib.sendText(21,7, callQuery);
	    Mainframe_GlobalFunctionLib.pressKey("enter");
	}

	@When("^I enter \"([^\"]*)\",\"([^\"]*)\" names for program RX(\\d+)C(\\d+)$")
	public void i_enter_names_for_program_RX_C(String Object, String Library, int arg3, int arg4) throws Throwable {
	    Mainframe_GlobalFunctionLib.sendText(5, 37, Object);
	    Mainframe_GlobalFunctionLib.sendText(6, 39, Library);
	    Mainframe_GlobalFunctionLib.pressKey("enter");
	}
	
	@Then("^I verify application error in CCT(\\d+) screen$")
	public void i_verify_application_error_in_CCT_screen(int arg1) throws Throwable {
	    String applErrorMsg="Application error.  MCH3601 unmonitored by RX12215C1 at statement 0000015200";
	    String actualErrorMsg=Mainframe_GlobalFunctionLib.getText(24, 2);
	    if(applErrorMsg.equals(actualErrorMsg))
	    {
	    	System.out.println("Application Error message show as: "+actualErrorMsg);
	    }
	    else
	    {
	    	System.out.println("Application Error message not shown");
	    }
	}
	
	@When("^I enter command to call program RX(\\d+)C(\\d+)$")
	public void i_enter_command_to_call_program_RX_C(int arg1, int arg2) throws Throwable {
	     //String cmdToCallLib= "CALL   PGM(RX12215C1) PARM('20180604' '20180604' '0000001' '0009999' 'RX12215PF2' 'CUSTLIB' 'RX12215PFR' 'CUSTLIB' '19970101' 'N' 'INPQ')";
	     Mainframe_GlobalFunctionLib.sendText(18, 7, cmdToCallPgm);
	     Mainframe_GlobalFunctionLib.pressKey("enter");
	}
	
	@When("^I enter command to call program RX(\\d+)C(\\d+) with library$")
	public void i_enter_command_to_call_program_RX_C_with_library(int arg1, int arg2) throws Throwable {
	    //CALL   PGM(IRIPRDOBJ/RX12215C1) PARM('20180604' '20180604' '0000001' '0009999' 'RX12215PF2' 'CUSTLIB' 'RX12215PFR' 'CUSTLIB' '19970101' 'N' 'INPQ')
		Mainframe_GlobalFunctionLib.sendText(18, 7, cmdToCallPgmLib);
	     Mainframe_GlobalFunctionLib.pressKey("enter");
	}
	
	@When("^I go to display job screen$")
	public void i_go_to_display_job_screen() throws Throwable {
		String dspjobQuery="dspjob";
		Mainframe_GlobalFunctionLib.sendText(18, 7, dspjobQuery);
		Mainframe_GlobalFunctionLib.pressKey("enter");
		Mainframe_GlobalFunctionLib.sendText(21, 7, "10");
		Mainframe_GlobalFunctionLib.pressKey("enter");
	}
	
	@When("^I verify call log for program RX(\\d+)C(\\d+)$")
	public void i_verify_call_log_for_program_RX_C(int arg1, int arg2) throws Throwable {
		String actualLog=Mainframe_GlobalFunctionLib.getText(5, 2);
		System.out.println("Logs are: "+actualLog);
		if(actualLog.contains(cmdToCallPgm1))
		{
			System.out.println("Call log for program RX12215C show");
		}
		else
		{
			System.out.println("Call log for program RX12215C not show");
		}
	  
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F3");
	}
	
	
	@When("^I verify call log for program RX(\\d+)C(\\d+) with library$")
	public void i_verify_call_log_for_program_RX_C_with_library(int arg1, int arg2) throws Throwable {
		String actualLog=Mainframe_GlobalFunctionLib.getText(5, 2);
		System.out.println("Logs are: "+actualLog);
		if(actualLog.contains(cmdToCallPgmLib1))
		{
			System.out.println("Call log for program RX12215C with Library show");
		}
		else
		{
			System.out.println("Call log for program RX12215C with Library not show");
		}
	  
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F3");
	}

	
	@When("^I verify \"([^\"]*)\", \"([^\"]*)\" in work with Object screen$")
	public void i_verify_in_work_with_Object_screen(String Object, String Library) throws Throwable {
	  
	    String wrokJobQuery="wrkobj";
	    Mainframe_GlobalFunctionLib.sendText(21, 7, wrokJobQuery);
	    Mainframe_GlobalFunctionLib.pressKey("enter");
	    Mainframe_GlobalFunctionLib.sendText(5, 37, Object);
	    Mainframe_GlobalFunctionLib.sendText(6, 39, Library);
	    Mainframe_GlobalFunctionLib.pressKey("enter");
	    String actualObject=Mainframe_GlobalFunctionLib.getText(8, 7);
	    System.out.println("Object shown in Work with Object screen as :"+actualObject);
	    String actualLibrary=Mainframe_GlobalFunctionLib.getText(8, 29);
	    System.out.println("Library shown in Work with Object screen as :"+actualLibrary);
	    if(Object.equals(actualObject))
		    {
		    	System.out.println("Expected Object shown in Work with Object screen as: "+actualObject);
			}
			else
			{
				System.out.println("Expected Object not shown in Work with Object screen, shown as: "+actualObject);
			}
	    
	    if(Library.equals(actualLibrary))
		    {
		    	System.out.println("Expected Library shown in Work with Object screen as: "+actualLibrary);
			}
			else
			{
				System.out.println("Expected Library not shown in Work with Object screen, shown as: "+actualLibrary);
			}
	    Mainframe_GlobalFunctionLib.pressKey("F3");
	    }
	    
	}

	

