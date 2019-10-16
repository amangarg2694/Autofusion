package com.atdd.demo.te.stepdefinitons;

import com.atdd.te.screenHelpers.FunctionalLibrary;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class JobsubmissionRX331421C2 {
	@When("^I submit job \"([^\"]*)\"$")
	public void i_submit_job(String arg1) throws Throwable {
	    FunctionalLibrary.pressKey("F10");
	    FunctionalLibrary.pressKey("F11");
	    FunctionalLibrary.enterText(5, 1, arg1);
	    FunctionalLibrary.pressEnter();
	    FunctionalLibrary.pressKey("F3");
	    /*String s=FunctionalLibrary.getText(23, 2).trim();
	   String[] a= s.split(" ");
	   String job= a[1];
	   FunctionalLibrary.enterText(4, 7, "Wrkjob "+a[1]);
	   FunctionalLibrary.pressEnter();*/
	    
	  
	   
	   
	}
	
	@Then("^I validate the job \"([^\"]*)\",\"([^\"]*)\"\\.$")
	public void i_validate_the_job(String jobN, String user) throws Throwable {
		FunctionalLibrary.enterText(21, 7, "WRKJOB JOB("+user+"/"+jobN+")");
		FunctionalLibrary.pressEnter();
		FunctionalLibrary.enterText(8, 4, "1");
		FunctionalLibrary.pressEnter();
		FunctionalLibrary.enterText(21, 7, "4");
		FunctionalLibrary.pressEnter();
		FunctionalLibrary.enterText(11, 3, "5");
		FunctionalLibrary.pressEnter();
	}

}
