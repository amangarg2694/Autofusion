package com.atdd.demo.te.stepdefinitons;

import java.util.StringTokenizer;

import com.atdd.te.screenHelpers.FunctionalLibrary;
import com.optumrx.autofusion.core.te.util.Mainframe_GlobalFunctionLib;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SR41923 {

	public static String ActualPlanCode=null;
	@Then("^I Validate \"([^\"]*)\" is created or not$")
	public void i_Validate_is_created_or_not(String PlanCode) throws Throwable {
		ActualPlanCode=Mainframe_GlobalFunctionLib.getText(3, 13);
		if(PlanCode.equals(ActualPlanCode))
		{
			System.out.println("Plan Created and the Code is: "+ActualPlanCode);
			//return;
		}
		else
		{
			System.out.println("Plan not Created: "+ActualPlanCode);
		}
	}
	
	
	@Given("^I select Pricing list on \"([^\"]*)\"$")
	public void i_select_Pricing_list_on(String arg1) throws Throwable {
		Mainframe_GlobalFunctionLib.sendText(7, 21, "28");
		Mainframe_GlobalFunctionLib.pressKey("enter");
	}	
	
	
	@Given("^I Activate Plan Pharmacy Reimbursement Price Schedule with From Date \"([^\"]*)\", Thru Date \"([^\"]*)\", Pharm Price Schedule \"([^\"]*)\"$")
	public void i_Activate_Plan_Pharmacy_Reimbursement_Price_Schedule_with_From_Date_Thru_Date_Pharm_Price_Schedule(String FromDate, String ThruDate, String PharmPriceSchedule) throws Throwable {
		//Pharmacy Reimbursement price setup
				Mainframe_GlobalFunctionLib.sendText(21, 12, "1");
				Mainframe_GlobalFunctionLib.pressKey("enter");
				Mainframe_GlobalFunctionLib.pressKey("F6");
				Mainframe_GlobalFunctionLib.sendText(8, 12, FromDate);
				Mainframe_GlobalFunctionLib.sendText(8, 36, ThruDate	);
				Mainframe_GlobalFunctionLib.sendText(10, 26, PharmPriceSchedule);
				Mainframe_GlobalFunctionLib.pressKey("enter");
				Mainframe_GlobalFunctionLib.pressKey("F12");
				String actualFlagReimbursement=Mainframe_GlobalFunctionLib.getText(11, 39);
				if(actualFlagReimbursement.equals("Y"))
				{
					System.out.println("Pharmacy Reimbursement price setup is done and the flag is: "+actualFlagReimbursement);
				}
				else
				{
					System.out.println("Pharmacy Reimbursement price setup is not done and the flag is: "+actualFlagReimbursement);
				}
				
			}		
	
	@Given("^I Activate Plan Pharmacy Patient Pay Price Schedule with From Date \"([^\"]*)\", Thru Date \"([^\"]*)\", Patient Pay Schedule \"([^\"]*)\"$")
	public void i_Activate_Plan_Pharmacy_Patient_Pay_Price_Schedule_with_From_Date_Thru_Date_Patient_Pay_Schedule(String FromDate, String ThruDate, String PatientPaySchedule) throws Throwable {
		//Pharmacy Patient Pay Reimbursement price setup
		Mainframe_GlobalFunctionLib.sendText(21, 12, "3");
		Mainframe_GlobalFunctionLib.pressKey("enter");
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Mainframe_GlobalFunctionLib.sendText(9, 2, FromDate);
		Mainframe_GlobalFunctionLib.sendText(9, 12, ThruDate);
		Mainframe_GlobalFunctionLib.sendText(9, 22, PatientPaySchedule);
		Mainframe_GlobalFunctionLib.pressKey("enter");
		Mainframe_GlobalFunctionLib.sendText(16, 64, "Y");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		String actualFlagPharmPatientPaySchedule=Mainframe_GlobalFunctionLib.getText(12, 39);
		if(actualFlagPharmPatientPaySchedule.equals("Y"))
		{
			System.out.println("Pharmacy Patient Pay price setup is done and the flag is: "+actualFlagPharmPatientPaySchedule);
		}
		else
		{
			System.out.println("Pharmacy Patient Pay price setup is not done and the flag is: "+actualFlagPharmPatientPaySchedule);
		}
		
		}
	
	@Given("^I Activate Plan Client Price for Billing with From Date \"([^\"]*)\", Thru Date \"([^\"]*)\", Client Pay Schedule \"([^\"]*)\"$")
	public void i_Activate_Plan_Client_Price_for_Billing_with_From_Date_Thru_Date_Client_Pay_Schedule(String FromDate, String ThruDate, String ClientPriceSchedule) throws Throwable {
		//Client Billing price setup
				Mainframe_GlobalFunctionLib.sendText(21, 12, "2");
				Mainframe_GlobalFunctionLib.pressKey("enter");
				Mainframe_GlobalFunctionLib.pressKey("F6");
				Mainframe_GlobalFunctionLib.sendText(8, 12, FromDate);
				Mainframe_GlobalFunctionLib.sendText(8, 36, ThruDate);
				Mainframe_GlobalFunctionLib.sendText(10, 26, ClientPriceSchedule);
				Mainframe_GlobalFunctionLib.pressKey("enter");
				Mainframe_GlobalFunctionLib.pressKey("F12");
				String actualFlagBilling=Mainframe_GlobalFunctionLib.getText(11, 72);
				if(actualFlagBilling.equals("Y"))
				{
					System.out.println("Client Billing price setup is done and the flag is: "+actualFlagBilling);
				}
				else
				{
					System.out.println("Client Billing price setup is not done and the flag is: "+actualFlagBilling);
				}
	}
	

	public static String originClientPaySchedule=null;
	@Given("^I Activate Plan Client Patient Pay with From Date \"([^\"]*)\", Thru Date \"([^\"]*)\", Client Pay Schedule \"([^\"]*)\"$")
	public void i_Activate_Plan_Client_Patient_Pay_with_From_Date_Thru_Date_Client_Pay_Schedule(String FromDate, String ThruDate, String ClientPaySchedule) throws Throwable {
		//Client Patient Pay Reimbursement price setup
				Mainframe_GlobalFunctionLib.sendText(21, 12, "8");
				Mainframe_GlobalFunctionLib.pressKey("enter");
				Mainframe_GlobalFunctionLib.pressKey("F6");
				Mainframe_GlobalFunctionLib.sendText(9, 2, FromDate);
				Mainframe_GlobalFunctionLib.sendText(9, 12, ThruDate);
				Mainframe_GlobalFunctionLib.sendText(9, 22, ClientPaySchedule);
				originClientPaySchedule=ClientPaySchedule;
				System.out.println("Origin Client Patient Pay Schedule is: "+originClientPaySchedule);
				Mainframe_GlobalFunctionLib.pressKey("enter");
				Mainframe_GlobalFunctionLib.sendText(16, 64, "Y");
				Mainframe_GlobalFunctionLib.pressKey("F12");
				String actualFlagClientPatientPaySchedule=Mainframe_GlobalFunctionLib.getText(14, 72);
				if(actualFlagClientPatientPaySchedule.equals("Y"))
				{
					System.out.println("Client Patient Pay price setup is done and the flag is: "+actualFlagClientPatientPaySchedule);
				}
				else
				{
					System.out.println("Client Patient Pay price setup is not done and the flag is: "+actualFlagClientPatientPaySchedule);
				}
				
				Mainframe_GlobalFunctionLib.pressKey("F12");
		}
	
	
	@Then("^I navigate Back to \"([^\"]*)\"$")
	public void i_navigate_Back_to(String arg1) throws Throwable {
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Thread.sleep(3000);
	    Mainframe_GlobalFunctionLib.pressKey("F3");
	    Thread.sleep(3000);
	    Mainframe_GlobalFunctionLib.pressKey("F3");
	    Thread.sleep(3000);
	    Mainframe_GlobalFunctionLib.pressKey("F3");
	    Thread.sleep(3000);
	    Mainframe_GlobalFunctionLib.pressKey("F3");
	    Thread.sleep(3000);
	    Mainframe_GlobalFunctionLib.pressKey("F3");
	    Thread.sleep(3000);
	    Mainframe_GlobalFunctionLib.sendText(21, 7,"20");
	    Thread.sleep(3000);
	    Mainframe_GlobalFunctionLib.pressKey("Enter");
	    Thread.sleep(3000);
	   }
	
	
	@Given("^I select GIP list on \"([^\"]*)\"$")
	public void i_select_GIP_list_on(String arg1) throws Throwable {
	    Mainframe_GlobalFunctionLib.sendText(7, 21, "11");
	    Mainframe_GlobalFunctionLib.pressKey("enter");
	    Thread.sleep(3000);
	}

	public void i_enter_select_GIP_list_on(String arg1) throws Throwable {
	    Mainframe_GlobalFunctionLib.sendText(7, 21, "11");
	    Mainframe_GlobalFunctionLib.pressKey("enter");
	    Thread.sleep(3000);
	}
	
	public static String originGPIList=null;
	@And("^I add GPI list \"([^\"]*)\"$")
	public void i_add_GPI_list(String GPIList) throws Throwable {
		 Mainframe_GlobalFunctionLib.sendText(4, 5, GPIList);
		 Mainframe_GlobalFunctionLib.pressKey("enter");
		 originGPIList=GPIList;
		 String GPIListResult=Mainframe_GlobalFunctionLib.getText(9, 5);
		 if(GPIListResult.equals(GPIListResult))
		 {
			 Mainframe_GlobalFunctionLib.sendText(9, 2, "1");
			 Mainframe_GlobalFunctionLib.pressKey("enter");
			 Mainframe_GlobalFunctionLib.sendText(13, 18, "1");
			 Mainframe_GlobalFunctionLib.sendText(14, 17, "010118");
			 Mainframe_GlobalFunctionLib.sendText(14, 41, "123118");
			 Mainframe_GlobalFunctionLib.pressKey("enter");
			 Mainframe_GlobalFunctionLib.sendText(16, 64, "Y");
		 }
		 else
		 {
			 System.out.println("GPI list not found");
			 System.exit(0);
		 }
	}

	public static String originGPI=null;
	public static String originProductID=null;
	@And("^I verify GPI list \"([^\"]*)\" and fill type, days, maximum$")
	public void i_verify_GPI_list_and_fill_type_days_maximum(String GPIList) throws Throwable {
	   String GPIlistResult=Mainframe_GlobalFunctionLib.getText(11, 8);
	   if(GPIlistResult.equals(GPIList))
	   {
		   Mainframe_GlobalFunctionLib.sendText(11, 2, "7");
		   Mainframe_GlobalFunctionLib.pressKey("enter");
		   Mainframe_GlobalFunctionLib.sendText(12, 2, "5");
		   Mainframe_GlobalFunctionLib.pressKey("enter");
		   Thread.sleep(3000);
		   String fillType=Mainframe_GlobalFunctionLib.getText(17, 58);
		   System.out.println("GPI Fill type is: "+fillType);
		   String fillDays=Mainframe_GlobalFunctionLib.getText(17, 61);
		   System.out.println("GPI Fill Days is: "+fillDays);
		   String fillMax=Mainframe_GlobalFunctionLib.getText(17, 65);
		   System.out.println("GPI Fill Max is: "+fillMax);
		   Mainframe_GlobalFunctionLib.pressKey("F12");
		   Mainframe_GlobalFunctionLib.sendText(12, 2, "7");
		   Mainframe_GlobalFunctionLib.pressKey("enter");
		   Thread.sleep(3000);
		   originGPI=Mainframe_GlobalFunctionLib.getText(4, 6);
		   System.out.println("Origin GPI ID is: "+originGPI);
		   originProductID=Mainframe_GlobalFunctionLib.getText(11, 4);
		   System.out.println("Origin Product ID is: "+originProductID);
		   Mainframe_GlobalFunctionLib.pressKey("F12");
		   Mainframe_GlobalFunctionLib.pressKey("F12");
		}
	   else
		 {
			 System.out.println("GPI list not found");
			 System.exit(0);
		 }
	}
	
	public static String ClientPatientpay;
	@Then("^I verify patient pay in Plan GPI List GPI Price Detail Page$")
	public void i_verify_patient_pay_in_Plan_GPI_List_GPI_Price_Detail_Page() throws Throwable {
		 Mainframe_GlobalFunctionLib.sendText(11, 2, "7");
		 Mainframe_GlobalFunctionLib.pressKey("enter");
		 Mainframe_GlobalFunctionLib.sendText(12, 2, "5");
		 Mainframe_GlobalFunctionLib.pressKey("enter");
		 Mainframe_GlobalFunctionLib.pressKey("F10");
		 Mainframe_GlobalFunctionLib.sendText(14, 2, "5");
		 Mainframe_GlobalFunctionLib.pressKey("enter");
		 ClientPatientpay=Mainframe_GlobalFunctionLib.getText(14, 27);
		 System.out.println("Client Patient pay is: "+ClientPatientpay);
	}	 
	
	
	@Given("^I add plan to a \"([^\"]*)\" Member$")
	public void i_add_plan_to_a_Member(String MemberID) throws Throwable {
		Mainframe_GlobalFunctionLib.sendText(4, 4, "          ");
		Mainframe_GlobalFunctionLib.sendText(4, 4, MemberID);
		Mainframe_GlobalFunctionLib.pressKey("enter");
		String actualMember=Mainframe_GlobalFunctionLib.getText(10, 4);
		if(actualMember.equals(MemberID))
		{
			System.out.println("Member ID Found in List: "+ MemberID);
			Mainframe_GlobalFunctionLib.sendText(10, 2, "2");
			Mainframe_GlobalFunctionLib.pressKey("enter");
			Mainframe_GlobalFunctionLib.click(20, 22);
			Mainframe_GlobalFunctionLib.pressKey("F7");
			Mainframe_GlobalFunctionLib.sendText(15, 2, "2");
			Mainframe_GlobalFunctionLib.pressKey("enter");
			Mainframe_GlobalFunctionLib.click(12, 14);
			Mainframe_GlobalFunctionLib.pressKey("F4");
			System.out.println("Actual Plan Code is: "+ActualPlanCode);
			Mainframe_GlobalFunctionLib.sendText(4, 5, ActualPlanCode);
			Mainframe_GlobalFunctionLib.pressKey("enter");
			String resultPlanCode=Mainframe_GlobalFunctionLib.getText(10, 5);
			if(resultPlanCode.equals(ActualPlanCode))
			{
				System.out.println("Plan Code found: "+ActualPlanCode);
				Mainframe_GlobalFunctionLib.sendText(10, 2, "1");
				Mainframe_GlobalFunctionLib.pressKey("enter");
			}
			else
			{
				System.out.println(" Plan Code not found: "+resultPlanCode);
				System.exit(0);
			}
			Mainframe_GlobalFunctionLib.pressKey("F3");
			Mainframe_GlobalFunctionLib.pressKey("F3");
			Mainframe_GlobalFunctionLib.pressKey("F3");
			Mainframe_GlobalFunctionLib.pressKey("F3");
			Mainframe_GlobalFunctionLib.pressKey("F3");
			
		}
		else
		{
			System.out.println("Member ID not Found in List: "+MemberID);
			System.exit(0);
	}
	}
		
		@When("^I submit claim for refill with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
		public void i_submit_claim_for_refill_with(String bin, String proc, String group, String pharmacyID, String rxNbr, String refill, String fillDate, String memberID, String productID, String dspQty, String ds, String psc, String cost) throws Throwable {
			 CreateTransaction1(bin, proc, group, pharmacyID, rxNbr, refill, fillDate, memberID, productID, dspQty, ds, psc, cost);
			    FunctionalLibrary.submitClaim();
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
		
		@When("^I select Option \"([^\"]*)\" Additional Claim Info to navigate to \"([^\"]*)\"$")
		public void i_select_Option_Additional_Claim_Info_to_navigate_to(String arg1, String arg2) throws Throwable {
		 Mainframe_GlobalFunctionLib.sendText(4,23, "8");
		 Mainframe_GlobalFunctionLib.pressKey("enter");
		}
		
		@Then("^I Validate RxClaim ID$")
		public void i_Validate_RxClaim_ID() throws Throwable {
			String originRxClaimNo=Mainframe_GlobalFunctionLib.getText(20, 12);
			System.out.println("Rx Claim No is: "+originRxClaimNo);
		}
		
		@Then("^I Validate GPI ID$")
		public void i_Validate_GPI_ID() throws Throwable {
		   String actualGPIID=Mainframe_GlobalFunctionLib.getText(13, 23);
		   System.out.println("GPI ID in Cliam screen is: "+actualGPIID);
		   if(actualGPIID.contains(originGPI))
		   {
			   System.out.println("Actual GPI ID shown in Claim submission screen: "+actualGPIID);
		   }
		   else
		   {
			   System.out.println("Actual GPI ID not shown in Claim submission screen: "+actualGPIID);
		   }
		}
		
		@Then("^I validate GPI in Plan list$")
		public void i_validate_GPI_in_Plan_list() throws Throwable {
			String actualGPIList=Mainframe_GlobalFunctionLib.getText(11, 52);
			System.out.println("GPI in Plan list screen is: "+actualGPIList);
			if(originGPIList.equals(actualGPIList))
			{
				System.out.println("Origin GPI list shown in Claim Transaction Additional Info screen "+actualGPIList);
			}
			else
			{
				System.out.println("Origin GPI list not shown in Claim Transaction Additional Info screen "+actualGPIList);
			}
		}
		
		@Then("^I Validate client Patient Pay in price info screen$")
		public void i_Validate_client_Patient_Pay_in_price_info_screen() throws Throwable {
			 Mainframe_GlobalFunctionLib.sendText(4,23, "1");
			 Mainframe_GlobalFunctionLib.pressKey("enter");
			 Mainframe_GlobalFunctionLib.pressKey("PageDown");
			 String actualClientPatientPayGPI=Mainframe_GlobalFunctionLib.getText(16, 55);
			 System.out.println("The Client Patient Pay GPI is taken as: "+actualClientPatientPayGPI);
			 if(actualClientPatientPayGPI.equals(originClientPaySchedule))
			 {
				 System.out.println("Claim is taken from Plan Pricing level: "+actualClientPatientPayGPI); 
			 }
			 else if(actualClientPatientPayGPI.equals(ClientPatientpay))
			 {
					System.out.println("Claim is taken from GPI pricing level: "+actualClientPatientPayGPI); 
			 }
			 else
			 {						 
			 System.out.println("Claim is not taken from Plan/GPI Pricing level: "+actualClientPatientPayGPI);
			 }
		}	
			 
		
		@Then("^I Submit claim second time by changing Refill value$")
		public void i_Submit_claim_second_time_by_changing_Refill_value() throws Throwable {
		   Mainframe_GlobalFunctionLib.sendText(5, 47, "01");
		   Mainframe_GlobalFunctionLib.pressKey("enter");
		   Mainframe_GlobalFunctionLib.pressKey("F6");
		}	
		
		@Then("^I Submit claim third time by changing Refill value$")
		public void i_Submit_claim_third_time_by_changing_Refill_value() throws Throwable {
			Mainframe_GlobalFunctionLib.sendText(5, 47, "02");
			Mainframe_GlobalFunctionLib.pressKey("enter");
			Mainframe_GlobalFunctionLib.pressKey("F6");
		}

		

}
	





