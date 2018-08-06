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
	
	@When("^I enter \"([^\"]*)\", \"([^\"]*)\" on Plan Details Screen$")
	public void i_enter_on_Plan_Details_Screen(String PlanCode, String FromDate) throws Throwable {
	    Mainframe_GlobalFunctionLib.sendText(4, 13, PlanCode);
	    Mainframe_GlobalFunctionLib.sendText(5, 13, FromDate);
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
	}
	public String PACarrierListMain =null;
	@When("^I enter \"([^\"]*)\" and check PACarrierList in RCPME(\\d+) screen$")
	public void i_enter_and_check_PACarrierList_in_RCPME_screen(String PriorAuth, int arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 Mainframe_GlobalFunctionLib.sendText(11, 79, PriorAuth);
		 PACarrierListMain=Mainframe_GlobalFunctionLib.getText(20, 30);
		 Mainframe_GlobalFunctionLib.pressKey("enter");
		 Thread.sleep(3000);
	}
	
	@When("^I enter run mode \"([^\"]*)\" on RCPME(\\d+) screen$")
	public void i_enter_run_mode_on_RCPME_screen(String RunMode, int arg2) throws Throwable {
	   	Mainframe_GlobalFunctionLib.sendText(4, 69, RunMode);
		Mainframe_GlobalFunctionLib.pressKey("enter");
		Thread.sleep(3000);
		Mainframe_GlobalFunctionLib.sendText(16, 64, "Y");
		Thread.sleep(3000);
	}
		
	@When("^I enter run mode \"([^\"]*)\", value at \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", PACarrierList \"([^\"]*)\" at Position(\\d+) on RCPME(\\d+) screen$")
	public void i_enter_run_mode_value_at_PACarrierList_at_Position_on_RCPME_screen(String RunMode,String Position20, String Position21, String Position354, String PACarrierList, int arg5, int arg6) throws Throwable {
		Mainframe_GlobalFunctionLib.sendText(4, 69, RunMode);
		Mainframe_GlobalFunctionLib.sendText(6, 21, Position20);
		Mainframe_GlobalFunctionLib.sendText(6, 22, Position21);
		Mainframe_GlobalFunctionLib.sendText(14, 55, Position354);
		Mainframe_GlobalFunctionLib.sendText(14, 56, PACarrierList);
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("enter");
		Mainframe_GlobalFunctionLib.sendText(16, 64, "Y");
	}
	
	
	@When("^I verify error message in Display Responses window$")
	public void i_verify_error_message_in_Display_Responses_window() throws Throwable {
			try
			{
				String displayWindow= Mainframe_GlobalFunctionLib.getText(11, 31);
				if(displayWindow.equals("Display Responses"))
				{
					String indicatorMessage= Mainframe_GlobalFunctionLib.getText(12, 8);
					System.out.println("Responses Indicator displayed as::"+indicatorMessage);
					if(indicatorMessage.equals("E"))
					{
					 int i;
					 for(i=13;i<=18;i++)
					 {
						 String errorMessage= Mainframe_GlobalFunctionLib.getText(i, 6);
						 /*int errorLength=errorMessage.length();
						 System.out.println("The length is ::"+errorLength);*/
						 if(errorMessage.length()>0)
						 {
							 System.out.println("Error message displayed as::"+errorMessage);
							 Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
						 }
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
	
	//TC008
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

	
	//TC009
	
	@Then("^verify Member Eligibility Detail in Plan detail \"([^\"]*)\" display mode i\\.e\\. RCPME(\\d+)I screen$")
	public void verify_Member_Eligibility_Detail_in_Plan_detail_display_mode_i_e_RCPME_I_screen(String PlanCode, int arg2) throws Throwable {
		Thread.sleep(3000);
		Mainframe_GlobalFunctionLib.pressKey("F7");
		Mainframe_GlobalFunctionLib.sendText(7, 21, "2");
		Mainframe_GlobalFunctionLib.pressKey("enter");
		String expectedErrorMsg="PME Plan Member Elig not found.";
		
		try
		{
			String actualErrorMsg=Mainframe_GlobalFunctionLib.getText(24, 2);
			if(expectedErrorMsg.equals(actualErrorMsg))
			{
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				System.out.println("Member Eligibilty Record got deleted and message displayed on screen as: "+actualErrorMsg);
			}
			
		}catch(Exception e)
		{	
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			System.out.println("We could not reach to Member Eligibilty Record screen.Screenshot captured");
		}
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F3");
	}
	
	//TC011
	@When("^I verify Prior Aut \"([^\"]*)\" & PA Carrier LIst \"([^\"]*)\" flag value in Member Eligibility Details Page in Plan ie RCPME(\\d+)I screen$")
	public void i_verify_Prior_Aut_PA_Carrier_LIst_flag_value_in_Member_Eligibility_Details_Page_in_Plan_ie_RCPME_I_screen(String PriorAuth, String PACarrierList, int arg3) throws Throwable {
	    Mainframe_GlobalFunctionLib.pressKey("F7");
		Mainframe_GlobalFunctionLib.sendText(7, 21, "2");
		Mainframe_GlobalFunctionLib.pressKey("enter");
		String valuePAAuth=Mainframe_GlobalFunctionLib.getText(11, 79);
		String valuePACarrierList=Mainframe_GlobalFunctionLib.getText(20, 30);
		if(valuePAAuth.equals(PriorAuth))
		{
			System.out.println("Prior Auth not been updated in Plan and the value is : "+valuePAAuth);
		}
		else
		{
			System.out.println("Prior Auth has been updated in Plan and the value is : "+valuePAAuth);
		}
		
		if(valuePACarrierList.length()>0)
		{
			if(valuePACarrierList.equals(PACarrierListMain))
			{
				System.out.println("PA Carrier List not been updated in Plan and the value is : "+valuePACarrierList);
			}
			else
			{
				System.out.println("PA Carrier List has been updated in Plan and the value is : "+valuePACarrierList);
			}
		}
		else
			{
				System.out.println("PA Carrier List not found");
			}
		
		}
	
	@When("^I verify Member Eligibility Detail in Plan \"([^\"]*)\" ie RCPME(\\d+)I screen\\.$")
	public void i_verify_Member_Eligibility_Detail_in_Plan_ie_RCPME_I_screen(String PlanCode, int arg2) throws Throwable {
		Thread.sleep(3000);
		Mainframe_GlobalFunctionLib.pressKey("F7");
		Mainframe_GlobalFunctionLib.sendText(7, 21, "2");
		Mainframe_GlobalFunctionLib.pressKey("enter");
		String expectedErrorMsg="PME Plan Member Elig not found.";
		try
		{
			String actualErrorMsg=Mainframe_GlobalFunctionLib.getText(24, 2);
			if(expectedErrorMsg.equals(actualErrorMsg))
			{
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				System.out.println("Member Eligibilty Record not found and message displayed on screen as: "+actualErrorMsg);
			}
			else
			{
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				System.out.println("Member Eligibilty Record found");
			}
			
		}catch(Exception e)
		{	
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			System.out.println("We could not reach to Member Eligibilty Record screen.Screenshot captured");
		}
	    
	}
	
}


	
	



