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
		
		@When("^I add Member Prior Authorization \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
		public void i_add_Member_Prior_Authorization(String Number, String Type, String MSC, String NDC_GPI_List_ID, String FromDate, String ThruDate, String Agt, String IgnoreDrgSts, String Rsn) throws Throwable {
			Mainframe_GlobalFunctionLib.pressKey("F6");
			Mainframe_GlobalFunctionLib.sendText(16, 5, Number);
			Mainframe_GlobalFunctionLib.sendText(16, 18, Type);
			Mainframe_GlobalFunctionLib.sendText(16, 26, MSC);
			Mainframe_GlobalFunctionLib.sendText(16, 42, FromDate);
			Mainframe_GlobalFunctionLib.sendText(16, 51, ThruDate);
			Mainframe_GlobalFunctionLib.sendText(16, 61, ThruDate);
			Mainframe_GlobalFunctionLib.sendText(16, 66, Agt);
			Mainframe_GlobalFunctionLib.sendText(16, 71, IgnoreDrgSts);
			Thread.sleep(3000);
			Mainframe_GlobalFunctionLib.pressKey("enter");
		}
		
		@When("^I edit Member Prior Authorization list$")
		public void i_edit_Member_Prior_Authorization_list() throws Throwable {
			Mainframe_GlobalFunctionLib.sendText(16, 02, "2");
			Mainframe_GlobalFunctionLib.pressKey("enter");
		}

		@When("^I add Member NDC Prior Authorization Price \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
		public void i_add_Member_NDC_Prior_Authorization_Price(String PSC, String MSC2, String Status, String MSC_Override) throws Throwable {
			Mainframe_GlobalFunctionLib.pressKey("F6");
			Mainframe_GlobalFunctionLib.sendText(13, 23, PSC);
			Mainframe_GlobalFunctionLib.sendText(14, 23, MSC2);
			Mainframe_GlobalFunctionLib.pressKey("enter");
			Mainframe_GlobalFunctionLib.sendText(8, 21, Status);
			Mainframe_GlobalFunctionLib.sendText(12, 47, MSC_Override);
			Mainframe_GlobalFunctionLib.pressKey("enter");
		}
		
		public static String ProductName=null;
		@When("^I search Product \"([^\"]*)\" and take option (\\d+) to check the list$")
		public void i_search_Product_and_take_option_to_check_the_list(String ProductName, String ProductID) throws Throwable {
			Mainframe_GlobalFunctionLib.sendText(4, 5, ProductName);
			Mainframe_GlobalFunctionLib.pressKey("enter");
			//search by pID[f15]
			//f6
			//CAG details
			// Multi-Source               O [TC24]
			//patient pay-MSC: Y for TC25
			
			String actualProductName=Mainframe_GlobalFunctionLib.getText(9, 5);
			ProductName=actualProductName;
			if(actualProductName.equals(ProductName))
			{
				System.out.println("Expected Active Products by Name found in list: "+ProductName);
				Mainframe_GlobalFunctionLib.sendText(9, 2, "7");
				Mainframe_GlobalFunctionLib.pressKey("enter");
				String activeProductID=Mainframe_GlobalFunctionLib.getText(15, 47);
				if(activeProductID.contains(ProductID))
				{
				System.out.println("Active Products found in RCPID007 screen: "+activeProductID);
				}
				else
				{
					
				}
			}
			else
			{
				System.out.println("Product ID not found");
			}
		}

		
		@When("^I add Product \"([^\"]*)\", \"([^\"]*)\"$")
		public void i_add_Product(String ProductID, String Type) throws Throwable {
			Mainframe_GlobalFunctionLib.sendText(15, 26, ProductID);
			Mainframe_GlobalFunctionLib.sendText(15, 48, Type);
			Mainframe_GlobalFunctionLib.pressKey("enter");
		}

}
