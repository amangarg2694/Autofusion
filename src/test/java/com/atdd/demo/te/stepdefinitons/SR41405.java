package com.atdd.demo.te.stepdefinitons;

import com.optumrx.autofusion.core.te.util.Mainframe_GlobalFunctionLib;

import cucumber.api.java.en.And;
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
			Mainframe_GlobalFunctionLib.pressKey("enter");
		}
		else
		{
			System.out.println("Member ID not Found in Result List ");
		}
	}

	
		@When("^I provide family type and ID details \"([^\"]*)\"$")
		public void i_provide_family_type_and_ID_details(String MemberID) throws Throwable {
			Mainframe_GlobalFunctionLib.sendText(14, 22, "2");
			Mainframe_GlobalFunctionLib.sendText(14, 27, MemberID);
			Mainframe_GlobalFunctionLib.pressKey("enter");
		}
		
		@When("^I add Member Prior Authorization \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
		public void i_add_Member_Prior_Authorization(String Number, String PAType, String OTC, String PAMSC, String NDC_GPI_List_ID, String FromDate, String ThruDate, String Agt, String Rsn, String IgnoreDrgSts ) throws Throwable {
			Mainframe_GlobalFunctionLib.pressKey("F6");
			Mainframe_GlobalFunctionLib.sendText(16, 5, Number);
			Mainframe_GlobalFunctionLib.sendText(16, 18, PAType);
			Mainframe_GlobalFunctionLib.sendText(16, 23, PAMSC);
			Mainframe_GlobalFunctionLib.sendText(16, 27, OTC);
			Mainframe_GlobalFunctionLib.sendText(16, 30, NDC_GPI_List_ID);
			Mainframe_GlobalFunctionLib.sendText(16, 46, "        ");
			Mainframe_GlobalFunctionLib.sendText(16, 46, FromDate);
			Mainframe_GlobalFunctionLib.sendText(16, 55, "        ");
			Mainframe_GlobalFunctionLib.sendText(16, 55, ThruDate);
			Mainframe_GlobalFunctionLib.sendText(16, 65, Agt);
			Mainframe_GlobalFunctionLib.sendText(16, 70, Rsn);
			Mainframe_GlobalFunctionLib.sendText(16, 75, IgnoreDrgSts);
			Mainframe_GlobalFunctionLib.pressKey("enter");
			Thread.sleep(3000);
		}
		
		@When("^I edit Member Prior Authorization list$")
		public void i_edit_Member_Prior_Authorization_list() throws Throwable {
			Mainframe_GlobalFunctionLib.sendText(16, 02, "2");
			Mainframe_GlobalFunctionLib.pressKey("enter");
		}
		public static String Member_NDC_PA_MSC_Override=null;
		@When("^I add Member NDC Prior Authorization Price \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
		public void i_add_Member_NDC_Prior_Authorization_Price(String PSC, String MEM_NDC_PA_MSC, String Status, String MSC_Override) throws Throwable {
			Mainframe_GlobalFunctionLib.pressKey("F6");
			Mainframe_GlobalFunctionLib.sendText(13, 23, PSC);
			Mainframe_GlobalFunctionLib.sendText(14, 23, MEM_NDC_PA_MSC);
			Mainframe_GlobalFunctionLib.pressKey("enter");
			Mainframe_GlobalFunctionLib.sendText(8, 21, Status);
			Mainframe_GlobalFunctionLib.sendText(12, 47, MSC_Override);
			Member_NDC_PA_MSC_Override=MSC_Override;
			System.out.println("Member_NDC_PA_MSC_Override value is: "+MSC_Override);
			Mainframe_GlobalFunctionLib.pressKey("enter");
		}
		

		@When("^I navigate back to RxClaim Plan Administrator Menu$")
		public void i_navigate_back_to_RxClaim_Plan_Administrator_Menu() throws Throwable {
			Mainframe_GlobalFunctionLib.pressKey("F12");
			Mainframe_GlobalFunctionLib.pressKey("F12");
			Mainframe_GlobalFunctionLib.pressKey("F12");
			Mainframe_GlobalFunctionLib.pressKey("F12");
			Mainframe_GlobalFunctionLib.pressKey("F12");
			
			
		}
		
		@When("^I verify Schedule price, Schedule Patient Pay and its sequences$")
		public void i_verify_Schedule_price_Schedule_Patient_Pay_and_its_sequences() throws Throwable {
		    String actualPriceTable=Mainframe_GlobalFunctionLib.getText(12, 16);
		    System.out.println("Schedule price Table in Claim screen is: "+actualPriceTable);
		    if(actualPriceTable.equals(activePriceSchedule))
		    {
		    	System.out.println("Expected Price table took from "+actualPriceTable);
		    }
		    else
		    {
		    	System.out.println("Expected Price table not taken");
		    }
		    
		    int sqeuence30=30;
		    int sqeuence10=10;
		    String actualPriceTableSeq=Mainframe_GlobalFunctionLib.getText(12, 36);
		    System.out.println("Schedule price table Sequence is: "+actualPriceTableSeq);
		    if(Member_NDC_PA_MSC_Override.equals("M"))
		    {
		    	if(actualPriceTableSeq.equals(sqeuence30))
		    	{
		    		 System.out.println("Expected Schedule price table Sequence is calculated : "+actualPriceTableSeq);
		    	}
		    	else
		    	{
		    		System.out.println("Expected Schedule price table Sequence is not calulated ");
		    	}
		    	
		    }else if(Member_NDC_PA_MSC_Override.equals("N"))
		    {
		    	if(actualPriceTableSeq.equals(sqeuence30))
		    	{
		    		 System.out.println("Expected Schedule price table Sequence is calculated : "+actualPriceTableSeq);
		    	}
		    	else
		    	{
		    		System.out.println("Expected Schedule price table Sequence is not calulated ");
		    	}
		    }else if(Member_NDC_PA_MSC_Override.equals("o"))
		    {
		    	if(actualPriceTableSeq.equals(sqeuence30))
		    	{
		    		 System.out.println("Expected Schedule price table Sequence is calculated : "+actualPriceTableSeq);
		    	}
		    	else
		    	{
		    		System.out.println("Expected Schedule price table Sequence is not calulated ");
		    	}
		    }else if(Member_NDC_PA_MSC_Override.equals(null))
		    {
		    	if(actualPriceTableSeq.equals(sqeuence10))
		    	{
		    		 System.out.println("Expected Schedule price table Sequence is calculated : "+actualPriceTableSeq);
		    	}
		    	else
		    	{
		    		System.out.println("Expected Schedule price table Sequence is not calulated ");
		    	}
		    }
		    	
		    
		    String actualPatientPay=Mainframe_GlobalFunctionLib.getText(16, 16);
		    System.out.println("Schedule Patient Pay is: "+actualPatientPay);
		    String actualPatientPaySeq=Mainframe_GlobalFunctionLib.getText(16, 36);
		    System.out.println("Schedule Patient Pay Sequence is: "+actualPatientPaySeq);
		    String actualPatientPayTable=Mainframe_GlobalFunctionLib.getText(17, 16);
		    System.out.println("Schedule Patient Pay Table is: "+actualPatientPayTable);
			String[] SplitRxClaim=actualPatientPayTable.split("-");
			if(SplitRxClaim[0].contains(Member_NDC_PA_MSC_Override))
					{
					 	System.out.println("The Generic Indicator is shows as : "+Member_NDC_PA_MSC_Override);
					 	System.out.println("The Generic Indicator "+Member_NDC_PA_MSC_Override+ " has been taken from Member NDC Prior Auth Price Details page");
					}
					else
					{
						System.out.println("The Value is not as expected");
					}
		    
		}

			public static String Plan=null;
			@And("^I verify Plan \"([^\"]*)\" in Active Plan by Plan Code screen$")
			public void i_verify_Plan_in_Active_Plan_by_Plan_Code_screen(String Plan) throws Throwable {
				Mainframe_GlobalFunctionLib.sendText(4, 5, Plan);
				Mainframe_GlobalFunctionLib.pressKey("enter");
				String actualPlanCode=Mainframe_GlobalFunctionLib.getText(11, 6);
				Plan=actualPlanCode;
				if(actualPlanCode.equals(Plan))
				{
					System.out.println("The Origin Plan Code is: "+Plan);
					Mainframe_GlobalFunctionLib.sendText(11, 2, "2");
					Mainframe_GlobalFunctionLib.pressKey("enter");
					Mainframe_GlobalFunctionLib.pressKey("F7");
					
				}
				else
				{
					System.out.println("The Plan Code not found");
					System.exit(0);
				}
				}
			
			@And("^I select option (\\d+) for pricing$")
			public void i_select_option_for_pricing(int arg1) throws Throwable {
				 Mainframe_GlobalFunctionLib.sendText(07, 21, "28");
				 Mainframe_GlobalFunctionLib.pressKey("enter");
			}

			public static String activePriceSchedule=null;
			@And("^I verify Active Plan Pharmacy Price Schedule$")
			public void i_verify_Active_Plan_Pharmacy_Price_Schedule() throws Throwable {
				 Mainframe_GlobalFunctionLib.sendText(21, 12, "1");
				 Mainframe_GlobalFunctionLib.pressKey("enter");
				 activePriceSchedule=Mainframe_GlobalFunctionLib.getText(12, 27);
				 System.out.println("Active Plan Pharmacy Price Schedule is: "+activePriceSchedule);
				 Mainframe_GlobalFunctionLib.pressKey("F12");
			}
			public static String activePatientPaySchedule=null;
			@And("^I verify Active Plan Pharmacy Patient Pay$")
			public void i_verify_Active_Plan_Pharmacy_Patient_Pay() throws Throwable {
				 Mainframe_GlobalFunctionLib.sendText(21, 12, "3");
				 Mainframe_GlobalFunctionLib.pressKey("enter");
				 activePatientPaySchedule=Mainframe_GlobalFunctionLib.getText(11, 23);
				 System.out.println("Active Plan Pharmacy Patient Pay is: "+activePatientPaySchedule);
				 Mainframe_GlobalFunctionLib.pressKey("F12");
			}
			
			public static String Generic_Indicator=null;
			@When("^I validate Generic Indicator$")
			public void i_validate_Generic_Indicator() throws Throwable {
				Generic_Indicator=Mainframe_GlobalFunctionLib.getText(12, 38);
				System.out.println("Generic Indicator is "+Generic_Indicator);
			   
			}

	 public static String ProductName=null;
		@When("^I search Product \"([^\"]*)\" and take option (\\d+) to check the list$")
		public void i_search_Product_and_take_option_to_check_the_list(String ProductName, String ProductID) throws Throwable {
			Mainframe_GlobalFunctionLib.sendText(4, 5, ProductID);
			Mainframe_GlobalFunctionLib.pressKey("enter");
			//search by pID[f15]
			//take 10
			//f6
			//CAG details
			// Multi-Source               O [TC24]
			//patient pay-MSC: Y for TC25
			
			String actualProductID=Mainframe_GlobalFunctionLib.getText(11, 5);
			ProductID=actualProductID;
			if(actualProductID.equals(ProductID))
			{
				System.out.println("Expected Active Products by Name/ID found in list: "+ProductID);
				Mainframe_GlobalFunctionLib.sendText(11, 2, "7");
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
			Mainframe_GlobalFunctionLib.pressKey("F6");
			Mainframe_GlobalFunctionLib.sendText(15, 26, ProductID);
			Mainframe_GlobalFunctionLib.sendText(15, 48, Type);
			Mainframe_GlobalFunctionLib.pressKey("enter");
			
		}

}
