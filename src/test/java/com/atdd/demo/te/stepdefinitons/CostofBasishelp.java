package com.atdd.demo.te.stepdefinitons;

import java.io.IOException;

import com.atdd.te.screenHelpers.FunctionalLibrary;
import com.optumrx.autofusion.core.te.util.Mainframe_GlobalFunctionLib;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CostofBasishelp {
	public void help_Costofbasis() throws IOException{
		 FunctionalLibrary.validateText("7", "5", "Basis of Cost Determination:");
		 FunctionalLibrary.validateText("8", "5", "Code indicating the method by which the drug cost was calculated.");
		 FunctionalLibrary.validateText("10", "5", "Valid values are:");
		 FunctionalLibrary.validateText("11", "5", "00  = Default");
		 FunctionalLibrary.validateText("12", "5", "01  = AWP - Average Wholesale Price");
		 FunctionalLibrary.validateText("13", "5", "02  = Local wholesaler - A legitimate supplier who resells drugs.");
		 FunctionalLibrary.validateText("14", "5", "03  = Direct - Represents the manufacturer's published catalog or list");
		 FunctionalLibrary.validateText("15", "5", "price for any item to non-wholesalers.");
		 FunctionalLibrary.validateText("16", "5", "04  = EAC - Estimated Acquisition Cost.");
		 FunctionalLibrary.validateText("17", "5", "05  = Acquisition - Indicates the provided ingredient cost is the actual");
		 FunctionalLibrary.validateText("18", "5", "cost as paid by the provider to the supplier for the specific item.");
		 FunctionalLibrary.validateText("19", "5", "06  = MAC - Maximum Allowable Cost.");
		 FunctionalLibrary.pressKey("PageDown");
		 FunctionalLibrary.validateText("5", "5", "07  = Usual and customary.");
		 FunctionalLibrary.validateText("6", "5", "08  = 340B - Price available under Section 340B of the Public Health");
		 FunctionalLibrary.validateText("7", "5", "Service Act of 1992.");
		 FunctionalLibrary.validateText("8", "5", "09  = Other. ");
		 FunctionalLibrary.validateText("9", "5", "10  = ASP - Average Sales Price.");
		 FunctionalLibrary.validateText("10", "5", "11  = AMP - Average Manufacturer Price.");
		 FunctionalLibrary.validateText("11", "5", "12  = WAC - Wholesale Acquistion Cost.");
		 FunctionalLibrary.validateText("12", "5", "13  = Special Patient Pricing");
		 FunctionalLibrary.validateText("13", "5", "14  = Cost basis on unreportable quantities.");
		 FunctionalLibrary.validateText("14", "5", "15  = Free product or no associated cost.");
	}
	
	@When("^I select the transaction using option \"([^\"]*)\"$")
	public void i_select_the_transaction_using_option(String opt) throws Throwable {
	 FunctionalLibrary.enterText(10, 2, opt);
	 FunctionalLibrary.pressEnter();
	}

	@When("^I select option \"([^\"]*)\"$")
	public void i_select_option(String opt) throws Throwable {
	   FunctionalLibrary.enterText(4, 23, opt);
	   FunctionalLibrary.pressEnter();
	}
	
	@Then("^I validate the help file for Basis field in Submitted Claim Information Page  screen$")
	public void i_validate_the_help_file_for_Basis_field_in_Submitted_Claim_Information_Page_screen() throws Throwable {
	 Mainframe_GlobalFunctionLib.click(11, 60);
	 Thread.sleep(1000);
	 ContingentTherapy.kPress("F1");
	 FunctionalLibrary.pressKey("F20");
	 help_Costofbasis();
	 
	 
	}
	@When("^I select Option \"([^\"]*)\" to select a claim in Transaction Screen$")
	public void i_select_Option_to_select_a_claim_in_Transaction_Screen(String arg1) throws Throwable {
	  FunctionalLibrary.enterText(9, 2, "1");
	  FunctionalLibrary.pressEnter();
	  
	  
	}

	@Then("^I validate the help file for Cost Basis field in Transaction Submission Page screen$")
	public void i_validate_the_help_file_for_Cost_Basis_field_in_Transaction_Submission_Page_screen() throws Throwable {
		Mainframe_GlobalFunctionLib.click(22, 48);
		 Thread.sleep(1000);
		 ContingentTherapy.kPress("F1");
		 FunctionalLibrary.pressKey("F20");
		 help_Costofbasis();
	}
	@When("^I search for the member \"([^\"]*)\" and select suspended claim$")
	public void i_search_for_the_member_and_select_suspended_claim(String arg1) throws Throwable {
	    FunctionalLibrary.enterText(4, 4, arg1);
	    FunctionalLibrary.pressEnter();
	    FunctionalLibrary.enterText(10, 2, "5");
	    FunctionalLibrary.pressEnter();
	    FunctionalLibrary.pressKey("F10");
	    FunctionalLibrary.pressKey("F9");
	    FunctionalLibrary.pressKey("F8");
	    FunctionalLibrary.pressKey("PageDown");
	    FunctionalLibrary.enterText(20, 2, "5");
	    FunctionalLibrary.pressEnter();
	}
	@When("^I search for claim \"([^\"]*)\"  to select and submit the Member Reimbursement$")
	public void i_search_for_claim_to_select_and_submit_the_Member_Reimbursement(String arg1) throws Throwable {
		 FunctionalLibrary.enterText(4, 4, arg1);
		 FunctionalLibrary.pressEnter();
		 FunctionalLibrary.enterText(9, 2, "1");
		 FunctionalLibrary.enterText(11, 38, "DD");
		 FunctionalLibrary.enterText(12, 10, "DDD");
		 FunctionalLibrary.enterText(15, 17, "CHICAGO");
		 FunctionalLibrary.enterText(15, 36, "IL");
		 FunctionalLibrary.enterText(15, 42, "60607");
		 FunctionalLibrary.pressEnter();
		 FunctionalLibrary.enterText(16, 64, "Y");
		 FunctionalLibrary.pressEnter();
		 
		 
		 
		 
	}
	@Then("^I validate the help file for Cost Basis field in Member Reimbursement Submission Page screen$")
	public void i_validate_the_help_file_for_Cost_Basis_field_in_Member_Reimbursement_Submission_Page_screen() throws Throwable {
		Mainframe_GlobalFunctionLib.click(22, 42);
		 Thread.sleep(1000);
		 ContingentTherapy.kPress("F1");
		 FunctionalLibrary.pressKey("F20");
		 help_Costofbasis(); 
	}

	@When("^I search for claim \"([^\"]*)\"  to select and submit the Member Reimbursement from DO claims$")
	public void i_search_for_claim_to_select_and_submit_the_Member_Reimbursement_from_DO_claims(String arg1) throws Throwable {
	   
	}

}
