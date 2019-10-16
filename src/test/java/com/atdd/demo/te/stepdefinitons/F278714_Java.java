package com.atdd.demo.te.stepdefinitons;

import org.testng.Assert;
import com.atdd.te.screenHelpers.FunctionalLibrary;
import com.cucumber.listener.Reporter;
import com.optumrx.autofusion.core.te.util.Mainframe_GlobalFunctionLib;
import com.optumrx.autofusion.core.te.util.Screenshot;

import cucumber.api.java.en.When;
public class F278714_Java extends FunctionalLibrary {


   @When("^I Setup Plan with Super NDC List \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
public void i_Setup_Plan_with_Super_NDC_List(String plancode, String ndclist, String ndcsq, String ndcfromdate, String ndcthrudate) throws Throwable {
		try {
			navigateToRxClaimPlanAdministrator();
		} catch (Exception e) {
			e.printStackTrace();
		}
		try{
				Mainframe_GlobalFunctionLib.sendText(21, 7 ,"4" );
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(21, 7 ,"1" );
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				func_SearchAndSelectADataEditMode("4,5" ,plancode ,"11,6" , plancode);
				Mainframe_GlobalFunctionLib.sendText(15, 24 ,"Y" );
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(16, 64 ,"Y" );
				Mainframe_GlobalFunctionLib.pressKey("F7");
				Mainframe_GlobalFunctionLib.sendText(7, 21 ,"10" );
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				if(func_SearchAndEditPlanNDCGPIList(ndclist))
				{
					Mainframe_GlobalFunctionLib.sendText(13, 17 ,"   ");
					Mainframe_GlobalFunctionLib.sendText(13, 17, ndcsq);
					Mainframe_GlobalFunctionLib.sendText(14, 17 ,"        ");
					Mainframe_GlobalFunctionLib.sendText(14, 17, ndcfromdate);
					Mainframe_GlobalFunctionLib.sendText(14, 41 ,"        ");
					Mainframe_GlobalFunctionLib.sendText(14, 41, ndcthrudate);
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					Mainframe_GlobalFunctionLib.sendText(16, 64 ,"Y" );
				}
				else
				{
					Mainframe_GlobalFunctionLib.pressKey("F7");
					func_SearchAndSelectMode("4,5" ,ndclist ,"9,5" , ndclist);
					Mainframe_GlobalFunctionLib.sendText(13, 17 ,"   ");
					Mainframe_GlobalFunctionLib.sendText(13, 17, ndcsq);
					Mainframe_GlobalFunctionLib.sendText(14, 17 ,"        ");
					Mainframe_GlobalFunctionLib.sendText(14, 17, ndcfromdate);
					Mainframe_GlobalFunctionLib.sendText(14, 41 ,"        ");
					Mainframe_GlobalFunctionLib.sendText(14, 41, ndcthrudate);
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					Mainframe_GlobalFunctionLib.sendText(16, 64 ,"Y" );
					Mainframe_GlobalFunctionLib.pressKey("F12");
				}	
			  	if(ScreenshotOption.equalsIgnoreCase("Always")){
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				}
				}catch(Exception e)
				{	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
					Assert.fail("The Plan with Super NDC List is not set successfully.Screenshot is captured");
				}
		}
   
   @When("^I Setup plan with Super GPI List \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
   public void i_Setup_plan_with_Super_GPI_List(String plancode,String gpilist,String gpisq, String gpifromdate,String gpithrudate) throws Throwable
	{
	try {
		navigateToRxClaimPlanAdministrator();
	} catch (Exception e) {
		e.printStackTrace();
	}
	try{
			Mainframe_GlobalFunctionLib.sendText(21, 7 ,"4" );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(21, 7 ,"1" );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			func_SearchAndSelectADataEditMode("4,5" ,plancode ,"11,6" , plancode);
			Mainframe_GlobalFunctionLib.sendText(6, 51 ,"Y" );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(16, 64 ,"Y" );
			Mainframe_GlobalFunctionLib.pressKey("F7");
			Mainframe_GlobalFunctionLib.sendText(7, 21 ,"11" );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			if(func_SearchAndEditPlanNDCGPIList(gpilist))
			{
				Mainframe_GlobalFunctionLib.sendText(13, 17 ,"   ");
				Mainframe_GlobalFunctionLib.sendText(13, 17, gpisq);
				Mainframe_GlobalFunctionLib.sendText(14, 17 ,"        ");
				Mainframe_GlobalFunctionLib.sendText(14, 17, gpifromdate);
				Mainframe_GlobalFunctionLib.sendText(14, 41 ,"        ");
				Mainframe_GlobalFunctionLib.sendText(14, 41, gpithrudate);
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(16, 64 ,"Y" );
			}
			else
			{
				Mainframe_GlobalFunctionLib.pressKey("F7");
				func_SearchAndSelectMode("4,5" ,gpilist ,"9,5" , gpilist);
				Mainframe_GlobalFunctionLib.sendText(13, 17 ,"   ");
				Mainframe_GlobalFunctionLib.sendText(13, 17, gpisq);
				Mainframe_GlobalFunctionLib.sendText(14, 17 ,"        ");
				Mainframe_GlobalFunctionLib.sendText(14, 17, gpifromdate);
				Mainframe_GlobalFunctionLib.sendText(14, 41 ,"        ");
				Mainframe_GlobalFunctionLib.sendText(14, 41, gpithrudate);
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(16, 64 ,"Y" );
				Mainframe_GlobalFunctionLib.pressKey("F12");
			}	
		  	if(ScreenshotOption.equalsIgnoreCase("Always")){
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			}
			}catch(Exception e)
			{	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				Assert.fail("The Plan with Super NDC List is not set successfully.Screenshot is captured");
			}
   
	} 
   
}
