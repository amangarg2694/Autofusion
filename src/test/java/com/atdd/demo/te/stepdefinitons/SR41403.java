package com.atdd.demo.te.stepdefinitons;
import com.atdd.te.screenHelpers.FunctionalLibrary;
import com.optumrx.autofusion.core.te.util.Mainframe_GlobalFunctionLib;

import cucumber.api.java.en.When;

public class SR41403 {
	@When("^I enter \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\"$")
	public void i_enter(String Calender, String Description, String Type) throws Throwable {
		Mainframe_GlobalFunctionLib.sendText(8,20,Calender);
		Mainframe_GlobalFunctionLib.sendText(9,20,Description);
		Mainframe_GlobalFunctionLib.sendText(10,20,Type);
		FunctionalLibrary.pressEnter();
		Mainframe_GlobalFunctionLib.sendText(11,28,"X");
		Mainframe_GlobalFunctionLib.sendText(11,31,"X");
		Mainframe_GlobalFunctionLib.sendText(11,34,"X");
		Mainframe_GlobalFunctionLib.sendText(11,37,"X");
		Mainframe_GlobalFunctionLib.sendText(11,40,"X");
		Mainframe_GlobalFunctionLib.sendText(11,43,"X");
		Mainframe_GlobalFunctionLib.sendText(11,46,"X");
		FunctionalLibrary.pressEnter();
		Mainframe_GlobalFunctionLib.sendText(24,73,"Y");
		FunctionalLibrary.pressEnter();
		
		
		
	    
	}
		
