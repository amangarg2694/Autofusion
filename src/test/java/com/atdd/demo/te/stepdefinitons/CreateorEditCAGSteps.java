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
}
