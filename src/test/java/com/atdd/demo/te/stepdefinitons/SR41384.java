package com.atdd.demo.te.stepdefinitons;

import org.testng.Assert;

import com.atdd.te.screenHelpers.FunctionalLibrary;
import com.cucumber.listener.Reporter;
import com.hp.lft.reportbuilder.Main;
import com.optumrx.autofusion.core.te.util.Mainframe_GlobalFunctionLib;
import com.optumrx.autofusion.core.te.util.Screenshot;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SR41384 {
	
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

       
       @When("^I submit a claim with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
       public void i_submit_a_claim_with(String BIN, String ProcCtrl, String Group, String PharmacyID, String RxNo, String Refill, String FillDate, String MemberID, String ProductID, String DspQty, String DS, String PSC, String Cost, String Fee) throws Throwable {
           // Write code here that turns the phrase above into concrete actions
           
             try{
                    Mainframe_GlobalFunctionLib.sendText(21, 7 ,"3" );
                    Mainframe_GlobalFunctionLib.pressKey("Enter");
                    Mainframe_GlobalFunctionLib.sendText(21, 7 ,"2" );
                    Mainframe_GlobalFunctionLib.pressKey("Enter");
                    Mainframe_GlobalFunctionLib.sendText(21, 7 ,"1" );
                    Mainframe_GlobalFunctionLib.pressKey("Enter");
                    Mainframe_GlobalFunctionLib.pressKey("F6");
                 Mainframe_GlobalFunctionLib.sendText(11, 14,BIN );
                           Mainframe_GlobalFunctionLib.sendText(11, 41,ProcCtrl );
                           Mainframe_GlobalFunctionLib.sendText(11, 59,Group );
                           Mainframe_GlobalFunctionLib.sendText(12, 14,PharmacyID );
                           Mainframe_GlobalFunctionLib.sendText(12, 41,RxNo );
                           Mainframe_GlobalFunctionLib.sendText(12, 59,Refill );
                           //Mainframe_GlobalFunctionLib.sendText(14, 41,MemberID);
                           Mainframe_GlobalFunctionLib.pressKey("Enter");
                           Mainframe_GlobalFunctionLib.click(14, 41 );
                           Mainframe_GlobalFunctionLib.pressKey("F4");
                           Thread.sleep(1000);
                           Mainframe_GlobalFunctionLib.sendText(3, 4, MemberID);
                          /* Mainframe_GlobalFunctionLib.sendText("3","36", "SR41320C1");
                           Mainframe_GlobalFunctionLib.sendText("3","47", "SR41320A1");
                           Mainframe_GlobalFunctionLib.sendText("3","64", "SR41320G1");*/
                           //Mainframe_GlobalFunctionLib.sendText(3, 4, MemberID);
                           Mainframe_GlobalFunctionLib.pressKey("Enter");
                           Mainframe_GlobalFunctionLib.sendText(8, 2,"1" );
                           Mainframe_GlobalFunctionLib.pressKey("Enter");
                           Mainframe_GlobalFunctionLib.sendText(4 , 65 ,"          ");
                           Mainframe_GlobalFunctionLib.sendText(4, 65, FillDate);                    
                           Mainframe_GlobalFunctionLib.sendText(11, 20,ProductID );
                           Mainframe_GlobalFunctionLib.sendText(12, 11,DspQty );
                           Mainframe_GlobalFunctionLib.sendText(12, 26,DS );
                           Mainframe_GlobalFunctionLib.sendText(14, 6,PSC );
                           Mainframe_GlobalFunctionLib.sendText(10, 47,"         " );
                           Mainframe_GlobalFunctionLib.sendText(10, 47,Cost );
                           Mainframe_GlobalFunctionLib.sendText(11, 51, Fee);
                           Mainframe_GlobalFunctionLib.pressKey("Enter");
                           Mainframe_GlobalFunctionLib.pressKey("F6");
                           String Claimnumber= Mainframe_GlobalFunctionLib.getText(20,12);
                           System.out.println("Claimnumber is: "+Claimnumber);


                          
                           
                           
             }catch(Exception e)
                                 {       Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
                                        Assert.fail("An error has occured while creating the caim transaction.Screenshot is captured");
                                        
                                 }      
       
             
       }
       @When("^I select Active Plan in \"([^\"]*)\" to check the Plan Status as P & Drug status as G$")
       public void i_select_Active_Plan_in_to_check_the_Plan_Status_as_P_Drug_status_as_G(String arg1) throws Throwable {
             // Write code here that turns the phrase above into concrete actions
         Mainframe_GlobalFunctionLib.sendText(4, 5, "SR41320P");
         Mainframe_GlobalFunctionLib.pressKey("Enter");
         Mainframe_GlobalFunctionLib.sendText(11, 2, "5");
         Mainframe_GlobalFunctionLib.pressKey("Enter");
         Mainframe_GlobalFunctionLib.pressKey("F3");
         Mainframe_GlobalFunctionLib.pressKey("F3");
         Mainframe_GlobalFunctionLib.pressKey("F3");
         
       }
       @When("^I select Active Plan in \"([^\"]*)\" to check the Plan Status as S & Drug status as G$")
       public void i_select_Active_Plan_in_to_check_the_Plan_Status_as_S_Drug_status_as_G(String arg1) throws Throwable {
           // Write code here that turns the phrase above into concrete actions
             Mainframe_GlobalFunctionLib.sendText(4, 5, "SR41320S");
               Mainframe_GlobalFunctionLib.pressKey("Enter");
               Mainframe_GlobalFunctionLib.sendText(11, 2, "5");
               Mainframe_GlobalFunctionLib.pressKey("Enter");
               Mainframe_GlobalFunctionLib.pressKey("F3");
               Mainframe_GlobalFunctionLib.pressKey("F3");
               Mainframe_GlobalFunctionLib.pressKey("F3");
       }


@When("^I select Active Product to set Multi source ind as M$")
public void i_select_Active_Product_to_set_Multi_source_ind_as_M() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
       Mainframe_GlobalFunctionLib.sendText(4, 5, "PROCRIT");
       Mainframe_GlobalFunctionLib.pressKey("Enter");
       Mainframe_GlobalFunctionLib.sendText(9, 2, "7");
       Mainframe_GlobalFunctionLib.pressKey("Enter");
       Mainframe_GlobalFunctionLib.pressKey("PageDown");
       Mainframe_GlobalFunctionLib.sendText(16, 2, "5");
       Mainframe_GlobalFunctionLib.pressKey("Enter");
       Mainframe_GlobalFunctionLib.pressKey("F3");
       Mainframe_GlobalFunctionLib.pressKey("F3");
       Mainframe_GlobalFunctionLib.pressKey("F3");
}
@When("^I select Active Product to set Multi source ind as N$")
public void i_select_Active_Product_to_set_Multi_source_ind_as_N() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
       Mainframe_GlobalFunctionLib.sendText(4, 5, "QUINIDINE GLLUCONATE");
       Mainframe_GlobalFunctionLib.pressKey("Enter");
       Mainframe_GlobalFunctionLib.sendText(9, 2, "7");
       Mainframe_GlobalFunctionLib.pressKey("Enter");
       Mainframe_GlobalFunctionLib.sendText(15, 2, "5");
       Mainframe_GlobalFunctionLib.pressKey("Enter");
       Mainframe_GlobalFunctionLib.pressKey("F3");
       Mainframe_GlobalFunctionLib.pressKey("F3");
       Mainframe_GlobalFunctionLib.pressKey("F3");
}
@When("^I select Active Product to set Multi source ind as O$")
public void i_select_Active_Product_to_set_Multi_source_ind_as_O() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
       Mainframe_GlobalFunctionLib.sendText(4, 5, "LIPITOR");
       Mainframe_GlobalFunctionLib.pressKey("Enter");
       Mainframe_GlobalFunctionLib.sendText(9, 2, "7");
       Mainframe_GlobalFunctionLib.pressKey("Enter");
       Mainframe_GlobalFunctionLib.sendText(15, 2, "5");
       Mainframe_GlobalFunctionLib.pressKey("Enter");
       Mainframe_GlobalFunctionLib.pressKey("F3");
       Mainframe_GlobalFunctionLib.pressKey("F3");
       Mainframe_GlobalFunctionLib.pressKey("F3");
}
@When("^I select Active Product to set Multi source ind as Y$")
public void i_select_Active_Product_to_set_Multi_source_ind_as_Y() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
       Mainframe_GlobalFunctionLib.sendText(4, 5, "SR 31738 TEST SR");
       Mainframe_GlobalFunctionLib.pressKey("Enter");
       Mainframe_GlobalFunctionLib.sendText(9, 2, "7");
       Mainframe_GlobalFunctionLib.pressKey("Enter");
       Mainframe_GlobalFunctionLib.sendText(15, 2, "5");
       Mainframe_GlobalFunctionLib.pressKey("Enter");
       Mainframe_GlobalFunctionLib.pressKey("F3");
       Mainframe_GlobalFunctionLib.pressKey("F3");
       Mainframe_GlobalFunctionLib.pressKey("F3");
    }
