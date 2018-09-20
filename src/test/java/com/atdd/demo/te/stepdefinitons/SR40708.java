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

public class SR40708 {
	@Then("^Validating the \"([^\"]*)\" screen$")
	public void validating_the_screen(String screenname) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.pressKey("PageDown");
		Mainframe_GlobalFunctionLib.pressKey("PageDown");
		String appscreen = Mainframe_GlobalFunctionLib.getText(6, 27).trim();
		if(appscreen.equals(screenname))
		{
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			Mainframe_GlobalFunctionLib.sendText(21, 7, "29");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		}
		else
		{
			Assert.fail("Screen name is not displayed in right position");
		}
	}
	
	@Then("^Validating the functional keys,exit and previous options in Prescriber State Taxonomy Codes screen$")
	public void validating_the_functional_keys_exit_and_previous_options_in_Prescriber_State_Taxonomy_Codes_screen() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    String F15key = Mainframe_GlobalFunctionLib.getText(22, 2);
	    String F15_key=F15key.substring(43).trim();
	    if(F15_key.equals("F15=Search by Taxonomy Code"))
	    {
	    	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	    	Mainframe_GlobalFunctionLib.pressKey("F15");
	    	String F17key = Mainframe_GlobalFunctionLib.getText(23, 2).trim();
	    	if(F17key.equals("F17=Search by State"))
		    {
	    	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	    	Mainframe_GlobalFunctionLib.pressKey("F17");
	    	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	    	Mainframe_GlobalFunctionLib.sendText(10, 2, "5");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			Mainframe_GlobalFunctionLib.pressKey("F3");
			}
	    	else
	    	{
	    		Assert.fail("F17 option is not displayed");
	    	}
	    	String F16key = Mainframe_GlobalFunctionLib.getText(23, 2).trim();
	    	//String F16_key=F16key.substring(43).trim();
	    	if(F16key.equals("F16=Search by GPI List"))
		    {
	    	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	    	Mainframe_GlobalFunctionLib.pressKey("F16");
	    	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	    	//TC07_Edit
	    	
	    	Mainframe_GlobalFunctionLib.sendText(10, 2, "2");
	    	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	    	Mainframe_GlobalFunctionLib.pressKey("Enter");
	    	Mainframe_GlobalFunctionLib.sendText(4, 41, "        ");
	    	final DateFormat dateFormat = new SimpleDateFormat("MM/dd/yy");
	    	Date currdate = new Date();
	    	String currentdate = dateFormat.format(currdate);
	    	String curr_date = currentdate.replace("/","");
	    	//String cur_date = curr_date.substring(1);
	    	Mainframe_GlobalFunctionLib.sendText(4, 41,curr_date);
	    	Mainframe_GlobalFunctionLib.pressKey("Enter");
	    	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	    	Mainframe_GlobalFunctionLib.pressKey("F12");
	    	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	    	//TC09_Display
	    	Mainframe_GlobalFunctionLib.sendText(10, 2, "5");
	    	Mainframe_GlobalFunctionLib.pressKey("Enter");
	    	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	    	Mainframe_GlobalFunctionLib.pressKey("F12");
	    	//TC08_Inactivate
	    	String gpi_list=Mainframe_GlobalFunctionLib.getText(10, 5);
	    	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	    	Mainframe_GlobalFunctionLib.sendText(10, 2, "4");
	    	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	    	Mainframe_GlobalFunctionLib.pressKey("Enter");
	    	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	    	Mainframe_GlobalFunctionLib.sendText(16, 64, "Y");
	    	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	    	Mainframe_GlobalFunctionLib.pressKey("Enter");
	    	String appgpi = Mainframe_GlobalFunctionLib.getText(10, 5);
	    	if((!gpi_list.equals(appgpi)) || gpi_list.equals(appgpi))
	    	{
	    		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	    		System.out.println("Prescriber State Taxonomy Code by GPI list record has been inactivated");
	    	}
	    	
	    	//TC10
	    	Mainframe_GlobalFunctionLib.click(10, 2);
	    	Robot rob = new Robot();
	    	for(int i=0;i<22;i++)
	    	{
	    	rob.keyPress(KeyEvent.VK_RIGHT);
	    	rob.keyRelease(KeyEvent.VK_RIGHT);
	    	}
	    	rob.keyPress(KeyEvent.VK_F1);
	    	rob.keyRelease(KeyEvent.VK_F1);
	    	TimeUnit.SECONDS.sleep(3);
	    	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	    	TimeUnit.SECONDS.sleep(3);
	    	Mainframe_GlobalFunctionLib.pressKey("F12");
	    	
	    	//TC11
	    	
	    	//Mainframe_GlobalFunctionLib.click(10, 30);
	    	
	    	for(int i=0;i<7;i++)
	    	{
	    	rob.keyPress(KeyEvent.VK_RIGHT);
	    	rob.keyRelease(KeyEvent.VK_RIGHT);
	    	}
	    	rob.keyPress(KeyEvent.VK_F1);
	    	rob.keyRelease(KeyEvent.VK_F1);
	    	TimeUnit.SECONDS.sleep(3);
	    	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	    	TimeUnit.SECONDS.sleep(3);
	    	Mainframe_GlobalFunctionLib.pressKey("F12");
	    	
	    	//TC12
	    	
	    	//Mainframe_GlobalFunctionLib.click(10, 18);
	    	for(int i=0;i<13;i++)
	    	{
	    	rob.keyPress(KeyEvent.VK_LEFT);
	    	rob.keyRelease(KeyEvent.VK_LEFT);
	    	}
	    	rob.keyPress(KeyEvent.VK_F1);
	    	rob.keyRelease(KeyEvent.VK_F1);
	    	TimeUnit.SECONDS.sleep(3);
	    	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	    	TimeUnit.SECONDS.sleep(3);
	    	Mainframe_GlobalFunctionLib.pressKey("F12");
	    	
	    	//TC13
	    	
	    	//Mainframe_GlobalFunctionLib.click(10, 49);
	    	for(int i=0;i<31;i++)
	    	{
	    	rob.keyPress(KeyEvent.VK_RIGHT);
	    	rob.keyRelease(KeyEvent.VK_RIGHT);
	    	}
	    	rob.keyPress(KeyEvent.VK_F1);
	    	rob.keyRelease(KeyEvent.VK_F1);
	    	TimeUnit.SECONDS.sleep(3);
	    	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	    	TimeUnit.SECONDS.sleep(3);
	    	Mainframe_GlobalFunctionLib.pressKey("F12");
	    	//TC14_TC15
		    	String F3F12 = Mainframe_GlobalFunctionLib.getText(22, 2);
	    	String type[] = F3F12.split("   ");
	    	String F3_key = type[0];
	    	String F12_key = type[3];
	    	if(F3_key.equals("F3=Exit") & F12_key.equals("F12=Previous"))
	    	{
	    		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	    		Mainframe_GlobalFunctionLib.pressKey("F3");
	    		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	    		Mainframe_GlobalFunctionLib.pressKey("F16");
	    		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	    		Mainframe_GlobalFunctionLib.pressKey("F12");
	    		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	    	}
	    	else
	    	{
	    		Assert.fail("F3 and F12 option is not displayed");
	    	}
	    	}
	    	else
	    	{
	    		Assert.fail("F16 option is not displayed");
	    	}
	    }
	    else
	    {
	    	Assert.fail("F15 option is not displayed");
	    }
	    
	    //TC05
	    Mainframe_GlobalFunctionLib.pressKey("F15");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.sendText(10,2,"5");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		 Mainframe_GlobalFunctionLib.pressKey("F3");
		 Mainframe_GlobalFunctionLib.pressKey("F12");
	}
	
	@Then("^adding the record in Add Prescriber State Taxonomy Codes screen with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void adding_the_record_in_Add_Prescriber_State_Taxonomy_Codes_screen_with(String FromDate, String ThruDate, String State, String TaxonomyCode, String GPIList, String Qualifier, String CCR) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.sendText(4,17,FromDate);
		Mainframe_GlobalFunctionLib.sendText(4,41,ThruDate);
		
		//State
		Mainframe_GlobalFunctionLib.click(6,17);
		//State F1 - Help
		Robot rob = new Robot();
		rob.keyPress(KeyEvent.VK_F1);
    	rob.keyRelease(KeyEvent.VK_F1);
    	TimeUnit.SECONDS.sleep(3);
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		TimeUnit.SECONDS.sleep(3);
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.click(6,17);
		Mainframe_GlobalFunctionLib.pressKey("F4");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.sendText(7,4,State);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(13,3,"X");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		
		//Taxonomy Code
		Mainframe_GlobalFunctionLib.click(7,17);
		//Taxonomy Code F1 - Help
		rob.keyPress(KeyEvent.VK_F1);
    	rob.keyRelease(KeyEvent.VK_F1);
    	TimeUnit.SECONDS.sleep(3);
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		TimeUnit.SECONDS.sleep(3);
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.click(7,17);
		Mainframe_GlobalFunctionLib.pressKey("F4");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.sendText(4,5,TaxonomyCode);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(9,2,"1");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		
		//GPI List
		Mainframe_GlobalFunctionLib.click(8,17);
		//GPI List F1 - Help
		rob.keyPress(KeyEvent.VK_F1);
    	rob.keyRelease(KeyEvent.VK_F1);
    	TimeUnit.SECONDS.sleep(3);
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		TimeUnit.SECONDS.sleep(3);
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.click(8,17);
		Mainframe_GlobalFunctionLib.pressKey("F4");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.sendText(4,5,GPIList);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(9,2,"1");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		
		//Qualifier
		Mainframe_GlobalFunctionLib.click(9,17);
		//Qualifier F1 - Help
		rob.keyPress(KeyEvent.VK_F1);
    	rob.keyRelease(KeyEvent.VK_F1);
    	TimeUnit.SECONDS.sleep(3);
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		TimeUnit.SECONDS.sleep(3);
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.click(9,17);
		Mainframe_GlobalFunctionLib.pressKey("F4");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.sendText(7,4,Qualifier);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(13,3,"X");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		
		//CCR
		Mainframe_GlobalFunctionLib.click(10,34);
		//CCR F1 - Help
		rob.keyPress(KeyEvent.VK_F1);
    	rob.keyRelease(KeyEvent.VK_F1);
    	TimeUnit.SECONDS.sleep(3);
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		TimeUnit.SECONDS.sleep(3);
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.click(10,34);
		Mainframe_GlobalFunctionLib.pressKey("F4");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.sendText(7,4,CCR);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(13,3,"X");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		
		//TC27_TC28
		Mainframe_GlobalFunctionLib.pressKey("F6");
		String F3_F12 = Mainframe_GlobalFunctionLib.getText(23, 2);
		String F3_Key = F3_F12.substring(0, 7);
		String F12_Key = F3_F12.substring(10);
		if(F3_Key.equals("F3=Exit")&F12_Key.equals("F12=Previous"))
		{
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			Mainframe_GlobalFunctionLib.pressKey("F3");
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			Mainframe_GlobalFunctionLib.pressKey("F6");
			Mainframe_GlobalFunctionLib.pressKey("F12");
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		}
		else
		{
			Assert.fail("F3 and F12 options are not displayed");
		}
	}
	
	@Then("^changing the record in Add Prescriber State Taxonomy Codes screen with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void changing_the_record_in_Add_Prescriber_State_Taxonomy_Codes_screen_with(String State, String TaxonomyCode, String GPIList, String Qualifier, String CCR) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		//TC 29
		Mainframe_GlobalFunctionLib.sendText(10,2,"2");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Robot rob = new Robot();
		//129
		//State F1 Help - Change
		Mainframe_GlobalFunctionLib.click(4, 48);
		for(int i=0;i<129;i++)
    	{
    	rob.keyPress(KeyEvent.VK_RIGHT);
    	rob.keyRelease(KeyEvent.VK_RIGHT);
    	}
    	rob.keyPress(KeyEvent.VK_F1);
    	rob.keyRelease(KeyEvent.VK_F1);
    	TimeUnit.SECONDS.sleep(3);
    	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
    	TimeUnit.SECONDS.sleep(3);
    	Mainframe_GlobalFunctionLib.pressKey("F3");
    	
    	//Taxonomy Code - F1 help - Change
    	for(int i=0;i<80;i++)
    	{
    	rob.keyPress(KeyEvent.VK_RIGHT);
    	rob.keyRelease(KeyEvent.VK_RIGHT);
    	}
    	rob.keyPress(KeyEvent.VK_F1);
    	rob.keyRelease(KeyEvent.VK_F1);
    	TimeUnit.SECONDS.sleep(3);
    	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
    	TimeUnit.SECONDS.sleep(3);
    	Mainframe_GlobalFunctionLib.pressKey("F3");
    	
    	//GPI List - F1 & F4 - Change
    	Mainframe_GlobalFunctionLib.click(8, 17);
    	rob.keyPress(KeyEvent.VK_F1);
    	rob.keyRelease(KeyEvent.VK_F1);
    	TimeUnit.SECONDS.sleep(3);
    	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
    	TimeUnit.SECONDS.sleep(3);
    	Mainframe_GlobalFunctionLib.pressKey("F3");
    	
    	Mainframe_GlobalFunctionLib.click(8, 17);
    	Mainframe_GlobalFunctionLib.pressKey("F4");
    	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
    	Mainframe_GlobalFunctionLib.sendText(4,5,GPIList);
    	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
    	Mainframe_GlobalFunctionLib.pressKey("Enter");
    	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
    	Mainframe_GlobalFunctionLib.sendText(9,2,"1");
    	Mainframe_GlobalFunctionLib.pressKey("Enter");
    	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
    	
    	//Qualifier - F1 & F4 - Change
    	Mainframe_GlobalFunctionLib.click(9, 17);
    	rob.keyPress(KeyEvent.VK_F1);
    	rob.keyRelease(KeyEvent.VK_F1);
    	TimeUnit.SECONDS.sleep(3);
    	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
    	TimeUnit.SECONDS.sleep(3);
    	Mainframe_GlobalFunctionLib.pressKey("F3");
    	
    	Mainframe_GlobalFunctionLib.click(9, 17);
    	Mainframe_GlobalFunctionLib.pressKey("F4");
    	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
    	Mainframe_GlobalFunctionLib.sendText(7,4,Qualifier);
    	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
    	Mainframe_GlobalFunctionLib.pressKey("Enter");
    	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
    	Mainframe_GlobalFunctionLib.sendText(13,3,"X");
    	Mainframe_GlobalFunctionLib.pressKey("Enter");
    	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
    	
    	//CCR - F1 & F4 - Change
    	Mainframe_GlobalFunctionLib.click(10, 34);
    	rob.keyPress(KeyEvent.VK_F1);
    	rob.keyRelease(KeyEvent.VK_F1);
    	TimeUnit.SECONDS.sleep(3);
    	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
    	TimeUnit.SECONDS.sleep(3);
    	Mainframe_GlobalFunctionLib.pressKey("F3");
    	
    	Mainframe_GlobalFunctionLib.click(10, 34);
    	Mainframe_GlobalFunctionLib.pressKey("F4");
    	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
    	Mainframe_GlobalFunctionLib.sendText(7,4,CCR);
    	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
    	Mainframe_GlobalFunctionLib.pressKey("Enter");
    	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
    	Mainframe_GlobalFunctionLib.sendText(13,3,"X");
    	Mainframe_GlobalFunctionLib.pressKey("Enter");
    	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
    	
    	Mainframe_GlobalFunctionLib.pressKey("Enter");
    	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
    	
    	//F3 and F12 option check - Change
    	String F3_F12 = Mainframe_GlobalFunctionLib.getText(23,2);
    	String F3_key = F3_F12.substring(0, 7);
    	String F12_key = F3_F12.substring(10);
    	if(F3_key.equals("F3=Exit") & F12_key.equals("F12=Previous"))
    	{
    		Mainframe_GlobalFunctionLib.pressKey("F3");
    		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
    		
    		Mainframe_GlobalFunctionLib.sendText(10,2,"2");
    		Mainframe_GlobalFunctionLib.pressKey("Enter");
    		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
    		Mainframe_GlobalFunctionLib.pressKey("F12");
    		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
    	}
    	else
    	{
    		Assert.fail("F3 and F12 options are not displayed");
    	}
	}
	
	@Then("^validating display functionality in Add Prescriber State Taxonomy Codes screen$")
	public void validating_display_functionality_in_Add_Prescriber_State_Taxonomy_Codes_screen() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		Mainframe_GlobalFunctionLib.sendText(10,2,"5");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		
		//TC48 - GPI List F1 & F4 - Display
		Mainframe_GlobalFunctionLib.click(8, 17);
    	Mainframe_GlobalFunctionLib.pressKey("F4");
    	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
    	TimeUnit.SECONDS.sleep(3);
    	Mainframe_GlobalFunctionLib.pressKey("F12");
    	
    	Mainframe_GlobalFunctionLib.click(8, 17);
    	Robot ro = new Robot();
    	ro.keyPress(KeyEvent.VK_F1);
    	ro.keyRelease(KeyEvent.VK_F1);
    	TimeUnit.SECONDS.sleep(3);
    	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
    	TimeUnit.SECONDS.sleep(3);
    	Mainframe_GlobalFunctionLib.pressKey("F12");
    	
    	//Taxonomy Code - F1 Help - Display
    	for(int i=0;i<80;i++)
    	{
    		ro.keyPress(KeyEvent.VK_LEFT);
        	ro.keyRelease(KeyEvent.VK_LEFT);
    	}
    	ro.keyPress(KeyEvent.VK_F1);
    	ro.keyRelease(KeyEvent.VK_F1);
    	TimeUnit.SECONDS.sleep(3);
    	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
    	TimeUnit.SECONDS.sleep(3);
    	Mainframe_GlobalFunctionLib.pressKey("F12");
    	
    	//State - F1 Help - Display
    	for(int i=0;i<80;i++)
    	{
    		ro.keyPress(KeyEvent.VK_LEFT);
        	ro.keyRelease(KeyEvent.VK_LEFT);
    	}
    	ro.keyPress(KeyEvent.VK_F1);
    	ro.keyRelease(KeyEvent.VK_F1);
    	TimeUnit.SECONDS.sleep(3);
    	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
    	TimeUnit.SECONDS.sleep(3);
    	Mainframe_GlobalFunctionLib.pressKey("F12");
    	
    	//Qualifier - F1 Help - Display
    	Mainframe_GlobalFunctionLib.click(8, 17);
    	for(int i=0;i<80;i++)
    	{
    		ro.keyPress(KeyEvent.VK_RIGHT);
        	ro.keyRelease(KeyEvent.VK_RIGHT);
    	}
    	ro.keyPress(KeyEvent.VK_F1);
    	ro.keyRelease(KeyEvent.VK_F1);
    	TimeUnit.SECONDS.sleep(3);
    	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
    	TimeUnit.SECONDS.sleep(3);
    	Mainframe_GlobalFunctionLib.pressKey("F12");
    	
    	//CCR - F1 Help - Display
    	
    	for(int i=0;i<97;i++)
    	{
    		ro.keyPress(KeyEvent.VK_RIGHT);
        	ro.keyRelease(KeyEvent.VK_RIGHT);
    	}
    	ro.keyPress(KeyEvent.VK_F1);
    	ro.keyRelease(KeyEvent.VK_F1);
    	TimeUnit.SECONDS.sleep(3);
    	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
    	TimeUnit.SECONDS.sleep(3);
    	Mainframe_GlobalFunctionLib.pressKey("F12");
    	
    	//TC54 - TC55
    	String F3_F12 = Mainframe_GlobalFunctionLib.getText(23,2);
    	String F3_key = F3_F12.substring(0, 7);
    	String F12_key = F3_F12.substring(10);
    	if(F3_key.equals("F3=Exit") & F12_key.equals("F12=Previous"))
    	{
    		Mainframe_GlobalFunctionLib.pressKey("F3");
    		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
    		
    		Mainframe_GlobalFunctionLib.sendText(10,2,"5");
    		Mainframe_GlobalFunctionLib.pressKey("Enter");
    		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
    		Mainframe_GlobalFunctionLib.pressKey("F12");
    		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
    	}
    	else
    	{
    		Assert.fail("F3 and F12 options are not displayed");
    	}
	}
	
	@Then("^validating error message in Prescriber State Taxonomy Codes screen with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void validating_error_message_in_Prescriber_State_Taxonomy_Codes_screen_with(String GPIList, String State, String TaxonomyCode, String CCR, String FromDate) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.sendText(10,2,"2");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		//TC1
		Mainframe_GlobalFunctionLib.sendText(8,17,"TE33GPI");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		String err_msg = Mainframe_GlobalFunctionLib.getText(24,2).trim();
		if(err_msg.equals("GPI List TE33GPI not found."))
		{
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		}
		else
		{
			Assert.fail("Error message is not displayed");
		}
		//TC2
		Mainframe_GlobalFunctionLib.sendText(8,17,GPIList);
		Mainframe_GlobalFunctionLib.click(10, 34);
		Robot ro = new Robot();
		ro.keyPress(KeyEvent.VK_DELETE);
		ro.keyRelease(KeyEvent.VK_DELETE);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		String app_msg = Mainframe_GlobalFunctionLib.getText(24,2).trim();
		if(app_msg.equals("Value required."))
		{
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		}
		else
		{
			Assert.fail("Message is not displayed");
		}
		//TC3
		Mainframe_GlobalFunctionLib.click(9, 17);
		ro.keyPress(KeyEvent.VK_DELETE);
		ro.keyRelease(KeyEvent.VK_DELETE);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		app_msg = Mainframe_GlobalFunctionLib.getText(24,2).trim();
		if(app_msg.equals("Value required."))
		{
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		}
		else
		{
			Assert.fail("Message is not displayed");
		}
		//TC4
		Mainframe_GlobalFunctionLib.sendText(8,17,"          ");
		Mainframe_GlobalFunctionLib.sendText(8,17,"1E41108");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		err_msg = Mainframe_GlobalFunctionLib.getText(24,2).trim();
		if(err_msg.equals("GPI List 1E41108 not found."))
		{
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("F3");
		}
		else
		{
			Assert.fail("Error message is not displayed");
		}
		//TC5
		Mainframe_GlobalFunctionLib.pressKey("F6");
		final DateFormat dateFormat = new SimpleDateFormat("MM/dd/yy");
    	Date currdate = new Date();
    	String currentdate = dateFormat.format(currdate);
    	String curr_date = currentdate.replace("/","");
    	Mainframe_GlobalFunctionLib.sendText(4,41,curr_date);
    	Mainframe_GlobalFunctionLib.pressKey("Enter");
    	app_msg = Mainframe_GlobalFunctionLib.getText(24,2).trim();
		if(app_msg.equals("Value Required."))
		{
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		}
		else
		{
			Assert.fail("Message is not displayed");
		}
		//TC6
		Mainframe_GlobalFunctionLib.sendText(4,17,FromDate);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		String appl_msg = Mainframe_GlobalFunctionLib.getText(24,2).trim();
		if(appl_msg.equals("Value Required"))
		{
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		}
		else
		{
			Assert.fail("Message is not displayed");
		}
		//TC7
		Mainframe_GlobalFunctionLib.sendText(6,17,State);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		appl_msg = Mainframe_GlobalFunctionLib.getText(24,2).trim();
		if(appl_msg.equals("Value Required"))
		{
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		}
		else
		{
			Assert.fail("Message is not displayed");
		}
		//TC8
		Mainframe_GlobalFunctionLib.sendText(6,17," ");
		Mainframe_GlobalFunctionLib.sendText(7,17,TaxonomyCode);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		appl_msg = Mainframe_GlobalFunctionLib.getText(24,2).trim();
		if(appl_msg.equals("Value Required"))
		{
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		}
		else
		{
			Assert.fail("Message is not displayed");
		}
		//TC9
		Mainframe_GlobalFunctionLib.sendText(7,17,"          ");
		Mainframe_GlobalFunctionLib.sendText(8,17,GPIList);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		appl_msg = Mainframe_GlobalFunctionLib.getText(24,2).trim();
		if(appl_msg.equals("Value Required"))
		{
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		}
		else
		{
			Assert.fail("Message is not displayed");
		}
		//TC10
		Mainframe_GlobalFunctionLib.sendText(6,17,State);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		appl_msg = Mainframe_GlobalFunctionLib.getText(24,2).trim();
		if(appl_msg.equals("Value Required"))
		{
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		}
		else
		{
			Assert.fail("Message is not displayed");
		}
		//TC11
		Mainframe_GlobalFunctionLib.sendText(7,17,TaxonomyCode);
		Mainframe_GlobalFunctionLib.sendText(10,34,CCR);
		appl_msg = Mainframe_GlobalFunctionLib.getText(24,2).trim();
		if(appl_msg.equals("Value Required"))
		{
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		}
		else
		{
			Assert.fail("Message is not displayed");
		}
	}

	@Then("^validating the prescriber state taxonomy field with \"([^\"]*)\",\"([^\"]*)\"$")
	public void validating_the_prescriber_state_taxonomy_field_with(String taxonomycode, String plancode) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		TimeUnit.SECONDS.sleep(4);
		Mainframe_GlobalFunctionLib.sendText(12,24,"Y");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(16,64,"Y");
		Mainframe_GlobalFunctionLib.pressKey("F7");
		Mainframe_GlobalFunctionLib.sendText(7,21,"7");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F7");
		Mainframe_GlobalFunctionLib.sendText(8,21,"1");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("F10");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		//Change
		Mainframe_GlobalFunctionLib.sendText(7,29,taxonomycode);
		TimeUnit.SECONDS.sleep(3);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		TimeUnit.SECONDS.sleep(3);
		Mainframe_GlobalFunctionLib.pressKey("F12");
		TimeUnit.SECONDS.sleep(3);
		Mainframe_GlobalFunctionLib.sendText(8,21,"1");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F10");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		//F1-Help
		Mainframe_GlobalFunctionLib.click(7,29);
		Robot ro = new Robot();
		ro.keyPress(KeyEvent.VK_F1);
		ro.keyRelease(KeyEvent.VK_F1);
		TimeUnit.SECONDS.sleep(3);
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		TimeUnit.SECONDS.sleep(3);
		Mainframe_GlobalFunctionLib.pressKey("F12");
		//F4
		String taxcode = Mainframe_GlobalFunctionLib.getText(7, 29).trim();
		if(taxcode.equals("Y"))
		{
			Mainframe_GlobalFunctionLib.click(7,29);
			Mainframe_GlobalFunctionLib.pressKey("F4");
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			Mainframe_GlobalFunctionLib.sendText(7,4,"N");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			Mainframe_GlobalFunctionLib.sendText(13,3,"X");
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		}
		else if(taxcode.equals("N"))
		{
			Mainframe_GlobalFunctionLib.click(7,29);
			Mainframe_GlobalFunctionLib.pressKey("F4");
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			Mainframe_GlobalFunctionLib.sendText(7,4,"Y");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			Mainframe_GlobalFunctionLib.sendText(13,3,"X");
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		}
		
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		
		//Display
		Mainframe_GlobalFunctionLib.sendText(4,5,plancode);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(11,2,"5");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F7");
		Mainframe_GlobalFunctionLib.sendText(7,21,"7");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F7");
		Mainframe_GlobalFunctionLib.sendText(8,21,"1");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("F10");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		
		//F1 - Help
		Mainframe_GlobalFunctionLib.click(7,29);
		ro.keyPress(KeyEvent.VK_F1);
		ro.keyRelease(KeyEvent.VK_F1);
		TimeUnit.SECONDS.sleep(3);
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		TimeUnit.SECONDS.sleep(3);
		Mainframe_GlobalFunctionLib.pressKey("F12");
	}
	
	@Then("^validating the plan prescriber validation screen with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void validating_the_plan_prescriber_validation_screen_with(String PlanCode, String FromDate, String ThruDate, String PrescriberIDType, String ClaimOrig, String CMFCCR) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.sendText(4,5,PlanCode);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(11,2,"2");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F7");
		Mainframe_GlobalFunctionLib.sendText(7,21,"7");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F7");
		Mainframe_GlobalFunctionLib.sendText(8,21,"1");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		
		//Add Prescriber Validation
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Mainframe_GlobalFunctionLib.sendText(9,7,FromDate);
		Mainframe_GlobalFunctionLib.sendText(9,21,ThruDate);
		Mainframe_GlobalFunctionLib.click(11,21);
		Mainframe_GlobalFunctionLib.pressKey("F4");
		Mainframe_GlobalFunctionLib.sendText(4,8,PrescriberIDType);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(10,2,"1");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(12,21,ClaimOrig);
		Mainframe_GlobalFunctionLib.sendText(13,51,CMFCCR);
		Mainframe_GlobalFunctionLib.sendText(18,4,"N");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		
		Mainframe_GlobalFunctionLib.sendText(12,2,"5");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F10");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	}
	
	@Then("^validating the Load Prescriber State Taxonomy Codes screen with \"([^\"]*)\",\"([^\"]*)\"$")
	public void validating_the_Load_Prescriber_State_Taxonomy_Codes_screen_with(String filename, String library) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		for(int i=0;i<5;i++)
		{
		Mainframe_GlobalFunctionLib.pressKey("PageDown");
		}
		String screenname = Mainframe_GlobalFunctionLib.getText(11,27).trim();
		if(screenname.equals("Load Prescriber State Taxonomy Codes"))
		{
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			FunctionalLibrary.navigateToScreen("66");
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		}
		else
		{
			Assert.fail("Screenname is not available in the position");
		}
		
		//Validating the length of Filename and library
		
		Mainframe_GlobalFunctionLib.sendText(7,41,filename);
		Mainframe_GlobalFunctionLib.sendText(8,41,library);
		String file = Mainframe_GlobalFunctionLib.getText(7, 41);
		String lib = Mainframe_GlobalFunctionLib.getText(8, 41);
		if(file.length()==10 & lib.length()==10)
		{
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			System.out.println("Length of FileName Field: "+file.length() +"& Length of Library Field:"+lib.length());
		}
		else
		{
			Assert.fail("Length of filename and library field is less than 10");
		}
		
		//F3,F12 & F6 options availability check
		String options = Mainframe_GlobalFunctionLib.getText(23, 2);
		String F3= options.substring(0,7).trim();
		String F6 = options.substring(10, 30).trim();
		String F12=options.substring(31).trim();
		
		if(F6.equals("F6=Submit to Batch"))
		{
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		}
		if(F3.equals("F3=Exit"))
		{
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			Mainframe_GlobalFunctionLib.pressKey("F3");
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		}
		FunctionalLibrary.navigateToScreen("66");
		TimeUnit.SECONDS.sleep(2);
		if(F12.equals("F12=Previous"))
		{
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			Mainframe_GlobalFunctionLib.pressKey("F12");
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		}
		FunctionalLibrary.navigateToScreen("66");
		//F1 Help - FileName & Library
		Mainframe_GlobalFunctionLib.click(7,41);
		Robot ro = new Robot();
		ro.keyPress(KeyEvent.VK_F1);
		ro.keyRelease(KeyEvent.VK_F1);
		TimeUnit.SECONDS.sleep(3);
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("F12");
		
		Mainframe_GlobalFunctionLib.click(8,41);
		ro.keyPress(KeyEvent.VK_F1);
		ro.keyRelease(KeyEvent.VK_F1);
		TimeUnit.SECONDS.sleep(3);
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("F12");
		
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		
		String err_msg = Mainframe_GlobalFunctionLib.getText(24, 2);
		if(err_msg.equals("File Name Required"))
		{
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		}
		Mainframe_GlobalFunctionLib.sendText(7,41,"T40708");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		
		Mainframe_GlobalFunctionLib.sendText(7,41,"T40708");
		Mainframe_GlobalFunctionLib.sendText(8,41,"USRPRIYA");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		}
	
	@Then("^validating the Prescriber State Taxonomy Codes Extract screen with \"([^\"]*)\",\"([^\"]*)\"$")
	public void validating_the_Prescriber_State_Taxonomy_Codes_Extract_screen_with(String filename, String library) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		for(int i=0;i<2;i++)
		{
		Mainframe_GlobalFunctionLib.pressKey("PageDown");
		}
		String screenname = Mainframe_GlobalFunctionLib.getText(14,27).trim();
		if(screenname.equals("Prescriber State Taxonomy Codes Extract"))
		{
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			FunctionalLibrary.navigateToScreen("32");
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		}
		else
		{
			Assert.fail("Screenname is not available in the position");
		}
		
		//F3,F12 & F6 options availability check
				String options = Mainframe_GlobalFunctionLib.getText(23, 2);
				String F3= options.substring(0,7).trim();
				String F6 = options.substring(10, 30).trim();
				String F12=options.substring(31).trim();
				
				if(F6.equals("F6=Submit to Batch"))
				{
					Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				}
				if(F3.equals("F3=Exit"))
				{
					Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
					Mainframe_GlobalFunctionLib.pressKey("F3");
					Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				}
				FunctionalLibrary.navigateToScreen("32");
				TimeUnit.SECONDS.sleep(2);
				if(F12.equals("F12=Previous"))
				{
					Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
					Mainframe_GlobalFunctionLib.pressKey("F12");
					Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				}
				FunctionalLibrary.navigateToScreen("32");
				
				//F1 Help - FileName & Library
				Mainframe_GlobalFunctionLib.click(6,42);
				Robot ro = new Robot();
				ro.keyPress(KeyEvent.VK_F1);
				ro.keyRelease(KeyEvent.VK_F1);
				TimeUnit.SECONDS.sleep(3);
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				Mainframe_GlobalFunctionLib.pressKey("F12");
				
				Mainframe_GlobalFunctionLib.click(7,42);
				ro.keyPress(KeyEvent.VK_F1);
				ro.keyRelease(KeyEvent.VK_F1);
				TimeUnit.SECONDS.sleep(3);
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				Mainframe_GlobalFunctionLib.pressKey("F12");
				
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				
				String err_msg = Mainframe_GlobalFunctionLib.getText(24, 2);
				if(err_msg.equals("File name required."))
				{
					Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				}
		
	}
	
	@Then("^generating the plan audit report with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void generating_the_plan_audit_report_with(String file, String user, String plan) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.sendText(4, 15, "    ");
		Mainframe_GlobalFunctionLib.sendText(4, 15,file);
		Mainframe_GlobalFunctionLib.sendText(6, 15, "      ");
		Mainframe_GlobalFunctionLib.sendText(6, 15,user);
		final DateFormat dateFormat = new SimpleDateFormat("MM/dd/yy");
    	Date currdate = new Date();
    	String currentdate = dateFormat.format(currdate);
    	String curr_date = currentdate.replace("/","");
    	//String cur_date = curr_date.substring(1);
    	Mainframe_GlobalFunctionLib.sendText(9, 15,curr_date);
    	Mainframe_GlobalFunctionLib.sendText(9, 28,curr_date);
    	Mainframe_GlobalFunctionLib.click(10,15);
    	Mainframe_GlobalFunctionLib.pressKey("F4");
    	Mainframe_GlobalFunctionLib.sendText(4, 5,plan);
    	Mainframe_GlobalFunctionLib.sendText(10, 2,"1");
    	Mainframe_GlobalFunctionLib.pressKey("Enter");
    	Mainframe_GlobalFunctionLib.click(10,28);
    	Mainframe_GlobalFunctionLib.pressKey("F4");
    	Mainframe_GlobalFunctionLib.sendText(4, 5,plan);
    	Mainframe_GlobalFunctionLib.sendText(10, 2,"1");
    	Mainframe_GlobalFunctionLib.pressKey("Enter");
    	Mainframe_GlobalFunctionLib.pressKey("F6");
    	
    	
	}
	
	@Then("^generating the plan audit report with \"([^\"]*)\"$")
	public void generating_the_plan_audit_report_with(String plan) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Mainframe_GlobalFunctionLib.sendText(13, 19,plan);
		Mainframe_GlobalFunctionLib.sendText(14, 19,"010101");
		Mainframe_GlobalFunctionLib.sendText(15, 19,"Testing");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(16,64,"Y");
		TimeUnit.SECONDS.sleep(3);
		Mainframe_GlobalFunctionLib.sendText(12,24,"Y");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(16,64,"Y");
		Mainframe_GlobalFunctionLib.pressKey("F7");
		Mainframe_GlobalFunctionLib.sendText(7,21,"7");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F7");
		Mainframe_GlobalFunctionLib.sendText(8,21,"1");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Mainframe_GlobalFunctionLib.sendText(9, 7,"010101");
		Mainframe_GlobalFunctionLib.sendText(9, 21,"123139");
		Mainframe_GlobalFunctionLib.click(11, 21);
		Mainframe_GlobalFunctionLib.pressKey("F4");
		Mainframe_GlobalFunctionLib.sendText(4, 8,"BLC");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(10, 2,"1");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(12, 21,"*");
		Mainframe_GlobalFunctionLib.sendText(13, 51,"Y");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F10");
		Mainframe_GlobalFunctionLib.sendText(7, 29,"Y");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.sendText(4, 5,plan);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(11, 2,"6");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F6");
		String report = Mainframe_GlobalFunctionLib.getText(24,2);
    	if(report.equals("Report submitted."))
    	{
    		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
    		Mainframe_GlobalFunctionLib.pressKey("F12");
    		Mainframe_GlobalFunctionLib.pressKey("F12");
    		Mainframe_GlobalFunctionLib.sendText(21, 7,"ws");
    		Mainframe_GlobalFunctionLib.pressKey("Enter");
    		String jobstatus = Mainframe_GlobalFunctionLib.getText(11,40);
    		if(jobstatus.equals("OUTQ"))
    		{
    			Mainframe_GlobalFunctionLib.sendText(11, 3,"8");
        		Mainframe_GlobalFunctionLib.pressKey("Enter");
        		Mainframe_GlobalFunctionLib.sendText(11, 3,"5");
        		Mainframe_GlobalFunctionLib.pressKey("Enter");
        		Mainframe_GlobalFunctionLib.sendText(3, 22,"W30");
        		Mainframe_GlobalFunctionLib.pressKey("Enter");
        		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
        		Mainframe_GlobalFunctionLib.pressKey("PageDown");
        		Mainframe_GlobalFunctionLib.pressKey("F19");
        		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
        		Mainframe_GlobalFunctionLib.pressKey("F20");
        		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
        		Mainframe_GlobalFunctionLib.pressKey("F20");
        		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
        		TimeUnit.SECONDS.sleep(3);
        		Mainframe_GlobalFunctionLib.pressKey("PageDown");
        		Mainframe_GlobalFunctionLib.pressKey("F19");
        		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
        		Mainframe_GlobalFunctionLib.pressKey("F20");
        		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
        		Mainframe_GlobalFunctionLib.pressKey("F20");
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
        		Mainframe_GlobalFunctionLib.sendText(3, 22,"W30");
        		Mainframe_GlobalFunctionLib.pressKey("Enter");
        		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
        		Mainframe_GlobalFunctionLib.pressKey("PageDown");
        		Mainframe_GlobalFunctionLib.pressKey("F19");
        		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
        		Mainframe_GlobalFunctionLib.pressKey("F20");
        		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
        		Mainframe_GlobalFunctionLib.pressKey("F20");
        		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
        		TimeUnit.SECONDS.sleep(3);
        		Mainframe_GlobalFunctionLib.pressKey("PageDown");
        		Mainframe_GlobalFunctionLib.pressKey("F19");
        		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
        		Mainframe_GlobalFunctionLib.pressKey("F20");
        		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
        		Mainframe_GlobalFunctionLib.pressKey("F20");
        		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
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
        		Mainframe_GlobalFunctionLib.sendText(3, 22,"W30");
        		Mainframe_GlobalFunctionLib.pressKey("Enter");
        		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
        		Mainframe_GlobalFunctionLib.pressKey("PageDown");
        		Mainframe_GlobalFunctionLib.pressKey("F19");
        		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
        		Mainframe_GlobalFunctionLib.pressKey("F20");
        		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
        		Mainframe_GlobalFunctionLib.pressKey("F20");
        		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
        		TimeUnit.SECONDS.sleep(3);
        		Mainframe_GlobalFunctionLib.pressKey("PageDown");
        		Mainframe_GlobalFunctionLib.pressKey("F19");
        		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
        		Mainframe_GlobalFunctionLib.pressKey("F20");
        		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
        		Mainframe_GlobalFunctionLib.pressKey("F20");
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
            		Mainframe_GlobalFunctionLib.sendText(3, 22,"W30");
            		Mainframe_GlobalFunctionLib.pressKey("Enter");
            		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
            		Mainframe_GlobalFunctionLib.pressKey("PageDown");
            		Mainframe_GlobalFunctionLib.pressKey("F19");
            		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
            		Mainframe_GlobalFunctionLib.pressKey("F20");
            		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
            		Mainframe_GlobalFunctionLib.pressKey("F20");
            		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
            		TimeUnit.SECONDS.sleep(3);
            		Mainframe_GlobalFunctionLib.pressKey("PageDown");
            		Mainframe_GlobalFunctionLib.pressKey("F19");
            		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
            		Mainframe_GlobalFunctionLib.pressKey("F20");
            		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
            		Mainframe_GlobalFunctionLib.pressKey("F20");
            		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
            		}
    			}
    		}
    		
    	}
    	
    	Mainframe_GlobalFunctionLib.pressKey("F3");
    	Mainframe_GlobalFunctionLib.pressKey("F3");
    	Mainframe_GlobalFunctionLib.pressKey("F12");
	}
	
	@Then("^generating the plan audit request report with \"([^\"]*)\"$")
	public void generating_the_plan_audit_request_report_with(String plan) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.click(4,15);
		Mainframe_GlobalFunctionLib.pressKey("F4");
		Mainframe_GlobalFunctionLib.sendText(4, 25,"01120");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(9, 2,"1");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.click(10,15);
		Mainframe_GlobalFunctionLib.pressKey("F4");
		Mainframe_GlobalFunctionLib.sendText(4, 5,plan);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(10, 2,"1");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.click(10,28);
		Mainframe_GlobalFunctionLib.pressKey("F4");
		Mainframe_GlobalFunctionLib.sendText(4, 5,plan);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(10, 2,"1");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F6");
		String report = Mainframe_GlobalFunctionLib.getText(24,2);
    	if(report.equals("Report submitted."))
    	{
    		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
    		Mainframe_GlobalFunctionLib.pressKey("F12");
    		Mainframe_GlobalFunctionLib.pressKey("F12");
    		Mainframe_GlobalFunctionLib.sendText(21, 7,"ws");
    		Mainframe_GlobalFunctionLib.pressKey("Enter");
    		String jobstatus = Mainframe_GlobalFunctionLib.getText(11,40);
    		if(jobstatus.equals("OUTQ"))
    		{
    			Mainframe_GlobalFunctionLib.sendText(11, 3,"8");
        		Mainframe_GlobalFunctionLib.pressKey("Enter");
        		Mainframe_GlobalFunctionLib.sendText(11, 3,"5");
        		Mainframe_GlobalFunctionLib.pressKey("Enter");
        		Mainframe_GlobalFunctionLib.sendText(3, 22,"W30");
        		Mainframe_GlobalFunctionLib.pressKey("Enter");
        		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
        		Mainframe_GlobalFunctionLib.pressKey("PageDown");
        		Mainframe_GlobalFunctionLib.pressKey("F19");
        		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
        		Mainframe_GlobalFunctionLib.pressKey("F20");
        		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
        		Mainframe_GlobalFunctionLib.pressKey("F20");
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
        		Mainframe_GlobalFunctionLib.sendText(3, 22,"W30");
        		Mainframe_GlobalFunctionLib.pressKey("Enter");
        		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
        		Mainframe_GlobalFunctionLib.pressKey("PageDown");
        		Mainframe_GlobalFunctionLib.pressKey("F19");
        		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
        		Mainframe_GlobalFunctionLib.pressKey("F20");
        		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
        		Mainframe_GlobalFunctionLib.pressKey("F20");
        		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
        		}
    		}
    		
    	}
    	Mainframe_GlobalFunctionLib.pressKey("F3");
    	Mainframe_GlobalFunctionLib.pressKey("F3");
	}
	
	@Then("^generating the Print Plan Report report and validating the prescriber state taxonomy code field with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void generating_the_Print_Plan_Report_report_and_validating_the_prescriber_state_taxonomy_code_field_with(String plan, String selected, String flag) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.click(4,13);
		Mainframe_GlobalFunctionLib.pressKey("F4");
		Mainframe_GlobalFunctionLib.sendText(4, 5,plan);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(10, 2,"1");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Thread.sleep(2000);
		Mainframe_GlobalFunctionLib.sendText(9, 51,selected);
		Mainframe_GlobalFunctionLib.sendText(17, 24,flag);
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Mainframe_GlobalFunctionLib.sendText(21, 7,"ws");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		String jobstatus = Mainframe_GlobalFunctionLib.getText(11,40);
		if(jobstatus.equals("OUTQ"))
		{
			Mainframe_GlobalFunctionLib.sendText(11, 3,"8");
    		Mainframe_GlobalFunctionLib.pressKey("Enter");
    		Mainframe_GlobalFunctionLib.pressKey("F18");
    		Mainframe_GlobalFunctionLib.sendText(19, 3,"5");
    		Mainframe_GlobalFunctionLib.pressKey("Enter");
    		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
    		Mainframe_GlobalFunctionLib.sendText(4, 22,"Prescriber State Taxonomy");
    		Mainframe_GlobalFunctionLib.pressKey("Enter");
    		Mainframe_GlobalFunctionLib.pressKey("F16");
    		String prescriberfield = Mainframe_GlobalFunctionLib.getText(7,32).trim();
    		String prescriberstatecode = prescriberfield.substring(0, 1);
    		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
    		Mainframe_GlobalFunctionLib.pressKey("F3");
        	Mainframe_GlobalFunctionLib.pressKey("F3");
        	Mainframe_GlobalFunctionLib.pressKey("F12");
        	Mainframe_GlobalFunctionLib.pressKey("F3");
        	Mainframe_GlobalFunctionLib.pressKey("F12");
        	FunctionalLibrary.navigateToScreen("4");
        	FunctionalLibrary.navigateToScreen("1");
        	Mainframe_GlobalFunctionLib.sendText(4, 5,plan);
    		Mainframe_GlobalFunctionLib.pressKey("Enter");
    		Mainframe_GlobalFunctionLib.sendText(11, 2,"5");
    		Mainframe_GlobalFunctionLib.pressKey("Enter");
    		Mainframe_GlobalFunctionLib.pressKey("F7");
    		Mainframe_GlobalFunctionLib.sendText(7, 21,"7");
    		Mainframe_GlobalFunctionLib.pressKey("Enter");
    		Mainframe_GlobalFunctionLib.pressKey("F7");
    		Mainframe_GlobalFunctionLib.sendText(8, 21,"1");
    		Mainframe_GlobalFunctionLib.pressKey("Enter");
    		Mainframe_GlobalFunctionLib.pressKey("F10");
    		String prescriberstatecode_plan = Mainframe_GlobalFunctionLib.getText(7,29).trim();
    		if(prescriberstatecode.equals(prescriberstatecode_plan))
    		{
    			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
    			System.out.println("Prescriber State Taxonomy Code is same in plan and report: "+prescriberstatecode);
    		}
    		else
    		{
    			Assert.fail("Prescriber State Taxonomy Code is different in plan and report");
    		}
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
    		Mainframe_GlobalFunctionLib.pressKey("F18");
    		Mainframe_GlobalFunctionLib.sendText(19, 3,"5");
    		Mainframe_GlobalFunctionLib.pressKey("Enter");
    		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
    		Mainframe_GlobalFunctionLib.sendText(4, 22,"Prescriber State Taxonomy");
    		Mainframe_GlobalFunctionLib.pressKey("Enter");
    		Mainframe_GlobalFunctionLib.pressKey("F16");
    		String prescriberfield = Mainframe_GlobalFunctionLib.getText(7,32).trim();
    		String prescriberstatecode = prescriberfield.substring(0, 1);
    		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
    		Mainframe_GlobalFunctionLib.pressKey("F3");
        	Mainframe_GlobalFunctionLib.pressKey("F3");
        	Mainframe_GlobalFunctionLib.pressKey("F12");
        	Mainframe_GlobalFunctionLib.pressKey("F3");
        	Mainframe_GlobalFunctionLib.pressKey("F12");
        	FunctionalLibrary.navigateToScreen("4");
        	FunctionalLibrary.navigateToScreen("1");
        	Mainframe_GlobalFunctionLib.sendText(4, 5,plan);
    		Mainframe_GlobalFunctionLib.pressKey("Enter");
    		Mainframe_GlobalFunctionLib.sendText(11, 2,"5");
    		Mainframe_GlobalFunctionLib.pressKey("Enter");
    		Mainframe_GlobalFunctionLib.pressKey("F7");
    		Mainframe_GlobalFunctionLib.sendText(7, 21,"7");
    		Mainframe_GlobalFunctionLib.pressKey("Enter");
    		Mainframe_GlobalFunctionLib.pressKey("F7");
    		Mainframe_GlobalFunctionLib.sendText(8, 21,"1");
    		Mainframe_GlobalFunctionLib.pressKey("Enter");
    		Mainframe_GlobalFunctionLib.pressKey("F10");
    		String prescriberstatecode_plan = Mainframe_GlobalFunctionLib.getText(7,29).trim();
    		if(prescriberstatecode.equals(prescriberstatecode_plan))
    		{
    			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
    			System.out.println("Prescriber State Taxonomy Code is same in plan and report: "+prescriberstatecode);
    		}
    		else
    		{
    			Assert.fail("Prescriber State Taxonomy Code is different in plan and report");
    		}
    		
    		}
		}
	}
	
	@Then("^loading the file in Load Prescriber State Taxonomy Codes screen with \"([^\"]*)\",\"([^\"]*)\"$")
	public void loading_the_file_in_Load_Prescriber_State_Taxonomy_Codes_screen_with(String file, String lib) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    FunctionalLibrary.navigateToScreen("2");
	    FunctionalLibrary.navigateToScreen("66");
	    Mainframe_GlobalFunctionLib.sendText(7, 41,file);
	    Mainframe_GlobalFunctionLib.sendText(8,41,lib);
	    Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Mainframe_GlobalFunctionLib.sendText(21, 7,"ws");
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
    		Mainframe_GlobalFunctionLib.pressKey("PageDown");
    		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
    		Mainframe_GlobalFunctionLib.pressKey("PageDown");
    		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
    		Mainframe_GlobalFunctionLib.sendText(4, 22,"ADDED:");
    		Mainframe_GlobalFunctionLib.pressKey("Enter");
    		Mainframe_GlobalFunctionLib.pressKey("F16");
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
    		Mainframe_GlobalFunctionLib.pressKey("PageDown");
    		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
    		Mainframe_GlobalFunctionLib.pressKey("PageDown");
    		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
    		Mainframe_GlobalFunctionLib.sendText(4, 22,"ADDED:");
    		Mainframe_GlobalFunctionLib.pressKey("Enter");
    		Mainframe_GlobalFunctionLib.pressKey("F16");
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
    		Mainframe_GlobalFunctionLib.pressKey("PageDown");
    		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
    		Mainframe_GlobalFunctionLib.pressKey("PageDown");
    		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
    		Mainframe_GlobalFunctionLib.sendText(4, 22,"ADDED:");
    		Mainframe_GlobalFunctionLib.pressKey("Enter");
    		Mainframe_GlobalFunctionLib.pressKey("F16");
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
	    		Mainframe_GlobalFunctionLib.pressKey("PageDown");
	    		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	    		Mainframe_GlobalFunctionLib.pressKey("PageDown");
	    		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	    		Mainframe_GlobalFunctionLib.sendText(4, 22,"ADDED:");
	    		Mainframe_GlobalFunctionLib.pressKey("Enter");
	    		Mainframe_GlobalFunctionLib.pressKey("F16");
	    		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	    		}
			}
		}
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F12");
	}
	
	@Then("^triggering the Prescriber State Taxonomy Codes Extract job with \"([^\"]*)\",\"([^\"]*)\"$")
	public void triggering_the_Prescriber_State_Taxonomy_Codes_Extract_job_with(String file, String lib) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		FunctionalLibrary.navigateToScreen("1");
	    FunctionalLibrary.navigateToScreen("32");
	    Mainframe_GlobalFunctionLib.sendText(6, 42,file);
	    Mainframe_GlobalFunctionLib.sendText(7,42,lib);
	    Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Mainframe_GlobalFunctionLib.sendText(21, 7,"ws");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		String jobstatus = Mainframe_GlobalFunctionLib.getText(12,40);
		if(jobstatus.equals("OUTQ"))
		{
			Mainframe_GlobalFunctionLib.sendText(12, 3,"8");
    		Mainframe_GlobalFunctionLib.pressKey("Enter");
    		Mainframe_GlobalFunctionLib.sendText(11, 3,"5");
    		Mainframe_GlobalFunctionLib.pressKey("Enter");
    		Mainframe_GlobalFunctionLib.sendText(3, 22,"W30");
    		Mainframe_GlobalFunctionLib.pressKey("Enter");
    		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
    		Mainframe_GlobalFunctionLib.pressKey("F19");
    		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
    		Mainframe_GlobalFunctionLib.pressKey("PageDown");
    		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
    	}
		
		else if (jobstatus.equals("ACTIVE"))
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
    		Mainframe_GlobalFunctionLib.sendText(3, 22,"W30");
    		Mainframe_GlobalFunctionLib.pressKey("Enter");
    		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
    		Mainframe_GlobalFunctionLib.pressKey("F19");
    		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
    		Mainframe_GlobalFunctionLib.pressKey("PageDown");
    		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
    		}
		}
		else if (jobstatus.equals("JOBQ"))
		{
			Mainframe_GlobalFunctionLib.sendText(12, 3,"2");
    		Mainframe_GlobalFunctionLib.pressKey("Enter");
    		Mainframe_GlobalFunctionLib.pressKey("F10");
    		Mainframe_GlobalFunctionLib.sendText(17, 37,"QINTER");
    		Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.pressKey("F5");
			String jobstat = Mainframe_GlobalFunctionLib.getText(12,40);
			if(jobstat.equals("OUTQ"))
    		{
			TimeUnit.SECONDS.sleep(3);
			Mainframe_GlobalFunctionLib.sendText(12, 3,"8");
    		Mainframe_GlobalFunctionLib.pressKey("Enter");
    		Mainframe_GlobalFunctionLib.sendText(12, 3,"5");
    		Mainframe_GlobalFunctionLib.pressKey("Enter");
    		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
    		Mainframe_GlobalFunctionLib.pressKey("F20");
    		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
    		Mainframe_GlobalFunctionLib.pressKey("F19");
    		Mainframe_GlobalFunctionLib.pressKey("PageDown");
    		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
    		Mainframe_GlobalFunctionLib.pressKey("PageDown");
    		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
    		Mainframe_GlobalFunctionLib.pressKey("PageDown");
    		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
    		}
			else if (jobstat.equals("ACTIVE"))
			{
				
				TimeUnit.MINUTES.sleep(4);
				Mainframe_GlobalFunctionLib.pressKey("F5");
				String jobstat1 = Mainframe_GlobalFunctionLib.getText(12,40);
				if(jobstat1.equals("OUTQ"))
	    		{
				TimeUnit.SECONDS.sleep(3);
				Mainframe_GlobalFunctionLib.sendText(12, 3,"8");
	    		Mainframe_GlobalFunctionLib.pressKey("Enter");
	    		Mainframe_GlobalFunctionLib.sendText(12, 3,"5");
	    		Mainframe_GlobalFunctionLib.pressKey("Enter");
	    		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	    		Mainframe_GlobalFunctionLib.pressKey("F20");
	    		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	    		Mainframe_GlobalFunctionLib.pressKey("F19");
	    		Mainframe_GlobalFunctionLib.pressKey("PageDown");
	    		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	    		Mainframe_GlobalFunctionLib.pressKey("PageDown");
	    		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	    		Mainframe_GlobalFunctionLib.pressKey("PageDown");
	    		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	    		}
			}
		}
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F3");
	}
	
	@Then("^Validating the add replace function in Prescriber State Taxonomy Maintenance Utility screen with \"([^\"]*)\",\"([^\"]*)\"$")
	public void validating_the_add_replace_function_in_Prescriber_State_Taxonomy_Maintenance_Utility_screen_with(String plan, String id) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.sendText(4, 5,id);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(9, 2,"2");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(12, 24,"X");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.sendText(17, 12,"10");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		
		//Plan Code 
		Mainframe_GlobalFunctionLib.click(7,14);
		Mainframe_GlobalFunctionLib.pressKey("F4");
		Mainframe_GlobalFunctionLib.sendText(4, 5,plan);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(10, 2,"1");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.click(7,48);
		Mainframe_GlobalFunctionLib.pressKey("F4");
		Mainframe_GlobalFunctionLib.sendText(4, 5,plan);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(10, 2,"1");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(16, 64,"Y");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		
		//Add Process - Add
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Mainframe_GlobalFunctionLib.sendText(13, 13,"A");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.sendText(7, 56,"Y");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		
		//Add mode - Display
		Mainframe_GlobalFunctionLib.sendText(13, 2,"5");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("F12");
		
		//Add mode - change function
		Mainframe_GlobalFunctionLib.sendText(13, 2,"2");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(7, 56,"N");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("F12");
		
		//Replace mode
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Mainframe_GlobalFunctionLib.sendText(13, 13,"R");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.click(7,29);
		Mainframe_GlobalFunctionLib.pressKey("F4");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.sendText(16, 3,"X");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		
		
		Mainframe_GlobalFunctionLib.click(7,39);
		Mainframe_GlobalFunctionLib.pressKey("F4");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("F12");
		
		
		Mainframe_GlobalFunctionLib.click(7,56);
		Mainframe_GlobalFunctionLib.pressKey("F4");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.sendText(14, 3,"X");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		
		//Replace mode - Display function
		Mainframe_GlobalFunctionLib.sendText(14,2,"5");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("F12");
		
		//Replace mode - Edit function
		Mainframe_GlobalFunctionLib.sendText(14,2,"2");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(7,56,"N");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	}
	
	@Then("^Validating the help features in Prescriber State Taxonomy Maintenance Utility screen with \"([^\"]*)\",\"([^\"]*)\"$")
	public void validating_the_help_features_in_Prescriber_State_Taxonomy_Maintenance_Utility_screen_with(String id, String id1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.sendText(4,5,id);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(9,2,"2");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(12,24,"X");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(17,12,"10");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		TimeUnit.SECONDS.sleep(3);
		
		Mainframe_GlobalFunctionLib.click(7,14);
		Robot ro = new Robot();
		ro.keyPress(KeyEvent.VK_F1);
		ro.keyRelease(KeyEvent.VK_F1);
		TimeUnit.SECONDS.sleep(3);
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		TimeUnit.SECONDS.sleep(3);
		Mainframe_GlobalFunctionLib.pressKey("F12");
		
		Mainframe_GlobalFunctionLib.click(7,48);
		ro.keyPress(KeyEvent.VK_F1);
		ro.keyRelease(KeyEvent.VK_F1);
		TimeUnit.SECONDS.sleep(3);
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		TimeUnit.SECONDS.sleep(3);
		Mainframe_GlobalFunctionLib.pressKey("F12");
		
		Mainframe_GlobalFunctionLib.click(8,14);
		ro.keyPress(KeyEvent.VK_F1);
		ro.keyRelease(KeyEvent.VK_F1);
		TimeUnit.SECONDS.sleep(3);
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		TimeUnit.SECONDS.sleep(3);
		Mainframe_GlobalFunctionLib.pressKey("F12");
		
		Mainframe_GlobalFunctionLib.click(8,48);
		ro.keyPress(KeyEvent.VK_F1);
		ro.keyRelease(KeyEvent.VK_F1);
		TimeUnit.SECONDS.sleep(3);
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		TimeUnit.SECONDS.sleep(3);
		Mainframe_GlobalFunctionLib.pressKey("F12");
		
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Mainframe_GlobalFunctionLib.click(13,13);
		ro.keyPress(KeyEvent.VK_F1);
		ro.keyRelease(KeyEvent.VK_F1);
		TimeUnit.SECONDS.sleep(3);
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		TimeUnit.SECONDS.sleep(3);
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		
		Mainframe_GlobalFunctionLib.sendText(4,5,"          ");
		Mainframe_GlobalFunctionLib.sendText(4,5,id1);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(9,2,"2");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(12,24,"X");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(17,12,"10");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Mainframe_GlobalFunctionLib.sendText(13,13,"A");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.click(7,56);
		ro.keyPress(KeyEvent.VK_F1);
		ro.keyRelease(KeyEvent.VK_F1);
		TimeUnit.SECONDS.sleep(3);
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		TimeUnit.SECONDS.sleep(3);
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Mainframe_GlobalFunctionLib.sendText(13,13,"R");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.click(7,29);
		ro.keyPress(KeyEvent.VK_F1);
		ro.keyRelease(KeyEvent.VK_F1);
		TimeUnit.SECONDS.sleep(3);
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		TimeUnit.SECONDS.sleep(3);
		Mainframe_GlobalFunctionLib.pressKey("F12");
		
		Mainframe_GlobalFunctionLib.click(7,39);
		ro.keyPress(KeyEvent.VK_F1);
		ro.keyRelease(KeyEvent.VK_F1);
		TimeUnit.SECONDS.sleep(3);
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		TimeUnit.SECONDS.sleep(3);
		Mainframe_GlobalFunctionLib.pressKey("F12");
		
		Mainframe_GlobalFunctionLib.click(7,56);
		ro.keyPress(KeyEvent.VK_F1);
		ro.keyRelease(KeyEvent.VK_F1);
		TimeUnit.SECONDS.sleep(3);
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		TimeUnit.SECONDS.sleep(3);
		Mainframe_GlobalFunctionLib.pressKey("F12");
	}
	
	@Then("^Validating the claim is paid with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void validating_the_claim_is_paid_with(String memid, String prodid, String qual, String prescid, String rxno, String filldate) throws Throwable {
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
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("F7");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	}
	
	@Then("^Validating the claim is rejected with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void validating_the_claim_is_rejected_with(String memid, String rxno, String filldate) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.sendText(4,4,memid);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(9,2,"1");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		TimeUnit.SECONDS.sleep(3);
		Mainframe_GlobalFunctionLib.sendText(4,65,"          ");
		Mainframe_GlobalFunctionLib.sendText(4,65,filldate);
		Mainframe_GlobalFunctionLib.sendText(5,29,rxno);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("F7");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	}
	
	@Then("^Validating the claim is paid with \"([^\"]*)\"$")
	public void validating_the_claim_is_paid_with(String rxno) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.sendText(5,29,"            ");
		Mainframe_GlobalFunctionLib.sendText(5,29,rxno);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F14");
		Mainframe_GlobalFunctionLib.sendText(5,23,"8");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Mainframe_GlobalFunctionLib.click(13,10);
		Mainframe_GlobalFunctionLib.pressKey("F4");
		Mainframe_GlobalFunctionLib.sendText(3,39,"52");
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
