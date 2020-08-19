package com.atdd.demo.te.stepdefinitons;

import java.io.IOException;
import java.sql.SQLException;

import com.hp.lft.report.ReportException;
import com.hp.lft.sdk.GeneralLeanFtException;
import com.optumrx.autofusion.core.te.util.Mainframe_GlobalFunctionLib;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Reprocessing {
	
	@And("^Setup a part-D plan with medicaid subrogation on 28 \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void partD_plan_Medicaid(String PlanCode, String PlanFromDate, String PlanDescription, String MedicaidFromDt, String MedicaidThruDt, String MedicaidSchedule, String CarrierID, String AccountID, String GroupID, String PlanThruDate, String PBP, String Contract, String Segment, String BenefitYear, String DrugCoverageStatusSchedule) throws IOException, ClassNotFoundException, GeneralLeanFtException, SQLException, ReportException, InterruptedException{
		Mainframe_GlobalFunctionLib.sendText(21, 7, "4");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(21, 7, "1");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Mainframe_GlobalFunctionLib.sendText(13, 19, PlanCode);
		Mainframe_GlobalFunctionLib.sendText(14, 19, PlanFromDate);
		Mainframe_GlobalFunctionLib.sendText(15, 19, PlanDescription);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(16, 64, "Y");
		Mainframe_GlobalFunctionLib.sendText(13, 77, "Y");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(16, 64, "Y");
		Mainframe_GlobalFunctionLib.pressKey("F7");
		Mainframe_GlobalFunctionLib.sendText(7, 21, "28");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(21, 12, "21");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Mainframe_GlobalFunctionLib.sendText(7, 13, MedicaidFromDt);
		Mainframe_GlobalFunctionLib.sendText(7, 41, MedicaidThruDt);
		Mainframe_GlobalFunctionLib.sendText(9, 13, MedicaidSchedule);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.sendText(21, 7, "14");
		Mainframe_GlobalFunctionLib.sendText(21, 7, "1");
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Mainframe_GlobalFunctionLib.sendText(4, 13, CarrierID);
		Mainframe_GlobalFunctionLib.sendText(5, 13, AccountID);
		Mainframe_GlobalFunctionLib.sendText(6, 13, GroupID);
		Mainframe_GlobalFunctionLib.sendText(7, 13, PlanCode);
		Mainframe_GlobalFunctionLib.pressKey("F4");
		
		if(Mainframe_GlobalFunctionLib.getText(10, 5)== PlanCode) {
			Mainframe_GlobalFunctionLib.sendText(10, 2, "1");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
		}
		Mainframe_GlobalFunctionLib.sendText(8, 13, PlanFromDate);
		Mainframe_GlobalFunctionLib.sendText(8, 41, PlanThruDate);
		
		Mainframe_GlobalFunctionLib.sendText(9, 11, Contract);
		Mainframe_GlobalFunctionLib.sendText(9, 22, PBP);
		Mainframe_GlobalFunctionLib.sendText(9, 35, Segment);
		Mainframe_GlobalFunctionLib.sendText(9, 53, BenefitYear);
		Mainframe_GlobalFunctionLib.sendText(14, 34, DrugCoverageStatusSchedule);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		
		if(Mainframe_GlobalFunctionLib.getText(24, 2) == "Invalid Contract/PBP/Segment for From/Thru Dates.") {
			Mainframe_GlobalFunctionLib.pressKey("F4");
		
			if(Mainframe_GlobalFunctionLib.getText(10, 5)== Contract && Mainframe_GlobalFunctionLib.getText(10, 15)==PBP && Mainframe_GlobalFunctionLib.getText(10, 20)== Segment && Mainframe_GlobalFunctionLib.getText(10, 25)== BenefitYear) {
				
				Mainframe_GlobalFunctionLib.sendText(10, 2, "1");
				Mainframe_GlobalFunctionLib.pressKey("Enter");
			}
			
			
		}
		
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		
		}
	
	@And("^submit a medicaid subrogation claim \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void submit_medical_subrogate_claim(String MemberID, String PayeeOverride, String SubbrogationFlag, String MedigapID, String MedicaidIndicator, String MedicaidIDNumber, String MedicaidAgencyNumber, String MedicaidPaidAmt) throws IOException, ClassNotFoundException, GeneralLeanFtException, SQLException, ReportException, InterruptedException{
		Mainframe_GlobalFunctionLib.sendText(21, 7, "3");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(21, 7, "2");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(21, 7, "10");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(4, 4, MemberID);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		
		if(Mainframe_GlobalFunctionLib.getText(9, 4)== MemberID) {
			Mainframe_GlobalFunctionLib.sendText(9, 2, "1");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
		}
		Mainframe_GlobalFunctionLib.sendText(13, 21, PayeeOverride);
		Mainframe_GlobalFunctionLib.sendText(16, 21, SubbrogationFlag);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(16, 64, "Y");
		Mainframe_GlobalFunctionLib.pressKey("F14");
		Mainframe_GlobalFunctionLib.sendText(5, 23, "10");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(8, 41, MedigapID);
		Mainframe_GlobalFunctionLib.sendText(10, 41, MedicaidIndicator);
		Mainframe_GlobalFunctionLib.sendText(11, 41, MedicaidIDNumber);
		Mainframe_GlobalFunctionLib.sendText(12, 41, MedicaidAgencyNumber);
		Mainframe_GlobalFunctionLib.sendText(16, 41, MedicaidPaidAmt);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Thread.sleep(3000);
		if(Mainframe_GlobalFunctionLib.getText(21, 6)=="P") {
		 
			System.out.println("Claim Paid");
			
		}else {
			
			System.out.println("Submit again");
		}
		String RxClaimNumber = Mainframe_GlobalFunctionLib.getText(20, 12);
		String seq = Mainframe_GlobalFunctionLib.getText(20, 30);
		System.out.println("RxClaim Number is "+RxClaimNumber +" "+seq);
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.sendText(21, 7, "CCT600");
		Mainframe_GlobalFunctionLib.pressKey("F3");
			}
	@And("^submit reprocessing for this member and for this claim \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void submit_reprocessing_claim(String MemberID, String ReprocessClaimFlag, String CostQualifier) throws IOException, ClassNotFoundException, GeneralLeanFtException, SQLException, ReportException, InterruptedException{
		Mainframe_GlobalFunctionLib.sendText(21, 7, "4");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(21, 7, "14");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(4, 4, "8");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(4, 4, "1");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(4, 5, MemberID);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		
		if(Mainframe_GlobalFunctionLib.getText(10, 5)==MemberID) {
			
			Mainframe_GlobalFunctionLib.sendText(10, 2, "7");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
		}
		Mainframe_GlobalFunctionLib.sendText(6, 48, ReprocessClaimFlag);
		Mainframe_GlobalFunctionLib.sendText(11, 79, CostQualifier);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
	
	
	}
	@And("^Submit reprocessing from member screen \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void submit_reprocessing_member_screen(String MemberID, String ReprocessReasonCode, String ReprocessNote) throws IOException, ClassNotFoundException, GeneralLeanFtException, SQLException, ReportException, InterruptedException{
		Mainframe_GlobalFunctionLib.sendText(21, 7, "1");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(21, 7, "2");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(4, 4, MemberID);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
        
		if(Mainframe_GlobalFunctionLib.getText(10, 4)==MemberID) {
			
			Mainframe_GlobalFunctionLib.sendText(10, 2, "2");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
		}
				Mainframe_GlobalFunctionLib.pressKey("F7");
				Mainframe_GlobalFunctionLib.sendText(15, 2, "7");
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(13, 40, "Y");
				Mainframe_GlobalFunctionLib.sendText(14, 28, ReprocessReasonCode);
				Mainframe_GlobalFunctionLib.sendText(15, 21, ReprocessNote);
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.pressKey("F3");
				Mainframe_GlobalFunctionLib.pressKey("F3");
				Mainframe_GlobalFunctionLib.pressKey("F3");
				Mainframe_GlobalFunctionLib.sendText(21, 7, "CCT600");
				Mainframe_GlobalFunctionLib.pressKey("Enter");
	}     	

	@Then("^Claim reprocessed$")
	public void claim_processed() throws IOException, ClassNotFoundException, GeneralLeanFtException, SQLException, ReportException, InterruptedException{
	
	System.out.println("Claim Reprocessed successfully");
	}
}
