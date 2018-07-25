package com.atdd.demo.te.stepdefinitons;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import com.atdd.te.screenHelpers.FunctionalLibrary;
import com.cucumber.listener.Reporter;
import com.optumrx.autofusion.core.te.util.Mainframe_GlobalFunctionLib;
import com.optumrx.autofusion.core.te.util.Screenshot;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ExternalTransactionProgramValidation {
	
	@Then("^Validate \"([^\"]*)\" on \"([^\"]*)\"$")
	public void validate_on(String External_Transaction_Program, String screen) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String Program_Name = Mainframe_GlobalFunctionLib.getText(6, 31);
		if(Program_Name.equals(External_Transaction_Program))
		{
			System.out.println("Validation successful");
		}
		else
		{
			System.out.println("Validation failed");
		}
	}
	
	@Then("^Validate External Transaction format on ExternalTransactionScreen$")
	public void validate_External_Transaction_format_on_ExternalTransactionScreen() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		String Curr_claim_status = Mainframe_GlobalFunctionLib.getText(8, 24);
		if (Curr_claim_status.equals("X"))
		{
			String External_Transaction_Number = Mainframe_GlobalFunctionLib.getText(15, 5);	
			String curr_year = External_Transaction_Number.substring(0, 4);
			String julian_day = External_Transaction_Number.substring(4, 7);
			String Type = External_Transaction_Number.substring(7, 8);
			String seq_num = External_Transaction_Number.substring(8,13);
			String claim_engine = External_Transaction_Number.substring(13, 14);
			final DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
			String olddate = "01/01/2018";
			Date currdate = new Date();
			String currentdate = dateFormat.format(currdate);
			Date dateobj1 = dateFormat.parse(currentdate);
			Date dateobj2 = dateFormat.parse(olddate);
			long diff = dateobj1.getTime() - dateobj2.getTime();
			int JulianDay = (int) (diff / (24 * 60 * 60 * 1000)+1);
			int juliandays = Integer.parseInt(julian_day);
			int year = 2018;
			int current_year = Integer.parseInt(curr_year);
			String claim_origination=Mainframe_GlobalFunctionLib.getText(6, 22);
			if(current_year==year & JulianDay==juliandays)
			{
				System.out.println("Year and Julian day are populated correctly");
			}
			else
			{
				System.out.println("Validation failed");
			}
			if(Type.equals("5")&claim_engine.equals("0")&claim_origination.equals("M"))
			{
				System.out.println("Claim Type is: Manual Reversal Claim");
				System.out.println("Type and claim engine is : "+Type+" & "+claim_engine);
			}
			else if(Type.equals("5")&claim_engine.equals("1"))
			{
				System.out.println("Claim submitted using F18 functionality");
				System.out.println("Type and claim engine is : "+Type+" & "+claim_engine);
			}
			else if(Type.equals("5")&claim_engine.equals("0")&claim_origination.equals("B"))
			{
				System.out.println("Claim Type is: Batch Claim");
				System.out.println("Type and claim engine is : "+Type+" & "+claim_engine);
			}
			else if(Type.equals("5")&claim_engine.equals("1")&claim_origination.equals("B"))
			{
				System.out.println("Claim Type is: Batch Claim and rejected");
				System.out.println("Type and claim engine is : "+Type+" & "+claim_engine);
			}
		}
		else if ((Curr_claim_status.equals("P")) || (Curr_claim_status.equals("R")))
				{
		String External_Transaction = Mainframe_GlobalFunctionLib.getText(14, 5);
		String curr_year = External_Transaction.substring(0, 4);
		String julian_day = External_Transaction.substring(4, 7);
		String Type = External_Transaction.substring(7, 8);
		String seq_num = External_Transaction.substring(8,13);
		String claim_engine = External_Transaction.substring(13, 14);
		final DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
		String olddate = "01/01/2018";
		Date currdate = new Date();
		String currentdate = dateFormat.format(currdate);
		Date dateobj1 = dateFormat.parse(currentdate);
		Date dateobj2 = dateFormat.parse(olddate);
		long diff = dateobj1.getTime() - dateobj2.getTime();
		int JulianDay = (int) (diff / (24 * 60 * 60 * 1000)+1);
		int juliandays = Integer.parseInt(julian_day);
		int year = 2018;
		int current_year = Integer.parseInt(curr_year);
		String claim_origination=Mainframe_GlobalFunctionLib.getText(6, 22);
		if(current_year==year & JulianDay==juliandays)
		{
			System.out.println("Year and Julian day are populated correctly");
			
		}
		else
		{
			System.out.println("Validation failed");
		}
		if(Type.equals("5")&claim_engine.equals("0")&claim_origination.equals("M"))
		{
			System.out.println("Claim Type is: Manual Claim");
			System.out.println("Type and claim engine is : "+Type+" & "+claim_engine);
		}
		else if(Type.equals("5")&claim_engine.equals("1"))
		{
			System.out.println("Claim submitted using F18 functionality");
			System.out.println("Type and claim engine is : "+Type+" & "+claim_engine);
		}
		else if(Type.equals("5")&claim_engine.equals("2"))
		{
			System.out.println("Claim submitted using F18 functionality");
			System.out.println("Type and claim engine is : "+Type+" & "+claim_engine);
		}
		else if(Type.equals("5")&claim_engine.equals("0")&claim_origination.equals("B"))
		{
			System.out.println("Claim Type is: Batch Claim");
			System.out.println("Type and claim engine is : "+Type+" & "+claim_engine);
		}
		else if(Type.equals("5")&claim_engine.equals("1")&claim_origination.equals("B"))
		{
			System.out.println("Claim Type is: Batch Claim and rejected");
			System.out.println("Type and claim engine is : "+Type+" & "+claim_engine);
		}
		else if(Type.equals("5")&claim_engine.equals("0")&claim_origination.equals("J"))
		{
			System.out.println("Claim Type is: Single Amendment Claim and Paid");
			System.out.println("Type,claim engine and claim origination is : "+Type+" & "+claim_engine+" & "+claim_origination);
			
		}
		else if(Type.equals("5")&claim_engine.equals("0")&claim_origination.equals("T"))
		{
			System.out.println("Claim Type is: Electronic Claim");
			System.out.println("Type,claim engine and claim origination is : "+Type+" & "+claim_engine+" & "+claim_origination);
		
		}
		}
	}
	  
	@Then("^Validate the Standard Extract Job status$")
	public void validate_the_Standard_Extract_Job_status() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String job_status = Mainframe_GlobalFunctionLib.getText(11, 40);
		if(job_status.equals("JOBQ"))
		{
			Mainframe_GlobalFunctionLib.sendText("11", "003", "2");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.pressKey("F10");
			for(int i=0;i<6;i++)
			{
				Mainframe_GlobalFunctionLib.PressTabKey();
			}
			Mainframe_GlobalFunctionLib.sendText("17", "037", "QINTER");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.pressKey("F5");
			String status_job = Mainframe_GlobalFunctionLib.getText(11, 40);
			System.out.println("Current Status of Job:"+" "+status_job);
			if(status_job.equals("OUTQ"))
			{
				System.out.println("Job completed");
			}
			else if(status_job.equals("ACTIVE"))
			{
				Mainframe_GlobalFunctionLib.pressKey("F5");
				TimeUnit.MINUTES.sleep(5);
				Mainframe_GlobalFunctionLib.pressKey("F5");
				Mainframe_GlobalFunctionLib.pressKey("F5");
				String stat_job = Mainframe_GlobalFunctionLib.getText(11, 40);
				System.out.println("Current Status of Job:"+" "+stat_job);
				if(stat_job.equals("OUTQ"))
				{
					System.out.println("Job completed");
				}
			}
		}
		else if(job_status.equals("OUTQ"))
		{
			System.out.println("Job completed");
		}
		else if(job_status.equals("ACTIVE"))
		{
			Mainframe_GlobalFunctionLib.pressKey("F5");
			TimeUnit.MINUTES.sleep(5);
			Mainframe_GlobalFunctionLib.pressKey("F5");
			Mainframe_GlobalFunctionLib.pressKey("F5");
			String stat_jobs = Mainframe_GlobalFunctionLib.getText(11, 40);
			System.out.println("Current Status of Job:"+" "+stat_jobs);
			if(stat_jobs.equals("OUTQ"))
			{
				System.out.println("Job completed");
			}
		}
	}    
	
	@When("^I press \"([^\"]*)\" key$")
	public void i_press_key(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Robot r=new Robot();
		if(arg1.equals("F21"))
		{
		r.keyPress(KeyEvent.VK_SHIFT);
		r.keyPress(KeyEvent.VK_F9);
		r.keyRelease(KeyEvent.VK_F9);
		r.keyRelease(KeyEvent.VK_SHIFT);
		Thread.sleep(2000);
		}
		else if(arg1.equals("F19"))
		{
			r.keyPress(KeyEvent.VK_SHIFT);
			r.keyPress(KeyEvent.VK_F7);
			r.keyRelease(KeyEvent.VK_F7);
			r.keyRelease(KeyEvent.VK_SHIFT);
			Thread.sleep(2000);
		}
		else if(arg1.equals("F16"))
		{
			r.keyPress(KeyEvent.VK_SHIFT);
			r.keyPress(KeyEvent.VK_F4);
			r.keyRelease(KeyEvent.VK_F4);
			r.keyRelease(KeyEvent.VK_SHIFT);
			Thread.sleep(2000);
		}
		else if(arg1.equals("End"))
		{
			r.keyPress(KeyEvent.VK_END);
			r.keyRelease(KeyEvent.VK_END);
		}
		else if(arg1.equals("Delete"))
		{
			r.keyPress(KeyEvent.VK_SHIFT);
			r.keyPress(KeyEvent.VK_END);
			r.keyRelease(KeyEvent.VK_END);
			r.keyRelease(KeyEvent.VK_SHIFT);
		}
		
	}
	
	@When("^I submit trial claim with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_submit_trial_claim_with(String bin, String proc, String group, String pharmacyID, String rxNbr, String refill, String fillDate, String memberID, String productId, String dspQty, String ds, String psc, String cost) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
			
			try {
				FunctionalLibrary.navigateToRxClaimPlanAdministrator();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			FunctionalLibrary.navigateToScreen("3");
			FunctionalLibrary.navigateToScreen("2");
			FunctionalLibrary.navigateToScreen("8");
			
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
				Mainframe_GlobalFunctionLib.sendText("11", "020",productId );
				Mainframe_GlobalFunctionLib.sendText("12", "011",dspQty );
				Mainframe_GlobalFunctionLib.sendText("12", "026",ds );
				Mainframe_GlobalFunctionLib.sendText("14", "006",psc );
				Mainframe_GlobalFunctionLib.sendText("10", "047","         " );
				Mainframe_GlobalFunctionLib.sendText("10", "047",cost );
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.pressKey("F6");
				Mainframe_GlobalFunctionLib.click(15, 22);
				Mainframe_GlobalFunctionLib.pressKey("F4");
				Mainframe_GlobalFunctionLib.sendText("06", "025","X");
				Mainframe_GlobalFunctionLib.pressKey("Enter");   
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
				Mainframe_GlobalFunctionLib.sendText("11", "020",productId );
				Mainframe_GlobalFunctionLib.sendText("12", "011","           " );
				Mainframe_GlobalFunctionLib.sendText("12", "011",dspQty );
				Mainframe_GlobalFunctionLib.sendText("12", "026","   " );
				Mainframe_GlobalFunctionLib.sendText("12", "026",ds);
				Mainframe_GlobalFunctionLib.sendText("14", "006",psc );
				Mainframe_GlobalFunctionLib.sendText("10", "047","         " );
				Mainframe_GlobalFunctionLib.sendText("10", "047",cost );
				Mainframe_GlobalFunctionLib.pressKey("F6");
				Mainframe_GlobalFunctionLib.click(15, 22);
				Mainframe_GlobalFunctionLib.pressKey("F4");
				Mainframe_GlobalFunctionLib.sendText("06", "025","X");
				Mainframe_GlobalFunctionLib.pressKey("Enter");   
				Mainframe_GlobalFunctionLib.pressKey("Enter");   
				
	        }
			
				System.out.println("Claim is submitted");
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		}
	@When("^I submit claim using \"([^\"]*)\" with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_submit_claim_using_with(String arg1, String bin, String proc, String group, String pharmacyID, String rxNbr, String refill, String fillDate, String memberID, String productId, String dspQty, String ds, String psc, String cost) throws Throwable {
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
		Robot ro = new Robot();
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
			Mainframe_GlobalFunctionLib.sendText("11", "020",productId );
			Mainframe_GlobalFunctionLib.sendText("12", "011",dspQty );
			Mainframe_GlobalFunctionLib.sendText("12", "026",ds );
			Mainframe_GlobalFunctionLib.sendText("14", "006",psc );
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
			ro.keyPress(KeyEvent.VK_SHIFT);
			ro.keyPress(KeyEvent.VK_F6);
			ro.keyRelease(KeyEvent.VK_F6);
			ro.keyRelease(KeyEvent.VK_SHIFT);
			Thread.sleep(3000);
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
			Mainframe_GlobalFunctionLib.sendText("11", "020",productId );
			Mainframe_GlobalFunctionLib.sendText("12", "011","           " );
			Mainframe_GlobalFunctionLib.sendText("12", "011",dspQty );
			Mainframe_GlobalFunctionLib.sendText("12", "026","   " );
			Mainframe_GlobalFunctionLib.sendText("12", "026",ds);
			Mainframe_GlobalFunctionLib.sendText("14", "006",psc );
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
			ro.keyPress(KeyEvent.VK_SHIFT);
			ro.keyPress(KeyEvent.VK_F6);
			ro.keyRelease(KeyEvent.VK_F6);
			ro.keyRelease(KeyEvent.VK_SHIFT);
			Thread.sleep(3000);
			  
			
        }
		
			System.out.println("Claim is submitted");
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	}
	
	@Then("^Verify whether External Transaction Program field is blank$")
	public void verify_whether_External_Transaction_Program_field_is_blank() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String External_Transaction_Program = Mainframe_GlobalFunctionLib.getText(6,31);
		if(External_Transaction_Program.equals(""))
		{
			System.out.println("Validation passed");
		}
		else
		{
			System.out.println("External Transaction Program is : "+External_Transaction_Program);
		}
	
	}
	
	@Then("^Validate the External Transaction Number present on TransactionDetailList Screen against Standard Claim Extract$")
	public void validate_the_External_Transaction_Number_present_on_TransactionDetailList_Screen_against_Standard_Claim_Extract() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String External_Transaction = Mainframe_GlobalFunctionLib.getText(14, 5);
		for(int i=0;i<4;i++)
		{
			Mainframe_GlobalFunctionLib.pressKey("F3");
		}
		FunctionalLibrary.navigateToScreen("21");
		FunctionalLibrary.navigateToScreen("7");
		FunctionalLibrary.navigateToScreen("12");
		Mainframe_GlobalFunctionLib.sendText("04", "021", "");
	}
	
	
	@Then("^Validate the External Transaction Number present on TransactionDetailList Screen against Standard Claim Extract with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void validate_the_External_Transaction_Number_present_on_TransactionDetailList_Screen_against_Standard_Claim_Extract_with(String Carrier, String Account, String Group, String FileName, String Library, String Query) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String External_Transaction = Mainframe_GlobalFunctionLib.getText(14, 5);
		for(int i=0;i<5;i++)
		{
			Mainframe_GlobalFunctionLib.pressKey("F3");
		}
		FunctionalLibrary.navigateToScreen("21");
		FunctionalLibrary.navigateToScreen("7");
		FunctionalLibrary.navigateToScreen("12");
		Mainframe_GlobalFunctionLib.sendText("04", "021","010118");
		Mainframe_GlobalFunctionLib.sendText("04", "039","123118");
		Mainframe_GlobalFunctionLib.sendText("05", "021",Carrier );
		Mainframe_GlobalFunctionLib.sendText("05", "039",Carrier );
		Mainframe_GlobalFunctionLib.sendText("06", "021",Account );
		Mainframe_GlobalFunctionLib.sendText("06", "039",Account );
		Mainframe_GlobalFunctionLib.sendText("07", "021",Group );
		Mainframe_GlobalFunctionLib.sendText("07", "039",Group );
		Mainframe_GlobalFunctionLib.sendText("10", "021","80" );
		Mainframe_GlobalFunctionLib.sendText("12", "021","S" );
		Mainframe_GlobalFunctionLib.sendText("13", "021","N" );
		Mainframe_GlobalFunctionLib.sendText("21", "021",FileName );
		Mainframe_GlobalFunctionLib.sendText("22", "021",Library );
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Mainframe_GlobalFunctionLib.sendText("21", "007","ws");
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
			Thread.sleep(2000);
			Mainframe_GlobalFunctionLib.pressKey("F5");
			Mainframe_GlobalFunctionLib.pressKey("F5");
			String status_job = Mainframe_GlobalFunctionLib.getText(12, 40);
			System.out.println("Current Status of Job:"+" "+status_job);
			if(status_job.equals("OUTQ"))
			{
				System.out.println("Job completed");
			}
			else if(status_job.equals("ACTIVE"))
			{
				Mainframe_GlobalFunctionLib.pressKey("F5");
				TimeUnit.MINUTES.sleep(5);
				Mainframe_GlobalFunctionLib.pressKey("F5");
				Mainframe_GlobalFunctionLib.pressKey("F5");
				String stat_job = Mainframe_GlobalFunctionLib.getText(12, 40);
				System.out.println("Current Status of Job:"+" "+stat_job);
				if(stat_job.equals("OUTQ"))
				{
					System.out.println("Job completed");
				}
			}
		}
		else if (job_status.equals("OUTQ"))
			{
				System.out.println("Job completed");
			}
		else if(job_status.equals("ACTIVE"))
		{
			Mainframe_GlobalFunctionLib.pressKey("F5");
			TimeUnit.MINUTES.sleep(5);
			Mainframe_GlobalFunctionLib.pressKey("F5");
			Mainframe_GlobalFunctionLib.pressKey("F5");
			String stat_job = Mainframe_GlobalFunctionLib.getText(12, 40);
			System.out.println("Current Status of Job:"+" "+stat_job);
			if(stat_job.equals("OUTQ"))
			{
				System.out.println("Job completed");
			}
		}
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.sendText("21", "007",Query );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.click(3, 32);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_SHIFT);
		r.keyPress(KeyEvent.VK_F9);
		r.keyRelease(KeyEvent.VK_F9);
		r.keyRelease(KeyEvent.VK_SHIFT);
		Thread.sleep(3000);
		Mainframe_GlobalFunctionLib.click(3, 32);
		Mainframe_GlobalFunctionLib.PressTabKey();
		Mainframe_GlobalFunctionLib.sendText("03", "074","4740" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Thread.sleep(2000);
		String transaction_number_report = Mainframe_GlobalFunctionLib.getText(6,35).trim();
		if(transaction_number_report.equals(External_Transaction))
		{
			System.out.println("Transaction Number is present in the report:" +transaction_number_report);
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		}
		else 
		{
			System.out.println("Transaction Number is not present in the report");
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		}
	}
	
	@When("^I submit a manual claim with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_submit_a_manual_claim_with(String bin, String proc, String group, String pharmacyID, String rxNbr, String refill, String fillDate, String memberID, String productID, String dspQty, String ds, String psc, String cost) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
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
			Mainframe_GlobalFunctionLib.sendText("19", "047","80" );
			Mainframe_GlobalFunctionLib.sendText("20", "047","20" );
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
			Mainframe_GlobalFunctionLib.sendText("10", "047","         " );
			Mainframe_GlobalFunctionLib.sendText("10", "047",cost );
			Mainframe_GlobalFunctionLib.sendText("19", "047","80" );
			Mainframe_GlobalFunctionLib.sendText("20", "047","20" );
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
	@When("^I create CarrierAccountGroup with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_create_CarrierAccountGroup_with(String carrierID,String carrierName,String processor,String mail,String city,String state,String zip,String contractFromDate,String contractThruDate, String contractEnt,String businessType,String accountID,String accountName ,String groupID,String groupName,String gFromDate,String gThruDate,String planCode) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		try {
			FunctionalLibrary.navigateToRxClaimPlanAdministrator();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		FunctionalLibrary.navigateToScreen("1");
		FunctionalLibrary.navigateToScreen("1");
		FunctionalLibrary.navigateToScreen("1");
		
		if(!(FunctionalLibrary.func_SearchAndSelectADataEditMode("4,6" ,carrierID ,"10,6" , carrierID))){
			Mainframe_GlobalFunctionLib.pressKey("F6");
			
			Mainframe_GlobalFunctionLib.sendText("13", "014", carrierID);
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			
			Mainframe_GlobalFunctionLib.sendText("04", "024", carrierName);
			Mainframe_GlobalFunctionLib.sendText("05", "012", processor);
			Mainframe_GlobalFunctionLib.sendText("011", "015", mail);
			
			
			
			Mainframe_GlobalFunctionLib.sendText("12", "015", city);

           
			Mainframe_GlobalFunctionLib.sendText("12", "047", state);

           
			Mainframe_GlobalFunctionLib.sendText("12", "056", zip);
                                
			Mainframe_GlobalFunctionLib.sendText("19", "027", contractFromDate);
			Mainframe_GlobalFunctionLib.sendText("19", "042", contractThruDate);
			Mainframe_GlobalFunctionLib.sendText("19", "065", contractEnt);
			Mainframe_GlobalFunctionLib.pressKey("Enter");
            
			Mainframe_GlobalFunctionLib.pressKey("F15");
			Mainframe_GlobalFunctionLib.pressKey("PageDown");
			Mainframe_GlobalFunctionLib.click(7,23);
			for(int i=0;i<11;i++)
			{
			Mainframe_GlobalFunctionLib.PressTabKey();
			}
			Mainframe_GlobalFunctionLib.sendText("12", "061", businessType);
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.pressKey("PageUp");
			Mainframe_GlobalFunctionLib.pressKey("F12");
			
			
            
		}else
		{
			Mainframe_GlobalFunctionLib.pressKey("F12");
		}
			
			
		//Create new account
		Thread.sleep(5000);
		//Mainframe_GlobalFunctionLib.sendText("04", "006", carrierID);
		//Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText("10", "002", "7");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			
			if(!(FunctionalLibrary.func_SearchAndSelectADataEditMode("6,5" ,accountID ,"11,5" , accountID))){
				
				Mainframe_GlobalFunctionLib.pressKey("F6");
				
				Mainframe_GlobalFunctionLib.sendText(15, 32, accountID);
				Mainframe_GlobalFunctionLib.pressKey("Enter");	
				Mainframe_GlobalFunctionLib.sendText(6, 27, accountName);
				Mainframe_GlobalFunctionLib.pressKey("Enter");
			}
			else
			{
				Mainframe_GlobalFunctionLib.pressKey("F12");
			}
			
			//Create new group
			Thread.sleep(5000);
			//Mainframe_GlobalFunctionLib.sendText("06","005",accountID);
			//Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText("11", "002", "7");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			if(!(FunctionalLibrary.func_SearchAndSelectADataEditMode("7,4" ,groupID ,"12,4" , groupID))){
			
				Mainframe_GlobalFunctionLib.pressKey("F6");				
				Mainframe_GlobalFunctionLib.sendText(16, 15, groupID);
				Mainframe_GlobalFunctionLib.pressKey("Enter");					
				Mainframe_GlobalFunctionLib.sendText(7, 27, groupName);
				Mainframe_GlobalFunctionLib.sendText(17, 2, gFromDate);
				//Mainframe_GlobalFunctionLib.Transmit();
				
				Mainframe_GlobalFunctionLib.sendText(17, 12, gThruDate);
				//Mainframe_GlobalFunctionLib.Transmit();
				
				Mainframe_GlobalFunctionLib.click(17, 22 );
  				Mainframe_GlobalFunctionLib.pressKey("F4");
				
				Mainframe_GlobalFunctionLib.sendText("04", "005", planCode);
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Thread.sleep(3000);
				Mainframe_GlobalFunctionLib.sendText("10", "002", "1");
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				
				
				Mainframe_GlobalFunctionLib.sendText("16", "064", "Y");
				Mainframe_GlobalFunctionLib.pressKey("F12");
				Thread.sleep(2000);
				Mainframe_GlobalFunctionLib.sendText("12", "002", "5");				
				//Mainframe_GlobalFunctionLib.Transmit();
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				
		}
		
		
	}
	
	@When("^I trigger the SQL command with \"([^\"]*)\"$")
	public void i_trigger_the_SQL_command_with(String SQLCommand) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Path readFile = Paths.get("C:\\Users\\spriya7\\git\\Autofusion_ATDD_LeanFTDemo\\src\\test\\resources\\features\\RxClaim\\featureFiles\\SR41632\\TestData.txt");
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
		if(RxClaimNumber.equals(""))
		{
		Mainframe_GlobalFunctionLib.sendText("21", "007", "STRSQL");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText("16", "007",SQLCommand);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		}
		else if(RxClaimNumber!="")
		{
			Mainframe_GlobalFunctionLib.sendText("21", "007", "STRSQL");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			String SQL_Command = "update rctcdp set DQKWST = 'T' where DQP2NB = '"+RxClaimNumber+"'";
			Mainframe_GlobalFunctionLib.sendText("16", "007",SQL_Command);
			Mainframe_GlobalFunctionLib.pressKey("Enter");
		}
	}
	
	
	@When("^Capture the Claim Number and write in text file$")
	public void capture_the_Claim_Number_and_write_in_text_file() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String RxClaim_Number = Mainframe_GlobalFunctionLib.getText(3, 12);
		Path FileName = Paths.get("C:\\Users\\spriya7\\git\\Autofusion_ATDD_LeanFTDemo\\src\\test\\resources\\features\\RxClaim\\featureFiles\\SR41632\\TestData.txt");
		BufferedWriter writer = Files.newBufferedWriter(FileName , StandardOpenOption.TRUNCATE_EXISTING);
		writer.write(RxClaim_Number);
		writer.close();
	}
	
	/*@When("^I Capture the text in the report$")
	public void i_Capture_the_text_in_the_report() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.sendText("21", "007","RUNQRY QRYFILE((TCA8401FIL/RCCHF70FP UMRA5S01))" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.click(3, 32);
		Mainframe_GlobalFunctionLib.PressTabKey();
		Mainframe_GlobalFunctionLib.sendText("03", "074","34" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Thread.sleep(2000);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_SHIFT);
		r.keyPress(KeyEvent.VK_F9);
		r.keyRelease(KeyEvent.VK_F9);
		r.keyRelease(KeyEvent.VK_SHIFT);
		Thread.sleep(3000);
		String pharm_name = Mainframe_GlobalFunctionLib.getText(7,9).trim();
		System.out.println(pharm_name);
	}*/
	@When("^I select Option \"([^\"]*)\" to display \"([^\"]*)\"$")
	public void i_select_Option_to_display(String option, String screen) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.sendText(10, 2 ,option );
		Mainframe_GlobalFunctionLib.Transmit();
	}
	}

