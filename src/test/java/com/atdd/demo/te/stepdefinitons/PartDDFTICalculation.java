package com.atdd.demo.te.stepdefinitons;

import java.util.concurrent.TimeUnit;

import com.atdd.te.screenHelpers.FunctionalLibrary;
import com.cucumber.listener.Reporter;
import com.optumrx.autofusion.core.te.util.Mainframe_GlobalFunctionLib;
import com.optumrx.autofusion.core.te.util.Screenshot;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PartDDFTICalculation {
	@Then("^I create GPI list with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_create_GPI_list_with(String list, String audit, String name1, String name2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Mainframe_GlobalFunctionLib.sendText(5, 18,list );
		Mainframe_GlobalFunctionLib.sendText(5, 30,"Testing");
		Mainframe_GlobalFunctionLib.sendText(11, 18,audit );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(16, 64,"Y");
		Mainframe_GlobalFunctionLib.sendText(4,6,list );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(11,2,"7");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Mainframe_GlobalFunctionLib.sendText(6,4,name1 );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(12,2,"1");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Mainframe_GlobalFunctionLib.sendText(6,4,name2 );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(14,2,"1");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.sendText(12,2,"6" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Mainframe_GlobalFunctionLib.sendText(10,24,"A" );
		Mainframe_GlobalFunctionLib.sendText(13,24,"010101" );
		Mainframe_GlobalFunctionLib.sendText(14,24,"123139" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(16,15,"HC-3493" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.sendText(13,2,"6" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Mainframe_GlobalFunctionLib.sendText(10,24,"A" );
		Mainframe_GlobalFunctionLib.sendText(13,24,"010101" );
		Mainframe_GlobalFunctionLib.sendText(14,24,"123139" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(16,15,"HC-3493" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");
	}
	
	@Then("^creating patient pay table with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void creating_patient_pay_table_with(String PATname, String DueFlag, String Code, String BrandAmt, String BrandCopay, String GenericAmt, String GenericCopay) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Mainframe_GlobalFunctionLib.sendText(5,8,PATname );
		Mainframe_GlobalFunctionLib.sendText(5,34,"Testing" );
		Mainframe_GlobalFunctionLib.sendText(5,73,DueFlag);
		Mainframe_GlobalFunctionLib.sendText(6,30,Code );
		Mainframe_GlobalFunctionLib.sendText(11,21,BrandAmt );
		Mainframe_GlobalFunctionLib.sendText(15,21,BrandCopay );
		Mainframe_GlobalFunctionLib.sendText(17,21,GenericAmt );
		Mainframe_GlobalFunctionLib.sendText(21,21,GenericCopay );
		Mainframe_GlobalFunctionLib.sendText(15,32,"3" );
		Mainframe_GlobalFunctionLib.sendText(15,47,"6" );
		Mainframe_GlobalFunctionLib.sendText(21,32,"3" );
		Mainframe_GlobalFunctionLib.sendText(21,47,"6" );
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(4,5,PATname );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(10,2,"2" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F9");
		Mainframe_GlobalFunctionLib.sendText(9,44,"D/DIFF" );
		Mainframe_GlobalFunctionLib.sendText(9,55,"10" );
		Mainframe_GlobalFunctionLib.sendText(13,44,"D/DIFF" );
		Mainframe_GlobalFunctionLib.sendText(13,55,"10" );
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F7");
		Mainframe_GlobalFunctionLib.sendText(11,33,"1");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Mainframe_GlobalFunctionLib.sendText(7,16,"10");
		Mainframe_GlobalFunctionLib.sendText(8,15,"999");
		Mainframe_GlobalFunctionLib.sendText(13,26,"3.2");
		Mainframe_GlobalFunctionLib.sendText(13,53,"1500");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");
	}
	
	@Then("^create patient pay schedule with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void create_patient_pay_schedule_with(String PATschedule, String PATname, String seq) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Mainframe_GlobalFunctionLib.sendText(5,12,PATschedule );
		Mainframe_GlobalFunctionLib.sendText(5,25,"Testing");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(4,6,PATschedule );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(10,2,"15" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Mainframe_GlobalFunctionLib.sendText(5,26,seq );
		Mainframe_GlobalFunctionLib.sendText(6,26,PATname );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("F3");
	}
	
	@Then("^creating PS fee schedule with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void creating_PS_fee_schedule_with(String PSFSchedule, String Steps, String Basis, String Amount, String Percent, String PercentBasis, String Feetable, String FeeQualifier, String FTSeq) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Mainframe_GlobalFunctionLib.sendText(13,17,PSFSchedule );
		Mainframe_GlobalFunctionLib.sendText(14,17,"Testing");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(4,5,PSFSchedule );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(10,2,"7" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Mainframe_GlobalFunctionLib.sendText(6,22,Steps );
		Mainframe_GlobalFunctionLib.sendText(8,22,Basis );
		Mainframe_GlobalFunctionLib.sendText(11,22,Amount );
		Mainframe_GlobalFunctionLib.sendText(12,22,Percent);
		Mainframe_GlobalFunctionLib.sendText(13,22,PercentBasis);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		FunctionalLibrary.navigateToScreen("12");
		//Fee Table
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Mainframe_GlobalFunctionLib.sendText(13,19,Feetable );
		Mainframe_GlobalFunctionLib.sendText(14,19,"Testing" );
		Mainframe_GlobalFunctionLib.sendText(15,19,FeeQualifier );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(4,5,Feetable );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(10,2,"7" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Mainframe_GlobalFunctionLib.sendText(7,16,FTSeq );
		Mainframe_GlobalFunctionLib.sendText(17,16,PSFSchedule );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(16,64,"Y" );
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F12");
	}
	
	@Then("^copying the drug cost comparison schedule with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void copying_the_drug_cost_comparison_schedule_with(String DCSchedule, String NewDCS, String MedRate, String SubRate) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.sendText(4,5,DCSchedule );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(10,2,"3" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(9,22,NewDCS );
		Mainframe_GlobalFunctionLib.sendText(10,22,"Testing");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(16,64,"Y" );
		Mainframe_GlobalFunctionLib.sendText(4,5,NewDCS );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(10,2,"7" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(12,2,"2" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(14,16,"      ");
		Mainframe_GlobalFunctionLib.sendText(14,16,MedRate);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.sendText(13,2,"2" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(14,16,"      ");
		Mainframe_GlobalFunctionLib.sendText(14,16,SubRate);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");
	}
	
	@Then("^copying the drug cost schedule with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void copying_the_drug_cost_schedule_with(String DSchedule, String NewDS, String NewDCS) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.sendText(4,5,DSchedule );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(10,2,"3" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(9,21,NewDS );
		Mainframe_GlobalFunctionLib.sendText(10,21,"Testing");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(4,5,NewDS );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(10,2,"7" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(14,2,"2" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(15,15,"              ");
		Mainframe_GlobalFunctionLib.sendText(15,15,NewDCS);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F12");
	}
	
	@Then("^creating price table with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void creating_price_table_with(String PriceTable, String fdate, String tdate, String Source, String Code, String Percent, String NewDS, String Feetable, String Taxschedule, String PriceCode, String Dispfee) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Mainframe_GlobalFunctionLib.sendText(4,9,PriceTable );
		Mainframe_GlobalFunctionLib.sendText(4,26,"TESTING" );
		Mainframe_GlobalFunctionLib.sendText(5,14,fdate );
		Mainframe_GlobalFunctionLib.sendText(5,31,tdate );
		Mainframe_GlobalFunctionLib.click(8,28);
		Mainframe_GlobalFunctionLib.pressKey("F4");
		Mainframe_GlobalFunctionLib.sendText(4,5,Source );
		Mainframe_GlobalFunctionLib.sendText(4,17,Code );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(10,2,"1");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(8,74,Percent );
		Mainframe_GlobalFunctionLib.sendText(11,37,NewDS );
		Mainframe_GlobalFunctionLib.sendText(13,9,Dispfee );
		Mainframe_GlobalFunctionLib.sendText(13,24,Feetable );
		Mainframe_GlobalFunctionLib.sendText(13,79,PriceCode );
		Mainframe_GlobalFunctionLib.sendText(14,46,Taxschedule );
		Mainframe_GlobalFunctionLib.sendText(16,47,"8" );
		Mainframe_GlobalFunctionLib.sendText(16,69,"Y" );
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("Enter");
	}
	
	@Then("^creating price schedule with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void creating_price_schedule_with(String Pricesched, String Override, String Seq, String PriceTable) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Mainframe_GlobalFunctionLib.sendText(4,18,Pricesched);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(5,36,"Testing");
		Mainframe_GlobalFunctionLib.sendText(13,32,Override);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(16,64,"Y");
		Mainframe_GlobalFunctionLib.pressKey("F15");
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Mainframe_GlobalFunctionLib.sendText(5,12,Seq);
		Mainframe_GlobalFunctionLib.sendText(7,21,PriceTable);
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");
	}
	@Then("^creating base plan and override plan with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void creating_base_plan_and_override_plan_with(String BasePlan, String OverridePlan, String FromDate, String NDCList, String ThruDate, String NGSequence, String GPIList, String PriceFromDate, String PriceThruDate, String Pricesched, String PATschedule, String TroopSched, String CMSList) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.pressKey("F6");
		//Override Plan Creation
		Mainframe_GlobalFunctionLib.sendText(13,19,OverridePlan);
		Mainframe_GlobalFunctionLib.sendText(14,19,FromDate);
		Mainframe_GlobalFunctionLib.sendText(15,19,"OverridePlan");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(16,64,"Y");
		TimeUnit.SECONDS.sleep(5);
		Mainframe_GlobalFunctionLib.sendText(15,24,"Y");
		Mainframe_GlobalFunctionLib.sendText(6,51,"Y");
		Mainframe_GlobalFunctionLib.sendText(13,77,"Y");
		Mainframe_GlobalFunctionLib.sendText(14,77,"Y");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(16,64,"Y");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("F7");
		//NDC
		Mainframe_GlobalFunctionLib.sendText(7,21,"10");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Mainframe_GlobalFunctionLib.sendText(4,5,NDCList);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(9,2,"1");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(13,17,NGSequence);
		Mainframe_GlobalFunctionLib.sendText(14,17,FromDate);
		Mainframe_GlobalFunctionLib.sendText(14,41,ThruDate);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(16,64,"Y");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		//GPI
		Mainframe_GlobalFunctionLib.sendText(7,21,"11");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Mainframe_GlobalFunctionLib.sendText(4,5,GPIList);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(9,2,"1");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(13,17,NGSequence);
		Mainframe_GlobalFunctionLib.sendText(14,17,FromDate);
		Mainframe_GlobalFunctionLib.sendText(14,41,ThruDate);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(16,64,"Y");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		//Pricing
		Mainframe_GlobalFunctionLib.sendText(7,21,"28");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(21,12,"1");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Mainframe_GlobalFunctionLib.sendText(8,12,PriceFromDate);
		Mainframe_GlobalFunctionLib.sendText(8,36,PriceThruDate);
		Mainframe_GlobalFunctionLib.sendText(10,26,Pricesched);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		//Patient Pay
		Mainframe_GlobalFunctionLib.sendText(21,12,"3");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Mainframe_GlobalFunctionLib.sendText(9,2,FromDate);
		Mainframe_GlobalFunctionLib.sendText(9,12,ThruDate);
		Mainframe_GlobalFunctionLib.sendText(9,22,PATschedule);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(16,64,"Y");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		//Accumulators
		Mainframe_GlobalFunctionLib.sendText(7,21,"29");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(15,12,"6");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Mainframe_GlobalFunctionLib.sendText(8,13,FromDate);
		Mainframe_GlobalFunctionLib.sendText(8,41,ThruDate);
		Mainframe_GlobalFunctionLib.sendText(10,28,"C");
		Mainframe_GlobalFunctionLib.sendText(14,28,TroopSched);
		Mainframe_GlobalFunctionLib.sendText(16,28,CMSList);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		
		
		//Base Plan Creation
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Mainframe_GlobalFunctionLib.sendText(13,19,BasePlan);
		Mainframe_GlobalFunctionLib.sendText(14,19,FromDate);
		Mainframe_GlobalFunctionLib.sendText(15,19,"BasePlan");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(16,64,"Y");
		TimeUnit.SECONDS.sleep(5);
		Mainframe_GlobalFunctionLib.sendText(7,24,"Y");
		Mainframe_GlobalFunctionLib.sendText(8,24,"Y");
		Mainframe_GlobalFunctionLib.sendText(13,77,"Y");
		Mainframe_GlobalFunctionLib.sendText(14,77,"Y");
		Mainframe_GlobalFunctionLib.sendText(20,44,"N");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(16,64,"Y");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("F7");
		//Member Eligibility
		Mainframe_GlobalFunctionLib.sendText(7,21,"2");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		//Location
		Mainframe_GlobalFunctionLib.sendText(7,21,"3");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(15,12,"3");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Mainframe_GlobalFunctionLib.sendText(7,22,"96");
		Mainframe_GlobalFunctionLib.sendText(8,22,"**");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(10,14,PriceFromDate);
		Mainframe_GlobalFunctionLib.sendText(10,40,ThruDate);
		Mainframe_GlobalFunctionLib.sendText(11,14,"M");
		Mainframe_GlobalFunctionLib.sendText(15,26,OverridePlan);
		Mainframe_GlobalFunctionLib.sendText(16,26,FromDate);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		//Pricing
		Mainframe_GlobalFunctionLib.sendText(7,21,"28");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(21,12,"1");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Mainframe_GlobalFunctionLib.sendText(8,12,PriceFromDate);
		Mainframe_GlobalFunctionLib.sendText(8,36,PriceThruDate);
		Mainframe_GlobalFunctionLib.sendText(10,26,"EVUASHEPS");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		//Patient Pay
		Mainframe_GlobalFunctionLib.sendText(21,12,"3");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Mainframe_GlobalFunctionLib.sendText(9,2,FromDate);
		Mainframe_GlobalFunctionLib.sendText(9,12,ThruDate);
		Mainframe_GlobalFunctionLib.sendText(9,22,"EVUASHEPPS");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(16,64,"Y");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		//Accumulators
		Mainframe_GlobalFunctionLib.sendText(7,21,"29");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(15,12,"6");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Mainframe_GlobalFunctionLib.sendText(8,13,FromDate);
		Mainframe_GlobalFunctionLib.sendText(8,41,ThruDate);
		Mainframe_GlobalFunctionLib.sendText(10,28,"C");
		Mainframe_GlobalFunctionLib.sendText(14,28,"SN003133");
		Mainframe_GlobalFunctionLib.sendText(16,28,"EVU35209");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F12");
	}
	
	@Then("^creating DMR claim with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void creating_DMR_claim_with(String BIN, String PCN, String Group, String Pharmacy, String RxNbr, String MemberID, String fname, String lname, String ProductID, String DispQty, String DS, String PSC, String Due, String UCW, String Cost, String Inc) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    FunctionalLibrary.navigateToScreen("3");
	    FunctionalLibrary.navigateToScreen("2");
	    FunctionalLibrary.navigateToScreen("2");
	    Mainframe_GlobalFunctionLib.pressKey("F6");
	    Mainframe_GlobalFunctionLib.sendText(4,11,BIN);
	    Mainframe_GlobalFunctionLib.sendText(4,38,PCN);
	    Mainframe_GlobalFunctionLib.sendText(4,58,Group);
	    Mainframe_GlobalFunctionLib.sendText(5,11,Pharmacy);
	    Mainframe_GlobalFunctionLib.sendText(5,38,RxNbr);
	    Mainframe_GlobalFunctionLib.sendText(7,38,MemberID);
	    Mainframe_GlobalFunctionLib.sendText(11,20,fname);
	    Mainframe_GlobalFunctionLib.sendText(11,38,lname);
	    Mainframe_GlobalFunctionLib.sendText(12,10,"OGS");
	    Mainframe_GlobalFunctionLib.sendText(15,17,"HYD");
	    Mainframe_GlobalFunctionLib.sendText(15,38,"CA");
	    Mainframe_GlobalFunctionLib.sendText(15,42,"12345");
	    Mainframe_GlobalFunctionLib.sendText(16,17,"           ");
	    Mainframe_GlobalFunctionLib.sendText(16,17,"354565600");
	    Mainframe_GlobalFunctionLib.sendText(17,21,"USA");
	    Mainframe_GlobalFunctionLib.pressKey("Enter");
	    Mainframe_GlobalFunctionLib.sendText(8,2,"1");
	    Mainframe_GlobalFunctionLib.pressKey("Enter");
	    Mainframe_GlobalFunctionLib.sendText(12,10,"OGS");
	    Mainframe_GlobalFunctionLib.sendText(15,17,"HYD");
	    Mainframe_GlobalFunctionLib.sendText(15,38,"CA");
	    Mainframe_GlobalFunctionLib.sendText(15,42,"12345");
	    Mainframe_GlobalFunctionLib.sendText(16,17,"           ");
	    Mainframe_GlobalFunctionLib.sendText(16,17,"354565600");
	    Mainframe_GlobalFunctionLib.sendText(17,21,"USA");
	    Mainframe_GlobalFunctionLib.pressKey("Enter");
	    Mainframe_GlobalFunctionLib.sendText(16,64,"Y");
	    TimeUnit.SECONDS.sleep(5);
	    Mainframe_GlobalFunctionLib.sendText(7,68,"96");
	    String wrtn_dt =  Mainframe_GlobalFunctionLib.getText(4, 65).trim();
	    String wrtndt = wrtn_dt.replace("/","");
	    Mainframe_GlobalFunctionLib.sendText(11,20,ProductID);
	    Mainframe_GlobalFunctionLib.sendText(12,11,DispQty);
	    Mainframe_GlobalFunctionLib.sendText(12,26,DS);
	    Mainframe_GlobalFunctionLib.sendText(13,10,wrtndt);
	    Mainframe_GlobalFunctionLib.sendText(14,6,PSC);
	    Mainframe_GlobalFunctionLib.sendText(10,47,Due);
	    Mainframe_GlobalFunctionLib.sendText(13,47,UCW);
	    Mainframe_GlobalFunctionLib.sendText(14,47,Cost);
	    Mainframe_GlobalFunctionLib.sendText(20,47,Inc);
	    Mainframe_GlobalFunctionLib.pressKey("Enter");
	    Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	    Mainframe_GlobalFunctionLib.pressKey("F6");
	    Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	    Mainframe_GlobalFunctionLib.pressKey("F7");
	    Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	    Mainframe_GlobalFunctionLib.pressKey("F7");
	    
	}
	
	@When("^submitting DMR claim with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void submitting_DMR_claim_with(String RxNbr, String MemberID, String fname, String lname, String ProductID, String DispQty, String DS, String PSC, String Due, String UCW, String Cost, String Inc) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		FunctionalLibrary.navigateToScreen("3");
	    FunctionalLibrary.navigateToScreen("2");
	    FunctionalLibrary.navigateToScreen("2");
	    Mainframe_GlobalFunctionLib.sendText(4,4,MemberID);
	    Mainframe_GlobalFunctionLib.pressKey("Enter");
	    Mainframe_GlobalFunctionLib.sendText(9,2,"1");
	    Mainframe_GlobalFunctionLib.pressKey("Enter");
	    Mainframe_GlobalFunctionLib.sendText(12,10,"OGS");
	    Mainframe_GlobalFunctionLib.sendText(15,17,"HYD");
	    Mainframe_GlobalFunctionLib.sendText(15,38,"CA");
	    Mainframe_GlobalFunctionLib.sendText(15,42,"12345");
	    Mainframe_GlobalFunctionLib.sendText(16,17,"           ");
	    Mainframe_GlobalFunctionLib.sendText(16,17,"354565600");
	    Mainframe_GlobalFunctionLib.sendText(17,21,"USA");
	    Mainframe_GlobalFunctionLib.pressKey("Enter");
	    Mainframe_GlobalFunctionLib.sendText(16,64,"Y");
	    TimeUnit.SECONDS.sleep(5);
	    Mainframe_GlobalFunctionLib.sendText(5,29,RxNbr);
	    Mainframe_GlobalFunctionLib.sendText(11,20,ProductID);
	    Mainframe_GlobalFunctionLib.sendText(12,11,"           ");
	    Mainframe_GlobalFunctionLib.sendText(12,11,DispQty);
	    Mainframe_GlobalFunctionLib.sendText(12,26,"   ");
	    Mainframe_GlobalFunctionLib.sendText(12,26,DS);
	    String wrtn_dt =  Mainframe_GlobalFunctionLib.getText(4, 65).trim();
	    String wrtndt = wrtn_dt.replace("/","");
	    Mainframe_GlobalFunctionLib.sendText(13,10,"          ");
	    Mainframe_GlobalFunctionLib.sendText(13,10,wrtndt);
	    Mainframe_GlobalFunctionLib.sendText(14,6,PSC);
	    Mainframe_GlobalFunctionLib.sendText(10,47,"         ");
	    Mainframe_GlobalFunctionLib.sendText(10,47,Due);
	    Mainframe_GlobalFunctionLib.sendText(13,47,"         ");
	    Mainframe_GlobalFunctionLib.sendText(13,47,UCW);
	    Mainframe_GlobalFunctionLib.sendText(14,47,"         ");
	    Mainframe_GlobalFunctionLib.sendText(14,47,Cost);
	    Mainframe_GlobalFunctionLib.sendText(20,47,"         ");
	    Mainframe_GlobalFunctionLib.sendText(20,47,Inc);
	    Mainframe_GlobalFunctionLib.pressKey("Enter");
	    Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	    Mainframe_GlobalFunctionLib.pressKey("F6");
	    Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	    Mainframe_GlobalFunctionLib.pressKey("F7");
	    Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	    Mainframe_GlobalFunctionLib.pressKey("F7");
	}

	
	@Then("^Validating the price information screen$")
	public void validating_the_price_information_screen() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.sendText(4,23,"1");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("PageDown");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("PageDown");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("F10");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("F10");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		for(int i=0;i<5;i++){
		Mainframe_GlobalFunctionLib.pressKey("F3");}
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");
	}
	

@Then("^Validating the Drug spend total in Accum phase screen$")
public void validating_the_Drug_spend_total_in_Accum_phase_screen() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	Mainframe_GlobalFunctionLib.sendText(4,23,"13");
	Mainframe_GlobalFunctionLib.pressKey("Enter");
	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	Mainframe_GlobalFunctionLib.pressKey("F10");
	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	
}

@Then("^editing the drug cost comparison schedule with \"([^\"]*)\",\"([^\"]*)\"$")
public void editing_the_drug_cost_comparison_schedule_with(String drugcostsched, String medrate) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	Mainframe_GlobalFunctionLib.sendText(4,5,drugcostsched);
	Mainframe_GlobalFunctionLib.pressKey("Enter");
	Mainframe_GlobalFunctionLib.sendText(10,2,"7");
	Mainframe_GlobalFunctionLib.pressKey("Enter");
	Mainframe_GlobalFunctionLib.sendText(12,2,"2");
	Mainframe_GlobalFunctionLib.pressKey("Enter");
	Mainframe_GlobalFunctionLib.sendText(14,16,"      ");
	Mainframe_GlobalFunctionLib.sendText(14,16,medrate);
	Mainframe_GlobalFunctionLib.pressKey("Enter");
	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	Mainframe_GlobalFunctionLib.pressKey("F12");
	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	Mainframe_GlobalFunctionLib.pressKey("F12");
	Mainframe_GlobalFunctionLib.pressKey("F12");
	Mainframe_GlobalFunctionLib.pressKey("F12");
}

@Then("^modifying the dispensing fee as blank with \"([^\"]*)\"$")
public void modifying_the_dispensing_fee_as_blank_with(String pricetable) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	Mainframe_GlobalFunctionLib.sendText(4,25,pricetable);
	Mainframe_GlobalFunctionLib.pressKey("Enter");
	Mainframe_GlobalFunctionLib.sendText(10,2,"2");
	Mainframe_GlobalFunctionLib.pressKey("Enter");
	Mainframe_GlobalFunctionLib.sendText(13,9,"        ");
	Mainframe_GlobalFunctionLib.pressKey("Enter");
	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	Mainframe_GlobalFunctionLib.pressKey("F3");
	Mainframe_GlobalFunctionLib.pressKey("F12");
}

@Then("^modifying the copay category in member screen with \"([^\"]*)\",\"([^\"]*)\"$")
public void modifying_the_copay_category_in_member_screen_with(String memid, String category) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	Mainframe_GlobalFunctionLib.sendText(4,4,memid);
	Mainframe_GlobalFunctionLib.pressKey("Enter");
	Mainframe_GlobalFunctionLib.sendText(10,2,"2");
	Mainframe_GlobalFunctionLib.pressKey("Enter");
	Mainframe_GlobalFunctionLib.pressKey("F8");
	Mainframe_GlobalFunctionLib.sendText(4,20,"17");
	Mainframe_GlobalFunctionLib.pressKey("Enter");
	Mainframe_GlobalFunctionLib.sendText(4,20,"4");
	Mainframe_GlobalFunctionLib.pressKey("Enter");
	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	Mainframe_GlobalFunctionLib.sendText(15,2,"2");
	Mainframe_GlobalFunctionLib.pressKey("Enter");
	Mainframe_GlobalFunctionLib.click(18,24);
	Mainframe_GlobalFunctionLib.pressKey("F4");
	Mainframe_GlobalFunctionLib.sendText(7,4,category);
	Mainframe_GlobalFunctionLib.pressKey("Enter");
	Mainframe_GlobalFunctionLib.sendText(13,3,"X");
	Mainframe_GlobalFunctionLib.pressKey("Enter");
	Mainframe_GlobalFunctionLib.pressKey("Enter");
	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	Mainframe_GlobalFunctionLib.sendText(13,40,"Y");
	Mainframe_GlobalFunctionLib.click(14,28);
	Mainframe_GlobalFunctionLib.pressKey("F4");
	Mainframe_GlobalFunctionLib.sendText(3,48,"REP");
	Mainframe_GlobalFunctionLib.pressKey("Enter");
	Mainframe_GlobalFunctionLib.sendText(6,36,"X");
	Mainframe_GlobalFunctionLib.pressKey("Enter");
	Mainframe_GlobalFunctionLib.sendText(15,21,"Testing");
	Mainframe_GlobalFunctionLib.pressKey("Enter");
	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	Mainframe_GlobalFunctionLib.pressKey("F3");
	Mainframe_GlobalFunctionLib.pressKey("F3");
	Mainframe_GlobalFunctionLib.pressKey("F3");
	Mainframe_GlobalFunctionLib.pressKey("F3");
}

@When("^reprocessing the claim through plan screen with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
public void reprocessing_the_claim_through_plan_screen_with(String memid, String fromdate, String thrudate) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    FunctionalLibrary.navigateToScreen("4");
    FunctionalLibrary.navigateToScreen("14");
    FunctionalLibrary.navigateToScreen("8");
    FunctionalLibrary.navigateToScreen("1");
    TimeUnit.MINUTES.sleep(5);
    Mainframe_GlobalFunctionLib.sendText(4,5,memid);
	Mainframe_GlobalFunctionLib.pressKey("Enter");
	Mainframe_GlobalFunctionLib.sendText(10,2,"7");
	Mainframe_GlobalFunctionLib.pressKey("Enter");
	Mainframe_GlobalFunctionLib.sendText(6,48,"Y");
	Mainframe_GlobalFunctionLib.sendText(11,79,"O");
	Mainframe_GlobalFunctionLib.pressKey("Enter");
	Mainframe_GlobalFunctionLib.sendText(13,18,"OGS");
	Mainframe_GlobalFunctionLib.sendText(16,18,"HYD");
	Mainframe_GlobalFunctionLib.sendText(16,39,"CA");
	Mainframe_GlobalFunctionLib.sendText(16,42,"12345");
	Mainframe_GlobalFunctionLib.pressKey("Enter");
	Mainframe_GlobalFunctionLib.sendText(13,18,"OGS");
	Mainframe_GlobalFunctionLib.sendText(16,18,"HYD");
	Mainframe_GlobalFunctionLib.sendText(16,39,"CA");
	Mainframe_GlobalFunctionLib.sendText(16,42,"12345");
	Mainframe_GlobalFunctionLib.pressKey("Enter");
	Mainframe_GlobalFunctionLib.sendText(13,18,"OGS");
	Mainframe_GlobalFunctionLib.sendText(16,18,"HYD");
	Mainframe_GlobalFunctionLib.sendText(16,39,"CA");
	Mainframe_GlobalFunctionLib.sendText(16,42,"12345");
	Mainframe_GlobalFunctionLib.pressKey("Enter");
	Mainframe_GlobalFunctionLib.sendText(13,18,"OGS");
	Mainframe_GlobalFunctionLib.sendText(16,18,"HYD");
	Mainframe_GlobalFunctionLib.sendText(16,39,"CA");
	Mainframe_GlobalFunctionLib.sendText(16,42,"12345");
	Mainframe_GlobalFunctionLib.pressKey("Enter");
	Mainframe_GlobalFunctionLib.sendText(13,18,"OGS");
	Mainframe_GlobalFunctionLib.sendText(16,18,"HYD");
	Mainframe_GlobalFunctionLib.sendText(16,39,"CA");
	Mainframe_GlobalFunctionLib.sendText(16,42,"12345");
	Mainframe_GlobalFunctionLib.pressKey("Enter");
	Mainframe_GlobalFunctionLib.sendText(13,18,"OGS");
	Mainframe_GlobalFunctionLib.sendText(16,18,"HYD");
	Mainframe_GlobalFunctionLib.sendText(16,39,"CA");
	Mainframe_GlobalFunctionLib.sendText(16,42,"12345");
	Mainframe_GlobalFunctionLib.pressKey("Enter");
	Mainframe_GlobalFunctionLib.pressKey("F3");
	Mainframe_GlobalFunctionLib.pressKey("F12");
	Mainframe_GlobalFunctionLib.pressKey("F12");
	Mainframe_GlobalFunctionLib.pressKey("F12");
}

@Then("^Validating the reprocessing claims through member screen with \"([^\"]*)\"$")
public void validating_the_reprocessing_claims_through_member_screen_with(String memid) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	FunctionalLibrary.navigateToScreen("1");
    FunctionalLibrary.navigateToScreen("2");
    Mainframe_GlobalFunctionLib.sendText(4,4,memid);
	Mainframe_GlobalFunctionLib.pressKey("Enter");
	Mainframe_GlobalFunctionLib.sendText(10,2,"5");
	Mainframe_GlobalFunctionLib.pressKey("Enter");
	Mainframe_GlobalFunctionLib.pressKey("F10");
	//Claims
	Mainframe_GlobalFunctionLib.sendText(14,2,"7");
	Mainframe_GlobalFunctionLib.pressKey("Enter");
	Mainframe_GlobalFunctionLib.pressKey("F22");
	String status = Mainframe_GlobalFunctionLib.getText(14, 78);
	if(!status.equals("X"))
	{
		Mainframe_GlobalFunctionLib.pressKey("F22");
	}
	else if(status.equals("X"))
	{
		System.out.println("Status is : "+status);
	}
	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	Mainframe_GlobalFunctionLib.sendText(14,2,"5");
	Mainframe_GlobalFunctionLib.pressKey("Enter");
	Mainframe_GlobalFunctionLib.pressKey("F7");
	Mainframe_GlobalFunctionLib.sendText(4,23,"1");
	Mainframe_GlobalFunctionLib.pressKey("Enter");
	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	Mainframe_GlobalFunctionLib.pressKey("PageDown");
	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	Mainframe_GlobalFunctionLib.pressKey("PageDown");
	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	Mainframe_GlobalFunctionLib.pressKey("F3");
	Mainframe_GlobalFunctionLib.pressKey("F3");
	Mainframe_GlobalFunctionLib.pressKey("F12");
	//2
	Mainframe_GlobalFunctionLib.sendText(15,2,"7");
	Mainframe_GlobalFunctionLib.pressKey("Enter");
	Mainframe_GlobalFunctionLib.pressKey("F22");
	String status1 = Mainframe_GlobalFunctionLib.getText(14, 78);
	if(!status1.equals("X"))
	{
		Mainframe_GlobalFunctionLib.pressKey("F22");
	}
	else if(status1.equals("X"))
	{
		System.out.println("Status is : "+status1);
	}
	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	Mainframe_GlobalFunctionLib.sendText(14,2,"5");
	Mainframe_GlobalFunctionLib.pressKey("Enter");
	Mainframe_GlobalFunctionLib.pressKey("F7");
	Mainframe_GlobalFunctionLib.sendText(4,23,"1");
	Mainframe_GlobalFunctionLib.pressKey("Enter");
	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	Mainframe_GlobalFunctionLib.pressKey("PageDown");
	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	Mainframe_GlobalFunctionLib.pressKey("PageDown");
	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	Mainframe_GlobalFunctionLib.pressKey("F3");
	Mainframe_GlobalFunctionLib.pressKey("F3");
	Mainframe_GlobalFunctionLib.pressKey("F12");
	//3
	Mainframe_GlobalFunctionLib.sendText(16,2,"7");
	Mainframe_GlobalFunctionLib.pressKey("Enter");
	Mainframe_GlobalFunctionLib.pressKey("F22");
	String status2 = Mainframe_GlobalFunctionLib.getText(14, 78);
	if(!status2.equals("X"))
	{
		Mainframe_GlobalFunctionLib.pressKey("F22");
	}
	else if(status2.equals("X"))
	{
		System.out.println("Status is : "+status2);
	}
	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	Mainframe_GlobalFunctionLib.sendText(14,2,"5");
	Mainframe_GlobalFunctionLib.pressKey("Enter");
	Mainframe_GlobalFunctionLib.pressKey("F7");
	Mainframe_GlobalFunctionLib.sendText(4,23,"1");
	Mainframe_GlobalFunctionLib.pressKey("Enter");
	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	Mainframe_GlobalFunctionLib.pressKey("PageDown");
	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	Mainframe_GlobalFunctionLib.pressKey("PageDown");
	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	Mainframe_GlobalFunctionLib.pressKey("F3");
	Mainframe_GlobalFunctionLib.pressKey("F3");
	Mainframe_GlobalFunctionLib.pressKey("F12");
	//4
	Mainframe_GlobalFunctionLib.sendText(17,2,"7");
	Mainframe_GlobalFunctionLib.pressKey("Enter");
	Mainframe_GlobalFunctionLib.pressKey("F22");
	String status3 = Mainframe_GlobalFunctionLib.getText(14, 78);
	if(!status3.equals("X"))
	{
		Mainframe_GlobalFunctionLib.pressKey("F22");
	}
	else if(status3.equals("X"))
	{
		System.out.println("Status is : "+status3);
	}
	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	Mainframe_GlobalFunctionLib.sendText(14,2,"5");
	Mainframe_GlobalFunctionLib.pressKey("Enter");
	Mainframe_GlobalFunctionLib.pressKey("F7");
	Mainframe_GlobalFunctionLib.sendText(4,23,"1");
	Mainframe_GlobalFunctionLib.pressKey("Enter");
	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	Mainframe_GlobalFunctionLib.pressKey("PageDown");
	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	Mainframe_GlobalFunctionLib.pressKey("PageDown");
	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	Mainframe_GlobalFunctionLib.pressKey("F3");
	Mainframe_GlobalFunctionLib.pressKey("F3");
	Mainframe_GlobalFunctionLib.pressKey("F12");
	//5
	Mainframe_GlobalFunctionLib.sendText(18,2,"7");
	Mainframe_GlobalFunctionLib.pressKey("Enter");
	Mainframe_GlobalFunctionLib.pressKey("F22");
	String status4 = Mainframe_GlobalFunctionLib.getText(14, 78);
	if(!status4.equals("X"))
	{
		Mainframe_GlobalFunctionLib.pressKey("F22");
	}
	else if(status4.equals("X"))
	{
		System.out.println("Status is : "+status4);
	}
	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	Mainframe_GlobalFunctionLib.sendText(14,2,"5");
	Mainframe_GlobalFunctionLib.pressKey("Enter");
	Mainframe_GlobalFunctionLib.pressKey("F7");
	Mainframe_GlobalFunctionLib.sendText(4,23,"1");
	Mainframe_GlobalFunctionLib.pressKey("Enter");
	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	Mainframe_GlobalFunctionLib.pressKey("PageDown");
	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	Mainframe_GlobalFunctionLib.pressKey("PageDown");
	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	Mainframe_GlobalFunctionLib.pressKey("F3");
	Mainframe_GlobalFunctionLib.pressKey("F3");
	Mainframe_GlobalFunctionLib.pressKey("F12");
	//6
		Mainframe_GlobalFunctionLib.sendText(19,2,"7");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F22");
		String status5 = Mainframe_GlobalFunctionLib.getText(14, 78);
		if(!status5.equals("X"))
		{
			Mainframe_GlobalFunctionLib.pressKey("F22");
		}
		else if(status5.equals("X"))
		{
			System.out.println("Status is : "+status5);
		}
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.sendText(14,2,"5");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F7");
		Mainframe_GlobalFunctionLib.sendText(4,23,"1");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("PageDown");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("PageDown");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
}

@Then("^additional patient pay is added to the patient pay schedule with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
public void additional_patient_pay_is_added_to_the_patient_pay_schedule_with(String PATschedule, String seq, String patname) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	Mainframe_GlobalFunctionLib.sendText(4,6,PATschedule);
	Mainframe_GlobalFunctionLib.pressKey("Enter");
	Mainframe_GlobalFunctionLib.sendText(10,2,"15");
	Mainframe_GlobalFunctionLib.pressKey("Enter");
	Mainframe_GlobalFunctionLib.pressKey("F6");
	Mainframe_GlobalFunctionLib.sendText(5,26,seq );
	Mainframe_GlobalFunctionLib.sendText(6,26,patname );
	Mainframe_GlobalFunctionLib.pressKey("Enter");
	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	Mainframe_GlobalFunctionLib.pressKey("F3");
	Mainframe_GlobalFunctionLib.pressKey("F12");
}
}
