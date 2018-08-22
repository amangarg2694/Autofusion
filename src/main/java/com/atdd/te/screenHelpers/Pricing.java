package com.atdd.te.screenHelpers;

import java.io.IOException;
import java.sql.SQLException;
import java.util.StringTokenizer;

import org.testng.Assert;

import com.cucumber.listener.Reporter;
import com.hp.lft.report.ReportException;
import com.hp.lft.sdk.GeneralLeanFtException;
import com.optumrx.autofusion.core.te.util.Mainframe_GlobalFunctionLib;
import com.optumrx.autofusion.core.te.util.Screenshot;
import com.optumrx.autofusion.core.util.ReadPropertyFile;

public class Pricing extends CommonHelper{

	
	// Create Drug cost comparison schedule with Sequence
		public static void func_CreateOrMaintainDrugCostComparisonSchedule(String ccSchedule , String desc , String sequence , String source , String code , String ratePercent) throws Exception
		{
		System.out.println(ccSchedule );
		System.out.println(desc );
		System.out.println(sequence );
		System.out.println(source );
		System.out.println(code );
		System.out.println(ratePercent );
			
			try {
				String text = Mainframe_GlobalFunctionLib.getText(1, 13);				
				if(!(text.equalsIgnoreCase("RxClaim Price Schedule Maintenance"))){
				
				FunctionalLibrary.navigateToRxClaimPlanAdministrator();
				
				Mainframe_GlobalFunctionLib.sendText(21, 7 ,"5" );
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(21, 7 ,"1" );
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(21, 7 ,"4" );
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				}
				else{
					Mainframe_GlobalFunctionLib.sendText(21, 7 ,"4" );
					Mainframe_GlobalFunctionLib.pressKey("Enter");	
				}
				
				if(FunctionalLibrary.func_SearchAndSelectADataEditMode("4,5",ccSchedule,"10,5",ccSchedule))
				{
					Mainframe_GlobalFunctionLib.sendText(5,26, desc);
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					Mainframe_GlobalFunctionLib.sendText(10,2, "7");
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					if(FunctionalLibrary.func_SearchAndSelectADataEditMode("6,4",sequence,"12,4",sequence))
					{						
						Mainframe_GlobalFunctionLib.sendText(8,16, source);
						Mainframe_GlobalFunctionLib.sendText(9,16, code);
						Mainframe_GlobalFunctionLib.sendText(14,16, ratePercent);
								
						//Mainframe_GlobalFunctionLib.func_ScreenCaptureWithPassMsg("Create Drug Cost Comparison Schedule Sequence with Required details");
						Mainframe_GlobalFunctionLib.pressKey("Enter");
						Mainframe_GlobalFunctionLib.pressKey("F12");
						
					}
						
					else
					{
						Mainframe_GlobalFunctionLib.pressKey("F6");	
						Mainframe_GlobalFunctionLib.sendText(6,11, sequence);
						Mainframe_GlobalFunctionLib.sendText(9,16, source);
						Mainframe_GlobalFunctionLib.sendText(10,16, code);
						Mainframe_GlobalFunctionLib.sendText(15,16, ratePercent);
							
					//	Mainframe_GlobalFunctionLib.func_ScreenCaptureWithPassMsg("Create Drug Cost Comparison Schedule Sequence with Required details");
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					}
					}
					else
					{
						Mainframe_GlobalFunctionLib.pressKey("F6");
						Mainframe_GlobalFunctionLib.sendText(5,12, ccSchedule);
						//Mainframe_GlobalFunctionLib.sendText(5,12, costComparison);
						Mainframe_GlobalFunctionLib.sendText(5,27,desc);
						//Mainframe_GlobalFunctionLib.func_ScreenCaptureWithPassMsg("Create Drug Cost Comparison Schedule with Required details");
					//CommonFunction.func_Save();
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					Mainframe_GlobalFunctionLib.sendText(16,64,"Y");
					
					Mainframe_GlobalFunctionLib.sendText(10,2, "7");
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					
					if(FunctionalLibrary.func_SearchAndSelectADataEditMode("6,4",sequence,"12,4",sequence))
					{
						Thread.sleep(2000);
						//CommonFunction.func_SetValue(6,11, db.func_ReadData("Schedule Sequence"));
						Mainframe_GlobalFunctionLib.sendText(8,16, source);
						Mainframe_GlobalFunctionLib.sendText(9,16, code);
						Mainframe_GlobalFunctionLib.sendText(14,16, ratePercent);
								
						//Mainframe_GlobalFunctionLib.func_ScreenCaptureWithPassMsg("Create Drug Cost Comparison Schedule Sequence with Required details");
						Mainframe_GlobalFunctionLib.pressKey("Enter");
						Mainframe_GlobalFunctionLib.pressKey("F12");
						Mainframe_GlobalFunctionLib.pressKey("F12");
					}
						
					else
					{
						Mainframe_GlobalFunctionLib.pressKey("F6");	
						Mainframe_GlobalFunctionLib.sendText(6,11, sequence);
						Mainframe_GlobalFunctionLib.sendText(9,16, source);
						Mainframe_GlobalFunctionLib.sendText(10,16, code);
						Mainframe_GlobalFunctionLib.sendText(15,16, ratePercent);
							
					//Mainframe_GlobalFunctionLib.func_ScreenCaptureWithPassMsg("Create Drug Cost Comparison Schedule Sequence with Required details");
						Mainframe_GlobalFunctionLib.pressKey("Enter");
					}
					}
			
					Mainframe_GlobalFunctionLib.pressKey("F12");
					Mainframe_GlobalFunctionLib.pressKey("F12");
					System.out.println("Finished func");
					if(ScreenshotOption.equalsIgnoreCase("Always")){
						Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
						}
						}catch(Exception e)
			
						{	e.printStackTrace();
							Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
							Assert.fail("Drug Cost Comparison Schedule is not created/updated successfully.Screenshot is captured");
						}
			}
			

