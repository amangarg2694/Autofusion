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
		/*System.out.println("Screename:" + screenName);
	    System.out.println("Fieldname:" + fieldName);
		String[] coordinates = ReadPropertyFile.getProperty(screenName , fieldName);
		Thread.sleep(100);
		System.out.println("row: "+ coordinates[0] + "col: " +coordinates[1] + " value: " +fieldValue);
		Mainframe_GlobalFunctionLib.sendText(coordinates[0] ,coordinates[1] , fieldValue);
		*/
		
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
	
	@Then("^I copy a Member with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_copy_a_Member_with(String memberID, String carrierID, String accountID, String groupID, String FromDate, String ThruDate) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		FunctionalLibrary.CopyMember(memberID, carrierID, accountID, groupID, FromDate, ThruDate);                     
		
}
	
	@When("^I submit a claim with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_submit_a_claim_with(String bin, String proc, String group, String pharmacyID, String rxNbr, String refill, String fillDate, String memberID, String productID, String dspQty, String ds, String psc, String cost) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    FunctionalLibrary.CreateTransaction(bin, proc, group, pharmacyID, rxNbr, refill, fillDate, memberID, productID, dspQty, ds, psc, cost);
	    FunctionalLibrary.submitClaim();
	}
	
	
	
	@Then("^Validate \"([^\"]*)\" message should displayed on \"([^\"]*)\"$")
	public void validate_message_should_displayed_on(String text, String screenName) throws Throwable {
		String[] coordinates = ReadPropertyFile.getProperty(screenName , "MessageTextArea");
		FunctionalLibrary.validateText(coordinates[0] ,coordinates[1] , text);
		//Mainframe_GlobalFunctionLib.validateText(24 , 2, "Member Added.");
		
	}
			
	@Then("^Validate \"([^\"]*)\" should displayed on \"([^\"]*)\"$")
	public void validate_should_displayed_on(String Sts, String screenName) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String[] coordinates = ReadPropertyFile.getProperty(screenName , "Sts");
		FunctionalLibrary.validateText(coordinates[0] ,coordinates[1] , Sts);
		//Mainframe_GlobalFunctionLib.validateText(24 , 2, "Member Added.");
		//String Csts=FunctionalLibrary.getText(21, 6);
		//System.out.println(Csts);
	    
	}
	
	@When("^I edit a member with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_edit_a_member_with(String memberID, String FromDate, String ThruDate) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		FunctionalLibrary.editMember(memberID, FromDate, ThruDate);
		
	}
	
	@Then("^Verify \"([^\"]*)\" message should displayed on \"([^\"]*)\"$")
	public void verify_message_should_displayed_on(String Record, String screenname) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String[] coordinates = ReadPropertyFile.getProperty(screenname , "Record");
		FunctionalLibrary.validateText(coordinates[0] ,coordinates[1] , Record);
	}
	
	@Then("^Verify \"([^\"]*)\" field data on \"([^\"]*)\"$")
	public void verify_field_data_on(String Address2, String screenname) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String[] coordinates = ReadPropertyFile.getProperty(screenname , "Address2");
		FunctionalLibrary.validateText(coordinates[0] ,coordinates[1] , Address2);
	}
	
	
	@Then("^validate user navigated to Main menu$")
	public void validate_user_navigated_to_Main_menu() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		FunctionalLibrary.navigateToMainMenu();
	    
	}
	@When("^I create plan with member eligibility and pricing option \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_create_plan_with_member_eligibility_and_pricing_option(String plancode, String fromdate, String description, String thruDate, String pricechedule, String patientpayschedule) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		FunctionalLibrary.Createplanwithmembereligibilityandpricingoption(plancode, fromdate, description, thruDate, pricechedule, patientpayschedule);
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
	@When("^I create Member with PA \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_create_Member_with_PA(String carrierID, String accountID, String groupID, String memberID, String firstName, String lastName, String dob, String fromDate, String thruDate) throws Throwable {
		FunctionalLibrary.CreateMemberPA(carrierID, accountID, groupID, memberID, firstName, lastName, dob, fromDate, thruDate);
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
	/*@Then("^I Set PBP \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_Set_PBP(String carrierID, String contract, String pbp, String benefityear, String medicaretype) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    FunctionalLibrary.SetPBP(carrierID, contract, pbp, benefityear, medicaretype);
	}*/
	@Given("^I Set PBP \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_Set_PBP(String carrierID, String contract, String pbp, String benefityear, String medicaretype, String SubmitterID) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		FunctionalLibrary.SetPBP(carrierID, contract, pbp, benefityear, medicaretype,SubmitterID);
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
	

@Then("^Validate Member \"([^\"]*)\" added$")
	public void validate_Member_added(String memberID) throws Throwable {
		FunctionalLibrary.validateText("6" ,"10" , memberID );
	}	
}
