package com.atdd.demo.te.stepdefinitons;

import java.util.StringTokenizer;

import com.atdd.te.screenHelpers.FunctionalLibrary;
import com.optumrx.autofusion.core.te.util.Mainframe_GlobalFunctionLib;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import com.optumrx.autofusion.core.te.util.Mainframe_GlobalFunctionLib;

import cucumber.api.java.en.When;


public class SN003284 {
	public static String NDC_ID_Base_1=null;
	public static String NDC_ID_Base_2=null;
	public static String NDC_ID_Base_3=null;
	
	/*
	@When("^I verify plan \"([^\"]*)\"$")
	public void i_verify_plan(String Plan) throws Throwable {
	  
		Mainframe_GlobalFunctionLib.sendText(4, 5, Plan);
		Mainframe_GlobalFunctionLib.pressKey("enter");
		String myplan=Mainframe_GlobalFunctionLib.getText(11, 6);
		System.out.println("Plan code is "+ myplan);
		if (myplan.equals("3284PLAN")){
			Mainframe_GlobalFunctionLib.sendText(11, 2, "2");
			Mainframe_GlobalFunctionLib.pressKey("enter");
		
		}
		
		else {
			System.out.println("plan code not found");
			
		}	
		String DrugStatus=Mainframe_GlobalFunctionLib.getText(17, 17);
		System.out.println("Drug status is"+DrugStatus);
		
		String PlanQual=Mainframe_GlobalFunctionLib.getText(18, 17);
		System.out.println("Plan qualifier value is"+ PlanQual);
		
		String DUR=Mainframe_GlobalFunctionLib.getText(19, 17);
		System.out.println(DUR);
		
		String PrefProdSched =Mainframe_GlobalFunctionLib.getText(20, 17);
		System.out.println(PrefProdSched);
		String ActivateAudit=Mainframe_GlobalFunctionLib.getText(20, 44);
		System.out.println(ActivateAudit);
		
		String Pharmacy=Mainframe_GlobalFunctionLib.getText(18, 58);
		System.out.println(Pharmacy);
		
		
		
	}
	
	*/
	@When("^I validate ANDA \"([^\"]*)\" value on Plan$")
	public void i_validate_ANDA_value_on_Plan(String ANDA) throws Throwable {
		Mainframe_GlobalFunctionLib.sendText(8, 21, "10");
		 Mainframe_GlobalFunctionLib.pressKey("Enter");
		 Mainframe_GlobalFunctionLib.sendText(11, 2, "2");
		 Mainframe_GlobalFunctionLib.pressKey("Enter");
		 Mainframe_GlobalFunctionLib.sendText(10, 13, ANDA);
		 Mainframe_GlobalFunctionLib.pressKey("Enter");
		 
		 
	}
	
	
	@When("^I verify Compounds in Plan detail page$")
	public void i_verify_Compounds_in_Plan_detail_page() throws Throwable {
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
	@When("^I take option \"([^\"]*)\" on Plan Options Screen$")
	public void i_take_option_on_Plan_Options_Screen(String arg1) throws Throwable {
	   
		Mainframe_GlobalFunctionLib.sendText(7, 21, "9");
		Mainframe_GlobalFunctionLib.pressKey("enter");
		Mainframe_GlobalFunctionLib.sendText(13, 12, "2");
		Mainframe_GlobalFunctionLib.pressKey("enter");
	}

	@When("^I enter Option (\\d+) in \"([^\"]*)\"$")
	public void i_enter_Option_in(int arg1, String arg2) throws Throwable {
		Mainframe_GlobalFunctionLib.sendText(7, 21, "9");
		Mainframe_GlobalFunctionLib.pressKey("enter");
		Mainframe_GlobalFunctionLib.sendText(13, 12, "2");
		Mainframe_GlobalFunctionLib.pressKey("enter");
	}
	
	@When("^I verify details on Multiple Ingredient Compound Detail Page (\\d+) of (\\d+) screen$")
	public void i_verify_details_on_Multiple_Ingredient_Compound_Detail_Page_of_screen(int arg1, int arg2) throws Throwable {
		String ClaimProductStatus=Mainframe_GlobalFunctionLib.getText(14, 27);
		System.out.println("Claim Product Status is: "+ClaimProductStatus);


		String optionLevelClaimProductStatus=Mainframe_GlobalFunctionLib.getText(14, 44);
		System.out.println("Claim Product Status, Option Level is: "+optionLevelClaimProductStatus);


		String ClaimMultiSource=Mainframe_GlobalFunctionLib.getText(15, 27);
		System.out.println("Claim Multi Source Code is: "+ClaimMultiSource);


		String optionLevelClaimMultiSource=Mainframe_GlobalFunctionLib.getText(15, 44);
		System.out.println("Claim Multi Source, Option Level is: "+optionLevelClaimMultiSource);
		
	   String DrugStsList=Mainframe_GlobalFunctionLib.getText(9, 69);
	   System.out.println("Drug status list is"+DrugStsList);
	   
	   String PartBGpiList=Mainframe_GlobalFunctionLib.getText(19, 24);
	   
	  System.out.println("Part B GPI list is"+PartBGpiList);
	  
	  String MicGpiList=Mainframe_GlobalFunctionLib.getText(20, 24);
	  System.out.println("Part B MIC Gpi list is "+MicGpiList);
	  
	  String PartBDrugStatus=Mainframe_GlobalFunctionLib.getText(19, 70);
	  System.out.println("Part B status is"+PartBDrugStatus);
	  Mainframe_GlobalFunctionLib.pressKey("PageDown");
	   String ROA=Mainframe_GlobalFunctionLib.getText(13, 28);
	   System.out.println("ROA flag is "+ROA );
	  if(ROA.equals("Y"))
	  {
		  System.out.println("ROA Flag is"+ROA);
		  
	  }
	  else{
		  System.out.println("ROA is not turned as Y");
	  }
	String MedicallyAcceptedROA=Mainframe_GlobalFunctionLib.getText(14, 29);
	System.out.println("Medically Accepted ROA is "+ MedicallyAcceptedROA);
	
	String MessageCode=Mainframe_GlobalFunctionLib.getText(14, 57);
	System.out.println("Message code is "+MessageCode);
		   }
	
	
	@When("^I enter (\\d+) NDC List on \"([^\"]*)\"$")
	public void i_enter_NDC_List_on(int arg1, String arg2) throws Throwable {
		Mainframe_GlobalFunctionLib.sendText(7, 21, "10");
		Mainframe_GlobalFunctionLib.pressKey("enter");
	}

	@When("^I take \"([^\"]*)\" on NDC List on Active Plan NDC List Screen$")
	public void i_take_on_NDC_List_on_Active_Plan_NDC_List_Screen(String arg1) throws Throwable {
		Mainframe_GlobalFunctionLib.sendText(11, 2, "7");
		Mainframe_GlobalFunctionLib.pressKey("enter");
		
	}
	
	/*@When("^I validate NDC_ID \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\" with status$")
	public void i_validate_NDC_ID_with_status(String NDC1, String NDC2, String NDC3) throws Throwable {
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
	*/
	/*
@When("^I submit MIC claims with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\", \"([^\"]*)\"$")
public void i_submit_MIC_claims_with(String bin, String proc, String group, String pharmacyID, String rxNbr, String refill, String fillDate, String memberID, String Qual, String productId, String dspQty, String ds, String psc, String cost, String Cmpnd) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		CreateTransaction1(bin, proc, group , Qual, pharmacyID, rxNbr, refill, fillDate, memberID, productId, dspQty, ds, psc, cost, Cmpnd);
	    //FunctionalLibrary.submitClaim();
}
*/
		public static void CreateTransaction1(String bin, String ProcCtrl, String group, String Qual, String pharmacyID, String rxNbr, String refill, String fillDate, String memberID, String productId, String dspQty, String ds, String psc, String cost, String Cmpnd) throws Throwable
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
		             Mainframe_GlobalFunctionLib.sendText(11, 41,ProcCtrl );
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
		
		/*
		@Then("^I Validate RxClaim ID$")
		public void i_Validate_RxClaim_ID() throws Throwable {
		String originRxClaimNo=Mainframe_GlobalFunctionLib.getText(20, 12);
		System.out.println("Rx Claim No is: "+originRxClaimNo);
		}
		
		
		@Then("^I Validate Claim Status$")
		public void i_Validate_Claim_Status() throws Throwable {
		  String claimStatus=Mainframe_GlobalFunctionLib.getText(21, 6);
		  if(claimStatus.equals("P"))
		  {
		  System.out.println("Claim Status is Passed: "+claimStatus);
		  }
		  else if(claimStatus.equals("R"))
		  {
		  System.out.println("Claim Status is Rejected, Status is: "+claimStatus);
		  System.exit(0);
		  }
		  else
		  {
		  System.out.println("Claim Status is: "+claimStatus);
		  }
		}


		@When("^I submit claim$")
		public void i_submit_claim() throws Throwable {
			FunctionalLibrary.submitClaim();
		}
*/
		/*
		@When("^I select (\\d+) Compound Detail in Submission Detail	List screen$")
		public void i_select_Compound_Detail_in_Submission_Detail_List_screen(int arg1) throws Throwable {
			Mainframe_GlobalFunctionLib.sendText(4, 23, "5");
			Mainframe_GlobalFunctionLib.pressKey("enter");
		}
		*/
		/*
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
		
		
		@When("^I verify TrOOP/Drug Spend Accumulation Phase Details$")
		public void i_verify_TrOOP_Drug_Spend_Accumulation_Phase_Details() throws Throwable {
		  String totalApprovedAmount=Mainframe_GlobalFunctionLib.getText(11, 49);
		  System.out.println("The Total Approved Amount is : "+totalApprovedAmount);
		}
		*/
/*
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
		*/
	/*	@When("^I add Compound Submission Details with \"([^\"]*)\", \"([^\"]*)\",\"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
		public void i_add_Compound_Submission_Details_with(String Qualifier, String NDC1, String Quantity1, String Cost1, String BasisCost) throws Throwable {
				Mainframe_GlobalFunctionLib.pressKey("F6");
				Mainframe_GlobalFunctionLib.sendText(12, 20, Qualifier);
				Mainframe_GlobalFunctionLib.sendText(13, 20, NDC1);
				Mainframe_GlobalFunctionLib.sendText(15, 20, Quantity1);
				Mainframe_GlobalFunctionLib.sendText(16, 20, Cost1);
				Mainframe_GlobalFunctionLib.sendText(18, 20, BasisCost);
				Mainframe_GlobalFunctionLib.pressKey("enter");
		}*/
		
	
		@When("^I add Compound Submission Details for first NDC with \"([^\"]*)\", \"([^\"]*)\",\"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
		public void i_add_Compound_Submission_Details_for_first_NDC_with(String Qualifier1, String NDC1, String Quantity1, String Cost1, String BasicCost1) throws Throwable {
			Mainframe_GlobalFunctionLib.pressKey("F6");
			Mainframe_GlobalFunctionLib.sendText(12, 20, Qualifier1);
			Mainframe_GlobalFunctionLib.sendText(13, 20, NDC1);
			Mainframe_GlobalFunctionLib.sendText(15, 20, Quantity1);
			Mainframe_GlobalFunctionLib.sendText(16, 20, Cost1);
			Mainframe_GlobalFunctionLib.sendText(18, 20, BasicCost1);
			Mainframe_GlobalFunctionLib.pressKey("enter");
		}
/*
		@When("^I add Compound Submission Details for Second NDC with \"([^\"]*)\", \"([^\"]*)\",\"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
		public void 
(String Qualifier2, String NDC2, String Quantity2, String Cost2, String BasicCost2) throws Exception
		{
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Mainframe_GlobalFunctionLib.sendText(12, 20, Qualifier2);
		Mainframe_GlobalFunctionLib.sendText(13, 20, NDC2);
		Mainframe_GlobalFunctionLib.sendText(15, 20, Quantity2);
		Mainframe_GlobalFunctionLib.sendText(16, 20, Cost2);
		Mainframe_GlobalFunctionLib.sendText(18, 20, BasicCost2);
		Mainframe_GlobalFunctionLib.pressKey("enter");
		}
*/
		/*
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
		
*/
		
	}

		
		
	
	
	
		//PLANOPTION 28,29
		
		


