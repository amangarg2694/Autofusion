package com.atdd.demo.te.stepdefinitons;

import com.atdd.te.screenHelpers.FunctionalLibrary;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateorEditMember {

	
	@Then("^Validate Member \"([^\"]*)\" added$")
	public void validate_Member_added(String memberID) throws Throwable {
		FunctionalLibrary.validateText("10" ,"4" , memberID );
	}
	@When("^I attach DST Table \"([^\"]*)\" on PA \"([^\"]*)\" for member \"([^\"]*)\" if Attach DST Flag is \"([^\"]*)\"$")
	public void i_attach_DST_Table_on_PA_for_member_if_Attach_DST_Flag_is(String dstTable, String paNumber, String memberID, String attachDSTFlag) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
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

	    else  if(attachPRCFlag.equalsIgnoreCase(""))
	    	FunctionalLibrary.func_AttachPRCListOnPA(memberID, paNumber, prcList, prcListQual);

		
	}

	
	
}
