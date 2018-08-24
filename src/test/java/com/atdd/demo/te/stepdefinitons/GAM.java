package com.atdd.demo.te.stepdefinitons;

import static org.testng.Assert.fail;

import org.testng.Assert;

import com.atdd.te.screenHelpers.FunctionalLibrary;
import com.itextpdf.text.log.SysoCounter;
import com.optumrx.autofusion.core.te.util.Mainframe_GlobalFunctionLib;
import com.optumrx.autofusion.core.te.util.Screenshot;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GAM {

	public static String jobnum;
	static int i;
	@When("^I add \"([^\"]*)\" library in library list$")
	public void i_add_library_in_library_list(String lib) throws Throwable {
		if(!(FunctionalLibrary.getText(8, 12).trim().equals(lib))){
		
		FunctionalLibrary.enterText(7, 12, lib);
	   FunctionalLibrary.pressEnter();
	   FunctionalLibrary.pressEnter();
		}
	   FunctionalLibrary.pressKey("F6");
	   if(FunctionalLibrary.getText(8, 4).trim().startsWith("From")){
		   
		   FunctionalLibrary.pressEnter();
		   }
	   FunctionalLibrary.pressKey("F13");
	   FunctionalLibrary.pressEnter();
	   /*FunctionalLibrary.pressKey("F13");
	   FunctionalLibrary.pressEnter();*/
	   
	}

	@When("^I enter input file \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_enter_input_file(String ipf1, String inlib1, String phvarfile, String phvarlib, String prfil, String prlib, String phstgfil, String phstglib) throws Throwable {
		FunctionalLibrary.enterText(6, 37, ipf1);
		FunctionalLibrary.enterText(7, 37, inlib1);
		FunctionalLibrary.enterText(10, 37, phvarfile);
		FunctionalLibrary.enterText(11, 37, phvarlib);
		FunctionalLibrary.enterText(14, 37, prfil);
		FunctionalLibrary.enterText(15, 37, prlib);
		FunctionalLibrary.enterText(18, 37, phstgfil);
		FunctionalLibrary.enterText(19, 37, phstglib);
		FunctionalLibrary.pressEnter();
		
		
	}
	@When("^I wait until the job \"([^\"]*)\",\"([^\"]*)\" moves to \"([^\"]*)\"$")
	public void i_wait_until_the_job_moves_to(String jobN, String user, String status) throws Throwable {
		FunctionalLibrary.enterText(21, 7, "WRKJOB JOB("+user+"/"+jobN+")");
		FunctionalLibrary.pressEnter();
		/*if(FunctionalLibrary.getText(1, 33).trim().equals("Work with Job")){
			FunctionalLibrary.enterText(21, 7, "4");
			FunctionalLibrary.pressEnter();
			FunctionalLibrary.enterText(11, 3, "5");
			FunctionalLibrary.pressEnter();
			FunctionalLibrary.enterText(3, 22, "w20");
			FunctionalLibrary.pressEnter();
			Screenshot.screenshot();
			FunctionalLibrary.pressKey("F12");
			
		}*/
		String status1=FunctionalLibrary.getText(8, 52).trim();
		jobnum=FunctionalLibrary.getText(8, 34).trim();
		FunctionalLibrary.pressKey("F12");
		// Mainframe_GlobalFunctionLib.pressKey("F12");
		if(status1.equals("JOBQ")){
	    	String qry1="CHGJOB";
	    	FunctionalLibrary.enterText(21,7,qry1);
	    	FunctionalLibrary.pressKey("F4");
	    	FunctionalLibrary.enterText(5,37,jobN);
	    	FunctionalLibrary.enterText(6,39,user);
	    	FunctionalLibrary.enterText(7,39,jobnum);
	    	 FunctionalLibrary.pressKey("Enter");
	    	 FunctionalLibrary.pressKey("F10");
	    	 Thread.sleep(1000);
	    	 FunctionalLibrary.enterText(17, 37,"QPGMR  ");
	    	 FunctionalLibrary.enterText(18, 39,"          ");
	    	 FunctionalLibrary.pressKey("Enter");
	    	 FunctionalLibrary.pressKey("Enter");
			  Thread.sleep(1000);
	 }
		else if(status1.equals("MSGW")){
			Assert.fail();
		}
		while(status1.equals("ACTIVE")){
			FunctionalLibrary.enterText(21, 7, "WRKJOB JOB("+user+"/"+jobN+")");
			FunctionalLibrary.pressEnter();
			
			 status1=FunctionalLibrary.getText(8, 52).trim();
			 FunctionalLibrary.pressKey("F12");
			 Thread.sleep(3000);
		}
	}
		
	@Then("^I validate the time  taken to load the data set$")
	public void i_validate_the_time_taken_to_load_the_data_set() throws Throwable {
	   FunctionalLibrary.pressKey("F6"); 
	   if(FunctionalLibrary.getText(8, 4).trim().equals("From")){
		   
	   FunctionalLibrary.pressEnter();
	   }
	   String data="Job "+jobnum;
	   System.out.println(data);
	   i=8;
	   while(!(FunctionalLibrary.getText(i, 4).trim().startsWith(data))){
		   i++;
	   }
	   Thread.sleep(1000);
			   Mainframe_GlobalFunctionLib.click(i, 4);
	 ContingentTherapy.kPress("F1"); 
	 System.out.println("before cpusec");
	   String cpusec=FunctionalLibrary.getText(15, 2).trim();
	   String[] a=cpusec.split(":");
	   System.out.println("The time taken to load is "+a[1].trim());
	}
	}

		

