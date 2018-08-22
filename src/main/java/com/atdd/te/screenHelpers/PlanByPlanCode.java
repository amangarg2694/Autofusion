package com.atdd.te.screenHelpers;

import java.io.IOException;
import java.util.StringTokenizer;

import org.testng.Assert;

import com.cucumber.listener.Reporter;
import com.optumrx.autofusion.core.te.util.Mainframe_GlobalFunctionLib;
import com.optumrx.autofusion.core.te.util.Screenshot;

public class PlanByPlanCode extends CommonHelper{

	
	//Set the Accumulator Edit on  in the Plan Detail Screen
		public void func_SetPlanAccumulatorDetails(String planCode , String from , String thru , String deductibleAccumLevel, String deductibleSchedule, String oopMaxAccumLevel, String oopMaxDeductibleSchedule , String benefitMaxAccumLevel, String benefitMaxDeductibleSchedule)throws Throwable
		{
			try{
			setAccumulatorOption(planCode);
			Mainframe_GlobalFunctionLib.pressKey("F7"); 
			Mainframe_GlobalFunctionLib.sendText(7, 21 ,"29" ); 
			Mainframe_GlobalFunctionLib.pressKey("Enter"); 
			//Mainframe_GlobalFunctionLib.sendText(15, 12 ,"6" ); 
			//Mainframe_GlobalFunctionLib.pressKey("Enter"); 

			setDeductibleDetails(deductibleAccumLevel, deductibleSchedule, from,thru);
			setOutOfPocketDetails(oopMaxAccumLevel, oopMaxDeductibleSchedule, from, thru);
			setBenefitMaximumDetails(benefitMaxAccumLevel, benefitMaxDeductibleSchedule,from, thru);
			
			//Set Different Accumulator Types in Accumulator screen
			//fuetAccumulatorTypes(db.func_ReadData("Types of Accumulator To Be Set"));

		  	if(ScreenshotOption.equalsIgnoreCase("Always")){
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			}
			}catch(Exception e)
			{	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				Assert.fail("The plan is not set with Accumulatore Details successfully.Screenshot is captured");
			}
		}
		
		//Set the Accumulator Edit in Plan Detail screen
		public static void setAccumulatorOption(String planCode)throws Throwable
		{
			try{
			String text = Mainframe_GlobalFunctionLib.getText(2, 29);
			if(!(text.equalsIgnoreCase("Plan Detail  Page 1 of 2")))
			openThePlanInEditMode(planCode);
					//String text = Mainframe_GlobalFunctionLib.getText(1, 13);				
					if((Mainframe_GlobalFunctionLib.getText(14, 77).equalsIgnoreCase("N"))){
						Mainframe_GlobalFunctionLib.sendText(14, 77, "Y");
						Mainframe_GlobalFunctionLib.pressKey("Enter");
						Mainframe_GlobalFunctionLib.sendText(16,64,"Y");
				}
			
		  	if(ScreenshotOption.equalsIgnoreCase("Always")){
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			}
			}catch(Exception e)
			{	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				Assert.fail("The Accumulatore option 29 is not set in the Plan successfully.Screenshot is captured");
			}
			}
			
			
			//It will search the required Plan and open it in Edit Mode
			public static void openThePlanInEditMode(String planCode)
			{
				
				try {
					String text = Mainframe_GlobalFunctionLib.getText(2, 29);
					if((text.trim().equalsIgnoreCase("Active Plan by Plan Code")))
						FunctionalLibrary.func_SearchAndSelectADataEditMode("4,5" ,planCode ,"11,6" , planCode);
					else{					
						FunctionalLibrary.navigateToRxClaimPlanAdministrator();
						Mainframe_GlobalFunctionLib.sendText(21, 7 ,"4" );
						Mainframe_GlobalFunctionLib.pressKey("Enter");
						Mainframe_GlobalFunctionLib.sendText(21, 7 ,"1" );
						Mainframe_GlobalFunctionLib.pressKey("Enter");
						FunctionalLibrary.func_SearchAndSelectADataEditMode("4,5" ,planCode ,"11,6" , planCode);
					}														
						
					if(ScreenshotOption.equalsIgnoreCase("Always")){
						Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
						}
						}catch(Exception e)
						{	try {
							Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
						} catch (IOException e1) {							
							e1.printStackTrace();
						}
							Assert.fail("The Plan is not opened in Edit mode.Screenshot is captured");
						}
			}
			
