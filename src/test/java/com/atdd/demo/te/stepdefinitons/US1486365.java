package com.atdd.demo.te.stepdefinitons;

import org.testng.Assert;

import com.atdd.te.screenHelpers.FunctionalLibrary;
import com.cucumber.listener.Reporter;
import com.optumrx.autofusion.core.te.util.Mainframe_GlobalFunctionLib;
import com.optumrx.autofusion.core.te.util.Screenshot;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class US1486365 {
	public static String  DiagnosisListCodes;
	public static String  DiagnosisListQLCodes;
	@When("^I navigate to Active Plan GPI List with plan \"([^\"]*)\"$")
	public void i_navigate_to_Active_Plan_GPI_List_with_plan(String PlanCode) throws Throwable {
	/*	try {
			FunctionalLibrary.navigateToRxClaimPlanAdministrator();
		} catch (Exception e) {
			e.printStackTrace();
		}*/
			Mainframe_GlobalFunctionLib.sendText(21, 7, "4");
		    Mainframe_GlobalFunctionLib.pressKey("Enter");
		    Mainframe_GlobalFunctionLib.sendText(21, 7, "1");
		    Mainframe_GlobalFunctionLib.pressKey("Enter");
		    FunctionalLibrary.func_SearchAndSelectADataEditMode("4,5" ,PlanCode ,"11,6" , PlanCode);
		     Mainframe_GlobalFunctionLib.pressKey("F7");
			 Mainframe_GlobalFunctionLib.sendText(7, 21, "11");
			 Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			 Mainframe_GlobalFunctionLib.pressKey("Enter");
		}
	
	@When("^I add Super GPI list \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
	public void i_add_Super_GPI_list(String GPILIST, String Seq, String FromDate, String ThruDate, String ProcesQualifier,String GPINumber, String DaysSuppl, String RejCodeRemap, String DiagnosisListCode) throws Throwable {
		Mainframe_GlobalFunctionLib.pressKey("F7");
		Mainframe_GlobalFunctionLib.sendText(4, 5, GPILIST);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		if(Mainframe_GlobalFunctionLib.getText(9, 5).trim().equalsIgnoreCase(GPILIST))
	    {
	    	System.out.println("Actual GPI LIST found: "+GPILIST);
	    	Reporter.addStepLog("Actual GPI LIST found: "+GPILIST);
	    	Mainframe_GlobalFunctionLib.sendText(9, 2, "1");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(13, 17, Seq);
			Mainframe_GlobalFunctionLib.sendText(14, 17, FromDate);
			Mainframe_GlobalFunctionLib.sendText(14, 41, ThruDate);
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			Mainframe_GlobalFunctionLib.pressKey("PageDown");
			   		//Processing Qualifier
					if(ProcesQualifier.length()==0) {  
						Mainframe_GlobalFunctionLib.sendText(11, 24, " ");  
					}
					else{
						Mainframe_GlobalFunctionLib.sendText(11, 24, ProcesQualifier);
					}
					Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(16, 64, "Y");
			Mainframe_GlobalFunctionLib.pressKey("F12");
			int i;		
			label1: for(i=11; i< 15; i++)
				{
					try{
						if(Mainframe_GlobalFunctionLib.getText(i, 4).equals(Seq))
						{
							Mainframe_GlobalFunctionLib.sendText(i, 2, "7");
							Mainframe_GlobalFunctionLib.pressKey("Enter");
							Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
							Mainframe_GlobalFunctionLib.sendText(11, 2, "7");
							Mainframe_GlobalFunctionLib.pressKey("Enter");
							Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
							Mainframe_GlobalFunctionLib.pressKey("F16");
							Mainframe_GlobalFunctionLib.sendText(6, 4, GPINumber);
							Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
							Mainframe_GlobalFunctionLib.pressKey("Enter");
							if(Mainframe_GlobalFunctionLib.getText(12, 4).equals(GPINumber))
								 {
									Mainframe_GlobalFunctionLib.sendText(12, 2, "2");
									Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
									Mainframe_GlobalFunctionLib.pressKey("Enter");
									Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
									if(DaysSuppl.length()==0) {  
										Mainframe_GlobalFunctionLib.sendText(10, 20, " ");  
									}
									else{
										Mainframe_GlobalFunctionLib.sendText(10, 20, DaysSuppl);
									}
									Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
									Mainframe_GlobalFunctionLib.pressKey("PageDown");
									
									if(RejCodeRemap.length()==0) {  
										Mainframe_GlobalFunctionLib.sendText(20, 17, "          ");  
									}
									else{
										Mainframe_GlobalFunctionLib.sendText(20, 17, RejCodeRemap);
									}
									Reporter.addScreenCaptureFromPath(Screenshot.screenshot());	
									Mainframe_GlobalFunctionLib.pressKey("PageDown");
									Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
									if(DiagnosisListCode.length()==0) {  
										Mainframe_GlobalFunctionLib.sendText(9, 19, "      ");  
										Mainframe_GlobalFunctionLib.sendText(9, 57, " "); 
										Mainframe_GlobalFunctionLib.pressKey("Enter");
									}
									else{
										Mainframe_GlobalFunctionLib.sendText(9, 19, DiagnosisListCode);
										Mainframe_GlobalFunctionLib.sendText(9, 57, "E");
										Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
										Mainframe_GlobalFunctionLib.pressKey("Enter");
										Mainframe_GlobalFunctionLib.click(9, 19);
										Mainframe_GlobalFunctionLib.pressKey("F4");
										Mainframe_GlobalFunctionLib.sendText(9, 2, "7");
										Mainframe_GlobalFunctionLib.pressKey("Enter");
										Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
										DiagnosisListQLCodes=Mainframe_GlobalFunctionLib.getText(9, 2);
										System.out.println("Diagnosis List Qualifier Code is: "+DiagnosisListQLCodes);
								    	Reporter.addStepLog("Diagnosis List Qualifier Code is: "+DiagnosisListQLCodes);
										DiagnosisListCodes=Mainframe_GlobalFunctionLib.getText(9, 9);
										System.out.println("Diagnosis List Code is: "+DiagnosisListCodes);
								    	Reporter.addStepLog("Diagnosis List Code is: "+DiagnosisListCodes);
								    	Mainframe_GlobalFunctionLib.pressKey("F12");
									    Mainframe_GlobalFunctionLib.pressKey("F12");
										}
								}
								else
								{
									Mainframe_GlobalFunctionLib.pressKey("F6");
									Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
									Mainframe_GlobalFunctionLib.pressKey("F15");
									Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
									Mainframe_GlobalFunctionLib.sendText(6, 4, GPINumber);
									Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
									Mainframe_GlobalFunctionLib.pressKey("Enter");
									if(Mainframe_GlobalFunctionLib.getText(11, 4).equalsIgnoreCase(GPINumber))
									{
										Mainframe_GlobalFunctionLib.sendText(11, 2, "1");
										Mainframe_GlobalFunctionLib.pressKey("Enter");
										Mainframe_GlobalFunctionLib.pressKey("Enter");
										if(DaysSuppl.length()==0) {  
											Mainframe_GlobalFunctionLib.sendText(10, 20, " ");  
										}
										else{
											Mainframe_GlobalFunctionLib.sendText(10, 20, DaysSuppl);
										}
										Mainframe_GlobalFunctionLib.pressKey("PageDown");
										if(RejCodeRemap.length()==0) {  
											Mainframe_GlobalFunctionLib.sendText(20, 17, "          ");  
										}
										else{
											Mainframe_GlobalFunctionLib.sendText(20, 17, RejCodeRemap);
										}
										
										Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
										Mainframe_GlobalFunctionLib.pressKey("PageDown");
										Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
										if(DiagnosisListCode.length()==0) {  
											Mainframe_GlobalFunctionLib.sendText(9, 19, "      "); 
											Mainframe_GlobalFunctionLib.sendText(9, 57, " ");
											/*Mainframe_GlobalFunctionLib.pressKey("F12");
										    Mainframe_GlobalFunctionLib.pressKey("F12");*/
										}
										else{
											Mainframe_GlobalFunctionLib.sendText(9, 19, DiagnosisListCode);
											Mainframe_GlobalFunctionLib.sendText(9, 57, "E");
											Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
											Mainframe_GlobalFunctionLib.pressKey("Enter");
											Mainframe_GlobalFunctionLib.click(9, 19);
											Mainframe_GlobalFunctionLib.pressKey("F4");
											Mainframe_GlobalFunctionLib.sendText(9, 2, "7");
											Mainframe_GlobalFunctionLib.pressKey("Enter");
											Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
											DiagnosisListQLCodes=Mainframe_GlobalFunctionLib.getText(9, 2);
											System.out.println("Diagnosis List Qualifier Code is: "+DiagnosisListQLCodes);
									    	Reporter.addStepLog("Diagnosis List Qualifier Code is: "+DiagnosisListQLCodes);
											DiagnosisListCodes=Mainframe_GlobalFunctionLib.getText(9, 9);
											System.out.println("Diagnosis List Code is: "+DiagnosisListCodes);
									    	Reporter.addStepLog("Diagnosis List Code is: "+DiagnosisListCodes);
									    /*	Mainframe_GlobalFunctionLib.pressKey("F12");
										    Mainframe_GlobalFunctionLib.pressKey("F12");*/
									   }
										Mainframe_GlobalFunctionLib.pressKey("F12");
									    Mainframe_GlobalFunctionLib.pressKey("F12");
									}
								}
								break label1;
						   }
					   	}catch (Exception e)
							{
						   		break label1;
						   		/*System.out.println("Exception: "+e);
								Reporter.addStepLog("Exception: "+e);*/
					   		}
				}
			}
		    else
		    {
		    	System.out.println("Actual GPI LIST not found "+GPILIST);
		    	Reporter.addStepLog("Actual GPI LIST not found "+GPILIST);
		    }
	    Mainframe_GlobalFunctionLib.pressKey("F12");
	    Mainframe_GlobalFunctionLib.pressKey("F12");
	    Mainframe_GlobalFunctionLib.pressKey("F12");
	    Mainframe_GlobalFunctionLib.pressKey("F12");
	   //FunctionalLibrary.navigateToRxClaimPlanAdministrator();
	}
	
	@When("^I submit a claim by Diagnosis Code in list with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\", \"([^\"]*)\",\"([^\"]*)\"$")
	public void i_submit_a_claim_by_Diagnosis_Code_in_list_with(String bin, String proc, String group, String pharmacyID, String rxNbr, String refill, String fillDate, String memberID, String productID, String dspQty, String ds, String psc, String cost, String ExpectedDiagnosisListQLCodes, String ExpectedDiagnosisCode) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		FunctionalLibrary.CreateTransaction(bin, proc, group, pharmacyID, rxNbr, refill, fillDate, memberID, productID, dspQty, ds, psc, cost);
		 Mainframe_GlobalFunctionLib.pressKey("F14");
		 Mainframe_GlobalFunctionLib.sendText(5, 23, "2");
		 Mainframe_GlobalFunctionLib.pressKey("Enter");
		 if(ExpectedDiagnosisListQLCodes.length()==0) {  
			loop: for(int i=1; i <=10; i++)
			 {
				 try{
					 if(Mainframe_GlobalFunctionLib.getText(12, 5).length()>0)
					 {
						 Mainframe_GlobalFunctionLib.sendText(12, 2, "4");
						 Mainframe_GlobalFunctionLib.pressKey("Enter");
						 Mainframe_GlobalFunctionLib.sendText(16, 64, "Y");
						 }
					 }catch (Throwable e)
				 	{
					 	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
					 	break loop;
					
					}
			  }
		 	}
		 else
		 {
			 Mainframe_GlobalFunctionLib.pressKey("F6");
			 try{
					 if(DiagnosisListQLCodes.equalsIgnoreCase(ExpectedDiagnosisListQLCodes))
					 {
					 Mainframe_GlobalFunctionLib.sendText(14, 18, DiagnosisListQLCodes);
					 }
					 
					 if(DiagnosisListCodes.equalsIgnoreCase(ExpectedDiagnosisCode))
					 {
					 Mainframe_GlobalFunctionLib.sendText(15, 18, DiagnosisListCodes);
					 }
			   }catch (Throwable e) {
					Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
					Assert.fail("The Expected Diagnosis List Codes does not exists on the screen.Screenshot captured.");
					e.printStackTrace();
				}
			 Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			 Mainframe_GlobalFunctionLib.pressKey("Enter");
		 }
		 Mainframe_GlobalFunctionLib.pressKey("F12");
		 Mainframe_GlobalFunctionLib.pressKey("F12");
	    FunctionalLibrary.submitClaim();
	}

	@Then("^I verify GPI list in Claim Transaction Additional Info Plan Information \"([^\"]*)\"$")
	public void i_verify_GPI_list_in_Claim_Transaction_Additional_Info_Plan_Information(String ExpectedGPIlist) throws Throwable {
		Mainframe_GlobalFunctionLib.pressKey("F7");
		Mainframe_GlobalFunctionLib.pressKey("F7");
		Mainframe_GlobalFunctionLib.sendText(04, 23, "8");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F9");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		String GPIPlanList=Mainframe_GlobalFunctionLib.getText(11, 52);
		System.out.println("GPI Plan LIST : "+GPIPlanList);
    	Reporter.addStepLog("GPI Plan LIST : "+GPIPlanList);
    	String GPIPlanSuperList=Mainframe_GlobalFunctionLib.getText(11, 52);
			System.out.println("GPI Plan Super LIST : "+GPIPlanSuperList);
	    	Reporter.addStepLog("GPI Plan Super LIST : "+GPIPlanSuperList);
	    	System.out.println("Claim payed with GPI list : "+GPIPlanSuperList);
	    	Reporter.addStepLog("Claim payed with GPI list : "+GPIPlanSuperList);
    	if((ExpectedGPIlist.length()==0) && (GPIPlanList.length()==0))
    	{
    		System.out.println("Expected GPI LIST is blank");
	    	Reporter.addStepLog("Expected GPI LIST is blank");
	    }
    	else
    	{
    		FunctionalLibrary.validateText("11" ,"52" , ExpectedGPIlist );
    	}
    		
    	
	}

		    
}
