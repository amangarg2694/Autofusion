package com.atdd.demo.te.stepdefinitons;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import com.atdd.te.screenHelpers.FunctionalLibrary;
import com.cucumber.listener.Reporter;
import com.optumrx.autofusion.core.te.util.Mainframe_GlobalFunctionLib;
import com.optumrx.autofusion.core.te.util.Screenshot;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PharmacyLoadPgm {
	
	@When("^I copy the file to library with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_copy_the_file_to_library_with(String copyfromfile, String copyfromlib, String copytofile, String copytolib) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.sendText(21, 7, "cpyf");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(5, 37, copyfromfile);
		Mainframe_GlobalFunctionLib.sendText(6, 39, "     ");
		Mainframe_GlobalFunctionLib.sendText(6, 39, copyfromlib);
		Mainframe_GlobalFunctionLib.sendText(7, 37, copytofile);
		Mainframe_GlobalFunctionLib.sendText(8, 39, "     ");
		Mainframe_GlobalFunctionLib.sendText(8, 39, copytolib);
		Mainframe_GlobalFunctionLib.sendText(11, 37, "     ");
		Mainframe_GlobalFunctionLib.sendText(11, 37, "*ADD");
		Mainframe_GlobalFunctionLib.sendText(12, 37, "*YES");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		//Opening the file
		Mainframe_GlobalFunctionLib.sendText(21, 7, "runqry *n "+copytolib+"/"+copytofile);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		TimeUnit.SECONDS.sleep(5);
		Mainframe_GlobalFunctionLib.pressKey("F12");
	}
	
	@When("^creating Pharmacy with \"([^\"]*)\",\"([^\"]*)\"$")
	public void creating_Pharmacy_with(String pharm, String name) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    FunctionalLibrary.navigateToScreen("7");
	    FunctionalLibrary.navigateToScreen("1");
	    Mainframe_GlobalFunctionLib.pressKey("F6");
		Mainframe_GlobalFunctionLib.sendText("13","015",pharm);
		Mainframe_GlobalFunctionLib.sendText("14","011",name);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		TimeUnit.SECONDS.sleep(5);
		Mainframe_GlobalFunctionLib.sendText("08","010","Optum");
		Mainframe_GlobalFunctionLib.sendText("10","010","Hyd");
		Mainframe_GlobalFunctionLib.sendText("10","047","CA");
		Mainframe_GlobalFunctionLib.sendText("10","054","12345");
		Mainframe_GlobalFunctionLib.sendText("12","010","1234512345");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		TimeUnit.SECONDS.sleep(5);
		Mainframe_GlobalFunctionLib.sendText("04","005",pharm);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		TimeUnit.SECONDS.sleep(5);
		Mainframe_GlobalFunctionLib.sendText("11","002","7");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");
	}
	
	@When("^modifying the values of credential dates in input file with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void modifying_the_values_of_credential_dates_in_input_file_with(String file, String lib, String date1, String nxtdate1, String pharm1, String addr1, String date2, String nxtdate2, String pharm2, String addr2, String date3, String nxtdate3, String pharm3, String addr3, String date4, String nextdate4, String pharm4, String addr4, String date5, String nextdate5, String pharm5, String addr5, String date6, String nextdate6, String pharm6, String addr6) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.sendText("21","07","edtlibl");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText("07","12","DBU10");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.sendText("21","07","DBU");
		Mainframe_GlobalFunctionLib.pressKey("F4");
		Mainframe_GlobalFunctionLib.sendText("05","037",file);
		Mainframe_GlobalFunctionLib.sendText("06","039",lib);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText("06","016","CHG");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		if(pharm1.length()==1)
		{
			Mainframe_GlobalFunctionLib.sendText("08","029",pharm1+"           "+"        "+nxtdate1+addr1);
		}
		else if(pharm1.length()==2)
		{
			Mainframe_GlobalFunctionLib.sendText("08","029",pharm1+"          "+"        "+nxtdate1+addr1);
		}
		else if(pharm1.length()==3)
		{
			Mainframe_GlobalFunctionLib.sendText("08","029",pharm1+"         "+"        "+nxtdate1+addr1);
		}
		else if(pharm1.length()==4)
		{
			Mainframe_GlobalFunctionLib.sendText("08","029",pharm1+"        "+"        "+nxtdate1+addr1);
		}
		else if(pharm1.length()==5)
		{
			Mainframe_GlobalFunctionLib.sendText("08","029",pharm1+"       "+"        "+nxtdate1+addr1);
		}
		else if(pharm1.length()==6)
		{
			Mainframe_GlobalFunctionLib.sendText("08","029",pharm1+"      "+"        "+nxtdate1+addr1);
		}
		else if(pharm1.length()==7)
		{
			Mainframe_GlobalFunctionLib.sendText("08","029",pharm1+"     "+"        "+nxtdate1+addr1);
		}
		else if(pharm1.length()==8)
		{
			Mainframe_GlobalFunctionLib.sendText("08","029",pharm1+"    "+"        "+nxtdate1+addr1);
		}
		else if(pharm1.length()==9)
		{
			Mainframe_GlobalFunctionLib.sendText("08","029",pharm1+"   "+"        "+nxtdate1+addr1);
		}
		else if(pharm1.length()==10)
		{
			Mainframe_GlobalFunctionLib.sendText("08","029",pharm1+"  "+"        "+nxtdate1+addr1);
		}
		else if(pharm1.length()==11)
		{
			Mainframe_GlobalFunctionLib.sendText("08","029",pharm1+" "+"        "+nxtdate1+addr1);
		}
		else if(pharm1.length()==12)
		{
			Mainframe_GlobalFunctionLib.sendText("08","029",pharm1+"        "+nxtdate1+addr1);
		}
		
		Mainframe_GlobalFunctionLib.pressKey("PageDown");
		
		if(pharm2.length()==1)
		{
			Mainframe_GlobalFunctionLib.sendText("08","029",pharm2+"           "+date2+nxtdate2+addr2);
		}
		else if(pharm2.length()==2)
		{
			Mainframe_GlobalFunctionLib.sendText("08","029",pharm2+"          "+date2+nxtdate2+addr2);
		}
		else if(pharm2.length()==3)
		{
			Mainframe_GlobalFunctionLib.sendText("08","029",pharm2+"         "+date2+nxtdate2+addr2);
		}
		else if(pharm2.length()==4)
		{
			Mainframe_GlobalFunctionLib.sendText("08","029",pharm2+"        "+date2+nxtdate2+addr2);
		}
		else if(pharm2.length()==5)
		{
			Mainframe_GlobalFunctionLib.sendText("08","029",pharm2+"       "+date2+nxtdate2+addr2);
		}
		else if(pharm2.length()==6)
		{
			Mainframe_GlobalFunctionLib.sendText("08","029",pharm2+"      "+date2+nxtdate2+addr2);
		}
		else if(pharm2.length()==7)
		{
			Mainframe_GlobalFunctionLib.sendText("08","029",pharm2+"     "+date2+nxtdate2+addr2);
		}
		else if(pharm2.length()==8)
		{
			Mainframe_GlobalFunctionLib.sendText("08","029",pharm2+"    "+date2+nxtdate2+addr2);
		}
		else if(pharm2.length()==9)
		{
			Mainframe_GlobalFunctionLib.sendText("08","029",pharm2+"   "+date2+nxtdate2+addr2);
		}
		else if(pharm2.length()==10)
		{
			Mainframe_GlobalFunctionLib.sendText("08","029",pharm2+"  "+date2+nxtdate2+addr2);
		}
		else if(pharm2.length()==11)
		{
			Mainframe_GlobalFunctionLib.sendText("08","029",pharm2+" "+date2+nxtdate2+addr2);
		}
		else if(pharm2.length()==12)
		{
			Mainframe_GlobalFunctionLib.sendText("08","029",pharm2+date2+nxtdate2+addr2);
		}
		
Mainframe_GlobalFunctionLib.pressKey("PageDown");
		
		if(pharm3.length()==1)
		{
			Mainframe_GlobalFunctionLib.sendText("08","029",pharm3+"           "+date3+"        "+addr3);
		}
		else if(pharm3.length()==2)
		{
			Mainframe_GlobalFunctionLib.sendText("08","029",pharm3+"          "+date3+"        "+addr3);
		}
		else if(pharm3.length()==3)
		{
			Mainframe_GlobalFunctionLib.sendText("08","029",pharm3+"         "+date3+"        "+addr3);
		}
		else if(pharm3.length()==4)
		{
			Mainframe_GlobalFunctionLib.sendText("08","029",pharm3+"        "+date3+"        "+addr3);
		}
		else if(pharm3.length()==5)
		{
			Mainframe_GlobalFunctionLib.sendText("08","029",pharm3+"       "+date3+"        "+addr3);
		}
		else if(pharm3.length()==6)
		{
			Mainframe_GlobalFunctionLib.sendText("08","029",pharm3+"      "+date3+"        "+addr3);
		}
		else if(pharm3.length()==7)
		{
			Mainframe_GlobalFunctionLib.sendText("08","029",pharm3+"     "+date3+"        "+addr3);
		}
		else if(pharm3.length()==8)
		{
			Mainframe_GlobalFunctionLib.sendText("08","029",pharm3+"    "+date3+"        "+addr3);
		}
		else if(pharm3.length()==9)
		{
			Mainframe_GlobalFunctionLib.sendText("08","029",pharm3+"   "+date3+"        "+addr3);
		}
		else if(pharm3.length()==10)
		{
			Mainframe_GlobalFunctionLib.sendText("08","029",pharm3+"  "+date3+"        "+addr3);
		}
		else if(pharm3.length()==11)
		{
			Mainframe_GlobalFunctionLib.sendText("08","029",pharm3+" "+date3+"        "+addr3);
		}
		else if(pharm3.length()==12)
		{
			Mainframe_GlobalFunctionLib.sendText("08","029",pharm3+date3+"        "+addr3);
		}
		
Mainframe_GlobalFunctionLib.pressKey("PageDown");
		
		if(pharm4.length()==1)
		{
			Mainframe_GlobalFunctionLib.sendText("08","029",pharm4+"           "+date4+nextdate4+addr4);
		}
		else if(pharm4.length()==2)
		{
			Mainframe_GlobalFunctionLib.sendText("08","029",pharm4+"          "+date4+nextdate4+addr4);
		}
		else if(pharm4.length()==3)
		{
			Mainframe_GlobalFunctionLib.sendText("08","029",pharm4+"         "+date4+nextdate4+addr4);
		}
		else if(pharm4.length()==4)
		{
			Mainframe_GlobalFunctionLib.sendText("08","029",pharm4+"        "+date4+nextdate4+addr4);
		}
		else if(pharm4.length()==5)
		{
			Mainframe_GlobalFunctionLib.sendText("08","029",pharm4+"       "+date4+nextdate4+addr4);
		}
		else if(pharm4.length()==6)
		{
			Mainframe_GlobalFunctionLib.sendText("08","029",pharm4+"      "+date4+nextdate4+addr4);
		}
		else if(pharm4.length()==7)
		{
			Mainframe_GlobalFunctionLib.sendText("08","029",pharm4+"     "+date4+nextdate4+addr4);
		}
		else if(pharm4.length()==8)
		{
			Mainframe_GlobalFunctionLib.sendText("08","029",pharm4+"    "+date4+nextdate4+addr4);
		}
		else if(pharm4.length()==9)
		{
			Mainframe_GlobalFunctionLib.sendText("08","029",pharm4+"   "+date2+nextdate4+addr4);
		}
		else if(pharm4.length()==10)
		{
			Mainframe_GlobalFunctionLib.sendText("08","029",pharm4+"  "+date2+nextdate4+addr4);
		}
		else if(pharm4.length()==11)
		{
			Mainframe_GlobalFunctionLib.sendText("08","029",pharm4+" "+date2+nextdate4+addr4);
		}
		else if(pharm4.length()==12)
		{
			Mainframe_GlobalFunctionLib.sendText("08","029",pharm4+date4+nextdate4+addr4);
		}
		
Mainframe_GlobalFunctionLib.pressKey("PageDown");
		
		if(pharm5.length()==1)
		{
			Mainframe_GlobalFunctionLib.sendText("08","029",pharm5+"           "+date5+nextdate5+"                   ");
		}
		else if(pharm5.length()==2)
		{
			Mainframe_GlobalFunctionLib.sendText("08","029",pharm5+"          "+date5+nextdate5+"                   ");
		}
		else if(pharm5.length()==3)
		{
			Mainframe_GlobalFunctionLib.sendText("08","029",pharm5+"         "+date5+nextdate5+"                   ");
		}
		else if(pharm5.length()==4)
		{
			Mainframe_GlobalFunctionLib.sendText("08","029",pharm5+"        "+date5+nextdate5+"                   ");
		}
		else if(pharm5.length()==5)
		{
			Mainframe_GlobalFunctionLib.sendText("08","029",pharm5+"       "+date5+nextdate5+"                   ");
		}
		else if(pharm5.length()==6)
		{
			Mainframe_GlobalFunctionLib.sendText("08","029",pharm5+"      "+date5+nextdate5+"                   ");
		}
		else if(pharm5.length()==7)
		{
			Mainframe_GlobalFunctionLib.sendText("08","029",pharm5+"     "+date5+nextdate5+"                   ");
		}
		else if(pharm5.length()==8)
		{
			Mainframe_GlobalFunctionLib.sendText("08","029",pharm5+"    "+date5+nextdate5+"                   ");
		}
		else if(pharm5.length()==9)
		{
			Mainframe_GlobalFunctionLib.sendText("08","029",pharm5+"   "+date5+nextdate5+"                   ");
		}
		else if(pharm5.length()==10)
		{
			Mainframe_GlobalFunctionLib.sendText("08","029",pharm5+"  "+date5+nextdate5+"                   ");
		}
		else if(pharm5.length()==11)
		{
			Mainframe_GlobalFunctionLib.sendText("08","029",pharm5+" "+date5+nextdate5+"                   ");
		}
		else if(pharm5.length()==12)
		{
			Mainframe_GlobalFunctionLib.sendText("08","029",pharm5+date5+nextdate5+"                   ");
		}
		
Mainframe_GlobalFunctionLib.pressKey("PageDown");
		
		if(pharm6.length()==1)
		{
			Mainframe_GlobalFunctionLib.sendText("08","029",pharm6+"           "+date6+nextdate6+addr6);
		}
		else if(pharm6.length()==2)
		{
			Mainframe_GlobalFunctionLib.sendText("08","029",pharm6+"          "+date6+nextdate6+addr6);
		}
		else if(pharm6.length()==3)
		{
			Mainframe_GlobalFunctionLib.sendText("08","029",pharm6+"         "+date6+nextdate6+addr6);
		}
		else if(pharm6.length()==4)
		{
			Mainframe_GlobalFunctionLib.sendText("08","029",pharm6+"        "+date6+nextdate6+addr6);
		}
		else if(pharm6.length()==5)
		{
			Mainframe_GlobalFunctionLib.sendText("08","029",pharm6+"       "+date6+nextdate6+addr6);
		}
		else if(pharm6.length()==6)
		{
			Mainframe_GlobalFunctionLib.sendText("08","029",pharm6+"      "+date6+nextdate6+addr6);
		}
		else if(pharm6.length()==7)
		{
			Mainframe_GlobalFunctionLib.sendText("08","029",pharm6+"     "+date6+nextdate6+addr6);
		}
		else if(pharm6.length()==8)
		{
			Mainframe_GlobalFunctionLib.sendText("08","029",pharm6+"    "+date6+nextdate6+addr6);
		}
		else if(pharm6.length()==9)
		{
			Mainframe_GlobalFunctionLib.sendText("08","029",pharm6+"   "+date6+nextdate6+addr6);
		}
		else if(pharm6.length()==10)
		{
			Mainframe_GlobalFunctionLib.sendText("08","029",pharm6+"  "+date6+nextdate6+addr6);
		}
		else if(pharm6.length()==11)
		{
			Mainframe_GlobalFunctionLib.sendText("08","029",pharm6+" "+date6+nextdate6+addr6);
		}
		else if(pharm6.length()==12)
		{
			Mainframe_GlobalFunctionLib.sendText("08","029",pharm6+date6+nextdate6+addr6);
		}
		
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.sendText("08","07","1");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText("21","07","runqry *n "+lib+"/"+file);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("F3");
	}
	@When("^triggering the pharmacy load program job with \"([^\"]*)\",\"([^\"]*)\"$")
	public void triggering_the_pharmacy_load_program_job_with(String file, String lib) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.sendText(21, 7, "CCT700");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		FunctionalLibrary.navigateToScreen("2");
		FunctionalLibrary.navigateToScreen("12");
		FunctionalLibrary.navigateToScreen("8");
		Mainframe_GlobalFunctionLib.sendText(7, 39, file);
		Mainframe_GlobalFunctionLib.sendText(8, 39, lib);
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("F6");
		//Status of job:
		Mainframe_GlobalFunctionLib.sendText(21, 7, "ws");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		String jobstatus = Mainframe_GlobalFunctionLib.getText(11,40);
		if(jobstatus.equals("OUTQ"))
		{
			Mainframe_GlobalFunctionLib.sendText(11, 3,"8");
    		Mainframe_GlobalFunctionLib.pressKey("Enter");
    		Mainframe_GlobalFunctionLib.sendText(11, 3,"5");
    		Mainframe_GlobalFunctionLib.pressKey("Enter");
    		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
    		Mainframe_GlobalFunctionLib.pressKey("F20");
    		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
    		Mainframe_GlobalFunctionLib.pressKey("F19");
    		Mainframe_GlobalFunctionLib.pressKey("PageDown");
    		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
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
    		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
    		Mainframe_GlobalFunctionLib.pressKey("F20");
    		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
    		Mainframe_GlobalFunctionLib.pressKey("F19");
    		Mainframe_GlobalFunctionLib.pressKey("PageDown");
    		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
    		}
		}
		else if (jobstatus.equals("JOBQ"))
		{
			Mainframe_GlobalFunctionLib.sendText(11, 3,"2");
    		Mainframe_GlobalFunctionLib.pressKey("Enter");
    		Mainframe_GlobalFunctionLib.pressKey("F10");
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
    		Mainframe_GlobalFunctionLib.pressKey("F20");
    		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
    		Mainframe_GlobalFunctionLib.pressKey("F19");
    		Mainframe_GlobalFunctionLib.pressKey("PageDown");
    		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
    		}
			else if (jobstat.equals("ACTIVE"))
			{
				
				TimeUnit.MINUTES.sleep(4);
				Mainframe_GlobalFunctionLib.pressKey("F5");
				String jobstat1 = Mainframe_GlobalFunctionLib.getText(11,40);
				if(jobstat1.equals("OUTQ"))
	    		{
				TimeUnit.SECONDS.sleep(3);
				Mainframe_GlobalFunctionLib.sendText(11, 3,"8");
	    		Mainframe_GlobalFunctionLib.pressKey("Enter");
	    		Mainframe_GlobalFunctionLib.sendText(11, 3,"5");
	    		Mainframe_GlobalFunctionLib.pressKey("Enter");
	    		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	    		Mainframe_GlobalFunctionLib.pressKey("F20");
	    		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	    		Mainframe_GlobalFunctionLib.pressKey("F19");
	    		Mainframe_GlobalFunctionLib.pressKey("PageDown");
	    		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	    		}
			}
		}
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F3");
	}
	
	@Then("^Validating the data in input file with Pharmacy screen having \"([^\"]*)\",\"([^\"]*)\"$")
	public void validating_the_data_in_input_file_with_Pharmacy_screen_having(String file, String lib) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.sendText("21","07","runqry *n "+lib+"/"+file);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.PressTabKey();
		Mainframe_GlobalFunctionLib.sendText("03","74","13");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F21");
		//Dates
	    String dat1 = Mainframe_GlobalFunctionLib.getText(6, 9);
	    String date1 = "        ";
		String nextdate1 = dat1.substring(0, 8);
		String dat2 = Mainframe_GlobalFunctionLib.getText(7, 9);
		String date2 = dat2.substring(0, 8);
		String nextdate2 = dat2.substring(8, 16);
		String dat3 = Mainframe_GlobalFunctionLib.getText(8, 9);
		String date3 = dat3.substring(0, 8);
		String nextdate3= "        ";
		String dat4 = Mainframe_GlobalFunctionLib.getText(9, 9);
		String date4 = dat4.substring(0, 8);
		String nextdate4= dat4.substring(8, 16);
		String dat5 = Mainframe_GlobalFunctionLib.getText(10, 9);
		String date5 = dat5.substring(0, 8);
		String nextdate5= dat5.substring(8, 16);
		String dat6 = Mainframe_GlobalFunctionLib.getText(11, 9);
		String date6 = dat6.substring(0, 8);
		String nextdate6= dat6.substring(8, 16);
		//WEb address
		Mainframe_GlobalFunctionLib.pressKey("F21");
		Mainframe_GlobalFunctionLib.PressTabKey();
		Mainframe_GlobalFunctionLib.sendText("03","74","29");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F21");
	    String addr1=Mainframe_GlobalFunctionLib.getText(6, 9);
	    String addr2=Mainframe_GlobalFunctionLib.getText(7, 9);
	    String addr3=Mainframe_GlobalFunctionLib.getText(8, 9);
	    String addr4=Mainframe_GlobalFunctionLib.getText(9, 9);
	    String addr5="                    ";
	    String addr6=Mainframe_GlobalFunctionLib.getText(11, 9);
	    
	    //Pharmacy
	    Mainframe_GlobalFunctionLib.pressKey("F21");
		Mainframe_GlobalFunctionLib.PressTabKey();
		Mainframe_GlobalFunctionLib.sendText("03","74","01");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F21");
		String pharm1=Mainframe_GlobalFunctionLib.getText(6, 9);
		String pharmacy1 = pharm1.substring(0, 12).trim();
		String pharm2=Mainframe_GlobalFunctionLib.getText(7, 9);
		String pharmacy2 = pharm2.substring(0, 12).trim();
		String pharm3=Mainframe_GlobalFunctionLib.getText(8, 9);
		String pharmacy3 = pharm3.substring(0, 12).trim();
		String pharm4=Mainframe_GlobalFunctionLib.getText(9, 9);
		String pharmacy4 = pharm4.substring(0, 12).trim();
		String pharm5=Mainframe_GlobalFunctionLib.getText(10, 9);
		String pharmacy5 = pharm5.substring(0, 12).trim();
		String pharm6=Mainframe_GlobalFunctionLib.getText(11, 9);
		String pharmacy6 = pharm6.substring(0, 12).trim();
		Mainframe_GlobalFunctionLib.pressKey("F3");
		//Pharmacy Validation
		FunctionalLibrary.navigateToScreen("7");
	    FunctionalLibrary.navigateToScreen("1");
	    
	    Mainframe_GlobalFunctionLib.sendText(4, 5, pharmacy1);
	    Mainframe_GlobalFunctionLib.pressKey("Enter");
	    Mainframe_GlobalFunctionLib.sendText(11, 2, "5");
	    Mainframe_GlobalFunctionLib.pressKey("Enter");
	    Mainframe_GlobalFunctionLib.pressKey("PageDown");
	    String pharmws1 = Mainframe_GlobalFunctionLib.getText(17, 20);
	    String pharmcd1 = "        ";
	    String pharmncd1 = Mainframe_GlobalFunctionLib.getText(19, 23);
	    SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yy");
		Date date11 = formatter.parse(pharmncd1);
		SimpleDateFormat formatter1 = new SimpleDateFormat("MM/dd/YYYY");
		String dateString = formatter1.format(date11);
	    String pharmncdt1 = dateString.replace("/", "");
	     if(pharmws1.equals(addr1)&pharmcd1.equals(date1)&pharmncdt1.equals(nextdate1))
	     {
	    	 Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	     }
	     else
	     {
	    	 System.out.println("Data is not updated");
	     }
	     Mainframe_GlobalFunctionLib.pressKey("F12");
	     Mainframe_GlobalFunctionLib.sendText(4, 5, pharmacy2);
		    Mainframe_GlobalFunctionLib.pressKey("Enter");
		    Mainframe_GlobalFunctionLib.sendText(11, 2, "5");
		    Mainframe_GlobalFunctionLib.pressKey("Enter");
		    Mainframe_GlobalFunctionLib.pressKey("PageDown");
		    String pharmws2 = Mainframe_GlobalFunctionLib.getText(17, 20);
		    String pharmcd2 = Mainframe_GlobalFunctionLib.getText(18, 23);
		   Date date12 = formatter.parse(pharmcd2);
			String dateString1 = formatter1.format(date12);
		    String pharmncdt2 = dateString1.replace("/", "");
		    
		    String pharmncd2 = Mainframe_GlobalFunctionLib.getText(19, 23);
		    Date date13 = formatter.parse(pharmncd2);
			String dateString2 = formatter1.format(date13);
		    String pharmcdt2 = dateString2.replace("/", "");
		    
		    
		   
		     if(pharmws2.equals(addr2)&pharmcdt2.equals(date2)&pharmncdt2.equals(nextdate2))
		     {
		    	 Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		     }
		     else
		     {
		    	 System.out.println("Data is not updated");
		     }
		     Mainframe_GlobalFunctionLib.pressKey("F12");
		     Mainframe_GlobalFunctionLib.sendText(4, 5, pharmacy3);
			    Mainframe_GlobalFunctionLib.pressKey("Enter");
			    Mainframe_GlobalFunctionLib.sendText(11, 2, "5");
			    Mainframe_GlobalFunctionLib.pressKey("Enter");
			    Mainframe_GlobalFunctionLib.pressKey("PageDown");
			    String pharmws3 = Mainframe_GlobalFunctionLib.getText(17, 20);
			    
			    String pharmcd3 = Mainframe_GlobalFunctionLib.getText(18, 23);
			    Date date14 = formatter.parse(pharmcd3);
				String dateString3 = formatter1.format(date14);
			    String pharmcdt3 = dateString3.replace("/", "");
			    String pharmncd3 = "        ";
			     if(pharmws3.equals(addr3)&pharmcdt3.equals(date3)&pharmncd3.equals(nextdate3))
			     {
			    	 Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			     }
			     else
			     {
			    	 System.out.println("Data is not updated");
			     }
			     Mainframe_GlobalFunctionLib.pressKey("F12");
			     Mainframe_GlobalFunctionLib.sendText(4, 5, pharmacy4);
				    Mainframe_GlobalFunctionLib.pressKey("Enter");
				    Mainframe_GlobalFunctionLib.sendText(11, 2, "5");
				    Mainframe_GlobalFunctionLib.pressKey("Enter");
				    Mainframe_GlobalFunctionLib.pressKey("PageDown");
				    String pharmws4 = Mainframe_GlobalFunctionLib.getText(17, 20);
				    String pharmcd4 = Mainframe_GlobalFunctionLib.getText(18, 23);
				    Date date15 = formatter.parse(pharmcd4);
					String dateString4 = formatter1.format(date15);
				    String pharmcdt4 = dateString4.replace("/", "");
				    
				    String pharmncd4 = Mainframe_GlobalFunctionLib.getText(19, 23);
				    Date date16 = formatter.parse(pharmncd4);
					String dateString5 = formatter1.format(date16);
				    String pharmncdt4 = dateString5.replace("/", "");
				    
				    if(pharmws4.equals(addr4)&pharmcdt4.equals(date4)&pharmncdt4.equals(nextdate4))
				     {
				    	 Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				     }
				     else
				     {
				    	 System.out.println("Data is not updated");
				     }
				     Mainframe_GlobalFunctionLib.pressKey("F12");
				     Mainframe_GlobalFunctionLib.sendText(4, 5, pharmacy5);
					    Mainframe_GlobalFunctionLib.pressKey("Enter");
					    Mainframe_GlobalFunctionLib.sendText(11, 2, "5");
					    Mainframe_GlobalFunctionLib.pressKey("Enter");
					    Mainframe_GlobalFunctionLib.pressKey("PageDown");
					    String pharmws5 = "                    ";
					    String pharmcd5 = Mainframe_GlobalFunctionLib.getText(18, 23);
					    Date date17 = formatter.parse(pharmcd5);
						String dateString6 = formatter1.format(date17);
					    String pharmcdt5 = dateString6.replace("/", "");
					    
					    String pharmncd5 = Mainframe_GlobalFunctionLib.getText(19, 23);
					    Date date18 = formatter.parse(pharmncd5);
						String dateString7 = formatter1.format(date18);
					    String pharmncdt5 = dateString7.replace("/", "");
					    
					    
					    
					    if(pharmws5.equals(addr5)&pharmcdt5.equals(date5)&pharmncdt5.equals(nextdate5))
					     {
					    	 Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
					     }
					     else
					     {
					    	 System.out.println("Data is not updated");
					     }
					     Mainframe_GlobalFunctionLib.pressKey("F12");
					     Mainframe_GlobalFunctionLib.sendText(4, 5, pharmacy6);
						    Mainframe_GlobalFunctionLib.pressKey("Enter");
						    Mainframe_GlobalFunctionLib.sendText(11, 2, "5");
						    Mainframe_GlobalFunctionLib.pressKey("Enter");
						    Mainframe_GlobalFunctionLib.pressKey("PageDown");
						    String pharmws6 = Mainframe_GlobalFunctionLib.getText(17, 20);
						    String pharmcd6 = Mainframe_GlobalFunctionLib.getText(18, 23);
						    Date date19 = formatter.parse(pharmcd6);
							String dateString8 = formatter1.format(date19);
						    String pharmcdt6 = dateString8.replace("/", "");
						    
						    String pharmncd6 = Mainframe_GlobalFunctionLib.getText(19, 23);
						    Date date20 = formatter.parse(pharmncd6);
							String dateString9 = formatter1.format(date20);
						    String pharmncdt6 = dateString9.replace("/", "");
						    
						    if(pharmws6.equals(addr6)&pharmcdt6.equals(date6)&pharmncdt6.equals(nextdate6))
						     {
						    	 Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
						     }
						     else
						     {
						    	 System.out.println("Data is not updated");
						     }
						     Mainframe_GlobalFunctionLib.pressKey("F12");
						     Mainframe_GlobalFunctionLib.pressKey("F3");
						     Mainframe_GlobalFunctionLib.pressKey("F12");
	}
}
