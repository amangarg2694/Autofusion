package com.atdd.demo.te.stepdefinitons;
import org.testng.Assert;

import com.atdd.te.screenHelpers.FunctionalLibrary;
import com.cucumber.listener.Reporter;
import com.optumrx.autofusion.core.te.util.Mainframe_GlobalFunctionLib;
import com.optumrx.autofusion.core.te.util.Screenshot;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ContingentTherapySchedule {
	
	@Then("^validate new field values under Schedule Met with \"([^\"]*)\",\"([^\"]*)\"$")
	public void validate_new_field_values_under_Schedule_Met_with(String MessageCode, String MessageType) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		String  MsgCd=Mainframe_GlobalFunctionLib.getText(8, 2);
		String MsgType=Mainframe_GlobalFunctionLib.getText(9, 2);
		Mainframe_GlobalFunctionLib.sendText(8, 17, MessageCode);
		Mainframe_GlobalFunctionLib.sendText(9, 17, MessageType);
		Thread.sleep(2000);
	    System.out.println(MsgCd);
		if(MsgCd.equals("Message Code") && MsgType.equals("Message Type") )
		{
			System.out.println("Message Code & Message Type fields are available");
		}
		else{
			System.out.println("Message Code & Message Type fields are not available");
		}
	}
	
	@Then("^verify new field values under Schedule UnMet with \"([^\"]*)\",\"([^\"]*)\"$")
	public void verify_new_field_values_under_Schedule_UnMet_with(String MessageCode, String MessageType) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String  MsgCd=Mainframe_GlobalFunctionLib.getText(12, 2);
		String MsgType=Mainframe_GlobalFunctionLib.getText(13, 2);
		Mainframe_GlobalFunctionLib.sendText(12, 17, MessageCode);
		Mainframe_GlobalFunctionLib.sendText(13, 17, MessageType);
		Thread.sleep(2000);
	    System.out.println(MsgCd);
		if(MsgCd.equals("Message Code") && MsgType.equals("Message Type") )
		{
			System.out.println("Message Code & Message Type fields are available");
		}
		else{
			System.out.println("Message Code & Message Type fields are not available");
		}
	   
	}
	
	@Then("^verify new field values in edit mode under Schedule UnMet with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void verify_new_field_values_in_edit_mode_under_Schedule_UnMet_with(String MessageCode, String MessageType,String ScheduleCode) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		Mainframe_GlobalFunctionLib.sendText(4, 6, ScheduleCode);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(10, 2, "2");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		String  MsgCd=Mainframe_GlobalFunctionLib.getText(12, 2);
		String MsgType=Mainframe_GlobalFunctionLib.getText(13, 2);
		Mainframe_GlobalFunctionLib.sendText(12, 17, MessageCode);
		Mainframe_GlobalFunctionLib.sendText(13, 17, MessageType);
		Thread.sleep(2000);
	    System.out.println(MsgCd);
		if(MsgCd.equals("Message Code") && MsgType.equals("Message Type") )
		{
			System.out.println("Message Code & Message Type fields are available");
		}
		else{
			System.out.println("Message Code & Message Type fields are not available");
		}
		
	}
	
	@Then("^verify new field values in edit mode under Schedule Met with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void verify_new_field_values_in_edit_mode_under_Schedule_Met_with(String MessageCode, String MessageType,String ScheduleCode) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.sendText(4, 6, ScheduleCode);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(10, 2, "2");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		
		String  MsgCd1=Mainframe_GlobalFunctionLib.getText(8, 2);
		String MsgType1=Mainframe_GlobalFunctionLib.getText(9, 2);
		Mainframe_GlobalFunctionLib.sendText(12, 17, MessageCode);
		Mainframe_GlobalFunctionLib.sendText(13, 17, MessageType);
		Thread.sleep(2000);
	    System.out.println(MsgCd1);
		if(MsgCd1.equals("Message Code") && MsgType1.equals("Message Type") )
		{
			System.out.println("Message Code & Message Type fields are available");
		}
		else{
			System.out.println("Message Code & Message Type fields are not available");
		}
	}
	
	@Then("^verify new field values in display mode under Schedule Met with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void verify_new_field_values_in_display_mode_under_Schedule_Met_with(String MessageCode, String MessageType,String ScheduleCode) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.sendText(4, 6, ScheduleCode);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(10, 2, "5");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		
		String  MsgCd1=Mainframe_GlobalFunctionLib.getText(8, 2);
		String MsgType1=Mainframe_GlobalFunctionLib.getText(9, 2);
		Mainframe_GlobalFunctionLib.sendText(12, 17, MessageCode);
		Mainframe_GlobalFunctionLib.sendText(13, 17, MessageType);
		Thread.sleep(2000);
	    System.out.println(MsgCd1);
		if(MsgCd1.equals("Message Code") && MsgType1.equals("Message Type") )
		{
			System.out.println("Message Code & Message Type fields are available");
		}
		else{
			System.out.println("Message Code & Message Type fields are not available");
		}
	    
	}
	
	@Then("^verify new field values in display mode under Schedule UnMet with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void verify_new_field_values_in_display_mode_under_Schedule_UnMet_with(String MessageCode, String MessageType,String ScheduleCode) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.sendText(4, 6, ScheduleCode);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(10, 2, "5");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		String  MsgCd=Mainframe_GlobalFunctionLib.getText(12, 2);
		String MsgType=Mainframe_GlobalFunctionLib.getText(13, 2);
		Mainframe_GlobalFunctionLib.sendText(12, 17, MessageCode);
		Mainframe_GlobalFunctionLib.sendText(13, 17, MessageType);
		Thread.sleep(2000);
	    System.out.println(MsgCd);
		if(MsgCd.equals("Message Code") && MsgType.equals("Message Type") )
		{
			System.out.println("Message Code & Message Type fields are available");
		}
		else{
			System.out.println("Message Code & Message Type fields are not available");
		}
	}
	
	@When("^verify Schedule MET messages with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void verify_Schedule_MET_messages_with(String seq, String NDCList, String NDClistoption,String NDCplanOption,String NDCmsgOption)throws Throwable
	{   
	try{
		
	    Mainframe_GlobalFunctionLib.sendText(7, 4, seq);
		Mainframe_GlobalFunctionLib.sendText(7, 8, NDCList);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(11, 2, NDClistoption);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(11, 2, NDCplanOption);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		//validation
		Mainframe_GlobalFunctionLib.pressKey("F21");
		Mainframe_GlobalFunctionLib.sendText(12, 2, NDCmsgOption);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		//validation
		Thread.sleep(3000);
		
		for (int i = 0; i < 8; i++) {
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Thread.sleep(2000);}
		
	  }
	catch (Exception e) {
		// TODO Auto-generated catch block
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Assert.fail("An error has occured while creating the caim transaction.Screenshot is captured");
		
	                    }
	}
	@When("^verify field values in display mode under Schedule UnMet with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void verify_field_values_in_display_mode_under_Schedule_UnMet_with(String MessageCode, String MessageType, String ScheduleCode) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.sendText(4, 6, ScheduleCode);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Thread.sleep(2000);
		Mainframe_GlobalFunctionLib.sendText(10, 2, "2");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.click(8, 17);
		Mainframe_GlobalFunctionLib.pressKey("F4");
		Mainframe_GlobalFunctionLib.sendText(7, 2, "5");
	    Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		
		
		Mainframe_GlobalFunctionLib.click(12, 17);
		Mainframe_GlobalFunctionLib.pressKey("F4");
		Thread.sleep(2000);
		Mainframe_GlobalFunctionLib.sendText(7, 2, "5");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.sendText(10, 2, "5");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F7");
		Mainframe_GlobalFunctionLib.sendText(11, 2, "5");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		for (int i = 0; i < 4; i++) {
			Mainframe_GlobalFunctionLib.pressKey("F12");
		}
		Thread.sleep(2000);
		
		
		    
	}
	@When("^I submit a claim transaction with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_submit_a_claim_transaction_with(String bin, String proc, String group, String pharmacyID, String rxNbr, String refill,String memberID, String productId, String dspQty, String ds, String psc, String cost) throws Throwable
	{	
		
		try {
			Mainframe_GlobalFunctionLib.pressKey("F6");
			Mainframe_GlobalFunctionLib.click(11, 14 );
			Mainframe_GlobalFunctionLib.pressKey("F4");
			Thread.sleep(3000);
			Mainframe_GlobalFunctionLib.sendText(4, 4, bin);
			Mainframe_GlobalFunctionLib.sendText(4, 11, proc);
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(10, 2,"1" );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(11, 59,group );
			Mainframe_GlobalFunctionLib.click(12, 14 );
			Mainframe_GlobalFunctionLib.pressKey("F4");
			Thread.sleep(3000);
			Mainframe_GlobalFunctionLib.sendText(4, 4, pharmacyID);
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(9, 2,"1" );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			
			Mainframe_GlobalFunctionLib.sendText(12, 41,rxNbr );
			Mainframe_GlobalFunctionLib.sendText(12, 59,refill );
			
			Mainframe_GlobalFunctionLib.click(14, 41 );
			Mainframe_GlobalFunctionLib.pressKey("F4");
			Thread.sleep(3000);
			Mainframe_GlobalFunctionLib.sendText(3, 4, memberID);
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			
			Mainframe_GlobalFunctionLib.sendText(8, 2,"1" );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			//Mainframe_GlobalFunctionLib.pressKey("Enter");
			Thread.sleep(5000);
			//Mainframe_GlobalFunctionLib.waitTillReady();
			//System.out.println("Reached here");
			//Thread.sleep(5000);
			//Mainframe_GlobalFunctionLib.pressKey("Enter");
			//Mainframe_GlobalFunctionLib.sendText(4, 65, fillDate);	
			System.out.println("Entered fill date");
			Mainframe_GlobalFunctionLib.click(11, 20 );
			Mainframe_GlobalFunctionLib.pressKey("F4");
			Mainframe_GlobalFunctionLib.waitTillReady();
			Mainframe_GlobalFunctionLib.sendText(4, 4, productId);
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(9, 2,"1" );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Thread.sleep(3000);
			Mainframe_GlobalFunctionLib.sendText(12, 11,dspQty );
			Mainframe_GlobalFunctionLib.sendText(12, 26,ds );
			Mainframe_GlobalFunctionLib.sendText(14, 6,psc );
			Thread.sleep(5000);
			Mainframe_GlobalFunctionLib.sendText(10, 47,cost );
			//Mainframe_GlobalFunctionLib.sendText(5, 22,qual );
			Mainframe_GlobalFunctionLib.waitTillReady();
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			
			System.out.println("Claim is created");
			Mainframe_GlobalFunctionLib.pressKey("F6");
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			Assert.fail("An error has occured while creating the caim transaction.Screenshot is captured");
			
		}
		
		
	}
	
	@Then("^validate the claim status with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void validate_the_claim_status_with(String sts, String Rej, String Msg, String RejectCode) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String status=Mainframe_GlobalFunctionLib.getText(21, 2);
		System.out.println(status);
		
	   
	}
	@Then("^validate the claim status is \"([^\"]*)\"$")
	public void validate_the_claim_status_is(String claimStatus) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		FunctionalLibrary.validateText("21" ,"6" , claimStatus );
		String Rej=Mainframe_GlobalFunctionLib.getText(21, 8);
		System.out.println(Rej);
		String Msg=Mainframe_GlobalFunctionLib.getText(22, 2);
		System.out.println(Msg);
		Mainframe_GlobalFunctionLib.pressKey("F7");
		
	}	
}
