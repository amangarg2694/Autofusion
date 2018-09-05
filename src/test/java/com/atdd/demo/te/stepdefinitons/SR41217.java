package com.atdd.demo.te.stepdefinitons;

import com.atdd.te.screenHelpers.FunctionalLibrary;
import com.optumrx.autofusion.core.te.util.Mainframe_GlobalFunctionLib;

import cucumber.api.java.en.When;

public class SR41217 {
	@When("^I press \"([^\"]*)\" key$")
	public void i_press_key(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
				    
		}

@When("^I enter \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
public void i_enter(String RCMAIFromDate, String RCMAIThruDate, String RCMAIFlag, String RCMAIType, String RCMAICode, String RCMAIID) throws Throwable {
	Mainframe_GlobalFunctionLib.sendText(10,13,RCMAIFromDate);
	Mainframe_GlobalFunctionLib.sendText(11,13,RCMAIThruDate);
	Mainframe_GlobalFunctionLib.sendText(13,13,RCMAIFlag);
	Mainframe_GlobalFunctionLib.sendText(14,13,RCMAIType);
	Mainframe_GlobalFunctionLib.sendText(15,13,RCMAICode);
	Mainframe_GlobalFunctionLib.sendText(16,13,RCMAIID);
	
	
	


}


@When("^I copy the input file from \"([^\"]*)\",\"([^\"]*)\" to \"([^\"]*)\",\"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" to prepare input file$")
public void i_copy_the_input_file_from_to_to_prepare_input_file(String srcfile, String srclib, String destfile, String destlib, String ReplaceOrAdd, String YES_NO) throws Throwable {
	Mainframe_GlobalFunctionLib.sendText(21,7 ,"cpyf");
	FunctionalLibrary.pressEnter();
	Mainframe_GlobalFunctionLib.sendText(5,37 ,srcfile);
	Mainframe_GlobalFunctionLib.sendText(6,39 ,srclib);
	Mainframe_GlobalFunctionLib.sendText(7,37 ,destfile);
	Mainframe_GlobalFunctionLib.sendText(8,39 ,destlib);
	Mainframe_GlobalFunctionLib.sendText(11,38 ,ReplaceOrAdd +" ");
	Mainframe_GlobalFunctionLib.sendText(12,38 ,YES_NO);
	FunctionalLibrary.pressEnter();
}




@When("^I enter \"([^\"]*)\",\"([^\"]*)\" \"([^\"]*)\"  \"([^\"]*)\"  \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" on \"([^\"]*)\"$")
public void i_enter_on(String RCMMCFromDate, String RCMMCThruDate, String RCMMCCoverageType, String RCMMCBIN, String RCMMCHelpdeskPhone, String RCMMCCoverageID, String RCMMCMemberID, String RCMMCPersonCode, String RCMMCCoverageCategory, String arg10) throws Throwable {
	Mainframe_GlobalFunctionLib.sendText(10,18,RCMMCFromDate);
	Mainframe_GlobalFunctionLib.sendText(10,39,RCMMCThruDate);
	Mainframe_GlobalFunctionLib.sendText(12,25,RCMMCCoverageType);
	Mainframe_GlobalFunctionLib.sendText(13,25,RCMMCBIN);
	Mainframe_GlobalFunctionLib.sendText(14,25,RCMMCHelpdeskPhone);
	Mainframe_GlobalFunctionLib.sendText(16,25,RCMMCCoverageID);
	Mainframe_GlobalFunctionLib.sendText(17,25,RCMMCMemberID);
	Mainframe_GlobalFunctionLib.sendText(18,25,RCMMCPersonCode);
	Mainframe_GlobalFunctionLib.sendText(19,25,RCMMCCoverageCategory);
}



@When("^I enter Option \"([^\"]*)\" to navigate to \"([^\"]*)\"$")
public void i_enter_Option_to_navigate_to(String option, String screen) throws Throwable {
    
	// Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
	FunctionalLibrary.enterText(4,20 ,option);
	FunctionalLibrary.pressEnter();
}
@When("^I take Option \"([^\"]*)\" to navigate to \"([^\"]*)\"$")
public void i_take_Option_to_navigate_to(String option, String screen) throws Throwable {
	FunctionalLibrary.enterText(5,20 ,option);
	FunctionalLibrary.pressEnter();
    
}
/*@When("^I work with file \"([^\"]*)\",\"([^\"]*)\" to update member details$")
public void i_work_with_file_to_update_member_details(String destfile, String destlib) throws Throwable {
	Mainframe_GlobalFunctionLib.sendText(21,7 ,"ywrkf");
	FunctionalLibrary.pressEnter();
	Mainframe_GlobalFunctionLib.sendText(5,37 ,destfile);
	Mainframe_GlobalFunctionLib.sendText(6,39 ,destlib);
	FunctionalLibrary.pressEnter(); 
	Mainframe_GlobalFunctionLib.sendText(9,2 ,"5");
	FunctionalLibrary.pressEnter(); 
	
}*/
@When("^I work with file \"([^\"]*)\",\"([^\"]*)\" to update member details with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
public void i_work_with_file_to_update_member_details_with(String destfile, String destlib, String CarrierID, String AccountID, String GroupID, String MemberID, String FirstName, String LastName, String DOB, String FromDate, String ThruDate) throws Throwable {
    
	Mainframe_GlobalFunctionLib.sendText(21,7 ,"ywrkf");
	FunctionalLibrary.pressEnter();
	Mainframe_GlobalFunctionLib.sendText(5,37 ,destfile);
	Mainframe_GlobalFunctionLib.sendText(6,39 ,destlib);
	FunctionalLibrary.pressEnter(); 
	Mainframe_GlobalFunctionLib.sendText(8,43 ,CarrierID);
	Mainframe_GlobalFunctionLib.sendText(8,52 ,AccountID);
	Mainframe_GlobalFunctionLib.sendText(8,67 ,GroupID);
	Mainframe_GlobalFunctionLib.sendText(9,42 ,MemberID);
	Mainframe_GlobalFunctionLib.sendText(8,43 ,FirstName);
	Mainframe_GlobalFunctionLib.sendText(8,43 ,LastName);
	Mainframe_GlobalFunctionLib.sendText(8,43 ,DOB);
	Mainframe_GlobalFunctionLib.sendText(8,43 ,FromDate);
	Mainframe_GlobalFunctionLib.sendText(8,43 ,ThruDate);
	FunctionalLibrary.pressEnter(); 
	
	
	
}
	
	}
