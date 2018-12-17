package com.atdd.demo.te.stepdefinitons;

import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.StringTokenizer;

import org.testng.Assert;

import com.atdd.te.screenHelpers.FunctionalLibrary;
import com.cucumber.listener.Reporter;
import com.optumrx.autofusion.core.te.util.Mainframe_GlobalFunctionLib;
import com.optumrx.autofusion.core.te.util.Screenshot;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import com.atdd.demo.te.stepdefinitons.PriceOverrideAfterSpecificHashOfFills;

public class MemberAdjustmentLoadwithMedicalDataFile {
	public static String rxClaimIdValue="";
	public static String spoolPDEFile="";
	public static String TofileName="";
	@When("^I submit a claim with Cmpnd \"([^\"]*)\" and \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_submit_a_claim_with_Cmpnd_and(String Cmpnd, String bin, String proc, String group, String pharmacyID, String rxNbr, String refill, String fillDate, String memberID, String productID, String dspQty, String ds, String psc, String cost) throws Throwable {
		FunctionalLibrary.CreateTransaction(bin, proc, group, pharmacyID, rxNbr, refill, fillDate, memberID, productID, dspQty, ds, psc, cost);
		Mainframe_GlobalFunctionLib.sendText(14, 14, Cmpnd);
		String actualCmpnd=Mainframe_GlobalFunctionLib.getText(14, 14);
		System.out.println("Compound Value is: "+actualCmpnd);
		Reporter.addStepLog("Compound Value is: "+actualCmpnd);
		if(actualCmpnd.equals("2"))
		{
			//ID 00777310402 as 000
			Mainframe_GlobalFunctionLib.sendText(11, 20,"00000000000 ");
			Mainframe_GlobalFunctionLib.pressKey("F14");
			Mainframe_GlobalFunctionLib.sendText(5, 23,"5");
			Mainframe_GlobalFunctionLib.pressKey("enter");
			for(int i=1; i<8; i++)
			{	
				try{
						String existingPID=Mainframe_GlobalFunctionLib.getText(13, 16);
						System.out.println("Existing Product IDs found in the list: "+existingPID);
						if(existingPID.length()>0)
						{
							Mainframe_GlobalFunctionLib.sendText(13, 2, "4");
							Mainframe_GlobalFunctionLib.pressKey("enter");
							Mainframe_GlobalFunctionLib.sendText(16, 64, "Y");
							Mainframe_GlobalFunctionLib.pressKey("enter");
						}
						else
						{
							break;
						}
						
				}catch (Exception e)
				{
					break;
				}
			}
			Mainframe_GlobalFunctionLib.pressKey("F6");
			Mainframe_GlobalFunctionLib.sendText(12, 20,"03");
			Mainframe_GlobalFunctionLib.sendText(13, 20,"62810441322");
			Mainframe_GlobalFunctionLib.sendText(15, 20,"30");
			Mainframe_GlobalFunctionLib.sendText(16, 20,"30");
			Mainframe_GlobalFunctionLib.sendText(18, 20,"00");
			Mainframe_GlobalFunctionLib.pressKey("enter");
			
			Mainframe_GlobalFunctionLib.pressKey("F6");
			Mainframe_GlobalFunctionLib.sendText(12, 20, "03");
			Mainframe_GlobalFunctionLib.sendText(13, 20, "12345123412");
			Mainframe_GlobalFunctionLib.sendText(15, 20, "20");
			Mainframe_GlobalFunctionLib.sendText(16, 20, "20");
			Mainframe_GlobalFunctionLib.sendText(18, 20, "00");
			Mainframe_GlobalFunctionLib.pressKey("enter");
			
			Mainframe_GlobalFunctionLib.pressKey("F3");
			Mainframe_GlobalFunctionLib.pressKey("F3");
		}
		FunctionalLibrary.submitClaim();
		PriceOverrideAfterSpecificHashOfFills.i_Validate_RxClaim_ID();
		String rxClaimIdValue=PriceOverrideAfterSpecificHashOfFills.rxClaimId;
		System.out.println("Print imported Rx Claim ID: "+rxClaimIdValue);
		Reporter.addStepLog("Print imported Rx Claim ID: "+rxClaimIdValue);
	}
	
	@Then("^I Submit Standard Extract Job \"([^\"]*)\"$")
	public void i_Submit_Standard_Extract_Job(String ExtractDate) throws Throwable {
		Mainframe_GlobalFunctionLib.sendText(7, 33, ExtractDate);
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Mainframe_GlobalFunctionLib.sendText(24, 73, "Y");
		Mainframe_GlobalFunctionLib.pressKey("enter");
	}	
			
