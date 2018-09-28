package com.atdd.demo.te.stepdefinitons;

import org.testng.Assert;

import com.atdd.te.screenHelpers.FunctionalLibrary;
import com.cucumber.listener.Reporter;
import com.optumrx.autofusion.core.te.util.Mainframe_GlobalFunctionLib;
import com.optumrx.autofusion.core.te.util.Screenshot;

import cucumber.api.java.en.When;

public class BatchClaimLoadOverrideSubmssion {

    public void i_wait_until_the_job_moves_to(String jobN, String user, String status) throws Throwable {
        FunctionalLibrary.enterText(21, 7, "WRKJOB JOB("+user+"/"+jobN+")");
        FunctionalLibrary.pressEnter();
        /*if(FunctionalLibrary.getText(1, 33).trim().equals("Work with Job")){
               FunctionalLibrary.enterText(21, 7, "4");
               FunctionalLibrary.pressEnter();
               FunctionalLibrary.enterText(11, 3, "5");
               FunctionalLibrary.pressEnter();
               FunctionalLibrary.enterText(3, 22, "w20");
               FunctionalLibrary.pressEnter();
               Screenshot.screenshot();
               FunctionalLibrary.pressKey("F12");
               
        }*/
        String status1=FunctionalLibrary.getText(8, 52).trim();
       String  jobnum=FunctionalLibrary.getText(8, 34).trim();
        FunctionalLibrary.pressKey("F12");
        // Mainframe_GlobalFunctionLib.pressKey("F12");
        if(status1.equals("JOBQ")){
         String qry1="CHGJOB";
         FunctionalLibrary.enterText(21,7,qry1);
         FunctionalLibrary.pressKey("F4");
         FunctionalLibrary.enterText(5,37,jobN);
         FunctionalLibrary.enterText(6,39,user);
         FunctionalLibrary.enterText(7,39,jobnum);
          FunctionalLibrary.pressKey("Enter");
          FunctionalLibrary.pressKey("F10");
          Thread.sleep(1000);
          FunctionalLibrary.enterText(17, 37,"QPGMR");
          FunctionalLibrary.pressKey("Enter");
                 Thread.sleep(1000);
  }
        else if(status1.equals("MSGW")){
               Assert.fail();
        }
        while(status1.equals("ACTIVE")){
               FunctionalLibrary.enterText(21, 7, "WRKJOB JOB("+user+"/"+jobN+")");
               FunctionalLibrary.pressEnter();
               
               status1=FunctionalLibrary.getText(8, 52).trim();
               FunctionalLibrary.pressKey("F12");
               Thread.sleep(3000);
        }
        FunctionalLibrary.pressKey("F3");
    }

