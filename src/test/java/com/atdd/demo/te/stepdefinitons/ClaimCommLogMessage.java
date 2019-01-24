//Author : Sridhar Akkanapally
package com.atdd.demo.te.stepdefinitons;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.apache.log4j.helpers.ThreadLocalMap;
import org.testng.Assert;

import com.atdd.te.screenHelpers.FunctionalLibrary;
import com.cucumber.listener.Reporter;
import com.optumrx.autofusion.core.te.util.Mainframe_GlobalFunctionLib;
import com.optumrx.autofusion.core.te.util.Screenshot;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import java.io.IOException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Calendar;
import java.util.StringTokenizer;

import org.testng.Assert;

import com.cucumber.listener.Reporter;
import com.hp.lft.report.ReportException;
import com.hp.lft.sdk.GeneralLeanFtException;
import com.hp.lft.sdk.WaitUntilTestObjectState;
import com.hp.lft.sdk.internal.common.MessageFieldNames.Report;
import com.optumrx.autofusion.core.te.util.Mainframe_GlobalFunctionLib;
import com.optumrx.autofusion.core.te.util.Screenshot;
import com.optumrx.autofusion.core.util.ReadPropertyFile;
public class ClaimCommLogMessage {
	public static String Rxclaimnum; String Submittdate;
	
	public void Toplanadminmenuscreen() throws Exception
	{
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F3");
	}
	
