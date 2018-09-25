package com.atdd.demo.te.stepdefinitons;

import org.testng.Assert;

import com.atdd.te.screenHelpers.CommonHelper;
import com.cucumber.listener.Reporter;
import com.optumrx.autofusion.core.te.util.Mainframe_GlobalFunctionLib;
import com.optumrx.autofusion.core.te.util.Screenshot;

import cucumber.api.java.en.When;

public class MemberEditUsingF24Key extends CommonHelper{
	
	@When("^I edit member details with \"([^\"]*)\",\"([^\"]*)\"$")
	public void i_edit_member_details_with(String memberID, String address2) throws Throwable {
			
			
			try{
		       Mainframe_GlobalFunctionLib.sendText(21, 7 ,"1" );
			   Mainframe_GlobalFunctionLib.pressKey("Enter");
			   Mainframe_GlobalFunctionLib.sendText(21, 7 ,"2" );
			   Mainframe_GlobalFunctionLib.pressKey("Enter");
			   Mainframe_GlobalFunctionLib.waitTillReady();
	           Mainframe_GlobalFunctionLib.click(4, 4 );
	           Mainframe_GlobalFunctionLib.sendText(4, 4 ,memberID );
	           Mainframe_GlobalFunctionLib.pressKey("Enter");
	           Mainframe_GlobalFunctionLib.waitTillReady();
			   Mainframe_GlobalFunctionLib.pressKey("F8");
			   Mainframe_GlobalFunctionLib.sendText(10, 2,"2" );
			   Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			   Mainframe_GlobalFunctionLib.pressKey("Enter");
			   Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			   Mainframe_GlobalFunctionLib.sendText(10, 10,address2 );
			    Mainframe_GlobalFunctionLib.pressKey("F24");
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				Mainframe_GlobalFunctionLib.pressKey("F12");
				Mainframe_GlobalFunctionLib.sendText(10, 2,"5" );
			    Mainframe_GlobalFunctionLib.pressKey("Enter");
				String address3=Mainframe_GlobalFunctionLib.getText(10, 10);
						if(address3=="test")
						{
							System.out.println("Address updated");
							System.out.println(address3);
						}
						else
						{
							System.out.println("Address not updated and working as expected");
						}
						
					
						
			if(ScreenshotOption.equalsIgnoreCase("Always")){
					Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			        }
		      }	
					catch(Exception e)
					{	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
						Assert.fail("An error has occured while creating the caim transaction.Screenshot is captured");
						
					}
		}

	@When("^I update member details with \"([^\"]*)\",\"([^\"]*)\"$")
	
