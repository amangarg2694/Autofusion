package com.atdd.demo.te.stepdefinitons;

import org.junit.Assert;

import com.atdd.te.screenHelpers.FunctionalLibrary;
import com.itextpdf.text.log.SysoCounter;
import com.optumrx.autofusion.core.te.util.Mainframe_GlobalFunctionLib;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Mic {
	@When("^I add a new Schedule \"([^\"]*)\",\"([^\"]*)\"$")
	public void i_add_a_new_Schedule(String sch1, String desc) throws Throwable {
		FunctionalLibrary.enterText(4, 5, sch1);
		FunctionalLibrary.pressKey("Enter");
		Thread.sleep(1000);
		if(!(FunctionalLibrary.getText(4, 5).trim().equals(FunctionalLibrary.getText(10, 5).trim()))){
			FunctionalLibrary.pressKey("F6");
            FunctionalLibrary.enterText(5, 15, sch1);
            FunctionalLibrary.enterText(5, 32, desc);
            FunctionalLibrary.pressKey("Enter");
		}
		}

	@When("^I add a new Schedules \"([^\"]*)\",\"([^\"]*)\"$")
	public void i_add_a_new_Schedules(String sch1, String desc) throws Throwable {
		FunctionalLibrary.enterText(4, 5, sch1);
		FunctionalLibrary.pressKey("Enter");
		Thread.sleep(1000);
		if(!(FunctionalLibrary.getText(4, 5).trim().equals(FunctionalLibrary.getText(9, 5).trim()))){
			FunctionalLibrary.pressKey("F6");
            FunctionalLibrary.enterText(13, 19, sch1);
            FunctionalLibrary.enterText(14, 19, desc);
            FunctionalLibrary.pressKey("Enter");
		}
		}
	
	@When("^I add a new Preferred Product Schedule MIC Claim Level Tier \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_add_a_new_Preferred_Product_Schedule_MIC_Claim_Level_Tier(String cms, String msc, String MICtier) throws Throwable {
		FunctionalLibrary.pressKey("F6");
		FunctionalLibrary.enterText(9, 12, cms);
		FunctionalLibrary.enterText(10, 12, msc);
		FunctionalLibrary.enterText(11, 12, MICtier);
		FunctionalLibrary.pressKey("Enter");
		
		
		
	}

	@Then("^I validate error message \"([^\"]*)\" when a new MIC tier is displayed$")
	public void i_validate_error_message_when_a_new_MIC_tier_is_displayed(String msg) throws Throwable {
		String errmsg=FunctionalLibrary.getText(24, 2).trim();
		FunctionalLibrary.validateText("24","002", msg);
		
	}
	@When("^I select edit option \"([^\"]*)\" on a schedule \"([^\"]*)\"$")
	public void i_select_edit_option_on_a_schedule(String opt, String sch1) throws Throwable {
		FunctionalLibrary.enterText(4, 5, sch1);
		FunctionalLibrary.pressKey("Enter");
		if((FunctionalLibrary.getText(4, 5).trim().equals(FunctionalLibrary.getText(10, 5).trim()))){
			FunctionalLibrary.enterText(10, 2, opt);
			FunctionalLibrary.pressKey("Enter");
			FunctionalLibrary.pressKey("F10");
			
		}
}
	@When("^I select option \"([^\"]*)\" on a \"([^\"]*)\" in Active MIC Medically Accepted ROA Sched Seq screen$")
	public void i_select_option_on_a_in_Active_MIC_Medically_Accepted_ROA_Sched_Seq_screen(String opt, String sch) throws Throwable {
	    FunctionalLibrary.enterText(4, 5, sch);
	    FunctionalLibrary.pressKey("Enter");
	    Thread.sleep(1000);
	    if(!(FunctionalLibrary.getText(24, 2).trim().equals("No data to display."))){
			FunctionalLibrary.pressKey("F6");
		FunctionalLibrary.enterText(7, 11, "10");
		FunctionalLibrary.enterText(8, 23, "CHAYA123");
		FunctionalLibrary.enterText(9, 23, "a");
		FunctionalLibrary.pressEnter();
		}
	    if(FunctionalLibrary.getText(9, 5).trim().equals(sch)){
	    	 FunctionalLibrary.enterText(9, 2, opt);
	    	 FunctionalLibrary.pressKey("Enter");
	   }
	    
	    
	}

	@When("^I select optionN \"([^\"]*)\" on existing sequence in Active Secondary ROAs in MIC Medically Accepted ROA Schd Seq screen$")
	public void i_select_optionN_on_existing_sequence_in_Active_Secondary_ROAs_in_MIC_Medically_Accepted_ROA_Schd_Seq_screen(String opt) throws Throwable {
	/*	if(!(FunctionalLibrary.getText(24, 2).trim().equals("No data to display."))){
			FunctionalLibrary.pressKey("F6");
		FunctionalLibrary.enterText(7, 11, "10");
		FunctionalLibrary.enterText(8, 23, "ABC");
		FunctionalLibrary.enterText(9, 23, "*");
		FunctionalLibrary.pressEnter();
		}*/
		
		FunctionalLibrary.enterText(13, 2, opt);
		 FunctionalLibrary.pressKey("Enter");
		
	   
	}

	@Then("^I validate error message \"([^\"]*)\" when a same Secondary ROA code is added$")
	public void i_validate_error_message_when_a_same_Secondary_ROA_code_is_added(String msg) throws Throwable {
		if(!(FunctionalLibrary.getText(24, 2).trim().equals("No data to display."))){
		FunctionalLibrary.pressKey("F6");
		FunctionalLibrary.enterText(10, 23, "ABC");
	    FunctionalLibrary.pressKey("Enter");
		}
		FunctionalLibrary.pressKey("F6");
		FunctionalLibrary.enterText(10, 23, "ABC");
	    FunctionalLibrary.pressKey("Enter");
		FunctionalLibrary.validateText("24","002", msg);
	    
	}
	
	@When("^I select option \"([^\"]*)\" on a \"([^\"]*)\" in Active Multi-Ingredient Compound Category ROA screen$")
	public void i_select_option_on_a_in_Active_Multi_Ingredient_Compound_Category_ROA_screen(String opt, String code) throws Throwable {
		FunctionalLibrary.enterText(4, 5, code);
		FunctionalLibrary.pressKey("Enter");
		 if(FunctionalLibrary.getText(9, 5).trim().equals(code)){
			 FunctionalLibrary.enterText(9, 2, opt);
			 FunctionalLibrary.pressKey("Enter");
		 
		 }
		
		
		
	   
	}

	@Then("^I validate error message \"([^\"]*)\" when already exisitng ROA code  is added$")
	public void i_validate_error_message_when_already_exisitng_ROA_code_is_added(String msg) throws Throwable {
		FunctionalLibrary.pressKey("F6");
		FunctionalLibrary.enterText(7, 21, "M4");
	    FunctionalLibrary.pressKey("Enter");
		FunctionalLibrary.validateText("24","002", msg);
	   
	}
	@When("^I validate edit option \"([^\"]*)\" for existing record$")
	public void i_validate_edit_option_for_existing_record(String opt) throws Throwable {
		String btier=FunctionalLibrary.getText(13, 23).trim();
		FunctionalLibrary.enterText(13, 2, opt);
		FunctionalLibrary.pressKey("Enter");
	 if(FunctionalLibrary.getText(1, 13).trim().equals("CHANGE")){
		 System.out.println("Editable");
		 FunctionalLibrary.enterText(11, 12, "11");
		 FunctionalLibrary.pressKey("Enter");
		
	 }
	 else{
		 Assert.fail();
	 }
	 
	 if(FunctionalLibrary.getText(13, 23).trim().equals("11")){
		 System.out.println("Succesfully edited");
	 }
	 else
	 {
		 Assert.fail();
	 }
		
		
	}

	@Then("^I validate delete option \"([^\"]*)\" for existing record$")
	public void i_validate_delete_option_for_existing_record(String opt) throws Throwable {
		FunctionalLibrary.enterText(13, 2, opt);
		FunctionalLibrary.pressKey("Enter");
		FunctionalLibrary.enterText(16, 64, "Y");
		//FunctionalLibrary.pressKey("Enter");
		FunctionalLibrary.validateText("24","002", "No data to display.");
		System.out.println("Successfully deleted");
		
		
	 
	}


@Then("^I validate the cursor position using Tab key$")
public void i_validate_the_cursor_position_using_Tab_key() throws Throwable {
	FunctionalLibrary.pressKey("Tab");
	FunctionalLibrary.pressKey("Tab");
	FunctionalLibrary.pressKey("Tab");
	FunctionalLibrary.pressKey("Tab");
    
}

@When("^I validate error message \"([^\"]*)\" when user attempts to add new RCCLT record with a CMS DCSC value  and MSC value$")
public void i_validate_error_message_when_user_attempts_to_add_new_RCCLT_record_with_a_CMS_DCSC_value_and_MSC_value(String msg) throws Throwable {
	FunctionalLibrary.pressKey("F6");
	FunctionalLibrary.enterText(9, 12, "C");
	FunctionalLibrary.enterText(10, 12, "N");
	FunctionalLibrary.enterText(11, 12, "4");
	FunctionalLibrary.pressKey("Enter");
	FunctionalLibrary.validateText("24","002",msg);
	
}

@When("^I validate that records with a partial match and exact match should be identified for Secondary ROA Code$")
public void i_validate_that_records_with_a_partial_match_and_exact_match_should_be_identified_for_Secondary_ROA_Code() throws Throwable {
	FunctionalLibrary.enterText(11, 5, "HLAK");
	FunctionalLibrary.pressKey("Enter");
	if (FunctionalLibrary.getText(17,5).trim().startsWith("HLAK") && FunctionalLibrary.getText(18,5).trim().startsWith("HLAK")){
		System.out.println("Partial match is done");
	}
	else
		Assert.fail();
	
	
}

@When("^I enter plan \"([^\"]*)\" in plan search field to enter into Plan Detail  Page screen$")
public void i_enter_plan_in_plan_search_field_to_enter_into_Plan_Detail_Page_screen(String plan) throws Throwable {
	FunctionalLibrary.enterText(4, 5, plan);
	FunctionalLibrary.pressKey("Enter");
	Thread.sleep(1000);
	FunctionalLibrary.enterText(11, 2, "5");
	FunctionalLibrary.pressKey("Enter");
	
}

@When("^I navigate to compounds using option \"([^\"]*)\" in Plan Options screen$")
public void i_navigate_to_compounds_using_option_in_Plan_Options_screen(String opt) throws Throwable {
	FunctionalLibrary.enterText(7, 21, opt);
	FunctionalLibrary.pressKey("Enter");
}

@When("^I select option \"([^\"]*)\" to navigate to Multiple Ingredient Compound detail screen$")
public void i_select_option_to_navigate_to_Multiple_Ingredient_Compound_detail_screen(String opt) throws Throwable {
	FunctionalLibrary.enterText(13, 12, opt);
	FunctionalLibrary.pressKey("Enter");
}

/*@Then("^I validate the help text for CMI Claim Product Status value ?B?field value$")
public void i_validate_the_help_text_for_CMI_Claim_Product_Status_value_B_field_value1() throws Throwable {
    Mainframe_GlobalFunctionLib.click(14,27);
    FunctionalLibrary.pressKey("F1");
    FunctionalLibrary.pressKey("PageDown");
    Thread.sleep(500);
    FunctionalLibrary.pressKey("PageDown");
    Thread.sleep(500);
    FunctionalLibrary.pressKey("PageDown");
    Thread.sleep(500);
   if( FunctionalLibrary.getText(5,19).trim().equals("B = Part B, else Option Level")){
	   if(FunctionalLibrary.getText(6,19).trim().equals("IF there is at least one ingredient that is a Part B")){
		   if(FunctionalLibrary.getText(7,19).trim().equals("ingredient (based on the Part B NDC/GPI List and CMI Part")){
			   if(FunctionalLibrary.getText(8,19).trim().equals("B Drug Status), then use Part B drug st atus as MIC claim")){
				   FunctionalLibrary.pressKey("PageDown");
				   if(FunctionalLibrary.getText(5,19).trim().equals("level drug status.  If there is no Part B ingredient, use")){
					   if(FunctionalLibrary.getText(6,19).trim().equals("the Option Level drug status.")){
						   
						   
					   }  
					   
				   }  
				   
			   }  
			   
		   }
	   }
   }
    
    
    
    
    
}*/

@Then("^I validate the help text for CMI Claim Product Status value B field value$")
public void i_validate_the_help_text_for_CMI_Claim_Product_Status_value_B_field_value() throws Throwable {
	 Mainframe_GlobalFunctionLib.click(14,27);
	 Thread.sleep(1000);
	    //FunctionalLibrary.pressKey("F1");
	    ContingentTherapy.kPress("F1");
	    	Thread.sleep(1000);
	    FunctionalLibrary.pressKey("PageDown");
	    Thread.sleep(500);
	    FunctionalLibrary.pressKey("PageDown");
	    Thread.sleep(500);
	    FunctionalLibrary.pressKey("PageDown");
	    Thread.sleep(500);
	   if( FunctionalLibrary.getText(5,19).trim().equals("B = Part B, else Option Level")){
		   if(FunctionalLibrary.getText(6,19).trim().equals("IF there is at least one ingredient that is a Part B")){
			   if(FunctionalLibrary.getText(7,19).trim().equals("ingredient (based on the Part B NDC/GPI List and CMI Part")){
				   if(FunctionalLibrary.getText(8,19).trim().equals("B Drug Status), then use Part B drug st atus as MIC claim")){
					   FunctionalLibrary.pressKey("PageDown");
					   if(FunctionalLibrary.getText(5,19).trim().equals("level drug status.  If there is no Part B ingredient, use")){
						   if(FunctionalLibrary.getText(6,19).trim().equals("the Option Level drug status.")){
							   
							   
						   }  
						   
					   }  
					   
				   }  
				   
			   }
		   }
	   }
	    
 
}


@When("^I enter Override plan \"([^\"]*)\" on \"([^\"]*)\"$")
public void i_enter_Override_plan_on(String plan, String screen) throws Throwable {
	FunctionalLibrary.enterText(20, 22, plan);
}

@When("^I submitt a compound claim withh \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
public void i_submitt_a_compound_claim_withh(String bin, String proc, String group, String pharmacyID, String rxNbr, String refill, String fillDate, String memberID, String productID, String dspQty, String ds, String psc, String cost, String comp) throws Throwable {
	try {
		FunctionalLibrary.navigateToRxClaimPlanAdministrator();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	FunctionalLibrary.navigateToScreen("3");
	FunctionalLibrary.navigateToScreen("2");
	FunctionalLibrary.navigateToScreen("1");
	
	if(!(ContingentTherapy.func_SearchAndSelectADataEditMode1("4,4" ,memberID ,"9,4" , memberID))){
		
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Thread.sleep(1000);
		FunctionalLibrary.enterText(11, 14,bin );
		FunctionalLibrary.enterText(11, 41,proc );
		FunctionalLibrary.enterText(11, 59,group );
		FunctionalLibrary.enterText(12, 14,pharmacyID );
		FunctionalLibrary.enterText(12, 41,FunctionalLibrary.func_GenerateDynamicRxNo() );
		FunctionalLibrary.enterText(12, 59,refill );
		FunctionalLibrary.enterText(14, 41,memberID );
		FunctionalLibrary.pressKey("Enter");
		Thread.sleep(1000);
		FunctionalLibrary.enterText(4, 65, fillDate+"    ");			
		FunctionalLibrary.enterText(11, 20,productID );
		FunctionalLibrary.enterText(12, 11,dspQty );
		FunctionalLibrary.enterText(12, 26,ds );
		FunctionalLibrary.enterText(14, 6,psc );
		FunctionalLibrary.enterText(14, 14,comp );
		FunctionalLibrary.enterText(10, 47,"         " );
		FunctionalLibrary.enterText(10, 47,cost );
		FunctionalLibrary.pressKey("Enter");
		
	}
	else{
		
	FunctionalLibrary.enterText(9, 2,"1" );
	FunctionalLibrary.pressKey("Enter");
	Thread.sleep(1000);
	Mainframe_GlobalFunctionLib.click(4, 29 );
		FunctionalLibrary.enterText(4, 29, pharmacyID);
		///Thread.sleep(3000);
		//FunctionalLibrary.enterText(4 , 65 ,"         ");
		FunctionalLibrary.enterText(4, 65, fillDate);
		FunctionalLibrary.enterText(5, 22, "1");
		FunctionalLibrary.enterText(5,29, FunctionalLibrary.func_GenerateDynamicRxNo());
		FunctionalLibrary.enterText(5, 47, refill);			
		//Mainframe_GlobalFunctionLib.click(7, 12 );
		FunctionalLibrary.enterText(7, 12, memberID);
		//Mainframe_GlobalFunctionLib.pressKey("F4");
		//FunctionalLibrary.enterText(3, 4, memberID);
		//Mainframe_GlobalFunctionLib.pressKey("Enter");         
		//FunctionalLibrary.enterText(8, 2,"1" );
		//Mainframe_GlobalFunctionLib.pressKey("Enter");
		FunctionalLibrary.enterText(11, 20,productID );
		FunctionalLibrary.enterText(12, 11,"           " );
		FunctionalLibrary.enterText(12, 11,dspQty );
		FunctionalLibrary.enterText(12, 26,"   " );
		FunctionalLibrary.enterText(12, 26,ds);
		FunctionalLibrary.enterText(14, 6,psc );
		FunctionalLibrary.enterText(10, 47,"         " );
		FunctionalLibrary.enterText(10, 47,cost );
		FunctionalLibrary.enterText(14, 14,comp );
		FunctionalLibrary.pressKey("Enter");
		//Mainframe_GlobalFunctionLib.pressKey("F6");
        
	}
	
		System.out.println("Claim is created");
	
		FunctionalLibrary.pressKey("F14");
		FunctionalLibrary.enterText(5, 23,"5" );
		FunctionalLibrary.pressKey("Enter");
		FunctionalLibrary.pressKey("F6");
		FunctionalLibrary.enterText(12, 20,"03" );
		Mainframe_GlobalFunctionLib.click(13, 20);
		FunctionalLibrary.pressKey("F4");
		Thread.sleep(1000);
		FunctionalLibrary.pressKey("F16");
		Thread.sleep(1000);
		FunctionalLibrary.enterText(4, 4, "00777310402");
		FunctionalLibrary.pressKey("Enter");
		FunctionalLibrary.enterText(9, 2, "1");
		FunctionalLibrary.pressKey("Enter");		
		FunctionalLibrary.enterText(15, 20,"10" );
		FunctionalLibrary.enterText(16, 20,"100" );
		FunctionalLibrary.enterText(18, 20,"01" );
		FunctionalLibrary.pressKey("Enter");
		
		FunctionalLibrary.pressKey("F6");
		FunctionalLibrary.enterText(12, 20,"03" );
		Mainframe_GlobalFunctionLib.click(13, 20);
		FunctionalLibrary.pressKey("F4");
		Thread.sleep(1000);
		FunctionalLibrary.pressKey("F16");
		Thread.sleep(1000);
		FunctionalLibrary.enterText(4, 4, "00591571501");
		FunctionalLibrary.pressKey("Enter");
		FunctionalLibrary.enterText(9, 2, "1");
		FunctionalLibrary.pressKey("Enter");		
		FunctionalLibrary.enterText(15, 20,"10" );
		FunctionalLibrary.enterText(16, 20,"100");
		FunctionalLibrary.enterText(18, 20,"01" );
		FunctionalLibrary.pressKey("Enter");
		FunctionalLibrary.pressKey("F12");
		FunctionalLibrary.pressKey("F12");
		
		
		FunctionalLibrary.submitClaim();
	
	
}

@When("^I validate the MIC claim process with drug status not overriden when Primary ROA is not found$")
public void i_validate_the_MIC_claim_process_with_drug_status_not_overriden_when_Primary_ROA_is_not_found() throws Throwable {
	FunctionalLibrary.pressKey("F7");
	Thread.sleep(500);
	FunctionalLibrary.pressKey("F7");
	FunctionalLibrary.enterText(4, 23,"8");
	FunctionalLibrary.pressKey("Enter");
    if(FunctionalLibrary.getText(7, 22).trim().equals("F")){
    	System.out.println("Valid drug status");
	}
    else
    	Assert.fail();
	}
	
@When("^I validate the MIC claim process with drug status overriden when Primary ROA is  found$")
public void i_validate_the_MIC_claim_process_with_drug_status_overriden_when_Primary_ROA_is_found() throws Throwable {
	FunctionalLibrary.pressKey("F7");
	Thread.sleep(500);
	FunctionalLibrary.pressKey("F7");
	FunctionalLibrary.enterText(4, 23,"8");
	FunctionalLibrary.pressKey("Enter");
    if(FunctionalLibrary.getText(7, 22).trim().equals("K")){
    	System.out.println("Valid drug status");
	}
    else
    	Assert.fail();
	}
}
	
	


