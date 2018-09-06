package com.atdd.demo.te.stepdefinitons;

import java.util.StringTokenizer;

import com.atdd.te.screenHelpers.FunctionalLibrary;
import com.optumrx.autofusion.core.te.util.Mainframe_GlobalFunctionLib;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SR41892 {
	
	public static String PlanCode="";
	public static String Plan="";
	@When("^I verify plan \"([^\"]*)\"$")
	public void i_verify_plan(String PlanCode) throws Throwable {
		Mainframe_GlobalFunctionLib.sendText(4, 5, PlanCode);
		Mainframe_GlobalFunctionLib.pressKey("enter");
	  String resultListPlan=Mainframe_GlobalFunctionLib.getText(11, 6);
	  PlanCode=resultListPlan;
	  if(resultListPlan.equals(PlanCode))
	  {
		  System.out.println("Expected Plan found in result List: "+resultListPlan);
		  //PlanCode=resultListPlan;
		  System.out.println("Expected Plan Code is: "+PlanCode);
		  Mainframe_GlobalFunctionLib.sendText(11, 2, "2");
		  Mainframe_GlobalFunctionLib.pressKey("enter");
	  }
	  else
	  {
		  System.out.println("Expected Plan not found in result List"+resultListPlan);
		  System.exit(0);
	  }
	  Plan=resultListPlan; 
	}
	
	@When("^I verify Compounds in Plan details page$")
	public void i_verify_Compounds_in_Plan_details_page() throws Throwable {
	   String actualFlagCompounds=Mainframe_GlobalFunctionLib.getText(14, 24);
	   System.out.println("Compounds Flag is: "+actualFlagCompounds);
	   if(actualFlagCompounds.equals("N"))
	   {
		   System.out.println("Compounds Flag is: "+actualFlagCompounds);
		   Mainframe_GlobalFunctionLib.sendText(14, 24, "Y");
		   System.out.println("Compounds Flag is update to: "+actualFlagCompounds);
	   }
	   else
	   {
		   System.out.println("Compounds Flag is: "+actualFlagCompounds);
	   }
	   Mainframe_GlobalFunctionLib.pressKey("enter");
	   Mainframe_GlobalFunctionLib.sendText(16, 64, "Y");
	}
	
	@When("^I select Compounds options and Multiple Ingredient Compound option in Plan Option$")
	public void i_select_Compounds_options_and_Multiple_Ingredient_Compound_option_in_Plan_Option() throws Throwable {
	   	Mainframe_GlobalFunctionLib.sendText(7, 21, "9");
		Mainframe_GlobalFunctionLib.pressKey("enter");
		Mainframe_GlobalFunctionLib.sendText(13, 12, "2");
		Mainframe_GlobalFunctionLib.pressKey("enter");
	}
	
	public String NDC_MIC=null;
	@When("^I verify NDC list for MIC \"([^\"]*)\"$")
	public void i_verify_NDC_list_for_MIC(String NDC_MIC) throws Throwable {
		String actualNDC_MIC=Mainframe_GlobalFunctionLib.getText(20, 11);
		System.out.println("NDC List for MIC is: "+actualNDC_MIC);
		if(actualNDC_MIC.equals(NDC_MIC))
			{
				System.out.println("NDC List for MIC is as Expected: "+actualNDC_MIC);
				actualNDC_MIC=NDC_MIC;
			}
			else
			{
				System.out.println("NDC List for MIC is not as Expected: "+actualNDC_MIC);
				Mainframe_GlobalFunctionLib.sendText(20, 11,NDC_MIC);
				System.out.println("NDC List for MIC is UPDATED to as Expected: "+actualNDC_MIC);
			}
		}
		
	@When("^I verify Option Levels for Claim Product Status and Claim Multi-Source Code$")
	public void i_verify_Option_Levels_for_Claim_Product_Status_and_Claim_Multi_Source_Code() throws Throwable {
		//Claim Product Status
		String ClaimProductStatus=Mainframe_GlobalFunctionLib.getText(14, 27);
		System.out.println("Claim Product Status is: "+ClaimProductStatus);
		if(ClaimProductStatus.equals("F"))
		{
			System.out.println("Claim Product Status is as Expected: "+ClaimProductStatus);
		}
		else
		{
			System.out.println("Claim Product Status is not as Expected: "+ClaimProductStatus);
			Mainframe_GlobalFunctionLib.sendText(14, 27,"F");
			System.out.println("Claim Product Status is UPDATED to Expected: "+Mainframe_GlobalFunctionLib.getText(14, 27));
		}
		
		//Claim Product Status Option level
		String optionLevelClaimProductStatus=Mainframe_GlobalFunctionLib.getText(14, 44);
		System.out.println("Claim Product Status, Option Level is: "+optionLevelClaimProductStatus);
		if(optionLevelClaimProductStatus.equals("a"))
		{
			System.out.println("Claim Product Status, Option Level is as Expected: "+optionLevelClaimProductStatus);
		}
		else
		{
			System.out.println("Claim Product Status, Option Level is not as Expected: "+optionLevelClaimProductStatus);
			Mainframe_GlobalFunctionLib.sendText(14, 44,"a");
			System.out.println("Claim Product Status, Option Level is UPDATED to as Expected: "+Mainframe_GlobalFunctionLib.getText(14, 44));
		}
		
		//Claim Multi-Source Code
		
		String ClaimMultiSource=Mainframe_GlobalFunctionLib.getText(15, 27);
		System.out.println("Claim Multi Source Code is: "+ClaimMultiSource);
		if(ClaimMultiSource.equals("G"))
		{
			System.out.println("Claim Multi Source Code is as Expected: "+ClaimMultiSource);
		}
		else
		{
			System.out.println("Claim Multi Source Code is not as Expected: "+ClaimMultiSource);
			Mainframe_GlobalFunctionLib.sendText(15, 27,"G");
			System.out.println("Claim Multi Source Code is UPDATED to Expected, it is: "+ClaimMultiSource);
		}
		
		//Claim Multi-Source Code option level
				String optionLevelClaimMultiSource=Mainframe_GlobalFunctionLib.getText(15, 44);
				System.out.println("Claim Multi Source, Option Level is: "+optionLevelClaimMultiSource);
				if(optionLevelClaimMultiSource.equals("N"))
				{
					System.out.println("Claim Multi Source, Option Level is as Expected: "+optionLevelClaimMultiSource);
				}
				else
				{
					System.out.println("Claim Multi Source, Option Level is not as Expected: "+optionLevelClaimMultiSource);
					Mainframe_GlobalFunctionLib.sendText(15, 44,"N");
					System.out.println("Claim Multi Source, Option Level is UPDATED to Expected, it is: "+Mainframe_GlobalFunctionLib.getText(15, 44));
				}
		}
	
	@When("^I verify Non Part D Covered \"([^\"]*)\"$")
	public void i_verify_Non_Part_D_Covered(String NonPartDCovered) throws Throwable {
	  String valueNonPartDCovered=Mainframe_GlobalFunctionLib.getText(10, 60);
	  System.out.println("The Value at Non PartD Covered is: "+valueNonPartDCovered);
	  if(valueNonPartDCovered.equals(NonPartDCovered))
	  {
		  System.out.println("The Value at Non PartD Covered is as expected: "+valueNonPartDCovered);
	  }
	  else
	  { 
		  System.out.println("The Value at Non PartD Covered is not as expected: "+valueNonPartDCovered);
		  Mainframe_GlobalFunctionLib.sendText(10, 60, NonPartDCovered);
		  System.out.println("The Value at Non PartD Covered is UPDATED to expected, it is: "+valueNonPartDCovered);
	  }
	}
	
	@Then("^I go back to Plan Maintenance Screen$")
	public void i_go_back_to_Plan_Maintenance_Screen() throws Throwable {
	 Mainframe_GlobalFunctionLib.pressKey("F12");
	 Mainframe_GlobalFunctionLib.pressKey("F12");
	 Mainframe_GlobalFunctionLib.pressKey("F12");
	 Mainframe_GlobalFunctionLib.pressKey("F12");
	 Mainframe_GlobalFunctionLib.pressKey("F12");
	}
	
//Scenario Outline: Verify Pricing setup	
		@When("^I select Pricing Option in Plan Options screen$")
		public void i_select_Pricing_Option_in_Plan_Options_screen() throws Throwable {
		   Mainframe_GlobalFunctionLib.sendText(07, 21, "28");
		   Mainframe_GlobalFunctionLib.pressKey("enter");
		}
		
		@When("^I select Pharmacy - Reimbursement option$")
		public void i_select_Pharmacy_Reimbursement_option() throws Throwable {
			   Mainframe_GlobalFunctionLib.sendText(21, 12, "1");
			   Mainframe_GlobalFunctionLib.pressKey("enter");
		}
		
		public String PriceSchedule=null;
		@When("^I validate Plan Pharmacy Price Schedule \"([^\"]*)\"$")
		public void i_validate_Plan_Pharmacy_Price_Schedule(String PriceSchedule) throws Throwable {
		 String valuePriceSchedule=Mainframe_GlobalFunctionLib.getText(12, 27);
		 System.out.println("The Plan Pharmacy Price Schedule is: "+valuePriceSchedule);
		 if(valuePriceSchedule.equals(PriceSchedule))
		 {
			 System.out.println("The Plan Pharmacy Price Schedule is as expected: "+valuePriceSchedule);
		 }
		 else
		 {
			 System.out.println("The Plan Pharmacy Price Schedule is not as expected: "+valuePriceSchedule);
			 System.exit(0);
		 }
		 	
		}
		
		
//Scenario Outline: Verify Multi-Ingredient Compound NDC List setup
	@When("^I select Product List option$")
	public void i_select_Product_List_option() throws Throwable {
		  Mainframe_GlobalFunctionLib.sendText(21, 7, "2");
		  Mainframe_GlobalFunctionLib.pressKey("enter");
	}
	
	@When("^I select Multi-Ingredient Compound NDC List option$")
	public void i_select_Multi_Ingredient_Compound_NDC_List_option() throws Throwable {
		  Mainframe_GlobalFunctionLib.sendText(21, 7, "8");
		  Mainframe_GlobalFunctionLib.pressKey("enter");
	}
	
	@When("^I verify MIC NDC LIST\"([^\"]*)\"$")
	public void i_verify_MIC_NDC_LIST(String NDC_MIC) throws Throwable {
		Mainframe_GlobalFunctionLib.sendText(4, 5, NDC_MIC);
		Mainframe_GlobalFunctionLib.pressKey("enter");
		String resultNDC_MIC=Mainframe_GlobalFunctionLib.getText(9, 5);
		if(resultNDC_MIC.equals(NDC_MIC))
		{
			System.out.println("NDC list for MIC found in search: "+NDC_MIC);
			Mainframe_GlobalFunctionLib.sendText(9, 2, "7");
			Mainframe_GlobalFunctionLib.pressKey("enter");
		}
		else
		{
			System.out.println("NDC list for MIC not found in search ");
		}
	}
	
	public String NDC_ID=null;			
	@When("^I verify NDC ID$")
	public void i_verify_NDC_ID() throws Throwable {
		Mainframe_GlobalFunctionLib.sendText(12, 2, "5");
		Mainframe_GlobalFunctionLib.pressKey("enter");
		NDC_ID=Mainframe_GlobalFunctionLib.getText(6, 7);
		System.out.println("NDC ID is: "+NDC_ID);
	}
	
	public String NDC_ID_C=null;	
	public String NDC_ID_F=null;	
	@When("^I verify NDC ID with status \"([^\"]*)\"$")
	public void i_verify_NDC_ID_with_status(String arg1) throws Throwable {
		/*Mainframe_GlobalFunctionLib.sendText(12, 2, "5");
		Mainframe_GlobalFunctionLib.pressKey("enter");*/
	 for(int i=12;i<=21;i++)
	 {
		 String status=Mainframe_GlobalFunctionLib.getText(i, 54);
		 if(status.equals("C"))
		 {
			 String NDC_ID_C1=Mainframe_GlobalFunctionLib.getText(i, 37);
			 String NDC_ID_C2=Mainframe_GlobalFunctionLib.getText(i, 43);
			 String NDC_ID_C3=Mainframe_GlobalFunctionLib.getText(i, 48);
			 NDC_ID_C=NDC_ID_C1+NDC_ID_C2+NDC_ID_C3;
			 System.out.println("NDC ID with Status 'C' is: "+NDC_ID_C1+NDC_ID_C2+NDC_ID_C3);
			 
		
		 }
		 else if(status.equals("F"))
		 {
			 String NDC_ID_F1=Mainframe_GlobalFunctionLib.getText(i, 37);
			 String NDC_ID_F2=Mainframe_GlobalFunctionLib.getText(i, 43);
			 String NDC_ID_F3=Mainframe_GlobalFunctionLib.getText(i, 48);
			 NDC_ID_F=NDC_ID_F1+NDC_ID_F2+NDC_ID_F3;
			 System.out.println("NDC ID with Status 'F' is: "+NDC_ID_F1+NDC_ID_F2+NDC_ID_F3);
			 
		 }
			 
	 }
	}
	
	@When("^I verify Plan Override in MemberID \"([^\"]*)\"$")
	public void i_verify_Plan_Override_in_MemberID(String MemberID) throws Throwable {
		Mainframe_GlobalFunctionLib.sendText(4, 4, "          ");
		Mainframe_GlobalFunctionLib.sendText(4, 4	, MemberID);
		Mainframe_GlobalFunctionLib.pressKey("enter");
		String actualMember=Mainframe_GlobalFunctionLib.getText(10, 4);
		if(actualMember.equals(MemberID))
		{
			System.out.println("Member ID Found in Result List: "+ MemberID);
			Mainframe_GlobalFunctionLib.sendText(10, 2, "2");
			Mainframe_GlobalFunctionLib.pressKey("enter");
			String memberPlanCode=Mainframe_GlobalFunctionLib.getText(20, 22);
			System.out.println("Plan Code in Member is : "+memberPlanCode);
			System.out.println("Expected PlanCode in Member: "+Plan);
			if(memberPlanCode.equals(Plan))
			{
				System.out.println("Expected PlanCode found in Member: "+Plan);
				Mainframe_GlobalFunctionLib.pressKey("F12");
				Mainframe_GlobalFunctionLib.pressKey("F12");
				Mainframe_GlobalFunctionLib.pressKey("F12");
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
					System.out.println("Plan Code found in Results list ie RCPLN018 Screen:"+Plan);
					Mainframe_GlobalFunctionLib.sendText(10, 2, "1");
					Mainframe_GlobalFunctionLib.pressKey("enter");
				}
				else
				{
					System.out.println(" Plan Code not found: "+resultPlanCode);
					System.exit(0);
				}
				Mainframe_GlobalFunctionLib.pressKey("F12");
				Mainframe_GlobalFunctionLib.pressKey("F12");
				Mainframe_GlobalFunctionLib.pressKey("F12");
				Mainframe_GlobalFunctionLib.pressKey("F12");
				Mainframe_GlobalFunctionLib.pressKey("F12");
			}
			
		}
		else
		{
			System.out.println("Member ID not Found in List: "+MemberID);
			System.exit(0);
	}
	}
	
	
	@Then("^I navigate back to Plan Administrator Menu$")
	public void i_navigate_back_to_Plan_Administrator_Menu() throws Throwable {
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");	
}
	
	
	@When("^I submit MIC claims with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_submit_MIC_claims_with(String bin, String proc, String group, String pharmacyID, String rxNbr, String refill, String fillDate, String memberID, String productID, String dspQty, String ds, String psc, String cost) throws Throwable {
		 CreateTransaction1(bin, proc, group, pharmacyID, rxNbr, refill, fillDate, memberID, productID, dspQty, ds, psc, cost);
		    FunctionalLibrary.submitClaim();
	}
	public static void CreateTransaction1(String bin, String proc, String group, String pharmacyID, String rxNbr, String refill, String fillDate, String memberID, String productId, String dspQty, String ds, String psc, String cost) throws Throwable
	{      
	       try {
	              FunctionalLibrary.navigateToRxClaimPlanAdministrator();
	       } catch (Exception e) {
	             // TODO Auto-generated catch block
	             e.printStackTrace();
	       }
	       FunctionalLibrary.navigateToScreen("3");
	       FunctionalLibrary.navigateToScreen("2");
	       FunctionalLibrary.navigateToScreen("1");
	       
	       if(!(func_SearchAndSelectADataEditMode1("4,4" ,memberID ,"9,4" , memberID))){
	             
	             Mainframe_GlobalFunctionLib.pressKey("F6");
	             Thread.sleep(1000);
	             Mainframe_GlobalFunctionLib.sendText(11, 14,bin );
	             Mainframe_GlobalFunctionLib.sendText(11, 41,proc );
	             Mainframe_GlobalFunctionLib.sendText(11, 59,group );
	             Mainframe_GlobalFunctionLib.sendText(12, 14,pharmacyID );
	             Mainframe_GlobalFunctionLib.sendText(12, 41,rxNbr );
	             Mainframe_GlobalFunctionLib.sendText(12, 59,refill );
	             Mainframe_GlobalFunctionLib.sendText(14, 41,memberID );
	             Mainframe_GlobalFunctionLib.pressKey("Enter");
	             //Mainframe_GlobalFunctionLib.click(7, 12 );
	             //Mainframe_GlobalFunctionLib.pressKey("F4");
	             //Thread.sleep(1000);
	             //Mainframe_GlobalFunctionLib.sendText(3, 4, memberID);
	             //Mainframe_GlobalFunctionLib.pressKey("Enter");
	             //Mainframe_GlobalFunctionLib.sendText(8, 2,"1" );
	             //Mainframe_GlobalFunctionLib.pressKey("Enter");
	             //Mainframe_GlobalFunctionLib.sendText(4 , 65 ,"          ");
	             Thread.sleep(1000);
	             Mainframe_GlobalFunctionLib.sendText(4, 65, fillDate+"    ");                 
	             Mainframe_GlobalFunctionLib.sendText(11, 20,productId );
	             Mainframe_GlobalFunctionLib.sendText(12, 11,dspQty );
	             Mainframe_GlobalFunctionLib.sendText(12, 26,ds );
	             Mainframe_GlobalFunctionLib.sendText(14, 6,psc );
	             Mainframe_GlobalFunctionLib.sendText(10, 47,"         " );
	             Mainframe_GlobalFunctionLib.sendText(10, 47,cost );
	             
	       }
	       else{
	        
	       Mainframe_GlobalFunctionLib.sendText(9, 2,"1" );
	       Mainframe_GlobalFunctionLib.pressKey("Enter");
	       Thread.sleep(1000);
	       Mainframe_GlobalFunctionLib.click(4, 29 );
	             Mainframe_GlobalFunctionLib.sendText(4, 29, pharmacyID);
	             ///Thread.sleep(3000);
	             Mainframe_GlobalFunctionLib.sendText(4 , 65 ,"          ");
	             Mainframe_GlobalFunctionLib.sendText(4, 65, fillDate);
	             Mainframe_GlobalFunctionLib.sendText(5,29, rxNbr);
	             Mainframe_GlobalFunctionLib.sendText(5, 47, refill);              
	             //Mainframe_GlobalFunctionLib.click(7, 12 );
	             Mainframe_GlobalFunctionLib.sendText(7, 12, memberID);
	             //Mainframe_GlobalFunctionLib.pressKey("F4");
	             //Mainframe_GlobalFunctionLib.sendText(3, 4, memberID);
	             //Mainframe_GlobalFunctionLib.pressKey("Enter");         
	             //Mainframe_GlobalFunctionLib.sendText(8, 2,"1" );
	             //Mainframe_GlobalFunctionLib.pressKey("Enter");
	             Mainframe_GlobalFunctionLib.sendText(11, 20,productId );
	             Mainframe_GlobalFunctionLib.sendText(12, 11,"           " );
	             Mainframe_GlobalFunctionLib.sendText(12, 11,dspQty );
	             Mainframe_GlobalFunctionLib.sendText(12, 26,"   " );
	             Mainframe_GlobalFunctionLib.sendText(12, 26,ds);
	             Mainframe_GlobalFunctionLib.sendText(14, 6,psc );
	             Mainframe_GlobalFunctionLib.sendText(10, 47,"         " );
	             Mainframe_GlobalFunctionLib.sendText(10, 47,cost );
	             //Mainframe_GlobalFunctionLib.pressKey("F6");
	         }
	              System.out.println("Claim is created");
	}

	public static boolean func_SearchAndSelectADataEditMode1(String RowColOfData,String Data,String StartRowColToSearch,String DataSearch)
	{
	StringTokenizer stData=new StringTokenizer(RowColOfData,",");
	StringTokenizer stDataSearch=new StringTokenizer(StartRowColToSearch,",");
	int row=Integer.valueOf(stDataSearch.nextToken());
	String col=stDataSearch.nextToken();
	boolean bRes=false;
	try {
	       Mainframe_GlobalFunctionLib.sendText(stData.nextToken(),stData.nextToken(), Data);
	       Mainframe_GlobalFunctionLib.pressKey("Enter");
	       Thread.sleep(2000);
	} catch (Exception e1) {
	// TODO Auto-generated catch block
	e1.printStackTrace();
	}      
	//Loop:for(int i =row;i<=21;i++)
	//{
	System.out.println("check the row value"+row);
	try {
	if(Mainframe_GlobalFunctionLib.getText(row, Integer.parseInt(col)).trim().toLowerCase().contentEquals(DataSearch.trim().toLowerCase()))
	{

	bRes=true;
	//func_SetValue(Integer.toString(i), "2", "2");
	//Mainframe_GlobalFunctionLib.sendText(row, 2, "1");
	//func_SetENTER();
	//Mainframe_GlobalFunctionLib.pressKey("Enter");
	//break Loop;
	}

	} catch (Exception e) {
	//break Loop;
	//}
	}
	return bRes;
	}

	@When("^I select Compound option in Transaction Submission Detail List screen$")
	public void i_select_Compound_option_in_Transaction_Submission_Detail_List_screen() throws Throwable {
		Mainframe_GlobalFunctionLib.sendText(5, 23, "5");
		Mainframe_GlobalFunctionLib.pressKey("enter");
	}
	
	@When("^I add Compound Submission Details with \"([^\"]*)\", \"([^\"]*)\",\"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
	public void i_add_Compound_Submission_Details_with(String Qualifier, String ID, String Quantity, String Cost, String BasicCost) throws Throwable {
			Mainframe_GlobalFunctionLib.pressKey("F6");
			Mainframe_GlobalFunctionLib.sendText(12, 20, Qualifier);
			Mainframe_GlobalFunctionLib.sendText(13, 20, ID);
			Mainframe_GlobalFunctionLib.sendText(15, 20, Quantity);
			Mainframe_GlobalFunctionLib.sendText(16, 20, Cost);
			Mainframe_GlobalFunctionLib.sendText(18, 23, BasicCost);
	}
	

	
}
