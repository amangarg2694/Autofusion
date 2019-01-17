package com.atdd.demo.te.stepdefinitons;

import com.atdd.te.screenHelpers.FunctionalLibrary;

import cucumber.api.java.en.When;

public class AcceptCar {

	@When("^I enter \"([^\"]*)\"$")
	public void i_enter(String carrierid) throws Throwable {
	    FunctionalLibrary.enterText(4, 10, carrierid);
	}

}
