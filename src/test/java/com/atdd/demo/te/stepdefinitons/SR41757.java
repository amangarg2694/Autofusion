package com.atdd.demo.te.stepdefinitons;

import org.testng.Assert;

import com.atdd.te.screenHelpers.FunctionalLibrary;
import com.cucumber.listener.Reporter;
import com.hp.lft.reportbuilder.Main;
import com.optumrx.autofusion.core.te.util.Mainframe_GlobalFunctionLib;
import com.optumrx.autofusion.core.te.util.Screenshot;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SR41757 {
public static String Claimnumber;


	
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

	@When("^I enter the values in Targeted Transaction File menu with \"([^\"]*)\"$")
	public void i_enter_the_values_in_Targeted_Transaction_File_menu_with(String CarrierID) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
        Mainframe_GlobalFunctionLib.sendText(5, 16, "010118");
	    Mainframe_GlobalFunctionLib.sendText(5, 36, "123118");
	    Mainframe_GlobalFunctionLib.sendText(6, 16, CarrierID);
	    Mainframe_GlobalFunctionLib.sendText(6, 36, CarrierID);
	    Mainframe_GlobalFunctionLib.sendText(18, 12, "X");
	   /* Mainframe_GlobalFunctionLib.sendText(18, 17, "X");
	    Mainframe_GlobalFunctionLib.sendText(18, 22, "X");
	    Mainframe_GlobalFunctionLib.sendText(18, 27, "X");*/
	    Mainframe_GlobalFunctionLib.sendText(18, 42, "X");
	    Mainframe_GlobalFunctionLib.sendText(18, 47, "X");
	    Mainframe_GlobalFunctionLib.sendText(18, 52, "X");
	    Mainframe_GlobalFunctionLib.sendText(18, 57, "X");
	    Mainframe_GlobalFunctionLib.sendText(18, 62, "X");
	    Mainframe_GlobalFunctionLib.sendText(18, 67, "X");
	    Mainframe_GlobalFunctionLib.sendText(18, 72, "X");
	    Mainframe_GlobalFunctionLib.sendText(19, 21, "X");
	    Mainframe_GlobalFunctionLib.sendText(19, 25, "X");
	    Mainframe_GlobalFunctionLib.sendText(19, 29, "X");
	    Mainframe_GlobalFunctionLib.sendText(19, 33, "X");
	    Mainframe_GlobalFunctionLib.sendText(19, 37, "X");
	    Mainframe_GlobalFunctionLib.sendText(21, 53, "SR41757F1");
	    Mainframe_GlobalFunctionLib.sendText(22, 53, "ANILALIB");
	    Mainframe_GlobalFunctionLib.pressKey("F6");
	    Mainframe_GlobalFunctionLib.sendText(16, 69, "Y");
	    Mainframe_GlobalFunctionLib.pressKey("Enter");
	   }
	@When("^I enter the values in Targeted Transaction File using \"([^\"]*)\"$")
	public void i_enter_the_values_in_Targeted_Transaction_File_using(String  CarrierID) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
		    Mainframe_GlobalFunctionLib.sendText(5, 16, "010119");
		    Mainframe_GlobalFunctionLib.sendText(5, 36, "123119");
		    Mainframe_GlobalFunctionLib.sendText(6, 16, CarrierID);
		    Mainframe_GlobalFunctionLib.sendText(6, 36, CarrierID);
		    Mainframe_GlobalFunctionLib.sendText(18, 12, "X");
		    /*Mainframe_GlobalFunctionLib.sendText(18, 17, "X");
		    Mainframe_GlobalFunctionLib.sendText(18, 22, "X");
		    Mainframe_GlobalFunctionLib.sendText(18, 27, "X");*/
		    Mainframe_GlobalFunctionLib.sendText(18, 42, "X");
		    Mainframe_GlobalFunctionLib.sendText(18, 47, "X");
		    Mainframe_GlobalFunctionLib.sendText(18, 52, "X");
		    Mainframe_GlobalFunctionLib.sendText(18, 57, "X");
		    Mainframe_GlobalFunctionLib.sendText(18, 62, "X");
		    Mainframe_GlobalFunctionLib.sendText(18, 67, "X");
		    Mainframe_GlobalFunctionLib.sendText(18, 72, "X");
		    Mainframe_GlobalFunctionLib.sendText(19, 21, "X");
		    Mainframe_GlobalFunctionLib.sendText(19, 25, "X");
		    Mainframe_GlobalFunctionLib.sendText(19, 29, "X");
		    Mainframe_GlobalFunctionLib.sendText(19, 33, "X");
		    Mainframe_GlobalFunctionLib.sendText(19, 37, "X");
		    Mainframe_GlobalFunctionLib.sendText(21, 53, "SR41757F1");
		    Mainframe_GlobalFunctionLib.sendText(22, 53, "ANILALIB");
		    Mainframe_GlobalFunctionLib.pressKey("F6");
		    Mainframe_GlobalFunctionLib.sendText(16, 69, "Y");
		    Mainframe_GlobalFunctionLib.pressKey("Enter");
	}
	@When("^I enter \"([^\"]*)\" in Active/Eligible Member by ID menu$")
	public void i_enter_in_Active_Eligible_Member_by_ID_menu(String MemberID) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	Mainframe_GlobalFunctionLib.sendText(4, 4, MemberID);
	Mainframe_GlobalFunctionLib.pressKey("Enter");
	Mainframe_GlobalFunctionLib.sendText(10, 2, "2");
	Mainframe_GlobalFunctionLib.pressKey("Enter");
	Mainframe_GlobalFunctionLib.pressKey("F7");
	Mainframe_GlobalFunctionLib.pressKey("F6");
	Mainframe_GlobalFunctionLib.sendText(10, 14, "010119");
	Mainframe_GlobalFunctionLib.sendText(10, 38, "123119");
	Mainframe_GlobalFunctionLib.pressKey("Enter");
	Mainframe_GlobalFunctionLib.pressKey("F3");
	Mainframe_GlobalFunctionLib.pressKey("F8");
	Mainframe_GlobalFunctionLib.pressKey("F3");
	Mainframe_GlobalFunctionLib.pressKey("F3");
	Mainframe_GlobalFunctionLib.pressKey("F3");
	Mainframe_GlobalFunctionLib.pressKey("F3");
	Mainframe_GlobalFunctionLib.pressKey("F3");
	}
	@When("^I enter details to enable in Active Application Profile \"([^\"]*)\"$")
	public void i_enter_details_to_enable_in_Active_Application_Profile(String CarrierID) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	Mainframe_GlobalFunctionLib.pressKey("F6");
	Mainframe_GlobalFunctionLib.pressKey("F4");
	Mainframe_GlobalFunctionLib.sendText(4, 5, CarrierID);
	Mainframe_GlobalFunctionLib.pressKey("Enter");
	Mainframe_GlobalFunctionLib.sendText(9, 2, "1");
	Mainframe_GlobalFunctionLib.pressKey("Enter");
	Mainframe_GlobalFunctionLib.sendText(12, 13, "010101");
	Mainframe_GlobalFunctionLib.sendText(12, 39, "123139");
	Mainframe_GlobalFunctionLib.PressTabKey();
	Mainframe_GlobalFunctionLib.pressKey("F4");
	Mainframe_GlobalFunctionLib.sendText(14, 3, "X");
	Mainframe_GlobalFunctionLib.pressKey("Enter");
	Mainframe_GlobalFunctionLib.pressKey("Enter");
	Mainframe_GlobalFunctionLib.pressKey("F3");
	Mainframe_GlobalFunctionLib.pressKey("F3");
	Mainframe_GlobalFunctionLib.pressKey("F3");
	Mainframe_GlobalFunctionLib.pressKey("F3");
	}
	@When("^I enter the values in Clinical Products Platform Extract menu with \"([^\"]*)\"$")
	public void i_enter_the_values_in_Clinical_Products_Platform_Extract_menu_with(String CarrierID) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.sendText(5, 15, "010118");
	    Mainframe_GlobalFunctionLib.sendText(5, 36, "123118");
	    Mainframe_GlobalFunctionLib.sendText(6, 15, CarrierID);
	    Mainframe_GlobalFunctionLib.sendText(6, 36, CarrierID);
	    Mainframe_GlobalFunctionLib.sendText(20, 14, "SR41757F1");
	    Mainframe_GlobalFunctionLib.sendText(21, 14, "ANILALIB");
	    Mainframe_GlobalFunctionLib.pressKey("F6");
	    Mainframe_GlobalFunctionLib.sendText(16, 69, "Y");
	    Mainframe_GlobalFunctionLib.pressKey("Enter");
	      
	}

