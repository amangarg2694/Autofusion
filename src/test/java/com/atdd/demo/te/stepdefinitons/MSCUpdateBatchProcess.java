package com.atdd.demo.te.stepdefinitons;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

import com.atdd.te.screenHelpers.FunctionalLibrary;
import com.cucumber.listener.Reporter;
import com.hp.lft.sdk.Keyboard;
import com.hp.lft.sdk.RegExpProperty;
import com.hp.lft.sdk.te.Keys;
import com.hp.lft.sdk.te.Screen;
import com.hp.lft.sdk.te.ScreenDescription;
import com.optumrx.autofusion.core.te.util.MainframeOR;
import com.optumrx.autofusion.core.te.util.Mainframe_GlobalFunctionLib;
import com.optumrx.autofusion.core.te.util.Screenshot;
import com.optumrx.autofusion.core.te.util.MainframeOR.TeWindow;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MSCUpdateBatchProcess {
	@Then("^Validating the option Product MSC Batch Update is available in Product Load Pre-Processing Profile screen$")
	public void validating_the_option_Product_MSC_Batch_Update_is_available_in_Product_Load_Pre_Processing_Profile_screen() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	String option = Mainframe_GlobalFunctionLib.getText(13, 27).trim();
		if(option.equals("Product MSC Batch Update"))
		{
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			FunctionalLibrary.navigateToScreen("8"); 
			String screenname = Mainframe_GlobalFunctionLib.getText(2, 29).trim();
			if(screenname.equals("Product MSC Batch Update"))
			{
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			}
			else
			{
				Assert.fail("Screen name has been modified: "+Mainframe_GlobalFunctionLib.getText(2, 29).trim());
			}
		}
		else
		{
			Assert.fail("Option is not available in Product Load Pre-Processing Profile screen");
		}
	}
	
	@Then("^Validating the option Extract Product is available in Product Load Pre-Processing Profile screen$")
	public void validating_the_option_Extract_Product_is_available_in_Product_Load_Pre_Processing_Profile_screen() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String option = Mainframe_GlobalFunctionLib.getText(14, 27).trim();
		if(option.equals("Extract Product"))
		{
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			FunctionalLibrary.navigateToScreen("9"); 
			String screenname = Mainframe_GlobalFunctionLib.getText(2, 34).trim();
			if(screenname.equals("Extract Product"))
			{
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			}
			else
			{
				Assert.fail("Screen name has been modified: "+Mainframe_GlobalFunctionLib.getText(2, 29).trim());
			}
		}
		else
		{
			Assert.fail("Option is not available in Product Load Pre-Processing Profile screen");
		}
	}
	
	@Then("^Validating the option Product MSC Update Audit History Report is available in Product Load Pre-Processing Profile screen$")
	public void validating_the_option_Product_MSC_Update_Audit_History_Report_is_available_in_Product_Load_Pre_Processing_Profile_screen() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String option = Mainframe_GlobalFunctionLib.getText(15, 27).trim();
		if(option.equals("Product MSC Update Audit History Report"))
		{
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			FunctionalLibrary.navigateToScreen("10"); 
			String screenname = Mainframe_GlobalFunctionLib.getText(2, 22).trim();
			if(screenname.equals("Product MSC Update Audit History Report"))
			{
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			}
			else
			{
				Assert.fail("Screen name has been modified: "+Mainframe_GlobalFunctionLib.getText(2, 29).trim());
			}
		}
		else
		{
			Assert.fail("Option is not available in Product Load Pre-Processing Profile screen");
		}
	}
	
	@Then("^Validating the error message when GPI list is left blank with \"([^\"]*)\",\"([^\"]*)\"$")
	public void validating_the_error_message_when_GPI_list_is_left_blank_with(String file, String lib) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		FunctionalLibrary.navigateToScreen("9"); 
		Mainframe_GlobalFunctionLib.sendText(7, 38, file);
		Mainframe_GlobalFunctionLib.sendText(8, 38, lib);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		String err_msg = Mainframe_GlobalFunctionLib.getText(24, 2).trim();
		if(err_msg.equals("GPI cannot be blank"))
		{
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		}
		else
		{
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			System.out.println("Error message displayed: "+Mainframe_GlobalFunctionLib.getText(24, 2).trim());
		}
	}

	@Then("^Validating the error message when file name is left blank with \"([^\"]*)\",\"([^\"]*)\"$")
	public void validating_the_error_message_when_file_name_is_left_blank_with(String gpi, String lib) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		FunctionalLibrary.navigateToScreen("9"); 
		Mainframe_GlobalFunctionLib.click(5, 38);
		Mainframe_GlobalFunctionLib.pressKey("F4");
		Mainframe_GlobalFunctionLib.sendText(4, 5, gpi);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(9,2, "1");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(8, 38, lib);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		String err_msg = Mainframe_GlobalFunctionLib.getText(24, 2).trim();
		if(err_msg.equals("File Name Required"))
		{
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		}
		else
		{
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			System.out.println("Error message displayed: "+Mainframe_GlobalFunctionLib.getText(24, 2).trim());
		}
	}
	
	@Then("^Validating the error message when library name is left blank with \"([^\"]*)\",\"([^\"]*)\"$")
	public void validating_the_error_message_when_library_name_is_left_blank_with(String gpi, String file) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		FunctionalLibrary.navigateToScreen("9"); 
		Mainframe_GlobalFunctionLib.click(5, 38);
		Mainframe_GlobalFunctionLib.pressKey("F4");
		Mainframe_GlobalFunctionLib.sendText(4, 5, gpi);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(9,2, "1");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(7, 38, file);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		String err_msg = Mainframe_GlobalFunctionLib.getText(24, 2).trim();
		if(err_msg.equals("Library Name Required."))
		{
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		}
		else
		{
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			System.out.println("Error message displayed: "+Mainframe_GlobalFunctionLib.getText(24, 2).trim());
		}
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");
	}
	
	@Then("^Validating the fields when Extract product job has completed successfully with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void validating_the_fields_when_Extract_product_job_has_completed_successfully_with(String gpi, String file, String lib) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.click(5, 38);
		Mainframe_GlobalFunctionLib.pressKey("F4");
		Mainframe_GlobalFunctionLib.sendText(4, 5, gpi);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(9,2, "1");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(7, 38, file);
		Mainframe_GlobalFunctionLib.sendText(8, 38, lib);
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Mainframe_GlobalFunctionLib.sendText(21, 7, "ws");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		String jobstatus = Mainframe_GlobalFunctionLib.getText(11,40);
		if(jobstatus.equals("OUTQ"))
		{
			Mainframe_GlobalFunctionLib.sendText(11, 3,"8");
    		Mainframe_GlobalFunctionLib.pressKey("Enter");
    		Mainframe_GlobalFunctionLib.sendText(11, 3,"5");
    		Mainframe_GlobalFunctionLib.pressKey("Enter");
    		Mainframe_GlobalFunctionLib.sendText(3,22,"W10");
    		Mainframe_GlobalFunctionLib.pressKey("Enter");
    		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
    		Mainframe_GlobalFunctionLib.pressKey("F3");
    		Mainframe_GlobalFunctionLib.pressKey("F3");
		}
		else if (jobstatus.equals("ACTIVE"))
		{
			
			TimeUnit.MINUTES.sleep(4);
			Mainframe_GlobalFunctionLib.pressKey("F5");
			String jobstat = Mainframe_GlobalFunctionLib.getText(11,40);
			if(jobstat.equals("OUTQ"))
    		{
			TimeUnit.SECONDS.sleep(3);
			Mainframe_GlobalFunctionLib.sendText(11, 3,"8");
    		Mainframe_GlobalFunctionLib.pressKey("Enter");
    		Mainframe_GlobalFunctionLib.sendText(11, 3,"5");
    		Mainframe_GlobalFunctionLib.pressKey("Enter");
    		Mainframe_GlobalFunctionLib.sendText(3,22,"W10");
    		Mainframe_GlobalFunctionLib.pressKey("Enter");
    		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
    		Mainframe_GlobalFunctionLib.pressKey("F3");
    		Mainframe_GlobalFunctionLib.pressKey("F3");
    		}
		}
		else if (jobstatus.equals("JOBQ"))
		{
			Mainframe_GlobalFunctionLib.sendText(11, 3,"2");
    		Mainframe_GlobalFunctionLib.pressKey("Enter");
    		Mainframe_GlobalFunctionLib.pressKey("F10");
    		Mainframe_GlobalFunctionLib.sendText(17, 37,"          ");
    		Mainframe_GlobalFunctionLib.sendText(17, 37,"QINTER");
    		Mainframe_GlobalFunctionLib.pressKey("Enter");
    		Mainframe_GlobalFunctionLib.pressKey("F5");
    		String jobstat = Mainframe_GlobalFunctionLib.getText(11,40);
			if(jobstat.equals("OUTQ"))
    		{
				TimeUnit.SECONDS.sleep(3);
				Mainframe_GlobalFunctionLib.sendText(11, 3,"8");
	    		Mainframe_GlobalFunctionLib.pressKey("Enter");
	    		Mainframe_GlobalFunctionLib.sendText(11, 3,"5");
	    		Mainframe_GlobalFunctionLib.pressKey("Enter");
	    		Mainframe_GlobalFunctionLib.sendText(3,22,"W10");
	    		Mainframe_GlobalFunctionLib.pressKey("Enter");
	    		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	    		Mainframe_GlobalFunctionLib.pressKey("F3");
	    		Mainframe_GlobalFunctionLib.pressKey("F3");
	    		}
			else if(jobstat.equals("ACTIVE"))
			{
				TimeUnit.MINUTES.sleep(4);
    			Mainframe_GlobalFunctionLib.pressKey("F5");
    			String jobstatu = Mainframe_GlobalFunctionLib.getText(11,40);
    			if(jobstatu.equals("OUTQ"))
        		{
    			TimeUnit.SECONDS.sleep(3);
    			Mainframe_GlobalFunctionLib.sendText(11, 3,"8");
        		Mainframe_GlobalFunctionLib.pressKey("Enter");
        		Mainframe_GlobalFunctionLib.sendText(11, 3,"5");
        		Mainframe_GlobalFunctionLib.pressKey("Enter");
        		Mainframe_GlobalFunctionLib.sendText(3,22,"W10");
        		Mainframe_GlobalFunctionLib.pressKey("Enter");
        		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
        		Mainframe_GlobalFunctionLib.pressKey("F3");
        		Mainframe_GlobalFunctionLib.pressKey("F3");
        		}
			}	
		}
		
		Mainframe_GlobalFunctionLib.sendText(21, 7,"strsql");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(16, 7,"select * from "+lib+"/"+file);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("F20");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("F20");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("F20");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		String newfield = Mainframe_GlobalFunctionLib.getText(6, 2).trim();
		String new_field[] = newfield.split(",");
		if(new_field[1].equals("Patient Pay MSC"))
		{
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());	
		}
		for(int i=0;i<10;i++)
		{
			Mainframe_GlobalFunctionLib.pressKey("F20");
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		}
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");
	}

	@When("^submitting Brand/Generic Product Log Report job and verifying processed status is reflected in spool file when file is submitted with batch in Product MSC Batch Update with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void submitting_Brand_Generic_Product_Log_Report_job_and_verifying_processed_status_is_reflected_in_spool_file_when_file_is_submitted_with_batch_in_Product_MSC_Batch_Update_with(String FromDate, String ThruDate, String File, String Library, String NewFile, String Carrier, String Account, String Group) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.sendText(13, 23,FromDate);
		Mainframe_GlobalFunctionLib.sendText(13, 54,ThruDate);
		Mainframe_GlobalFunctionLib.sendText(15, 22,File);
		Mainframe_GlobalFunctionLib.sendText(17, 22,Library);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Mainframe_GlobalFunctionLib.sendText(21, 7, "ws");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		String jobstatus = Mainframe_GlobalFunctionLib.getText(11,40);
		if(jobstatus.equals("OUTQ"))
		{
			Mainframe_GlobalFunctionLib.sendText(11, 3,"8");
    		Mainframe_GlobalFunctionLib.pressKey("Enter");
    		Mainframe_GlobalFunctionLib.sendText(11, 3,"5");
    		Mainframe_GlobalFunctionLib.pressKey("Enter");
    		Mainframe_GlobalFunctionLib.sendText(3,22,"W30");
    		Mainframe_GlobalFunctionLib.pressKey("Enter");
    		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
    		Mainframe_GlobalFunctionLib.pressKey("PageDown");
    		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
    		Mainframe_GlobalFunctionLib.pressKey("F3");
    		Mainframe_GlobalFunctionLib.pressKey("F3");
		}
		else if (jobstatus.equals("ACTIVE"))
		{
			
			TimeUnit.MINUTES.sleep(4);
			Mainframe_GlobalFunctionLib.pressKey("F5");
			String jobstat = Mainframe_GlobalFunctionLib.getText(11,40);
			if(jobstat.equals("OUTQ"))
    		{
			TimeUnit.SECONDS.sleep(3);
			Mainframe_GlobalFunctionLib.sendText(11, 3,"8");
    		Mainframe_GlobalFunctionLib.pressKey("Enter");
    		Mainframe_GlobalFunctionLib.sendText(11, 3,"5");
    		Mainframe_GlobalFunctionLib.pressKey("Enter");
    		Mainframe_GlobalFunctionLib.sendText(3,22,"W30");
    		Mainframe_GlobalFunctionLib.pressKey("Enter");
    		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
    		Mainframe_GlobalFunctionLib.pressKey("PageDown");
    		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
    		Mainframe_GlobalFunctionLib.pressKey("F3");
    		Mainframe_GlobalFunctionLib.pressKey("F3");
    		}
		}
		else if (jobstatus.equals("JOBQ"))
		{
			Mainframe_GlobalFunctionLib.sendText(11, 3,"2");
    		Mainframe_GlobalFunctionLib.pressKey("Enter");
    		Mainframe_GlobalFunctionLib.pressKey("F10");
    		Mainframe_GlobalFunctionLib.sendText(17, 37,"          ");
    		Mainframe_GlobalFunctionLib.sendText(17, 37,"QINTER");
    		Mainframe_GlobalFunctionLib.pressKey("Enter");
    		Mainframe_GlobalFunctionLib.pressKey("F5");
    		String jobstat = Mainframe_GlobalFunctionLib.getText(11,40);
			if(jobstat.equals("OUTQ"))
    		{
				TimeUnit.SECONDS.sleep(3);
				Mainframe_GlobalFunctionLib.sendText(11, 3,"8");
	    		Mainframe_GlobalFunctionLib.pressKey("Enter");
	    		Mainframe_GlobalFunctionLib.sendText(11, 3,"5");
	    		Mainframe_GlobalFunctionLib.pressKey("Enter");
	    		Mainframe_GlobalFunctionLib.sendText(3,22,"W30");
        		Mainframe_GlobalFunctionLib.pressKey("Enter");
        		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
        		Mainframe_GlobalFunctionLib.pressKey("PageDown");
        		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	    		Mainframe_GlobalFunctionLib.pressKey("F3");
	    		Mainframe_GlobalFunctionLib.pressKey("F3");
	    		}
			else if(jobstat.equals("ACTIVE"))
			{
				TimeUnit.MINUTES.sleep(4);
    			Mainframe_GlobalFunctionLib.pressKey("F5");
    			String jobstatu = Mainframe_GlobalFunctionLib.getText(11,40);
    			if(jobstatu.equals("OUTQ"))
        		{
    			TimeUnit.SECONDS.sleep(3);
    			Mainframe_GlobalFunctionLib.sendText(11, 3,"8");
        		Mainframe_GlobalFunctionLib.pressKey("Enter");
        		Mainframe_GlobalFunctionLib.sendText(11, 3,"5");
        		Mainframe_GlobalFunctionLib.pressKey("Enter");
        		Mainframe_GlobalFunctionLib.sendText(3,22,"W30");
        		Mainframe_GlobalFunctionLib.pressKey("Enter");
        		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
        		Mainframe_GlobalFunctionLib.pressKey("PageDown");
        		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
        		Mainframe_GlobalFunctionLib.pressKey("F3");
        		Mainframe_GlobalFunctionLib.pressKey("F3");
        		}
			}	
		}
		
		Mainframe_GlobalFunctionLib.sendText(21, 7,"runqry *n "+Library+"/"+File);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("F3");
		
		//Copying the records
		Mainframe_GlobalFunctionLib.sendText(21, 7,"cpyf");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(5, 37,File);
		Mainframe_GlobalFunctionLib.sendText(6, 39,Library);
		Mainframe_GlobalFunctionLib.sendText(7, 37,NewFile);
		Mainframe_GlobalFunctionLib.sendText(8, 39,Library);
		Mainframe_GlobalFunctionLib.sendText(11, 37,"     ");
		Mainframe_GlobalFunctionLib.sendText(11, 37,"*ADD");
		Mainframe_GlobalFunctionLib.sendText(12, 37,"*YES");
		Mainframe_GlobalFunctionLib.pressKey("F10");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("PageDown");
		Mainframe_GlobalFunctionLib.sendText(5, 37,"           ");
		Mainframe_GlobalFunctionLib.sendText(5, 37,"4");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		
		Mainframe_GlobalFunctionLib.sendText(21, 7,"runqry *n "+Library+"/"+NewFile);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("F3");
		
		
		//Modifications in New File
		Mainframe_GlobalFunctionLib.sendText(21, 7,"edtlibl");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(7, 12,"DBU10");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.sendText(21, 7,"DBU");
		Mainframe_GlobalFunctionLib.pressKey("F4");
		Mainframe_GlobalFunctionLib.sendText(5, 37,NewFile);
		Mainframe_GlobalFunctionLib.sendText(6, 39,Library);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(6, 16,"CHG");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("PageDown");
		Mainframe_GlobalFunctionLib.pressKey("PageDown");
		
		TimeUnit.SECONDS.sleep(5);
		String data = Mainframe_GlobalFunctionLib.getText(8,29);
		String t1 = data.substring(0, 52);
		String t2 = data.substring(53, 57);
		String t3 = t2.replace(t2, ",*ALL,*ALL,*ALL,");
		String t4 = data.substring(63,66);
		String t5 = t4.replace(t4, ",,,O");
		String t6 = data.substring(65);
		String t = data.substring(56, 62);
		
		String t7 = t1+t3+t+t5+t6;
		String t8 = t7.substring(178);
		String t9 = t8.replace(t8, "03,,,,,,,,,,");
		String t10 = t7.substring(0, 178);
		String t11 = t10+t9;
		Mainframe_GlobalFunctionLib.sendText(8, 29,t11);
		
		Mainframe_GlobalFunctionLib.pressKey("PageDown");
		Mainframe_GlobalFunctionLib.pressKey("PageDown");
		
		TimeUnit.SECONDS.sleep(5);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F5");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.sendText(8, 7,"1");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		
		Mainframe_GlobalFunctionLib.sendText(21, 7,"edtlibl");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(7, 12,Library);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		
		FunctionalLibrary.navigateToScreen("8");
		Mainframe_GlobalFunctionLib.sendText(9, 21,NewFile);
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Mainframe_GlobalFunctionLib.sendText(21, 7, "ws");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		String jobstatus1 = Mainframe_GlobalFunctionLib.getText(12,40);
		if(jobstatus1.equals("OUTQ"))
		{
			Mainframe_GlobalFunctionLib.sendText(12, 3,"8");
    		Mainframe_GlobalFunctionLib.pressKey("Enter");
    		Mainframe_GlobalFunctionLib.sendText(11, 3,"5");
    		Mainframe_GlobalFunctionLib.pressKey("Enter");
    		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
    		
		}
		else if (jobstatus1.equals("ACTIVE"))
		{
			
			TimeUnit.MINUTES.sleep(4);
			Mainframe_GlobalFunctionLib.pressKey("F5");
			String jobstat = Mainframe_GlobalFunctionLib.getText(12,40);
			if(jobstat.equals("OUTQ"))
    		{
			TimeUnit.SECONDS.sleep(3);
			Mainframe_GlobalFunctionLib.sendText(12, 3,"8");
    		Mainframe_GlobalFunctionLib.pressKey("Enter");
    		Mainframe_GlobalFunctionLib.sendText(11, 3,"5");
    		Mainframe_GlobalFunctionLib.pressKey("Enter");
    		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
    		}
		}
		else if (jobstatus1.equals("JOBQ"))
		{
			Mainframe_GlobalFunctionLib.sendText(12, 3,"2");
    		Mainframe_GlobalFunctionLib.pressKey("Enter");
    		Mainframe_GlobalFunctionLib.pressKey("F10");
    		Mainframe_GlobalFunctionLib.sendText(17, 37,"          ");
    		Mainframe_GlobalFunctionLib.sendText(17, 37,"QINTER");
    		Mainframe_GlobalFunctionLib.pressKey("Enter");
    		Mainframe_GlobalFunctionLib.pressKey("F5");
    		String jobstat = Mainframe_GlobalFunctionLib.getText(12,40);
			if(jobstat.equals("OUTQ"))
    		{
				TimeUnit.SECONDS.sleep(3);
				Mainframe_GlobalFunctionLib.sendText(12, 3,"8");
	    		Mainframe_GlobalFunctionLib.pressKey("Enter");
	    		Mainframe_GlobalFunctionLib.sendText(11, 3,"5");
	    		Mainframe_GlobalFunctionLib.pressKey("Enter");
	    		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
        		}
			else if(jobstat.equals("ACTIVE"))
			{
				TimeUnit.MINUTES.sleep(4);
    			Mainframe_GlobalFunctionLib.pressKey("F5");
    			String jobstatu = Mainframe_GlobalFunctionLib.getText(12,40);
    			if(jobstatu.equals("OUTQ"))
        		{
    			TimeUnit.SECONDS.sleep(3);
    			Mainframe_GlobalFunctionLib.sendText(12, 3,"8");
        		Mainframe_GlobalFunctionLib.pressKey("Enter");
        		Mainframe_GlobalFunctionLib.sendText(11, 3,"5");
        		Mainframe_GlobalFunctionLib.pressKey("Enter");
        		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
        		}
			}	
		}
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");
	}
	
	@Then("^Validating Brand/Generic Product Log Report is submitted and processed status is reflected in spool file when file is submitted with batch in Product MSC Batch Update with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void validating_Brand_Generic_Product_Log_Report_is_submitted_and_processed_status_is_reflected_in_spool_file_when_file_is_submitted_with_batch_in_Product_MSC_Batch_Update_with(String FromDate, String ThruDate, String File, String Library, String NewFile, String Carrier, String Account, String Group, String OverrideMSC1, String OverrideMSC2,String OverrideMSC3,String OverrideMSC4,String OverrideMSC5,String ProcessStatus1,String ProcessStatus2,String ProcessStatus3) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.sendText(13, 23,FromDate);
		Mainframe_GlobalFunctionLib.sendText(13, 54,ThruDate);
		Mainframe_GlobalFunctionLib.sendText(15, 22,File);
		Mainframe_GlobalFunctionLib.sendText(17, 22,Library);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Mainframe_GlobalFunctionLib.sendText(21, 7, "ws");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		String jobstatus = Mainframe_GlobalFunctionLib.getText(11,40);
		if(jobstatus.equals("OUTQ"))
		{
			Mainframe_GlobalFunctionLib.sendText(11, 3,"8");
    		Mainframe_GlobalFunctionLib.pressKey("Enter");
    		Mainframe_GlobalFunctionLib.sendText(11, 3,"5");
    		Mainframe_GlobalFunctionLib.pressKey("Enter");
    		Mainframe_GlobalFunctionLib.sendText(3,22,"W30");
    		Mainframe_GlobalFunctionLib.pressKey("Enter");
    		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
    		Mainframe_GlobalFunctionLib.pressKey("PageDown");
    		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
    		Mainframe_GlobalFunctionLib.pressKey("F3");
    		Mainframe_GlobalFunctionLib.pressKey("F3");
		}
		else if (jobstatus.equals("ACTIVE"))
		{
			
			TimeUnit.MINUTES.sleep(4);
			Mainframe_GlobalFunctionLib.pressKey("F5");
			String jobstat = Mainframe_GlobalFunctionLib.getText(11,40);
			if(jobstat.equals("OUTQ"))
    		{
			TimeUnit.SECONDS.sleep(3);
			Mainframe_GlobalFunctionLib.sendText(11, 3,"8");
    		Mainframe_GlobalFunctionLib.pressKey("Enter");
    		Mainframe_GlobalFunctionLib.sendText(11, 3,"5");
    		Mainframe_GlobalFunctionLib.pressKey("Enter");
    		Mainframe_GlobalFunctionLib.sendText(3,22,"W30");
    		Mainframe_GlobalFunctionLib.pressKey("Enter");
    		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
    		Mainframe_GlobalFunctionLib.pressKey("PageDown");
    		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
    		Mainframe_GlobalFunctionLib.pressKey("F3");
    		Mainframe_GlobalFunctionLib.pressKey("F3");
    		}
		}
		else if (jobstatus.equals("JOBQ"))
		{
			Mainframe_GlobalFunctionLib.sendText(11, 3,"2");
    		Mainframe_GlobalFunctionLib.pressKey("Enter");
    		Mainframe_GlobalFunctionLib.pressKey("F10");
    		Mainframe_GlobalFunctionLib.sendText(17, 37,"          ");
    		Mainframe_GlobalFunctionLib.sendText(17, 37,"QINTER");
    		Mainframe_GlobalFunctionLib.pressKey("Enter");
    		Mainframe_GlobalFunctionLib.pressKey("F5");
    		String jobstat = Mainframe_GlobalFunctionLib.getText(11,40);
			if(jobstat.equals("OUTQ"))
    		{
				TimeUnit.SECONDS.sleep(3);
				Mainframe_GlobalFunctionLib.sendText(11, 3,"8");
	    		Mainframe_GlobalFunctionLib.pressKey("Enter");
	    		Mainframe_GlobalFunctionLib.sendText(11, 3,"5");
	    		Mainframe_GlobalFunctionLib.pressKey("Enter");
	    		Mainframe_GlobalFunctionLib.sendText(3,22,"W30");
        		Mainframe_GlobalFunctionLib.pressKey("Enter");
        		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
        		Mainframe_GlobalFunctionLib.pressKey("PageDown");
        		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	    		Mainframe_GlobalFunctionLib.pressKey("F3");
	    		Mainframe_GlobalFunctionLib.pressKey("F3");
	    		}
			else if(jobstat.equals("ACTIVE"))
			{
				TimeUnit.MINUTES.sleep(4);
    			Mainframe_GlobalFunctionLib.pressKey("F5");
    			String jobstatu = Mainframe_GlobalFunctionLib.getText(11,40);
    			if(jobstatu.equals("OUTQ"))
        		{
    			TimeUnit.SECONDS.sleep(3);
    			Mainframe_GlobalFunctionLib.sendText(11, 3,"8");
        		Mainframe_GlobalFunctionLib.pressKey("Enter");
        		Mainframe_GlobalFunctionLib.sendText(11, 3,"5");
        		Mainframe_GlobalFunctionLib.pressKey("Enter");
        		Mainframe_GlobalFunctionLib.sendText(3,22,"W30");
        		Mainframe_GlobalFunctionLib.pressKey("Enter");
        		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
        		Mainframe_GlobalFunctionLib.pressKey("PageDown");
        		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
        		Mainframe_GlobalFunctionLib.pressKey("F3");
        		Mainframe_GlobalFunctionLib.pressKey("F3");
        		}
			}	
		}
		
		Mainframe_GlobalFunctionLib.sendText(21, 7,"runqry *n "+Library+"/"+File);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("F3");
		
		//Copying the records
		Mainframe_GlobalFunctionLib.sendText(21, 7,"cpyf");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(5, 37,File);
		Mainframe_GlobalFunctionLib.sendText(6, 39,Library);
		Mainframe_GlobalFunctionLib.sendText(7, 37,NewFile);
		Mainframe_GlobalFunctionLib.sendText(8, 39,Library);
		Mainframe_GlobalFunctionLib.sendText(11, 37,"     ");
		Mainframe_GlobalFunctionLib.sendText(11, 37,"*ADD");
		Mainframe_GlobalFunctionLib.sendText(12, 37,"*YES");
		Mainframe_GlobalFunctionLib.pressKey("F10");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("PageDown");
		Mainframe_GlobalFunctionLib.sendText(5, 37,"           ");
		Mainframe_GlobalFunctionLib.sendText(5, 37,"4");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		
		Mainframe_GlobalFunctionLib.sendText(21, 7,"runqry *n "+Library+"/"+NewFile);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("F3");
		
		
		//Modifications in New File
		Mainframe_GlobalFunctionLib.sendText(21, 7,"edtlibl");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(7, 12,"DBU10");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.sendText(21, 7,"DBU");
		Mainframe_GlobalFunctionLib.pressKey("F4");
		Mainframe_GlobalFunctionLib.sendText(5, 37,NewFile);
		Mainframe_GlobalFunctionLib.sendText(6, 39,Library);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(6, 16,"CHG");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("PageDown");
		Mainframe_GlobalFunctionLib.pressKey("PageDown");
		
		TimeUnit.SECONDS.sleep(5);
		String data = Mainframe_GlobalFunctionLib.getText(8,29);
		String t1 = data.substring(0, 52);
		String t2 = data.substring(53, 57);
		String t3 = t2.replace(t2, ",*ALL,*ALL,*ALL,");
		String t4 = data.substring(63,66);
		String t5 = t4.replace(t4, ",,,O");
		String t6 = data.substring(65);
		String t = data.substring(56, 62);
		
		String t7 = t1+t3+t+t5+t6;
		String t8 = t7.substring(178);
		String t9 = t8.replace(t8, "03,,,,,,,,,,");
		String t10 = t7.substring(0, 178);
		String t11 = t10+t9;
		Mainframe_GlobalFunctionLib.sendText(8, 29,t11);
		
		Mainframe_GlobalFunctionLib.pressKey("PageDown");
		Mainframe_GlobalFunctionLib.pressKey("PageDown");
		
		TimeUnit.SECONDS.sleep(5);
		String data1 = Mainframe_GlobalFunctionLib.getText(8, 29);
		String t01 = data1.substring(0, 61);
		String t02 = data1.substring(61, 64);
		String t03 = t02.replace(t02, "*ALL,*ALL,*ALL");
		String t04 = data1.substring(71,74);
		String t05 = t04.replace(t04, ",,Y");
		String t06 = data1.substring(73);
		String t0 = data1.substring(63, 71);
		String t07 = t01+t03+t0+t05+t06;
		String t08 = t07.substring(233);
		String t09 = t08.replace(t08, "04,,,,,,,,,,");
		String t010 = t07.substring(0, 233);
		String t011 = t010+t09;
		Mainframe_GlobalFunctionLib.sendText(8, 29,t011);
		
		Mainframe_GlobalFunctionLib.pressKey("PageDown");
		Mainframe_GlobalFunctionLib.pressKey("PageDown");
		
		TimeUnit.SECONDS.sleep(5);
		String data2 = Mainframe_GlobalFunctionLib.getText(8, 29);
		String t001 = data2.substring(0, 62);
		String t002 = data2.substring(61, 64);
		String t003 = t002.replace(t002, "*ALL,*ALL,*ALL");
		String t004 = data2.substring(71,74);
		String t005 = t004.replace(t004, ",,,N");
		String t006 = data2.substring(74);
		String t00 = data2.substring(64, 71);
		
		String t007 = t001+t003+t00+t005+t006;
		String t008 = t007.substring(226);
		String t009 = t008.replace(t8, "05,,,,,,,,,,");
		String t0010 = t007.substring(0, 226);
		String t0011 = t0010+t009;
		Mainframe_GlobalFunctionLib.sendText(8, 29,t0011);
		
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F5");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.sendText(8, 7,"1");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		
		Mainframe_GlobalFunctionLib.sendText(21, 7,"edtlibl");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(7, 12,Library);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		
		FunctionalLibrary.navigateToScreen("8");
		Mainframe_GlobalFunctionLib.sendText(9, 21,NewFile);
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Mainframe_GlobalFunctionLib.sendText(21, 7, "ws");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		String jobstatus1 = Mainframe_GlobalFunctionLib.getText(12,40);
		if(jobstatus1.equals("OUTQ"))
		{
			Mainframe_GlobalFunctionLib.sendText(12, 3,"8");
    		Mainframe_GlobalFunctionLib.pressKey("Enter");
    		Mainframe_GlobalFunctionLib.sendText(11, 3,"5");
    		Mainframe_GlobalFunctionLib.pressKey("Enter");
    		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
    		
		}
		else if (jobstatus1.equals("ACTIVE"))
		{
			
			TimeUnit.MINUTES.sleep(4);
			Mainframe_GlobalFunctionLib.pressKey("F5");
			String jobstat = Mainframe_GlobalFunctionLib.getText(12,40);
			if(jobstat.equals("OUTQ"))
    		{
			TimeUnit.SECONDS.sleep(3);
			Mainframe_GlobalFunctionLib.sendText(12, 3,"8");
    		Mainframe_GlobalFunctionLib.pressKey("Enter");
    		Mainframe_GlobalFunctionLib.sendText(11, 3,"5");
    		Mainframe_GlobalFunctionLib.pressKey("Enter");
    		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
    		}
		}
		else if (jobstatus1.equals("JOBQ"))
		{
			Mainframe_GlobalFunctionLib.sendText(12, 3,"2");
    		Mainframe_GlobalFunctionLib.pressKey("Enter");
    		Mainframe_GlobalFunctionLib.pressKey("F10");
    		Mainframe_GlobalFunctionLib.sendText(17, 37,"          ");
    		Mainframe_GlobalFunctionLib.sendText(17, 37,"QINTER");
    		Mainframe_GlobalFunctionLib.pressKey("Enter");
    		Mainframe_GlobalFunctionLib.pressKey("F5");
    		String jobstat = Mainframe_GlobalFunctionLib.getText(12,40);
			if(jobstat.equals("OUTQ"))
    		{
				TimeUnit.SECONDS.sleep(3);
				Mainframe_GlobalFunctionLib.sendText(12, 3,"8");
	    		Mainframe_GlobalFunctionLib.pressKey("Enter");
	    		Mainframe_GlobalFunctionLib.sendText(11, 3,"5");
	    		Mainframe_GlobalFunctionLib.pressKey("Enter");
	    		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
        		}
			else if(jobstat.equals("ACTIVE"))
			{
				TimeUnit.MINUTES.sleep(4);
    			Mainframe_GlobalFunctionLib.pressKey("F5");
    			String jobstatu = Mainframe_GlobalFunctionLib.getText(12,40);
    			if(jobstatu.equals("OUTQ"))
        		{
    			TimeUnit.SECONDS.sleep(3);
    			Mainframe_GlobalFunctionLib.sendText(12, 3,"8");
        		Mainframe_GlobalFunctionLib.pressKey("Enter");
        		Mainframe_GlobalFunctionLib.sendText(11, 3,"5");
        		Mainframe_GlobalFunctionLib.pressKey("Enter");
        		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
        		}
			}	
		}
		
	}

	@Then("^Validating product notes,older msc,updated msc and Q Automated Product MSC Update message after submitting the batch with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void validating_product_notes_older_msc_updated_msc_and_Q_Automated_Product_MSC_Update_message_after_submitting_the_batch_with(String fdate, String tdate, String file, String lib, String oldfile) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.sendText(6, 39,fdate);
		Mainframe_GlobalFunctionLib.sendText(7, 39,tdate);
		Mainframe_GlobalFunctionLib.sendText(10, 39,file);
		Mainframe_GlobalFunctionLib.sendText(11, 39,lib);
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Mainframe_GlobalFunctionLib.sendText(21, 7, "ws");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		String jobstatus1 = Mainframe_GlobalFunctionLib.getText(11,40);
		if(jobstatus1.equals("OUTQ"))
		{
			Mainframe_GlobalFunctionLib.sendText(11, 3,"8");
    		Mainframe_GlobalFunctionLib.pressKey("Enter");
    		Mainframe_GlobalFunctionLib.sendText(11, 3,"5");
    		Mainframe_GlobalFunctionLib.pressKey("Enter");
    		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
    		
		}
		else if (jobstatus1.equals("ACTIVE"))
		{
			
			TimeUnit.MINUTES.sleep(4);
			Mainframe_GlobalFunctionLib.pressKey("F5");
			String jobstat = Mainframe_GlobalFunctionLib.getText(11,40);
			if(jobstat.equals("OUTQ"))
    		{
			TimeUnit.SECONDS.sleep(3);
			Mainframe_GlobalFunctionLib.sendText(11, 3,"8");
    		Mainframe_GlobalFunctionLib.pressKey("Enter");
    		Mainframe_GlobalFunctionLib.sendText(11, 3,"5");
    		Mainframe_GlobalFunctionLib.pressKey("Enter");
    		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
    		}
		}
		else if (jobstatus1.equals("JOBQ"))
		{
			Mainframe_GlobalFunctionLib.sendText(11, 3,"2");
    		Mainframe_GlobalFunctionLib.pressKey("Enter");
    		Mainframe_GlobalFunctionLib.pressKey("F10");
    		Mainframe_GlobalFunctionLib.sendText(17, 37,"          ");
    		Mainframe_GlobalFunctionLib.sendText(17, 37,"QINTER");
    		Mainframe_GlobalFunctionLib.pressKey("Enter");
    		Mainframe_GlobalFunctionLib.pressKey("F5");
    		String jobstat = Mainframe_GlobalFunctionLib.getText(11,40);
			if(jobstat.equals("OUTQ"))
    		{
				TimeUnit.SECONDS.sleep(3);
				Mainframe_GlobalFunctionLib.sendText(11, 3,"8");
	    		Mainframe_GlobalFunctionLib.pressKey("Enter");
	    		Mainframe_GlobalFunctionLib.sendText(11, 3,"5");
	    		Mainframe_GlobalFunctionLib.pressKey("Enter");
	    		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
        		}
			else if(jobstat.equals("ACTIVE"))
			{
				TimeUnit.MINUTES.sleep(4);
    			Mainframe_GlobalFunctionLib.pressKey("F5");
    			String jobstatu = Mainframe_GlobalFunctionLib.getText(11,40);
    			if(jobstatu.equals("OUTQ"))
        		{
    			TimeUnit.SECONDS.sleep(3);
    			Mainframe_GlobalFunctionLib.sendText(11, 3,"8");
        		Mainframe_GlobalFunctionLib.pressKey("Enter");
        		Mainframe_GlobalFunctionLib.sendText(11, 3,"5");
        		Mainframe_GlobalFunctionLib.pressKey("Enter");
        		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
        		}
			}	
		}
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.sendText(21, 7,"runqry *n "+lib+"/"+oldfile);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Robot ro = new Robot();
		ro.keyPress(KeyEvent.VK_SHIFT);
		ro.keyPress(KeyEvent.VK_F9);
		ro.keyRelease(KeyEvent.VK_F9);
		ro.keyRelease(KeyEvent.VK_SHIFT);
		String prod1 = Mainframe_GlobalFunctionLib.getText(7, 9);
		String prod[]= prod1.split(",");
		String product1 = prod[0];
		
		String prod2 = Mainframe_GlobalFunctionLib.getText(8, 9);
		String produ[]= prod2.split(",");
		String product2 = produ[0];
		
		String prod3 = Mainframe_GlobalFunctionLib.getText(9, 9);
		String produc[]= prod3.split(",");
		String product3 = produc[0];
		
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		
		FunctionalLibrary.navigateToScreen("2");
		FunctionalLibrary.navigateToScreen("1");
		Mainframe_GlobalFunctionLib.pressKey("F15");
		
		Mainframe_GlobalFunctionLib.sendText(4, 5,product1);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(11, 2,"5");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		
		String Prod1MSC = Mainframe_GlobalFunctionLib.getText(7, 72).trim();
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.sendText(11, 2,"14");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(18, 16,"1");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(9, 2,"5");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		
		String OldProd1MSC = Mainframe_GlobalFunctionLib.getText(10, 15).trim();
		if(Prod1MSC.equals(OldProd1MSC))
		{
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		}
		else
		{
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			System.out.println("MSC is not updated");
		}
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.sendText(18, 16,"2");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.sendText(11, 2,"5");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F14");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		
		Mainframe_GlobalFunctionLib.sendText(4, 5,product2);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(11, 2,"5");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		
		String Prod2MSC = Mainframe_GlobalFunctionLib.getText(7, 72).trim();
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.sendText(11, 2,"14");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(18, 16,"1");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(9, 2,"5");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		
		String OldProd2MSC = Mainframe_GlobalFunctionLib.getText(10, 15).trim();
		if(Prod2MSC.equals(OldProd2MSC))
		{
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		}
		else
		{
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			System.out.println("MSC is not updated");
		}
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.sendText(18, 16,"2");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.sendText(11, 2,"5");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F14");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		
		Mainframe_GlobalFunctionLib.sendText(4, 5,product3);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(11, 2,"5");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		
		String Prod3MSC = Mainframe_GlobalFunctionLib.getText(7, 72).trim();
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.sendText(11, 2,"14");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(18, 16,"1");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(9, 2,"5");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		
		String OldProd3MSC = Mainframe_GlobalFunctionLib.getText(10, 15).trim();
		if(Prod3MSC.equals(OldProd3MSC))
		{
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		}
		else
		{
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			System.out.println("MSC is not updated");
		}
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.sendText(18, 16,"2");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.sendText(11, 2,"5");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F14");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F12");
	}
}
