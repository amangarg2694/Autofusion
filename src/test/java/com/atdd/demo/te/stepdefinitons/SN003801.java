package com.atdd.demo.te.stepdefinitons;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;

import com.atdd.te.screenHelpers.FunctionalLibrary;
import com.cucumber.listener.Reporter;
import com.optumrx.autofusion.core.te.util.Mainframe_GlobalFunctionLib;
import com.optumrx.autofusion.core.te.util.Screenshot;

import cucumber.api.java.en.Then;

public class SN003801 {
	@Then("^Validating the claim is Rejected with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*),\"([^\"]*)\"$")
	public void validating_the_claim_is_paid_with(String memid, String prodid, String qual, String prescid, String rxno, String filldate, String scc) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.sendText(4,4,memid);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(9,2,"1");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		TimeUnit.SECONDS.sleep(3);
		Mainframe_GlobalFunctionLib.sendText(4,65,"          ");
		Mainframe_GlobalFunctionLib.sendText(4,65,filldate);
		Mainframe_GlobalFunctionLib.sendText(5,29,rxno);
		Mainframe_GlobalFunctionLib.sendText(11,20,prodid);
		Mainframe_GlobalFunctionLib.sendText(19,19,qual);
		Mainframe_GlobalFunctionLib.sendText(19,26,"               ");
		Mainframe_GlobalFunctionLib.sendText(19,26,prescid);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Mainframe_GlobalFunctionLib.click(13,10);
		Mainframe_GlobalFunctionLib.pressKey("F4");
		Mainframe_GlobalFunctionLib.sendText(3,39,scc);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(6,27,"X");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		TimeUnit.SECONDS.sleep(3);
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("F7");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	}

}