@When("^I enter values for \"([^\"]*)\"$")
public void i_enter_values_for(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
       Mainframe_GlobalFunctionLib.sendText(7, 33, "081618");
       Mainframe_GlobalFunctionLib.pressKey("Enter");
       Mainframe_GlobalFunctionLib.sendText(24, 73, "Y");
       //Mainframe_GlobalFunctionLib.pressKey("Enter");
       Mainframe_GlobalFunctionLib.pressKey("F6");
       Mainframe_GlobalFunctionLib.sendText(24, 73, "Y");
       //Mainframe_GlobalFunctionLib.pressKey("Enter");
       Mainframe_GlobalFunctionLib.pressKey("F3");
       }


@When("^I enter values \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
public void i_enter_values(String DateFrom, String DateThru, String CarrierFrom, String CarrierThru, String ProdList, String SponserCode, String Filename, String Libname) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
       Mainframe_GlobalFunctionLib.sendText(5, 33, DateFrom);
    Mainframe_GlobalFunctionLib.sendText(5, 53, DateThru);
    Mainframe_GlobalFunctionLib.sendText(6, 33, CarrierFrom);
    Mainframe_GlobalFunctionLib.sendText(6, 53, CarrierThru);
    Mainframe_GlobalFunctionLib.sendText(11, 33, ProdList);
    Mainframe_GlobalFunctionLib.sendText(12, 33, SponserCode);
    Mainframe_GlobalFunctionLib.sendText(18, 33, Filename);
    Mainframe_GlobalFunctionLib.sendText(19, 33, Libname);
    Mainframe_GlobalFunctionLib.pressKey("Enter");
    Mainframe_GlobalFunctionLib.pressKey("F6");
    }
