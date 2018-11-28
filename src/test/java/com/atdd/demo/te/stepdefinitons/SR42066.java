package com.atdd.demo.te.stepdefinitons;

import java.io.IOException;
import java.util.StringTokenizer;

import com.atdd.te.screenHelpers.FunctionalLibrary;
import com.cucumber.listener.Reporter;
import com.optumrx.autofusion.core.te.util.Mainframe_GlobalFunctionLib;
import com.optumrx.autofusion.core.te.util.Screenshot;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import com.atdd.demo.te.stepdefinitons.PriceOverrideAfterSpecificHashOfFills;

public class SR42066 {
	public static String rxClaimIdValue="";
	@When("^I submit a claim with Cmpnd \"([^\"]*)\" and \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_submit_a_claim_with_Cmpnd_and(String Cmpnd, String bin, String proc, String group, String pharmacyID, String rxNbr, String refill, String fillDate, String memberID, String productID, String dspQty, String ds, String psc, String cost) throws Throwable {
		FunctionalLibrary.CreateTransaction(bin, proc, group, pharmacyID, rxNbr, refill, fillDate, memberID, productID, dspQty, ds, psc, cost);
		Mainframe_GlobalFunctionLib.sendText(14, 14, Cmpnd);
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
		String rxClaimIdValue=PriceOverrideAfterSpecificHashOfFills.rxClaimId;
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
			 Mainframe_GlobalFunctionLib.sendText(4, 23, "8");//13
			 Mainframe_GlobalFunctionLib.pressKey("Enter");
			 String extractStatusActual=Mainframe_GlobalFunctionLib.getText(5, 61);
			 if(!(extractStatusActual.equals(null))){
				 System.out.println("Actual Extract Status is: "+extractStatusActual);
				 Reporter.addStepLog("Actual Extract Status is: "+extractStatusActual);
				 Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				 if(extractStatusActual.equals(Extractstatus))
				 {
					 System.out.println("Expected Extract Status is: "+Extractstatus);
					 Reporter.addStepLog("Expected Extract Status is: "+Extractstatus);
					 Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				 }
				 else
				 {
					 System.out.println("Expected Extract Status is not shown: "+Extractstatus);
					 Reporter.addStepLog("Expected Extract Status is not shown: "+Extractstatus);
					Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				 }
			 }
			 else{
				 System.out.println("Actual Extract Status is NULL");
				 Reporter.addStepLog("Actual Extract Status is NULL");
					Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			 }
		}
		
		else
		{
			System.out.println("Expected Rx ClaimId not Found: "+rxClaimIdValue);
			Reporter.addStepLog("Expected Rx ClaimId not Found: "+rxClaimIdValue);
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
		 Mainframe_GlobalFunctionLib.pressKey("F6");
		 Mainframe_GlobalFunctionLib.sendText(13, 48, "TXT");
		 Mainframe_GlobalFunctionLib.sendText(16, 69, "Y");
		 Mainframe_GlobalFunctionLib.pressKey("Enter");
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		 Thread.sleep(3000);
		 Mainframe_GlobalFunctionLib.pressKey("F3");
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
			Mainframe_GlobalFunctionLib.pressKey("F3");
			//Mainframe_GlobalFunctionLib.pressKey("F3");
		}	
	
public static void spoolFile(int i) throws Exception
	{
		Mainframe_GlobalFunctionLib.sendText(i, 3,"8");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.sendText(11, 3,"5");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.sendText(3, 22,"W40");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("PageDown");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("PageDown");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("PageDown");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("PageDown");
		Mainframe_GlobalFunctionLib.pressKey("F3");
	}
	
	@Then("^I verify Compound code \"([^\"]*)\" in Medicare Part D PDE Data Page$")
	public void i_verify_Compound_code_in_Medicare_Part_D_PDE_Data_Page(String Compoundcode) throws Throwable {
		Mainframe_GlobalFunctionLib.pressKey("F8");
		//String rxClaimId2="183270040164000";
		String rxClaimIdValue=PriceOverrideAfterSpecificHashOfFills.rxClaimId;
		System.out.println("Print Rx Claim ID: "+rxClaimIdValue);
		Reporter.addStepLog("Print Rx Claim ID: "+rxClaimIdValue);
		Mainframe_GlobalFunctionLib.sendText(4, 4,rxClaimIdValue);
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
			 Mainframe_GlobalFunctionLib.sendText(4, 23, "13");
			 Mainframe_GlobalFunctionLib.pressKey("Enter");
			 Mainframe_GlobalFunctionLib.pressKey("F9");
			 System.out.println("REACHED");
			 String filePDE=Mainframe_GlobalFunctionLib.getText(11, 5);
			 System.out.println("Actual Extract Status is: "+filePDE);
			 Reporter.addStepLog("Actual Extract Status is: "+filePDE);
			 Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			 if(!(filePDE.equals(null)))
			 {
				 System.out.println("PDE file is Generated: "+filePDE);
				 Reporter.addStepLog("PDE file is Generated: "+filePDE);
				 Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			 }
			 else{
				 System.out.println("Actual Extract Status is NULL");
				 Reporter.addStepLog("Actual Extract Status is NULL");
					Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			 }
		}
		}
	
		/*Mainframe_GlobalFunctionLib.pressKey("F10");
		Mainframe_GlobalFunctionLib.sendText(14, 2, "5");
		//Query: Which RxNo to be choosen
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F7");
		Mainframe_GlobalFunctionLib.sendText(4, 23, "13");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("F9");
		Mainframe_GlobalFunctionLib.sendText(11, 2, "5");
		//Query: Which file to be choosen
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
			Assert.fail("The text is not entered.Screenshot captured");
		}*/

			
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

	

