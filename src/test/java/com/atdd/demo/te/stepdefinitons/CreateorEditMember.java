package com.atdd.demo.te.stepdefinitons;

import com.atdd.te.screenHelpers.FunctionalLibrary;

import cucumber.api.java.en.Then;

public class CreateorEditMember {

	
	@Then("^Validate Member \"([^\"]*)\" added$")
	public void validate_Member_added(String memberID) throws Throwable {
		FunctionalLibrary.validateText("6" ,"10" , memberID );
	}
}