@When("^I enter values \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
public void i_enter_values(String DateFrom, String DateThru, String CarrierFrom, String CarrierThru, String AccFrom, String AccThru, String GrpFrom,String GrpThru, String Filename, String Libname) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
       Mainframe_GlobalFunctionLib.sendText(5, 37, DateFrom);
    Mainframe_GlobalFunctionLib.sendText(5, 57, DateThru);
    Mainframe_GlobalFunctionLib.sendText(6, 37, CarrierFrom);
    Mainframe_GlobalFunctionLib.sendText(6, 57, CarrierThru);
    Mainframe_GlobalFunctionLib.sendText(7, 37, AccFrom);
    Mainframe_GlobalFunctionLib.sendText(7, 57, AccThru);
    Mainframe_GlobalFunctionLib.sendText(8, 37, GrpFrom);
    Mainframe_GlobalFunctionLib.sendText(8, 57, GrpThru);
    Mainframe_GlobalFunctionLib.sendText(20, 37, Filename);
    Mainframe_GlobalFunctionLib.sendText(21, 37, Libname);
    Mainframe_GlobalFunctionLib.pressKey("Enter");
    Mainframe_GlobalFunctionLib.pressKey("F6");
    Mainframe_GlobalFunctionLib.sendText(16, 64, "Y");
    Mainframe_GlobalFunctionLib.pressKey("Enter");
    }