    @When("^I enter values for relevant fields in the \"([^\"]*)\"$")
	public void i_enter_values_for_relevant_fields_in_the(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.sendText(5, 34, "SWAN10");
		Mainframe_GlobalFunctionLib.sendText(5, 60, "ANILALIB");
		Mainframe_GlobalFunctionLib.sendText(8, 34, "010118");
		Mainframe_GlobalFunctionLib.sendText(8, 52, "123118");
		Mainframe_GlobalFunctionLib.sendText(10, 34, "NANCY");
		Mainframe_GlobalFunctionLib.sendText(10, 52, "NANCY");
		Mainframe_GlobalFunctionLib.sendText(19, 34, "1234");
		Mainframe_GlobalFunctionLib.sendText(20, 34, "4567");
		Mainframe_GlobalFunctionLib.sendText(21, 37, "A");
		
		}
	@When("^I verify the records by submitting the job$")
	public void i_verify_the_records_by_submitting_the_job() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	      i_wait_until_the_job_moves_to("EXTRACTJOB",  "VENM","OUTQ");
	       /*FunctionalLibrary.enterText(21, 7, "WRKJOB VENM/EXTRACTJOB");
	       FunctionalLibrary.pressEnter();
	       FunctionalLibrary.enterText(8, 4, "1");
	       FunctionalLibrary.pressEnter();
	       FunctionalLibrary.enterText(21, 7, "4");
	       FunctionalLibrary.pressEnter();
	       Mainframe_GlobalFunctionLib.sendText(12, 3, "5");*/
	       
	       
	       /*Mainframe_GlobalFunctionLib.sendText(21, 7, "WS");
	       Mainframe_GlobalFunctionLib.pressKey("Enter");
	       Mainframe_GlobalFunctionLib.sendText(11, 3, " ");
	       Thread.sleep(5000);
	       Mainframe_GlobalFunctionLib.pressKey("F5");
	       Mainframe_GlobalFunctionLib.sendText(11, 3, "8");
	       Mainframe_GlobalFunctionLib.pressKey("Enter");
	       Mainframe_GlobalFunctionLib.sendText(12, 3, "5");
	       Mainframe_GlobalFunctionLib.pressKey("Enter");
	       Mainframe_GlobalFunctionLib.sendText(3, 22, "W10");
	       Mainframe_GlobalFunctionLib.pressKey("Enter");
	       Mainframe_GlobalFunctionLib.pressKey("PageDown");
	       Mainframe_GlobalFunctionLib.pressKey("F12");*/
	    Mainframe_GlobalFunctionLib.sendText(21, 7, "WS");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(11, 3, "8");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(12, 3, "5");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("PageDown");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("PageDown");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.sendText(21, 7, "6");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(6, 41, "8403");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
	}
	@When("^I verify the records by submitting the job and display the records$")
	public void i_verify_the_records_by_submitting_the_job_and_display_the_records() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 i_wait_until_the_job_moves_to("EXTRACTJOB",  "VENM","OUTQ");
	       /*FunctionalLibrary.enterText(21, 7, "WRKJOB VENM/EXTRACTJOB");
	       FunctionalLibrary.pressEnter();
	       FunctionalLibrary.enterText(8, 4, "1");
	       FunctionalLibrary.pressEnter();
	       FunctionalLibrary.enterText(21, 7, "4");
	       FunctionalLibrary.pressEnter();
	       Mainframe_GlobalFunctionLib.sendText(12, 3, "5");*/
	       
	       
	       /*Mainframe_GlobalFunctionLib.sendText(21, 7, "WS");
	       Mainframe_GlobalFunctionLib.pressKey("Enter");
	       Mainframe_GlobalFunctionLib.sendText(11, 3, " ");
	       Thread.sleep(5000);
	       Mainframe_GlobalFunctionLib.pressKey("F5");
	       Mainframe_GlobalFunctionLib.sendText(11, 3, "8");
	       Mainframe_GlobalFunctionLib.pressKey("Enter");
	       Mainframe_GlobalFunctionLib.sendText(12, 3, "5");
	       Mainframe_GlobalFunctionLib.pressKey("Enter");
	       Mainframe_GlobalFunctionLib.sendText(3, 22, "W10");
	       Mainframe_GlobalFunctionLib.pressKey("Enter");
	       Mainframe_GlobalFunctionLib.pressKey("PageDown");
	       Mainframe_GlobalFunctionLib.pressKey("F12");*/
		Mainframe_GlobalFunctionLib.sendText(21, 7, "WS");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(12, 3, "8");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(11, 3, "5");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("PageDown");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("PageDown");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("PageDown");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.sendText(21, 7, "6");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(6, 41, "8403");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
	}

