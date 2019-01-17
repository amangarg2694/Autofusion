package com.atdd.demo.te.stepdefinitons;


import com.cucumber.listener.Reporter;
import com.optumrx.autofusion.core.te.util.Mainframe_GlobalFunctionLib;
import com.optumrx.autofusion.core.te.util.Screenshot;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;

import com.atdd.demo.te.stepdefinitions.*;
import com.atdd.te.screenHelpers.FunctionalLibrary;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class StateMedicaidProgram {
	public static String ScreenshotOption = null;
	
	@When("^I click on field with \"([^\"]*)\",\"([^\"]*)\"$")
	public void i_click_on_field_with(String row, String col) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Integer rowpos = Integer.parseInt(row);
		Integer colpos = Integer.parseInt(col);
		Mainframe_GlobalFunctionLib.click(rowpos, colpos);
	}
	
	@When("^I submit claim with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_submit_claim_with(String bin, String proc, String group, String pharmacyID, String rxNbr, String refill, String fillDate, String memberID, String productID, String dspQty, String ds, String psc, String cost, String qual, String prescid) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		try {
			FunctionalLibrary.navigateToRxClaimPlanAdministrator();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		FunctionalLibrary.navigateToScreen("3");
		FunctionalLibrary.navigateToScreen("2");
		FunctionalLibrary.navigateToScreen("1");
		
		if(!(FunctionalLibrary.func_SearchAndSelectADataEditMode("4,4" ,memberID ,"9,4" , memberID))){
			
			Mainframe_GlobalFunctionLib.pressKey("F6");
			Mainframe_GlobalFunctionLib.sendText(11, 14,bin );
			Mainframe_GlobalFunctionLib.sendText(11, 41,proc );
			Mainframe_GlobalFunctionLib.sendText(11, 59,group );
			Mainframe_GlobalFunctionLib.sendText(12, 14,pharmacyID );
			Mainframe_GlobalFunctionLib.sendText(12, 41,rxNbr );
			Mainframe_GlobalFunctionLib.sendText(12, 59,refill );
			Mainframe_GlobalFunctionLib.sendText(14, 41,memberID );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Thread.sleep(4000);
			//Mainframe_GlobalFunctionLib.click(7, 12 );
			//Mainframe_GlobalFunctionLib.pressKey("F4");
			//Thread.sleep(1000);
			//Mainframe_GlobalFunctionLib.sendText(3, 4, memberID);
			//Mainframe_GlobalFunctionLib.pressKey("Enter");
			//Mainframe_GlobalFunctionLib.sendText(8, 2,"1" );
			//Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText("04" , "065" ,"          ");
			Mainframe_GlobalFunctionLib.sendText("04", "065", fillDate);			
			Mainframe_GlobalFunctionLib.sendText("11", "020",productID );
			Mainframe_GlobalFunctionLib.sendText("12", "011",dspQty );
			Mainframe_GlobalFunctionLib.sendText("12", "026",ds );
			Mainframe_GlobalFunctionLib.sendText("14", "006",psc );
			Mainframe_GlobalFunctionLib.sendText("10", "047","         " );
			Mainframe_GlobalFunctionLib.sendText("19", "019",qual );
			Mainframe_GlobalFunctionLib.sendText("19", "026",prescid );
			Mainframe_GlobalFunctionLib.sendText("10", "047",cost );
			Mainframe_GlobalFunctionLib.sendText("19", "047","80" );
			Mainframe_GlobalFunctionLib.sendText("20", "047","20" );
			Mainframe_GlobalFunctionLib.sendText("10", "047",cost );
			Mainframe_GlobalFunctionLib.pressKey("PageDown");
			Mainframe_GlobalFunctionLib.click(4, 11);
			for(int i=0;i<4;i++)
			{
				Mainframe_GlobalFunctionLib.PressTabKey();
			}
			Mainframe_GlobalFunctionLib.sendText("04", "055","5" );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			
		}
		else{
			
		Mainframe_GlobalFunctionLib.sendText("09", "002","1" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Thread.sleep(1000);
		Mainframe_GlobalFunctionLib.click(4, 29 );
			Mainframe_GlobalFunctionLib.sendText("04", "029", pharmacyID);
			///Thread.sleep(3000);
			Mainframe_GlobalFunctionLib.sendText("04" , "065" ,"          ");
			Mainframe_GlobalFunctionLib.sendText("04" , "065", fillDate);
			Mainframe_GlobalFunctionLib.sendText("05","029", rxNbr);
			Mainframe_GlobalFunctionLib.sendText("05", "047", refill);			
			//Mainframe_GlobalFunctionLib.click(7, 12 );
			Mainframe_GlobalFunctionLib.sendText("07", "012", memberID);
			//Mainframe_GlobalFunctionLib.pressKey("F4");
			//Mainframe_GlobalFunctionLib.sendText(3, 4, memberID);
			//Mainframe_GlobalFunctionLib.pressKey("Enter");         
			//Mainframe_GlobalFunctionLib.sendText(8, 2,"1" );
			//Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText("11", "020",productID );
			Mainframe_GlobalFunctionLib.sendText("12", "011","           " );
			Mainframe_GlobalFunctionLib.sendText("12", "011",dspQty );
			Mainframe_GlobalFunctionLib.sendText("12", "026","   " );
			Mainframe_GlobalFunctionLib.sendText("12", "026",ds);
			Mainframe_GlobalFunctionLib.sendText("14", "006",psc );
			Mainframe_GlobalFunctionLib.sendText("10", "047","         " );
			Mainframe_GlobalFunctionLib.sendText("19", "019",qual );
			Mainframe_GlobalFunctionLib.sendText("19", "026",prescid );
			Mainframe_GlobalFunctionLib.sendText("10", "047",cost );
			Mainframe_GlobalFunctionLib.sendText("19", "047","80" );
			Mainframe_GlobalFunctionLib.sendText("20", "047","20" );
			Mainframe_GlobalFunctionLib.pressKey("PageDown");
			Mainframe_GlobalFunctionLib.click(4, 11);
			for(int i=0;i<4;i++)
			{
				Mainframe_GlobalFunctionLib.PressTabKey();
			}
			Mainframe_GlobalFunctionLib.sendText("04", "055","5" );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			
			//Mainframe_GlobalFunctionLib.pressKey("F6");
            
		}
		
			System.out.println("Claim is created");
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			Mainframe_GlobalFunctionLib.pressKey("F6");
			 Thread.sleep(2000);
			 Mainframe_GlobalFunctionLib.pressKey("F7");
			 Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
					
	}
	
	@When("^I enter details in Prescriber Network Override screen$")
	public void i_enter_details_in_Prescriber_Network_Override_screen() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.pressKey("F9");
		Mainframe_GlobalFunctionLib.click(6, 15);
		Robot r=new Robot();
		for(int i=0;i<10;i++)
		{
		r.keyPress(KeyEvent.VK_DELETE);
		r.keyRelease(KeyEvent.VK_DELETE);
		}
		Mainframe_GlobalFunctionLib.click(7, 15);
		r.keyPress(KeyEvent.VK_DELETE);
		r.keyRelease(KeyEvent.VK_DELETE);
		Mainframe_GlobalFunctionLib.click(8, 19);
		for(int i=0;i<2;i++)
		{
		r.keyPress(KeyEvent.VK_DELETE);
		r.keyRelease(KeyEvent.VK_DELETE);
		}
		Mainframe_GlobalFunctionLib.sendText("09", "025","Y" );
		Mainframe_GlobalFunctionLib.sendText("10", "025","N" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
	}
	@When("^I enter details in Prescriber Network Override screen with \"([^\"]*)\",\"([^\"]*)\"$")
	public void i_enter_details_in_Prescriber_Network_Override_screen_with(String MN, String CCR) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.pressKey("F9");
		Mainframe_GlobalFunctionLib.click(6, 15);
		Robot r=new Robot();
		for(int i=0;i<10;i++)
		{
		r.keyPress(KeyEvent.VK_DELETE);
		r.keyRelease(KeyEvent.VK_DELETE);
		}
		Mainframe_GlobalFunctionLib.click(7, 15);
		r.keyPress(KeyEvent.VK_DELETE);
		r.keyRelease(KeyEvent.VK_DELETE);
		Mainframe_GlobalFunctionLib.click(8, 19);
		for(int i=0;i<2;i++)
		{
		r.keyPress(KeyEvent.VK_DELETE);
		r.keyRelease(KeyEvent.VK_DELETE);
		}
		Mainframe_GlobalFunctionLib.sendText("09", "025",MN );
		Mainframe_GlobalFunctionLib.sendText("10", "025",CCR );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	}

	
	
	@When("^I submit CCR claim with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_submit_CCR_claim_with(String bin, String proc, String group, String pharmacyID, String rxNbr, String refill, String fillDate, String memberID, String productID, String dspQty, String ds, String psc, String cost, String qual, String prescid, String CCRCode) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		try {
			FunctionalLibrary.navigateToRxClaimPlanAdministrator();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		FunctionalLibrary.navigateToScreen("3");
		FunctionalLibrary.navigateToScreen("2");
		FunctionalLibrary.navigateToScreen("1");
		
		if(!(FunctionalLibrary.func_SearchAndSelectADataEditMode("4,4" ,memberID ,"9,4" , memberID))){
			
			Mainframe_GlobalFunctionLib.pressKey("F6");
			Mainframe_GlobalFunctionLib.sendText(11, 14,bin );
			Mainframe_GlobalFunctionLib.sendText(11, 41,proc );
			Mainframe_GlobalFunctionLib.sendText(11, 59,group );
			Mainframe_GlobalFunctionLib.sendText(12, 14,pharmacyID );
			Mainframe_GlobalFunctionLib.sendText(12, 41,rxNbr );
			Mainframe_GlobalFunctionLib.sendText(12, 59,refill );
			Mainframe_GlobalFunctionLib.sendText(14, 41,memberID );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Thread.sleep(4000);
			Mainframe_GlobalFunctionLib.sendText("04" , "065" ,"          ");
			Mainframe_GlobalFunctionLib.sendText("04", "065", fillDate);			
			Mainframe_GlobalFunctionLib.sendText("11", "020",productID );
			Mainframe_GlobalFunctionLib.sendText("12", "011",dspQty );
			Mainframe_GlobalFunctionLib.sendText("12", "026",ds );
			Mainframe_GlobalFunctionLib.sendText("14", "006",psc );
			Mainframe_GlobalFunctionLib.sendText("10", "047","         " );
			Mainframe_GlobalFunctionLib.sendText("19", "019",qual );
			Mainframe_GlobalFunctionLib.sendText("19", "026",prescid );
			Mainframe_GlobalFunctionLib.sendText("10", "047",cost );
			Mainframe_GlobalFunctionLib.sendText("19", "047","80" );
			Mainframe_GlobalFunctionLib.sendText("20", "047","20" );
			Mainframe_GlobalFunctionLib.sendText("10", "047",cost );
			
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.pressKey("F14");
			Mainframe_GlobalFunctionLib.sendText("05", "023","8" );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.pressKey("F6");
			Mainframe_GlobalFunctionLib.click(13, 10);
			Mainframe_GlobalFunctionLib.pressKey("F4");
			Mainframe_GlobalFunctionLib.sendText("03", "039", CCRCode);
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText("06", "027", "X");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.pressKey("F12");
			Mainframe_GlobalFunctionLib.pressKey("F12");
		}
		else{
			
		Mainframe_GlobalFunctionLib.sendText("09", "002","1" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Thread.sleep(1000);
		Mainframe_GlobalFunctionLib.click(4, 29 );
			Mainframe_GlobalFunctionLib.sendText("04", "029", pharmacyID);
			///Thread.sleep(3000);
			Mainframe_GlobalFunctionLib.sendText("04" , "065" ,"          ");
			Mainframe_GlobalFunctionLib.sendText("04" , "065", fillDate);
			Mainframe_GlobalFunctionLib.sendText("05","029", rxNbr);
			Mainframe_GlobalFunctionLib.sendText("05", "047", refill);			
			//Mainframe_GlobalFunctionLib.click(7, 12 );
			Mainframe_GlobalFunctionLib.sendText("07", "012", memberID);
			//Mainframe_GlobalFunctionLib.pressKey("F4");
			//Mainframe_GlobalFunctionLib.sendText(3, 4, memberID);
			//Mainframe_GlobalFunctionLib.pressKey("Enter");         
			//Mainframe_GlobalFunctionLib.sendText(8, 2,"1" );
			//Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText("11", "020",productID );
			Mainframe_GlobalFunctionLib.sendText("12", "011","           " );
			Mainframe_GlobalFunctionLib.sendText("12", "011",dspQty );
			Mainframe_GlobalFunctionLib.sendText("12", "026","   " );
			Mainframe_GlobalFunctionLib.sendText("12", "026",ds);
			Mainframe_GlobalFunctionLib.sendText("14", "006",psc );
			Mainframe_GlobalFunctionLib.sendText("10", "047","         " );
			Mainframe_GlobalFunctionLib.sendText("19", "019",qual );
			Mainframe_GlobalFunctionLib.sendText("19", "026",prescid );
			Mainframe_GlobalFunctionLib.sendText("10", "047",cost );
			Mainframe_GlobalFunctionLib.sendText("19", "047","80" );
			Mainframe_GlobalFunctionLib.sendText("20", "047","20" );
			Mainframe_GlobalFunctionLib.pressKey("PageDown");
			Mainframe_GlobalFunctionLib.click(4, 11);
			for(int i=0;i<4;i++)
			{
				Mainframe_GlobalFunctionLib.PressTabKey();
			}
			Mainframe_GlobalFunctionLib.sendText("04", "055","5" );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.pressKey("F14");
			Mainframe_GlobalFunctionLib.sendText("05", "023","8" );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.pressKey("F6");
			Mainframe_GlobalFunctionLib.click(13, 10);
			Mainframe_GlobalFunctionLib.pressKey("F4");
			Mainframe_GlobalFunctionLib.sendText("03", "039", CCRCode);
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText("06", "027", "X");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.pressKey("F12");
			Mainframe_GlobalFunctionLib.pressKey("F12");
			//Mainframe_GlobalFunctionLib.pressKey("F6");
            
		}
		
			System.out.println("Claim is created");	
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			Mainframe_GlobalFunctionLib.pressKey("F6");
			 Thread.sleep(2000);
			 Mainframe_GlobalFunctionLib.pressKey("F7");
			
			 Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	}
	
	@When("^I submit a CCR claim with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_submit_a_CCR_claim_with(String bin, String proc, String group, String pharmacyID, String rxNbr, String refill, String fillDate, String memberID, String productID, String dspQty, String ds, String psc, String cost, String CCRCode) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		try {
			FunctionalLibrary.navigateToRxClaimPlanAdministrator();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		FunctionalLibrary.navigateToScreen("3");
		FunctionalLibrary.navigateToScreen("2");
		FunctionalLibrary.navigateToScreen("1");
		
		if(!(FunctionalLibrary.func_SearchAndSelectADataEditMode("4,4" ,memberID ,"9,4" , memberID))){
			
			Mainframe_GlobalFunctionLib.pressKey("F6");
			Mainframe_GlobalFunctionLib.sendText(11, 14,bin );
			Mainframe_GlobalFunctionLib.sendText(11, 41,proc );
			Mainframe_GlobalFunctionLib.sendText(11, 59,group );
			Mainframe_GlobalFunctionLib.sendText(12, 14,pharmacyID );
			Mainframe_GlobalFunctionLib.sendText(12, 41,rxNbr );
			Mainframe_GlobalFunctionLib.sendText(12, 59,refill );
			Mainframe_GlobalFunctionLib.sendText(14, 41,memberID );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Thread.sleep(4000);
			Mainframe_GlobalFunctionLib.sendText("04" , "065" ,"          ");
			Mainframe_GlobalFunctionLib.sendText("04", "065", fillDate);			
			Mainframe_GlobalFunctionLib.sendText("11", "020",productID );
			Mainframe_GlobalFunctionLib.sendText("12", "011",dspQty );
			Mainframe_GlobalFunctionLib.sendText("12", "026",ds );
			Mainframe_GlobalFunctionLib.sendText("14", "006",psc );
			Mainframe_GlobalFunctionLib.sendText("10", "047","         " );
			Mainframe_GlobalFunctionLib.sendText("10", "047",cost );
			Mainframe_GlobalFunctionLib.sendText("19", "047","80" );
			Mainframe_GlobalFunctionLib.sendText("20", "047","20" );
			
			
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.pressKey("F14");
			Mainframe_GlobalFunctionLib.sendText("05", "023","8" );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.pressKey("F6");
			Mainframe_GlobalFunctionLib.click(13, 10);
			Mainframe_GlobalFunctionLib.pressKey("F4");
			Mainframe_GlobalFunctionLib.sendText("03", "039", CCRCode);
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText("06", "027", "X");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.pressKey("F12");
			Mainframe_GlobalFunctionLib.pressKey("F12");
		}
		else{
			
		//Mainframe_GlobalFunctionLib.sendText("09", "002","1" );
		//Mainframe_GlobalFunctionLib.pressKey("Enter");
		Thread.sleep(1000);
		Mainframe_GlobalFunctionLib.click(4, 29 );
			Mainframe_GlobalFunctionLib.sendText("04", "029", pharmacyID);
			///Thread.sleep(3000);
			Mainframe_GlobalFunctionLib.sendText("04" , "065" ,"          ");
			Mainframe_GlobalFunctionLib.sendText("04" , "065", fillDate);
			Mainframe_GlobalFunctionLib.sendText("05","029", rxNbr);
			Mainframe_GlobalFunctionLib.sendText("05", "047", refill);			
			//Mainframe_GlobalFunctionLib.click(7, 12 );
			Mainframe_GlobalFunctionLib.sendText("07", "012", memberID);
			//Mainframe_GlobalFunctionLib.pressKey("F4");
			//Mainframe_GlobalFunctionLib.sendText(3, 4, memberID);
			//Mainframe_GlobalFunctionLib.pressKey("Enter");         
			//Mainframe_GlobalFunctionLib.sendText(8, 2,"1" );
			//Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText("11", "020",productID );
			Mainframe_GlobalFunctionLib.sendText("12", "011","           " );
			Mainframe_GlobalFunctionLib.sendText("12", "011",dspQty );
			Mainframe_GlobalFunctionLib.sendText("12", "026","   " );
			Mainframe_GlobalFunctionLib.sendText("12", "026",ds);
			Mainframe_GlobalFunctionLib.sendText("14", "006",psc );
			Mainframe_GlobalFunctionLib.sendText("10", "047","         " );
			Mainframe_GlobalFunctionLib.sendText("10", "047",cost );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.pressKey("F14");
			Mainframe_GlobalFunctionLib.sendText("05", "023","8" );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.pressKey("F6");
			Mainframe_GlobalFunctionLib.click(13, 10);
			Mainframe_GlobalFunctionLib.pressKey("F4");
			Mainframe_GlobalFunctionLib.sendText("03", "039", CCRCode);
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText("06", "027", "X");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.pressKey("F12");
			Mainframe_GlobalFunctionLib.pressKey("F12");
			//Mainframe_GlobalFunctionLib.pressKey("F6");
            
		}
		
			System.out.println("Claim is created");
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			Mainframe_GlobalFunctionLib.pressKey("F6");
			 Thread.sleep(2000);
			 Mainframe_GlobalFunctionLib.pressKey("F7");
			
			 Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	}
	
	@When("^I enter details in Prescriber Network Override screen with \"([^\"]*)\"$")
	public void i_enter_details_in_Prescriber_Network_Override_screen_with(String MN) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.pressKey("F9");
		Mainframe_GlobalFunctionLib.click(6, 15);
		Robot r=new Robot();
		for(int i=0;i<10;i++)
		{
		r.keyPress(KeyEvent.VK_DELETE);
		r.keyRelease(KeyEvent.VK_DELETE);
		}
		Mainframe_GlobalFunctionLib.click(7, 15);
		r.keyPress(KeyEvent.VK_DELETE);
		r.keyRelease(KeyEvent.VK_DELETE);
		Mainframe_GlobalFunctionLib.click(8, 19);
		for(int i=0;i<2;i++)
		{
		r.keyPress(KeyEvent.VK_DELETE);
		r.keyRelease(KeyEvent.VK_DELETE);
		}
		Mainframe_GlobalFunctionLib.sendText("09", "025",MN );
		Mainframe_GlobalFunctionLib.click(10, 25);
		r.keyPress(KeyEvent.VK_DELETE);
		r.keyRelease(KeyEvent.VK_DELETE);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	}
	
	@When("^I submit batch claim with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_submit_batch_claim_with(String Batch, String BatchDesc, String bin, String proc, String group, String pharmqual, String pharmacyID, String rxNbr, String refill, String memberID, String prodqual, String productID, String dspQty, String ds, String qual, String prescid, String cost) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		try {
			FunctionalLibrary.navigateToRxClaimPlanAdministrator();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		FunctionalLibrary.navigateToScreen("3");
		FunctionalLibrary.navigateToScreen("2");
		FunctionalLibrary.navigateToScreen("13");
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Mainframe_GlobalFunctionLib.sendText("11", "018",Batch );
		Mainframe_GlobalFunctionLib.sendText("12", "018",BatchDesc );	
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText("16", "064","Y" );
		Mainframe_GlobalFunctionLib.sendText("04", "005",Batch );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText("09", "002","7" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Mainframe_GlobalFunctionLib.click(11, 14);
		Mainframe_GlobalFunctionLib.pressKey("F4");
		Mainframe_GlobalFunctionLib.sendText("14", "029","X" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText("03", "007",bin);
		Mainframe_GlobalFunctionLib.sendText("03", "031",proc);
		Mainframe_GlobalFunctionLib.sendText("03", "051",group);
		Mainframe_GlobalFunctionLib.sendText("04", "012",pharmqual);
		Mainframe_GlobalFunctionLib.sendText("04", "017",pharmacyID);
		Mainframe_GlobalFunctionLib.sendText("05", "007",rxNbr);
		Mainframe_GlobalFunctionLib.sendText("05", "028",refill);
		Mainframe_GlobalFunctionLib.sendText("07", "012",memberID);
		Mainframe_GlobalFunctionLib.sendText("10", "010",prodqual);
		Mainframe_GlobalFunctionLib.sendText("10", "013",productID);
		Mainframe_GlobalFunctionLib.sendText("12", "011",dspQty);
		Mainframe_GlobalFunctionLib.sendText("12", "040",ds);
		Mainframe_GlobalFunctionLib.sendText("13", "013",qual);
		Mainframe_GlobalFunctionLib.sendText("13", "016",prescid);
		Mainframe_GlobalFunctionLib.sendText("17", "050",cost);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		System.out.println("Claim is created");	
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Thread.sleep(2000);
		Mainframe_GlobalFunctionLib.pressKey("F7");
		
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	}
	@When("^I submit batch claim with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_submit_batch_claim_with(String Batch, String BatchDesc, String bin, String proc, String group, String pharmqual, String pharmacyID, String rxNbr, String refill, String memberID, String prodqual, String productID, String dspQty, String ds, String cost) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		try {
			FunctionalLibrary.navigateToRxClaimPlanAdministrator();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		FunctionalLibrary.navigateToScreen("3");
		FunctionalLibrary.navigateToScreen("2");
		FunctionalLibrary.navigateToScreen("13");
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Mainframe_GlobalFunctionLib.sendText("11", "018",Batch );
		Mainframe_GlobalFunctionLib.sendText("12", "018",BatchDesc );	
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText("16", "064","Y" );
		Mainframe_GlobalFunctionLib.sendText("04", "005",Batch );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText("09", "002","7" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Mainframe_GlobalFunctionLib.click(11, 14);
		Mainframe_GlobalFunctionLib.pressKey("F4");
		Mainframe_GlobalFunctionLib.sendText("14", "029","X" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText("03", "007",bin);
		Mainframe_GlobalFunctionLib.sendText("03", "031",proc);
		Mainframe_GlobalFunctionLib.sendText("03", "051",group);
		Mainframe_GlobalFunctionLib.sendText("04", "012",pharmqual);
		Mainframe_GlobalFunctionLib.sendText("04", "017",pharmacyID);
		Mainframe_GlobalFunctionLib.sendText("05", "007",rxNbr);
		Mainframe_GlobalFunctionLib.sendText("05", "028",refill);
		Mainframe_GlobalFunctionLib.sendText("07", "012",memberID);
		Mainframe_GlobalFunctionLib.sendText("10", "010",prodqual);
		Mainframe_GlobalFunctionLib.sendText("10", "013",productID);
		Mainframe_GlobalFunctionLib.sendText("12", "011",dspQty);
		Mainframe_GlobalFunctionLib.sendText("12", "040",ds);
		Mainframe_GlobalFunctionLib.sendText("17", "050",cost);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		System.out.println("Claim is created");	
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Thread.sleep(2000);
		Mainframe_GlobalFunctionLib.pressKey("F7");
		
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	}
	@When("^I submit batch claim with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_submit_batch_claim_with(String Batch, String BatchDesc, String bin, String proc, String group, String pharmqual, String pharmacyID, String rxNbr, String refill, String memberID, String prodqual, String productID, String dspQty, String ds, String cost,String CCR) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		try {
			FunctionalLibrary.navigateToRxClaimPlanAdministrator();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		FunctionalLibrary.navigateToScreen("3");
		FunctionalLibrary.navigateToScreen("2");
		FunctionalLibrary.navigateToScreen("13");
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Mainframe_GlobalFunctionLib.sendText("11", "018",Batch );
		Mainframe_GlobalFunctionLib.sendText("12", "018",BatchDesc );	
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText("16", "064","Y" );
		Mainframe_GlobalFunctionLib.sendText("04", "005",Batch );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText("09", "002","7" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Mainframe_GlobalFunctionLib.click(11, 14);
		Mainframe_GlobalFunctionLib.pressKey("F4");
		Mainframe_GlobalFunctionLib.sendText("14", "029","X" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText("03", "007",bin);
		Mainframe_GlobalFunctionLib.sendText("03", "031",proc);
		Mainframe_GlobalFunctionLib.sendText("03", "051",group);
		Mainframe_GlobalFunctionLib.sendText("04", "012",pharmqual);
		Mainframe_GlobalFunctionLib.sendText("04", "017",pharmacyID);
		Mainframe_GlobalFunctionLib.sendText("05", "007",rxNbr);
		Mainframe_GlobalFunctionLib.sendText("05", "028",refill);
		Mainframe_GlobalFunctionLib.sendText("07", "012",memberID);
		Mainframe_GlobalFunctionLib.sendText("10", "010",prodqual);
		Mainframe_GlobalFunctionLib.sendText("10", "013",productID);
		Mainframe_GlobalFunctionLib.sendText("12", "011",dspQty);
		Mainframe_GlobalFunctionLib.sendText("12", "040",ds);
		Mainframe_GlobalFunctionLib.sendText("17", "035",CCR);
		Mainframe_GlobalFunctionLib.sendText("17", "050",cost);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		System.out.println("Claim is created");	
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Thread.sleep(2000);
		Mainframe_GlobalFunctionLib.pressKey("F7");
		
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	}
	@When("^I delete CCR code$")
	public void i_delete_CCR_code() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.click(7,25);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_DELETE);
		r.keyRelease(KeyEvent.VK_DELETE);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	}
	
	@Then("^Validate the \"([^\"]*)\" functionality of Medicaid Network$")
	public void validate_the_functionality_of_Medicaid_Network(String Key) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		if(Key.equals("F4"))
		{
		Mainframe_GlobalFunctionLib.click(9,25);
		Mainframe_GlobalFunctionLib.pressKey(Key);
		Mainframe_GlobalFunctionLib.click(7,4);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_DELETE);
		r.keyRelease(KeyEvent.VK_DELETE);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		}
		else if(Key.equals("F1"))
		{
			Mainframe_GlobalFunctionLib.click(9,2);
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			Thread.sleep(2000);
			Robot r=new Robot();
			r.keyPress(KeyEvent.VK_F1);
			r.keyRelease(KeyEvent.VK_F1);
			Thread.sleep(2000);
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		}
	}
	
	@Then("^Validate the \"([^\"]*)\" functionality of Clarification Code Recognition$")
	public void validate_the_functionality_of_Clarification_Code_Recognition(String Key) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		if(Key.equals("F4"))
		{
		Mainframe_GlobalFunctionLib.click(10,25);
		Mainframe_GlobalFunctionLib.pressKey(Key);
		Mainframe_GlobalFunctionLib.click(7,4);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_DELETE);
		r.keyRelease(KeyEvent.VK_DELETE);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		}
		else if(Key.equals("F1"))
		{
			Mainframe_GlobalFunctionLib.click(10,2);
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			Thread.sleep(2000);
			Robot r=new Robot();
			r.keyPress(KeyEvent.VK_F1);
			r.keyRelease(KeyEvent.VK_F1);
			Thread.sleep(2000);
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		}
	}
	
	@Then("^I enter the values for Prescriber Plan creation with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_enter_the_values_for_Prescriber_Plan_creation_with(String plancode, String fromdt, String desc) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.sendText("13", "019",plancode);
		Mainframe_GlobalFunctionLib.sendText("14", "019",fromdt);
		Mainframe_GlobalFunctionLib.sendText("15", "019",desc);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText("16", "064","Y");
		Thread.sleep(2000);
		Mainframe_GlobalFunctionLib.sendText("11", "024","Y");
		Mainframe_GlobalFunctionLib.sendText("13", "077","Y");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText("16", "064","Y");
		Mainframe_GlobalFunctionLib.pressKey("F7");
		Mainframe_GlobalFunctionLib.sendText("07", "021","6");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F9");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	}
	

	@Then("^Validate error message displayed on Prescriber Network Override screen$")
	public void validate_error_message_displayed_on_Prescriber_Network_Override_screen() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String ActualMessage = Mainframe_GlobalFunctionLib.getText(24, 2);
		String ExpectedMessage = "Clar Code Recognition is only allowed with the Medicaid Network value"+"Y"+".";
		if(ExpectedMessage.equals(ActualMessage))
		{
			System.out.println("Validation passed: "+ActualMessage);
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		}
		else
		{
			System.out.println("Validation failed: "+ActualMessage);
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		}
	}
	
	@When("^creating a library with \"([^\"]*)\"$")
	public void creating_a_library_with(String lib) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 Mainframe_GlobalFunctionLib.sendText("21", "007","crtlib");
		 Mainframe_GlobalFunctionLib.pressKey("F4");
		 Mainframe_GlobalFunctionLib.sendText("05", "037",lib);
		 String existlib = Mainframe_GlobalFunctionLib.getText(5, 37);
		 Mainframe_GlobalFunctionLib.pressKey("Enter");
			if(lib.equals(existlib))
			{
				String message = Mainframe_GlobalFunctionLib.getText(24,2);
				System.out.println("Enter the new library value as the library already exists: " +message);
			}
			else
			{
			
			Mainframe_GlobalFunctionLib.sendText("07", "037","Testing Conversion");
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			}
	}
	
	@Then("^Copy the data from \"([^\"]*)\" to library \"([^\"]*)\" with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void copy_the_data_from_to_library_with(String file, String lib, String dupdata, String duplid, String fdata, String data) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.sendText("21", "007","crtdupobj");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText("05", "037",fdata);
		Mainframe_GlobalFunctionLib.sendText("06", "037",file);
		Mainframe_GlobalFunctionLib.sendText("07", "037","*ALL");
		for(int i=0;i<8;i++)
		{
			Robot r= new Robot();
			r.keyPress(KeyEvent.VK_DELETE);
			r.keyRelease(KeyEvent.VK_DELETE);
		}
		Mainframe_GlobalFunctionLib.sendText("09", "037",lib);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText("13", "037",dupdata);
		Mainframe_GlobalFunctionLib.sendText("15", "037","    ");
		Mainframe_GlobalFunctionLib.sendText("15", "037","*NO");
		Mainframe_GlobalFunctionLib.sendText("16", "037",duplid);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Thread.sleep(2000);
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.sendText("21", "007","                    ");
		Mainframe_GlobalFunctionLib.sendText("21", "007","wrkobj");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText("05", "037",fdata);
		Mainframe_GlobalFunctionLib.sendText("06", "039",lib);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Thread.sleep(2000);
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("F3");
		
		Mainframe_GlobalFunctionLib.sendText("21", "007","runqry *n "+lib+"/"+data);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Thread.sleep(2000);
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("F3"); 
	}
	
	@Then("^Copy the programs with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void copy_the_programs_with(String file, String lib, String fname, String ctrlid) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.sendText("21", "007","9");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText("04", "017",fname);
		Mainframe_GlobalFunctionLib.sendText("04", "033",ctrlid);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText("09", "02","5");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		String DTAQprog = Mainframe_GlobalFunctionLib.getText(15, 15);
		String Dataexitprog = Mainframe_GlobalFunctionLib.getText(15, 45);
		Thread.sleep(2000);
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.sendText("21", "007","                    ");
		Mainframe_GlobalFunctionLib.sendText("21", "007","wrkobj");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText("05", "037",DTAQprog);
		Mainframe_GlobalFunctionLib.sendText("06", "039",file);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Thread.sleep(2000);
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.sendText("08", "002","3");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText("08", "037",lib);
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Thread.sleep(2000);
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.sendText("21", "007","                    ");
		Mainframe_GlobalFunctionLib.sendText("21", "007","wrkobj");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText("05", "037",Dataexitprog);
		Mainframe_GlobalFunctionLib.sendText("06", "039",file);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Thread.sleep(2000);
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.sendText("08", "002","3");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText("08", "037",lib);
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Thread.sleep(2000);
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("F3");
	}
	
	
	
	@Then("^Copy the CV files to library with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void copy_the_CV_files_to_library_with(String cvfile, String cvlib, String lib, String dupdata, String dupid) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.sendText("21", "007","                    ");
		Mainframe_GlobalFunctionLib.sendText("21", "007","wrkobj");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText("05", "037",cvfile);
		Mainframe_GlobalFunctionLib.sendText("06", "039",cvlib);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Thread.sleep(2000);
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.sendText("08", "002","3");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText("08", "037",lib);
		Mainframe_GlobalFunctionLib.sendText("12", "037",dupdata);
		Mainframe_GlobalFunctionLib.sendText("15", "037",dupid);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Thread.sleep(2000);
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("F3");
	}
	
	@When("^Create journal receiver and journal in production library with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void create_journal_receiver_and_journal_in_production_library_with(String prodfile, String lib, String journ, String journrecv, String stagingarea, String staglib, String fname, String ctrlid) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.sendText("21", "007","CRTJRNRCV");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText("05", "037",journrecv);
		Mainframe_GlobalFunctionLib.sendText("06", "039",lib);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		
		Mainframe_GlobalFunctionLib.sendText("21", "007","CRTJRN ");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText("05", "037",journ);
		Mainframe_GlobalFunctionLib.sendText("06", "039",lib);
		Mainframe_GlobalFunctionLib.sendText("07", "037",journrecv);
		Mainframe_GlobalFunctionLib.sendText("08", "039",lib);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		
		
		
		Mainframe_GlobalFunctionLib.sendText("21", "007","strjrnpf ");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText("05", "037",prodfile);
		Mainframe_GlobalFunctionLib.sendText("06", "039",lib);
		Mainframe_GlobalFunctionLib.sendText("09", "037",journ);
		Mainframe_GlobalFunctionLib.sendText("10", "039",lib);
		Mainframe_GlobalFunctionLib.sendText("11", "037","       ");
		Mainframe_GlobalFunctionLib.sendText("11", "037","*BOTH");
		Mainframe_GlobalFunctionLib.sendText("12", "037","*NONE");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText("21", "007","        ");
		Mainframe_GlobalFunctionLib.sendText("21", "007","9");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText("04", "017",fname);
		Thread.sleep(2000);
		Mainframe_GlobalFunctionLib.sendText("04", "033",ctrlid);
		Mainframe_GlobalFunctionLib.click(4,56);
		for(int i=0;i<11;i++)
		{
			Robot ro = new Robot();
			ro.keyPress(KeyEvent.VK_DELETE);
			ro.keyRelease(KeyEvent.VK_DELETE);
		}
		Mainframe_GlobalFunctionLib.sendText("04", "056",staglib);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText("09", "002","6");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Thread.sleep(2000);
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.sendText("21", "007","10");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText("21", "007","2");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Mainframe_GlobalFunctionLib.sendText("09", "017",stagingarea);
		Mainframe_GlobalFunctionLib.sendText("10", "017","TESTING");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText("16", "064","Y");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText("04", "005",stagingarea);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText("09", "002","7");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Mainframe_GlobalFunctionLib.click(15, 17);
		Mainframe_GlobalFunctionLib.pressKey("F4");
		Mainframe_GlobalFunctionLib.sendText("04", "005","RXCLAIM");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText("09", "002","1");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText("06", "027",staglib);
		Mainframe_GlobalFunctionLib.sendText("06", "061",staglib);
		Mainframe_GlobalFunctionLib.sendText("07", "027",lib);
		Mainframe_GlobalFunctionLib.sendText("09", "013","RXCONVERT");
		Mainframe_GlobalFunctionLib.sendText("09", "026","RXCONVERT");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText("16", "064","Y");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.sendText("21", "007","1");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText("04", "005",stagingarea);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText("09", "002","1");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Mainframe_GlobalFunctionLib.sendText("09", "002","1");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Thread.sleep(2000);
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		
		Mainframe_GlobalFunctionLib.sendText("21", "007","rmvpftrg ");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText("05", "037",prodfile);
		Mainframe_GlobalFunctionLib.sendText("06", "039",staglib);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText("21", "007","         ");
		Mainframe_GlobalFunctionLib.sendText("21", "007","1");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText("04", "005",stagingarea);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText("09", "002","1");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		
		String File = Mainframe_GlobalFunctionLib.getText(11, 16);
		if(File.equals(prodfile))
		{
			Mainframe_GlobalFunctionLib.sendText("11", "002","10");
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText("16", "064","Y");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.pressKey("F3");
			Mainframe_GlobalFunctionLib.pressKey("F3");
			Mainframe_GlobalFunctionLib.sendText("21", "007","ws");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			for(int i=0;i<4;i++)
			{
				Mainframe_GlobalFunctionLib.pressKey("F5");
			}
			Mainframe_GlobalFunctionLib.pressKey("F3");
			TimeUnit.MINUTES.sleep(6);
			Mainframe_GlobalFunctionLib.sendText("21", "007","1");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText("04", "005",stagingarea);
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText("09", "002","1");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Thread.sleep(2000);
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			Mainframe_GlobalFunctionLib.pressKey("F3");
			Mainframe_GlobalFunctionLib.pressKey("F3");
			Mainframe_GlobalFunctionLib.pressKey("F3"); 
	}
	}

	
@Then("^Validate the medicaid network and Clarification code recognition flag are blank with \"([^\"]*)\",\"([^\"]*)\"$")
public void validate_the_medicaid_network_and_Clarification_code_recognition_flag_are_blank_with(String file, String lib) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	Mainframe_GlobalFunctionLib.sendText("21", "007","runqry *n "+lib+"/"+file);
	Mainframe_GlobalFunctionLib.pressKey("Enter");
	/*Mainframe_GlobalFunctionLib.sendText("08", "037",file);
	Mainframe_GlobalFunctionLib.sendText("09", "039",lib);
	Mainframe_GlobalFunctionLib.pressKey("Enter");*/
	Thread.sleep(2000);
	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	Robot r= new Robot();
	r.keyPress(KeyEvent.VK_SHIFT);
	r.keyPress(KeyEvent.VK_F9);
	r.keyRelease(KeyEvent.VK_F9);
	r.keyRelease(KeyEvent.VK_SHIFT);
	Mainframe_GlobalFunctionLib.PressTabKey();
	Mainframe_GlobalFunctionLib.sendText("03", "074","50");
	Mainframe_GlobalFunctionLib.pressKey("Enter");
	Thread.sleep(2000);
	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	
}
}
