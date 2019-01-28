package com.atdd.demo.te.stepdefinitons;

import com.atdd.te.screenHelpers.FunctionalLibrary;
import com.optumrx.autofusion.core.te.util.Mainframe_GlobalFunctionLib;

import cucumber.api.java.en.When;

public class AddDignosisCode {
	@When("^I add Diagnosis code details with \"([^\"]*)\",\"([^\"]*)\"$")
	public void i_add_Diagnosis_code_details_with(String diagnosisCodeQual, String diagnosisCode) throws Throwable {
		Mainframe_GlobalFunctionLib.pressKey("F14");
		Mainframe_GlobalFunctionLib.sendText(5, 23,"2" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");		
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Mainframe_GlobalFunctionLib.sendText(14, 18,diagnosisCodeQual );
		//Mainframe_GlobalFunctionLib.sendText(15, 18,diagnosisCode );
		Mainframe_GlobalFunctionLib.click(15, 18);
		Mainframe_GlobalFunctionLib.pressKey("F4");
		Mainframe_GlobalFunctionLib.sendText(04, 14,diagnosisCode );		
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(9, 2,"1");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");

       }
	@When("^I submit a claim with NDC list \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_submit_a_claim_with_NDC_list(String bin, String proc, String group, String pharmacyID, String rxNbr, String refill, String fillDate, String memberID, String productID, String dspQty, String ds, String psc, String cost) throws Throwable {
		 FunctionalLibrary.CreateTransaction(bin, proc, group, pharmacyID, rxNbr, refill, fillDate, memberID, productID, dspQty, ds, psc, cost);
	}
}
