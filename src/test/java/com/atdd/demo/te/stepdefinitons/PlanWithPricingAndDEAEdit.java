package com.atdd.demo.te.stepdefinitons;

import com.atdd.te.screenHelpers.FunctionalLibrary;
import com.optumrx.autofusion.core.te.util.Mainframe_GlobalFunctionLib;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

public class PlanWithPricingAndDEAEdit {
	
	
	@When("^I create a new plan \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void add_new_plan(String plancode,String fromdate, String description) throws Throwable{
		Mainframe_GlobalFunctionLib.sendText(21, 7, "4");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(21, 7, "1");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Mainframe_GlobalFunctionLib.sendText(13, 19, plancode);
		Mainframe_GlobalFunctionLib.sendText(14, 19, fromdate);
		Mainframe_GlobalFunctionLib.sendText(15, 19, description);
		Mainframe_GlobalFunctionLib.pressKey("Enter");	
	}
	
	
	@When("^Verify that Plan is updated with Pharmacy Price schedule \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void verify_plan_is_updated_with_Pricing_schedule(String PlanCode,String fromdate,String patientpaytable,String thrudate,String pharmacytable) throws Throwable {
	
	Mainframe_GlobalFunctionLib.sendText(21, 7, "4");
	Mainframe_GlobalFunctionLib.pressKey("Enter");
	Mainframe_GlobalFunctionLib.sendText(21, 7, "1");
	Mainframe_GlobalFunctionLib.pressKey("Enter");
	Mainframe_GlobalFunctionLib.pressKey("F6");
	Mainframe_GlobalFunctionLib.sendText(4, 5, PlanCode);
	Mainframe_GlobalFunctionLib.pressKey("Enter");
	Mainframe_GlobalFunctionLib.sendText(11, 3, "2");
	Mainframe_GlobalFunctionLib.pressKey("Enter");
	Mainframe_GlobalFunctionLib.sendText(16, 64, "Y");
	Mainframe_GlobalFunctionLib.sendText(13, 77, "Y");
	Mainframe_GlobalFunctionLib.pressKey("Enter");
	Mainframe_GlobalFunctionLib.sendText(16, 64, "Y");
	Mainframe_GlobalFunctionLib.pressKey("F7");
	Mainframe_GlobalFunctionLib.sendText(07, 21, "28");
	Mainframe_GlobalFunctionLib.pressKey("Enter");
	Mainframe_GlobalFunctionLib.sendText(21, 12, "1");
	Mainframe_GlobalFunctionLib.pressKey("Enter");
	Mainframe_GlobalFunctionLib.pressKey("F6");
	Mainframe_GlobalFunctionLib.sendText(8, 12, fromdate);
	Mainframe_GlobalFunctionLib.sendText(8, 36, thrudate);
	Mainframe_GlobalFunctionLib.sendText(10, 26, pharmacytable);
	Mainframe_GlobalFunctionLib.pressKey("Enter");
	Mainframe_GlobalFunctionLib.pressKey("F12");
	Mainframe_GlobalFunctionLib.sendText(21, 12, "3");
	Mainframe_GlobalFunctionLib.pressKey("Enter");
	Mainframe_GlobalFunctionLib.pressKey("F6");
    Mainframe_GlobalFunctionLib.sendText(9, 2, fromdate);
	Mainframe_GlobalFunctionLib.sendText(9, 12, thrudate);
	Mainframe_GlobalFunctionLib.sendText(9, 22, patientpaytable);
	Mainframe_GlobalFunctionLib.pressKey("Enter");
	Mainframe_GlobalFunctionLib.sendText(16, 64, "Y");
	Mainframe_GlobalFunctionLib.pressKey("F3");
	Mainframe_GlobalFunctionLib.pressKey("F12");
	Mainframe_GlobalFunctionLib.pressKey("F12");

	}

