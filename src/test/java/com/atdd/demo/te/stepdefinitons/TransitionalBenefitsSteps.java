package com.atdd.demo.te.stepdefinitons;

import java.awt.Robot;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import com.atdd.te.screenHelpers.FunctionalLibrary;
import com.cucumber.listener.Reporter;
import com.optumrx.autofusion.core.te.util.Mainframe_GlobalFunctionLib;
import com.optumrx.autofusion.core.te.util.Screenshot;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
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
