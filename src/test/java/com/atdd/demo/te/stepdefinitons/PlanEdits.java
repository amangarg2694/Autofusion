package com.atdd.demo.te.stepdefinitons;

import org.testng.Assert;

import com.cucumber.listener.Reporter;
import com.optumrx.autofusion.core.te.util.Mainframe_GlobalFunctionLib;
import com.optumrx.autofusion.core.te.util.Screenshot;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class PlanEdits {

	public static String Claimnumber;

@Given("^I enter \"([^\"]*)\" name in the Active Plan by Plan Code Menu$")
public void i_enter_name_in_the_Active_Plan_by_Plan_Code_Menu(String Plan) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    Mainframe_GlobalFunctionLib.sendText(4, 5, Plan);
    Mainframe_GlobalFunctionLib.pressKey("Enter");
    Mainframe_GlobalFunctionLib.sendText(11, 2, "2");
    Mainframe_GlobalFunctionLib.pressKey("Enter");
    Mainframe_GlobalFunctionLib.pressKey("F10");
    Mainframe_GlobalFunctionLib.sendText(12, 2, "5");
    Mainframe_GlobalFunctionLib.pressKey("Enter");
   /* Mainframe_GlobalFunctionLib.pressKey("F6");
    Mainframe_GlobalFunctionLib.pressKey("F4");
    Mainframe_GlobalFunctionLib.pressKey("PageDown");
    Mainframe_GlobalFunctionLib.pressKey("PageDown");
    Mainframe_GlobalFunctionLib.pressKey("PageDown");
    Mainframe_GlobalFunctionLib.sendText(9, 30, "X");
    Mainframe_GlobalFunctionLib.pressKey("Enter");
    Mainframe_GlobalFunctionLib.pressKey("Enter");
    Mainframe_GlobalFunctionLib.pressKey("F4");
    Mainframe_GlobalFunctionLib.sendText(3, 6, "SRGMSG");
    Mainframe_GlobalFunctionLib.pressKey("Enter");
    Mainframe_GlobalFunctionLib.sendText(7, 2, "1");
    Mainframe_GlobalFunctionLib.pressKey("Enter");
    Mainframe_GlobalFunctionLib.pressKey("F12");
    Mainframe_GlobalFunctionLib.pressKey("F7");
    Mainframe_GlobalFunctionLib.sendText(7, 21, "10");
    Mainframe_GlobalFunctionLib.pressKey("Enter");
    Mainframe_GlobalFunctionLib.sendText(11, 2, "7");
    Mainframe_GlobalFunctionLib.pressKey("Enter");
    Mainframe_GlobalFunctionLib.pressKey("F6");
    Mainframe_GlobalFunctionLib.pressKey("F16");
    Mainframe_GlobalFunctionLib.sendText(7, 4, "00378251278");
    Mainframe_GlobalFunctionLib.pressKey("Enter");
    Mainframe_GlobalFunctionLib.sendText(12, 2, "1");
    Mainframe_GlobalFunctionLib.pressKey("Enter");
    Mainframe_GlobalFunctionLib.sendText(6, 78, "K");
    Mainframe_GlobalFunctionLib.pressKey("Enter");
    Mainframe_GlobalFunctionLib.pressKey("F12");*/
    }
@Given("^I wait for \"([^\"]*)\" on the \"([^\"]*)\"$")
public void i_wait_for_on_the(String arg1, String arg2) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    Thread.sleep(3000);
    Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
    }
@When("^I select Option (\\d+) to check Paid/Captured Claim Response$")
public void i_select_Option_to_check_Paid_Captured_Claim_Response(int arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    Mainframe_GlobalFunctionLib.sendText(4, 23, "6");
    Mainframe_GlobalFunctionLib.pressKey("Enter");
}

@When("^I will submit a claim with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
public void i_submit_a_claim_with(String BIN, String ProcCtrl, String Group, String PharmacyID, String RxNo, String Refill, String FillDate, String MemberID, String ProductID, String DspQty, String DS, String PSC, String Cost, String Due, String UCW) throws Throwable {
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
                  Mainframe_GlobalFunctionLib.sendText(19, 47, Due);
                  Mainframe_GlobalFunctionLib.sendText(20, 47, UCW);
                  Mainframe_GlobalFunctionLib.pressKey("Enter");
                  Mainframe_GlobalFunctionLib.pressKey("F6");
                  String Claimnumber= Mainframe_GlobalFunctionLib.getText(20,12);
                  System.out.println("Claimnumber is: "+Claimnumber);


                 
                  
                  
    }catch(Exception e)
                        {       Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
                               Assert.fail("An error has occured while creating the caim transaction.Screenshot is captured");
                               
                        }      

    
    
}}