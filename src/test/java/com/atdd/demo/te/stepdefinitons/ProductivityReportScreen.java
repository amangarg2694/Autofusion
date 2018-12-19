package com.atdd.demo.te.stepdefinitons;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.testng.Assert;

import com.atdd.te.screenHelpers.FunctionalLibrary;
import com.cucumber.listener.Reporter;
import com.optumrx.autofusion.core.te.util.Mainframe_GlobalFunctionLib;
import com.optumrx.autofusion.core.te.util.Screenshot;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
public class ProductivityReportScreen {

	
	@Then("^I Validate error message \"([^\"]*)\" is not displaying for Class field$")
	public void i_Validate_error_message_is_not_displaying_for_Class_field(String ErrorMessage) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());		
		String ActErrorMessage = Mainframe_GlobalFunctionLib.getText(24, 2);
		System.out.println("Actual error message dispaying as: "+ActErrorMessage);
		if(! ActErrorMessage.equals(ErrorMessage))
		{
			System.out.println("Test passed:Error Message is not dispaying for Class field as: "+ErrorMessage);
			System.out.println("Actual Error message is : "+ActErrorMessage);
		}
		else
		{
			System.out.println("Test Failed for mandatory field for Class Field ");
			Assert.fail("Test Failed for mandatory field for Class Field.");
		}
		
	}
	
	@Given("^I am on Productivity Reporting$")
	public void i_am_on_Productivity_Reporting() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
		Mainframe_GlobalFunctionLib.validateText("2", "30", "Productivity Reporting");
	}
	
	@Given("^I enter invalid value \"([^\"]*)\" in Class field$")
	public void i_enter_invalid_value_in_Class_field(String InvalidValue) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
		Mainframe_GlobalFunctionLib.sendText("15","11", InvalidValue);
		}
	

	@Then("^I Validate message \"([^\"]*)\" should display for invalid value \"([^\"]*)\"$")
	public void i_Validate_message_should_display_for_invalid_value(String ErrorMessage2, String InvalidValue) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
   
		String ActInvErrorMessage = Mainframe_GlobalFunctionLib.getText(24, 2);
		System.out.println("Actual error message dispaying for invalid entry as: "+ActInvErrorMessage);
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		String ExpInvErrorMessege = InvalidValue+" "+ErrorMessage2;
		System.out.println("Expected error message is: "+ExpInvErrorMessege);
		
		if( ActInvErrorMessage.equals(ExpInvErrorMessege))
		{
			System.out.println("Test Passed:Error message dispaying for invalid entry as: "+ActInvErrorMessage);
			
		}
		else
		{
			System.out.println("Test Failed:Error message not dispaying for invalid entry as: "+ActInvErrorMessage);
			Assert.fail("Test Failed:Error message not dispaying for invalid entry.");
		}
		Mainframe_GlobalFunctionLib.pressKey("F12");
}

	@Given("^I am on Report Management Screen$")
	public void i_am_on_Report_Management_Screen() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.validateText("1", "30", "Report Management");
	}
	
	@Then("^I Validate the cursor position on TransactionFromDate Field$")
	public void i_Validate_the_cursor_position_on_TransactionFromDate_Field() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  
		Mainframe_GlobalFunctionLib.validateText("24", "2", "From Date is required.");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		String ActTransactionMessage = Mainframe_GlobalFunctionLib.getText(24, 2);
				
		if( ActTransactionMessage.contains("From Date"))
		{
			System.out.println("Test Passed:Cursor placed on Transaction From Date field");
			
		}
		else
		{
			System.out.println("Test Failed:Cursor is not placed on Transaction From Date field");
			Assert.fail("Test Failed:Cursor is not placed on Transaction From Date field.");
		}
		
		Mainframe_GlobalFunctionLib.pressKey("F12");
	}
	
	@Then("^I Validate the cursor position on Sort Criteria Field$")
	public void i_Validate_the_cursor_position_on_Sort_Criteria_Field() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	
		String ActSortCriteria = Mainframe_GlobalFunctionLib.getText(4, 18);
		//Mainframe_GlobalFunctionLib.validateText("4", "18", "RAPRDEXT sort criteria");
		System.out.println("ActSortCriteria field text: "+ActSortCriteria);
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		
		if( ActSortCriteria.contains("sort criteria"))
		{
			System.out.println("Test Passed:Cursor placed on Sort Criteria field");
			
		}
		else
		{
			System.out.println("Test Failed:Cursor is not placed on Sort Criteria field");
			Assert.fail("Test Failed:Cursor is not placed on Sort Criteria field.");
		}
		
	}
	
	@Then("^I Validate the Job is completed with \"([^\"]*)\",\"([^\"]*)\"$")
	public void i_Validate_the_Job_is_completed_with(String Juser, String Jname) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
		String qry="WRKJOB JOB("+Juser+"/"+Jname+")";
		Mainframe_GlobalFunctionLib.sendText(21, 7,qry);
		Thread.sleep(1000);
	    Mainframe_GlobalFunctionLib.pressKey("Enter");
	    String status = Mainframe_GlobalFunctionLib.getText(8, 52);
	    if(status.contains("JOBQ"))
	   
	    	{
	    			
			    		String jobN = Mainframe_GlobalFunctionLib.getText(8, 34);
			    		Mainframe_GlobalFunctionLib.pressKey("F12");
			    		Mainframe_GlobalFunctionLib.pressKey("F12");
			    		String qry2="CHGJOB";
			    		Mainframe_GlobalFunctionLib.sendText(21, 7,qry2); 
			    		Mainframe_GlobalFunctionLib.pressKey("F4");  	
			    		Mainframe_GlobalFunctionLib.sendText(5, 37,Jname);
			    		Mainframe_GlobalFunctionLib.sendText(6, 39,Juser);
			    		Mainframe_GlobalFunctionLib.sendText(7, 39,jobN);
			    		Mainframe_GlobalFunctionLib.pressKey("Enter");
			    		Mainframe_GlobalFunctionLib.pressKey("F10");    
			    		Mainframe_GlobalFunctionLib.sendText(17, 37,"QPGMR ");
			    		Mainframe_GlobalFunctionLib.pressKey("Enter");
			    		System.out.println("Job Completed Successfully: "+status);
						Mainframe_GlobalFunctionLib.sendText(21, 7,qry);
					    Mainframe_GlobalFunctionLib.pressKey("Enter");
	    			}

	    	 else if(status.contains("ACTIVE")) {
	    		 
		    		 do{
		    		 
		    		 Mainframe_GlobalFunctionLib.pressKey("F12");
		    		 Mainframe_GlobalFunctionLib.sendText(21, 7,qry);
		    		 Mainframe_GlobalFunctionLib.pressKey("Enter");
		    		 Thread.sleep(2000);
		    		 } while(Mainframe_GlobalFunctionLib.getText(8, 52).contains("ACTIVE"));
	    		 
	    		 }
	    		 
	    	else
	    		{
	    	System.out.println("Job Completed Successfully: "+status);
	    	 
	    		}
		    	 //Mainframe_GlobalFunctionLib.sendText(21, 7,qry);
	}
	
	@Then("^I Validate the Class codes \"([^\"]*)\",\"([^\"]*)\"\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" displays in Spool file Report \"([^\"]*)\" for Carrier \"([^\"]*)\",\"([^\"]*)\"$")
	public void i_Validate_the_Class_codes_displays_in_Spool_file_Report_for_Carrier(String ClassField1, String ClassField2, String ClassField3, String ClassField4, String ClassField5, String Report, String CarrierFrom, String CarrierThru) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  
			 Mainframe_GlobalFunctionLib.sendText(8, 4,"1");
			 Mainframe_GlobalFunctionLib.pressKey("Enter");
			 Mainframe_GlobalFunctionLib.sendText(21, 7,"4");
			 Mainframe_GlobalFunctionLib.pressKey("Enter");
			 Mainframe_GlobalFunctionLib.sendText(11, 3,"5");
			 Mainframe_GlobalFunctionLib.pressKey("Enter");
			 Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			 
			 Mainframe_GlobalFunctionLib.sendText(4, 22,Report);
			 Mainframe_GlobalFunctionLib.pressKey("Enter");
			 Mainframe_GlobalFunctionLib.pressKey("F16");
			 Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			 Mainframe_GlobalFunctionLib.validateText("7", "55", Report);
			 System.out.println("Spool file report name: "+Report);
		 
		 	 Mainframe_GlobalFunctionLib.sendText(4, 22,"                          ");
			 Mainframe_GlobalFunctionLib.sendText(4, 22,CarrierFrom);
			 Mainframe_GlobalFunctionLib.pressKey("Enter");
			 Mainframe_GlobalFunctionLib.pressKey("F16");
			 Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			 Mainframe_GlobalFunctionLib.validateText("7", "74", CarrierFrom);
			 System.out.println("Spool file Carrier From field value: "+CarrierFrom);
			 
			 Mainframe_GlobalFunctionLib.sendText(4, 22,"                       ");
			 Mainframe_GlobalFunctionLib.sendText(4, 22,CarrierThru);
			 Mainframe_GlobalFunctionLib.pressKey("Enter");
			 Mainframe_GlobalFunctionLib.pressKey("F16");
			 Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			 Mainframe_GlobalFunctionLib.validateText("7", "74", CarrierThru);
			 System.out.println("Spool file Carrier From field value: "+CarrierThru);
			 
			 Mainframe_GlobalFunctionLib.sendText(4, 22,"                       ");
			 Mainframe_GlobalFunctionLib.sendText(4, 22,"CLASS");
			 Mainframe_GlobalFunctionLib.pressKey("Enter");
			 Mainframe_GlobalFunctionLib.pressKey("F16");
			 Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			 Mainframe_GlobalFunctionLib.validateText("7", "76", "CLASS");
			 System.out.println("Spool file has field name as : "+"CLASS");
			 
			 Mainframe_GlobalFunctionLib.sendText(4, 22,"                       ");
			 Mainframe_GlobalFunctionLib.sendText(4, 22,ClassField1);
			 Mainframe_GlobalFunctionLib.pressKey("Enter");
			 Mainframe_GlobalFunctionLib.pressKey("F16");
			 Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			 Mainframe_GlobalFunctionLib.validateText("7", "76", ClassField1);
			 System.out.println("Spool file has Class field Value as : "+ClassField1);
			 
			 Mainframe_GlobalFunctionLib.sendText(4, 22,"                       ");
			 Mainframe_GlobalFunctionLib.sendText(4, 22,ClassField2);
			 Mainframe_GlobalFunctionLib.pressKey("Enter");
			 Mainframe_GlobalFunctionLib.pressKey("F16");
			 Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			 Mainframe_GlobalFunctionLib.validateText("7", "78", ClassField2);
			 System.out.println("Spool file has Class field Value as : "+ClassField2);
			 
			 Mainframe_GlobalFunctionLib.sendText(4, 22,"                       ");
			 Mainframe_GlobalFunctionLib.sendText(4, 22,ClassField3);
			 Mainframe_GlobalFunctionLib.pressKey("Enter");
			 Mainframe_GlobalFunctionLib.pressKey("F16");
			 Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			 Mainframe_GlobalFunctionLib.validateText("7", "82", ClassField3);
			 System.out.println("Spool file has Class field Value as : "+ClassField3);
			 
			 Mainframe_GlobalFunctionLib.sendText(4, 22,"                       ");
			 Mainframe_GlobalFunctionLib.sendText(4, 22,ClassField4);
			 Mainframe_GlobalFunctionLib.pressKey("Enter");
			 Mainframe_GlobalFunctionLib.pressKey("F16");
			 Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			 Mainframe_GlobalFunctionLib.validateText("7", "86", ClassField4);
			 System.out.println("Spool file has Class field Value as : "+ClassField4);
			 
			 Mainframe_GlobalFunctionLib.sendText(4, 22,"                       ");
			 Mainframe_GlobalFunctionLib.sendText(4, 22,ClassField5);
			 Mainframe_GlobalFunctionLib.pressKey("Enter");
			 Mainframe_GlobalFunctionLib.pressKey("F16");
			 Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			 Mainframe_GlobalFunctionLib.validateText("7", "90", ClassField5);
			 System.out.println("Spool file has Class field Value as : "+ClassField5);
			 
			 Mainframe_GlobalFunctionLib.sendText(3, 22,"26");
			 Mainframe_GlobalFunctionLib.pressKey("Enter");
			 
			 Mainframe_GlobalFunctionLib.sendText(4, 22,"CLASS");
			 Mainframe_GlobalFunctionLib.pressKey("Enter");
			 Mainframe_GlobalFunctionLib.pressKey("F16");
			 Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			 Mainframe_GlobalFunctionLib.validateText("7", "114", "CLASS");
			 System.out.println("Spool file has field name in detailed Report Section as : "+"CLASS");
			 
			 Mainframe_GlobalFunctionLib.sendText(4, 22,"                       ");
			 Mainframe_GlobalFunctionLib.sendText(4, 22,ClassField1);
			 Mainframe_GlobalFunctionLib.pressKey("Enter");
			 Mainframe_GlobalFunctionLib.pressKey("F16");
			 Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			 Mainframe_GlobalFunctionLib.validateText("7", "114", ClassField1);
			 System.out.println("Spool file has Class code value in detailed Report Section as : "+ClassField1);
			 
			 Mainframe_GlobalFunctionLib.sendText(4, 22,"                       ");
			 Mainframe_GlobalFunctionLib.sendText(4, 22,ClassField2);
			 Mainframe_GlobalFunctionLib.pressKey("Enter");
			 Mainframe_GlobalFunctionLib.pressKey("F16");
			 Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			 Mainframe_GlobalFunctionLib.validateText("7", "114", ClassField2);
			 System.out.println("Spool file has Class code value in detailed Report Section as : "+ClassField2);
			 
			 Mainframe_GlobalFunctionLib.sendText(4, 22,"                       ");
			 Mainframe_GlobalFunctionLib.sendText(4, 22,ClassField3);
			 Mainframe_GlobalFunctionLib.pressKey("Enter");
			 Mainframe_GlobalFunctionLib.pressKey("F16");
			 Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			 Mainframe_GlobalFunctionLib.validateText("7", "114", ClassField3);
			 System.out.println("Spool file has Class code value in detailed Report Section as : "+ClassField3);
			 
			 Mainframe_GlobalFunctionLib.sendText(4, 22,"                       ");
			 Mainframe_GlobalFunctionLib.sendText(4, 22,ClassField4);
			 Mainframe_GlobalFunctionLib.pressKey("Enter");
			 Mainframe_GlobalFunctionLib.pressKey("F16");
			 Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			 Mainframe_GlobalFunctionLib.validateText("7", "114", ClassField4);
			 System.out.println("Spool file has Class code value in detailed Report Section as : "+ClassField4);
			 
			 Mainframe_GlobalFunctionLib.sendText(4, 22,"                       ");
			 Mainframe_GlobalFunctionLib.sendText(4, 22,ClassField5);
			 Mainframe_GlobalFunctionLib.pressKey("Enter");
			 Mainframe_GlobalFunctionLib.pressKey("F16");
			 Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			 Mainframe_GlobalFunctionLib.validateText("7", "114", ClassField5);
			 System.out.println("Spool file has Class code value in detailed Report Section as : "+ClassField5);
			 
			 Mainframe_GlobalFunctionLib.pressKey("F12");
				 
	}
	
	@Then("^I Validate the Class codes \"([^\"]*)\",\"([^\"]*)\"\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" in file \"([^\"]*)\",\"([^\"]*)\"$")
	public void i_Validate_the_Class_codes_in_file(String ClassField1, String ClassField2, String ClassField3, String ClassField4, String ClassField5, String Library, String FileName) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    		
		String ExpClassCodes= ClassField1+ClassField2+ClassField3+ClassField4+ClassField5;
		System.out.println("Expected Class Codes : "+ExpClassCodes);

			String runqry="RUNQRY QRYFILE(("+Library+"/"+FileName+"))";
			Mainframe_GlobalFunctionLib.sendText(22,7, runqry);
			Thread.sleep(1000);
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			//Mainframe_GlobalFunctionLib.sendText(3, 126,"68" );
			Mainframe_GlobalFunctionLib.sendText(3, 74,"68" ); 
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			
			label1:	for (int j = 7; j < 894; ++j) {
				Mainframe_GlobalFunctionLib.pressKey("PageDown");
				
							for (int i = 6; i < 22; ++i) {
								String ActClassCode= Mainframe_GlobalFunctionLib.getText(i, 9);
						
										//if(ActClassCode==ClassField1)
								if(ActClassCode.equals(ClassField1))
											{
								             System.out.println("Class Code is: "+ActClassCode);
																									
											}
										   else if(ActClassCode.equals(ClassField2))
										   {
											   System.out.println("Class Code is: "+ActClassCode);
										   }
										   else if(ActClassCode.equals(ClassField3))
										   {
											   System.out.println("Class Code is: "+ActClassCode);
										   }
										   else if(ActClassCode.equals(ClassField4))
										   {
											   System.out.println("Class Code is: "+ActClassCode);
										   }
										   else if(ActClassCode.equals(ClassField5))
										   {
											   System.out.println("Class Code is: "+ActClassCode);
										   }
										   else
										   {
										    System.out.println("Class Code not found : "+ActClassCode);
										   }
										//String ActEndofFile=Mainframe_GlobalFunctionLib.getText(24, 9);
										//String ActMore=Mainframe_GlobalFunctionLib.getText(22, 68);
										//System.out.println("Page Details1: "+ActMore);
										String ActEndofFile=Mainframe_GlobalFunctionLib.getText(21, 9);
										System.out.println("Page Details2: "+ActEndofFile);
										if(ActEndofFile.contains("End of report"))	{
											break label1;
										}
									
					}
							
		    }
			
	  }
		
	@Then("^I Validate the Class codes \"([^\"]*)\",\"([^\"]*)\" displays in Spool file Report \"([^\"]*)\" for Carrier \"([^\"]*)\",\"([^\"]*)\"$")
	public void i_Validate_the_Class_codes_displays_in_Spool_file_Report_for_Carrier(String ClassField, String ClassField1,String Report, String CarrierFrom, String CarrierThru) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
		
		Mainframe_GlobalFunctionLib.sendText(8, 4,"1");
		 Mainframe_GlobalFunctionLib.pressKey("Enter");
		 Mainframe_GlobalFunctionLib.sendText(21, 7,"4");
		 Mainframe_GlobalFunctionLib.pressKey("Enter");
		 Mainframe_GlobalFunctionLib.sendText(11, 3,"5");
		 Mainframe_GlobalFunctionLib.pressKey("Enter");
		 Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		 
		 Mainframe_GlobalFunctionLib.sendText(4, 22,Report);
		 Mainframe_GlobalFunctionLib.pressKey("Enter");
		 Mainframe_GlobalFunctionLib.pressKey("F16");
		 Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		 Mainframe_GlobalFunctionLib.validateText("7", "55", Report);
		 System.out.println("Spool file report name: "+Report);
	 
	 	 Mainframe_GlobalFunctionLib.sendText(4, 22,"                          ");
		 Mainframe_GlobalFunctionLib.sendText(4, 22,CarrierFrom);
		 Mainframe_GlobalFunctionLib.pressKey("Enter");
		 Mainframe_GlobalFunctionLib.pressKey("F16");
		 Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		 Mainframe_GlobalFunctionLib.validateText("7", "74", CarrierFrom);
		 System.out.println("Spool file Carrier From field value: "+CarrierFrom);
		 
		 Mainframe_GlobalFunctionLib.sendText(4, 22,"                       ");
		 Mainframe_GlobalFunctionLib.sendText(4, 22,CarrierThru);
		 Mainframe_GlobalFunctionLib.pressKey("Enter");
		 Mainframe_GlobalFunctionLib.pressKey("F16");
		 Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		 Mainframe_GlobalFunctionLib.validateText("7", "74", CarrierThru);
		 System.out.println("Spool file Carrier From field value: "+CarrierThru);
		 
		 Mainframe_GlobalFunctionLib.sendText(4, 22,"                       ");
		 Mainframe_GlobalFunctionLib.sendText(4, 22,"CLASS");
		 Mainframe_GlobalFunctionLib.pressKey("Enter");
		 Mainframe_GlobalFunctionLib.pressKey("F16");
		 Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		 Mainframe_GlobalFunctionLib.validateText("7", "76", "CLASS");
		 System.out.println("Spool file has field name as : "+"CLASS");
		 
		 Mainframe_GlobalFunctionLib.sendText(3, 22,"20");
		 Mainframe_GlobalFunctionLib.pressKey("Enter");
		 Mainframe_GlobalFunctionLib.sendText(4, 22,"                       ");
		 Mainframe_GlobalFunctionLib.sendText(4, 22,"NONE SELECTED");
		 Mainframe_GlobalFunctionLib.pressKey("Enter");
		 Mainframe_GlobalFunctionLib.pressKey("F16");
		 Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		 Mainframe_GlobalFunctionLib.validateText("7", "76", "NONE SELECTED");
		 System.out.println("Spool file has Class field Value as : "+"NONE SELECTED");
		 
		 Mainframe_GlobalFunctionLib.sendText(4, 22,"                       ");
		 Mainframe_GlobalFunctionLib.sendText(4, 22,ClassField);
		 Mainframe_GlobalFunctionLib.pressKey("Enter");
		 Mainframe_GlobalFunctionLib.pressKey("F16");
		 Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		 Mainframe_GlobalFunctionLib.validateText("7", "117", ClassField);
		 System.out.println("Spool file has Class field Value as : "+ClassField);
		 
		 //Mainframe_GlobalFunctionLib.pressKey("F12");
		 //Mainframe_GlobalFunctionLib.sendText(11, 3,"5");
		 //Mainframe_GlobalFunctionLib.pressKey("Enter");
		 Mainframe_GlobalFunctionLib.sendText(4, 22,"                       ");
		 Mainframe_GlobalFunctionLib.sendText(4, 22,ClassField1);
		 Mainframe_GlobalFunctionLib.pressKey("Enter");
		 Thread.sleep(3000);
		 Mainframe_GlobalFunctionLib.pressKey("F16");
		 Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		 Mainframe_GlobalFunctionLib.validateText("7", "114", ClassField1);
		 System.out.println("Spool file has Class field Value as : "+ClassField1);
	
		 Mainframe_GlobalFunctionLib.pressKey("F12");
	}
	
	@Then("^I Validate the Class codes \"([^\"]*)\" in file \"([^\"]*)\",\"([^\"]*)\"$")
	public void i_Validate_the_Class_codes_in_file(String ClassField, String Library, String FileName) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  
		String runqry="RUNQRY QRYFILE(("+Library+"/"+FileName+"))";
		Mainframe_GlobalFunctionLib.sendText(22,7, runqry);
		Thread.sleep(1000);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		//Mainframe_GlobalFunctionLib.sendText(3, 126,"68" );
		Mainframe_GlobalFunctionLib.sendText(3, 74,"68" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		
		String ActClassCodeBlank= Mainframe_GlobalFunctionLib.getText(7, 9);
		System.out.println("Class field Value as : "+ActClassCodeBlank);
		String ActClassCodeNonBlank= Mainframe_GlobalFunctionLib.getText(8, 9);
		System.out.println("Class field Value as : "+ActClassCodeNonBlank);
		
		int len = ActClassCodeBlank.length();
		System.out.println("length of blank class code value : "+len);
		if(len==0)
		{
			System.out.println("Class code value is Blank");
		}
		else
		{
			System.out.println("Class code value is not Blank");
		}
		
		int len2 = ActClassCodeNonBlank.length();
		System.out.println("length of blank class code value : "+len2);
		if(len2!=0)
		{
			System.out.println("Class code value is Not Blank");
		}
		else
		{
			System.out.println("Class code value is Blank");
		}
		
		//Updating for Regression

			 Mainframe_GlobalFunctionLib.pressKey("F3");
			 Mainframe_GlobalFunctionLib.pressKey("F3");
			 Mainframe_GlobalFunctionLib.pressKey("F3");
			 Mainframe_GlobalFunctionLib.pressKey("F3");
			 Mainframe_GlobalFunctionLib.pressKey("F3");
			
	}

	@Then("^I Second Validate the Class codes \"([^\"]*)\",\"([^\"]*)\"\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" in file \"([^\"]*)\",\"([^\"]*)\"$")
	public void i_Second_Validate_the_Class_codes_in_file(String ClassField1, String ClassField2, String ClassField3, String ClassField4, String ClassField5, String Library, String FileName) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
		//Practice code to remove for Scenario Reg
		String ExpClassCodes= ClassField1+ClassField2+ClassField3+ClassField4+ClassField5;
		System.out.println("Expected Class Codes : "+ExpClassCodes);

			String runqry="RUNQRY QRYFILE(("+Library+"/"+FileName+"))";
			Mainframe_GlobalFunctionLib.sendText(22,7, runqry);
			Thread.sleep(3000);
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(3, 126,"68" );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			
			label1:	for (int j = 7; j < 894; ++j) {
			Mainframe_GlobalFunctionLib.pressKey("PageDown");
			
						label2:for (int i = 6; i < 25; ++i) {
							String ActClassCode= Mainframe_GlobalFunctionLib.getText(i, 9);
					
									//if(ActClassCode==ClassField1)
							if(ActClassCode.equals(ClassField1))
										{
							             System.out.println("Class Code is: "+ActClassCode);
																								
										}
									   else if(ActClassCode.equals(ClassField2))
									   {
										   System.out.println("Class Code is: "+ActClassCode);
									   }
									   else if(ActClassCode.equals(ClassField3))
									   {
										   System.out.println("Class Code is: "+ActClassCode);
									   }
									   else if(ActClassCode.equals(ClassField4))
									   {
										   System.out.println("Class Code is: "+ActClassCode);
									   }
									   else if(ActClassCode.equals(ClassField5))
									   {
										   System.out.println("Class Code is: "+ActClassCode);
									   }
									   else
									   {
									    System.out.println("Class Code not found : "+ActClassCode);
									   }
				String ActEndofFile=Mainframe_GlobalFunctionLib.getText(24, 9);
				if(ActEndofFile.contains("End of report"))	{
					break label1;
				}
						}
	          }
			
	  }
	
	@Given("^I am on Display Report Screen$")
	public void i_am_on_Display_Report_Screen() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		//Mainframe_GlobalFunctionLib.validateText("1", "27", "Display Report");
		Mainframe_GlobalFunctionLib.validateText("1", "2", "Display Report");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		 /*String text = FunctionalLibrary.getText(1, 13);
			
			while(!(text.contains("Report Management"))){
				
				FunctionalLibrary.pressKey("F12");
				text = FunctionalLibrary.getText(1, 13);
				
			}*/
		 
	}	
	@Given("^I am on Productivity Reporting Screen$")
	public void i_am_on_Productivity_Reporting_Screen() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
		Mainframe_GlobalFunctionLib.validateText("2", "30", "Productivity Reporting");
		Mainframe_GlobalFunctionLib.pressKey("F12");
	}
	
	@Given("^I am on RxInterACT Main Menu Screen$")
	public void i_am_on_RxInterACT_Main_Menu_Screen() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
		String text = FunctionalLibrary.getText(1, 13);
		
		while(!(text.equalsIgnoreCase("RxInterACT Main Menu"))){
			
			FunctionalLibrary.pressKey("F12");
			text = FunctionalLibrary.getText(1, 13);
			
			
			
		}
	}

}



