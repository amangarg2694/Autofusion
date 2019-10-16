package com.atdd.demo.te.stepdefinitons;

import com.atdd.te.screenHelpers.FunctionalLibrary;
import com.optumrx.autofusion.core.te.util.Mainframe_GlobalFunctionLib;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateorEditMember {

	@Then("^Validate Member \"([^\"]*)\" added$")
	public void validate_Member_added(String memberID) throws Throwable {
		FunctionalLibrary.validateText("10" ,"4" , memberID );
	}
	
	@Then("^Validate PA Member \"([^\"]*)\" added$")
	public void validate_PA_Member_added(String memberID) throws Throwable {
		FunctionalLibrary.validateText("6" ,"10" , FunctionalLibrary.PAMember1 );
	}
	@When("^I attach DST Table \"([^\"]*)\" on PA \"([^\"]*)\" for member \"([^\"]*)\" if Attach DST Flag is \"([^\"]*)\"$")
	public void i_attach_DST_Table_on_PA_for_member_if_Attach_DST_Flag_is(String dstTable, String paNumber, String memberID, String attachDSTFlag) throws Throwable {
		if(attachDSTFlag.equalsIgnoreCase("No"))
			dstTable="             ";
		else if(attachDSTFlag.equalsIgnoreCase("Yes"))
		FunctionalLibrary.func_AttachDSTOnPA(memberID, paNumber, dstTable);

	}
	
	@When("^I set Drug status \"([^\"]*)\" on PA \"([^\"]*)\" for member \"([^\"]*)\"$")
	public void i_set_Drug_status_on_PA_for_member(String drugStatus, String paNumber,String memberID) throws Throwable {

		if(drugStatus.length()!=0)
		FunctionalLibrary.addDrugStatusOnPA(memberID, paNumber, drugStatus);
	}

	@When("^I attach PRC List \"([^\"]*)\" and Qual \"([^\"]*)\" on PA \"([^\"]*)\" for member \"([^\"]*)\" if Attach PRC List Flag is \"([^\"]*)\"$")
	public void i_attach_PRC_List_and_Qual_on_PA_for_member_if_Attach_PRC_List_Flag_is(String prcList, String prcListQual, String paNumber, String memberID, String attachPRCFlag) throws Throwable {
	    System.out.println("prc list qual : "+ prcListQual);
	    if(attachPRCFlag.equalsIgnoreCase("No"))
	    	prcList="          ";

	    else  if(attachPRCFlag.equalsIgnoreCase("Yes"))
	    	FunctionalLibrary.func_AttachPRCListOnPA(memberID, paNumber, prcList, prcListQual);
	}

	@When("^I set PA Third Party Exception Ignore Flag as \"([^\"]*)\" on PA \"([^\"]*)\"$")
	public void i_set_PA_Third_Party_Exception_Ignore_Flag_as_on_PA(String thirdPartyExceptionFlag, String paNumber) throws Throwable {
		if(thirdPartyExceptionFlag.length()!=0){
		Mainframe_GlobalFunctionLib.sendText(9, 5, "           ");
		Mainframe_GlobalFunctionLib.sendText(9, 5, paNumber);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(16, 2, "2");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(18, 79, thirdPartyExceptionFlag);	
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		
		}
}
	@When("^I go to Member screen and add  PA Number \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_go_to_Member_screen_and_add_PA_Number(String number, String type, String msc, String otc, String ndcgpilist, String from, String thru, String agent, String reason, String ignoredrugstatus) throws Throwable {
		String memberID = FunctionalLibrary.PAMember1;
		FunctionalLibrary.navigateToRxClaimPlanAdministrator();
		Mainframe_GlobalFunctionLib.sendText(21, 7 ,"1" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(21, 7 ,"2" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		FunctionalLibrary.func_SearchAndSelectADataEditMode("4,4" ,memberID ,"10,4" , memberID);
		FunctionalLibrary.func_SetPriorAuth(number,type,msc,otc,ndcgpilist,from,thru,agent,reason,ignoredrugstatus);
		
	}

	@When("^I set MPP Flag to \"([^\"]*)\" on PA \"([^\"]*)\" for member \"([^\"]*)\"$")
	public void i_set_MPP_Flag_to_on_PA_for_member(String mppFlag, String paNumber, String memberID) throws Throwable {
		Mainframe_GlobalFunctionLib.sendText(9, 5, "           ");
		Mainframe_GlobalFunctionLib.sendText(9, 5, paNumber);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(16, 2, "2");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("PageDown");
		Mainframe_GlobalFunctionLib.sendText(18, 26, mppFlag);	
		Mainframe_GlobalFunctionLib.pressKey("Enter");
	}


	@When("^I set MPU Flag to \"([^\"]*)\" on PA \"([^\"]*)\" for member \"([^\"]*)\"$")
	public void i_set_MPU_Flag_to_on_PA_for_member(String mpuFlag, String paNumber, String memberID) throws Throwable {
		Mainframe_GlobalFunctionLib.sendText(9, 5, "           ");
		Mainframe_GlobalFunctionLib.sendText(9, 5, paNumber);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(16, 2, "2");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F8");
		Mainframe_GlobalFunctionLib.pressKey("PageDown");
		Mainframe_GlobalFunctionLib.sendText(10, 30, mpuFlag);	
		Mainframe_GlobalFunctionLib.pressKey("Enter");
	}

	@When("^I set MedLimit Override to \"([^\"]*)\"$")
	public void i_set_MedLimit_Override_to(String medlimitOverride) throws Throwable {
		Mainframe_GlobalFunctionLib.sendText(10, 71, medlimitOverride);	
		Mainframe_GlobalFunctionLib.pressKey("Enter");
	}
	
	@When("^I set NTT Per Fill DS to \"([^\"]*)\"$")
	public void i_set_NTT_Per_Fill_DS_to(String nttPerFillDS) throws Throwable {
		Mainframe_GlobalFunctionLib.sendText(13, 20, nttPerFillDS);	
		Mainframe_GlobalFunctionLib.pressKey("Enter");
	}

	
}

	