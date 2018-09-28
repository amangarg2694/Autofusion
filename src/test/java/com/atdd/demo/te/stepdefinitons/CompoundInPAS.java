package com.atdd.demo.te.stepdefinitons;

import org.testng.Assert;

import com.atdd.te.screenHelpers.FunctionalLibrary;
import com.optumrx.autofusion.core.te.util.Mainframe_GlobalFunctionLib;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CompoundInPAS {
	
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
	@When("^I enter value for file in \"([^\"]*)\"$")
	public void i_enter_value_for_file_in(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    Mainframe_GlobalFunctionLib.sendText(14, 44, "062411");
	}

@Then("^I verify job status & verify the files$")
public void i_verify_job_status_verify_the_files() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	 i_wait_until_the_job_moves_to("CLRXM25PRD",  "VENM","OUTQ");
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
     Mainframe_GlobalFunctionLib.sendText(21, 7, "6");
     Mainframe_GlobalFunctionLib.pressKey("Enter");
     Mainframe_GlobalFunctionLib.sendText(6, 41, "8403");
     Mainframe_GlobalFunctionLib.pressKey("Enter");
    
}}
