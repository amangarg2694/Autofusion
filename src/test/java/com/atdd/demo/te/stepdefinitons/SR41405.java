package com.atdd.demo.te.stepdefinitons;

import com.optumrx.autofusion.core.te.util.Mainframe_GlobalFunctionLib;

import cucumber.api.java.en.When;

public class SR41405 {
	
	@When("^I search Member by MemberID \"([^\"]*)\"$")
	public void i_search_Member_by_MemberID(String MemberID) throws Throwable {
		Mainframe_GlobalFunctionLib.sendText(4, 4, "          ");
		Mainframe_GlobalFunctionLib.sendText(4, 4	, MemberID);
		Mainframe_GlobalFunctionLib.pressKey("enter");
		String actualMember=Mainframe_GlobalFunctionLib.getText(10, 4);
		if(actualMember.equals(MemberID))
		{
			System.out.println("Member ID Found in Result List: "+ MemberID);
			Mainframe_GlobalFunctionLib.sendText(10, 2, "2");
		}
	}

	
	@When("^I verify Override Plan with Plan \"([^\"]*)\"$")
	public void i_verify_Override_Plan_with_Plan(String Plan) throws Throwable {
		String memberPlanCode=Mainframe_GlobalFunctionLib.getText(20, 22);
		System.out.println("Plan Code in Member is : "+memberPlanCode);
		System.out.println("Expected PlanCode in Member: "+Plan);
		if(memberPlanCode.equals(Plan))
		{
			System.out.println("Expected PlanCode found in Member: "+Plan);
		}
		else
		{
			System.out.println("Expected PlanCode not found in Member: "+memberPlanCode);
			Mainframe_GlobalFunctionLib.click(20, 22);
			Mainframe_GlobalFunctionLib.pressKey("F7");
			Mainframe_GlobalFunctionLib.sendText(15, 2, "2");
			Mainframe_GlobalFunctionLib.pressKey("enter");
			Mainframe_GlobalFunctionLib.click(12, 14);
			Mainframe_GlobalFunctionLib.pressKey("F4");
			System.out.println("Actual Plan Code is: "+Plan);
			Mainframe_GlobalFunctionLib.sendText(4, 5, "          ");
			Thread.sleep(3000);
			Mainframe_GlobalFunctionLib.sendText(4, 5, Plan);
			Mainframe_GlobalFunctionLib.pressKey("enter");
			String resultPlanCode=Mainframe_GlobalFunctionLib.getText(10, 5);
			if(resultPlanCode.equals(Plan))
				{
					System.out.println("Plan Code found in Results list ie in RCPLN018 Screen: "+Plan);
					Mainframe_GlobalFunctionLib.sendText(10, 2, "1");
					Mainframe_GlobalFunctionLib.pressKey("enter");
					Mainframe_GlobalFunctionLib.pressKey("enter");
					Mainframe_GlobalFunctionLib.pressKey("F12");
					Mainframe_GlobalFunctionLib.pressKey("F12");
				}
				else
				{
					System.out.println(" Plan Code not found: "+resultPlanCode);
					System.exit(0);
				}
			}	
		}
	

		@When("^I provide family type and ID details \"([^\"]*)\"$")
		public void i_provide_family_type_and_ID_details(String MemberID) throws Throwable {
			Mainframe_GlobalFunctionLib.sendText(14, 22, "2");
			Mainframe_GlobalFunctionLib.sendText(14, 27, MemberID);
			Mainframe_GlobalFunctionLib.pressKey("enter");
		}

}
