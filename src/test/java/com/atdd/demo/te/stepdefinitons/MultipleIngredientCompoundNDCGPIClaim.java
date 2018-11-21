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

public class MultipleIngredientCompoundNDCGPIClaim {

	
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
			Thread.sleep(2000);
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
			FunctionalLibrary.navigateToRxClaimPlanAdministrator(); // F12-6

	}

	@When("^I Setup plan \"([^\"]*)\" with GPI Compounds multiple ingredient option \"([^\"]*)\"$")
	public void i_Setup_plan_with_GPI_Compounds_multiple_ingredient_option(String PlanCode, String CMIPlan) throws Throwable {
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
			Mainframe_GlobalFunctionLib.sendText(7, 21 ,"9" ); 
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(13, 12 ,"2" );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(8, 23 ,"  " );
			Mainframe_GlobalFunctionLib.sendText(8, 23 ,"1" );
			Mainframe_GlobalFunctionLib.sendText(9, 37 ,"Y" );
			Mainframe_GlobalFunctionLib.sendText(10, 37 ,"Y" );
			Mainframe_GlobalFunctionLib.sendText(10, 60 ,"1" );
			Mainframe_GlobalFunctionLib.sendText(14, 44 ,"F" );
			Mainframe_GlobalFunctionLib.sendText(15, 44 ,"M" );
			Mainframe_GlobalFunctionLib.sendText(21, 24 ,CMIPlan);
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			FunctionalLibrary.navigateToRxClaimPlanAdministrator(); // F12-6
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
				Mainframe_GlobalFunctionLib.sendText(7, 21 ,"10" ); 
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(7, 8 ,NDCList);
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(11, 2 ,"7" );
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				//First product Id adding to NDC list
				Mainframe_GlobalFunctionLib.pressKey("F6");
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				Thread.sleep(2000);
				Mainframe_GlobalFunctionLib.pressKey("F16");
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				Mainframe_GlobalFunctionLib.sendText(7, 4 ,ID1);
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(12, 2 ,"1" );
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(6, 57 ,"        ");
				Mainframe_GlobalFunctionLib.sendText(6, 57 ,PFromdate);
				Mainframe_GlobalFunctionLib.sendText(6, 67 ,PThrudate);
				Mainframe_GlobalFunctionLib.click(6, 78 );
				Thread.sleep(2000);
				Mainframe_GlobalFunctionLib.sendText(6, 78 ,Status1);
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
				Mainframe_GlobalFunctionLib.sendText(7, 4 ,ID2);
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(12, 2 ,"1" );
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(6, 57 ,"        ");
				Mainframe_GlobalFunctionLib.sendText(6, 57 ,PFromdate);
				Mainframe_GlobalFunctionLib.sendText(6, 67 ,PThrudate);
				Thread.sleep(2000);
				Mainframe_GlobalFunctionLib.click(6, 78 );
				Mainframe_GlobalFunctionLib.sendText(6, 78 ,Status2);
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				Mainframe_GlobalFunctionLib.pressKey("F12");
				Mainframe_GlobalFunctionLib.pressKey("F12");
				Mainframe_GlobalFunctionLib.pressKey("F12");
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				FunctionalLibrary.navigateToRxClaimPlanAdministrator(); // F12-6
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
				Mainframe_GlobalFunctionLib.sendText(6, 4 ,ID3);
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(11, 2 ,"1" );
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(6, 57 ,"        ");
				Mainframe_GlobalFunctionLib.sendText(6, 57 ,PFromdate);
				Mainframe_GlobalFunctionLib.sendText(6, 67 ,"        ");
				Mainframe_GlobalFunctionLib.sendText(6, 67 ,PThrudate);
				Mainframe_GlobalFunctionLib.click(6, 78 );
				Mainframe_GlobalFunctionLib.sendText(6, 78 ,Status1);
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
				Mainframe_GlobalFunctionLib.sendText(6, 4 ,ID4);
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(11, 2 ,"1" );
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(6, 57 ,"        ");
				Mainframe_GlobalFunctionLib.sendText(6, 57 ,PFromdate);
				Mainframe_GlobalFunctionLib.sendText(6, 67 ,PThrudate);
				Mainframe_GlobalFunctionLib.click(6, 78 );
				Mainframe_GlobalFunctionLib.sendText(6, 78 ,Status2);
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				Mainframe_GlobalFunctionLib.pressKey("F12");
				Mainframe_GlobalFunctionLib.pressKey("F12");
				Mainframe_GlobalFunctionLib.pressKey("F12");
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				FunctionalLibrary.navigateToRxClaimPlanAdministrator(); // F12-6
	}
	
	@Given("^I create MemberPrioAuth \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_create_MemberPrioAuth(String MemberID, String CarrierID, String AccountID,String GroupID,String number, String type, String ndcgpilist, String from, String thru, String agent, String reason, String ignoredrugstatus) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
			try { 
				FunctionalLibrary.navigateToRxClaimPlanAdministrator(); 
			} catch (Exception e) { 
				e.printStackTrace(); 
			} 
			 
				String sValue=number; 
				Mainframe_GlobalFunctionLib.sendText(21, 7 ,"1" );
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(21, 7 ,"2" );
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(4, 4, MemberID);
				Mainframe_GlobalFunctionLib.sendText(4, 36, CarrierID);
				Mainframe_GlobalFunctionLib.sendText(4, 47, AccountID);
				Mainframe_GlobalFunctionLib.sendText(4, 64, GroupID);
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(10, 2 ,"2" );
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.pressKey("F8"); 
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				Mainframe_GlobalFunctionLib.sendText(4, 20 ,"9" ); 
				Mainframe_GlobalFunctionLib.pressKey("Enter"); 
	 			Mainframe_GlobalFunctionLib.pressKey("F6"); 
	 			Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
				Mainframe_GlobalFunctionLib.pressKey("F6"); 
				Mainframe_GlobalFunctionLib.sendText(16, 5,"           " ); 
				Mainframe_GlobalFunctionLib.sendText(16, 5 ,sValue);
				Mainframe_GlobalFunctionLib.sendText(16, 18, type); 
				Mainframe_GlobalFunctionLib.sendText(16, 23,"*");
				Mainframe_GlobalFunctionLib.sendText(16, 27,"*");
				//Mainframe_GlobalFunctionLib.sendText(16, 18, type); 
				Mainframe_GlobalFunctionLib.sendText(16, 30, ndcgpilist);   // Updated coordinates
				Mainframe_GlobalFunctionLib.sendText(16, 46,"        " ); 
				Mainframe_GlobalFunctionLib.sendText(16, 46, from); 
				Mainframe_GlobalFunctionLib.sendText(16, 55,"        " ); 
				Mainframe_GlobalFunctionLib.sendText(16, 55, thru); 
				Mainframe_GlobalFunctionLib.sendText(16, 65, agent); 
				Mainframe_GlobalFunctionLib.sendText(16, 70, reason); 
				Mainframe_GlobalFunctionLib.sendText(16, 75, ignoredrugstatus); 
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				Mainframe_GlobalFunctionLib.pressKey("Enter"); 
				Mainframe_GlobalFunctionLib.sendText(16, 2,"2" );
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				String ActCompSet = Mainframe_GlobalFunctionLib.getText(15, 53);
				System.out.println("Member level compound set to: "+ActCompSet);
				String ActMemPriANum = Mainframe_GlobalFunctionLib.getText(4, 66);
				System.out.println("Member PA number: "+ActMemPriANum);
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());				 
				FunctionalLibrary.navigateToRxClaimPlanAdministrator(); // F12-6
	}
	
	@Given("^I submit a Multi Ingredient compound claim with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_submit_a_Multi_Ingredient_compound_claim_with(String BIN, String ProcCtrl, String Group, String PharmacyID, String RxNo, String Refill, String FillDate, String MemberID, String ProductID, String DspQty, String DS, String PSC, String Cost, String UCW, String compQualID_1, String ID1, String compQuantity_1, String compCost_1, String compBasisOfCost_1, String compQualID_2, String ID2, String compQuantity_2, String compCost_2, String compBasisOfCost_2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
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
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		if(FunctionalLibrary.func_SearchForMemberID("4,4" ,MemberID ,"9,4" , MemberID)) 
		{ 
				Thread.sleep(1000); 
				Mainframe_GlobalFunctionLib.click(4, 29 ); 
				Mainframe_GlobalFunctionLib.sendText(4, 29, PharmacyID); 
				Mainframe_GlobalFunctionLib.sendText(5,29, FunctionalLibrary.func_GenerateDynamicRxNo()); 
				Mainframe_GlobalFunctionLib.sendText(5, 47, Refill);
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		} 
		else 
		{ 
			Mainframe_GlobalFunctionLib.pressKey("F6"); 
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			Mainframe_GlobalFunctionLib.sendText(11, 14,BIN ); 
			Mainframe_GlobalFunctionLib.sendText(11, 41,ProcCtrl ); 
			Mainframe_GlobalFunctionLib.sendText(11, 59,Group ); 
			Mainframe_GlobalFunctionLib.sendText(12, 14,PharmacyID ); 
			Mainframe_GlobalFunctionLib.sendText(12, 41,FunctionalLibrary.func_GenerateDynamicRxNo()); 
			Mainframe_GlobalFunctionLib.sendText(12, 59,Refill ); 
			Mainframe_GlobalFunctionLib.sendText(14, 41,MemberID ); 
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			Mainframe_GlobalFunctionLib.pressKey("Enter"); 
		} 
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				Mainframe_GlobalFunctionLib.sendText(4 , 65 ,"          "); 
				Mainframe_GlobalFunctionLib.sendText(4, 65, FillDate);			 
				Mainframe_GlobalFunctionLib.click(7, 12 ); 
				Mainframe_GlobalFunctionLib.sendText(7, 12, MemberID); 
				Mainframe_GlobalFunctionLib.pressKey("F4"); 
				Mainframe_GlobalFunctionLib.sendText(3, 4, MemberID); 
				Mainframe_GlobalFunctionLib.pressKey("Enter");          
				Mainframe_GlobalFunctionLib.sendText(8, 2,"1" ); 
				Mainframe_GlobalFunctionLib.pressKey("Enter"); 
				Mainframe_GlobalFunctionLib.sendText(11, 20,ProductID ); 
				Mainframe_GlobalFunctionLib.sendText(12, 11,"           " ); 
				Mainframe_GlobalFunctionLib.sendText(12, 11,DspQty ); 
				Mainframe_GlobalFunctionLib.sendText(12, 26,"   " ); 
				Mainframe_GlobalFunctionLib.sendText(12, 26,DS); 
				Mainframe_GlobalFunctionLib.sendText(14, 6,PSC ); 
				Mainframe_GlobalFunctionLib.sendText(14, 14,"2" ); 
				Mainframe_GlobalFunctionLib.sendText(10, 47,"         " ); 
				Mainframe_GlobalFunctionLib.sendText(10, 47,Cost); 
				//Mainframe_GlobalFunctionLib.sendText(19, 19,prequal ); 
				//Mainframe_GlobalFunctionLib.sendText(19, 26,preid ); 
				Mainframe_GlobalFunctionLib.sendText(20, 47,"         " ); 
				Mainframe_GlobalFunctionLib.sendText(20, 47,UCW ); 
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				Mainframe_GlobalFunctionLib.pressKey("F14"); 
				Mainframe_GlobalFunctionLib.sendText(5, 23,"5" ); 
				Mainframe_GlobalFunctionLib.pressKey("Enter"); 
				Mainframe_GlobalFunctionLib.pressKey("F6"); 
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				Mainframe_GlobalFunctionLib.sendText(12, 20,compQualID_1 ); 
				Mainframe_GlobalFunctionLib.click(13, 20 );
				Mainframe_GlobalFunctionLib.pressKey("F4");
				Thread.sleep(2000);
				Mainframe_GlobalFunctionLib.pressKey("F16");
				Mainframe_GlobalFunctionLib.sendText(4, 4,ID1 );
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(9, 2,"1" );
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(15, 20,compQuantity_1 ); 
				Mainframe_GlobalFunctionLib.sendText(16, 20,compCost_1); 
				Mainframe_GlobalFunctionLib.sendText(18, 20,compBasisOfCost_1);
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				Mainframe_GlobalFunctionLib.pressKey("Enter"); 
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				Mainframe_GlobalFunctionLib.pressKey("F6"); 
				Mainframe_GlobalFunctionLib.sendText(12, 20,compQualID_2 ); 
				//Mainframe_GlobalFunctionLib.sendText(13, 20, ID2 );
				Thread.sleep(2000);
				Mainframe_GlobalFunctionLib.click(13, 20 );
				Thread.sleep(2000);
				Mainframe_GlobalFunctionLib.pressKey("F4");
				Thread.sleep(2000);
				Mainframe_GlobalFunctionLib.pressKey("F16");
				Thread.sleep(2000);
				Mainframe_GlobalFunctionLib.sendText(4, 4,ID2 );
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(9, 2,"1" );
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(15, 20,compQuantity_2 ); 
				Mainframe_GlobalFunctionLib.sendText(16, 20,compCost_2); 
				Mainframe_GlobalFunctionLib.sendText(18, 20,compBasisOfCost_2); 
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				Mainframe_GlobalFunctionLib.pressKey("Enter"); 
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				Mainframe_GlobalFunctionLib.pressKey("F12"); 
				Mainframe_GlobalFunctionLib.pressKey("F12"); 
				Mainframe_GlobalFunctionLib.pressKey("F6"); 
				//verification								 
			System.out.println("Compound Claim is submitted"); 
			if(FunctionalLibrary.ScreenshotOption.equalsIgnoreCase("Always")){ 
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
				} 
				}catch(Exception e) 
		 
				{	Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
				e.printStackTrace(); 
					Assert.fail("An error has occured while creating the claim transaction.Screenshot is captured"); 
				} 
	}

	@Then("^I validate the Claim status \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_validate_the_Claim_status(String ClaimStatus, String DrugStatus, String RejectCode, String RejectMessage) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   			Mainframe_GlobalFunctionLib.validateText("21", "6",ClaimStatus );
				Mainframe_GlobalFunctionLib.pressKey("F7");
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				Mainframe_GlobalFunctionLib.pressKey("F7");
				Mainframe_GlobalFunctionLib.sendText(4, 23 ,"3" );
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.pressKey("F14");
				Mainframe_GlobalFunctionLib.sendText(4, 23 ,"5" );
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(14, 2 ,"5" );
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				Mainframe_GlobalFunctionLib.validateText("6", "37", ClaimStatus);
				String ActClaimStatus = Mainframe_GlobalFunctionLib.getText(6, 37);
				System.out.println("Actual Claim Status: "+ActClaimStatus);
				
				Mainframe_GlobalFunctionLib.validateText("7", "26", DrugStatus);
				String ActDrugStatus = Mainframe_GlobalFunctionLib.getText(7, 26);
				System.out.println("Actual Drug Status: "+ActDrugStatus);
				
				Mainframe_GlobalFunctionLib.validateText("18", "2", RejectCode);
				String ActRejCode = Mainframe_GlobalFunctionLib.getText(18, 2);
				System.out.println("Actual Rejected Code: "+ActRejCode);
				
				Mainframe_GlobalFunctionLib.validateText("18", "40", RejectMessage);
				String ActRejMessage = Mainframe_GlobalFunctionLib.getText(18, 40);
				System.out.println("Actual Rejected Message: "+ActRejMessage);
				Mainframe_GlobalFunctionLib.pressKey("F12"); 
				
				Mainframe_GlobalFunctionLib.sendText(15, 2 ,"5" );
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				Mainframe_GlobalFunctionLib.validateText("6", "30", "R");
				Mainframe_GlobalFunctionLib.validateText("7", "23", "F");
				FunctionalLibrary.navigateToRxClaimPlanAdministrator(); // F12-10
	
	}

	@Given("^I set MemberPrioAuth \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" to allow compound \"([^\"]*)\" and I will add drugs \"([^\"]*)\",\"([^\"]*)\" at member PA level$")
	public void i_set_MemberPrioAuth_to_allow_compound_and_I_will_add_drugs_at_member_PA_level(String MemberID, String CarrierID, String AccountID, String GroupID, String MemComp, String ID1, String ID2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    		
				try { 
					FunctionalLibrary.navigateToRxClaimPlanAdministrator(); 
				} catch (Exception e) { 
					e.printStackTrace(); 
				}
				
				Mainframe_GlobalFunctionLib.sendText(21, 7 ,"1" );
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(21, 7 ,"2" );
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(4, 4, MemberID);
				Mainframe_GlobalFunctionLib.sendText(4, 36, CarrierID);
				Mainframe_GlobalFunctionLib.sendText(4, 47, AccountID);
				Mainframe_GlobalFunctionLib.sendText(4, 64, GroupID);
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(10, 2 ,"2" );
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.pressKey("F8"); 
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				Mainframe_GlobalFunctionLib.sendText(4, 20 ,"9" ); 
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(16, 2 ,"2" );
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.pressKey("F7");
				Thread.sleep(2000);
				Mainframe_GlobalFunctionLib.click(6, 78 );
				Mainframe_GlobalFunctionLib.sendText(6, 78 ,"f");
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				Mainframe_GlobalFunctionLib.pressKey("F12"); 
				Thread.sleep(2000);
				Mainframe_GlobalFunctionLib.click(15, 53 );
				Mainframe_GlobalFunctionLib.sendText(15, 53 ,MemComp);
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				Mainframe_GlobalFunctionLib.pressKey("F12"); 
				 //adding Drugs to Member PA
				Mainframe_GlobalFunctionLib.sendText(16, 2 ,"10" );
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				Mainframe_GlobalFunctionLib.pressKey("F6");
				Thread.sleep(2000);
				Mainframe_GlobalFunctionLib.pressKey("F16");
				Mainframe_GlobalFunctionLib.sendText(7, 4 ,ID1);
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(12, 2 ,"1" );
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				Mainframe_GlobalFunctionLib.pressKey("F12"); 
				Mainframe_GlobalFunctionLib.pressKey("F12");
				Mainframe_GlobalFunctionLib.pressKey("F6");
				Thread.sleep(2000);				
				Mainframe_GlobalFunctionLib.pressKey("F16");
				Mainframe_GlobalFunctionLib.sendText(7, 4 ,ID2);
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(12, 2 ,"1" );
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.pressKey("F12"); 
				Mainframe_GlobalFunctionLib.pressKey("F12");			
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				System.out.println("Drugs added to Member PA level");
				FunctionalLibrary.navigateToRxClaimPlanAdministrator(); // F12-6

	}
	
	@Then("^I set MemberPrioAuth \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" to allow compound \"([^\"]*)\" and I will add GPI drugs \"([^\"]*)\",\"([^\"]*)\" at member PA level$")
	public void i_set_MemberPrioAuth_to_allow_compound_and_I_will_add_GPI_drugs_at_member_PA_level(String MemberID, String CarrierID, String AccountID, String GroupID, String MemComp, String ID1, String ID2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
		try { 
			FunctionalLibrary.navigateToRxClaimPlanAdministrator(); 
		} catch (Exception e) { 
			e.printStackTrace(); 
		}
		
		Mainframe_GlobalFunctionLib.sendText(21, 7 ,"1" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(21, 7 ,"2" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(4, 4, MemberID);
		Mainframe_GlobalFunctionLib.sendText(4, 36, CarrierID);
		Mainframe_GlobalFunctionLib.sendText(4, 47, AccountID);
		Mainframe_GlobalFunctionLib.sendText(4, 64, GroupID);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(10, 2 ,"2" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F8"); 
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.sendText(4, 20 ,"9" ); 
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(16, 2 ,"2" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F7");
		Thread.sleep(2000);
		Mainframe_GlobalFunctionLib.click(6, 78 );
		Mainframe_GlobalFunctionLib.sendText(6, 78 ,"f");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("F12"); 
		Thread.sleep(2000);
		Mainframe_GlobalFunctionLib.click(15, 53 );
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.sendText(15, 53 ,MemComp);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("F12"); 
		 //adding Drugs to Member PA
		Mainframe_GlobalFunctionLib.sendText(16, 2 ,"10" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Thread.sleep(2000);
		Mainframe_GlobalFunctionLib.pressKey("F17");
		Mainframe_GlobalFunctionLib.sendText(6, 4 ,ID1);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(11, 2 ,"1" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("F12"); 
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Thread.sleep(2000);				
		Mainframe_GlobalFunctionLib.pressKey("F17");
		Mainframe_GlobalFunctionLib.sendText(6, 4 ,ID2);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(11, 2 ,"1" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F12"); 
		Mainframe_GlobalFunctionLib.pressKey("F12");			
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		System.out.println("Drugs added to Member PA level");
		FunctionalLibrary.navigateToRxClaimPlanAdministrator(); // F12-6

	}
	
	@Then("^I submit a Multi Ingredient compound claim two with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_submit_a_Multi_Ingredient_compound_claim_two_with(String BIN, String ProcCtrl, String Group, String PharmacyID, String RxNo, String Refill, String FillDate, String MemberID, String ProductID, String DspQty, String DS, String PSC, String Cost, String UCW, String compQualID_1, String ID1, String compQuantity_1, String compCost_1, String compBasisOfCost_1, String compQualID_2, String ID2, String compQuantity_2, String compCost_2, String compBasisOfCost_2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
				try { 
					FunctionalLibrary.navigateToRxClaimPlanAdministrator(); 
				} catch (Exception e) { 
					e.printStackTrace(); 
				} 
				
				Mainframe_GlobalFunctionLib.sendText(21, 7 ,"3" ); 
				Mainframe_GlobalFunctionLib.pressKey("Enter"); 
				Mainframe_GlobalFunctionLib.sendText(21, 7 ,"2" ); 
				Mainframe_GlobalFunctionLib.pressKey("Enter"); 
				Mainframe_GlobalFunctionLib.sendText(21, 7 ,"1" ); 
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				Mainframe_GlobalFunctionLib.pressKey("F6"); 
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				Mainframe_GlobalFunctionLib.sendText(11, 14,BIN ); 
				Mainframe_GlobalFunctionLib.sendText(11, 41,ProcCtrl ); 
				Mainframe_GlobalFunctionLib.sendText(11, 59,Group ); 
				Mainframe_GlobalFunctionLib.sendText(12, 14,PharmacyID ); 
				Mainframe_GlobalFunctionLib.sendText(12, 41,FunctionalLibrary.func_GenerateDynamicRxNo()); 
				Mainframe_GlobalFunctionLib.sendText(12, 59,Refill ); 
				Mainframe_GlobalFunctionLib.sendText(14, 41,MemberID ); 
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				Mainframe_GlobalFunctionLib.pressKey("Enter"); 
			
					Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
					Mainframe_GlobalFunctionLib.sendText(4 , 65 ,"          "); 
					Mainframe_GlobalFunctionLib.sendText(4, 65, FillDate);			 
					Mainframe_GlobalFunctionLib.click(7, 12 ); 
					Mainframe_GlobalFunctionLib.sendText(7, 12, MemberID); 
					Mainframe_GlobalFunctionLib.pressKey("F4"); 
					Mainframe_GlobalFunctionLib.sendText(3, 4, MemberID); 
					Mainframe_GlobalFunctionLib.pressKey("Enter");          
					Mainframe_GlobalFunctionLib.sendText(8, 2,"1" ); 
					Mainframe_GlobalFunctionLib.pressKey("Enter"); 
					Mainframe_GlobalFunctionLib.sendText(11, 20,ProductID ); 
					Mainframe_GlobalFunctionLib.sendText(12, 11,"           " ); 
					Mainframe_GlobalFunctionLib.sendText(12, 11,DspQty ); 
					Mainframe_GlobalFunctionLib.sendText(12, 26,"   " ); 
					Mainframe_GlobalFunctionLib.sendText(12, 26,DS); 
					Mainframe_GlobalFunctionLib.sendText(14, 6,PSC ); 
					Mainframe_GlobalFunctionLib.sendText(14, 14,"2" ); 
					Mainframe_GlobalFunctionLib.sendText(10, 47,"         " ); 
					Mainframe_GlobalFunctionLib.sendText(10, 47,Cost); 
					//Mainframe_GlobalFunctionLib.sendText(19, 19,prequal ); 
					//Mainframe_GlobalFunctionLib.sendText(19, 26,preid ); 
					Mainframe_GlobalFunctionLib.sendText(20, 47,"         " ); 
					Mainframe_GlobalFunctionLib.sendText(20, 47,UCW ); 
					Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
					Mainframe_GlobalFunctionLib.pressKey("F14"); 
					Mainframe_GlobalFunctionLib.sendText(5, 23,"5" ); 
					Mainframe_GlobalFunctionLib.pressKey("Enter"); 
					Mainframe_GlobalFunctionLib.pressKey("F6"); 
					Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
					Mainframe_GlobalFunctionLib.sendText(12, 20,compQualID_1 ); 
					Thread.sleep(2000);
					Mainframe_GlobalFunctionLib.click(13, 20 );
					Thread.sleep(2000);
					Mainframe_GlobalFunctionLib.pressKey("F4");
					Thread.sleep(2000);
					Mainframe_GlobalFunctionLib.pressKey("F16");
					Mainframe_GlobalFunctionLib.sendText(4, 4,ID1 );
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					Mainframe_GlobalFunctionLib.sendText(9, 2,"1" );
					Mainframe_GlobalFunctionLib.pressKey("Enter");					
					Mainframe_GlobalFunctionLib.sendText(15, 20,compQuantity_1 ); 
					Mainframe_GlobalFunctionLib.sendText(16, 20,compCost_1); 
					Mainframe_GlobalFunctionLib.sendText(18, 20,compBasisOfCost_1);
					Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
					Mainframe_GlobalFunctionLib.pressKey("Enter"); 
					Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
					Mainframe_GlobalFunctionLib.pressKey("F6"); 
					Mainframe_GlobalFunctionLib.sendText(12, 20,compQualID_2 ); 
					//Mainframe_GlobalFunctionLib.sendText(13, 20, ID2 );
					Thread.sleep(2000);
					Mainframe_GlobalFunctionLib.click(13, 20 );
					Thread.sleep(2000);
					Mainframe_GlobalFunctionLib.pressKey("F4");
					Thread.sleep(2000);
					Mainframe_GlobalFunctionLib.pressKey("F16");
					Mainframe_GlobalFunctionLib.sendText(4, 4,ID2 );
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					Mainframe_GlobalFunctionLib.sendText(9, 2,"1" );
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					Mainframe_GlobalFunctionLib.sendText(15, 20,compQuantity_2 ); 
					Mainframe_GlobalFunctionLib.sendText(16, 20,compCost_2); 
					Mainframe_GlobalFunctionLib.sendText(18, 20,compBasisOfCost_2); 
					Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
					Mainframe_GlobalFunctionLib.pressKey("Enter"); 
					Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
					Mainframe_GlobalFunctionLib.pressKey("F12"); 
					Mainframe_GlobalFunctionLib.pressKey("F12"); 
					Mainframe_GlobalFunctionLib.pressKey("F6"); 
			
	}
	
	@Then("^I validate the Claim status \"([^\"]*)\",\"([^\"]*)\"$")
	public void i_validate_the_Claim_status(String ClaimStatus2, String DrugStatus2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  			Mainframe_GlobalFunctionLib.validateText("21", "6",ClaimStatus2 );
				Mainframe_GlobalFunctionLib.pressKey("F7");
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				Mainframe_GlobalFunctionLib.pressKey("F7");
				Mainframe_GlobalFunctionLib.sendText(4, 23 ,"3" );
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.pressKey("F14");
				Mainframe_GlobalFunctionLib.sendText(4, 23 ,"5" );
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(14, 2 ,"5" );
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				Mainframe_GlobalFunctionLib.validateText("6", "30", ClaimStatus2);
				String ActClaimStatus = Mainframe_GlobalFunctionLib.getText(6, 30);
				System.out.println("Actual Claim Status: "+ActClaimStatus);
				Mainframe_GlobalFunctionLib.validateText("7", "23", DrugStatus2);
				String ActDrugStatus = Mainframe_GlobalFunctionLib.getText(7, 23);
				System.out.println("Actual Drug Status: "+ActDrugStatus);
				Mainframe_GlobalFunctionLib.pressKey("PageDown");
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				Mainframe_GlobalFunctionLib.pressKey("F12"); 
				Mainframe_GlobalFunctionLib.sendText(15, 2 ,"5" );
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				Mainframe_GlobalFunctionLib.validateText("6", "30", "P");
				Mainframe_GlobalFunctionLib.validateText("7", "23", "f");
				FunctionalLibrary.navigateToRxClaimPlanAdministrator(); // F12-10

	}
	
	@Given("^I update plan \"([^\"]*)\" with Compounds multiple ingredient NDC option \"([^\"]*)\"$")
	public void i_update_plan_with_Compounds_multiple_ingredient_NDC_option(String PlanCode, String CMIPlan) throws Throwable {
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
					Mainframe_GlobalFunctionLib.sendText(7, 21 ,"9" ); 
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					Mainframe_GlobalFunctionLib.sendText(13, 12 ,"2" ); 
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					Mainframe_GlobalFunctionLib.sendText(21, 11 ,CMIPlan);
					Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
					FunctionalLibrary.navigateToRxClaimPlanAdministrator(); // F12-6
					
	}
	
	@Given("^I update plan \"([^\"]*)\" with Compounds multiple ingredient GPI option \"([^\"]*)\"$")
	public void i_update_plan_with_Compounds_multiple_ingredient_GPI_option(String PlanCode, String CMIPlan) throws Throwable {
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
			Mainframe_GlobalFunctionLib.sendText(7, 21 ,"9" ); 
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(13, 12 ,"2" ); 
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(21, 24 ,CMIPlan);
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

	@When("^I create the GPI list with \"([^\"]*)\", \"([^\"]*)\"$")
	public void i_create_the_GPI_list_with(String GPIList, String GPIDecs) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
			try { 
				FunctionalLibrary.navigateToRxClaimPlanAdministrator(); 
			} catch (Exception e) { 
				e.printStackTrace(); 
			}
			
			Mainframe_GlobalFunctionLib.sendText(21, 7 ,"4" ); 
			Mainframe_GlobalFunctionLib.pressKey("Enter"); 
			Mainframe_GlobalFunctionLib.sendText(21, 7 ,"2" ); 
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(21, 7 ,"1" ); 
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.pressKey("F6");
			Thread.sleep(3000);
			Mainframe_GlobalFunctionLib.sendText(5, 18 ,GPIList);
			Mainframe_GlobalFunctionLib.sendText(5, 30 ,GPIDecs);
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Thread.sleep(1000);
			Mainframe_GlobalFunctionLib.sendText(16, 64 ,"Y");
			Mainframe_GlobalFunctionLib.pressKey("F12");
			Mainframe_GlobalFunctionLib.pressKey("F12");
			Mainframe_GlobalFunctionLib.pressKey("F12");			
		
	}
	
	@Given("^I add product IDs \"([^\"]*)\", \"([^\"]*)\" to the Plan \"([^\"]*)\" GPI list \"([^\"]*)\" with status \"([^\"]*)\" ,\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_add_product_IDs_to_the_Plan_GPI_list_with_status(String ID1, String ID2, String PlanCode, String GPIList, String Status1, String Status2,String PFromdate, String PThrudate, String Qtymin, String Qtymax) throws Throwable {
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
				Thread.sleep(1000);
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
				Mainframe_GlobalFunctionLib.sendText(6, 4 ,ID1);
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(11, 2 ,"1" );
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(6, 57 ,"        ");
				Mainframe_GlobalFunctionLib.sendText(6, 57 ,PFromdate);
				Mainframe_GlobalFunctionLib.sendText(6, 67 ,"        ");
				Mainframe_GlobalFunctionLib.sendText(6, 67 ,PThrudate);
				Mainframe_GlobalFunctionLib.click(6, 78 );
				Mainframe_GlobalFunctionLib.sendText(6, 78 ,Status1);
				Mainframe_GlobalFunctionLib.sendText(9, 20 ,Qtymin);
				Mainframe_GlobalFunctionLib.sendText(9, 33 ,Qtymax);
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				Mainframe_GlobalFunctionLib.pressKey("F12");
				Mainframe_GlobalFunctionLib.pressKey("F12");
				Mainframe_GlobalFunctionLib.pressKey("F12");
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				Thread.sleep(2000);
				//Second product Id adding to GPI list
				Mainframe_GlobalFunctionLib.pressKey("F6");
				Thread.sleep(2000);
				Mainframe_GlobalFunctionLib.pressKey("F17");
				Thread.sleep(2000);
				Mainframe_GlobalFunctionLib.sendText(6, 4 ,ID2);
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(11, 2 ,"1" );
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(6, 57 ,"        ");
				Mainframe_GlobalFunctionLib.sendText(6, 57 ,PFromdate);
				Mainframe_GlobalFunctionLib.sendText(6, 67 ,PThrudate);
				Thread.sleep(2000);
				Mainframe_GlobalFunctionLib.click(6, 78 );
				Mainframe_GlobalFunctionLib.sendText(6, 78 ,Status2);
				Mainframe_GlobalFunctionLib.sendText(9, 20 ,Qtymin);
				Mainframe_GlobalFunctionLib.sendText(9, 33 ,Qtymax);
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				Mainframe_GlobalFunctionLib.pressKey("F12");
				Mainframe_GlobalFunctionLib.pressKey("F12");
				Mainframe_GlobalFunctionLib.pressKey("F12");
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				FunctionalLibrary.navigateToRxClaimPlanAdministrator(); // F12-6
	
	}
	
	@Then("^I validate the status for Claim \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_validate_the_status_for_Claim(String ClaimStatus, String DrugStatus, String RejectCode, String RejectMessage) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.validateText("21", "6",ClaimStatus );
		Mainframe_GlobalFunctionLib.pressKey("F7");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("F7");
		Mainframe_GlobalFunctionLib.sendText(4, 23 ,"3" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F14");
		Mainframe_GlobalFunctionLib.sendText(4, 23 ,"5" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(14, 2 ,"5" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.validateText("6", "37", ClaimStatus);
		String ActClaimStatus = Mainframe_GlobalFunctionLib.getText(6, 37);
		System.out.println("Actual Claim Status: "+ActClaimStatus);
		
		Mainframe_GlobalFunctionLib.validateText("7", "26", DrugStatus);
		String ActDrugStatus = Mainframe_GlobalFunctionLib.getText(7, 26);
		System.out.println("Actual Drug Status: "+ActDrugStatus);
		
		Mainframe_GlobalFunctionLib.validateText("18", "2", RejectCode);
		String ActRejCode = Mainframe_GlobalFunctionLib.getText(18, 2);
		System.out.println("Actual Rejected Code: "+ActRejCode);
		
		Mainframe_GlobalFunctionLib.validateText("18", "7", RejectMessage);
		String ActRejMessage = Mainframe_GlobalFunctionLib.getText(18, 7);
		System.out.println("Actual Rejected Code Message: "+ActRejMessage);
				
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.sendText(15, 2 ,"5" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.validateText("6", "30", ClaimStatus);
		Mainframe_GlobalFunctionLib.validateText("7", "23", "F");
		FunctionalLibrary.navigateToRxClaimPlanAdministrator(); // F12-10
	   
	}
	
	@Given("^I update the product ID`s \"([^\"]*)\", \"([^\"]*)\" to the Plan \"([^\"]*)\" GPI list \"([^\"]*)\" with \"([^\"]*)\",\"([^\"]*)\"$")
	public void i_update_the_product_ID_s_to_the_Plan_GPI_list_with(String GPINo1, String GPINo2, String PlanCode, String GPIList, String DSmin, String DSmax) throws Throwable {
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
				Thread.sleep(3000);
				Mainframe_GlobalFunctionLib.pressKey("F16");
				Mainframe_GlobalFunctionLib.sendText(6, 4 ,GPINo1);
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(12, 2 ,"2" );
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(9, 20 ,"            ");
				Mainframe_GlobalFunctionLib.sendText(9, 33 ,"            ");
				Mainframe_GlobalFunctionLib.sendText(10, 20 ,DSmin);
				Mainframe_GlobalFunctionLib.sendText(10, 33 ,DSmax);
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				Mainframe_GlobalFunctionLib.pressKey("F12");
				Mainframe_GlobalFunctionLib.pressKey("F12");
				Thread.sleep(2000);
				Mainframe_GlobalFunctionLib.pressKey("F16");
				Mainframe_GlobalFunctionLib.sendText(6, 4 ,GPINo2);
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(12, 2 ,"2" );
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(9, 20 ,"            ");
				Mainframe_GlobalFunctionLib.sendText(9, 33 ,"            ");
				Mainframe_GlobalFunctionLib.sendText(10, 20 ,DSmin);
				Mainframe_GlobalFunctionLib.sendText(10, 33 ,DSmax);
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());			
				FunctionalLibrary.navigateToRxClaimPlanAdministrator(); // F12-7			

	}
	
	@Given("^I update the product ID`s \"([^\"]*)\", \"([^\"]*)\" to the Plan \"([^\"]*)\" GPI list \"([^\"]*)\" with age limits \"([^\"]*)\",\"([^\"]*)\"$")
	public void i_update_the_product_ID_s_to_the_Plan_GPI_list_with_age_limits(String GPINo1, String GPINo2, String PlanCode, String GPIList, String Agemin, String Agemax) throws Throwable {
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
				Thread.sleep(2000);
				Mainframe_GlobalFunctionLib.pressKey("F16");
				Mainframe_GlobalFunctionLib.sendText(6, 4 ,GPINo1);
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(12, 2 ,"2" );
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(9, 20 ,"            ");
				Mainframe_GlobalFunctionLib.sendText(9, 33 ,"            ");
				Mainframe_GlobalFunctionLib.sendText(10, 20 ,"   ");
				Mainframe_GlobalFunctionLib.sendText(10, 33 ,"   ");
				Thread.sleep(1000);
				Mainframe_GlobalFunctionLib.click(12, 16 );
				Mainframe_GlobalFunctionLib.sendText(12, 16 ,"S");
				Thread.sleep(2000);
				Mainframe_GlobalFunctionLib.click(12, 18 );
				Mainframe_GlobalFunctionLib.sendText(12, 18 ,"Y");
				Mainframe_GlobalFunctionLib.sendText(12, 20 ,Agemin);
				Thread.sleep(2000);
				Mainframe_GlobalFunctionLib.click(12, 24 );
				Mainframe_GlobalFunctionLib.sendText(12, 24 ,"Y");
				Mainframe_GlobalFunctionLib.sendText(12, 33 ,Agemax);
				Thread.sleep(2000);
				Mainframe_GlobalFunctionLib.click(12, 37 );
				Mainframe_GlobalFunctionLib.sendText(12, 37 ,"Y");
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				Mainframe_GlobalFunctionLib.pressKey("F12");
				Mainframe_GlobalFunctionLib.pressKey("F12");
				Thread.sleep(3000);
				Mainframe_GlobalFunctionLib.pressKey("F16");
				Mainframe_GlobalFunctionLib.sendText(6, 4 ,GPINo2);
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(12, 2 ,"2" );
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(9, 20 ,"            ");
				Mainframe_GlobalFunctionLib.sendText(9, 33 ,"            ");
				Mainframe_GlobalFunctionLib.sendText(10, 20 ,"   ");
				Mainframe_GlobalFunctionLib.sendText(10, 33 ,"   ");
				Thread.sleep(1000);
				Mainframe_GlobalFunctionLib.click(12, 16 );
				Mainframe_GlobalFunctionLib.sendText(12, 16 ,"S");
				Thread.sleep(2000);
				Mainframe_GlobalFunctionLib.click(12, 18 );
				Mainframe_GlobalFunctionLib.sendText(12, 18 ,"Y");
				Mainframe_GlobalFunctionLib.sendText(12, 20 ,Agemin);
				Thread.sleep(2000);
				Mainframe_GlobalFunctionLib.click(12, 24 );
				Mainframe_GlobalFunctionLib.sendText(12, 24 ,"Y");
				Mainframe_GlobalFunctionLib.sendText(12, 33 ,Agemax);
				Thread.sleep(2000);
				Mainframe_GlobalFunctionLib.click(12, 37 );
				Mainframe_GlobalFunctionLib.sendText(12, 37 ,"Y");
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());			
				FunctionalLibrary.navigateToRxClaimPlanAdministrator(); // F12-7

	}
	
	@When("^I create the NDC list with \"([^\"]*)\", \"([^\"]*)\"$")
	public void i_create_the_NDC_list_with(String NDCList, String NDCDecs) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
			try { 
				FunctionalLibrary.navigateToRxClaimPlanAdministrator(); 
			} catch (Exception e) { 
				e.printStackTrace(); 
			}
			
			Mainframe_GlobalFunctionLib.sendText(21, 7 ,"4" ); 
			Mainframe_GlobalFunctionLib.pressKey("Enter"); 
			Mainframe_GlobalFunctionLib.sendText(21, 7 ,"2" ); 
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(21, 7 ,"2" ); 
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.pressKey("F6");
			Mainframe_GlobalFunctionLib.sendText(5, 18 ,NDCList);
			Mainframe_GlobalFunctionLib.sendText(5, 30 ,NDCDecs);
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(16, 64 ,"Y");
			Mainframe_GlobalFunctionLib.pressKey("F12");
			Mainframe_GlobalFunctionLib.pressKey("F12");
			Mainframe_GlobalFunctionLib.pressKey("F12");
		
	}
	
	@When("^I setup a plan With NDC list \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_setup_a_plan_With_NDC_list(String plancode, String ndclist, String ndcsq, String ndcfromdate, String ndcthrudate) throws Throwable {
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
				//adding
				Mainframe_GlobalFunctionLib.sendText(15, 24 ,"Y" ); 
				Mainframe_GlobalFunctionLib.pressKey("Enter"); 
				Mainframe_GlobalFunctionLib.sendText(16, 64 ,"Y" ); 
				Mainframe_GlobalFunctionLib.pressKey("F7"); 
				Mainframe_GlobalFunctionLib.sendText(7, 21 ,"10" ); 
				Mainframe_GlobalFunctionLib.pressKey("Enter"); 
							
					Mainframe_GlobalFunctionLib.pressKey("F6"); 
					Thread.sleep(3000);
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
	
	@Given("^I add product IDs \"([^\"]*)\", \"([^\"]*)\" to the Plan \"([^\"]*)\" NDC list \"([^\"]*)\" with status \"([^\"]*)\" ,\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_add_product_IDs_to_the_Plan_NDC_list_with_status(String ID1, String ID2, String PlanCode, String NDCList, String Status1, String Status2,String PFromdate, String PThrudate, String Qtymin, String Qtymax) throws Throwable {
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
				Mainframe_GlobalFunctionLib.sendText(6, 57 ,"        ");
				Mainframe_GlobalFunctionLib.sendText(6, 57 ,PFromdate);
				Mainframe_GlobalFunctionLib.sendText(6, 67 ,"        ");
				Mainframe_GlobalFunctionLib.sendText(6, 67 ,PThrudate);
				Thread.sleep(2000);
				Mainframe_GlobalFunctionLib.click(6, 78 );
				Mainframe_GlobalFunctionLib.sendText(6, 78 ,Status1);
				Mainframe_GlobalFunctionLib.sendText(9, 20 ,Qtymin);
				Mainframe_GlobalFunctionLib.sendText(9, 33 ,Qtymax);
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				Mainframe_GlobalFunctionLib.pressKey("F12");
				Mainframe_GlobalFunctionLib.pressKey("F12");
				Mainframe_GlobalFunctionLib.pressKey("F12");
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());

				//Second product Id adding to GPI list
				Mainframe_GlobalFunctionLib.pressKey("F6");
				Thread.sleep(3000);
				Mainframe_GlobalFunctionLib.pressKey("F16");
				Mainframe_GlobalFunctionLib.sendText(7, 4 ,ID2);
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(12, 2 ,"1" );
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(6, 57 ,"        ");
				Mainframe_GlobalFunctionLib.sendText(6, 57 ,PFromdate);
				Mainframe_GlobalFunctionLib.sendText(6, 67 ,PThrudate);
				Thread.sleep(2000);
				Mainframe_GlobalFunctionLib.click(6, 78 );
				Mainframe_GlobalFunctionLib.sendText(6, 78 ,Status2);
				Mainframe_GlobalFunctionLib.sendText(9, 20 ,Qtymin);
				Mainframe_GlobalFunctionLib.sendText(9, 33 ,Qtymax);
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				Mainframe_GlobalFunctionLib.pressKey("F12");
				Mainframe_GlobalFunctionLib.pressKey("F12");
				Mainframe_GlobalFunctionLib.pressKey("F12");
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				FunctionalLibrary.navigateToRxClaimPlanAdministrator(); // F12-6

	}
	
	@Given("^I update the product ID`s \"([^\"]*)\", \"([^\"]*)\" to the Plan \"([^\"]*)\" NDC list \"([^\"]*)\" with \"([^\"]*)\",\"([^\"]*)\"$")
	public void i_update_the_product_ID_s_to_the_Plan_NDC_list_with(String ID1, String ID2, String PlanCode, String NDCList, String DSmin, String DSmax) throws Throwable {
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
				Thread.sleep(3000);
				//First product update
				Mainframe_GlobalFunctionLib.pressKey("F16");
				Mainframe_GlobalFunctionLib.sendText(6, 4 ,ID1);
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(11, 2 ,"2" );
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(9, 20 ,"            ");
				Mainframe_GlobalFunctionLib.sendText(9, 33 ,"            ");
				Mainframe_GlobalFunctionLib.sendText(10, 20 ,DSmin);
				Mainframe_GlobalFunctionLib.sendText(10, 33 ,DSmax);
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				Mainframe_GlobalFunctionLib.pressKey("F12");
				Mainframe_GlobalFunctionLib.pressKey("F12");
				Mainframe_GlobalFunctionLib.pressKey("F16");
				Mainframe_GlobalFunctionLib.sendText(6, 4 ,ID2);
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(11, 2 ,"2" );
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(9, 20 ,"            ");
				Mainframe_GlobalFunctionLib.sendText(9, 33 ,"            ");
				Mainframe_GlobalFunctionLib.sendText(10, 20 ,DSmin);
				Mainframe_GlobalFunctionLib.sendText(10, 33 ,DSmax);
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				Mainframe_GlobalFunctionLib.pressKey("F12");
				Mainframe_GlobalFunctionLib.pressKey("F12");
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				FunctionalLibrary.navigateToRxClaimPlanAdministrator(); // F12-6				
		
	}
	
	@Given("^I update the product ID`s \"([^\"]*)\", \"([^\"]*)\" to the Plan \"([^\"]*)\" NDC list \"([^\"]*)\" with age limits \"([^\"]*)\",\"([^\"]*)\"$")
	public void i_update_the_product_ID_s_to_the_Plan_NDC_list_with_age_limits(String ID1, String ID2, String PlanCode, String NDCList, String Agemin, String Agemax) throws Throwable {
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
				Thread.sleep(3000);
				//First product update
				Mainframe_GlobalFunctionLib.pressKey("F16");
				Mainframe_GlobalFunctionLib.sendText(6, 4 ,ID1);
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(11, 2 ,"2" );
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(9, 20 ,"            ");
				Mainframe_GlobalFunctionLib.sendText(9, 33 ,"            ");
				Mainframe_GlobalFunctionLib.sendText(10, 20 ,"   ");
				Mainframe_GlobalFunctionLib.sendText(10, 33 ,"   ");
				Thread.sleep(2000);
				Mainframe_GlobalFunctionLib.click(12, 16 );
				Mainframe_GlobalFunctionLib.sendText(12, 16 ,"S");
				Thread.sleep(2000);
				Mainframe_GlobalFunctionLib.click(12, 18 );
				Mainframe_GlobalFunctionLib.sendText(12, 18 ,"Y");
				Mainframe_GlobalFunctionLib.sendText(12, 20 ,Agemin);
				Thread.sleep(2000);
				Mainframe_GlobalFunctionLib.click(12, 24 );
				Mainframe_GlobalFunctionLib.sendText(12, 24 ,"Y");
				Mainframe_GlobalFunctionLib.sendText(12, 33 ,Agemax);
				Thread.sleep(2000);
				Mainframe_GlobalFunctionLib.click(12, 37 );
				Mainframe_GlobalFunctionLib.sendText(12, 37 ,"Y");		
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				Mainframe_GlobalFunctionLib.pressKey("F12");
				Mainframe_GlobalFunctionLib.pressKey("F12");
				Mainframe_GlobalFunctionLib.pressKey("F16");
				Mainframe_GlobalFunctionLib.sendText(6, 4 ,ID2);
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(11, 2 ,"2" );
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(9, 20 ,"            ");
				Mainframe_GlobalFunctionLib.sendText(9, 33 ,"            ");
				Mainframe_GlobalFunctionLib.sendText(10, 20 ,"   ");
				Mainframe_GlobalFunctionLib.sendText(10, 33 ,"   ");
				Thread.sleep(2000);
				Mainframe_GlobalFunctionLib.click(12, 16 );
				Mainframe_GlobalFunctionLib.sendText(12, 16 ,"S");
				Thread.sleep(2000);
				Mainframe_GlobalFunctionLib.click(12, 18 );
				Mainframe_GlobalFunctionLib.sendText(12, 18 ,"Y");
				Mainframe_GlobalFunctionLib.sendText(12, 20 ,Agemin);
				Thread.sleep(2000);
				Mainframe_GlobalFunctionLib.click(12, 24 );
				Mainframe_GlobalFunctionLib.sendText(12, 24 ,"Y");
				Mainframe_GlobalFunctionLib.sendText(12, 33 ,Agemax);
				Thread.sleep(2000);
				Mainframe_GlobalFunctionLib.click(12, 37 );
				Mainframe_GlobalFunctionLib.sendText(12, 37 ,"Y");
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				Mainframe_GlobalFunctionLib.pressKey("F12");
				Mainframe_GlobalFunctionLib.pressKey("F12");
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				FunctionalLibrary.navigateToRxClaimPlanAdministrator(); // F12-6				

	}
	
	@Then("^I validate the status for the claim \"([^\"]*)\",\"([^\"]*)\"$")
	public void i_validate_the_status_for_the_claim(String ClaimStatus, String DrugStatus) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.validateText("21", "6",ClaimStatus );
		Mainframe_GlobalFunctionLib.pressKey("F7");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("F7");
		Mainframe_GlobalFunctionLib.sendText(4, 23 ,"3" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F14");
		Mainframe_GlobalFunctionLib.sendText(4, 23 ,"5" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(14, 2 ,"5" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.validateText("6", "30", ClaimStatus);
		String ActClaimStatus = Mainframe_GlobalFunctionLib.getText(6, 30);
		System.out.println("Actual Claim Status: "+ActClaimStatus);
		Mainframe_GlobalFunctionLib.validateText("7", "23", DrugStatus);
		String ActDrugStatus = Mainframe_GlobalFunctionLib.getText(7, 23);
		System.out.println("Actual Drug Status: "+ActDrugStatus);
		Mainframe_GlobalFunctionLib.pressKey("PageDown");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("F12"); 
		Mainframe_GlobalFunctionLib.sendText(15, 2 ,"5" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.validateText("6", "30", "P");
		Mainframe_GlobalFunctionLib.validateText("7", "23", "F");
		FunctionalLibrary.navigateToRxClaimPlanAdministrator(); // F12-10

	}

	@Given("^I check the drug status in the plan \"([^\"]*)\"$")
	public void i_check_the_drug_status_in_the_plan(String PlanCode) throws Throwable {
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
			Mainframe_GlobalFunctionLib.sendText(11, 2 ,"5" ); 
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.pressKey("F7");
			Thread.sleep(2000);
			Mainframe_GlobalFunctionLib.sendText(7, 21 ,"10" ); 
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(11, 2 ,"7" ); 
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());

			String Dstatus1= Mainframe_GlobalFunctionLib.getText(11, 58);
			if(Dstatus1.equals("R"))
			{
				System.out.println("Drug Status R present in NDC list: "+Dstatus1);
			}
			else
			{
				System.out.println("Drug Status R Not exist: "+Dstatus1);
			}
			
			String Dstatus2= Mainframe_GlobalFunctionLib.getText(12, 58);
			if(Dstatus2.equals("R"))
			{
				System.out.println("Drug Status R present in NDC list: "+Dstatus2);
			}
			else
			{
				System.out.println("Drug Status R Not exist: "+Dstatus2);
			}
			FunctionalLibrary.navigateToRxClaimPlanAdministrator(); // F12-6
		
	}
	
	@Given("^I check the NDC drug status in the plan \"([^\"]*)\"$")
	public void i_check_the_NDC_drug_status_in_the_plan(String PlanCode) throws Throwable {
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
			Mainframe_GlobalFunctionLib.sendText(11, 2 ,"5" ); 
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.pressKey("F7");
			Thread.sleep(2000);
			Mainframe_GlobalFunctionLib.sendText(7, 21 ,"10" ); 
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(11, 2 ,"7" ); 
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.validateText("11", "61", "F");
			Mainframe_GlobalFunctionLib.validateText("12", "61", "R");
			FunctionalLibrary.navigateToRxClaimPlanAdministrator(); // F12-6
	   
	}
	
	@Given("^I update product IDs \"([^\"]*)\", \"([^\"]*)\" to the Plan \"([^\"]*)\" NDC list \"([^\"]*)\" with status and messages \"([^\"]*)\" ,\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_update_product_IDs_to_the_Plan_NDC_list_with_status_and_messages(String ID1, String ID2, String PlanCode, String NDCList, String Status1, String Status2,String PFromdate, String PThrudate, String msg1, String msg2) throws Throwable {
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
				Thread.sleep(3000);
				//First product Id updating
				Mainframe_GlobalFunctionLib.pressKey("F16");
				Mainframe_GlobalFunctionLib.sendText(6, 4 ,ID1);
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				Mainframe_GlobalFunctionLib.sendText(11, 2 ,"2" );
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(6, 57 ,"        ");
				Mainframe_GlobalFunctionLib.sendText(6, 57 ,PFromdate);
				Mainframe_GlobalFunctionLib.sendText(6, 67 ,"        ");
				Mainframe_GlobalFunctionLib.sendText(6, 67 ,PThrudate);
				Thread.sleep(2000);
				Mainframe_GlobalFunctionLib.click(6, 78 );
				Mainframe_GlobalFunctionLib.sendText(6, 78 ,Status1);
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				Thread.sleep(2000);
				Mainframe_GlobalFunctionLib.pressKey("F21");
				Thread.sleep(2000);
				Mainframe_GlobalFunctionLib.pressKey("F6");
				Mainframe_GlobalFunctionLib.sendText(9, 25 ,PFromdate);
				Mainframe_GlobalFunctionLib.sendText(10, 25 ,PThrudate);
				Mainframe_GlobalFunctionLib.sendText(12, 25 ,msg1);
				Mainframe_GlobalFunctionLib.sendText(13, 25 ,"P");
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				Mainframe_GlobalFunctionLib.pressKey("F12"); 
				Mainframe_GlobalFunctionLib.pressKey("F12");
				Mainframe_GlobalFunctionLib.pressKey("F12");
				Mainframe_GlobalFunctionLib.pressKey("F12");
				Mainframe_GlobalFunctionLib.sendText(11, 2 ,"7" );
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Thread.sleep(2000);
				Mainframe_GlobalFunctionLib.pressKey("F16");
				Mainframe_GlobalFunctionLib.sendText(6, 4 ,ID2);
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				Mainframe_GlobalFunctionLib.sendText(11, 2 ,"2" );
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(6, 57 ,"        ");
				Mainframe_GlobalFunctionLib.sendText(6, 57 ,PFromdate);
				Mainframe_GlobalFunctionLib.sendText(6, 67 ,"        ");
				Mainframe_GlobalFunctionLib.sendText(6, 67 ,PThrudate);
				Thread.sleep(2000);
				Mainframe_GlobalFunctionLib.click(6, 78 );
				Mainframe_GlobalFunctionLib.sendText(6, 78 ,Status2);
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.pressKey("F21");
				Thread.sleep(2000);
				Mainframe_GlobalFunctionLib.pressKey("F6");
				Mainframe_GlobalFunctionLib.sendText(9, 25 ,PFromdate);
				Mainframe_GlobalFunctionLib.sendText(10, 25 ,PThrudate);
				Mainframe_GlobalFunctionLib.sendText(12, 25 ,msg2);
				Mainframe_GlobalFunctionLib.sendText(13, 25 ,"P");
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				Mainframe_GlobalFunctionLib.pressKey("F12"); 
				Mainframe_GlobalFunctionLib.pressKey("F12");
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				FunctionalLibrary.navigateToRxClaimPlanAdministrator(); // F12-6

	}
	
	@Then("^I validate the status for the claim \"([^\"]*)\",\"([^\"]*)\" and message \"([^\"]*)\" and \"([^\"]*)\"should appear$")
	public void i_validate_the_status_for_the_claim_and_message_and_should_appear(String ClaimStatus, String DrugStatus, String ID1msg, String ID2msg) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.validateText("21", "6",ClaimStatus );
		Mainframe_GlobalFunctionLib.pressKey("F7");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("F7");
		Mainframe_GlobalFunctionLib.sendText(4, 23 ,"3" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F14");
		Mainframe_GlobalFunctionLib.sendText(4, 23 ,"5" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		for (int i = 14; i < 16; ++i) {
			
			String ID1No= Mainframe_GlobalFunctionLib.getText(i, 16);
		//String ID1No = Mainframe_GlobalFunctionLib.getText(14, 16);
	    Thread.sleep(2000);
	    	if(ID1No.equals("88512606010"))
	    	{
	    		Mainframe_GlobalFunctionLib.sendText(i, 2 ,"5" );
	    		Mainframe_GlobalFunctionLib.pressKey("Enter");
	    		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	    		Mainframe_GlobalFunctionLib.validateText("6", "30", ClaimStatus);
	    		String ActClaimStatus = Mainframe_GlobalFunctionLib.getText(6, 30);
	    		System.out.println("Actual Claim Status: "+ActClaimStatus);
	    		
	    		Mainframe_GlobalFunctionLib.validateText("7", "23", DrugStatus);
	    		String ActDrugStatus = Mainframe_GlobalFunctionLib.getText(7, 23);
	    		System.out.println("Actual Drug Status: "+ActDrugStatus);
	    		
	    		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	    		
	    		String ActID1msg = Mainframe_GlobalFunctionLib.getText(12, 40).trim();
	    		
			    		if(ActID1msg.equals(ID1msg))
			    		{
			    			System.out.println("Text matching");
			    			System.out.println("NDC drug message appearing: "+ActID1msg);
			    		}
			    		else
			    		{
			    			System.out.println("Text is not same");
							Assert.fail("The text "+ ID1msg +" does not match on the screen.Screenshot captured.");
			    		}
			    		Mainframe_GlobalFunctionLib.pressKey("F12");
	    	}
	    	
	    	else if(ID1No.equals("88512705010"))
	    	{
	    		Mainframe_GlobalFunctionLib.sendText(i, 2 ,"5" );
	    		Mainframe_GlobalFunctionLib.pressKey("Enter");
	    		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	    		Mainframe_GlobalFunctionLib.validateText("6", "30", ClaimStatus);
	    		String ActClaimStatus = Mainframe_GlobalFunctionLib.getText(6, 30);
	    		System.out.println("Actual Claim Status: "+ActClaimStatus);
	    		
	    		Mainframe_GlobalFunctionLib.validateText("7", "23", DrugStatus);
	    		String ActDrugStatus = Mainframe_GlobalFunctionLib.getText(7, 23);
	    		System.out.println("Actual Drug Status: "+ActDrugStatus);
	    		
	    		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	    		
	    		String ActID2msg = Mainframe_GlobalFunctionLib.getText(12, 40).trim();
	    		
			    		if(ActID2msg.equals(ID2msg))
			    		{
			    			System.out.println("Text matching");
			    			System.out.println("NDC drug message appearing: "+ActID2msg);
			    		}
			    		else
			    		{
			    			System.out.println("Text is not same");
							Assert.fail("The text "+ ID2msg +" does not match on the screen.Screenshot captured.");
			    		}
			    		Mainframe_GlobalFunctionLib.pressKey("F12");
	    	}
	    	else
	    	{
	    		System.out.println("Drug not found: ");	
	    		Assert.fail("Drug not found");
	    	}
	    	
		}		
		FunctionalLibrary.navigateToRxClaimPlanAdministrator(); // F12-8
		    
	}

	@Then("^I validate the Claim status \"([^\"]*)\",\"([^\"]*)\" and messages should not appear$")
	public void i_validate_the_Claim_status_and_messages_should_not_appear(String ClaimStatus2, String DrugStatus2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.validateText("21", "6",ClaimStatus2 );
		Mainframe_GlobalFunctionLib.pressKey("F7");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("F7");
		Mainframe_GlobalFunctionLib.sendText(4, 23 ,"3" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F14");
		Mainframe_GlobalFunctionLib.sendText(4, 23 ,"5" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		
			for (int i = 14; i < 16; ++i) {
						
						String ID1No= Mainframe_GlobalFunctionLib.getText(i, 16);
					//String ID1No = Mainframe_GlobalFunctionLib.getText(14, 16);
				    Thread.sleep(2000);
				    	if(ID1No.equals("88512606010"))
				    	{
				    		Mainframe_GlobalFunctionLib.sendText(i, 2 ,"5" );
				    		Mainframe_GlobalFunctionLib.pressKey("Enter");
				    		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				    		Mainframe_GlobalFunctionLib.validateText("6", "30", ClaimStatus2);
				    		String ActClaimStatus = Mainframe_GlobalFunctionLib.getText(6, 30);
				    		System.out.println("Actual Claim Status: "+ActClaimStatus);
				    		Mainframe_GlobalFunctionLib.validateText("7", "23", DrugStatus2);
				    		String ActDrugStatus = Mainframe_GlobalFunctionLib.getText(7, 23);
				    		System.out.println("Actual Drug Status: "+ActDrugStatus);
				    		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				    		String ActID3msg = Mainframe_GlobalFunctionLib.getText(12, 40).trim();
				    				
							    		int len = ActID3msg.length();
							    		System.out.println("length of actual message : "+len);
							    		if(len==0)
							    		{
							    			System.out.println("Message is not appearing for the drug");
							    		}
							    		else
							    		{
							    			System.out.println("Message is appearing for the drug");
							    			Assert.fail("Message is appearing for the drug");
							    		}   		
							    		Mainframe_GlobalFunctionLib.pressKey("F12"); 
				    		
				    	}
				    	
				    	else if(ID1No.equals("88512705010"))
				    	{
				    		Mainframe_GlobalFunctionLib.sendText(i, 2 ,"5" );
				    		Mainframe_GlobalFunctionLib.pressKey("Enter");
				    		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				    		Mainframe_GlobalFunctionLib.validateText("6", "30", ClaimStatus2);
				    		String ActClaimStatus = Mainframe_GlobalFunctionLib.getText(6, 30);
				    		System.out.println("Actual Claim Status: "+ActClaimStatus);
				    		
				    		Mainframe_GlobalFunctionLib.validateText("7", "23", DrugStatus2);
				    		String ActDrugStatus = Mainframe_GlobalFunctionLib.getText(7, 23);
				    		System.out.println("Actual Drug Status: "+ActDrugStatus);
				    		
				    		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				    		
				    		String ActID4msg = Mainframe_GlobalFunctionLib.getText(12, 40).trim();
							
				    		int len2 = ActID4msg.length();
				    		System.out.println("length of actual message : "+len2);
				    		if(len2==0)
				    		{
				    			System.out.println("Message is not appearing for the drug");
				    		}
				    		else
				    		{
				    			System.out.println("Message is appearing for the drug");
				    			Assert.fail("Message is appearing for the drug");
				    		}   
				    	
				    	}
				    	else
				    	{
				    		System.out.println("Drug not found: ");	
				    		Assert.fail("Drug not found");
				    	}
				    	
					}		
			FunctionalLibrary.navigateToRxClaimPlanAdministrator(); // F12-10

	}
	
	@Given("^I navigate to claim screen$")
	public void i_navigate_to_claim_screen() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		Mainframe_GlobalFunctionLib.sendText(21, 7 ,"1" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(21, 7 ,"6" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F8");
		Mainframe_GlobalFunctionLib.sendText(4, 4 ,"182552713492000" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(10, 2 ,"5" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
	}
	
	@Given("^I check the GPI drug status in the plan \"([^\"]*)\"$")
	public void i_check_the_GPI_drug_status_in_the_plan(String PlanCode) throws Throwable {
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
			Mainframe_GlobalFunctionLib.sendText(11, 2 ,"5" ); 
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.pressKey("F7");
			Thread.sleep(2000);
			Mainframe_GlobalFunctionLib.sendText(7, 21 ,"11" ); 
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(11, 2 ,"7" ); 
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());

			String Dstatus3= Mainframe_GlobalFunctionLib.getText(11, 61);
			if(Dstatus3.equals("R"))
			{
				System.out.println("Drug Status R present in NDC list: "+Dstatus3);
			}
			else
			{
				System.out.println("Drug Status R Not exist: "+Dstatus3);
			}
			
			String Dstatus4= Mainframe_GlobalFunctionLib.getText(12, 61);
			if(Dstatus4.equals("R"))
			{
				System.out.println("Drug Status R present in NDC list: "+Dstatus4);
			}
			else
			{
				System.out.println("Drug Status R Not exist: "+Dstatus4);
			}
			FunctionalLibrary.navigateToRxClaimPlanAdministrator(); // F12-6

	}
}