			public static void setDeductibleDetails(String accumulationLevel,String deductibleSchedule , String from , String thru) throws IOException{
				try{				
				Mainframe_GlobalFunctionLib.sendText(15, 12 ,"1" ); 
				Mainframe_GlobalFunctionLib.pressKey("Enter"); 
				
					if(FunctionalLibrary.func_SearchAndSelectADataEditMode("11,27",accumulationLevel,"11,46",deductibleSchedule))
					{
						if(from.length()==0)
						{
						Mainframe_GlobalFunctionLib.sendText("7", "13","        " );
						}else
						{
							Mainframe_GlobalFunctionLib.sendText("7", "13", from);	
						}
						if(thru.length()==0)
						{
						Mainframe_GlobalFunctionLib.sendText("7", "41","        " );
						}else
						{
							Mainframe_GlobalFunctionLib.sendText("7", "41", thru);	
						}
						
						Mainframe_GlobalFunctionLib.sendText("9", "29", accumulationLevel);
						Mainframe_GlobalFunctionLib.sendText("14", "29", deductibleSchedule);
						//Mainframe_GlobalFunctionLib.func_ScreenCaptureWithPassMsg("Deductible Detail Screen with Required input");
						Mainframe_GlobalFunctionLib.pressKey("Enter");
						Mainframe_GlobalFunctionLib.pressKey("F12");
					}
						//Mainframe_GlobalFunctionLib.sendText(11, 2 ,"2" ); 
						//Mainframe_GlobalFunctionLib.pressKey("Enter");
					
					//else
						//func_SetDeductibleDetails(db.func_ReadData("From"), db.func_ReadData("Thru"), db.func_ReadData("Accumulation Level"), db.func_ReadData("Deductible Schedule In Plan"));	
//						CommonFunction.func_SetF12();
					//}
						
					else
						{
						Mainframe_GlobalFunctionLib.pressKey("F6");
						
					
					
					if(from.length()==0)
					{
					Mainframe_GlobalFunctionLib.sendText("7", "13","        " );
					}else
					{
						Mainframe_GlobalFunctionLib.sendText("7", "13", from);	
					}
					if(thru.length()==0)
					{
					Mainframe_GlobalFunctionLib.sendText("7", "41","        " );
					}else
					{
						Mainframe_GlobalFunctionLib.sendText("7", "41", thru);	
					}
					
					Mainframe_GlobalFunctionLib.sendText("9", "29", accumulationLevel);
					Mainframe_GlobalFunctionLib.sendText("14", "29", deductibleSchedule);
					//Mainframe_GlobalFunctionLib.func_ScreenCaptureWithPassMsg("Deductible Detail Screen with Required input");
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					Mainframe_GlobalFunctionLib.pressKey("F12");
						//ds.func_SetDeductibleDetails(db.func_ReadData("From"), db.func_ReadData("Thru"), db.func_ReadData("Accumulation Level"), db.func_ReadData("Deductible Schedule In Plan"));
//						CommonFunction.func_SetF12();
					
						}	
					if(ScreenshotOption.equalsIgnoreCase("Always")){
						Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
						}
						}catch(Exception e)
						{	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
							Assert.fail("Deductible Details is not set in the Plan successfully.Screenshot is captured");
						}
			}
				
			
			public static void setOutOfPocketDetails(String accumulationLevel , String deductibleSchedule , String from , String thru) throws IOException{
				
				try{
					Mainframe_GlobalFunctionLib.sendText(15, 12 ,"2" ); 
					Mainframe_GlobalFunctionLib.pressKey("Enter"); 
					
						if(FunctionalLibrary.func_SearchAndSelectADataEditMode("11,27",accumulationLevel,"11,46",deductibleSchedule))
						{
							Mainframe_GlobalFunctionLib.sendText(15, 12 ,"1" ); 
							Mainframe_GlobalFunctionLib.pressKey("Enter"); 
							if(from.length()==0)
							{
							Mainframe_GlobalFunctionLib.sendText("7", "13","        " );
							}else
							{
							Mainframe_GlobalFunctionLib.sendText("7", "13", from);
							}
							if(thru.length()==0)
							{
							Mainframe_GlobalFunctionLib.sendText("7", "41","        " );
							}else
							{
								Mainframe_GlobalFunctionLib.sendText("7", "41", thru);	
							}
							Mainframe_GlobalFunctionLib.sendText("9", "29", accumulationLevel);
							Mainframe_GlobalFunctionLib.sendText("14", "29",deductibleSchedule);
							//Mainframe_GlobalFunctionLib.func_ScreenCaptureWithPassMsg("Out of Pocket Maximum Detail Page 1 of 2 Screen with Required input");
							Mainframe_GlobalFunctionLib.pressKey("Enter"); 
							Mainframe_GlobalFunctionLib.pressKey("F12"); 
						}
						else
						{
							Mainframe_GlobalFunctionLib.pressKey("F6"); 
							if(from.length()==0)
							{
							Mainframe_GlobalFunctionLib.sendText("7", "13","        " );
							}else
							{
							Mainframe_GlobalFunctionLib.sendText("7", "13", from);
							}
							if(thru.length()==0)
							{
							Mainframe_GlobalFunctionLib.sendText("7", "41","        " );
							}else
							{
								Mainframe_GlobalFunctionLib.sendText("7", "41", thru);	
							}
							Mainframe_GlobalFunctionLib.sendText("9", "29", accumulationLevel);
							Mainframe_GlobalFunctionLib.sendText("14", "29", deductibleSchedule);
							//Mainframe_GlobalFunctionLib.func_ScreenCaptureWithPassMsg("Out of Pocket Maximum Detail Page 1 of 2 Screen with Required input");
							Mainframe_GlobalFunctionLib.pressKey("Enter"); 
							Mainframe_GlobalFunctionLib.pressKey("F12"); 
						}
					
						if(ScreenshotOption.equalsIgnoreCase("Always")){
							Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
							}
							}catch(Exception e)
							{	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
								Assert.fail("Out Of Pocket Details is not set in the Plan successfully.Screenshot is captured");
							}	
				
			}
			
