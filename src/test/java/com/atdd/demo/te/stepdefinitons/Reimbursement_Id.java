package com.atdd.demo.te.stepdefinitons;

import org.testng.Assert;

import com.atdd.te.screenHelpers.CommonHelper;
import com.atdd.te.screenHelpers.FunctionalLibrary;
import com.cucumber.listener.Reporter;
import com.optumrx.autofusion.core.te.util.Mainframe_GlobalFunctionLib;
import com.optumrx.autofusion.core.te.util.Screenshot;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Reimbursement_Id extends CommonHelper {
	public static String rxclaimno,networkid;
	public static void CreateTransaction2(String bin, String proc, String group, String pharmacyID, String rxNbr, String refill, String fillDate, String memberID, String productId, String dspQty, String ds, String psc, String cost,String rxorg) throws Throwable
	{	
		try {
			FunctionalLibrary.navigateToRxClaimPlanAdministrator();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		try{
		Mainframe_GlobalFunctionLib.sendText(21, 7 ,"3" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(21, 7 ,"2" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(21, 7 ,"1" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		
		if(!(FunctionalLibrary.func_SearchAndSelectADataEditMode("4,4" ,memberID ,"9,4" , memberID))){
			
			Mainframe_GlobalFunctionLib.pressKey("F6");
			Mainframe_GlobalFunctionLib.sendText(11, 14,bin );
			Mainframe_GlobalFunctionLib.sendText(11, 41,proc );
			Mainframe_GlobalFunctionLib.sendText(11, 59,group );
			Mainframe_GlobalFunctionLib.sendText(12, 14,pharmacyID );
			Mainframe_GlobalFunctionLib.sendText(12, 41,rxNbr );
			Mainframe_GlobalFunctionLib.sendText(12, 59,refill );
			Mainframe_GlobalFunctionLib.sendText(14, 41,memberID );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			//Mainframe_GlobalFunctionLib.click(7, 12 );
			//Mainframe_GlobalFunctionLib.pressKey("F4");
			//Thread.sleep(1000);
			//Mainframe_GlobalFunctionLib.sendText(3, 4, memberID);
			//Mainframe_GlobalFunctionLib.pressKey("Enter");
			//Mainframe_GlobalFunctionLib.sendText(8, 2,"1" );
			//Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(4 , 65 ,"          ");
			Mainframe_GlobalFunctionLib.sendText(4, 65, fillDate);			
			Mainframe_GlobalFunctionLib.sendText(11, 20,productId );
			Mainframe_GlobalFunctionLib.sendText(12, 11,dspQty );
			Mainframe_GlobalFunctionLib.sendText(12, 26,ds );
			Mainframe_GlobalFunctionLib.sendText(14, 6,psc );
			Mainframe_GlobalFunctionLib.sendText(10, 47,"         " );
			Mainframe_GlobalFunctionLib.sendText(10, 47,cost );
			Mainframe_GlobalFunctionLib.pressKey("Pagedown");
			Mainframe_GlobalFunctionLib.sendText(4, 55, rxorg);
			
		}
		else{
			
		Mainframe_GlobalFunctionLib.sendText(9, 2,"1" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Thread.sleep(1000);
		Mainframe_GlobalFunctionLib.click(4, 29 );
			Mainframe_GlobalFunctionLib.sendText(4, 29, pharmacyID);
			///Thread.sleep(3000);
			Mainframe_GlobalFunctionLib.sendText(4 , 65 ,"          ");
			Mainframe_GlobalFunctionLib.sendText(4, 65, fillDate);
			Mainframe_GlobalFunctionLib.sendText(5,29, rxNbr);
			Mainframe_GlobalFunctionLib.sendText(5, 47, refill);			
			//Mainframe_GlobalFunctionLib.click(7, 12 );
			Mainframe_GlobalFunctionLib.sendText(7, 12, memberID);
			//Mainframe_GlobalFunctionLib.pressKey("F4");
			//Mainframe_GlobalFunctionLib.sendText(3, 4, memberID);
			//Mainframe_GlobalFunctionLib.pressKey("Enter");         
			//Mainframe_GlobalFunctionLib.sendText(8, 2,"1" );
			//Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(11, 20,productId );
			Mainframe_GlobalFunctionLib.sendText(12, 11,"           " );
			Mainframe_GlobalFunctionLib.sendText(12, 11,dspQty );
			Mainframe_GlobalFunctionLib.sendText(12, 26,"   " );
			Mainframe_GlobalFunctionLib.sendText(12, 26,ds);
			Mainframe_GlobalFunctionLib.sendText(14, 6,psc );
			Mainframe_GlobalFunctionLib.sendText(10, 47,"         " );
			Mainframe_GlobalFunctionLib.sendText(10, 47,cost );
			//Mainframe_GlobalFunctionLib.pressKey("F6");
			Mainframe_GlobalFunctionLib.pressKey("Pagedown");
			Mainframe_GlobalFunctionLib.sendText(4, 55, rxorg);
            
		}
		
			System.out.println("Claim is created");
			
			if(ScreenshotOption.equalsIgnoreCase("Always")){
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				}
				}catch(Exception e)
				{	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
					Assert.fail("An error has occured while creating the caim transaction.Screenshot is captured");
					
				}
		
		
		
	}

	@When("^I navigate to the plan \"([^\"]*)\" to copy to new plan \"([^\"]*)\"$")
	public void i_navigate_to_the_plan_to_copy_to_new_plan(String arg1, String arg2) throws Throwable {
		 FunctionalLibrary.enterText(4, 5, arg1);
		  FunctionalLibrary.pressEnter();
		  FunctionalLibrary.enterText(11, 2, "3");
		  FunctionalLibrary.pressEnter();
		  FunctionalLibrary.enterText(11, 25, arg2);
		  FunctionalLibrary.enterText(12, 25, "010101");
		  FunctionalLibrary.enterText(13, 25, "Test");
		  FunctionalLibrary.enterText(14, 25, "A");
		  FunctionalLibrary.pressEnter();
	}

	@When("^I select \"([^\"]*)\" option in \"([^\"]*)\"$")
	public void i_select_option_in(String arg1, String plan2) throws Throwable {
	   FunctionalLibrary.enterText(9, 24, "Y");
		//FunctionalLibrary.enterText(9, 24, "N");
	    FunctionalLibrary.pressEnter();
	    FunctionalLibrary.enterText(16, 64, "Y");
	    
	    
	}
	
	
	//@When("^I submit a claim with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" with F(\\d+) option$")
	@When("^I submit a claim with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" with F(\\d+) option$")
	public void i_submit_a_claim_with_with_F_option(String bin, String proc, String group, String pharmacyID, String rxNbr, String refill, String fillDate, String memberID, String productID, String dspQty, String ds, String psc, String cost,String rxorg, int arg1) throws Throwable {
		Reimbursement_Id.CreateTransaction2(bin, proc, group, pharmacyID, rxNbr, refill, fillDate, memberID, productID, dspQty, ds, psc, cost,rxorg);
		
		try{
			Mainframe_GlobalFunctionLib.pressKey("PageUp");
			Mainframe_GlobalFunctionLib.pressKey("F18");
			Thread.sleep(2000);
			
			if(ScreenshotOption.equalsIgnoreCase("Always")){
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				}
				}catch(Exception e)
				{	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				
					Assert.fail("The Claim is not submitted successfully.Screenshot is captured");
					
				}
		
	}
	
	@When("^I get the network id value from the claim$")
	public void i_get_the_network_id_value_from_the_claim() throws Throwable {
	rxclaimno=FunctionalLibrary.getText(20, 12).trim();
	FunctionalLibrary.pressKey("F7");
	FunctionalLibrary.pressKey("F7");
	FunctionalLibrary.enterText(4, 23, "8");
	FunctionalLibrary.pressEnter();
	networkid=FunctionalLibrary.getText(11, 13).trim();
	}
	
	@When("^I enter override plan on MemberdetailScreen$")
	public void i_enter_override_plan_on_MemberdetailScreen() throws Throwable {
		Mainframe_GlobalFunctionLib.click(20, 22);
	   FunctionalLibrary.pressKey("F4");
	   FunctionalLibrary.enterText(4, 5, "41876_P3");
	   FunctionalLibrary.pressEnter();
	   FunctionalLibrary.enterText(10, 2, "1");
	   FunctionalLibrary.pressEnter();
	   
	}

@When("^I search  for pharmacy \"([^\"]*)\" for the claim and check for reimbursement id$")
public void i_search_for_pharmacy_for_the_claim_and_check_for_reimbursement_id(String arg1) throws Throwable {
    FunctionalLibrary.enterText(4, 34, arg1);
    FunctionalLibrary.pressEnter();
     int i;
    for(i=10;i<20;i++){
    String pharid=FunctionalLibrary.getText(i, 34).trim();
    if(pharid.equals(arg1) && (FunctionalLibrary.getText(i,50).trim().equals(rxclaimno))){
    break;
    }
    }
  
    FunctionalLibrary.enterText(i, 2, "5");
    FunctionalLibrary.pressEnter();
    FunctionalLibrary.pressKey("F10");
    FunctionalLibrary.enterText(13, 23, "6");
    FunctionalLibrary.pressEnter();
    String rid=FunctionalLibrary.getText(6, 65).trim();
    if(rid.equals(networkid)){
    	System.out.println("Test case passed");
    }
    else
    	Assert.fail();
    
    
}

@When("^I submitt a compound claim withh \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" with F(\\d+) option$")
public void i_submitt_a_compound_claim_withh_with_F_option(String bin, String proc, String group, String pharmacyID, String rxNbr, String refill, String fillDate, String memberID, String productID, String dspQty, String ds, String psc, String cost, String comp,int arg1) throws Throwable {
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
		FunctionalLibrary.enterText(12, 41,rxNbr );
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
		FunctionalLibrary.enterText(5,29, rxNbr);
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
		try{
			Mainframe_GlobalFunctionLib.pressKey("F18");
			Thread.sleep(2000);
			
			if(ScreenshotOption.equalsIgnoreCase("Always")){
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				}
				}catch(Exception e)
				{	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				
					Assert.fail("The Claim is not submitted successfully.Screenshot is captured");
					
				}	
		
}


@When("^I enter override plan \"([^\"]*)\" on MemberdetailScreen$")
public void i_enter_override_plan_on_MemberdetailScreen(String plan) throws Throwable {
	Mainframe_GlobalFunctionLib.click(20, 22);
	   FunctionalLibrary.pressKey("F4");
	   FunctionalLibrary.enterText(4, 5, plan);
	   FunctionalLibrary.pressEnter();
	   FunctionalLibrary.enterText(10, 2, "1");
	   FunctionalLibrary.pressEnter();
}

/*@When("^I submit a Reversal claim with  \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
public void i_submit_a_Reversal_claim_with(String bin, String proc, String group, String pharmacyID, String rxNbr, String refill, String fillDate, String memberID, String productID, String dspQty, String ds, String psc, String cost, String prequal, String preid, String ucw) throws Throwable {

}*/


@When("^I submit a Reversal claim with Retail  \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
public void i_submit_a_Reversal_claim_with_Retail(String bin, String proc, String group, String pharmacyID, String rxNbr, String refill, String fillDate, String memberID, String productID, String dspQty, String ds, String psc, String cost, String rxorg) throws Throwable {
	Reimbursement_Id.CreateTransaction2(bin, proc, group, pharmacyID, rxNbr, refill, fillDate, memberID, productID, dspQty, ds, psc, cost,rxorg);
	try{
	Mainframe_GlobalFunctionLib.pressKey("PageUp");
	Mainframe_GlobalFunctionLib.pressKey("F18");
	Thread.sleep(2000);
	Mainframe_GlobalFunctionLib.pressKey("F7");
	Mainframe_GlobalFunctionLib.pressKey("F6");
	Mainframe_GlobalFunctionLib.pressKey("F6");
	if(ScreenshotOption.equalsIgnoreCase("Always")){
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		}
		}catch(Exception e)
		{	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		
			Assert.fail("The Reverse Claim is not submitted successfully.Screenshot is captured");
			
		}
}
@When("^I get the network id value from the reversed claim$")
public void i_get_the_network_id_value_from_the_reversed_claim() throws Throwable {
	rxclaimno=FunctionalLibrary.getText(3, 12).trim();
	FunctionalLibrary.pressKey("F7");
	//FunctionalLibrary.pressKey("F7");
	FunctionalLibrary.enterText(4, 23, "8");
	FunctionalLibrary.pressEnter();
	networkid=FunctionalLibrary.getText(11, 13).trim();
}
@Then("^I goback to RxClaim Plan Administrator Menu screen from Communication log screen$")
public void i_goback_to_RxClaim_Plan_Administrator_Menu_screen_from_Communication_log_screen() throws Throwable {
   FunctionalLibrary.pressKey("F3");
   FunctionalLibrary.pressKey("F3");
   FunctionalLibrary.pressKey("F3");
   FunctionalLibrary.pressKey("F3");
   FunctionalLibrary.pressKey("F3");
   FunctionalLibrary.pressKey("F3");
   FunctionalLibrary.enterText(21, 7, "20");
   FunctionalLibrary.pressEnter();
}

}
