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
	
}