			public static void setBenefitMaximumDetails(String accumulationLevel , String deductibleSchedule , String from , String thru) throws Exception{
				
				try{
					Mainframe_GlobalFunctionLib.sendText(15, 12 ,"3" ); 
					Mainframe_GlobalFunctionLib.pressKey("Enter"); 
					if(FunctionalLibrary.func_SearchAndSelectADataEditMode("11,27",accumulationLevel,"11,46",deductibleSchedule))
					{
						Mainframe_GlobalFunctionLib.sendText("7", "13", from);
						Mainframe_GlobalFunctionLib.sendText("7", "41", thru);
						Mainframe_GlobalFunctionLib.sendText("8", "29", accumulationLevel);
						Mainframe_GlobalFunctionLib.sendText("13", "29", deductibleSchedule);
						//Mainframe_GlobalFunctionLib.func_ScreenCaptureWithPassMsg("Benefit Max Detail Page 1 of 2 Screen with Required input");
						Mainframe_GlobalFunctionLib.pressKey("Enter");
						Mainframe_GlobalFunctionLib.pressKey("F12");
					}
					else
					{
						Mainframe_GlobalFunctionLib.pressKey("F6");
						Mainframe_GlobalFunctionLib.sendText("7", "13", from);
						Mainframe_GlobalFunctionLib.sendText("7", "41", thru);
						Mainframe_GlobalFunctionLib.sendText("8", "29", accumulationLevel);
						Mainframe_GlobalFunctionLib.sendText("13", "29", deductibleSchedule);
						//Mainframe_GlobalFunctionLib.func_ScreenCaptureWithPassMsg("Benefit Max Detail Page 1 of 2 Screen with Required input");
						Mainframe_GlobalFunctionLib.pressKey("Enter");
						Mainframe_GlobalFunctionLib.pressKey("F12");
					}
					if(ScreenshotOption.equalsIgnoreCase("Always")){
						Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
						}
						}catch(Exception e)
						{	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
							Assert.fail("The benefit Maximum Details is not set successfully in the plan.Screenshot is captured");
						}
					}
			
