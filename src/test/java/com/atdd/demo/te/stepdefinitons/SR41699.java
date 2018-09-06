package com.atdd.demo.te.stepdefinitons;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.testng.Assert;

import com.atdd.te.screenHelpers.FunctionalLibrary;
import com.cucumber.listener.Reporter;
import com.optumrx.autofusion.core.te.util.Mainframe_GlobalFunctionLib;
import com.optumrx.autofusion.core.te.util.Screenshot;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SR41699 {

	@When("^I Create a plan with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_Create_a_plan_with(String EXGPLAN, String CPYPLAN, String PFrom, String PDesc) throws Throwable {

		// Write code here that turns the phrase above into concrete actions

			Mainframe_GlobalFunctionLib.sendText(21, 7,"4");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(21, 7,"1");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			
			Mainframe_GlobalFunctionLib.sendText(4, 5,EXGPLAN);
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(11, 2,"3");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(11, 25,CPYPLAN);
			Mainframe_GlobalFunctionLib.sendText(12, 25,PFrom);
			Mainframe_GlobalFunctionLib.sendText(13, 25,PDesc);
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			Mainframe_GlobalFunctionLib.pressKey("F3");
			Mainframe_GlobalFunctionLib.pressKey("F3");
			Mainframe_GlobalFunctionLib.pressKey("F3");
			Mainframe_GlobalFunctionLib.pressKey("F3");
			Mainframe_GlobalFunctionLib.sendText(21, 7,"20");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
	}
	
	@When("^I Create a Troop Schedule with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\", \"([^\"]*)\" using the copy of existing Troop schedule$")
	public void i_Create_a_Troop_Schedule_with_using_the_copy_of_existing_Troop_schedule(String EXGTroopSc, String CPYTroopSc, String CPYTroopScDesc, String TroopAmt1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		    Thread.sleep(3000);
		    Mainframe_GlobalFunctionLib.sendText(21, 7,"5");
		    Mainframe_GlobalFunctionLib.pressKey("Enter");
		    Mainframe_GlobalFunctionLib.sendText(21, 7,"3");
		    Mainframe_GlobalFunctionLib.pressKey("Enter");
		    Mainframe_GlobalFunctionLib.sendText(21, 7,"5");
		    Mainframe_GlobalFunctionLib.pressKey("Enter");
		    Mainframe_GlobalFunctionLib.sendText(21, 7,"1");
		    Mainframe_GlobalFunctionLib.pressKey("Enter");
		    Mainframe_GlobalFunctionLib.click(4, 5 );
		    Mainframe_GlobalFunctionLib.sendText(4, 5,EXGTroopSc);
		    Mainframe_GlobalFunctionLib.pressKey("Enter");
		    Mainframe_GlobalFunctionLib.sendText(10, 2,"3");
		    Mainframe_GlobalFunctionLib.pressKey("Enter");
		    Mainframe_GlobalFunctionLib.sendText(9, 22,CPYTroopSc);
			Mainframe_GlobalFunctionLib.sendText(10, 22,CPYTroopScDesc);
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			// Edit new Troop schedule
			Mainframe_GlobalFunctionLib.sendText(10, 2,"2");
		    Mainframe_GlobalFunctionLib.pressKey("Enter");
		    Mainframe_GlobalFunctionLib.pressKey("F7");
		    Mainframe_GlobalFunctionLib.sendText(16, 2,"2"); // Update Step1 option
		    Mainframe_GlobalFunctionLib.pressKey("Enter");
		    Mainframe_GlobalFunctionLib.click(10, 28 );
		    Mainframe_GlobalFunctionLib.sendText("10","28", "          ");
		    Mainframe_GlobalFunctionLib.sendText(10, 28,TroopAmt1);
		    Mainframe_GlobalFunctionLib.pressKey("Enter");
		    Mainframe_GlobalFunctionLib.pressKey("F3");
		    Thread.sleep(3000);
		    Mainframe_GlobalFunctionLib.sendText(17, 2,"2"); // Update Step2 option
		    Mainframe_GlobalFunctionLib.pressKey("Enter");
		    Mainframe_GlobalFunctionLib.click(10, 28 );
		    Mainframe_GlobalFunctionLib.sendText("10","28", "          ");
		    Mainframe_GlobalFunctionLib.sendText(10, 28,TroopAmt1);
		    Mainframe_GlobalFunctionLib.pressKey("Enter");
		    Mainframe_GlobalFunctionLib.pressKey("F3");
		    Thread.sleep(3000);
		    Mainframe_GlobalFunctionLib.sendText(18, 2,"2"); // Update Step3 option
		    Mainframe_GlobalFunctionLib.pressKey("Enter");
		    Mainframe_GlobalFunctionLib.click(10, 28 );
		    Mainframe_GlobalFunctionLib.sendText("10","28", "          ");
		    Mainframe_GlobalFunctionLib.sendText(10, 28,TroopAmt1);
		    Mainframe_GlobalFunctionLib.pressKey("Enter");
		    Mainframe_GlobalFunctionLib.pressKey("F3");
		    Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		    
			Mainframe_GlobalFunctionLib.pressKey("F3");
			Mainframe_GlobalFunctionLib.pressKey("F3");
			Mainframe_GlobalFunctionLib.pressKey("F3");
			Mainframe_GlobalFunctionLib.sendText(21, 7,"20"); 
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Thread.sleep(3000);
	}
	
	@When("^I attached New Troop Schedule to the plan with \"([^\"]*)\", \"([^\"]*)\"$")
	public void i_attached_New_Troop_Schedule_to_the_plan_with(String CPYPLAN, String CPYTroopSc) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
			Mainframe_GlobalFunctionLib.sendText(21, 7,"4");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(21, 7,"1");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Thread.sleep(3000);
			Mainframe_GlobalFunctionLib.sendText(4, 5,CPYPLAN);
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Thread.sleep(1000);
			Mainframe_GlobalFunctionLib.sendText(11, 2,"2");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.pressKey("F7");
			Thread.sleep(1000);
			Mainframe_GlobalFunctionLib.sendText(7, 21,"29");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(15, 12,"6");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(12, 2,"2");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Thread.sleep(3000);
			Mainframe_GlobalFunctionLib.click(14, 28 );
			Thread.sleep(1000);
			Mainframe_GlobalFunctionLib.sendText("14","28", "          ");
			Thread.sleep(1000);
			Mainframe_GlobalFunctionLib.pressKey("F4");
		    Thread.sleep(3000);
		    Mainframe_GlobalFunctionLib.sendText(4, 5,CPYTroopSc);
		    Mainframe_GlobalFunctionLib.pressKey("Enter");
		    Mainframe_GlobalFunctionLib.sendText(9, 2,"1");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			
			Mainframe_GlobalFunctionLib.pressKey("F3");
			Mainframe_GlobalFunctionLib.pressKey("F3");
			Mainframe_GlobalFunctionLib.pressKey("F3");
			Mainframe_GlobalFunctionLib.sendText(21, 7,"20"); 
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Thread.sleep(3000);

	}

	@Given("^I create Member \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_create_Member(String carrierID, String accountID, String groupID, String memberID, String firstname, String lastname, String dob, String memFromDate, String memThruDate) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
			try {
				FunctionalLibrary.navigateToRxClaimPlanAdministrator();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Thread.sleep(2000);	
			//Mainframe_GlobalFunctionLib.sendText(21, 7 ,"20" );;
			Mainframe_GlobalFunctionLib.sendText(21, 7 ,"1" );;
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(21, 7 ,"2" );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.pressKey("F6");
			Thread.sleep(1000);
			Mainframe_GlobalFunctionLib.sendText(4, 10,carrierID);
			Thread.sleep(1000);
			Mainframe_GlobalFunctionLib.sendText(5, 10,accountID);
			Thread.sleep(1000);
			Mainframe_GlobalFunctionLib.sendText(6, 10,groupID);
			Thread.sleep(1000);
			Mainframe_GlobalFunctionLib.sendText(7, 10,memberID);
			Thread.sleep(1000);
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(6, 29,firstname);
			Thread.sleep(1000);
			Mainframe_GlobalFunctionLib.sendText(6, 57,lastname);
			Thread.sleep(1000);
			Mainframe_GlobalFunctionLib.sendText(7, 10,"003" );
			Thread.sleep(1000);
			Mainframe_GlobalFunctionLib.sendText(7, 18,"1" );
			Thread.sleep(1000);
			Mainframe_GlobalFunctionLib.sendText(7, 33,"M");
			Thread.sleep(1000);
			Mainframe_GlobalFunctionLib.sendText(14, 27,"12416");
			Thread.sleep(1000);
			Mainframe_GlobalFunctionLib.sendText(7, 40,dob);
			Thread.sleep(1000);
			Mainframe_GlobalFunctionLib.sendText(20, 2,memFromDate);
			Thread.sleep(1000);
			Mainframe_GlobalFunctionLib.sendText(20, 12,memThruDate);
			Thread.sleep(1000);
			Thread.sleep(1000);
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Thread.sleep(1000);
			Mainframe_GlobalFunctionLib.sendText(16, 64,"Y" );
			Thread.sleep(1000);
			Thread.sleep(1000);
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Thread.sleep(1000);
			Mainframe_GlobalFunctionLib.pressKey("F12");
			Mainframe_GlobalFunctionLib.pressKey("F12");
			Mainframe_GlobalFunctionLib.pressKey("F12");
			Mainframe_GlobalFunctionLib.pressKey("F12");
			Thread.sleep(2000);
	}
	
	@Given("^I submit a Claim with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_submit_a_Claim_with(String bin, String proc, String group, String pharmacyID, String rxNbr, String refill, String memberID, String fillDate, String productId, String dspQty, String ds, String psc, String cost, String due) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
		try {
			FunctionalLibrary.navigateToRxClaimPlanAdministrator();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
			Thread.sleep(1000);
			Mainframe_GlobalFunctionLib.sendText(21, 7 ,"3" );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Thread.sleep(1000);
			Mainframe_GlobalFunctionLib.sendText(21, 7 ,"2" );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Thread.sleep(1000);
			Mainframe_GlobalFunctionLib.sendText(21, 7 ,"1" );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Thread.sleep(1000);
	
		
			
			Mainframe_GlobalFunctionLib.pressKey("F6");
			Thread.sleep(2000);
			Mainframe_GlobalFunctionLib.sendText(11, 14,bin );
			Thread.sleep(1000);
			Mainframe_GlobalFunctionLib.sendText(11, 41,proc );
			Thread.sleep(1000);
			Mainframe_GlobalFunctionLib.sendText(11, 59,group );
			Thread.sleep(1000);
			Mainframe_GlobalFunctionLib.sendText(12, 14,pharmacyID );
			Thread.sleep(1000);
			Mainframe_GlobalFunctionLib.sendText(12, 41,rxNbr );
			Thread.sleep(1000);
			Mainframe_GlobalFunctionLib.sendText(12, 59,refill );
			Thread.sleep(1000);
			//Mainframe_GlobalFunctionLib.click(14, 14 );
			//Mainframe_GlobalFunctionLib.sendText(14, 14,"          " );
			//Mainframe_GlobalFunctionLib.sendText(14, 14, fillDate);	
			Mainframe_GlobalFunctionLib.sendText(14, 41,memberID );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Thread.sleep(3000);
			Mainframe_GlobalFunctionLib.click(7, 12 );
			Thread.sleep(2000);
			Mainframe_GlobalFunctionLib.pressKey("F4");
			Thread.sleep(2000);
			Mainframe_GlobalFunctionLib.click(3, 4 );
			Thread.sleep(2000);
			Mainframe_GlobalFunctionLib.sendText(3, 4, memberID);
			Thread.sleep(2000);
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Thread.sleep(2000);
			Mainframe_GlobalFunctionLib.click(8, 2 );
			Thread.sleep(2000);
			Mainframe_GlobalFunctionLib.sendText(8, 2,"1" );
			Thread.sleep(2000);
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Thread.sleep(2000);
			Mainframe_GlobalFunctionLib.click(4, 65 );
			Mainframe_GlobalFunctionLib.sendText(4 , 65 ,"          ");
			Thread.sleep(2000);
			Mainframe_GlobalFunctionLib.sendText(4, 65, fillDate);	
			Thread.sleep(2000);
			Mainframe_GlobalFunctionLib.sendText(11, 20,productId );
			Mainframe_GlobalFunctionLib.sendText(12, 11,dspQty );
			Thread.sleep(2000);
			Mainframe_GlobalFunctionLib.sendText(12, 26,ds );
			Thread.sleep(2000);
			Mainframe_GlobalFunctionLib.sendText(14, 6,psc );
			Mainframe_GlobalFunctionLib.sendText(10, 47,"         " );
			Mainframe_GlobalFunctionLib.sendText(10, 47,cost );
			Thread.sleep(500);
			Mainframe_GlobalFunctionLib.sendText(19, 47,due );
			Thread.sleep(500);
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Thread.sleep(1000);
			Mainframe_GlobalFunctionLib.pressKey("F6");
			Thread.sleep(1000);
			Mainframe_GlobalFunctionLib.pressKey("F7");
			Thread.sleep(1000);
			
			//Capture data in screen Price Information Page 1 of 3
			Mainframe_GlobalFunctionLib.pressKey("F15");
			
			//Capture data in screen Accumulator Information by F10=Accum Info
			Mainframe_GlobalFunctionLib.pressKey("F10");
			
			//Capture data in screen Accumulation Schedule Detail by F10=Accum Schedules
			Mainframe_GlobalFunctionLib.pressKey("F10");
			
			//Capture data in screen "Covered Plan Pay Accumulation Schedule Detail" by F16=CPP Detail
			
			Mainframe_GlobalFunctionLib.pressKey("F16");
			String ActCPPAMT= Mainframe_GlobalFunctionLib.getText(10, 69);
			String ExpCPPAMT="300";
			
			if(ActCPPAMT.equals(ExpCPPAMT)) 
			{
				System.out.println("Test Passed:Amount is correct: "+ActCPPAMT);
				
			}
			else
			{
				System.out.println("Test Failed:Amount is incorrect: "+ActCPPAMT);	
				Assert.fail("The Amount "+ ExpCPPAMT +" does not match on the screen.Screenshot captured.");
			}
	}
}
