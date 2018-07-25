package com.atdd.demo.te.stepdefinitons;

import org.testng.Assert;

import com.cucumber.listener.Reporter;
import com.optumrx.autofusion.core.te.util.Mainframe_GlobalFunctionLib;
import com.optumrx.autofusion.core.te.util.Screenshot;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SN003562_SR41760 {

	
	@When("^I enter query$")
	public void i_enter_query() throws Throwable {
	   	String query="CALL PGM(RCPLN711) PARM('')";
		Mainframe_GlobalFunctionLib.sendText(21, 7, query);
		Mainframe_GlobalFunctionLib.pressKey("enter");
	}	 
	
	@When("^I enter query in command line for program RCPLN(\\d+)$")
	public void i_enter_query_in_command_line_for_program_RCPLN(int arg1) throws Throwable {
	    String query="CALL PGM(RCPME711) PARM('')";
		Mainframe_GlobalFunctionLib.sendText(21, 7, query);
		Mainframe_GlobalFunctionLib.pressKey("enter");
	}
	
	
	@When("^I enter \"([^\"]*)\", \"([^\"]*)\" on RCPLN(\\d+) screen$")
	public void i_enter_on_RCPLN_screen(String Flag, String DynamicPA, int arg3) throws Throwable {
		 Mainframe_GlobalFunctionLib.sendText(6, 53, Flag);
		 Mainframe_GlobalFunctionLib.sendText(6, 54, DynamicPA);
		 Mainframe_GlobalFunctionLib.pressKey("enter");
		 Thread.sleep(3000);
		 Mainframe_GlobalFunctionLib.sendText(16, 64, "Y");
		 Thread.sleep(3000);
		// Mainframe_GlobalFunctionLib.pressKey("enter");
	}
	
	@When("^I enter run mode \"([^\"]*)\" on RCPME(\\d+) screen$")
	public void i_enter_run_mode_on_RCPME_screen(String RunMode, int arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.sendText(6, 53, RunMode);
		Mainframe_GlobalFunctionLib.pressKey("enter");
		Thread.sleep(3000);
		Mainframe_GlobalFunctionLib.sendText(16, 64, "Y");
		Mainframe_GlobalFunctionLib.pressKey("enter");
	}
	
	@When("^I verify error message in Display Responses window$")
	public void i_verify_error_message_in_Display_Responses_window() throws Throwable {
			try
			{
				String displayWindow= Mainframe_GlobalFunctionLib.getText(11, 31);
				if(displayWindow.equals("Display Responses"))
				{
					String indicatorMessage= Mainframe_GlobalFunctionLib.getText(12, 8);
					System.out.println("Indicator displayed as::"+indicatorMessage);
					if(indicatorMessage.equals("E"))
					{
					 int i;
					 for(i=13;i<=18;i++)
					 {
						 String errorMessage= Mainframe_GlobalFunctionLib.getText(i, 6);
						 System.out.println("Error message displayed as::"+errorMessage);
						 Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
					 }
					}
					 else
					 {
						 System.out.println(" Able to get display responses window with blank error and response message.");
					 }
				}
			}catch(Exception e)
				{	
					Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
					Assert.fail("We could not reach to Display Responses screen.Screenshot captured");
					
				}
		}
	
			 
	@When("^I press \"([^\"]*)\" key to navigate back to RxClaim PlanAdministrator Menu$")
	public void i_press_key_to_navigate_back_to_RxClaim_PlanAdministrator_Menu(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F3");
	}
	

	@When("^I navigate to \"([^\"]*)\" Plan Details Page$")
	public void i_navigate_to_Plan_Details_Page(String PlanCode) throws Throwable {
		Mainframe_GlobalFunctionLib.sendText(21, 7, "4");
		 Mainframe_GlobalFunctionLib.pressKey("enter");
		 Mainframe_GlobalFunctionLib.sendText(21, 7, "1");
		 Mainframe_GlobalFunctionLib.pressKey("enter");
		 Mainframe_GlobalFunctionLib.sendText(4, 5, PlanCode);
		 Mainframe_GlobalFunctionLib.pressKey("enter");
		 Mainframe_GlobalFunctionLib.sendText(11, 2, "5");
		 Mainframe_GlobalFunctionLib.pressKey("enter");
	}
	
	//TC001
	@Then("^I verify Change Plan edit for Member Eligibility \"([^\"]*)\" when update flag set to N and Member Eligibility set to D$")
	public void i_verify_Change_Plan_edit_for_Member_Eligibility_when_update_flag_set_to_N_and_Member_Eligibility_set_to_D(String MemberEligibility) throws Throwable {
		 String ReturnMemberEligibilityFlag= Mainframe_GlobalFunctionLib.getText(7, 24);
		 if(ReturnMemberEligibilityFlag.equals(MemberEligibility))
		 {
			 System.out.println("Member Eliglibility flag not been updated in Plan details screen ie 'RCPLN013I'");
			 System.out.println("Member Eliglibility flag in Plan detail screen ie 'RCPLN013I':: "+ReturnMemberEligibilityFlag);
		 }
		 else
		 {
			 System.out.println("Member Eliglibility flag has been updated in Plan details screen ie 'RCPLN013I'::"+ReturnMemberEligibilityFlag);
		 }
			Mainframe_GlobalFunctionLib.pressKey("F3");
			Mainframe_GlobalFunctionLib.pressKey("F3");
			Mainframe_GlobalFunctionLib.pressKey("F3");
	}

	//TC002
	@Then("^I verify Change Plan edit for Member Eligibility \"([^\"]*)\" when update flag set to Y and Member Eligibility set to D$")
	public void i_verify_Change_Plan_edit_for_Member_Eligibility_when_update_flag_set_to_Y_and_Member_Eligibility_set_to_D(String DynamicPA) throws Throwable {
		String ReturnMemberEligibilityFlag= Mainframe_GlobalFunctionLib.getText(7, 24);
		 if(ReturnMemberEligibilityFlag.equals(DynamicPA))
		 {
			 System.out.println("Member Eliglibility flag has been updated in Plan details screen ie 'RCPLN013I'");
			 System.out.println("Member Eliglibility flag in Plan detail screen ie 'RCPLN013I'::"+ReturnMemberEligibilityFlag);
		 }
		 else
		 {
			 System.out.println("Member Eliglibility flag in Plan details screen ie 'RCPLN013I'::"+ReturnMemberEligibilityFlag);
		 }
			Mainframe_GlobalFunctionLib.pressKey("F3");
			Mainframe_GlobalFunctionLib.pressKey("F3");
			Mainframe_GlobalFunctionLib.pressKey("F3");
	}
	
	//TC003
	@Then("^I verify Change Plan edit for Member Eligibility \"([^\"]*)\" when update flag set to N and Member Eligibility set to N$")
	public void i_verify_Change_Plan_edit_for_Member_Eligibility_when_update_flag_set_to_N_and_Member_Eligibility_set_to_N(String DynamicPA) throws Throwable {
		String ReturnMemberEligibilityFlag= Mainframe_GlobalFunctionLib.getText(7, 24);
		 if(ReturnMemberEligibilityFlag.equals(DynamicPA))
		 {
			 System.out.println("Member Eliglibility flag has been updated in Plan details screen ie 'RCPLN013I'");
			 System.out.println("Member Eliglibility flag in Plan detail screen ie 'RCPLN013I'::"+ReturnMemberEligibilityFlag);
		 }
		 else
		 {
			 System.out.println("Member Eliglibility flag in Plan details screen ie 'RCPLN013I'::"+ReturnMemberEligibilityFlag);
		 }
			Mainframe_GlobalFunctionLib.pressKey("F3");
			Mainframe_GlobalFunctionLib.pressKey("F3");
			Mainframe_GlobalFunctionLib.pressKey("F3");
	}
	
	//TC004
	@Then("^I verify Change Plan edit for Member Eligibility \"([^\"]*)\" when update flag set to Y and Member Eligibility set to N$")
	public void i_verify_Change_Plan_edit_for_Member_Eligibility_when_update_flag_set_to_Y_and_Member_Eligibility_set_to_N(String DynamicPA) throws Throwable {
		String ReturnMemberEligibilityFlag= Mainframe_GlobalFunctionLib.getText(7, 24);
		 if(ReturnMemberEligibilityFlag.equals(DynamicPA))
		 {
			 System.out.println("Member Eliglibility flag has been updated in Plan details screen ie 'RCPLN013I'");
			 System.out.println("Member Eliglibility flag in Plan detail screen ie 'RCPLN013I'::"+ReturnMemberEligibilityFlag);
		 }
		 else
		 {
			 System.out.println("Member Eliglibility flag in Plan details screen ie 'RCPLN013I'::"+ReturnMemberEligibilityFlag);
		 }
			Mainframe_GlobalFunctionLib.pressKey("F3");
			Mainframe_GlobalFunctionLib.pressKey("F3");
			Mainframe_GlobalFunctionLib.pressKey("F3");
		}
	
	//TC005
	@Then("^I verify Change Plan edit for Member Eligibility \"([^\"]*)\" when update flag set to N and Member Eligibility set to P$")
	public void i_verify_Change_Plan_edit_for_Member_Eligibility_when_update_flag_set_to_N_and_Member_Eligibility_set_to_P(String DynamicPA) throws Throwable {
		String ReturnMemberEligibilityFlag= Mainframe_GlobalFunctionLib.getText(7, 24);
		 if(!(ReturnMemberEligibilityFlag.equals(DynamicPA)))
		 {
			 System.out.println("Member Eliglibility flag has not been updated in Plan details screen ie 'RCPLN013I'");
			 System.out.println("Member Eliglibility flag in Plan detail screen ie 'RCPLN013I'::"+ReturnMemberEligibilityFlag);
		 }
		 else
		 {
			 System.out.println("Member Eliglibility flag has been updated in Plan details screen ie 'RCPLN013I'::"+ReturnMemberEligibilityFlag);
		 }
			Mainframe_GlobalFunctionLib.pressKey("F3");
			Mainframe_GlobalFunctionLib.pressKey("F3");
			Mainframe_GlobalFunctionLib.pressKey("F3");
		}
	
	//TC006
	@Then("^I verify Change Plan edit for Member Eligibility \"([^\"]*)\" when update flag set to Y and Member Eligibility set to P$")
	public void i_verify_Change_Plan_edit_for_Member_Eligibility_when_update_flag_set_to_Y_and_Member_Eligibility_set_to_P(String DynamicPA) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String ReturnMemberEligibilityFlag= Mainframe_GlobalFunctionLib.getText(7, 24);
		 if(ReturnMemberEligibilityFlag.equals(DynamicPA))
		 {
			 System.out.println("Member Eliglibility flag has been updated in Plan details screen ie 'RCPLN013I'");
			 System.out.println("Member Eliglibility flag in Plan detail screen ie 'RCPLN013I'::"+ReturnMemberEligibilityFlag);
		 }
		 else
		 {
			 System.out.println("Member Eliglibility flag has not been updated in Plan details screen ie 'RCPLN013I'::"+ReturnMemberEligibilityFlag);
		 }
			Mainframe_GlobalFunctionLib.pressKey("F3");
			Mainframe_GlobalFunctionLib.pressKey("F3");
			Mainframe_GlobalFunctionLib.pressKey("F3");
	}
	
	//TC007
	@Then("^I verify Change Plan edit for Member Eligibility \"([^\"]*)\" when update flag set to N and Member Eligibility set to Y$")
	public void i_verify_Change_Plan_edit_for_Member_Eligibility_when_update_flag_set_to_N_and_Member_Eligibility_set_to_Y(String DynamicPA) throws Throwable {
		String ReturnMemberEligibilityFlag= Mainframe_GlobalFunctionLib.getText(7, 24);
		 if(ReturnMemberEligibilityFlag.equals(DynamicPA))
		 {
			 System.out.println("Member Eliglibility flag has not been updated in Plan details screen ie 'RCPLN013I'");
			 System.out.println("Member Eliglibility flag in Plan detail screen ie 'RCPLN013I'::"+ReturnMemberEligibilityFlag);
		 }
		 else
		 {
			 System.out.println("Member Eliglibility flag has been updated in Plan details screen ie 'RCPLN013I'::"+ReturnMemberEligibilityFlag);
		 }
			Mainframe_GlobalFunctionLib.pressKey("F3");
			Mainframe_GlobalFunctionLib.pressKey("F3");
			Mainframe_GlobalFunctionLib.pressKey("F3");
	}
	
	
	@Then("^I verify Change Plan edit for Member Eligibility \"([^\"]*)\" when update flag set to y and Member Eligibility set to Y$")
	public void i_verify_Change_Plan_edit_for_Member_Eligibility_when_update_flag_set_to_y_and_Member_Eligibility_set_to_Y(String DynamicPA) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String ReturnMemberEligibilityFlag= Mainframe_GlobalFunctionLib.getText(7, 24);
		 if(ReturnMemberEligibilityFlag.equals(DynamicPA))
		 {
			 System.out.println("Member Eliglibility flag has been updated in Plan details screen ie 'RCPLN013I'");
			 System.out.println("Member Eliglibility flag in Plan detail screen ie 'RCPLN013I'::"+ReturnMemberEligibilityFlag);
		 }
		 else
		 {
			 System.out.println("Member Eliglibility flag has not been updated in Plan details screen ie 'RCPLN013I'::"+ReturnMemberEligibilityFlag);
		 }
			Mainframe_GlobalFunctionLib.pressKey("F3");
			Mainframe_GlobalFunctionLib.pressKey("F3");
			Mainframe_GlobalFunctionLib.pressKey("F3");
	}
	
	}



