package com.atdd.demo.te.stepdefinitons;

import com.atdd.te.screenHelpers.FunctionalLibrary;
import com.cucumber.listener.Reporter;
import com.optumrx.autofusion.core.te.util.Mainframe_GlobalFunctionLib;
import com.optumrx.autofusion.core.te.util.Screenshot;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SN003417_SR42278 {
	
	@When("^I submit Member Adjustment Load with Medical Data with \"([^\"]*)\", \"([^\"]*)\"$")
	public void i_submit_Member_Adjustment_Load_with_Medical_Data_with( String FileName, String Library) throws Throwable {

	   Mainframe_GlobalFunctionLib.sendText(5, 34, FileName);
	   Mainframe_GlobalFunctionLib.sendText(5, 34, Library);
	   Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	   Mainframe_GlobalFunctionLib.pressKey("F6");
	   FunctionalLibrary.navigateToRxClaimPlanAdministrator();
	   Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	}
	
	@Then("^I select option \"([^\"]*)\" for Member Accumulation Adjustments in Adjustment screen$")
	public void i_select_option_for_Member_Accumulation_Adjustments_in_Adjustment_screen(String arg1) throws Throwable {
		   Mainframe_GlobalFunctionLib.sendText(5, 20, "1");
		   Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		   Mainframe_GlobalFunctionLib.pressKey("Enter");
	}
	
	@When("^I create physical file with \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
	public void i_create_physical_file_with(String cmdCreatePhyFile,String FileName, String Library) throws Throwable {
	 //String cmdCreatePhyFile="CRTPF";
	 Mainframe_GlobalFunctionLib.sendText(21, 07, cmdCreatePhyFile);
	 Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	 Mainframe_GlobalFunctionLib.pressKey("Enter");
	 Mainframe_GlobalFunctionLib.sendText(21, 7, cmdCreatePhyFile);
	 Mainframe_GlobalFunctionLib.pressKey("Enter");
	 Mainframe_GlobalFunctionLib.sendText(5, 37, FileName);
	 Mainframe_GlobalFunctionLib.sendText(6, 39, "          ");
	 Mainframe_GlobalFunctionLib.sendText(6, 39,Library);
	 Mainframe_GlobalFunctionLib.sendText(10, 37,"399");
	 Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	 Mainframe_GlobalFunctionLib.pressKey("Enter");
	 Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	 try{
		 Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		 String actaulMsgCreatePhyFile=Mainframe_GlobalFunctionLib.getText(24, 2);
		 System.out.println("Create Physical File Message is : "+actaulMsgCreatePhyFile);
		 Reporter.addStepLog("Create Physical File Message is : "+actaulMsgCreatePhyFile);
		 String expectedMsgCreatePhyFile ="File "+FileName+" created in library "+Library+".";
		 System.out.println("Actual Physical File Message is : "+expectedMsgCreatePhyFile);
		 Reporter.addStepLog("Actual Physical File Message is : "+expectedMsgCreatePhyFile);
		 if(actaulMsgCreatePhyFile.equals(expectedMsgCreatePhyFile))
		 {
			 System.out.println("Expected Physical File Message is show: "+expectedMsgCreatePhyFile);
			 Reporter.addStepLog("Expected Physical File Message is show: "+expectedMsgCreatePhyFile);
		 }
		 else
		 {
			 System.out.println("Expected Physical File Message is not show: "+expectedMsgCreatePhyFile);
			 Reporter.addStepLog("Expected Physical File Message is not show: "+expectedMsgCreatePhyFile);
		 }
	   }catch (Exception e)
	    {}
	}

	@When("^I work with file \"([^\"]*)\" with command \"([^\"]*)\"$")
	public void i_work_with_file_with_command(String cmdWorkWithFile, String FileName, String Library) throws Throwable {
		 //String cmdWorkWithFile="ywrkf";
		try{
			 Mainframe_GlobalFunctionLib.sendText(21, 7, cmdWorkWithFile);
			 Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			 Mainframe_GlobalFunctionLib.pressKey("Enter");
			 Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			 Mainframe_GlobalFunctionLib.sendText(5, 37, FileName);
			 Mainframe_GlobalFunctionLib.sendText(6, 39, "          ");
			 Mainframe_GlobalFunctionLib.sendText(6, 39,Library);
			 Mainframe_GlobalFunctionLib.pressKey("Enter");
			 Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			 Mainframe_GlobalFunctionLib.pressKey("F9");
			 String data="JZTEST341JZ3417TESTLOAD JZ3417TESTING  JZ3417MBR1  1181120    COMMERCIAL000003100 52018-11-02-15.29.03.09000000001   BC 143050123";
			 Mainframe_GlobalFunctionLib.sendText(8, 41, data);
			 Mainframe_GlobalFunctionLib.pressKey("Enter");
				 Mainframe_GlobalFunctionLib.sendText(24, 73, "Y");
				 Mainframe_GlobalFunctionLib.pressKey("Enter");
				 
			Mainframe_GlobalFunctionLib.pressKey("F13");
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			try{
				label3: for(int i=8; i <22; i ++)
				{
						String ActualData=Mainframe_GlobalFunctionLib.getText(8, 4);
						 System.out.println("ActualData is: "+ActualData);
						 Reporter.addStepLog("ActualData is: "+ActualData);
					
						if(ActualData.length()>=0)
						{
							if(data.contains(ActualData))
							{
								System.out.println("Expected ActualData is: "+ActualData);
								Reporter.addStepLog("Expected ActualData is: "+ActualData);
							}
							else
							{
								System.out.println("Not Expected ActualData is: "+ActualData);
								Reporter.addStepLog("Not Expected ActualData is: "+ActualData);
							}
						}
						else
						{
							System.out.println("No Records found");
							Reporter.addStepLog("No Records found");
							break label3;
						}
					}//end of For loop
				}catch (Exception e)
				{
					System.out.println("Unknown");
					Reporter.addStepLog("Unknown");
				}
			Mainframe_GlobalFunctionLib.pressKey("F3");
		}catch (Exception e)
		{
			 Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			 String ErrWorkWithFile=Mainframe_GlobalFunctionLib.getText(24, 2);
			 System.out.println("Error Work With File Message is : "+ErrWorkWithFile);
			 Reporter.addStepLog("Error Work With File Message is : "+ErrWorkWithFile);
			 System.exit(0);
		}
		
	}
	
	@Then("^I validate Manual Adjustment details page$")
	public void i_validate_Manual_Adjustment_details_page() throws Throwable {
		 Mainframe_GlobalFunctionLib.sendText(15, 2, "5");
		 Mainframe_GlobalFunctionLib.pressKey("Enter");
		 Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		 String actualCarrier= Mainframe_GlobalFunctionLib.getText(5, 11);
		 System.out.println("Carrier @ RCMAD0033-Manual Adjustment Detail Page is: "+actualCarrier);
		 Reporter.addStepLog("Carrier @ RCMAD0033-Manual Adjustment Detail Page is: "+actualCarrier);
		 
		 String actualAccount= Mainframe_GlobalFunctionLib.getText(6, 11);
		 System.out.println("Account @ RCMAD0033-Manual Adjustment Detail Page is: "+actualAccount);
		 Reporter.addStepLog("Account @ RCMAD0033-Manual Adjustment Detail Page is: "+actualAccount);
		 
		 String actualGroup= Mainframe_GlobalFunctionLib.getText(7, 11);
		 System.out.println("Group @ RCMAD0033-Manual Adjustment Detail Page is: "+actualGroup);
		 Reporter.addStepLog("Group @ RCMAD0033-Manual Adjustment Detail Page is: "+actualGroup);
		 
		 String actualAdjustmentDate= Mainframe_GlobalFunctionLib.getText(10, 24);
		 System.out.println("Adjustment Date @ RCMAD0033-Manual Adjustment Detail Page is: "+actualAdjustmentDate);
		 Reporter.addStepLog("Adjustment Date @ RCMAD0033-Manual Adjustment Detail Page is: "+actualAdjustmentDate);
		 
		 String actualAdjustmentTime1= Mainframe_GlobalFunctionLib.getText(10, 52);
		 String actualAdjustmentTime2= Mainframe_GlobalFunctionLib.getText(10, 64);
		 System.out.println("Adjustment Time @ RCMAD0033-Manual Adjustment Detail Page is: "+actualAdjustmentTime1+" "+actualAdjustmentTime2);
		 Reporter.addStepLog("Adjustment Time @ RCMAD0033-Manual Adjustment Detail Page is: "+actualAdjustmentTime1+" "+actualAdjustmentTime2);
		 
		 String actualAmount= Mainframe_GlobalFunctionLib.getText(14, 24);
		 System.out.println("Actual Amount @ RCMAD0033-Manual Adjustment Detail Page is: "+actualAmount);
		 Reporter.addStepLog("Actual Amount @ RCMAD0033-Manual Adjustment Detail Page is: "+actualAmount);
		 
		 String actualTimeStamp= Mainframe_GlobalFunctionLib.getText(18, 24);
		 System.out.println("Actual Time Stamp @ RCMAD0033-Manual Adjustment Detail Page is: "+actualTimeStamp);
		 Reporter.addStepLog("Actual Time Stamp @ RCMAD0033-Manual Adjustment Detail Page is: "+actualTimeStamp);
		 
		
	}

}
