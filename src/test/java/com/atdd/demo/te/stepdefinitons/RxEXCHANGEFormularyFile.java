package com.atdd.demo.te.stepdefinitons;

import org.testng.Assert;

import com.cucumber.listener.Reporter;
import com.optumrx.autofusion.core.te.util.Mainframe_GlobalFunctionLib;
import com.optumrx.autofusion.core.te.util.Screenshot;

import cucumber.api.java.en.Then;


public class RxEXCHANGEFormularyFile 
{
	@Then("^verify zero value can be entered and saved for POS Rebate List with \"([^\"]*)\"$")
	public void verify_zero_value_can_be_entered_and_saved_for_POS_Rebate_List_with(String ListName) throws Throwable
	{
	    // Write code here that turns the phrase abo've into concrete actions
	   try{
		
		//Mainframe_GlobalFunctionLib.pressKey("F12");   
		Mainframe_GlobalFunctionLib.sendText(4, 5, ListName);
	    Mainframe_GlobalFunctionLib.pressKey("Enter");
	    Mainframe_GlobalFunctionLib.sendText(10, 2, "5");
	    Mainframe_GlobalFunctionLib.pressKey("Enter");
	    Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	    System.out.println("Successfully zero value can be entered and saved for POS Rebate List");
	    Mainframe_GlobalFunctionLib.pressKey("F12");
	    
	    //POS Rebate list in edit mode
	    Mainframe_GlobalFunctionLib.sendText(4, 5, ListName);
	    Mainframe_GlobalFunctionLib.pressKey("Enter");
	    Mainframe_GlobalFunctionLib.sendText(10, 2, "2");
	    Mainframe_GlobalFunctionLib.pressKey("Enter");
	    Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	    Mainframe_GlobalFunctionLib.sendText(11, 31, "0");
	    Mainframe_GlobalFunctionLib.sendText(12, 31, "0");
	    Mainframe_GlobalFunctionLib.sendText(13, 31, "0");
	    Mainframe_GlobalFunctionLib.pressKey("Enter");
	    Mainframe_GlobalFunctionLib.waitTillReady();
	    
	    Mainframe_GlobalFunctionLib.sendText(10, 2, "5");
	    Mainframe_GlobalFunctionLib.pressKey("Enter");
	    Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	    Mainframe_GlobalFunctionLib.pressKey("F12");
	    
	  }
       catch(Exception e)
		{	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			Assert.fail("Successfully zero value can not be entered and saved for POS Rebate List");
			
		}
}
	
	
	@Then("^validate the range with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void validate_the_range_with(String AdminRate, String BaseRate, String PriceProtectionRate) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   Thread.sleep(2000);
	   try{
		   
	   
	   Mainframe_GlobalFunctionLib.pressKey("Enter");
	   Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	   Thread.sleep(2000);
	   String Exp="Value should be between 0 and 100.00";
	   String Act=Mainframe_GlobalFunctionLib.getText(24, 2);
	      if(Exp.equals(Act))
	      {
		   System.out.println("Validation message is"+Act);
	       }
	      else
	      {
		   System.out.println("Validation not available");
	       }
	     }catch(Exception e)
		   {	
	    	 Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		     Assert.fail("Successfully zero value can not be entered and saved for POS Rebate List");
		   }
	   
	}

}