@When("^I check the job status$")
public void i_check_the_job_status() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    i_wait_until_the_job_moves_to("RATGTEXT",  "VENM","OUTQ");
    Mainframe_GlobalFunctionLib.pressKey("F3");
    Mainframe_GlobalFunctionLib.pressKey("F3");
    
}
@When("^I check the job status in \"([^\"]*)\"$")
public void i_check_the_job_status_in(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	i_wait_until_the_job_moves_to("RACPPEXT",  "VENM","OUTQ");
	Mainframe_GlobalFunctionLib.pressKey("F3");
    Mainframe_GlobalFunctionLib.pressKey("F3");
    
}


@When("^I verify the records in the physical file member$")
public void i_verify_the_records_in_the_physical_file_member() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    Mainframe_GlobalFunctionLib.sendText(21, 7, "20");
	Mainframe_GlobalFunctionLib.pressKey("Enter");
	Mainframe_GlobalFunctionLib.sendText(21, 7, "dsppfm");
	Mainframe_GlobalFunctionLib.pressKey("Enter");
	Mainframe_GlobalFunctionLib.sendText(5, 37, "SR41757F1");
	Mainframe_GlobalFunctionLib.sendText(6, 39, "         ");
	Mainframe_GlobalFunctionLib.sendText(6, 39, "ANILALIB");
	Mainframe_GlobalFunctionLib.pressKey("Enter");
	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	Thread.sleep(3000);
	Mainframe_GlobalFunctionLib.pressKey("F3");
	Mainframe_GlobalFunctionLib.pressKey("F3");
    }
