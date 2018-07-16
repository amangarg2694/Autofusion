package com.atdd.demo.te.stepdefinitons;

import java.util.concurrent.TimeUnit;

import com.atdd.te.screenHelpers.FunctionalLibrary;
import com.cucumber.listener.Reporter;
import com.optumrx.autofusion.core.te.util.Mainframe_GlobalFunctionLib;
import com.optumrx.autofusion.core.te.util.Screenshot;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PDEValidation {
	@Then("^Validate whether Extract status is blank in Claim Transaction Additional screen$")
	public void validate_whether_Extract_status_is_blank_in_Claim_Transaction_Additional_screen() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String Extract_Sts = Mainframe_GlobalFunctionLib.getText(5,61);
		if(Extract_Sts.equals(""))
		{
			System.out.println("Validation passed");
		}
		else
		{
			System.out.println("Extract Status after claim extract triggered is : "+Extract_Sts);
		}
	}
	
	@Then("^submit the PDE File job with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void submit_the_PDE_File_job_with(String PDEFromDt, String PDEThruDt, String CarrierID, String CarrierIDThru, String AccountID, String AccountIDThru, String GroupIDFrom, String GroupIDThru, String Library, String DDPSCodeList, String SubmitterID, String PEC) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.sendText("05","024", PDEFromDt);
		Mainframe_GlobalFunctionLib.sendText("05","041", PDEThruDt);
		Mainframe_GlobalFunctionLib.sendText("08","024", CarrierID);
		Mainframe_GlobalFunctionLib.sendText("08","041", CarrierIDThru);
		Mainframe_GlobalFunctionLib.sendText("09","024", AccountID);
		Mainframe_GlobalFunctionLib.sendText("09","041", AccountIDThru);
		Mainframe_GlobalFunctionLib.sendText("10","024", GroupIDFrom);
		Mainframe_GlobalFunctionLib.sendText("10","041", GroupIDThru);
		Mainframe_GlobalFunctionLib.sendText("12","024", Library);
		Mainframe_GlobalFunctionLib.sendText("13","024", PEC);
		Mainframe_GlobalFunctionLib.sendText("16","024",DDPSCodeList );
		Mainframe_GlobalFunctionLib.sendText("20","054",SubmitterID );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Mainframe_GlobalFunctionLib.PressTabKey();
		Mainframe_GlobalFunctionLib.PressTabKey();
		Mainframe_GlobalFunctionLib.sendText("16","069","Y");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText("21","007","ws" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		String job_status = Mainframe_GlobalFunctionLib.getText(12, 40);
		if(job_status.equals("JOBQ"))
		{
			Mainframe_GlobalFunctionLib.sendText("12", "003", "2");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.pressKey("F10");
			for(int i=0;i<6;i++)
			{
				Mainframe_GlobalFunctionLib.PressTabKey();
			}
			Mainframe_GlobalFunctionLib.sendText("17", "037", "QINTER");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.pressKey("F5");
			String status_job = Mainframe_GlobalFunctionLib.getText(12, 40);
			System.out.println("Current Status of Job:"+" "+status_job);
			if(status_job.equals("OUTQ"))
			{
				System.out.println("PDE Job completed");
			}
			else if(status_job.equals("ACTIVE"))
			{
				Mainframe_GlobalFunctionLib.pressKey("F5");
				Mainframe_GlobalFunctionLib.pressKey("F5");
				TimeUnit.MINUTES.sleep(4);
				Mainframe_GlobalFunctionLib.pressKey("F5");
				Mainframe_GlobalFunctionLib.pressKey("F5");
				String stat_job = Mainframe_GlobalFunctionLib.getText(12, 40);
				System.out.println("Current Status of Job:"+" "+stat_job);
				if(stat_job.equals("OUTQ"))
				{
					System.out.println("PDE Job completed");
				}
			}	
	    }
		else if(job_status.equals("OUTQ"))
		{
			System.out.println("PDE Job completed");
		}
		else if(job_status.equals("ACTIVE"))
		{
			Mainframe_GlobalFunctionLib.pressKey("F5");
			Mainframe_GlobalFunctionLib.pressKey("F5");
			TimeUnit.MINUTES.sleep(4);
			Mainframe_GlobalFunctionLib.pressKey("F5");
			Mainframe_GlobalFunctionLib.pressKey("F5");
			String stat_jobs = Mainframe_GlobalFunctionLib.getText(12, 40);
			System.out.println("Current Status of Job:"+" "+stat_jobs);
			if(stat_jobs.equals("OUTQ"))
			{
				System.out.println("PDE Job completed");
			}
		} 
	}
	@When("^I create Contract PBP with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_create_Contract_PBP_with(String Carrier, String Contract, String PBP, String FID, String Byear, String SID) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.sendText("05","016", Carrier);
		Mainframe_GlobalFunctionLib.sendText("07","016", Contract);
		Mainframe_GlobalFunctionLib.sendText("08","016", PBP);
		Mainframe_GlobalFunctionLib.sendText("09","016",FID);
		Mainframe_GlobalFunctionLib.sendText("10","016",Byear);
		Mainframe_GlobalFunctionLib.sendText("11","016","S");
		Mainframe_GlobalFunctionLib.sendText("12","016",SID);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F3");
	}
	
	@When("^I create Part D profile with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_create_Part_D_profile_with(String Carrier, String FromDate, String ThruDate, String Contract, String PBP, String Benefit_Year, String PlanCode) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.click(4,13);  
		Mainframe_GlobalFunctionLib.pressKey("F4");
		TimeUnit.SECONDS.sleep(30);
		Mainframe_GlobalFunctionLib.sendText("04","005",Carrier);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		TimeUnit.SECONDS.sleep(30);
		Mainframe_GlobalFunctionLib.sendText("09","002","1");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		TimeUnit.SECONDS.sleep(30);
		Mainframe_GlobalFunctionLib.click(7,13);  
		Mainframe_GlobalFunctionLib.pressKey("F4");
		TimeUnit.SECONDS.sleep(30);
		Mainframe_GlobalFunctionLib.sendText("04","005",PlanCode);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		TimeUnit.SECONDS.sleep(30);
		Mainframe_GlobalFunctionLib.sendText("10","002","1");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		TimeUnit.SECONDS.sleep(30);
		Mainframe_GlobalFunctionLib.sendText("08","013",FromDate);
		Mainframe_GlobalFunctionLib.sendText("08","041",ThruDate);
		Mainframe_GlobalFunctionLib.click(9,11);  
		Mainframe_GlobalFunctionLib.pressKey("F4");
		TimeUnit.SECONDS.sleep(30);
		Mainframe_GlobalFunctionLib.sendText("04","005",Contract);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		TimeUnit.SECONDS.sleep(30);
		Mainframe_GlobalFunctionLib.sendText("10","002","1");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		TimeUnit.SECONDS.sleep(10);
		//Mainframe_GlobalFunctionLib.sendText("09","022",PBP);
		//Mainframe_GlobalFunctionLib.sendText("09","053",Benefit_Year);
		Mainframe_GlobalFunctionLib.sendText("14","034","SR40723");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		
	}
	@When("^I create a Pharmacy Network with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_create_a_Pharmacy_Network_with(String Network, String Name, String Carrier) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Mainframe_GlobalFunctionLib.sendText("08","016",Network);
		Mainframe_GlobalFunctionLib.sendText("09","016",Name);
		Mainframe_GlobalFunctionLib.sendText("10","016",Carrier);
		Mainframe_GlobalFunctionLib.sendText("11","016","*DEFAULT");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText("09","011","optum");
		Mainframe_GlobalFunctionLib.sendText("11","011","Hyderabad");
		Mainframe_GlobalFunctionLib.sendText("11","035","CA");
		Mainframe_GlobalFunctionLib.sendText("11","044","12345");
		Mainframe_GlobalFunctionLib.sendText("12","011","1234512345");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F3");
	}
	
	@When("^I create Pharmacy with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_create_Pharmacy_with(String Pharmacy, String PharmacyName, String Carrier) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Mainframe_GlobalFunctionLib.sendText("13","015",Pharmacy);
		Mainframe_GlobalFunctionLib.sendText("14","011",PharmacyName);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		TimeUnit.SECONDS.sleep(10);
		Mainframe_GlobalFunctionLib.sendText("08","010","Optum");
		Mainframe_GlobalFunctionLib.sendText("10","010","Hyd");
		Mainframe_GlobalFunctionLib.sendText("10","047","CA");
		Mainframe_GlobalFunctionLib.sendText("10","054","12345");
		Mainframe_GlobalFunctionLib.sendText("12","010","1234512345");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		TimeUnit.SECONDS.sleep(10);
		Mainframe_GlobalFunctionLib.sendText("04","005",Pharmacy);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		TimeUnit.SECONDS.sleep(10);
		Mainframe_GlobalFunctionLib.sendText("11","002","7");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		TimeUnit.SECONDS.sleep(10);
		Mainframe_GlobalFunctionLib.sendText("12","002","4");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText("16","067","Y");
		TimeUnit.SECONDS.sleep(10);
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Mainframe_GlobalFunctionLib.click(7, 11);
		Mainframe_GlobalFunctionLib.pressKey("F4");
		Mainframe_GlobalFunctionLib.pressKey("F16");
		TimeUnit.SECONDS.sleep(10);
		Mainframe_GlobalFunctionLib.sendText("03","056",Carrier);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		TimeUnit.SECONDS.sleep(10);
		Mainframe_GlobalFunctionLib.sendText("08","002","1");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("Enter"); 
	}
	@When("^I create active supplemental ID by type with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_create_active_supplemental_ID_by_type_with(String FromDate, String ThruDate, String SupplementalID) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Mainframe_GlobalFunctionLib.sendText("10","012",FromDate);
		Mainframe_GlobalFunctionLib.sendText("10","033",ThruDate);
		Mainframe_GlobalFunctionLib.sendText("12","019","06");
		Mainframe_GlobalFunctionLib.sendText("13","019",SupplementalID);
		Mainframe_GlobalFunctionLib.sendText("15","019","Testing");
		Mainframe_GlobalFunctionLib.pressKey("Enter"); 
		Mainframe_GlobalFunctionLib.pressKey("F3"); 
	}
	
	@When("^I create active medicare part D with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_create_active_medicare_part_D_with(String FromDate, String ThruDate, String Contract, String PBP) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Mainframe_GlobalFunctionLib.sendText("10","017",FromDate);
		Mainframe_GlobalFunctionLib.sendText("10","041",ThruDate);
		Mainframe_GlobalFunctionLib.sendText("12","020",Contract);
		Mainframe_GlobalFunctionLib.sendText("13","022",PBP);
		Mainframe_GlobalFunctionLib.pressKey("Enter"); 
		Mainframe_GlobalFunctionLib.pressKey("F3"); 
	}
	
	@Then("^Validate the Pricing Exception Code with \"([^\"]*)\"$")
	public void validate_the_Pricing_Exception_Code_with(String ExpectedPEC) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    String ActualPEC = Mainframe_GlobalFunctionLib.getText(9,71).trim();
	    if(ExpectedPEC.equals(ActualPEC))
	    {
	    	System.out.println("Validation passed"+" "+ActualPEC);
	    }
	    else
	    {
	    	System.out.println("Validation failed");
	    }
	}
	
	@When("^I submit a COB claim with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_submit_a_COB_claim_with(String bin, String proc, String group, String pharmacyID, String rxNbr, String refill, String fillDate, String memberID, String productID, String dspQty, String ds, String psc, String cost) throws Throwable {
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
			Mainframe_GlobalFunctionLib.sendText("14", "033","2" );
			Mainframe_GlobalFunctionLib.sendText("10", "047","         " );
			Mainframe_GlobalFunctionLib.sendText("10", "047",cost );
			Mainframe_GlobalFunctionLib.pressKey("PageDown");
			Mainframe_GlobalFunctionLib.click(4, 11);
			for(int i=0;i<4;i++)
			{
				Mainframe_GlobalFunctionLib.PressTabKey();
			}
			Mainframe_GlobalFunctionLib.sendText("04", "055","5" );
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
			Mainframe_GlobalFunctionLib.sendText("14", "033","2" );
			Mainframe_GlobalFunctionLib.sendText("10", "047","         " );
			Mainframe_GlobalFunctionLib.sendText("10", "047",cost );
			Mainframe_GlobalFunctionLib.pressKey("PageDown");
			Mainframe_GlobalFunctionLib.click(4, 11);
			for(int i=0;i<4;i++)
			{
				Mainframe_GlobalFunctionLib.PressTabKey();
			}
			Mainframe_GlobalFunctionLib.sendText("04", "055","5" );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			
			//Mainframe_GlobalFunctionLib.pressKey("F6");
            
		}
		
			System.out.println("Claim is created");	
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			Mainframe_GlobalFunctionLib.pressKey("F6");
			 Thread.sleep(2000);
			 Mainframe_GlobalFunctionLib.pressKey("F7");
			 Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	}
}