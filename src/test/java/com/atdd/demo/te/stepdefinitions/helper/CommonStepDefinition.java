package com.atdd.demo.te.stepdefinitions.helper;

import com.atdd.te.screenHelpers.CommonHelper;
import com.atdd.te.screenHelpers.FileValidation;
import com.atdd.te.screenHelpers.FunctionalLibrary;
import com.atdd.te.screenHelpers.PlanByPlanCode;
import com.atdd.te.screenHelpers.Pricing;
import com.cucumber.listener.Reporter;
//import com.hp.lft.sdk.Desktop;
//import com.hp.lft.sdk.java.Window;
//import com.hp.lft.sdk.java.WindowDescription;
import com.optumrx.autofusion.core.te.util.Mainframe_GlobalFunctionLib;
import com.optumrx.autofusion.core.te.util.Screenshot;
import com.optumrx.autofusion.core.util.ReadPropertyFile;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CommonStepDefinition extends CommonHelper{

	
	
	
	@When("^I enter \"([^\"]*)\" in field \"([^\"]*)\" on \"([^\"]*)\"$")
	public void i_enter_in_field_on(String fieldValue, String fieldName, String screenName) throws Throwable {
	    
		FunctionalLibrary.enterText( fieldValue,  fieldName,  screenName);
		
	}
	
	@Given("^I am on RxClaim PlanAdministrator Menu$")
	public void i_am_on_RxClaim_PlanAdministrator_Menu() throws Throwable {
		
	
		
		/*String text = FunctionalLibrary.getText(1, 13);
				
				while(!(text.equalsIgnoreCase("RxClaim Plan Administrator Menu"))){
					
					FunctionalLibrary.pressKey("F12");
					Thread.sleep(1000);
					text = FunctionalLibrary.getText(1, 13);
					
				}*/
		
		String text = Mainframe_GlobalFunctionLib.getText(1, 13);
		
		while(!(text.equalsIgnoreCase("RxClaim Plan Administrator Menu"))){
			
			Mainframe_GlobalFunctionLib.pressKey("F12");
			Thread.sleep(1000);
			text = Mainframe_GlobalFunctionLib.getText(1, 13);
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
		
		/*FunctionalLibrary.enterText(21,7 ,option );
		FunctionalLibrary.pressEnter();*/
		Mainframe_GlobalFunctionLib.sendText(21,7 ,option );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		
	}
	
	@When("^I want to press F(\\d+) key$")
	public void i_want_to_press_F_key(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
		FunctionalLibrary.pressKey("F4");
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
	
	@When("^I create Member with Override Plan \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_create_Member_with_Override_Plan(String carrierID, String accountID, String groupID, String memberID, String firstName, String lastName, String dob, String fromDate, String thruDate, String overridePlan) throws Throwable {		
		FunctionalLibrary.createMemberWithOverridePlan(carrierID, accountID, groupID, memberID, firstName, lastName, dob, fromDate, thruDate,overridePlan);
		
	}
	//Create randomly generated member Member with override plan
	@When("^I create new Member with Override Plan \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_create_new_Member_with_Override_Plan(String carrierID, String accountID, String groupID, String memberID, String firstName, String lastName, String dob, String fromDate, String thruDate, String overridePlan) throws Throwable {		
		FunctionalLibrary.PAMember1 = "AUT" + FunctionalLibrary.func_GenerateDynamicRxNo().substring(5, 12);
		FunctionalLibrary.createMemberWithOverridePlan(carrierID, accountID, groupID, memberID, firstName, lastName, dob, fromDate, thruDate,overridePlan);
		
	}
	
	@When("^I create Member with PA \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_create_Member_with_PA(String carrierID, String accountID, String groupID, String memberID, String firstName, String lastName, String dob, String fromDate, String thruDate) throws Throwable {
		FunctionalLibrary.CreateMemberPA(carrierID, accountID, groupID, memberID, firstName, lastName, dob, fromDate, thruDate);
	}
	
	@When("^I create PA Number \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_create_PA_Number(String number, String type, String otc, String ndcgpilist, String from, String thru, String agent, String reason, String ignoredrugstatus) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		FunctionalLibrary.func_SetPriorAuth(number,type,otc,ndcgpilist,from,thru,agent,reason,ignoredrugstatus);
	}
	
	@When("^I create PA Number \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_create_PA_Number(String number, String type, String msc, String otc, String ndcgpilist, String from, String thru, String agent, String reason, String ignoredrugstatus) throws Throwable {
		System.out.println("OTC"+otc);
		FunctionalLibrary.func_SetPriorAuth(number,type,msc,otc,ndcgpilist,from,thru,agent,reason,ignoredrugstatus);
		
	}
	
	@Then("^Validate PANumber \"([^\"]*)\" added$")
	public void validate_PANumber_added(String panumber) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		FunctionalLibrary.validateText("16" ,"5" , panumber );
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");
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
	
	@When("^I submit the claim with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_submit_the_claim_with(String bin, String proc, String group, String pharmacyID, String refill, String fillDate, String memberID, String productID, String dspQty, String ds, String psc, String cost, String due, String ucw, String fee) throws Throwable {
	   
			
			FunctionalLibrary.CreateTransaction(bin, proc, group, pharmacyID, "",refill, fillDate, memberID, productID, dspQty, ds, psc, cost);
			Mainframe_GlobalFunctionLib.sendText(9 , 33 ,"1");
			Mainframe_GlobalFunctionLib.sendText(11 , 47 ,"         ");
		 Mainframe_GlobalFunctionLib.sendText(19 , 47 ,"         ");
		 Mainframe_GlobalFunctionLib.sendText(20 , 47 ,"         ");
		 Mainframe_GlobalFunctionLib.sendText(11 , 47 ,fee);
		 Mainframe_GlobalFunctionLib.sendText(19 , 47 ,due);
		 Mainframe_GlobalFunctionLib.sendText(20 , 47 ,ucw);
		 FunctionalLibrary.submitClaim();
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
		String ExpectedClaimCount = Mainframe_GlobalFunctionLib.getText(6, 9).replaceAll(",", "");
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
	
	@When("^I submit PDE extract$")
	public void i_submit_PDE_extract() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
        Mainframe_GlobalFunctionLib.sendText(21, 7 ,"CCT700" );
        Mainframe_GlobalFunctionLib.pressKey("Enter");
        Mainframe_GlobalFunctionLib.sendText(21, 7 ,"2" );
        Mainframe_GlobalFunctionLib.pressKey("Enter");
        Mainframe_GlobalFunctionLib.sendText(21, 7 ,"20" );
        Mainframe_GlobalFunctionLib.pressKey("Enter");
        Mainframe_GlobalFunctionLib.sendText(21, 7 ,"3" );
        Mainframe_GlobalFunctionLib.pressKey("Enter");	
	}
	
	@Then("^Validate Screen Name is \"([^\"]*)\"$")
	public void validate_Screen_Name_is(String screenname) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		FunctionalLibrary.validateText("1" ,"2" , screenname );
	}
	
	//Part D Setup
	@When("^I create plan with member eligibility and pricing option \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_create_plan_with_member_eligibility_and_pricing_option(String plancode, String fromdate, String description, String thruDate, String pricechedule, String patientpayschedule) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		FunctionalLibrary.Createplanwithmembereligibilityandpricingoption(plancode, fromdate, description, thruDate, pricechedule, patientpayschedule);
	}
	
	@Then("^Validate Plan \"([^\"]*)\"$")
	public void validate_Plan(String plancode) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		FunctionalLibrary.validateText("3" ,"13" , plancode );
	}
	@When("^I add accumulators to plan \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_add_accumulators_to_plan(String TrOOPfromdate, String TrOOPthrudate, String accumulationlevel, String accumulationcode, String TrOOPschedule, String CMSlabelerlist) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    FunctionalLibrary.addAccumulators(TrOOPfromdate, TrOOPthrudate, accumulationlevel, accumulationcode, TrOOPschedule, CMSlabelerlist);
	}

	@When("^I Set Covered Plan Paid Amount in plan \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_Set_Covered_Plan_Paid_Amount_in_plan(String CPPFromDate, String CPPThruDate, String CPPAccumulationLevel, String CPPAccumulationCode, String CPPPatientPaySchedule, String CPPTrOOPSchedule, String Qualifier) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    FunctionalLibrary.SetCoveredPlanPaidAmount(CPPFromDate, CPPThruDate, CPPAccumulationLevel, CPPAccumulationCode, CPPPatientPaySchedule, CPPTrOOPSchedule, Qualifier);
	}

	@When("^I Set Patient Pay Schedule \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_Set_Patient_Pay_Schedule(String PPdetailschedule, String PPdetaildescription, String planusequalifier) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		FunctionalLibrary.SetPatientPaySchedule(PPdetailschedule, PPdetaildescription, planusequalifier);
	}

	@Then("^I Set HIC detials \"([^\"]*)\"$")
	public void i_Set_HIC_detials(String HIC) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 Mainframe_GlobalFunctionLib.sendText(17, 50 ,HIC);
	     Mainframe_GlobalFunctionLib.pressKey("Enter");
	}

	@Then("^I Set Set Supplemental ID by Type \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_Set_Set_Supplemental_ID_by_Type(String SupplementalIDFromDate, String SupplementalIDThruDate, String SupplementalIDType, String SupplementalID, String Text) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    FunctionalLibrary.SetSupplementalIDbyType(SupplementalIDFromDate, SupplementalIDThruDate, SupplementalIDType, SupplementalID, Text);
	}

	@Then("^I Set PBP \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_Set_PBP(String carrierID, String contract, String pbp, String benefityear, String medicaretype, String submitterid) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    FunctionalLibrary.SetPBP(carrierID, contract, pbp, benefityear, medicaretype, submitterid);
	}

	@Then("^I Set Medicare \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_Set_Medicare(String memberID, String PARTDfromdate, String PARTDthrudate, String contract, String pbp, String segment, String subsidylevel, String copaycategory, String PARTDeffectivedate, String enrollmentsource) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    FunctionalLibrary.func_SetMedicare(memberID, PARTDfromdate, PARTDthrudate, contract, pbp, segment, subsidylevel, copaycategory, PARTDeffectivedate, enrollmentsource);
	}

	@Then("^I Set PartD Master Profile Detail \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_Set_PartD_Master_Profile_Detail(String carrierID, String accountID, String groupID, String plancode, String fromdate, String masterprofilefromdate, String masterprofilethrudate, String drugcoveragestatusschedule, String contract, String pbp) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    FunctionalLibrary.func_SetPartDMasterProfileDetail(carrierID, accountID, groupID, plancode, fromdate, masterprofilefromdate, masterprofilethrudate, drugcoveragestatusschedule, contract, pbp);
	}
	
	@Then("^Validate PartD Master Profile created with details \"([^\"]*)\" ,\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void validate_PartD_Master_Profile_created_with_details(String carrierID, String accountID, String groupID, String plancode) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		FunctionalLibrary.validateText("9" ,"5" , carrierID);
		FunctionalLibrary.validateText("9" ,"16" , accountID);
		FunctionalLibrary.validateText("9" ,"33" , groupID);
		FunctionalLibrary.validateText("9" ,"50" , plancode);
	}
	@When("^I create plan with pricing \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_create_plan_with_pricing(String plancode, String fromdate, String description, String thruDate, String pricechedule, String patientpayschedule) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    FunctionalLibrary.Createplanwithpricing(plancode, fromdate, description, thruDate, pricechedule, patientpayschedule);
	}
	@Then("^Validate plan code \"([^\"]*)\"$")
	public void validate_plan_code(String plancode) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		FunctionalLibrary.validateText("3" ,"13" , plancode);
	}
	
	@When("^I Setup Plan with NDC List \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_Setup_Plan_with_NDC_List(String plancode, String ndclist, String ndcsq, String ndcfromdate, String ndcthrudate) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    FunctionalLibrary.PlanWithNDCList(plancode, ndclist, ndcsq, ndcfromdate, ndcthrudate);
	}

	@When("^I add Plan With NDC List \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void I_add_Plan_With_NDC_List(String ndclist, String ndcsq, String ndcfromdate, String ndcthrudate) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		FunctionalLibrary.CreatePlanWithNDCList(ndclist, ndcsq, ndcfromdate, ndcthrudate);
	}
	@Then("^Validate NDC List is \"([^\"]*)\"$")
	public void validate_NDC_List_is(String ndclist) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		FunctionalLibrary.validateText("11" ,"8" , ndclist);
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");
	}

	@When("^I Setup Plan with GPI List \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_Setup_Plan_with_GPI_List(String plancode, String gpilist, String gpisq, String gpifromdate, String gpithrudate) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		FunctionalLibrary.PlanWithGPIList(plancode, gpilist, gpisq, gpifromdate, gpithrudate);
	}

	@Then("^Validate GPI List is \"([^\"]*)\"$")
	public void validate_GPI_List_is(String gpilist) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		FunctionalLibrary.validateText("11" ,"8" , gpilist);
	}

	@When("^I create plan with Accumulators with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_create_plan_with_Accumulators_with(String planCode, String fromDate, String desc, String thruDate, String priceSchedule, String patientPaySchedule, String deductibleAccumLevel, String deductibleSchedule, String oopMaxAccumLevel, String oopMaxDeductibleSchedule, String benefitMaxAccumLevel, String benefitMaxDeductibleSchedule) throws Throwable {
		FunctionalLibrary.Createplanwithmembereligibilityandpricingoption(planCode, fromDate, desc, thruDate, priceSchedule, patientPaySchedule);
	    PlanByPlanCode.func_SetPlanAccumulatorDetails(planCode, fromDate, thruDate, deductibleAccumLevel, deductibleSchedule, oopMaxAccumLevel, oopMaxDeductibleSchedule, benefitMaxAccumLevel, benefitMaxDeductibleSchedule);
	
	}
	
	@Then("^Validate Accumulators are set to Y$")
	public void validate_Accumulators_are_set_to_Y() throws Throwable {
		FunctionalLibrary.validateText("9" ,"28" , "Y");
		FunctionalLibrary.validateText("10" ,"28" , "Y");
		FunctionalLibrary.validateText("11" ,"28" , "Y");
	}
	
	@When("^I create DUR Table with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_create_DUR_Table_with(String durTable, String durTableDesc, String durStatus, String DURPPSRequired, String durServiceOverideTable,String durServiceType, String medGPIList, String exclPatResCodeList, String medLookBackPeriod, String perFillDS, String perFillResp,String perfillMsgCode, String dglDiagList, String exclDiagCode, String exclGPIList, String exclTaxonomyList, String taxonomyMedLimit, String durPharmacyResponse, String medTaxonomyList, String percentageTherapeutic, String medLimit, String durServiceResponse, String messageCode, String prescriberThreshold, String pharmacyThreshold, String serviceQualifier, String serviceNewMember, String serviceIR) throws Throwable {
		 PlanByPlanCode.createORUpdateMEDLIMITDURTable(durTable, durTableDesc, durStatus, DURPPSRequired, durServiceOverideTable,durServiceType, medGPIList, exclPatResCodeList, medLookBackPeriod, perFillDS,perFillResp, perfillMsgCode, dglDiagList, exclDiagCode, exclGPIList, exclTaxonomyList, taxonomyMedLimit, durPharmacyResponse, medTaxonomyList, percentageTherapeutic, medLimit, durServiceResponse, messageCode, prescriberThreshold, pharmacyThreshold, serviceQualifier, serviceNewMember, serviceIR);
	}
	
	@Then("^Validate DUR Table \"([^\"]*)\" created$")
	public void validate_DUR_Table_created(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}
	
	@When("^I create Plan with Compound Option \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_create_Plan_with_Compound_Option(String planCode, String fromDate, String planDesc, String thruDate, String priceSchedule, String patientpayschedule) throws Throwable {
	    PlanByPlanCode.func_CreatePlanWithCompoundOption(planCode, fromDate, planDesc, thruDate, priceSchedule, patientpayschedule);
	    
	}

	@Then("^Validate Plan is set with Compound Option$")
	public void validate_Plan_is_set_with_Compound_Option() throws Throwable {
		FunctionalLibrary.validateText("14" ,"24" , "Y");
	}
	
	@When("^I set NDC List in Plan \"([^\"]*)\"$")
	public void i_set_NDC_List_in_Plan(String planCode) throws Throwable {
		PlanByPlanCode.func_SetNDCList(planCode);
	}


	@Then("^Validate NDC List is set to Y$")
	public void validate_NDC_List_is_set_to_Y() throws Throwable {
		FunctionalLibrary.validateText("15" ,"24" , "Y"); 
		FunctionalLibrary.validateText("6" ,"51" , "Y"); 
	}
	
	@When("^I set GPI List in Plan \"([^\"]*)\"$")
	public void i_set_GPI_List_in_Plan(String planCode) throws Throwable {
		PlanByPlanCode.func_SetGPIList(planCode);
	}
	
	@When("^I setup Drug Cost Comparison Schedule with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_setup_Drug_Cost_Comparison_Schedule_with(String ccSchedule, String desc, String sequence, String source, String code, String ratePercent) throws Throwable {
	    Pricing.func_CreateOrMaintainDrugCostComparisonSchedule(ccSchedule, desc, sequence, source, code, ratePercent);
	}

	@When("^I setup Drug Cost Schedule with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_setup_Drug_Cost_Schedule_with(String costSchedule, String scheduleDesc, String costScheduleSequence, String schedulePSC, String comparisonSchedule, String comparisonType) throws Throwable {
	    Pricing.func_CreateOrMaintainDrugCostSchedule(costSchedule, scheduleDesc, costScheduleSequence, schedulePSC, comparisonSchedule, comparisonType);
	}
	
	@When("^I setup Patient Pay Schedule with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_setup_Patient_Pay_Schedule_with(String patientPaySchedule, String ppScheduleDesc, String patientPaySeq, String ppTableSchedule) throws Throwable {
	    Pricing.func_CreateOrMaintainPatientPaySchedule(patientPaySchedule, ppScheduleDesc, patientPaySeq, ppTableSchedule);
	}

	@When("^I setup Patient Pay Table with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_setup_Patient_Pay_Table_with(String patientPayTable, String patientPayTableDesc, String negativeDue, String ppCC, String brandAmount, String brandCalcBasis, String genericAmount, String genericCalcBasis) throws Throwable {
	    Pricing.func_CreateOrMaintainPatientPayTable(patientPayTable, patientPayTableDesc, negativeDue, ppCC, brandAmount, brandCalcBasis, genericAmount, genericCalcBasis);
	}
	
	@When("^I setup Price Schedule with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_setup_Price_Schedule_with(String priceSchedule, String psDescription, String psSequence, String psCriteriaTable) throws Throwable {
	    Pricing.func_CreateOrMaintainPriceSchedule(priceSchedule, psDescription, psSequence, psCriteriaTable);
	}

	@When("^I setup Price Table with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_setup_Price_Table_with(String priceTable, String priceTableDesc, String ptFrom, String ptThru, String dcSchedule, String ptFee, String ptTax, String priceCC, String calcCode) throws Throwable {
	    Pricing.func_CreateOrMaintainPriceTable(priceTable, priceTableDesc, ptFrom, ptThru, dcSchedule, ptFee, ptTax, priceCC, calcCode);
	}

	@When("^I submit a SQLQuery and FTP the file \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_submit_a_SQLQuery_and_FTP_the_file(String filename, String libraryname, String FTPCmd) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    FunctionalLibrary.submitsqlquerywithftp(filename,libraryname,FTPCmd);
	}
	
	@When("^I submit job CMD  for Expected File$")
	public void i_submit_job_CMD_for_Expected_File() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("^Validate Acutal CHF file \"([^\"]*)\" with the expected file \"([^\"]*)\"$")
	public void validate_Acutal_CHF_file_with_the_expected_file(String actualFile, String expectedFile) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    FileValidation.compareFile(actualFile, expectedFile);
	}
	
	 @Then("^I capture a screenshot$")
	    public void i_capture_a_screenshot() throws Throwable {
	    	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	    	System.out.println("Screen shot captured.");
	    }

		@Then("^Validate \"([^\"]*)\" in field \"([^\"]*)\" is displayed on \"([^\"]*)\"$")
		public void validate_in_field_is_displayed_on(String fieldValue, String fieldName, String screenName) throws Throwable {
			String[] coordinates = ReadPropertyFile.getProperty(screenName , fieldName);
			FunctionalLibrary.validateText(coordinates[0] ,coordinates[1] , fieldValue);
		}
		
		@When("^I click in field \"([^\"]*)\" on \"([^\"]*)\"$")
		public void i_click_in_field_on(String fieldName, String screenName) throws Throwable {
			String[] coordinates = ReadPropertyFile.getProperty(screenName , fieldName);
			int coordinate0 = Integer.valueOf(coordinates[0]);
			int coordinate1 = Integer.valueOf(coordinates[1]);
			Mainframe_GlobalFunctionLib.click(coordinate0 ,coordinate1);
			
		}
    
		@When("^Update Plan Drug Status and Turnoff GPI Options \"([^\"]*)\"$")
		public void update_Plan_Drug_Status_and_Turnoff_GPI_Options(String plancode) throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			FunctionalLibrary.func_updateDrugStatusGPIOptions(plancode);
		}

		@Given("^Update Plan Drug Status and Turnon GPI Options \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
		public void update_Plan_Drug_Status_and_Turnon_GPI_Options(String plancode, String checknegformchangeonproduct,String qualquantity, String minquantity, String maxquantity, String qualdailydose, String mindailydose, String maxdailydose, String ptdquantitytype, String ptdquantitydays, String ptdquantitymax, String ptddayssupplytype, String ptddaysssupplymin, String ptddaysssupplymax, String ptd4thqtrdstype, String ptd4thqtrdsdays, String ptd4thqtrdsmax, String qtydscomp, String negativeformularyfhange, String minmaxquantity, String minmaxdailydose, String quantitydaysupplyptd) throws Throwable {
			FunctionalLibrary.func_updateDrugStatusGPIOptionswithTBMedicareDetail(plancode, checknegformchangeonproduct, qualquantity, minquantity, maxquantity, qualdailydose, mindailydose, maxdailydose, ptdquantitytype, ptdquantitydays, ptdquantitymax, ptddayssupplytype, ptddaysssupplymin, ptddaysssupplymax, ptd4thqtrdstype, ptd4thqtrdsdays, ptd4thqtrdsmax, qtydscomp, negativeformularyfhange, minmaxquantity, minmaxdailydose, quantitydaysupplyptd);
		}

		@Then("^Validate PA Number and TB fields \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
		public void validate_PA_Number_and_TB_fields(String panumber, String tboverride, String tbpriordrugsts, String tbrejectreason1, String tbrejectreason2, String tbrejectreason3, String tbplanedit, String tbpassprequalifcheck) throws Throwable {
			FunctionalLibrary.func_Validate_PAnumberandTBfields(panumber, tboverride, tbpriordrugsts, tbrejectreason1, tbrejectreason2, tbrejectreason3, tbplanedit, tbpassprequalifcheck);
		}	
		
		@When("^Update Member PA Override and GPI Details \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
		public void update_Member_PA_Override_and_GPI_Details(String paoverridetb, String qualquantity, String minquantity, String maxquantity, String qualdailydose, String mindailydose, String maxdailydose, String ptdquantitytype, String ptdquantitydays, String ptdquantitymax, String ptddayssupplytype, String ptddaysssupplymin, String ptddaysssupplymax, String ptd4thqtrdstype, String ptd4thqtrdsdays, String ptd4thqtrdsmax, String qtydscomp) throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			FunctionalLibrary.func_UpdateMemberPAOverrideGPIDetails(paoverridetb, qualquantity, minquantity, maxquantity, qualdailydose, mindailydose, maxdailydose, ptdquantitytype, ptdquantitydays, ptdquantitymax, ptddayssupplytype, ptddaysssupplymin, ptddaysssupplymax, ptd4thqtrdstype, ptd4thqtrdsdays, ptd4thqtrdsmax, qtydscomp);
		}
		
		@When("^I attach DUR Table to the Plan \"([^\"]*)\",\"([^\"]*)\"$")
		public void i_attach_DUR_Table_to_the_Plan(String planCode, String durTable) throws Throwable {
		    PlanByPlanCode.openThePlanInEditMode(planCode);
		    FunctionalLibrary.enterText(19, 17, "        ");
			FunctionalLibrary.enterText(19, 17, durTable);
			FunctionalLibrary.pressEnter();
			FunctionalLibrary.enterText(16, 64, "Y");
		}
		

		@When("^Update Member PA Override and NDC Details \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
		public void update_Member_PA_Override_and_NDC_Details(String paoverridetb, String qualquantity, String minquantity, String maxquantity, String qualdailydose, String mindailydose, String maxdailydose, String ptdquantitytype, String ptdquantitydays, String ptdquantitymax, String ptddayssupplytype, String ptddaysssupplymin, String ptddaysssupplymax, String ptd4thqtrdstype, String ptd4thqtrdsdays, String ptd4thqtrdsmax, String qtydscomp) throws Throwable {
			FunctionalLibrary.func_UpdateMemberPAOverrideNDCDetails(paoverridetb, qualquantity, minquantity, maxquantity, qualdailydose, mindailydose, maxdailydose, ptdquantitytype, ptdquantitydays, ptdquantitymax, ptddayssupplytype, ptddaysssupplymin, ptddaysssupplymax, ptd4thqtrdstype, ptd4thqtrdsdays, ptd4thqtrdsmax, qtydscomp);
		}
		
		@When("^Update Plan Drug Status and Turnoff NDC Options \"([^\"]*)\"$")
		public void update_Plan_Drug_Status_and_Turnoff_NDC_Options(String plancode) throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			FunctionalLibrary.func_updateDrugStatusNDCOptions(plancode);
		}
		
		@Given("^Update Plan Drug Status and Turnon NDC Options \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
		public void update_Plan_Drug_Status_and_Turnon_NDC_Options(String plancode, String checknegformchangeonproduct,String productid, String qualquantity, String minquantity, String maxquantity, String qualdailydose, String mindailydose, String maxdailydose, String ptdquantitytype, String ptdquantitydays, String ptdquantitymax, String ptddayssupplytype, String ptddaysssupplymin, String ptddaysssupplymax, String ptd4thqtrdstype, String ptd4thqtrdsdays, String ptd4thqtrdsmax, String qtydscomp, String negativeformularyfhange, String minmaxquantity, String minmaxdailydose, String quantitydaysupplyptd) throws Throwable {
			//FunctionalLibrary.func_updateDrugStatusGPIOptionswithTBMedicareDetail(plancode, checknegformchangeonproduct, qualquantity, minquantity, maxquantity, qualdailydose, mindailydose, maxdailydose, ptdquantitytype, ptdquantitydays, ptdquantitymax, ptddayssupplytype, ptddaysssupplymin, ptddaysssupplymax, ptd4thqtrdstype, ptd4thqtrdsdays, ptd4thqtrdsmax, qtydscomp, negativeformularyfhange, minmaxquantity, minmaxdailydose, quantitydaysupplyptd);
			FunctionalLibrary.func_updateDrugStatusNDCOptionswithTBMedicareDetail(plancode, checknegformchangeonproduct, productid, qualquantity, minquantity, maxquantity, qualdailydose, mindailydose, maxdailydose, ptdquantitytype, ptdquantitydays, ptdquantitymax, ptddayssupplytype, ptddaysssupplymin, ptddaysssupplymax, ptd4thqtrdstype, ptd4thqtrdsdays, ptd4thqtrdsmax, qtydscomp, negativeformularyfhange, minmaxquantity, minmaxdailydose, quantitydaysupplyptd);
		}

		@Then("^Validate Claim Reject Code \"([^\"]*)\"$")
		public void validate_Claim_Reject_Code(String rejectcode) throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			FunctionalLibrary.validateText("21" ,"12" , rejectcode );
		
		}
		@Then("^Verify if Subrogation applies for Manual Claims with Payee Override with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
		public void verify_if_Subrogation_applies_for_Manual_Claims_with_Payee_Override_with(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6) throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
		   // throw new PendingException();
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			FunctionalLibrary.validateText("21" ,"10", "Testing");
			
		}
		
		@When("^I submit the claim with prescriber id \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
		public void i_submit_the_claim_with_prescriber_id(String bin, String proc, String group, String pharmacyID, String refill, String fillDate, String memberID, String productID, String prescriberQual , String prescriberID,String dspQty, String ds, String psc, String cost, String due, String ucw, String fee) throws Throwable {
			   FunctionalLibrary.CreateTransaction(bin, proc, group, pharmacyID, memberID,refill, fillDate, memberID, productID, dspQty, ds, psc, cost);
			Mainframe_GlobalFunctionLib.sendText(9 , 33 ,"1");
			if(fee.length()!=0){
			Mainframe_GlobalFunctionLib.sendText(11 , 47 ,"         ");
			Mainframe_GlobalFunctionLib.sendText(11 , 47 ,fee);
			}
			if(due.length()!=0){
				Mainframe_GlobalFunctionLib.sendText(19 , 47 ,"         ");			
				Mainframe_GlobalFunctionLib.sendText(19 , 47 ,due);
			}
			if(ucw.length()!=0){
			 Mainframe_GlobalFunctionLib.sendText(20 , 47 ,"         ");		 
			 Mainframe_GlobalFunctionLib.sendText(20 , 47 ,ucw);
			}
			Mainframe_GlobalFunctionLib.sendText(19 , 19 ,"  ");
			Mainframe_GlobalFunctionLib.sendText(19 , 19 ,prescriberQual);
			Mainframe_GlobalFunctionLib.sendText(19 , 26 ,"               ");
			Mainframe_GlobalFunctionLib.sendText(19 , 26 ,prescriberID);
			FunctionalLibrary.submitClaim();
		}
	
}
