package com.atdd.demo.te.stepdefinitons;

import com.atdd.te.screenHelpers.FunctionalLibrary;
import com.optumrx.autofusion.core.te.util.Mainframe_GlobalFunctionLib;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class Supressflag {

	@When("^I select a pharamacy \"([^\"]*)\" to navigate to Pharmacy Detail Page screen using option \"([^\"]*)\"$")
	public void i_select_a_pharamacy_to_navigate_to_Pharmacy_Detail_Page_screen_using_option(String phy, String opt1) throws Throwable {
	   FunctionalLibrary.enterText(4, 5, phy);
	   FunctionalLibrary.pressKey("Enter");
	   if(FunctionalLibrary.getText(11,5).trim().equals(phy)){
		   FunctionalLibrary.enterText(11, 2, opt1);
		   FunctionalLibrary.pressKey("Enter");
	   }
	}

	@Then("^I validate the system standard help text to the Suppress Update flag  on the Pharmacy Detail screen$")
	public void i_validate_the_system_standard_help_text_to_the_Suppress_Update_flag_on_the_Pharmacy_Detail_screen() throws Throwable {
		Mainframe_GlobalFunctionLib.click(21, 73);
		Thread.sleep(1000);
		 ContingentTherapy.kPress("F1");	
		 Thread.sleep(1000);
		if(FunctionalLibrary.getText(14,41).trim().equals("Suppress Existence Sts")){
			System.out.println("F1  help text matched");
		}
		else{
			System.out.println("F1 help file did not  match");
			Assert.fail();
		}
			
			
	}
	@When("^I select a pharamacy \"([^\"]*)\" to navigate to Pharmacy Detail Page screen in \"([^\"]*)\" using option \"([^\"]*)\"$")
	public void i_select_a_pharamacy_to_navigate_to_Pharmacy_Detail_Page_screen_in_using_option(String phy, String arg2, String opt1) throws Throwable {
		
	//@When("^I select a pharamacy \"([^\"]*)\" to navigate to Pharmacy Detail Page screen in CCTC(\\d+) using option \"([^\"]*)\"$")
	//public void i_select_a_pharamacy_to_navigate_to_Pharmacy_Detail_Page_screen_in_CCTC_using_option(String phy, int arg2, String opt1) throws Throwable {
		   FunctionalLibrary.enterText(4, 5, phy);
		   FunctionalLibrary.pressKey("Enter");
		   if(FunctionalLibrary.getText(10,5).trim().equals(phy)){
			   FunctionalLibrary.enterText(10, 2, opt1);
			   FunctionalLibrary.pressKey("Enter");
	}
	}
	@Given("^I am on \"([^\"]*)\" using \"([^\"]*)\"$")
	public void i_am_on_using(String arg1, String option) throws Throwable {
		FunctionalLibrary.enterText(21,7 ,option );
		FunctionalLibrary.pressEnter();
	}
	
	@Then("^I go back to RxClaim PlanAdministrator Menu$")
	public void i_go_back_to_RxClaim_PlanAdministrator_Menu() throws Throwable {
		 FunctionalLibrary.pressKey("F12");
		 FunctionalLibrary.pressKey("F12");
		 FunctionalLibrary.pressKey("F3");
		 Thread.sleep(500);
		 FunctionalLibrary.pressKey("F3");
		 FunctionalLibrary.pressKey("F3");
		 FunctionalLibrary.enterText(21, 7, "CCT600");
		 FunctionalLibrary.pressEnter();
		 
	}
	@When("^I select a pharamacy \"([^\"]*)\" to navigate to Request Detail Pagescreen using option \"([^\"]*)\"$")
	public void i_select_a_pharamacy_to_navigate_to_Request_Detail_Pagescreen_using_option(String phy, String opt) throws Throwable {
	   FunctionalLibrary.enterText(4, 4, phy);
	   FunctionalLibrary.pressEnter();
	   if(FunctionalLibrary.getText(10,4).trim().equals(phy)){
		   FunctionalLibrary.enterText(10, 2, opt);
		   FunctionalLibrary.pressKey("Enter");
}
	   
	}

	@When("^I press \"([^\"]*)\" Key on pharmacy Id to navigate to Pharmacy Detail Page$")
	public void i_press_Key_on_pharmacy_Id_to_navigate_to_Pharmacy_Detail_Page(String key) throws Throwable {
		Mainframe_GlobalFunctionLib.click(16, 26);
		FunctionalLibrary.pressKey("F4");
		
		
	}

}