	@When("^I create pharmacy network with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_create_pharmacy_network_with(String Network, String NetworkName, String CarrierID, String Region, String Type, String Address1, String ST) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions	
		
		try {
			FunctionalLibrary.navigateToRxClaimPlanAdministrator();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try{
			Mainframe_GlobalFunctionLib.sendText(21, 7 ,"7" );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(21, 7 ,"2" );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			if(!(FunctionalLibrary.func_SearchAndSelectADataEditMode("4,5" ,Network ,"11,5" , Network)))
			{
				Mainframe_GlobalFunctionLib.pressKey("F6");
				Mainframe_GlobalFunctionLib.sendText(8, 16 ,Network);
				Mainframe_GlobalFunctionLib.sendText(9, 16, NetworkName);
				Mainframe_GlobalFunctionLib.sendText(10, 16 ,CarrierID);
				Mainframe_GlobalFunctionLib.sendText(11, 16 ,Region);
				Mainframe_GlobalFunctionLib.sendText(12, 16 ,Type);
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(9, 11 ,Address1);
				Mainframe_GlobalFunctionLib.sendText(11, 35 ,ST);
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				//Mainframe_GlobalFunctionLib.sendText(4, 5 ,Network);
				//FunctionalLibrary.validateText("11" ,"5" , Network );
				FunctionalLibrary.navigateToRxClaimPlanAdministrator();
			}
	
			else{
				Mainframe_GlobalFunctionLib.pressKey("F12");
				System.out.println("Network exists");
				Reporter.addStepLog("Network exists");
				FunctionalLibrary.navigateToRxClaimPlanAdministrator();
			}
							
			
				if(FunctionalLibrary.ScreenshotOption.equalsIgnoreCase("Always")){
					Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
					}
			
			}catch(Exception e)
			{	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				Assert.fail("Pharmacy network creation is not set successfully.Screenshot is captured");
			}
		
	}  
	
	@When("^I add pharmacy network and pharmacy with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_add_pharmacy_network_and_pharmacy_with(String PlanCode, String Network, String Seq1, String Sts, String MessageType, String MessageCode, String Pharmacy) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
		try {
			FunctionalLibrary.navigateToRxClaimPlanAdministrator();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
					Mainframe_GlobalFunctionLib.sendText(21, 7 ,"4" );
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					Mainframe_GlobalFunctionLib.sendText(21, 7 ,"1" );
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					Mainframe_GlobalFunctionLib.sendText(4, 5 ,PlanCode);
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					Mainframe_GlobalFunctionLib.sendText(11, 2 ,"2");
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					Mainframe_GlobalFunctionLib.sendText(9, 24 ,"Y" );
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					Mainframe_GlobalFunctionLib.sendText(16, 64 ,"Y" );
					Mainframe_GlobalFunctionLib.pressKey("F7"); 
					Mainframe_GlobalFunctionLib.sendText(7, 21 ,"4" );
					Mainframe_GlobalFunctionLib.pressKey("Enter");
			
					Mainframe_GlobalFunctionLib.pressKey("F6"); 
					Mainframe_GlobalFunctionLib.sendText(4, 4 ,Network);
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					Mainframe_GlobalFunctionLib.sendText(9, 2 ,"1" );
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					Mainframe_GlobalFunctionLib.sendText(10, 17 ,Seq1);
					Mainframe_GlobalFunctionLib.sendText(15, 17 ,Sts);
					Mainframe_GlobalFunctionLib.sendText(17, 17 ,MessageType);
					Mainframe_GlobalFunctionLib.sendText(18, 17 ,MessageCode);
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					Mainframe_GlobalFunctionLib.pressKey("F12");
					Mainframe_GlobalFunctionLib.click(12, 2 );
					Mainframe_GlobalFunctionLib.sendText(12, 2 ,"7");
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					Mainframe_GlobalFunctionLib.pressKey("F6"); 
					Mainframe_GlobalFunctionLib.click(10, 11 );
					Mainframe_GlobalFunctionLib.pressKey("F4");
					Mainframe_GlobalFunctionLib.sendText(4, 4 ,Pharmacy);
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					Mainframe_GlobalFunctionLib.sendText(9, 2 ,"1" );
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					
					Mainframe_GlobalFunctionLib.pressKey("F12");
					Mainframe_GlobalFunctionLib.pressKey("F12");
					Mainframe_GlobalFunctionLib.pressKey("F12");
					Mainframe_GlobalFunctionLib.pressKey("F12");
					Mainframe_GlobalFunctionLib.pressKey("F12");
					Mainframe_GlobalFunctionLib.pressKey("F12");
					
			
	}
	@Then("^I validate the status message of claim in claim transaction screen with \"([^\"]*)\",\"([^\"]*)\"$")
	public void i_validate_the_status_message_of_claim_in_claim_transaction_screen_with(String ClaimStatus, String message1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	
		Rxclaimnum=Mainframe_GlobalFunctionLib.getText(20, 12);
		String ClmSts = Mainframe_GlobalFunctionLib.getText(21, 6);
		System.out.println("Claim Status: "+ClmSts);
		Reporter.addStepLog("Claim Status: "+ClmSts);
		Mainframe_GlobalFunctionLib.validateText("21", "6",ClaimStatus );
		String Clmmsg = Mainframe_GlobalFunctionLib.getText(21, 6);
		System.out.println("Message on Claim transaction screen: "+Clmmsg);
		Reporter.addStepLog("Message on Claim transaction screen: "+Clmmsg);
		Mainframe_GlobalFunctionLib.validateText("22", "6",message1 );
		
		Mainframe_GlobalFunctionLib.pressKey("F7"); 
		Thread.sleep(3000);
		
		String Date1=Mainframe_GlobalFunctionLib.getText(3, 41).substring(0,2).trim();
		System.out.println("Date1: "+Date1);
		String Date2=Mainframe_GlobalFunctionLib.getText(3, 41).substring(3,5).trim();
		System.out.println("Date2: "+Date2);
		String Date3=Mainframe_GlobalFunctionLib.getText(3, 41).substring(6,8).trim();
		System.out.println("Date3: "+Date3);
		Thread.sleep(1000);
		Submittdate=Date1+Date2+Date3;
		System.out.println("Claim Submitt date: "+Submittdate);
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("F7");
		Mainframe_GlobalFunctionLib.sendText(4, 23 ,"6");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F9");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());		
		String Clmmsg1 = Mainframe_GlobalFunctionLib.getText(7, 18);
		System.out.println("Message on Claim transaction screen: "+Clmmsg1);
		Reporter.addStepLog("Message on Claim transaction screen: "+Clmmsg1);
		Mainframe_GlobalFunctionLib.validateText("7", "18",message1 );
			
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");
	}
		
	@Then("^I validate the message in status segment screen with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_validate_the_message_in_status_segment_screen_with(String FillDate, String Pharmacy, String message1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions// Write code here that turns the phrase above into concrete actions
	    
		try {
			FunctionalLibrary.navigateToRxClaimPlanAdministrator();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		Mainframe_GlobalFunctionLib.sendText(21, 7 ,"CCT800" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(21, 7 ,"13" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(21, 7 ,"1" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(4, 4 ,Submittdate );
		Mainframe_GlobalFunctionLib.sendText(4, 34 ,Pharmacy );
		Mainframe_GlobalFunctionLib.pressKey("Enter");

		//String SearClaim = Mainframe_GlobalFunctionLib.getText(10, 50);
		label1:	for (int j = 11; j < 40; ++j) {
			//Mainframe_GlobalFunctionLib.pressKey("PageDown");
			 for (int i = 10; i < 22; ++i) {
			String SearClaim= Mainframe_GlobalFunctionLib.getText(i, 50);
				
				if(SearClaim.equals(Rxclaimnum))
					{
						System.out.println("Claim is found: "+SearClaim);
						Mainframe_GlobalFunctionLib.sendText(i, 2 ,"5" );
						Mainframe_GlobalFunctionLib.pressKey("Enter");
						Mainframe_GlobalFunctionLib.pressKey("F10");
						Mainframe_GlobalFunctionLib.sendText(13, 23 ,"1" );
						Mainframe_GlobalFunctionLib.pressKey("Enter");
						Mainframe_GlobalFunctionLib.pressKey("PageDown");
						String ActualMessage= Mainframe_GlobalFunctionLib.getText(13, 5);
								if(ActualMessage.equals(message1))
								{
									System.out.println("Message appearing correctly: "+ActualMessage);
									Reporter.addStepLog("Message appearing correctly");
								}
								else
								{
									System.out.println("Message not appearing correctly: "+ActualMessage);	
						    		Assert.fail("Message appearing correctly");
								}
						break label1;
														
					}
				else
				{
				System.out.println("Claim not found : "+SearClaim);
				//Mainframe_GlobalFunctionLib.pressKey("PageDown");
				}
								
			}
			
	}
		
		Toplanadminmenuscreen();	
	}
	
	@When("^I submit a claim for communication log with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_submit_a_claim_for_communication_log_with(String bin, String proc, String group, String pharmacyID, String rxNbr, String refill, String fillDate, String memberID, String productID, String dspQty, String ds, String psc, String cost) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		FunctionalLibrary.CreateTransaction(bin, proc, group, pharmacyID, rxNbr, refill, fillDate, memberID, productID, dspQty, ds, psc, cost);
		FunctionalLibrary.submitClaimF18WithoutRxOrigin();
	}
	
	@When("^I add the new plan to member with \"([^\"]*)\",\"([^\"]*)\"$")
	public void i_add_the_new_plan_to_member_with(String MemberID, String Overrideplan) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
				try {
					FunctionalLibrary.navigateToRxClaimPlanAdministrator();
				} catch (Exception e) {
					e.printStackTrace();
				}
				Mainframe_GlobalFunctionLib.sendText(21, 7 ,"1" );
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(21, 7 ,"2" );
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(4, 4 ,MemberID);
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(10, 2 ,"2");
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.pressKey("F7"); 
				Thread.sleep(3000);
				Mainframe_GlobalFunctionLib.sendText(15, 2 ,"2");
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.click(12, 14 );
				Mainframe_GlobalFunctionLib.pressKey("F4");
				
				Mainframe_GlobalFunctionLib.sendText(4, 5 ,Overrideplan);
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(10, 2 ,"1");
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				FunctionalLibrary.navigateToRxClaimPlanAdministrator();
							
	}
	
	@When("^I add pharmacy network and pharmacy with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_add_pharmacy_network_and_pharmacy_with(String PlanCode, String Network, String Seq1, String Sts, String Pharmacy) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		try {
			FunctionalLibrary.navigateToRxClaimPlanAdministrator();
		} catch (Exception e) {
			e.printStackTrace();
		}
				
					Mainframe_GlobalFunctionLib.sendText(21, 7 ,"4" );
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					Mainframe_GlobalFunctionLib.sendText(21, 7 ,"1" );
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					Mainframe_GlobalFunctionLib.sendText(4, 5 ,PlanCode);
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					Mainframe_GlobalFunctionLib.sendText(11, 2 ,"2");
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					Mainframe_GlobalFunctionLib.sendText(9, 24 ,"Y" );
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					Mainframe_GlobalFunctionLib.sendText(16, 64 ,"Y" );
					Mainframe_GlobalFunctionLib.pressKey("F7"); 
					Mainframe_GlobalFunctionLib.sendText(7, 21 ,"4" );
					Mainframe_GlobalFunctionLib.pressKey("Enter");
			
					Mainframe_GlobalFunctionLib.pressKey("F6"); 
					Mainframe_GlobalFunctionLib.sendText(4, 4 ,Network);
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					Mainframe_GlobalFunctionLib.sendText(9, 2 ,"1" );
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					Mainframe_GlobalFunctionLib.sendText(10, 17 ,Seq1);
					Mainframe_GlobalFunctionLib.sendText(15, 17 ,Sts);

					Mainframe_GlobalFunctionLib.pressKey("Enter");
					Mainframe_GlobalFunctionLib.pressKey("F12");
					Mainframe_GlobalFunctionLib.click(12, 2 );
					Mainframe_GlobalFunctionLib.sendText(12, 2 ,"7");
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					Mainframe_GlobalFunctionLib.pressKey("F6"); 
					Mainframe_GlobalFunctionLib.click(10, 11 );
					Mainframe_GlobalFunctionLib.pressKey("F4");
					Mainframe_GlobalFunctionLib.sendText(4, 4 ,Pharmacy);
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					Mainframe_GlobalFunctionLib.sendText(9, 2 ,"1" );
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					
					Mainframe_GlobalFunctionLib.pressKey("F12");
					Mainframe_GlobalFunctionLib.pressKey("F12");
					Mainframe_GlobalFunctionLib.pressKey("F12");
					Mainframe_GlobalFunctionLib.pressKey("F12");
					Mainframe_GlobalFunctionLib.pressKey("F12");
					Mainframe_GlobalFunctionLib.pressKey("F12");
	}
	
	@Then("^I validate the status message of claim in claim transaction screen with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_validate_the_status_message_of_claim_in_claim_transaction_screen_with(String ClaimStatus, String message1, String message2, String message3, String message4) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
		Rxclaimnum=Mainframe_GlobalFunctionLib.getText(20, 12);
		Mainframe_GlobalFunctionLib.validateText("21", "6",ClaimStatus );
		Mainframe_GlobalFunctionLib.validateText("22", "6",message1 );
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("F7");
		Thread.sleep(3000);
		String Date1=Mainframe_GlobalFunctionLib.getText(3, 41).substring(0,2).trim();
		System.out.println("Date1: "+Date1);
		String Date2=Mainframe_GlobalFunctionLib.getText(3, 41).substring(3,5).trim();
		System.out.println("Date2: "+Date2);
		String Date3=Mainframe_GlobalFunctionLib.getText(3, 41).substring(6,8).trim();
		System.out.println("Date3: "+Date3);
		Thread.sleep(1000);
		Submittdate=Date1+Date2+Date3;
		System.out.println("Claim Submitt date: "+Submittdate);
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("F7");
		Mainframe_GlobalFunctionLib.sendText(4, 23 ,"6");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F9");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		/*Mainframe_GlobalFunctionLib.validateText("7", "18",message1 );
		Mainframe_GlobalFunctionLib.validateText("8", "18",message2 );
		Mainframe_GlobalFunctionLib.validateText("9", "18",message3 );
		Mainframe_GlobalFunctionLib.validateText("10", "18",message4 );*/
		Mainframe_GlobalFunctionLib.validateText("7", "18",message1 );		
		Mainframe_GlobalFunctionLib.validateText("8", "18",message2 );		
   	    Mainframe_GlobalFunctionLib.validateText("9", "18",message3 );
	    Mainframe_GlobalFunctionLib.validateText("10", "18",message4 );
		
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		
	}
	
	@When("^I submit a manualclaim with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_submit_a_manualclaim_with(String bin, String proc, String group, String pharmacyID, String rxNbr, String refill, String fillDate, String memberID, String productID, String dspQty, String ds, String psc, String cost, String Clarificode) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
		FunctionalLibrary.CreateTransaction(bin, proc, group, pharmacyID, rxNbr, refill, fillDate, memberID, productID, dspQty, ds, psc, cost);
		
		Mainframe_GlobalFunctionLib.pressKey("F14");
		Mainframe_GlobalFunctionLib.sendText(5, 23 ,"8");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Mainframe_GlobalFunctionLib.click(13, 10 );
		Mainframe_GlobalFunctionLib.pressKey("F4");
		Mainframe_GlobalFunctionLib.click(3, 39 );
		Mainframe_GlobalFunctionLib.sendText(3, 39 ,Clarificode);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(6, 27 ,"X");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		
		FunctionalLibrary.submitClaim();

	}
	
	@Then("^I submit the router submission claim with \"([^\"]*)\"$")
	public void i_submit_the_router_submission_claim_with(String rxNbr) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
		Mainframe_GlobalFunctionLib.sendText(5,29, FunctionalLibrary.func_GenerateDynamicRxNo());
	
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("F18");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	}
	
	@Then("^I validate the message in status segment screen with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_validate_the_message_in_status_segment_screen_with(String Pharmacy, String message1, String message2, String message3, String message4) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions

				try {
					FunctionalLibrary.navigateToRxClaimPlanAdministrator();
				} catch (Exception e) {
					e.printStackTrace();
				}
				
				Mainframe_GlobalFunctionLib.sendText(21, 7 ,"CCT800" );
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(21, 7 ,"13" );
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(21, 7 ,"1" );
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(4, 4 ,Submittdate );
				Mainframe_GlobalFunctionLib.sendText(4, 34 ,Pharmacy );
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				//String SearClaim = Mainframe_GlobalFunctionLib.getText(10, 50);
				label1:	for (int j = 11; j < 40; ++j) {
					//Mainframe_GlobalFunctionLib.pressKey("PageDown");
					 for (int i = 10; i < 22; ++i) {
					String SearClaim= Mainframe_GlobalFunctionLib.getText(i, 50);
						
						if(SearClaim.equals(Rxclaimnum))
							{
								System.out.println("Claim is found: "+SearClaim);
								Mainframe_GlobalFunctionLib.sendText(i, 2 ,"5" );
								Mainframe_GlobalFunctionLib.pressKey("Enter");
								Mainframe_GlobalFunctionLib.pressKey("F10");
								Mainframe_GlobalFunctionLib.sendText(13, 23 ,"1" );
								Mainframe_GlobalFunctionLib.pressKey("Enter");
								Mainframe_GlobalFunctionLib.pressKey("PageDown");
								Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
								Mainframe_GlobalFunctionLib.validateText("13", "5",message1 );
								
										String mess2 = Mainframe_GlobalFunctionLib.getText(14, 5);
										int lenmess2 = mess2.length();
										if(lenmess2!=0){
									Mainframe_GlobalFunctionLib.validateText("14", "5",message2 );}
										
										String mess3 = Mainframe_GlobalFunctionLib.getText(15, 5);
										int lenmess3 = mess3.length();
										if(lenmess3!=0){
									Mainframe_GlobalFunctionLib.validateText("15", "5",message3 );}
										
										String mess4 = Mainframe_GlobalFunctionLib.getText(16, 5);
										int lenmess4 = mess4.length();
										if(lenmess4!=0){
									Mainframe_GlobalFunctionLib.validateText("16", "5",message4 );}
								
								break label1;
																
							}
						else
						{
						System.out.println("Claim not found : "+SearClaim);
						//Mainframe_GlobalFunctionLib.pressKey("PageDown");
						}
										
					}
					
			}
							
				Toplanadminmenuscreen();		
}
	
	@When("^I create override plan with only pricing \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_create_override_plan_with_only_pricing(String Overrideplan, String Ofromdate, String Odescription, String OthruDate, String Opricechedule, String Opatientpayschedule) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
		FunctionalLibrary.Createplanwithpricing(Overrideplan, Ofromdate, Odescription, OthruDate, Opricechedule, Opatientpayschedule);
		FunctionalLibrary.navigateToRxClaimPlanAdministrator();
		Mainframe_GlobalFunctionLib.sendText(21, 7 ,"4" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(21, 7 ,"1" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(4, 5 ,Overrideplan );
		Mainframe_GlobalFunctionLib.pressKey("Enter");		
		Mainframe_GlobalFunctionLib.sendText(11, 2 ,"2" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(7, 24 ,"N" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(16, 64 ,"Y" );
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		FunctionalLibrary.navigateToRxClaimPlanAdministrator();
	}
	
	@Then("^I validate the message in status segment screen with \"([^\"]*)\",\"([^\"]*)\"$")
	public void i_validate_the_message_in_status_segment_screen_with(String Pharmacy, String message1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions

	    // Write code here that turns the phrase above into concrete actions// Write code here that turns the phrase above into concrete actions
	    
				try {
					FunctionalLibrary.navigateToRxClaimPlanAdministrator();
				} catch (Exception e) {
					e.printStackTrace();
				}
				
				Mainframe_GlobalFunctionLib.sendText(21, 7 ,"CCT800" );
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(21, 7 ,"13" );
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(21, 7 ,"1" );
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(4, 4 ,Submittdate );
				Mainframe_GlobalFunctionLib.sendText(4, 34 ,Pharmacy );
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				//String SearClaim = Mainframe_GlobalFunctionLib.getText(10, 50);
				label1:	for (int j = 11; j < 40; ++j) {
					//Mainframe_GlobalFunctionLib.pressKey("PageDown");
					 for (int i = 10; i < 22; ++i) {
					String SearClaim= Mainframe_GlobalFunctionLib.getText(i, 50);
						
						if(SearClaim.equals(Rxclaimnum))
							{
								System.out.println("Claim is found: "+SearClaim);
								Mainframe_GlobalFunctionLib.sendText(i, 2 ,"5" );
								Mainframe_GlobalFunctionLib.pressKey("Enter");
								Mainframe_GlobalFunctionLib.pressKey("F10");
								Mainframe_GlobalFunctionLib.sendText(13, 23 ,"1" );
								Mainframe_GlobalFunctionLib.pressKey("Enter");
								Mainframe_GlobalFunctionLib.pressKey("PageDown");
								Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
								Mainframe_GlobalFunctionLib.validateText("13", "5",message1 );
																										
								break label1;
																
							}
						else
						{
						System.out.println("Claim not found : "+SearClaim);
						//Mainframe_GlobalFunctionLib.pressKey("PageDown");
						}
										
					}
				
			}
				Toplanadminmenuscreen();	
	    
	}
	@When("^I create presciber network along with prescriber id with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_create_presciber_network_along_with_prescriber_id_with(String PrescriberNetId, String PrescriberNetName, String OFromDate, String OThruDate, String PrescriberNetId1, String PrescriberId, String PRFromDate, String PRThruDate) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions

	  	try {
			FunctionalLibrary.navigateToRxClaimPlanAdministrator();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try{
			Mainframe_GlobalFunctionLib.sendText(21, 7 ,"7" );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(21, 7 ,"9" );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			if(!(FunctionalLibrary.func_SearchAndSelectADataEditMode("4,5" ,PrescriberNetId ,"11,5" , PrescriberNetId)))
			{
				Mainframe_GlobalFunctionLib.pressKey("F6");
				Mainframe_GlobalFunctionLib.sendText(9, 11 ,PrescriberNetId);
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(5, 15, PrescriberNetName);
				Mainframe_GlobalFunctionLib.sendText(11, 15 ,OFromDate);
				Mainframe_GlobalFunctionLib.sendText(11, 37 ,OThruDate);
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
						//adding priscriberId
				Mainframe_GlobalFunctionLib.sendText(4, 5 ,PrescriberNetId1);
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(11, 2 ,"7" );
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.pressKey("F6");
				Mainframe_GlobalFunctionLib.click(6, 18 );
				Mainframe_GlobalFunctionLib.pressKey("F4");
				Mainframe_GlobalFunctionLib.sendText(4, 5 ,PrescriberId);
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(10, 2 ,"1" );
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(10, 15 ,PRFromDate);
				Mainframe_GlobalFunctionLib.sendText(10, 32 ,PRThruDate);
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(16, 64 ,"Y" );
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				
				FunctionalLibrary.navigateToRxClaimPlanAdministrator();
			}
	
			else{
				Mainframe_GlobalFunctionLib.pressKey("F12");
				System.out.println("PrescriberId exists");
				Reporter.addStepLog("PrescriberId exists");
				FunctionalLibrary.navigateToRxClaimPlanAdministrator();
			}
							
			
				if(FunctionalLibrary.ScreenshotOption.equalsIgnoreCase("Always")){
					Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
					}
			
			}catch(Exception e)
			{	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				Assert.fail("Prescriber network creation is not set successfully.Screenshot is captured");
			}
	
}
	
	@When("^I add presciber network to the plan with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_add_presciber_network_to_the_plan_with(String Overrideplan, String PrescriberNetId, String PrsSts) throws Throwable {  
	    
		try {
			FunctionalLibrary.navigateToRxClaimPlanAdministrator();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
					Mainframe_GlobalFunctionLib.sendText(21, 7 ,"4" );
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					Mainframe_GlobalFunctionLib.sendText(21, 7 ,"1" );
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					Mainframe_GlobalFunctionLib.sendText(4, 5 ,Overrideplan);
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					Mainframe_GlobalFunctionLib.sendText(11, 2 ,"2");
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					Mainframe_GlobalFunctionLib.sendText(11, 24 ,"Y" );
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					Mainframe_GlobalFunctionLib.sendText(16, 64 ,"Y" );
					Mainframe_GlobalFunctionLib.pressKey("F7"); 
					Mainframe_GlobalFunctionLib.sendText(7, 21 ,"6" );
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					//String getnetid = Mainframe_GlobalFunctionLib.getText(14, 1).trim();
			        //if(getnetid)
					Mainframe_GlobalFunctionLib.pressKey("F6"); 
					Mainframe_GlobalFunctionLib.sendText(4, 16 ,PrescriberNetId);
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					Mainframe_GlobalFunctionLib.sendText(9, 2 ,"1" );
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					//String getnetid = Mainframe_GlobalFunctionLib.getText(20, 4).trim();
					String scr1= Mainframe_GlobalFunctionLib.getText(1, 2).trim();
					if(scr1.contains("RCPPN001"))
					{ 
					Mainframe_GlobalFunctionLib.sendText(10, 26 ,PrsSts );
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					Mainframe_GlobalFunctionLib.sendText(16, 64 ,"Y" );
					Reporter.addScreenCaptureFromPath(Screenshot.screenshot());}
					else {
						Mainframe_GlobalFunctionLib.pressKey("F12"); 
					}
					FunctionalLibrary.navigateToRxClaimPlanAdministrator();
			}
	
	@Given("^I submit a claim for communication log with presciber id \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_submit_a_claim_for_communication_log_with_presciber_id(String bin, String proc, String group, String pharmacyID, String rxNbr, String refill, String fillDate, String memberID, String productID, String dspQty, String ds, String psc, String cost, String Qual, String PrescriberId) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
		FunctionalLibrary.CreateTransaction(bin, proc, group, pharmacyID, rxNbr, refill, fillDate, memberID, productID, dspQty, ds, psc, cost);
		Mainframe_GlobalFunctionLib.sendText(19, 19 ,Qual);
		Mainframe_GlobalFunctionLib.sendText(19, 26 ,PrescriberId);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		FunctionalLibrary.submitClaimF18WithoutRxOrigin();
	}
	
	@When("^I add network override for the plan with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_add_network_override_for_the_plan_with(String Overrideplan, String MediNet, String ClarCode) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		try {
			FunctionalLibrary.navigateToRxClaimPlanAdministrator();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
					Mainframe_GlobalFunctionLib.sendText(21, 7 ,"4" );
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					Mainframe_GlobalFunctionLib.sendText(21, 7 ,"1" );
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					Mainframe_GlobalFunctionLib.sendText(4, 5 ,Overrideplan);
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					Mainframe_GlobalFunctionLib.sendText(11, 2 ,"2");
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					Mainframe_GlobalFunctionLib.pressKey("F7"); 
					Mainframe_GlobalFunctionLib.sendText(7, 21 ,"6" );
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					Mainframe_GlobalFunctionLib.pressKey("F9");
					Mainframe_GlobalFunctionLib.sendText(9, 25 ,MediNet );
					Mainframe_GlobalFunctionLib.sendText(10, 25 ,ClarCode );
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
					FunctionalLibrary.navigateToRxClaimPlanAdministrator();
					
	}
	
	@When("^I submit a manualclaim with presciber id \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_submit_a_manualclaim_with_presciber_id(String bin, String proc, String group, String pharmacyID, String rxNbr, String refill, String fillDate, String memberID, String productID, String dspQty, String ds, String psc, String cost, String Qual, String PrescID) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
		FunctionalLibrary.CreateTransaction(bin, proc, group, pharmacyID, rxNbr, refill, fillDate, memberID, productID, dspQty, ds, psc, cost);
		Mainframe_GlobalFunctionLib.sendText(19, 19 ,Qual);
		Mainframe_GlobalFunctionLib.sendText(19, 26 ,PrescID);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		FunctionalLibrary.submitClaim();
	
	}
	
	@Then("^I validate the status message of claim in claim transaction screen for rejection with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_validate_the_status_message_of_claim_in_claim_transaction_screen_for_rejection_with(String ClaimStatus, String RejCode, String message1, String message2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
		Rxclaimnum=Mainframe_GlobalFunctionLib.getText(20, 12);
		Mainframe_GlobalFunctionLib.validateText("21", "6",ClaimStatus );
		Mainframe_GlobalFunctionLib.validateText("21", "12",RejCode );
		Mainframe_GlobalFunctionLib.validateText("22", "6",message1 );
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("F7");
		Thread.sleep(3000);
		String Date1=Mainframe_GlobalFunctionLib.getText(3, 41).substring(0,2).trim();
		System.out.println("Date1: "+Date1);
		String Date2=Mainframe_GlobalFunctionLib.getText(3, 41).substring(3,5).trim();
		System.out.println("Date2: "+Date2);
		String Date3=Mainframe_GlobalFunctionLib.getText(3, 41).substring(6,8).trim();
		System.out.println("Date3: "+Date3);
		Thread.sleep(1000);
		Submittdate=Date1+Date2+Date3;
		System.out.println("Claim Submitt date: "+Submittdate);
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("F7");
		Mainframe_GlobalFunctionLib.sendText(4, 23 ,"7");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.validateText("9", "2",RejCode );
		Mainframe_GlobalFunctionLib.validateText("16", "2",message1 );
		
		Mainframe_GlobalFunctionLib.validateText("17", "2",message2 );
		
		
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");
			
	}
	
	@Then("^I validate the rejection code and message in status segment screen with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_validate_the_rejection_code_and_message_in_status_segment_screen_with(String Pharmacy, String RejCode, String message1, String message2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
		try {
			FunctionalLibrary.navigateToRxClaimPlanAdministrator();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		Mainframe_GlobalFunctionLib.sendText(21, 7 ,"CCT800" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(21, 7 ,"13" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(21, 7 ,"1" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(4, 4 ,Submittdate );
		Mainframe_GlobalFunctionLib.sendText(4, 34 ,Pharmacy );
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		//String SearClaim = Mainframe_GlobalFunctionLib.getText(10, 50);
		label1:	for (int j = 11; j < 40; ++j) {
			//Mainframe_GlobalFunctionLib.pressKey("PageDown");
			 for (int i = 10; i < 22; ++i) {
			String SearClaim= Mainframe_GlobalFunctionLib.getText(i, 50);
				
				if(SearClaim.equals(Rxclaimnum))
					{
						System.out.println("Claim is found: "+SearClaim);
						Mainframe_GlobalFunctionLib.sendText(i, 2 ,"5" );
						Mainframe_GlobalFunctionLib.pressKey("Enter");
						Mainframe_GlobalFunctionLib.pressKey("F10");
						Mainframe_GlobalFunctionLib.sendText(13, 23 ,"1" );
						Mainframe_GlobalFunctionLib.pressKey("Enter");
						Mainframe_GlobalFunctionLib.validateText("11", "2",RejCode );
						Mainframe_GlobalFunctionLib.pressKey("PageDown");
						Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
						Mainframe_GlobalFunctionLib.validateText("13", "5",message1 );
						Mainframe_GlobalFunctionLib.validateText("14", "5",message2 );																		
						break label1;
														
					}
				else
				{
				System.out.println("Claim not found : "+SearClaim);
				//Mainframe_GlobalFunctionLib.pressKey("PageDown");
				}
								
			}
	
		}
		Toplanadminmenuscreen();
	}
	
	@When("^I submit a manualclaim with presciber id and Clarification code \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_submit_a_manualclaim_with_presciber_id_and_Clarification_code(String bin, String proc, String group, String pharmacyID, String rxNbr, String refill, String fillDate, String memberID, String productID, String dspQty, String ds, String psc, String cost, String Qual, String PrescID, String Clarificode) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  
		FunctionalLibrary.CreateTransaction(bin, proc, group, pharmacyID, rxNbr, refill, fillDate, memberID, productID, dspQty, ds, psc, cost);
		
		Mainframe_GlobalFunctionLib.sendText(19, 19 ,Qual);
		Mainframe_GlobalFunctionLib.sendText(19, 26 ,PrescID);
		
		Mainframe_GlobalFunctionLib.pressKey("F14");
		Mainframe_GlobalFunctionLib.sendText(5, 23 ,"8");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Mainframe_GlobalFunctionLib.click(13, 10 );
		Mainframe_GlobalFunctionLib.pressKey("F4");
		Mainframe_GlobalFunctionLib.click(3, 39 );
		Mainframe_GlobalFunctionLib.sendText(3, 39 ,Clarificode);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(6, 27 ,"X");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		
		FunctionalLibrary.submitClaim();

	}
	
	@When("^I submit a manualclaim with presciber id and two Clarification code \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_submit_a_manualclaim_with_presciber_id_and_two_Clarification_code(String bin, String proc, String group, String pharmacyID, String rxNbr, String refill, String fillDate, String memberID, String productID, String dspQty, String ds, String psc, String cost, String Qual, String PrescID, String Clarificode1, String Clarificode2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
FunctionalLibrary.CreateTransaction(bin, proc, group, pharmacyID, rxNbr, refill, fillDate, memberID, productID, dspQty, ds, psc, cost);
		
		Mainframe_GlobalFunctionLib.sendText(19, 19 ,Qual);
		Mainframe_GlobalFunctionLib.sendText(19, 26 ,PrescID);
		
		Mainframe_GlobalFunctionLib.pressKey("F14");
		Mainframe_GlobalFunctionLib.sendText(5, 23 ,"8");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Mainframe_GlobalFunctionLib.click(13, 10 );
		Mainframe_GlobalFunctionLib.pressKey("F4");
		Mainframe_GlobalFunctionLib.click(3, 39 );
		Mainframe_GlobalFunctionLib.sendText(3, 39 ,Clarificode1);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(6, 27 ,"X");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Mainframe_GlobalFunctionLib.click(13, 10 );
		Mainframe_GlobalFunctionLib.pressKey("F4");
		Mainframe_GlobalFunctionLib.click(3, 39 );
		Mainframe_GlobalFunctionLib.sendText(3, 39 ,Clarificode2);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(6, 27 ,"X");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		
		FunctionalLibrary.submitClaim();    

	}
	
	@Then("^I validate the status message of claim in claim transaction screen with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_validate_the_status_message_of_claim_in_claim_transaction_screen_with(String ClaimStatus, String message1, String message2, String message3, String message4, String message5, String message6) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
		Rxclaimnum=Mainframe_GlobalFunctionLib.getText(20, 12);
		Mainframe_GlobalFunctionLib.validateText("21", "6",ClaimStatus );
		Mainframe_GlobalFunctionLib.validateText("22", "6",message1 );
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("F7");
		Thread.sleep(3000);
		String Date1=Mainframe_GlobalFunctionLib.getText(3, 41).substring(0,2).trim();
		System.out.println("Date1: "+Date1);
		String Date2=Mainframe_GlobalFunctionLib.getText(3, 41).substring(3,5).trim();
		System.out.println("Date2: "+Date2);
		String Date3=Mainframe_GlobalFunctionLib.getText(3, 41).substring(6,8).trim();
		System.out.println("Date3: "+Date3);
		Thread.sleep(1000);
		Submittdate=Date1+Date2+Date3;
		System.out.println("Claim Submitt date: "+Submittdate);
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("F7");
		Mainframe_GlobalFunctionLib.sendText(4, 23 ,"6");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F9");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	
		Mainframe_GlobalFunctionLib.validateText("7", "18",message1 );		
		Mainframe_GlobalFunctionLib.validateText("8", "18",message2 );		
   	    Mainframe_GlobalFunctionLib.validateText("9", "18",message3 );
	    Mainframe_GlobalFunctionLib.validateText("10", "18",message4 );
	    Mainframe_GlobalFunctionLib.validateText("11", "18",message5 );
	    Mainframe_GlobalFunctionLib.validateText("12", "18",message6 );
		
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");

	}  
	
	@Then("^I validate the messages in status segment screen with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_validate_the_messages_in_status_segment_screen_with(String Pharmacy, String message1, String message2, String message3, String message4, String message5, String message6 ) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions

				try {
					FunctionalLibrary.navigateToRxClaimPlanAdministrator();
				} catch (Exception e) {
					e.printStackTrace();
				}
				
				Mainframe_GlobalFunctionLib.sendText(21, 7 ,"CCT800" );
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(21, 7 ,"13" );
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(21, 7 ,"1" );
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(4, 4 ,Submittdate );
				Mainframe_GlobalFunctionLib.sendText(4, 34 ,Pharmacy );
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				//String SearClaim = Mainframe_GlobalFunctionLib.getText(10, 50);
				label1:	for (int j = 11; j < 40; ++j) {
					//Mainframe_GlobalFunctionLib.pressKey("PageDown");
					 for (int i = 10; i < 22; ++i) {
					String SearClaim= Mainframe_GlobalFunctionLib.getText(i, 50);
						
						if(SearClaim.equals(Rxclaimnum))
							{
								System.out.println("Claim is found: "+SearClaim);
								Mainframe_GlobalFunctionLib.sendText(i, 2 ,"5" );
								Mainframe_GlobalFunctionLib.pressKey("Enter");
								Mainframe_GlobalFunctionLib.pressKey("F10");
								Mainframe_GlobalFunctionLib.sendText(13, 23 ,"1" );
								Mainframe_GlobalFunctionLib.pressKey("Enter");
								Mainframe_GlobalFunctionLib.pressKey("PageDown");
								Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
								String mess1 = Mainframe_GlobalFunctionLib.getText(13, 5);
								Mainframe_GlobalFunctionLib.validateText("13", "5",message1 );
								
										String mess2 = Mainframe_GlobalFunctionLib.getText(14, 5);
										int lenmess2 = mess2.length();
										if(lenmess2!=0){
									Mainframe_GlobalFunctionLib.validateText("14", "5",message2 );}
										
										String mess3 = Mainframe_GlobalFunctionLib.getText(15, 5);
										int lenmess3 = mess3.length();
										if(lenmess3!=0){
									Mainframe_GlobalFunctionLib.validateText("15", "5",message3 );}
										
										String mess4 = Mainframe_GlobalFunctionLib.getText(16, 5);
										int lenmess4 = mess4.length();
										if(lenmess4!=0){
									Mainframe_GlobalFunctionLib.validateText("16", "5",message4 );}
								
										String mess5 = Mainframe_GlobalFunctionLib.getText(17, 5);
										int lenmess5 = mess5.length();
										if(lenmess5!=0){
									Mainframe_GlobalFunctionLib.validateText("17", "5",message5 );}
										
										String mess6 = Mainframe_GlobalFunctionLib.getText(18, 5);
										int lenmess6 = mess6.length();
										if(lenmess6!=0){
									Mainframe_GlobalFunctionLib.validateText("18", "5",message6 );}
										
								break label1;
																
							}
						else
						{
						System.out.println("Claim not found : "+SearClaim);
						//Mainframe_GlobalFunctionLib.pressKey("PageDown");
						}
										
					}
					
			}
				Toplanadminmenuscreen();
	    
	}
	
	@When("^I add pharmacy network and pharmacies with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_add_pharmacy_network_and_pharmacies_with(String PlanCode, String Network, String Seq1, String Sts, String Pharmacy1, String Pharmacy2, String Pharmacy3) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
		try {
			FunctionalLibrary.navigateToRxClaimPlanAdministrator();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
					Mainframe_GlobalFunctionLib.sendText(21, 7 ,"4" );
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					Mainframe_GlobalFunctionLib.sendText(21, 7 ,"1" );
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					Mainframe_GlobalFunctionLib.sendText(4, 5 ,PlanCode);
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					Mainframe_GlobalFunctionLib.sendText(11, 2 ,"2");
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					Mainframe_GlobalFunctionLib.sendText(9, 24 ,"Y" );
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					Mainframe_GlobalFunctionLib.sendText(16, 64 ,"Y" );
					Mainframe_GlobalFunctionLib.pressKey("F7"); 
					Mainframe_GlobalFunctionLib.sendText(7, 21 ,"4" );
					Mainframe_GlobalFunctionLib.pressKey("Enter");
			
					Mainframe_GlobalFunctionLib.pressKey("F6"); 
					Mainframe_GlobalFunctionLib.sendText(4, 4 ,Network);
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					Mainframe_GlobalFunctionLib.sendText(9, 2 ,"1" );
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					Mainframe_GlobalFunctionLib.sendText(10, 17 ,Seq1);
					Mainframe_GlobalFunctionLib.sendText(15, 17 ,Sts);
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					Mainframe_GlobalFunctionLib.pressKey("F12");
					Mainframe_GlobalFunctionLib.click(12, 2 );
					Mainframe_GlobalFunctionLib.sendText(12, 2 ,"7");
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					Mainframe_GlobalFunctionLib.pressKey("F6"); 
					Mainframe_GlobalFunctionLib.click(10, 11 );
					Mainframe_GlobalFunctionLib.pressKey("F4");
					Mainframe_GlobalFunctionLib.sendText(4, 4 ,Pharmacy1);
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					Mainframe_GlobalFunctionLib.sendText(9, 2 ,"1" );
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					Mainframe_GlobalFunctionLib.pressKey("Enter");

					Mainframe_GlobalFunctionLib.pressKey("F6"); 
					Mainframe_GlobalFunctionLib.click(10, 11 );
					Mainframe_GlobalFunctionLib.pressKey("F4");
					Mainframe_GlobalFunctionLib.sendText(4, 4 ,Pharmacy2);
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					Mainframe_GlobalFunctionLib.sendText(9, 2 ,"1" );
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					Mainframe_GlobalFunctionLib.pressKey("Enter");

					Mainframe_GlobalFunctionLib.pressKey("F6"); 
					Mainframe_GlobalFunctionLib.click(10, 11 );
					Mainframe_GlobalFunctionLib.pressKey("F4");
					Mainframe_GlobalFunctionLib.sendText(4, 4 ,Pharmacy3);
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					Mainframe_GlobalFunctionLib.sendText(9, 2 ,"1" );
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					
					Mainframe_GlobalFunctionLib.pressKey("F12");
					Mainframe_GlobalFunctionLib.pressKey("F12");
					Mainframe_GlobalFunctionLib.pressKey("F12");
					Mainframe_GlobalFunctionLib.pressKey("F12");
					Mainframe_GlobalFunctionLib.pressKey("F12");
					Mainframe_GlobalFunctionLib.pressKey("F12");
					
	}
	
	@When("^I add pharmacy network override for the plan with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_add_pharmacy_network_override_for_the_plan_with(String Overrideplan, String MediNet, String ClarCode) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
		try {
			FunctionalLibrary.navigateToRxClaimPlanAdministrator();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
					Mainframe_GlobalFunctionLib.sendText(21, 7 ,"4" );
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					Mainframe_GlobalFunctionLib.sendText(21, 7 ,"1" );
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					Mainframe_GlobalFunctionLib.sendText(4, 5 ,Overrideplan);
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					Mainframe_GlobalFunctionLib.sendText(11, 2 ,"2");
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					Mainframe_GlobalFunctionLib.pressKey("F7"); 
					Mainframe_GlobalFunctionLib.sendText(7, 21 ,"4" );
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					Mainframe_GlobalFunctionLib.pressKey("F18");
					Mainframe_GlobalFunctionLib.sendText(6, 25 ,MediNet );
					Mainframe_GlobalFunctionLib.sendText(7, 25 ,ClarCode );
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
					FunctionalLibrary.navigateToRxClaimPlanAdministrator();

	}
	
	@Then("^I new test code validate the message in status segment screen with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_new_test_code_validate_the_message_in_status_segment_screen_with(String PharmacyID, String message1, String message2,String message3) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
		try {
			FunctionalLibrary.navigateToRxClaimPlanAdministrator();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		Mainframe_GlobalFunctionLib.sendText(21, 7 ,"CCT800" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(21, 7 ,"13" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(21, 7 ,"1" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(4, 4 ,Submittdate );
		Mainframe_GlobalFunctionLib.sendText(4, 34 ,PharmacyID );
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		//String SearClaim = Mainframe_GlobalFunctionLib.getText(10, 50);
		label1:	for (int j = 11; j < 40; ++j) {
			//Mainframe_GlobalFunctionLib.pressKey("PageDown");
			 for (int i = 10; i < 22; ++i) {
			String SearClaim= Mainframe_GlobalFunctionLib.getText(i, 50);
				
				if(SearClaim.equals(Rxclaimnum))
					{
						System.out.println("Claim is found: "+SearClaim);
						Mainframe_GlobalFunctionLib.sendText(i, 2 ,"5" );
						Mainframe_GlobalFunctionLib.pressKey("Enter");
						Mainframe_GlobalFunctionLib.pressKey("F10");
						Mainframe_GlobalFunctionLib.sendText(13, 23 ,"1" );
						Mainframe_GlobalFunctionLib.pressKey("Enter");
						Mainframe_GlobalFunctionLib.pressKey("PageDown");
						Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
						
																			
						/*try{
								
								String mess1 = Mainframe_GlobalFunctionLib.getText(13, 5);
								Mainframe_GlobalFunctionLib.validateText("13", "5",message1 );
								String mess2 = Mainframe_GlobalFunctionLib.getText(14, 5);
								int lenmess2 = mess2.length();
								System.out.println("message2 length : "+lenmess2);
								if(lenmess2!=0){
								Mainframe_GlobalFunctionLib.validateText("14", "5",message2 );
								}
								String mess3 = Mainframe_GlobalFunctionLib.getText(15, 5);
								int lenmess3 = mess3.length();
								System.out.println("message2 length : "+lenmess3);
								if(lenmess2!=0){
								Mainframe_GlobalFunctionLib.validateText("15", "5",message3 );
								}
						}catch(Exception e){
							Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
							Assert.fail("We could not navigate to next row ");
							
						}*/
		
								/*String mess2 = Mainframe_GlobalFunctionLib.getText(14, 5);
								int lenmess2 = mess2.length();
								if(lenmess2!=0){
							Mainframe_GlobalFunctionLib.validateText("14", "5",message2 );}
								
								String mess3 = Mainframe_GlobalFunctionLib.getText(15, 5);
								int lenmess3 = mess3.length();
								if(lenmess3!=0){
							Mainframe_GlobalFunctionLib.validateText("15", "5",message3 );}
								
								String mess4 = Mainframe_GlobalFunctionLib.getText(16, 5);
								int lenmess4 = mess4.length();
								if(lenmess4!=0){
							Mainframe_GlobalFunctionLib.validateText("16", "5",message4 );}
						
								String mess5 = Mainframe_GlobalFunctionLib.getText(17, 5);
								int lenmess5 = mess5.length();
								if(lenmess5!=0){
							Mainframe_GlobalFunctionLib.validateText("17", "5",message5 );}
								
								String mess6 = Mainframe_GlobalFunctionLib.getText(18, 5);
								int lenmess6 = mess6.length();
								if(lenmess6!=0){
							Mainframe_GlobalFunctionLib.validateText("18", "5",message6 );}*/
								
						break label1;
														
					}
				else
				{
				System.out.println("Claim not found : "+SearClaim);
				//Mainframe_GlobalFunctionLib.pressKey("PageDown");
				}
								
			}
			
	}
		Toplanadminmenuscreen();
		
		
	}
	
	@When("^I create BIN Transaction control screen with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_create_BIN_Transaction_control_screen_with(String BIN, String ProcCtrl, String Group, String Bfromdate, String Btodate, String CarrierID, String AccountID, String GroupID, String Windowdays) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		
		try {
			FunctionalLibrary.navigateToRxClaimPlanAdministrator();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try{
			Mainframe_GlobalFunctionLib.sendText(21, 7 ,"8" );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(21, 7 ,"2" );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			if(!(FunctionalLibrary.func_SearchAndSelectADataEditMode("4,4" ,BIN ,"10,4" , BIN)))
			{
				Mainframe_GlobalFunctionLib.pressKey("F6");
				Mainframe_GlobalFunctionLib.sendText(4, 12 ,BIN);
				Mainframe_GlobalFunctionLib.sendText(5, 12, ProcCtrl);
				Mainframe_GlobalFunctionLib.sendText(6, 12 ,Group);
				Mainframe_GlobalFunctionLib.sendText(7, 12 ,Bfromdate);
				Mainframe_GlobalFunctionLib.sendText(8, 12 ,Btodate);
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.click(16, 15 );
				Mainframe_GlobalFunctionLib.pressKey("F4");
				
				Mainframe_GlobalFunctionLib.sendText(4, 5 ,CarrierID);
				Mainframe_GlobalFunctionLib.sendText(4, 16 ,AccountID);
				Mainframe_GlobalFunctionLib.sendText(4, 33 ,GroupID);
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(9, 2 ,"1" );
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(21, 33 ,"    ");
				Mainframe_GlobalFunctionLib.sendText(21, 33 ,Windowdays);
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				
				FunctionalLibrary.navigateToRxClaimPlanAdministrator();
			}
	
			else{
				Mainframe_GlobalFunctionLib.pressKey("F12");
				System.out.println("BIN exists");
				Reporter.addStepLog("BIN exists");
				FunctionalLibrary.navigateToRxClaimPlanAdministrator();
			}
							
			
				if(FunctionalLibrary.ScreenshotOption.equalsIgnoreCase("Always")){
					Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
					}
			
			}catch(Exception e)
			{	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				Assert.fail("BIN creation is not set successfully.Screenshot is captured");
			}
		
	
	    // Write code here that turns the phrase above into concrete actions
		FunctionalLibrary.navigateToRxClaimPlanAdministrator();
	}
	
	
}