	@And("^Verify that Plan is added with Pharmacy Price schedule \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void verify_plan_is_added_with_Pricing_schedule(String plancode,String fromdate,String patientpaytable,String thrudate,String pharmacytable) throws Throwable {
	
	Mainframe_GlobalFunctionLib.sendText(21, 7, "4");
	Mainframe_GlobalFunctionLib.pressKey("Enter");
	Mainframe_GlobalFunctionLib.sendText(21, 7, "1");
	Mainframe_GlobalFunctionLib.pressKey("Enter");
	Mainframe_GlobalFunctionLib.pressKey("F6");
	Mainframe_GlobalFunctionLib.sendText(4, 5, plancode);
	Mainframe_GlobalFunctionLib.pressKey("Enter");
	Mainframe_GlobalFunctionLib.sendText(11, 3, "2");
	Mainframe_GlobalFunctionLib.pressKey("Enter");
	Mainframe_GlobalFunctionLib.sendText(16, 64, "Y");
	Mainframe_GlobalFunctionLib.sendText(13, 77, "Y");
	Mainframe_GlobalFunctionLib.pressKey("Enter");
	Mainframe_GlobalFunctionLib.sendText(16, 64, "Y");
	Mainframe_GlobalFunctionLib.pressKey("F7");
	Mainframe_GlobalFunctionLib.sendText(07, 21, "28");
	Mainframe_GlobalFunctionLib.pressKey("Enter");
	Mainframe_GlobalFunctionLib.sendText(21, 12, "1");
	Mainframe_GlobalFunctionLib.pressKey("Enter");
	Mainframe_GlobalFunctionLib.pressKey("F6");
	Mainframe_GlobalFunctionLib.sendText(8, 12, fromdate);
	Mainframe_GlobalFunctionLib.sendText(8, 36, thrudate);
	Mainframe_GlobalFunctionLib.sendText(10, 26, pharmacytable);
	Mainframe_GlobalFunctionLib.pressKey("Enter");
	Mainframe_GlobalFunctionLib.pressKey("F12");
	Mainframe_GlobalFunctionLib.sendText(21, 12, "3");
	Mainframe_GlobalFunctionLib.pressKey("Enter");
	Mainframe_GlobalFunctionLib.pressKey("F6");
    Mainframe_GlobalFunctionLib.sendText(9, 2, fromdate);
	Mainframe_GlobalFunctionLib.sendText(9, 12, thrudate);
	Mainframe_GlobalFunctionLib.sendText(9, 22, patientpaytable);
	Mainframe_GlobalFunctionLib.pressKey("Enter");
	Mainframe_GlobalFunctionLib.sendText(16, 64, "Y");
	Mainframe_GlobalFunctionLib.pressKey("F3");
	Mainframe_GlobalFunctionLib.pressKey("F12");
	Mainframe_GlobalFunctionLib.pressKey("F12");

	}

	@When("^Verify that Plan is updated with DEA class PlanEdit \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void verify_that_Plan_is_updated_with_DEA_class_PlanEdit(String plancode,String code,String fromdate,String thrudate,String flag,String drugstatus,String Rxfilldays,String pbedit, String pbnetwork,String pbstatus,String refill) throws Throwable {
    
    	Mainframe_GlobalFunctionLib.sendText(21, 7, "4");
    	Mainframe_GlobalFunctionLib.pressKey("Enter");
    	Mainframe_GlobalFunctionLib.sendText(21, 7, "1");
    	Mainframe_GlobalFunctionLib.pressKey("Enter");
    	Mainframe_GlobalFunctionLib.sendText(4, 5, plancode);
    	Mainframe_GlobalFunctionLib.pressKey("Enter");
    	Mainframe_GlobalFunctionLib.sendText(11, 3, "2");
    	Mainframe_GlobalFunctionLib.pressKey("Enter");
    	Mainframe_GlobalFunctionLib.sendText(8, 51, "Y");
    	Mainframe_GlobalFunctionLib.pressKey("Enter");
    	Mainframe_GlobalFunctionLib.sendText(16, 64, "Y");
    	Mainframe_GlobalFunctionLib.pressKey("F7");
    	Mainframe_GlobalFunctionLib.sendText(7, 21, "13");
    	Mainframe_GlobalFunctionLib.pressKey("Enter");
    	Mainframe_GlobalFunctionLib.pressKey("F6");
    	Mainframe_GlobalFunctionLib.sendText(8, 14, code);
    	Mainframe_GlobalFunctionLib.sendText(14, 14, fromdate);
    	Mainframe_GlobalFunctionLib.sendText(16, 14, thrudate);
    	Mainframe_GlobalFunctionLib.pressKey("Enter");
    	Mainframe_GlobalFunctionLib.sendText(9, 15, flag);
    	Mainframe_GlobalFunctionLib.sendText(10, 15, drugstatus);
    	Mainframe_GlobalFunctionLib.sendText(14, 56, Rxfilldays);
    	Mainframe_GlobalFunctionLib.sendText(18, 28, pbedit);
    	Mainframe_GlobalFunctionLib.sendText(20, 28, pbnetwork);
    	Mainframe_GlobalFunctionLib.sendText(20, 68, pbstatus);
      	Mainframe_GlobalFunctionLib.pressKey("PageDown");
    	Mainframe_GlobalFunctionLib.sendText(8, 14, refill);
      	Mainframe_GlobalFunctionLib.pressKey("Enter");
    	
    }
    
    @When("^I submit the claim with writtendate \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_submit_the_claim_with(String bin, String proc, String group, String pharmacyID, String refill,
			String fillDate, String memberID, String productID, String dspQty, String ds, String psc, String cost,
			 String fee,String wrtndate,String prescriber,String pbQual,String Rxnbr) throws Throwable {

		FunctionalLibrary.CreateTransaction(bin, proc, group, pharmacyID, "", refill, fillDate, memberID, productID,
				dspQty, ds, psc, cost);
		Mainframe_GlobalFunctionLib.sendText(11, 47, "         ");
		Mainframe_GlobalFunctionLib.sendText(11, 47, fee);
		Mainframe_GlobalFunctionLib.sendText(5, 29, Rxnbr);
		Mainframe_GlobalFunctionLib.sendText(13, 10, wrtndate);
		Mainframe_GlobalFunctionLib.sendText(19, 19, pbQual);
		Mainframe_GlobalFunctionLib.sendText(19, 26, prescriber);
		FunctionalLibrary.submitClaim();
	}
    
 
    }