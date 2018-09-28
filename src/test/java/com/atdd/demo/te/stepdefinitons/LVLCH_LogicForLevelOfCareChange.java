package com.atdd.demo.te.stepdefinitons;

import com.atdd.te.screenHelpers.FunctionalLibrary;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import com.cucumber.listener.Reporter;
import com.optumrx.autofusion.core.te.util.Mainframe_GlobalFunctionLib;
import com.optumrx.autofusion.core.te.util.Screenshot;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LVLCH_LogicForLevelOfCareChange {

	@When("^I submit to claim with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_submit_to_claim_with(String BIN, String ProcCtrl, String Group, String PharmacyID, String RxNo, String Refill, String FillDate, String MemberID, String ProductID, String DspQty, String DS, String PSC, String Cost, String PRC) throws Throwable {
	    
		    
		    PartDmedicareSubmitClaim(BIN, ProcCtrl,Group,PharmacyID,RxNo,Refill,FillDate,MemberID,ProductID,DspQty, DS,PSC,Cost, PRC);
			Mainframe_GlobalFunctionLib.sendText(4, 23,"8");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.pressKey("F7");
			
		
	}
	
	
	@When("^I submit to claim for \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_submit_to_claim_for(String BIN, String ProcCtrl, String Group, String PharmacyID, String RxNo, String Refill, String FillDate, String MemberID, String ProductID, String DspQty, String DS, String PSC, String Cost, String PRC) throws Throwable {
	  
		PartDmedicareSubmitClaim(BIN, ProcCtrl,Group,PharmacyID,RxNo,Refill,FillDate,MemberID,ProductID,DspQty, DS,PSC,Cost, PRC);
		Mainframe_GlobalFunctionLib.sendText(4, 23,"7");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
			
			
	}
	
	
	
	@When("^I submit to claim for DUR info \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_submit_to_claim_for_DUR_info(String BIN, String ProcCtrl, String Group, String PharmacyID, String RxNo, String Refill, String FillDate, String MemberID, String ProductID, String DspQty, String DS, String PSC, String Cost, String PRC) throws Throwable {
	    
		
		    PartDmedicareSubmitClaim(BIN, ProcCtrl,Group,PharmacyID,RxNo,Refill,FillDate,MemberID,ProductID,DspQty, DS,PSC,Cost, PRC);
			Mainframe_GlobalFunctionLib.sendText(4, 23,"5");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
				
		
	}
	
	@When("^I send values for member medicare setup \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_send_values_for_member_medicare_setup(String FromDate, String ThruDate, String SupplyType, String SupplyID, String MMDFromDate, String MMDThruDate, String Contract, String SubsidyLevel, String CopayCat) throws Throwable {
	    
		
		
        Mainframe_GlobalFunctionLib.sendText(4, 20,"10");
		
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		
		Mainframe_GlobalFunctionLib.sendText(4,20 , "3");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Mainframe_GlobalFunctionLib.sendText(10, 12,FromDate);
		Mainframe_GlobalFunctionLib.sendText(10, 33,ThruDate );
		Mainframe_GlobalFunctionLib.sendText(12, 19,SupplyType );
		Mainframe_GlobalFunctionLib.sendText(13, 19,SupplyID );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		
		
		Mainframe_GlobalFunctionLib.sendText(4, 20,"17");
		
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		
		Mainframe_GlobalFunctionLib.sendText(4,20 , "4");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Mainframe_GlobalFunctionLib.sendText(10, 17,MMDFromDate);
		Mainframe_GlobalFunctionLib.sendText(10, 41,MMDThruDate );
		Mainframe_GlobalFunctionLib.click(12, 20);
		Mainframe_GlobalFunctionLib.pressKey("F4");
		Mainframe_GlobalFunctionLib.sendText(4, 5,Contract);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(10, 2,"1" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(16, 22,SubsidyLevel );
		Mainframe_GlobalFunctionLib.sendText(18, 24,CopayCat );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
	}
		
	
	@When("^I search the help text with Plan \"([^\"]*)\"$")
	public void i_search_the_help_text_with_Plan(String Plan) throws Throwable {
		Mainframe_GlobalFunctionLib.sendText(4, 5,Plan);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(11, 2,"2");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F7");
		Mainframe_GlobalFunctionLib.sendText(7, 21,"3");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(15, 12,"5");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(12, 2,"2");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F7");
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Mainframe_GlobalFunctionLib.click(14, 19);
		Robot r=new Robot();
			r.keyPress(KeyEvent.VK_F1);
			r.keyRelease(KeyEvent.VK_F1);
			Thread.sleep(3000);
		Mainframe_GlobalFunctionLib.pressKey("PageDown");
		Mainframe_GlobalFunctionLib.pressKey("PageDown");
		Mainframe_GlobalFunctionLib.pressKey("PageDown");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.sendText(17, 2,"2");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.click(14, 19);
		Robot r1=new Robot();
		  r1.keyPress(KeyEvent.VK_F1);
		  r1.keyRelease(KeyEvent.VK_F1);
		Thread.sleep(3000);
		Mainframe_GlobalFunctionLib.pressKey("PageDown");
		Mainframe_GlobalFunctionLib.pressKey("PageDown");
		Mainframe_GlobalFunctionLib.pressKey("PageDown");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.sendText(17, 2,"5");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.click(14, 19);
		Robot r2=new Robot();
			r2.keyPress(KeyEvent.VK_F1);
		    r2.keyRelease(KeyEvent.VK_F1);
		Thread.sleep(3000);
		Mainframe_GlobalFunctionLib.pressKey("PageDown");
		Mainframe_GlobalFunctionLib.pressKey("PageDown");
		Mainframe_GlobalFunctionLib.pressKey("PageDown");
		
		
		
		
	}
	
	
	@When("^I send \"([^\"]*)\", \"([^\"]*)\"to search help text$")
	public void i_send_to_search_help_text(String PMUid, String Plan) throws Throwable {
		
		Mainframe_GlobalFunctionLib.sendText(21, 7,"13");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(21, 7,"1");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Mainframe_GlobalFunctionLib.sendText(15, 23,PMUid);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(16, 64,"Y");
		Mainframe_GlobalFunctionLib.sendText(9, 24,"X");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(17, 14,"7");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.click(7, 14);
		Mainframe_GlobalFunctionLib.pressKey("F4");
		Mainframe_GlobalFunctionLib.sendText(4, 5,Plan);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(10, 2,"1");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.click(7, 47);
		Mainframe_GlobalFunctionLib.pressKey("F4");
		Mainframe_GlobalFunctionLib.sendText(4, 5,Plan);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(10, 2,"1");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(16, 64,"Y");
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Mainframe_GlobalFunctionLib.sendText(13, 24,"01");
		Mainframe_GlobalFunctionLib.sendText(14, 24,"**");
		Mainframe_GlobalFunctionLib.sendText(15, 24,"010191");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(16, 24,"1");
		Mainframe_GlobalFunctionLib.sendText(17, 24,"A");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.click(16, 54);
		Robot r1=new Robot();
		r1.keyPress(KeyEvent.VK_F1);
		r1.keyRelease(KeyEvent.VK_F1);
		Mainframe_GlobalFunctionLib.pressKey("PageDown");
		Mainframe_GlobalFunctionLib.pressKey("PageDown");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Mainframe_GlobalFunctionLib.sendText(13, 24,"01");
		Mainframe_GlobalFunctionLib.sendText(14, 24,"**");
		Mainframe_GlobalFunctionLib.sendText(15, 24,"010191");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(16, 24,"1");
		Mainframe_GlobalFunctionLib.sendText(17, 24,"R");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.click(16, 54);
		Robot r2=new Robot();
		r2.keyPress(KeyEvent.VK_F1);
		r2.keyRelease(KeyEvent.VK_F1);
		Thread.sleep(3000);
		Mainframe_GlobalFunctionLib.pressKey("PageDown");
		Mainframe_GlobalFunctionLib.pressKey("PageDown");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Mainframe_GlobalFunctionLib.sendText(13, 24,"01");
		Mainframe_GlobalFunctionLib.sendText(14, 24,"**");
		Mainframe_GlobalFunctionLib.sendText(15, 24,"010191");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(16, 24,"1");
		Mainframe_GlobalFunctionLib.sendText(17, 24,"A");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.sendText(14, 2,"5");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.click(16, 54);
		Robot r3=new Robot();
		r3.keyPress(KeyEvent.VK_F1);
		r3.keyRelease(KeyEvent.VK_F1);
		Thread.sleep(3000);
		Mainframe_GlobalFunctionLib.pressKey("PageDown");
		Mainframe_GlobalFunctionLib.pressKey("PageDown");
		
			
	
		
	  
	}
	
	public void PartDmedicareSubmitClaim(String BIN, String ProcCtrl, String Group, String PharmacyID, String RxNo, String Refill, String FillDate, String MemberID, String ProductID, String DspQty, String DS, String PSC, String Cost, String PRC) throws Throwable{
		
		Mainframe_GlobalFunctionLib.sendText(21, 7 , "3");
	    Mainframe_GlobalFunctionLib.pressKey("Enter");
	    Mainframe_GlobalFunctionLib.sendText(21, 7,"2");
	    Mainframe_GlobalFunctionLib.pressKey("Enter");
	    Mainframe_GlobalFunctionLib.sendText(21, 7 ,"1" );
	    Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Mainframe_GlobalFunctionLib.sendText(11, 14,BIN);
		Mainframe_GlobalFunctionLib.sendText(11, 41,ProcCtrl);
		Mainframe_GlobalFunctionLib.sendText(11, 59,Group);
		Mainframe_GlobalFunctionLib.sendText(12, 14,PharmacyID);
		Mainframe_GlobalFunctionLib.sendText(12, 41,RxNo);
		Mainframe_GlobalFunctionLib.sendText(12, 59,Refill);
		Mainframe_GlobalFunctionLib.sendText(14, 14, FillDate + "    ");
		Mainframe_GlobalFunctionLib.click(14, 41);
		Mainframe_GlobalFunctionLib.pressKey("F4");
		Mainframe_GlobalFunctionLib.sendText(3,4,MemberID);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(8, 2,"1");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.click(11, 20);
		Mainframe_GlobalFunctionLib.pressKey("F4");
		Mainframe_GlobalFunctionLib.pressKey("F16");
		Mainframe_GlobalFunctionLib.sendText(4, 4,ProductID);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(9, 2,"1");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(12, 11,DspQty);
		Mainframe_GlobalFunctionLib.sendText(12, 26,DS );
		Mainframe_GlobalFunctionLib.sendText(14, 6,PSC );
		Mainframe_GlobalFunctionLib.sendText(10, 47,"         ");
		Mainframe_GlobalFunctionLib.sendText(10, 47,Cost);
		Mainframe_GlobalFunctionLib.sendText(7, 68,PRC);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Mainframe_GlobalFunctionLib.pressKey("F7");
		
		Mainframe_GlobalFunctionLib.pressKey("F7");
		
	}
	


}


