package com.atdd.demo.te.stepdefinitons;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import com.atdd.te.screenHelpers.FunctionalLibrary;
import com.cucumber.listener.Reporter;
import com.optumrx.autofusion.core.te.util.Mainframe_GlobalFunctionLib;
import com.optumrx.autofusion.core.te.util.Screenshot;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TierException {
	@Then("^I create PA for member with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_create_PA_for_member_with(String Panum, String MSC, String NDCID, String Rsn, String Tier, String TierOverride, String Data) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.sendText("04","020","9");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText("16","005",Panum);
		Mainframe_GlobalFunctionLib.sendText("16","023",MSC);
		Mainframe_GlobalFunctionLib.sendText("16","026",NDCID);
		Mainframe_GlobalFunctionLib.sendText("16","066",Rsn);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText("16","002","2");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F14");
		Mainframe_GlobalFunctionLib.sendText("11","022",Tier);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("F9");
		Mainframe_GlobalFunctionLib.sendText("10","017",TierOverride);
		Mainframe_GlobalFunctionLib.sendText("11","002",Data);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		
	}
	
	@When("^I submit a manual claim with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_submit_a_manual_claim_with(String bin, String proc, String group, String pharmacyID, String rxNbr, String refill, String fillDate, String memberID,String firstname,String lastname, String productID, String dspQty, String ds, String psc, String cost, String ucw) throws Throwable {
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
			Mainframe_GlobalFunctionLib.sendText(14, 41,memberID );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Thread.sleep(4000);
			Mainframe_GlobalFunctionLib.sendText("04" , "065" ,"          ");
			Mainframe_GlobalFunctionLib.sendText("04", "065", fillDate);
			Mainframe_GlobalFunctionLib.sendText("08", "012", lastname);
			Mainframe_GlobalFunctionLib.sendText("08", "030", firstname);
			Mainframe_GlobalFunctionLib.sendText("11", "020",productID );
			Mainframe_GlobalFunctionLib.sendText("12", "011",dspQty );
			Mainframe_GlobalFunctionLib.sendText("12", "026",ds );
			Mainframe_GlobalFunctionLib.sendText("14", "006",psc );
			Mainframe_GlobalFunctionLib.sendText("10", "047","         " );
			Mainframe_GlobalFunctionLib.sendText("10", "047",cost );
			Mainframe_GlobalFunctionLib.sendText("20", "047",ucw );
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
			Mainframe_GlobalFunctionLib.sendText("08", "012", lastname);
			Mainframe_GlobalFunctionLib.sendText("08", "030", firstname);
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
			//Mainframe_GlobalFunctionLib.sendText("20", "047",ucw );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			
			//Mainframe_GlobalFunctionLib.pressKey("F6");
            
		}
		
			System.out.println("Claim is created");	
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			Mainframe_GlobalFunctionLib.pressKey("F6");
			 Thread.sleep(2000);
			 Mainframe_GlobalFunctionLib.pressKey("F7");
			 Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	}
	
	@Then("^I validate the tier code in formulary screen$")
	public void i_validate_the_tier_code_in_formulary_screen() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("F7");
		Mainframe_GlobalFunctionLib.sendText("04", "024","1" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	}
	
	@Then("^I edit details of PA in member screen with \"([^\"]*)\",\"([^\"]*)\"$")
	public void i_edit_details_of_PA_in_member_screen_with(String MemberID, String Data) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.sendText("04", "004",MemberID );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.sendText("10", "002","2" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F8");
		Mainframe_GlobalFunctionLib.sendText("04","020","9");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText("16","002","2");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F14");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("F9");
		Mainframe_GlobalFunctionLib.sendText("11","002",Data);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F3");
	}
	
	@Then("^I edit details of PA in member screen with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_edit_details_of_PA_in_member_screen_with(String MemberID, String Data, String TierOverride) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.sendText("04", "004",MemberID );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.sendText("10", "002","2" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F8");
		Mainframe_GlobalFunctionLib.sendText("04","020","9");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText("16","002","2");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F14");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("F9");
		Mainframe_GlobalFunctionLib.sendText("10","017",TierOverride);
		Mainframe_GlobalFunctionLib.sendText("11","002",Data);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F3");
	}
	
	@Then("^I create MPA for member with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_create_MPA_for_member_with(String Panum, String MSC, String NDCID, String Rsn, String Tier) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.sendText("04","020","9");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText("16","005",Panum);
		Mainframe_GlobalFunctionLib.sendText("16","023",MSC);
		Mainframe_GlobalFunctionLib.sendText("16","026",NDCID);
		Mainframe_GlobalFunctionLib.sendText("16","066",Rsn);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText("16","002","2");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F14");
		Mainframe_GlobalFunctionLib.sendText("11","022",Tier);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("F9");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F3");
	}
	
	
	@Then("^I create DPA for entering the plan tier details with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_create_DPA_for_entering_the_plan_tier_details_with(String CarrierID, String SubmittedPA, String PANum, String Description, String UsageType, String ApplyMIC, String Type, String Wildcard, String fdate, String tdate, String Basis, String ReasonCode, String Utilization, String PA, String DrugSts, String PAGPIList, String Sts, String Agent, String Tier, String FStatus, String TOverride, String Data) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Mainframe_GlobalFunctionLib.sendText("04","025",CarrierID);
		Mainframe_GlobalFunctionLib.sendText("05","025",SubmittedPA);
		Mainframe_GlobalFunctionLib.sendText("05","027",PANum);
		Mainframe_GlobalFunctionLib.sendText("06","014",Description);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		TimeUnit.SECONDS.sleep(15);
		Mainframe_GlobalFunctionLib.sendText("05","015",UsageType);
		Mainframe_GlobalFunctionLib.sendText("06","029",ApplyMIC);
		Mainframe_GlobalFunctionLib.sendText("07","015",Type);
		Mainframe_GlobalFunctionLib.sendText("08","031",Basis);
		Mainframe_GlobalFunctionLib.sendText("09","031",Basis);
		Mainframe_GlobalFunctionLib.sendText("08","067",fdate);
		Mainframe_GlobalFunctionLib.sendText("09","067",tdate);
		Mainframe_GlobalFunctionLib.sendText("09","015",Wildcard);
		Mainframe_GlobalFunctionLib.sendText("10","015",ReasonCode);
		Mainframe_GlobalFunctionLib.sendText("11","015",Agent);
		Mainframe_GlobalFunctionLib.sendText("12","015",Utilization);
		Mainframe_GlobalFunctionLib.sendText("13","015",PA);
		Mainframe_GlobalFunctionLib.sendText("14","018",DrugSts);
		Mainframe_GlobalFunctionLib.sendText("16","014",PAGPIList);
		Mainframe_GlobalFunctionLib.sendText("18","072",Sts);
		Mainframe_GlobalFunctionLib.sendText("19","072",Sts);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F7");
		Mainframe_GlobalFunctionLib.pressKey("F14");
		Mainframe_GlobalFunctionLib.sendText("11","022",Tier);
		Mainframe_GlobalFunctionLib.sendText("12","022",FStatus);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("F9");
		Mainframe_GlobalFunctionLib.sendText("10","017",TOverride);
		Mainframe_GlobalFunctionLib.sendText("11","002",Data);
		Mainframe_GlobalFunctionLib.sendText("11","014",Data);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		
		Mainframe_GlobalFunctionLib.sendText("21","007","2");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Mainframe_GlobalFunctionLib.sendText("05","019",CarrierID);
		Mainframe_GlobalFunctionLib.sendText("06","019",CarrierID);
		Mainframe_GlobalFunctionLib.sendText("06","036","TESTING");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText("10","002","7");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Mainframe_GlobalFunctionLib.sendText("08","025",SubmittedPA);
		Mainframe_GlobalFunctionLib.sendText("08","027",PANum);
		Mainframe_GlobalFunctionLib.sendText("09","013",fdate);
		Mainframe_GlobalFunctionLib.sendText("09","037",tdate);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		TimeUnit.SECONDS.sleep(10);
		Mainframe_GlobalFunctionLib.sendText("14","002","7");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F12");
	}
	
	@Then("^I create DPA for entering the blank plantier details with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_create_DPA_for_entering_the_blank_plantier_details_with(String CarrierID, String PANum, String Tier, String FStatus) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.sendText("04","004",CarrierID);
		Mainframe_GlobalFunctionLib.sendText("04","014","1");
		Mainframe_GlobalFunctionLib.sendText("04","016",PANum);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText("09","002","2");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("F7");
		Mainframe_GlobalFunctionLib.pressKey("F14");
		Mainframe_GlobalFunctionLib.sendText("11","022",Tier);
		Mainframe_GlobalFunctionLib.sendText("12","022",FStatus);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("F9");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F12");
	}
	
	@Then("^I create DPA for entering the plantier details with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_create_DPA_for_entering_the_plantier_details_with(String CarrierID, String SubmittedPA, String PANum, String Description, String UsageType, String ApplyMIC, String Type, String Wildcard, String fdate, String tdate, String Basis, String ReasonCode, String Utilization, String PA, String DrugSts, String PAGPIList, String Sts, String Agent, String Tier, String FStatus, String TOverride, String Data) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		/*Mainframe_GlobalFunctionLib.pressKey("F6");
		Mainframe_GlobalFunctionLib.sendText("04","025",CarrierID);
		Mainframe_GlobalFunctionLib.sendText("05","025",SubmittedPA);
		Mainframe_GlobalFunctionLib.sendText("05","027",PANum);
		Mainframe_GlobalFunctionLib.sendText("06","014",Description);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		TimeUnit.SECONDS.sleep(15);
		Mainframe_GlobalFunctionLib.sendText("05","015",UsageType);
		Mainframe_GlobalFunctionLib.sendText("06","029",ApplyMIC);
		Mainframe_GlobalFunctionLib.sendText("07","015",Type);
		Mainframe_GlobalFunctionLib.sendText("08","031",Basis);
		Mainframe_GlobalFunctionLib.sendText("09","031",Basis);
		Mainframe_GlobalFunctionLib.sendText("08","067",fdate);
		Mainframe_GlobalFunctionLib.sendText("09","067",tdate);
		Mainframe_GlobalFunctionLib.sendText("09","015",Wildcard);
		Mainframe_GlobalFunctionLib.sendText("10","015",ReasonCode);
		Mainframe_GlobalFunctionLib.sendText("11","015",Agent);
		Mainframe_GlobalFunctionLib.sendText("12","015",Utilization);
		Mainframe_GlobalFunctionLib.sendText("13","015",PA);
		Mainframe_GlobalFunctionLib.sendText("14","018",DrugSts);
		Mainframe_GlobalFunctionLib.sendText("16","014",PAGPIList);
		Mainframe_GlobalFunctionLib.sendText("18","072",Sts);
		Mainframe_GlobalFunctionLib.sendText("19","072",Sts);
		Mainframe_GlobalFunctionLib.pressKey("Enter");*/
		
		Mainframe_GlobalFunctionLib.sendText("04","004",CarrierID);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText("09","002","2");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("F7");
		Mainframe_GlobalFunctionLib.pressKey("F14");
		Mainframe_GlobalFunctionLib.sendText("11","022",Tier);
		Mainframe_GlobalFunctionLib.sendText("12","022",FStatus);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("F9");
		Mainframe_GlobalFunctionLib.sendText("10","017",TOverride);
		Mainframe_GlobalFunctionLib.sendText("11","002",Data);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		
		/*Mainframe_GlobalFunctionLib.sendText("21","007","2");
		Mainframe_GlobalFunctionLib.pressKey("Enter");*/
		/*Mainframe_GlobalFunctionLib.pressKey("F6");
		Mainframe_GlobalFunctionLib.sendText("05","019",CarrierID);
		Mainframe_GlobalFunctionLib.sendText("06","019",CarrierID);
		Mainframe_GlobalFunctionLib.sendText("06","036","TESTING");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText("10","002","7");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Mainframe_GlobalFunctionLib.sendText("08","025",SubmittedPA);
		Mainframe_GlobalFunctionLib.sendText("08","027",PANum);
		Mainframe_GlobalFunctionLib.sendText("09","013",fdate);
		Mainframe_GlobalFunctionLib.sendText("09","037",tdate);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		TimeUnit.SECONDS.sleep(10);
		Mainframe_GlobalFunctionLib.sendText("14","002","7");
		Mainframe_GlobalFunctionLib.pressKey("Enter");*/
	/*	
		Mainframe_GlobalFunctionLib.sendText("04","005",CarrierID);
		Mainframe_GlobalFunctionLib.sendText("04","016",CarrierID);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText("10","002","7");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Mainframe_GlobalFunctionLib.sendText("08","025",SubmittedPA);
		Mainframe_GlobalFunctionLib.sendText("08","027",PANum);
		Mainframe_GlobalFunctionLib.sendText("09","013",fdate);
		Mainframe_GlobalFunctionLib.sendText("09","037",tdate);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		TimeUnit.SECONDS.sleep(10);
		Mainframe_GlobalFunctionLib.sendText("14","002","7");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F12");*/ 
		
		/*Mainframe_GlobalFunctionLib.sendText("21","007","3");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Mainframe_GlobalFunctionLib.click(5,12);
		Mainframe_GlobalFunctionLib.pressKey("F4"); 
		Mainframe_GlobalFunctionLib.sendText("04","005",CarrierID);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText("09","002","1");
		Mainframe_GlobalFunctionLib.pressKey("Enter");		
		Mainframe_GlobalFunctionLib.sendText("12","002",fdate);	
		Mainframe_GlobalFunctionLib.sendText("12","014",tdate);
		Mainframe_GlobalFunctionLib.sendText("15","017","Y");
		Mainframe_GlobalFunctionLib.pressKey("Enter");		
		Mainframe_GlobalFunctionLib.sendText("16","064","Y");
		Mainframe_GlobalFunctionLib.pressKey("F12"); 
		Mainframe_GlobalFunctionLib.pressKey("F12"); */
	}
	
	@Then("^I modify the dates in the Preferred Product List Product Detail screen with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_modify_the_dates_in_the_Preferred_Product_List_Product_Detail_screen_with(String fdate, String tdate, String plancode) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.sendText("21","007","1"); 
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText("04","005",plancode); 
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText("11","002","2");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.click(20,17);
		Mainframe_GlobalFunctionLib.pressKey("F4");
		Mainframe_GlobalFunctionLib.sendText("09","002","7");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText("12","002","7");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText("13","002","5");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText("15","002","2");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText("14","002",fdate);
		Robot ro = new Robot();
		for(int i=0;i<9;i++)
		{
		ro.keyPress(KeyEvent.VK_DELETE);
		ro.keyRelease(KeyEvent.VK_DELETE);
		}
		Mainframe_GlobalFunctionLib.sendText("14","012",tdate);
		for(int i=0;i<9;i++)
		{
		ro.keyPress(KeyEvent.VK_DELETE);
		ro.keyRelease(KeyEvent.VK_DELETE);
		}
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		
		
		/*Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F7");
		Mainframe_GlobalFunctionLib.sendText("07","021","2");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F17");
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Mainframe_GlobalFunctionLib.click(7,11);
		Mainframe_GlobalFunctionLib.pressKey("F4");
		Mainframe_GlobalFunctionLib.sendText("04","005","T1621");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText("09","002","1");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		TimeUnit.SECONDS.sleep(10);
		Mainframe_GlobalFunctionLib.sendText("13","002","4");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText("16","064","Y");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");*/
	}
	
	@When("^I submit a  DPA manual claim with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_submit_a_DPA_manual_claim_with(String bin, String proc, String group, String pharmacyID, String rxNbr, String refill, String fillDate, String memberID,String firstname,String lastname, String productID, String dspQty, String ds, String psc, String patype, String panum) throws Throwable {
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
			Mainframe_GlobalFunctionLib.sendText(14, 41,memberID );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Thread.sleep(4000);
			Mainframe_GlobalFunctionLib.sendText("04" , "065" ,"          ");
			Mainframe_GlobalFunctionLib.sendText("04", "065", fillDate);
			Mainframe_GlobalFunctionLib.sendText("08", "012", lastname);
			Mainframe_GlobalFunctionLib.sendText("08", "030", firstname);
			Mainframe_GlobalFunctionLib.sendText("11", "020",productID );
			Mainframe_GlobalFunctionLib.sendText("12", "011",dspQty );
			Mainframe_GlobalFunctionLib.sendText("12", "026",ds );
			Mainframe_GlobalFunctionLib.sendText("14", "006",psc );
			Mainframe_GlobalFunctionLib.sendText("10", "047","         " );
			Mainframe_GlobalFunctionLib.sendText("18", "019",patype );
			Mainframe_GlobalFunctionLib.sendText("18", "026",panum );
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
			Mainframe_GlobalFunctionLib.sendText("08", "012", lastname);
			Mainframe_GlobalFunctionLib.sendText("08", "030", firstname);
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
			Mainframe_GlobalFunctionLib.sendText("18", "019",patype );
			Mainframe_GlobalFunctionLib.sendText("18", "026",panum );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			
			//Mainframe_GlobalFunctionLib.pressKey("F6");
            
		}
		
			System.out.println("Claim is created");	
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			Mainframe_GlobalFunctionLib.pressKey("F6");
			 Thread.sleep(2000);
			 Mainframe_GlobalFunctionLib.pressKey("F7");
			 Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	}
	
	@When("^I create a PartD profile with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_create_a_PartD_profile_with(String carrierid, String accid, String grpid, String plancode) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.sendText("21", "007","14" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText("21", "007","1" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText("04", "005","T1621" );
		Mainframe_GlobalFunctionLib.sendText("04", "016","A1621" );
		Mainframe_GlobalFunctionLib.sendText("04", "033","G1621" );
		Mainframe_GlobalFunctionLib.sendText("04", "050","AKURPAORDE" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText("09", "002","3" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.click(12, 24);
		Mainframe_GlobalFunctionLib.pressKey("F4");
		Mainframe_GlobalFunctionLib.sendText("04", "005",carrierid );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText("09", "002","1" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.click(15, 24);
		Mainframe_GlobalFunctionLib.pressKey("F4");
		Mainframe_GlobalFunctionLib.sendText("04", "005",plancode );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText("10", "002","1" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F12");
	}
	
	@Then("^Validating the error message with \"([^\"]*)\"$")
	public void validating_the_error_message_with(String memid) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.sendText("04", "004",memid );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.sendText("10", "002","2" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F8");
		Mainframe_GlobalFunctionLib.sendText("04", "020","9" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.sendText("16", "002","2" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F14");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("F9");
		Mainframe_GlobalFunctionLib.sendText("10", "017","I" );
		Mainframe_GlobalFunctionLib.sendText("11", "002","05" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F11");
		Mainframe_GlobalFunctionLib.sendText("16", "064","Y" );
		Mainframe_GlobalFunctionLib.pressKey("F9");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		String err_msg = "Tier Override I/E flag cannot be blank";
		String actual_msg = Mainframe_GlobalFunctionLib.getText(24, 2);
		if(err_msg.equals(actual_msg))
		{
			 Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		}
	}
	
	@Then("^Validating the error message with \"([^\"]*)\" for DPA$")
	public void validating_the_error_message_with_for_DPA(String carrierid) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.sendText("04", "004",carrierid );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.sendText("09", "002","2" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F7");
		Mainframe_GlobalFunctionLib.pressKey("F14");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("F9");
		Mainframe_GlobalFunctionLib.sendText("10", "017","I" );
		Mainframe_GlobalFunctionLib.sendText("11", "002","06" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("F11");
		Mainframe_GlobalFunctionLib.sendText("16", "064","Y" );
		Mainframe_GlobalFunctionLib.pressKey("F9");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		String err_msg = "Tier Override I/E flag cannot be blank";
		String actual_msg = Mainframe_GlobalFunctionLib.getText(24, 2);
		if(err_msg.equals(actual_msg))
		{
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		}
	}
	
	@Then("^Capture the date and user present on MPA screen with \"([^\"]*)\"$")
	public void capture_the_date_and_user_present_on_MPA_screen_with(String memberid) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.sendText("04", "004",memberid );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.sendText("10", "002","2" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F8");
		Mainframe_GlobalFunctionLib.sendText("04", "020","9" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.sendText("16", "002","2" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F14");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	}
	
	@Then("^Validating the date and user modified on MPA screen with \"([^\"]*)\",\"([^\"]*)\"$")
	public void validating_the_date_and_user_modified_on_MPA_screen_with(String memberid, String tieroverride) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.sendText("04", "004",memberid );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.sendText("10", "002","2" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F8");
		Mainframe_GlobalFunctionLib.sendText("04", "020","9" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.sendText("16", "002","2" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F14");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.sendText("11", "022",tieroverride);
		Mainframe_GlobalFunctionLib.sendText("12", "022","05");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	}
	@When("^I check for the date and user on MPA screen with \"([^\"]*)\"$")
	public void i_check_for_the_date_and_user_on_MPA_screen_with(String memberid) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.sendText("04", "004",memberid );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.sendText("10", "002","2" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F8");
		Mainframe_GlobalFunctionLib.sendText("04", "020","9" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.sendText("16", "002","2" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F14");
		Mainframe_GlobalFunctionLib.pressKey("F9");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	}
	
	@When("^I login with different credential with \"([^\"]*)\",\"([^\"]*)\"$")
	public void i_login_with_different_credential_with(String username, String pwd) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.sendText("20", "007","90" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText("06", "033",username );
		Mainframe_GlobalFunctionLib.PressTabKey();
		Mainframe_GlobalFunctionLib.sendText("07", "033",pwd );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText("21", "007","6" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText("06", "041","8402" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText("21", "007","20" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
	}
	
	@Then("^I Validate the date and user modified on MPA screen with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_Validate_the_date_and_user_modified_on_MPA_screen_with(String memberid, String toflag, String data) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.sendText("04", "004",memberid );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.sendText("10", "002","2" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F8");
		Mainframe_GlobalFunctionLib.sendText("04", "020","9" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.sendText("16", "002","2" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F14");
		Mainframe_GlobalFunctionLib.pressKey("F9");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.sendText("10", "017",toflag );
		Mainframe_GlobalFunctionLib.sendText("11", "002",data );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	}
	
	@Then("^I capturing the present tier override and formulary status data on DPA screen with \"([^\"]*)\"$")
	public void i_capturing_the_present_tier_override_and_formulary_status_data_on_DPA_screen_with(String carrier) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.sendText("04", "004",carrier );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.sendText("09", "002","2" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F7");
		Mainframe_GlobalFunctionLib.pressKey("F14");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("F9");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	}
	
	@Then("^I validate the changed date and user in DPA screen with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_validate_the_changed_date_and_user_in_DPA_screen_with(String carrier, String tieroverride, String fstatus, String flag, String data) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.sendText("21", "007","4" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText("21", "007","4" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText("21", "007","1" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText("04", "004",carrier );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.sendText("09", "002","2" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F7");
		Mainframe_GlobalFunctionLib.pressKey("F14");
		Mainframe_GlobalFunctionLib.sendText("11", "022",tieroverride);
		Mainframe_GlobalFunctionLib.sendText("12", "022",fstatus);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("F9");
		Mainframe_GlobalFunctionLib.sendText("10", "017",flag);
		Mainframe_GlobalFunctionLib.sendText("11", "002",data);
		Mainframe_GlobalFunctionLib.sendText("11", "014",data);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	}
	
	@Then("^I modify the tier override and formulary status in DPA screen with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_modify_the_tier_override_and_formulary_status_in_DPA_screen_with(String carrier, String tier, String status, String flag, String data) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.sendText("04", "004",carrier);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.sendText("09", "002","2");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F7");
		Mainframe_GlobalFunctionLib.pressKey("F14");
		Mainframe_GlobalFunctionLib.sendText("11", "022",tier);
		Mainframe_GlobalFunctionLib.sendText("12", "022",status);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("F9");
		Mainframe_GlobalFunctionLib.sendText("10", "017",flag);
		Mainframe_GlobalFunctionLib.sendText("11", "002",data);
		Mainframe_GlobalFunctionLib.click(11, 14);
		Robot rob = new Robot();
		for(int i=0;i<2;i++)
		{
			rob.keyPress(KeyEvent.VK_DELETE);
			rob.keyRelease(KeyEvent.VK_DELETE);
		}
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F12");
	}
}


