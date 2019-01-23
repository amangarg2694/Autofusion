package com.atdd.demo.te.stepdefinitons;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

import org.testng.Assert;

import com.atdd.te.screenHelpers.FunctionalLibrary;
import com.cucumber.listener.Reporter;
import com.atdd.te.screenHelpers.PlanByPlanCode;
import com.optumrx.autofusion.core.te.util.Mainframe_GlobalFunctionLib;
import com.optumrx.autofusion.core.te.util.Screenshot;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
public class TBEligibleClaims {
	public static String PreviousRxclaimnum; String Submittdate;
	
	
	public void NDClist_Validate(String NDCList1) throws Exception 
	 {
		 String getNDClist = Mainframe_GlobalFunctionLib.getText(11, 33).trim();
			
			if(getNDClist.equals(NDCList1))
			{
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
				System.out.println("NDClist is appearing as drugid is used from NDClist with claim fill date 10/01/18 and it is as expected: "+getNDClist);
				Reporter.addStepLog("NDClist is appearing as drugid is used from NDClist with claim fill date 10/01/18 and it is as expected: "+getNDClist);
			} 
			else 
			{ 
				System.out.println("NDClist is not appearing which is not expected ");
				Assert.fail("NDClist is not appearing which is not expected"); 
			}
	 }
	public void GPIlist_Validate(String GPIList1) throws Exception 
	 {
		 String getGPIlist = Mainframe_GlobalFunctionLib.getText(11, 52).trim();
			
			if(getGPIlist.equals(GPIList1))
			{
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
				System.out.println("GPIlist is appearing as drugid is used from GPIlist and it is as expected: "+getGPIlist);
				Reporter.addStepLog("GPIlist is appearing as drugid is used from GPIlist and it is as expected: "+getGPIlist);
			} 
			else 
			{ 
				System.out.println("GPIlist is not appearing which is not expected ");
				Assert.fail("GPIlist is not appearing which is not expected"); 
			}
	 }
	public void ContTherpy_Validate(String ContTherpy) throws Exception 
	{
		String getContTherpy = Mainframe_GlobalFunctionLib.getText(10, 79).trim();
		
		if(getContTherpy.equals(ContTherpy))
		{
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
			System.out.println("Cont Therapy value appearing correctly and it is as expected: "+getContTherpy);
			Reporter.addStepLog("Cont Therapy value appearing correctly and it is as expected: "+getContTherpy);
		} 
		else 
		{ 
			System.out.println("Cont Therapy is not appearing which is not as expected ");
			Assert.fail("Cont Therapy is not appearing which is not as expected"); 
		}
	}
	
	public void ContStatus_Validate(String ContStatus) throws Exception 
	{
		String getContStatus = Mainframe_GlobalFunctionLib.getText(11, 79).trim();
		
		if(getContStatus.equals(ContStatus))
		{
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
			System.out.println("Cont Status value appearing correctly and it is as expected: "+getContStatus);
			Reporter.addStepLog("Cont Status value appearing correctly and it is as expected: "+getContStatus);
		} 
		else 
		{ 
			System.out.println("Cont Status is not appearing which is not as expected ");
			Assert.fail("Cont Status is not appearing which is not as expected"); 
		}
	}
 
	public void TBSchedule_Validate(String MedicareTBSchedule) throws Exception 
	{
		String getMedicareTBSchedule = Mainframe_GlobalFunctionLib.getText(9, 17).trim();
		
		if(getMedicareTBSchedule.equals(MedicareTBSchedule))
		{
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
			System.out.println("Transitional Benefit override schedule stamping appearing and it is as expected : "+getMedicareTBSchedule);
			Reporter.addStepLog("Transitional Benefit override schedule stamping appearing and it is as expected : "+getMedicareTBSchedule);
		} 
		else 
		{ 
			System.out.println("Transitional Benefit override schedule is not appearing which is not as expected ");
			Assert.fail("Transitional Benefit override schedule which is not as expected"); 
		}
	}
	

