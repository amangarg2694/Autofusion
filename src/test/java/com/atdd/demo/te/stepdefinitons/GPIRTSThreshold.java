package com.atdd.demo.te.stepdefinitons;

import java.util.concurrent.TimeUnit;

import com.atdd.te.screenHelpers.FunctionalLibrary;
import com.cucumber.listener.Reporter;
import com.optumrx.autofusion.core.te.util.Mainframe_GlobalFunctionLib;
import com.optumrx.autofusion.core.te.util.Screenshot;

import cucumber.api.java.en.When;

public class GPIRTSThreshold {

	@When("^I submit a manual claim with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_submit_a_manual_claim_with(String bin, String proc, String group, String pharmacyID, String rxNbr, String refill, String fillDate, String memberID, String productID, String dspQty, String ds, String psc, String cost, String WrtnDate, String RefillDate) throws Throwable {
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
			Mainframe_GlobalFunctionLib.sendText("13", "010",WrtnDate );
			Mainframe_GlobalFunctionLib.sendText("14", "006",psc );
			Mainframe_GlobalFunctionLib.sendText("14", "020","00" );
			Mainframe_GlobalFunctionLib.sendText("14", "033","0" );
			Mainframe_GlobalFunctionLib.sendText("10", "047","         " );
			Mainframe_GlobalFunctionLib.sendText("10", "047",cost );
			Mainframe_GlobalFunctionLib.sendText("11", "047","10" );
			Mainframe_GlobalFunctionLib.sendText("20", "047","110" );
			/*Mainframe_GlobalFunctionLib.pressKey("PageDown");
			Mainframe_GlobalFunctionLib.click(4, 11);
			for(int i=0;i<4;i++)
			{
				Mainframe_GlobalFunctionLib.PressTabKey();
			}
			Mainframe_GlobalFunctionLib.sendText("04", "055","5" );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			*/
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
			Mainframe_GlobalFunctionLib.sendText("14", "020","00" );
			Mainframe_GlobalFunctionLib.sendText("14", "033","0" );
			Mainframe_GlobalFunctionLib.sendText("10", "047","         " );
			Mainframe_GlobalFunctionLib.sendText("10", "047",cost );
			Mainframe_GlobalFunctionLib.sendText("11", "047","10" );
			Mainframe_GlobalFunctionLib.sendText("20", "047","110" );
			/*Mainframe_GlobalFunctionLib.pressKey("PageDown");
			Mainframe_GlobalFunctionLib.click(4, 11);
			for(int i=0;i<4;i++)
			{
				Mainframe_GlobalFunctionLib.PressTabKey();
			}
			Mainframe_GlobalFunctionLib.sendText("04", "055","5" );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			*/
			//Mainframe_GlobalFunctionLib.pressKey("F6");
            
		}
		
			System.out.println("Claim is created");	
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			Mainframe_GlobalFunctionLib.pressKey("F6");
			 Thread.sleep(2000);
			 Mainframe_GlobalFunctionLib.pressKey("F7");
			 Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			 TimeUnit.SECONDS.sleep(5);
			 Mainframe_GlobalFunctionLib.pressKey("F12");
			 TimeUnit.SECONDS.sleep(3);
			 String rxnum = Mainframe_GlobalFunctionLib.getText(5, 29).trim();
			 Long rxnumb = Long.parseLong(rxnum);
			 Long rxnumber = rxnumb+1;
			 String rxno = String.valueOf(rxnumber);
			 Mainframe_GlobalFunctionLib.sendText("05","029", rxno);
			 Mainframe_GlobalFunctionLib.sendText("04","065","          ");
			 Mainframe_GlobalFunctionLib.sendText("04","065",RefillDate);
			 Mainframe_GlobalFunctionLib.pressKey("Enter");
			 Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			 Mainframe_GlobalFunctionLib.pressKey("F6");
			 Mainframe_GlobalFunctionLib.pressKey("F7");
			 Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	}
	}
	
	


