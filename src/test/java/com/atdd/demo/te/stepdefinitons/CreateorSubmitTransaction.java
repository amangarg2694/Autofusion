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
}