@When("^I enter values \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"\"([^\"]*)\",\"([^\"]*)\"$")
public void i_enter_values(String DateFrom, String DateThru, String CarrierFrom, String CarrierThru, String AccFrom, String AccThru, String GrpFrom,String GrpThru,String ExRej,String Pricing, String Filename, String Libname) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
       Mainframe_GlobalFunctionLib.sendText(5, 21, DateFrom);
    Mainframe_GlobalFunctionLib.sendText(5, 39, DateThru);
    Mainframe_GlobalFunctionLib.sendText(6, 21, CarrierFrom);
    Mainframe_GlobalFunctionLib.sendText(6, 39, CarrierThru);
    Mainframe_GlobalFunctionLib.sendText(7, 21, AccFrom);
    Mainframe_GlobalFunctionLib.sendText(7, 39, AccThru);
    Mainframe_GlobalFunctionLib.sendText(8, 21, GrpFrom);
    Mainframe_GlobalFunctionLib.sendText(8, 39, GrpThru);
    Mainframe_GlobalFunctionLib.sendText(10, 21, ExRej);
    Mainframe_GlobalFunctionLib.sendText(11, 21, Pricing);
    Mainframe_GlobalFunctionLib.sendText(19, 21, Filename);
    Mainframe_GlobalFunctionLib.sendText(20, 21, Libname);
    Mainframe_GlobalFunctionLib.pressKey("Enter");
    Mainframe_GlobalFunctionLib.pressKey("F6");
   }

@When("^I submit the job & verify the records$")
public void i_submit_the_job_verify_the_records() throws Throwable {
       
       
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
       Mainframe_GlobalFunctionLib.sendText(21, 7, "6");
       Mainframe_GlobalFunctionLib.pressKey("Enter");
       Mainframe_GlobalFunctionLib.sendText(6, 41, "8402");
       Mainframe_GlobalFunctionLib.pressKey("Enter");
       
}

@When("^I submit the \"([^\"]*)\" for Claimfile(\\d+)$")
public void i_submit_the_for_Claimfile(String arg1, int arg2) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
       /*Mainframe_GlobalFunctionLib.sendText(21, 7, "WS");
       Mainframe_GlobalFunctionLib.pressKey("Enter");
       Thread.sleep(3000);
       Mainframe_GlobalFunctionLib.pressKey("F5");
       Mainframe_GlobalFunctionLib.sendText(11, 3, "8");
       Mainframe_GlobalFunctionLib.pressKey("Enter");
       Mainframe_GlobalFunctionLib.sendText(12, 3, "5");
       Mainframe_GlobalFunctionLib.pressKey("Enter");
       Mainframe_GlobalFunctionLib.sendText(3, 22, "W30");
       Mainframe_GlobalFunctionLib.pressKey("Enter");
       Mainframe_GlobalFunctionLib.pressKey("PageDown");
       Mainframe_GlobalFunctionLib.pressKey("PageDown");
       Mainframe_GlobalFunctionLib.pressKey("F12");*/
   
}

@Then("^I verify the \"([^\"]*)\"(\\d+)\"([^\"]*)\"$")
public void i_verify_the(String arg1, int arg2, String arg3) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
       Mainframe_GlobalFunctionLib.sendText(22, 7, "runqry *n usrsandeep/sr41384f1");
       Mainframe_GlobalFunctionLib.pressKey("Enter");
       Mainframe_GlobalFunctionLib.sendText(3, 74, "125");
       Mainframe_GlobalFunctionLib.pressKey("Enter");
       Mainframe_GlobalFunctionLib.click(4, 29);
       Mainframe_GlobalFunctionLib.pressKey("F21");
       Mainframe_GlobalFunctionLib.PressTabKey();
       Mainframe_GlobalFunctionLib.sendText(3, 74, "310");
       Mainframe_GlobalFunctionLib.pressKey("Enter");
}
@Then("^I verify the \"([^\"]*)\"D\"([^\"]*)\"$")
public void i_verify_the_D(String arg1, String arg2) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
       Mainframe_GlobalFunctionLib.sendText(21, 7, "runqry *n usrsandeep/sr41384f1");
       Mainframe_GlobalFunctionLib.pressKey("Enter");
       Mainframe_GlobalFunctionLib.sendText(3, 74, "125");
       Mainframe_GlobalFunctionLib.pressKey("Enter");
       Mainframe_GlobalFunctionLib.click(4, 29);
       Mainframe_GlobalFunctionLib.pressKey("F21");
       Mainframe_GlobalFunctionLib.PressTabKey();
       Mainframe_GlobalFunctionLib.sendText(3, 74, "310");
       Mainframe_GlobalFunctionLib.pressKey("Enter");
   
}

