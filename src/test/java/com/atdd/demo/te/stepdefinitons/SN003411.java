package com.atdd.demo.te.stepdefinitons;

import org.testng.Assert;

import com.atdd.te.screenHelpers.FunctionalLibrary;
import com.cucumber.listener.Reporter;
import com.optumrx.autofusion.core.te.util.Mainframe_GlobalFunctionLib;
import com.optumrx.autofusion.core.te.util.Screenshot;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SN003411 {
	String A;
	String b;
	
	@When("^I submit the details in the screen Plan Finder File Generation with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\", \"([^\"]*)\"$")
	public void i_submit_the_details_in_the_screen_Plan_Finder_File_Generation_with(String CarrierID1, String AccountID1, String GroupID1, String PlanYear, String Version, String Library, String PublicationDatePricing) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		
		Mainframe_GlobalFunctionLib.click(4,22);
		FunctionalLibrary.pressKey("F4");
		FunctionalLibrary.enterText(4, 6, CarrierID1);
		FunctionalLibrary.pressKey("Enter");
		FunctionalLibrary.enterText(9, 2, "1");
		FunctionalLibrary.pressKey("Enter");
		
		Mainframe_GlobalFunctionLib.click(5,22);
		FunctionalLibrary.pressKey("F4");
		FunctionalLibrary.enterText(6, 5, AccountID1);
		FunctionalLibrary.pressKey("Enter");
		FunctionalLibrary.enterText(11, 2, "1");
		FunctionalLibrary.pressKey("Enter");
		
		Mainframe_GlobalFunctionLib.click(6,22);
		FunctionalLibrary.pressKey("F4");
		FunctionalLibrary.enterText(4,33, GroupID1);
		FunctionalLibrary.pressKey("Enter");
		FunctionalLibrary.enterText(9, 2, "1");
		FunctionalLibrary.pressKey("Enter");
		
		Mainframe_GlobalFunctionLib.click(4,42);
		FunctionalLibrary.pressKey("F4");
		FunctionalLibrary.enterText(4, 6, CarrierID1);
		FunctionalLibrary.pressKey("Enter");
		FunctionalLibrary.enterText(9, 2, "1");
		FunctionalLibrary.pressKey("Enter");
		
		Mainframe_GlobalFunctionLib.click(5,42);
		FunctionalLibrary.pressKey("F4");
		FunctionalLibrary.enterText(6, 5, AccountID1);
		FunctionalLibrary.pressKey("Enter");
		FunctionalLibrary.enterText(11, 2, "1");
		FunctionalLibrary.pressKey("Enter");
		
		Mainframe_GlobalFunctionLib.click(6,42);
		FunctionalLibrary.pressKey("F4");
		FunctionalLibrary.enterText(4,33, GroupID1);
		FunctionalLibrary.pressKey("Enter");
		FunctionalLibrary.enterText(9, 2, "1");
		FunctionalLibrary.pressKey("Enter");
		
		Mainframe_GlobalFunctionLib.click(9,22);
		FunctionalLibrary.pressKey("F4");
		FunctionalLibrary.enterText(7,4, Version);
		FunctionalLibrary.pressKey("Enter");
		FunctionalLibrary.enterText(13, 3, "1");
		FunctionalLibrary.pressKey("Enter");
		
		Mainframe_GlobalFunctionLib.click(10,22);
		FunctionalLibrary.enterText(10,22, PlanYear);
		
		Mainframe_GlobalFunctionLib.click(13,22);
		FunctionalLibrary.pressKey("F4");
		FunctionalLibrary.enterText(7,4, "M");
		FunctionalLibrary.pressKey("Enter");
		FunctionalLibrary.enterText(13,3, "1");
		FunctionalLibrary.pressKey("Enter");
		
		
		FunctionalLibrary.enterText(16, 29, "N");
		
		FunctionalLibrary.enterText(11, 62, Library);
		FunctionalLibrary.enterText(12, 62, Library);
		FunctionalLibrary.enterText(13, 62, Library);
		
		//Publication Date Pricing Flag
		FunctionalLibrary.enterText(14, 71, PublicationDatePricing);
		
		FunctionalLibrary.pressKey("Enter");
		
		FunctionalLibrary.pressKey("F6");
		
		FunctionalLibrary.enterText(16, 69, "Y");
		
		FunctionalLibrary.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		}

	@Then("^I validate  job is successful with \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
	public void i_validate_job_is_successful_with(String Juser, String Jname, String Library) throws Throwable {
		
		String qry="WRKJOB JOB("+Juser+"/"+Jname+")";
        Mainframe_GlobalFunctionLib.sendText(21, 7,qry);
        Thread.sleep(2000);
        Mainframe_GlobalFunctionLib.pressKey("Enter");
        Thread.sleep(2000);
        Mainframe_GlobalFunctionLib.validateText("8", "10", Jname);
        String status = Mainframe_GlobalFunctionLib.getText(8, 52);
        Thread.sleep(2000);
                    if(status.contains("JOBQ"))
       
                    {
                                                    Thread.sleep(2000);
                                                                    String jobN = Mainframe_GlobalFunctionLib.getText(8, 34);
                                                                    Mainframe_GlobalFunctionLib.pressKey("F12");
                                                                    Mainframe_GlobalFunctionLib.pressKey("F12");
                                                                    String qry2="CHGJOB";
                                                                    Mainframe_GlobalFunctionLib.sendText(21, 7,qry2);   
                                                                    Thread.sleep(1000);
                                                                    Mainframe_GlobalFunctionLib.pressKey("F4");                 
                                                                    Thread.sleep(1000);
                                                                    Mainframe_GlobalFunctionLib.sendText(5, 37,Jname);
                                                                    Mainframe_GlobalFunctionLib.sendText(6, 39,Juser);
                                                                    Mainframe_GlobalFunctionLib.sendText(7, 39,jobN);
                                                                    Mainframe_GlobalFunctionLib.pressKey("Enter");
                                                                    Mainframe_GlobalFunctionLib.pressKey("F10");    
                                                                    Mainframe_GlobalFunctionLib.sendText(17, 37,"QPGMR");
                                                                    Mainframe_GlobalFunctionLib.pressKey("Enter");
                                                                    
                                                                    System.out.println("Job Completed Successfully: "+status);
                                                                    //Mainframe_GlobalFunctionLib.pressKey("F12"); 
                                                                    //Mainframe_GlobalFunctionLib.click(21, 7 );
                                                                                    //Thread.sleep(1000);
                                                                                    //Mainframe_GlobalFunctionLib.sendText(21, 7,"                              " );
                                                                                    
                                                    }

                     else if(status.contains("ACTIVE")) {
                                     
                                     do{
                                     
                                     Mainframe_GlobalFunctionLib.pressKey("F12");
                                     Mainframe_GlobalFunctionLib.sendText(21, 7,qry);
                                     Mainframe_GlobalFunctionLib.pressKey("Enter");
                                     Thread.sleep(5000);
                                     } while(Mainframe_GlobalFunctionLib.getText(8, 52).contains("ACTIVE"));
                                      //Mainframe_GlobalFunctionLib.pressKey("F12");
                                    // Mainframe_GlobalFunctionLib.click(21, 7 );
                                                    //Thread.sleep(1000);
                                                    //Mainframe_GlobalFunctionLib.sendText(21, 7,"                            " );
                                                    Thread.sleep(1000);
                                                    System.out.println("Job Completed Successfully: "+status);
                     }
                     else if(status.equals("MSGW")){
                         Assert.fail();

                     }                 
                    else
                                    {
                    System.out.println("Job Completed Successfully: "+status);
                    //Mainframe_GlobalFunctionLib.pressKey("F12");
                    //Mainframe_GlobalFunctionLib.click(21, 7 );
                                    //Thread.sleep(1000);
                                    //Mainframe_GlobalFunctionLib.sendText(21, 7,"                            " );
                                                                     
                                    }

	}
	
	@Then("^I Verify if new Plan finder job ouput file got generated for given year with Publication Date Pricing flag enabled with \"([^\"]*)\"$")
	public void i_Verify_if_new_Plan_finder_job_ouput_file_got_generated_for_given_year_with_Publication_Date_Pricing_flag_enabled_with(String Library) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	    
		Mainframe_GlobalFunctionLib.sendText(8, 4,"1");
        Mainframe_GlobalFunctionLib.pressKey("Enter");
        Mainframe_GlobalFunctionLib.sendText(21, 7,"4");
                        Mainframe_GlobalFunctionLib.pressKey("Enter");
                        Mainframe_GlobalFunctionLib.sendText(11, 3,"5");
                        Mainframe_GlobalFunctionLib.pressKey("Enter");
                        FunctionalLibrary.enterText(3, 22, "B");
         				FunctionalLibrary.pressKey("Enter");
         				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
         				FunctionalLibrary.enterText(4,22, "PFH");
            			FunctionalLibrary.pressKey("F16");
            			b=Mainframe_GlobalFunctionLib.getText(7, 14).trim();
            			System.out.println("Values of b is; " +b);
            			Mainframe_GlobalFunctionLib.pressKey("F3");
            			FunctionalLibrary.enterText(21, 7, "ywrkf");
            			FunctionalLibrary.pressKey("F4");
            			FunctionalLibrary.enterText(5, 37, b);
            			FunctionalLibrary.enterText(6, 39, Library);
            			FunctionalLibrary.pressKey("Enter");
            			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
                        

	}
}
          

