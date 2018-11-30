package com.atdd.demo.te.stepdefinitons;

import org.testng.Assert;

import com.atdd.te.screenHelpers.FunctionalLibrary;
import com.google.common.base.Function;
import com.optumrx.autofusion.core.te.util.Mainframe_GlobalFunctionLib;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SR41884 {
	

@When("^I enter \"([^\"]*)\",\"([^\"]*)\" in Add/Edit Product Screen$")
public void i_enter_in_Add_Edit_Product_Screen(String product_Id, String pty) throws Throwable {
	
	FunctionalLibrary.enterText(15, 26,product_Id );
	FunctionalLibrary.enterText(15, 48,pty );
	FunctionalLibrary.pressEnter();
	
}


@When("^I enter \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" in Product Detail screen$")
public void i_enter_in_Product_Detail_screen(String Mfg, String name, String Label_name, String Strength, String Multi_Source, String Size, String UOM) throws Throwable {
    
   FunctionalLibrary.enterText(04, 44, Mfg);      
   FunctionalLibrary.enterText(05, 07, name);
   FunctionalLibrary.enterText(06, 13, Label_name);
   FunctionalLibrary.enterText(07, 11, Strength);
   FunctionalLibrary.enterText(07, 72, Multi_Source);
   FunctionalLibrary.enterText(11, 33, Size);
   FunctionalLibrary.enterText(11, 49, UOM);
   FunctionalLibrary.pressKey("F16");
   FunctionalLibrary.pressKey("F6");
}


@When("^I enter \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" on Product Cost Detail screen$")
public void i_enter_on_Product_Cost_Detail_screen(String source, String type, String From_Date, String Thru_Date, String Cost) throws Throwable {
  
	FunctionalLibrary.enterText(14, 19, source);  
	FunctionalLibrary.enterText(16, 19, type);
	FunctionalLibrary.pressEnter();
	FunctionalLibrary.enterText(14, 11, From_Date);
	FunctionalLibrary.enterText(14, 23, Thru_Date);
	if(Cost.length()==0){
		Cost=" ";
	}
	FunctionalLibrary.enterText(14, 35, Cost);
	FunctionalLibrary.pressEnter();
	FunctionalLibrary.enterText(16, 64, "Y");
	FunctionalLibrary.pressKey("F12");
	FunctionalLibrary.pressKey("F12");
	FunctionalLibrary.pressKey("F12");
	FunctionalLibrary.pressKey("F12");
}

@When("^I enter \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" on Add Transaction screen$")
public void i_enter_on_Add_Transaction_screen(String BIN, String Proc_Ctrl, String Grp, String Pharmacy, String Rx_Nbr, String Member_ID) throws Throwable {
  
FunctionalLibrary.enterText(11, 14, BIN);
FunctionalLibrary.enterText(11, 41, Proc_Ctrl);
FunctionalLibrary.enterText(11, 59, Grp);
FunctionalLibrary.enterText(12, 14, Pharmacy);
FunctionalLibrary.enterText(12, 41, Rx_Nbr);
FunctionalLibrary.enterText(14, 41, Member_ID);
FunctionalLibrary.pressEnter();
	
}


/*@When("^I enter \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\">,\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" on Transaction Submission screen$")
public void i_enter_on_Transaction_Submission_screen(String Rf, String ProdID, String Disp_Qty, String DS, String PSC, String Cmpnd, String Cost, String Due) throws Throwable {

	FunctionalLibrary.enterText(05, 47, Rf);
	FunctionalLibrary.enterText(11, 20, ProdID);
	FunctionalLibrary.enterText(12, 11, Disp_Qty);
	FunctionalLibrary.enterText(12, 26, DS);
	FunctionalLibrary.enterText(14, 6, PSC);
	FunctionalLibrary.enterText(14, 14, Cmpnd);
	FunctionalLibrary.enterText(10, 47, Cost);
	FunctionalLibrary.enterText(19, 47, Due);
	FunctionalLibrary.pressKey("F14");
	FunctionalLibrary.enterText(5, 23, "5");
	FunctionalLibrary.pressEnter();
	FunctionalLibrary.pressKey("F6");
	FunctionalLibrary.enterText(12, 20, "03");
	Mainframe_GlobalFunctionLib.click(13, 20);
	FunctionalLibrary.pressKey("F4");
	FunctionalLibrary.enterText(4, 4, "Amoxa");
	FunctionalLibrary.pressEnter();
	FunctionalLibrary.enterText(10, 2, "1");
	FunctionalLibrary.pressEnter();
	FunctionalLibrary.enterText(15, 20, "10");
	FunctionalLibrary.enterText(16, 20, "40");
	FunctionalLibrary.enterText(18, 20, "01");
	FunctionalLibrary.pressEnter();
	
	FunctionalLibrary.pressKey("F6");
	FunctionalLibrary.enterText(12, 20, "03");
	Mainframe_GlobalFunctionLib.click(13, 20);
	FunctionalLibrary.pressKey("F4");
	FunctionalLibrary.enterText(4, 4, "proza");
	FunctionalLibrary.pressEnter();
	FunctionalLibrary.enterText(12, 2, "1");
	FunctionalLibrary.pressEnter();
	FunctionalLibrary.enterText(15, 20, "10");
	FunctionalLibrary.enterText(16, 20, "40");
	FunctionalLibrary.enterText(18, 20, "01");
	FunctionalLibrary.pressEnter();
	FunctionalLibrary.pressKey("F12");
	FunctionalLibrary.pressKey("F12");
	
	FunctionalLibrary.pressKey("F6");
	FunctionalLibrary.enterText(12, 20, "03");
	Mainframe_GlobalFunctionLib.click(13, 20);
	FunctionalLibrary.pressKey("F4");
	FunctionalLibrary.enterText(4, 4, "RUSHAUTO001");
	FunctionalLibrary.pressEnter();
	FunctionalLibrary.enterText(9, 2, "1");
	FunctionalLibrary.pressEnter();
	FunctionalLibrary.enterText(15, 20, "10");
	FunctionalLibrary.enterText(16, 20, "40");
	FunctionalLibrary.enterText(18, 20, "01");
	FunctionalLibrary.pressEnter();
	FunctionalLibrary.pressKey("F12");
	FunctionalLibrary.pressKey("F12");
	FunctionalLibrary.pressKey("F6");
	
}*/



@When("^I enter \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" on Transaction Submission and compound submission screen$")
public void i_enter_on_Transaction_Submission_and_compound_submission_screen(String Rf, String ProdID, String Disp_Qty, String DS, String PSC, String Cmpnd, String Cost, String Due, String  Prdt1,String  Prdt2, String  Prdt3) throws Throwable {
												  
//@When("^I enter \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\">,\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" on Transaction Submission screen$")
//@When("^I enter \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" on Transaction Submission screen$")
//public void i_enter_on_Transaction_Submission_screen(String Rf, String ProdID, String Disp_Qty, String DS, String PSC, String Cmpnd, String Cost, String Due) throws Throwable {
	FunctionalLibrary.enterText(05, 47, Rf);
	FunctionalLibrary.enterText(11, 20, ProdID);
	FunctionalLibrary.enterText(12, 11, Disp_Qty);
	FunctionalLibrary.enterText(12, 26, DS);
	FunctionalLibrary.enterText(14, 6, PSC);
	FunctionalLibrary.enterText(14, 14, Cmpnd);
	FunctionalLibrary.enterText(10, 47, Cost);
	FunctionalLibrary.enterText(19, 47, Due);
	FunctionalLibrary.pressKey("F14");
	FunctionalLibrary.enterText(5, 23, "5");
	FunctionalLibrary.pressEnter();
	FunctionalLibrary.pressKey("F6");
	FunctionalLibrary.enterText(12, 20, "03");
	FunctionalLibrary.enterText(13, 20, Prdt1);
	FunctionalLibrary.enterText(15, 20, "10");
	FunctionalLibrary.enterText(16, 20, "40");
	FunctionalLibrary.enterText(18, 20, "01");
	FunctionalLibrary.pressEnter();
	
	FunctionalLibrary.pressKey("F6");
	FunctionalLibrary.enterText(12, 20, "03");
	FunctionalLibrary.enterText(13, 20, Prdt2);
	FunctionalLibrary.enterText(15, 20, "10");
	FunctionalLibrary.enterText(16, 20, "40");
	FunctionalLibrary.enterText(18, 20, "01");
	FunctionalLibrary.pressEnter();

	if(Prdt3.length() != 0){	
	FunctionalLibrary.pressKey("F6");
	FunctionalLibrary.enterText(12, 20, "03");	
	FunctionalLibrary.enterText(13, 20, Prdt3);
	FunctionalLibrary.enterText(15, 20, "10");
	FunctionalLibrary.enterText(16, 20, "40");
	FunctionalLibrary.enterText(18, 20, "01");
	FunctionalLibrary.pressEnter();
	
	}
	FunctionalLibrary.pressKey("F12");
	FunctionalLibrary.pressKey("F12");
	FunctionalLibrary.pressKey("F6");
}


@When("^I enter \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" on Transaction Submission and compound submission screen using F(\\d+)$")
public void i_enter_on_Transaction_Submission_and_compound_submission_screen_using_F(String Rf, String ProdID, String Disp_Qty, String DS, String PSC, String Cmpnd, String Cost, String Due, String  Prdt1,String  Prdt2, String  Prdt3,int arg) throws Throwable {
	FunctionalLibrary.enterText(05, 47, Rf);
	FunctionalLibrary.enterText(11, 20, ProdID);
	FunctionalLibrary.enterText(12, 11, Disp_Qty);
	FunctionalLibrary.enterText(12, 26, DS);
	FunctionalLibrary.enterText(14, 6, PSC);
	FunctionalLibrary.enterText(14, 14, Cmpnd);
	FunctionalLibrary.enterText(10, 47, Cost);
	FunctionalLibrary.enterText(19, 47, Due);
	FunctionalLibrary.pressKey("F14");
	FunctionalLibrary.enterText(5, 23, "5");
	FunctionalLibrary.pressEnter();
	FunctionalLibrary.pressKey("F6");
	FunctionalLibrary.enterText(12, 20, "03");
	FunctionalLibrary.enterText(13, 20, Prdt1);
	FunctionalLibrary.enterText(15, 20, "10");
	FunctionalLibrary.enterText(16, 20, "40");
	FunctionalLibrary.enterText(18, 20, "01");
	FunctionalLibrary.pressEnter();
	
	FunctionalLibrary.pressKey("F6");
	FunctionalLibrary.enterText(12, 20, "03");
	FunctionalLibrary.enterText(13, 20, Prdt2);
	FunctionalLibrary.enterText(15, 20, "10");
	FunctionalLibrary.enterText(16, 20, "40");
	FunctionalLibrary.enterText(18, 20, "01");
	FunctionalLibrary.pressEnter();

	if(Prdt3.length() != 0){
	FunctionalLibrary.pressKey("F6");
	FunctionalLibrary.enterText(12, 20, "03");
	FunctionalLibrary.enterText(13, 20, Prdt3);
	FunctionalLibrary.enterText(15, 20, "10");
	FunctionalLibrary.enterText(16, 20, "40");
	FunctionalLibrary.enterText(18, 20, "01");
	FunctionalLibrary.pressEnter();
	FunctionalLibrary.pressKey("F12");
	FunctionalLibrary.pressKey("F12");
	FunctionalLibrary.pressKey("F18");
	
	}
	
}

@When("^I enter \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" on Transaction Submission screen$")
public void i_enter_on_Transaction_Submission_screen(String Rf, String ProdID, String Disp_Qty, String DS, String PSC, String Cmpnd, String Cost, String Due) throws Throwable {
	
	FunctionalLibrary.enterText(05, 47, Rf);
	FunctionalLibrary.enterText(11, 20, ProdID);
	FunctionalLibrary.enterText(12, 11, Disp_Qty);
	FunctionalLibrary.enterText(12, 26, DS);
	FunctionalLibrary.enterText(14, 6, PSC);
	FunctionalLibrary.enterText(14, 14, Cmpnd);
	FunctionalLibrary.enterText(10, 47, Cost);
	FunctionalLibrary.enterText(19, 47, Due);
	FunctionalLibrary.pressKey("F6"); 
	
}	



@Then("^I validate claim rejected with rejected code \"([^\"]*)\",\"([^\"]*)\"$")
public void i_validate_claim_rejected_with_rejected_code(String Rej, String Msg) throws Throwable {
    
	
	
String	str1 = FunctionalLibrary.getText(21, 12).trim();
	
	if(str1.equals(Rej)){
		
	String str2 = FunctionalLibrary.getText(22, 06).trim();
	
	if(str2.equals(Msg)){
		System.out.println("TC002 pass");
		
	}

			}

	else
		Assert.fail();
	
	}	

}

















