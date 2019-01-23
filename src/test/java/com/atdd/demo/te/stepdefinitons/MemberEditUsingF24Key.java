package com.atdd.demo.te.stepdefinitons;

import java.io.IOException;
import java.sql.SQLException;

import org.testng.Assert;

import com.atdd.te.screenHelpers.CommonHelper;
import com.cucumber.listener.Reporter;
import com.hp.lft.report.ReportException;
import com.hp.lft.sdk.GeneralLeanFtException;
import com.optumrx.autofusion.core.te.util.Mainframe_GlobalFunctionLib;
import com.optumrx.autofusion.core.te.util.Screenshot;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MemberEditUsingF24Key extends CommonHelper{
	
	/*@When("^I edit member details with \"([^\"]*)\",\"([^\"]*)\"$")
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
	public static void navigateToMainMenu()
	{
		try{
			 Mainframe_GlobalFunctionLib.pressKey("F12");
			 Mainframe_GlobalFunctionLib.pressKey("F12");
			 Mainframe_GlobalFunctionLib.pressKey("F12");
			 Thread.sleep(5000);
			 Mainframe_GlobalFunctionLib.pressKey("F3");
			 Thread.sleep(2000);
			 String sysName=Mainframe_GlobalFunctionLib.getText(3, 70);
			 if(sysName=="RXDV1")
			 {
				 System.out.println("User navigated to main menu");
			 }
			 else{
				 System.out.println("User navigated to another menu");
			 }
			 
		}	 
			 catch (Exception e) {
					
					e.printStackTrace();
			 
		}
	}
	public static void MemberDetailsCheck() throws IOException
	{
		
	try{

	   Mainframe_GlobalFunctionLib.sendText(21, 7 ,"STRSQL" );
	   Mainframe_GlobalFunctionLib.pressKey("Enter");
	   Mainframe_GlobalFunctionLib.sendText(16, 7 ,"SELECT * FROM TCL8402FIL/RCMBRP WHERE ABA1TX ='CHANDRA'" );
	   Mainframe_GlobalFunctionLib.pressKey("Enter");
	   Mainframe_GlobalFunctionLib.waitTillReady();
	   Mainframe_GlobalFunctionLib.pressKey("F20");
	   Mainframe_GlobalFunctionLib.pressKey("F20");
	   
	   if(ScreenshotOption.equalsIgnoreCase("Always"))
	   {
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		}
	}catch(Exception e)
			{	
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				Assert.fail("An error has occured while creating the caim transaction.Screenshot is captured");
				
			}
}
	public static void CopyMember(String memberID, String carrierID, String accountID, String groupID, String FromDate, String ThruDate) throws Throwable
	{	
				
			try {
				Mainframe_GlobalFunctionLib.sendText(10, 2,"3" );
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(10, 52, carrierID );
				Mainframe_GlobalFunctionLib.sendText(11, 52, accountID );
				Mainframe_GlobalFunctionLib.sendText(12, 52, groupID );
				Mainframe_GlobalFunctionLib.sendText(14, 52, FromDate );
				Mainframe_GlobalFunctionLib.sendText(15, 52, ThruDate );
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				System.out.println("Member Added");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				Assert.fail("An error has occured while creating the caim transaction.Screenshot is captured");
				
			}
			
			
			
		}
	public static void editMember(String memberID, String FromDate, String ThruDate) throws ClassNotFoundException, GeneralLeanFtException, SQLException, ReportException, InterruptedException, IOException 
	{
		
		
		try {
			Mainframe_GlobalFunctionLib.sendText(21, 7 ,"1" );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(21, 7 ,"2" );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(4, 4 ,memberID );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.pressKey("F8");
			Mainframe_GlobalFunctionLib.sendText(10, 2 ,"2" );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.pressKey("F7");
			Mainframe_GlobalFunctionLib.sendText(15, 2 ,"2" );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(10, 15 ,FromDate+"   " );
			Mainframe_GlobalFunctionLib.sendText(10, 38 ,ThruDate+"    ");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.pressKey("F12");
			Mainframe_GlobalFunctionLib.pressKey("F12");
			Mainframe_GlobalFunctionLib.pressKey("F12");
			Mainframe_GlobalFunctionLib.pressKey("F12");
			Mainframe_GlobalFunctionLib.pressKey("F12");
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			Assert.fail("An error has occured while creating the caim transaction.Screenshot is captured");
			
		}
	}
	public static void editMemberDetails(String memberID, String address2) throws Throwable
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
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(10, 10,address2 );
			Mainframe_GlobalFunctionLib.pressKey("F24");
			Mainframe_GlobalFunctionLib.pressKey("F12");
			Mainframe_GlobalFunctionLib.sendText(9, 2,"5" );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			String address3=Mainframe_GlobalFunctionLib.getText(9, 10);
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
				}catch(Exception e)
				{	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
					Assert.fail("An error has occured while creating the caim transaction.Screenshot is captured");
					
				}
		
		
		
	}
	public static void editMemberAddress2(String memberID, String address2) throws Throwable
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
		   Mainframe_GlobalFunctionLib.sendText(10, 10,address2 );
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
	
	
	public static void editMemberAddress3(String memberID, String address2) throws Throwable
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
			   Mainframe_GlobalFunctionLib.sendText(10, 10,address2 );
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
	
	
	public static void editMemberAddress4(String memberID, String address2) throws Throwable
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
		Mainframe_GlobalFunctionLib.pressKey("F3");
	}
	
	
	
	
	public static void CreateTransaction1(String bin, String proc, String group, String pharmacyID, String rxNbr, String refill, String fillDate, String memberID, String productId, String dspQty, String ds, String psc, String cost, String qual) throws Throwable
	{	
				
			try {
				Mainframe_GlobalFunctionLib.pressKey("F6");
				Mainframe_GlobalFunctionLib.click(11, 14 );
				Mainframe_GlobalFunctionLib.pressKey("F4");
				Thread.sleep(3000);
				Mainframe_GlobalFunctionLib.sendText(4, 4, bin);
				Mainframe_GlobalFunctionLib.sendText(4, 11, proc);
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(10, 2,"1" );
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(11, 59,group );
				Mainframe_GlobalFunctionLib.click(12, 14 );
				Mainframe_GlobalFunctionLib.pressKey("F4");
				Thread.sleep(3000);
				Mainframe_GlobalFunctionLib.sendText(4, 4, pharmacyID);
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(9, 2,"1" );
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				
				Mainframe_GlobalFunctionLib.sendText(12, 41,rxNbr );
				Mainframe_GlobalFunctionLib.sendText(12, 59,refill );
				
				Mainframe_GlobalFunctionLib.click(14, 41 );
				Mainframe_GlobalFunctionLib.pressKey("F4");
				Thread.sleep(3000);
				Mainframe_GlobalFunctionLib.sendText(3, 4, memberID);
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				
				Mainframe_GlobalFunctionLib.sendText(8, 2,"1" );
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				//Mainframe_GlobalFunctionLib.pressKey("Enter");
				Thread.sleep(5000);
				//Mainframe_GlobalFunctionLib.waitTillReady();
				//System.out.println("Reached here");
				//Thread.sleep(5000);
				//Mainframe_GlobalFunctionLib.pressKey("Enter");
				//Mainframe_GlobalFunctionLib.sendText(4, 65, fillDate+"  ");	
				System.out.println("Entered fill date");
				Mainframe_GlobalFunctionLib.click(11, 20 );
				Mainframe_GlobalFunctionLib.pressKey("F4");
				Mainframe_GlobalFunctionLib.waitTillReady();
				Mainframe_GlobalFunctionLib.pressKey("F16");
				Mainframe_GlobalFunctionLib.sendText(4, 4, productId);
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(9, 2,"1" );
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Thread.sleep(3000);
				Mainframe_GlobalFunctionLib.sendText(12, 11,dspQty );
				Mainframe_GlobalFunctionLib.sendText(12, 26,ds );
				Mainframe_GlobalFunctionLib.sendText(14, 6,psc );
				Thread.sleep(5000);
				Mainframe_GlobalFunctionLib.sendText(10, 47,cost );
				Mainframe_GlobalFunctionLib.sendText(5, 22,qual );
				Mainframe_GlobalFunctionLib.waitTillReady();
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				
				System.out.println("Claim is created");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				Assert.fail("An error has occured while creating the caim transaction.Screenshot is captured");
				
			}
			
			
			
		}*/
	
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
						//if(address3=="test")
						if(address3!="Test5")
						{
							//System.out.println("Address updated");
							System.out.println("Address not updated and working as expected");
							System.out.println(address3);
						}
						else
						{
							//System.out.println("Address not updated and working as expected");
							System.out.println("Address updated");
						}
						
					
						
			if(ScreenshotOption.equalsIgnoreCase("Always")){
					Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			        }
		      }	
					catch(Exception e)
					{	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
						Assert.fail("An error has occured while creating the caim transaction.Screenshot is captured");
						
					}
			
			Mainframe_GlobalFunctionLib.pressKey("F12");
			Mainframe_GlobalFunctionLib.pressKey("F12");
			Mainframe_GlobalFunctionLib.pressKey("F12");
			Mainframe_GlobalFunctionLib.waitTillReady();
			Mainframe_GlobalFunctionLib.click(21, 7 );
			Mainframe_GlobalFunctionLib.pressKey("F3");
			Mainframe_GlobalFunctionLib.pressKey("F3");
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
					//if(address3=="test")
					if(address3!="Test6")	
					{
						//System.out.println("Address updated");
						System.out.println("Address not updated and working as expected");
						System.out.println("Address field value is----"+address3);
					}
					else
					{
						//System.out.println("Address not updated and working as expected");
						System.out.println("Address updated");
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
					//if(address3=="test")
					if(address3!="Test7")
					{
						//System.out.println("Address updated");
						System.out.println("Address not updated and working as expected");
						System.out.println(address3);
					}
					else
					{
						//System.out.println("Address not updated and working as expected");
						System.out.println("Address updated");
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
					//if(address3=="test")
					if(address3!="Test6")
					{
						//System.out.println("Address updated");
						System.out.println("Address not updated and working as expected");
						System.out.println(address3);
					}
					else
					{
						//System.out.println("Address not updated and working as expected");
						System.out.println("Address updated");
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
	public static void navigateToMainMenu()
	{
		try{
			 Mainframe_GlobalFunctionLib.pressKey("F12");
			 Mainframe_GlobalFunctionLib.pressKey("F12");
			 Mainframe_GlobalFunctionLib.pressKey("F12");
			 Thread.sleep(5000);
			 Mainframe_GlobalFunctionLib.pressKey("F3");
			 Thread.sleep(2000);
			 String sysName=Mainframe_GlobalFunctionLib.getText(3, 70);
			 if(sysName=="RXDV1")
			 {
				 System.out.println("User navigated to main menu");
			 }
			 else{
				 System.out.println("User navigated to another menu");
			 }
			 
		}	 
			 catch (Exception e) {
					
					e.printStackTrace();
			 
		}
	}
	public static void MemberDetailsCheck() throws IOException
	{
		
	try{

	   Mainframe_GlobalFunctionLib.sendText(21, 7 ,"STRSQL" );
	   Mainframe_GlobalFunctionLib.pressKey("Enter");
	   Mainframe_GlobalFunctionLib.sendText(16, 7 ,"SELECT * FROM TCL8402FIL/RCMBRP WHERE ABA1TX ='CHANDRA'" );
	   Mainframe_GlobalFunctionLib.pressKey("Enter");
	   Mainframe_GlobalFunctionLib.waitTillReady();
	   Mainframe_GlobalFunctionLib.pressKey("F20");
	   Mainframe_GlobalFunctionLib.pressKey("F20");
	   
	   if(ScreenshotOption.equalsIgnoreCase("Always"))
	   {
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		}
	}catch(Exception e)
			{	
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				Assert.fail("An error has occured while creating the caim transaction.Screenshot is captured");
				
			}
}
	public static void CopyMember(String memberID, String carrierID, String accountID, String groupID, String FromDate, String ThruDate) throws Throwable
	{	
				
			try {
				Mainframe_GlobalFunctionLib.sendText(10, 2,"3" );
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(10, 52, carrierID );
				Mainframe_GlobalFunctionLib.sendText(11, 52, accountID );
				Mainframe_GlobalFunctionLib.sendText(12, 52, groupID );
				Mainframe_GlobalFunctionLib.sendText(14, 52, FromDate );
				Mainframe_GlobalFunctionLib.sendText(15, 52, ThruDate );
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				System.out.println("Member Added");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				Assert.fail("An error has occured while creating the caim transaction.Screenshot is captured");
				
			}
			
			
			
		}
	public static void editMember(String memberID, String FromDate, String ThruDate) throws ClassNotFoundException, GeneralLeanFtException, SQLException, ReportException, InterruptedException, IOException 
	{
		
		
		try {
			Mainframe_GlobalFunctionLib.sendText(21, 7 ,"1" );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(21, 7 ,"2" );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(4, 4 ,memberID );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.pressKey("F8");
			Mainframe_GlobalFunctionLib.sendText(10, 2 ,"2" );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.pressKey("F7");
			Mainframe_GlobalFunctionLib.sendText(15, 2 ,"2" );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(10, 15 ,FromDate+"   " );
			Mainframe_GlobalFunctionLib.sendText(10, 38 ,ThruDate+"    ");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.pressKey("F12");
			Mainframe_GlobalFunctionLib.pressKey("F12");
			Mainframe_GlobalFunctionLib.pressKey("F12");
			Mainframe_GlobalFunctionLib.pressKey("F12");
			Mainframe_GlobalFunctionLib.pressKey("F12");
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			Assert.fail("An error has occured while creating the caim transaction.Screenshot is captured");
			
		}
	}
	public static void editMemberDetails(String memberID, String address2) throws Throwable
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
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(10, 10,address2 );
			Mainframe_GlobalFunctionLib.pressKey("F24");
			Mainframe_GlobalFunctionLib.pressKey("F12");
			Mainframe_GlobalFunctionLib.sendText(9, 2,"5" );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			String address3=Mainframe_GlobalFunctionLib.getText(9, 10);
					//if(address3=="test")
					if(address3!="test")
					{
						//System.out.println("Address updated");
						System.out.println("Address not updated and working as expected");
						System.out.println(address3);
					}
					else
					{
						//System.out.println("Address not updated and working as expected");
						System.out.println("Address updated");
					}
							
		   if(ScreenshotOption.equalsIgnoreCase("Always")){
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				}
				}catch(Exception e)
				{	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
					Assert.fail("An error has occured while creating the caim transaction.Screenshot is captured");
					
				}
		
		
		
	}
	public static void editMemberAddress2(String memberID, String address2) throws Throwable
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
		   Mainframe_GlobalFunctionLib.sendText(10, 10,address2 );
		    Mainframe_GlobalFunctionLib.pressKey("F24");
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			
			
			Mainframe_GlobalFunctionLib.pressKey("F12");
			Mainframe_GlobalFunctionLib.sendText(9, 2,"5" );
		    Mainframe_GlobalFunctionLib.pressKey("Enter");
			String address3=Mainframe_GlobalFunctionLib.getText(10, 10);
			Mainframe_GlobalFunctionLib.waitTillReady();
					//if(address3=="test")
					if(address3!="test")	
					{
						//System.out.println("Address updated");
						System.out.println("Address not updated and working as expected");
						System.out.println("Address field value is----"+address3);
					}
					else
					{
						//System.out.println("Address not updated and working as expected");
						System.out.println("Address updated");
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
	
	
	public static void editMemberAddress3(String memberID, String address2) throws Throwable
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
			   Mainframe_GlobalFunctionLib.sendText(10, 10,address2 );
			    Mainframe_GlobalFunctionLib.pressKey("F24");
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				Mainframe_GlobalFunctionLib.pressKey("F12");
				Mainframe_GlobalFunctionLib.sendText(9, 2,"5" );
			    Mainframe_GlobalFunctionLib.pressKey("Enter");
			   
		   
			String address3=Mainframe_GlobalFunctionLib.getText(10, 10);
			Mainframe_GlobalFunctionLib.waitTillReady();
					//if(address3=="test")
					if(address3!="test")
					{
						//System.out.println("Address updated");
						System.out.println("Address not updated and working as expected");
						System.out.println(address3);
					}
					else
					{
						//System.out.println("Address not updated and working as expected");
						System.out.println("Address updated");
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
	
	
	public static void editMemberAddress4(String memberID, String address2) throws Throwable
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
		   Mainframe_GlobalFunctionLib.sendText(10, 10,address2 );
		    Mainframe_GlobalFunctionLib.pressKey("F24");
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			Mainframe_GlobalFunctionLib.pressKey("F12");
			Mainframe_GlobalFunctionLib.sendText(10, 2,"5" );
		    Mainframe_GlobalFunctionLib.pressKey("Enter");
		   
			String address3=Mainframe_GlobalFunctionLib.getText(10, 10);
					//if(address3=="test")
					if(address3!="test")
					{
						//System.out.println("Address updated");
						System.out.println("Address not updated and working as expected");
						System.out.println(address3);
					}
					else
					{
						//System.out.println("Address not updated and working as expected");
						System.out.println("Address updated");
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
	
	
	
	
	public static void CreateTransaction1(String bin, String proc, String group, String pharmacyID, String rxNbr, String refill, String fillDate, String memberID, String productId, String dspQty, String ds, String psc, String cost, String qual) throws Throwable
	{	
				
			try {
				Mainframe_GlobalFunctionLib.pressKey("F6");
				Mainframe_GlobalFunctionLib.click(11, 14 );
				Mainframe_GlobalFunctionLib.pressKey("F4");
				Thread.sleep(3000);
				Mainframe_GlobalFunctionLib.sendText(4, 4, bin);
				Mainframe_GlobalFunctionLib.sendText(4, 11, proc);
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(10, 2,"1" );
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(11, 59,group );
				Mainframe_GlobalFunctionLib.click(12, 14 );
				Mainframe_GlobalFunctionLib.pressKey("F4");
				Thread.sleep(3000);
				Mainframe_GlobalFunctionLib.sendText(4, 4, pharmacyID);
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(9, 2,"1" );
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				
				Mainframe_GlobalFunctionLib.sendText(12, 41,rxNbr );
				Mainframe_GlobalFunctionLib.sendText(12, 59,refill );
				
				Mainframe_GlobalFunctionLib.click(14, 41 );
				Mainframe_GlobalFunctionLib.pressKey("F4");
				Thread.sleep(3000);
				Mainframe_GlobalFunctionLib.sendText(3, 4, memberID);
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				
				Mainframe_GlobalFunctionLib.sendText(8, 2,"1" );
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				//Mainframe_GlobalFunctionLib.pressKey("Enter");
				Thread.sleep(5000);
				//Mainframe_GlobalFunctionLib.waitTillReady();
				//System.out.println("Reached here");
				//Thread.sleep(5000);
				//Mainframe_GlobalFunctionLib.pressKey("Enter");
				//Mainframe_GlobalFunctionLib.sendText(4, 65, fillDate+"  ");	
				System.out.println("Entered fill date");
				Mainframe_GlobalFunctionLib.click(11, 20 );
				Mainframe_GlobalFunctionLib.pressKey("F4");
				Mainframe_GlobalFunctionLib.waitTillReady();
				Mainframe_GlobalFunctionLib.pressKey("F16");
				Mainframe_GlobalFunctionLib.sendText(4, 4, productId);
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(9, 2,"1" );
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Thread.sleep(3000);
				Mainframe_GlobalFunctionLib.sendText(12, 11,dspQty );
				Mainframe_GlobalFunctionLib.sendText(12, 26,ds );
				Mainframe_GlobalFunctionLib.sendText(14, 6,psc );
				Thread.sleep(5000);
				Mainframe_GlobalFunctionLib.sendText(10, 47,cost );
				Mainframe_GlobalFunctionLib.sendText(5, 22,qual );
				Mainframe_GlobalFunctionLib.waitTillReady();
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				
				System.out.println("Claim is created");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				Assert.fail("An error has occured while creating the caim transaction.Screenshot is captured");
				
			}
			
			
			
		}
	
		
	@Then("^validate user navigated to Main menu$")
	public void validate_user_navigated_to_Main_menu() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
		try{
			 Mainframe_GlobalFunctionLib.pressKey("F12");
			 Mainframe_GlobalFunctionLib.pressKey("F12");
			 Mainframe_GlobalFunctionLib.pressKey("F12");
			 Thread.sleep(5000);
			 Mainframe_GlobalFunctionLib.pressKey("F3");
			 Thread.sleep(2000);
			 String sysName=Mainframe_GlobalFunctionLib.getText(3, 70);
			 if(sysName=="RXDV1")
			 {
				 System.out.println("User navigated to main menu");
			 }
			 else{
				 System.out.println("User navigated to another menu");
			 }
			 
		}	 
			 catch (Exception e) {
					
					e.printStackTrace();
			 
		}

	}	
	@Then("^Verify the \"([^\"]*)\" field data in MemberDetailScreen$")
	public void verify_the_field_data_in_MemberDetailScreen(String Address2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.validateText("10", "10", Address2);
	  
	}
	@When("^I edit member details with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void i_edit_member_details_with_and(String memberID, String address2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    

		
		
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
					//if(address3=="test")
					if(address3!="Test5")
					{
						//System.out.println("Address updated");
						System.out.println("Address not updated and working as expected");
						System.out.println(address3);
					}
					else
					{
						//System.out.println("Address not updated and working as expected");
						System.out.println("Address updated");
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
	
	

}

