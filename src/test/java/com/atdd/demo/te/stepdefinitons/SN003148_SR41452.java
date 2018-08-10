package com.atdd.demo.te.stepdefinitons;

import java.util.StringTokenizer;

import com.atdd.te.screenHelpers.FunctionalLibrary;
import com.optumrx.autofusion.core.te.util.Mainframe_GlobalFunctionLib;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SN003148_SR41452 {
	public static String rxClaimNo="";
	public static String rxclaimnumber="";
	public String claimStatus=null;
	public String actualResponse=null;
	public String textResponse=null;
	public String rejectedCode=null;
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

	
	@When("^I submit a claim for rejected soft with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_submit_a_claim_for_rejected_soft_with(String bin, String proc, String group, String pharmacyID, String rxNbr, String refill, String fillDate, String memberID, String productID, String dspQty, String ds, String psc, String cost) throws Throwable {
	    CreateTransaction1(bin, proc, group, pharmacyID, rxNbr, refill, fillDate, memberID, productID, dspQty, ds, psc, cost);
	    FunctionalLibrary.submitClaim();
	}

	@When("^I Validate Claim Status, Response with RxClaimID$")
	public void i_Validate_Claim_Status_Response_with_RxClaimID() throws Throwable {
	  claimStatus=Mainframe_GlobalFunctionLib.getText(21, 6);
	  if(claimStatus.equals("P"))
	  {
		  System.out.println("Claim status is Paid: "+claimStatus);
	  }	 
	  else if(claimStatus.equals("R"))
		  {
		  System.out.println("Claim status is Rejected: "+claimStatus);
		  String rejectedCode=Mainframe_GlobalFunctionLib.getText(21, 12);
		  System.out.println("Claim Rejected Code is: "+rejectedCode);
		  }
	  else
	  {
		  System.out.println("Claim status is: "+claimStatus);
	  }
	 
	  String rxClaimNo=Mainframe_GlobalFunctionLib.getText(20, 12);
	  System.out.println("RxClaim ID is: "+rxClaimNo);
	  Mainframe_GlobalFunctionLib.pressKey("F7");
	  Mainframe_GlobalFunctionLib.pressKey("F17");
	  String detailRecordResp="No detail record exists.";
	  String actualdetailRecordResp=Mainframe_GlobalFunctionLib.getText(24, 2);
	  if(detailRecordResp.equals(actualdetailRecordResp))
	  {
		  System.out.println(actualdetailRecordResp);
		  System.exit(0);
	  }
	  else
	  {
		  Mainframe_GlobalFunctionLib.sendText(14, 2, "5");
		  Mainframe_GlobalFunctionLib.pressKey("Enter");
		  actualResponse=Mainframe_GlobalFunctionLib.getText(20, 29);
		  System.out.println("Claim status Response is: "+actualResponse);
		  textResponse=Mainframe_GlobalFunctionLib.getText(20, 32);
		  System.out.println("Claim status Response Text is: "+textResponse);
	  }
	  rxclaimnumber = rxClaimNo;
	}
	


	@When("^I navigate back to RxClaim PlanAdministrator Menu$")
	public void i_navigate_back_to_RxClaim_PlanAdministrator_Menu() throws Throwable {
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.sendText(21, 7, "20");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
	}
	

	@When("^I enter value in \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\" to submit batch$")
	public void i_enter_value_in_to_submit_batch(String DateFrom, String DateThru, String CarrierFrom, String CarrierThru) throws Throwable {
    Mainframe_GlobalFunctionLib.sendText(4, 20, DateFrom);
    Mainframe_GlobalFunctionLib.sendText(4, 38, DateThru);
    Mainframe_GlobalFunctionLib.sendText(5, 20, CarrierFrom);
    Mainframe_GlobalFunctionLib.sendText(5, 38, CarrierThru);
    Mainframe_GlobalFunctionLib.pressKey("F6");
    Mainframe_GlobalFunctionLib.sendText(16, 69, "Y");
    Mainframe_GlobalFunctionLib.pressKey("Enter");
    //Mainframe_GlobalFunctionLib.pressKey("F3");
	}
	
	String dataSpoolFile=null;
	@When("^I verify RXCLAIM-No, RXCLAIM-STS in Spool file$")
	public void i_verify_RXCLAIM_No_RXCLAIM_STS_in_Spool_file() throws Throwable {
		//dataSpoolFile=Mainframe_GlobalFunctionLib.getText(6,2);
		Mainframe_GlobalFunctionLib.sendText(4, 22, rxclaimnumber);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F16");
		
		String RxClaimNoResult=Mainframe_GlobalFunctionLib.getText(7,2);
		String[] SplitRxClaim=RxClaimNoResult.split("-");
		if(SplitRxClaim[0].contains(rxClaimNo))
		{
			System.out.println("RxClaim No shown in Spool file as: "+rxClaimNo);
		}
		else
		{
			System.out.println("RxClaim No not shown in Spool file");
		}
	}

	
	@Then("^I verify fields CLAIM STATUS,DDI-DTMS INTERACTING GPI,DDI-DTMS Response$")
	public void i_verify_fields_CLAIM_STATUS_DDI_DTMS_INTERACTING_GPI_DDI_DTMS_Response() throws Throwable {
		 Mainframe_GlobalFunctionLib.sendText(21, 7, "ws");
		 Mainframe_GlobalFunctionLib.pressKey("Enter");
		 Mainframe_GlobalFunctionLib.sendText(11, 3, "8");
		 Mainframe_GlobalFunctionLib.pressKey("Enter");
		 Mainframe_GlobalFunctionLib.sendText(12, 3, "5");
		 Mainframe_GlobalFunctionLib.pressKey("Enter");
		 Mainframe_GlobalFunctionLib.pressKey("PageDown");
		 Mainframe_GlobalFunctionLib.pressKey("PageDown");
		 Mainframe_GlobalFunctionLib.pressKey("PageDown");
		 dataSpoolFile=Mainframe_GlobalFunctionLib.getText(6,2);
		 String expValue="RXCLAIM-STS INTERACTING-GPI INTERACTING-GPI-NAME";
		 if(dataSpoolFile.contains(expValue))
		 {
			 System.out.println("Expected Field shown in Spool file as: "+expValue);
		 }
		 else
		 {
			 System.out.println("Expected Field not shown in Spool file");
		 }
	}

}