@When("^I verify the records in the physical file member for Clinical Products Platform Extract$")
public void i_verify_the_records_in_the_physical_file_member_for_Clinical_Products_Platform_Extract() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	Mainframe_GlobalFunctionLib.sendText(21, 7, "20");
	Mainframe_GlobalFunctionLib.pressKey("Enter");
	Mainframe_GlobalFunctionLib.sendText(21, 7, "dsppfm");
	Mainframe_GlobalFunctionLib.pressKey("Enter");
	Mainframe_GlobalFunctionLib.sendText(5, 37, "SR41757F1");
	Mainframe_GlobalFunctionLib.sendText(6, 39, "         ");
	Mainframe_GlobalFunctionLib.sendText(6, 39, "ANILALIB");
	Mainframe_GlobalFunctionLib.pressKey("Enter");
	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	Thread.sleep(3000);
	Mainframe_GlobalFunctionLib.pressKey("F3");
	Mainframe_GlobalFunctionLib.pressKey("F3");
	}
@When("^I enter the values in Clinical Products Platform Extract menu \"([^\"]*)\"$")
public void i_enter_the_values_in_Clinical_Products_Platform_Extract_menu(String CarrierID) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	Mainframe_GlobalFunctionLib.sendText(5, 15, "010117");
    Mainframe_GlobalFunctionLib.sendText(5, 36, "123117");
    Mainframe_GlobalFunctionLib.sendText(6, 15, CarrierID);
    Mainframe_GlobalFunctionLib.sendText(6, 36, CarrierID);
    Mainframe_GlobalFunctionLib.sendText(20, 14, "SR41757F1");
    Mainframe_GlobalFunctionLib.sendText(21, 14, "ANILALIB");
    Mainframe_GlobalFunctionLib.pressKey("F6");
    Mainframe_GlobalFunctionLib.sendText(16, 69, "Y");
    Mainframe_GlobalFunctionLib.pressKey("Enter");
  }
@When("^I enter the values in Clinical Products Platform with \"([^\"]*)\"$")
public void i_enter_the_values_in_Clinical_Products_Platform_with(String CarrierID) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	Mainframe_GlobalFunctionLib.sendText(5, 15, "010119");
    Mainframe_GlobalFunctionLib.sendText(5, 36, "123119");
    Mainframe_GlobalFunctionLib.sendText(6, 15, CarrierID);
    Mainframe_GlobalFunctionLib.sendText(6, 36, CarrierID);
    Mainframe_GlobalFunctionLib.sendText(20, 14, "SR41757F1");
    Mainframe_GlobalFunctionLib.sendText(21, 14, "ANILALIB");
    Mainframe_GlobalFunctionLib.pressKey("F6");
    Mainframe_GlobalFunctionLib.sendText(16, 69, "Y");
    Mainframe_GlobalFunctionLib.pressKey("Enter");
}
}