@When("^I verify the records by submitting the job and display records$")
public void i_verify_the_records_by_submitting_the_job_and_display_records() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	 i_wait_until_the_job_moves_to("EXTRACTJOB",  "VENM","OUTQ");
     /*FunctionalLibrary.enterText(21, 7, "WRKJOB VENM/EXTRACTJOB");
     FunctionalLibrary.pressEnter();
     FunctionalLibrary.enterText(8, 4, "1");
     FunctionalLibrary.pressEnter();
     FunctionalLibrary.enterText(21, 7, "4");
     FunctionalLibrary.pressEnter();
     Mainframe_GlobalFunctionLib.sendText(12, 3, "5");*/
     
     
     /*Mainframe_GlobalFunctionLib.sendText(21, 7, "WS");
     Mainframe_GlobalFunctionLib.pressKey("Enter");
     Mainframe_GlobalFunctionLib.sendText(11, 3, " ");
     Thread.sleep(5000);
     Mainframe_GlobalFunctionLib.pressKey("F5");
     Mainframe_GlobalFunctionLib.sendText(11, 3, "8");
     Mainframe_GlobalFunctionLib.pressKey("Enter");
     Mainframe_GlobalFunctionLib.sendText(12, 3, "5");
     Mainframe_GlobalFunctionLib.pressKey("Enter");
     Mainframe_GlobalFunctionLib.sendText(3, 22, "W10");
     Mainframe_GlobalFunctionLib.pressKey("Enter");
     Mainframe_GlobalFunctionLib.pressKey("PageDown");
     Mainframe_GlobalFunctionLib.pressKey("F12");*/
	Mainframe_GlobalFunctionLib.sendText(21, 7, "WS");
	Mainframe_GlobalFunctionLib.pressKey("Enter");
	Mainframe_GlobalFunctionLib.sendText(13, 3, "8");
	Mainframe_GlobalFunctionLib.pressKey("Enter");
	Mainframe_GlobalFunctionLib.sendText(11, 3, "5");
	Mainframe_GlobalFunctionLib.pressKey("Enter");
	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	Mainframe_GlobalFunctionLib.pressKey("PageDown");
	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	Mainframe_GlobalFunctionLib.pressKey("PageDown");
	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	Mainframe_GlobalFunctionLib.pressKey("PageDown");
	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	Mainframe_GlobalFunctionLib.pressKey("F3");
	Mainframe_GlobalFunctionLib.pressKey("F3");
	Mainframe_GlobalFunctionLib.pressKey("F3");
	Mainframe_GlobalFunctionLib.sendText(21, 7, "6");
	Mainframe_GlobalFunctionLib.pressKey("Enter");
	Mainframe_GlobalFunctionLib.sendText(6, 41, "8403");
	Mainframe_GlobalFunctionLib.pressKey("Enter");
}
@When("^I verify the records by submitting job and display records$")
public void i_verify_the_records_by_submitting_job_and_display_records() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	 i_wait_until_the_job_moves_to("EXTRACTJOB",  "VENM","OUTQ");
     /*FunctionalLibrary.enterText(21, 7, "WRKJOB VENM/EXTRACTJOB");
     FunctionalLibrary.pressEnter();
     FunctionalLibrary.enterText(8, 4, "1");
     FunctionalLibrary.pressEnter();
     FunctionalLibrary.enterText(21, 7, "4");
     FunctionalLibrary.pressEnter();
     Mainframe_GlobalFunctionLib.sendText(12, 3, "5");*/
     
     
     /*Mainframe_GlobalFunctionLib.sendText(21, 7, "WS");
     Mainframe_GlobalFunctionLib.pressKey("Enter");
     Mainframe_GlobalFunctionLib.sendText(11, 3, " ");
     Thread.sleep(5000);
     Mainframe_GlobalFunctionLib.pressKey("F5");
     Mainframe_GlobalFunctionLib.sendText(11, 3, "8");
     Mainframe_GlobalFunctionLib.pressKey("Enter");
     Mainframe_GlobalFunctionLib.sendText(12, 3, "5");
     Mainframe_GlobalFunctionLib.pressKey("Enter");
     Mainframe_GlobalFunctionLib.sendText(3, 22, "W10");
     Mainframe_GlobalFunctionLib.pressKey("Enter");
     Mainframe_GlobalFunctionLib.pressKey("PageDown");
     Mainframe_GlobalFunctionLib.pressKey("F12");*/
	Mainframe_GlobalFunctionLib.sendText(21, 7, "WS");
	Mainframe_GlobalFunctionLib.pressKey("Enter");
	Mainframe_GlobalFunctionLib.sendText(14, 3, "8");
	Mainframe_GlobalFunctionLib.pressKey("Enter");
	Mainframe_GlobalFunctionLib.sendText(11, 3, "5");
	Mainframe_GlobalFunctionLib.pressKey("Enter");
	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	Mainframe_GlobalFunctionLib.pressKey("PageDown");
	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	Mainframe_GlobalFunctionLib.pressKey("PageDown");
	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	Mainframe_GlobalFunctionLib.pressKey("PageDown");
	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	Mainframe_GlobalFunctionLib.pressKey("F3");
	Mainframe_GlobalFunctionLib.pressKey("F3");
	Mainframe_GlobalFunctionLib.pressKey("F3");
	Mainframe_GlobalFunctionLib.sendText(21, 7, "6");
	Mainframe_GlobalFunctionLib.pressKey("Enter");
	Mainframe_GlobalFunctionLib.sendText(6, 41, "8403");
	Mainframe_GlobalFunctionLib.pressKey("Enter");
}
@When("^I verify records by submitting job and display records$")
public void i_verify_records_by_submitting_job_and_display_records() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	 i_wait_until_the_job_moves_to("EXTRACTJOB",  "VENM","OUTQ");
     /*FunctionalLibrary.enterText(21, 7, "WRKJOB VENM/EXTRACTJOB");
     FunctionalLibrary.pressEnter();
     FunctionalLibrary.enterText(8, 4, "1");
     FunctionalLibrary.pressEnter();
     FunctionalLibrary.enterText(21, 7, "4");
     FunctionalLibrary.pressEnter();
     Mainframe_GlobalFunctionLib.sendText(12, 3, "5");*/
     
     
     /*Mainframe_GlobalFunctionLib.sendText(21, 7, "WS");
     Mainframe_GlobalFunctionLib.pressKey("Enter");
     Mainframe_GlobalFunctionLib.sendText(11, 3, " ");
     Thread.sleep(5000);
     Mainframe_GlobalFunctionLib.pressKey("F5");
     Mainframe_GlobalFunctionLib.sendText(11, 3, "8");
     Mainframe_GlobalFunctionLib.pressKey("Enter");
     Mainframe_GlobalFunctionLib.sendText(12, 3, "5");
     Mainframe_GlobalFunctionLib.pressKey("Enter");
     Mainframe_GlobalFunctionLib.sendText(3, 22, "W10");
     Mainframe_GlobalFunctionLib.pressKey("Enter");
     Mainframe_GlobalFunctionLib.pressKey("PageDown");
     Mainframe_GlobalFunctionLib.pressKey("F12");*/
	Mainframe_GlobalFunctionLib.sendText(21, 7, "WS");
	Mainframe_GlobalFunctionLib.pressKey("Enter");
	Mainframe_GlobalFunctionLib.sendText(15, 3, "8");
	Mainframe_GlobalFunctionLib.pressKey("Enter");
	Mainframe_GlobalFunctionLib.sendText(11, 3, "5");
	Mainframe_GlobalFunctionLib.pressKey("Enter");
	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	
}


