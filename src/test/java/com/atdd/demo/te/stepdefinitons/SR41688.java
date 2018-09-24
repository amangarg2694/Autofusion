package com.atdd.demo.te.stepdefinitons;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

import org.testng.Assert;

import com.atdd.te.screenHelpers.FunctionalLibrary;
import com.cucumber.listener.Reporter;
import com.hp.lft.report.ReportException;
import com.hp.lft.sdk.GeneralLeanFtException;
import com.itextpdf.text.log.SysoCounter;
import com.optumrx.autofusion.core.te.util.Mainframe_GlobalFunctionLib;
import com.optumrx.autofusion.core.te.util.Screenshot;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class SR41688 {
	public String aetnaRecord = null;
	Map< String,String> map = new HashMap< String,String>();
	String getDeletedRecord = null;
	String getUpdatedRecord = null;

	@When("^I create record for CMDWNP file member\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_create_record_for_CMDWNP_file_member(String library, String file, String member) throws Throwable {
		// Write code here that turns the phrase above into concrete actions

		Mainframe_GlobalFunctionLib.sendText(21, 7,"YWRKF "+library+"/"+file+" "+member);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F18");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());

		for(int i=9; i<22;){
			String columnValue = Mainframe_GlobalFunctionLib.getText(i, 4).substring(0, 6);
			if(columnValue.equalsIgnoreCase("AETNRT")){
				int j=10;
				do{
					Mainframe_GlobalFunctionLib.sendText(i, 2,"C");
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					Thread.sleep(1000);
					Mainframe_GlobalFunctionLib.sendText(9, 41,"1612"+j);
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					Mainframe_GlobalFunctionLib.sendText(24, 73,"Y");
					Thread.sleep(1000);
					j++;
				} while(j<30);
				break;
			}
			else{
				i++;
			}
		}
		Mainframe_GlobalFunctionLib.pressKey("PageDown");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("F3");

		getDeletedRecord = DSPFile(library, file, member);

		Mainframe_GlobalFunctionLib.pressKey("F12");
		Thread.sleep(1000);
	}

	@When("^I create record for internal files\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_create_record_for_internal_files(String library, String file) throws Throwable {
		// Write code here that turns the phrase above into concrete actions

		Mainframe_GlobalFunctionLib.sendText(21, 7,"YWRKF "+library+"/"+file);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F18");

		for(int i=8; i<22;){
			String columnValue = Mainframe_GlobalFunctionLib.getText(i, 4).substring(0, 3);
			if(columnValue.equalsIgnoreCase("REQ") || columnValue.equalsIgnoreCase("ACK") ){
				int j=10;
				do{
					Mainframe_GlobalFunctionLib.sendText(i, 2,"C");
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					Thread.sleep(1000);
					Mainframe_GlobalFunctionLib.sendText(8, 46,"1412"+j);
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					Mainframe_GlobalFunctionLib.sendText(24, 73,"Y");
					Thread.sleep(1000);
					j++;
				} while(j<30);
				break;
			}
			else{
				i++;
			}
		}
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("F3");

		String qry ="SELECT  COUNT(*) FROM "+library+"/"+file;
		Mainframe_GlobalFunctionLib.sendText(21, 7, "STRSQL");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(5, 7 ,qry);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F12");

		qry = "SELECT  COUNT(*) FROM "+library+"/"+file+" WHERE SUBSTR(XMLREC,6,6) <  150101";
		Mainframe_GlobalFunctionLib.sendText(6, 7 ,qry);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		String recordCount = Mainframe_GlobalFunctionLib.getText(6, 2);
		//	int reCount = Integer.parseInt(recordCount);
		System.out.println("print record ="+recordCount);
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		if(file.equalsIgnoreCase("UHGINPP") || file.equalsIgnoreCase("HCSCINPP")){
			map.put("recodCounts1", recordCount);
		}else if (file.equalsIgnoreCase("UHGIAIP")|| file.equalsIgnoreCase("HCSCIAIP")) {
			map.put("recodCounts2", recordCount);
		}else if (file.equalsIgnoreCase("UHGIAOP")|| file.equalsIgnoreCase("HCSCIAOP")) {
			map.put("recodCounts3", recordCount);
		}else{
			Assert.fail("uiup");
		}

		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.sendText(5, 31 ,"2");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
	}

	@When("^I create record for SysAccumLog files\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_create_record_for_SysAccumLog_files(String library, String file) throws Throwable {
		// Write code here that turns the phrase above into concrete actions

		Mainframe_GlobalFunctionLib.sendText(21, 7,"YWRKF "+library+"/"+file);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F18");

		for(int i=9; i<22;){
			String columnValue = Mainframe_GlobalFunctionLib.getText(i, 4).substring(0, 15);
			if(!columnValue.equalsIgnoreCase("*DELETED RECORD")){
				int j=10;
				do{
					Mainframe_GlobalFunctionLib.sendText(i, 2,"C");
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					Thread.sleep(1000);
					Mainframe_GlobalFunctionLib.sendText(8, 41,"1612"+j);
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					Mainframe_GlobalFunctionLib.sendText(24, 73,"Y");
					Thread.sleep(1000);
					j++;
				} while(j<30);
				break;
			}
			else{
				i++;
			}
		}
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("F3");

		String qry ="SELECT  COUNT(*) FROM "+library+"/"+file;
		Mainframe_GlobalFunctionLib.sendText(21, 7, "STRSQL");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(5, 7 ,qry);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		if(file.contentEquals("CMIAIP")){
			qry = "SELECT  COUNT(*) FROM "+library+"/"+file+" WHERE AHDACF  < 20170101 ";
		}else{
			qry = "SELECT  COUNT(*) FROM "+library+"/"+file+" WHERE AGC6CF   < 20170101 ";
		}
		Mainframe_GlobalFunctionLib.sendText(6, 7 ,qry);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		getUpdatedRecord = Mainframe_GlobalFunctionLib.getText(6, 2);
		//	int reCount = Integer.parseInt(recordCount);
		System.out.println("print record ="+getUpdatedRecord);
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());

		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.sendText(5, 31 ,"2");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
	}

	private String DSPFile(String library, String file, String member) throws Throwable {

		Mainframe_GlobalFunctionLib.sendText(21, 7,"DSPFD FILE("+library+"/"+file+")");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(4, 22,member);
		Mainframe_GlobalFunctionLib.pressKey("F16");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());

		Mainframe_GlobalFunctionLib.sendText(4, 22,"Number of deleted records");
		Mainframe_GlobalFunctionLib.pressKey("F16");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());

		String recordCount = Mainframe_GlobalFunctionLib.getText(7, 33);
		String [] split = recordCount.split(":");
		String getValue = split[1];
		split = getValue.split("               ");
		String str = split[1];
		String getDelRecord = null;
		for(int i=0;i< str.length();i++){
			char st = str.charAt(i);
			if(!(st == ' ')){
				System.out.println(st);
				getDelRecord = str.substring(i, str.length());
				System.out.println(getDelRecord);
				break;
			}		

		}

		return getDelRecord;
	}  

	@When("^I navigate to Purge accum log files screen$")
	public void i_navigate_to_Purge_accum_log_files_screen() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.sendText(21, 7 ,"CCT800");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(21, 7 ,"13" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(21, 7 ,"10" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(21, 7 ,"6" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	}

	@When("^Enter Purge value \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void enter_Purge_value(String x_coordinates,String purge, String month) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.sendText(x_coordinates, "4" ,purge);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(x_coordinates, "13" , month);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("F6" );	
	}

	@Then("^I Validate the Job is completed \"([^\"]*)\",\"([^\"]*)\"$")
	public void i_Validate_the_Job_is_completed(String Juser, String Jname) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		Thread.sleep(3000);
		String qry="WRKJOB JOB("+Juser+"/"+Jname+")";

		Mainframe_GlobalFunctionLib.sendText(21, 7,qry);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Thread.sleep(2000);
		String status = Mainframe_GlobalFunctionLib.getText(8, 52);
		Thread.sleep(2000);
		if(status.contains("JOBQ"))

		{
			Thread.sleep(2000);
			String jobN = Mainframe_GlobalFunctionLib.getText(8, 34);
			Thread.sleep(2000);
			Mainframe_GlobalFunctionLib.pressKey("F12");
			Mainframe_GlobalFunctionLib.pressKey("F12");
			String qry2="CHGJOB";
			Thread.sleep(2000);
			Mainframe_GlobalFunctionLib.sendText(21, 7,qry2);   
			Thread.sleep(2000);
			Mainframe_GlobalFunctionLib.pressKey("F4");  	
			Thread.sleep(3000);
			Mainframe_GlobalFunctionLib.sendText(5, 37,Jname);
			Thread.sleep(1000);
			Mainframe_GlobalFunctionLib.sendText(6, 39,Juser);
			Thread.sleep(1000);
			Mainframe_GlobalFunctionLib.sendText(7, 39,jobN);
			Thread.sleep(1000);
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Thread.sleep(1000);
			Mainframe_GlobalFunctionLib.pressKey("F10");    
			Thread.sleep(2000);
			Mainframe_GlobalFunctionLib.sendText(17, 37,"QPGMR ");
			Thread.sleep(3000);
			Mainframe_GlobalFunctionLib.pressKey("Enter");

			System.out.println("Job Completed Successfully: "+status);

			Thread.sleep(2000);
			Mainframe_GlobalFunctionLib.sendText(21, 7,qry);
			Thread.sleep(2000);
			Mainframe_GlobalFunctionLib.pressKey("Enter");
		}

		else if(status.contains("ACTIVE")) {
			do{
				Mainframe_GlobalFunctionLib.pressKey("F12");
				Mainframe_GlobalFunctionLib.sendText(21, 7,qry);
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Thread.sleep(5000);
			} while(Mainframe_GlobalFunctionLib.getText(8, 52).contains("ACTIVE"));
			Thread.sleep(3000);
		}
		else
		{
			System.out.println("Job Completed Successfully: "+status);
			Thread.sleep(1000);
		}

		Mainframe_GlobalFunctionLib.sendText(8, 4,"1");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(21, 7,"4");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(11, 3,"5");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());

	}

	@Then("^I Validate activeMonths,Purge,Files \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" displays in Spool file$")
	public void i_Validate_activeMonths_displays_in_Spool_file(String month, String PurgeField, String file1, String file2, String file3) throws Throwable {
		// Write code here that turns the phrase above into concrete actions

		Mainframe_GlobalFunctionLib.sendText(3, 22,"B");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());

		PurgeRecordValidation(file1,"recodCounts1");
		PurgeRecordValidation(file2,"recodCounts2");
		PurgeRecordValidation(file3,"recodCounts3");

		Mainframe_GlobalFunctionLib.sendText(3, 22,"T");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(3, 22,"W35");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		if(file1.equalsIgnoreCase("HCSCINPP")){
			Mainframe_GlobalFunctionLib.sendText(4, 22,"STD FRAMEWK Internal Files");
			Mainframe_GlobalFunctionLib.pressKey("F16");
			Mainframe_GlobalFunctionLib.sendText(4, 22,"Purge Flag                ");
			Mainframe_GlobalFunctionLib.pressKey("F16");
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		}else if (file1.equalsIgnoreCase("UHGINPP")) {
			Mainframe_GlobalFunctionLib.sendText(4, 22,"UHG Internal Files");
			Mainframe_GlobalFunctionLib.pressKey("F16");
			Mainframe_GlobalFunctionLib.sendText(4, 22,"Purge Flag        ");
			Mainframe_GlobalFunctionLib.pressKey("F16");
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		}

		String purgeFlag = Mainframe_GlobalFunctionLib.getText(7, 17);
		String splitValue = purgeFlag.substring(0, 1);
		Assert.assertTrue(splitValue.equalsIgnoreCase(PurgeField), "Purge flag is not Y");

		String actMonth = purgeFlag.substring(80, 82);
		Assert.assertTrue(actMonth.equalsIgnoreCase(month), "Active month is not matching");
		Thread.sleep(1000);
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.sendText(21, 7 ,"CCT600");
		Mainframe_GlobalFunctionLib.pressKey("Enter");

	}

	private void PurgeRecordValidation(String file, String key) throws Throwable{
		String recordDetails = null;
		Mainframe_GlobalFunctionLib.sendText(4, 22,file);
		Mainframe_GlobalFunctionLib.pressKey("F16");
		if(file.equalsIgnoreCase("UHGINPP") ||file.equalsIgnoreCase("UHGIAIP") || file.equalsIgnoreCase("UHGIAOP")){
			recordDetails = Mainframe_GlobalFunctionLib.getText(7, 11);
		}else{
			recordDetails = Mainframe_GlobalFunctionLib.getText(7, 11);
		}
		String fileName = recordDetails.substring(0, 2);
		System.out.println("Print file record==="+fileName);
		Assert.assertTrue(fileName.equalsIgnoreCase(map.get(key)), "Purged records are not matching");
	}
	private void CMDWNPPurgeRecValidation(String library,String file, String member) throws Throwable{
		String recordDetails = null;
		String fileName = file+"/"+member;
		Mainframe_GlobalFunctionLib.sendText(4, 22,fileName );
		Mainframe_GlobalFunctionLib.pressKey("F16");
		if(fileName.equalsIgnoreCase("CMDWNP/AETNRT") ||fileName.equalsIgnoreCase("CMDWNP/UHGNRT") || fileName.equalsIgnoreCase("ESBNRT")){
			recordDetails = Mainframe_GlobalFunctionLib.getText(7, 16);
		}
		String getRecord = recordDetails.substring(0, 2);
		System.out.println("Print file record==="+getRecord);
		int record = Integer.parseInt(getRecord);

		Mainframe_GlobalFunctionLib.pressKey("F3");
		getUpdatedRecord = DSPFile(library, file, member);
		int prevDelRecords = Integer.parseInt(getDeletedRecord);
		int updatedDelRecord = Integer.parseInt(getUpdatedRecord);
		int totalDeletedRecord = updatedDelRecord - prevDelRecords;
		Assert.assertTrue(record == totalDeletedRecord, "Purged records are not matching");
	}

	@Then("^I Validate total record Purged for \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_Validate_total_record_Purged_for_in_file(String library, String fileMember, String fileName, String PurgeField, String month) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.sendText(3, 22,"W35");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		if(fileMember.equalsIgnoreCase("AETNRT")){
			Mainframe_GlobalFunctionLib.sendText(4, 22,"AETNA");
			Mainframe_GlobalFunctionLib.pressKey("F16");
			Mainframe_GlobalFunctionLib.sendText(4, 22,"Purge Flag");
			Mainframe_GlobalFunctionLib.pressKey("F16");
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		}else if (fileMember.equalsIgnoreCase("UHGNRT")) {
			Mainframe_GlobalFunctionLib.sendText(4, 22,"UHG Downtime File");
			Mainframe_GlobalFunctionLib.pressKey("F16");
			Mainframe_GlobalFunctionLib.sendText(4, 22,"Purge Flag       ");
			Mainframe_GlobalFunctionLib.pressKey("F16");
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		}else if (fileMember.equalsIgnoreCase("ESBNRT")) {
			Mainframe_GlobalFunctionLib.sendText(4, 22,"STD FRAMEWK Downtime File");
			Mainframe_GlobalFunctionLib.pressKey("F16");
			Mainframe_GlobalFunctionLib.sendText(4, 22,"Purge Flag               ");
			Mainframe_GlobalFunctionLib.pressKey("F16");
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		}
		String purgeFlag = Mainframe_GlobalFunctionLib.getText(7, 17);
		String splitValue = purgeFlag.substring(0, 1);
		Assert.assertTrue(splitValue.equalsIgnoreCase(PurgeField), "Purge flag is not Y");

		String actMonth = purgeFlag.substring(80, 82);
		Assert.assertTrue(actMonth.equalsIgnoreCase(month), "Active month is not matching");
		Thread.sleep(1000);

		Mainframe_GlobalFunctionLib.sendText(3, 22,"W01");
		Mainframe_GlobalFunctionLib.pressKey("Enter");

		Mainframe_GlobalFunctionLib.sendText(3, 22,"B  ");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());

		CMDWNPPurgeRecValidation(library, fileName, fileMember);

		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.sendText(21, 7 ,"CCT600");
		Mainframe_GlobalFunctionLib.pressKey("Enter");

	}

	@Then("^I Validate activeMonths,Purge,Files \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" displays in Spool file$")
	public void i_Validate_activeMonths_Purge_Files_displays_in_Spool_file(String file, String PurgeField, String month) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.sendText(3, 22,"B");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());

		Mainframe_GlobalFunctionLib.sendText(4, 22,file);
		Mainframe_GlobalFunctionLib.pressKey("F16");
		Mainframe_GlobalFunctionLib.pressKey("F16");
		String recordDetails = Mainframe_GlobalFunctionLib.getText(7, 9);
		
		String fileName = recordDetails.substring(0, 2);
		System.out.println("Print file record==="+fileName);
		Assert.assertTrue(fileName.equalsIgnoreCase(getUpdatedRecord), "Purged records are not matching");
		
		Mainframe_GlobalFunctionLib.sendText(3, 22,"T");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(3, 22,"W35");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		if(file.equalsIgnoreCase("CMIAIP")){
			Mainframe_GlobalFunctionLib.sendText(4, 22,"CMIAIP");
			Mainframe_GlobalFunctionLib.pressKey("F16");
			Mainframe_GlobalFunctionLib.sendText(4, 22,"Purge Flag");
			Mainframe_GlobalFunctionLib.pressKey("F16");
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		}else if (file.equalsIgnoreCase("CMIAOP")) {
			Mainframe_GlobalFunctionLib.sendText(4, 22,"CMIAOP");
			Mainframe_GlobalFunctionLib.pressKey("F16");
			Mainframe_GlobalFunctionLib.sendText(4, 22,"Purge Flag");
			Mainframe_GlobalFunctionLib.pressKey("F16");
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		}

		String purgeFlag = Mainframe_GlobalFunctionLib.getText(7, 17);
		String splitValue = purgeFlag.substring(0, 1);
		Assert.assertTrue(splitValue.equalsIgnoreCase(PurgeField), "Purge flag is not Y");

		String actMonth = purgeFlag.substring(80, 82);
		Assert.assertTrue(actMonth.equalsIgnoreCase(month), "Active month is not matching");
		Thread.sleep(2000);
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.sendText(21, 7 ,"CCT600");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
	}
}


