package com.atdd.demo.te.stepdefinitons;

import com.atdd.te.screenHelpers.FunctionalLibrary;
import com.optumrx.autofusion.core.te.util.Screenshot;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Prcomext {

@When("^I submit job using command \"([^\"]*)\" with \"([^\"]*)\"$")
public void i_submit_job_using_command_with(String cmd, String jobname) throws Throwable {
  FunctionalLibrary.enterText(21, 7, "sbmjob");
  FunctionalLibrary.pressKey("F4");
  FunctionalLibrary.enterText(5, 37, cmd);
  FunctionalLibrary.enterText(12, 37, jobname);
  FunctionalLibrary.pressEnter();
  
  
}


@Then("^I verify the file \"([^\"]*)\",\"([^\"]*)\"$")
public void i_verify_the_file(String file, String lib) throws Throwable {
	FunctionalLibrary.enterText(21, 7,"RUNQRY *n "+lib+"/"+file );
	FunctionalLibrary.pressEnter();
	Screenshot.screenshot();
	FunctionalLibrary.pressKey("F12");
}

@When("^I enter \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" in Product CAG Override Manual Changes Report screen$")
public void i_enter_in_Product_CAG_Override_Manual_Changes_Report_screen(String from, String to, String file, String lib) throws Throwable {
   FunctionalLibrary.enterText(4, 16, from);
   FunctionalLibrary.enterText(4, 44, to);
   FunctionalLibrary.enterText(7, 16, file);
   FunctionalLibrary.enterText(9, 16, lib);
   FunctionalLibrary.pressEnter();
}



@When("^I enter \"([^\"]*)\" to continue$")
public void i_enter_to_continue(String arg1) throws Throwable {
    FunctionalLibrary.enterText(16, 69, arg1);
    FunctionalLibrary.pressEnter();
}

}
