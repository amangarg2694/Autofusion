package com.atdd.demo.te.stepdefinitons;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.testng.Assert;

import com.atdd.te.screenHelpers.FunctionalLibrary;
import com.cucumber.listener.Reporter;
import com.optumrx.autofusion.core.te.util.Mainframe_GlobalFunctionLib;
import com.optumrx.autofusion.core.te.util.Screenshot;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SR41877 {

	
	@When("^I create plan with member eligibility pricing option \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_create_plan_with_member_eligibility_pricing_option(String plancode,String fromdate,String description,String thruDate, String pricechedule, String patientpayschedule) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		try { 
			FunctionalLibrary.navigateToRxClaimPlanAdministrator(); 
	 	} catch (Exception e) { 
	 		e.printStackTrace(); 
	 	} 
		try{ 
	 			Mainframe_GlobalFunctionLib.sendText(21, 7 ,"4" ); 
				Mainframe_GlobalFunctionLib.pressKey("Enter"); 
				Mainframe_GlobalFunctionLib.sendText(21, 7 ,"1" ); 
				Mainframe_GlobalFunctionLib.pressKey("Enter"); 
				
				if(!(FunctionalLibrary.func_SearchAndSelectADataEditMode("4,5" ,plancode ,"11,6" , plancode))) 
				{ 
					Mainframe_GlobalFunctionLib.pressKey("F6"); 
					Mainframe_GlobalFunctionLib.sendText(13, 19 ,plancode); 
					Mainframe_GlobalFunctionLib.sendText(14, 19, fromdate); 
					Mainframe_GlobalFunctionLib.sendText(15, 19 ,description); 
					Mainframe_GlobalFunctionLib.pressKey("Enter"); 
					Mainframe_GlobalFunctionLib.sendText(16, 64 ,"Y"); 
					Mainframe_GlobalFunctionLib.sendText(7, 24 ,"Y"); 
					Mainframe_GlobalFunctionLib.sendText(13, 77 ,"Y"); 
					Mainframe_GlobalFunctionLib.pressKey("Enter"); 
					Mainframe_GlobalFunctionLib.sendText(16, 64 ,"Y"); 
					Mainframe_GlobalFunctionLib.pressKey("F7"); 
					Mainframe_GlobalFunctionLib.sendText(7, 21 ,"28" ); 
					Mainframe_GlobalFunctionLib.pressKey("Enter"); 
					Mainframe_GlobalFunctionLib.sendText(21, 12 ,"1" ); 
					Mainframe_GlobalFunctionLib.pressKey("Enter"); 
					Mainframe_GlobalFunctionLib.pressKey("F6"); 
					Mainframe_GlobalFunctionLib.sendText(8, 12, fromdate); 
					Mainframe_GlobalFunctionLib.sendText(8, 36, thruDate); 
					Mainframe_GlobalFunctionLib.sendText(10, 26 ,pricechedule); 
					Mainframe_GlobalFunctionLib.pressKey("Enter"); 
					Mainframe_GlobalFunctionLib.pressKey("F12"); 
					Mainframe_GlobalFunctionLib.sendText(21, 12 ,"3" ); 
					Mainframe_GlobalFunctionLib.pressKey("Enter"); 
					Mainframe_GlobalFunctionLib.pressKey("F6"); 
					Mainframe_GlobalFunctionLib.sendText(9, 2, fromdate); 
					Mainframe_GlobalFunctionLib.sendText(9, 12, thruDate); 
					Mainframe_GlobalFunctionLib.sendText(9, 22 ,patientpayschedule); 
					Mainframe_GlobalFunctionLib.pressKey("Enter"); 
					Mainframe_GlobalFunctionLib.sendText(16, 64 ,"Y"); 
					Mainframe_GlobalFunctionLib.pressKey("F12"); 
					Mainframe_GlobalFunctionLib.pressKey("F12"); 
					Mainframe_GlobalFunctionLib.pressKey("F12"); 
					//Mainframe_GlobalFunctionLib.pressKey("F12");
					Thread.sleep(5000);
				} 
				 
				else 
				{ 
					Mainframe_GlobalFunctionLib.sendText(7, 24 ,"Y"); 
					Mainframe_GlobalFunctionLib.sendText(13, 77 ,"Y"); 
					Mainframe_GlobalFunctionLib.pressKey("Enter"); 
					Mainframe_GlobalFunctionLib.sendText(16, 64 ,"Y"); 
					Mainframe_GlobalFunctionLib.pressKey("F7"); 
					Mainframe_GlobalFunctionLib.sendText(7, 21 ,"28" ); 
					Mainframe_GlobalFunctionLib.pressKey("Enter"); 
					Mainframe_GlobalFunctionLib.sendText(21, 12 ,"1" ); 
					Mainframe_GlobalFunctionLib.pressKey("Enter"); 
					Mainframe_GlobalFunctionLib.pressKey("F6"); 
					Mainframe_GlobalFunctionLib.sendText(8, 12, fromdate); 
					Mainframe_GlobalFunctionLib.sendText(8, 36, thruDate); 
					Mainframe_GlobalFunctionLib.sendText(10, 26 ,pricechedule); 
					Mainframe_GlobalFunctionLib.pressKey("Enter"); 
					Mainframe_GlobalFunctionLib.pressKey("F12"); 
					Mainframe_GlobalFunctionLib.sendText(21, 12 ,"3" ); 
					Mainframe_GlobalFunctionLib.pressKey("Enter"); 
					Mainframe_GlobalFunctionLib.pressKey("F6"); 
					Mainframe_GlobalFunctionLib.sendText(9, 2, fromdate); 
					Mainframe_GlobalFunctionLib.sendText(9, 12, thruDate); 
					Mainframe_GlobalFunctionLib.sendText(9, 22 ,patientpayschedule); 
					Mainframe_GlobalFunctionLib.pressKey("Enter"); 
					Mainframe_GlobalFunctionLib.sendText(16, 64 ,"Y"); 
					Mainframe_GlobalFunctionLib.pressKey("F12"); 
					Mainframe_GlobalFunctionLib.pressKey("F12"); 
					Mainframe_GlobalFunctionLib.pressKey("F12"); 
					Thread.sleep(5000);
					 
				} 
		 
			  	if(FunctionalLibrary.ScreenshotOption.equalsIgnoreCase("Always")){ 
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
				} 
				}
		        catch(Exception e) 
				{	Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
					Assert.fail("The Plan edit 2 Member Eligibility and 28 Pricing are not set successfully.Screenshot is captured"); 
				} 
	}

	/*@Then("^Validate plan \"([^\"]*)\"$")
	public void validate_plan(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions*
	    
	}*/

	@Then("^I add plan With NDC list \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_add_plan_With_NDC_list(String ndclist,String ndcsq, String ndcfromdate,String ndcthrudate) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
		try{ 
			Mainframe_GlobalFunctionLib.sendText(15, 24 ,"Y" ); 
			Mainframe_GlobalFunctionLib.pressKey("Enter"); 
			Mainframe_GlobalFunctionLib.sendText(16, 64 ,"Y" ); 
			Mainframe_GlobalFunctionLib.pressKey("F7"); 
			Mainframe_GlobalFunctionLib.sendText(7, 21 ,"10" ); 
			Mainframe_GlobalFunctionLib.pressKey("Enter"); 
						
				Mainframe_GlobalFunctionLib.pressKey("F6"); 
				Thread.sleep(5000);
				//FunctionalLibrary.func_SearchAndSelectADataEditMode("4, 5" ,ndclist ,"9,5" , ndclist);
				//FunctionalLibrary.func_SearchAndSelectMode("4, 5" ,ndclist ,"9,5" , ndclist);
				Mainframe_GlobalFunctionLib.sendText(4, 5 ,ndclist);
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(9, 2 ,"1" );
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(13, 17 ,"   "); 
				Mainframe_GlobalFunctionLib.sendText(13, 17, ndcsq); 
				Mainframe_GlobalFunctionLib.sendText(14, 17 ,"        "); 
				Mainframe_GlobalFunctionLib.sendText(14, 17, ndcfromdate); 
				Mainframe_GlobalFunctionLib.sendText(14, 41 ,"        "); 
				Mainframe_GlobalFunctionLib.sendText(14, 41, ndcthrudate); 
				Mainframe_GlobalFunctionLib.pressKey("Enter"); 
				Mainframe_GlobalFunctionLib.sendText(16, 64 ,"Y" ); 
				Mainframe_GlobalFunctionLib.pressKey("F12");
				Mainframe_GlobalFunctionLib.pressKey("F12");
				Mainframe_GlobalFunctionLib.pressKey("F12");
				Mainframe_GlobalFunctionLib.pressKey("F12");
				Mainframe_GlobalFunctionLib.pressKey("F12");
				Mainframe_GlobalFunctionLib.pressKey("F12");
				 
		  	if(FunctionalLibrary.ScreenshotOption.equalsIgnoreCase("Always")){ 
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
			} 
		}
			catch(Exception e) 
			{	Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
				Assert.fail("The Add Plan with NDC List is not set successfully.Screenshot is captured"); 
			} 
	}

	/*@Then("^Validate NDC list is \"([^\"]*)\"$")
	public void validate_NDC_list_is(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}*/

	@When("^I Setup plan with GPI list \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_Setup_plan_with_GPI_list(String plancode,String gpilist,String gpisq, String gpifromdate,String gpithrudate) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
		 
		try { 
			FunctionalLibrary.navigateToRxClaimPlanAdministrator(); 
		} catch (Exception e) { 
			e.printStackTrace(); 
		} 
		try{ 
				Mainframe_GlobalFunctionLib.sendText(21, 7 ,"4" ); 
				Mainframe_GlobalFunctionLib.pressKey("Enter"); 
				Mainframe_GlobalFunctionLib.sendText(21, 7 ,"1" ); 
				Mainframe_GlobalFunctionLib.pressKey("Enter"); 
				Mainframe_GlobalFunctionLib.sendText(4, 5 ,plancode);
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(11, 2 ,"2" ); 
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				//FunctionalLibrary.func_SearchAndSelectADataEditMode("4,5" ,plancode ,"11,6" , plancode); 
				Mainframe_GlobalFunctionLib.sendText(6, 51 ,"Y" ); 
				Mainframe_GlobalFunctionLib.pressKey("Enter"); 
				Mainframe_GlobalFunctionLib.sendText(16, 64 ,"Y" ); 
				Mainframe_GlobalFunctionLib.pressKey("F7"); 
				Mainframe_GlobalFunctionLib.sendText(7, 21 ,"11" ); 
				Mainframe_GlobalFunctionLib.pressKey("Enter"); 
				 
					Mainframe_GlobalFunctionLib.pressKey("F6"); 
					//FunctionalLibrary.func_SearchAndSelectMode("4, 5" ,gpilist ,"9,5" , gpilist); 
					Mainframe_GlobalFunctionLib.sendText(4, 5 ,gpilist);
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					Mainframe_GlobalFunctionLib.sendText(9, 2 ,"1" );
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					Mainframe_GlobalFunctionLib.sendText(13, 17 ,"   "); 
					Mainframe_GlobalFunctionLib.sendText(13, 17, gpisq); 
					Mainframe_GlobalFunctionLib.sendText(14, 17 ,"        "); 
					Mainframe_GlobalFunctionLib.sendText(14, 17, gpifromdate); 
					Mainframe_GlobalFunctionLib.sendText(14, 41 ,"        "); 
					Mainframe_GlobalFunctionLib.sendText(14, 41, gpithrudate); 
					Mainframe_GlobalFunctionLib.pressKey("Enter"); 
					Mainframe_GlobalFunctionLib.sendText(16, 64 ,"Y" ); 
					Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
					Mainframe_GlobalFunctionLib.pressKey("F12"); 
					Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
					Mainframe_GlobalFunctionLib.pressKey("F12");
					Mainframe_GlobalFunctionLib.pressKey("F12");
					Mainframe_GlobalFunctionLib.pressKey("F12");
					Mainframe_GlobalFunctionLib.pressKey("F12");
					Mainframe_GlobalFunctionLib.pressKey("F12");
					 
			  	if(FunctionalLibrary.ScreenshotOption.equalsIgnoreCase("Always")){ 
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
				} 
				}catch(Exception e) 
				{	Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
					Assert.fail("The Plan with GPI List is not set successfully.Screenshot is captured"); 
				}
	}

	/*@Then("^Validate GPI list is \"([^\"]*)\"$")
	public void validate_GPI_list_is(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}*/
	
	@When("^I Setup plan \"([^\"]*)\" with Compounds multiple ingredient option \"([^\"]*)\"$")
	public void i_Setup_plan_with_Compounds_multiple_ingredient_option(String PlanCode, String CMIPlan) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		try { 
			FunctionalLibrary.navigateToRxClaimPlanAdministrator(); 
		} catch (Exception e) { 
			e.printStackTrace(); 
		} 
		
			Mainframe_GlobalFunctionLib.sendText(21, 7 ,"4" ); 
			Mainframe_GlobalFunctionLib.pressKey("Enter"); 
			Mainframe_GlobalFunctionLib.sendText(21, 7 ,"1" ); 
			Mainframe_GlobalFunctionLib.pressKey("Enter"); 
			Mainframe_GlobalFunctionLib.sendText(4, 5 ,PlanCode);
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(11, 2 ,"2" ); 
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(14, 24 ,"Y" );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(16, 64 ,"Y" );
			Mainframe_GlobalFunctionLib.pressKey("F7");
			Thread.sleep(2000);
			Mainframe_GlobalFunctionLib.sendText(7, 21 ,"9" ); 
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(13, 12 ,"2" );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(8, 23 ,"  " );
			Thread.sleep(1000);
			Mainframe_GlobalFunctionLib.sendText(8, 23 ,"1" );
			Thread.sleep(1000);
			Mainframe_GlobalFunctionLib.sendText(9, 37 ,"Y" );
			Thread.sleep(1000);
			Mainframe_GlobalFunctionLib.sendText(10, 37 ,"Y" );
			Thread.sleep(1000);
			Mainframe_GlobalFunctionLib.sendText(10, 60 ,"1" );
			Thread.sleep(1000);
			Mainframe_GlobalFunctionLib.sendText(14, 44 ,"F" );
			Thread.sleep(1000);
			Mainframe_GlobalFunctionLib.sendText(15, 44 ,"M" );
			Thread.sleep(1000);
			Mainframe_GlobalFunctionLib.sendText(21, 11 ,CMIPlan);
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			Mainframe_GlobalFunctionLib.pressKey("F12");
			Mainframe_GlobalFunctionLib.pressKey("F12");
			Mainframe_GlobalFunctionLib.pressKey("F12");
			Mainframe_GlobalFunctionLib.pressKey("F12");
			Mainframe_GlobalFunctionLib.pressKey("F12");
			Mainframe_GlobalFunctionLib.pressKey("F12");
	}

	
	@Given("^I add product IDs \"([^\"]*)\", \"([^\"]*)\" to the Plan \"([^\"]*)\" NDC list \"([^\"]*)\" with status \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_add_product_IDs_to_the_Plan_NDC_list_with_status(String ID1, String ID2, String PlanCode, String NDCList, String Status1, String Status2, String PFromdate, String PThrudate) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
		try { 
			FunctionalLibrary.navigateToRxClaimPlanAdministrator(); 
		} catch (Exception e) { 
			e.printStackTrace(); 
		} 
		
				Mainframe_GlobalFunctionLib.sendText(21, 7 ,"4" ); 
				Mainframe_GlobalFunctionLib.pressKey("Enter"); 
				Mainframe_GlobalFunctionLib.sendText(21, 7 ,"1" ); 
				Mainframe_GlobalFunctionLib.pressKey("Enter"); 
				Mainframe_GlobalFunctionLib.sendText(4, 5 ,PlanCode);
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(11, 2 ,"2" ); 
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.pressKey("F7");
				Thread.sleep(2000);
				Mainframe_GlobalFunctionLib.sendText(7, 21 ,"10" ); 
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(7, 8 ,NDCList);
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(11, 2 ,"7" );
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				//First product Id adding to NDC list
				Mainframe_GlobalFunctionLib.pressKey("F6");
				Thread.sleep(2000);
				Mainframe_GlobalFunctionLib.pressKey("F16");
				Thread.sleep(2000);
				Mainframe_GlobalFunctionLib.sendText(7, 4 ,ID1);
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(12, 2 ,"1" );
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Thread.sleep(2000);
				Mainframe_GlobalFunctionLib.sendText(6, 57 ,"        ");
				Mainframe_GlobalFunctionLib.sendText(6, 57 ,PFromdate);
				Mainframe_GlobalFunctionLib.sendText(6, 67 ,PThrudate);
				Thread.sleep(2000);
				Mainframe_GlobalFunctionLib.click(6, 78 );
				Thread.sleep(2000);
				Mainframe_GlobalFunctionLib.sendText(6, 78 ,Status1);
				Thread.sleep(2000);
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				Mainframe_GlobalFunctionLib.pressKey("F12");
				Mainframe_GlobalFunctionLib.pressKey("F12");
				Mainframe_GlobalFunctionLib.pressKey("F12");
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				
				   //Second product Id adding to NDC list
				Mainframe_GlobalFunctionLib.pressKey("F6");
				Thread.sleep(2000);
				Mainframe_GlobalFunctionLib.pressKey("F16");
				Thread.sleep(2000);
				Mainframe_GlobalFunctionLib.sendText(7, 4 ,ID2);
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(12, 2 ,"1" );
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Thread.sleep(2000);
				Mainframe_GlobalFunctionLib.sendText(6, 57 ,"        ");
				Mainframe_GlobalFunctionLib.sendText(6, 57 ,PFromdate);
				Mainframe_GlobalFunctionLib.sendText(6, 67 ,PThrudate);
				Thread.sleep(2000);
				Mainframe_GlobalFunctionLib.click(6, 78 );
				Thread.sleep(2000);
				Mainframe_GlobalFunctionLib.sendText(6, 78 ,Status2);
				Thread.sleep(2000);
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				Mainframe_GlobalFunctionLib.pressKey("F12");
				Mainframe_GlobalFunctionLib.pressKey("F12");
				Mainframe_GlobalFunctionLib.pressKey("F12");
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				
				Mainframe_GlobalFunctionLib.pressKey("F12");
				Mainframe_GlobalFunctionLib.pressKey("F12");
				Mainframe_GlobalFunctionLib.pressKey("F12");
				Mainframe_GlobalFunctionLib.pressKey("F12");
				Mainframe_GlobalFunctionLib.pressKey("F12");
				Mainframe_GlobalFunctionLib.pressKey("F12");
				
	}

	@Given("^I add product IDs \"([^\"]*)\", \"([^\"]*)\" to the Plan \"([^\"]*)\" GPI list \"([^\"]*)\" with status \"([^\"]*)\" ,\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_add_product_IDs_to_the_Plan_GPI_list_with_status(String ID3, String ID4, String PlanCode, String GPIList, String Status1, String Status2,String PFromdate, String PThrudate) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		try { 
			FunctionalLibrary.navigateToRxClaimPlanAdministrator(); 
		} catch (Exception e) { 
			e.printStackTrace(); 
		} 
		
				Mainframe_GlobalFunctionLib.sendText(21, 7 ,"4" ); 
				Mainframe_GlobalFunctionLib.pressKey("Enter"); 
				Mainframe_GlobalFunctionLib.sendText(21, 7 ,"1" ); 
				Mainframe_GlobalFunctionLib.pressKey("Enter"); 
				Mainframe_GlobalFunctionLib.sendText(4, 5 ,PlanCode);
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(11, 2 ,"2" ); 
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.pressKey("F7");
				Thread.sleep(2000);
				Mainframe_GlobalFunctionLib.sendText(7, 21 ,"11" ); 
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(7, 8 ,GPIList);
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(11, 2 ,"7" );
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				//First product Id adding to GPI list
				Mainframe_GlobalFunctionLib.pressKey("F6");
				Thread.sleep(2000);
				Mainframe_GlobalFunctionLib.pressKey("F17");
				Thread.sleep(2000);
				 				
				Mainframe_GlobalFunctionLib.sendText(6, 4 ,ID3);
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(11, 2 ,"1" );
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Thread.sleep(2000);
				Mainframe_GlobalFunctionLib.sendText(6, 57 ,"        ");
				Mainframe_GlobalFunctionLib.sendText(6, 57 ,PFromdate);
				Mainframe_GlobalFunctionLib.sendText(6, 67 ,PThrudate);
				Thread.sleep(2000);
				Mainframe_GlobalFunctionLib.click(6, 78 );
				Thread.sleep(2000);
				Mainframe_GlobalFunctionLib.sendText(6, 78 ,Status1);
				Thread.sleep(2000);
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				Mainframe_GlobalFunctionLib.pressKey("F12");
				Mainframe_GlobalFunctionLib.pressKey("F12");
				Mainframe_GlobalFunctionLib.pressKey("F12");
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				
				//Second product Id adding to GPI list
				Mainframe_GlobalFunctionLib.pressKey("F6");
				Thread.sleep(2000);
				Mainframe_GlobalFunctionLib.pressKey("F17");
				Thread.sleep(2000);
				 				
				Mainframe_GlobalFunctionLib.sendText(6, 4 ,ID4);
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(11, 2 ,"1" );
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Thread.sleep(2000);
				Mainframe_GlobalFunctionLib.sendText(6, 57 ,"        ");
				Mainframe_GlobalFunctionLib.sendText(6, 57 ,PFromdate);
				Mainframe_GlobalFunctionLib.sendText(6, 67 ,PThrudate);
				Thread.sleep(2000);
				Mainframe_GlobalFunctionLib.click(6, 78 );
				Thread.sleep(2000);
				Mainframe_GlobalFunctionLib.sendText(6, 78 ,Status2);
				Thread.sleep(2000);
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				Mainframe_GlobalFunctionLib.pressKey("F12");
				Mainframe_GlobalFunctionLib.pressKey("F12");
				Mainframe_GlobalFunctionLib.pressKey("F12");
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				
				Mainframe_GlobalFunctionLib.pressKey("F12");
				Mainframe_GlobalFunctionLib.pressKey("F12");
				Mainframe_GlobalFunctionLib.pressKey("F12");
				Mainframe_GlobalFunctionLib.pressKey("F12");
				Mainframe_GlobalFunctionLib.pressKey("F12");
				Mainframe_GlobalFunctionLib.pressKey("F12");
	    
	}
	
	@Given("^I create MemberPA1 \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_create_MemberPA1(String number, String type, String ndcgpilist, String from, String thru, String agent, String reason, String ignoredrugstatus) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
		{ 

			 
			String sValue=number; 
			Mainframe_GlobalFunctionLib.pressKey("F8"); 
			Mainframe_GlobalFunctionLib.sendText(4, 20 ,"9" ); 
			Mainframe_GlobalFunctionLib.pressKey("Enter"); 
 			Mainframe_GlobalFunctionLib.pressKey("F6"); 
			 
			/*if(!(func_ValidateAnyPAAttached(number))) 
			{ 

 
				try{ 
					Mainframe_GlobalFunctionLib.sendText(9, 5 ,sValue); 
				} 
				catch (Exception e) { 
					Mainframe_GlobalFunctionLib.pressKey("F6"); 
					Mainframe_GlobalFunctionLib.sendText(9, 5 ,sValue); 
				} */
				Mainframe_GlobalFunctionLib.pressKey("F6"); 
				Mainframe_GlobalFunctionLib.sendText(16, 5,"           " ); 
				Mainframe_GlobalFunctionLib.sendText(16, 5 ,sValue); 
				Mainframe_GlobalFunctionLib.sendText(16, 23,"*"); 
				Mainframe_GlobalFunctionLib.sendText(16, 18, type); 
				Mainframe_GlobalFunctionLib.sendText(16, 26, ndcgpilist); 
				Mainframe_GlobalFunctionLib.sendText(16, 42,"        " ); 
				Mainframe_GlobalFunctionLib.sendText(16, 42, from); 
				Mainframe_GlobalFunctionLib.sendText(16, 51,"        " ); 
				Mainframe_GlobalFunctionLib.sendText(16, 51, thru); 
				Mainframe_GlobalFunctionLib.sendText(16, 61, agent); 
				Mainframe_GlobalFunctionLib.sendText(16, 66, reason); 
				Mainframe_GlobalFunctionLib.sendText(16, 71, ignoredrugstatus); 
				Mainframe_GlobalFunctionLib.pressKey("Enter"); 
				Mainframe_GlobalFunctionLib.sendText(16, 2,"2" );
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				String ActCompSet = Mainframe_GlobalFunctionLib.getText(15, 53);
				System.out.println("Member level compound set to: "+ActCompSet);
				String ActMemPriANum = Mainframe_GlobalFunctionLib.getText(4, 66);
				System.out.println("Member PA number: "+ActMemPriANum);
				
				
 							 
 				/*while(msgvalidation("24","2","Member Prior Authorization number already exists")) 
				{ 
 					sValue=Integer.toString(Integer.valueOf(sValue)+1); 
 					Mainframe_GlobalFunctionLib.sendText(16, 5 ,sValue); 
 					Mainframe_GlobalFunctionLib.pressKey("Enter"); 
 				} */
				Mainframe_GlobalFunctionLib.pressKey("F12"); 
				Mainframe_GlobalFunctionLib.pressKey("F12"); 
				Mainframe_GlobalFunctionLib.pressKey("F12"); 
				Mainframe_GlobalFunctionLib.pressKey("F12");
				Mainframe_GlobalFunctionLib.pressKey("F12"); 
				Mainframe_GlobalFunctionLib.pressKey("F12");
 
 
			} 

	}
	

	}



