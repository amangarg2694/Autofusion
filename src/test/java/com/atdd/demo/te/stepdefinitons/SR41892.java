package com.atdd.demo.te.stepdefinitons;

import com.optumrx.autofusion.core.te.util.Mainframe_GlobalFunctionLib;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SR41892 {
	@When("^I verify plan \"([^\"]*)\"$")
	public void i_verify_plan(String PlanCode) throws Throwable {
		Mainframe_GlobalFunctionLib.sendText(4, 5, PlanCode);
		Mainframe_GlobalFunctionLib.pressKey("enter");
	  String resultListPlan=Mainframe_GlobalFunctionLib.getText(11, 6);
	  if(resultListPlan.equals(PlanCode))
	  {
		  System.out.println("Expected Plan found in result List"+resultListPlan);
		  Mainframe_GlobalFunctionLib.sendText(11, 2, "2");
		  Mainframe_GlobalFunctionLib.pressKey("enter");
	  }
	  else
	  {
		  System.out.println("Expected Plan not found in result List"+resultListPlan);
		  System.exit(0);
	  }
	}
	
	@When("^I verify Compounds in Plan details page$")
	public void i_verify_Compounds_in_Plan_details_page() throws Throwable {
	   String actualFlagCompounds=Mainframe_GlobalFunctionLib.getText(14, 24);
	   System.out.println("Compounds Flag is: "+actualFlagCompounds);
	   if(actualFlagCompounds.equals("N"))
	   {
		   System.out.println("Compounds Flag is: "+actualFlagCompounds);
		   Mainframe_GlobalFunctionLib.sendText(14, 24, "Y");
		   System.out.println("Compounds Flag is update to: "+actualFlagCompounds);
	   }
	   else
	   {
		   System.out.println("Compounds Flag is: "+actualFlagCompounds);
	   }
	   Mainframe_GlobalFunctionLib.pressKey("enter");
	   Mainframe_GlobalFunctionLib.sendText(16, 64, "Y");
	}
	
	@When("^I select Multiple Ingredient Compound option in Compound Options$")
	public void i_select_Multiple_Ingredient_Compound_option_in_Compound_Options() throws Throwable {
		Mainframe_GlobalFunctionLib.sendText(7, 21, "9");
		Mainframe_GlobalFunctionLib.pressKey("enter");
		Mainframe_GlobalFunctionLib.sendText(13, 12, "2");
		Mainframe_GlobalFunctionLib.pressKey("enter");
	}
	
	public String NDC_MIC=null;
	@When("^I verify NDC list for MIC \"([^\"]*)\"$")
	public void i_verify_NDC_list_for_MIC(String NDC_MIC) throws Throwable {
		String actualNDC_MIC=Mainframe_GlobalFunctionLib.getText(20, 11);
		System.out.println("NDC List for MIC is: "+actualNDC_MIC);
		if(actualNDC_MIC.equals(NDC_MIC))
			{
				System.out.println("NDC List for MIC is as Expected: "+actualNDC_MIC);
				actualNDC_MIC=NDC_MIC;
			}
			else
			{
				System.out.println("NDC List for MIC is not as Expected: "+actualNDC_MIC);
				Mainframe_GlobalFunctionLib.sendText(20, 11,NDC_MIC);
				System.out.println("NDC List for MIC is UPDATED to as Expected: "+actualNDC_MIC);
			}
		}
		
	@When("^I verify Option Levels for Claim Product Status and Claim Multi-Source Code$")
	public void i_verify_Option_Levels_for_Claim_Product_Status_and_Claim_Multi_Source_Code() throws Throwable {
		//Claim Product Status
		String optionLevelClaimProductStatus=Mainframe_GlobalFunctionLib.getText(14, 44);
		System.out.println("Claim Product Status, Option Level is: "+optionLevelClaimProductStatus);
		if(optionLevelClaimProductStatus.equals("a"))
		{
			System.out.println("Claim Product Status, Option Level is as Expected: "+optionLevelClaimProductStatus);
		}
		else
		{
			System.out.println("Claim Product Status, Option Level is not as Expected: "+optionLevelClaimProductStatus);
			Mainframe_GlobalFunctionLib.sendText(14, 44,"a");
			System.out.println("Claim Product Status, Option Level is UPDATED to as Expected: "+optionLevelClaimProductStatus);
		}
		
		//Claim Multi-Source Code
				String optionLevelClaimMultiSource=Mainframe_GlobalFunctionLib.getText(15, 44);
				System.out.println("Claim Multi Source, Option Level is: "+optionLevelClaimMultiSource);
				if(optionLevelClaimMultiSource.equals("M"))
				{
					System.out.println("Claim Multi Source, Option Level is as Expected: "+optionLevelClaimMultiSource);
				}
				else
				{
					System.out.println("Claim Multi Source, Option Level is not as Expected: "+optionLevelClaimMultiSource);
					Mainframe_GlobalFunctionLib.sendText(15, 44,"M");
					System.out.println("Claim Multi Source, Option Level is UPDATED to Expected, it is: "+optionLevelClaimMultiSource);
				}
		}
	
	@When("^I verify Non Part D Covered \"([^\"]*)\"$")
	public void i_verify_Non_Part_D_Covered(String NonPartDCovered) throws Throwable {
	  String valueNonPartDCovered=Mainframe_GlobalFunctionLib.getText(10, 60);
	  System.out.println("The Value at Non PartD Covered is: "+valueNonPartDCovered);
	  if(valueNonPartDCovered.equals(NonPartDCovered))
	  {
		  System.out.println("The Value at Non PartD Covered is as expected: "+valueNonPartDCovered);
	  }
	  else
	  { 
		  System.out.println("The Value at Non PartD Covered is not as expected: "+valueNonPartDCovered);
		  Mainframe_GlobalFunctionLib.sendText(10, 60, NonPartDCovered);
		  System.out.println("The Value at Non PartD Covered is UPDATED to expected, it is: "+valueNonPartDCovered);
	  }
	}
	
	@Then("^I go back to  Plan Options Screen$")
	public void i_go_back_to_Plan_Options_Screen() throws Throwable {
	 Mainframe_GlobalFunctionLib.pressKey("F12");
	 Mainframe_GlobalFunctionLib.pressKey("F12");
	}
	
	@When("^I select Pricing Option in Plan Options screen$")
	public void i_select_Pricing_Option_in_Plan_Options_screen() throws Throwable {
	   Mainframe_GlobalFunctionLib.sendText(07, 21, "28");
	   Mainframe_GlobalFunctionLib.pressKey("enter");
	}
	
	@When("^I selct Pharmacy - Reimbursement option$")
	public void i_selct_Pharmacy_Reimbursement_option() throws Throwable {
		   Mainframe_GlobalFunctionLib.sendText(21, 12, "1");
		   Mainframe_GlobalFunctionLib.pressKey("enter");
	}
	
	public String PriceSchedule=null;
	@When("^I validate Plan Pharmacy Price Schedule \"([^\"]*)\"$")
	public void i_validate_Plan_Pharmacy_Price_Schedule(String PriceSchedule) throws Throwable {
	 String valuePriceSchedule=Mainframe_GlobalFunctionLib.getText(12, 27);
	 System.out.println("The Plan Pharmacy Price Schedule is: "+valuePriceSchedule);
	 if(valuePriceSchedule.equals(PriceSchedule))
	 {
		 System.out.println("The Plan Pharmacy Price Schedule is as expected: "+valuePriceSchedule);
	 }
	 else
	 {
		 System.out.println("The Plan Pharmacy Price Schedule is not as expected: "+valuePriceSchedule);
		 System.exit(0);
	 }
	 	
	}
	
}
