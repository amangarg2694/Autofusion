package com.atdd.demo.te.stepdefinitons;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DE300001 {
	PlanGpiDailyDoseSetup obj = new PlanGpiDailyDoseSetup();
	@When("^I setup Daily Dose on GPI list setup and higher drug daily dose setup on Additional options in Plan \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\", \"([^\"]*)\"$")
	public void i_setup_Daily_Dose_on_GPI_list_setup_and_higher_drug_daily_dose_setup_on_Additional_options_in_Plan(String PlanCode,String fromdate,String description,String thrudate, String Dailydose1, String Dailydose2, String gpilist, String ProductID, String DrugStatus, String lookback, String LDdaysSupply) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		obj.verify_plan_is_updated_with_GPI_Daily_Dose_setup(PlanCode, fromdate, description, thrudate, Dailydose1, Dailydose2, gpilist, ProductID, DrugStatus, lookback, LDdaysSupply);
	    throw new PendingException();
	}

	@When("^I create a CAG \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\",\"([^\"]*)\"$")
	public void i_create_a_CAG(String carrierID, String carrierName,String fromdate, String thrudate, String accountID, String accountName, String groupID, String groupName, String PlanCode) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    obj.i_create_CAG_with(carrierID, carrierName, fromdate, thrudate, accountID, accountName, groupID, groupName, PlanCode);
		throw new PendingException();
	}

	@Then("^Validate drug status on claim$")
	public void validate_drug_status_on_claim() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		obj.validate_Claim_drugStatus_is();
	    throw new PendingException();
	}



}
