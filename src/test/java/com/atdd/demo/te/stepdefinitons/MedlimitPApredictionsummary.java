package com.atdd.demo.te.stepdefinitons;

import org.testng.Assert;

import com.atdd.te.screenHelpers.FunctionalLibrary;
import com.itextpdf.text.log.SysoLogger;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MedlimitPApredictionsummary {
	
	@Then("^I enter option \"([^\"]*)\" in DUR/PPS Information screen$")
	public void i_enter_option_in_DUR_PPS_Information_screen(String arg1) throws Throwable {
		FunctionalLibrary.enterText(14, 2, arg1);
		FunctionalLibrary.pressEnter();
	}

	@Then("^I validate the Medlimit PA Prediction Summary screen$")
	public void i_validate_the_Medlimit_PA_Prediction_Summary_screen() throws Throwable {
	 FunctionalLibrary.pressEnter();
	}
	
	
	@Then("^Validate Member \"([^\"]*)\" added$")
	public void validate_Member_added(String memberID) throws Throwable {
		FunctionalLibrary.validateText("10" ,"4" , memberID );
	}
	
	@When("^I submit a claim for medlimit with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_submit_a_claim_for_medlimit_with(String bin, String proc, String group, String pharmacyID, String rxNbr, String refill, String fillDate, String memberID, String productID, String dspQty, String ds, String psc, String cost,String qual,String presid) throws Throwable {
		 ContingentTherapy.CreateTransaction1(bin, proc, group, pharmacyID, rxNbr, refill, fillDate, memberID, productID, dspQty, ds, psc, cost);
		    FunctionalLibrary.enterText(19, 19, qual);
		    FunctionalLibrary.enterText(19, 26, presid);
		 FunctionalLibrary.submitClaim();
	}

	@Then("^I validate \"([^\"]*)\"  for the claim \"([^\"]*)\" in Claim MEDLIMIT Detail Screen$")
	public void i_validate_for_the_claim_in_Claim_MEDLIMIT_Detail_Screen(String PA, String RxClaimno) throws Throwable {
	 
		FunctionalLibrary.enterText(4, 4, "               ");
		FunctionalLibrary.enterText(4, 4, RxClaimno);
		FunctionalLibrary.pressEnter();
		if(FunctionalLibrary.getText(10, 4).trim().equals(RxClaimno)){
			FunctionalLibrary.enterText(10, 2, "5");
			FunctionalLibrary.pressEnter();
			FunctionalLibrary.pressKey("F17");
			FunctionalLibrary.enterText(14, 2,"5");
			FunctionalLibrary.pressEnter();
			FunctionalLibrary.pressKey("F8");
			String res=FunctionalLibrary.getText(23,2).substring(10, 26);
			if(res.equals(PA)){
				System.out.println("PA Prediction key is present");
			}
			else
				Assert.fail();
		}
		
		}
	
	@Then("^I validate the screen name is \"([^\"]*)\"$")
	public void i_validate_the_screen_name_is(String Screen) throws Throwable {
	   
		FunctionalLibrary.validateText("2", "26",Screen);
	}

	
	@Then("^I validate the fields \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" in MEDLIMIT PA Prediction Summary Screen$")
	public void i_validate_the_fields_in_MEDLIMIT_PA_Prediction_Summary_Screen(String Qty, String DS, String Prescriber) throws Throwable {
	   FunctionalLibrary.validateText("9", "40", Qty);
	   FunctionalLibrary.validateText("9", "45", DS);
	   FunctionalLibrary.validateText("9", "48", Prescriber);
	}

}
