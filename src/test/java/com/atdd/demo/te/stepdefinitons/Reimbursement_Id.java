package com.atdd.demo.te.stepdefinitons;

import org.testng.Assert;

import com.atdd.te.screenHelpers.CommonHelper;
import com.atdd.te.screenHelpers.FunctionalLibrary;
import com.cucumber.listener.Reporter;
import com.optumrx.autofusion.core.te.util.Mainframe_GlobalFunctionLib;
import com.optumrx.autofusion.core.te.util.Screenshot;

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
	    FunctionalLibrary.pressEnter();
	    FunctionalLibrary.enterText(16, 64, "Y");
	    
	    
	}
	
	
	//@When("^I submit a claim with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" with F(\\d+) option$")
	@When("^I submit a claim with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" with F(\\d+) option$")
	public void i_submit_a_claim_with_with_F_option(String bin, String proc, String group, String pharmacyID, String rxNbr, String refill, String fillDate, String memberID, String productID, String dspQty, String ds, String psc, String cost,String rxorg, int arg1) throws Throwable {
		Reimbursement_Id.CreateTransaction2(bin, proc, group, pharmacyID, rxNbr, refill, fillDate, memberID, productID, dspQty, ds, psc, cost,rxorg);
		
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
    
}


}
