package com.atdd.demo.te.stepdefinitons;

import com.atdd.te.screenHelpers.FunctionalLibrary;
import com.optumrx.autofusion.core.te.util.Mainframe_GlobalFunctionLib;

import cucumber.api.java.en.Then;

public class CreateorSubmitTransaction {

	@Then("^Validate Claim Status is \"([^\"]*)\"$")
	public void validate_Claim_Status_is(String claimStatus) throws Throwable {
	 
		FunctionalLibrary.validateText("21" ,"6" , claimStatus );
		
	}
	
	@Then("^Validate Reversal Claim Status is \"([^\"]*)\"$")
	public void validate_Reversal_Claim_Status_is(String claimStatus) throws Throwable {
	 	
		FunctionalLibrary.validateText("20" ,"6" , claimStatus );
	}
}
