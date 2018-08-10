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

public class SR41404 {
	

	
	@Then("^Validate the new menu Eligibility Load Tracking Extract in RxClaim Utility Programs$")
	public void validate_the_new_menu_Eligibility_Load_Tracking_Extract_in_RxClaim_Utility_Programs() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		Mainframe_GlobalFunctionLib.validateText("15", "27", "Eligibility Load Tracking Extract");
	}

	@Given("^I am on RxClaim Utility Programs$")
	public void i_am_on_RxClaim_Utility_Programs() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		Mainframe_GlobalFunctionLib.validateText("1", "13", "RxClaim Utility Programs");
		
	}
	
	@Then("^Validate the Eligibility Load Tracking Extract screen$")
	public void validate_the_Eligibility_Load_Tracking_Extract_screen() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		Mainframe_GlobalFunctionLib.validateText("2", "25", "Eligibility Load Tracking Extract");
		
	}
	
	@Given("^I am on Eligibility Load Tracking Extract screen$")
	public void i_am_on_Eligibility_Load_Tracking_Extract_screen() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.validateText("2", "25", "Eligibility Load Tracking Extract");
	}

	@When("^I select help Option \"([^\"]*)\" on the field From Date$")
	public void i_select_help_Option_on_the_field_From_Date(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		Mainframe_GlobalFunctionLib.sendText("5","21", "1111111111");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());

		String Fromdate = Mainframe_GlobalFunctionLib.getText(5, 21);
		int lenFromDate = Fromdate.length();
		if(lenFromDate==8)
		{
			System.out.println("Length of the Field From Date : "+lenFromDate);
		}
		
		else{
			System.out.println("Length of the Field From Date is NOT: "+lenFromDate);
			
		}
		
		Mainframe_GlobalFunctionLib.click(5, 21 );
		Thread.sleep(3000);
		//Mainframe_GlobalFunctionLib.pressKey("F2");
		Robot r=new Robot();
		if(arg1.equals("F1")){
		r.keyPress(KeyEvent.VK_F1);
		r.keyRelease(KeyEvent.VK_F1);
		Thread.sleep(3000);
		}
		
	}

	@Then("^Validate the help message for the field From Date$")
	public void validate_the_help_message_for_the_field_From_Date() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
	   
		Mainframe_GlobalFunctionLib.validateText("11", "19", "The From date in the Date range for the extract.");
		String Fromdatehelp = Mainframe_GlobalFunctionLib.getText(11, 19);
		System.out.println("From Date help text: "+Fromdatehelp);
		Mainframe_GlobalFunctionLib.pressKey("F12");
		
	}
	
	@When("^I select help Option \"([^\"]*)\" on the field Thru Date$")
	public void i_select_help_Option_on_the_field_Thru_Date(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions

		Mainframe_GlobalFunctionLib.sendText("5","39", "        ");
		Mainframe_GlobalFunctionLib.sendText("5","39", "1111111111");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());

		String Thrudate = Mainframe_GlobalFunctionLib.getText(5, 39);
		int lenThruDate = Thrudate.length();
		if(lenThruDate==8)
		{
			System.out.println("Length of the Field From Date : "+lenThruDate);
		}
		
		else{
			System.out.println("Length of the Field From Date is NOT: "+lenThruDate);
			
		}
		
		Mainframe_GlobalFunctionLib.click(5, 39 );
		Thread.sleep(3000);
		//System.out.println("Code crossed click");
		//Mainframe_GlobalFunctionLib.pressKey("Enter");
		//Mainframe_GlobalFunctionLib.pressKey("F2");
		Robot r=new Robot();
		if(arg1.equals("F1")){
		r.keyPress(KeyEvent.VK_F1);
		r.keyRelease(KeyEvent.VK_F1);
		Thread.sleep(3000);
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		}
		
	
	}

	@Then("^Validate the help message for the field Thru Date$")
	public void validate_the_help_message_for_the_field_Thru_Date() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String Thrudatehelp = Mainframe_GlobalFunctionLib.getText(11, 19);
		Mainframe_GlobalFunctionLib.validateText("11", "19", "The Thru date in the Date range for the extract.");
		System.out.println("Thru Date help text: "+Thrudatehelp);
		Mainframe_GlobalFunctionLib.pressKey("F12");
	}
	
	@When("^I navigate to the field Carrier From$")
	public void i_navigate_to_the_field_Carrier_From() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.click(6, 21 );
		Mainframe_GlobalFunctionLib.sendText("6","21", "         ");
		
	}

	@Then("^Validate the help message and length of the field Carrier From$")
	public void validate_the_help_message_and_length_of_the_field_Carrier_From() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		Mainframe_GlobalFunctionLib.click(6, 21 );
		Thread.sleep(3000);

		Robot r=new Robot();
		
		r.keyPress(KeyEvent.VK_F1);
		r.keyRelease(KeyEvent.VK_F1);
		Thread.sleep(3000);
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		String CarrierHelp1 = Mainframe_GlobalFunctionLib.getText(12, 19);
		String CarrierHelp2 = Mainframe_GlobalFunctionLib.getText(13, 19);
		String ActCarrierHelptext=CarrierHelp1+" "+CarrierHelp2;
		System.out.println(ActCarrierHelptext);
		String ExpCarrierHelptext=("Type the nine character identifier of the owner of the accounts, groups, and members.");
		if(ExpCarrierHelptext.equals(ActCarrierHelptext.trim()))
		{	
			System.out.println("Text matching");
				
		}
		else
		{   
			System.out.println("Text is not same");
			Assert.fail("The text "+ ExpCarrierHelptext +" does not match on the screen.Screenshot captured.");			
				
		}
		
		System.out.println("Carrier From help text: "+ActCarrierHelptext);
		Mainframe_GlobalFunctionLib.pressKey("F12");
	    
		
		Mainframe_GlobalFunctionLib.sendText("6","21", "ABCDEFGHIJK");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());

		String CarrierFrom = Mainframe_GlobalFunctionLib.getText(6, 21);
		int lenCarrierFrom = CarrierFrom.length();
		if(lenCarrierFrom==9)
		{
			System.out.println("Length of the Field Carrier From : "+lenCarrierFrom);
		}
		
		else{
			System.out.println("Length of the Field Carrier From is NOT: "+lenCarrierFrom);
			
		}

	  }
	
	@When("^I navigate to the field Carrier Thru$")
	public void i_navigate_to_the_field_Carrier_Thru() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.click(6, 39 );
		Mainframe_GlobalFunctionLib.sendText("6","39", "         ");
	}

	@Then("^Validate the help message and length of the field Carrier Thru$")
	public void validate_the_help_message_and_length_of_the_field_Carrier_Thru() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
		Mainframe_GlobalFunctionLib.click(6, 39 );
		Thread.sleep(3000);

		Robot r=new Robot();
		
		r.keyPress(KeyEvent.VK_F1);
		r.keyRelease(KeyEvent.VK_F1);
		Thread.sleep(3000);
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		String CarrierHelp1 = Mainframe_GlobalFunctionLib.getText(12, 19);
		String CarrierHelp2 = Mainframe_GlobalFunctionLib.getText(13, 19);
		String CarrierHelp3 = Mainframe_GlobalFunctionLib.getText(14, 19);
		
		String ActCarrierHelptext2=CarrierHelp1+" "+CarrierHelp2+" "+CarrierHelp3;
		System.out.println(ActCarrierHelptext2);
		String ExpCarrierHelptext=("The From and Thru Carrier fields are used to select records within the range specified based on the Carrier ID.");
		if(ExpCarrierHelptext.equals(ActCarrierHelptext2.trim()))
		{	
			System.out.println("Text matching");
				
		}
		else
		{   
			System.out.println("Text is not same");
			Assert.fail("The text "+ ExpCarrierHelptext +" does not match on the screen.Screenshot captured.");			
				
		}
		
		System.out.println("Carrier From help text: "+ActCarrierHelptext2);
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.sendText("6","39", "ABCDEFGHIJK");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());

		String CarrierThru = Mainframe_GlobalFunctionLib.getText(6, 39);
		int lenCarrierThru = CarrierThru.length();
		if(lenCarrierThru==9)
		{
			System.out.println("Length of the Field Carrier Thru : "+lenCarrierThru);
		}
		
		else{
			System.out.println("Length of the Field Carrier Thru is NOT: "+lenCarrierThru);
			
		}
	}
	
	@When("^I navigate to the field Carrier List$")
	public void i_navigate_to_the_field_Carrier_List() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.click(6, 57 );
		Mainframe_GlobalFunctionLib.sendText("6","57", "          ");
	}

	@Then("^Validate the help message and length of the field Carrier List$")
	public void validate_the_help_message_and_length_of_the_field_Carrier_List() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		Mainframe_GlobalFunctionLib.click(6, 57 );
		Thread.sleep(3000);

		Robot r=new Robot();
		
		r.keyPress(KeyEvent.VK_F1);
		r.keyRelease(KeyEvent.VK_F1);
		Thread.sleep(3000);
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		String CarrierList1 = Mainframe_GlobalFunctionLib.getText(12, 19);
		String CarrierList2 = Mainframe_GlobalFunctionLib.getText(13, 19);
		String CarrierList3 = Mainframe_GlobalFunctionLib.getText(14, 19);
		
		String ActCarrierListHelptext=CarrierList1+" "+CarrierList2+" "+CarrierList3;
		System.out.println(ActCarrierListHelptext);
		String ExpCarrierListHelptext=("The Carrier List field is used to select records based on having a Carrier ID equal to one contained within the list specified.");
		if(ExpCarrierListHelptext.equals(ActCarrierListHelptext.trim()))
		{	
			System.out.println("Text matching");
				
		}
		else
		{   
			System.out.println("Text is not same");
			Assert.fail("The text "+ ExpCarrierListHelptext +" does not match on the screen.Screenshot captured.");			
				
		}
		
		System.out.println("Carrier From help text: "+ActCarrierListHelptext);
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.sendText("6","57", "ABCDEFGHIJK");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());

		String CarrierList = Mainframe_GlobalFunctionLib.getText(6, 57);
		int lenCarrierList = CarrierList.length();
		if(lenCarrierList==10)
		{
			System.out.println("Length of the Field Carrier List : "+lenCarrierList);
		}
		
		else{
			System.out.println("Length of the Field Carrier List is NOT: "+lenCarrierList);
			
		}
	}
	
	@When("^I navigate to the field Carrier Status$")
	public void i_navigate_to_the_field_Carrier_Status() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.click(6, 72 );
		Mainframe_GlobalFunctionLib.sendText("6","72", " ");
	}

	@Then("^Validate the help message and length of the field Carrier Status$")
	public void validate_the_help_message_and_length_of_the_field_Carrier_Status() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.click(6, 72 );
		Thread.sleep(3000);

		Robot r=new Robot();
		
		r.keyPress(KeyEvent.VK_F1);
		r.keyRelease(KeyEvent.VK_F1);
		Thread.sleep(3000);
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		String CarrierSts1 = Mainframe_GlobalFunctionLib.getText(12, 5);
		String CarrierSts2 = Mainframe_GlobalFunctionLib.getText(13, 5);
		String CarrierSts3 = Mainframe_GlobalFunctionLib.getText(14, 5);
		String CarrierSts4 = Mainframe_GlobalFunctionLib.getText(15, 5);
		String CarrierSts5 = Mainframe_GlobalFunctionLib.getText(16, 5);
		String ActCarrierstsHelptext=CarrierSts1+": "+CarrierSts2+","+CarrierSts3+","+CarrierSts4+","+CarrierSts5;
		System.out.println(ActCarrierstsHelptext);
		String ExpCarrierStstHelptext=("Select status for Carrier range.: A,*BLANK,E,I");
		
		if(ExpCarrierStstHelptext.equals(ActCarrierstsHelptext.trim()))
		{	
			System.out.println("Text matching");
				
		}
		else
		{   
			System.out.println("Text is not same");
			Assert.fail("The text "+ ExpCarrierStstHelptext +" does not match on the screen.Screenshot captured.");			
				
		}
		
		System.out.println("Carrier From help text: "+ActCarrierstsHelptext);
		Mainframe_GlobalFunctionLib.pressKey("F12");
		
		Mainframe_GlobalFunctionLib.sendText("6","72", "AEI");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());

		String CarrierSts = Mainframe_GlobalFunctionLib.getText(6, 72);
		int lenCarrierSts = CarrierSts.length();
		if(lenCarrierSts==1)
		{
			System.out.println("Length of the Field Carrier Sts : "+lenCarrierSts);
		}
		
		else{
			System.out.println("Length of the Field Carrier Sts is NOT: "+lenCarrierSts);
			
		}
		
	}
	
	@Then("^Carrier status field values$")
	public void carrier_status_field_values() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.sendText(5, 21,"        ");
		Mainframe_GlobalFunctionLib.sendText(5, 21,"010101");
		Mainframe_GlobalFunctionLib.sendText(5, 39,"        ");
		Mainframe_GlobalFunctionLib.sendText(5, 21,"12317");
		Thread.sleep(3000);
		Mainframe_GlobalFunctionLib.click(6, 72 );
		Thread.sleep(3000);
		Mainframe_GlobalFunctionLib.pressKey("F4");
		Mainframe_GlobalFunctionLib.sendText(7, 4,"I");
		Thread.sleep(2000);
	    Mainframe_GlobalFunctionLib.pressKey("Enter");
		
		String ActCarrierStsListValue1 = Mainframe_GlobalFunctionLib.getText(13, 5);
		String ExpCarrierStsListValue1 = "I";
		if(ExpCarrierStsListValue1.equals(ActCarrierStsListValue1.trim()))
		{
			System.out.println("Text matching");
		}
		else
		{
			System.out.println("Text is not same");
			Assert.fail("The text "+ ExpCarrierStsListValue1 +" does not match on the screen.Screenshot captured.");	
		}
			
		Mainframe_GlobalFunctionLib.sendText(7, 4,"  ");
		Mainframe_GlobalFunctionLib.sendText(7, 4,"E");
		Thread.sleep(2000);
	    Mainframe_GlobalFunctionLib.pressKey("Enter");
	    String ActCarrierStsListValue2 = Mainframe_GlobalFunctionLib.getText(13, 5);
		String ExpCarrierStsListValue2 = "E";
		if(ExpCarrierStsListValue2.equals(ActCarrierStsListValue2.trim()))
		{
			System.out.println("Text matching");
		}
		else
		{
			System.out.println("Text is not same");
			Assert.fail("The text "+ ExpCarrierStsListValue2 +" does not match on the screen.Screenshot captured.");	
		}
		
		Mainframe_GlobalFunctionLib.sendText(7, 4,"  ");
		Mainframe_GlobalFunctionLib.sendText(7, 4,"A");
		Thread.sleep(2000);
	    Mainframe_GlobalFunctionLib.pressKey("Enter");
	    String ActCarrierStsListValue3 = Mainframe_GlobalFunctionLib.getText(13, 5);
		String ExpCarrierStsListValue3 = "A";
		if(ExpCarrierStsListValue3.equals(ActCarrierStsListValue3.trim()))
		{
			System.out.println("Text matching");
		}
		else
		{
			System.out.println("Text is not same");
			Assert.fail("The text "+ ExpCarrierStsListValue3 +" does not match on the screen.Screenshot captured.");	
		}
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Thread.sleep(2000);
	}
	
	
	@When("^I navigate to the field Account From$")
	public void i_navigate_to_the_field_Account_From() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.click(7, 21 );
		Mainframe_GlobalFunctionLib.sendText("7","21", "               ");
	}

	@Then("^Validate the help message and length of the field Account From$")
	public void validate_the_help_message_and_length_of_the_field_Account_From() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		Mainframe_GlobalFunctionLib.click(7, 21 );
		Thread.sleep(3000);

		Robot r=new Robot();
		
		r.keyPress(KeyEvent.VK_F1);
		r.keyRelease(KeyEvent.VK_F1);
		Thread.sleep(3000);
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		String AccountFHelp1 = Mainframe_GlobalFunctionLib.getText(13, 19);
		String AccountFHelp2 = Mainframe_GlobalFunctionLib.getText(14, 19);
		String AccountFHelp3 = Mainframe_GlobalFunctionLib.getText(15, 19);
		String AccountFHelp4 = Mainframe_GlobalFunctionLib.getText(16, 19);
		String AccountFHelp5 = Mainframe_GlobalFunctionLib.getText(17, 19);
		String AccountFHelp6 = Mainframe_GlobalFunctionLib.getText(18, 19);
		String ActAccountHelptext=AccountFHelp1+" "+AccountFHelp2+" "+AccountFHelp3+" "+AccountFHelp4+" "+AccountFHelp5+" "+AccountFHelp6;
		System.out.println(ActAccountHelptext);
		String ExpCarrierHelptext=("Type the unique identifier that is associated with this account throughout the RxCLAIM system.  15 alpha-numeric characters.  When *ALL is used during dynamic eligibility, the account will be identified by referencing the group specified in the group field to find the first corresponding Account.");
		if(ExpCarrierHelptext.equals(ActAccountHelptext.trim()))
		{	
			System.out.println("Text matching");
				
		}
		else
		{   
			System.out.println("Text is not same");
			Assert.fail("The text "+ ExpCarrierHelptext +" does not match on the screen.Screenshot captured.");			
				
		}
		
		System.out.println("Carrier From help text: "+ActAccountHelptext);
		Mainframe_GlobalFunctionLib.pressKey("F12");
	    
		
		Mainframe_GlobalFunctionLib.sendText("7","21", "ABCDEFGHIJKLMNOPQR");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());

		String AccountFrom = Mainframe_GlobalFunctionLib.getText(7, 21);
		int lenAccountFrom = AccountFrom.length();
		if(lenAccountFrom==15)
		{
			System.out.println("Length of the Field Account From : "+lenAccountFrom);
		}
		
		else{
			System.out.println("Length of the Field Account From is NOT: "+lenAccountFrom);
			
		}

	  }
	
	@When("^I navigate to the field Account Thru$")
	public void i_navigate_to_the_field_Account_Thru() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.click(7, 39 );
		Mainframe_GlobalFunctionLib.sendText("7","39", "               ");
	}

	@Then("^Validate the help message and length of the field Account Thru$")
	public void validate_the_help_message_and_length_of_the_field_Account_Thru() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions

		Mainframe_GlobalFunctionLib.click(7, 39 );
		Thread.sleep(3000);

		Robot r=new Robot();
		
		r.keyPress(KeyEvent.VK_F1);
		r.keyRelease(KeyEvent.VK_F1);
		Thread.sleep(3000);
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		String AccountTHelp1 = Mainframe_GlobalFunctionLib.getText(13, 19);
		String AccountTHelp2 = Mainframe_GlobalFunctionLib.getText(14, 19);
		String AccountTHelp3 = Mainframe_GlobalFunctionLib.getText(15, 19);
		
		String ActAccountThruHelptext=AccountTHelp1+" "+AccountTHelp2+" "+AccountTHelp3;
		System.out.println(ActAccountThruHelptext);
		String ExpAccountThruHelptext=("The From and Thru Account fields are used to select records within the range specified based on the Account ID.");
		if(ExpAccountThruHelptext.equals(ActAccountThruHelptext.trim()))
		{	
			System.out.println("Text matching");
				
		}
		else
		{   
			System.out.println("Text is not same");
			Assert.fail("The text "+ ExpAccountThruHelptext +" does not match on the screen.Screenshot captured.");			
				
		}
		
		System.out.println("Account Thru help text: "+ActAccountThruHelptext);
		Mainframe_GlobalFunctionLib.pressKey("F12");
	    
		
		Mainframe_GlobalFunctionLib.sendText("7","39", "ABCDEFGHIJKLMNOPQR");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());

		String AccountThru = Mainframe_GlobalFunctionLib.getText(7, 39);
		int lenAccountThru = AccountThru.length();
		if(lenAccountThru==15)
		{
			System.out.println("Length of the Field Account Thru : "+lenAccountThru);
		}
		
		else{
			System.out.println("Length of the Field Account Thru is NOT: "+lenAccountThru);
			
		}
	}
	
	@When("^I navigate to the field Account List$")
	public void i_navigate_to_the_field_Account_List() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.click(7, 57 );
		Mainframe_GlobalFunctionLib.sendText("7","57", " ");
	}

	@Then("^Validate the help message and length of the field Account List$")
	public void validate_the_help_message_and_length_of_the_field_Account_List() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.click(7, 57 );
		Thread.sleep(3000);

		Robot r=new Robot();
		
		r.keyPress(KeyEvent.VK_F1);
		r.keyRelease(KeyEvent.VK_F1);
		Thread.sleep(3000);
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		String AccountList1 = Mainframe_GlobalFunctionLib.getText(13, 19);
		String AccountList2 = Mainframe_GlobalFunctionLib.getText(14, 19);
		String AccountList3 = Mainframe_GlobalFunctionLib.getText(15, 19);
		
		String ActAccountListHelptext=AccountList1+" "+AccountList2+" "+AccountList3;
		System.out.println(ActAccountListHelptext);
		String ExpAccountListHelptext=("The Account List field is used to select records based on having a Account ID equal to one contained within the list specified.");
		if(ExpAccountListHelptext.equals(ActAccountListHelptext.trim()))
		{	
			System.out.println("Text matching");
				
		}
		else
		{   
			System.out.println("Text is not same");
			Assert.fail("The text "+ ExpAccountListHelptext +" does not match on the screen.Screenshot captured.");			
				
		}
		
		System.out.println("Account List help text: "+ActAccountListHelptext);
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.sendText("7","57", "ABCDEFGHIJK");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());

		String AccountList = Mainframe_GlobalFunctionLib.getText(7, 57);
		int lenAccountList = AccountList.length();
		if(lenAccountList==10)
		{
			System.out.println("Length of the Field Carrier List : "+lenAccountList);
		}
		
		else{
			System.out.println("Length of the Field Carrier List is NOT: "+lenAccountList);
			
		}
	}
	
	@When("^I navigate to the field Account Status$")
	public void i_navigate_to_the_field_Account_Status() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.click(7, 72 );
		Mainframe_GlobalFunctionLib.sendText("7","72", " ");
	}

	@Then("^Validate the help message and length of the field Account Status$")
	public void validate_the_help_message_and_length_of_the_field_Account_Status() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.click(7, 72 );
		Thread.sleep(3000);

		Robot r=new Robot();
		
		r.keyPress(KeyEvent.VK_F1);
		r.keyRelease(KeyEvent.VK_F1);
		Thread.sleep(3000);
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		String AccountSts1 = Mainframe_GlobalFunctionLib.getText(13, 5);
		String AccountSts2 = Mainframe_GlobalFunctionLib.getText(14, 5);
		String AccountSts3 = Mainframe_GlobalFunctionLib.getText(15, 5);
		String AccountSts4 = Mainframe_GlobalFunctionLib.getText(16, 5);
		String AccountSts5 = Mainframe_GlobalFunctionLib.getText(17, 5);
		String ActAccountstsHelptext=AccountSts1+": "+AccountSts2+","+AccountSts3+","+AccountSts4+","+AccountSts5;
		System.out.println(ActAccountstsHelptext);
		String ExpAccountstsHelptext=("Select status for Account range.: *BLANK,A,E,I");
		
		if(ExpAccountstsHelptext.equals(ActAccountstsHelptext.trim()))
		{	
			System.out.println("Text matching");
				
		}
		else
		{   
			System.out.println("Text is not same");
			Assert.fail("The text "+ ExpAccountstsHelptext +" does not match on the screen.Screenshot captured.");			
				
		}
		
		System.out.println("Account Status help text: "+ActAccountstsHelptext);
		Mainframe_GlobalFunctionLib.pressKey("F12");
		
		Mainframe_GlobalFunctionLib.sendText("7","72", "AEI");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());

		String AccountSts = Mainframe_GlobalFunctionLib.getText(7, 72);
		int lenAccountSts = AccountSts.length();
		if(lenAccountSts==1)
		{
			System.out.println("Length of the Field Account Sts : "+lenAccountSts);
		}
		
		else{
			System.out.println("Length of the Field Account Sts is NOT: "+lenAccountSts);
			
		}
		
	}

	@Then("^Validate Account status field values$")
	public void validate_account_status_field_values() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		Mainframe_GlobalFunctionLib.click(7, 72 );
		Thread.sleep(3000);
		Mainframe_GlobalFunctionLib.pressKey("F4");
		Mainframe_GlobalFunctionLib.sendText(7, 4,"I");
		Thread.sleep(2000);
	    Mainframe_GlobalFunctionLib.pressKey("Enter");
		
		String ActAccountStsListValue1 = Mainframe_GlobalFunctionLib.getText(13, 5);
		String ExpAccountStsListValue1 = "I";
		if(ExpAccountStsListValue1.equals(ActAccountStsListValue1.trim()))
		{
			System.out.println("Text matching");
		}
		else
		{
			System.out.println("Text is not same");
			Assert.fail("The text "+ ExpAccountStsListValue1 +" does not match on the screen.Screenshot captured.");	
		}
			
		Mainframe_GlobalFunctionLib.sendText(7, 4,"  ");
		Mainframe_GlobalFunctionLib.sendText(7, 4,"E");
		Thread.sleep(2000);
	    Mainframe_GlobalFunctionLib.pressKey("Enter");
	    String ActAccountStsListValue2 = Mainframe_GlobalFunctionLib.getText(13, 5);
		String ExpAccountStsListValue2 = "E";
		if(ExpAccountStsListValue2.equals(ActAccountStsListValue2.trim()))
		{
			System.out.println("Text matching");
		}
		else
		{
			System.out.println("Text is not same");
			Assert.fail("The text "+ ExpAccountStsListValue2 +" does not match on the screen.Screenshot captured.");	
		}
		
		Mainframe_GlobalFunctionLib.sendText(7, 4,"  ");
		Mainframe_GlobalFunctionLib.sendText(7, 4,"A");
		Thread.sleep(2000);
	    Mainframe_GlobalFunctionLib.pressKey("Enter");
	    String ActAccountStsListValue3 = Mainframe_GlobalFunctionLib.getText(13, 5);
		String ExpAccountStsListValue3 = "A";
		if(ExpAccountStsListValue3.equals(ActAccountStsListValue3.trim()))
		{
			System.out.println("Text matching");
		}
		else
		{
			System.out.println("Text is not same");
			Assert.fail("The text "+ ExpAccountStsListValue3 +" does not match on the screen.Screenshot captured.");	
		}
	    
		Mainframe_GlobalFunctionLib.pressKey("F12");
	}
	
	@When("^I navigate to the field Group From$")
	public void i_navigate_to_the_field_Group_From() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.click(8, 21 );
		Mainframe_GlobalFunctionLib.sendText("8","21", "               ");
	}

	@Then("^Validate the help message and length of the field Group From$")
	public void validate_the_help_message_and_length_of_the_field_Group_From() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.click(8, 21 );
		Thread.sleep(3000);

		Robot r=new Robot();
		
		r.keyPress(KeyEvent.VK_F1);
		r.keyRelease(KeyEvent.VK_F1);
		Thread.sleep(3000);
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		String GroupFHelp1 = Mainframe_GlobalFunctionLib.getText(14, 19);
		String GroupFHelp2 = Mainframe_GlobalFunctionLib.getText(15, 19);
		String GroupFHelp3 = Mainframe_GlobalFunctionLib.getText(16, 19);
		
		String ActGroupHelptext=GroupFHelp1+" "+GroupFHelp2+" "+GroupFHelp3;
		System.out.println(ActGroupHelptext);
		String ExpGroupHelptext=("Type the unique identifier that is associated with the group throughout the RxClaim system. 15 alpha-numeric characters.");
		if(ExpGroupHelptext.equals(ActGroupHelptext.trim()))
		{	
			System.out.println("Text matching");
				
		}
		else
		{   
			System.out.println("Text is not same");
			Assert.fail("The text "+ ExpGroupHelptext +" does not match on the screen.Screenshot captured.");			
				
		}
		
		System.out.println("Group From help text: "+ActGroupHelptext);
		Mainframe_GlobalFunctionLib.pressKey("F12");
	    
		
		Mainframe_GlobalFunctionLib.sendText("8","21", "ABCDEFGHIJKLMNOPQR");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());

		String GroupFrom = Mainframe_GlobalFunctionLib.getText(8, 21);
		int lenGroupFrom = GroupFrom.length();
		if(lenGroupFrom==15)
		{
			System.out.println("Length of the Field Account From : "+lenGroupFrom);
		}
		
		else{
			System.out.println("Length of the Field Account From is NOT: "+lenGroupFrom);
			
		}
		
	}
	
	@When("^I navigate to the field Group Thru$")
	public void i_navigate_to_the_field_Group_Thru() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.click(8, 39 );
		Mainframe_GlobalFunctionLib.sendText("8","39", "               ");
	}

	@Then("^Validate the help message and length of the field Group Thru$")
	public void validate_the_help_message_and_length_of_the_field_Group_Thru() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		Mainframe_GlobalFunctionLib.click(8, 39 );
		Thread.sleep(3000);

		Robot r=new Robot();
		
		r.keyPress(KeyEvent.VK_F1);
		r.keyRelease(KeyEvent.VK_F1);
		Thread.sleep(3000);
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		String GroupTHelp1 = Mainframe_GlobalFunctionLib.getText(14, 19);
		String GroupTHelp2 = Mainframe_GlobalFunctionLib.getText(15, 19);
		
		
		String ActGroupThruHelptext=GroupTHelp1+" "+GroupTHelp2;
		System.out.println(ActGroupThruHelptext);
		String ExpGroupThruHelptext=("The From and Thru Group fields are used to select records within the range based on the Group ID.");
		if(ExpGroupThruHelptext.equals(ActGroupThruHelptext.trim()))
		{	
			System.out.println("Text matching");
				
		}
		else
		{   
			System.out.println("Text is not same");
			Assert.fail("The text "+ ExpGroupThruHelptext +" does not match on the screen.Screenshot captured.");			
				
		}
		
		System.out.println("Group Thru help text: "+ActGroupThruHelptext);
		Mainframe_GlobalFunctionLib.pressKey("F12");
	    
		
		Mainframe_GlobalFunctionLib.sendText("8","39", "ABCDEFGHIJKLMNOPQR");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());

		String GroupThru = Mainframe_GlobalFunctionLib.getText(8, 39);
		int lenGroupThru = GroupThru.length();
		if(lenGroupThru==15)
		{
			System.out.println("Length of the Field Account From : "+lenGroupThru);
		}
		
		else{
			System.out.println("Length of the Field Account From is NOT: "+lenGroupThru);
			
		}
	}
	
	@When("^I navigate to the field Group List$")
	public void i_navigate_to_the_field_Group_List() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.click(8, 57 );
		Mainframe_GlobalFunctionLib.sendText("8","57", "          ");
	}

	@Then("^Validate the help message and length of the field Group List$")
	public void validate_the_help_message_and_length_of_the_field_Group_List() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
		Mainframe_GlobalFunctionLib.click(8, 57 );
		Thread.sleep(3000);

		Robot r=new Robot();
		
		r.keyPress(KeyEvent.VK_F1);
		r.keyRelease(KeyEvent.VK_F1);
		Thread.sleep(3000);
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		String GroupList1 = Mainframe_GlobalFunctionLib.getText(14, 19);
		String GroupList2 = Mainframe_GlobalFunctionLib.getText(15, 19);
		
		String ActGroupListHelptext=GroupList1+" "+GroupList2;
		System.out.println(ActGroupListHelptext);
		String ExpGroupListHelptext=("The From and Thru Group fields are used to select records within the range based on the Group ID.");
		if(ExpGroupListHelptext.equals(ActGroupListHelptext.trim()))
		{	
			System.out.println("Text matching");
				
		}
		else
		{   
			System.out.println("Text is not same");
			Assert.fail("The text "+ ExpGroupListHelptext +" does not match on the screen.Screenshot captured.");			
				
		}
		
		System.out.println("Group List help text: "+ActGroupListHelptext);
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.sendText("8","57", "ABCDEFGHIJK");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());

		String GroupList = Mainframe_GlobalFunctionLib.getText(8, 57);
		int lenGroupList = GroupList.length();
		if(lenGroupList==10)
		{
			System.out.println("Length of the Field Carrier List : "+lenGroupList);
		}
		
		else{
			System.out.println("Length of the Field Carrier List is NOT: "+lenGroupList);
			
		}
	}
	
	@When("^I navigate to the field Group Status$")
	public void i_navigate_to_the_field_Group_Status() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
		Mainframe_GlobalFunctionLib.click(8, 72 );
		Mainframe_GlobalFunctionLib.sendText("8","72", " ");
	}

	@Then("^Validate the help message and length of the field Group Status$")
	public void validate_the_help_message_and_length_of_the_field_Group_Status() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
		Mainframe_GlobalFunctionLib.click(8, 72 );
		Thread.sleep(3000);

		Robot r=new Robot();
		
		r.keyPress(KeyEvent.VK_F1);
		r.keyRelease(KeyEvent.VK_F1);
		Thread.sleep(3000);
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		String GroupSts1 = Mainframe_GlobalFunctionLib.getText(14, 5);
		String GroupSts2 = Mainframe_GlobalFunctionLib.getText(15, 5);
		String GroupSts3 = Mainframe_GlobalFunctionLib.getText(16, 5);
		String GroupSts4 = Mainframe_GlobalFunctionLib.getText(17, 5);
		String GroupSts5 = Mainframe_GlobalFunctionLib.getText(18, 5);
		String ActGroupstsHelptext=GroupSts1+": "+GroupSts2+","+GroupSts3+","+GroupSts4+","+GroupSts5;
		System.out.println(ActGroupstsHelptext);
		String ExpGroupstsHelptext=("Select status for Group range.: *BLANK,A,E,I");
		
		if(ExpGroupstsHelptext.equals(ActGroupstsHelptext.trim()))
		{	
			System.out.println("Text matching");
				
		}
		else
		{   
			System.out.println("Text is not same");
			Assert.fail("The text "+ ExpGroupstsHelptext +" does not match on the screen.Screenshot captured.");			
				
		}
		
		System.out.println("Group Status help text: "+ActGroupstsHelptext);
		Mainframe_GlobalFunctionLib.pressKey("F12");
		
		Mainframe_GlobalFunctionLib.sendText("8","72", "AEI");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());

		String GroupSts = Mainframe_GlobalFunctionLib.getText(8, 72);
		int lenGroupSts = GroupSts.length();
		if(lenGroupSts==1)
		{
			System.out.println("Length of the Field Group Sts : "+lenGroupSts);
		}
		
		else{
			System.out.println("Length of the Field Group Sts is NOT: "+lenGroupSts);
			
		}
	}

	@Then("^Validate Group status field values$")
	public void validate_group_status_field_values() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
		Mainframe_GlobalFunctionLib.click(8, 72 );
		Thread.sleep(3000);
		Mainframe_GlobalFunctionLib.pressKey("F4");
		Mainframe_GlobalFunctionLib.sendText(7, 4,"I");
		Thread.sleep(2000);
	    Mainframe_GlobalFunctionLib.pressKey("Enter");
		
		String ActGroupStsListValue1 = Mainframe_GlobalFunctionLib.getText(13, 5);
		String ExpGroupStsListValue1 = "I";
		if(ExpGroupStsListValue1.equals(ActGroupStsListValue1.trim()))
		{
			System.out.println("Text matching");
		}
		else
		{
			System.out.println("Text is not same");
			Assert.fail("The text "+ ExpGroupStsListValue1 +" does not match on the screen.Screenshot captured.");	
		}
			
		Mainframe_GlobalFunctionLib.sendText(7, 4,"  ");
		Mainframe_GlobalFunctionLib.sendText(7, 4,"E");
		Thread.sleep(2000);
	    Mainframe_GlobalFunctionLib.pressKey("Enter");
	    String ActGroupStsListValue2 = Mainframe_GlobalFunctionLib.getText(13, 5);
		String ExpGroupStsListValue2 = "E";
		if(ExpGroupStsListValue2.equals(ActGroupStsListValue2.trim()))
		{
			System.out.println("Text matching");
		}
		else
		{
			System.out.println("Text is not same");
			Assert.fail("The text "+ ExpGroupStsListValue2 +" does not match on the screen.Screenshot captured.");	
		}
		
		Mainframe_GlobalFunctionLib.sendText(7, 4,"  ");
		Mainframe_GlobalFunctionLib.sendText(7, 4,"A");
		Thread.sleep(2000);
	    Mainframe_GlobalFunctionLib.pressKey("Enter");
	    String ActGroupStsListValue3 = Mainframe_GlobalFunctionLib.getText(13, 5);
		String ExpGroupStsListValue3 = "A";
		if(ExpGroupStsListValue3.equals(ActGroupStsListValue3.trim()))
		{
			System.out.println("Text matching");
		}
		else
		{
			System.out.println("Text is not same");
			Assert.fail("The text "+ ExpGroupStsListValue3 +" does not match on the screen.Screenshot captured.");	
		}
		Mainframe_GlobalFunctionLib.pressKey("F12");
	}
	
	@When("^I navigate to the field File Name$")
	public void i_navigate_to_the_field_File_Name() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.click(10, 21 );
		Mainframe_GlobalFunctionLib.sendText("10","21", "         ");
	}

	@Then("^Validate the help message and length of the field File Name$")
	public void validate_the_help_message_and_length_of_the_field_File_Name() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.click(10, 21 );
		Thread.sleep(3000);

		Robot r=new Robot();
		
		r.keyPress(KeyEvent.VK_F1);
		r.keyRelease(KeyEvent.VK_F1);
		Thread.sleep(3000);
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		String ActFileNameHelptext = Mainframe_GlobalFunctionLib.getText(16, 19);
		
		System.out.println(ActFileNameHelptext);
		String ExpFileNameHelptext=("File is used to store the output.");
		if(ExpFileNameHelptext.equals(ActFileNameHelptext.trim()))
		{	
			System.out.println("Text matching");
				
		}
		else
		{   
			System.out.println("Text is not same");
			Assert.fail("The text "+ ExpFileNameHelptext +" does not match on the screen.Screenshot captured.");			
				
		}
		
		System.out.println("File Name help text: "+ActFileNameHelptext);
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.sendText("10","21", "ABCDEFGHIJK");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());

		String FileName = Mainframe_GlobalFunctionLib.getText(10, 21);
		int lenFileName = FileName.length();
		if(lenFileName==9)
		{
			System.out.println("Length of the Field File : "+lenFileName);
		}
		
		else{
			System.out.println("Length of the Field File Name is NOT: "+lenFileName);
			
		}
		
	}
	
	@When("^I navigate to the field Library$")
	public void i_navigate_to_the_field_Library() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.click(11, 21 );
		Mainframe_GlobalFunctionLib.sendText("11","21", "         ");
	}

	@Then("^Validate the help message and length of the field Library$")
	public void validate_the_help_message_and_length_of_the_field_Library() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  
		Mainframe_GlobalFunctionLib.click(11, 21 );
		Thread.sleep(3000);

		Robot r=new Robot();
		
		r.keyPress(KeyEvent.VK_F1);
		r.keyRelease(KeyEvent.VK_F1);
		Thread.sleep(3000);
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		String Library1 = Mainframe_GlobalFunctionLib.getText(17, 19);
		String Library2 = Mainframe_GlobalFunctionLib.getText(18, 19);
		
		String ActLibraryHelptext=Library1+" "+Library2;
		System.out.println(ActLibraryHelptext);
		String ExpLibraryHelptext=("The Library Name field identifies the name of the library which contains the file.");
		if(ExpLibraryHelptext.equals(ActLibraryHelptext.trim()))
		{	
			System.out.println("Text matching");
				
		}
		else
		{   
			System.out.println("Text is not same");
			Assert.fail("The text "+ ExpLibraryHelptext +" does not match on the screen.Screenshot captured.");			
				
		}
		
		System.out.println("Library help text: "+ActLibraryHelptext);
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.sendText("11","21", "ABCDEFGHIJ1");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());

		String Library = Mainframe_GlobalFunctionLib.getText(11, 21);
		int lenLibrary = Library.length();
		if(lenLibrary==10)
		{
			System.out.println("Length of the Field Library : "+lenLibrary);
		}
		
		else{
			System.out.println("Length of the Field Library is NOT: "+lenLibrary);
			
		}
	}
	
	@Then("^User should navigate to RxClaim Utility Programs$")
	public void user_should_navigate_to_RxClaim_Utility_Programs() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
		
		Mainframe_GlobalFunctionLib.validateText("1", "13", "RxClaim Utility Programs");
	}

	@Then("^I Validate the new screen file Conversion Request \"([^\"]*)\" is added$")
	public void i_Validate_the_new_screen_file_Conversion_Request_is_added(String NewScreen) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
		Mainframe_GlobalFunctionLib.validateText("8", "23", NewScreen);
	}
	
	@Then("^I Validate \"([^\"]*)\" and \"([^\"]*)\" field values appear in File Conversion Request screen$")
	public void i_Validate_and_field_values_appear_in_File_Conversion_Request_screen(String FileName, String Library) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
		
		//String Library1 = Mainframe_GlobalFunctionLib.getText(17, 19);
		//String Library2 = Mainframe_GlobalFunctionLib.getText(18, 19);
		String ActDataFile= Mainframe_GlobalFunctionLib.getText(13, 21);
		String ExpDataFile=Library+"/"+FileName;
		System.out.println(ActDataFile);
		System.out.println(ExpDataFile);
		Mainframe_GlobalFunctionLib.validateText("13", "21", ExpDataFile);

		
	}
	
	@Then("^I Validate the help message and length of the field Data File Conversion Type$")
	public void i_validate_the_help_message_and_length_of_the_field_Data_File_Conversion_Type() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
		Mainframe_GlobalFunctionLib.click(13, 48 );
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_F1);
		r.keyRelease(KeyEvent.VK_F1);
		Thread.sleep(3000);

		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		String DatafileCTHelp1 = Mainframe_GlobalFunctionLib.getText(17, 5);
		String DatafileCTHelp2 = Mainframe_GlobalFunctionLib.getText(18, 5);
		String ActDataFileCTHelptext=DatafileCTHelp1+" "+DatafileCTHelp2;
		System.out.println(ActDataFileCTHelptext);
		String ExpDataFileCTHelptext=("Indicates into what format the data file is to be converted.");

		if(ExpDataFileCTHelptext.equals(ActDataFileCTHelptext.trim()))
		{	
			System.out.println("Text matching");
				
		}
		else
		{   
			System.out.println("Text is not same");
			Assert.fail("The text "+ ExpDataFileCTHelptext +" does not match on the screen.Screenshot captured.");			
				
		}

		Mainframe_GlobalFunctionLib.pressKey("F12");
	    
		
		Mainframe_GlobalFunctionLib.sendText("13","48", "ABCD");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());

		String DataFileCT = Mainframe_GlobalFunctionLib.getText(13, 48);
		int lenDataFileCT = DataFileCT.length();

		if(lenDataFileCT==3)
		{
			System.out.println("Length of the Field Data File Conversion Type : "+lenDataFileCT);
		}
		
		else{
			System.out.println("Length of the Field Data File Conversion Type : "+lenDataFileCT);
			
		}

	}
	
	@Then("^I Validate the Data File Conversion Type field selection values$")
	public void i_validate_the_Data_File_Conversion_Type_field_selection_values() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
		Mainframe_GlobalFunctionLib.sendText("13","48", "   ");
		Mainframe_GlobalFunctionLib.sendText("14","48", "   ");
		Mainframe_GlobalFunctionLib.click(13, 48 );
		Mainframe_GlobalFunctionLib.pressKey("F4");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.sendText(3, 19,"CSV");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
	   	Mainframe_GlobalFunctionLib.validateText("6", "10", "CSV"); 
	   	Thread.sleep(2000);
	   	Mainframe_GlobalFunctionLib.sendText(3, 19,"TXT");		
	   	Mainframe_GlobalFunctionLib.pressKey("Enter");
	   	Mainframe_GlobalFunctionLib.validateText("6", "10", "TXT");
	   	Thread.sleep(2000);
	   	Mainframe_GlobalFunctionLib.sendText(3, 19,"XLS");		
	   	Mainframe_GlobalFunctionLib.pressKey("Enter");
	   	Mainframe_GlobalFunctionLib.validateText("6", "10", "XLS");
	   	Thread.sleep(2000);
	   	Mainframe_GlobalFunctionLib.sendText(3, 19,"XML");		
	   	Mainframe_GlobalFunctionLib.pressKey("Enter");
	   	Mainframe_GlobalFunctionLib.validateText("6", "10", "XML");
	   	Thread.sleep(2000);
	   	Mainframe_GlobalFunctionLib.sendText(3, 19,"*BLANK");		
	   	Mainframe_GlobalFunctionLib.pressKey("Enter");
	   	Mainframe_GlobalFunctionLib.validateText("6", "10", "*BLANK");
	   	Mainframe_GlobalFunctionLib.pressKey("F3");
	   	
	}

	@Then("^I Validate the help message and length of the field Spool File Conversion Type$")
	public void i_Validate_the_help_message_and_length_of_the_field_Spool_File_Conversion_Type() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
		Mainframe_GlobalFunctionLib.click(14, 48 );
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_F1);
		r.keyRelease(KeyEvent.VK_F1);
		Thread.sleep(3000);

		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		String SpoolfileCTHelp1 = Mainframe_GlobalFunctionLib.getText(7, 19);
		String SpoolfileCTHelp2 = Mainframe_GlobalFunctionLib.getText(8, 19);
		String ActSpoolFileCTHelptext=SpoolfileCTHelp1+" "+SpoolfileCTHelp2;
		System.out.println(ActSpoolFileCTHelptext);
		String ExpDataFileCTHelptext=("Indicates into what format the spool file is to be converted.");

		if(ExpDataFileCTHelptext.equals(ActSpoolFileCTHelptext.trim()))
		{	
			System.out.println("Text matching");
				
		}
		else
		{   
			System.out.println("Text is not same");
			Assert.fail("The text "+ ExpDataFileCTHelptext +" does not match on the screen.Screenshot captured.");			
				
		}

		Mainframe_GlobalFunctionLib.pressKey("F12");
	    
		
		Mainframe_GlobalFunctionLib.sendText("14","48", "ABCD");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());

		String SpoolFileCT = Mainframe_GlobalFunctionLib.getText(14, 48);
		int lenSpoolFileCT = SpoolFileCT.length();

		if(lenSpoolFileCT==3)
		{
			System.out.println("Length of the Field Spool File Conversion Type : "+lenSpoolFileCT);
		}
		
		else{
			System.out.println("Length of the Field Spool File Conversion Type : "+lenSpoolFileCT);
			
		}
	}
	
	@Then("^I Validate the Spool File Conversion Type field selection values$")
	public void i_Validate_the_Spool_File_Conversion_Type_field_selection_values() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
		Mainframe_GlobalFunctionLib.sendText("14","48", "   ");
		Mainframe_GlobalFunctionLib.sendText("16","69", " ");
		Mainframe_GlobalFunctionLib.click(14, 48 );
		Mainframe_GlobalFunctionLib.pressKey("F4");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.sendText(3, 19,"PDF");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
	   	Mainframe_GlobalFunctionLib.validateText("6", "10", "PDF"); 
	   	Thread.sleep(2000);
	   	Mainframe_GlobalFunctionLib.sendText(3, 19,"TXT");		
	   	Mainframe_GlobalFunctionLib.pressKey("Enter");
	   	Mainframe_GlobalFunctionLib.validateText("6", "10", "TXT");
	   	Thread.sleep(2000);
	   	
	   	Mainframe_GlobalFunctionLib.sendText(3, 19,"*BLANK");		
	   	Mainframe_GlobalFunctionLib.pressKey("Enter");
	   	Mainframe_GlobalFunctionLib.validateText("6", "10", "*BLANK");
	   	Mainframe_GlobalFunctionLib.pressKey("F3");
	}
	
	@Then("^I Validate the Exit and Previous function keys of File Conversion Request screen$")
	public void i_Validate_the_Exit_and_Previous_function_keys_of_File_Conversion_Request_screen() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.validateText("2", "25", "Eligibility Load Tracking Extract");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		System.out.println("User is navigated to Previous screen : "+"Eligibility Load Tracking Extract");
		Thread.sleep(2000);
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Thread.sleep(2000);
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.validateText("1", "13", "RxClaim Utility Programs");
		System.out.println("User is navigated to the screen : "+"RxClaim Utility Programs");
	}
	
	@When("^I select yes to continue$")
	public void i_select_yes_to_continue() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
		Mainframe_GlobalFunctionLib.sendText(16, 69,"Y" );
		Thread.sleep(1000);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
	}
	
	@Then("^Job should completed with user \"([^\"]*)\" and job name \"([^\"]*)\"$")
	public void job_should_completed_with_user_and_job_name(String Juser, String Jname) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
		String qry="WRKJOB JOB("+Juser+"/"+Jname+")";
	    Mainframe_GlobalFunctionLib.sendText(21, 7,qry);
	    Thread.sleep(2000);
	    Mainframe_GlobalFunctionLib.pressKey("Enter");
	    Thread.sleep(2000);
	    Mainframe_GlobalFunctionLib.validateText("8", "10", Jname);
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
			    		Mainframe_GlobalFunctionLib.sendText(17, 37,"QPGMR");
			    		Thread.sleep(3000);
			    		Mainframe_GlobalFunctionLib.pressKey("Enter");
			    		
			    		System.out.println("Job Completed Successfully: "+status);
			    		//Mainframe_GlobalFunctionLib.pressKey("F12"); 
			    		//Mainframe_GlobalFunctionLib.click(21, 7 );
						//Thread.sleep(1000);
						//Mainframe_GlobalFunctionLib.sendText(21, 7,"                              " );
						Thread.sleep(3000);
	    			}

	    	 else if(status.contains("ACTIVE")) {
	    		 
	    		 do{
	    		 
	    		 Mainframe_GlobalFunctionLib.pressKey("F12");
	    		 Mainframe_GlobalFunctionLib.sendText(21, 7,qry);
	    		 Mainframe_GlobalFunctionLib.pressKey("Enter");
	    		 Thread.sleep(5000);
	    		 } while(Mainframe_GlobalFunctionLib.getText(8, 52).contains("ACTIVE"));
	    		 
	    		 //Mainframe_GlobalFunctionLib.pressKey("F12");
	    		// Mainframe_GlobalFunctionLib.click(21, 7 );
	    			//Thread.sleep(1000);
	    			//Mainframe_GlobalFunctionLib.sendText(21, 7,"                            " );
	    			Thread.sleep(3000);
	    			System.out.println("Job Completed Successfully: "+status);
	    	 }
	    		 
	    	else
	    		{
	    	System.out.println("Job Completed Successfully: "+status);
	    	//Mainframe_GlobalFunctionLib.pressKey("F12");
	    	//Mainframe_GlobalFunctionLib.click(21, 7 );
			//Thread.sleep(1000);
			//Mainframe_GlobalFunctionLib.sendText(21, 7,"                            " );
			Thread.sleep(3000);
	    	 
	    		}
		

	}
	
	@Then("^I Validate the spool file is generated with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_Validate_the_spool_file_is_generated_with(String ReportName, String CarrierFrom, String CarrierThru, String FileName, String Library) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	
		Mainframe_GlobalFunctionLib.sendText(8, 4,"1");
    	Mainframe_GlobalFunctionLib.pressKey("Enter");
    	Mainframe_GlobalFunctionLib.sendText(21, 7,"4");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(11, 3,"5");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.sendText(4, 22,ReportName);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F16");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.validateText("7", "53", ReportName);
		System.out.println("Spool file report name: "+ReportName);
		Mainframe_GlobalFunctionLib.sendText(4, 22,"                       ");
		Mainframe_GlobalFunctionLib.sendText(4, 22,CarrierFrom);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F16");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.validateText("7", "76", CarrierFrom);
		System.out.println("Spool file Carrier From field value: "+CarrierFrom);
		Mainframe_GlobalFunctionLib.sendText(4, 22,"                       ");
		Mainframe_GlobalFunctionLib.sendText(4, 22,CarrierThru);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F16");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.validateText("7", "76", CarrierThru);
		System.out.println("Spool file Carrier Thru field value: "+CarrierThru);
		Mainframe_GlobalFunctionLib.sendText(4, 22,"                       ");
		Mainframe_GlobalFunctionLib.sendText(4, 22,FileName);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F16");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.validateText("7", "76", FileName);
		System.out.println("Spool file FileName: "+FileName);
		Mainframe_GlobalFunctionLib.sendText(4, 22,"                       ");
		Mainframe_GlobalFunctionLib.sendText(4, 22,Library);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F16");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.validateText("7", "76", Library);
		System.out.println("Spool file Library Name: "+Library);
		Mainframe_GlobalFunctionLib.sendText(4, 22,"                       ");
		
		Mainframe_GlobalFunctionLib.pressKey("PageDown");
		String NumberRecord= Mainframe_GlobalFunctionLib.getText(6,2);
		System.out.println("Spool file Bottom Content: "+NumberRecord);
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		if(NumberRecord.contains("NUMBER OF RECORDS ADDED TO FILE:" ))
		{
			System.out.println("Eligibility Reporting contains: "+"NonZeroValue");
			
			Mainframe_GlobalFunctionLib.sendText(4, 22,"                       ");
			Mainframe_GlobalFunctionLib.sendText(4, 22,"NUMBER OF RECORDS");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.pressKey("F16");

			String NumberRecord2= Mainframe_GlobalFunctionLib.getText(7,59).substring(23,26).trim();
			System.out.println("Number of Record Value: "+NumberRecord2);
			int i = Integer.parseInt(NumberRecord2);
			if (i > 0){
				
			System.out.println("NUMBER OF RECORDS ADDED TO FILE is Non Zero: "+NumberRecord2); }
		}
		else
		{
			System.out.println("Eligibility Reporting contains: "+"NoValue");
		}
		

	}
	
	@When("^I have entered the values \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\", in the screen EligibilityLoadTrackingExtractScreen$")
	public void i_have_entered_the_values_in_the_screen(String DateFrom, String DateThru, String CarrierFrom, String CarrierThru , String AccountFrom, String AccountThru, String GroupFrom , String GroupThru, String FileName, String Library, String DFCT, String SPCT ) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
		Mainframe_GlobalFunctionLib.sendText("5","21", DateFrom);
		Mainframe_GlobalFunctionLib.sendText("5","39", DateThru);
		Mainframe_GlobalFunctionLib.click(6, 21 );
		Mainframe_GlobalFunctionLib.pressKey("F4");
		Mainframe_GlobalFunctionLib.sendText("4","6", CarrierFrom);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText("9","2", "1");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		
		Mainframe_GlobalFunctionLib.click(6, 39 );
		Mainframe_GlobalFunctionLib.pressKey("F4");
		Mainframe_GlobalFunctionLib.sendText("4","6", CarrierThru);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText("9","2", "1");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		
		Mainframe_GlobalFunctionLib.click(7, 21 );
		Mainframe_GlobalFunctionLib.pressKey("F4");
		Mainframe_GlobalFunctionLib.sendText("6","5", AccountFrom);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText("11","2", "1");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		
		Mainframe_GlobalFunctionLib.click(7, 39 );
		Mainframe_GlobalFunctionLib.pressKey("F4");
		Mainframe_GlobalFunctionLib.sendText("6","5", AccountThru);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText("11","2", "1");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		
		Mainframe_GlobalFunctionLib.click(8, 21 );
		Mainframe_GlobalFunctionLib.pressKey("F4");
		Mainframe_GlobalFunctionLib.sendText("4","33", GroupFrom);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText("9","2", "1");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		
		Mainframe_GlobalFunctionLib.click(8, 39 );
		Mainframe_GlobalFunctionLib.pressKey("F4");
		Mainframe_GlobalFunctionLib.sendText("4","33", GroupThru);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText("9","2", "1");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		
		Mainframe_GlobalFunctionLib.sendText("10","21", FileName);
		Mainframe_GlobalFunctionLib.sendText("11","21", Library);
		Thread.sleep(3000);
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("F6");
		
		Mainframe_GlobalFunctionLib.click(13, 48 );
		Mainframe_GlobalFunctionLib.pressKey("F4");
		Mainframe_GlobalFunctionLib.sendText("3","19", DFCT);
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText("6","7", "1");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		
		Mainframe_GlobalFunctionLib.click(14, 48 );
		Mainframe_GlobalFunctionLib.pressKey("F4");
		Mainframe_GlobalFunctionLib.sendText("3","19", SPCT);
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText("6","7", "1");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.click(16, 69 );
		Mainframe_GlobalFunctionLib.sendText("16","69", "Y");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		
		
	}
}




	
	


	

