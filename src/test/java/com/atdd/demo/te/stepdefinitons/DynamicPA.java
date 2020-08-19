package com.atdd.demo.te.stepdefinitons;

import com.optumrx.autofusion.core.te.util.Mainframe_GlobalFunctionLib;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DynamicPA {
	
	
	String rxclaim_number;
	String drug_status;
	String MNO_MGO;
	String MPP;
	
	@And("^I add a new Dynamic PA \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void add_new_dynamic_PA(String CarrierID,String Sbm_PA2,String description,String type,String reasoncode,String agentcode,String PA_NDC_list,String PA_GPI_list,String productId, String fromdate, String thrudate) throws Throwable{
		Mainframe_GlobalFunctionLib.sendText(21, 7, "4");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(21, 7, "4");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(21, 7, "1");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Mainframe_GlobalFunctionLib.sendText(4, 25, CarrierID);
		Mainframe_GlobalFunctionLib.sendText(5, 25, "1");
		Mainframe_GlobalFunctionLib.sendText(5, 27, Sbm_PA2);
		Mainframe_GlobalFunctionLib.sendText(6, 14, description);
		Mainframe_GlobalFunctionLib.sendText(7, 36, "999");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(5, 15, "1");
		Mainframe_GlobalFunctionLib.sendText(7, 15, type);
		switch(type) {
		case "N":
			Mainframe_GlobalFunctionLib.sendText(8, 31, "D");
			Mainframe_GlobalFunctionLib.sendText(9, 15, "0");
			Mainframe_GlobalFunctionLib.sendText(9, 31, "D");
			Mainframe_GlobalFunctionLib.sendText(10, 15, reasoncode);
			Mainframe_GlobalFunctionLib.sendText(11, 15, agentcode);
			Mainframe_GlobalFunctionLib.sendText(12, 15, "N");
			Mainframe_GlobalFunctionLib.sendText(13, 15, "Y");
			Mainframe_GlobalFunctionLib.sendText(14, 18, "N");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.pressKey("F12");
			Mainframe_GlobalFunctionLib.pressKey("F12");
			Mainframe_GlobalFunctionLib.sendText(21, 7, "CCT600");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			break;
	    case "G":
			Mainframe_GlobalFunctionLib.sendText(8, 31, "D");
			Mainframe_GlobalFunctionLib.sendText(9, 15, "0");
			Mainframe_GlobalFunctionLib.sendText(9, 31, "D");
			Mainframe_GlobalFunctionLib.sendText(10, 15, reasoncode);
			Mainframe_GlobalFunctionLib.sendText(11, 15, agentcode);
			Mainframe_GlobalFunctionLib.sendText(12, 15, "N");
			Mainframe_GlobalFunctionLib.sendText(13, 15, "Y");
			Mainframe_GlobalFunctionLib.sendText(14, 18, "N");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.pressKey("F12");
			Mainframe_GlobalFunctionLib.pressKey("F12");
			Mainframe_GlobalFunctionLib.sendText(21, 7, "CCT600");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			break;
		case "1":
			Mainframe_GlobalFunctionLib.sendText(8, 31, "D");
			Mainframe_GlobalFunctionLib.sendText(9, 15, "0");
			Mainframe_GlobalFunctionLib.sendText(9, 31, "D");
			Mainframe_GlobalFunctionLib.sendText(10, 15, reasoncode);
			Mainframe_GlobalFunctionLib.sendText(11, 15, agentcode);
			Mainframe_GlobalFunctionLib.sendText(12, 15, "N");
			Mainframe_GlobalFunctionLib.sendText(13, 15, "Y");
			Mainframe_GlobalFunctionLib.sendText(14, 18, "N");
			Mainframe_GlobalFunctionLib.sendText(15, 14, PA_NDC_list);
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.pressKey("F12");
			Mainframe_GlobalFunctionLib.pressKey("F12");
			Mainframe_GlobalFunctionLib.sendText(21, 7, "CCT600");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			break;
		case "2":
			Mainframe_GlobalFunctionLib.sendText(8, 31, "D");
			Mainframe_GlobalFunctionLib.sendText(9, 15, "0");
			Mainframe_GlobalFunctionLib.sendText(9, 31, "D");
			Mainframe_GlobalFunctionLib.sendText(10, 15, reasoncode);
			Mainframe_GlobalFunctionLib.sendText(11, 15, agentcode);
			Mainframe_GlobalFunctionLib.sendText(12, 15, "N");
			Mainframe_GlobalFunctionLib.sendText(13, 15, "Y");
			Mainframe_GlobalFunctionLib.sendText(14, 18, "N");
			Mainframe_GlobalFunctionLib.sendText(15, 14, PA_GPI_list);
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.pressKey("F12");
			Mainframe_GlobalFunctionLib.pressKey("F12");
			Mainframe_GlobalFunctionLib.sendText(21, 7, "CCT600");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			break;
		case "3":
			Mainframe_GlobalFunctionLib.sendText(8, 31, "D");
			Mainframe_GlobalFunctionLib.sendText(9, 15, "0");
			Mainframe_GlobalFunctionLib.sendText(9, 31, "D");
			Mainframe_GlobalFunctionLib.sendText(10, 15, reasoncode);
			Mainframe_GlobalFunctionLib.sendText(11, 15, agentcode);
			Mainframe_GlobalFunctionLib.sendText(12, 15, "N");
			Mainframe_GlobalFunctionLib.sendText(13, 15, "Y");
			Mainframe_GlobalFunctionLib.sendText(14, 18, "N");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.pressKey("F9");
			Mainframe_GlobalFunctionLib.pressKey("F6");
			Mainframe_GlobalFunctionLib.pressKey("F16");
			Mainframe_GlobalFunctionLib.sendText(7, 4, productId);
			Mainframe_GlobalFunctionLib.sendText(12, 2, "1");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.pressKey("F12");
			Mainframe_GlobalFunctionLib.pressKey("F12");
			Mainframe_GlobalFunctionLib.pressKey("F12");
			Mainframe_GlobalFunctionLib.pressKey("F12");
			Mainframe_GlobalFunctionLib.sendText(21, 7, "CCT600");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			break;
		case "4":
			Mainframe_GlobalFunctionLib.sendText(8, 31, "D");
			Mainframe_GlobalFunctionLib.sendText(9, 15, "0");
			Mainframe_GlobalFunctionLib.sendText(9, 31, "D");
			Mainframe_GlobalFunctionLib.sendText(10, 15, reasoncode);
			Mainframe_GlobalFunctionLib.sendText(11, 15, agentcode);
			Mainframe_GlobalFunctionLib.sendText(12, 15, "N");
			Mainframe_GlobalFunctionLib.sendText(13, 15, "Y");
			Mainframe_GlobalFunctionLib.sendText(14, 18, "N");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.pressKey("F9");
			Mainframe_GlobalFunctionLib.pressKey("F6");
			Mainframe_GlobalFunctionLib.pressKey("F17");
			Mainframe_GlobalFunctionLib.sendText(7, 4, productId);
			Mainframe_GlobalFunctionLib.sendText(12, 2, "1");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.pressKey("F12");
			Mainframe_GlobalFunctionLib.pressKey("F12");
			Mainframe_GlobalFunctionLib.pressKey("F12");
			Mainframe_GlobalFunctionLib.pressKey("F12");
			Mainframe_GlobalFunctionLib.sendText(21, 7, "CCT600");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			break;
		   	    
		}
		Mainframe_GlobalFunctionLib.sendText(21, 7, "4");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(21, 7, "4");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(21, 7, "2");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(4, 5, CarrierID);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(10, 2, "7");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Mainframe_GlobalFunctionLib.sendText(8, 25, Sbm_PA2);
		Mainframe_GlobalFunctionLib.sendText(9, 13, fromdate);
		Mainframe_GlobalFunctionLib.sendText(9, 37, thrudate);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.sendText(21, 7, "CCT600");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
	}

	@And("^I pay claim using Dynamic PA \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void pay_claim_dynamic_PA(String rxnumber, String memberID, String productID, String dspQ, String DS, String cmpnd, String Sbm_PA2, String cost, String fee) throws Throwable{
		Mainframe_GlobalFunctionLib.sendText(21, 7, "3");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(21, 7, "2");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(21, 7, "1");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Mainframe_GlobalFunctionLib.sendText(11, 14, "777777");
		Mainframe_GlobalFunctionLib.sendText(11, 41, "CCHA");
		Mainframe_GlobalFunctionLib.sendText(11, 59, "*ALL");
		Mainframe_GlobalFunctionLib.sendText(12, 14, "APHARM");
		Mainframe_GlobalFunctionLib.sendText(12, 41, rxnumber);
		Mainframe_GlobalFunctionLib.sendText(12, 59, "00");
		Mainframe_GlobalFunctionLib.sendText(14, 41, memberID);
		Mainframe_GlobalFunctionLib.pressKey("F4");
		Mainframe_GlobalFunctionLib.sendText(8, 2, "1");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(11, 20, productID);
		Mainframe_GlobalFunctionLib.sendText(12, 11, dspQ);
		Mainframe_GlobalFunctionLib.sendText(12, 26, DS);
		Mainframe_GlobalFunctionLib.sendText(14, 6, "0");
		Mainframe_GlobalFunctionLib.sendText(14, 14, cmpnd);
		Mainframe_GlobalFunctionLib.sendText(18, 19, Sbm_PA2);
		Mainframe_GlobalFunctionLib.sendText(10, 47, cost);
		Mainframe_GlobalFunctionLib.sendText(11, 47, fee);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Mainframe_GlobalFunctionLib.pressKey("F7");
		rxclaim_number = Mainframe_GlobalFunctionLib.getText(3, 12);
		
	}
	@When("^I validate drug status on claim $")
	public void drug_status_validation() throws Throwable{
		Mainframe_GlobalFunctionLib.sendText(21, 7, "1");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(21, 7, "6");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F8");
		Mainframe_GlobalFunctionLib.sendText(4, 4, rxclaim_number);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(10, 2, "5");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F7");
		Mainframe_GlobalFunctionLib.sendText(4, 23, "8");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
	    drug_status = Mainframe_GlobalFunctionLib.getText(7, 22);
				
	}
	@Then("^I check MNO/MGO and MPP profile $")
	public void drug_status_MNO_MGO() throws Throwable{
		Mainframe_GlobalFunctionLib.sendText(21, 7, "1");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(21, 7, "6");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F8");
		Mainframe_GlobalFunctionLib.sendText(4, 4, rxclaim_number);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(10, 2, "5");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F7");
		Mainframe_GlobalFunctionLib.click(16, 21);
		Mainframe_GlobalFunctionLib.pressKey("F4");
		Mainframe_GlobalFunctionLib.sendText(16, 2, "5");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
	    MPP = Mainframe_GlobalFunctionLib.getText(7, 78);
	    Mainframe_GlobalFunctionLib.pressKey("F7");
	    MNO_MGO = Mainframe_GlobalFunctionLib.getText(6, 78);
	    MNO_MGO.compareTo(drug_status);
	    MPP.compareTo(drug_status);
	}
	
	
}