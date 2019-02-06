package com.atdd.demo.te.stepdefinitons;

import java.io.IOException;

import org.testng.Assert;

import com.atdd.te.screenHelpers.FunctionalLibrary;
import com.cucumber.listener.Reporter;
import com.optumrx.autofusion.core.te.util.Mainframe_GlobalFunctionLib;
import com.optumrx.autofusion.core.te.util.Screenshot;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateorSubmitTransaction {

	@Then("^Validate Claim Status is \"([^\"]*)\"$")
	public void validate_Claim_Status_is(String claimStatus) throws Throwable {
	 
		FunctionalLibrary.validateText("21" ,"6" , claimStatus );
		
	}
	
	@Then("^Validate Reversal Claim Status is \"([^\"]*)\"$")
	public void validate_Reversal_Claim_Status_is(String claimStatus) throws Throwable {
	 	
		FunctionalLibrary.validateText("20" ,"6" , claimStatus );
	}
	
	@When("^I submit the claim with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_submit_the_claim_with(String bin, String proc, String group, String pharmacyID, String refill, String prc,String fillDate, String memberID, String productID, String dspQty, String ds, String psc,String cost) throws Throwable {
		String rxNbr = FunctionalLibrary.func_GenerateDynamicRxNo();
		FunctionalLibrary.CreateTransaction(bin, proc, group, pharmacyID, rxNbr, refill, fillDate, memberID, productID, dspQty, ds, psc, cost);
		System.out.println("PRC :" + prc);
		if(prc.length()==0)
			prc="  ";
		Mainframe_GlobalFunctionLib.sendText(7, 68, prc);
		FunctionalLibrary.submitClaim();
	}

	@Then("^Validate PA Number is \"([^\"]*)\"$")
	public void validate_PA_Number_is(String paNumber) throws Throwable {
		FunctionalLibrary.validateText("16" ,"21" , paNumber );
		//FunctionalLibrary.pressKey("F12");
		//FunctionalLibrary.pressKey("F12");
		
	}

	@Then("^Validate PA Type is \"([^\"]*)\"$")
	public void validate_PA_Type_is(String paType) throws Throwable {
		FunctionalLibrary.validateText("16" ,"14" , paType );
	}

	@Then("^Validate Claim Note Type is \"([^\"]*)\" and Claim Note is \"([^\"]*)\"$")
	public void validate_Claim_Note_Type_is_Claim_Note_is(String claimNoteType,String claimNote)  {
		try{
		String actualNote = null;
		String actualNoteType = null;
		
		if(((claimNoteType.length()==0) &&(claimNote.length()==0)))
		{claimNoteType = "";
		claimNote="";
		System.out.println("claim note length:"+claimNote.length()+"trim length:"+claimNote.trim().length());
		}
		FunctionalLibrary.pressKey("F14");
		try{
		actualNoteType = FunctionalLibrary.getText(9 ,3);
				}catch(Exception e){
			actualNoteType="";
		}
		try{
		actualNote = FunctionalLibrary.getText(9, 7);
		actualNote = actualNote +" "+FunctionalLibrary.getText(10, 7);
		if(actualNote.trim().length()!=0){
		if(actualNote.length()==25)
			actualNote = "";
		}
		
		}
		catch(Exception e)
		{
			actualNote="";
			System.out.println("Claim note type is not present");
		}
			try {
				FunctionalLibrary.func_CompareStrings(actualNoteType.trim() ,claimNoteType.trim()  );
				FunctionalLibrary.func_CompareStrings(actualNote.trim() ,claimNote.trim()  );
			} catch (Throwable e) {
				
				e.printStackTrace();
			}
			
		
		FunctionalLibrary.pressKey("F12");
		}
		catch (IOException e) {			
			e.printStackTrace();
		}
	}
	
	@Then("^Validate Claim Note is \"([^\"]*)\"$")
	public void validate__Claim_Note_is(String claimNote)  {
		try{
		String actualNote = null;
		
		
		if(((claimNote.length()==0)))
		{
		claimNote="";
		}
		FunctionalLibrary.pressKey("F14");		
		try{
		actualNote = FunctionalLibrary.getText(9, 7);
		actualNote = actualNote +" "+FunctionalLibrary.getText(10, 7);
		actualNote = actualNote +" "+FunctionalLibrary.getText(11, 7);
		if(actualNote.trim().length()!=0){
		if(actualNote.length()==25)
			actualNote = "";
		}
		
		}
		catch(Exception e)
		{
			actualNote="";
			System.out.println("Claim note is not present");
		}
			try{
			FunctionalLibrary.func_CompareStrings(actualNote.trim() ,claimNote.trim()  );
			} catch (Throwable e) {
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				Assert.fail("The text "+ claimNote.trim()+" does not match on the screen.Screenshot captured.");
				
				e.printStackTrace();
			}
			
		
		FunctionalLibrary.pressKey("F12");
		}
		catch (IOException e) {			
			e.printStackTrace();
		}
	}
	
		
	@Then("^Validate Claim Status is \"([^\"]*)\"\"([^\"]*)\"$")
	public void validate_Claim_Status_is(String claimSts, String rejectCode) throws Throwable {
		FunctionalLibrary.validateText("20" ,"6" , claimSts );
		if(rejectCode.length()!=0)
		FunctionalLibrary.validateText("20" ,"12" , rejectCode );
	}

	@Then("^Validate Drug Status is \"([^\"]*)\"$")
	public void validate_Drug_Status_is(String drugStatus) throws Throwable {
	    
		FunctionalLibrary.pressKey("F7");
		Mainframe_GlobalFunctionLib.sendText(4, 23,"8");
		FunctionalLibrary.pressKey("Enter");
	    FunctionalLibrary.validateText("7" ,"22" , drugStatus );
	    FunctionalLibrary.pressKey("F12");
	    FunctionalLibrary.pressKey("F12");
	}
	
	@Then("^Validate the Claim Message is \"([^\"]*)\"$")
	public void validate_the_Claim_Message_is(String claimMessage) throws Throwable {
		if(claimMessage.length()==0)
			claimMessage="";
		FunctionalLibrary.validateText("21" ,"13" , claimMessage );
	}
	
	@Then("^Validate claim DUR/PPS details \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void validate_claim_DUR_PPS_details(String durResponse, String serviceType, String additionalText) throws Throwable {
		String text = null;
		FunctionalLibrary.pressKey("F7");
		Mainframe_GlobalFunctionLib.sendText(4, 23,"5");
		FunctionalLibrary.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(14, 2,"5");
		FunctionalLibrary.pressKey("Enter");
		FunctionalLibrary.validateText("20" ,"32" , durResponse );
		FunctionalLibrary.validateText("10" ,"66" , serviceType );
		text = FunctionalLibrary.getText(16, 18);
		text = text +" "+FunctionalLibrary.getText(17, 18);
		try{
			FunctionalLibrary.func_CompareStrings(text.trim() ,additionalText.trim()  );
			} catch (Throwable e) {
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				Assert.fail("The text "+ additionalText.trim()+" does not match on the screen.Screenshot captured.");
				
				e.printStackTrace();
			}
			
	}
	
	@When("^Validate Claim Status is \"([^\"]*)\" and reject code \"([^\"]*)\"$")
	public void validate_Claim_Status_is_and_reject_code(String claimSts, String rejectCode) throws Throwable {
		FunctionalLibrary.validateText("21" ,"6" , claimSts );
		if(rejectCode.length()!=0)
		FunctionalLibrary.validateText("21" ,"12" , rejectCode );
	}
	
	@Then("^Validate PA Number \"([^\"]*)\" on DRD screen$")
	public void validate_PA_Number_on_DRD_screen(String paNumber) throws Throwable {
		FunctionalLibrary.validateText("11" ,"66" , paNumber );
	}
	
	@When("^I set the claim transaction \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_set_the_claim_transaction(String bin, String proc, String group, String pharmacyID, String refill, String fillDate, String memberID, String productID, String prescriberQual , String prescriberID,String dspQty, String ds, String psc, String cost, String due, String ucw, String fee) throws Throwable {
		   FunctionalLibrary.CreateTransaction(bin, proc, group, pharmacyID, memberID,refill, fillDate, memberID, productID, dspQty, ds, psc, cost);
		Mainframe_GlobalFunctionLib.sendText(9 , 33 ,"1");
		if(fee.length()!=0){
		Mainframe_GlobalFunctionLib.sendText(11 , 47 ,"         ");
		Mainframe_GlobalFunctionLib.sendText(11 , 47 ,fee);
		}
		if(due.length()!=0){
			Mainframe_GlobalFunctionLib.sendText(19 , 47 ,"         ");			
			Mainframe_GlobalFunctionLib.sendText(19 , 47 ,due);
		}
		if(ucw.length()!=0){
		 Mainframe_GlobalFunctionLib.sendText(20 , 47 ,"         ");		 
		 Mainframe_GlobalFunctionLib.sendText(20 , 47 ,ucw);
		}
		Mainframe_GlobalFunctionLib.sendText(19 , 19 ,"  ");
		Mainframe_GlobalFunctionLib.sendText(19 , 19 ,prescriberQual);
		Mainframe_GlobalFunctionLib.sendText(19 , 26 ,"               ");
		Mainframe_GlobalFunctionLib.sendText(19 , 26 ,prescriberID);
		
	}
	
	@When("^I add diagnosis code to claim transaction \"([^\"]*)\",\"([^\"]*)\"$")
	public void i_add_diagnosis_code_to_claim_transaction(String qualifier, String diagnosisCode) throws Throwable {
		FunctionalLibrary.pressKey("F14");
		Mainframe_GlobalFunctionLib.sendText(5 , 23 ,"2");
		FunctionalLibrary.pressKey("Enter");
		FunctionalLibrary.pressKey("F6");
		Mainframe_GlobalFunctionLib.sendText(14 ,18 ,qualifier);
		Mainframe_GlobalFunctionLib.sendText(15 ,18 ,diagnosisCode);
		FunctionalLibrary.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");
	}
	
	@When("^I enter DPA Number on claim transaction \"([^\"]*)\"$")
	public void i_enter_DPA_Number_on_claim_transaction(String dpaNumber) throws Throwable {
		Mainframe_GlobalFunctionLib.sendText(18 , 19 ,"1");
		Mainframe_GlobalFunctionLib.sendText(18 , 26 ,dpaNumber);
	}
}