	@When("^I enter \"([^\"]*)\",\"([^\"]*)\"$")
	public void i_enter(String HolidayCalender, String HoliCalenderDescription) throws Throwable {
		Mainframe_GlobalFunctionLib.sendText(14,38,HolidayCalender);
		Mainframe_GlobalFunctionLib.sendText(16,38,HoliCalenderDescription);
		FunctionalLibrary.pressEnter();
		Mainframe_GlobalFunctionLib.sendText(20,64,"Y");
		FunctionalLibrary.pressEnter();
		
	}
	@When("^I enter \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\" , \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
	public void i_enter(String Cycle, String CycleDescription, String Calender, String CalenderDescription, String CycleGenarateFrom, String CycleGenarateThru) throws Throwable {
		Mainframe_GlobalFunctionLib.sendText(9,22,Cycle);
		Mainframe_GlobalFunctionLib.sendText(10,22,CycleDescription);
		Mainframe_GlobalFunctionLib.sendText(12,22,Calender);
		FunctionalLibrary.pressEnter();
		
		Mainframe_GlobalFunctionLib.sendText(15,22,CycleGenarateFrom);
		Mainframe_GlobalFunctionLib.sendText(16,22,CycleGenarateThru);
		FunctionalLibrary.pressEnter();
		Mainframe_GlobalFunctionLib.sendText(20,47,"Y");
		FunctionalLibrary.pressEnter();
		
		
	}
	@When("^I enter \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_enter(String Process, String ProcessDescription, String ProcessType, String Cycle, String ProcessThruDate) throws Throwable {
	   
		Mainframe_GlobalFunctionLib.sendText(5,11,Process);
		Mainframe_GlobalFunctionLib.sendText(5,25,ProcessDescription);
		Mainframe_GlobalFunctionLib.sendText(6,11,ProcessType);
		FunctionalLibrary.pressEnter();
		
		Mainframe_GlobalFunctionLib.sendText(8,11,Cycle);
		FunctionalLibrary.pressEnter();
		Mainframe_GlobalFunctionLib.sendText(10,45,ProcessThruDate);
		FunctionalLibrary.pressEnter();
	}
	
	/*@When("^I enter MOP \"([^\"]*)\",\"([^\"]*)\"$")
	public void i_enter_MOP(String MethodOfPayment, String MOPdescription) throws Throwable {
		Mainframe_GlobalFunctionLib.sendText(11,23,MethodOfPayment);
		Mainframe_GlobalFunctionLib.sendText(12,23,MOPdescription);
		FunctionalLibrary.pressEnter();
		Mainframe_GlobalFunctionLib.pressKey("F3");
		
	}*/
	@When("^I enter MOP \"([^\"]*)\",\"([^\"]*)\", \"([^\"]*)\"$")
	public void i_enter_MOP(String MethodOfPayment, String MOPdescription, String Payer) throws Throwable {
		Mainframe_GlobalFunctionLib.sendText(11,23,MethodOfPayment);
		Mainframe_GlobalFunctionLib.sendText(12,23,MOPdescription);
		//Mainframe_GlobalFunctionLib.sendText(16,36,Payer);
		
		FunctionalLibrary.pressEnter();
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Mainframe_GlobalFunctionLib.sendText(13,23,"A");
		Mainframe_GlobalFunctionLib.sendText(14,23,"PBPY1106");
		FunctionalLibrary.pressEnter();
		FunctionalLibrary.pressEnter();
		//Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		
	}
	/*@When("^I enter \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_enter(String MethodOfPayment, String MOPdescription, String Voucher, String Payer) throws Throwable {
		Mainframe_GlobalFunctionLib.sendText(11,23,MethodOfPayment);
		Mainframe_GlobalFunctionLib.sendText(12,23,MOPdescription);
		//Mainframe_GlobalFunctionLib.sendText(14,36,Voucher);
		//Mainframe_GlobalFunctionLib.sendText(16,36,Payer);
		FunctionalLibrary.pressEnter();
	}*/
	

	/*@When("^I send \"([^\"]*)\",\"([^\"]*)\"$")
	public void i_send(String Payer, String payerName) throws Throwable {
		Mainframe_GlobalFunctionLib.sendText(8,15,Payer);
		Mainframe_GlobalFunctionLib.sendText(9,15,payerName);
		FunctionalLibrary.pressEnter();
		
	   
	}*/
	
	@When("^I send \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_send(String Payer, String payerName, String PayerAddrss, String PayerCity, String PayerState, String PayerZip) throws Throwable {
	    
		Mainframe_GlobalFunctionLib.sendText(8,15,Payer);
		Mainframe_GlobalFunctionLib.sendText(9,15,payerName);
		FunctionalLibrary.pressEnter();
		Mainframe_GlobalFunctionLib.sendText(9,9,PayerAddrss);
		Mainframe_GlobalFunctionLib.sendText(10,11,PayerCity);
		Mainframe_GlobalFunctionLib.sendText(10,43,PayerState);
		Mainframe_GlobalFunctionLib.sendText(10,50,PayerZip);
		FunctionalLibrary.pressEnter();
		
	}
	
	/*@When("^I enter \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_enter(String RoutingNbr, String FINAME, String FICODE, String FIADDRESS, String FICITY, String FISTATE, String FIZIP, String FIPHONE) throws Throwable {
	    
		Mainframe_GlobalFunctionLib.sendText(8,20,RoutingNbr);
		Mainframe_GlobalFunctionLib.sendText(9,20,FINAME);
		
		Mainframe_GlobalFunctionLib.sendText(10,20,FICODE);
		FunctionalLibrary.pressEnter();
		Mainframe_GlobalFunctionLib.sendText(8,9,FIADDRESS);
		Mainframe_GlobalFunctionLib.sendText(9,10,FICITY);
		Mainframe_GlobalFunctionLib.sendText(9,42,FISTATE);
		Mainframe_GlobalFunctionLib.sendText(9,49,FIZIP);
		Mainframe_GlobalFunctionLib.sendText(10,42,FIPHONE);
		FunctionalLibrary.pressEnter();
		Mainframe_GlobalFunctionLib.sendText(4,5,RoutingNbr);
		FunctionalLibrary.pressEnter();
		Mainframe_GlobalFunctionLib.sendText(9,2,"8");
		FunctionalLibrary.pressEnter();
		Mainframe_GlobalFunctionLib.pressKey("F6");
		
		
		
		
	}
	
	@When("^I enter \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_enter(String RoutingNbr, String FINAME, String FICODE, String FIADDRESS, String FICITY, String FISTATE, String FIZIP, String FIPHONE, String FIACCOUNT, String FIACCNAME, String FIOWNERTYPE, String Payer, String FIACCTYPE, String SIGNATUREAUTHORITY) throws Throwable {
	    
		Mainframe_GlobalFunctionLib.sendText(8,20,RoutingNbr);
		Mainframe_GlobalFunctionLib.sendText(9,20,FINAME);
		
		Mainframe_GlobalFunctionLib.sendText(10,20,FICODE);
		FunctionalLibrary.pressEnter();
		Mainframe_GlobalFunctionLib.sendText(8,9,FIADDRESS);
		Mainframe_GlobalFunctionLib.sendText(9,10,FICITY);
		Mainframe_GlobalFunctionLib.sendText(9,42,FISTATE);
		Mainframe_GlobalFunctionLib.sendText(9,49,FIZIP);
		Mainframe_GlobalFunctionLib.sendText(10,42,FIPHONE);
		FunctionalLibrary.pressEnter();
		//Mainframe_GlobalFunctionLib.sendText(20,47,"Y");
		//FunctionalLibrary.pressEnter();
		Mainframe_GlobalFunctionLib.sendText(4,5,RoutingNbr);
		FunctionalLibrary.pressEnter();
		Mainframe_GlobalFunctionLib.sendText(9,2,"8");
		FunctionalLibrary.pressEnter();
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Mainframe_GlobalFunctionLib.sendText(8,14,FIACCOUNT);
		Mainframe_GlobalFunctionLib.sendText(9,14,FIACCNAME);
		Mainframe_GlobalFunctionLib.sendText(10,14,FIOWNERTYPE);
		Mainframe_GlobalFunctionLib.sendText(11,14,Payer);
		FunctionalLibrary.pressEnter();
		Mainframe_GlobalFunctionLib.sendText(9,14,FIACCTYPE);
		Mainframe_GlobalFunctionLib.sendText(12,9,FIADDRESS);
		Mainframe_GlobalFunctionLib.sendText(13,11,FICITY);
		Mainframe_GlobalFunctionLib.sendText(13,44,FISTATE);
		Mainframe_GlobalFunctionLib.sendText(13,51,FIZIP);
		Mainframe_GlobalFunctionLib.sendText(14,45,FIPHONE);
		Mainframe_GlobalFunctionLib.sendText(16,22,SIGNATUREAUTHORITY);
		FunctionalLibrary.pressEnter();
		Mainframe_GlobalFunctionLib.sendText(13,2,"9");
		FunctionalLibrary.pressEnter();
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Mainframe_GlobalFunctionLib.pressKey("F4");
		Mainframe_GlobalFunctionLib.pressKey("F6");
		
		
		Mainframe_GlobalFunctionLib.sendText(12,20,FIFORMTYPE);
		Mainframe_GlobalFunctionLib.sendText(13,20,FIFORMTYPEDESCRIP);
		FunctionalLibrary.pressEnter();
		Mainframe_GlobalFunctionLib.sendText(10,2,"1");
		FunctionalLibrary.pressEnter();
		Mainframe_GlobalFunctionLib.sendText(13,26,FIFIRSTCHECKNUMBER);
		Mainframe_GlobalFunctionLib.sendText(14,26,FILASTCHECKNUMBER);
		Mainframe_GlobalFunctionLib.sendText(18,43,"Y");
		FunctionalLibrary.pressEnter();
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		
		
	}*/
	
	@When("^I enter \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_enter(String RoutingNbr, String FINAME, String FICODE, String FIADDRESS, String FICITY, String FISTATE, String FIZIP, String FIPHONE, String FIACCOUNT, String FIACCNAME, String FIOWNERTYPE, String Payer, String FIACCTYPE, String SIGNATUREAUTHORITY, String FIFORMTYPE, String FIFORMTYPEDESCRIP, String FIFIRSTCHECKNUMBER, String FILASTCHECKNUMBER) throws Throwable {
	   
		Mainframe_GlobalFunctionLib.sendText(8,20,RoutingNbr);
		Mainframe_GlobalFunctionLib.sendText(9,20,FINAME);
		
		Mainframe_GlobalFunctionLib.sendText(10,20,FICODE);
		FunctionalLibrary.pressEnter();
		Mainframe_GlobalFunctionLib.sendText(8,9,FIADDRESS);
		Mainframe_GlobalFunctionLib.sendText(9,10,FICITY);
		Mainframe_GlobalFunctionLib.sendText(9,42,FISTATE);
		Mainframe_GlobalFunctionLib.sendText(9,49,FIZIP);
		Mainframe_GlobalFunctionLib.sendText(10,42,FIPHONE);
		FunctionalLibrary.pressEnter();
		//Mainframe_GlobalFunctionLib.sendText(16,64,"Y");
		//FunctionalLibrary.pressEnter();
		Mainframe_GlobalFunctionLib.sendText(4,5,RoutingNbr);
		FunctionalLibrary.pressEnter();
		Mainframe_GlobalFunctionLib.sendText(9,2,"8");
		FunctionalLibrary.pressEnter();
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Mainframe_GlobalFunctionLib.sendText(8,14,FIACCOUNT);
		Mainframe_GlobalFunctionLib.sendText(9,14,FIACCNAME);
		Mainframe_GlobalFunctionLib.sendText(10,14,FIOWNERTYPE);
		Mainframe_GlobalFunctionLib.sendText(11,14,Payer);
		FunctionalLibrary.pressEnter();
		Mainframe_GlobalFunctionLib.sendText(9,14,FIACCTYPE);
		Mainframe_GlobalFunctionLib.sendText(12,9,FIADDRESS);
		Mainframe_GlobalFunctionLib.sendText(13,11,FICITY);
		Mainframe_GlobalFunctionLib.sendText(13,44,FISTATE);
		Mainframe_GlobalFunctionLib.sendText(13,51,FIZIP);
		Mainframe_GlobalFunctionLib.sendText(14,45,FIPHONE);
		Mainframe_GlobalFunctionLib.sendText(16,22,SIGNATUREAUTHORITY);
		FunctionalLibrary.pressEnter();
		Mainframe_GlobalFunctionLib.sendText(13,2,"9");
		FunctionalLibrary.pressEnter();
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Mainframe_GlobalFunctionLib.pressKey("F4");
		Mainframe_GlobalFunctionLib.pressKey("F6");
		
		
		Mainframe_GlobalFunctionLib.sendText(12,20,FIFORMTYPE);
		Mainframe_GlobalFunctionLib.sendText(13,20,FIFORMTYPEDESCRIP);
		FunctionalLibrary.pressEnter();
		Mainframe_GlobalFunctionLib.sendText(10,2,"1");
		FunctionalLibrary.pressEnter();
		Mainframe_GlobalFunctionLib.sendText(13,34,FIFIRSTCHECKNUMBER);
		Mainframe_GlobalFunctionLib.sendText(14,33,FILASTCHECKNUMBER);
		//Mainframe_GlobalFunctionLib.sendText(11,19,FIFORMTYPE);
		FunctionalLibrary.pressEnter();
		Mainframe_GlobalFunctionLib.sendText(18,43,"Y");
		//FunctionalLibrary.pressEnter();
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		
	}
	


	/*public void i_send_to_the(String Payer, String PayerProfileType, String PayerClientNagativeDue, String Process, String MethodOfPayment, String FIACCOUNT, String FIFORMTYPE, String Effdate, String MaxPaymentAmt) throws Throwable {
	    
		Mainframe_GlobalFunctionLib.sendText(4,6,Payer);
		FunctionalLibrary.pressEnter();
		
		Mainframe_GlobalFunctionLib.sendText(11,2,"7");
		FunctionalLibrary.pressEnter();
		
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Mainframe_GlobalFunctionLib.sendText(7,21,PayerProfileType);
		Mainframe_GlobalFunctionLib.sendText(8,21,"*");
		Mainframe_GlobalFunctionLib.sendText(9,21,"*");
		FunctionalLibrary.pressEnter();
		Mainframe_GlobalFunctionLib.sendText(13,21,PayerClientNagativeDue);
		Mainframe_GlobalFunctionLib.sendText(14,26,Process);
		Mainframe_GlobalFunctionLib.sendText(15,26,MethodOfPayment);
		Mainframe_GlobalFunctionLib.sendText(17,26,FIACCOUNT);
		FunctionalLibrary.pressEnter();
		Mainframe_GlobalFunctionLib.sendText(18,26,FIFORMTYPE);
		FunctionalLibrary.pressEnter();
		Mainframe_GlobalFunctionLib.sendText(16,64,"Y");
		Mainframe_GlobalFunctionLib.sendText(6,72,Effdate + "  ");
		
		FunctionalLibrary.pressEnter();
		Mainframe_GlobalFunctionLib.sendText(16,64,"Y");
		Mainframe_GlobalFunctionLib.pressKey("F16");
		Mainframe_GlobalFunctionLib.sendText(11,26,MaxPaymentAmt);
		Mainframe_GlobalFunctionLib.sendText(12,26,"N");
		FunctionalLibrary.pressEnter();
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F3");
	}*/
	
	@When("^I send to the \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_send_to_the(String Payer, String PayerProfileType, String PayerClientNagativeDue, String Process, String MethodOfPayment, String FIACCOUNT, String FIFORMTYPE, String Effdate, String MaxPaymentAmt) throws Throwable {
		Mainframe_GlobalFunctionLib.sendText(4,6,Payer);
		FunctionalLibrary.pressEnter();
		
		Mainframe_GlobalFunctionLib.sendText(11,2,"7");
		FunctionalLibrary.pressEnter();
		
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Mainframe_GlobalFunctionLib.sendText(7,21,PayerProfileType);
		Mainframe_GlobalFunctionLib.sendText(8,21,"*");
		Mainframe_GlobalFunctionLib.sendText(9,21,"*");
		FunctionalLibrary.pressEnter();
		Mainframe_GlobalFunctionLib.sendText(13,21,PayerClientNagativeDue);
		Mainframe_GlobalFunctionLib.sendText(14,26,Process);
		Mainframe_GlobalFunctionLib.sendText(15,26,MethodOfPayment);
		Mainframe_GlobalFunctionLib.sendText(17,26,FIACCOUNT);
		FunctionalLibrary.pressEnter();
		Mainframe_GlobalFunctionLib.sendText(18,26,FIFORMTYPE);
		FunctionalLibrary.pressEnter();
		Mainframe_GlobalFunctionLib.sendText(16,64,"Y");
		Mainframe_GlobalFunctionLib.sendText(6,72,Effdate + "  ");
		
		FunctionalLibrary.pressEnter();
		Mainframe_GlobalFunctionLib.sendText(16,64,"Y");
		Mainframe_GlobalFunctionLib.pressKey("F16");
		Mainframe_GlobalFunctionLib.sendText(11,26,MaxPaymentAmt);
		Mainframe_GlobalFunctionLib.sendText(12,26,"N");
		FunctionalLibrary.pressEnter();
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		
		
	}
	
	/* @When("^I enter \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
	public void i_enter(String Payer, String CarrierID, String AccountID, String GroupID) throws Throwable {
		Mainframe_GlobalFunctionLib.sendText(4,6,Payer);
		FunctionalLibrary.pressEnter();
		
		Mainframe_GlobalFunctionLib.sendText(11,2,"9");
		FunctionalLibrary.pressEnter();
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Mainframe_GlobalFunctionLib.sendText(11,24,CarrierID);
		Mainframe_GlobalFunctionLib.sendText(12,24,AccountID);
		Mainframe_GlobalFunctionLib.sendText(13,24,GroupID);
		Mainframe_GlobalFunctionLib.sendText(14,24,"*");
		Mainframe_GlobalFunctionLib.sendText(15,24,"*");
		FunctionalLibrary.pressEnter();
		Mainframe_GlobalFunctionLib.sendText(17,23,"Y");
		Mainframe_GlobalFunctionLib.sendText(17,44,"010118");
		Mainframe_GlobalFunctionLib.sendText(17,65,"010139");
		Mainframe_GlobalFunctionLib.sendText(18,32,"M");
		Mainframe_GlobalFunctionLib.sendText(19,23,"Y");
		Mainframe_GlobalFunctionLib.sendText(19,44,"010118");
		Mainframe_GlobalFunctionLib.sendText(19,65,"010139");
		Mainframe_GlobalFunctionLib.sendText(20,32,"P");
		FunctionalLibrary.pressEnter();
		Mainframe_GlobalFunctionLib.sendText(12,2,"7");
		FunctionalLibrary.pressEnter();
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Mainframe_GlobalFunctionLib.sendText(13,22,"P");
		FunctionalLibrary.pressEnter();
		Mainframe_GlobalFunctionLib.sendText(13,21,PayerClientNagativeDue);
		Mainframe_GlobalFunctionLib.sendText(14,26,Process);
		Mainframe_GlobalFunctionLib.sendText(15,26,MethodOfPayment);
		Mainframe_GlobalFunctionLib.sendText(17,26,FIACCOUNT);
		FunctionalLibrary.pressEnter();
		Mainframe_GlobalFunctionLib.sendText(18,26,FIFORMTYPE);
		FunctionalLibrary.pressEnter();
		Mainframe_GlobalFunctionLib.sendText(16,64,"Y");
		Mainframe_GlobalFunctionLib.sendText(6,72,Effdate + "  ");
		
		FunctionalLibrary.pressEnter();
		Mainframe_GlobalFunctionLib.sendText(16,64,"Y");
		Mainframe_GlobalFunctionLib.pressKey("F16");
		Mainframe_GlobalFunctionLib.sendText(11,26,MaxPaymentAmt);
		Mainframe_GlobalFunctionLib.sendText(12,26,"N");
		FunctionalLibrary.pressEnter();
		
		
		
		
		
		//Mainframe_GlobalFunctionLib.sendText(13,21,PayerClientNagativeDue);
		//Mainframe_GlobalFunctionLib.sendText(14,26,Process);
		//Mainframe_GlobalFunctionLib.sendText(15,26,MethodOfPayment);
		//Mainframe_GlobalFunctionLib.sendText(17,26,FIACCOUNT);
		//Mainframe_GlobalFunctionLib.pressKey(17,26,"F4");
		FunctionalLibrary.pressEnter();
		
		FunctionalLibrary.pressEnter();
		
		
	}*/
	
	@When("^I enter \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_enter(String Payer, String CarrierID, String AccountID, String GroupID, String PayerClientNagativeDue, String Process, String MethodOfPayment, String FIACCOUNT, String FIFORMTYPE, String Effdate, String MaxPaymentAmt) throws Throwable {
		Mainframe_GlobalFunctionLib.sendText(4,6,Payer);
		FunctionalLibrary.pressEnter();
		
		Mainframe_GlobalFunctionLib.sendText(11,2,"9");
		FunctionalLibrary.pressEnter();
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Mainframe_GlobalFunctionLib.sendText(11,24,CarrierID);
		Mainframe_GlobalFunctionLib.sendText(12,24,AccountID);
		Mainframe_GlobalFunctionLib.sendText(13,24,GroupID);
		Mainframe_GlobalFunctionLib.sendText(14,24,"*");
		Mainframe_GlobalFunctionLib.sendText(15,24,"*");
		FunctionalLibrary.pressEnter();
		Mainframe_GlobalFunctionLib.sendText(17,23,"Y");
		Mainframe_GlobalFunctionLib.sendText(17,44,"010118");
		Mainframe_GlobalFunctionLib.sendText(17,65,"010139");
		Mainframe_GlobalFunctionLib.sendText(18,32,"M");
		Mainframe_GlobalFunctionLib.sendText(19,23,"Y");
		Mainframe_GlobalFunctionLib.sendText(19,44,"010118");
		Mainframe_GlobalFunctionLib.sendText(19,65,"010139");
		Mainframe_GlobalFunctionLib.sendText(20,32,"P");
		FunctionalLibrary.pressEnter();
		Mainframe_GlobalFunctionLib.sendText(12,2,"7");
		FunctionalLibrary.pressEnter();
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Mainframe_GlobalFunctionLib.sendText(13,22,"P");
		FunctionalLibrary.pressEnter();
		System.out.println("Claim is created1");
		Mainframe_GlobalFunctionLib.sendText(13,21,PayerClientNagativeDue);
		Mainframe_GlobalFunctionLib.sendText(14,26,Process);
		Mainframe_GlobalFunctionLib.sendText(15,26,MethodOfPayment);
		Mainframe_GlobalFunctionLib.sendText(17,26,FIACCOUNT);
		FunctionalLibrary.pressEnter();
		Mainframe_GlobalFunctionLib.sendText(18,26,FIFORMTYPE);
		FunctionalLibrary.pressEnter();
		Mainframe_GlobalFunctionLib.sendText(16,64,"Y");
		Mainframe_GlobalFunctionLib.sendText(15,2,"2");
		FunctionalLibrary.pressEnter();
		Mainframe_GlobalFunctionLib.sendText(6,72, "        ");
		Mainframe_GlobalFunctionLib.sendText(6,72,Effdate);
		
		FunctionalLibrary.pressEnter();
		
		Mainframe_GlobalFunctionLib.sendText(16,64,"Y");
		System.out.println("Claim is created12");
		Mainframe_GlobalFunctionLib.pressKey("F16");
		Mainframe_GlobalFunctionLib.sendText(11,26,MaxPaymentAmt);
		Mainframe_GlobalFunctionLib.sendText(12,26,"N");
		FunctionalLibrary.pressEnter();
		System.out.println("Claim is created2");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		//Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.sendText(11,2,"7");
		//System.out.println("Claim is created3");
		FunctionalLibrary.pressEnter();
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.sendText(21,7,"cct700");
		FunctionalLibrary.pressEnter();
		Mainframe_GlobalFunctionLib.sendText(21,7,"1");
		FunctionalLibrary.pressEnter();
		Mainframe_GlobalFunctionLib.sendText(21,7,"1");
		FunctionalLibrary.pressEnter();
		//Mainframe_GlobalFunctionLib.sendText(7,33,"MMDDCCYY");
		//FunctionalLibrary.pressEnter();
		
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.sendText(21,7,"cct600");
		FunctionalLibrary.pressEnter();
		Mainframe_GlobalFunctionLib.sendText(21,7,"9");
		FunctionalLibrary.pressEnter();
		Mainframe_GlobalFunctionLib.sendText(21,7,"1");
		FunctionalLibrary.pressEnter();
		Mainframe_GlobalFunctionLib.sendText(21,7,"7");
		FunctionalLibrary.pressEnter();
		Mainframe_GlobalFunctionLib.sendText(21,7,"1");
		FunctionalLibrary.pressEnter();
		Mainframe_GlobalFunctionLib.pressKey("F16");
		Mainframe_GlobalFunctionLib.sendText(4,5,"PAYRSN003282");
		FunctionalLibrary.pressEnter();
		Mainframe_GlobalFunctionLib.sendText(11,2,"8");
		FunctionalLibrary.pressEnter();
		Mainframe_GlobalFunctionLib.sendText(11,2,"5");
		FunctionalLibrary.pressEnter();
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.sendText(11,2,"8");
		FunctionalLibrary.pressEnter();
		Mainframe_GlobalFunctionLib.sendText(12,2,"5");
		FunctionalLibrary.pressEnter();
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.sendText(21,7,"9");
		FunctionalLibrary.pressEnter();
		Mainframe_GlobalFunctionLib.sendText(21,7,"1");
		FunctionalLibrary.pressEnter();
		
		
		
		
		Mainframe_GlobalFunctionLib.sendText(21,7,"3");
		FunctionalLibrary.pressEnter();
		Mainframe_GlobalFunctionLib.sendText(21,7,"11");
		FunctionalLibrary.pressEnter();
		Mainframe_GlobalFunctionLib.sendText(21,7,"2");
		FunctionalLibrary.pressEnter();
		Mainframe_GlobalFunctionLib.click(9, 32);
		Mainframe_GlobalFunctionLib.pressKey("F4");
		Mainframe_GlobalFunctionLib.pressKey("F16");
		Mainframe_GlobalFunctionLib.sendText(4,5,"PAYRSN003282");
		FunctionalLibrary.pressEnter();
		Mainframe_GlobalFunctionLib.sendText(10,2,"1");
		FunctionalLibrary.pressEnter();
		Mainframe_GlobalFunctionLib.click(11, 32);
		Mainframe_GlobalFunctionLib.pressKey("F4");
		Mainframe_GlobalFunctionLib.pressKey("F8");
		Mainframe_GlobalFunctionLib.sendText(4,5,"CAL_PHARMACY");
		FunctionalLibrary.pressEnter();
		Mainframe_GlobalFunctionLib.sendText(9,2,"1");
		FunctionalLibrary.pressEnter();
		Mainframe_GlobalFunctionLib.sendText(7,32,"PRAK");
		Mainframe_GlobalFunctionLib.sendText(7,57,"NIMP");
		Mainframe_GlobalFunctionLib.sendText(13,49,"I");
		Mainframe_GlobalFunctionLib.sendText(15,49,"I");
		Mainframe_GlobalFunctionLib.pressKey("F6");
		
		
		
	}
	}
	