			//DURTable create/update for Functional Testing
			public void createORUpdateMEDLIMITDURTable(String durTable ,String durTableDesc , String durStatus , String DURPPSRequired , String durServiceType ,String medGPIList , String exclPatResCodeList , String medLookBackPeriod , String perFillDS , String perfillMsgCode , String dglDiagList , String exclDiagCode , String exclGPIList , String exclTaxonomyList , String taxonomyMedLimit , String durPharmacyResponse , String medTaxonomyList, String percentageTherapeutic , String medLimit , String durServiceResponse , String messageCode , String prescriberThreshold , String pharmacyThreshold , String serviceQualifier , String serviceNewMember , String serviceIR) throws Throwable
			{
//				
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
			
				if(durTableDesc.length()==0)
					durTableDesc = " ";
				if(durServiceType.length()==0)
					durServiceType = " ";
				
					
				
				if(FunctionalLibrary.func_SearchAndSelectADataEditMode("4,5",durTable,"10,5",durTable))
				{
					Mainframe_GlobalFunctionLib.sendText(5,25, durTableDesc);
					Mainframe_GlobalFunctionLib.sendText(5,63, durStatus);
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					//func_ScreenCaptureWithPassMsg("DUR Table Created successfully");
					Mainframe_GlobalFunctionLib.pressKey("F7");					
					if(FunctionalLibrary.func_SearchAndSelectADataEditMode("6,4",durServiceType,"11,4",durServiceType))
					{
						//sleep(1);
						if(medGPIList.length()!=0)
						Mainframe_GlobalFunctionLib.sendText(9, 69,medGPIList);
						if(medGPIList.length()!=0)
						Mainframe_GlobalFunctionLib.sendText(10, 28,exclPatResCodeList);
						if(medLookBackPeriod.length()!=0)
						Mainframe_GlobalFunctionLib.sendText(10, 69,medLookBackPeriod);
						if(perFillDS.length()!=0)
						Mainframe_GlobalFunctionLib.sendText(11, 69,perFillDS);
						if(perfillMsgCode.length()!=0)
						Mainframe_GlobalFunctionLib.sendText(12, 69,perfillMsgCode);
						if(dglDiagList.length()!=0)
						Mainframe_GlobalFunctionLib.sendText(11, 28,dglDiagList);
						if(exclDiagCode.length()!=0)
						Mainframe_GlobalFunctionLib.sendText(11, 35,exclDiagCode);
						if(exclGPIList.length()!=0)
						Mainframe_GlobalFunctionLib.sendText(12, 28,exclGPIList);
						if(exclTaxonomyList.length()!=0)
						Mainframe_GlobalFunctionLib.sendText(13, 28,exclTaxonomyList);
						if(taxonomyMedLimit.length()!=0)
						Mainframe_GlobalFunctionLib.sendText(16, 2,taxonomyMedLimit);
						if(durPharmacyResponse.length()!=0)
						Mainframe_GlobalFunctionLib.sendText(16, 12,durPharmacyResponse);
						if(medTaxonomyList.length()!=0)
						Mainframe_GlobalFunctionLib.sendText(16, 48,medTaxonomyList);
						if(percentageTherapeutic.length()!=0)
						Mainframe_GlobalFunctionLib.sendText(19, 44,percentageTherapeutic);
						Mainframe_GlobalFunctionLib.pressKey("Enter");
						
						
						//func_ScreenCaptureWithPassMsg("DUR Service Updated successfully");
						Mainframe_GlobalFunctionLib.pressKey("F12");
						Mainframe_GlobalFunctionLib.pressKey("F12");
						Mainframe_GlobalFunctionLib.pressKey("F12");
						Mainframe_GlobalFunctionLib.pressKey("F12");
						
						
					//	func_GoBackFourTimes();
					}
						
					else
					{
					Mainframe_GlobalFunctionLib.pressKey("F6");
					Mainframe_GlobalFunctionLib.sendText(5, 14,durServiceType);
					Mainframe_GlobalFunctionLib.sendText(7, 14,"Y");
					Mainframe_GlobalFunctionLib.sendText(9, 14,"1");
					Mainframe_GlobalFunctionLib.sendText(11, 14,"M");
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					Mainframe_GlobalFunctionLib.sendText(11, 2,"2");
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					if(medGPIList.length()!=0)
					Mainframe_GlobalFunctionLib.sendText(9, 69,medGPIList);
					if(exclPatResCodeList.length()!=0)
					Mainframe_GlobalFunctionLib.sendText(10, 28,exclPatResCodeList);
					if(medLookBackPeriod.length()!=0)
					Mainframe_GlobalFunctionLib.sendText(10, 69,medLookBackPeriod);
					if(perFillDS.length()!=0)
					Mainframe_GlobalFunctionLib.sendText(11, 69,perFillDS);
					if(perfillMsgCode.length()!=0)
					Mainframe_GlobalFunctionLib.sendText(12, 69,perfillMsgCode);
					if(dglDiagList.length()!=0)
					Mainframe_GlobalFunctionLib.sendText(11, 28,dglDiagList);
					if(exclDiagCode.length()!=0)
					Mainframe_GlobalFunctionLib.sendText(11, 35,exclDiagCode);
					if(exclGPIList.length()!=0)
					Mainframe_GlobalFunctionLib.sendText(12, 28,exclGPIList);
					if(exclTaxonomyList.length()!=0)
					Mainframe_GlobalFunctionLib.sendText(13, 28,exclTaxonomyList);
					if(taxonomyMedLimit.length()!=0)
					Mainframe_GlobalFunctionLib.sendText(16, 2,taxonomyMedLimit);
					if(durPharmacyResponse.length()!=0)
					Mainframe_GlobalFunctionLib.sendText(16, 12,durPharmacyResponse);
					if(medTaxonomyList.length()!=0)
					Mainframe_GlobalFunctionLib.sendText(16, 48,medTaxonomyList);
					if(percentageTherapeutic.length()!=0)
					Mainframe_GlobalFunctionLib.sendText(19, 44,percentageTherapeutic);
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					//func_ScreenCaptureWithPassMsg("DUR Service Created successfully");
					Mainframe_GlobalFunctionLib.pressKey("F12");
					}
				}
				else
				{
					Mainframe_GlobalFunctionLib.pressKey("F6");	
					Mainframe_GlobalFunctionLib.sendText(11,18, durTable);
					Mainframe_GlobalFunctionLib.sendText(12,18, durTableDesc);
					Mainframe_GlobalFunctionLib.sendText(14,18, durStatus);
					//func_ScreenCaptureWithPassMsg("Create DUR Table with Required details");
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					
					if(DURPPSRequired.equalsIgnoreCase("yes"))
						
					{
						
						Mainframe_GlobalFunctionLib.sendText(10, 27,"AUTODUR");
						Mainframe_GlobalFunctionLib.pressKey("Enter");
					}
					Mainframe_GlobalFunctionLib.pressKey("F7");
					Mainframe_GlobalFunctionLib.pressKey("F6");
					Mainframe_GlobalFunctionLib.sendText(5, 14,durServiceType);
					Mainframe_GlobalFunctionLib.sendText(7, 14,"Y");
					Mainframe_GlobalFunctionLib.sendText(9, 14,"1");
					Mainframe_GlobalFunctionLib.sendText(11, 14,"M");
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					Mainframe_GlobalFunctionLib.sendText(11, 2,"2");
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					Mainframe_GlobalFunctionLib.sendText(9, 69,medGPIList);
					Mainframe_GlobalFunctionLib.sendText(10, 28,exclPatResCodeList);
					Mainframe_GlobalFunctionLib.sendText(10, 69,medLookBackPeriod);
					Mainframe_GlobalFunctionLib.sendText(11, 69,perFillDS);
					///BK1 func_SetValue(12, 69,db.func_ReadData("DUR Message Code"));
					Mainframe_GlobalFunctionLib.sendText(12, 69,perfillMsgCode);
					Mainframe_GlobalFunctionLib.sendText(11, 28,dglDiagList);
					Mainframe_GlobalFunctionLib.sendText(11, 35,exclDiagCode);
					Mainframe_GlobalFunctionLib.sendText(12, 28,exclGPIList);
					Mainframe_GlobalFunctionLib.sendText(13, 28,exclTaxonomyList);
					Mainframe_GlobalFunctionLib.sendText(16, 2,taxonomyMedLimit);
					Mainframe_GlobalFunctionLib.sendText(16, 12,durPharmacyResponse);
					Mainframe_GlobalFunctionLib.sendText(16, 48,medTaxonomyList);
					Mainframe_GlobalFunctionLib.sendText(19, 44,percentageTherapeutic);
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					Mainframe_GlobalFunctionLib.pressKey("F7");
					//DUR Service Creation;
					StringTokenizer MessageCode = null;
					StringTokenizer MedLimit= new StringTokenizer(medLimit, ",");
					StringTokenizer ServiceResponse= new StringTokenizer(durServiceResponse, ",");
				//Newly added Message code for functional Testing
					
					if(messageCode.length() >0)
					 MessageCode= new StringTokenizer(messageCode, ",");
					StringTokenizer PresThreshold= new StringTokenizer(prescriberThreshold, ",");
					StringTokenizer PharThreshold= new StringTokenizer(pharmacyThreshold, ",");
					StringTokenizer ServiceQualifier= new StringTokenizer(serviceQualifier, ",");
					StringTokenizer ServiceNewMember= new StringTokenizer(serviceNewMember, ",");
					StringTokenizer ServiceIR= new StringTokenizer(serviceIR, ",");
					while (MedLimit.hasMoreTokens()) 
					{
					
						Mainframe_GlobalFunctionLib.pressKey("F6");
						Mainframe_GlobalFunctionLib.sendText(8, 23,MedLimit.nextToken());
						Mainframe_GlobalFunctionLib.sendText(9, 23,ServiceResponse.nextToken());
					if(messageCode.length() >0)
						Mainframe_GlobalFunctionLib.sendText(10, 23,MessageCode.nextToken());
					Mainframe_GlobalFunctionLib.sendText(11, 23,PresThreshold.nextToken());
					Mainframe_GlobalFunctionLib.sendText(12, 23,PharThreshold.nextToken());
					Mainframe_GlobalFunctionLib.sendText(13, 23,ServiceQualifier.nextToken());
					Mainframe_GlobalFunctionLib.sendText(14, 23,ServiceNewMember.nextToken());
					Mainframe_GlobalFunctionLib.sendText(15, 23,ServiceIR.nextToken());
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					
					//func_ScreenCaptureWithPassMsg("DUR Service Created successfully");
					
					}
					Mainframe_GlobalFunctionLib.pressKey("F12");
					
					//92 8401 new
					//func_SetF12();
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					Mainframe_GlobalFunctionLib.pressKey("F12");
					Mainframe_GlobalFunctionLib.pressKey("F12");
					Mainframe_GlobalFunctionLib.pressKey("F12");
					Mainframe_GlobalFunctionLib.pressKey("F12");
					Mainframe_GlobalFunctionLib.pressKey("F12");
				}
				if(ScreenshotOption.equalsIgnoreCase("Always")){
					Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
					}
					}catch(Exception e)
					{	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
						Assert.fail("The DUR Table is not created/updated successfully.Screenshot is captured");
					}
				}
			
			
			// To turn on the NDC List option
			public void func_SetNDCList(String planCode) throws Exception
			{
				try{
					String text = Mainframe_GlobalFunctionLib.getText(2, 29);
					if(!(text.equalsIgnoreCase("Plan Detail  Page 1 of 2")))
					openThePlanInEditMode(planCode);
								
				if((Mainframe_GlobalFunctionLib.getText(15, 24).equalsIgnoreCase("N"))){
					Mainframe_GlobalFunctionLib.sendText(15, 24, "Y");
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					Mainframe_GlobalFunctionLib.sendText(16,64,"Y");
			}
				if(ScreenshotOption.equalsIgnoreCase("Always")){
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				}
				}catch(Exception e)
				{	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
					Assert.fail("The NDC List Option is not set to 'Y' in the Plan.Screenshot is captured");
				}			
			}
			
			// To turn on the GPI List option
				public void func_SetGPIList(String planCode) throws Exception
				{
					try {
						String text = Mainframe_GlobalFunctionLib.getText(2, 29);
						if(!(text.equalsIgnoreCase("Plan Detail  Page 1 of 2")))
						openThePlanInEditMode(planCode);
										
						if((Mainframe_GlobalFunctionLib.getText(6, 51).equalsIgnoreCase("N"))){
							Mainframe_GlobalFunctionLib.sendText(6, 51, "Y");
							Mainframe_GlobalFunctionLib.pressKey("Enter");
							Mainframe_GlobalFunctionLib.sendText(16,64,"Y");

				}
						if(ScreenshotOption.equalsIgnoreCase("Always")){
							Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
							}
							}catch(Exception e)
							{	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
								Assert.fail("The GPI List Option is not set to 'Y' in the Plan.Screenshot is captured");
							}			
						}
				
				// To turn on the compound option
				public void func_SetCompoundOption(String planCode) throws Exception
				{
					try {
						String text = Mainframe_GlobalFunctionLib.getText(2, 29);
						if(!(text.equalsIgnoreCase("Plan Detail  Page 1 of 2")))
						openThePlanInEditMode(planCode);
										
						if((Mainframe_GlobalFunctionLib.getText(14, 24).equalsIgnoreCase("N"))){
							Mainframe_GlobalFunctionLib.sendText(14, 24, "Y");
							Mainframe_GlobalFunctionLib.pressKey("Enter");
							Mainframe_GlobalFunctionLib.sendText(16,64,"Y");

				}
						if(ScreenshotOption.equalsIgnoreCase("Always")){
							Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
							}
							}catch(Exception e)
							{	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
								Assert.fail("The Compound Option is not set to 'Y' in the Plan.Screenshot is captured");
							}			
						}
				
				
				//Create a Plan with Compund,Member Eligibility and Pricing Edit turned On
				public void func_CreatePlanWithCompoundOption(String planCode, String fromDate, String planDesc , String thruDate , String priceSchedule , String patientpayschedule) throws Throwable
				{
					try {
						FunctionalLibrary.Createplanwithmembereligibilityandpricingoption(planCode, fromDate, planDesc, thruDate, priceSchedule, patientpayschedule);
						String text = Mainframe_GlobalFunctionLib.getText(2, 29);
						if(!(text.trim().equalsIgnoreCase("Plan Detail  Page 1 of 2")))
							Mainframe_GlobalFunctionLib.pressKey("F12");
						func_SetCompoundOption(planCode);
						if(ScreenshotOption.equalsIgnoreCase("Always")){
							Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
							}
							}catch(Exception e)
							{	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
								Assert.fail("The plan is not created/updated with Compound Option to 'Y'.Screenshot is captured");
							}
					} 

			public static void main(String args[])
			{FunctionalLibrary fb = new FunctionalLibrary();
				PlanByPlanCode pp = new PlanByPlanCode();				
				try {
					Pricing.login();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				try {
					//pp.func_SetPlanAccumulatorDetails("38288P1", "010101" ,"123139" ,"C", "EVU38288", "C", "EVU38288", "C", "EVU38288");
					//pp.createORUpdateMEDLIMITDURTable("RUP1001", "Test Dur Table", "ON", "N", "MEDLIMIT", "FTAUTODUR", "AUTODUR", "120", "7", " ", "AUTOL1", "B", "AUTODUR","AUTOL1", "500", "S", "AUTOL1", "10", "90,49,.01", "H,S,S", ", ,IRYMSG,TESTMSG", "2,0,0", "2,0,0", "S, , ,", " , ,Y,Y", " , ,Y, ,");
					pp.func_CreatePlanWithCompoundOption("RFT018", "010101", "Rup001", "123139", "EVUAREG", "EVUAREG");
				} catch (Throwable e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Finished func main");
				
				
			}
			
			
}