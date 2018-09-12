package com.atdd.demo.te.stepdefinitons;

import com.atdd.te.screenHelpers.FunctionalLibrary;
import com.cucumber.listener.Reporter;
import com.optumrx.autofusion.core.te.util.Mainframe_GlobalFunctionLib;
import com.optumrx.autofusion.core.te.util.Screenshot;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SN003331 {
	//Venkats
	
	@When("^I verify the PatientPayTable exists in \"([^\"]*)\"$")
	public void i_verify_the_PatientPayTable_exists_in(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String SearchValue = Mainframe_GlobalFunctionLib.getText(4, 5);
		String ResultValue = Mainframe_GlobalFunctionLib.getText(10, 5);
		if(SearchValue.equals(ResultValue))
		{
			System.out.println("Search Value PatientPayTable exists:"+SearchValue);
		}
		else
		{
			System.out.println("Search Value PatientPayTable doesnt exists:"+SearchValue);
			System.exit(0);
		}
	}
	

	@When("^I enter \"([^\"]*)\" details$")
	public void i_enter_details(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 	Thread.sleep(3000);
			Mainframe_GlobalFunctionLib.click(7, 12);
		    Mainframe_GlobalFunctionLib.pressKey("F4");
		    Thread.sleep(3000);
		    Mainframe_GlobalFunctionLib.sendText(8, 2,"1");
		    Mainframe_GlobalFunctionLib.pressKey("Enter");
		    Thread.sleep(3000);
	}
	
	@When("^I verify the AmountValue in \"([^\"]*)\"$")
	public void i_verify_the_AmountValue_in(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String AmountValue = Mainframe_GlobalFunctionLib.getText(11, 21);
		System.out.println("Amount Value is: "+AmountValue);
	}
		    
	@When("^I verify the Medicaid Subrogation pricing logic \"([^\"]*)\" exists in \"([^\"]*)\"$")
	public void i_verify_the_Medicaid_Subrogation_pricing_logic_exists_in(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String ActualNoteMedicaid = "Medicaid Subrogation pricing logic";
		String ExpdNoteMedicaid = Mainframe_GlobalFunctionLib.getText(9, 7);
		if(ExpdNoteMedicaid.equals(null))
		{
			System.out.println("Claim note is NULL");
		}
		else if (ActualNoteMedicaid.equals(ExpdNoteMedicaid))
				{
					System.out.println("Claim note for Medicaid Subrogation shown as: "+ExpdNoteMedicaid);
				}
				else
				{
					System.out.println("Claim note for Medicaid Subrogation is not Created");
				}
			}
		
	    
	    
	@When("^I verify the Prevented negative amount due \"([^\"]*)\" exists in \"([^\"]*)\"$")
	public void i_verify_the_Prevented_negative_amount_due_exists_in(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String ActualNotePrevented_negative_amount = "prevented negative amount due.";
		String ExpdNotePrevented_negative_amount = Mainframe_GlobalFunctionLib.getText(10, 7);
		if(ExpdNotePrevented_negative_amount.equals(null))
		{
			System.out.println("Claim note is NULL");
		}
		else if(ActualNotePrevented_negative_amount.equals(ExpdNotePrevented_negative_amount))
			{
				System.out.println("Claim note for Prevented negative amount due show as: "+ExpdNotePrevented_negative_amount);
			}
			else
			{
				System.out.println("Claim note for Prevented negative amount due is not Created");
			}
			}
	
		
	@When("^I verify the \"([^\"]*)\" of Prevented negative amount due or Medicaid Subrogation pricing logic exists in \"([^\"]*)\"$")
	public void i_verify_the_of_Prevented_negative_amount_due_or_Medicaid_Subrogation_pricing_logic_exists_in(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String ActualNoteMedicaid = "Medicaid Subrogation pricing logic";
		String ExpdNoteMedicaid = Mainframe_GlobalFunctionLib.getText(9, 7);
		if(ExpdNoteMedicaid.equals(null))
		{
			System.out.println("Claim note is NULL");
		}
		else if (ActualNoteMedicaid.equals(ExpdNoteMedicaid))
				{
					System.out.println("Claim note for Medicaid Subrogation shown as: "+ExpdNoteMedicaid);
				}
				else
				{
					System.out.println("Claim note for Medicaid Subrogation is not Created");
				}
			
	String ActualNotePrevented_negative_amount = "prevented negative amount due.";
	String ExpdNotePrevented_negative_amount = Mainframe_GlobalFunctionLib.getText(9, 7);
	if(ExpdNotePrevented_negative_amount.equals(null))
	{
		System.out.println("Claim note is NULL");
	}
	else if(ActualNotePrevented_negative_amount.equals(ExpdNotePrevented_negative_amount))
		{
			System.out.println("Claim note for Prevented negative amount due show as: "+ExpdNotePrevented_negative_amount);
		}
		else
		{
			System.out.println("Claim note for Prevented negative amount due is not Created");
		}
		}
	
	
	
	@When("^I Verify the RxClaim Number \"([^\"]*)\"$")
	public void i_Verify_the_RxClaim_Number(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String RejCode = Mainframe_GlobalFunctionLib.getText(21, 12);
		if(!(RejCode.equals(null)))
		{
			Thread.sleep(3000);
			String RxClaim_Number = Mainframe_GlobalFunctionLib.getText(20, 12);
			System.out.println("RxClaim Number is generated: "+RxClaim_Number);
		}
		else
		{
			System.out.println("RxClaim Rejected with Code: "+RejCode);
			System.exit(0);
		}
		
	}


	@When("^I verify the pricingOutput \"([^\"]*)\"$")
	public void i_verify_the_pricingOutput(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String CostCalculated = Mainframe_GlobalFunctionLib.getText(9, 20);
		//System.out.println("CostCalculated Value is:"+CostCalculated);
		if(CostCalculated.equals("5.00"))
		{
			System.out.println("Cost Calculated value is shown as: "+CostCalculated);
		}
		else
		{
			System.out.println("Cost Calculated value is shown wrong as: "+CostCalculated);
		}
		
		String PatCalculated = Mainframe_GlobalFunctionLib.getText(16, 20);
		//System.out.println("PatCalculated Value is:"+PatCalculated);
		if(PatCalculated.equals("10.00"))
		{
			System.out.println("PAT Calculated value is shown as: "+PatCalculated);
		}
		else
		{
			System.out.println("PAT Calculated value is shown wrong as: "+PatCalculated);
		}
		
		String DueCalculated = Mainframe_GlobalFunctionLib.getText(20, 20);
		if(DueCalculated.equals("5.00-"))
		{
			System.out.println("Due Calculated value is shown as: "+DueCalculated);
		}
		else
		{
			System.out.println("Due Calculated value is shown wrong as: "+DueCalculated);
		}
				
	}
	
	@Then("^I go Back to \"([^\"]*)\"$")
	public void i_go_Back_to(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		//FunctionalLibrary.navigateToRxClaimPlanAdministrator();
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Thread.sleep(3000);
	    Mainframe_GlobalFunctionLib.pressKey("F3");
	    Thread.sleep(3000);
	    Mainframe_GlobalFunctionLib.pressKey("F3");
	    Thread.sleep(3000);
	    Mainframe_GlobalFunctionLib.pressKey("F3");
	    Thread.sleep(3000);
	    Mainframe_GlobalFunctionLib.sendText(21, 7,"20");
	    Thread.sleep(3000);
	    Mainframe_GlobalFunctionLib.pressKey("Enter");
	    Thread.sleep(3000);
	    
	    
	}
	
	@When("^I verify Approved Due Amount in \"([^\"]*)\"$")
	public void i_verify_Approved_Due_Amount_in(String arg1) throws Throwable {
		String CostApproved = Mainframe_GlobalFunctionLib.getText(9, 32);
		if(CostApproved.equals("10.00"))
		{
			System.out.println("Cost Approved value is shown as: "+CostApproved);
		}
		else
		{
			System.out.println("Cost Approved value is show wrong as: "+CostApproved);
		}
		String PatApproved = Mainframe_GlobalFunctionLib.getText(16, 32);
		if(PatApproved.equals("10.00"))
		{
			System.out.println("PAT Approved value is shown as: "+PatApproved);
		}
		else
		{
			System.out.println("PAT Approved value is shown wrong as: "+PatApproved);
		}
		String DueApproved = Mainframe_GlobalFunctionLib.getText(20, 32);
		if(DueApproved.equals(""))
		{
			System.out.println("Due Approved value is shown as NULL");
		}
		else
		{
			System.out.println("Due Approved value is shown wrong as: "+DueApproved);
		}
	}
/*	
	@Then("^Validate \"([^\"]*)\" on \"([^\"]*)\"$")
	public void validate_on(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String CostApproved = Mainframe_GlobalFunctionLib.getText(9, 32);
		if(CostApproved.equals("10.00"))
		{
			System.out.println("Cost Approved value is shown as: "+CostApproved);
		}
		else
		{
			System.out.println("Cost Approved value is show wrong as: "+CostApproved);
		}
		String PatApproved = Mainframe_GlobalFunctionLib.getText(16, 32);
		if(PatApproved.equals("10.00"))
		{
			System.out.println("PAT Approved value is shown as: "+PatApproved);
		}
		else
		{
			System.out.println("PAT Approved value is shown wrong as: "+PatApproved);
		}
		String DueApproved = Mainframe_GlobalFunctionLib.getText(20, 32);
		if(DueApproved.equals(""))
		{
			System.out.println("Due Approved value is shown as NULL");
		}
		else
		{
			System.out.println("Due Approved value is shown wrong as: "+DueApproved);
		}
	}*/
	
	@Then("^Validate \"([^\"]*)\" when Medicaid Subrogation = N and Negative amount Due = Y$")
	public void validate_when_Medicaid_Subrogation_N_and_Negative_amount_Due_Y(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String CostApproved = Mainframe_GlobalFunctionLib.getText(9, 32);
		if(CostApproved.equals("5.00"))
		{
			System.out.println("Cost Approved value is shown as: "+CostApproved);
		}
		else
		{
			System.out.println("Cost Approved value is show wrong as: "+CostApproved);
		}
		
		String PatApproved = Mainframe_GlobalFunctionLib.getText(16, 32);
		if(PatApproved.equals("10.00"))
		{
			System.out.println("PAT Approved value is shown as: "+PatApproved);
		}
		else
		{
			System.out.println("PAT Approved value is shown wrong as: "+PatApproved);
		}
		
		String DueApproved = Mainframe_GlobalFunctionLib.getText(20, 32);
		if(DueApproved.equals("5.00-"))
		{
			System.out.println("Due Approved value is shown as "+DueApproved);
		}
		else
		{
			System.out.println("Due Approved value is shown wrong as: "+DueApproved);
		}
	}
	
	@When("^I verify by submitting Extract Job \"([^\"]*)\" on Batch Extract Process Menu$")
	public void i_verify_by_submitting_Extract_Job_on_Batch_Extract_Process_Menu(String ExtractDate) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.sendText(21, 7,"1");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(7, 33,ExtractDate);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(24, 73,"Y");
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Mainframe_GlobalFunctionLib.sendText(24, 73,"Y");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
	}
		
	@When("^I verify work submitted Jobs \"([^\"]*)\" status$")
	public void i_verify_work_submitted_Jobs_status(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String wsQuery="ws";
		Mainframe_GlobalFunctionLib.sendText(21, 7,wsQuery);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		int MaxTime=500;
		int i=0;
		String JobN="OUTQ";
		String JobActualName="EXTRACTJOB";
		/*for(i=0;i<MaxTime;i++)
		{		*/
		String JobName= Mainframe_GlobalFunctionLib.getText(11, 7).trim();
		if(JobActualName.equals(JobName))
		{
			do
			{
				String JobStatus= Mainframe_GlobalFunctionLib.getText(11, 40).trim();
				if(JobStatus.equals(JobN))
				{
					System.out.println("Job Status is: "+JobStatus);
					break;
				}
				Mainframe_GlobalFunctionLib.pressKey("F5");
				i++;
				Thread.sleep(3000);
			}while(i<MaxTime);
			Mainframe_GlobalFunctionLib.pressKey("F3");
			Mainframe_GlobalFunctionLib.pressKey("F3");
			}
	else
	{
		System.out.println("Job not created");
		System.exit(0);
	}
	}
	
		@When("^I verify work submitted Batch \"([^\"]*)\" status$")
	public void i_verify_work_submitted_Batch_status(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String wsQuery="ws";
		Mainframe_GlobalFunctionLib.sendText(21, 7,wsQuery);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		int MaxTime=500;
		int i=0;
		String JobN="OUTQ";
		String JobActualName="GENFILED0";
		/*for(i=0;i<MaxTime;i++)
		{		*/
		String JobName= Mainframe_GlobalFunctionLib.getText(12, 7).trim();
		if(JobActualName.equals(JobName))
		{
			do
			{
				String JobStatus= Mainframe_GlobalFunctionLib.getText(12, 40).trim();
				if(JobStatus.equals(JobN))
				{
					System.out.println("Job Status is: "+JobStatus);
					break;
				}
				Mainframe_GlobalFunctionLib.pressKey("F5");
				i++;
				Thread.sleep(3000);
			}while(i<MaxTime);
			Mainframe_GlobalFunctionLib.pressKey("F3");
			
			}
	else
	{
		System.out.println("Job not created");
		System.exit(0);
	}
	}
	
	
	@When("^I enter \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" on NCPDPDBatchOutputFormat screen$")
	public void i_enter_on_NCPDPDBatchOutputFormat_screen(String FileName, String Library, String FromDate, String ThruDate, String CarrierFrom, String CarrierThru, String AccountFrom, String AccountThru, String GroupFrom, String GroupThru, String PayeeFrom, String PayeeThru, String PharmacyFrom, String PharmacyThru, String SenderID, String ReceiverID, String FinancialAmountsUsed) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.sendText(5, 34,FileName);
		Mainframe_GlobalFunctionLib.sendText(5, 60,Library);
		Mainframe_GlobalFunctionLib.sendText(8, 34,FromDate);
		Mainframe_GlobalFunctionLib.sendText(8, 52,ThruDate);
		Mainframe_GlobalFunctionLib.sendText(10, 34,CarrierFrom);
		Mainframe_GlobalFunctionLib.sendText(10, 52,CarrierThru);
		Mainframe_GlobalFunctionLib.sendText(12, 34,AccountFrom);
		Mainframe_GlobalFunctionLib.sendText(12, 52,AccountThru);
		Mainframe_GlobalFunctionLib.sendText(14, 34,GroupFrom);
		Mainframe_GlobalFunctionLib.sendText(14, 52,GroupThru);
		Mainframe_GlobalFunctionLib.sendText(16, 34,PayeeFrom);
		Mainframe_GlobalFunctionLib.sendText(16, 52,PayeeThru);
		Mainframe_GlobalFunctionLib.sendText(17, 34,PharmacyFrom);
		Mainframe_GlobalFunctionLib.sendText(17, 52,PharmacyThru);
		Mainframe_GlobalFunctionLib.sendText(19, 34,SenderID);
		Mainframe_GlobalFunctionLib.sendText(20, 34,ReceiverID);
		Mainframe_GlobalFunctionLib.sendText(21, 37,FinancialAmountsUsed);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F6");
			}
	
	@When("^I verify adding \"([^\"]*)\" to library list$")
	public void i_verify_adding_to_library_list(String DBLibrary) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String qry="edtlibl";
		Mainframe_GlobalFunctionLib.sendText(21, 7,qry);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Thread.sleep(3000);
		Mainframe_GlobalFunctionLib.sendText(7, 12,DBLibrary);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Thread.sleep(3000);
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Thread.sleep(3000);
	}
	
	@When("^I verify dbu \"([^\"]*)\", \"([^\"]*)\" to library list$")
	public void i_verify_dbu_to_library_list(String FileName, String Library) throws Throwable {
		String dbuqry="dbu";
	 	Mainframe_GlobalFunctionLib.sendText(21, 7,dbuqry);
		Mainframe_GlobalFunctionLib.pressKey("F4");
		Thread.sleep(3000);
		Mainframe_GlobalFunctionLib.sendText(5, 37,"        ");
		Mainframe_GlobalFunctionLib.sendText(5, 37,FileName);
		Mainframe_GlobalFunctionLib.sendText(6, 39,Library);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Thread.sleep(3000);
		Mainframe_GlobalFunctionLib.pressKey("F21");
		Mainframe_GlobalFunctionLib.sendText(6, 16,"chg");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		
		Mainframe_GlobalFunctionLib.sendText(6, 16,"w170");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(10, 32,"8");
		Mainframe_GlobalFunctionLib.sendText(10, 33,"4");
		Mainframe_GlobalFunctionLib.sendText(10, 34,"1");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.sendText(8, 7,"1");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F3");
	}
	
	@When("^I verify Batch Medicaid Subrogation Load \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" submitting$")
	public void i_verify_Batch_Medicaid_Subrogation_Load_submitting(String FileName, String Library, String MedicaidSubrogation) throws Throwable {
	    Mainframe_GlobalFunctionLib.sendText(21, 7,"21");
	    Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(21, 7,"2");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(21, 7,"4");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(21, 7,"5");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(3, 31,FileName);
		Mainframe_GlobalFunctionLib.sendText(4, 31,Library);
		Mainframe_GlobalFunctionLib.sendText(20, 72,MedicaidSubrogation);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F6");
	}
	

	@Then("^I validate \"([^\"]*)\" in Submitted Jobs and passed records in spoolfile$")
	public void i_validate_in_Submitted_Jobs_and_passed_records_in_spoolfile(String FileName) throws Throwable {
		
	    Mainframe_GlobalFunctionLib.sendText(21, 7,"ws");
	   	Mainframe_GlobalFunctionLib.pressKey("Enter");
		Thread.sleep(3000);
		int MaxCount=500;
		int i=0;
		String JobN="OUTQ";
		String JobName= Mainframe_GlobalFunctionLib.getText(13, 7).trim();
		if(JobName.equals(FileName))
		{
			do
			{
				String JobStatus= Mainframe_GlobalFunctionLib.getText(13, 40).trim();
				if(JobStatus.equals(JobN))
				{
					System.out.println("Job Status is: "+JobStatus);
					Mainframe_GlobalFunctionLib.sendText(13, 3,"8");
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					Mainframe_GlobalFunctionLib.sendText(11, 3,"5");
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					//Mainframe_GlobalFunctionLib.pressKey("PageDown");
					//Mainframe_GlobalFunctionLib.pressKey("PageDown");
					Mainframe_GlobalFunctionLib.sendText(4,22,"RECORDS BYPASSED:");
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					Mainframe_GlobalFunctionLib.pressKey("F16");
					String[] Records =Mainframe_GlobalFunctionLib.getText(7, 30).split("                          ") ;
					//String[] Record1 =Records.split("INVALID");
					
					String PassedRecords= Records[0].trim();
					System.out.println("Value of records passed:" +PassedRecords);
						if(PassedRecords.equals("0"))
						{
							System.out.println("RECORDS BYPASSED: 0 ");
							Reporter.addScreenCaptureFromPath(Screenshot.screenshot());

						}
						else
						{
							System.out.println("RECORDS BYPASSED:  "+PassedRecords);
							Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
						}
						break;
				}
				else
				{
					System.out.println("Job Status is: "+JobStatus);
				}
				Mainframe_GlobalFunctionLib.pressKey("F5");
				Thread.sleep(6000);
				i++;
				
			}while(i<MaxCount);
			Mainframe_GlobalFunctionLib.pressKey("F3");
			
			}
	else
	{
		System.out.println("Job not created");
		System.exit(0);
	}
	}
	}
	
		
		
		
		
		
		
	

	
	