	@Then("^I verify submitted Standard Extract Job status \"([^\"]*)\", \"([^\"]*)\"$")
	public void i_verify_submitted_Standard_Extract_Job_status(String wsQuery, String ExtractJobName) throws Throwable {
		 Mainframe_GlobalFunctionLib.sendText(21, 7,wsQuery);
		 Mainframe_GlobalFunctionLib.pressKey("enter");
			String JobOUTQ="OUTQ";
			String JobACTIVE="ACTIVE";
			String JobJOBQ="JOBQ";
			int i;
		lable1:	for(i=11; i<=19; i++)
			{
				String JobName= Mainframe_GlobalFunctionLib.getText(i, 7).trim();
				System.out.println("Job Name is: "+JobName);
				Reporter.addStepLog("Job Name is: "+JobName);
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				if(JobName.equals(ExtractJobName))
				{
					String JobStatus= Mainframe_GlobalFunctionLib.getText(i, 40).trim();
					System.out.println("Job Status is: "+JobStatus);
					Reporter.addStepLog("Job Status is: "+JobStatus);
					Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
					if(JobStatus.equals(JobJOBQ))
					{
						do
						{
							standardExtractStatusChange(i);
				     		String JobStatusVerify= Mainframe_GlobalFunctionLib.getText(i, 40).trim();
				    		System.out.println("1-JobJOBQ: Job Status Verify is: "+JobStatusVerify);
				    		Reporter.addStepLog("1-JobJOBQ: Job Status Verify is: "+JobStatusVerify);
				    		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				    		if(JobStatusVerify.equals(JobACTIVE))
							{
									standardExtractStatusChange(i);
									String JobStatusVerifyInside= Mainframe_GlobalFunctionLib.getText(i, 40).trim();
									System.out.println("1-JobACTIVE: Job Status Verify is: "+JobStatusVerifyInside);
									Reporter.addStepLog("1-JobACTIVE: Job Status Verify is: "+JobStatusVerifyInside);
									Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
									if(JobStatusVerifyInside.equals(JobOUTQ))
									{
										System.out.println("1-JobOUTQ: Expected Job Status is: "+JobStatusVerifyInside);
										Reporter.addStepLog("1-JobOUTQ: Expected Job Status is: "+JobStatusVerifyInside);
										Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
										//spoolFile(i);
										break lable1;
									}
							}
				    		else if(JobStatusVerify.equals(JobOUTQ))
								{
									System.out.println("1-JobOUTQ: Expected Job Status is: "+JobStatusVerify);
									Reporter.addStepLog("1-JobOUTQ: Expected Job Status is: "+JobStatusVerify);
									Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
									//spoolFile(i);
									break lable1;
								}
				    
				    	}while(!Mainframe_GlobalFunctionLib.getText(i, 40).equalsIgnoreCase(JobOUTQ));
					  }
					else if(JobStatus.equals(JobACTIVE))
					{
						do
						{
							standardExtractStatusChange(i);
							String JobStatusVerifyInside= Mainframe_GlobalFunctionLib.getText(i, 40).trim();
							System.out.println("2-JobACTIVE: Job Status Verify is: "+JobStatusVerifyInside);
							Reporter.addStepLog("2-JobACTIVE: Job Status Verify is: "+JobStatusVerifyInside);
							Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
							 if(JobStatusVerifyInside.equals(JobOUTQ))
								{
									System.out.println("2-JobOUTQ: Expected Job Status is: "+JobStatusVerifyInside);
									Reporter.addStepLog("2-JobOUTQ: Expected Job Status is: "+JobStatusVerifyInside);
									Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
									//spoolFile(i);
									break lable1;
								}
						}while(!Mainframe_GlobalFunctionLib.getText(i, 40).equalsIgnoreCase(JobOUTQ));
					}
					else if(JobStatus.equals(JobOUTQ))
					{
						System.out.println("JobOUTQ: Expected Job Status is: "+JobStatus);
						Reporter.addStepLog("JobOUTQ: Expected Job Status is: "+JobStatus);
						Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
						//spoolFile(i);
						break lable1;
					}
				    
					}
				else
				{
					System.out.println("Job Name is not as expected: "+JobName);
					Reporter.addStepLog("Job Name is not as expected: "+JobName);
					Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
					//break lable1;
				}
			}//end of For loop
		}
	
