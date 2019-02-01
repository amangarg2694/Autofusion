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
	
	@When("^I add diagnosis code for auto generated member \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_add_diagnosis_code_for_auto_generated_member(String diagnosisCodeQual,String typeCode , String diagnosisCode,String fromDate, String thruDate) throws Throwable {
	    	String memberID = FunctionalLibrary.PAMember1;
		if(FunctionalLibrary.getText(1, 2).equalsIgnoreCase("RCMBR009"))
				{
				}
				else {
		FunctionalLibrary.navigateToRxClaimPlanAdministrator();
		Mainframe_GlobalFunctionLib.sendText(21, 7 ,"1" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(21, 7 ,"2" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		FunctionalLibrary.func_SearchAndSelectADataEditMode("4,4" ,memberID ,"10,4" , memberID);
				}
		Mainframe_GlobalFunctionLib.pressKey("F8");
		Mainframe_GlobalFunctionLib.sendText(4, 20,"10" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(4, 20,"7" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Mainframe_GlobalFunctionLib.sendText(10, 18,diagnosisCodeQual );
		Mainframe_GlobalFunctionLib.sendText(11, 18,typeCode );
		Mainframe_GlobalFunctionLib.click(12, 18);
		Mainframe_GlobalFunctionLib.pressKey("F4");
		Mainframe_GlobalFunctionLib.sendText(04, 14,diagnosisCode );		
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(9, 2,"1");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(14, 18,fromDate );
		Mainframe_GlobalFunctionLib.sendText(14, 42,thruDate );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");

       }
}
