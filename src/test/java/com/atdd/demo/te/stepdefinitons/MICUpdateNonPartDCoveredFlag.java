package com.atdd.demo.te.stepdefinitons;

import java.util.StringTokenizer;

import com.atdd.te.screenHelpers.FunctionalLibrary;
import com.hp.lft.sdk.GeneralLeanFtException;
import com.optumrx.autofusion.core.te.util.Mainframe_GlobalFunctionLib;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MICUpdateNonPartDCoveredFlag {
	
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
		  System.out.println("Expected Plan found in result List and its is: "+resultListPlan);
		  //PlanCode=resultListPlan;
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
		//Claim Product Status Option level
		String optionLevelClaimProductStatus=Mainframe_GlobalFunctionLib.getText(14, 44);
		System.out.println("Claim Product Status, Option Level is: "+optionLevelClaimProductStatus);
		//Claim Multi-Source Code
		String ClaimMultiSource=Mainframe_GlobalFunctionLib.getText(15, 27);
		System.out.println("Claim Multi Source Code is: "+ClaimMultiSource);
		//Claim Multi-Source Code option level
		String optionLevelClaimMultiSource=Mainframe_GlobalFunctionLib.getText(15, 44);
		System.out.println("Claim Multi Source, Option Level is: "+optionLevelClaimMultiSource);
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

	  }
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
		
 // Scenario Outline: Verify NDC List setup
		@When("^NDC list option selected in Plan screen$")
		public void ndc_list_option_selected_in_Plan_screen() throws Throwable {
			  Mainframe_GlobalFunctionLib.sendText(7, 21, "10");
			  Mainframe_GlobalFunctionLib.pressKey("enter");
		}
		
		//public static String NDCList=null;
		@When("^I validate Active Plan NDC List$")
		public void i_validate_Active_Plan_NDC_List() throws Throwable {
		 String actualNDCList=Mainframe_GlobalFunctionLib.getText(11, 8);
		 System.out.println("Actual NDC List is: "+actualNDCList);
			
		}
		public static String NDC_ID_Base_1=null;
		public static String NDC_ID_Base_2=null;
		public static String NDC_ID_Base_3=null;


		@When("^I validate NDC_ID \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\" with status$")
		public void i_validate_NDC_ID_with_status(String NDC1, String NDC2, String NDC3) throws Throwable {
			Mainframe_GlobalFunctionLib.sendText(11, 2, "7");
			Mainframe_GlobalFunctionLib.pressKey("enter");
			for(int i=11; i<20; i++)
			{
				try{
					String NDCPart1=Mainframe_GlobalFunctionLib.getText(i, 4);
					String NDCPart2=Mainframe_GlobalFunctionLib.getText(i, 10);
					String NDCPart3=Mainframe_GlobalFunctionLib.getText(i, 15);
					String actualNDC_ID=NDCPart1+NDCPart2+NDCPart3;
					System.out.println("Actual NDC ID in Current Plan NDCs by Name is: "+actualNDC_ID);
					String actualStatus=Mainframe_GlobalFunctionLib.getText(i, 59);
					System.out.println("NDC Actual status is: "+actualStatus);
					if(actualNDC_ID.equals(NDC1))
						{
							NDC_ID_Base_1=actualNDC_ID;
							System.out.println("NDC_ID_Base_1 is: "+NDC_ID_Base_1);
						}
						else if(actualNDC_ID.equals(NDC2))
						{
							NDC_ID_Base_2=actualNDC_ID;
							System.out.println("NDC_ID_Base_2 is: "+NDC_ID_Base_2);
						}
						else if(actualNDC_ID.equals(NDC3))
						{
							NDC_ID_Base_3=actualNDC_ID;
							System.out.println("NDC_ID_Base_3 is: "+NDC_ID_Base_3);
						}
					
					}catch (Exception e) {
						System.out.println("Records doesnt exists");
			            break;
						}
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
			 NDC_ID_F1=NDC_ID_F1+NDC_ID_F2+NDC_ID_F3;
			 System.out.println("NDC ID with Status 'F' is: "+NDC_ID_F1+NDC_ID_F2+NDC_ID_F3);
			 
		 }
			 
	 }
	}
	
	
