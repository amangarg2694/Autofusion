package com.atdd.demo.te.stepdefinitons;

import org.testng.Assert;

import com.atdd.te.screenHelpers.FunctionalLibrary;
import com.cucumber.listener.Reporter;
import com.optumrx.autofusion.core.te.util.Mainframe_GlobalFunctionLib;
import com.optumrx.autofusion.core.te.util.Screenshot;

import cucumber.api.java.en.Then;	
import cucumber.api.java.en.When;

public class CustomMessagingUpdate {
	
	
	@When("^I Add Transaction Control with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_Add_Transaction_Control_with(String BIN, String PCN, String Group, String FrmDate, String ThruDate,String CarrierID) throws Throwable {
		
	    // Write code here that turns the phrase above into concrete actions
	    try {
			Mainframe_GlobalFunctionLib.sendText(4, 12, BIN);
			Mainframe_GlobalFunctionLib.sendText(5, 12, PCN);
			Mainframe_GlobalFunctionLib.sendText(6, 12, Group);
			Mainframe_GlobalFunctionLib.sendText(7, 12, FrmDate);
			Mainframe_GlobalFunctionLib.sendText(8, 12, ThruDate);
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.pressKey("PageDown");
			Mainframe_GlobalFunctionLib.click(5, 19);
			Mainframe_GlobalFunctionLib.sendText(5, 19, "Y");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			Mainframe_GlobalFunctionLib.click(16, 15);
			Mainframe_GlobalFunctionLib.pressKey("F4");
			Mainframe_GlobalFunctionLib.sendText(4, 5, CarrierID);
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.click(9, 2);
			Mainframe_GlobalFunctionLib.sendText(9, 2, "1");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.pressKey("F12");
			Mainframe_GlobalFunctionLib.pressKey("F12");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			Assert.fail("An error has occured while adding transaction control.Screenshot is captured");
			
		}
	}
	

