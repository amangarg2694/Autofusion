package com.atdd.demo.te.stepdefinitons;

import org.junit.Assert;

import com.cucumber.listener.Reporter;
import com.optumrx.autofusion.core.te.util.Mainframe_GlobalFunctionLib;
import com.optumrx.autofusion.core.te.util.Screenshot;

import cucumber.api.java.en.Then;

public class sn001396_Basic {
	
	@Then("^I Validate the new screen \"([^\"]*)\"$")
	public void i_Validate_the_new_screen(String arg1) throws Throwable {
		String option = Mainframe_GlobalFunctionLib.getText(02, 28).trim();
		if(option.equals("Claim Origination Code List"))
		{
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());		
	}
		else
		{
			Assert.fail("Screen name has been modified : "+Mainframe_GlobalFunctionLib.getText(2, 28).trim());
		}
	}
	@Then("^I Validate the Add Screen \"([^\"]*)\"$")
	public void i_Validate_the_Add_Screen(String arg1) throws Throwable {
			
			String option = Mainframe_GlobalFunctionLib.getText(10, 24).trim();
			if(option.equals("Add Claim Origination Code List"))
			{
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());		
		}
			else
			{
				Assert.fail("Screen name has been modified : "+Mainframe_GlobalFunctionLib.getText(10, 24).trim());
			}
		    
		}
		}
		