//Scenario Outline: Verify Member setup
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
		else
		{
			System.out.println("Member ID not Found in List: "+MemberID);
			System.exit(0);
	}
	}
	
	@When("^I select option (\\d+) Medicare in Member Detail List Screen$")
	public void i_select_option_Medicare_in_Member_Detail_List_Screen(int arg1) throws Throwable {
		Mainframe_GlobalFunctionLib.sendText(4, 20, "17");
		Mainframe_GlobalFunctionLib.pressKey("enter");
	}

	@When("^I select option (\\d+) Medicare Part D in Medicare screen$")
	public void i_select_option_Medicare_Part_D_in_Medicare_screen(int arg1) throws Throwable {
		Mainframe_GlobalFunctionLib.sendText(4, 20, "4");
		Mainframe_GlobalFunctionLib.pressKey("enter");
	}
	
	@When("^I verify details in Active Medicare Part D screen$")
	public void i_verify_details_in_Active_Medicare_Part_D_screen() throws Throwable {
	 String fromDate=Mainframe_GlobalFunctionLib.getText(15, 5);
	 System.out.println("From date in Active Medicare Part D is : "+fromDate);
	 String thruDate=Mainframe_GlobalFunctionLib.getText(15, 15);
	 System.out.println("Thru date in Active Medicare Part D is : "+thruDate);
	 String Contract=Mainframe_GlobalFunctionLib.getText(15, 27);
	 System.out.println("Contract in Active Medicare Part D is : "+Contract);
	 String PBP=Mainframe_GlobalFunctionLib.getText(15, 37);
	 System.out.println("PBP in Active Medicare Part D is : "+PBP);
	 String Copay_Category=Mainframe_GlobalFunctionLib.getText(15, 62);
	 System.out.println("Copay_Category in Active Medicare Part D is : "+Copay_Category);
	}
	
	@When("^I select option (\\d+) Member Information in Member Detail List Screen$")
	public void i_select_option_Member_Information_in_Member_Detail_List_Screen(int arg1) throws Throwable {
		Mainframe_GlobalFunctionLib.sendText(4, 20, "10");
		Mainframe_GlobalFunctionLib.pressKey("enter");
	}
		
	@When("^I select Option (\\d+) Supplemental ID in Member Information screen$")
	public void i_select_Option_Supplemental_ID_in_Member_Information_screen(int arg1) throws Throwable {
		Mainframe_GlobalFunctionLib.sendText(4, 20, "3");
		Mainframe_GlobalFunctionLib.pressKey("enter");
	}
	
	@When("^I verify details in Active Supplemental ID by Type screen$")
	public void i_verify_details_in_Active_Supplemental_ID_by_Type_screen() throws Throwable {
	   	 String Type=Mainframe_GlobalFunctionLib.getText(16, 5);
		 System.out.println("Supplemental ID Type is: "+Type);
		 String desc=Mainframe_GlobalFunctionLib.getText(16, 9);
		 System.out.println("Supplemental ID desciption is: "+desc);
		 String id=Mainframe_GlobalFunctionLib.getText(16, 20);
		 System.out.println("Supplemental ID is: "+id);
		 String fromDate=Mainframe_GlobalFunctionLib.getText(16, 60);
		 System.out.println("Supplemental ID from Date is: "+fromDate);
		 String thruDate=Mainframe_GlobalFunctionLib.getText(16, 69);
		 System.out.println("Supplemental ID thru Date is: "+thruDate);
	}		
		
	
	@Then("^I navigate back to Plan Administrator Men$")
	public void i_navigate_back_to_Plan_Administrator_Men() throws Throwable {
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");
	}
	
	@Then("^I navigate back to Plan Administrator Menu$")
	public void i_navigate_back_to_Plan_Administrator_Menu() throws Throwable {
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");
}
	
	
	@When("^I submit MIC claims with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\", \"([^\"]*)\"$")
	public void i_submit_MIC_claims_with(String bin, String proc, String group, String pharmacyID, String rxNbr, String refill, String fillDate, String memberID,String Qual, String productID, String dspQty, String ds, String psc, String cost, String Cmpnd) throws Throwable {
		 CreateTransaction1(bin, proc, group, pharmacyID, rxNbr, refill, fillDate, memberID, Qual, productID, dspQty, ds, psc, cost, Cmpnd);
		    //FunctionalLibrary.submitClaim();
	}
	public static void CreateTransaction1(String bin, String proc, String group, String pharmacyID, String rxNbr, String refill, String fillDate, String memberID, String Qual, String productId, String dspQty, String ds, String psc, String cost, String Cmpnd) throws Throwable
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
	             Mainframe_GlobalFunctionLib.sendText(11, 14,Qual );
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
	             Mainframe_GlobalFunctionLib.sendText(14, 14,Cmpnd );
	             
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
	             Mainframe_GlobalFunctionLib.sendText(11, 14,Qual );
	             Mainframe_GlobalFunctionLib.sendText(11, 20,productId );
	             Mainframe_GlobalFunctionLib.sendText(12, 11,"           " );
	             Mainframe_GlobalFunctionLib.sendText(12, 11,dspQty );
	             Mainframe_GlobalFunctionLib.sendText(12, 26,"   " );
	             Mainframe_GlobalFunctionLib.sendText(12, 26,ds);
	             Mainframe_GlobalFunctionLib.sendText(14, 6,psc );
	             Mainframe_GlobalFunctionLib.sendText(10, 47,"         " );
	             Mainframe_GlobalFunctionLib.sendText(10, 47,cost );
	             Mainframe_GlobalFunctionLib.sendText(14, 14,Cmpnd );
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
	
	@When("^I enter UCW value in \"([^\"]*)\"$")
	public void i_enter_UCW_value_in(String UCW) throws Throwable {
		Mainframe_GlobalFunctionLib.sendText(20, 47, "         ");
		Mainframe_GlobalFunctionLib.sendText(20, 47, UCW);
		Mainframe_GlobalFunctionLib.pressKey("enter");
	}
	
	@When("^I delete UCW value$")
	public void i_delete_UCW_value() throws Throwable {
		Mainframe_GlobalFunctionLib.sendText(20, 47, "         ");
		Mainframe_GlobalFunctionLib.pressKey("enter");
	}
	
	@When("^I submit claim$")
	public void i_submit_claim() throws Throwable {
		FunctionalLibrary.submitClaim();
	}
	
	@When("^I verify Approved amount$")
	public void i_verify_Approved_amount() throws Throwable {
	   String approvedAmount=Mainframe_GlobalFunctionLib.getText(10, 69);
	   System.out.println("Approved Amount is: "+approvedAmount);
	}

	@When("^I select (\\d+) Compound Detail in Submission Detail	List screen$")
	public void i_select_Compound_Detail_in_Submission_Detail_List_screen(int arg1) throws Throwable {
		Mainframe_GlobalFunctionLib.sendText(4, 23, "5");
		Mainframe_GlobalFunctionLib.pressKey("enter");
	}
	
	@When("^I verify Compound Information Details for Product ID$")
	public void i_verify_Compound_Information_Details_for_Product_ID() throws Throwable {
	   try{
		   for(int i=14; i <20; i++)
		   {
			   String productID=Mainframe_GlobalFunctionLib.getText(i, 16);
			   if(productID.equals(NDC_ID_Base_1))
			   {
				   System.out.println("Submitted Compound Information- Product ID is : "+productID);
				   String Status=Mainframe_GlobalFunctionLib.getText(i, 74);
				   System.out.println("Submitted Compound Information- Product ID "+productID+" Status is "+Status);
				   Mainframe_GlobalFunctionLib.sendText(i, 2, "5");
				   Mainframe_GlobalFunctionLib.pressKey("enter");
				   Mainframe_GlobalFunctionLib.pressKey("PageDown");
				   String submittedCost=Mainframe_GlobalFunctionLib.getText(13, 7);
				   System.out.println("Submitted Cost is : "+submittedCost);
				   String calculatedCost=Mainframe_GlobalFunctionLib.getText(13, 18);
				   System.out.println("Calculated Cost is : "+calculatedCost);
				   String approvedCost=Mainframe_GlobalFunctionLib.getText(13, 29);
				   System.out.println("Approved Cost is : "+approvedCost);
				   String clientCost=Mainframe_GlobalFunctionLib.getText(13, 40);
				   System.out.println("Client Cost is : "+clientCost);
				   Mainframe_GlobalFunctionLib.pressKey("F12");
			   }
			   else if(productID.equals(NDC_ID_Base_2))
			   {
				   System.out.println("Submitted Compound Information- Product ID is : "+productID);
				   String Status=Mainframe_GlobalFunctionLib.getText(i, 74);
				   System.out.println("Submitted Compound Information- Product ID "+productID+" Status is "+Status);
				   Mainframe_GlobalFunctionLib.sendText(i, 2, "5");
				   Mainframe_GlobalFunctionLib.pressKey("enter");
				   Mainframe_GlobalFunctionLib.pressKey("PageDown");
				   String submittedCost=Mainframe_GlobalFunctionLib.getText(13, 7);
				   System.out.println("Submitted Cost is : "+submittedCost);
				   String calculatedCost=Mainframe_GlobalFunctionLib.getText(13, 18);
				   System.out.println("Calculated Cost is : "+calculatedCost);
				   String approvedCost=Mainframe_GlobalFunctionLib.getText(13, 29);
				   System.out.println("Approved Cost is : "+approvedCost);
				   String clientCost=Mainframe_GlobalFunctionLib.getText(13, 40);
				   System.out.println("Client Cost is : "+clientCost);
				   Mainframe_GlobalFunctionLib.pressKey("F12");
			   }
			   else if(productID.equals(NDC_ID_Base_3))
			   {
				   System.out.println("Submitted Compound Information- Product ID is : "+productID);
				   String Status=Mainframe_GlobalFunctionLib.getText(i, 74);
				   System.out.println("Submitted Compound Information- Product ID "+productID+" Status is "+Status);
				   Mainframe_GlobalFunctionLib.sendText(i, 2, "5");
				   Mainframe_GlobalFunctionLib.pressKey("enter");
				   Mainframe_GlobalFunctionLib.pressKey("PageDown");
				   String submittedCost=Mainframe_GlobalFunctionLib.getText(13, 7);
				   System.out.println("Submitted Cost is : "+submittedCost);
				   String calculatedCost=Mainframe_GlobalFunctionLib.getText(13, 18);
				   System.out.println("Calculated Cost is : "+calculatedCost);
				   String approvedCost=Mainframe_GlobalFunctionLib.getText(13, 29);
				   System.out.println("Approved Cost is : "+approvedCost);
				   String clientCost=Mainframe_GlobalFunctionLib.getText(13, 40);
				   System.out.println("Client Cost is : "+clientCost);
				   Mainframe_GlobalFunctionLib.pressKey("F12");
			   }
		   	   
		   	}
	   		} catch (Exception e) {
	   			System.out.println("End of SEARCH");
	   		}	  
		}   
	
	@When("^I select option (\\d+) Medicare Part D$")
	public void i_select_option_Medicare_Part_D(int arg1) throws Throwable {
		  Mainframe_GlobalFunctionLib.sendText(4, 23, "13");
		   Mainframe_GlobalFunctionLib.pressKey("enter");
	}
	
	
	@When("^I select option (\\d+) Compound in Transaction Submission Detail List screen$")
	public void i_select_option_Compound_in_Transaction_Submission_Detail_List_screen(int arg1) throws Throwable {
		Mainframe_GlobalFunctionLib.sendText(5, 23, "5");
		Mainframe_GlobalFunctionLib.pressKey("enter");
		for(int i=1; i<8; i++)
		{	
			try{
					String existingNDC=Mainframe_GlobalFunctionLib.getText(13, 16);
					System.out.println("Existing NDCs found in the list: "+existingNDC);
					Mainframe_GlobalFunctionLib.sendText(13, 2, "4");
					Mainframe_GlobalFunctionLib.pressKey("enter");
					Mainframe_GlobalFunctionLib.sendText(16, 64, "Y");
					Mainframe_GlobalFunctionLib.pressKey("enter");
							
			}catch (Exception e)
			{
				break;
			}
		}
	}
			
		
	@When("^I add Compound Submission Details for first NDC	 with \"([^\"]*)\", \"([^\"]*)\",\"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
	public void i_add_Compound_Submission_Details_for_first_NDC_with(String Qualifier1, String NDC1, String Quantity1, String Cost1, String BasicCost1) throws Throwable {
			Mainframe_GlobalFunctionLib.pressKey("F6");
			Mainframe_GlobalFunctionLib.sendText(12, 20, Qualifier1);
			Mainframe_GlobalFunctionLib.sendText(13, 20, NDC1);
			Mainframe_GlobalFunctionLib.sendText(15, 20, Quantity1);
			Mainframe_GlobalFunctionLib.sendText(16, 20, Cost1);
			Mainframe_GlobalFunctionLib.sendText(18, 20, BasicCost1);
			Mainframe_GlobalFunctionLib.pressKey("enter");
	}
	
	@When("^I add Compound Submission Details for Second NDC with \"([^\"]*)\", \"([^\"]*)\",\"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
	public void i_add_Compound_Submission_Details_for_Second_NDC_with(String Qualifier2, String NDC2, String Quantity2, String Cost2, String BasicCost2) throws Exception
	{
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Mainframe_GlobalFunctionLib.sendText(12, 20, Qualifier2);
		Mainframe_GlobalFunctionLib.sendText(13, 20, NDC2);
		Mainframe_GlobalFunctionLib.sendText(15, 20, Quantity2);
		Mainframe_GlobalFunctionLib.sendText(16, 20, Cost2);
		Mainframe_GlobalFunctionLib.sendText(18, 20, BasicCost2);
		Mainframe_GlobalFunctionLib.pressKey("enter");
	}
	
	@When("^I add Compound Submission Details for third  NDC with \"([^\"]*)\", \"([^\"]*)\",\"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
	public void i_add_Compound_Submission_Details_for_third_NDC_with(String Qualifier3, String NDC3, String Quantity3, String Cost3, String BasicCost3) throws Throwable {
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Mainframe_GlobalFunctionLib.sendText(12, 20, Qualifier3);
		Mainframe_GlobalFunctionLib.sendText(13, 20, NDC3);
		Mainframe_GlobalFunctionLib.sendText(15, 20, Quantity3);
		Mainframe_GlobalFunctionLib.sendText(16, 20, Cost3);
		Mainframe_GlobalFunctionLib.sendText(18, 20, BasicCost3);
		Mainframe_GlobalFunctionLib.pressKey("enter");
	}
	@When("^I verify TrOOP/Drug Spend Accumulation Phase Details$")
	public void i_verify_TrOOP_Drug_Spend_Accumulation_Phase_Details() throws Throwable {
	  String totalApprovedAmount=Mainframe_GlobalFunctionLib.getText(11, 49);
	  System.out.println("The Total Approved Amount is : "+totalApprovedAmount);
	 String CoverageGapAmount=Mainframe_GlobalFunctionLib.getText(14, 49);
	  System.out.println("The Total Coverage Gap Amount is : "+CoverageGapAmount);
	}
}

	

