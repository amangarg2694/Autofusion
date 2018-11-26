package com.atdd.demo.te.stepdefinitons;

import org.testng.Assert;

import com.cucumber.listener.Reporter;
import com.optumrx.autofusion.core.te.util.Mainframe_GlobalFunctionLib;
import com.optumrx.autofusion.core.te.util.Screenshot;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EncounterRatePricing {
	
	@When("^I do manual claim with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_do_claim_submission_with(String BIN, String ProcCtrl, String Group, String PharmacyID, String RxNo, String Refill, String fillDate, String MemberID, String ProductID, String DspQty, String DS, String PSC, String Cost,String Fee, String UCW) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		try{
					
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Mainframe_GlobalFunctionLib.click(11, 14 );
		Mainframe_GlobalFunctionLib.pressKey("F4");
		Thread.sleep(3000);
		Mainframe_GlobalFunctionLib.sendText(4, 4, BIN);
		Mainframe_GlobalFunctionLib.sendText(4, 11, ProcCtrl);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(10, 2,"1" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(11, 59,Group );
		Mainframe_GlobalFunctionLib.click(12, 14 );
		Mainframe_GlobalFunctionLib.pressKey("F4");
		Thread.sleep(3000);
		Mainframe_GlobalFunctionLib.sendText(4, 4, PharmacyID);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(9, 2,"1" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		
		Mainframe_GlobalFunctionLib.sendText(12, 41,RxNo );
		Mainframe_GlobalFunctionLib.sendText(12, 59,Refill );
		
		Mainframe_GlobalFunctionLib.click(14, 41 );
		Mainframe_GlobalFunctionLib.pressKey("F4");
		Thread.sleep(3000);
		Mainframe_GlobalFunctionLib.sendText(3, 4, MemberID);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		
		Mainframe_GlobalFunctionLib.sendText(8, 2,"1" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		//Mainframe_GlobalFunctionLib.pressKey("Enter");
		Thread.sleep(5000);
		//Mainframe_GlobalFunctionLib.waitTillReady();
		//System.out.println("Reached here");
		//Thread.sleep(5000);
		//Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(4, 65, fillDate+"  ");	
		System.out.println("Entered fill date");
		Mainframe_GlobalFunctionLib.click(11, 20 );
		Mainframe_GlobalFunctionLib.pressKey("F4");
		Mainframe_GlobalFunctionLib.pressKey("F16");
		Mainframe_GlobalFunctionLib.click(4, 4 );
		Mainframe_GlobalFunctionLib.sendText(4, 4, ProductID);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.waitTillReady();
		Mainframe_GlobalFunctionLib.click(9, 2 );
		Mainframe_GlobalFunctionLib.sendText(9, 2,"1" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		//Mainframe_GlobalFunctionLib.sendText(11, 14,"03" );
		
		
		Thread.sleep(3000);
		Mainframe_GlobalFunctionLib.sendText(12, 11,DspQty );
		Mainframe_GlobalFunctionLib.sendText(12, 26,DS );
		Mainframe_GlobalFunctionLib.sendText(14, 6,PSC );
		Thread.sleep(5000);
		Mainframe_GlobalFunctionLib.sendText(10, 47,Cost );
		
		Mainframe_GlobalFunctionLib.sendText(10, 47,Fee );
		Mainframe_GlobalFunctionLib.sendText(20, 47,UCW );
		Mainframe_GlobalFunctionLib.waitTillReady();
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		//Mainframe_GlobalFunctionLib.pressKey("F6");
		
		
		System.out.println("Claim is created");
	} catch (Exception e) {
		// TODO Auto-generated catch block
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Assert.fail("An error has occured while creating the caim transaction.Screenshot is captured");
		
	}
	}

	@Then("^Validate Claim Status with \"([^\"]*)\"$")
	public void validate_Claim_Status_with(String sts) throws Throwable
	{
	    // Write code here that turns the phrase above into concrete actions
		
		try{
			Thread.sleep(2000);
			Mainframe_GlobalFunctionLib.pressKey("F6");
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			String ActStatus=Mainframe_GlobalFunctionLib.getText(21, 2);
			if(ActStatus.equals(sts))
			{
				System.out.println("Claim status is as expected "+sts);
			}
			else
			{
				System.out.println("Claim status is invalid "+ActStatus);
			}
			
		}catch(Exception e) 
		  {
			// TODO Auto-generated catch block
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			Assert.fail("An error has occured while creating the caim transaction.Screenshot is captured");
		
	        }
	}
	
	@Given("^I enter modno$")
	public void i_enter_modno() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    Mainframe_GlobalFunctionLib.sendText(6, 41, "8403");
	    Mainframe_GlobalFunctionLib.pressKey("Enter");
	}
	
	@When("^verify the price schedule with \"([^\"]*)\"$")
	public void verify_the_price_schedule_with(String ScheduleOption) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
		try {
			Mainframe_GlobalFunctionLib.sendText(4, 6, ScheduleOption);
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(10, 2, "2");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Thread.sleep(2000);
			Mainframe_GlobalFunctionLib.pressKey("F15");
			Thread.sleep(2000);
			//String Seq=Mainframe_GlobalFunctionLib.getText(12, 6);
			//System.out.println("The sequence number is---"+Seq);
			Mainframe_GlobalFunctionLib.sendText(12, 2, "5");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.pressKey("PageDown");
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			String EcLimit=Mainframe_GlobalFunctionLib.getText(17, 26);
			System.out.println("Encounter Limit value is "+EcLimit);
			
			for (int i = 0; i < 6; i++) {
				Mainframe_GlobalFunctionLib.pressKey("F12");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			Assert.fail("An error has occured while creating the caim transaction.Screenshot is captured");
		}
		
	}

}



