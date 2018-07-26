package com.atdd.demo.te.stepdefinitions.helper;

import com.atdd.te.screenHelpers.FunctionalLibrary;
//import com.hp.lft.sdk.Desktop;
//import com.hp.lft.sdk.java.Window;
//import com.hp.lft.sdk.java.WindowDescription;
import com.optumrx.autofusion.core.te.util.Mainframe_GlobalFunctionLib;
import com.optumrx.autofusion.core.util.ReadPropertyFile;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CommonStepDefinition {

	
	
	
	@When("^I enter \"([^\"]*)\" in field \"([^\"]*)\" on \"([^\"]*)\"$")
	public void i_enter_in_field_on(String fieldValue, String fieldName, String screenName) throws Throwable {
	    
		FunctionalLibrary.enterText( fieldValue,  fieldName,  screenName);
		
	}
	
	@Given("^I am on RxClaim PlanAdministrator Menu$")
	public void i_am_on_RxClaim_PlanAdministrator_Menu() throws Throwable {
		String text = FunctionalLibrary.getText(1, 13);
				
				while(!(text.equalsIgnoreCase("RxClaim Plan Administrator Menu"))){
					
					FunctionalLibrary.pressKey("F12");
					text = FunctionalLibrary.getText(1, 13);
					
				}
	}	
	
	@When("^I press \"([^\"]*)\" Key$")
	public void i_press_Key(String arg1) throws Throwable {
		//Mainframe_GlobalFunctionLib.Transmit();
		FunctionalLibrary.pressKey(arg1);
		Thread.sleep(1000);
	}
	

	@When("^I select Option \"([^\"]*)\" to navigate to \"([^\"]*)\"$")
	public void i_select_Option_to_navigate_to(String option, String screen) throws Throwable {
		FunctionalLibrary.enterText(21,7 ,option );
		FunctionalLibrary.pressEnter();
	}
	
	@Given("^I open RxClaim Application in \"([^\"]*)\"$")
	public void i_open_RxClaim_Application_in(String env) throws Throwable {
		Mainframe_GlobalFunctionLib.launchTE(env);
	}
	
	
	@When("^I create CAG with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_create_CAG_with(String carrierID,String carrierName,String processor,String mailingAdd,String city,String state,String zip,String contractFromDt,String contractThruDt,String contractEnt,String businessType,String accountID,String accountName,String groupID,String groupName,String groupFromDt,String groupThruDt,String planCode) throws Throwable {
	    
		FunctionalLibrary.createCAG( carrierID, carrierName, processor, mailingAdd, city, state, zip, contractFromDt, contractThruDt, contractEnt, businessType, accountID, accountName, groupID, groupName, groupFromDt, groupThruDt, planCode);
	}
	
	@When("^I create Carrier with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_create_Carrier_with(String carrierID, String carrierName, String processor, String mailingAdd, String city, String state, String zip, String contractFromDt, String contractThruDt, String contractEnt, String businessType) throws Throwable {		 
		FunctionalLibrary.addCarrier( carrierID, carrierName, processor, mailingAdd, city, state, zip, contractFromDt, contractThruDt, contractEnt, businessType);
	
	}
	
	@When("^I create Account with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_create_Account_with(String carrierID, String accountID, String accountName) throws Throwable {
		FunctionalLibrary.addAccount(carrierID,accountID,accountName );		
	}

	@When("^I create Group with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_create_Group_with(String carrierID, String accountID, String groupID, String groupName, String fromDate, String thruDate, String planCode) throws Throwable {
		System.out.println("test 456");
		FunctionalLibrary.addGroup(carrierID,accountID,groupID,groupName,fromDate,thruDate,planCode );		
	}
	
	@When("^I create Member with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_create_Member_with(String carrierID, String accountID, String groupID, String memberID, String firstName, String lastName, String dob, String fromDate, String thruDate) throws Throwable {
		FunctionalLibrary.CreateMember(carrierID, accountID, groupID, memberID, firstName, lastName, dob, fromDate, thruDate);
	}
	
	@When("^I submit a claim with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_submit_a_claim_with(String bin, String proc, String group, String pharmacyID, String rxNbr, String refill, String fillDate, String memberID, String productID, String dspQty, String ds, String psc, String cost) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    FunctionalLibrary.CreateTransaction(bin, proc, group, pharmacyID, rxNbr, refill, fillDate, memberID, productID, dspQty, ds, psc, cost);
	    FunctionalLibrary.submitClaim();
	}
	
	@When("^I submit a claim with Retail MO Pharmacy \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_submit_a_claim_with_Retail_MO_Pharmacy(String bin, String proc, String group, String pharmacyID, String rxNbr, String refill, String fillDate, String memberID, String productID, String dspQty, String ds, String psc, String cost, String prequal, String preid, String ucw) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		 FunctionalLibrary.CreateTransactionRetailMOPharmacy(bin, proc, group, pharmacyID, rxNbr, refill, fillDate, memberID, productID, dspQty, ds, psc, cost, prequal, preid, ucw);
		 FunctionalLibrary.submitClaimF18();
		}
	
	@When("^I submit a Reversal claim with Retail MO Pharmacy \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_submit_a_Reversal_claim_with_Retail_MO_Pharmacy(String bin, String proc, String group, String pharmacyID, String rxNbr, String refill, String fillDate, String memberID, String productID, String dspQty, String ds, String psc, String cost, String prequal, String preid, String ucw) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		 FunctionalLibrary.CreateTransactionRetailMOPharmacy(bin, proc, group, pharmacyID, rxNbr, refill, fillDate, memberID, productID, dspQty, ds, psc, cost, prequal, preid, ucw);
		 FunctionalLibrary.submitClaimF18();   
		 FunctionalLibrary.submitReversalClaim();
		    
		}
	
	@When("^I Setup a Plan with Refill Limits \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_Setup_a_Plan_with_Refill_Limits(String plancode, String maxrefill, String period, String effectivedate) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    FunctionalLibrary.SetupPlanEdit15(plancode, maxrefill, period, effectivedate);
	}
	
	@When("^I Setup a Plan with Prior Auth NDC \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_Setup_a_Plan_with_Prior_Auth_NDC(String plancode, String ndclist, String ndcfromdate, String ndcstatus) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    FunctionalLibrary.SetupPlanEdit10(plancode, ndclist, ndcfromdate, ndcstatus);
	}
	@When("^I submit a claim with new fill date \"([^\"]*)\"$")
	public void i_submit_a_claim_with_new_fill_date(String FillDate2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.sendText(4 , 65 ,"          ");
		Mainframe_GlobalFunctionLib.sendText(4, 65, FillDate2);
		FunctionalLibrary.submitClaimF18WithoutRxOrigin();
	}
	
	@When("^I submit a claim with different fill date \"([^\"]*)\"$")
	public void i_submit_a_claim_with_different_fill_date(String FillDate3) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.sendText(4 , 65 ,"          ");
		Mainframe_GlobalFunctionLib.sendText(4, 65, FillDate3);
		FunctionalLibrary.submitClaimF18WithoutRxOrigin();
	}
	
	@When("^I submit a compound claim with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_submit_a_compound_claim_with(String bin, String proc, String group, String pharmacyID, String rxNbr, String refill, String fillDate, String memberID, String productId, String dspQty, String ds, String psc, String cost, String prequal, String preid, String ucw, String compQualId, String compProductId, String compQuantity, String compCost, String compBasisOfCost) throws Throwable {
		FunctionalLibrary.createCompoundClaim(bin, proc, group, pharmacyID, rxNbr, refill, fillDate, memberID, productId, dspQty, ds, psc, cost, prequal, preid, ucw, compQualId, compProductId, compQuantity, compCost, compBasisOfCost);
		 FunctionalLibrary.submitClaimF18();
	}
	
	
	@When("^I submit a Multi Ingredient compound claim with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_submit_a_Multi_Ingredient_compound_claim_with(String bin, String proc, String group, String pharmacyID, String rxNbr, String refill, String fillDate, String memberID, String productId, String dspQty, String ds, String psc, String cost, String prequal, String preid, String ucw, String compQualId_1, String compProductId_1, String compQuantity_1, String compCost_1, String compBasisOfCost_1 ,String compQualId_2, String compProductId_2, String compQuantity_2, String compCost_2, String compBasisOfCost_2) throws Throwable {
		FunctionalLibrary.compoundClaimWithMultiIngredient(bin, proc, group, pharmacyID, rxNbr, refill, fillDate, memberID, productId, dspQty, ds, psc, cost, prequal, preid, ucw, compQualId_1, compProductId_1, compQuantity_1, compCost_1, compBasisOfCost_1 ,compQualId_2, compProductId_2, compQuantity_2, compCost_2, compBasisOfCost_2);
		 FunctionalLibrary.submitClaimF18();
	}
	
	@Then("^Validate Claim Reject Code is \"([^\"]*)\"$")
	public void validate_Claim_Reject_Code_is(String claimRejCode) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		FunctionalLibrary.validateText("21" ,"12" , claimRejCode );
		
	}

	@Then("^Validate Claim Message is \"([^\"]*)\"$")
	public void validate_Claim_Message_is(String claimMessage) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		FunctionalLibrary.validateText("22" ,"6" , claimMessage );
		
	}
	
	@Then("^Validate \"([^\"]*)\" message should displayed on \"([^\"]*)\"$")
	public void validate_message_should_displayed_on(String text, String screenName) throws Throwable {
		String[] coordinates = ReadPropertyFile.getProperty(screenName , "MessageTextArea");
		FunctionalLibrary.validateText(coordinates[0] ,coordinates[1] , text);
//		Mainframe_GlobalFunctionLib.validateText(24 , 2, "Member Added.");
		
	}
	
}
