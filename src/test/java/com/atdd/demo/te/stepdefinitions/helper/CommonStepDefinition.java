package com.atdd.demo.te.stepdefinitions.helper;

import com.atdd.te.screenHelpers.CommonHelper;
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

public class CommonStepDefinition extends CommonHelper{

	
	
	
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
	
	@When("^I create Member with PA \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_create_Member_with_PA(String carrierID, String accountID, String groupID, String memberID, String firstName, String lastName, String dob, String fromDate, String thruDate) throws Throwable {
		FunctionalLibrary.CreateMemberPA(carrierID, accountID, groupID, memberID, firstName, lastName, dob, fromDate, thruDate);
	}
	
	@When("^I create PA Number \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_create_PA_Number(String number, String type, String ndcgpilist, String from, String thru, String agent, String reason, String ignoredrugstatus) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		FunctionalLibrary.func_SetPriorAuth(number,type,ndcgpilist,from,thru,agent,reason,ignoredrugstatus);
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

	@Then("^I Set PBP \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_Set_PBP(String carrierID, String contract, String pbp, String benefityear, String medicaretype) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    FunctionalLibrary.SetPBP(carrierID, contract, pbp, benefityear, medicaretype);
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
	
	@When("^I submit a SQLQuery and FTP the file \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_submit_a_SQLQuery_and_FTP_the_file(String filename, String libraryname, String FTPCmd) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    FunctionalLibrary.submitsqlquerywithftp(filename,libraryname,FTPCmd);
	}
	
	@When("^I submit job CMD  for Expected File$")
	public void i_submit_job_CMD_for_Expected_File() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}


}