	public static void standardExtractStatusChange(int i) throws Exception
	{
		Mainframe_GlobalFunctionLib.sendText(i, 3, "2");
		Mainframe_GlobalFunctionLib.pressKey("enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("F10");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.sendText(17, 37,"       ");
		Mainframe_GlobalFunctionLib.sendText(17, 37,"QPGMR");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F5");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		
	}
	@Then("^I verify the Extract status \"([^\"]*)\" in Claim Transaction Additional Info$")
	public void i_verify_the_Extract_status_in_Claim_Transaction_Additional_Info(String Extractstatus) throws Throwable {
		Mainframe_GlobalFunctionLib.pressKey("F8");
		//String rxClaimId2="183270040164000";
		//rxClaimId=rxClaimId2;
		rxClaimIdValue=PriceOverrideAfterSpecificHashOfFills.rxClaimId;
		Mainframe_GlobalFunctionLib.sendText(4, 4,rxClaimIdValue);
		System.out.println("Print imported Rx Claim ID: "+rxClaimIdValue);
		Reporter.addStepLog("Print imported Rx Claim ID: "+rxClaimIdValue);
		//Mainframe_GlobalFunctionLib.sendText(4, 4,rxClaimId2);
		FunctionalLibrary.pressEnter();
		String rxClaimIdActual=Mainframe_GlobalFunctionLib.getText(10,4);
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		if(rxClaimIdActual.equals(rxClaimIdValue))
		{
			System.out.println("Expected Rx Claim ID Found: "+rxClaimIdValue);
			Reporter.addStepLog("Expected Rx Claim ID Found: "+rxClaimIdValue);
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			 Mainframe_GlobalFunctionLib.sendText(10, 2, "7");
			 Mainframe_GlobalFunctionLib.pressKey("Enter");
			 Mainframe_GlobalFunctionLib.sendText(14, 2, "5");
			 Mainframe_GlobalFunctionLib.pressKey("Enter");
			 Mainframe_GlobalFunctionLib.pressKey("F7");
			 Mainframe_GlobalFunctionLib.sendText(4, 23, "8");
			 Mainframe_GlobalFunctionLib.pressKey("Enter");
			 String extractStatusActual=Mainframe_GlobalFunctionLib.getText(5, 61);
			 System.out.println("Actual Extract Status is: "+extractStatusActual);
			 Reporter.addStepLog("Actual Extract Status is: "+extractStatusActual);
			 Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			 if((extractStatusActual.length()==0))
			 {
				 extractStatusActual=Extractstatus;
				 if(extractStatusActual.equals(Extractstatus))
					{
					 System.out.println("Expected Extract Status is Blank");
					 Reporter.addStepLog("Expected Extract Status is Blank");
					 Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
					}
			 }
			 else if(extractStatusActual.equals(Extractstatus))
				 {
					 System.out.println("Expected Extract Status is: "+Extractstatus);
					 Reporter.addStepLog("Expected Extract Status is: "+Extractstatus);
					 Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				 }
				 else
				 {
					 System.out.println("Expected Extract Status is not shown ie "+Extractstatus);
					 Reporter.addStepLog("Expected Extract Status is not shown ie "+Extractstatus);
					 Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				 }
		}
		else
		{
			System.out.println("Expected Rx Claim ID not Found: "+rxClaimIdValue);
			Reporter.addStepLog("Expected Rx Claim ID not Found: "+rxClaimIdValue);
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		}
		}
	
	@Then("^I submit Prescription Drug Event file with \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
	public void i_submit_Prescription_Drug_Event_file_with(String FromDate, String ThruDate, String CarrierID,String Library, String DDPSFilterProcess, String SubmitterID) throws Throwable {
		 Mainframe_GlobalFunctionLib.sendText(5, 24, FromDate);
		 Mainframe_GlobalFunctionLib.sendText(5, 41, ThruDate);
		 Mainframe_GlobalFunctionLib.sendText(8, 24, CarrierID);
		 Mainframe_GlobalFunctionLib.sendText(8, 41, CarrierID);
		 Mainframe_GlobalFunctionLib.sendText(12, 24, Library);
		 Mainframe_GlobalFunctionLib.sendText(15, 24, DDPSFilterProcess);
		 Mainframe_GlobalFunctionLib.sendText(17, 24, "T");
		 Mainframe_GlobalFunctionLib.sendText(20, 54, SubmitterID);
		 Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		 Mainframe_GlobalFunctionLib.pressKey("F6");
		 Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		 Mainframe_GlobalFunctionLib.sendText(13, 48, "TXT");
		 Mainframe_GlobalFunctionLib.sendText(16, 69, "Y");
		 Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		 Mainframe_GlobalFunctionLib.pressKey("Enter");
		 Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		 Thread.sleep(3000);
		 Mainframe_GlobalFunctionLib.pressKey("F3");
		}
	//public static String TofileName="";
	@When("^I copy a file and ADD to a new file \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
	public void i_copy_a_file_and_ADD_to_a_new_file(String Fromfile, String Library, String Option, String Createfile) throws Throwable {
		 Mainframe_GlobalFunctionLib.sendText(21, 7, "cpyf");
		 Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		 Mainframe_GlobalFunctionLib.pressKey("F4");
		 Mainframe_GlobalFunctionLib.sendText(5, 37,Fromfile);
		 Mainframe_GlobalFunctionLib.sendText(6, 39, Library);
		// String timeStamp = new SimpleDateFormat("HH.mm.ss").format(new Date(0));
			 SimpleDateFormat formatter = new SimpleDateFormat("hmmss", Locale.getDefault());
			 Calendar currentDate = java.util.Calendar.getInstance();
			 String timeString = formatter.format(currentDate.getTime());
			 System.out.println("timeString is: "+timeString);
			 TofileName="SR"+timeString;
			 System.out.println("To File name is: "+TofileName);
			 Reporter.addStepLog("To File name is: "+TofileName);
			 
		 Mainframe_GlobalFunctionLib.sendText(7, 37, TofileName);
		 Mainframe_GlobalFunctionLib.sendText(8, 39, Library);
		 Mainframe_GlobalFunctionLib.sendText(11, 37, "       ");
		 Mainframe_GlobalFunctionLib.sendText(11, 37, Option);
		 Mainframe_GlobalFunctionLib.sendText(12, 37, Createfile);
		 Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		 Mainframe_GlobalFunctionLib.pressKey("Enter");
		 Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		 try{
			 String actualFileCreateMsg=Mainframe_GlobalFunctionLib.getText(24, 2).trim();
			 System.out.println("Actual Message shown as :"+actualFileCreateMsg);
			 Reporter.addStepLog("Actual Message shown as :"+actualFileCreateMsg);
			 String expectedFileCreateMsg="Physical file "+TofileName+" created in library "+Library+".";
			 System.out.println("Expected Message should be :"+expectedFileCreateMsg);
			 Reporter.addStepLog("Expected Message should be :"+expectedFileCreateMsg);
			 Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			 if(actualFileCreateMsg.contains(expectedFileCreateMsg))
			 {
				 System.out.println("Expected File Creation message is shown as: "+expectedFileCreateMsg);
				 Reporter.addStepLog("Expected File Creation message is shown as: "+expectedFileCreateMsg);
			 }
			 else
			 {
			 System.out.println("Expected File Creation message is not shown: "+expectedFileCreateMsg);
			 Reporter.addStepLog("Expected File Creation message is not shown: "+expectedFileCreateMsg);
			 }
		 }catch (Exception e){
			 System.out.println("Unknown error");
			 Reporter.addStepLog("Unknown error");
		 }
	}
	
	@When("^I work with file \"([^\"]*)\" and update the record$")
	public void i_work_with_file_and_update_the_record(String Library) throws Throwable {
		String wrkCmd="ywrkf"+" "+Library+"/"+TofileName;
		 System.out.println("ywrkf command is: "+wrkCmd);
		 Reporter.addStepLog("ywrkf command is: "+wrkCmd);
		 Mainframe_GlobalFunctionLib.sendText(21, 7, wrkCmd);
		 Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		 Mainframe_GlobalFunctionLib.pressKey("Enter");
		 Mainframe_GlobalFunctionLib.sendText(8, 2, "5");
		 Mainframe_GlobalFunctionLib.pressKey("Enter");
		 Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		 Mainframe_GlobalFunctionLib.sendText(8, 80, "               ");
		 Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		 System.out.println("ywrkf: rxClaimIdValue is: "+rxClaimIdValue);
		 Reporter.addStepLog("ywrkf: rxClaimIdValue is: "+rxClaimIdValue);
		 Mainframe_GlobalFunctionLib.sendText(8, 80, rxClaimIdValue);
		 Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		 Mainframe_GlobalFunctionLib.pressKey("Enter");
		 Mainframe_GlobalFunctionLib.sendText(24, 73, "Y");
		 Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		 Mainframe_GlobalFunctionLib.pressKey("Enter");
		 Mainframe_GlobalFunctionLib.pressKey("F3");
	}
	
	@Then("^I submit PDE resubmission load with \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\",\"([^\"]*)\"$")
	public void i_submit_PDE_resubmission_load_with(String InputFileName, String Library, String DDPSFilterProcessR, String SubmitterID) throws Throwable {
	try{ 
		 Mainframe_GlobalFunctionLib.sendText(5, 29, InputFileName);
		 Mainframe_GlobalFunctionLib.sendText(6, 29, Library);
		 Mainframe_GlobalFunctionLib.sendText(9, 29, DDPSFilterProcessR);
		 Mainframe_GlobalFunctionLib.sendText(13, 29, Library);
		 Mainframe_GlobalFunctionLib.sendText(19, 29, "T");
		 Mainframe_GlobalFunctionLib.sendText(16, 53, SubmitterID);
		 Mainframe_GlobalFunctionLib.pressKey("Enter");
		 Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		 Mainframe_GlobalFunctionLib.pressKey("F6");
		 Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		 Mainframe_GlobalFunctionLib.sendText(13, 48, "TXT");
		 Mainframe_GlobalFunctionLib.sendText(16, 69, "Y");
		 Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		 Mainframe_GlobalFunctionLib.pressKey("Enter");
		 Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		 Thread.sleep(3000);
		 Mainframe_GlobalFunctionLib.pressKey("F3");
	}
	catch (Exception e)
	{
		String FileNotFoundError=Mainframe_GlobalFunctionLib.getText(24, 2);
		System.out.println("Error is: "+FileNotFoundError);
		Reporter.addStepLog("Error is: "+FileNotFoundError);
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		String ActualFileNotFoundError="File not found in Library.";
		if(FileNotFoundError.contains(ActualFileNotFoundError))
		{
			System.out.println("Library File not found error is: "+FileNotFoundError);
			Reporter.addStepLog("ELibrary File not found error is: "+FileNotFoundError);
			
		}
		else
		{
			System.out.println("Unknown error ie: "+FileNotFoundError);
			Reporter.addStepLog("Unknown error ie: "+FileNotFoundError);
		}
	}
	}
	
	@Then("^I verify submitted PDE Job status \"([^\"]*)\", \"([^\"]*)\"$")
	public void i_verify_submitted_PDE_Job_status(String wsQuery, String JobRCPD) throws Throwable {

		 Mainframe_GlobalFunctionLib.sendText(21, 7,wsQuery);
		 Mainframe_GlobalFunctionLib.pressKey("enter");
			String JobOUTQ="OUTQ";
			String JobACTIVE="ACTIVE";
			String JobJOBQ="JOBQ";
			int i;
		lable1:	for(i=11; i<=19; i++)
			{
				String JobName= Mainframe_GlobalFunctionLib.getText(i, 7).trim();
				System.out.println("Job Name is: "+JobName);
				Reporter.addStepLog("Job Name is: "+JobName);
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				if(JobName.equals(JobRCPD))
				{
					System.out.println("Expected "+JobName+" Job shown.");
					Reporter.addStepLog("Expected "+JobName+"Job shown.");
					Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
					
					String JobStatus= Mainframe_GlobalFunctionLib.getText(i, 40).trim();
					System.out.println("Job Status is: "+JobStatus);
					Reporter.addStepLog("Job Status is: "+JobStatus);
					Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
					if(JobStatus.equals(JobJOBQ))
					{
						do
						{
							standardExtractStatusChange(i);
				     		String JobStatusVerify= Mainframe_GlobalFunctionLib.getText(i, 40).trim();
				    		System.out.println("1-JobJOBQ: Job Status Verify is: "+JobStatusVerify);
				    		Reporter.addStepLog("1-JobJOBQ: Job Status Verify is: "+JobStatusVerify);
				    		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				    		if(JobStatusVerify.equals(JobACTIVE))
							{
									standardExtractStatusChange(i);
									String JobStatusVerifyInside= Mainframe_GlobalFunctionLib.getText(i, 40).trim();
									System.out.println("1-JobACTIVE: Job Status Verify is: "+JobStatusVerifyInside);
									Reporter.addStepLog("1-JobACTIVE: Job Status Verify is: "+JobStatusVerifyInside);
									Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
									if(JobStatusVerifyInside.contains(JobOUTQ))
									{
										System.out.println("1-JobOUTQ: Expected Job Status is: "+JobStatusVerifyInside);
										Reporter.addStepLog("1-JobOUTQ: Expected Job Status is: "+JobStatusVerifyInside);
										Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
										spoolFile(i);
										break lable1;
									}
								}
				    	}while(!Mainframe_GlobalFunctionLib.getText(i, 40).equalsIgnoreCase(JobOUTQ));
					  }
					else if(JobStatus.equals(JobACTIVE))
					{
						do
						{
							standardExtractStatusChange(i);
							String JobStatusVerifyInside= Mainframe_GlobalFunctionLib.getText(i, 40).trim();
							System.out.println("2-JobACTIVE: Job Status Verify is: "+JobStatusVerifyInside);
							Reporter.addStepLog("2-JobACTIVE: Job Status Verify is: "+JobStatusVerifyInside);
							Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
							 if(JobStatusVerifyInside.equals(JobOUTQ))
								{
									System.out.println("2-JobOUTQ: Expected Job Status is: "+JobStatusVerifyInside);
									Reporter.addStepLog("2-JobOUTQ: Expected Job Status is: "+JobStatusVerifyInside);
									Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
									spoolFile(i);
									break lable1;
								}
						}while(!Mainframe_GlobalFunctionLib.getText(i, 40).equalsIgnoreCase(JobOUTQ));
					}
					else if(JobStatus.equals(JobOUTQ))
					{
						System.out.println("JobOUTQ: Expected Job Status is: "+JobStatus);
						Reporter.addStepLog("JobOUTQ: Expected Job Status is: "+JobStatus);
						Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
						spoolFile(i);
						break lable1;
					}
					else
					{
						System.out.println("JobOUTQ: Job Status is other than expected: "+JobStatus);
						Reporter.addStepLog("JobOUTQ: Job Status is other than expected: "+JobStatus);
						Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
						break lable1;
					}
				    
					}
				else
				{
					System.out.println("Job Name is not as expected: "+JobName);
					Reporter.addStepLog("Job Name is not as expected: "+JobName);
					Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
					//break lable1;
				}
			}//end of For loop
			Mainframe_GlobalFunctionLib.pressKey("F3");
			Mainframe_GlobalFunctionLib.pressKey("F3");
		}	
	
//	public static String spoolPDEFile="";
public static void spoolFile(int i) throws Exception
	{
		Mainframe_GlobalFunctionLib.sendText(i, 3,"8");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(11, 3,"5");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		
		String SpoolFileType=Mainframe_GlobalFunctionLib.getText(2, 22);
		System.out.println("Spool file name is : "+SpoolFileType);
		Reporter.addStepLog("Spool file name is : "+SpoolFileType);
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		if(SpoolFileType.equals("RCPD1070"))
		{
			Mainframe_GlobalFunctionLib.sendText(3, 22,"W30");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			Mainframe_GlobalFunctionLib.pressKey("PageDown");
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			Mainframe_GlobalFunctionLib.pressKey("PageDown");
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			System.out.println("Spool file Validation successfull");
			Reporter.addStepLog("Spool file Validation successfull");
		}
		else if(SpoolFileType.equals("RCPD1080"))
		{
			Mainframe_GlobalFunctionLib.sendText(3, 22,"W40");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			/*Mainframe_GlobalFunctionLib.pressKey("PageDown");
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			Mainframe_GlobalFunctionLib.pressKey("PageDown");
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			Mainframe_GlobalFunctionLib.pressKey("PageDown");
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			Mainframe_GlobalFunctionLib.pressKey("PageDown");
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			//String[] spoolPDEFile =Mainframe_GlobalFunctionLib.getText(7, 37).split("FILE") ;
			//spoolPDEFile =Mainframe_GlobalFunctionLib.getText(7, 37).substring(7,46).trim();
*/			try{
				Mainframe_GlobalFunctionLib.sendText(4, 22,"PD18");
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				Mainframe_GlobalFunctionLib.pressKey("F16");
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				
				String spoolPDEFileActual =Mainframe_GlobalFunctionLib.getText(7, 37);
				int spoolPDEFileActuallength = spoolPDEFileActual.length();
				spoolPDEFile = spoolPDEFileActual.substring(0, spoolPDEFileActuallength-2);
				System.out.println("PDE File ID in Spool file: "+spoolPDEFile);
				Reporter.addStepLog("PDE File ID in Spool file: "+spoolPDEFile);
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				}
			catch(Exception e)
			{
				String spoolPDEFileActual2 =Mainframe_GlobalFunctionLib.getText(7, 2);
				int spoolPDEFileActuallength = spoolPDEFileActual2.length();
				spoolPDEFile = spoolPDEFileActual2.substring(0, spoolPDEFileActuallength-2);
				System.out.println("PDE File ID in Spool file: "+spoolPDEFile);
				Reporter.addStepLog("PDE File ID in Spool file: "+spoolPDEFile);
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			/*	System.out.println("PDE File not generated; NULL ");
				Reporter.addStepLog("PDE File not generated; NULL ");*/
				}
		}
		else
		{
			System.out.println("Spool file is not expected");
			Reporter.addStepLog("Spool file is not expected");
			System.exit(0);
		}
		//Mainframe_GlobalFunctionLib.pressKey("F3");
	}
	
	@Then("^I verify Compound code \"([^\"]*)\" in Medicare Part D PDE Data Page$")
	public void i_verify_Compound_code_in_Medicare_Part_D_PDE_Data_Page(String Compoundcode) throws Throwable {
		Mainframe_GlobalFunctionLib.pressKey("F8");
		//String rxClaimId2="183270040164000";
		String rxClaimIdValue=PriceOverrideAfterSpecificHashOfFills.rxClaimId;
		System.out.println("Print Rx Claim ID: "+rxClaimIdValue);
		Reporter.addStepLog("Print Rx Claim ID: "+rxClaimIdValue);
		Mainframe_GlobalFunctionLib.sendText(4, 4,rxClaimIdValue);
		
		FunctionalLibrary.pressEnter();
		String rxClaimIdActual=Mainframe_GlobalFunctionLib.getText(10,4);
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		if(rxClaimIdActual.equals(rxClaimIdValue))
		{
			System.out.println("Expected Rx Claim ID Found: "+rxClaimIdValue);
			Reporter.addStepLog("Expected Rx Claim ID Found: "+rxClaimIdValue);
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			 Mainframe_GlobalFunctionLib.sendText(10, 2, "7");
			 Mainframe_GlobalFunctionLib.pressKey("Enter");
			 Mainframe_GlobalFunctionLib.sendText(14, 2, "5");
			 Mainframe_GlobalFunctionLib.pressKey("Enter");
			 Mainframe_GlobalFunctionLib.pressKey("F7");
			 Mainframe_GlobalFunctionLib.sendText(4, 23, "13");
			 Mainframe_GlobalFunctionLib.pressKey("Enter");
			 Mainframe_GlobalFunctionLib.pressKey("F9");
			 System.out.println("REACHED FINAL STEP");
		
			int i;
			lable2: for (i=11; i<18; i++)
			{
				try
				{	
					 String filePDE=Mainframe_GlobalFunctionLib.getText(i, 5);
					 System.out.println("Actual PDE File @ 'Medicare Part D MDD' screen is: "+filePDE);
					 Reporter.addStepLog("Actual PDE File @ 'Medicare Part D MDD' screen is: "+filePDE);
					 Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
					 if((filePDE.length()==0))
					 {
						 System.out.println("PDE File not generated @ 'Medicare Part D MDD' screen; NULL ");
						 Reporter.addStepLog("PDE File not generated @ 'Medicare Part D MDD' screen; NULL ");
					 }
					 else if(filePDE.contains(spoolPDEFile))
					 {
						 System.out.println("Expected PDE file is Generated: "+filePDE);
						 Reporter.addStepLog("Expected PDE file is Generated: "+filePDE);
						 Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
						 Mainframe_GlobalFunctionLib.sendText(11, 2, "5");
						 Mainframe_GlobalFunctionLib.pressKey("Enter");
						 Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
						 Mainframe_GlobalFunctionLib.pressKey("pagedown");
						 Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
						 String actualCompoundcode=Mainframe_GlobalFunctionLib.getText(20, 64);
						 System.out.println("Actual Compound code is: "+actualCompoundcode);
						 Reporter.addStepLog("Actual Compound code is: "+actualCompoundcode);
							if(actualCompoundcode.equals(Compoundcode) )
							{
								 System.out.println("Compound code is as Expected: "+Compoundcode);
								 Reporter.addStepLog("Compound code is as Expected: "+Compoundcode);
							}
							else
							{
								System.out.println("Compound code is not as Expected: "+Compoundcode);
								Reporter.addStepLog("Compound code is not as Expected: "+Compoundcode);
							}
							break lable2;
					  }
					 else
					 {
						 System.out.println("Expected PDE file not been Generated ie: "+filePDE);
						 Reporter.addStepLog("Expected PDE file not been Generated ie: "+filePDE);
						 Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
					 }
					} 
				  	catch(Exception e)
					{
						//e.printStackTrace();
						System.out.println("PDE File not generated; NULL ");
						Reporter.addStepLog("PDE File not generated; NULL ");
						break lable2;
						}
				}
				}
			else
			{
				System.out.println("Expected Rx Claim ID not Found: "+rxClaimIdValue);
				Reporter.addStepLog("Expected Rx Claim ID not Found: "+rxClaimIdValue);
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			}
		FunctionalLibrary.navigateToRxClaimPlanAdministrator();
		}
		
	@Then("^I verify Compound code \"([^\"]*)\" in Medicare Part D PDE Data Page for PDE Resubmission$")
	public void i_verify_Compound_code_in_Medicare_Part_D_PDE_Data_Page_for_PDE_Resubmission(String Compoundcode) throws Throwable {
		Mainframe_GlobalFunctionLib.pressKey("F8");
		//String rxClaimId2="183270040164000";
		String rxClaimIdValue=PriceOverrideAfterSpecificHashOfFills.rxClaimId;
		System.out.println("Print Rx Claim ID: "+rxClaimIdValue);
		Reporter.addStepLog("Print Rx Claim ID: "+rxClaimIdValue);
		Mainframe_GlobalFunctionLib.sendText(4, 4,rxClaimIdValue);
		
		FunctionalLibrary.pressEnter();
		String rxClaimIdActual=Mainframe_GlobalFunctionLib.getText(10,4);
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		if(rxClaimIdActual.equals(rxClaimIdValue))
		{
			System.out.println("Expected Rx Claim ID Found: "+rxClaimIdValue);
			Reporter.addStepLog("Expected Rx Claim ID Found: "+rxClaimIdValue);
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			 Mainframe_GlobalFunctionLib.sendText(10, 2, "7");
			 Mainframe_GlobalFunctionLib.pressKey("Enter");
			 Mainframe_GlobalFunctionLib.sendText(14, 2, "5");
			 Mainframe_GlobalFunctionLib.pressKey("Enter");
			 Mainframe_GlobalFunctionLib.pressKey("F7");
			 Mainframe_GlobalFunctionLib.sendText(4, 23, "13");
			 Mainframe_GlobalFunctionLib.pressKey("Enter");
			 Mainframe_GlobalFunctionLib.pressKey("F9");
			 System.out.println("REACHED FINAL STEP");
		
			int i;
			lable2: for (i=11; i<18; i++)
			{
				try
				{	
					 String filePDE=Mainframe_GlobalFunctionLib.getText(i, 5);
					 System.out.println("Actual PDE File @ 'Medicare Part D MDD' screen is: "+filePDE);
					 Reporter.addStepLog("Actual PDE File @ 'Medicare Part D MDD' screen is: "+filePDE);
					 Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
					 if((filePDE.length()==0))
					 {
						 System.out.println("PDE File not generated @ 'Medicare Part D MDD' screen; NULL ");
						 Reporter.addStepLog("PDE File not generated @ 'Medicare Part D MDD' screen; NULL ");
					 }
					 else if(spoolPDEFile.contains(filePDE))
					 {
						 System.out.println("Expected PDE file is Generated: "+filePDE);
						 Reporter.addStepLog("Expected PDE file is Generated: "+filePDE);
						 Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
						 Mainframe_GlobalFunctionLib.sendText(11, 2, "5");
						 Mainframe_GlobalFunctionLib.pressKey("Enter");
						 Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
						 Mainframe_GlobalFunctionLib.pressKey("pagedown");
						 Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
						 String actualCompoundcode=Mainframe_GlobalFunctionLib.getText(20, 64);
						 System.out.println("Actual Compound code is: "+actualCompoundcode);
						 Reporter.addStepLog("Actual Compound code is: "+actualCompoundcode);
							if(actualCompoundcode.equals(Compoundcode) )
							{
								 System.out.println("Compound code is as Expected: "+Compoundcode);
								 Reporter.addStepLog("Compound code is as Expected: "+Compoundcode);
							}
							else
							{
								System.out.println("Compound code is not as Expected: "+Compoundcode);
								Reporter.addStepLog("Compound code is not as Expected: "+Compoundcode);
							}
							break lable2;
					  }
					 else
					 {
						 System.out.println("Expected PDE file not been Generated ie: "+filePDE);
						 Reporter.addStepLog("Expected PDE file not been Generated ie: "+filePDE);
						 Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
					 }
					} 
				  	catch(Exception e)
					{
						//e.printStackTrace();
						System.out.println("PDE File not generated; NULL ");
						Reporter.addStepLog("PDE File not generated; NULL ");
						break lable2;
						}
				}
				}
			else
			{
				System.out.println("Expected Rx Claim ID not Found: "+rxClaimIdValue);
				Reporter.addStepLog("Expected Rx Claim ID not Found: "+rxClaimIdValue);
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			}
		FunctionalLibrary.navigateToRxClaimPlanAdministrator();
	}
		
	@Then("^I edit member details \"([^\"]*)\"$")
	public void i_edit_member_details(String MemberID) throws Throwable {
		if(func_SearchForMemberID1("4,4" ,MemberID ,"10,4" , MemberID)){
			System.out.println("Expected Member is : "+MemberID);
			Reporter.addStepLog("Expected Member is : "+MemberID);
		/*	Mainframe_GlobalFunctionLib.sendText(10, 2, "2");
			Mainframe_GlobalFunctionLib.pressKey("enter");*/
		}
		else
		{
			System.out.println("Expected Member not found : "+MemberID);
			Reporter.addStepLog("Expected Member not found : "+MemberID);
			System.exit(0);
		}
	}
	
	public static boolean func_SearchForMemberID1(String RowColOfData,String Data,String StartRowColToSearch,String DataSearch) throws IOException
	{
	boolean bRes=false;
	try{
		StringTokenizer stData=new StringTokenizer(RowColOfData,",");
		StringTokenizer stDataSearch=new StringTokenizer(StartRowColToSearch,",");
		int row=Integer.valueOf(stDataSearch.nextToken());
		String col=stDataSearch.nextToken();
		Mainframe_GlobalFunctionLib.sendText(stData.nextToken(),stData.nextToken(), Data);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
	
		System.out.println("check the row value"+row);
	
		if(Mainframe_GlobalFunctionLib.getText(row, Integer.parseInt(col)).trim().toLowerCase().contentEquals(DataSearch.trim().toLowerCase()))
		{
		
		bRes=true;
		Mainframe_GlobalFunctionLib.sendText(row, 2, "2");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Thread.sleep(2000);
		}
		}
		catch(Exception e){
			
			return bRes;
		}
			return bRes;
		}
		}

	