	public void i_update_member_details_with(String memberID, String address) throws Throwable 
	{	
		try{
	       Mainframe_GlobalFunctionLib.sendText(21, 7 ,"1" );
		   Mainframe_GlobalFunctionLib.pressKey("Enter");
		   Mainframe_GlobalFunctionLib.sendText(21, 7 ,"2" );
		   Mainframe_GlobalFunctionLib.pressKey("Enter");
		   Mainframe_GlobalFunctionLib.waitTillReady();
           Mainframe_GlobalFunctionLib.click(4, 4 );
           Mainframe_GlobalFunctionLib.sendText(4, 4 ,memberID );
           Mainframe_GlobalFunctionLib.pressKey("Enter");
           Mainframe_GlobalFunctionLib.waitTillReady();
		   Mainframe_GlobalFunctionLib.pressKey("F8");
		   Mainframe_GlobalFunctionLib.sendText(9, 2,"2" );
		   Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		   Mainframe_GlobalFunctionLib.pressKey("Enter");
		   Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		   Mainframe_GlobalFunctionLib.sendText(10, 10,address );
		    Mainframe_GlobalFunctionLib.pressKey("F24");
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			
			
			Mainframe_GlobalFunctionLib.pressKey("F12");
			Mainframe_GlobalFunctionLib.sendText(9, 2,"5" );
		    Mainframe_GlobalFunctionLib.pressKey("Enter");
			String address3=Mainframe_GlobalFunctionLib.getText(10, 10);
			Mainframe_GlobalFunctionLib.waitTillReady();
					if(address3=="test")
					{
						System.out.println("Address updated");
						System.out.println("Address field value is----"+address3);
					}
					else
					{
						System.out.println("Address not updated and working as expected");
					}
							
					
		if(ScreenshotOption.equalsIgnoreCase("Always")){
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		        }
	      }	
		
		
				catch(Exception e)
				{	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
					Assert.fail("An error has occured while creating the caim transaction.Screenshot is captured");
					
				}
		Mainframe_GlobalFunctionLib.pressKey("F3");
	}
	@When("^I modify member details with \"([^\"]*)\",\"([^\"]*)\"$")
	public void i_modify_member_details_with(String memberID, String address) throws Throwable 
	{	
		try{
	       Mainframe_GlobalFunctionLib.sendText(21, 7 ,"1" );
		   Mainframe_GlobalFunctionLib.pressKey("Enter");
		   Mainframe_GlobalFunctionLib.sendText(21, 7 ,"1" );
		   Mainframe_GlobalFunctionLib.pressKey("Enter");
		   Mainframe_GlobalFunctionLib.waitTillReady();
           Mainframe_GlobalFunctionLib.click(4, 4 );
           Mainframe_GlobalFunctionLib.sendText(4, 4 ,memberID );
           Mainframe_GlobalFunctionLib.pressKey("Enter");
           Mainframe_GlobalFunctionLib.waitTillReady();
		   Mainframe_GlobalFunctionLib.pressKey("F8");
		   Mainframe_GlobalFunctionLib.waitTillReady();
		   Mainframe_GlobalFunctionLib.sendText(9, 2,"2" );
			   Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			   Mainframe_GlobalFunctionLib.pressKey("Enter");
			   Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			   Mainframe_GlobalFunctionLib.sendText(10, 10,address );
			    Mainframe_GlobalFunctionLib.pressKey("F24");
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				Mainframe_GlobalFunctionLib.pressKey("F12");
				Mainframe_GlobalFunctionLib.sendText(9, 2,"5" );
			    Mainframe_GlobalFunctionLib.pressKey("Enter");
			   
		   
			String address3=Mainframe_GlobalFunctionLib.getText(10, 10);
			Mainframe_GlobalFunctionLib.waitTillReady();
					if(address3=="test")
					{
						System.out.println("Address updated");
						System.out.println(address3);
					}
					else
					{
						System.out.println("Address not updated and working as expected");
					}
				
					
		if(ScreenshotOption.equalsIgnoreCase("Always")){
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		        }
	      }	
				catch(Exception e)
				{	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
					Assert.fail("An error has occured while creating the caim transaction.Screenshot is captured");
					
				}
		Mainframe_GlobalFunctionLib.pressKey("F3");
	}
	
	
	@When("^I update member data with \"([^\"]*)\",\"([^\"]*)\"$")
	public void i_update_member_data_with(String memberID, String address) throws Throwable {
	{	
		try{
	       Mainframe_GlobalFunctionLib.sendText(21, 7 ,"1" );
		   Mainframe_GlobalFunctionLib.pressKey("Enter");
		   Mainframe_GlobalFunctionLib.sendText(21, 7 ,"1" );
		   Mainframe_GlobalFunctionLib.pressKey("Enter");
		   Mainframe_GlobalFunctionLib.waitTillReady();
           Mainframe_GlobalFunctionLib.click(4, 4 );
           Mainframe_GlobalFunctionLib.sendText(4, 4 ,memberID );
           Mainframe_GlobalFunctionLib.pressKey("Enter");
           Mainframe_GlobalFunctionLib.waitTillReady();
		   Mainframe_GlobalFunctionLib.pressKey("F8");
		   Mainframe_GlobalFunctionLib.waitTillReady();
		  
		   Mainframe_GlobalFunctionLib.sendText(10, 2,"2" );
		   Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		   Mainframe_GlobalFunctionLib.pressKey("Enter");
		   Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		   Mainframe_GlobalFunctionLib.sendText(10, 10,address );
		    Mainframe_GlobalFunctionLib.pressKey("F24");
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			Mainframe_GlobalFunctionLib.pressKey("F12");
			Mainframe_GlobalFunctionLib.sendText(10, 2,"5" );
		    Mainframe_GlobalFunctionLib.pressKey("Enter");
		   
			String address3=Mainframe_GlobalFunctionLib.getText(10, 10);
					if(address3=="test")
					{
						System.out.println("Address updated");
						System.out.println(address3);
					}
					else
					{
						System.out.println("Address not updated and working as expected");
					}
		 
				
						
		if(ScreenshotOption.equalsIgnoreCase("Always")){
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		        }
	      }	
				catch(Exception e)
				{	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
					Assert.fail("An error has occured while creating the caim transaction.Screenshot is captured");
					
				}
		Mainframe_GlobalFunctionLib.pressKey("F3");
	}
	
	}
}

