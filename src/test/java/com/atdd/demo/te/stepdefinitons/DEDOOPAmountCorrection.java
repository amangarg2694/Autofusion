package com.atdd.demo.te.stepdefinitons;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import com.atdd.te.screenHelpers.FunctionalLibrary;
import com.cucumber.listener.Reporter;
import com.optumrx.autofusion.core.te.util.Mainframe_GlobalFunctionLib;
import com.optumrx.autofusion.core.te.util.Screenshot;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DEDOOPAmountCorrection {
	
	@Then("^I create Deductible and OOP schedule with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_create_Deductible_and_OOP_schedule_with(String Schedule, String ScheduleDesc, String Basis, String StepNo, String DedCompCode, String OOPCompCode, String Ind, String MaxInd, String BrandCopay, String GenericCopay, String PercentBasis) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		//Deductible Schedule
				FunctionalLibrary.navigateToScreen("1");
				Mainframe_GlobalFunctionLib.pressKey("F6");
				Mainframe_GlobalFunctionLib.sendText(5, 14,Schedule );
				Mainframe_GlobalFunctionLib.sendText(5, 28,ScheduleDesc );
				Mainframe_GlobalFunctionLib.sendText(7, 14,Basis );
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(4, 5,Schedule );
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(10,2,"7" );
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.pressKey("F6");
				Mainframe_GlobalFunctionLib.sendText(9,14,StepNo );
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(8,24,DedCompCode );
				Mainframe_GlobalFunctionLib.sendText(10,24,Ind );
				Mainframe_GlobalFunctionLib.sendText(12,24,"N" );
				Mainframe_GlobalFunctionLib.sendText(14,26,BrandCopay );
				Mainframe_GlobalFunctionLib.sendText(14,46,GenericCopay );
				Mainframe_GlobalFunctionLib.sendText(15,24,PercentBasis );
				Mainframe_GlobalFunctionLib.sendText(16,24,"D" );
				Mainframe_GlobalFunctionLib.sendText(20,24,"Y" );
				Mainframe_GlobalFunctionLib.sendText(20,68,"N" );
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				
				int stepnum = Integer.parseInt(StepNo);
				int steps = stepnum +1;
				String stepnumb = String.valueOf(steps);
				
				Mainframe_GlobalFunctionLib.pressKey("F6");
				Mainframe_GlobalFunctionLib.sendText(9,14,stepnumb );
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(8,24,DedCompCode );
				Mainframe_GlobalFunctionLib.sendText(10,24,MaxInd );
				Mainframe_GlobalFunctionLib.sendText(12,24,"N" );
				Mainframe_GlobalFunctionLib.sendText(16,24,"C" );
				Mainframe_GlobalFunctionLib.sendText(20,24,"N" );
				Mainframe_GlobalFunctionLib.sendText(20,68,"N" );
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				Mainframe_GlobalFunctionLib.pressKey("F12");
				Mainframe_GlobalFunctionLib.pressKey("F12");
				
				//OOP Schedule
				FunctionalLibrary.navigateToScreen("2");
				Mainframe_GlobalFunctionLib.pressKey("F6");
				Mainframe_GlobalFunctionLib.sendText(5, 14,Schedule );
				Mainframe_GlobalFunctionLib.sendText(5, 28,ScheduleDesc );
				Mainframe_GlobalFunctionLib.sendText(7, 14,Basis );
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(4, 5,Schedule );
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(10,2,"7" );
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				
				Mainframe_GlobalFunctionLib.pressKey("F6");
				Mainframe_GlobalFunctionLib.sendText(9,14,StepNo );
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(8,23,OOPCompCode );
				Mainframe_GlobalFunctionLib.sendText(10,23,Ind );
				Mainframe_GlobalFunctionLib.sendText(12,23,"Y" );
				Mainframe_GlobalFunctionLib.sendText(16,23,"C" );
				Mainframe_GlobalFunctionLib.sendText(19,23,"Y" );
				Mainframe_GlobalFunctionLib.sendText(19,66,"1" );
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				
				Mainframe_GlobalFunctionLib.pressKey("F6");
				Mainframe_GlobalFunctionLib.sendText(9,14,stepnumb );
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(8,23,OOPCompCode );
				Mainframe_GlobalFunctionLib.sendText(10,23,MaxInd );
				Mainframe_GlobalFunctionLib.sendText(12,23,"N" );
				Mainframe_GlobalFunctionLib.sendText(16,23,"C" );
				Mainframe_GlobalFunctionLib.sendText(19,23,"Y" );
				Mainframe_GlobalFunctionLib.sendText(19,66,"1" );
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				Mainframe_GlobalFunctionLib.pressKey("F12");
				Mainframe_GlobalFunctionLib.pressKey("F12");
				Mainframe_GlobalFunctionLib.pressKey("F12");
	}
	
	@Then("^adding the pricing schedules to plan with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void adding_the_pricing_schedules_to_plan_with(String fdate, String tdate, String pricesched, String patpay) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.sendText(7,21,"28" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(21,12,"1" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(12,2,"2" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(10,26,"SUBMIT ING" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.sendText(21,12,"3" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(11,2,"2" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(9,23,"SUBMIT PP" );
		Mainframe_GlobalFunctionLib.click(9, 32);
		Robot ro = new Robot();
		ro.keyPress(KeyEvent.VK_DELETE);
		ro.keyRelease(KeyEvent.VK_DELETE);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(16,64,"Y" );
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	}
	
	/*
	@When("^I submit a claim with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_submit_a_claim_with(String bin, String proc, String group, String pharmacyID, String rxNbr, String refill, String fillDate, String memberID, String productID, String dspQty, String ds, String psc, String cost, String pat) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		try {
			FunctionalLibrary.navigateToRxClaimPlanAdministrator();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		FunctionalLibrary.navigateToScreen("3");
		FunctionalLibrary.navigateToScreen("2");
		FunctionalLibrary.navigateToScreen("1");
		
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
			Thread.sleep(4000);
			//Mainframe_GlobalFunctionLib.click(7, 12 );
			//Mainframe_GlobalFunctionLib.pressKey("F4");
			//Thread.sleep(1000);
			//Mainframe_GlobalFunctionLib.sendText(3, 4, memberID);
			//Mainframe_GlobalFunctionLib.pressKey("Enter");
			//Mainframe_GlobalFunctionLib.sendText(8, 2,"1" );
			//Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText("04" , "065" ,"          ");
			Mainframe_GlobalFunctionLib.sendText("04", "065", fillDate);			
			Mainframe_GlobalFunctionLib.sendText("11", "020",productID );
			Mainframe_GlobalFunctionLib.sendText("12", "011",dspQty );
			Mainframe_GlobalFunctionLib.sendText("12", "026",ds );
			Mainframe_GlobalFunctionLib.sendText("14", "006",psc );
			Mainframe_GlobalFunctionLib.sendText("10", "047","         " );
			Mainframe_GlobalFunctionLib.sendText("10", "047",cost );
			Mainframe_GlobalFunctionLib.sendText("17", "047","         " );
			Mainframe_GlobalFunctionLib.sendText("17", "047",pat);
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			
		}
		else{
			
		Mainframe_GlobalFunctionLib.sendText("09", "002","1" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Thread.sleep(1000);
		Mainframe_GlobalFunctionLib.click(4, 29 );
			Mainframe_GlobalFunctionLib.sendText("04", "029", pharmacyID);
			///Thread.sleep(3000);
			Mainframe_GlobalFunctionLib.sendText("04" , "065" ,"          ");
			Mainframe_GlobalFunctionLib.sendText("04" , "065", fillDate);
			Mainframe_GlobalFunctionLib.sendText("05","029", rxNbr);
			Mainframe_GlobalFunctionLib.sendText("05", "047", refill);			
			//Mainframe_GlobalFunctionLib.click(7, 12 );
			Mainframe_GlobalFunctionLib.sendText("07", "012", memberID);
			//Mainframe_GlobalFunctionLib.pressKey("F4");
			//Mainframe_GlobalFunctionLib.sendText(3, 4, memberID);
			//Mainframe_GlobalFunctionLib.pressKey("Enter");         
			//Mainframe_GlobalFunctionLib.sendText(8, 2,"1" );
			//Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText("11", "020",productID );
			Mainframe_GlobalFunctionLib.sendText("12", "011","           " );
			Mainframe_GlobalFunctionLib.sendText("12", "011",dspQty );
			Mainframe_GlobalFunctionLib.sendText("12", "026","   " );
			Mainframe_GlobalFunctionLib.sendText("12", "026",ds);
			Mainframe_GlobalFunctionLib.sendText("14", "006",psc );
			Mainframe_GlobalFunctionLib.sendText("10", "047","         " );
			Mainframe_GlobalFunctionLib.sendText("10", "047",cost );
			Mainframe_GlobalFunctionLib.sendText("17", "047","         " );
			Mainframe_GlobalFunctionLib.sendText("17", "047",pat);
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			 
		}
		
			System.out.println("Claim is created");	
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			Mainframe_GlobalFunctionLib.pressKey("F6");
			 Thread.sleep(2000);
			 Mainframe_GlobalFunctionLib.pressKey("F7");
			 Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	}
	*/
	
	@When("^I create Group with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_create_Group_with(String CarrierID, String groupID, String groupName, String GroupFromDt, String GroupThruDt, String PlanCode) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		FunctionalLibrary.navigateToScreen("1");
		FunctionalLibrary.navigateToScreen("1");
		FunctionalLibrary.navigateToScreen("1");
		Mainframe_GlobalFunctionLib.sendText(4, 6,CarrierID );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(10, 2,"7" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(12, 2,"7" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F6");				
		Mainframe_GlobalFunctionLib.sendText(16, 15, groupID);
		Mainframe_GlobalFunctionLib.pressKey("Enter");					
		Mainframe_GlobalFunctionLib.sendText(7, 27, groupName);
		Mainframe_GlobalFunctionLib.sendText(17, 2, GroupFromDt);
		Mainframe_GlobalFunctionLib.sendText(17, 12, GroupThruDt);
		Mainframe_GlobalFunctionLib.sendText(17, 22, PlanCode);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText("16", "064", "Y");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Thread.sleep(2000);
		Mainframe_GlobalFunctionLib.sendText("12", "002", "5");				
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F12");
	}
	@Then("^Validating the accumulator information in member screen with \"([^\"]*)\"$")
	public void validating_the_accumulator_information_in_member_screen_with(String memid) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		FunctionalLibrary.navigateToScreen("1");
		FunctionalLibrary.navigateToScreen("2");
		Mainframe_GlobalFunctionLib.sendText(4,4,memid );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(10,2,"5" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F8");
		Mainframe_GlobalFunctionLib.sendText(4,20,"19" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(4,20,"1" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(10,2,"7" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(11,2,"5" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.sendText(4,20,"2" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(10,2,"7" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(11,2,"5" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F3");
	}
	
	@Then("^Validating the accumulator savings account send log file$")
	public void validating_the_accumulator_savings_account_send_log_file() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Path readFile = Paths.get("C:\\Users\\spriya7\\git\\RxClaim_ATDD\\src\\test\\resources\\features\\RxClaim\\featureFiles\\SR41632\\TestData.txt");
		String RxClaimNumber = "";
		try (BufferedReader reader = 
                 Files.newBufferedReader(readFile, StandardCharsets.UTF_8)) {
            String data;
            while ((data = reader.readLine()) != null) {
            	RxClaimNumber = data;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
		if(RxClaimNumber!="")
		{
			Mainframe_GlobalFunctionLib.sendText("04", "04",RxClaimNumber );
			 Mainframe_GlobalFunctionLib.pressKey("Enter");
			 Mainframe_GlobalFunctionLib.sendText("10", "02","7");
			 Mainframe_GlobalFunctionLib.pressKey("Enter");
			 Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		}
	}
}
