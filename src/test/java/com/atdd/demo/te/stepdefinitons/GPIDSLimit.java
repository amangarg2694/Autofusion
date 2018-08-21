package com.atdd.demo.te.stepdefinitons;

import java.util.concurrent.TimeUnit;

import com.atdd.te.screenHelpers.FunctionalLibrary;
import com.cucumber.listener.Reporter;
import com.optumrx.autofusion.core.te.util.Mainframe_GlobalFunctionLib;
import com.optumrx.autofusion.core.te.util.Screenshot;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GPIDSLimit {
int rxnum;
	@Then("^I create a PlanList with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_create_a_PlanList_with(String NDCList, String GPIList, String GPIName, String ProductName, String maxlimit) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		//GPI LIST
		Mainframe_GlobalFunctionLib.sendText("21", "07", "1");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Mainframe_GlobalFunctionLib.sendText("05", "18", GPIList);
		Mainframe_GlobalFunctionLib.sendText("05", "30", "TESTING");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText("16", "64", "Y");
		TimeUnit.SECONDS.sleep(4);
		Mainframe_GlobalFunctionLib.sendText("04", "06", GPIList);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText("11", "02", "7");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Mainframe_GlobalFunctionLib.pressKey("F16");
		Mainframe_GlobalFunctionLib.sendText("06", "04", GPIName);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText("14", "02", "1");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText("12", "58", "B");
		Mainframe_GlobalFunctionLib.sendText("12", "65", maxlimit);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		//NDC LIST
		Mainframe_GlobalFunctionLib.sendText("21", "07", "2");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Mainframe_GlobalFunctionLib.sendText("05", "18", NDCList);
		Mainframe_GlobalFunctionLib.sendText("05", "30", "TESTING");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText("16", "64", "Y");
		TimeUnit.SECONDS.sleep(4);
		Mainframe_GlobalFunctionLib.sendText("04", "06", GPIList);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText("11", "02", "7");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Mainframe_GlobalFunctionLib.sendText("07", "04",ProductName);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText("15", "02", "1");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText("11", "58", "B");
		Mainframe_GlobalFunctionLib.sendText("11", "65", maxlimit);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");
	}
	
	@Then("^I create a plan with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_create_a_plan_with(String PlanCode, String fdate, String desc, String ndclist, String gpilist, String tdate, String priceschedule, String schedule, String troopsched) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Mainframe_GlobalFunctionLib.sendText("13", "19", PlanCode);
		Mainframe_GlobalFunctionLib.sendText("14", "19", fdate);
		Mainframe_GlobalFunctionLib.sendText("15", "19", desc);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText("16", "64", "Y");
		TimeUnit.SECONDS.sleep(4);
		Mainframe_GlobalFunctionLib.sendText("15", "24", "Y");
		Mainframe_GlobalFunctionLib.sendText("06", "51", "Y");
		Mainframe_GlobalFunctionLib.sendText("13", "77", "Y");
		Mainframe_GlobalFunctionLib.sendText("14", "77", "Y");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText("16", "64", "Y");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("F7");
		//NDC List
		Mainframe_GlobalFunctionLib.sendText("07", "21", "10");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Mainframe_GlobalFunctionLib.sendText("04", "05", ndclist);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText("09", "02", "1");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		TimeUnit.SECONDS.sleep(3);
		Mainframe_GlobalFunctionLib.sendText("13", "17", "100");
		Mainframe_GlobalFunctionLib.sendText("14", "17", fdate);
		Mainframe_GlobalFunctionLib.sendText("14", "41", tdate);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText("16", "64", "Y");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.sendText("11", "02", "7");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		//GPI List
		Mainframe_GlobalFunctionLib.sendText("07", "21", "11");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Mainframe_GlobalFunctionLib.sendText("04", "05", gpilist);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText("09", "02", "1");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		TimeUnit.SECONDS.sleep(3);
		Mainframe_GlobalFunctionLib.sendText("13", "17", "100");
		Mainframe_GlobalFunctionLib.sendText("14", "17", fdate);
		Mainframe_GlobalFunctionLib.sendText("14", "41", tdate);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText("16", "64", "Y");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.sendText("11", "02", "7");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		//Pricing
		Mainframe_GlobalFunctionLib.sendText("07", "21", "28");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText("21", "12", "1");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Mainframe_GlobalFunctionLib.sendText("08", "12", fdate);
		Mainframe_GlobalFunctionLib.sendText("08", "36", tdate);
		Mainframe_GlobalFunctionLib.sendText("10", "26",priceschedule);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.sendText("21", "12", "3");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Mainframe_GlobalFunctionLib.sendText("09", "02", fdate);
		Mainframe_GlobalFunctionLib.sendText("09", "12", tdate);
		Mainframe_GlobalFunctionLib.sendText("09", "22",schedule);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText("16", "64", "Y");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		//Accumulators
		Mainframe_GlobalFunctionLib.sendText("07", "21", "29");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText("15", "12", "6");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Mainframe_GlobalFunctionLib.sendText("08", "13", fdate);
		Mainframe_GlobalFunctionLib.sendText("08", "41", tdate);
		Mainframe_GlobalFunctionLib.sendText("10", "28", "G");
		Mainframe_GlobalFunctionLib.sendText("14", "28", troopsched);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F19");
		Mainframe_GlobalFunctionLib.sendText("13", "61", "1201");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");
	}
	@Then("^I edit MPA with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_edit_MPA_with(String memid, String gpinum, String fdate, String tdate, String rsn, String limit, String row, String col) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.sendText("04", "04", memid);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F8");
		Mainframe_GlobalFunctionLib.sendText("10", "02", "2");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F8");
		Mainframe_GlobalFunctionLib.sendText("04", "20", "9");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText("16", "23", "*");
		Mainframe_GlobalFunctionLib.sendText("16", "26", gpinum);
		Mainframe_GlobalFunctionLib.sendText("16", "66", rsn);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.sendText("16", "02", "2");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F7");
		Mainframe_GlobalFunctionLib.sendText(row, col, "B");
		int rowno = Integer.parseInt(row);
		int colno = Integer.parseInt(col);
		int cols = colno + 8;
		Mainframe_GlobalFunctionLib.sendText(rowno, cols, limit);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		for(int i=0;i<5;i++)
		{
		Mainframe_GlobalFunctionLib.pressKey("F3");
		}
		Mainframe_GlobalFunctionLib.pressKey("F12");
	}
	
	@Then("^I create MPA with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_create_MPA_with(String memid, String gpinum, String fdate, String tdate, String rsn, String limit) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.sendText("04", "04", memid);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F8");
		Mainframe_GlobalFunctionLib.sendText("10", "02", "2");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F8");
		Mainframe_GlobalFunctionLib.sendText("04", "20", "9");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText("16", "23", "*");
		Mainframe_GlobalFunctionLib.sendText("16", "26", gpinum);
		//Mainframe_GlobalFunctionLib.sendText("16", "42", fdate);
		//Mainframe_GlobalFunctionLib.sendText("16", "51", tdate);
		Mainframe_GlobalFunctionLib.sendText("16", "66", rsn);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.sendText("16", "02", "2");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F7");
		Mainframe_GlobalFunctionLib.sendText("11", "60", "B");
		Mainframe_GlobalFunctionLib.sendText("11", "68", limit);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		for(int i=0;i<5;i++)
		{
		Mainframe_GlobalFunctionLib.pressKey("F3");
		}
		Mainframe_GlobalFunctionLib.pressKey("F12");
		
	}
	
	@When("^claim is submitted with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void claim_is_submitted_with(String bin, String pcn, String grp, String pid, String rxno, String refill, String memid, String prodid, String dqty, String ds, String psc, String cost, String type, String limit) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   FunctionalLibrary.navigateToScreen("1");
	   FunctionalLibrary.navigateToScreen("2");
	   Mainframe_GlobalFunctionLib.sendText("04", "04", memid);
	   Mainframe_GlobalFunctionLib.pressKey("Enter");
	   Mainframe_GlobalFunctionLib.sendText("10", "02", "5");
	   Mainframe_GlobalFunctionLib.pressKey("Enter");
	   Mainframe_GlobalFunctionLib.pressKey("F8");
	   Mainframe_GlobalFunctionLib.sendText("04", "20", "9");
	   Mainframe_GlobalFunctionLib.pressKey("Enter");
	   String PANum = Mainframe_GlobalFunctionLib.getText(16, 5);
	   Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	   for(int i=0;i<4;i++)
		{
		Mainframe_GlobalFunctionLib.pressKey("F3");
		}
		Mainframe_GlobalFunctionLib.pressKey("F12");
	    
		//Claim Submission
		FunctionalLibrary.navigateToScreen("3");
		FunctionalLibrary.navigateToScreen("2");
		FunctionalLibrary.navigateToScreen("1");
		int lim = Integer.parseInt(limit);
		
		
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Mainframe_GlobalFunctionLib.sendText(11, 14,bin );
		Mainframe_GlobalFunctionLib.sendText(11, 41,pcn );
		Mainframe_GlobalFunctionLib.sendText(11, 59,grp );
		Mainframe_GlobalFunctionLib.sendText(12, 14,pid );
		Mainframe_GlobalFunctionLib.sendText(12, 41,rxno );
		Mainframe_GlobalFunctionLib.sendText(12, 59,refill );
		Mainframe_GlobalFunctionLib.sendText(14, 41,memid );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.click(7, 12 );
		Mainframe_GlobalFunctionLib.pressKey("F4");
		Thread.sleep(1000);
		Mainframe_GlobalFunctionLib.sendText(3, 4, memid);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(8, 2,"1" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		
		//Mainframe_GlobalFunctionLib.sendText(4 , 65 ,"          ");
		Mainframe_GlobalFunctionLib.sendText(11, 20,prodid );
		Mainframe_GlobalFunctionLib.sendText(12, 11,dqty );
		Mainframe_GlobalFunctionLib.sendText(12, 26,ds );
		Mainframe_GlobalFunctionLib.sendText(14, 6,psc );
		Mainframe_GlobalFunctionLib.sendText(10, 47,"         " );
		Mainframe_GlobalFunctionLib.sendText(10, 47,cost );
		Mainframe_GlobalFunctionLib.sendText(18, 19,type );
		Mainframe_GlobalFunctionLib.sendText(18, 26,PANum );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Mainframe_GlobalFunctionLib.pressKey("F7");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("F12");
		if(lim>30)
		{
		int ctr = lim/30;
		for(int i=0;i<ctr;i++)
		{
		long rxnom= Long.parseLong(Mainframe_GlobalFunctionLib.getText(5, 29).trim());
		long rxnumb = rxnom + 1;
		String rxnumber = String.valueOf(rxnumb);
		Mainframe_GlobalFunctionLib.sendText("05", "029",rxnumber);	
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Mainframe_GlobalFunctionLib.pressKey("F7");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("F12");
		}
		}
		else if(lim<30)
		{
		for(int i=0;i<lim;i++)
		{
		long rxnom= Long.parseLong(Mainframe_GlobalFunctionLib.getText(5, 29).trim());
		long rxnumb = rxnom + 1;
		String rxnumber = String.valueOf(rxnumb);
		Mainframe_GlobalFunctionLib.sendText("05", "029",rxnumber);	
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Mainframe_GlobalFunctionLib.pressKey("F7");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("F12");
		}
		}
		
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F12");
	}
	
	@Then("^Validating claim info in member screen with \"([^\"]*)\"$")
	public void validating_claim_info_in_member_screen_with(String memid) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		FunctionalLibrary.navigateToScreen("1");
		FunctionalLibrary.navigateToScreen("2");
		Mainframe_GlobalFunctionLib.sendText(4, 4,memid);	
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(10, 2,"5");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F10");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	}
	
	@Then("^I edit the plan NDC and GPI list with \"([^\"]*)\",\"([^\"]*)\"$")
	public void i_edit_the_plan_NDC_and_GPI_list_with(String planlist, String maxlimit) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		FunctionalLibrary.navigateToScreen("1");
		Mainframe_GlobalFunctionLib.sendText(4, 6,planlist);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(11, 2,"7");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(12, 2,"2");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.click(12, 58);
		Mainframe_GlobalFunctionLib.sendText(12, 58," ");
		Mainframe_GlobalFunctionLib.sendText(12, 71,"      ");
		Mainframe_GlobalFunctionLib.sendText(13, 58,"B");
		Mainframe_GlobalFunctionLib.sendText(13, 65,maxlimit);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		FunctionalLibrary.navigateToScreen("2");
		Mainframe_GlobalFunctionLib.sendText(4, 6,planlist);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(11, 2,"7");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(11, 2,"2");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(11, 58," ");
		Mainframe_GlobalFunctionLib.click(11, 71);
		Mainframe_GlobalFunctionLib.sendText(11, 71,"      ");
		Mainframe_GlobalFunctionLib.sendText(12, 58,"B");
		Mainframe_GlobalFunctionLib.sendText(12, 65,maxlimit);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");
	}
	
	@Then("^I edit the NDC and GPI list with \"([^\"]*)\",\"([^\"]*)\"$")
	public void i_edit_the_NDC_and_GPI_list_with(String planlist, String maxlimit) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		FunctionalLibrary.navigateToScreen("1");
		Mainframe_GlobalFunctionLib.sendText(4, 6,planlist);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(11, 2,"7");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(12, 2,"2");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.click(12, 58);
		Mainframe_GlobalFunctionLib.sendText(13, 58," ");
		Mainframe_GlobalFunctionLib.sendText(13, 65,"   ");
		Mainframe_GlobalFunctionLib.sendText(16, 58,"B");
		Mainframe_GlobalFunctionLib.sendText(16, 65,maxlimit);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		FunctionalLibrary.navigateToScreen("2");
		Mainframe_GlobalFunctionLib.sendText(4, 6,planlist);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(11, 2,"7");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(11, 2,"2");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(12, 58," ");
		Mainframe_GlobalFunctionLib.click(12, 71);
		Mainframe_GlobalFunctionLib.sendText(12, 65,"   ");
		Mainframe_GlobalFunctionLib.sendText(15, 58,"B");
		Mainframe_GlobalFunctionLib.sendText(15, 65,maxlimit);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");
	}
	
	@Then("^I edit the NDC_GPI list with \"([^\"]*)\",\"([^\"]*)\"$")
	public void i_edit_the_NDC_GPI_list_with(String planlist, String maxlimit) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		FunctionalLibrary.navigateToScreen("1");
		Mainframe_GlobalFunctionLib.sendText(4, 6,planlist);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(11, 2,"7");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(12, 2,"2");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.click(12, 58);
		Mainframe_GlobalFunctionLib.sendText(16, 58," ");
		Mainframe_GlobalFunctionLib.sendText(16, 65,"            ");
		Mainframe_GlobalFunctionLib.sendText(17, 58,"B");
		Mainframe_GlobalFunctionLib.sendText(17, 65,maxlimit);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		FunctionalLibrary.navigateToScreen("2");
		Mainframe_GlobalFunctionLib.sendText(4, 6,planlist);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(11, 2,"7");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(11, 2,"2");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(15, 58," ");
		Mainframe_GlobalFunctionLib.click(15, 65);
		Mainframe_GlobalFunctionLib.sendText(15, 65,"            ");
		Mainframe_GlobalFunctionLib.sendText(16, 58,"B");
		Mainframe_GlobalFunctionLib.sendText(16, 65,maxlimit);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");
	}
	
}
