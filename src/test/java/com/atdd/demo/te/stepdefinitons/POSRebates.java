package com.atdd.demo.te.stepdefinitons;

import java.util.concurrent.TimeUnit;

import com.atdd.te.screenHelpers.FunctionalLibrary;
import com.cucumber.listener.Reporter;
import com.optumrx.autofusion.core.te.util.Mainframe_GlobalFunctionLib;
import com.optumrx.autofusion.core.te.util.Screenshot;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class POSRebates {
	
	@Then("^I create a new Plan with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_create_a_new_Plan_with(String PlanCode, String PlanFromDt, String ThruDate, String PharmPriceSched, String ClientPriceSched, String ApplyTo, String List, String Level, String DedSched, String OOPSched) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Mainframe_GlobalFunctionLib.sendText("13","019", PlanCode);
		Mainframe_GlobalFunctionLib.sendText("14","019", PlanFromDt);
		Mainframe_GlobalFunctionLib.sendText("15","019", "SR41416 TESTING");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText("16","064", "Y");
		TimeUnit.SECONDS.sleep(15);
		Mainframe_GlobalFunctionLib.sendText("13","077", "Y");
		Mainframe_GlobalFunctionLib.sendText("14","077", "Y");
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
		Mainframe_GlobalFunctionLib.sendText("04","006",PharmPriceSched);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText("10","002","1");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText("16","064","Y");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		//Billing
		Mainframe_GlobalFunctionLib.sendText("21","012", "2");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Mainframe_GlobalFunctionLib.sendText("08","012",PlanFromDt);
		Mainframe_GlobalFunctionLib.sendText("08","036",ThruDate);
		Mainframe_GlobalFunctionLib.click(10, 26);
		Mainframe_GlobalFunctionLib.pressKey("F4");
		Mainframe_GlobalFunctionLib.sendText("03","005",ClientPriceSched);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText("08","002","1");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		//Patient Pay
		Mainframe_GlobalFunctionLib.sendText("21","012", "8");
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
		//POS
		Mainframe_GlobalFunctionLib.pressKey("PageDown");
		Mainframe_GlobalFunctionLib.sendText("16","012", "17");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Mainframe_GlobalFunctionLib.sendText("09","012",PlanFromDt);
		Mainframe_GlobalFunctionLib.sendText("09","035",ThruDate);
		Mainframe_GlobalFunctionLib.sendText("11","013",ApplyTo);
		Mainframe_GlobalFunctionLib.click(12,13);
		Mainframe_GlobalFunctionLib.pressKey("F4");
		Mainframe_GlobalFunctionLib.sendText("04","005",List);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText("09","002","1");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText("16","064","Y");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		//Accumulators
		Mainframe_GlobalFunctionLib.sendText("07","021", "29");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText("15","012", "1");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Mainframe_GlobalFunctionLib.sendText("07","013",PlanFromDt);
		Mainframe_GlobalFunctionLib.sendText("07","041",ThruDate);
		Mainframe_GlobalFunctionLib.sendText("09","029", Level);
		Mainframe_GlobalFunctionLib.sendText("14","029", DedSched);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		
		Mainframe_GlobalFunctionLib.sendText("15","012", "2");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Mainframe_GlobalFunctionLib.sendText("07","013",PlanFromDt);
		Mainframe_GlobalFunctionLib.sendText("07","041",ThruDate);
		Mainframe_GlobalFunctionLib.sendText("09","029", Level);
		Mainframe_GlobalFunctionLib.sendText("14","029", OOPSched);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F3");
	}
	
	@When("^I submit a manual claim with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_submit_a_manual_claim_with(String bin, String proc, String group, String pharmacyID, String rxNbr, String refill, String fillDate, String memberID, String productID, String dspQty, String ds, String psc, String cost, String ucw, String prod1, String prod2, String qty, String pcost) throws Throwable {
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
			Mainframe_GlobalFunctionLib.sendText("11", "020",productID );
			Mainframe_GlobalFunctionLib.sendText("12", "011",dspQty );
			Mainframe_GlobalFunctionLib.sendText("12", "026",ds );
			Mainframe_GlobalFunctionLib.sendText("14", "006",psc );
			Mainframe_GlobalFunctionLib.sendText("14", "14","2" );
			Mainframe_GlobalFunctionLib.sendText("10", "047","         " );
			Mainframe_GlobalFunctionLib.sendText("10", "047",cost );
			Mainframe_GlobalFunctionLib.sendText("20", "047",ucw );
			Mainframe_GlobalFunctionLib.pressKey("F14");
			//MI
			Mainframe_GlobalFunctionLib.sendText("05", "23","5" );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.pressKey("F6");
			Mainframe_GlobalFunctionLib.sendText("12", "20","01" );
			Mainframe_GlobalFunctionLib.sendText("13", "20",prod1 );
			Mainframe_GlobalFunctionLib.sendText("15", "20",qty );
			Mainframe_GlobalFunctionLib.sendText("16", "20",pcost );
			Mainframe_GlobalFunctionLib.sendText("18", "20","00");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.pressKey("F6");
			Mainframe_GlobalFunctionLib.sendText("12", "20","01" );
			Mainframe_GlobalFunctionLib.sendText("13", "20",prod2 );
			Mainframe_GlobalFunctionLib.sendText("15", "20",qty );
			Mainframe_GlobalFunctionLib.sendText("16", "20",pcost );
			Mainframe_GlobalFunctionLib.sendText("18", "20","00");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			Mainframe_GlobalFunctionLib.pressKey("F12");
			Mainframe_GlobalFunctionLib.pressKey("F12");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			
			
		}
		else{
			
		Mainframe_GlobalFunctionLib.sendText("09", "002","1" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
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
			Mainframe_GlobalFunctionLib.sendText("12", "026",ds );
			Mainframe_GlobalFunctionLib.sendText("14", "006",psc );
			Mainframe_GlobalFunctionLib.sendText("14", "14","2" );
			Mainframe_GlobalFunctionLib.sendText("10", "047","         " );
			Mainframe_GlobalFunctionLib.sendText("10", "047",cost );
			Mainframe_GlobalFunctionLib.sendText("20", "047",ucw );
			Mainframe_GlobalFunctionLib.pressKey("F14");
			//MI
			Mainframe_GlobalFunctionLib.sendText("05", "23","5" );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.pressKey("F6");
			Mainframe_GlobalFunctionLib.sendText("12", "20","01" );
			Mainframe_GlobalFunctionLib.sendText("13", "20",prod1 );
			Mainframe_GlobalFunctionLib.sendText("15", "20",qty );
			Mainframe_GlobalFunctionLib.sendText("16", "20",pcost );
			Mainframe_GlobalFunctionLib.sendText("18", "20","00");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.pressKey("F6");
			Mainframe_GlobalFunctionLib.sendText("12", "20","01" );
			Mainframe_GlobalFunctionLib.sendText("13", "20",prod2 );
			Mainframe_GlobalFunctionLib.sendText("15", "20",qty );
			Mainframe_GlobalFunctionLib.sendText("16", "20",pcost );
			Mainframe_GlobalFunctionLib.sendText("18", "20","00");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			Mainframe_GlobalFunctionLib.pressKey("F12");
			Mainframe_GlobalFunctionLib.pressKey("F12");
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
	
	@When("^I submit a manual claim with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_submit_a_manual_claim_with(String bin, String proc, String group, String pharmacyID, String rxNbr, String refill, String fillDate, String memberID, String productID, String dspQty, String ds, String psc, String cost, String ucw) throws Throwable {
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
			
		Mainframe_GlobalFunctionLib.sendText("09", "002","1" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
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
			Mainframe_GlobalFunctionLib.sendText("20", "047",ucw );
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
	
	@Then("^I edit the deductible schedule steps with \"([^\"]*)\",\"([^\"]*)\"$")
	public void i_edit_the_deductible_schedule_steps_with(String dedsched, String indcost) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.sendText("04", "05",dedsched );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText("10", "02","7" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText("14", "02","2" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText("10", "024","          " );
		Mainframe_GlobalFunctionLib.sendText("10", "024",indcost);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F3");
	}
	
	@Then("^I modify the patient pay table with \"([^\"]*)\",\"([^\"]*)\"$")
	public void i_modify_the_patient_pay_table_with(String PatPayTable, String CalcBasis) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.sendText("04", "05",PatPayTable );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText("10", "02","2" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText("11", "021","      " );
		Mainframe_GlobalFunctionLib.sendText("11", "046","      ");
		Mainframe_GlobalFunctionLib.sendText("12", "046",CalcBasis);
		Mainframe_GlobalFunctionLib.sendText("17", "021","      " );
		Mainframe_GlobalFunctionLib.sendText("17", "021","10");
		Mainframe_GlobalFunctionLib.sendText("17", "046","      ");
		Mainframe_GlobalFunctionLib.sendText("18", "046","  ");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F12");
	}
	
	@Then("^I edit the patient pay table with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_edit_the_patient_pay_table_with(String PatPayTable, String BrandAmt, String BrandPercent, String GenericAmt, String CalcBasis, String GenericPercent, String Compcode, String Genericcalc) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.sendText("04", "05",PatPayTable );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText("10", "02","2" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.sendText("06", "030","  ");
		Mainframe_GlobalFunctionLib.sendText("06", "030",Compcode );
		Mainframe_GlobalFunctionLib.sendText("11", "021","      " );
		Mainframe_GlobalFunctionLib.sendText("11", "021",BrandAmt);
		Mainframe_GlobalFunctionLib.sendText("11", "046","      ");
		Mainframe_GlobalFunctionLib.sendText("11", "046",BrandPercent);
		Mainframe_GlobalFunctionLib.sendText("12", "046",CalcBasis);
		Mainframe_GlobalFunctionLib.sendText("17", "021","      " );
		Mainframe_GlobalFunctionLib.sendText("17", "021",GenericAmt);
		Mainframe_GlobalFunctionLib.sendText("17", "046","      ");
		Mainframe_GlobalFunctionLib.sendText("17", "046",GenericPercent);
		Mainframe_GlobalFunctionLib.sendText("18", "046",Genericcalc);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F12");
	}
	
	@Then("^I edit the patient pay table with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_edit_the_patient_pay_table_with(String PatPayTable, String BrandAmt, String BrandPercent, String GenericAmt, String CalcBasis, String GenericPercent, String Compcode) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.sendText("04", "05",PatPayTable );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText("10", "02","2" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.sendText("06", "030","  ");
		Mainframe_GlobalFunctionLib.sendText("06", "030",Compcode );
		Mainframe_GlobalFunctionLib.sendText("11", "021","      " );
		Mainframe_GlobalFunctionLib.sendText("11", "021",BrandAmt);
		Mainframe_GlobalFunctionLib.sendText("11", "046","      ");
		Mainframe_GlobalFunctionLib.sendText("11", "046",BrandPercent);
		Mainframe_GlobalFunctionLib.sendText("12", "046",CalcBasis);
		Mainframe_GlobalFunctionLib.sendText("17", "021","      " );
		Mainframe_GlobalFunctionLib.sendText("17", "021",GenericAmt);
		Mainframe_GlobalFunctionLib.sendText("17", "046","      ");
		Mainframe_GlobalFunctionLib.sendText("17", "046",GenericPercent);
		Mainframe_GlobalFunctionLib.sendText("18", "046",CalcBasis);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F12");
	}
	
	@Then("^I edit the patient pay table with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_edit_the_patient_pay_table_with(String PatPayTable, String BrandAmt, String BrandPercent, String GenericAmt, String CalcBasis, String GenericPercent) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.sendText("04", "05",PatPayTable );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText("10", "02","2" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.sendText("11", "021","      " );
		Mainframe_GlobalFunctionLib.sendText("11", "021",BrandAmt);
		Mainframe_GlobalFunctionLib.sendText("11", "046","      ");
		Mainframe_GlobalFunctionLib.sendText("11", "046",BrandPercent);
		Mainframe_GlobalFunctionLib.sendText("12", "046",CalcBasis);
		Mainframe_GlobalFunctionLib.sendText("17", "021","      " );
		Mainframe_GlobalFunctionLib.sendText("17", "021",GenericAmt);
		Mainframe_GlobalFunctionLib.sendText("17", "046","      ");
		Mainframe_GlobalFunctionLib.sendText("17", "046",GenericPercent);
		Mainframe_GlobalFunctionLib.sendText("18", "046",CalcBasis);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F12");
	}
	
	@Then("^I edit the patient pay table with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_edit_the_patient_pay_table_with(String PatPayTable, String BrandAmt, String BrandPercent, String GenericAmt, String CalcBasis) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.sendText("04", "05",PatPayTable );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText("10", "02","2" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.sendText("11", "021","      " );
		Mainframe_GlobalFunctionLib.sendText("11", "021",BrandAmt);
		Mainframe_GlobalFunctionLib.sendText("11", "046","      ");
		Mainframe_GlobalFunctionLib.sendText("11", "046",BrandPercent);
		Mainframe_GlobalFunctionLib.sendText("12", "046",CalcBasis);
		Mainframe_GlobalFunctionLib.sendText("17", "021","      " );
		Mainframe_GlobalFunctionLib.sendText("17", "021",GenericAmt);
		Mainframe_GlobalFunctionLib.sendText("17", "046","      ");
		Mainframe_GlobalFunctionLib.sendText("18", "046","  ");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F12");
	}
	
	@Then("^navigating to adjustment information detail screen to validate the secondary diff$")
	public void navigating_to_adjustment_information_detail_screen_to_validate_the_secondary_diff() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.click(17,49);
		Mainframe_GlobalFunctionLib.pressKey("F4");
		Mainframe_GlobalFunctionLib.sendText("09", "02","5");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	}
	
	
		@Then("^modifying the sequence for drug cost schedule with \"([^\"]*)\",\"([^\"]*)\"$")
		public void modifying_the_sequence_for_drug_cost_schedule_with(String drugsched, String drugcode) throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			Mainframe_GlobalFunctionLib.sendText("04", "05",drugsched);
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText("10", "02","7");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			if((Mainframe_GlobalFunctionLib.getText(12, 8)).equals("SUBMITTED"))
			{
				Mainframe_GlobalFunctionLib.sendText("12", "02","2");
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText("09", "016","          ");
				Mainframe_GlobalFunctionLib.sendText("09", "016",drugcode);
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.pressKey("F3");
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				Mainframe_GlobalFunctionLib.pressKey("F3");
				Mainframe_GlobalFunctionLib.pressKey("F3");
				Mainframe_GlobalFunctionLib.pressKey("F12");
			}
		}
		
		@Then("^modifying the sequence for drug cost schedule with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
		public void modifying_the_sequence_for_drug_cost_schedule_with(String drugsched, String drugcode, String rate) throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			Mainframe_GlobalFunctionLib.sendText("04", "05",drugsched);
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText("10", "02","7");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			if((Mainframe_GlobalFunctionLib.getText(12, 8)).equals("SUBMITTED"))
			{
				Mainframe_GlobalFunctionLib.sendText("12", "02","2");
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText("09", "016","          ");
				Mainframe_GlobalFunctionLib.sendText("09", "016",drugcode);
				Mainframe_GlobalFunctionLib.sendText("14", "016","      ");
				Mainframe_GlobalFunctionLib.sendText("14", "016",rate);
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.pressKey("F3");
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				Mainframe_GlobalFunctionLib.pressKey("F3");
				Mainframe_GlobalFunctionLib.pressKey("F3");
				Mainframe_GlobalFunctionLib.pressKey("F12");
			}
		}

		
		@Then("^navigated to individual deductible period accumulator screen with \"([^\"]*)\"$")
		public void navigated_to_individual_deductible_period_accumulator_screen_with(String memid) throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			Mainframe_GlobalFunctionLib.sendText("04", "04",memid);
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText("10", "02","5");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.pressKey("F8");
			Mainframe_GlobalFunctionLib.sendText("04", "20","19");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText("04", "20","1");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText("10", "02","7");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText("11", "02","5");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			Mainframe_GlobalFunctionLib.pressKey("F12");
			Mainframe_GlobalFunctionLib.pressKey("F3");
			Mainframe_GlobalFunctionLib.pressKey("F3");
			Mainframe_GlobalFunctionLib.pressKey("F3");
			Mainframe_GlobalFunctionLib.pressKey("F3");
			Mainframe_GlobalFunctionLib.pressKey("F3");
		}
		
		@Then("^edit the plan details with \"([^\"]*)\",\"([^\"]*)\"$")
		public void edit_the_plan_details_with(String plancode, String flag) throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			Mainframe_GlobalFunctionLib.sendText("04", "05",plancode);
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText("11", "02","2");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.pressKey("F7");
			Mainframe_GlobalFunctionLib.sendText("07", "21","28");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText("21", "12","2");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText("12", "02","4");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText("16", "64","Y");
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			Mainframe_GlobalFunctionLib.pressKey("F12");
			Mainframe_GlobalFunctionLib.sendText("21", "12","8");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText("11", "02","4");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText("16", "64","Y");
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			Mainframe_GlobalFunctionLib.pressKey("F12");
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			Mainframe_GlobalFunctionLib.pressKey("F3");
			Mainframe_GlobalFunctionLib.pressKey("F3");
			Mainframe_GlobalFunctionLib.pressKey("F3");
		}
		
		@Then("^adding the billing and patient pay to plan with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
		public void adding_the_billing_and_patient_pay_to_plan_with(String plancode, String clientsched, String fdate, String tdate) throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			Mainframe_GlobalFunctionLib.sendText("04", "05",plancode);
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText("11", "02","2");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.pressKey("F7");
			Mainframe_GlobalFunctionLib.sendText("07", "21","28");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText("21", "12","2");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.pressKey("F6");
			Mainframe_GlobalFunctionLib.sendText("08","012",fdate);
			Mainframe_GlobalFunctionLib.sendText("08","036",tdate);
			Mainframe_GlobalFunctionLib.click(10, 26);
			Mainframe_GlobalFunctionLib.pressKey("F4");
			Mainframe_GlobalFunctionLib.sendText("03","005",clientsched);
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText("08","002","1");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.pressKey("F12");
			//Patient Pay
			Mainframe_GlobalFunctionLib.sendText("21","012", "8");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.pressKey("F6");
			Mainframe_GlobalFunctionLib.sendText("09","002",fdate);
			Mainframe_GlobalFunctionLib.sendText("09","012",tdate);
			Mainframe_GlobalFunctionLib.click(9, 22);
			Mainframe_GlobalFunctionLib.pressKey("F4");
			Mainframe_GlobalFunctionLib.sendText("04","006",clientsched);
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText("10","002","1");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText("16","064","Y");
			Mainframe_GlobalFunctionLib.pressKey("F12");
		}
		
		@Then("^navigating to deductible period screen with \"([^\"]*)\"$")
		public void navigating_to_deductible_period_screen_with(String memid) throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			Mainframe_GlobalFunctionLib.sendText("04","04",memid );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText("10","02","5");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.pressKey("F8");
			Mainframe_GlobalFunctionLib.sendText("04","20","19" );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText("04","20","1" );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			Mainframe_GlobalFunctionLib.pressKey("F3");
			Mainframe_GlobalFunctionLib.pressKey("F3");
			Mainframe_GlobalFunctionLib.pressKey("F3");
			Mainframe_GlobalFunctionLib.pressKey("F3");
		}
		
		@Then("^navigating to deductible schedule steps detail screen with \"([^\"]*)\"$")
		public void navigating_to_deductible_schedule_steps_detail_screen_with(String dedsched) throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			Mainframe_GlobalFunctionLib.sendText("04","05",dedsched );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText("10","02","7");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText("14","02","5");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			Mainframe_GlobalFunctionLib.pressKey("F3");
			Mainframe_GlobalFunctionLib.pressKey("F3");
			Mainframe_GlobalFunctionLib.pressKey("F12");
		
		}
		
		@Then("^navigating to price schedule related screens with \"([^\"]*)\"$")
		public void navigating_to_price_schedule_related_screens_with(String plancode) throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			Mainframe_GlobalFunctionLib.sendText("04", "05",plancode);
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText("11", "02","5");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.pressKey("F7");
			Mainframe_GlobalFunctionLib.sendText("07", "21","28");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText("21", "12","2");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			Mainframe_GlobalFunctionLib.click(12,27);
			Mainframe_GlobalFunctionLib.pressKey("F4");
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			Mainframe_GlobalFunctionLib.pressKey("F15");
			Mainframe_GlobalFunctionLib.sendText("12", "02","5");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.click(8,21);
			Mainframe_GlobalFunctionLib.pressKey("F4");
			Mainframe_GlobalFunctionLib.sendText("10", "02","5");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.click(11,37);
			Mainframe_GlobalFunctionLib.pressKey("F4");
			Mainframe_GlobalFunctionLib.pressKey("F7");
			Mainframe_GlobalFunctionLib.sendText("14", "02","5");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.click(15,15);
			Mainframe_GlobalFunctionLib.pressKey("F4");
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			Mainframe_GlobalFunctionLib.pressKey("F3");
			Mainframe_GlobalFunctionLib.pressKey("F3");
			Mainframe_GlobalFunctionLib.pressKey("F3");
			Mainframe_GlobalFunctionLib.pressKey("F3");
			Mainframe_GlobalFunctionLib.pressKey("F3");
			Mainframe_GlobalFunctionLib.pressKey("F12");
			Mainframe_GlobalFunctionLib.pressKey("F12");
			Mainframe_GlobalFunctionLib.pressKey("F12");
			Mainframe_GlobalFunctionLib.sendText("21", "12","8");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.click(11,23);
			Mainframe_GlobalFunctionLib.pressKey("F4");
			Mainframe_GlobalFunctionLib.pressKey("F15");
			Mainframe_GlobalFunctionLib.sendText("12", "02","5");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.click(6,26);
			Mainframe_GlobalFunctionLib.pressKey("F4");
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			Mainframe_GlobalFunctionLib.pressKey("F3");
			Mainframe_GlobalFunctionLib.pressKey("F12");
			Mainframe_GlobalFunctionLib.sendText("21", "12","17");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			Mainframe_GlobalFunctionLib.sendText("11", "02","7");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText("11", "02","7");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			Mainframe_GlobalFunctionLib.pressKey("F3");
			Mainframe_GlobalFunctionLib.pressKey("F3");
			Mainframe_GlobalFunctionLib.pressKey("F3");
			Mainframe_GlobalFunctionLib.pressKey("F3");
			Mainframe_GlobalFunctionLib.pressKey("F12");
		}
		
		@Then("^adding multi ingredient compounds with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
		public void adding_multi_ingredient_compounds_with(String plancode, String prod1, String prod2, String qty, String pcost, String rebamt) throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			Mainframe_GlobalFunctionLib.sendText("04", "05",plancode);
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText("11", "02","2");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText("14", "24","Y");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText("16", "64","Y");
			Mainframe_GlobalFunctionLib.pressKey("F7");
			Mainframe_GlobalFunctionLib.sendText("07", "21","9");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText("13", "12","1");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText("05", "22","        ");
			Mainframe_GlobalFunctionLib.sendText("05", "22","010101");
			Mainframe_GlobalFunctionLib.sendText("05", "49","        ");
			Mainframe_GlobalFunctionLib.sendText("05", "49","123139");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.pressKey("F12");
			Mainframe_GlobalFunctionLib.sendText("13", "12","2");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText("07", "25","        ");
			Mainframe_GlobalFunctionLib.sendText("07", "25","010101");
			Mainframe_GlobalFunctionLib.sendText("07", "47","        ");
			Mainframe_GlobalFunctionLib.sendText("07", "47","123139");
			Mainframe_GlobalFunctionLib.sendText("10", "37","N");
			Mainframe_GlobalFunctionLib.sendText("10", "60","1");
			Mainframe_GlobalFunctionLib.click(11,16);
			Mainframe_GlobalFunctionLib.pressKey("F4");
			Mainframe_GlobalFunctionLib.sendText("13", "03","X");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText("14", "44","a");
			Mainframe_GlobalFunctionLib.sendText("15", "44","M");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.pressKey("F12");
			Mainframe_GlobalFunctionLib.pressKey("F12");
			Mainframe_GlobalFunctionLib.pressKey("F12");
			Mainframe_GlobalFunctionLib.pressKey("F12");
			Mainframe_GlobalFunctionLib.pressKey("F12");
		}
	
}
