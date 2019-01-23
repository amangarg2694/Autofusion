package com.atdd.demo.te.stepdefinitons;

import com.optumrx.autofusion.core.te.util.Mainframe_GlobalFunctionLib;

import cucumber.api.java.en.When;

public class ECL_ChangeForMedicaid {

	@When("^I send \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" for reject remap claim submission$")
	public void i_send_for_reject_remap_claim_submission(String Plan, String BIN, String ProcCtrl, String Group, String PharmacyID, String RxNo, String Refill, String FillDate, String MemberID, String ProductID, String DspQty, String DS, String PSC, String Cost) throws Throwable {
	    
		Mainframe_GlobalFunctionLib.sendText(4, 5 , Plan);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(11, 2,"2");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F7");
		Mainframe_GlobalFunctionLib.sendText(7, 21 ,"10" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(11, 2 ,"7" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(11, 2 ,"2" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("PageDown");
		Mainframe_GlobalFunctionLib.sendText(20,17,"    " );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.sendText(12, 2 ,"2" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("PageDown");
		Mainframe_GlobalFunctionLib.sendText(20,17,"ABAS" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		RejectRemapClaimSubmission(BIN,ProcCtrl, Group, PharmacyID,RxNo,Refill,FillDate,MemberID,ProductID,DspQty,DS,PSC, Cost);
		
		
	}
	
	@When("^I send \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" for reject remap claim submissionTwo$")
	public void i_send_for_reject_remap_claim_submissionTwo(String Plan, String BIN, String ProcCtrl, String Group, String PharmacyID, String RxNo, String Refill, String FillDate, String MemberID, String ProductID, String DspQty, String DS, String PSC, String Cost) throws Throwable {
	    
		Mainframe_GlobalFunctionLib.sendText(4, 5 , Plan);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(11, 2,"2");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F7");
		Mainframe_GlobalFunctionLib.sendText(7, 21 ,"10" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(11, 2 ,"7" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(11, 2 ,"2" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("PageDown");
		Mainframe_GlobalFunctionLib.sendText(20,17,"ABAS" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.sendText(12, 2 ,"2" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("PageDown");
		Mainframe_GlobalFunctionLib.sendText(20,17,"    " );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		
		
		RejectRemapClaimSubmission(BIN,ProcCtrl, Group, PharmacyID,RxNo,Refill,FillDate,MemberID,ProductID,DspQty,DS,PSC, Cost);
		
			
	}
	
	@When("^I send \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" for reject remap claim submissionThree with GPI$")
	public void i_send_for_reject_remap_claim_submissionThree_with_GPI(String Plan, String BIN, String ProcCtrl, String Group, String PharmacyID, String RxNo, String Refill, String FillDate, String MemberID, String ProductID, String DspQty, String DS, String PSC, String Cost) throws Throwable {
	    
		Mainframe_GlobalFunctionLib.sendText(4, 5 , Plan);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(11, 2,"2");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F7");
		Mainframe_GlobalFunctionLib.sendText(7, 21 ,"11" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(11, 2 ,"7" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(12, 2 ,"2" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("PageDown");
		Mainframe_GlobalFunctionLib.sendText(20,17,"ABAS" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.sendText(13, 2 ,"2" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("PageDown");
		Mainframe_GlobalFunctionLib.sendText(20,17,"    " );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		
		
		RejectRemapClaimSubmission(BIN,ProcCtrl, Group, PharmacyID,RxNo,Refill,FillDate,MemberID,ProductID,DspQty,DS,PSC, Cost);
		
	}
	
	@When("^I send \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" for reject remap claim submissionFour with GPI$")
	public void i_send_for_reject_remap_claim_submissionFour_with_GPI(String Plan, String BIN, String ProcCtrl, String Group, String PharmacyID, String RxNo, String Refill, String FillDate, String MemberID, String ProductID, String DspQty, String DS, String PSC, String Cost) throws Throwable {
	   
		Mainframe_GlobalFunctionLib.sendText(4, 5 , Plan);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(11, 2,"2");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F7");
		Mainframe_GlobalFunctionLib.sendText(7, 21 ,"11" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(11, 2 ,"7" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(12, 2 ,"2" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("PageDown");
		Mainframe_GlobalFunctionLib.sendText(20,17,"    " );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.sendText(13, 2 ,"2" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("PageDown");
		Mainframe_GlobalFunctionLib.sendText(20,17,"ABAS" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		
		
		RejectRemapClaimSubmission(BIN,ProcCtrl, Group, PharmacyID,RxNo,Refill,FillDate,MemberID,ProductID,DspQty,DS,PSC, Cost);
		
		
		
	}

	@When("^I send \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" for reject remap claim submissionFive with GPI$")
	public void i_send_for_reject_remap_claim_submissionFive_with_GPI(String Plan, String BIN, String ProcCtrl, String Group, String PharmacyID, String RxNo, String Refill, String FillDate, String MemberID, String ProductID, String DspQty, String DS, String PSC, String Cost) throws Throwable {
	 
		Mainframe_GlobalFunctionLib.sendText(4, 5 , Plan);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(11, 2,"2");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F7");
		Mainframe_GlobalFunctionLib.sendText(7, 21 ,"11" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(11, 2 ,"7" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(12, 2 ,"2" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("PageDown");
		Mainframe_GlobalFunctionLib.sendText(20,17,"    " );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.sendText(13, 2 ,"2" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("PageDown");
		Mainframe_GlobalFunctionLib.sendText(20,17,"    " );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.sendText(11, 2 ,"7" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(14, 2 ,"2" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("PageDown");
		Mainframe_GlobalFunctionLib.sendText(20,17,"ABAS" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		
		
		RejectRemapClaimSubmission(BIN,ProcCtrl, Group, PharmacyID,RxNo,Refill,FillDate,MemberID,ProductID,DspQty,DS,PSC, Cost);
		
		
		
		
	}
	
	@When("^I send \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" for reject remap claim submissionSixSpecialityOral with NDC$")
	public void i_send_for_reject_remap_claim_submissionSixSpecialityOral_with_NDC(String Plan, String BIN, String ProcCtrl, String Group, String PharmacyID, String RxNo, String Refill, String FillDate, String MemberID, String ProductID, String DspQty, String DS, String PSC, String Cost) throws Throwable {
	    
		Mainframe_GlobalFunctionLib.sendText(4, 5 , Plan);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(11, 2,"2");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F7");
		Mainframe_GlobalFunctionLib.sendText(7, 21 ,"10" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(12, 2 ,"7" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(11, 2 ,"2" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("PageDown");
		Mainframe_GlobalFunctionLib.sendText(20,17,"ABAS" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		
		
		RejectRemapClaimSubmission(BIN,ProcCtrl, Group, PharmacyID,RxNo,Refill,FillDate,MemberID,ProductID,DspQty,DS,PSC, Cost);
		
		
	}
	
	
	
	
	
	@When("^I send \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" for reject remap claim submissionSixSpecialityOral with GPI$")
	public void i_send_for_reject_remap_claim_submissionSixSpecialityOral_with_GPI(String Plan, String BIN, String ProcCtrl, String Group, String PharmacyID, String RxNo, String Refill, String FillDate, String MemberID, String ProductID, String DspQty, String DS, String PSC, String Cost) throws Throwable {
	    
		Mainframe_GlobalFunctionLib.sendText(4, 5 , Plan);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(11, 2,"2");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F7");
		Mainframe_GlobalFunctionLib.sendText(7, 21 ,"11" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(12, 2 ,"7" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(12, 2 ,"2" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("PageDown");
		Mainframe_GlobalFunctionLib.sendText(20,17,"ABAS" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		
		
		RejectRemapClaimSubmission(BIN,ProcCtrl, Group, PharmacyID,RxNo,Refill,FillDate,MemberID,ProductID,DspQty,DS,PSC, Cost);
		
	}
	
	
	@When("^I send \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" for reject remap Preferred Formulary NDC claim submission$")
	public void i_send_for_reject_remap_Preferred_Formulary_NDC_claim_submission(String Plan, String BIN, String ProcCtrl, String Group, String PharmacyID, String RxNo, String Refill, String FillDate, String MemberID, String ProductID, String DspQty, String DS, String PSC, String Cost) throws Throwable {
	    
		
		Mainframe_GlobalFunctionLib.sendText(4, 5 , Plan);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(11, 2,"2");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F7");
		Mainframe_GlobalFunctionLib.sendText(7, 21 ,"26" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(16, 12 ,"1" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(12, 2 ,"7" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(11, 2 ,"2" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(9,69,"ABAS" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.sendText(12, 2 ,"2" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(9,69,"    " );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		
		
		
		RejectRemapClaimSubmission(BIN,ProcCtrl, Group, PharmacyID,RxNo,Refill,FillDate,MemberID,ProductID,DspQty,DS,PSC, Cost);
				
		
	}
	
	
	@When("^I send \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" for reject remap Preferred Formulary NDC claim submissionTwo$")
	public void i_send_for_reject_remap_Preferred_Formulary_NDC_claim_submissionTwo(String Plan, String BIN, String ProcCtrl, String Group, String PharmacyID, String RxNo, String Refill, String FillDate, String MemberID, String ProductID, String DspQty, String DS, String PSC, String Cost) throws Throwable {
	 
		Mainframe_GlobalFunctionLib.sendText(4, 5 , Plan);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(11, 2,"2");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F7");
		Mainframe_GlobalFunctionLib.sendText(7, 21 ,"26" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(16, 12 ,"1" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(12, 2 ,"7" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(11, 2 ,"2" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(9,69,"    " );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.sendText(12, 2 ,"2" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(9,69,"ABAS" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		
			
		RejectRemapClaimSubmission(BIN,ProcCtrl, Group, PharmacyID,RxNo,Refill,FillDate,MemberID,ProductID,DspQty,DS,PSC, Cost);
			
		
	}
	
	
	@When("^I send \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" for reject remap Preferred Formulary GPI claim submission$")
	public void i_send_for_reject_remap_Preferred_Formulary_GPI_claim_submission(String Plan, String BIN, String ProcCtrl, String Group, String PharmacyID, String RxNo, String Refill, String FillDate, String MemberID, String ProductID, String DspQty, String DS, String PSC, String Cost) throws Throwable {
	    
		Mainframe_GlobalFunctionLib.sendText(4, 5 , Plan);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(11, 2,"2");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F7");
		Mainframe_GlobalFunctionLib.sendText(7, 21 ,"26" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(16, 12 ,"2" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(12, 2 ,"7" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Thread.sleep(1000);
		Mainframe_GlobalFunctionLib.sendText(11, 2 ,"2" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(11,69,"    " );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.sendText(12, 2 ,"2" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(11,69,"ABAS" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		
		
		RejectRemapClaimSubmission(BIN,ProcCtrl, Group, PharmacyID,RxNo,Refill,FillDate,MemberID,ProductID,DspQty,DS,PSC, Cost);
		
		
	}

	@When("^I send \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" for reject remap Preferred Formulary GPI claim submissionTwo$")
	public void i_send_for_reject_remap_Preferred_Formulary_GPI_claim_submissionTwo(String Plan, String BIN, String ProcCtrl, String Group, String PharmacyID, String RxNo, String Refill, String FillDate, String MemberID, String ProductID, String DspQty, String DS, String PSC, String Cost) throws Throwable {
	    
		
		Mainframe_GlobalFunctionLib.sendText(4, 5 , Plan);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(11, 2,"2");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F7");
		Mainframe_GlobalFunctionLib.sendText(7, 21 ,"26" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(16, 12 ,"2" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(12, 2 ,"7" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(11, 2 ,"2" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(11,69,"ABAS" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.sendText(12, 2 ,"2" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(11,69,"    " );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		
		RejectRemapClaimSubmission(BIN,ProcCtrl, Group, PharmacyID,RxNo,Refill,FillDate,MemberID,ProductID,DspQty,DS,PSC, Cost);
		
		
	}
	
	public void RejectRemapClaimSubmission(String BIN, String ProcCtrl, String Group, String PharmacyID, String RxNo, String Refill, String FillDate, String MemberID, String ProductID, String DspQty, String DS, String PSC, String Cost) throws Throwable {
	   
		    Mainframe_GlobalFunctionLib.sendText(21, 7 , "3");
		    Mainframe_GlobalFunctionLib.pressKey("Enter");
		    Mainframe_GlobalFunctionLib.sendText(21, 7,"2");
		    Mainframe_GlobalFunctionLib.pressKey("Enter");
		    Mainframe_GlobalFunctionLib.sendText(21, 7 ,"1" );
		    Mainframe_GlobalFunctionLib.pressKey("Enter");
		    Mainframe_GlobalFunctionLib.pressKey("F6");
			Mainframe_GlobalFunctionLib.sendText(11, 14,BIN);
			Mainframe_GlobalFunctionLib.sendText(11, 41,ProcCtrl);
			Mainframe_GlobalFunctionLib.sendText(11, 59,Group);
			Mainframe_GlobalFunctionLib.sendText(12, 14,PharmacyID);
			Mainframe_GlobalFunctionLib.sendText(12, 41,RxNo);
			Mainframe_GlobalFunctionLib.sendText(12, 59,Refill);
			Mainframe_GlobalFunctionLib.sendText(14, 14, FillDate + "    ");
			Mainframe_GlobalFunctionLib.click(14, 41);
			Mainframe_GlobalFunctionLib.pressKey("F4");
			Mainframe_GlobalFunctionLib.sendText(3,4,MemberID);
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(8, 2,"1");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.click(11, 20);
			Mainframe_GlobalFunctionLib.pressKey("F4");
			Mainframe_GlobalFunctionLib.pressKey("F16");
			Mainframe_GlobalFunctionLib.sendText(4, 4,ProductID);
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(9, 2,"1");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(12, 11,DspQty);
			Mainframe_GlobalFunctionLib.sendText(12, 26,DS );
			Mainframe_GlobalFunctionLib.sendText(14, 6,PSC );
			Mainframe_GlobalFunctionLib.sendText(10, 47,"         ");
			Mainframe_GlobalFunctionLib.sendText(10, 47,Cost);
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.pressKey("F6");
			
	}
	
	
}