@Then("^I verify the \"([^\"]*)\"(\\d+)\" should be populated at (\\d+) position in BCBSAZ Paid Claim File(\\d+)$")
public void i_verify_the_should_be_populated_at_position_in_BCBSAZ_Paid_Claim_File(String arg1, int arg2, int arg3, int arg4) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
       Mainframe_GlobalFunctionLib.sendText(21, 7, "runqry *n usrsandeep/sr41320sh");
       Mainframe_GlobalFunctionLib.pressKey("Enter");
       Mainframe_GlobalFunctionLib.sendText(3, 74, "32");
       Mainframe_GlobalFunctionLib.pressKey("Enter");
       Mainframe_GlobalFunctionLib.click(4, 25);
       Mainframe_GlobalFunctionLib.pressKey("F21");
       Mainframe_GlobalFunctionLib.PressTabKey();
       Mainframe_GlobalFunctionLib.sendText(3, 74, "247");
       Mainframe_GlobalFunctionLib.pressKey("Enter");
       
}
@Then("^I verify the \"([^\"]*)\"D\" should be populated at (\\d+) position in BCBSAZ Paid Claim File(\\d+)$")
public void i_verify_the_D_should_be_populated_at_position_in_BCBSAZ_Paid_Claim_File(String arg1, int arg2, int arg3) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
       Mainframe_GlobalFunctionLib.sendText(21, 7, "runqry *n usrsandeep/sr41384f2");
       Mainframe_GlobalFunctionLib.pressKey("Enter");
       Mainframe_GlobalFunctionLib.sendText(3, 74, "32");
       Mainframe_GlobalFunctionLib.pressKey("Enter");
       Mainframe_GlobalFunctionLib.click(4, 25);
       Mainframe_GlobalFunctionLib.pressKey("F21");
       Mainframe_GlobalFunctionLib.PressTabKey();
       Mainframe_GlobalFunctionLib.sendText(3, 74, "247");
       Mainframe_GlobalFunctionLib.pressKey("Enter");
       Mainframe_GlobalFunctionLib.pressKey("PageDown");
       Mainframe_GlobalFunctionLib.pressKey("PageDown");
       
}


@Then("^I verify the \"([^\"]*)\"(\\d+)\" should be populated at (\\d+) position in BCBSAZ Custom Claim Extract file$")
public void i_verify_the_should_be_populated_at_position_in_BCBSAZ_Custom_Claim_Extract_file(String arg1, int arg2, int arg3) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
       Mainframe_GlobalFunctionLib.sendText(21, 7, "runqry *n usrsandeep/sr41320ds");
       Mainframe_GlobalFunctionLib.pressKey("Enter");
       Mainframe_GlobalFunctionLib.click(4, 23);
       Mainframe_GlobalFunctionLib.pressKey("F21");
       Mainframe_GlobalFunctionLib.PressTabKey();
       Mainframe_GlobalFunctionLib.sendText(3, 74, "5192");
       Mainframe_GlobalFunctionLib.pressKey("Enter");
       }

@Then("^I verify the \"([^\"]*)\"D\" should be populated at (\\d+) position in BCBSAZ Custom Claim Extract file$")
public void i_verify_the_D_should_be_populated_at_position_in_BCBSAZ_Custom_Claim_Extract_file(String arg1, int arg2) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
       Mainframe_GlobalFunctionLib.sendText(21, 7, "runqry *n usrsandeep/sr41320ds");
       Mainframe_GlobalFunctionLib.pressKey("Enter");
       Mainframe_GlobalFunctionLib.click(4, 24);
       Mainframe_GlobalFunctionLib.pressKey("F21");
       Mainframe_GlobalFunctionLib.PressTabKey();
       Mainframe_GlobalFunctionLib.sendText(3, 74, "5192");
       Mainframe_GlobalFunctionLib.pressKey("Enter");
       Mainframe_GlobalFunctionLib.pressKey("PageDown");
      
    
}
}