@When("^I enter values for relevant fields in \"([^\"]*)\"$")
public void i_enter_values_for_relevant_fields_in(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	Mainframe_GlobalFunctionLib.sendText(3, 31, "SWAN10"); 
	Mainframe_GlobalFunctionLib.sendText(4, 31, "ANILALIB");
	Mainframe_GlobalFunctionLib.sendText(10, 31, "        ");
	Mainframe_GlobalFunctionLib.sendText(10, 31, "071217");
	Mainframe_GlobalFunctionLib.sendText(15, 31, "        ");
	Mainframe_GlobalFunctionLib.sendText(15, 31, "071218");
	Mainframe_GlobalFunctionLib.pressKey("Enter");
	
}

@When("^I enter values for relevant fields \"([^\"]*)\"$")
public void i_enter_values_for_relevant_fields(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	Mainframe_GlobalFunctionLib.sendText(4, 31, "SWAN10");
	Mainframe_GlobalFunctionLib.sendText(5, 31, "ANILALIB");
	Mainframe_GlobalFunctionLib.sendText(10, 31, "        ");
	Mainframe_GlobalFunctionLib.sendText(10, 31, "071217");
	Mainframe_GlobalFunctionLib.sendText(15, 31, "        ");
	Mainframe_GlobalFunctionLib.sendText(15, 31, "071218");
	Mainframe_GlobalFunctionLib.pressKey("Enter");
	}
@When("^I enter values for relevant fields for \"([^\"]*)\"$")
public void i_enter_values_for_relevant_fields_for(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	Mainframe_GlobalFunctionLib.sendText(4, 30, "SWAN10");
	Mainframe_GlobalFunctionLib.sendText(5, 30, "ANILALIB");
	Mainframe_GlobalFunctionLib.sendText(10, 30, "000000");
	Mainframe_GlobalFunctionLib.sendText(10, 38, "*");
	Mainframe_GlobalFunctionLib.sendText(10, 50, "*");
	Mainframe_GlobalFunctionLib.sendText(12, 30, "         ");
	Mainframe_GlobalFunctionLib.sendText(12, 30, "071217");
	Mainframe_GlobalFunctionLib.sendText(13, 30, "01");
	Mainframe_GlobalFunctionLib.sendText(18, 30, "         ");
	Mainframe_GlobalFunctionLib.sendText(18, 30, "071218");
	Mainframe_GlobalFunctionLib.pressKey("Enter");
	 }
}