		public static void func_CreateOrMaintainDrugCostSchedule(String costSchedule , String scheduleDesc , String costScheduleSequence , String schedulePSC , String comparisonSchedule , String comparisonType) throws Exception
		{
			try{
				String text = Mainframe_GlobalFunctionLib.getText(1, 13);				
				if(!(text.equalsIgnoreCase("RxClaim Price Schedule Maintenance"))){
				
					FunctionalLibrary.navigateToRxClaimPlanAdministrator();
					
					Mainframe_GlobalFunctionLib.sendText(21, 7 ,"5" );
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					Mainframe_GlobalFunctionLib.sendText(21, 7 ,"1" );
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					Mainframe_GlobalFunctionLib.sendText(21, 7 ,"3" );
					Mainframe_GlobalFunctionLib.pressKey("Enter");		
				}
				else{
					Mainframe_GlobalFunctionLib.sendText(21, 7 ,"3" );
					Mainframe_GlobalFunctionLib.pressKey("Enter");	
				}
					
			if(FunctionalLibrary.func_SearchAndSelectADataEditMode("4,5",costSchedule,"10,5",costSchedule))
				{
				
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(10,2, "7");
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				if(FunctionalLibrary.func_SearchAndSelectADataEditMode("7,5",costScheduleSequence,"14,5",costScheduleSequence))
				{
					//CommonFunction.func_SetENTER();
					func_SetProductSelectionCode(schedulePSC);
//					CommonFunction.func_SetValue(9,2, db.func_ReadData("Schedule PSC"));
					Mainframe_GlobalFunctionLib.sendText(15,15, comparisonSchedule);
					Mainframe_GlobalFunctionLib.sendText(16,15, comparisonType);
					//Mainframe_GlobalFunctionLib.func_ScreenCaptureWithPassMsg("Create Drug Cost Schedule Sequence with Required details");
					Mainframe_GlobalFunctionLib.pressKey("Enter");
//					CommonFunction.func_SetF12();
//					CommonFunction.func_SetF12();
				}
					
					else
					{
						Mainframe_GlobalFunctionLib.pressKey("F6");
						//sleep(1);
						Mainframe_GlobalFunctionLib.sendText(6,21, costScheduleSequence);
						Mainframe_GlobalFunctionLib.pressKey("Tab");
						func_SetProductSelectionCode(schedulePSC);
//						CommonFunction.func_SetValue(9,2, db.func_ReadData("Schedule PSC"));
						Mainframe_GlobalFunctionLib.sendText(15,15, comparisonSchedule);
						Mainframe_GlobalFunctionLib.sendText(16,15, comparisonType);
								
						//Mainframe_GlobalFunctionLib.func_ScreenCaptureWithPassMsg("Create Drug Cost Schedule Sequence with Required details");
						Mainframe_GlobalFunctionLib.pressKey("Enter");
//						CommonFunction.func_SetF12();
					}
					
				
				}
				else
				{
					Mainframe_GlobalFunctionLib.pressKey("F6");	
					///Mainframe_GlobalFunctionLib.sendText(5,11, db.func_ReadData("Drug Cost Schedule"));
					Mainframe_GlobalFunctionLib.sendText(5,11, costSchedule);
					
					Mainframe_GlobalFunctionLib.sendText(5,27,scheduleDesc);
				//Mainframe_GlobalFunctionLib.func_ScreenCaptureWithPassMsg("Create Drug Cost Schedule with Required details");
				//CommonFunction.func_Save();
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(16,64,"Y");
				//CommonFunction.func_SetF12();
				

				Mainframe_GlobalFunctionLib.sendText(10,2, "7");
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				
				if(FunctionalLibrary.func_SearchAndSelectADataEditMode("7,5" , costScheduleSequence,"14,5","Cost Schedule Sequence"))
				{
					
					//CommonFunction.func_SetENTER();
					func_SetProductSelectionCode(schedulePSC);
//					CommonFunction.func_SetValue(9,2, db.func_ReadData("Schedule PSC"));
					Mainframe_GlobalFunctionLib.sendText(15,15, comparisonSchedule);
					Mainframe_GlobalFunctionLib.sendText(16,15, comparisonType);
				//	CommonFunction.func_ScreenCaptureWithPassMsg("Create Drug Cost Schedule Sequence with Required details");
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					Mainframe_GlobalFunctionLib.pressKey("F12");
					Mainframe_GlobalFunctionLib.pressKey("F12");
					
				}
					
				else
					{
					Mainframe_GlobalFunctionLib.pressKey("F6");
						//sleep(1);
					Mainframe_GlobalFunctionLib.sendText(6,21, costScheduleSequence);
					Mainframe_GlobalFunctionLib.pressKey("Tab");
						func_SetProductSelectionCode(schedulePSC);
//						CommonFunction.func_SetValue(9,2, db.func_ReadData("Schedule PSC"));
						Mainframe_GlobalFunctionLib.sendText(15,15, comparisonSchedule);
						Mainframe_GlobalFunctionLib.sendText(16,15,comparisonType);
						//CommonFunction.func_ScreenCaptureWithPassMsg("Create Drug Cost Schedule Sequence with Required details");
						Mainframe_GlobalFunctionLib.pressKey("Enter");
					}
				}
			Mainframe_GlobalFunctionLib.pressKey("F12");
			Mainframe_GlobalFunctionLib.pressKey("F12");
				
		

			if(ScreenshotOption.equalsIgnoreCase("Always")){
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				}
				}catch(Exception e)
				{	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
					Assert.fail("Drug Cost Schedule is not created/updated successfully.Screenshot is captured");
				}
		}
		public static void func_SetProductSelectionCode(String sPSC)
		{
			System.out.println(sPSC);
			StringTokenizer stValue= new StringTokenizer(sPSC, ",");
			boolean flag=true;
			int i = 2 ;
			while(stValue.hasMoreTokens())
				//while(i <=22)
			{
				//if(flag)
				//{
					try {
						//Mainframe_GlobalFunctionLib.click(9, i);
					
						Mainframe_GlobalFunctionLib.sendText(9, i, stValue.nextToken());
					
					i=i+2;
				//	Mainframe_GlobalFunctionLib.sfunc_TerminalApp().inputChars(stValue.nextToken());
//					CommonFunction.func_SetValue(9, 2, stValue.nextToken());
					//sleep(2);
					//CommonFunction.func_SetTab();
				//	flag=false;
	 
				//}
			//	else
			//	{
				//	CommonFunction.func_TerminalApp().inputKeys(stValue.nextToken());
			//	}
			} catch(Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
		}
		
		public static void func_CreateOrMaintainPriceTable(String priceTable , String priceTableDesc , String ptFrom , String ptThru , String dcSchedule , String ptFee , String ptTax , String priceCC , String calcCode) throws Exception
		{
			
			try{
				String text = Mainframe_GlobalFunctionLib.getText(1, 13);				
				if(!(text.equalsIgnoreCase("RxClaim Price Schedule Maintenance"))){
				
				FunctionalLibrary.navigateToRxClaimPlanAdministrator();
				
				Mainframe_GlobalFunctionLib.sendText(21, 7 ,"5" );
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(21, 7 ,"1" );
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(21, 7 ,"2" );
				Mainframe_GlobalFunctionLib.pressKey("Enter");	
				}
				else{
				Mainframe_GlobalFunctionLib.sendText(21, 7 ,"2" );
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				}
			if(FunctionalLibrary.func_SearchAndSelectADataEditMode("4,25",priceTable,"10,25",priceTable))
				
			{
				
				Mainframe_GlobalFunctionLib.sendText(4,26, priceTableDesc);
				Mainframe_GlobalFunctionLib.sendText(5,14, "        ");				
				Mainframe_GlobalFunctionLib.sendText(5,14, ptFrom);
				Mainframe_GlobalFunctionLib.sendText(5,31, "        ");				
				Mainframe_GlobalFunctionLib.sendText(5,31, ptThru);
				Mainframe_GlobalFunctionLib.sendText(11,37,dcSchedule);
				Mainframe_GlobalFunctionLib.sendText(13,9, "        ");
				Mainframe_GlobalFunctionLib.sendText(13,9, ptFee);
				Mainframe_GlobalFunctionLib.sendText(13,46,"      ");
				Mainframe_GlobalFunctionLib.sendText(13,46,ptTax);
				Mainframe_GlobalFunctionLib.sendText(13,79,priceCC);
				Mainframe_GlobalFunctionLib.sendText(16,46,calcCode);
				//Mainframe_GlobalFunctionLib.func_ScreenCaptureWithPassMsg("Create Price Table with Required details");
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.pressKey("F12");
				Mainframe_GlobalFunctionLib.pressKey("F12");
			
			}
			else
			{
				Mainframe_GlobalFunctionLib.pressKey("F6");;	
				Mainframe_GlobalFunctionLib.sendText(4,9, priceTable);
				Mainframe_GlobalFunctionLib.sendText(4,26, priceTableDesc);
				Mainframe_GlobalFunctionLib.sendText(5,14, ptFrom);
				Mainframe_GlobalFunctionLib.sendText(5,31, ptThru);
				Mainframe_GlobalFunctionLib.sendText(11,37, dcSchedule);
				Mainframe_GlobalFunctionLib.sendText(13,9, ptFee);
				Mainframe_GlobalFunctionLib.sendText(13,46,ptTax);
				Mainframe_GlobalFunctionLib.sendText(13,79, priceCC);
				Mainframe_GlobalFunctionLib.sendText(16,47, calcCode);
				//Mainframe_GlobalFunctionLib.func_ScreenCaptureWithPassMsg("Create Price Table with Required details");
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.pressKey("F12");
			}
			if(ScreenshotOption.equalsIgnoreCase("Always")){
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				}
				}catch(Exception e)
				{	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
					Assert.fail("Price Schedule is not created/updated successfully.Screenshot is captured");
				}
		}
		
		
		public static void func_CreateOrMaintainPriceSchedule(String priceSchedule , String psDescription ,String psSequence , String psCriteriaTable ) throws Exception
		{
			try{
			String text = Mainframe_GlobalFunctionLib.getText(1, 13);				
			if(!(text.equalsIgnoreCase("RxClaim Price Schedule Maintenance"))){
			
			FunctionalLibrary.navigateToRxClaimPlanAdministrator();
			
			Mainframe_GlobalFunctionLib.sendText(21, 7 ,"5" );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(21, 7 ,"1" );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(21, 7 ,"1" );
			Mainframe_GlobalFunctionLib.pressKey("Enter");	
			}
			else{
			Mainframe_GlobalFunctionLib.sendText(21, 7 ,"1" );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			}	
			
			if(FunctionalLibrary.func_SearchAndSelectADataEditMode("4,6",priceSchedule,"10,6",priceSchedule))
				
			{
				Mainframe_GlobalFunctionLib.sendText(5,36, psDescription);
				//Mainframe_GlobalFunctionLib.func_ScreenCaptureWithPassMsg("Create Price Schedule with Required details");
				//CommonFunction.func_Save();
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(16,64,"Y");
				Mainframe_GlobalFunctionLib.pressKey("F12");
				Mainframe_GlobalFunctionLib.sendText(10,2, "15");
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				if(FunctionalLibrary.func_SearchAndSelectADataEditMode("6,4",psSequence,"12,5",psSequence))
				{
					Mainframe_GlobalFunctionLib.sendText(8,21, psCriteriaTable);
					//CommonFunction.func_ScreenCaptureWithPassMsg("Create Price Schedule Sequence with Required details");
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					Mainframe_GlobalFunctionLib.pressKey("F12");
					Mainframe_GlobalFunctionLib.pressKey("F12");
					Mainframe_GlobalFunctionLib.pressKey("F12");
				}
				else
				{
					Mainframe_GlobalFunctionLib.pressKey("F6");
					Mainframe_GlobalFunctionLib.sendText(5,12, psSequence);
					Mainframe_GlobalFunctionLib.sendText(7,21, psCriteriaTable);
					//Mainframe_GlobalFunctionLib.func_ScreenCaptureWithPassMsg("Create Price Schedule Sequence with Required details");
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					Mainframe_GlobalFunctionLib.pressKey("F12");
					Mainframe_GlobalFunctionLib.pressKey("F12");
			
				}
			
			}
			else
			{
				Mainframe_GlobalFunctionLib.pressKey("F6");
				Mainframe_GlobalFunctionLib.sendText(4,18, priceSchedule);
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(5,36, psDescription);
				//Mainframe_GlobalFunctionLib.func_ScreenCaptureWithPassMsg("Create Price Schedule with Required details");
				//Mainframe_GlobalFunctionLib.func_Save();
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(16,64,"Y");
				Mainframe_GlobalFunctionLib.pressKey("F12");
				Mainframe_GlobalFunctionLib.sendText(10,2, "15");
				Mainframe_GlobalFunctionLib.pressKey("Enter");
			if(FunctionalLibrary.func_SearchAndSelectADataEditMode("6,4",psSequence,"12,5",psSequence))
			{
				Mainframe_GlobalFunctionLib.sendText(8,21, psCriteriaTable);
				//CommonFunction.func_ScreenCaptureWithPassMsg("Create Price Schedule Sequence with Required details");
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.pressKey("F12");
				Mainframe_GlobalFunctionLib.pressKey("F12");
				Mainframe_GlobalFunctionLib.pressKey("F12");
			}
			else
			{
				Mainframe_GlobalFunctionLib.pressKey("F6");
				Mainframe_GlobalFunctionLib.sendText(5,12, psSequence);
				Mainframe_GlobalFunctionLib.sendText(7,21, psCriteriaTable);
				//Mainframe_GlobalFunctionLib.func_ScreenCaptureWithPassMsg("Create Price Schedule Sequence with Required details");
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.pressKey("F12");
				Mainframe_GlobalFunctionLib.pressKey("F12");
			}
			
			}
			if(ScreenshotOption.equalsIgnoreCase("Always")){
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				}
				}catch(Exception e)
				{	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
					Assert.fail("Price Schedule is not created/updated successfully.Screenshot is captured");
				}
		}
		
		// Create PP Table
		public static void func_CreateOrMaintainPatientPayTable(String patientPayTable , String patientPayTableDesc , String negativeDue , String ppCC , String brandAmount , String brandCalcBasis , String genericAmount , String genericCalcBasis ) throws Exception
		{
			try{
				String text = Mainframe_GlobalFunctionLib.getText(1, 13);				
				if((text.equalsIgnoreCase("RxClaim Price Schedule Maintenance"))){
					Mainframe_GlobalFunctionLib.pressKey("F12");
					Mainframe_GlobalFunctionLib.sendText(21, 7 ,"2" );
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					Mainframe_GlobalFunctionLib.sendText(21, 7 ,"2" );
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					
					
				}
				else if((text.equalsIgnoreCase("RxClaim Patient Pay Maintenance"))){
					Mainframe_GlobalFunctionLib.sendText(21, 7 ,"2" );
					Mainframe_GlobalFunctionLib.pressKey("Enter");
				}
				else if((text.equalsIgnoreCase("RxClaim Price Maintenance"))){
					Mainframe_GlobalFunctionLib.sendText(21, 7 ,"2" );
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					Mainframe_GlobalFunctionLib.sendText(21, 7 ,"2" );
					Mainframe_GlobalFunctionLib.pressKey("Enter");
				}
				else{
					FunctionalLibrary.navigateToRxClaimPlanAdministrator();
					
					Mainframe_GlobalFunctionLib.sendText(21, 7 ,"5" );
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					Mainframe_GlobalFunctionLib.sendText(21, 7 ,"2" );
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					Mainframe_GlobalFunctionLib.sendText(21, 7 ,"2" );
					Mainframe_GlobalFunctionLib.pressKey("Enter");	
					
				}	
				
			if(FunctionalLibrary.func_SearchAndSelectADataEditMode("4,5", patientPayTable,"10,5",patientPayTable))
			{
				
				Mainframe_GlobalFunctionLib.sendText(5,34, patientPayTableDesc);
				Mainframe_GlobalFunctionLib.sendText(5,73, negativeDue);
				Mainframe_GlobalFunctionLib.sendText(6,30, ppCC);
//				CommonFunction.func_SetValue(9,24, db.func_ReadData("Negative Due Fee"));
				Mainframe_GlobalFunctionLib.sendText(11,21, "      ");
				Mainframe_GlobalFunctionLib.sendText(11,21, brandAmount);
				Mainframe_GlobalFunctionLib.sendText(12,46, brandCalcBasis);
				Mainframe_GlobalFunctionLib.sendText(17,21, "      ");
				Mainframe_GlobalFunctionLib.sendText(17,21, genericAmount);
				Mainframe_GlobalFunctionLib.sendText(18,46, genericCalcBasis);
				//Mainframe_GlobalFunctionLib.func_ScreenCaptureWithPassMsg("Create Patient Pay Table with Required details");
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.pressKey("F12");
				Mainframe_GlobalFunctionLib.pressKey("F12");
			}
			else
			{
				Mainframe_GlobalFunctionLib.pressKey("F6");	
				Mainframe_GlobalFunctionLib.sendText(5,8, patientPayTable);
				Mainframe_GlobalFunctionLib.sendText(5,34,patientPayTableDesc);
				Mainframe_GlobalFunctionLib.sendText(5,73,negativeDue);
				Mainframe_GlobalFunctionLib.sendText(6,30,ppCC);
//			CommonFunction.func_SetValue(9,24, db.func_ReadData("Negative Due Fee"));
				Mainframe_GlobalFunctionLib.sendText(11,21,brandAmount);
				Mainframe_GlobalFunctionLib.sendText(12,46,brandCalcBasis);
				Mainframe_GlobalFunctionLib.sendText(17,21, genericAmount);
				Mainframe_GlobalFunctionLib.sendText(18,46, genericCalcBasis);
				//Mainframe_GlobalFunctionLib.func_ScreenCaptureWithPassMsg("Create Patient Pay Table with Required details");
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.pressKey("F12");
			
			
			}
			if(ScreenshotOption.equalsIgnoreCase("Always")){
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				}
				}catch(Exception e)
				{	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
					Assert.fail("Patient Pay Table is not created/updated successfully.Screenshot is captured");
				}
		}
		
		// Create Patient Pay Schedule
		public static void func_CreateOrMaintainPatientPaySchedule(String patientPaySchedule , String ppScheduleDesc , String patientPaySeq , String ppTableSchedule) throws Exception
		{
			try{
				String text = Mainframe_GlobalFunctionLib.getText(1, 13);				
				if((text.equalsIgnoreCase("RxClaim Price Schedule Maintenance"))){
					Mainframe_GlobalFunctionLib.pressKey("F12");
					Mainframe_GlobalFunctionLib.sendText(21, 7 ,"2" );
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					Mainframe_GlobalFunctionLib.sendText(21, 7 ,"1" );
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					
					
				}
				else if((text.equalsIgnoreCase("RxClaim Patient Pay Maintenance"))){
					Mainframe_GlobalFunctionLib.sendText(21, 7 ,"1" );
					Mainframe_GlobalFunctionLib.pressKey("Enter");
				}
				else if((text.equalsIgnoreCase("RxClaim Price Maintenance"))){
					Mainframe_GlobalFunctionLib.sendText(21, 7 ,"2" );
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					Mainframe_GlobalFunctionLib.sendText(21, 7 ,"1" );
					Mainframe_GlobalFunctionLib.pressKey("Enter");
				}
				else{
					FunctionalLibrary.navigateToRxClaimPlanAdministrator();
					
					Mainframe_GlobalFunctionLib.sendText(21, 7 ,"5" );
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					Mainframe_GlobalFunctionLib.sendText(21, 7 ,"2" );
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					Mainframe_GlobalFunctionLib.sendText(21, 7 ,"1" );
					Mainframe_GlobalFunctionLib.pressKey("Enter");	
					
				}	
				
				
			if(FunctionalLibrary.func_SearchAndSelectADataEditMode("4,6",patientPaySchedule,"10,6",patientPaySchedule))
			{
				
				Mainframe_GlobalFunctionLib.sendText(5,24, ppScheduleDesc);
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.pressKey("F12");
				Mainframe_GlobalFunctionLib.sendText(10,2, "15");
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				if(FunctionalLibrary.func_SearchAndSelectADataEditMode("6,5",patientPaySeq,"12,5",patientPaySeq))
				{
					Mainframe_GlobalFunctionLib.sendText(6,26, ppTableSchedule);
					//Mainframe_GlobalFunctionLib.func_ScreenCaptureWithPassMsg("Create Patient Pay Schedule with Required details");
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					Mainframe_GlobalFunctionLib.pressKey("F12");
					Mainframe_GlobalFunctionLib.pressKey("F12");
					Mainframe_GlobalFunctionLib.pressKey("F12");
					Mainframe_GlobalFunctionLib.pressKey("F12");
					Mainframe_GlobalFunctionLib.pressKey("F12");
					
				}
				else
				{
					Mainframe_GlobalFunctionLib.pressKey("F6");
					Mainframe_GlobalFunctionLib.sendText(5,26, patientPaySeq);
					Mainframe_GlobalFunctionLib.sendText(6,26, ppTableSchedule);
					//Mainframe_GlobalFunctionLib.func_ScreenCaptureWithPassMsg("Create Patient Pay Schedule with Required details");
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					Mainframe_GlobalFunctionLib.pressKey("F12");
					Mainframe_GlobalFunctionLib.pressKey("F12");
					Mainframe_GlobalFunctionLib.pressKey("F12");
					Mainframe_GlobalFunctionLib.pressKey("F12");
				}
			
			
			}
			else
			{
				Mainframe_GlobalFunctionLib.pressKey("F6");	
				Mainframe_GlobalFunctionLib.sendText(5,12, patientPaySchedule);
				Mainframe_GlobalFunctionLib.sendText(5,25, ppScheduleDesc);
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(10,2, "15");
				Mainframe_GlobalFunctionLib.pressKey("Enter");
			if(FunctionalLibrary.func_SearchAndSelectADataEditMode("6,5",patientPaySeq,"12,5",patientPaySeq))
			{
				Mainframe_GlobalFunctionLib.sendText(6,26, ppTableSchedule);
				//Mainframe_GlobalFunctionLib.func_ScreenCaptureWithPassMsg("Create Patient Pay Schedule Sequence with Required details");
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.pressKey("F12");
				Mainframe_GlobalFunctionLib.pressKey("F12");
				Mainframe_GlobalFunctionLib.pressKey("F12");
				Mainframe_GlobalFunctionLib.pressKey("F12");
				
			}
			else
			{
				Mainframe_GlobalFunctionLib.pressKey("F6");
				Mainframe_GlobalFunctionLib.sendText(5,26, patientPaySeq);
				Mainframe_GlobalFunctionLib.sendText(6,26, ppTableSchedule);
				//Mainframe_GlobalFunctionLib.func_ScreenCaptureWithPassMsg("Create Patient Pay Schedule Sequence with Required details");
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.pressKey("F12");
				Mainframe_GlobalFunctionLib.pressKey("F12");
				Mainframe_GlobalFunctionLib.pressKey("F12");
				Mainframe_GlobalFunctionLib.pressKey("F12");
			}
			}
			if(ScreenshotOption.equalsIgnoreCase("Always")){
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				}
				}catch(Exception e)
				{	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
					Assert.fail("Patient Pay Schedule is not created/updated successfully.Screenshot is captured");
				}
		}

public static void main (String args[]) throws Exception{
	FunctionalLibrary fb = new FunctionalLibrary();
	Pricing pricing = new Pricing();
	try {
	//	Mainframe_GlobalFunctionLib.launchTE("Book1");
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	try {
		//pricing.login();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	//pricing.func_CreateOrMaintainDrugCostComparisonSchedule( "Test" , "EVU3845" ,"1" , "MEDISPAN" , "AWP" , "85" );
	//pricing.func_CreateOrMaintainDrugCostComparisonSchedule( "Test" , "RUP3845" ,"2" , "MEDISPAN" , "AWP" , "85" , "EVU3845");
	
	//.func_CreateOrMaintainDrugCostSchedule("DPATCCP13", "test", "1", "X, , , , , , , , , , ", "DPATCCP13", "02");
	
	//pricing.func_CreateOrMaintainPriceTable("DPATRUP13", "test", "010101", "123139", "DPATCCP13", "5.00", "5.00", "0", "4");
	
	
	//pricing.func_CreateOrMaintainPriceSchedule("DPATCCP13", "test", "1", "DPATCCP13");
pricing.func_CreateOrMaintainPatientPayTable("DPATCCP13", "Test", "Y", "B", "20.00", " ", "10.00", " ");
pricing.func_CreateOrMaintainPatientPaySchedule("DPATCCP13", "Test", "1", "DPATCCP13");	
System.out.println("Finished func main");
	
	
}

}