	@When("^I update plan with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_update_plan_with(String PlanCode, String NDCList, String Seq, String NDCFrmDate, String NDCThruDate, String PlanDefaultList, String SupplementRejectCode) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
		try {
			Mainframe_GlobalFunctionLib.click(4, 5);
			Mainframe_GlobalFunctionLib.sendText(4, 5, PlanCode);
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(11, 2, "2");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.click(15, 24);
			Mainframe_GlobalFunctionLib.sendText(15, 24, "Y");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.click(16, 64);
			Mainframe_GlobalFunctionLib.sendText(16, 64, "Y");
			Mainframe_GlobalFunctionLib.pressKey("F7");
			Mainframe_GlobalFunctionLib.sendText(7, 21, "10");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.pressKey("F6");
			Mainframe_GlobalFunctionLib.sendText(4, 5, NDCList );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.click(9, 2);
			Mainframe_GlobalFunctionLib.sendText(9, 2, "1");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(13, 17, Seq);
			Mainframe_GlobalFunctionLib.sendText(14, 17, NDCFrmDate);
			Mainframe_GlobalFunctionLib.sendText(14, 41, NDCThruDate);
			//need to check these are mandatory
			//Mainframe_GlobalFunctionLib.sendText(16, 20, PlanDefaultList);
			//Mainframe_GlobalFunctionLib.sendText(18, 33, SupplementRejectCode);
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.click(16, 64);
			Mainframe_GlobalFunctionLib.sendText(16, 64, "Y");
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			Thread.sleep(2000);
			Mainframe_GlobalFunctionLib.click(9, 2);
			Mainframe_GlobalFunctionLib.sendText(9, 2, "7");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.click(11, 2);
			Mainframe_GlobalFunctionLib.sendText(11, 2, "5");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			Thread.sleep(2000);
			for (int i = 0; i < 8; i++) {
				Mainframe_GlobalFunctionLib.pressKey("F12");
				Thread.sleep(1000);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			Assert.fail("An error has occured while updating plan.Screenshot is captured");
			
		}
			
	}
	/*@When("^I add new message codes with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_add_new_message_codes_with(String MsgCode, String Msg, String MsgFromdate, String MsgThudate) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		Mainframe_GlobalFunctionLib.sendText(5, 15, MsgCode);
		Mainframe_GlobalFunctionLib.sendText(7, 15, Msg);
		Mainframe_GlobalFunctionLib.sendText(11, 15, MsgFromdate);
		Mainframe_GlobalFunctionLib.sendText(13, 15, MsgThudate);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(16, 64, "Y");
		for (int i = 0; i < 3; i++) {
			Mainframe_GlobalFunctionLib.pressKey("F12");
		}
		
	}*/
	
	@When("^I add messages to Product \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_add_messages_to_Product(String ProductID, String Fromdate, String ThruDate, String Carrier, String MessageCode, String Seqno, String MessageType) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		try {
			Mainframe_GlobalFunctionLib.pressKey("F15");
			Mainframe_GlobalFunctionLib.sendText(4, 5, ProductID);
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.click(11, 2);
			Mainframe_GlobalFunctionLib.sendText(11, 2, "16");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.pressKey("F6");
			Mainframe_GlobalFunctionLib.sendText(11, 17, Fromdate);
			Mainframe_GlobalFunctionLib.sendText(12, 17, ThruDate);
			Mainframe_GlobalFunctionLib.click(13, 17);
			Mainframe_GlobalFunctionLib.pressKey("F4");
			Mainframe_GlobalFunctionLib.click(4, 6);
			Mainframe_GlobalFunctionLib.sendText(4, 6, Carrier);
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.click(9, 2);
			Mainframe_GlobalFunctionLib.sendText(9, 2, "1");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.click(15, 17);
			Mainframe_GlobalFunctionLib.pressKey("F4");
			Mainframe_GlobalFunctionLib.sendText(3,6,MessageCode);
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(7, 2, "1");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(16, 17, Seqno);
			Mainframe_GlobalFunctionLib.click(17, 17);
			Mainframe_GlobalFunctionLib.pressKey("F4");
			Mainframe_GlobalFunctionLib.sendText(7, 4, MessageType);
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(13, 3, "X");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(24, 73, "Y");
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			Assert.fail("An error has occured while adding messages.Screenshot is captured");
			
		}	
		
		
	    
	}
	@When("^I update plan with \"([^\"]*)\"$")
	public void i_update_plan_with(String plancode) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		try {
			Mainframe_GlobalFunctionLib.sendText(21, 7, "4");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(21, 7, "1");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(4, 5,plancode);
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(11, 3,"2");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			Assert.fail("An error has occured while updating a plan.Screenshot is captured");
			
		}
		
		
		
	}
	
	@When("^I update the date with \"([^\"]*)\"$")
	public void i_update_the_date_with(String SysDate) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    try {
	    	Thread.sleep(2000);
	    	Mainframe_GlobalFunctionLib.pressKey("F12");
	    	
			Mainframe_GlobalFunctionLib.sendText(21, 7, "call clrcsys001 ' '");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			
			Thread.sleep(2000);
			//FunctionalLibrary.pressKey("Tab");
			
			try{
				if(Mainframe_GlobalFunctionLib.getText(12, 10).trim().equals("Job Date")){
			
			Mainframe_GlobalFunctionLib.click(12, 23);
			
			Mainframe_GlobalFunctionLib.sendText(12, 23, SysDate+"  ");
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			}
			}
			catch(Exception e){
				if(Mainframe_GlobalFunctionLib.getText(12, 16).trim().equals("Job Date")){
					Mainframe_GlobalFunctionLib.click(12, 29);
					
					Mainframe_GlobalFunctionLib.sendText(12, 29, SysDate+"  ");
					Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				}
			}
			 			
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Thread.sleep(2000);
			Mainframe_GlobalFunctionLib.pressKey("F12");
			Thread.sleep(3000);
			Mainframe_GlobalFunctionLib.pressKey("F3");
			Mainframe_GlobalFunctionLib.sendText(21, 7, "6");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(6, 41, "8403");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(21, 7, "20");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(21, 7, "3");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			Assert.fail("An error has occured while updating the date.Screenshot is captured");
			
		}
	       
	}
	
	@When("^I update plan with GPI details \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_update_plan_with_GPI_details(String PlanCode, String GPIList, String Seq, String GPIFrmDate, String GPIThruDate) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
		try {
			Mainframe_GlobalFunctionLib.click(4, 5);
			Mainframe_GlobalFunctionLib.sendText(4, 5, PlanCode);
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(11, 2, "2");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.click(6, 51);
			Mainframe_GlobalFunctionLib.sendText(6, 51, "Y");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			Mainframe_GlobalFunctionLib.click(16, 64);
			Mainframe_GlobalFunctionLib.sendText(16, 64, "Y");
			Mainframe_GlobalFunctionLib.pressKey("F7");
			Mainframe_GlobalFunctionLib.sendText(7, 21, "11");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.pressKey("F6");
			Mainframe_GlobalFunctionLib.sendText(4, 5, GPIList );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			Mainframe_GlobalFunctionLib.click(9, 2);
			Mainframe_GlobalFunctionLib.sendText(9, 2, "1");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(13, 17, Seq);
			Mainframe_GlobalFunctionLib.sendText(14, 17, GPIFrmDate);
			Mainframe_GlobalFunctionLib.sendText(14, 41, GPIThruDate);
			//need to check these are mandatory
			//Mainframe_GlobalFunctionLib.sendText(16, 20, PlanDefaultList);
			//Mainframe_GlobalFunctionLib.sendText(18, 33, SupplementRejectCode);
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.click(16, 64);
			Mainframe_GlobalFunctionLib.sendText(16, 64, "Y");
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			Thread.sleep(2000);
			Mainframe_GlobalFunctionLib.click(9, 2);
			Mainframe_GlobalFunctionLib.sendText(9, 2, "7");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.click(11, 2);
			Mainframe_GlobalFunctionLib.sendText(11, 2, "5");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Thread.sleep(2000);
			for (int i = 0; i < 8; i++) {
				Mainframe_GlobalFunctionLib.pressKey("F12");
				Thread.sleep(1000);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			Assert.fail("An error has occured while updating plan.Screenshot is captured");
			
		}
		
	}
	@When("^I verify the message code with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_verify_the_message_code_with(String plancode, String NDC, String MsgCode) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
		FunctionalLibrary.enterText(4, 5, plancode);
		FunctionalLibrary.pressEnter();
		FunctionalLibrary.enterText(11, 2, "5");
		FunctionalLibrary.pressEnter();
		if(Mainframe_GlobalFunctionLib.getText(15, 24).equals("Y"))
		{
			FunctionalLibrary.pressKey("F7");
			FunctionalLibrary.enterText(7, 21, "10");
			FunctionalLibrary.pressEnter();
			FunctionalLibrary.enterText(11, 2, "7");
			FunctionalLibrary.pressEnter();
			FunctionalLibrary.enterText(11, 2, "5");
			FunctionalLibrary.pressEnter();
			FunctionalLibrary.pressKey("F21");
			Thread.sleep(2000);
			String NdcMsgCd=Mainframe_GlobalFunctionLib.getText(12, 25).trim();
			System.out.println(NdcMsgCd);
		}
		else
			{
			if(Mainframe_GlobalFunctionLib.getText(6, 51).equals("Y"))
			{
				FunctionalLibrary.pressKey("F7");
				FunctionalLibrary.enterText(7, 21, "11");
				FunctionalLibrary.pressEnter();
				FunctionalLibrary.enterText(11, 2, "7");
				FunctionalLibrary.pressEnter();
				FunctionalLibrary.enterText(11, 2, "5");
				FunctionalLibrary.pressEnter();
				FunctionalLibrary.pressKey("F21");
				Thread.sleep(2000);
				String GPIMsgCd=Mainframe_GlobalFunctionLib.getText(13, 25).trim();
				System.out.println(GPIMsgCd);
			}
		}
		
		
		
	}
	
	@Then("^display the msgCode$")
	public void display_the_msgCode() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		
		String MsgCd=Mainframe_GlobalFunctionLib.getText(12, 25).trim();
		System.out.println(MsgCd);
		for (int i = 0; i < 8; i++) {
			FunctionalLibrary.pressKey("F12");
		}
	}
	@When("^I Add list with \"([^\"]*)\",\"([^\"]*)\"$")
	public void i_Add_list_with(String List, String Description) throws Throwable {
		
	    // Write code here that turns the phrase above into concrete actions
	   try 
	      {
		       
		     FunctionalLibrary.pressKey("F6");
		     FunctionalLibrary.enterText(5, 18, List);
		     FunctionalLibrary.enterText(5, 30, Description);
		     FunctionalLibrary.pressEnter();
		     FunctionalLibrary.enterText(16, 64, "Y");
		     FunctionalLibrary.pressEnter();
		     Thread.sleep(1000);
		     
	       } catch (Exception e) {
		      // TODO Auto-generated catch block
		      Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		      Assert.fail("An error has occured while updating plan.Screenshot is captured");
	         }
	   
	}
	
	
	@When("^I add GPIlist and messages with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_add_GPIlist_and_messages_with(String sublistname, String Qtype,String days,String Quantity, String  FromDate, String ThruDate, String MsgCode, String MsgType) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		FunctionalLibrary.enterText(11, 2, "7");
		FunctionalLibrary.pressEnter();
		FunctionalLibrary.pressKey("F6");
		FunctionalLibrary.enterText(6, 4, sublistname);
		
		FunctionalLibrary.pressEnter();
		FunctionalLibrary.enterText(11, 2, "1");
		FunctionalLibrary.pressEnter();
		FunctionalLibrary.pressEnter();
		FunctionalLibrary.enterText(13, 58, Qtype);
		FunctionalLibrary.enterText(13, 62, days);
		FunctionalLibrary.enterText(13, 71, Quantity);
		FunctionalLibrary.pressEnter();
		FunctionalLibrary.pressKey("F21");
		FunctionalLibrary.pressKey("F6");
		FunctionalLibrary.enterText(10, 25, FromDate);
		FunctionalLibrary.enterText(11, 25, ThruDate);
		Mainframe_GlobalFunctionLib.click(13, 25);
		FunctionalLibrary.pressKey("F4");
		FunctionalLibrary.enterText(3, 6, MsgCode);
		FunctionalLibrary.pressEnter(); 
		FunctionalLibrary.enterText(7, 2, "1");
		FunctionalLibrary.pressEnter();
		FunctionalLibrary.enterText(14, 25, MsgType);
		FunctionalLibrary.pressEnter();
		Thread.sleep(2000);
		if(Mainframe_GlobalFunctionLib.getText(13, 25).equals(MsgCode))
		{
			System.out.println("Message added successfully"+MsgCode);
			
		}
		else{
			System.out.println("Message Falied"+MsgCode);
		}
		
		
	}
	@When("^I add NDClist and messages with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_add_NDClist_and_messages_with(String sublistname, String Qtype,String days,String Quantity, String  FromDate, String ThruDate, String MsgCode, String MsgType) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		FunctionalLibrary.enterText(11, 2, "7");
		FunctionalLibrary.pressEnter();
		FunctionalLibrary.pressKey("F6");
		FunctionalLibrary.enterText(7, 4, sublistname);
		
		FunctionalLibrary.pressEnter();
		FunctionalLibrary.enterText(12, 2, "1");
		FunctionalLibrary.pressEnter();
		
		FunctionalLibrary.enterText(12, 58, Qtype);
		FunctionalLibrary.enterText(12, 62, days);
		FunctionalLibrary.enterText(12, 71, Quantity);
		FunctionalLibrary.pressEnter();
		
		FunctionalLibrary.pressKey("F21");
		FunctionalLibrary.pressKey("F6");
		FunctionalLibrary.enterText(9, 25, FromDate);
		FunctionalLibrary.enterText(10, 25, ThruDate);
		Mainframe_GlobalFunctionLib.click(12, 25);
		FunctionalLibrary.pressKey("F4");
		FunctionalLibrary.enterText(3, 6, MsgCode);
		FunctionalLibrary.pressEnter();
		FunctionalLibrary.enterText(7, 2, "1");
		FunctionalLibrary.pressEnter();
		FunctionalLibrary.enterText(13, 25, MsgType);
		FunctionalLibrary.pressEnter();
		Thread.sleep(2000);
		if(Mainframe_GlobalFunctionLib.getText(13, 25).equals(MsgCode))
		{
			System.out.println("Message added successfully"+MsgCode);
		}
		else{
			System.out.println("Message Falied"+MsgCode);
		}
		
		
	}

	@Then("^validate List with \"([^\"]*)\"$")
	public void validate_List_with(String List) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		try {
			String S1=FunctionalLibrary.getText(11, 6);
			 if(Mainframe_GlobalFunctionLib.getText(11, 6).equals(List))
			 {
				 System.out.println("GPI list is created with"+S1);
				 
					
			 }
			 else
			 {
				 System.out.println("GPI list is not created");
			 }
		} catch (Exception e) {
			// TODO Auto-generated catch block
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		      Assert.fail("An error has occured while updating plan.Screenshot is captured");
		}
	}



}