	public void Resubmit_Claim(String RxNo, String FillDate3, String ProductID2) throws Throwable 
	{ 
		
		Mainframe_GlobalFunctionLib.sendText(5,29, FunctionalLibrary.func_GenerateDynamicRxNo());
		Mainframe_GlobalFunctionLib.sendText(4, 65 ,"          ");
		Mainframe_GlobalFunctionLib.sendText(4, 65 ,FillDate3);
		Mainframe_GlobalFunctionLib.sendText(11, 20 ,"                ");
		Mainframe_GlobalFunctionLib.sendText(11, 20 ,ProductID2);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("F18");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());

	}
	
	public void CTSchedule_Validate(String CTSchedule) throws Exception 
	{
		String getCTSched = Mainframe_GlobalFunctionLib.getText(10, 22).trim();
		if(getCTSched.equals(CTSchedule))
		{
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
			System.out.println("Contingent Therapy schedule appearing and it is as expected: "+getCTSched);
			Reporter.addStepLog("Contingent Therapy schedule appearing and it is as expected: "+getCTSched);
		} 
		else 
		{ 
			System.out.println("Contingent Therapy schedule not appearing which is not as expected ");
			Assert.fail("Contingent Therapy schedule not appearing which is not as expected");
		}
	}
		public void PANumber_ClaimValidate(String PANumber) throws Exception 
		{
			String getPANumber = Mainframe_GlobalFunctionLib.getText(11, 58).trim();
			if(getPANumber.equals(PANumber))
			{
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
				System.out.println("PA number stamped and it is as expected: "+getPANumber);
				Reporter.addStepLog("PA number stamped and it is as expected: "+getPANumber);
			} 
			else 
			{ 
				System.out.println("PA number not appearing which is not as expected ");
				Assert.fail("PA number not appearing which is not as expected"); 
			}
	}
		public void Validate_DURTable_DurService_ConflictClaimNo(String DURTable, String DurServiceType2 )throws Exception
		{
			String GetDURtable = Mainframe_GlobalFunctionLib.getText(8, 12);
			if(GetDURtable.equals(DURTable))
			{
				System.out.println("Expected DUR table appearing: "+GetDURtable);
				Reporter.addStepLog("Expected DUR table appearing: "+GetDURtable);
			}
			else
			{
				System.out.println("Expected DUR table not appearing: "+GetDURtable);
				Reporter.addStepLog("Expected DUR table not appearing: "+GetDURtable);
				Assert.fail("Expected DUR table not appearing"); 
			}
			
			String GetDURServicetype2 = Mainframe_GlobalFunctionLib.getText(10, 66);
			if(GetDURServicetype2.equals(DurServiceType2))
			{
				System.out.println("Expected DUR Service type is appearing: "+GetDURServicetype2);
				Reporter.addStepLog("Expected DUR Service type is appearing: "+GetDURServicetype2);
			}
			else
			{
				System.out.println("Expected DUR service type not appearing: "+GetDURServicetype2);
				Reporter.addStepLog("Expected DUR service type not appearing: "+GetDURServicetype2);
				Assert.fail("Expected DUR service type not appearing"); 
			}
			
			String GetConflictRxclaimno = Mainframe_GlobalFunctionLib.getText(18, 23);
			if(GetConflictRxclaimno.equals(PreviousRxclaimnum))
			{
				System.out.println("Expected conflict Claim number is appearing: "+GetConflictRxclaimno);
				Reporter.addStepLog("Expected conflict Claim number is appearing: "+GetConflictRxclaimno);
			}
			else
			{
				System.out.println("Expected conflict Claim number is not appearing: "+GetConflictRxclaimno);
				Reporter.addStepLog("Expected conflict Claim number is not appearing: "+GetConflictRxclaimno);
				Assert.fail("Expected conflict Claim number is not appearing"); 
			}
		}
		public void NDCGPIORlist_CreatewithDrug(String NDCGPIORList1, String NDCGPIORListDesc1, String NDCPDID1, String GPIPDID1, String NDGPFromdate, String NDGPTodate, String DURTable, String DURflag) throws Throwable 		
		{	
			
		try {
			FunctionalLibrary.navigateToRxClaimPlanAdministrator();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try{
			Mainframe_GlobalFunctionLib.sendText(21, 7 ,"CCT600" );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(21, 7 ,"9" );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(21, 7 ,"6" );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(21, 7 ,"90" );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			if(!(FunctionalLibrary.func_SearchAndSelectADataEditMode("4,5" ,NDCGPIORList1 ,"10,5" , NDCGPIORList1)))
			{
				Mainframe_GlobalFunctionLib.pressKey("F6");
				Mainframe_GlobalFunctionLib.sendText(13, 18 ,NDCGPIORList1);
				Mainframe_GlobalFunctionLib.sendText(14, 18, NDCGPIORListDesc1);
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.pressKey("F12");
				Mainframe_GlobalFunctionLib.sendText(21, 7 ,"90" );
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(4, 5 ,NDCGPIORList1);
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(10, 2 ,"7" );
				Mainframe_GlobalFunctionLib.pressKey("Enter");
								
				Mainframe_GlobalFunctionLib.pressKey("F6");
				if(NDCPDID1.length()!=0)	{
						Mainframe_GlobalFunctionLib.click(7, 8 );
						Mainframe_GlobalFunctionLib.pressKey("F4");
						Thread.sleep(2000);
						Mainframe_GlobalFunctionLib.pressKey("F16");
						Mainframe_GlobalFunctionLib.sendText(4, 4 ,NDCPDID1);
						Mainframe_GlobalFunctionLib.pressKey("Enter");
						Mainframe_GlobalFunctionLib.sendText(9, 2 ,"1" );
						Mainframe_GlobalFunctionLib.pressKey("Enter");
				}
				if(GPIPDID1.length()!=0)	{
						Mainframe_GlobalFunctionLib.click(6, 8 );
						Mainframe_GlobalFunctionLib.pressKey("F4");
						Thread.sleep(2000);
						Mainframe_GlobalFunctionLib.pressKey("F18");
						Mainframe_GlobalFunctionLib.sendText(4, 4 ,GPIPDID1);
						Mainframe_GlobalFunctionLib.pressKey("Enter");
						Mainframe_GlobalFunctionLib.sendText(9, 2 ,"1" );
						Mainframe_GlobalFunctionLib.pressKey("Enter");
				}
				Mainframe_GlobalFunctionLib.sendText(9, 12 ,NDGPFromdate);
				Mainframe_GlobalFunctionLib.sendText(9, 34 ,NDGPTodate);
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				if(DURTable.length()!=0)
				{
					Mainframe_GlobalFunctionLib.sendText(19, 61 ,DURTable );
				}
				else
				{
					Mainframe_GlobalFunctionLib.sendText(19, 61 ,"        " );
				}
				
				if(DURflag.length()!=0){
					Mainframe_GlobalFunctionLib.sendText(19, 70 ,DURflag );
				}
				else
				{
					Mainframe_GlobalFunctionLib.sendText(19, 70 ," " );
				}
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				Mainframe_GlobalFunctionLib.pressKey("F12");
								
				FunctionalLibrary.navigateToRxClaimPlanAdministrator();
			}
	
			else{
				Mainframe_GlobalFunctionLib.pressKey("F12");
				System.out.println("NDC GPI OR List exists");
				Reporter.addStepLog("NDC GPI OR List exists");
				FunctionalLibrary.navigateToRxClaimPlanAdministrator();
			}
							
			
				if(FunctionalLibrary.ScreenshotOption.equalsIgnoreCase("Always")){
					Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
					}
			
			}catch(Exception e)
			{	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				Assert.fail("NDC GPI OR List is not set successfully.Screenshot is captured");
			}
		}
		
		 //Adding more drugs to NDCGPI OR list
		public void NDCGPIORlist_AddMoreDrug(String NDCGPIORList1, String NDCPDID1, String GPIPDID1, String NDGPFromdate, String NDGPTodate, String DURTable, String DURflag) throws Throwable 		
		{		try {
					FunctionalLibrary.navigateToRxClaimPlanAdministrator();
				} catch (Exception e) {
					e.printStackTrace();
				}
				
				try{
					Mainframe_GlobalFunctionLib.sendText(21, 7 ,"CCT600" );
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					Mainframe_GlobalFunctionLib.sendText(21, 7 ,"9" );
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					Mainframe_GlobalFunctionLib.sendText(21, 7 ,"6" );
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					Mainframe_GlobalFunctionLib.sendText(21, 7 ,"90" );
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					Mainframe_GlobalFunctionLib.sendText(4, 5 ,NDCGPIORList1);
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					
					String getNDCGPIORList = Mainframe_GlobalFunctionLib.getText(10, 5);
					if(getNDCGPIORList.equals(NDCGPIORList1))
					{
					Mainframe_GlobalFunctionLib.sendText(10, 2 ,"7" );
					Mainframe_GlobalFunctionLib.pressKey("Enter");

						Mainframe_GlobalFunctionLib.pressKey("F6");
						if(NDCPDID1.length()!=0)	{
								Mainframe_GlobalFunctionLib.click(7, 8 );
								Mainframe_GlobalFunctionLib.pressKey("F4");
								Thread.sleep(2000);
								Mainframe_GlobalFunctionLib.pressKey("F16");
								Mainframe_GlobalFunctionLib.sendText(4, 4 ,NDCPDID1);
								Mainframe_GlobalFunctionLib.pressKey("Enter");
								Mainframe_GlobalFunctionLib.sendText(9, 2 ,"1" );
								Mainframe_GlobalFunctionLib.pressKey("Enter");
						}
						if(GPIPDID1.length()!=0)	{
								Mainframe_GlobalFunctionLib.click(6, 8 );
								Mainframe_GlobalFunctionLib.pressKey("F4");
								Thread.sleep(2000);
								Mainframe_GlobalFunctionLib.pressKey("F18");
								Mainframe_GlobalFunctionLib.sendText(4, 4 ,GPIPDID1);
								Mainframe_GlobalFunctionLib.pressKey("Enter");
								Mainframe_GlobalFunctionLib.sendText(9, 2 ,"1" );
								Mainframe_GlobalFunctionLib.pressKey("Enter");
						}
						Mainframe_GlobalFunctionLib.sendText(9, 12 ,NDGPFromdate);
						Mainframe_GlobalFunctionLib.sendText(9, 34 ,NDGPTodate);
						Mainframe_GlobalFunctionLib.pressKey("Enter");
						
						String getconfirm = Mainframe_GlobalFunctionLib.getText(1, 2);
						if(getconfirm.equals("RCTBD002"))
						{
							System.out.println("Drug already exists");
							//FunctionalLibrary.navigateToRxClaimPlanAdministrator();
						}
						else
						{
							if(DURTable.length()!=0)
							{
								Mainframe_GlobalFunctionLib.sendText(19, 61 ,DURTable );
							}
							else
							{
								Mainframe_GlobalFunctionLib.sendText(19, 61 ,"        " );
							}
							
							if(DURflag.length()!=0){
								Mainframe_GlobalFunctionLib.sendText(19, 70 ,DURflag );
							}
							else
							{
								Mainframe_GlobalFunctionLib.sendText(19, 70 ," " );
							}
	
							Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
							Mainframe_GlobalFunctionLib.pressKey("Enter");
						}
						
						
						
						Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
						Mainframe_GlobalFunctionLib.pressKey("F12");
										
						FunctionalLibrary.navigateToRxClaimPlanAdministrator();
					}
			
					else{
						Mainframe_GlobalFunctionLib.pressKey("F12");
						System.out.println("NDC GPI OR List is not exists");
						Reporter.addStepLog("NDC GPI OR List is not exists");
						FunctionalLibrary.navigateToRxClaimPlanAdministrator();
					}
									
					
						if(FunctionalLibrary.ScreenshotOption.equalsIgnoreCase("Always")){
							Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
							}
					
					}catch(Exception e)
					{	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
						Assert.fail("Add more drugs to NDC GPI OR List is not set successfully.Screenshot is captured");
					}
						
			}		
	
		public void DURTABLE_Creation(String DURTable, String DURTableDesc, String DURTableStatus, String DurServiceType, String DurServiceTypeSts, String DurServiceTypePriority, String DurServiceTypeResponse, String FillDateMessage, String DUPRXMessageCode, String DUPRXMessageType, String DUPRXTherapPerc,String DurServiceType2, String DurServiceTypeSts2, String DurServiceTypePriority2, String DurServiceTypeResponse2 ) throws Throwable
		{
			try {
				FunctionalLibrary.navigateToRxClaimPlanAdministrator();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			try{
				
				Mainframe_GlobalFunctionLib.sendText(21, 7 ,"6" );
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(21, 7 ,"1" );
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				if(!(FunctionalLibrary.func_SearchAndSelectADataEditMode("4,5" ,DURTable ,"10,5" , DURTable)))
				{
					Mainframe_GlobalFunctionLib.pressKey("F6");	
					Mainframe_GlobalFunctionLib.sendText(11,18, DURTable);
					Mainframe_GlobalFunctionLib.sendText(12,18, DURTableDesc);
					Mainframe_GlobalFunctionLib.sendText(14,18, DURTableStatus);
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					Mainframe_GlobalFunctionLib.pressKey("F7");	
					Mainframe_GlobalFunctionLib.pressKey("F6");	
					Mainframe_GlobalFunctionLib.sendText(5, 14,DurServiceType);
					Mainframe_GlobalFunctionLib.sendText(7, 14,DurServiceTypeSts);
					Mainframe_GlobalFunctionLib.sendText(9, 14,DurServiceTypePriority);
					Mainframe_GlobalFunctionLib.sendText(11, 14,DurServiceTypeResponse);
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
					Mainframe_GlobalFunctionLib.sendText(11, 2,"2");
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					
					if(FillDateMessage.length()!=0)
						Mainframe_GlobalFunctionLib.sendText(8, 23,FillDateMessage);
					if(DUPRXMessageCode.length()!=0)
						Mainframe_GlobalFunctionLib.sendText(9, 16,DUPRXMessageCode);
					if(DUPRXMessageType.length()!=0)
						Mainframe_GlobalFunctionLib.sendText(9, 43,DUPRXMessageType);
					if(DUPRXTherapPerc.length()!=0)
						Mainframe_GlobalFunctionLib.sendText(11, 63,DUPRXTherapPerc);
					Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
					if(DurServiceType2.length()!=0 && DurServiceTypeSts2.length()!=0 && DurServiceTypePriority2.length()!=0 && DurServiceTypeResponse2.length()!=0   )
					{
						Mainframe_GlobalFunctionLib.pressKey("F6");	
						Mainframe_GlobalFunctionLib.sendText(5, 14,DurServiceType2);
						Mainframe_GlobalFunctionLib.sendText(7, 14,DurServiceTypeSts2);
						Mainframe_GlobalFunctionLib.sendText(9, 14,DurServiceTypePriority2);
						Mainframe_GlobalFunctionLib.sendText(11, 14,DurServiceTypeResponse2);
						Mainframe_GlobalFunctionLib.pressKey("Enter");
						Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
						Mainframe_GlobalFunctionLib.sendText(11, 2,"2");
						Mainframe_GlobalFunctionLib.pressKey("Enter");
						Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
						Mainframe_GlobalFunctionLib.pressKey("Enter");
						Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
					}
						FunctionalLibrary.navigateToRxClaimPlanAdministrator();
					
				}
				else
				{
					System.out.println("DUR table is exists");
					Reporter.addStepLog("DUR table is exists");
					FunctionalLibrary.navigateToRxClaimPlanAdministrator();
				}
				
				
			}catch(Exception e)
			{	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			Assert.fail("DUR table is not set successfully.Screenshot is captured");
		}
		

		}
		
		public void DURTABLE_Messagecreation(String DUPRXMessageCode, String DUPRXMessageDesc, String FromDate, String ThruDate ) throws Throwable
		{
			try {
				FunctionalLibrary.navigateToRxClaimPlanAdministrator();
			} catch (Exception e) {
				e.printStackTrace();
			}	
				try{
					
					Mainframe_GlobalFunctionLib.sendText(21, 7 ,"4" );
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					Mainframe_GlobalFunctionLib.sendText(21, 7 ,"6" );
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					Mainframe_GlobalFunctionLib.sendText(21, 7 ,"1" );
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					if(!(FunctionalLibrary.func_SearchAndSelectADataEditMode("4,4" ,DUPRXMessageCode ,"10,4" , DUPRXMessageCode)))
					{
						Mainframe_GlobalFunctionLib.pressKey("F6");	
						Mainframe_GlobalFunctionLib.sendText(5,15, DUPRXMessageCode);
						Mainframe_GlobalFunctionLib.sendText(7,15, DUPRXMessageDesc);
						Mainframe_GlobalFunctionLib.sendText(11,15, FromDate);
						Mainframe_GlobalFunctionLib.sendText(13,15, ThruDate);
						Mainframe_GlobalFunctionLib.pressKey("Enter");
						Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
						Mainframe_GlobalFunctionLib.sendText(6,64, "Y");
						FunctionalLibrary.navigateToRxClaimPlanAdministrator();
					}
					else
					{
						System.out.println("Message for DUR table is exists");
						Reporter.addStepLog("Message for DUR table is exists");
						FunctionalLibrary.navigateToRxClaimPlanAdministrator();
					}
				}catch(Exception e)
				{	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				Assert.fail("Message creation for DUR table is not set successfully.Screenshot is captured");
			}
		}
			
		public void NDCLIST_NDCID(String NDCList1, String NDCDecs1, String NDCPDID1, String NDGPFromdate, String NDCPDIDSts, String CTSFromdate, String CTSTodate, String CTSchedule ) throws Throwable
		{

		    // Write code here that turns the phrase above into concrete actions
		  	
			try {
				FunctionalLibrary.navigateToRxClaimPlanAdministrator();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			try{
				Mainframe_GlobalFunctionLib.sendText(21, 7 ,"CCT600" );
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(21, 7 ,"4" ); 
				Mainframe_GlobalFunctionLib.pressKey("Enter"); 
				Mainframe_GlobalFunctionLib.sendText(21, 7 ,"2" ); 
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(21, 7 ,"2" ); 
				Mainframe_GlobalFunctionLib.pressKey("Enter");

				if(!(FunctionalLibrary.func_SearchAndSelectADataEditMode("4,6" ,NDCList1 ,"11,6" , NDCList1)))
				{
					
					Mainframe_GlobalFunctionLib.pressKey("F6");
					Mainframe_GlobalFunctionLib.sendText(5, 18 ,NDCList1);
					Mainframe_GlobalFunctionLib.sendText(5, 30 ,NDCDecs1);
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					Mainframe_GlobalFunctionLib.sendText(16, 64 ,"Y");
					Mainframe_GlobalFunctionLib.pressKey("F12");
					Mainframe_GlobalFunctionLib.sendText(21, 7 ,"2" );
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					Mainframe_GlobalFunctionLib.sendText(4, 6 ,NDCList1);
					Mainframe_GlobalFunctionLib.pressKey("Enter");
							
					Mainframe_GlobalFunctionLib.sendText(11, 2 ,"7" );
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					Mainframe_GlobalFunctionLib.pressKey("F6");
					Thread.sleep(2000);
					Mainframe_GlobalFunctionLib.pressKey("F16");
					Mainframe_GlobalFunctionLib.sendText(7, 4 ,NDCPDID1);
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					Mainframe_GlobalFunctionLib.sendText(12, 2 ,"1" );
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					Mainframe_GlobalFunctionLib.sendText(6, 57 ,"        " );
					Mainframe_GlobalFunctionLib.sendText(6, 57 ,NDGPFromdate );
					Mainframe_GlobalFunctionLib.sendText(6, 78 ,NDCPDIDSts );
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					Reporter.addScreenCaptureFromPath(Screenshot.screenshot());	
					// Adding CT Schedule to NDC Product id
					if(CTSchedule.length()!=0 )
					{Mainframe_GlobalFunctionLib.pressKey("F15");
					Thread.sleep(2000);
					Mainframe_GlobalFunctionLib.pressKey("F6");
					
					Mainframe_GlobalFunctionLib.sendText(9, 25 ,CTSFromdate );
					Mainframe_GlobalFunctionLib.sendText(10, 25 ,CTSTodate );
					Mainframe_GlobalFunctionLib.click(13, 25 );
					Mainframe_GlobalFunctionLib.pressKey("F4");
					Mainframe_GlobalFunctionLib.sendText(4, 5 ,CTSchedule);
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					Mainframe_GlobalFunctionLib.sendText(9, 2 ,"1" );
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					Mainframe_GlobalFunctionLib.click(14, 25 );
					Mainframe_GlobalFunctionLib.pressKey("F4");
					Mainframe_GlobalFunctionLib.sendText(7, 4 ,"G");
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					Mainframe_GlobalFunctionLib.sendText(13, 3 ,"X" );
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					Reporter.addScreenCaptureFromPath(Screenshot.screenshot());	
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					}
					Reporter.addScreenCaptureFromPath(Screenshot.screenshot());	
				
																
					FunctionalLibrary.navigateToRxClaimPlanAdministrator();
				}
		
				else{
					Mainframe_GlobalFunctionLib.pressKey("F12");
					System.out.println("NDCList with NDC drug and CT schedule exists");
					Reporter.addStepLog("NDCList with NDC drug and CT schedule exists");
					FunctionalLibrary.navigateToRxClaimPlanAdministrator();
				}
								
				
					if(FunctionalLibrary.ScreenshotOption.equalsIgnoreCase("Always")){
						Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
						}
				
				}catch(Exception e)
				{	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
					Assert.fail("NDCList with NDC drug and CT schedule is not set successfully.Screenshot is captured");
				}		
				
		}
	
		public void DURTable_Addingtoplan(String PlanCode, String DURTable) throws Throwable
		{
			try {
				FunctionalLibrary.navigateToRxClaimPlanAdministrator();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			try{
				Mainframe_GlobalFunctionLib.sendText(21, 7 ,"CCT600" );
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(21, 7 ,"4" );
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(21, 7 ,"1" );
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(4, 5 ,PlanCode);
				Mainframe_GlobalFunctionLib.pressKey("Enter");			
				Mainframe_GlobalFunctionLib.sendText(11, 2 ,"2" );
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(7, 24 ,"Y" );
				Mainframe_GlobalFunctionLib.sendText(19, 17 ,"        ");
				Mainframe_GlobalFunctionLib.sendText(19, 17 ,DURTable);
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());	
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(16, 64 ,"Y" );
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());	
				FunctionalLibrary.navigateToRxClaimPlanAdministrator();
				
			}catch(Exception e)
			{	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				Assert.fail("Adding DURtable to the  plan is not set successfully.Screenshot is captured");
			}

		}
		
	@Given("^I create NDCGPI OR Edit List for NDC with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_create_NDCGPI_OR_Edit_List_for_NDC_with(String NDCGPIORList1, String NDCGPIORListDesc1, String NDCPDID1, String NDGPFromdate, String NDGPTodate, String ContingentTherapy) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		try {
			FunctionalLibrary.navigateToRxClaimPlanAdministrator();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try{
			Mainframe_GlobalFunctionLib.sendText(21, 7 ,"CCT600" );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(21, 7 ,"9" );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(21, 7 ,"6" );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(21, 7 ,"90" );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			if(!(FunctionalLibrary.func_SearchAndSelectADataEditMode("4,5" ,NDCGPIORList1 ,"10,5" , NDCGPIORList1)))
			{
				Mainframe_GlobalFunctionLib.pressKey("F6");
				Mainframe_GlobalFunctionLib.sendText(13, 18 ,NDCGPIORList1);
				Mainframe_GlobalFunctionLib.sendText(14, 18, NDCGPIORListDesc1);
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.pressKey("F12");
				Mainframe_GlobalFunctionLib.sendText(21, 7 ,"90" );
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(4, 5 ,NDCGPIORList1);
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(10, 2 ,"7" );
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.pressKey("F6");
				Mainframe_GlobalFunctionLib.click(7, 8 );
				Mainframe_GlobalFunctionLib.pressKey("F4");
				Thread.sleep(2000);
				Mainframe_GlobalFunctionLib.pressKey("F16");
				Mainframe_GlobalFunctionLib.sendText(4, 4 ,NDCPDID1);
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(9, 2 ,"1" );
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(9, 12 ,NDGPFromdate);
				Mainframe_GlobalFunctionLib.sendText(9, 34 ,NDGPTodate);
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(20, 47 ,ContingentTherapy );
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				Mainframe_GlobalFunctionLib.pressKey("F12");
								
				FunctionalLibrary.navigateToRxClaimPlanAdministrator();
			}
	
			else{
				Mainframe_GlobalFunctionLib.pressKey("F12");
				System.out.println("Medicaid NDC GPI OR List exists");
				Reporter.addStepLog("Medicaid NDC GPI OR List exists");
				FunctionalLibrary.navigateToRxClaimPlanAdministrator();
			}
							
			
				if(FunctionalLibrary.ScreenshotOption.equalsIgnoreCase("Always")){
					Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
					}
			
			}catch(Exception e)
			{	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				Assert.fail("Medicaid NDC GPI OR List is not set successfully.Screenshot is captured");
			}
		
	
	}

	@Given("^I create the medicaid setup for the plan with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_create_the_medicaid_setup_for_the_plan_with(String PlanCode, String TBOverride, String NDCGPIORList1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
			
		try {
			FunctionalLibrary.navigateToRxClaimPlanAdministrator();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try{
			Mainframe_GlobalFunctionLib.sendText(21, 7 ,"CCT600" );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(21, 7 ,"4" );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(21, 7 ,"1" );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(4, 5 ,PlanCode);
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(11, 2 ,"2" );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.pressKey("F22");
			String getTBOverride = Mainframe_GlobalFunctionLib.getText(9, 33);
			if(getTBOverride.equals("N"))
			{
								
				Mainframe_GlobalFunctionLib.sendText(9, 33 ,TBOverride);
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.pressKey("F7");
				Mainframe_GlobalFunctionLib.sendText(9, 20 ,"1" );
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(7, 30 ,"G" );
				Mainframe_GlobalFunctionLib.sendText(8, 30 ,"   " );
				Mainframe_GlobalFunctionLib.sendText(8, 30 ,"90" );
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				Mainframe_GlobalFunctionLib.pressKey("PageDown");
				Mainframe_GlobalFunctionLib.click(19, 54 );
				Mainframe_GlobalFunctionLib.pressKey("F4");
				Mainframe_GlobalFunctionLib.sendText(4, 5 ,NDCGPIORList1);
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(9, 2 ,"1" );
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				
				Mainframe_GlobalFunctionLib.pressKey("Enter");	
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				FunctionalLibrary.navigateToRxClaimPlanAdministrator();
			}
	
			else{
				Mainframe_GlobalFunctionLib.pressKey("F12");
				System.out.println("Medicaid setup exists");
				Reporter.addStepLog("Medicaid setup exists");
				FunctionalLibrary.navigateToRxClaimPlanAdministrator();
			}
							
			
				if(FunctionalLibrary.ScreenshotOption.equalsIgnoreCase("Always")){
					Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
					}
			
			}catch(Exception e)
			{	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				Assert.fail("Medicaid is not set successfully.Screenshot is captured");
			}
		
	
	}
	
	@Given("^I create the NDClist with NDCId and CT Schedule mapping \"([^\"]*)\", \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",$")
	public void i_create_the_NDClist_with_NDCId_and_CT_Schedule_mapping(String NDCList1, String NDCDecs1, String NDCPDID1, String NDGPFromdate, String NDCPDIDSts, String CTSFromdate, String CTSTodate, String CTSchedule) throws Throwable {
		
		NDCLIST_NDCID(NDCList1, NDCDecs1, NDCPDID1, NDGPFromdate, NDCPDIDSts, CTSFromdate, CTSTodate, CTSchedule );
	}
	
	@When("^I create Contingent Therapy Schedule with protocol mapping \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_create_Contingent_Therapy_Schedule_with_protocol_mapping(String CTSchedule, String CTScheduleDesc, String MessageCode1, String MessageType1, String MessageCode2, String MessageType2, String ProSeq, String ProNDCId, String ProGPIId, String ProType, String ProStsOverride) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		try {
			FunctionalLibrary.navigateToRxClaimPlanAdministrator();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try{
			Mainframe_GlobalFunctionLib.sendText(21, 7 ,"CCT600" );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(21, 7 ,"4" );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(21, 7 ,"3" );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			if(!(FunctionalLibrary.func_SearchAndSelectADataEditMode("4,6" ,CTSchedule ,"10,6" , CTSchedule)))
			{
				Mainframe_GlobalFunctionLib.pressKey("F6");
				Mainframe_GlobalFunctionLib.sendText(5, 11 ,CTSchedule);
				Mainframe_GlobalFunctionLib.sendText(5, 33, CTScheduleDesc);
				Mainframe_GlobalFunctionLib.sendText(8, 17, MessageCode1);
				Mainframe_GlobalFunctionLib.sendText(9, 17, MessageType1);
				Mainframe_GlobalFunctionLib.sendText(12, 17, MessageCode2);
				Mainframe_GlobalFunctionLib.sendText(13, 17, MessageType2);
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				Mainframe_GlobalFunctionLib.pressKey("F12");
						
				Mainframe_GlobalFunctionLib.sendText(21, 7 ,"3" );
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(4, 6 ,CTSchedule);
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(10, 2 ,"7" );
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				//Adding Protocals
				Mainframe_GlobalFunctionLib.pressKey("F6");
				Mainframe_GlobalFunctionLib.sendText(13, 19 ,ProSeq);
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				
				if(ProNDCId.length()!=0)	{								
						Mainframe_GlobalFunctionLib.click(5, 6 );
						Mainframe_GlobalFunctionLib.pressKey("F4");
						Thread.sleep(2000);
						Mainframe_GlobalFunctionLib.pressKey("F16");
						Mainframe_GlobalFunctionLib.sendText(4, 4 ,ProNDCId);
						Mainframe_GlobalFunctionLib.pressKey("Enter");
						Mainframe_GlobalFunctionLib.sendText(9, 2 ,"1" );
						Mainframe_GlobalFunctionLib.pressKey("Enter");
						}
				if(ProGPIId.length()!=0){
						Mainframe_GlobalFunctionLib.click(6, 6 );
						Mainframe_GlobalFunctionLib.pressKey("F4");
						Thread.sleep(2000);
						Mainframe_GlobalFunctionLib.pressKey("F18");
						Mainframe_GlobalFunctionLib.sendText(4, 4 ,ProGPIId);
						Mainframe_GlobalFunctionLib.pressKey("Enter");
						Mainframe_GlobalFunctionLib.sendText(9, 2 ,"1" );
						Mainframe_GlobalFunctionLib.pressKey("Enter");
				       }
				Mainframe_GlobalFunctionLib.sendText(10, 15 ,ProType );
				Mainframe_GlobalFunctionLib.sendText(11, 20 ,"90" );
				Mainframe_GlobalFunctionLib.sendText(13, 19 ,"1" );
				Mainframe_GlobalFunctionLib.sendText(13, 27 ,"999" );
				Mainframe_GlobalFunctionLib.sendText(17, 15 ,ProStsOverride );
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				FunctionalLibrary.navigateToRxClaimPlanAdministrator();
			}
	
			else{
				Mainframe_GlobalFunctionLib.pressKey("F12");
				System.out.println("CT Schedule exists");
				Reporter.addStepLog("CT Schedule exists");
				FunctionalLibrary.navigateToRxClaimPlanAdministrator();
			}
							
			
				if(FunctionalLibrary.ScreenshotOption.equalsIgnoreCase("Always")){
					Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
					}
			
			}catch(Exception e)
			{	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				Assert.fail("CT Schedule is not set successfully.Screenshot is captured");
			}
			
	}
	
	@Given("^I add NDClist to the plan with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_add_NDClist_to_the_plan_with(String PlanCode, String NDCList1, String ndcsq, String ndcfromdate, String ndcthrudate) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
			
		try {
			FunctionalLibrary.navigateToRxClaimPlanAdministrator();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try{
			Mainframe_GlobalFunctionLib.sendText(21, 7 ,"CCT600" );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(21, 7 ,"4" );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(21, 7 ,"1" );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(4, 5 ,PlanCode);
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(11, 2 ,"2" );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(7, 24 ,"Y" );
			Mainframe_GlobalFunctionLib.sendText(15, 24 ,"Y" );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(16, 64 ,"Y" );
			Mainframe_GlobalFunctionLib.pressKey("F7");
			Mainframe_GlobalFunctionLib.sendText(7, 21 ,"10" );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
						
			
			if(!(FunctionalLibrary.func_SearchAndSelectADataEditMode("7,8" ,NDCList1 ,"11,8" , NDCList1)))
			{
								
				Mainframe_GlobalFunctionLib.pressKey("F6"); 
				Thread.sleep(3000);
				Mainframe_GlobalFunctionLib.sendText(4, 5 ,NDCList1);
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(9, 2 ,"1" );
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(13, 17 ,"   "); 
				Mainframe_GlobalFunctionLib.sendText(13, 17, ndcsq); 
				Mainframe_GlobalFunctionLib.sendText(14, 17 ,"        "); 
				Mainframe_GlobalFunctionLib.sendText(14, 17, ndcfromdate); 
				Mainframe_GlobalFunctionLib.sendText(14, 41 ,"        "); 
				Mainframe_GlobalFunctionLib.sendText(14, 41, ndcthrudate); 
				Mainframe_GlobalFunctionLib.pressKey("Enter"); 
				Mainframe_GlobalFunctionLib.sendText(16, 64 ,"Y" ); 
	
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				Mainframe_GlobalFunctionLib.pressKey("F12");
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				FunctionalLibrary.navigateToRxClaimPlanAdministrator();
			}
	
			else{
				Mainframe_GlobalFunctionLib.pressKey("F12");
				System.out.println("NDClist setup in plan exists");
				Reporter.addStepLog("NDClist setup in plan exists");
				FunctionalLibrary.navigateToRxClaimPlanAdministrator();
			}
							
			
				if(FunctionalLibrary.ScreenshotOption.equalsIgnoreCase("Always")){
					Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
					}
			
			}catch(Exception e)
			{	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				Assert.fail("NDClist setup in plan is not set successfully.Screenshot is captured");
			}
					
	}
	
	@Given("^I create BIN in Transaction control screen for claim router submission with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_create_BIN_in_Transaction_control_screen_for_claim_router_submission_with(String BIN, String ProcCtrl, String Group, String Bfromdate, String Btodate, String CarrierID, String AccountID, String BINGroup, String Windowdays) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions	    		
		
		try {
			FunctionalLibrary.navigateToRxClaimPlanAdministrator();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try{
			Mainframe_GlobalFunctionLib.sendText(21, 7 ,"8" );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(21, 7 ,"2" );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(4, 4 ,BIN);
			Mainframe_GlobalFunctionLib.sendText(4, 11, ProcCtrl);
			Mainframe_GlobalFunctionLib.sendText(4, 22 ,Group);
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			if(Mainframe_GlobalFunctionLib.getText(10,4).trim().toLowerCase().contentEquals(BIN.trim().toLowerCase())&&Mainframe_GlobalFunctionLib.getText(10,11).trim().toLowerCase().contentEquals(ProcCtrl.trim().toLowerCase())&&Mainframe_GlobalFunctionLib.getText(10,22).trim().toLowerCase().contentEquals(Group.trim().toLowerCase()))
			//if(!(FunctionalLibrary.func_SearchAndSelectADataEditMode("4,4" ,BIN ,"10,4" , BIN)))
			{
				Mainframe_GlobalFunctionLib.pressKey("F12");
				System.out.println("BIN exists");
				Reporter.addStepLog("BIN exists");
				FunctionalLibrary.navigateToRxClaimPlanAdministrator();
				
				
			}
	
			else{
				Mainframe_GlobalFunctionLib.pressKey("F6");
				Mainframe_GlobalFunctionLib.sendText(4, 12 ,BIN);
				Mainframe_GlobalFunctionLib.sendText(5, 12, ProcCtrl);
				Mainframe_GlobalFunctionLib.sendText(6, 12 ,Group);
				Mainframe_GlobalFunctionLib.sendText(7, 12 ,Bfromdate);
				Mainframe_GlobalFunctionLib.sendText(8, 12 ,Btodate);
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());	
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(6, 55 ,"Y" );
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());	
				/*Mainframe_GlobalFunctionLib.click(16, 15 );
				Mainframe_GlobalFunctionLib.pressKey("F4");
				Mainframe_GlobalFunctionLib.sendText(4, 5 ,CarrierID);
				Mainframe_GlobalFunctionLib.sendText(4, 16 ,AccountID);
				Mainframe_GlobalFunctionLib.sendText(4, 33 ,BINGroup);
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(9, 2 ,"1" );
				Mainframe_GlobalFunctionLib.pressKey("Enter");*/
				Mainframe_GlobalFunctionLib.sendText(16, 15 ,CarrierID);
				Mainframe_GlobalFunctionLib.sendText(18, 15 ,AccountID);
				Mainframe_GlobalFunctionLib.sendText(20, 15 ,BINGroup);
				Mainframe_GlobalFunctionLib.sendText(21, 33 ,"    ");
				Mainframe_GlobalFunctionLib.sendText(21, 33 ,Windowdays);
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());	
				Mainframe_GlobalFunctionLib.pressKey("PageDown");
				Mainframe_GlobalFunctionLib.sendText(5, 19 ,"Y" );
				Mainframe_GlobalFunctionLib.pressKey("Enter");				
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());				
				FunctionalLibrary.navigateToRxClaimPlanAdministrator();
			}
							
			
				if(FunctionalLibrary.ScreenshotOption.equalsIgnoreCase("Always")){
					Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
					}
			
			}catch(Exception e)
			{	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				Assert.fail("BIN creation is not set successfully.Screenshot is captured");
			}

		FunctionalLibrary.navigateToRxClaimPlanAdministrator();	
	
	}
	
	@Given("^I submit a router claim with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_submit_a_router_claim_with(String bin, String proc, String group, String pharmacyID, String rxNbr, String refill, String fillDate, String memberID, String productID1, String dspQty, String ds, String psc, String cost, String fee, String ucw) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		FunctionalLibrary.CreateTransaction(bin, proc, group, pharmacyID, rxNbr, refill, fillDate, memberID, productID1, dspQty, ds, psc, cost);
		Mainframe_GlobalFunctionLib.sendText(11, 47,fee );
		Mainframe_GlobalFunctionLib.sendText(20, 47,ucw );
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("PageDown");
		Mainframe_GlobalFunctionLib.sendText(4, 55,"1" );
		Mainframe_GlobalFunctionLib.pressKey("PageUp");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("F18");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	}
	
	@And("^I update the member details with \"([^\"]*)\"$")
	public void i_update_the_member_details_with(String MemberId) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		try {
			FunctionalLibrary.navigateToRxClaimPlanAdministrator();
		} catch (Exception e) {
			e.printStackTrace();
		}
		Mainframe_GlobalFunctionLib.sendText(21, 7 ,"CCT600" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(21, 7 ,"1" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(21, 7 ,"2" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(4, 4 ,MemberId);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(10, 2 ,"2" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(7, 10 ,"001" );
		Mainframe_GlobalFunctionLib.sendText(7, 18 ,"1" );
		Mainframe_GlobalFunctionLib.sendText(7, 26 ,"1" );
		Mainframe_GlobalFunctionLib.sendText(7, 33 ,"M" );
		Mainframe_GlobalFunctionLib.sendText(12, 35 ,"IL" );
		Mainframe_GlobalFunctionLib.sendText(12, 42 ,"51222" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		FunctionalLibrary.navigateToRxClaimPlanAdministrator();	
		
	}
	
	@Then("^I validate the claim details with \"([^\"]*)\",\"([^\"]*)\"$")
	public void i_validate_the_claim_details_with(String ClaimStatus, String NDCList1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
		Mainframe_GlobalFunctionLib.validateText("21", "6",ClaimStatus );
		Mainframe_GlobalFunctionLib.pressKey("F7");
		Mainframe_GlobalFunctionLib.pressKey("F7");
		Mainframe_GlobalFunctionLib.sendText(4, 23 ,"8" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F9");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
		String getNDClist = Mainframe_GlobalFunctionLib.getText(11, 33).trim();
		int lengetNDClist = getNDClist.length();
				if(lengetNDClist==0)
				{
					Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
					System.out.println("NDClist not appearing as contigent therapy drugid is used with claim fill date 11/01/18 and it is as expected ");
					Reporter.addStepLog("NDClist not appearing as contigent therapy drugid is used with claim fill date 11/01/18 and it is as expected");
				} 
				else 
				{ 
					System.out.println("NDClist is appearing which is not expected ");
					Assert.fail("NDClist is appearing which is not expected"); 
				}
				Mainframe_GlobalFunctionLib.pressKey("F12");
				Mainframe_GlobalFunctionLib.pressKey("F12");
				Mainframe_GlobalFunctionLib.pressKey("F12");
				Mainframe_GlobalFunctionLib.pressKey("F12");
	}
	
	@Then("^I resubmit the claim with drug mapped to NDCGPIlist \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_resubmit_the_claim_with_drug_mapped_to_NDCGPIlist(String RxNo, String FillDate2, String ProductID2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
		
		Mainframe_GlobalFunctionLib.sendText(5,29, FunctionalLibrary.func_GenerateDynamicRxNo());
		Mainframe_GlobalFunctionLib.sendText(4, 65 ,"          ");
		Mainframe_GlobalFunctionLib.sendText(4, 65 ,FillDate2);
		Mainframe_GlobalFunctionLib.sendText(11, 20 ,"                ");
		Mainframe_GlobalFunctionLib.sendText(11, 20 ,ProductID2);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("F18");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());

	}
	
	@Then("^I validate the resubmitted Claim details with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_validate_the_resubmitted_Claim_details_with(String ClaimStatus2, String RejCode, String Message, String NDCList1, String ContTherpy) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
		Mainframe_GlobalFunctionLib.validateText("21", "6",ClaimStatus2 );
		Mainframe_GlobalFunctionLib.validateText("21", "12",RejCode );
		Mainframe_GlobalFunctionLib.validateText("22", "6",Message );
		Mainframe_GlobalFunctionLib.pressKey("F7");
		Mainframe_GlobalFunctionLib.pressKey("F7");
		Mainframe_GlobalFunctionLib.sendText(4, 23 ,"8" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F9");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
		
		String getNDClist = Mainframe_GlobalFunctionLib.getText(11, 33).trim();
		
				if(getNDClist.equals(NDCList1))
				{
					Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
					System.out.println("NDClist is appearing as drugid is used from NDClist and it is as expected: "+getNDClist);
					Reporter.addStepLog("NDClist is appearing as drugid is used from NDClist and it is as expected: "+getNDClist);
				} 
				else 
				{ 
					System.out.println("NDClist is not appearing which is not expected ");
					Assert.fail("NDClist is not appearing which is not expected"); 
				}
				
		String getContTherpy = Mainframe_GlobalFunctionLib.getText(10, 79).trim();
				
				if(getContTherpy.equals(ContTherpy))
				{
					Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
					System.out.println("Cont Therapy value appearing correctly: "+getContTherpy);
					Reporter.addStepLog("Cont Therapy value appearing correctly: "+getContTherpy);
				} 
				else 
				{ 
					System.out.println("NDClist is not appearing which is not expected ");
					Assert.fail("NDClist is not appearing which is not expected"); 
				}
				
		String getContStatus = Mainframe_GlobalFunctionLib.getText(11, 79).trim();
				int lengetContStatus = getContStatus.length();
						if(lengetContStatus==0)
						{
							Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
							System.out.println("No status appearing under Cont Status and it is as expected ");
							Reporter.addStepLog("No status appearing under Cont Status and it is as expected");
						} 
						else 
						{ 
							System.out.println("Unknown status appearing under Cont Status which is not as expected ");
							Assert.fail("Unknown status appearing under Cont Status which is not as expected "); 
						}
						
						FunctionalLibrary.navigateToRxClaimPlanAdministrator();
	}
	
	@Given("^I add Transitional Benefit override to the plan with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_add_Transitional_Benefit_override_to_the_plan_with(String PlanCode, String TBLengthPeriod, String MedicareTBSchedule, String TBlvl, String TBlwc) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		try {
			FunctionalLibrary.navigateToRxClaimPlanAdministrator();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try{
			Mainframe_GlobalFunctionLib.sendText(21, 7 ,"CCT600" );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(21, 7 ,"4" );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(21, 7 ,"1" );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(4, 5 ,PlanCode);
			Mainframe_GlobalFunctionLib.pressKey("Enter");			
			Mainframe_GlobalFunctionLib.sendText(11, 2 ,"2" );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.pressKey("F19");
			
			String getMedicareTBOverride = Mainframe_GlobalFunctionLib.getText(16, 34);
			if(getMedicareTBOverride.equals("N"))
			{
			
			Mainframe_GlobalFunctionLib.sendText(16, 34 ,"Y" );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
			Mainframe_GlobalFunctionLib.pressKey("F7");
			Mainframe_GlobalFunctionLib.sendText(8, 21 ,"9" );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(7, 30 ,"N" );
			Mainframe_GlobalFunctionLib.sendText(10, 30 ,"   ");
			Mainframe_GlobalFunctionLib.sendText(10, 30 ,TBLengthPeriod);
			Mainframe_GlobalFunctionLib.sendText(13, 48 ,"   ");
			Mainframe_GlobalFunctionLib.sendText(13, 48 ,"30");
			
			Mainframe_GlobalFunctionLib.sendText(14, 42 ,"E");
			Mainframe_GlobalFunctionLib.sendText(14, 48 ,"   ");
			Mainframe_GlobalFunctionLib.sendText(14, 48 ,"30");
			Mainframe_GlobalFunctionLib.sendText(14, 56 ,TBlvl);
			Mainframe_GlobalFunctionLib.sendText(14, 61 ,TBlwc);
			Mainframe_GlobalFunctionLib.sendText(19, 33 ,MedicareTBSchedule);
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
			Mainframe_GlobalFunctionLib.pressKey("Enter");

			}
	
			else{
				//Mainframe_GlobalFunctionLib.pressKey("F12");
				System.out.println("Medicare TB Override exists");
				Reporter.addStepLog("Medicare TB Override exists");
				
				Mainframe_GlobalFunctionLib.pressKey("F7");
				Mainframe_GlobalFunctionLib.sendText(8, 21 ,"9" );
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
				FunctionalLibrary.navigateToRxClaimPlanAdministrator();
			}
							
			
				if(FunctionalLibrary.ScreenshotOption.equalsIgnoreCase("Always")){
					Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
					}
			
			}catch(Exception e)
			{	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				Assert.fail("Medicare TB Override is not set successfully.Screenshot is captured");
			}
			
	}
	
	@Given("^I add accumulators to the above plan \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_add_accumulators_to_the_above_plan(String TrOOPfromdate, String TrOOPthrudate, String accumulationlevel, String accumulationcode, String TrOOPschedule, String CMSlabelerlist) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		FunctionalLibrary.addAccumulators(TrOOPfromdate, TrOOPthrudate, accumulationlevel, accumulationcode, TrOOPschedule, CMSlabelerlist);
		Mainframe_GlobalFunctionLib.pressKey("F7");
		Mainframe_GlobalFunctionLib.sendText(7, 21 ,"29" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(15, 12 ,"6" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(11, 2 ,"2" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(16, 28 ,"          " );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		FunctionalLibrary.navigateToRxClaimPlanAdministrator();
		
	}

	@Then("^I validate the resubmitted second Claim details with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_validate_the_resubmitted_second_Claim_details_with(String ClaimStatus, String Message1, String Message2, String Message3, String CTSchedule, String NDCList1, String ContTherpy, String ContStatus, String MedicareTBSchedule) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	       
				Mainframe_GlobalFunctionLib.validateText("21", "6",ClaimStatus );
				Mainframe_GlobalFunctionLib.validateText("22", "6",Message1 );
				Mainframe_GlobalFunctionLib.pressKey("F7");
				Mainframe_GlobalFunctionLib.pressKey("F7");
				Mainframe_GlobalFunctionLib.sendText(4, 23 ,"6");
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.pressKey("F9");
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				Mainframe_GlobalFunctionLib.validateText("7", "18",Message1 );		
				Mainframe_GlobalFunctionLib.validateText("8", "18",Message2 );		
		   	    Mainframe_GlobalFunctionLib.validateText("9", "18",Message3 );
		   	    Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				Mainframe_GlobalFunctionLib.pressKey("F12");
				Mainframe_GlobalFunctionLib.pressKey("F12");
				Mainframe_GlobalFunctionLib.sendText(4, 23 ,"8" );
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.pressKey("PageDown");
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
				
				String getCTSched = Mainframe_GlobalFunctionLib.getText(10, 22).trim();
				
				if(getCTSched.equals(CTSchedule))
				{
					Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
					System.out.println("Contingent Therapy schedule appearing and it is as expected: "+getCTSched);
					Reporter.addStepLog("Contingent Therapy schedule appearing and it is as expected: "+getCTSched);
				} 
				else 
				{ 
					System.out.println("Contingent Therapy schedule not appearing which is not as expected ");
					Assert.fail("Contingent Therapy schedule not appearing which is not as expected"); 
				}
				
				Mainframe_GlobalFunctionLib.pressKey("F9");
				NDClist_Validate(NDCList1);
				ContTherpy_Validate(ContTherpy);
				ContStatus_Validate(ContStatus);
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
				Mainframe_GlobalFunctionLib.pressKey("F12");
				Mainframe_GlobalFunctionLib.pressKey("F7");
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
				TBSchedule_Validate(MedicareTBSchedule);
				Mainframe_GlobalFunctionLib.pressKey("F12");
				Mainframe_GlobalFunctionLib.pressKey("F12");
				Mainframe_GlobalFunctionLib.pressKey("F12");
				Mainframe_GlobalFunctionLib.pressKey("F12");
			    
	}
	
	@Then("^I resubmit the second claim with drug mapped to NDCGPIlist \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_resubmit_the_second_claim_with_drug_mapped_to_NDCGPIlist(String RxNo, String FillDate3, String ProductID2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
		   Resubmit_Claim(RxNo, FillDate3, ProductID2);
	
	}
	
	@Then("^I validate the resubmitted above Claim with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_validate_the_resubmitted_above_Claim_with(String ClaimStatus2, String RejCode, String Message1, String CTSchedule, String NDCList1, String ContTherpy, String ContStatus) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	          
		Mainframe_GlobalFunctionLib.validateText("21", "6",ClaimStatus2 );
		Mainframe_GlobalFunctionLib.validateText("21", "12",RejCode );
		Mainframe_GlobalFunctionLib.validateText("22", "6",Message1 );
		Mainframe_GlobalFunctionLib.pressKey("F7");
		Mainframe_GlobalFunctionLib.pressKey("F7");
		Mainframe_GlobalFunctionLib.sendText(4, 23 ,"8" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("PageDown");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
		CTSchedule_Validate(CTSchedule);
		Mainframe_GlobalFunctionLib.pressKey("F9");
		NDClist_Validate(NDCList1);
		ContTherpy_Validate(ContTherpy);
		ContStatus_Validate(ContStatus);
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F7");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
		String getMedicareTBSchedule = Mainframe_GlobalFunctionLib.getText(9, 17).trim();
		int lengetTBSchedule = getMedicareTBSchedule.length();
				if(lengetTBSchedule==0)
				{
					Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
					System.out.println("No TB override schedule stamping appearing  and it is as expected ");
					Reporter.addStepLog("No TB override schedule stamping appearing  and it is as expected ");
				} 
				else 
				{ 
					System.out.println("TB override schedule stamping appearing which is not as expected ");
					Assert.fail("TB override schedule stamping appearing which is not as expected "); 
				}
				
				FunctionalLibrary.navigateToRxClaimPlanAdministrator();		
	}
	
	@Given("^I update the ContingentTherapy to N in NDCGPI OR Edit List screen for NDC with \"([^\"]*)\",\"([^\"]*)\"$")
	public void i_update_the_ContingentTherapy_to_N_in_NDCGPI_OR_Edit_List_screen_for_NDC_with(String NDCGPIORList1, String ContingentTherapy ) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
		try {
			FunctionalLibrary.navigateToRxClaimPlanAdministrator();
		} catch (Exception e) {
			e.printStackTrace();
		}

		try{
			Mainframe_GlobalFunctionLib.sendText(21, 7 ,"CCT600" );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(21, 7 ,"9" );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(21, 7 ,"6" );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(21, 7 ,"90" );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(4, 5 ,NDCGPIORList1);
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			String getNDCGPIORList1 = Mainframe_GlobalFunctionLib.getText(10, 5).trim();
			if(getNDCGPIORList1.equals(NDCGPIORList1))
			{
				Mainframe_GlobalFunctionLib.sendText(10, 2 ,"7" );
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(12, 2 ,"2" );
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
					if(ContingentTherapy.length()!=0) 
					    { Mainframe_GlobalFunctionLib.sendText(20, 47 ,ContingentTherapy );}
					else{ Mainframe_GlobalFunctionLib.sendText(20, 47 ," " ); }
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				Mainframe_GlobalFunctionLib.pressKey("F12");
								
				FunctionalLibrary.navigateToRxClaimPlanAdministrator();
			}
	
			else{
				
				System.out.println("NDCGPIORLIST not found");
				Assert.fail("NDCGPIORLIST not found");
				FunctionalLibrary.navigateToRxClaimPlanAdministrator();
			}
							
			
				if(FunctionalLibrary.ScreenshotOption.equalsIgnoreCase("Always")){
					Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
					}
			
			}catch(Exception e)
			{	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				Assert.fail("Updating CT in Medicaid NDC GPI OR List is not set successfully.Screenshot is captured");
			}

	}
	
	@Then("^I validate the Claim for CT is N with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_validate_the_Claim_for_CT_is_N_with(String ClaimStatus2, String RejCode, String Message, String CTSchedule, String NDCList1, String ContTherpy, String ContStatus) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.validateText("21", "6",ClaimStatus2 );
		Mainframe_GlobalFunctionLib.validateText("21", "12",RejCode );
		Mainframe_GlobalFunctionLib.validateText("22", "6",Message );
		Mainframe_GlobalFunctionLib.pressKey("F7");
		Mainframe_GlobalFunctionLib.pressKey("F7");
		Mainframe_GlobalFunctionLib.sendText(4, 23 ,"8" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("PageDown");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
		CTSchedule_Validate(CTSchedule);
		Mainframe_GlobalFunctionLib.pressKey("F9");
		NDClist_Validate(NDCList1);
		ContTherpy_Validate(ContTherpy);
		ContStatus_Validate(ContStatus);
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
		FunctionalLibrary.navigateToRxClaimPlanAdministrator();
	}
	
	@Given("^I update the ContingentTherapy to blank in NDCGPI OR Edit List screen for NDC with \"([^\"]*)\",\"([^\"]*)\"$")
	public void i_update_the_ContingentTherapy_to_blank_in_NDCGPI_OR_Edit_List_screen_for_NDC_with(String NDCGPIORList1, String ContingentTherapy ) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		try {
			FunctionalLibrary.navigateToRxClaimPlanAdministrator();
		} catch (Exception e) {
			e.printStackTrace();
		}

		try{
			Mainframe_GlobalFunctionLib.sendText(21, 7 ,"CCT600" );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(21, 7 ,"9" );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(21, 7 ,"6" );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(21, 7 ,"90" );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(4, 5 ,NDCGPIORList1);
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			String getNDCGPIORList1 = Mainframe_GlobalFunctionLib.getText(10, 5).trim();
			if(getNDCGPIORList1.equals(NDCGPIORList1))
			{
				Mainframe_GlobalFunctionLib.sendText(10, 2 ,"7" );
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(12, 2 ,"2" );
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
					if(ContingentTherapy.length()!=0) 
					    { Mainframe_GlobalFunctionLib.sendText(20, 47 ,ContingentTherapy );}
					else{ Mainframe_GlobalFunctionLib.sendText(20, 47 ," " ); }
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				Mainframe_GlobalFunctionLib.pressKey("F12");
								
				FunctionalLibrary.navigateToRxClaimPlanAdministrator();
			}
	
			else{
				
				System.out.println("NDCGPIORLIST not found");
				Assert.fail("NDCGPIORLIST not found");
				FunctionalLibrary.navigateToRxClaimPlanAdministrator();
			}
							
			
				if(FunctionalLibrary.ScreenshotOption.equalsIgnoreCase("Always")){
					Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
					}
			
			}catch(Exception e)
			{	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				Assert.fail("Updating CT in Medicaid NDC GPI OR List is not set successfully.Screenshot is captured");
			}

	}
	
	@Then("^I validate the Claim for CT is empty with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_validate_the_Claim_for_CT_is_empty_with(String ClaimStatus2, String RejCode, String Message, String CTSchedule, String NDCList1, String ContTherpy, String ContStatus) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.validateText("21", "6",ClaimStatus2 );
		Mainframe_GlobalFunctionLib.validateText("21", "12",RejCode );
		Mainframe_GlobalFunctionLib.validateText("22", "6",Message );
		Mainframe_GlobalFunctionLib.pressKey("F7");
		Mainframe_GlobalFunctionLib.pressKey("F7");
		Mainframe_GlobalFunctionLib.sendText(4, 23 ,"8" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("PageDown");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
		CTSchedule_Validate(CTSchedule);
		Mainframe_GlobalFunctionLib.pressKey("F9");
		NDClist_Validate(NDCList1);
		ContTherpy_Validate(ContTherpy);
		ContStatus_Validate(ContStatus);
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
		FunctionalLibrary.navigateToRxClaimPlanAdministrator();
	}
	@Given("^I create PA on Member for CT \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_create_PA_on_Member_for_CT(String MemberId, String number, String type, String msc, String otc, String ndcgpilist, String from, String thru, String agent, String reason, String ignoredrugstatus) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
		try {
			FunctionalLibrary.navigateToRxClaimPlanAdministrator();
		} catch (Exception e) {
			e.printStackTrace();
		}
		Mainframe_GlobalFunctionLib.sendText(21, 7 ,"CCT600" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(21, 7 ,"1" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(21, 7 ,"2" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(4, 4 ,MemberId);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(10, 2 ,"2" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		
		FunctionalLibrary.func_SetPriorAuth(number,type,msc,otc,ndcgpilist,from,thru,agent,reason,ignoredrugstatus);
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
		FunctionalLibrary.navigateToRxClaimPlanAdministrator();
	}
	
	@Then("^I validate the Claim for member PA with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_validate_the_Claim_for_member_PA_with(String ClaimStatus, String Message, String PANumber, String CTSchedule, String NDCList1, String ContTherpy, String ContStatus) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.validateText("21", "6",ClaimStatus );
		Mainframe_GlobalFunctionLib.validateText("22", "6",Message );
		Mainframe_GlobalFunctionLib.pressKey("F7");
		Mainframe_GlobalFunctionLib.pressKey("F7");
		Mainframe_GlobalFunctionLib.sendText(4, 23 ,"8" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		PANumber_ClaimValidate(PANumber);
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("PageDown");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
		CTSchedule_Validate(CTSchedule);
		Mainframe_GlobalFunctionLib.pressKey("F9");
		NDClist_Validate(NDCList1);
		ContTherpy_Validate(ContTherpy);
		ContStatus_Validate(ContStatus);
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
		FunctionalLibrary.navigateToRxClaimPlanAdministrator();
	}
	
	@Then("^I validate the Claim for CT with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_validate_the_Claim_for_CT_with(String ClaimStatus2, String Message, String CTSchedule, String NDCList1, String ContTherpy, String ContStatus) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  
		Mainframe_GlobalFunctionLib.validateText("21", "6",ClaimStatus2 );
		Mainframe_GlobalFunctionLib.validateText("22", "6",Message );
		Mainframe_GlobalFunctionLib.pressKey("F7");
		Mainframe_GlobalFunctionLib.pressKey("F7");
		Mainframe_GlobalFunctionLib.sendText(4, 23 ,"8" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("PageDown");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
		CTSchedule_Validate(CTSchedule);
		Mainframe_GlobalFunctionLib.pressKey("F9");
		NDClist_Validate(NDCList1);
		ContTherpy_Validate(ContTherpy);
		ContStatus_Validate(ContStatus);
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
		FunctionalLibrary.navigateToRxClaimPlanAdministrator();
	}
	
	@Given("^I create the GPIlist with GPIId and CT Schedule mapping \"([^\"]*)\", \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",$")
	public void i_create_the_GPIlist_with_GPIId_and_CT_Schedule_mapping(String GPIList1, String GPIDecs1, String GPIPDID1, String NDGPFromdate, String GPIPDIDSts, String CTSFromdate, String CTSTodate, String CTSchedule) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions

	    // Write code here that turns the phrase above into concrete actions
	  	
		try {
			FunctionalLibrary.navigateToRxClaimPlanAdministrator();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try{
			Mainframe_GlobalFunctionLib.sendText(21, 7 ,"CCT600" );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(21, 7 ,"4" ); 
			Mainframe_GlobalFunctionLib.pressKey("Enter"); 
			Mainframe_GlobalFunctionLib.sendText(21, 7 ,"2" ); 
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(21, 7 ,"1" ); 
			Mainframe_GlobalFunctionLib.pressKey("Enter");

			if(!(FunctionalLibrary.func_SearchAndSelectADataEditMode("4,6" ,GPIList1 ,"11,6" , GPIList1)))
			{
				
				Mainframe_GlobalFunctionLib.pressKey("F6");
				Mainframe_GlobalFunctionLib.sendText(5, 18 ,GPIList1);
				Mainframe_GlobalFunctionLib.sendText(5, 30 ,GPIDecs1);
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(16, 64 ,"Y");
				Mainframe_GlobalFunctionLib.pressKey("F12");
				Mainframe_GlobalFunctionLib.sendText(21, 7 ,"1" );
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(4, 6 ,GPIList1);
				Mainframe_GlobalFunctionLib.pressKey("Enter");
						
				Mainframe_GlobalFunctionLib.sendText(11, 2 ,"7" );
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.pressKey("F6");
				Thread.sleep(2000);
				Mainframe_GlobalFunctionLib.pressKey("F17");
				Mainframe_GlobalFunctionLib.sendText(6, 4 ,GPIPDID1);
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(11, 2 ,"1" );
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(6, 57 ,"        " );
				Mainframe_GlobalFunctionLib.sendText(6, 57 ,NDGPFromdate );
				Mainframe_GlobalFunctionLib.sendText(6, 78 ,GPIPDIDSts );
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());	
				// Adding CT Schedule to NDC Product id
				Mainframe_GlobalFunctionLib.pressKey("F15");
				Thread.sleep(2000);
				Mainframe_GlobalFunctionLib.pressKey("F6");
				
				Mainframe_GlobalFunctionLib.sendText(9, 25 ,CTSFromdate );
				Mainframe_GlobalFunctionLib.sendText(10, 25 ,CTSTodate );
				Mainframe_GlobalFunctionLib.click(13, 25 );
				Mainframe_GlobalFunctionLib.pressKey("F4");
				Mainframe_GlobalFunctionLib.sendText(4, 5 ,CTSchedule);
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(9, 2 ,"1" );
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.click(14, 25 );
				Mainframe_GlobalFunctionLib.pressKey("F4");
				Mainframe_GlobalFunctionLib.sendText(7, 4 ,"G");
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(13, 3 ,"X" );
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());	
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());	
			
															
				FunctionalLibrary.navigateToRxClaimPlanAdministrator();
			}
	
			else{
				Mainframe_GlobalFunctionLib.pressKey("F12");
				System.out.println("GPIList with GPI drug and CT schedule exists");
				Reporter.addStepLog("GPIList with GPI drug and CT schedule exists");
				FunctionalLibrary.navigateToRxClaimPlanAdministrator();
			}
							
			
				if(FunctionalLibrary.ScreenshotOption.equalsIgnoreCase("Always")){
					Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
					}
			
			}catch(Exception e)
			{	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				Assert.fail("GPIList with GPI drug and CT schedule is not set successfully.Screenshot is captured");
			}		
		                                                     
	}
	@Given("^I create NDCGPI OR Edit List for GPI with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_create_NDCGPI_OR_Edit_List_for_GPI_with(String NDCGPIORList2, String NDCGPIORListDesc2, String GPIPDID1, String NDGPFromdate, String NDGPTodate, String ContingentTherapy) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions

	    // Write code here that turns the phrase above into concrete actions
		
		try {
			FunctionalLibrary.navigateToRxClaimPlanAdministrator();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try{
			Mainframe_GlobalFunctionLib.sendText(21, 7 ,"CCT600" );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(21, 7 ,"9" );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(21, 7 ,"6" );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(21, 7 ,"90" );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			if(!(FunctionalLibrary.func_SearchAndSelectADataEditMode("4,5" ,NDCGPIORList2 ,"10,5" , NDCGPIORList2)))
			{
				Mainframe_GlobalFunctionLib.pressKey("F6");
				Mainframe_GlobalFunctionLib.sendText(13, 18 ,NDCGPIORList2);
				Mainframe_GlobalFunctionLib.sendText(14, 18, NDCGPIORListDesc2);
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.pressKey("F12");
				Mainframe_GlobalFunctionLib.sendText(21, 7 ,"90" );
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(4, 5 ,NDCGPIORList2);
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(10, 2 ,"7" );
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.pressKey("F6");
				Mainframe_GlobalFunctionLib.click(6, 8 );
				Mainframe_GlobalFunctionLib.pressKey("F4");
				Thread.sleep(2000);
				Mainframe_GlobalFunctionLib.pressKey("F18");
				Mainframe_GlobalFunctionLib.sendText(4, 4 ,GPIPDID1);
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(9, 2 ,"1" );
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(9, 12 ,NDGPFromdate);
				Mainframe_GlobalFunctionLib.sendText(9, 34 ,NDGPTodate);
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(20, 47 ,ContingentTherapy );
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				Mainframe_GlobalFunctionLib.pressKey("F12");
								
				FunctionalLibrary.navigateToRxClaimPlanAdministrator();
			}
	
			else{
				Mainframe_GlobalFunctionLib.pressKey("F12");
				System.out.println("Medicaid NDC GPI OR List exists");
				Reporter.addStepLog("Medicaid NDC GPI OR List exists");
				FunctionalLibrary.navigateToRxClaimPlanAdministrator();
			}
							
			
				if(FunctionalLibrary.ScreenshotOption.equalsIgnoreCase("Always")){
					Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
					}
			
			}catch(Exception e)
			{	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				Assert.fail("Medicaid NDC GPI OR List is not set successfully.Screenshot is captured");
			}											
	}
	@Given("^I add GPIlist to the plan with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_add_GPIlist_to_the_plan_with(String PlanCode, String GPIList1, String gpisq, String gpifromdate, String gpithrudate) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions

	    // Write code here that turns the phrase above into concrete actions
			
		try {
			FunctionalLibrary.navigateToRxClaimPlanAdministrator();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try{
			Mainframe_GlobalFunctionLib.sendText(21, 7 ,"CCT600" );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(21, 7 ,"4" );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(21, 7 ,"1" );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(4, 5 ,PlanCode);
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(11, 2 ,"2" );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(7, 24 ,"Y" );
			Mainframe_GlobalFunctionLib.sendText(6, 51 ,"Y" );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(16, 64 ,"Y" );
			Mainframe_GlobalFunctionLib.pressKey("F7");
			Mainframe_GlobalFunctionLib.sendText(7, 21 ,"11" );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
						
			
			if(!(FunctionalLibrary.func_SearchAndSelectADataEditMode("7,8" ,GPIList1 ,"11,8" , GPIList1)))
			{
								
				Mainframe_GlobalFunctionLib.pressKey("F6"); 
				Thread.sleep(3000);
				Mainframe_GlobalFunctionLib.sendText(4, 5 ,GPIList1);
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(9, 2 ,"1" );
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(13, 17 ,"   "); 
				Mainframe_GlobalFunctionLib.sendText(13, 17, gpisq); 
				Mainframe_GlobalFunctionLib.sendText(14, 17 ,"        "); 
				Mainframe_GlobalFunctionLib.sendText(14, 17, gpifromdate); 
				Mainframe_GlobalFunctionLib.sendText(14, 41 ,"        "); 
				Mainframe_GlobalFunctionLib.sendText(14, 41, gpithrudate); 
				Mainframe_GlobalFunctionLib.pressKey("Enter"); 
				Mainframe_GlobalFunctionLib.sendText(16, 64 ,"Y" ); 	
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				Mainframe_GlobalFunctionLib.pressKey("F12");
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				FunctionalLibrary.navigateToRxClaimPlanAdministrator();
			}
	
			else{
				Mainframe_GlobalFunctionLib.pressKey("F12");
				System.out.println("GPIlist setup in plan exists");
				Reporter.addStepLog("GPIlist setup in plan exists");
				FunctionalLibrary.navigateToRxClaimPlanAdministrator();
			}
							
			
				if(FunctionalLibrary.ScreenshotOption.equalsIgnoreCase("Always")){
					Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
					}
			
			}catch(Exception e)
			{	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				Assert.fail("GPIlist setup in plan is not set successfully.Screenshot is captured");
			}
					
		}
	@Then("^I validate the claim details for CT schedule drug with \"([^\"]*)\",\"([^\"]*)\"$")
	public void i_validate_the_claim_details_for_CT_schedule_drug_with(String ClaimStatus, String GPIlist1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.validateText("21", "6",ClaimStatus );
		Mainframe_GlobalFunctionLib.pressKey("F7");
		Mainframe_GlobalFunctionLib.pressKey("F7");
		Mainframe_GlobalFunctionLib.sendText(4, 23 ,"8" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F9");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
		String getGPIlist = Mainframe_GlobalFunctionLib.getText(11, 33).trim();
		int lengetGPIlist = getGPIlist.length();
				if(lengetGPIlist==0)
				{
					Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
					System.out.println("GPIlist not appearing as contigent therapy drugid is used and it is as expected ");
					Reporter.addStepLog("GPIlist not appearing as contigent therapy drugid is used and it is as expected");
				} 
				else 
				{ 
					System.out.println("GPIlist is appearing which is not expected ");
					Assert.fail("GPIlist is appearing which is not expected"); 
				}
				Mainframe_GlobalFunctionLib.pressKey("F12");
				Mainframe_GlobalFunctionLib.pressKey("F12");
				Mainframe_GlobalFunctionLib.pressKey("F12");
				Mainframe_GlobalFunctionLib.pressKey("F12");

	}
	
	@Then("^I validate the resubmitted Claim details for GPIlist drug with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_validate_the_resubmitted_Claim_details_for_GPIlist_drug_with(String ClaimStatus2, String RejCode, String Message, String GPIList1, String ContTherpy) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.validateText("21", "6",ClaimStatus2 );
		Mainframe_GlobalFunctionLib.validateText("21", "12",RejCode );
		Mainframe_GlobalFunctionLib.validateText("22", "6",Message );
		Mainframe_GlobalFunctionLib.pressKey("F7");
		Mainframe_GlobalFunctionLib.pressKey("F7");
		Mainframe_GlobalFunctionLib.sendText(4, 23 ,"8" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F9");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
		GPIlist_Validate(GPIList1);
		ContTherpy_Validate(ContTherpy);				
		String getContStatus = Mainframe_GlobalFunctionLib.getText(11, 79).trim();
				int lengetContStatus = getContStatus.length();
						if(lengetContStatus==0)
						{
							Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
							System.out.println("No status appearing under Cont Status and it is as expected ");
							Reporter.addStepLog("No status appearing under Cont Status and it is as expected");
						} 
						else 
						{ 
							System.out.println("Unknown status appearing under Cont Status which is not as expected ");
							Assert.fail("Unknown status appearing under Cont Status which is not as expected "); 
						}
						
						FunctionalLibrary.navigateToRxClaimPlanAdministrator();
	}
	@Then("^I validate the Claim for GPIlist drug and CT is N with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_validate_the_Claim_for_GPIlist_drug_and_CT_is_N_with(String ClaimStatus2, String RejCode, String Message, String CTSchedule, String GPIList1, String ContTherpy, String ContStatus) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.validateText("21", "6",ClaimStatus2 );
		Mainframe_GlobalFunctionLib.validateText("21", "12",RejCode );
		Mainframe_GlobalFunctionLib.validateText("22", "6",Message );
		Mainframe_GlobalFunctionLib.pressKey("F7");
		Mainframe_GlobalFunctionLib.pressKey("F7");
		Mainframe_GlobalFunctionLib.sendText(4, 23 ,"8" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("PageDown");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
		CTSchedule_Validate(CTSchedule);
		Mainframe_GlobalFunctionLib.pressKey("F9");
		GPIlist_Validate(GPIList1);
		ContTherpy_Validate(ContTherpy);
		ContStatus_Validate(ContStatus);
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		FunctionalLibrary.navigateToRxClaimPlanAdministrator();
	}
	
	@Then("^I validate the Claim for GPIlist drug and CT is empty with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_validate_the_Claim_for_GPIlist_drug_and_CT_is_empty_with(String ClaimStatus2, String RejCode, String Message, String CTSchedule, String GPIList1, String ContTherpy, String ContStatus) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.validateText("21", "6",ClaimStatus2 );
		Mainframe_GlobalFunctionLib.validateText("21", "12",RejCode );
		Mainframe_GlobalFunctionLib.validateText("22", "6",Message );
		Mainframe_GlobalFunctionLib.pressKey("F7");
		Mainframe_GlobalFunctionLib.pressKey("F7");
		Mainframe_GlobalFunctionLib.sendText(4, 23 ,"8" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("PageDown");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
		CTSchedule_Validate(CTSchedule);
		Mainframe_GlobalFunctionLib.pressKey("F9");
		GPIlist_Validate(GPIList1);
		ContTherpy_Validate(ContTherpy);
		ContStatus_Validate(ContStatus);
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		FunctionalLibrary.navigateToRxClaimPlanAdministrator();
	}
	
	@Then("^I validate the GPI Claim for PA member with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_validate_the_GPI_Claim_for_PA_member_with(String ClaimStatus, String Message, String PANumber, String CTSchedule, String GPIList1, String ContTherpy, String ContStatus) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.validateText("21", "6",ClaimStatus );
		Mainframe_GlobalFunctionLib.validateText("22", "6",Message );
		Mainframe_GlobalFunctionLib.pressKey("F7");
		Mainframe_GlobalFunctionLib.pressKey("F7");
		Mainframe_GlobalFunctionLib.sendText(4, 23 ,"8" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		PANumber_ClaimValidate(PANumber);
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("PageDown");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
		CTSchedule_Validate(CTSchedule);
		Mainframe_GlobalFunctionLib.pressKey("F9");
		GPIlist_Validate(GPIList1);
		ContTherpy_Validate(ContTherpy);
		ContStatus_Validate(ContStatus);
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
		FunctionalLibrary.navigateToRxClaimPlanAdministrator();
	}
	
	@Then("^I validate the GPI Claim for CT with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_validate_the_GPI_Claim_for_CT_with(String ClaimStatus2, String Message, String CTSchedule, String GPIList1, String ContTherpy, String ContStatus) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.validateText("21", "6",ClaimStatus2 );
		Mainframe_GlobalFunctionLib.validateText("22", "6",Message );
		Mainframe_GlobalFunctionLib.pressKey("F7");
		Mainframe_GlobalFunctionLib.pressKey("F7");
		Mainframe_GlobalFunctionLib.sendText(4, 23 ,"8" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("PageDown");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
		CTSchedule_Validate(CTSchedule);
		Mainframe_GlobalFunctionLib.pressKey("F9");
		GPIlist_Validate(GPIList1);
		ContTherpy_Validate(ContTherpy);
		ContStatus_Validate(ContStatus);
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		FunctionalLibrary.navigateToRxClaimPlanAdministrator();
	}
	
	@Then("^I validate the resubmitted second GPI Claim details with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_validate_the_resubmitted_second_GPI_Claim_details_with(String ClaimStatus, String Message1, String Message2, String Message3, String CTSchedule, String GPIList1, String ContTherpy, String ContStatus, String MedicareTBSchedule) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.validateText("21", "6",ClaimStatus );
		Mainframe_GlobalFunctionLib.validateText("22", "6",Message1 );
		Mainframe_GlobalFunctionLib.pressKey("F7");
		Mainframe_GlobalFunctionLib.pressKey("F7");
		Mainframe_GlobalFunctionLib.sendText(4, 23 ,"6");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F9");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.validateText("7", "18",Message1 );		
		Mainframe_GlobalFunctionLib.validateText("8", "18",Message2 );		
   	    Mainframe_GlobalFunctionLib.validateText("9", "18",Message3 );
   	    Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.sendText(4, 23 ,"8" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("PageDown");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
		
		String getCTSched = Mainframe_GlobalFunctionLib.getText(10, 22).trim();
		
		if(getCTSched.equals(CTSchedule))
		{
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
			System.out.println("Contingent Therapy schedule appearing and it is as expected: "+getCTSched);
			Reporter.addStepLog("Contingent Therapy schedule appearing and it is as expected: "+getCTSched);
		} 
		else 
		{ 
			System.out.println("Contingent Therapy schedule not appearing which is not as expected ");
			Assert.fail("Contingent Therapy schedule not appearing which is not as expected"); 
		}
		
		Mainframe_GlobalFunctionLib.pressKey("F9");
		GPIlist_Validate(GPIList1);
		ContTherpy_Validate(ContTherpy);
		ContStatus_Validate(ContStatus);
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F7");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
		TBSchedule_Validate(MedicareTBSchedule);
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");

	}
	
	@Then("^I validate the resubmitted above GPI Claim with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_validate_the_resubmitted_above_GPI_Claim_with(String ClaimStatus2, String RejCode, String Message1, String CTSchedule, String GPIList1, String ContTherpy, String ContStatus) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.validateText("21", "6",ClaimStatus2 );
		Mainframe_GlobalFunctionLib.validateText("21", "12",RejCode );
		Mainframe_GlobalFunctionLib.validateText("22", "6",Message1 );
		Mainframe_GlobalFunctionLib.pressKey("F7");
		Mainframe_GlobalFunctionLib.pressKey("F7");
		Mainframe_GlobalFunctionLib.sendText(4, 23 ,"8" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("PageDown");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
		CTSchedule_Validate(CTSchedule);
		Mainframe_GlobalFunctionLib.pressKey("F9");
		GPIlist_Validate(GPIList1);
		ContTherpy_Validate(ContTherpy);
		ContStatus_Validate(ContStatus);
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F7");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
		String getMedicareTBSchedule = Mainframe_GlobalFunctionLib.getText(9, 17).trim();
		int lengetTBSchedule = getMedicareTBSchedule.length();
				if(lengetTBSchedule==0)
				{
					Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
					System.out.println("No TB override schedule stamping appearing  and it is as expected ");
					Reporter.addStepLog("No TB override schedule stamping appearing  and it is as expected ");
				} 
				else 
				{ 
					System.out.println("TB override schedule stamping appearing which is not as expected ");
					Assert.fail("TB override schedule stamping appearing which is not as expected "); 
				}
				FunctionalLibrary.navigateToRxClaimPlanAdministrator();
	}
	
	@Given("^I submit a claimone with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_submit_a_claimone_with(String BIN, String proc, String group, String pharmacyID, String rxNbr, String refill, String fillDate, String memberID, String productID, String dspQty, String ds, String psc, String cost, String fee, String ucw) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
		try { 
			FunctionalLibrary.navigateToRxClaimPlanAdministrator(); 
		} catch (Exception e) { 
			e.printStackTrace(); 
		} 
		
		Mainframe_GlobalFunctionLib.sendText(21, 7 ,"3" ); 
		Mainframe_GlobalFunctionLib.pressKey("Enter"); 
		Mainframe_GlobalFunctionLib.sendText(21, 7 ,"2" ); 
		Mainframe_GlobalFunctionLib.pressKey("Enter"); 
		Mainframe_GlobalFunctionLib.sendText(21, 7 ,"1" ); 
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("F6"); 
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.sendText(11, 14,BIN ); 
		Mainframe_GlobalFunctionLib.sendText(11, 41,proc ); 
		Mainframe_GlobalFunctionLib.sendText(11, 59,group ); 
		Mainframe_GlobalFunctionLib.sendText(12, 14,pharmacyID ); 
		Mainframe_GlobalFunctionLib.sendText(12, 41,FunctionalLibrary.func_GenerateDynamicRxNo()); 
		Mainframe_GlobalFunctionLib.sendText(12, 59,refill ); 
		Mainframe_GlobalFunctionLib.sendText(14, 41,memberID ); 
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("Enter"); 
	
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			Mainframe_GlobalFunctionLib.sendText(4 , 65 ,"          "); 
			Mainframe_GlobalFunctionLib.sendText(4, 65, fillDate);			 
			Mainframe_GlobalFunctionLib.click(7, 12 ); 
			Mainframe_GlobalFunctionLib.sendText(7, 12, memberID); 
			Mainframe_GlobalFunctionLib.pressKey("F4"); 
			Mainframe_GlobalFunctionLib.sendText(3, 4, memberID); 
			Mainframe_GlobalFunctionLib.pressKey("Enter");          
			Mainframe_GlobalFunctionLib.sendText(8, 2,"1" ); 
			Mainframe_GlobalFunctionLib.pressKey("Enter"); 
			Mainframe_GlobalFunctionLib.sendText(11, 20,productID ); 
			Mainframe_GlobalFunctionLib.sendText(12, 11,"           " ); 
			Mainframe_GlobalFunctionLib.sendText(12, 11,dspQty ); 
			Mainframe_GlobalFunctionLib.sendText(12, 26,"   " ); 
			Mainframe_GlobalFunctionLib.sendText(12, 26,ds); 
			Mainframe_GlobalFunctionLib.sendText(14, 6,psc ); 
		 
			Mainframe_GlobalFunctionLib.sendText(10, 47,"         " ); 
			Mainframe_GlobalFunctionLib.sendText(10, 47,cost); 
			Mainframe_GlobalFunctionLib.sendText(11, 47,"         " );
			Mainframe_GlobalFunctionLib.sendText(11, 47,fee );
			Mainframe_GlobalFunctionLib.sendText(20, 47,"         " ); 
			Mainframe_GlobalFunctionLib.sendText(20, 47,ucw ); 


			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			Mainframe_GlobalFunctionLib.pressKey("PageDown");
			Mainframe_GlobalFunctionLib.sendText(4, 55,"1" );
			Mainframe_GlobalFunctionLib.pressKey("PageUp");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			Mainframe_GlobalFunctionLib.pressKey("F18");
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	}
	
	@Given("^I submit a manual claim Fsix with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_submit_a_manual_claim_Fsix_with(String BIN, String proc, String group, String pharmacyID, String rxNbr, String refill, String fillDate, String memberID, String productID, String dspQty, String ds, String psc, String cost, String fee, String ucw) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	 
		try { 
			FunctionalLibrary.navigateToRxClaimPlanAdministrator(); 
		} catch (Exception e) { 
			e.printStackTrace(); 
		} 
		
		Mainframe_GlobalFunctionLib.sendText(21, 7 ,"3" ); 
		Mainframe_GlobalFunctionLib.pressKey("Enter"); 
		Mainframe_GlobalFunctionLib.sendText(21, 7 ,"2" ); 
		Mainframe_GlobalFunctionLib.pressKey("Enter"); 
		Mainframe_GlobalFunctionLib.sendText(21, 7 ,"1" ); 
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("F6"); 
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.sendText(11, 14,BIN ); 
		Mainframe_GlobalFunctionLib.sendText(11, 41,proc ); 
		Mainframe_GlobalFunctionLib.sendText(11, 59,group ); 
		Mainframe_GlobalFunctionLib.sendText(12, 14,pharmacyID ); 
		Mainframe_GlobalFunctionLib.sendText(12, 41,FunctionalLibrary.func_GenerateDynamicRxNo()); 
		Mainframe_GlobalFunctionLib.sendText(12, 59,refill ); 
		Mainframe_GlobalFunctionLib.sendText(14, 41,memberID ); 
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("Enter"); 
	
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			Mainframe_GlobalFunctionLib.sendText(4 , 65 ,"          "); 
			Mainframe_GlobalFunctionLib.sendText(4, 65, fillDate);			 
			Mainframe_GlobalFunctionLib.click(7, 12 ); 
			Mainframe_GlobalFunctionLib.sendText(7, 12, memberID); 
			Mainframe_GlobalFunctionLib.pressKey("F4"); 
			Mainframe_GlobalFunctionLib.sendText(3, 4, memberID); 
			Mainframe_GlobalFunctionLib.pressKey("Enter");          
			Mainframe_GlobalFunctionLib.sendText(8, 2,"1" ); 
			Mainframe_GlobalFunctionLib.pressKey("Enter"); 
			Mainframe_GlobalFunctionLib.sendText(11, 20,productID ); 
			Mainframe_GlobalFunctionLib.sendText(12, 11,"           " ); 
			Mainframe_GlobalFunctionLib.sendText(12, 11,dspQty ); 
			Mainframe_GlobalFunctionLib.sendText(12, 26,"   " ); 
			Mainframe_GlobalFunctionLib.sendText(12, 26,ds); 
			Mainframe_GlobalFunctionLib.sendText(14, 6,psc ); 		 
			Mainframe_GlobalFunctionLib.sendText(10, 47,"         " ); 
			Mainframe_GlobalFunctionLib.sendText(10, 47,cost); 
			Mainframe_GlobalFunctionLib.sendText(11, 47,"         " );
			Mainframe_GlobalFunctionLib.sendText(11, 47,fee );
			Mainframe_GlobalFunctionLib.sendText(20, 47,"         " ); 
			Mainframe_GlobalFunctionLib.sendText(20, 47,ucw ); 
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			Mainframe_GlobalFunctionLib.pressKey("F6");
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	}

	@Then("^I resubmit the manual claim with Fsix \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_resubmit_the_manual_claim_with_Fsix(String RxNo, String FillDate2, String ProductID2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
			Mainframe_GlobalFunctionLib.sendText(5,29, FunctionalLibrary.func_GenerateDynamicRxNo());
			Mainframe_GlobalFunctionLib.sendText(4, 65 ,"          ");
			Mainframe_GlobalFunctionLib.sendText(4, 65 ,FillDate2);
			Mainframe_GlobalFunctionLib.sendText(11, 20 ,"                ");
			Mainframe_GlobalFunctionLib.sendText(11, 20 ,ProductID2);
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			Mainframe_GlobalFunctionLib.pressKey("F6");
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	}
	
	@Given("^I update the ContingentTherapy to Y in NDCGPI OR Edit List screen for NDC with \"([^\"]*)\",\"([^\"]*)\"$")
	public void i_update_the_ContingentTherapy_to_Y_in_NDCGPI_OR_Edit_List_screen_for_NDC_with(String NDCGPIORList1, String ContingentTherapy ) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
		try {
			FunctionalLibrary.navigateToRxClaimPlanAdministrator();
		} catch (Exception e) {
			e.printStackTrace();
		}

		try{
			Mainframe_GlobalFunctionLib.sendText(21, 7 ,"CCT600" );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(21, 7 ,"9" );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(21, 7 ,"6" );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(21, 7 ,"90" );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(4, 5 ,NDCGPIORList1);
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			String getNDCGPIORList1 = Mainframe_GlobalFunctionLib.getText(10, 5).trim();
			if(getNDCGPIORList1.equals(NDCGPIORList1))
			{
				Mainframe_GlobalFunctionLib.sendText(10, 2 ,"7" );
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(12, 2 ,"2" );
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
					if(ContingentTherapy.length()!=0) 
					    { Mainframe_GlobalFunctionLib.sendText(20, 47 ,ContingentTherapy );}
					else{ Mainframe_GlobalFunctionLib.sendText(20, 47 ," " ); }
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				Mainframe_GlobalFunctionLib.pressKey("F12");
								
				FunctionalLibrary.navigateToRxClaimPlanAdministrator();
			}
	
			else{
				
				System.out.println("NDCGPIORLIST not found");
				Assert.fail("NDCGPIORLIST not found");
				FunctionalLibrary.navigateToRxClaimPlanAdministrator();
			}
							
			
				if(FunctionalLibrary.ScreenshotOption.equalsIgnoreCase("Always")){
					Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
					}
			
			}catch(Exception e)
			{	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				Assert.fail("Updating CT in Medicaid NDC GPI OR List is not set successfully.Screenshot is captured");
			}

	}
	
	@When("^I create message for the DUR table \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_create_message_for_the_DUR_table(String DUPRXMessageCode, String DUPRXMessageDesc, String FromDate, String ThruDate) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		DURTABLE_Messagecreation(DUPRXMessageCode, DUPRXMessageDesc, FromDate, ThruDate );
	}
	
	@When("^I create DUR table with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_create_DUR_table_with(String DURTable, String DURTableDesc, String DURTableStatus, String DurServiceType, String DurServiceTypeSts, String DurServiceTypePriority, String DurServiceTypeResponse, String FillDateMessage, String DUPRXMessageCode, String DUPRXMessageType, String DUPRXTherapPerc, String DurServiceType2, String DurServiceTypeSts2, String DurServiceTypePriority2, String DurServiceTypeResponse2 ) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		DURTABLE_Creation(DURTable, DURTableDesc, DURTableStatus, DurServiceType, DurServiceTypeSts, DurServiceTypePriority, DurServiceTypeResponse, FillDateMessage, DUPRXMessageCode, DUPRXMessageType, DUPRXTherapPerc, DurServiceType2, DurServiceTypeSts2, DurServiceTypePriority2, DurServiceTypeResponse2 );
	}
	@Then("^I validate the DUR table \"([^\"]*)\"$")
	public void i_validate_the_DUR_table(String DURTable) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.validateText("5" ,"13" , DURTable );
	}
	@Then("^I valide the message \"([^\"]*)\"$")
	public void i_valide_the_message(String DUPRXMessageCode) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.validateText("10" ,"4" , DUPRXMessageCode );
	}
	
	@When("^I create NDCGPI OR Edit List for DUR with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_create_NDCGPI_OR_Edit_List_for_DUR_with(String NDCGPIORList1, String NDCGPIORListDesc1, String NDCPDID1, String GPIPDID1, String NDGPFromdate, String NDGPTodate, String DURTable, String DURflag) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		NDCGPIORlist_CreatewithDrug(NDCGPIORList1, NDCGPIORListDesc1, NDCPDID1, GPIPDID1, NDGPFromdate, NDGPTodate, DURTable, DURflag);
	}
	
	@Then("^I navigate to the plan admin menu$")
	public void i_navigate_to_the_plan_admin_menu() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		FunctionalLibrary.navigateToRxClaimPlanAdministrator();
	}
	
	@When("^I add more drugs to NDC GPI OR list with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_add_more_drugs_to_NDC_GPI_OR_list_with(String NDCGPIORList1, String NDCPDID1, String GPIPDID1, String NDGPFromdate, String NDGPTodate, String DURTable, String DURflag) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		NDCGPIORlist_AddMoreDrug(NDCGPIORList1, NDCPDID1, GPIPDID1, NDGPFromdate, NDGPTodate, DURTable, DURflag);
	}
	
	@Given("^I create the NDClist with NDCId mapping \"([^\"]*)\", \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",$")
	public void i_create_the_NDClist_with_NDCId_mapping(String NDCList1, String NDCDecs1, String NDCPDID1, String NDGPFromdate, String NDCPDIDSts, String CTSFromdate, String CTSTodate, String CTSchedule) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		NDCLIST_NDCID(NDCList1, NDCDecs1, NDCPDID1, NDGPFromdate, NDCPDIDSts, CTSFromdate, CTSTodate, CTSchedule );
	}
	@Given("^I add the new plan to the DUR member with \"([^\"]*)\",\"([^\"]*)\"$")
	public void i_add_the_new_plan_to_the_DUR_member_with(String MemberID, String Overrideplan) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		try {
			FunctionalLibrary.navigateToRxClaimPlanAdministrator();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try{
		Mainframe_GlobalFunctionLib.sendText(21, 7 ,"1" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(21, 7 ,"2" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(4, 4 ,MemberID);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(10, 2 ,"2");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F7"); 
		Thread.sleep(3000);
		Mainframe_GlobalFunctionLib.sendText(15, 2 ,"2");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.click(12, 14 );
		Mainframe_GlobalFunctionLib.pressKey("F4");
		
		Mainframe_GlobalFunctionLib.sendText(4, 5 ,Overrideplan);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(10, 2 ,"1");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		FunctionalLibrary.navigateToRxClaimPlanAdministrator();
		
		}catch(Exception e)
		{	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			Assert.fail("Adding override plan to member is not set successfully.Screenshot is captured");
		}

	}
	
	@Given("^I add DUR to the Plan \"([^\"]*)\",\"([^\"]*)\"$")
	public void i_add_DUR_to_the_Plan(String PlanCode, String DURTable) throws Throwable {
	 	    
		DURTable_Addingtoplan(PlanCode,DURTable);	
	}
		
	@Given("^I submit a DUR claimone with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",$")
	public void i_submit_a_DUR_claimone_with(String BIN, String proc, String group, String pharmacyID, String rxNbr, String refill, String fillDate, String memberID, String productID1, String dspQty, String ds, String psc ) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
		try { 
			FunctionalLibrary.navigateToRxClaimPlanAdministrator(); 
		} catch (Exception e) { 
			e.printStackTrace(); 
		} 
		
		try{
		Mainframe_GlobalFunctionLib.sendText(21, 7 ,"3" ); 
		Mainframe_GlobalFunctionLib.pressKey("Enter"); 
		Mainframe_GlobalFunctionLib.sendText(21, 7 ,"2" ); 
		Mainframe_GlobalFunctionLib.pressKey("Enter"); 
		Mainframe_GlobalFunctionLib.sendText(21, 7 ,"1" ); 
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("F6"); 
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.sendText(11, 14,BIN ); 
		Mainframe_GlobalFunctionLib.sendText(11, 41,proc ); 
		Mainframe_GlobalFunctionLib.sendText(11, 59,group ); 
		Mainframe_GlobalFunctionLib.sendText(12, 14,pharmacyID ); 
		Mainframe_GlobalFunctionLib.sendText(12, 41,FunctionalLibrary.func_GenerateDynamicRxNo()); 
		Mainframe_GlobalFunctionLib.sendText(12, 59,refill ); 
		Mainframe_GlobalFunctionLib.sendText(14, 41,memberID ); 
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("Enter"); 
	
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			Mainframe_GlobalFunctionLib.sendText(4 , 65 ,"          "); 
			Mainframe_GlobalFunctionLib.sendText(4, 65, fillDate);			 
			Mainframe_GlobalFunctionLib.click(7, 12 ); 
			Mainframe_GlobalFunctionLib.sendText(7, 12, memberID); 
			Mainframe_GlobalFunctionLib.pressKey("F4"); 
			Mainframe_GlobalFunctionLib.sendText(3, 4, memberID); 
			Mainframe_GlobalFunctionLib.pressKey("Enter");          
			Mainframe_GlobalFunctionLib.sendText(8, 2,"1" ); 
			Mainframe_GlobalFunctionLib.pressKey("Enter"); 
			Mainframe_GlobalFunctionLib.sendText(11, 20,productID1 ); 
			Mainframe_GlobalFunctionLib.sendText(12, 11,"           " ); 
			Mainframe_GlobalFunctionLib.sendText(12, 11,dspQty ); 
			Mainframe_GlobalFunctionLib.sendText(12, 26,"   " ); 
			Mainframe_GlobalFunctionLib.sendText(12, 26,ds); 
			Mainframe_GlobalFunctionLib.sendText(14, 6,psc ); 
		 
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			Mainframe_GlobalFunctionLib.pressKey("PageDown");
			Mainframe_GlobalFunctionLib.sendText(4, 55,"1" );
			Mainframe_GlobalFunctionLib.pressKey("PageUp");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			Mainframe_GlobalFunctionLib.pressKey("F18");
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			
		}catch(Exception e)
		{	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			Assert.fail("Claim transaction is not successfully.Screenshot is captured");
		}
	}
	
	@Then("^I validate the claim status with \"([^\"]*)\"$")
	public void i_validate_the_claim_status_with(String ClaimStatus) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		PreviousRxclaimnum=Mainframe_GlobalFunctionLib.getText(20, 12);
		System.out.println("Claim Number: "+PreviousRxclaimnum);
		Reporter.addStepLog("Claim Number: "+PreviousRxclaimnum);
		Mainframe_GlobalFunctionLib.validateText("21", "6",ClaimStatus );
		String ClmSts = Mainframe_GlobalFunctionLib.getText(21, 6);
		System.out.println("Claim Status: "+ClmSts);
		Reporter.addStepLog("Claim Status: "+ClmSts);
		Mainframe_GlobalFunctionLib.pressKey("F7");
		Mainframe_GlobalFunctionLib.pressKey("F7");
		Mainframe_GlobalFunctionLib.sendText(4, 23 ,"8" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F7");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
		String getMedicareTBSchedule = Mainframe_GlobalFunctionLib.getText(9, 17).trim();
		int lengetTBSchedule = getMedicareTBSchedule.length();
				if(lengetTBSchedule==0)
				{
					Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
					System.out.println("No TB override schedule stamping appearing  and it is as expected ");
					Reporter.addStepLog("No TB override schedule stamping appearing  and it is as expected ");
				} 
				else 
				{ 
					System.out.println("TB override schedule stamping appearing which is not as expected ");
					Assert.fail("TB override schedule stamping appearing which is not as expected "); 
				}
				FunctionalLibrary.navigateToRxClaimPlanAdministrator();
	}
	
	@Then("^I validate the DUR Claim details with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_validate_the_DUR_Claim_details_with(String ClaimStatus, String RejCode, String DURTable, String DurServiceType2, String DurServiceType) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.validateText("21", "6",ClaimStatus );
		Mainframe_GlobalFunctionLib.validateText("21", "12",RejCode );
		String CurrentRxclaimnum=Mainframe_GlobalFunctionLib.getText(20, 12);
		System.out.println("Current Claim Number: "+CurrentRxclaimnum);
		Reporter.addStepLog("Current Claim Number: "+CurrentRxclaimnum);
		String ClmSts = Mainframe_GlobalFunctionLib.getText(21, 6);
		System.out.println("Claim Status: "+ClmSts);
		Reporter.addStepLog("Claim Status: "+ClmSts);
		String ClmRejCode = Mainframe_GlobalFunctionLib.getText(21, 12);
		System.out.println("Claim Reject Code: "+ClmRejCode);
		Reporter.addStepLog("Claim Reject Code: "+ClmRejCode);
		
		Mainframe_GlobalFunctionLib.pressKey("F7");
		Mainframe_GlobalFunctionLib.pressKey("F7");
		Mainframe_GlobalFunctionLib.sendText(4, 23 ,"5" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
		Mainframe_GlobalFunctionLib.sendText(14, 2 ,"5" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Validate_DURTable_DurService_ConflictClaimNo(DURTable, DurServiceType2 );
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.sendText(15, 2 ,"5" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Validate_DURTable_DurService_ConflictClaimNo(DURTable, DurServiceType );
		
		FunctionalLibrary.navigateToRxClaimPlanAdministrator();
	}
	
	@Then("^I validate the DUR Claimone details with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_validate_the_DUR_Claimone_details_with(String ClaimStatus2, String RejCode, String DURTable, String DurServiceType, String Message1, String Message2, String DURMessage) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.validateText("21", "6",ClaimStatus2 );
		Mainframe_GlobalFunctionLib.validateText("21", "12",RejCode );
		Mainframe_GlobalFunctionLib.validateText("22", "6",Message1 );
		String ClmSts = Mainframe_GlobalFunctionLib.getText(21, 6);
		System.out.println("Claim Status: "+ClmSts);
		Reporter.addStepLog("Claim Status: "+ClmSts);
		String ClmRejCode = Mainframe_GlobalFunctionLib.getText(21, 12);
		System.out.println("Claim Reject Code: "+ClmRejCode);
		Reporter.addStepLog("Claim Reject Code: "+ClmRejCode);
		String Clmmess1 = Mainframe_GlobalFunctionLib.getText(22, 6);
		System.out.println("Claim message1: "+Clmmess1);
		Reporter.addStepLog("Claim message1: "+Clmmess1);		
		Mainframe_GlobalFunctionLib.pressKey("F7");
		Mainframe_GlobalFunctionLib.pressKey("F7");
		Mainframe_GlobalFunctionLib.sendText(4, 23 ,"5" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
		Mainframe_GlobalFunctionLib.sendText(14, 2 ,"5" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Validate_DURTable_DurService_ConflictClaimNo(DURTable, DurServiceType );
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.sendText(4, 23 ,"7" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
		Mainframe_GlobalFunctionLib.validateText("16", "2",Message1 );
		if(Message2.length()!=0)
		{Mainframe_GlobalFunctionLib.validateText("17", "2",Message2 );}
		if(DURMessage.length()!=0)
		{Mainframe_GlobalFunctionLib.validateText("17", "47",DURMessage );}
		
	}
	
	@When("^I add DUR to the existing Plan \"([^\"]*)\",\"([^\"]*)\"$")
	public void i_add_DUR_to_the_existing_Plan(String PlanCode, String DURTable) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		DURTable_Addingtoplan(PlanCode,DURTable);
	}
	
	@When("^I update the DUR table in NDC GPI OR list \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_update_the_DUR_table_in_NDC_GPI_OR_list(String NDCGPIORList1, String NDCDrug, String DURTable, String DURflag) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
		
		try {
			FunctionalLibrary.navigateToRxClaimPlanAdministrator();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try{
			Mainframe_GlobalFunctionLib.sendText(21, 7 ,"CCT600" );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(21, 7 ,"9" );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(21, 7 ,"6" );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(21, 7 ,"90" );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(4, 5 ,NDCGPIORList1);
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			
			String getNDCGPIORList = Mainframe_GlobalFunctionLib.getText(10, 5);
			if(getNDCGPIORList.equals(NDCGPIORList1))
			{
			Mainframe_GlobalFunctionLib.sendText(10, 2 ,"7" );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
					
			label1:	for (int j = 13; j < 40; ++j) {
				
				 for (int i = 12; i < 20; ++i) {
				String SearDrug= Mainframe_GlobalFunctionLib.getText(i, 19).trim();
					
					if(SearDrug.contains(NDCDrug))
						{
							System.out.println("Drug is found: "+SearDrug);
							Mainframe_GlobalFunctionLib.sendText(i, 2 ,"2" );
							Mainframe_GlobalFunctionLib.pressKey("Enter");
							Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
									if(DURTable.length()!=0)
									{
										Mainframe_GlobalFunctionLib.sendText(19, 61 ,DURTable );
									}
									else
									{
										Mainframe_GlobalFunctionLib.sendText(19, 61 ,"        " );
									}
									
									if(DURflag.length()!=0){
										Mainframe_GlobalFunctionLib.sendText(19, 70 ,DURflag );
									}
									else
									{
										Mainframe_GlobalFunctionLib.sendText(19, 70 ," " );
									}
									Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
									Mainframe_GlobalFunctionLib.pressKey("Enter");
									Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
							break label1;
															
						}
					else
					{
					System.out.println("Drug not found : "+SearDrug);
				
					}
								
				}			
		}
			
			}
	
			else{
				Mainframe_GlobalFunctionLib.pressKey("F12");
				System.out.println("NDC GPI OR List is not exists");
				Reporter.addStepLog("NDC GPI OR List is not exists");
				FunctionalLibrary.navigateToRxClaimPlanAdministrator();
			}
							
			
				if(FunctionalLibrary.ScreenshotOption.equalsIgnoreCase("Always")){
					Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
					}
			
			}catch(Exception e)
			{	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				Assert.fail("Update to NDC GPI OR List is not set successfully.Screenshot is captured");
			}
			
	}
	
	@When("^I submit a DUR claim Fsix submit with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",$")
	public void i_submit_a_DUR_claim_Fsix_submit_with(String BIN, String proc, String group, String pharmacyID, String rxNbr, String refill, String fillDate, String memberID, String productID1, String dspQty, String ds, String psc) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		try { 
			FunctionalLibrary.navigateToRxClaimPlanAdministrator(); 
		} catch (Exception e) { 
			e.printStackTrace(); 
		} 
		
		try{
			Mainframe_GlobalFunctionLib.sendText(21, 7 ,"3" ); 
			Mainframe_GlobalFunctionLib.pressKey("Enter"); 
			Mainframe_GlobalFunctionLib.sendText(21, 7 ,"2" ); 
			Mainframe_GlobalFunctionLib.pressKey("Enter"); 
			Mainframe_GlobalFunctionLib.sendText(21, 7 ,"1" ); 
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			Mainframe_GlobalFunctionLib.pressKey("F6"); 
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			Mainframe_GlobalFunctionLib.sendText(11, 14,BIN ); 
			Mainframe_GlobalFunctionLib.sendText(11, 41,proc ); 
			Mainframe_GlobalFunctionLib.sendText(11, 59,group ); 
			Mainframe_GlobalFunctionLib.sendText(12, 14,pharmacyID ); 
			Mainframe_GlobalFunctionLib.sendText(12, 41,FunctionalLibrary.func_GenerateDynamicRxNo()); 
			Mainframe_GlobalFunctionLib.sendText(12, 59,refill ); 
			Mainframe_GlobalFunctionLib.sendText(14, 41,memberID ); 
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			Mainframe_GlobalFunctionLib.pressKey("Enter"); 	
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			Mainframe_GlobalFunctionLib.sendText(4 , 65 ,"          "); 
			Mainframe_GlobalFunctionLib.sendText(4, 65, fillDate);			 
			Mainframe_GlobalFunctionLib.click(7, 12 ); 
			Mainframe_GlobalFunctionLib.sendText(7, 12, memberID); 
			Mainframe_GlobalFunctionLib.pressKey("F4"); 
			Mainframe_GlobalFunctionLib.sendText(3, 4, memberID); 
			Mainframe_GlobalFunctionLib.pressKey("Enter");          
			Mainframe_GlobalFunctionLib.sendText(8, 2,"1" ); 
			Mainframe_GlobalFunctionLib.pressKey("Enter"); 
			Mainframe_GlobalFunctionLib.sendText(11, 20,productID1 ); 
			Mainframe_GlobalFunctionLib.sendText(12, 11,"           " ); 
			Mainframe_GlobalFunctionLib.sendText(12, 11,dspQty ); 
			Mainframe_GlobalFunctionLib.sendText(12, 26,"   " ); 
			Mainframe_GlobalFunctionLib.sendText(12, 26,ds); 
			Mainframe_GlobalFunctionLib.sendText(14, 6,psc ); 		 
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			Mainframe_GlobalFunctionLib.pressKey("F6");
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			
		}catch(Exception e)
		{	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			Assert.fail("Claim submit is not successfully.Screenshot is captured");
		}
	}
}	


