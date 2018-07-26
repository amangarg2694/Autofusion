package com.atdd.demo.te.stepdefinitons;

import com.atdd.te.screenHelpers.FunctionalLibrary;
import com.optumrx.autofusion.core.te.util.Mainframe_GlobalFunctionLib;

import cucumber.api.java.en.Then;

public class CreateorEditCAGSteps {

	
	@Then("^Validate CAG created with details \"([^\"]*)\" ,\"([^\"]*)\",\"([^\"]*)\"$")
	public void validate_CAG_created_with_details(String carrierID, String accountID, String groupID) throws Throwable {
	    
		FunctionalLibrary.validateText("5" ,"11" , carrierID );
		FunctionalLibrary.validateText("6" ,"11" , accountID );
		FunctionalLibrary.validateText("7" ,"11" , groupID );
		
	}
	
	@Then("^Validate Carrier created with details \"([^\"]*)\"$")
	public void validate_Carrier_created_with_details(String carrierID) throws Throwable {
		
		FunctionalLibrary.validateText("10" ,"6" , carrierID );
	}
	
	@Then("^Validate Account created with \"([^\"]*)\"$")
	public void validate_Account_created_with(String accountID) throws Throwable {
		FunctionalLibrary.validateText("9" ,"5" , accountID );
	}
	
	@Then("^Validate Group created with \"([^\"]*)\"$")
	public void validate_Group_created_with(String groupID) throws Throwable {
		FunctionalLibrary.validateText("9" ,"4" , groupID );
	}

}
