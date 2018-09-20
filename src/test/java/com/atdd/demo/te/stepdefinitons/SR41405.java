package com.atdd.demo.te.stepdefinitons;

import com.cucumber.listener.Reporter;
import com.optumrx.autofusion.core.te.util.Mainframe_GlobalFunctionLib;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SR41405 {

	public static String globalMemberID=null;
	@When("^I search Member by MemberID \"([^\"]*)\"$")
	public void i_search_Member_by_MemberID(String MemberID) throws Throwable {
		Mainframe_GlobalFunctionLib.sendText(4, 4, "          ");
		Mainframe_GlobalFunctionLib.sendText(4, 4	, MemberID);
		Mainframe_GlobalFunctionLib.pressKey("enter");
		String actualMember=Mainframe_GlobalFunctionLib.getText(10, 4);
		if(actualMember.equals(MemberID))
		{
			System.out.println("Member ID Found in Result List: "+ MemberID);
			Reporter.addStepLog("Member ID Found in Result List: "+ MemberID);
			globalMemberID=MemberID;
			System.out.println("Member ID assigned to Global Variable: "+ globalMemberID);
			Reporter.addStepLog("Member ID assigned to Global Variable: "+ globalMemberID);
		}
		else
		{
			System.out.println("Member ID not Found in Result List ");
			Reporter.addStepLog("Member ID not Found in Result List ");
			System.exit(0);
		}
	}

	
	@Given("^I provide family type and ID details in MemberID$")
	public void i_provide_family_type_and_ID_details_in_MemberID() throws Throwable {
			Mainframe_GlobalFunctionLib.sendText(10, 2, "2");
			Mainframe_GlobalFunctionLib.pressKey("enter");
			Mainframe_GlobalFunctionLib.sendText(14, 22, "2");
			Mainframe_GlobalFunctionLib.sendText(14, 27, globalMemberID);
			Mainframe_GlobalFunctionLib.pressKey("enter");
		}
		
	public static String basePA_MSC=null;
		@When("^I add Member Prior Authorization \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
		public void i_add_Member_Prior_Authorization(String PANumber, String PAType, String OTC, String PAMSC, String NDC_GPI_List_ID, String FromDate, String ThruDate, String Agt, String Rsn, String IgnoreDrgSts ) throws Throwable {
			Mainframe_GlobalFunctionLib.sendText(16, 5, PANumber);
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
			String actualPANumber=Mainframe_GlobalFunctionLib.getText(16, 5);
			if(actualPANumber.equals(PANumber))
					{
						System.out.println("Member Prior Authorization added and the Number is: "+actualPANumber);
						Reporter.addStepLog("Member Prior Authorization added and the Number is: "+actualPANumber);
						String actualNDCID=Mainframe_GlobalFunctionLib.getText(16, 30);
						System.out.println("Member Prior Authorization - NDC ID is: "+actualNDCID);
						Reporter.addStepLog("Member Prior Authorization - NDC ID is: "+actualNDCID);
						String actualPAMSC=Mainframe_GlobalFunctionLib.getText(16, 23);
						System.out.println("Member Prior Authorization - MSC ID is: "+actualPAMSC);
						Reporter.addStepLog("Member Prior Authorization - MSC ID is: "+actualPAMSC);
						basePA_MSC=actualPAMSC;
						System.out.println("Member Prior Authorization - MSC is allocated to basePA_MSC: "+basePA_MSC);
						Reporter.addStepLog("Member Prior Authorization - MSC is allocated to basePA_MSC: "+basePA_MSC);
					}
			else
					{
						System.out.println("Member Prior Authorization  not added");
						Reporter.addStepLog("Member Prior Authorization  not added");
					}
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
			System.out.println("Member_NDC_PA_MSC_Override value is: "+MSC_Override);
			Reporter.addStepLog("Member_NDC_PA_MSC_Override value is: "+MSC_Override);
			Member_NDC_PA_MSC_Override=MSC_Override;
			System.out.println("Member_NDC_PA_MSC_Override value is assigned to Global variable: "+Member_NDC_PA_MSC_Override);
			Reporter.addStepLog("Member_NDC_PA_MSC_Override value is assigned to Global variable: "+Member_NDC_PA_MSC_Override);
			Mainframe_GlobalFunctionLib.pressKey("enter");
		}
		

		@When("^I navigate back to RxClaim Plan Administrator Menu$")
		public void i_navigate_back_to_RxClaim_Plan_Administrator_Menu() throws Throwable {
			Mainframe_GlobalFunctionLib.pressKey("F12");
			Mainframe_GlobalFunctionLib.pressKey("F12");
			Mainframe_GlobalFunctionLib.pressKey("F12");
			Mainframe_GlobalFunctionLib.pressKey("F12");
			Mainframe_GlobalFunctionLib.pressKey("F12");
			Mainframe_GlobalFunctionLib.pressKey("F12");
			Mainframe_GlobalFunctionLib.pressKey("F12");
		}
		

		public static String Plan=null;
		@And("^I verify Plan \"([^\"]*)\" in Active Plan by Plan Code screen$")
		public void i_verify_Plan_in_Active_Plan_by_Plan_Code_screen(String Plan) throws Throwable {
			Mainframe_GlobalFunctionLib.sendText(4, 5, Plan);
			Mainframe_GlobalFunctionLib.pressKey("enter");
			String actualPlanCode=Mainframe_GlobalFunctionLib.getText(11, 6);
			if(actualPlanCode.equals(Plan))
			{
				System.out.println("The Origin Plan Code is: "+actualPlanCode);
				Reporter.addStepLog("The Origin Plan Code is: "+actualPlanCode);
				Plan=actualPlanCode;
				System.out.println("The Origin Plan Code is assigned to Global Variable: "+Plan);
				Reporter.addStepLog("The Origin Plan Code is assigned to Global Variable: "+Plan);
				Mainframe_GlobalFunctionLib.sendText(11, 2, "2");
				Mainframe_GlobalFunctionLib.pressKey("enter");
			}
			else
			{
				System.out.println("The Plan Code not found");
				Reporter.addStepLog("The Plan Code not found");
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
			 Reporter.addStepLog("Active Plan Pharmacy Price Schedule is: "+activePriceSchedule);
			 Mainframe_GlobalFunctionLib.pressKey("F12");
		}
		public static String activePatientPaySchedule=null;
		@And("^I verify Active Plan Pharmacy Patient Pay$")
		public void i_verify_Active_Plan_Pharmacy_Patient_Pay() throws Throwable {
			 Mainframe_GlobalFunctionLib.sendText(21, 12, "3");
			 Mainframe_GlobalFunctionLib.pressKey("enter");
			 activePatientPaySchedule=Mainframe_GlobalFunctionLib.getText(11, 23);
			 System.out.println("Active Plan Pharmacy Patient Pay is: "+activePatientPaySchedule);
			 Reporter.addStepLog("Active Plan Pharmacy Patient Pay is: "+activePatientPaySchedule);
			 Mainframe_GlobalFunctionLib.pressKey("F12");
		}
		
		@When("^I verify pharmacy Schedule price, Schedule Patient Pay and its sequences$")
		public void i_verify_pharmacy_Schedule_price_Schedule_Patient_Pay_and_its_sequences() throws Throwable {
		    String actualPriceTable=Mainframe_GlobalFunctionLib.getText(12, 16);
		    System.out.println("Pharmacy: Schedule price Table in Claim screen is: "+actualPriceTable);
		    Reporter.addStepLog("Pharmacy: Schedule price Table in Claim screen is: "+actualPriceTable);
		    if(actualPriceTable.equals(activePriceSchedule))
			    {
			    	System.out.println("Pharmacy: Expected Schedule Price table picked i.e. from "+actualPriceTable);
			    	Reporter.addStepLog("Pharmacy: Expected Schedule Price table picked i.e. from "+actualPriceTable);
			    }
			    else
			    {
			    	System.out.println("Pharmacy: Expected Price table not taken");
			    }
		    
		    String actualPatientPay=Mainframe_GlobalFunctionLib.getText(16, 16);
		    System.out.println("Pharmacy: Schedule Patient Pay is: "+actualPatientPay);
		    if(actualPatientPay.equals(activePatientPaySchedule))
			    {
			    	System.out.println("Pharmacy: Expected Schedule Patient Pay table picked i.e. from "+actualPatientPay);
			    	Reporter.addStepLog("Pharmacy: Expected Schedule Patient Pay table picked i.e. from "+actualPatientPay);
			    }
			    else
			    {
			    	System.out.println("Pharmacy: Expected Patient Pay table not taken");
			    }
		    String actualPatientPayTable=Mainframe_GlobalFunctionLib.getText(17, 16);
		    System.out.println("Pharmacy: Schedule Patient Pay Table is: "+actualPatientPayTable);
			String[] SplitRxClaim=actualPatientPayTable.split("-");
			if(SplitRxClaim[0].contains(Member_NDC_PA_MSC_Override))
					{
					 	System.out.println("Pharmacy: Expected Patient Pay Table with Generic Indicator is shows as: "+actualPatientPayTable);
					 	Reporter.addStepLog("Pharmacy: Expected Patient Pay Table with Generic Indicator is shows as: "+actualPatientPayTable);
					 	System.out.println("Pharmacy: The Generic Indicator "+Member_NDC_PA_MSC_Override+ " has been taken from Member NDC Prior Auth Price Details page");
					 	Reporter.addStepLog("Pharmacy: The Generic Indicator "+Member_NDC_PA_MSC_Override+ " has been taken from Member NDC Prior Auth Price Details page");
					}
					else
					{
						System.out.println("Pharmacy: The Value is not as expected");
						Reporter.addStepLog("Pharmacy: The Value is not as expected");
					}
			String actualPriceTableSeq=Mainframe_GlobalFunctionLib.getText(12, 35);
		    System.out.println("Pharmacy: Schedule price table Sequence is: "+actualPriceTableSeq);
		    Reporter.addStepLog("Pharmacy: Schedule price table Sequence is: "+actualPriceTableSeq);
		    if(actualPriceTableSeq.equals("30") )
		    {
	    		System.out.println("Pharmacy: Expected Schedule price table Sequence is calculated : "+actualPriceTableSeq);
	    		Reporter.addStepLog("Pharmacy: Expected Schedule price table Sequence is calculated : "+actualPriceTableSeq);
			    }
		    else
		    {
		    	System.out.println("Pharmacy: Expected Schedule price table Sequence is not calculated");
	    		Reporter.addStepLog("Pharmacy: Expected Schedule price table Sequence is not calculated");
		    }
	    		    
		    String actualPatientPaySeq=Mainframe_GlobalFunctionLib.getText(16, 35);
		    System.out.println("Pharmacy: Schedule Patient Pay Sequence is: "+actualPatientPaySeq);
		    if(actualPatientPaySeq.equals("10") )
			    {
		    		System.out.println("Pharmacy: Expected Schedule Patient Pay Sequence is calculated : "+actualPatientPaySeq);
		    		Reporter.addStepLog("Pharmacy: Expected Schedule Patient Pay Sequence is calculated : "+actualPatientPaySeq);
			    }
		    else
			    {
			    	System.out.println("Pharmacy: Expected Schedule Patient Pay Sequence is not calculated");
		    		Reporter.addStepLog("Pharmacy: Expected Schedule Patient Pay Sequence is not calculated");
			    }
		}
   
		
		    	
		
		@When("^I verify client Schedule price, Schedule Patient Pay and its sequences$")
		public void i_verify_client_Schedule_price_Schedule_Patient_Pay_and_its_sequences() throws Throwable {
		    String actualPriceTable=Mainframe_GlobalFunctionLib.getText(12, 55);
		    System.out.println("Client: Schedule price Table in Claim screen is: "+actualPriceTable);
		    Reporter.addStepLog("Client: Schedule price Table in Claim screen is: "+actualPriceTable);
		    if(actualPriceTable.equals(activePriceSchedule))
			    {
			    	System.out.println("Client: Expected Schedule Price table picked i.e. from "+actualPriceTable);
			    	Reporter.addStepLog("Client: Expected Schedule Price table picked i.e. from "+actualPriceTable);
			    }
			    else
			    {
			    	System.out.println("Client: Expected Price table not taken");
			    }
		    
		    String actualPatientPay=Mainframe_GlobalFunctionLib.getText(16, 55);
		    System.out.println("Client: Schedule Patient Pay is: "+actualPatientPay);
		    if(actualPatientPay.equals(activePatientPaySchedule))
			    {
			    	System.out.println("Client: Expected Schedule Patient Pay table picked i.e. from "+actualPatientPay);
			    	Reporter.addStepLog("Client: Expected Schedule Patient Pay table picked i.e. from "+actualPatientPay);
			    }
			    else
			    {
			    	System.out.println("Client: Expected Patient Pay table not taken");
			    }
		    String actualPatientPayTable=Mainframe_GlobalFunctionLib.getText(17, 55);
		    System.out.println("Client: Schedule Patient Pay Table is: "+actualPatientPayTable);
			String[] SplitRxClaim=actualPatientPayTable.split("-");
			if(SplitRxClaim[0].contains(Member_NDC_PA_MSC_Override))
					{
					 	System.out.println("Client: Expected Patient Pay Table with Generic Indicator is shows as: "+actualPatientPayTable);
					 	Reporter.addStepLog("Client: Expected Patient Pay Table with Generic Indicator is shows as: "+actualPatientPayTable);
					 	System.out.println("Client: The Generic Indicator "+Member_NDC_PA_MSC_Override+ " has been taken from Member NDC Prior Auth Price Details page");
					 	Reporter.addStepLog("Client: The Generic Indicator "+Member_NDC_PA_MSC_Override+ " has been taken from Member NDC Prior Auth Price Details page");
					}
					else
					{
						System.out.println("Client: The Value is not as expected");
						Reporter.addStepLog("Client: The Value is not as expected");
					}
			String actualPriceTableSeq=Mainframe_GlobalFunctionLib.getText(12, 74);
		    System.out.println("Client: Schedule price table Sequence is: "+actualPriceTableSeq);
		    Reporter.addStepLog("Client: Schedule price table Sequence is: "+actualPriceTableSeq);
		    if(actualPriceTableSeq.equals("30") )
		    {
	    		System.out.println("Client: Expected Schedule price table Sequence is calculated : "+actualPriceTableSeq);
	    		Reporter.addStepLog("Client: Expected Schedule price table Sequence is calculated : "+actualPriceTableSeq);
			    }
		    else
		    {
		    	System.out.println("Client: Expected Schedule price table Sequence is not calculated");
	    		Reporter.addStepLog("Client: Expected Schedule price table Sequence is not calculated");
		    }
	    		    
		    String actualPatientPaySeq=Mainframe_GlobalFunctionLib.getText(16, 74);
		    System.out.println("Client: Schedule Patient Pay Sequence is: "+actualPatientPaySeq);
		    if(actualPatientPaySeq.equals("10") )
			    {
		    		System.out.println("Client: Expected Schedule Patient Pay Sequence is calculated : "+actualPatientPaySeq);
		    		Reporter.addStepLog("Client: Expected Schedule Patient Pay Sequence is calculated : "+actualPatientPaySeq);
			    }
		    else
			    {
			    	System.out.println("Client: Expected Schedule Patient Pay Sequence is not calculated");
		    		Reporter.addStepLog("Client: Expected Schedule Patient Pay Sequence is not calculated");
			    }
		}

	
			public static String Generic_Indicator=null;
			@When("^I validate Generic Indicator$")
			public void i_validate_Generic_Indicator() throws Throwable {
				Generic_Indicator=Mainframe_GlobalFunctionLib.getText(12, 38);
				System.out.println("Generic Indicator is "+Generic_Indicator);
				Reporter.addStepLog("Generic Indicator is "+Generic_Indicator);
			}  
			
			@When("^I take (\\d+) Formulary Management Services$")
			public void i_take_Formulary_Management_Services(int arg1) throws Throwable {
				
				Mainframe_GlobalFunctionLib.sendText(4, 23, "21");
				Mainframe_GlobalFunctionLib.pressKey("enter");
				try{	
					String errorFurmulary=Mainframe_GlobalFunctionLib.getText(24, 2);
					System.out.println(" Formulary Mgmt Services detail does not exist ");
					System.exit(0);
				}catch (Exception e) {
					
				}
			}

			@When("^I verify Tier details$")
			public void i_verify_Tier_details() throws Throwable {
				String valueTier=Mainframe_GlobalFunctionLib.getText(11, 32);
				String valueTierDescp=Mainframe_GlobalFunctionLib.getText(11, 45);
				System.out.println("The Tier value is: "+valueTier+" "+valueTierDescp);
				Reporter.addStepLog("The Tier value is: "+valueTier+" "+valueTierDescp);
			}

			@When("^I verify Formulary Status$")
			public void i_verify_Formulary_Status() throws Throwable {
				String valueFormularyStatus=Mainframe_GlobalFunctionLib.getText(12, 32);
				String valueFormularyStatusDescp=Mainframe_GlobalFunctionLib.getText(12, 45);
				System.out.println("Formulary Status is: "+valueFormularyStatus+" "+valueFormularyStatusDescp);
				Reporter.addStepLog("Formulary Status is: "+valueFormularyStatus+" "+valueFormularyStatusDescp);
			}
			
			@When("^I search Product by \"([^\"]*)\"$")
			public void i_search_Product_by(String ProductID) throws Throwable {
				Mainframe_GlobalFunctionLib.sendText(4, 5, ProductID);
				Mainframe_GlobalFunctionLib.pressKey("enter");
				String actualProductID=Mainframe_GlobalFunctionLib.getText(11, 5);
				ProductID=actualProductID;
				if(actualProductID.contains(ProductID))
				{
					System.out.println("Expected Active Products by Name/ID found in list: "+ProductID);
					Reporter.addStepLog("Expected Active Products by Name/ID found in list: "+ProductID);
					Mainframe_GlobalFunctionLib.sendText(11, 2, "10");
					Mainframe_GlobalFunctionLib.pressKey("enter");
				}
				else
				{
					System.out.println("Product ID not found");
				}
			}
			
			@When("^I Add Product Override with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
			public void i_Add_Product_Override_with(String CarrierID, String AccountID, String GroupID) throws Throwable {
				Mainframe_GlobalFunctionLib.pressKey("F6");
				Mainframe_GlobalFunctionLib.sendText(9, 10, CarrierID);
				Mainframe_GlobalFunctionLib.sendText(10, 10, AccountID);
				Mainframe_GlobalFunctionLib.sendText(11, 10, GroupID);
			}    
			
			@Then("^I select Multi-Source \"([^\"]*)\" value$")
			public void i_select_Multi_Source_value(String Product_MSC) throws Throwable {
				Mainframe_GlobalFunctionLib.sendText(14, 27, Product_MSC);
				Mainframe_GlobalFunctionLib.sendText(12, 15, "010111");
				Mainframe_GlobalFunctionLib.sendText(12, 36, "123139");
				Mainframe_GlobalFunctionLib.pressKey("enter");
			}
			
			@When("^I add library RXBSYSQA$")
			public void i_add_library_RXBSYSQA() throws Throwable {
				String Query="CHGCURLIB RXBSYSQA";
				Mainframe_GlobalFunctionLib.sendText(21, 7, Query);
				Mainframe_GlobalFunctionLib.pressKey("enter");
			}

		
		@When("^I add Product \"([^\"]*)\", \"([^\"]*)\"$")
		public void i_add_Product(String ProductID, String Type) throws Throwable {
			Mainframe_GlobalFunctionLib.pressKey("F6");
			Mainframe_GlobalFunctionLib.sendText(15, 26, ProductID);
			Mainframe_GlobalFunctionLib.sendText(15, 48, Type);
			Mainframe_GlobalFunctionLib.pressKey("enter");
		}
		
		@Then("^I select Patient Pay MSC \"([^\"]*)\" value$")
		public void i_select_Patient_Pay_MSC_value(String PatientPay_MSC) throws Throwable {
		    /Mainframe_GlobalFunctionLib.sendText(14, 58, PatientPay_MSC);
			Mainframe_GlobalFunctionLib.sendText(12, 15, "010111");
			Mainframe_GlobalFunctionLib.sendText(12, 36, "123139");
			Mainframe_GlobalFunctionLib.pressKey("enter");
		}


}
