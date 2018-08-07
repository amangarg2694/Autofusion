package com.atdd.demo.te.stepdefinitons;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.concurrent.TimeUnit;

import com.atdd.te.screenHelpers.FunctionalLibrary;
import com.cucumber.listener.Reporter;
import com.optumrx.autofusion.core.te.util.Mainframe_GlobalFunctionLib;
import com.optumrx.autofusion.core.te.util.Screenshot;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PMCCodeLimit {
	
	@Then("^Capture the claim number$")
	public void capture_the_claim_number() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String RxClaim_Number = Mainframe_GlobalFunctionLib.getText(3, 12);
		Path FileName = Paths.get("C:\\Users\\spriya7\\git\\RxClaim_ATDD\\src\\test\\resources\\features\\RxClaim\\featureFiles\\SR41377\\TestData.txt");
		BufferedWriter writer = Files.newBufferedWriter(FileName , StandardOpenOption.TRUNCATE_EXISTING);
		writer.write(RxClaim_Number);
		writer.close();
	}
	@Then("^updating the pmc code with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void updating_the_pmc_code_with(String code1, String code2, String codelength, String lib, String file) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Path readFile = Paths.get("C:\\Users\\spriya7\\git\\RxClaim_ATDD\\src\\test\\resources\\features\\RxClaim\\featureFiles\\SR41377\\TestData.txt");
		String RxClaimNumber = "";
		try (BufferedReader reader = 
                 Files.newBufferedReader(readFile, StandardCharsets.UTF_8)) {
            String data;
            while ((data = reader.readLine()) != null) {
            	RxClaimNumber = data;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
		
		if(!RxClaimNumber.equals(""))
		{
			Mainframe_GlobalFunctionLib.sendText(21, 7, "ywrkf "+lib+"/"+file);
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(9, 2,"5");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(8, 41,RxClaimNumber);
			Mainframe_GlobalFunctionLib.sendText(10, 41," ");
			Mainframe_GlobalFunctionLib.sendText(10, 41,codelength);
			Mainframe_GlobalFunctionLib.sendText(11, 41,"   ");
			Mainframe_GlobalFunctionLib.sendText(11, 41,code1);
			Mainframe_GlobalFunctionLib.sendText(12, 41,"   ");
			Mainframe_GlobalFunctionLib.sendText(12, 41,code2);
			Mainframe_GlobalFunctionLib.sendText(13, 41,"   ");
			Mainframe_GlobalFunctionLib.sendText(14, 41,"   ");
			Mainframe_GlobalFunctionLib.sendText(15, 41,"   ");
			Mainframe_GlobalFunctionLib.sendText(16, 41,"   ");
			Mainframe_GlobalFunctionLib.sendText(17, 41,"   ");
			Mainframe_GlobalFunctionLib.sendText(18, 41,"   ");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(24, 73,"Y");
			TimeUnit.SECONDS.sleep(5);
			Mainframe_GlobalFunctionLib.pressKey("F3");
			
		}
	}
	
	@Then("^updating the pmc code with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void updating_the_pmc_code_with(String code1, String code2, String code3, String code4, String code5, String code6, String code7, String code8, String codelength, String lib, String file) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Path readFile = Paths.get("C:\\Users\\spriya7\\git\\RxClaim_ATDD\\src\\test\\resources\\features\\RxClaim\\featureFiles\\SR41377\\TestData.txt");
		String RxClaimNumber = "";
		try (BufferedReader reader = 
                 Files.newBufferedReader(readFile, StandardCharsets.UTF_8)) {
            String data;
            while ((data = reader.readLine()) != null) {
            	RxClaimNumber = data;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
		
		if(!RxClaimNumber.equals(""))
		{
			Mainframe_GlobalFunctionLib.sendText(21, 7, "ywrkf "+lib+"/"+file);
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(9, 2,"5");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(8, 41,RxClaimNumber);
			Mainframe_GlobalFunctionLib.sendText(10, 41," ");
			Mainframe_GlobalFunctionLib.sendText(10, 41,codelength);
			Mainframe_GlobalFunctionLib.sendText(11, 41,"   ");
			Mainframe_GlobalFunctionLib.sendText(11, 41,code1);
			Mainframe_GlobalFunctionLib.sendText(12, 41,"   ");
			Mainframe_GlobalFunctionLib.sendText(12, 41,code2);
			Mainframe_GlobalFunctionLib.sendText(13, 41,"   ");
			Mainframe_GlobalFunctionLib.sendText(13, 41,code3);
			Mainframe_GlobalFunctionLib.sendText(14, 41,"   ");
			Mainframe_GlobalFunctionLib.sendText(14, 41,code4);
			Mainframe_GlobalFunctionLib.sendText(15, 41,"   ");
			Mainframe_GlobalFunctionLib.sendText(15, 41,code5);
			Mainframe_GlobalFunctionLib.sendText(16, 41,"   ");
			Mainframe_GlobalFunctionLib.sendText(16, 41,code6);
			Mainframe_GlobalFunctionLib.sendText(17, 41,"   ");
			Mainframe_GlobalFunctionLib.sendText(17, 41,code7);
			Mainframe_GlobalFunctionLib.sendText(18, 41,"   ");
			Mainframe_GlobalFunctionLib.sendText(18, 41,code8);
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(24, 73,"Y");
			TimeUnit.SECONDS.sleep(5);
			Mainframe_GlobalFunctionLib.pressKey("F3");
			
		}
	}
	
	@Then("^Validating the message details and approval codes$")
	public void validating_the_message_details_and_approval_codes() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Path readFile = Paths.get("C:\\Users\\spriya7\\git\\RxClaim_ATDD\\src\\test\\resources\\features\\RxClaim\\featureFiles\\SR41377\\TestData.txt");
		String RxClaimNumber = "";
		try (BufferedReader reader = 
                 Files.newBufferedReader(readFile, StandardCharsets.UTF_8)) {
            String data;
            while ((data = reader.readLine()) != null) {
            	RxClaimNumber = data;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
		
		if(!RxClaimNumber.equals(""))
		{
			Mainframe_GlobalFunctionLib.pressKey("F8");
			Mainframe_GlobalFunctionLib.sendText(4, 4,RxClaimNumber);
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(10, 2,"5");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			Mainframe_GlobalFunctionLib.pressKey("F7");
			Mainframe_GlobalFunctionLib.sendText(4, 23,"6");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.pressKey("F18");
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			Mainframe_GlobalFunctionLib.pressKey("F12");
			Mainframe_GlobalFunctionLib.pressKey("F3");
			Mainframe_GlobalFunctionLib.pressKey("F3");
			Mainframe_GlobalFunctionLib.pressKey("F3");
		}
	}
	
	@When("^triggering the extract with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void triggering_the_extract_with(String FromDate, String ThruDate, String carrier, String account, String group, String file1, String file2, String file3, String file4, String file5, String lib) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    FunctionalLibrary.navigateToScreen("cct700");
	    FunctionalLibrary.navigateToScreen("10");
	    FunctionalLibrary.navigateToScreen("4");
	    FunctionalLibrary.navigateToScreen("28");
	    FunctionalLibrary.navigateToScreen("11");
	    Mainframe_GlobalFunctionLib.sendText(5,21,FromDate);
	    Mainframe_GlobalFunctionLib.sendText(5,39,ThruDate);
	    Mainframe_GlobalFunctionLib.sendText(6,21,carrier);
	    Mainframe_GlobalFunctionLib.sendText(6,39,carrier);
	    Mainframe_GlobalFunctionLib.sendText(7,21,account);
	    Mainframe_GlobalFunctionLib.sendText(7,39,account);
	    Mainframe_GlobalFunctionLib.sendText(8,21,group);
	    Mainframe_GlobalFunctionLib.sendText(8,39,group);
	    Mainframe_GlobalFunctionLib.sendText(15,21,"Y");
	    Mainframe_GlobalFunctionLib.sendText(16,21,"Y");
	    Mainframe_GlobalFunctionLib.sendText(17,21,"Y");
	    Mainframe_GlobalFunctionLib.sendText(18,21,"Y");
	    Mainframe_GlobalFunctionLib.sendText(19,21,"Y");
	    Mainframe_GlobalFunctionLib.sendText(15,35,file1);
	    Mainframe_GlobalFunctionLib.sendText(16,35,file2);
	    Mainframe_GlobalFunctionLib.sendText(17,35,file3);
	    Mainframe_GlobalFunctionLib.sendText(18,35,file4);
	    Mainframe_GlobalFunctionLib.sendText(19,35,file5);
	    Mainframe_GlobalFunctionLib.sendText(21,21,lib);
	    Mainframe_GlobalFunctionLib.pressKey("Enter");
	    Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	    Mainframe_GlobalFunctionLib.pressKey("F6");
	    
	}
	
	@Then("^Validating the spool file$")
	public void validating_the_spool_file() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 Mainframe_GlobalFunctionLib.sendText(21,7,"ws");
		 Mainframe_GlobalFunctionLib.pressKey("Enter");
		 TimeUnit.SECONDS.sleep(5);
		 Mainframe_GlobalFunctionLib.sendText("12","003","8");
		 Mainframe_GlobalFunctionLib.pressKey("Enter");
		 Mainframe_GlobalFunctionLib.sendText(12,3,"5");
		 Mainframe_GlobalFunctionLib.pressKey("Enter");
		 Mainframe_GlobalFunctionLib.sendText(3,22,"W30");
		 Mainframe_GlobalFunctionLib.pressKey("Enter");
		 Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		 Mainframe_GlobalFunctionLib.pressKey("PageDown");
		 Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		 Mainframe_GlobalFunctionLib.pressKey("PageDown");
		 Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		 Mainframe_GlobalFunctionLib.pressKey("F12");
		 Mainframe_GlobalFunctionLib.pressKey("F12");
	}
	
	@Then("^Validating the output file with \"([^\"]*)\",\"([^\"]*)\"$")
	public void validating_the_output_file_with(String file, String lib) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Path readFile = Paths.get("C:\\Users\\spriya7\\git\\RxClaim_ATDD\\src\\test\\resources\\features\\RxClaim\\featureFiles\\SR41377\\TestData.txt");
		String RxClaimNumber = "";
		try (BufferedReader reader = 
                 Files.newBufferedReader(readFile, StandardCharsets.UTF_8)) {
            String data;
            while ((data = reader.readLine()) != null) {
            	RxClaimNumber = data;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
		if(!RxClaimNumber.equals(""))
		{
			Mainframe_GlobalFunctionLib.sendText(21,7,"wrkf "+lib+"/"+file);
			 Mainframe_GlobalFunctionLib.pressKey("Enter");
			 Mainframe_GlobalFunctionLib.sendText(9,2,"5");
			 Mainframe_GlobalFunctionLib.pressKey("Enter");
			 Mainframe_GlobalFunctionLib.pressKey("Enter");
			 Mainframe_GlobalFunctionLib.sendText(5,23,RxClaimNumber);
			 Mainframe_GlobalFunctionLib.pressKey("Enter");
			 Mainframe_GlobalFunctionLib.pressKey("F16");
			 Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		}
	}
}
