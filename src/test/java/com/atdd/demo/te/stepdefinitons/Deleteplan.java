package com.atdd.demo.te.stepdefinitons;

import com.atdd.te.screenHelpers.FunctionalLibrary;
import com.optumrx.autofusion.core.te.util.Mainframe_GlobalFunctionLib;

import cucumber.api.java.en.When;

public class Deleteplan {
	
	@When("^I navigate to the plans \"([^\"]*)\" to copy to new plan \"([^\"]*)\"$")
	public void i_navigate_to_the_plans_to_copy_to_new_plan(String arg1, String arg2) throws Throwable {
	  FunctionalLibrary.enterText(4, 5, arg1);
	  FunctionalLibrary.pressEnter();
	  FunctionalLibrary.enterText(11, 2, "3");
	  FunctionalLibrary.pressEnter();
	  FunctionalLibrary.enterText(11, 25, arg2);
	  FunctionalLibrary.enterText(12, 25, "010101");
	  FunctionalLibrary.enterText(13, 25, "Test");
	  FunctionalLibrary.enterText(14, 25, "A");
	  FunctionalLibrary.pressEnter();
	  	  
	}
	@When("^I navigate to Network Pricing Detail for All Origin/Reimb screen$")
	public void i_navigate_to_Network_Pricing_Detail_for_All_Origin_Reimb_screen() throws Throwable {
		FunctionalLibrary.pressKey("F7"); 
		FunctionalLibrary.enterText(7, 21, "4");
		FunctionalLibrary.pressEnter();
		FunctionalLibrary.enterText(12, 2, "6");
		FunctionalLibrary.pressEnter();
		FunctionalLibrary.enterText(20, 13, "1");
		FunctionalLibrary.pressEnter();
		FunctionalLibrary.enterText(13, 2, "2");
		FunctionalLibrary.pressEnter();
		
	}

/*	@When("^I enter \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"values$")
		public void i_enter_values(String qual, String seq, String plan1) throws Throwable {
		FunctionalLibrary.enterText(10, 12, plan1);
	    FunctionalLibrary.enterText(21, 17, "1");
	    FunctionalLibrary.enterText(21, 37, "500");
		FunctionalLibrary.pressEnter();
	}*/
	
	@When("^I navigate to Delete Plan screen \"([^\"]*)\"$")
	public void i_navigate_to_Delete_Plan_screen(String plan2) throws Throwable {
		FunctionalLibrary.enterText(21, 7, "9");
		FunctionalLibrary.pressEnter();
		FunctionalLibrary.enterText(21, 7, "3");
		FunctionalLibrary.pressEnter();
		FunctionalLibrary.enterText(21, 7, "1");
		FunctionalLibrary.pressEnter();
		FunctionalLibrary.enterText(21, 7, "1");
		FunctionalLibrary.pressEnter();
		FunctionalLibrary.enterText(4, 5, plan2);
		FunctionalLibrary.pressEnter();
		FunctionalLibrary.enterText(10, 2, "4");
		FunctionalLibrary.pressEnter();
		FunctionalLibrary.enterText(16, 64, "Y");
		FunctionalLibrary.pressEnter();	
		
		
	}
	
	@When("^I enter \"([^\"]*)\",\"([^\"]*)\"values$")
	public void i_enter_values(String arg1, String plan2) throws Throwable {
		FunctionalLibrary.enterText(10, 12, plan2);
	    FunctionalLibrary.enterText(21, 17, "1");
	   
		FunctionalLibrary.pressEnter();
	}
	
	@When("^I enter \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"values$")
	public void i_enter_values(String qual, String SN, String Plan1) throws Throwable {
		FunctionalLibrary.enterText(10, 12, Plan1);
	    FunctionalLibrary.enterText(21, 17, "1");
	    Mainframe_GlobalFunctionLib.click(21, 23);
	    FunctionalLibrary.pressKey("F4");
	    FunctionalLibrary.enterText(4, 5, SN);
		FunctionalLibrary.pressEnter();
		FunctionalLibrary.enterText(9, 2, "1");
		FunctionalLibrary.pressEnter();
		
	}
	

@When("^I enter the values  \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"values$")
public void i_enter_the_values_values(String qual, String seq, String Plan1) throws Throwable {
	FunctionalLibrary.enterText(10, 12, Plan1);
    FunctionalLibrary.enterText(21, 17, qual);
    FunctionalLibrary.enterText(21, 37, seq);
	FunctionalLibrary.pressEnter();
}
    
@When("^I navigate to Plan Pharmacy Network Origination/Reimbursement$")
public void i_navigate_to_Plan_Pharmacy_Network_Origination_Reimbursement() throws Throwable {
	FunctionalLibrary.pressKey("F7"); 
	FunctionalLibrary.enterText(7, 21, "4");
	FunctionalLibrary.pressEnter();
	FunctionalLibrary.enterText(12, 2, "6");
	FunctionalLibrary.pressEnter();
	FunctionalLibrary.enterText(20, 13, "1");
	FunctionalLibrary.pressEnter();
	FunctionalLibrary.enterText(13, 2, "4");
	FunctionalLibrary.pressEnter();
	FunctionalLibrary.enterText(16, 64, "Y");
	//FunctionalLibrary.pressEnter();
}

@When("^I select \"([^\"]*)\" option  as \"([^\"]*)\" in \"([^\"]*)\"$")
public void i_select_option_as_in(String arg1, String arg2, String arg3) throws Throwable {
	 FunctionalLibrary.enterText(9, 24, "N");
	    FunctionalLibrary.pressEnter();
	    FunctionalLibrary.enterText(16, 64, "Y");
}

}
