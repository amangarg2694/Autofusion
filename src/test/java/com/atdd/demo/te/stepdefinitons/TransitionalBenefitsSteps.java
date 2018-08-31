package com.atdd.demo.te.stepdefinitons;

import java.awt.Robot;

import com.atdd.te.screenHelpers.FunctionalLibrary;

public class TransitionalBenefitsSteps {
	
	
	///This is reggie adding a new step definition@SR41698
	@When("^I go to Transaction Control Table \"$")
		public void TranscationControlTable() throws Throwable {
		FunctionalLibrary.navigateToScreen("20");
		FunctionalLibrary.navigateToScreen("8");
		FunctionalLibrary.navigateToScreen("2");

	}
}
