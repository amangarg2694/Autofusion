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
import net.masterthought.cucumber.ReportResult;

public class SR41710 {

	@Given("^I create MemberPA \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_create_MemberPA(String number, String type, String ndcgpilist, String from, String thru, String agent, String reason, String ignoredrugstatus) throws Throwable {
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
				
 
 
			} 
 		
		} 
	@Given("^I Create Mbr Prior Auth Export File in Load Format with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_Create_Mbr_Prior_Auth_Export_File_in_Load_Format_with(String MemberID, String CarrierID, String AccountID, String GroupID, String EfileName, String Library, String EFormat) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
		Mainframe_GlobalFunctionLib.sendText(21,7, "CCT700");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(21,7, "2");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(21,7, "11");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(21,7, "1");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		
		Mainframe_GlobalFunctionLib.click(4, 16 );
		Thread.sleep(1000);
		Mainframe_GlobalFunctionLib.pressKey("F4");
		Mainframe_GlobalFunctionLib.sendText(4, 5, MemberID);
		Mainframe_GlobalFunctionLib.sendText(4, 25, CarrierID);
		Mainframe_GlobalFunctionLib.sendText(4, 36, AccountID);
		Mainframe_GlobalFunctionLib.sendText(4, 53, GroupID);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(9,2, "1");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(15, 16, EfileName);
		Mainframe_GlobalFunctionLib.sendText(16, 16, Library);
		Mainframe_GlobalFunctionLib.click(18, 16 );
		Thread.sleep(1000);
		Mainframe_GlobalFunctionLib.pressKey("F4");
		Mainframe_GlobalFunctionLib.sendText(7, 4, EFormat);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(13,3, "X");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F6");
	}
	


	@Given("^I update the Mbr PA export file\"([^\"]*)\",\"([^\"]*)\" for Drug status table \"([^\"]*)\"$")
	public void i_update_the_Mbr_PA_export_file_for_Drug_status_table(String Efilename, String Library, String Dtable) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
		String DtableIns=" "+Dtable;
		
		Mainframe_GlobalFunctionLib.sendText(21,7, "YWRKF");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(5,37, Efilename);
		Mainframe_GlobalFunctionLib.sendText(6,39, Library);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(8,2, "5");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(19,41, DtableIns);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(24,73, "Y");
		Mainframe_GlobalFunctionLib.pressKey("F3");
	}
	
	@Given("^I create the MBA batch load with file \"([^\"]*)\",\"([^\"]*)\", \"([^\"]*)\"$")
	public void i_create_the_MBA_batch_load_with_file(String Efilename, String Library, String FileFormat) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
		Mainframe_GlobalFunctionLib.sendText(21,7, "CCT700");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(21,7, "2");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(21,7, "10");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(21,7, "1");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(8,43, Efilename);
		Mainframe_GlobalFunctionLib.sendText(9,43, Library);
		Thread.sleep(1000);
		Mainframe_GlobalFunctionLib.click(11, 46 );
		Thread.sleep(1000);
		Mainframe_GlobalFunctionLib.pressKey("F4");
		Thread.sleep(1000);
		Mainframe_GlobalFunctionLib.sendText(7,4, FileFormat);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Thread.sleep(1000);
		Mainframe_GlobalFunctionLib.sendText(13,3, "X");
		Thread.sleep(1000);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F6");
	}
	@Then("^Job should complete successfully with user \"([^\"]*)\" and job name \"([^\"]*)\"$")
	public void job_should_complete_successfully_with_user_and_job_name(String Juser, String Jname) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    

	    // Write code here that turns the phrase above into concrete actions
	   
		String qry="WRKJOB JOB("+Juser+"/"+Jname+")";
	    Mainframe_GlobalFunctionLib.sendText(21, 7,qry);
	    Thread.sleep(2000);
	    Mainframe_GlobalFunctionLib.pressKey("Enter");
	    Thread.sleep(2000);
	    Mainframe_GlobalFunctionLib.validateText("8", "10", Jname);
	    String status = Mainframe_GlobalFunctionLib.getText(8, 52);
	    Thread.sleep(2000);
	    	if(status.contains("JOBQ"))
	   
	    	{
	    			Thread.sleep(2000);
			    		String jobN = Mainframe_GlobalFunctionLib.getText(8, 34);
			    		Thread.sleep(2000);
			    		Mainframe_GlobalFunctionLib.pressKey("F12");
			    		Mainframe_GlobalFunctionLib.pressKey("F12");
			    		String qry2="CHGJOB";
			    		Thread.sleep(2000);
			    		Mainframe_GlobalFunctionLib.sendText(21, 7,qry2);   
			    		Thread.sleep(2000);
			    		Mainframe_GlobalFunctionLib.pressKey("F4");  	
			    		Thread.sleep(3000);
			    		Mainframe_GlobalFunctionLib.sendText(5, 37,Jname);
			    		Thread.sleep(1000);
			    		Mainframe_GlobalFunctionLib.sendText(6, 39,Juser);
			    		Thread.sleep(1000);
			    		Mainframe_GlobalFunctionLib.sendText(7, 39,jobN);
			    		Thread.sleep(1000);
			    		Mainframe_GlobalFunctionLib.pressKey("Enter");
			    		Thread.sleep(1000);
			    		Mainframe_GlobalFunctionLib.pressKey("F10");    
			    		Thread.sleep(2000);
			    		Mainframe_GlobalFunctionLib.sendText(17, 37,"QPGMR");
			    		Thread.sleep(3000);
			    		Mainframe_GlobalFunctionLib.pressKey("Enter");
			    		
			    		System.out.println("Job Completed Successfully: "+status);
			    		//Mainframe_GlobalFunctionLib.pressKey("F12"); 
			    		//Mainframe_GlobalFunctionLib.click(21, 7 );
						//Thread.sleep(1000);
						//Mainframe_GlobalFunctionLib.sendText(21, 7,"                              " );
						Thread.sleep(3000);
	    			}

	    	 else if(status.contains("ACTIVE")) {
	    		 
	    		 do{
	    		 
	    		 Mainframe_GlobalFunctionLib.pressKey("F12");
	    		 Mainframe_GlobalFunctionLib.sendText(21, 7,qry);
	    		 Mainframe_GlobalFunctionLib.pressKey("Enter");
	    		 Thread.sleep(5000);
	    		 } while(Mainframe_GlobalFunctionLib.getText(8, 52).contains("ACTIVE"));
	    		 
	    		 //Mainframe_GlobalFunctionLib.pressKey("F12");
	    		// Mainframe_GlobalFunctionLib.click(21, 7 );
	    			//Thread.sleep(1000);
	    			//Mainframe_GlobalFunctionLib.sendText(21, 7,"                            " );
	    			Thread.sleep(3000);
	    			System.out.println("Job Completed Successfully: "+status);
	    	 }
	    		 
	    	else
	    		{
	    	System.out.println("Job Completed Successfully: "+status);
	    	//Mainframe_GlobalFunctionLib.pressKey("F12");
	    	//Mainframe_GlobalFunctionLib.click(21, 7 );
			//Thread.sleep(1000);
			//Mainframe_GlobalFunctionLib.sendText(21, 7,"                            " );
			Thread.sleep(3000);
	    	 
	    		}		
	
	}
	
	@Then("^I validate the records in spool file report \"([^\"]*)\"$")
	public void i_validate_the_records_in_spool_file_report(String ReportName) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
		Mainframe_GlobalFunctionLib.sendText(8, 4,"1");
    	Mainframe_GlobalFunctionLib.pressKey("Enter");
    	Mainframe_GlobalFunctionLib.sendText(21, 7,"4");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(11, 3,"5");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.sendText(4, 22,ReportName);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F16");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.validateText("7", "53", ReportName);
		System.out.println("Spool file report name: "+ReportName);
		
		String ReportContent = Mainframe_GlobalFunctionLib.getText(7, 78);
		if(ReportContent.contains("RECORD TYPE 1  TOTAL INPUT RECORDS               :           1"))
		{
			System.out.println("Expected TOTAL INPUT RECORDS appearing in file");
		}
		else{
			System.out.println("Expected Record not appearing in file");
			Assert.fail("Expected TOTAL INPUT RECORDS not appearing in file.Screenshot captured.");

		}
		
		Thread.sleep(1000);
		if(ReportContent.contains("RECORD TYPE 1  TOTAL INPUT RECORDS LOADED        :           1"))
		{
			System.out.println("Expected TOTAL INPUT RECORDS LOADED appearing in file");
			ReportEvent("Browser Sync", "Browser sync completed");
		}
		else{
			System.out.println("Expected Record not appearing in file");
			Assert.fail("Expected TOTAL INPUT RECORDS LOADED not appearing in file.Screenshot captured.");

		}
		
		Thread.sleep(1000);
		if(ReportContent.contains("RECORD TYPE 1  TOTAL INPUT RECORDS UPDATED       :           1"))
		{
			System.out.println("Expected TOTAL INPUT RECORDS UPDATED appearing in file");
		}
		else{
			System.out.println("Expected Record not appearing in file");
			Assert.fail("Expected TOTAL INPUT RECORDS UPDATED not appearing in file.Screenshot captured.");

		}
		 Mainframe_GlobalFunctionLib.pressKey("F12");
	}
	
	private void ReportEvent(String string, String string2) {
		// TODO Auto-generated method stub
		
	}
	@Then("^I validate member \"([^\"]*)\" prior authorisation is updated with Drug Status Table \"([^\"]*)\"$")
	public void i_validate_member_prior_authorisation_is_updated_with_Drug_Status_Table(String MemberID, String Drugtable) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.sendText(22,7, "CCT600");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(21,7, "1");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(21,7, "2");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(4,4, MemberID);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(10,2, "5");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Thread.sleep(1000);
		Mainframe_GlobalFunctionLib.pressKey("F8");
		Mainframe_GlobalFunctionLib.sendText(4,20, "9");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(16,2, "5");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		String ActDTable= Mainframe_GlobalFunctionLib.getText(8, 66);
		if(Drugtable.equals(ActDTable))
		{
			System.out.println("Test Matching: Drug table updated: ");
		}
		else
		{
			System.out.println("Test Not Matching: Drug table not updated: ");
			Assert.fail("Drug table not updated.Screenshot captured");
		}
		
	}
	 
	}


	

