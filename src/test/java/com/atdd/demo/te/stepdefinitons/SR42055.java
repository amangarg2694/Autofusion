package com.atdd.demo.te.stepdefinitons;

import com.atdd.te.screenHelpers.FunctionalLibrary;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SR42055 {
	@When("^I navigate to Active Member Prior Authorization screen for the \"([^\"]*)\",\"([^\"]*)\"$")
	public void i_navigate_to_Active_Member_Prior_Authorization_screen_for_the(String Member,String PaNumber) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    FunctionalLibrary.enterText(4,4,Member);
	    FunctionalLibrary.pressEnter();
	    for(int i=16;i<19;i++){
	    	if(FunctionalLibrary.getText(i,5).equals(PaNumber)){
		    	FunctionalLibrary.enterText(i, 2, "2");
		    }
	    	else
	    		i++;
	    }
	    
	    FunctionalLibrary.enterText(10, 2, "2");
	    FunctionalLibrary.pressKey("F16");
	    FunctionalLibrary.pressKey("PageDown");
	   
	    
	}

	@Then("^I validate values for the fields \"([^\"]*)\" and \"([^\"]*)\"$")
	public void i_validate_values_for_the_fields_and(String MICPartialMatch, String MICROA) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 FunctionalLibrary.validateText("14", "79", MICPartialMatch);
		 if(MICPartialMatch.equals("N"))
		 FunctionalLibrary.validateText("15", "70", MICROA);
	}
}
