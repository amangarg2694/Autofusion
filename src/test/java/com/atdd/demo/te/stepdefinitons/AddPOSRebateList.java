package com.atdd.demo.te.stepdefinitons;

import org.testng.Assert;

import com.cucumber.listener.Reporter;
import com.optumrx.autofusion.core.te.util.Mainframe_GlobalFunctionLib;
import com.optumrx.autofusion.core.te.util.Screenshot;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddPOSRebateList {
	
	@When("^I update the plan with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_update_the_plan_with(String plan,String Flob, String Fform, String Fspec, String Fbrate, String FAdminRate, String FPricePR, String FBrandfg, String FCrspec, String FCompre, String Fltd) throws Throwable {
		
		
		// Write code here that turns the phrase above into concrete actions
		
		try
		{
		 Mainframe_GlobalFunctionLib.sendText(4, 5, plan);
		 Mainframe_GlobalFunctionLib.pressKey("Enter");
		 Mainframe_GlobalFunctionLib.sendText(11, 2, "2");
		 Mainframe_GlobalFunctionLib.pressKey("Enter");
		 Mainframe_GlobalFunctionLib.pressKey("F7");
		 Mainframe_GlobalFunctionLib.sendText(7, 21, "28");
		 Mainframe_GlobalFunctionLib.pressKey("Enter");
		 Mainframe_GlobalFunctionLib.sendText(21, 12, "17");
		 Mainframe_GlobalFunctionLib.pressKey("Enter");
		 Mainframe_GlobalFunctionLib.pressKey("F6");
		 Mainframe_GlobalFunctionLib.click(12, 13);
		 Mainframe_GlobalFunctionLib.pressKey("F4");
		 Thread.sleep(2000);
		 Mainframe_GlobalFunctionLib.pressKey("F9");
		 Thread.sleep(3000);
		 Mainframe_GlobalFunctionLib.sendText(6, 29, Flob);
		 Mainframe_GlobalFunctionLib.sendText(7, 29, Fform);
		 Mainframe_GlobalFunctionLib.sendText(8, 29, Fspec);
		 Mainframe_GlobalFunctionLib.sendText(9, 29, Fbrate);
		 Mainframe_GlobalFunctionLib.sendText(10, 29, FAdminRate);
		 Thread.sleep(2000);
		 Mainframe_GlobalFunctionLib.sendText(11, 29, FPricePR);
		 Mainframe_GlobalFunctionLib.sendText(14, 28, FBrandfg);
		 Mainframe_GlobalFunctionLib.sendText(15, 28, FCrspec);
		 Mainframe_GlobalFunctionLib.sendText(16, 28, FCompre);
		 Mainframe_GlobalFunctionLib.sendText(17, 28, Fltd);
		 
		 
		}catch(Exception e)
		{	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Assert.fail("Successfully zero value can not be entered and saved for POS Rebate List");
		}
		 
     }
	
	@Then("^verify the values are as expected$")
	public void verify_the_values_are_as_expected() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		Thread.sleep(2000);
		   try{
			   Mainframe_GlobalFunctionLib.pressKey("Enter");
		       Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		       Thread.sleep(2000);
		       String Act=Mainframe_GlobalFunctionLib.getText(24, 2);
		       System.out.println("Validation message is"+Act);
		       
		     }catch(Exception e)
			   {	
		    	 Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			     Assert.fail("Successfully zero value can not be entered and saved for POS Rebate List");
			   }
		   
		}

}
