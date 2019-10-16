package com.atdd.demo.te.stepdefinitons;

import com.atdd.te.screenHelpers.FunctionalLibrary;
import com.cucumber.listener.Reporter;
import com.optumrx.autofusion.core.te.util.Mainframe_GlobalFunctionLib;
import com.optumrx.autofusion.core.te.util.Screenshot;

import cucumber.api.java.en.When;
import junit.framework.Assert;

public class CreateOrEditPlanGPINDCList {

	
	@When("^I edit Plan GPI/NDC List \"([^\"]*)\",\"([^\"]*)\"$")
	public void i_edit_Plan_GPI_NDC_List(String planCode, String gpiList) throws Throwable {
		Mainframe_GlobalFunctionLib.sendText(7, 4, "  ");
		Mainframe_GlobalFunctionLib.sendText(7, 8, "          ");
		Mainframe_GlobalFunctionLib.sendText(7, 8, gpiList);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		if(Mainframe_GlobalFunctionLib.getText(11, 8).trim().equalsIgnoreCase(gpiList))
		{
		Mainframe_GlobalFunctionLib.sendText(11, 2, "2");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		}
		else{
		Assert.fail("Gpi List "+ gpiList +" is not attached to the plan");
		Reporter.addStepLog("Gpi List "+ gpiList +" is not attached to the plan");
		}
	}
	
	@When("^I edit Plan GPI \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_edit_Plan_GPI(String planCode, String gpiList, String gpiNumber) throws Throwable {
	    
		Mainframe_GlobalFunctionLib.sendText(7, 8, "          ");
		Mainframe_GlobalFunctionLib.sendText(7, 8, gpiList);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		if(Mainframe_GlobalFunctionLib.getText(11, 8).trim().equalsIgnoreCase(gpiList))
		{
		Mainframe_GlobalFunctionLib.sendText(11, 2, "7");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		}
		else{
		Assert.fail("Gpi List "+ gpiList +" is not attached to the plan");
		Reporter.addStepLog("Gpi List "+ gpiList +" is not attached to the plan");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		}
		Mainframe_GlobalFunctionLib.pressKey("F16");
		Mainframe_GlobalFunctionLib.sendText(6, 4, gpiNumber);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		if(Mainframe_GlobalFunctionLib.getText(12, 4).trim().equalsIgnoreCase(gpiNumber))
		{
		Mainframe_GlobalFunctionLib.sendText(12, 2, "2");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		}
		else{
		Assert.fail("Gpi "+ gpiNumber +" is not found insde GPI List " + gpiList );
		Reporter.addStepLog("Gpi "+ gpiNumber +" is not found insde GPI List " + gpiList );
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		}
	}	
	
	@When("^I edit Plan NDC \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_edit_Plan_NDC(String planCode, String ndcList, String ndcNumber) throws Throwable {
	    
		Mainframe_GlobalFunctionLib.sendText(7, 8, "         ");
		Mainframe_GlobalFunctionLib.sendText(7, 8, ndcList);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		if(Mainframe_GlobalFunctionLib.getText(11, 8).trim().equalsIgnoreCase(ndcList))
		{
		Mainframe_GlobalFunctionLib.sendText(11, 2, "7");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		}
		else{
		Assert.fail("NDC List "+ ndcList +" is not attached to the plan");
		Reporter.addStepLog("Gpi List "+ ndcList +" is not attached to the plan");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		}
		Mainframe_GlobalFunctionLib.pressKey("F16");
		Mainframe_GlobalFunctionLib.sendText(6, 4, ndcNumber);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		String ndc = Mainframe_GlobalFunctionLib.getText(11, 4)+ Mainframe_GlobalFunctionLib.getText(11, 10)+Mainframe_GlobalFunctionLib.getText(11, 15);
		if(ndc.equalsIgnoreCase(ndcNumber)){
		Mainframe_GlobalFunctionLib.sendText(11, 2, "2");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		}
		else{
		Assert.fail("NDC "+ ndcNumber +" is not found insde NDC List " + ndcList );
		Reporter.addStepLog("NDC "+ ndcNumber +" is not found insde NDC List " +ndcList );
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		}
	}	


	@When("^I add Bypass Contigent Therapy Conditions on \"([^\"]*)\" with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_add_Bypass_Contigent_Therapy_Conditions_on_with(String screenName,String seq, String drugStatus, String daysSupply, String mscM, String mscN, String mscO, String mscY, String mscX, String mscZ) throws Throwable {
		boolean b = false;
		Mainframe_GlobalFunctionLib.pressKey("F16");
		
		if(Mainframe_GlobalFunctionLib.getText(1, 2).equalsIgnoreCase("RCPGQ001"))
		b = FunctionalLibrary.func_SearchAndSelectADataEditMode("8,5" ,seq ,"13,5" , seq);
			else if(Mainframe_GlobalFunctionLib.getText(1, 2).equalsIgnoreCase("RCPNQ001"))
		b =FunctionalLibrary.func_SearchAndSelectADataEditMode("7,5" ,seq ,"12,5" , seq);
		if(!(b)){
			Mainframe_GlobalFunctionLib.pressKey("F6");
			FunctionalLibrary.enterText( seq,  "Sequence",  screenName);
			Mainframe_GlobalFunctionLib.pressKey("Enter");
		}
		FunctionalLibrary.enterText( drugStatus,"DrugStatus",screenName);
		FunctionalLibrary.enterText( "   ","DaysSupply",screenName);
		FunctionalLibrary.enterText( daysSupply,"DaysSupply",screenName);
		FunctionalLibrary.enterText( mscM,"MultiSourceCode-M",screenName);
		FunctionalLibrary.enterText( mscN,"MultiSourceCode-N",screenName);
		FunctionalLibrary.enterText( mscO,"MultiSourceCode-O",screenName);
		FunctionalLibrary.enterText( mscY,"MultiSourceCode-Y",screenName);
		FunctionalLibrary.enterText( mscX,"MultiSourceCode-X",screenName);
		FunctionalLibrary.enterText( mscZ,"MultiSourceCode-Z",screenName);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
	}
	
	@When("^I create a GPI List with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_create_a_GPI_List_with(String gpiList, String description, String planDefault, String listqualifier, String activateAudit, String rejectionList) throws Throwable {
	
		Mainframe_GlobalFunctionLib.sendText(21, 7 ,"4" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(21, 7 ,"2" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(21, 7 ,"1" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		if(!(FunctionalLibrary.func_SearchAndSelectADataEditMode("4,6" ,gpiList ,"11,6" , gpiList))){
		Mainframe_GlobalFunctionLib.pressKey("F6");
		FunctionalLibrary.enterText(gpiList,"GPIList","AddPlanGPIListScreen" );
		if(!(description.length()==0))
		FunctionalLibrary.enterText(description ,"Description","AddPlanGPIListScreen" );
		if(!(planDefault.length()==0))
		FunctionalLibrary.enterText(planDefault,"PlanDefault","AddPlanGPIListScreen" );
		if(!(listqualifier.length()==0))
		FunctionalLibrary.enterText(listqualifier,"ListQualifier","AddPlanGPIListScreen" );
		if(!(activateAudit.length()==0))
		FunctionalLibrary.enterText(activateAudit,"ActivateAudit","AddPlanGPIListScreen" );
		if(!(rejectionList.length()==0))
		FunctionalLibrary.enterText(rejectionList,"RejectionList","AddPlanGPIListScreen" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		FunctionalLibrary.enterText("Y","ConfirmPrompt","AddPlanGPIListScreen" );
		}
	}
}
