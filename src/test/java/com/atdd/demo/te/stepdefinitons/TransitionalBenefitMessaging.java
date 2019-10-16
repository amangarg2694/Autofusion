package com.atdd.demo.te.stepdefinitons;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;

import com.atdd.te.screenHelpers.FunctionalLibrary;
import com.cucumber.listener.Reporter;
import com.optumrx.autofusion.core.te.util.Mainframe_GlobalFunctionLib;
import com.optumrx.autofusion.core.te.util.Screenshot;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TransitionalBenefitMessaging {
	
	public static String PlanCde=""; 
   // String membrId;
	
	@When("^I create a new Plan for TB with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\", \"([^\"]*)\",\"([^\"]*)\", \"([^\"]*)\"$")
	public void i_create_a_new_Plan_for_TB_with(String PlanCode, String PlanFromDt, String ThruDate,String PlanType , String PharmPriceSched, String ClientPriceSched, String List, String Level, String OOPSched, String GPIList, String GPIFrmDte, String GPIThruDte, String GPIName) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Mainframe_GlobalFunctionLib.sendText("13","019", PlanCode);
		Mainframe_GlobalFunctionLib.sendText("14","019", PlanFromDt);
		Mainframe_GlobalFunctionLib.sendText("15","019", "SR41889 TESTING");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText("16","064", "Y");
		TimeUnit.SECONDS.sleep(15);
		Mainframe_GlobalFunctionLib.sendText("04","070", PlanType );
		Mainframe_GlobalFunctionLib.sendText("13","077", "Y");
		Mainframe_GlobalFunctionLib.sendText("14","077", "Y");
		Mainframe_GlobalFunctionLib.sendText("06","051", "Y");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText("16","064", "Y");
		
		Mainframe_GlobalFunctionLib.pressKey("F7");
		Mainframe_GlobalFunctionLib.sendText("07","021", "28");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		
		//Reimbursement	
		Mainframe_GlobalFunctionLib.sendText("21","012", "1");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Mainframe_GlobalFunctionLib.sendText("08","012",PlanFromDt);
		Mainframe_GlobalFunctionLib.sendText("08","036",ThruDate);
		Mainframe_GlobalFunctionLib.click(10, 26);
		Mainframe_GlobalFunctionLib.pressKey("F4");
		Mainframe_GlobalFunctionLib.sendText("03","005",PharmPriceSched);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText("08","002","1");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		//Patient Pay
		Mainframe_GlobalFunctionLib.sendText("21","012", "3");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Mainframe_GlobalFunctionLib.sendText("09","002",PlanFromDt);
		Mainframe_GlobalFunctionLib.sendText("09","012",ThruDate);
		Mainframe_GlobalFunctionLib.click(9, 22);
		Mainframe_GlobalFunctionLib.pressKey("F4");
		Mainframe_GlobalFunctionLib.sendText("04","006",ClientPriceSched);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText("10","002","1");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText("16","064","Y");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		
		Mainframe_GlobalFunctionLib.pressKey("F12");
		
		
		//Accumulators
		Mainframe_GlobalFunctionLib.sendText("07","021", "29");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		
		Mainframe_GlobalFunctionLib.sendText("15","012", "6");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Mainframe_GlobalFunctionLib.sendText("08","013",PlanFromDt);
		Mainframe_GlobalFunctionLib.sendText("08","041",ThruDate);
		Mainframe_GlobalFunctionLib.sendText("10","028", Level);
		Mainframe_GlobalFunctionLib.sendText("14","028", OOPSched);
		Mainframe_GlobalFunctionLib.sendText("16","028", List);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		
		
		//GPI List
		
		//GPI LIST
				Mainframe_GlobalFunctionLib.sendText("07", "21", "11");
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.pressKey("F6");
				Mainframe_GlobalFunctionLib.pressKey("F6");
				Mainframe_GlobalFunctionLib.sendText("05", "18", GPIList);
				Mainframe_GlobalFunctionLib.sendText("05", "30", "TESTING");
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText("16", "64", "Y");
				TimeUnit.SECONDS.sleep(4);
				Mainframe_GlobalFunctionLib.sendText("04", "005", GPIList);
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText("09", "02", "1");
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText("13", "17", "10");
				Mainframe_GlobalFunctionLib.sendText("14", "17", GPIFrmDte);
				Mainframe_GlobalFunctionLib.sendText("14", "41", GPIThruDte);
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText("16", "64", "Y");
				TimeUnit.SECONDS.sleep(4);
				Mainframe_GlobalFunctionLib.pressKey("F12");
				
				Mainframe_GlobalFunctionLib.sendText("11", "02", "7");
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.pressKey("F6");
				Mainframe_GlobalFunctionLib.pressKey("F16");
				Mainframe_GlobalFunctionLib.sendText("06", "04", GPIName);
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText("11", "02", "1");
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText("16", "24", "*");
				Mainframe_GlobalFunctionLib.sendText("17", "24", "*");
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText("06", "57", "        ");
				Mainframe_GlobalFunctionLib.sendText("06", "57", "020118");
				Mainframe_GlobalFunctionLib.sendText("06", "67", "123139");
				Mainframe_GlobalFunctionLib.sendText("06", "78", "F");
				Mainframe_GlobalFunctionLib.sendText("14", "18", "S");
				Mainframe_GlobalFunctionLib.sendText("14", "33", "2.5");
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.pressKey("F20");
				Mainframe_GlobalFunctionLib.sendText("10", "21", "1");
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.pressKey("F6");
				Mainframe_GlobalFunctionLib.sendText("09", "16", "120118");
				Mainframe_GlobalFunctionLib.sendText("09", "33", "123119");
				Mainframe_GlobalFunctionLib.sendText("10", "27", "SCH2659");
				Mainframe_GlobalFunctionLib.sendText("12", "27", "Y");
				Mainframe_GlobalFunctionLib.sendText("13", "27", "Y");
				Mainframe_GlobalFunctionLib.sendText("14", "27", "Y");
				Mainframe_GlobalFunctionLib.sendText("10", "75", "Y");
				Mainframe_GlobalFunctionLib.sendText("15", "69", "Y");
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				Mainframe_GlobalFunctionLib.pressKey("F12");
				Mainframe_GlobalFunctionLib.pressKey("F12");
				Mainframe_GlobalFunctionLib.pressKey("F12");
			    Mainframe_GlobalFunctionLib.pressKey("F12");
		     	Mainframe_GlobalFunctionLib.pressKey("F3");
		     	Mainframe_GlobalFunctionLib.pressKey("F12");
		
		     	Mainframe_GlobalFunctionLib.pressKey("F12");
		     	Mainframe_GlobalFunctionLib.pressKey("F3");
		     	Mainframe_GlobalFunctionLib.sendText("04", "05", PlanCode);
		     	Mainframe_GlobalFunctionLib.pressKey("Enter");
		     	Mainframe_GlobalFunctionLib.sendText("11", "02", "2");
				Mainframe_GlobalFunctionLib.pressKey("Enter");
		     	
		     	
				//TB setup at Plan level
		Mainframe_GlobalFunctionLib.pressKey("F19");
		Mainframe_GlobalFunctionLib.sendText("16", "034", "Y");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F7");
		Mainframe_GlobalFunctionLib.sendText("08","021", "9");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText("07","030", "Y");
		Mainframe_GlobalFunctionLib.sendText("07","062", "        ");
		Mainframe_GlobalFunctionLib.sendText("09","030", "M");
		Mainframe_GlobalFunctionLib.sendText("09","079", "C");
		Mainframe_GlobalFunctionLib.sendText("10","030", "   ");
		Mainframe_GlobalFunctionLib.sendText("10","030", "90");
		Mainframe_GlobalFunctionLib.sendText("11","030", " ");
		Mainframe_GlobalFunctionLib.sendText("13","042", "1");
		Mainframe_GlobalFunctionLib.sendText("13","048", "   ");
		Mainframe_GlobalFunctionLib.sendText("13","048", "30");
		Mainframe_GlobalFunctionLib.sendText("14","042", "E");
		Mainframe_GlobalFunctionLib.sendText("14","048", "   ");
		Mainframe_GlobalFunctionLib.sendText("14","048", "30");
		Mainframe_GlobalFunctionLib.sendText("17","042", "Y");
		Mainframe_GlobalFunctionLib.pressKey("PageDown");
		Mainframe_GlobalFunctionLib.sendText("08","032", "010119");
		Mainframe_GlobalFunctionLib.sendText("08","078", "Q");
		Mainframe_GlobalFunctionLib.sendText("09","017", "G");
		Mainframe_GlobalFunctionLib.sendText("09","032", "4");
		Mainframe_GlobalFunctionLib.sendText("09","078", "C");
		Mainframe_GlobalFunctionLib.sendText("11","078", "Y");
		Mainframe_GlobalFunctionLib.sendText("12","032", "365");
		Mainframe_GlobalFunctionLib.sendText("12","078", "C");
		Mainframe_GlobalFunctionLib.sendText("13","032", "12312018");
		//Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText("14","032", "I");
		Mainframe_GlobalFunctionLib.sendText("14","078", "A");
		Mainframe_GlobalFunctionLib.sendText("15","032", "I");
		Mainframe_GlobalFunctionLib.sendText("15","078", "A");
		Mainframe_GlobalFunctionLib.sendText("16","032", "N");
		//Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("PageDown");
		Mainframe_GlobalFunctionLib.sendText("10","069", "Y");
		Mainframe_GlobalFunctionLib.sendText("11","061", "SLOI");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		System.out.println("Plan with TB setup created " +PlanCode);
		PlanCde =PlanCode ;
		Thread.sleep(5000);
		
		
	}
	
	//Attaching plan to Group and member creation part-d
	
	@Then("^Plan with TB setup is created with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void plan_with_TB_setup_is_created_with(String Group, String MemberID, String FromDate, String EndDate, String SupplyType, String SupplyID, String Contract) throws Throwable {
		
		
		
		
		Mainframe_GlobalFunctionLib.sendText(21, 7,"1");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(21, 7,"1");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(21, 7,"3");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Mainframe_GlobalFunctionLib.sendText(13, 14,"CAR2659");
		Mainframe_GlobalFunctionLib.sendText(14, 14,"ACC2659");
		Mainframe_GlobalFunctionLib.sendText(15, 14,Group);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(7, 27,"Group For 2659");
		Mainframe_GlobalFunctionLib.sendText(17, 2,"010101  ");
		Mainframe_GlobalFunctionLib.sendText(17, 12,"123139  ");
		Mainframe_GlobalFunctionLib.sendText(17, 22, PlanCde);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(16, 64,"Y");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		System.out.println("Group Created successfully");
		Thread.sleep(5000);
		
		
		
		Mainframe_GlobalFunctionLib.sendText(21, 007,"2");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Mainframe_GlobalFunctionLib.sendText(4, 10,"CAR2659");
		Mainframe_GlobalFunctionLib.sendText(5, 10,"ACC2659");
		Mainframe_GlobalFunctionLib.sendText(6, 10,Group);
		Mainframe_GlobalFunctionLib.sendText(7, 10,MemberID);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(6,29,"Member for 2659");
		Mainframe_GlobalFunctionLib.sendText(7, 40,"01011950");
		Mainframe_GlobalFunctionLib.sendText(20, 2,FromDate);
		Mainframe_GlobalFunctionLib.sendText(20, 12,EndDate);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(16, 64,"Y");
		
		
		
		Mainframe_GlobalFunctionLib.pressKey("F8");
		Mainframe_GlobalFunctionLib.sendText(4, 20,"10");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(4, 20,"3");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Mainframe_GlobalFunctionLib.sendText(10, 12,"120118");
		Mainframe_GlobalFunctionLib.sendText(10, 33,"123119");
		Mainframe_GlobalFunctionLib.sendText(12,19,SupplyType);
		Mainframe_GlobalFunctionLib.sendText(13,19,SupplyID);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.sendText(4, 20,"17");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(4, 20,"4");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Mainframe_GlobalFunctionLib.sendText(10, 17,"120118");
		Mainframe_GlobalFunctionLib.sendText(10, 41,"123118");
		Mainframe_GlobalFunctionLib.click(12, 20);
		Mainframe_GlobalFunctionLib.pressKey("F4");
		Mainframe_GlobalFunctionLib.sendText(4, 5,Contract);
		Mainframe_GlobalFunctionLib.sendText(4, 16,"123");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(11, 2,"1");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(18, 24,"0");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Mainframe_GlobalFunctionLib.sendText(10, 17,"010119");
		Mainframe_GlobalFunctionLib.sendText(10, 41,"123119");
		Mainframe_GlobalFunctionLib.click(12, 20);
		Mainframe_GlobalFunctionLib.pressKey("F4");
		Mainframe_GlobalFunctionLib.sendText(4, 5,Contract);
		Mainframe_GlobalFunctionLib.sendText(4,16,"123");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(12, 2,"1");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(18, 24,"0");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		System.out.println("Member is created "+MemberID);
		//MemberID = membrId;
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		//Mainframe_GlobalFunctionLib.pressKey("F3");
		
		
}

	
	
	
	
	
	//Submitting claim 

	@When("^I submit a manual claim with the \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_submit_a_manual_claim_with_the(String bin, String proc, String group, String pharmacyID, String rxNbr, String refill, String fillDate, String memberID, String productID, String dspQty, String ds, String psc, String cost) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
				try {
					FunctionalLibrary.navigateToRxClaimPlanAdministrator();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				FunctionalLibrary.navigateToScreen("3");
				FunctionalLibrary.navigateToScreen("2");
				FunctionalLibrary.navigateToScreen("1");
				
				if(!(FunctionalLibrary.func_SearchAndSelectADataEditMode("4,4" ,memberID ,"9,4" , memberID))){
					
					Mainframe_GlobalFunctionLib.pressKey("F6");
					Mainframe_GlobalFunctionLib.sendText(11, 14,bin );
					Mainframe_GlobalFunctionLib.sendText(11, 41,proc );
					Mainframe_GlobalFunctionLib.sendText(11, 59,group );
					Mainframe_GlobalFunctionLib.sendText(12, 14,pharmacyID );
					Mainframe_GlobalFunctionLib.sendText(12, 41,rxNbr );
					Mainframe_GlobalFunctionLib.sendText(12, 59,refill );
					Mainframe_GlobalFunctionLib.click(14, 41);
					Mainframe_GlobalFunctionLib.pressKey("F4");
					Mainframe_GlobalFunctionLib.sendText(3, 4,memberID ); 
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					Mainframe_GlobalFunctionLib.sendText(8, 2,"1" ); 
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					Thread.sleep(4000);
					Mainframe_GlobalFunctionLib.sendText("04" , "065" ,"          ");
					Mainframe_GlobalFunctionLib.sendText("04", "065", fillDate);			
					Mainframe_GlobalFunctionLib.sendText("11", "020",productID );
					Mainframe_GlobalFunctionLib.sendText("12", "011",dspQty );
					Mainframe_GlobalFunctionLib.sendText("12", "026",ds );
					Mainframe_GlobalFunctionLib.sendText("14", "006",psc );
					Mainframe_GlobalFunctionLib.sendText("10", "046","         " );
					Mainframe_GlobalFunctionLib.sendText("10", "046",cost );
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					
					
				}
				else{
					
				//Mainframe_GlobalFunctionLib.sendText("09", "002","1" );
				//Mainframe_GlobalFunctionLib.pressKey("Enter");
				Thread.sleep(1000);
				Mainframe_GlobalFunctionLib.click(4, 29 );
					Mainframe_GlobalFunctionLib.sendText("04", "029", pharmacyID);
					Mainframe_GlobalFunctionLib.sendText("04" , "065" ,"          ");
					Mainframe_GlobalFunctionLib.sendText("04" , "065", fillDate);
					Mainframe_GlobalFunctionLib.sendText("05","029", rxNbr);
					Mainframe_GlobalFunctionLib.sendText("05", "047", refill);			
					Mainframe_GlobalFunctionLib.sendText("07", "012", memberID);
					Mainframe_GlobalFunctionLib.sendText("11", "020",productID );
					Mainframe_GlobalFunctionLib.sendText("12", "011","           " );
					Mainframe_GlobalFunctionLib.sendText("12", "011",dspQty );
					Mainframe_GlobalFunctionLib.sendText("12", "026","   " );
					Mainframe_GlobalFunctionLib.sendText("12", "026",ds);
					Mainframe_GlobalFunctionLib.sendText("14", "006",psc );
					Mainframe_GlobalFunctionLib.sendText("10", "047","         " );
					Mainframe_GlobalFunctionLib.sendText("10", "047",cost );
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					
					
					
		            
				}
				
					System.out.println("Claim is created");	
					Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
					Mainframe_GlobalFunctionLib.pressKey("F6");
					 Thread.sleep(2000);
					 
					 
	}
	
	
	@When("^I validate claim Reject Message \"([^\"]*)\" on screen Rejected Claim Response Information$")
	public void i_validate_claim_Reject_Message_on_screen_Rejected_Claim_Response_Information(String ClaimRejMsg) throws Throwable {
	    
		Mainframe_GlobalFunctionLib.pressKey("F7");
		 Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		 Thread.sleep(2000);
		 
		 Mainframe_GlobalFunctionLib.pressKey("F10");
		 Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		 ClaimRejMsg= Mainframe_GlobalFunctionLib.getText(5, 29).trim() ;
		 
		 
		if (ClaimRejMsg.equals("R"))
	  {
	          Mainframe_GlobalFunctionLib.validateText("16","2", "Maximum Daily Dose of 2.5");
	          Mainframe_GlobalFunctionLib.validateText("17","2", "CMS Transition Per Fill Days Supply Max");
	          Mainframe_GlobalFunctionLib.validateText("18","2", "of 30 exceeded");
	          Mainframe_GlobalFunctionLib.validateText("19","2", "For CMS Transition, resubmit with remain");
	          Mainframe_GlobalFunctionLib.validateText("20","2", "ing days supply of 30 or less.");
	          Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	 		 Thread.sleep(2000);
	 		 
	 		Mainframe_GlobalFunctionLib.pressKey("F12");
			Mainframe_GlobalFunctionLib.pressKey("F12");
			Mainframe_GlobalFunctionLib.pressKey("F3");
			Mainframe_GlobalFunctionLib.pressKey("F3");
			Mainframe_GlobalFunctionLib.pressKey("F12");
			Mainframe_GlobalFunctionLib.pressKey("F12");
	}
		else
		{
			Mainframe_GlobalFunctionLib.pressKey("F12");
			Mainframe_GlobalFunctionLib.pressKey("F12");
			Mainframe_GlobalFunctionLib.pressKey("F3");
			Mainframe_GlobalFunctionLib.pressKey("F3");
			Mainframe_GlobalFunctionLib.pressKey("F12");
			Mainframe_GlobalFunctionLib.pressKey("F12");
		}
		
	}
	
	@When("^I submit a manual claim with the \"([^\"]*)\",\"([^\"]*)\"$")
	public void i_submit_a_manual_claim_with_the(String ds, String memberID) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		FunctionalLibrary.navigateToScreen("3");
		FunctionalLibrary.navigateToScreen("2");
		FunctionalLibrary.navigateToScreen("1");
		if(!(FunctionalLibrary.func_SearchAndSelectADataEditMode("4,4" ,memberID ,"9,4" , memberID))){
			System.out.println("Member Id do not exist ");
		}
		else
		{
		
		Mainframe_GlobalFunctionLib.sendText("12", "026","   " );
		Mainframe_GlobalFunctionLib.sendText("12", "026",ds );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		 Thread.sleep(2000);
		}
	}

	@Then("^validate  claim status \"([^\"]*)\" as paid  for TB stamp \"([^\"]*)\" on  Claim Transaction Additional Info Medicare Part D$")
	public void validate_claim_status_as_paid_for_TB_stamp_on_Claim_Transaction_Additional_Info_Medicare_Part_D(String ClaimSts, String rejRsn) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.pressKey("F7");
		 Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		 Thread.sleep(2000);
		String claimSts =Mainframe_GlobalFunctionLib.getText(20, 6) ;
		
		if (claimSts.equals(ClaimSts))
		{
			
			 Mainframe_GlobalFunctionLib.pressKey("F7");
			 Mainframe_GlobalFunctionLib.sendText("04", "023", "8");
			 Mainframe_GlobalFunctionLib.pressKey("Enter");
			 Mainframe_GlobalFunctionLib.pressKey("F7");
			 String OVNRL = Mainframe_GlobalFunctionLib.getText(10, 17).trim();
			 String NENRL = Mainframe_GlobalFunctionLib.getText(10, 25).trim();
			 String CENRL = Mainframe_GlobalFunctionLib.getText(10, 25).trim();
				 if(OVNRL.equals(rejRsn))
				 {
					 Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
					 Thread.sleep(2000);
				 }
				 else if(CENRL.equals(rejRsn))
			    {
				 Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				 Thread.sleep(2000);
				 Mainframe_GlobalFunctionLib.pressKey("F12");
				 Mainframe_GlobalFunctionLib.pressKey("F12");
				 Mainframe_GlobalFunctionLib.sendText("04", "023", "6");
				 Mainframe_GlobalFunctionLib.pressKey("Enter");
				 Mainframe_GlobalFunctionLib.pressKey("F9");
				 Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				 Thread.sleep(2000);
			    }
				 else if(NENRL.equals(rejRsn))
				    {
					 Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
					 Thread.sleep(2000);
					 Mainframe_GlobalFunctionLib.pressKey("F12");
					 Mainframe_GlobalFunctionLib.pressKey("F12");
					 Mainframe_GlobalFunctionLib.sendText("04", "023", "6");
					 Mainframe_GlobalFunctionLib.pressKey("Enter");
					 Mainframe_GlobalFunctionLib.pressKey("F9");
					 Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
					 Thread.sleep(2000);
				    }
			
			 Mainframe_GlobalFunctionLib.pressKey("F12");
			 Mainframe_GlobalFunctionLib.pressKey("F12");
			 Mainframe_GlobalFunctionLib.pressKey("F3");
			 Mainframe_GlobalFunctionLib.pressKey("F3");
			 Mainframe_GlobalFunctionLib.pressKey("F12");
			 
		}
		else
		{
			Assert.fail("TB stamping not captured successfully: "+rejRsn);
			 Mainframe_GlobalFunctionLib.pressKey("F3");
			 Mainframe_GlobalFunctionLib.pressKey("F3");
			 Mainframe_GlobalFunctionLib.pressKey("F12");

		} 
	}

	@When("^I submit a manual claim with the \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_submit_a_manual_claim_with_the(String FillDate, String memberID, String DspQty, String ds) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		FunctionalLibrary.navigateToScreen("3");
		FunctionalLibrary.navigateToScreen("2");
		FunctionalLibrary.navigateToScreen("1");
		if(!(FunctionalLibrary.func_SearchAndSelectADataEditMode("4,4" ,memberID ,"9,4" , memberID))){
			System.out.println("Member Id do not exist ");
		}
		else
		{
			Mainframe_GlobalFunctionLib.sendText("4", "65","          " );
			Mainframe_GlobalFunctionLib.sendText("4", "65",FillDate );
			Mainframe_GlobalFunctionLib.sendText("12", "11","           " );
			Mainframe_GlobalFunctionLib.sendText("12", "11",DspQty );
			Mainframe_GlobalFunctionLib.sendText("12", "26","   " );
			Mainframe_GlobalFunctionLib.sendText("12", "26",ds );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.pressKey("F6");
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			 Thread.sleep(2000);
		}
	}
	
}
