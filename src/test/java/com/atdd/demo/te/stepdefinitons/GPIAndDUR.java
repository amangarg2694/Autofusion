package com.atdd.demo.te.stepdefinitons;

import org.testng.Assert;

import com.atdd.te.screenHelpers.FunctionalLibrary;
import com.cucumber.listener.Reporter;
import com.optumrx.autofusion.core.te.util.Mainframe_GlobalFunctionLib;
import com.optumrx.autofusion.core.te.util.Screenshot;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GPIAndDUR {
	
	@When("^I add a list with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_add_a_list_with(String List, String Description, String DMGenericName, String MedCond, String RespCode, String AgeMin, String AgeMax, String MsgCode) throws Throwable {
	// Write code here that turns the phrase above into concrete actions
	try{
		
	
          Mainframe_GlobalFunctionLib.sendText(9, 20, List);
	      Mainframe_GlobalFunctionLib.sendText(11,20,Description);
	      Mainframe_GlobalFunctionLib.pressKey("Enter");
	  	  Mainframe_GlobalFunctionLib.sendText(16,64,"Y");
	  	  Mainframe_GlobalFunctionLib.pressKey("Enter");
	  	  Mainframe_GlobalFunctionLib.sendText(4,5, List);
	  	  Mainframe_GlobalFunctionLib.pressKey("Enter");
	  	  Mainframe_GlobalFunctionLib.sendText(10,2, "7");
	  	  Mainframe_GlobalFunctionLib.pressKey("Enter");
	  	  Mainframe_GlobalFunctionLib.pressKey("F6");
	  	  Mainframe_GlobalFunctionLib.sendText(5,4, DMGenericName);
	  	  Mainframe_GlobalFunctionLib.pressKey("Enter");
	  	  Mainframe_GlobalFunctionLib.sendText(10,2, "1");
	  	  Mainframe_GlobalFunctionLib.pressKey("Enter");
	  	  Thread.sleep(2000);
	  	  String MsgTxt=Mainframe_GlobalFunctionLib.getText(16,2);
	  	  String MsgTxtAct="Message code";
	  	  if(MsgTxt.equals(MsgTxtAct))
	  	    {
	  		  System.out.println("filed is available");
	  		  //Mainframe_GlobalFunctionLib.sendText(16,20, "1234567890");
	  	     }
	  	  else
	  	   {
	  	 	System.out.println("filed is not available");
	  	   }
	  	  Mainframe_GlobalFunctionLib.click(10, 20);
	  	  Mainframe_GlobalFunctionLib.pressKey("F4");
	  	  
	  	  for (int i = 0; i < 9; i++)
	  	  {
			Mainframe_GlobalFunctionLib.pressKey("PageDown");
		   }
	  	   Mainframe_GlobalFunctionLib.click(15, 2);
	  	   Mainframe_GlobalFunctionLib.sendText(15,2,"1");
	  	   Mainframe_GlobalFunctionLib.pressKey("Enter");
	  	 
		  Mainframe_GlobalFunctionLib.click(11, 20);
		  Mainframe_GlobalFunctionLib.pressKey("F4");
		  Mainframe_GlobalFunctionLib.click(14, 3);
		  Mainframe_GlobalFunctionLib.sendText(14, 3, "1");
		  Mainframe_GlobalFunctionLib.pressKey("Enter");
	  	  
	  	  Mainframe_GlobalFunctionLib.sendText(13,13,AgeMin);
	  	  Mainframe_GlobalFunctionLib.sendText(14,13,AgeMax);
	  	  Thread.sleep(2000);
	  	  Mainframe_GlobalFunctionLib.click(16, 20);
	  	  Mainframe_GlobalFunctionLib.pressKey("F4");
	  	  
	  	  Mainframe_GlobalFunctionLib.sendText(3,6,MsgCode);
	  	Mainframe_GlobalFunctionLib.pressKey("Enter");
	  	Mainframe_GlobalFunctionLib.sendText(7,2, "1");
	  	  Mainframe_GlobalFunctionLib.pressKey("Enter");
	  	Mainframe_GlobalFunctionLib.pressKey("Enter");
	  	  
	  	  Mainframe_GlobalFunctionLib.sendText(11,2, "5");
	  	  Mainframe_GlobalFunctionLib.pressKey("Enter");
	  	}catch(Exception e)
	  	{	
	  	  Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	  	  Assert.fail("Successfully zero value can not be entered and saved for POS Rebate List");
	  	
	       }
  }
	
	@When("^I check GPI Contradictions Override List before performing load with \"([^\"]*)\"$")
	public void i_check_GPI_Contradictions_Override_List_before_performing_load_with(String List) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		
		Mainframe_GlobalFunctionLib.sendText(4,5,List );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(10,2,"7" );
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		for (int i = 0; i < 5; i++) {
			Mainframe_GlobalFunctionLib.pressKey("F12");
		}
	}

	@Then("^Validate the GPI List with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void validate_the_GPI_List_with(String List, String IPfilename, String LibName) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
		Mainframe_GlobalFunctionLib.sendText(7,41,IPfilename);
		Mainframe_GlobalFunctionLib.sendText(8,41,LibName);
		Mainframe_GlobalFunctionLib.pressKey("F6");
		String BatSub=Mainframe_GlobalFunctionLib.getText(24, 2);
		System.out.println(BatSub);
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");		
		Mainframe_GlobalFunctionLib.pressKey("F3");
		
		//Verify the GPI list after load
		
		Mainframe_GlobalFunctionLib.sendText(21,7,"20");
		Mainframe_GlobalFunctionLib.sendText(21,7,"6");
		Mainframe_GlobalFunctionLib.sendText(21,7,"2");
		Mainframe_GlobalFunctionLib.sendText(21,7,"6");
		Mainframe_GlobalFunctionLib.sendText(4,5,List );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(10,2,"7" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		//displaying the first record
		Mainframe_GlobalFunctionLib.sendText(11,2,"5" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("F12");
		//displaying the second record
		Mainframe_GlobalFunctionLib.sendText(13,2,"5" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("F12");
		//displaying the third record
	    Mainframe_GlobalFunctionLib.sendText(15,2,"5" );
	    Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		for (int i = 0; i < 5; i++) {
			Mainframe_GlobalFunctionLib.pressKey("F12");
		}
		
	}
	
	@Then("^validate the report with \"([^\"]*)\"$")
	public void validate_the_report_with(String DURTableName) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.sendText(6,45,DURTableName ); 
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Mainframe_GlobalFunctionLib.sendText(21,7,"ws" ); 
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(11,3,"8" ); 
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(11,3,"5" ); 
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		
		
		
	}

	@Then("^validate the report with \"([^\"]*)\",\"([^\"]*)\"$")
	public void validate_the_report_with(String DUROLType, String DUROList) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.sendText(6,40,DUROLType ); 
		Mainframe_GlobalFunctionLib.sendText(8,40,DUROList ); 
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Mainframe_GlobalFunctionLib.sendText(21,7,"ws" ); 
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(11,3,"8" ); 
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(11,3,"5" ); 
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("Enter");
	}
	
	@When("^I do manual claim with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_do_manual_claim_with(String BIN, String ProcCtrl, String Group, String PharmacyID, String RxNo, String Refill, String fillDate, String MemberID, String ProductID, String DspQty, String DS, String PSC, String Cost) throws Throwable {
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
		Mainframe_GlobalFunctionLib.waitTillReady();
		Mainframe_GlobalFunctionLib.sendText(4, 4, ProductID);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(9, 2,"1" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Thread.sleep(3000);
		Mainframe_GlobalFunctionLib.sendText(12, 11,DspQty );
		Mainframe_GlobalFunctionLib.sendText(12, 26,DS );
		Mainframe_GlobalFunctionLib.sendText(14, 6,PSC );
		Thread.sleep(5000);
		Mainframe_GlobalFunctionLib.sendText(10, 47,Cost );
		//Mainframe_GlobalFunctionLib.sendText(5, 22,qual );
		Mainframe_GlobalFunctionLib.waitTillReady();
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F6");
		
		
		System.out.println("Claim is created");
	} catch (Exception e) {
		// TODO Auto-generated catch block
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Assert.fail("An error has occured while creating the caim transaction.Screenshot is captured");
		
	}
	}



}