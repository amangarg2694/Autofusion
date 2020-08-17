package com.atdd.demo.te.stepdefinitons;

import com.atdd.te.screenHelpers.FunctionalLibrary;
import com.optumrx.autofusion.core.te.util.Mainframe_GlobalFunctionLib;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PlanMaintenanceUtilityOnDEAClass {
	

	@When("^verify plan is updated with \"([^\"]*)\",\"([^\"]*)\"$")
	public void verify_plan_is_updated_with(String SuperNDC, String SuperGPI) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		Thread.sleep(5000);
		Mainframe_GlobalFunctionLib.sendText(13, 2, "2");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
	    Mainframe_GlobalFunctionLib.click(9, 68 );
	    Thread.sleep(3000);
		Mainframe_GlobalFunctionLib.sendText(9, 68, SuperNDC+"     ");
		Mainframe_GlobalFunctionLib.click(10, 68 );
		Mainframe_GlobalFunctionLib.sendText(10, 68, SuperGPI+" ");
		Mainframe_GlobalFunctionLib.pressKey("F9");
		Mainframe_GlobalFunctionLib.click(5, 60 );
		Mainframe_GlobalFunctionLib.sendText(5, 60, SuperNDC+"     ");
		Mainframe_GlobalFunctionLib.click(7, 60 );
		Mainframe_GlobalFunctionLib.sendText(7, 60, SuperGPI+" ");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(16, 64, "Y");
	    for (int i = 0; i < 7; i++)
	    {
			Mainframe_GlobalFunctionLib.pressKey("F12");
		}
	    
	    
}
		
	@When("^I create plan template with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_create_plan_template_with(String TemplateID, String PlanCode, String fromdate, String DEAclasscode, String DEAfromdate, String Action) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Mainframe_GlobalFunctionLib.sendText(15, 23, TemplateID);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Thread.sleep(2000);
		
		Mainframe_GlobalFunctionLib.sendText(16, 64, "Y");
		Thread.sleep(2000);
		Mainframe_GlobalFunctionLib.sendText(9, 51, "X");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(7, 15, PlanCode);
		Mainframe_GlobalFunctionLib.sendText(7, 26, fromdate);
		Mainframe_GlobalFunctionLib.sendText(7, 49, PlanCode);
		Mainframe_GlobalFunctionLib.sendText(7, 60, fromdate);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(16, 64, "Y");
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Mainframe_GlobalFunctionLib.sendText(4, 20, DEAclasscode);
		Mainframe_GlobalFunctionLib.sendText(7, 20, DEAfromdate);
		Mainframe_GlobalFunctionLib.sendText(8, 20, Action);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		
	}
		
	@When("^I update plan with \"([^\"]*)\",\"([^\"]*)\" ,\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\", \"([^\"]*)\",\"([^\"]*)\" ,\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_update_plan_with(String SuperNDCProcess, String SuperGPIProcess, String SuperNDCNewValue, String SuperGPINewValue, String ActPrc, String ActExstVal, String ActNewVal, String DrgStsPrc, String DrgStsExstVal, String DrgStsNewVal, String SuperNDCExstValue, String SuperGPIExstValue) throws Throwable{
	    // Write code here that turns the phrase above into concrete actions
	    
		Mainframe_GlobalFunctionLib.sendText(11, 35, SuperNDCProcess);
		Mainframe_GlobalFunctionLib.sendText(11, 59, SuperNDCNewValue);
		Mainframe_GlobalFunctionLib.sendText(12, 35, SuperGPIProcess);
		Mainframe_GlobalFunctionLib.sendText(12, 59, SuperGPINewValue);
		Mainframe_GlobalFunctionLib.sendText(11, 42, SuperNDCExstValue);
		Mainframe_GlobalFunctionLib.sendText(12, 42, SuperGPIExstValue);
		
		Mainframe_GlobalFunctionLib.sendText(13, 35, ActPrc);
		Mainframe_GlobalFunctionLib.sendText(13, 42, ActExstVal);
		Mainframe_GlobalFunctionLib.sendText(13, 59, ActNewVal);
		Mainframe_GlobalFunctionLib.sendText(14, 35, DrgStsPrc);
		Mainframe_GlobalFunctionLib.sendText(14, 42, DrgStsExstVal);
		Mainframe_GlobalFunctionLib.sendText(14, 59, DrgStsNewVal);
		
		FunctionalLibrary.pressKey("PageDown");
		FunctionalLibrary.pressKey("PageDown");
		Mainframe_GlobalFunctionLib.sendText(15, 35, SuperNDCProcess);
		Mainframe_GlobalFunctionLib.sendText(15, 42, SuperNDCExstValue);
		Mainframe_GlobalFunctionLib.sendText(15, 59, SuperNDCNewValue);
		Mainframe_GlobalFunctionLib.sendText(16, 35, SuperGPIProcess);
		Mainframe_GlobalFunctionLib.sendText(16, 42, SuperGPIExstValue);
		Mainframe_GlobalFunctionLib.sendText(16, 59, SuperGPINewValue);	
		
		
		Mainframe_GlobalFunctionLib.pressKey("Enter");
	    Mainframe_GlobalFunctionLib.pressKey("F12");
	    Mainframe_GlobalFunctionLib.pressKey("F6");
	    Mainframe_GlobalFunctionLib.sendText(16, 64, "Y");
	    
		
		String status=Mainframe_GlobalFunctionLib.getText(9, 18);
		if(status.equals("Completed"))
		{
			System.out.println("Plan template is updated successfully");
		}
		else{
			System.out.println("Plan template is not updated");
		}
		
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		
		
	}
	
	@Then("^validate the plan with \"([^\"]*)\",\"([^\"]*)\"$")
	public void validate_the_plan_with(String SuperNDCNewValue, String SuperGPINewValue) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    Thread.sleep(5000);
	    
	    Mainframe_GlobalFunctionLib.sendText(13, 2, "2");
	    Mainframe_GlobalFunctionLib.pressKey("Enter");
	    String SuperNDCList1=Mainframe_GlobalFunctionLib.getText(9, 68);
	    String SuperGPIList1=Mainframe_GlobalFunctionLib.getText(10, 68);
	    Mainframe_GlobalFunctionLib.pressKey("F9");
	    String SuperNDCList2=Mainframe_GlobalFunctionLib.getText(5, 60);
	    String SuperGPIList2=Mainframe_GlobalFunctionLib.getText(7, 60);
	    if(SuperNDCList1.equals(SuperNDCNewValue) && SuperNDCList2.equals(SuperNDCNewValue))
	    	
	    
	    {
	    	System.out.println("SuperNDCNewValue is updated successfully");
	    }
	    else{
	    	System.out.println("SuperNDCNewValue is not updated");
	    }
	    
	    if(SuperGPIList1.equals(SuperGPINewValue) && SuperGPIList2.equals(SuperGPINewValue) )
	    {
	    	System.out.println("SuperGPINewValue is updated successfully");
	    }
	    else{
	    	System.out.println("SuperGPINewValue is not updated");
	    }
	    Thread.sleep(3000);
	    for (int i = 0; i < 7; i++)
	    {
			Mainframe_GlobalFunctionLib.pressKey("F12");
		}
	}
	
	@When("^I modify plan with \"([^\"]*)\",\"([^\"]*)\" ,\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\", \"([^\"]*)\",\"([^\"]*)\" ,\"([^\"]*)\"$")
	public void i_modify_plan_with(String SuperNDCProcess, String SuperGPIProcess, String SuperNDCNewValue, String SuperGPINewValue, String ActPrc, String ActExstVal, String ActNewVal, String DrgStsPrc, String DrgStsExstVal, String DrgStsNewVal) throws Throwable{
	    // Write code here that turns the phrase above into concrete actions
	    
		Mainframe_GlobalFunctionLib.sendText(11, 35, SuperNDCProcess);
		Mainframe_GlobalFunctionLib.sendText(11, 59, SuperNDCNewValue);
		Mainframe_GlobalFunctionLib.sendText(12, 35, SuperGPIProcess);
		Mainframe_GlobalFunctionLib.sendText(12, 59, SuperGPINewValue);
		//Mainframe_GlobalFunctionLib.sendText(11, 42, SuperNDCExstValue);
		//Mainframe_GlobalFunctionLib.sendText(12, 42, SuperGPIExstValue);
		
		Mainframe_GlobalFunctionLib.sendText(13, 35, ActPrc);
		Mainframe_GlobalFunctionLib.sendText(13, 42, ActExstVal);
		Mainframe_GlobalFunctionLib.sendText(13, 59, ActNewVal);
		Mainframe_GlobalFunctionLib.sendText(14, 35, DrgStsPrc);
		Mainframe_GlobalFunctionLib.sendText(14, 42, DrgStsExstVal);
		Mainframe_GlobalFunctionLib.sendText(14, 59, DrgStsNewVal);
	    FunctionalLibrary.pressKey("PageDown");
		FunctionalLibrary.pressKey("PageDown");
		Mainframe_GlobalFunctionLib.sendText(15, 35, SuperNDCProcess);
		//Mainframe_GlobalFunctionLib.sendText(15, 42, SuperNDCExstValue);
		Mainframe_GlobalFunctionLib.sendText(15, 59, SuperNDCNewValue);
		Mainframe_GlobalFunctionLib.sendText(16, 35, SuperGPIProcess);
		//Mainframe_GlobalFunctionLib.sendText(16, 42, SuperGPIExstValue);
		Mainframe_GlobalFunctionLib.sendText(16, 59, SuperGPINewValue);	
		
		
		Mainframe_GlobalFunctionLib.pressKey("Enter");
	    Mainframe_GlobalFunctionLib.pressKey("F12");
	    Mainframe_GlobalFunctionLib.pressKey("F6");
	    Mainframe_GlobalFunctionLib.sendText(16, 64, "Y");
	    
		
		String status=Mainframe_GlobalFunctionLib.getText(9, 18);
		if(status.equals("Completed"))
		{
			System.out.println("Plan template is updated successfully");
		}
		else{
			System.out.println("Plan template is not updated");
		}
		
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		
		
	}
	
	@When("^verify DEAClassTwo is updated with \"([^\"]*)\",\"([^\"]*)\"$")
	public void verify_DEAClassTwo_is_updated_with(String SuperNDC, String SuperGPI) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
            Thread.sleep(5000);
			Mainframe_GlobalFunctionLib.sendText(14, 2, "2");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
		    Mainframe_GlobalFunctionLib.click(9, 68 );
		    Thread.sleep(3000);
			Mainframe_GlobalFunctionLib.sendText(9, 68, SuperNDC+"     ");
			Mainframe_GlobalFunctionLib.click(10, 68 );
			Mainframe_GlobalFunctionLib.sendText(10, 68, SuperGPI+" ");
			Mainframe_GlobalFunctionLib.pressKey("F9");
			Mainframe_GlobalFunctionLib.click(5, 60 );
			Mainframe_GlobalFunctionLib.sendText(5, 60, SuperNDC+"     ");
			Mainframe_GlobalFunctionLib.click(7, 60 );
			Mainframe_GlobalFunctionLib.sendText(7, 60, SuperGPI+" ");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(16, 64, "Y");
			Thread.sleep(3000);
		    for (int i = 0; i < 7; i++)
		    {
				Mainframe_GlobalFunctionLib.pressKey("F12");
			}
		    
		    
	}
	
	@Then("^validate the DEAClassTwo with \"([^\"]*)\",\"([^\"]*)\"$")
	public void validate_the_DEAClassTwo_with(String SuperNDCNewValue, String SuperGPINewValue) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    Thread.sleep(5000);
	    
	    Mainframe_GlobalFunctionLib.sendText(14, 2, "2");
	    Mainframe_GlobalFunctionLib.pressKey("Enter");
	    String SuperNDCList1=Mainframe_GlobalFunctionLib.getText(9, 68);
	    String SuperGPIList1=Mainframe_GlobalFunctionLib.getText(10, 68);
	    Mainframe_GlobalFunctionLib.pressKey("F9");
	    String SuperNDCList2=Mainframe_GlobalFunctionLib.getText(5, 60);
	    String SuperGPIList2=Mainframe_GlobalFunctionLib.getText(7, 60);
	    if(SuperNDCList1.equals(SuperNDCNewValue) && SuperNDCList2.equals(SuperNDCNewValue))
	    	
	    
	    {
	    	System.out.println("SuperNDCNewValue is updated successfully");
	    }
	    else{
	    	System.out.println("SuperNDCNewValue is not updated");
	    }
	    if(SuperGPIList1.equals(SuperGPINewValue) && SuperGPIList2.equals(SuperGPINewValue))
	    
	    {
	    	System.out.println("SuperGPINewValue is updated successfully");
	    }
	    else{
	    	System.out.println("SuperGPINewValue is not updated");
	    }
	    Thread.sleep(3000);
	    for (int i = 0; i < 7; i++)
	    {
			Mainframe_GlobalFunctionLib.pressKey("F12");
		}
	}
			
	@When("^verify plan details with \"([^\"]*)\",\"([^\"]*)\"$")
	public void verify_plan_details_with(String SuperNDC, String SuperGPI) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    Thread.sleep(5000);
	    
	    Mainframe_GlobalFunctionLib.sendText(13, 2, "5");
	    Mainframe_GlobalFunctionLib.pressKey("Enter");
	    String SuperNDCList1=Mainframe_GlobalFunctionLib.getText(9, 68);
	    String SuperGPIList1=Mainframe_GlobalFunctionLib.getText(10, 68);
	    Mainframe_GlobalFunctionLib.pressKey("F9");
	    String SuperNDCList2=Mainframe_GlobalFunctionLib.getText(5, 60);
	    String SuperGPIList2=Mainframe_GlobalFunctionLib.getText(7, 60);
	    Thread.sleep(3000);
	    for (int i = 0; i < 7; i++)
	    {
			Mainframe_GlobalFunctionLib.pressKey("F12");
		}
	}
	
	@When("^verify DEAClasstwo details with \"([^\"]*)\",\"([^\"]*)\"$")
	public void verify_DEAClasstwo_details_with(String SuperNDC, String SuperGPI) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
	    
	    Mainframe_GlobalFunctionLib.sendText(14, 2, "5");
	    Mainframe_GlobalFunctionLib.pressKey("Enter");
	    String SuperNDCList1=Mainframe_GlobalFunctionLib.getText(9, 68);
	    String SuperGPIList1=Mainframe_GlobalFunctionLib.getText(10, 68);
	    Mainframe_GlobalFunctionLib.pressKey("F9");
	    String SuperNDCList2=Mainframe_GlobalFunctionLib.getText(5, 60);
	    String SuperGPIList2=Mainframe_GlobalFunctionLib.getText(7, 60);
	    Thread.sleep(3000);
	    for (int i = 0; i < 7; i++)
	    {
			Mainframe_GlobalFunctionLib.pressKey("F12");
		}
	}
	
	
	
	
	    
	}


