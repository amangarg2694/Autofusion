package com.atdd.demo.te.stepdefinitons;
import org.testng.Assert;

import com.atdd.te.screenHelpers.FunctionalLibrary;
import com.cucumber.listener.Reporter;
import com.optumrx.autofusion.core.te.util.Mainframe_GlobalFunctionLib;
import com.optumrx.autofusion.core.te.util.Screenshot;

import cucumber.api.java.en.When;

public class DrgStsPrSchedule  {
	public static String ScreenshotOption = null;

	@When("^I setup drug status priority schedule with \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\",\"([^\"]*)\", \"([^\"]*)\"$")
	public void i_setup_drug_status_priority_schedule_with(String Schedule,String Priority, String Drugstatus, String Qualifier, String OverideList) throws Throwable {
	try {
			FunctionalLibrary.navigateToRxClaimPlanAdministrator();;
		} catch (Exception e) {
			e.printStackTrace();
		}
		try{
				Mainframe_GlobalFunctionLib.sendText(21, 7 ,"4" );
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(21, 7 ,"7" );
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(21, 7 ,"8" );
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(21, 7 ,"1" );
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				FunctionalLibrary.func_SearchAndSelectADataEditMode("4,5" ,Schedule ,"9,5" ,Schedule);
				Mainframe_GlobalFunctionLib.pressKey("F7");
				Mainframe_GlobalFunctionLib.pressKey("F6");
				Mainframe_GlobalFunctionLib.sendText(7, 24 ,Priority );
				Mainframe_GlobalFunctionLib.sendText(8, 24 ,Drugstatus );
				Mainframe_GlobalFunctionLib.sendText(9, 24 ,Qualifier );
				Mainframe_GlobalFunctionLib.click(10, 24 );
				Mainframe_GlobalFunctionLib.pressKey("F4");
				FunctionalLibrary.func_SearchAndSelectMode("3,5" ,OverideList ,"8,5" ,OverideList);
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				if(ScreenshotOption.equalsIgnoreCase("Always")){
					Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
					}
					}catch(Exception e)
					{	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
						Assert.fail("The drug status priority schedule item has not been added yet	");
					}
			}	

}
	
