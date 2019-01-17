/*#Author:mudethula_venkateshwarlu@optum.com
#QE: Zelewsky, John
#Step Definition file: MemberAdjustmentLoadwithMedicalDataFile.java
#SN003417_SR42278
*/
package com.atdd.demo.te.stepdefinitons;

import com.atdd.te.screenHelpers.FunctionalLibrary;

import com.cucumber.listener.Reporter;
import com.optumrx.autofusion.core.te.util.Mainframe_GlobalFunctionLib;
import com.optumrx.autofusion.core.te.util.Screenshot;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MemberAdjustmentLoadwithMedicalDataFile {
	
	@When("^I call Member Adjustment API Test Prompt Screen with command \"([^\"]*)\"$")
	public void i_call_Member_Adjustment_API_Test_Prompt_Screen_with_command(String cmdRCMAD725) throws Throwable {
		 Mainframe_GlobalFunctionLib.sendText(21, 07, "            ");
		 Mainframe_GlobalFunctionLib.sendText(21, 07, cmdRCMAD725);
		 Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		 Mainframe_GlobalFunctionLib.pressKey("Enter");
		 Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	}

	@When("^I enter data in Member Adjustment API Response screen with \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\" \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
	public void i_enter_data_in_Member_Adjustment_API_Response_screen_with(String Carrier, String Account, String Group, String MemberID, String AdjustmentDate, String AccumulationCode, String ReasonCode,  String AdjustmentAmount, String AdjustmentType, String RecordTimestamp, String RecordOrder, String AmountType, String SenderType, String AdjustmentTime, String AdjustmentTimeMS) throws Throwable {
		Mainframe_GlobalFunctionLib.sendText(9, 10, Carrier);
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		 Mainframe_GlobalFunctionLib.sendText(9, 28, Account);
		 Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		 Mainframe_GlobalFunctionLib.sendText(9, 50, Group);
		 Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		 Mainframe_GlobalFunctionLib.sendText(10, 9, MemberID);
		 Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		 Mainframe_GlobalFunctionLib.sendText(11, 35, "        ");
		 Mainframe_GlobalFunctionLib.sendText(11, 35, AdjustmentDate);
		 Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		 Mainframe_GlobalFunctionLib.sendText(11, 62, AccumulationCode);
		 Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		 Mainframe_GlobalFunctionLib.sendText(12, 14, ReasonCode);
		 Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		 Mainframe_GlobalFunctionLib.sendText(12, 43, "           ");
		 Mainframe_GlobalFunctionLib.sendText(12, 43, AdjustmentAmount);
		 Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		 Mainframe_GlobalFunctionLib.sendText(13, 11, AdjustmentType);
		 Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		 Mainframe_GlobalFunctionLib.sendText(13, 30, RecordTimestamp);
		 Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		 Mainframe_GlobalFunctionLib.sendText(13, 70, "      ");
		 Mainframe_GlobalFunctionLib.sendText(13, 70, RecordOrder);
		 Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		 Mainframe_GlobalFunctionLib.sendText(15, 14, AmountType);
		 Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		 Mainframe_GlobalFunctionLib.sendText(15, 28, SenderType);
		 Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		 Mainframe_GlobalFunctionLib.sendText(20, 18, "        ");
		 Mainframe_GlobalFunctionLib.sendText(20, 18, AdjustmentTime);
		 Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		 Mainframe_GlobalFunctionLib.sendText(20, 50, AdjustmentTimeMS);
		 Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		 Mainframe_GlobalFunctionLib.pressKey("Enter");
		 Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		 Mainframe_GlobalFunctionLib.sendText(16, 64, "Y");
		 Mainframe_GlobalFunctionLib.pressKey("Enter");
		 Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		 Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		 Mainframe_GlobalFunctionLib.sendText(16, 64, "Y");
		 Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	}

	@Then("^I verify error codes in Member Adjustment API Response screen$")
	public void i_verify_error_codes_in_Member_Adjustment_API_Response_screen() throws Throwable {
		String ScreenName="Member Adjustment API Response";
	    String ScreenVerify= Mainframe_GlobalFunctionLib.getText(2, 26);
	    Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	    if(ScreenVerify.equalsIgnoreCase(ScreenName))
	    {
		 System.out.println("User is on : "+ScreenVerify+" Screen");
		 Reporter.addStepLog("User is on : "+ScreenVerify+" Screen");
		  String actualMessage=Mainframe_GlobalFunctionLib.getText(19, 2);
			 	 System.out.println("Expected Message shown in Screen ie: "+actualMessage);
				 Reporter.addStepLog("Expected Message shown in Screen ie: "+actualMessage);
				 Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		 try{
		    	String flag=Mainframe_GlobalFunctionLib.getText(8, 2);
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				 if(flag.equals("E"))
				 {
					 System.out.println("Member Adjustment API Response Screen: Error Flag shown is : "+flag);
					 Reporter.addStepLog("Member Adjustment API Response Screen: Error Flag shown is : "+flag);
					 Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
					 
					 String errorCodeMessage=Mainframe_GlobalFunctionLib.getText(8, 2);
					 System.out.println("Member Adjustment API Response Screen: Error Code and Message is: "+errorCodeMessage);
					 Reporter.addStepLog("Member Adjustment API Response Screen: Error Code and Message is: "+errorCodeMessage);
					 Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			     }
				 else
				 {
					 System.out.println("No Error Code and Messages in Member Adjustment API Response Screen");
					 Reporter.addStepLog("No Error Code and Messages in Member Adjustment API Response Screen");
					 }
		    }catch (Exception e)
		    {
		    	System.out.println("Exception is"+e);
				Reporter.addStepLog("Exception is "+e);
		    }
		 Mainframe_GlobalFunctionLib.pressKey("F3");
		 Mainframe_GlobalFunctionLib.pressKey("F3");
		 Mainframe_GlobalFunctionLib.pressKey("F3");
	    }
	    else
	    {
	    	System.out.println("Unknown Screen");
			Reporter.addStepLog("Unknown Screen");
			 System.exit(0);
	    }
	}

	
	@When("^I create physical file with \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
	public void i_create_physical_file_with(String cmdCreatePhyFile,String FileName, String Library) throws Throwable {
	 //String cmdCreatePhyFile="CRTPF";
	 Mainframe_GlobalFunctionLib.sendText(21, 07, "            ");
	 Mainframe_GlobalFunctionLib.sendText(21, 07, cmdCreatePhyFile);
	 Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	 Mainframe_GlobalFunctionLib.pressKey("Enter");
	 Mainframe_GlobalFunctionLib.sendText(5, 37, FileName);
	 Mainframe_GlobalFunctionLib.sendText(6, 39, "          ");
	 Mainframe_GlobalFunctionLib.sendText(6, 39,Library);
	 Mainframe_GlobalFunctionLib.sendText(10, 37,"399");
	 Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	 Mainframe_GlobalFunctionLib.pressKey("Enter");
	 Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	 try{
		 Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		 String actaulMsgCreatePhyFile=Mainframe_GlobalFunctionLib.getText(24, 2);
		 System.out.println("Create Physical File Message is : "+actaulMsgCreatePhyFile);
		 Reporter.addStepLog("Create Physical File Message is : "+actaulMsgCreatePhyFile);
	   }catch (Exception e)
	    {}
	}
	
	@When("^I work with file \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
	public void i_work_with_file(String cmdWorkWithFile, String FileName, String Library) throws Throwable {
		 //String cmdWorkWithFile="ywrkf";
		try{
			if(cmdWorkWithFile.contains("YWRKF"))
			{
				 Mainframe_GlobalFunctionLib.sendText(21, 07, "            ");
				 Mainframe_GlobalFunctionLib.sendText(21, 7, cmdWorkWithFile);
				 System.out.println("Command used to work with file in CORE is : "+cmdWorkWithFile);
				 Reporter.addStepLog("Command used to work with file in CORE is : "+cmdWorkWithFile);
				 Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				 Mainframe_GlobalFunctionLib.pressKey("Enter");
				 Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				 Mainframe_GlobalFunctionLib.sendText(5, 37, FileName);
				 Mainframe_GlobalFunctionLib.sendText(6, 39, "          ");
				 Mainframe_GlobalFunctionLib.sendText(6, 39,Library);
				 Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				 Mainframe_GlobalFunctionLib.pressKey("Enter");
				 Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			}
			else if(cmdWorkWithFile.contains("UPDDTA FILE"))
			{
				 Mainframe_GlobalFunctionLib.sendText(21, 07, "            ");
				 String cmdWorkWithFileBook1=cmdWorkWithFile+"("+Library+"/"+FileName+")";
				 System.out.println("Command used to work with file in BOOK1 is : "+cmdWorkWithFileBook1);
				 Reporter.addStepLog("Command used to work with file in BOOK1 is : "+cmdWorkWithFileBook1);
				 Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				 Mainframe_GlobalFunctionLib.sendText(21, 7, cmdWorkWithFileBook1);
				 Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				 Mainframe_GlobalFunctionLib.pressKey("Enter");
				 Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			}
		 }catch (Exception e)
		{
			 Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			 String ErrWorkWithFile=Mainframe_GlobalFunctionLib.getText(24, 2);
			 System.out.println("Error Work With File Message is : "+ErrWorkWithFile);
			 Reporter.addStepLog("Error Work With File Message is : "+ErrWorkWithFile);
			 System.exit(0);
		}
	}

	@When("^I submit Member Adjustment Load with Medical Data with \"([^\"]*)\", \"([^\"]*)\"$")
	public void i_submit_Member_Adjustment_Load_with_Medical_Data_with( String FileName, String Library) throws Throwable {
	   Mainframe_GlobalFunctionLib.sendText(5, 34, FileName);
	   Mainframe_GlobalFunctionLib.sendText(6, 34, Library);
	   Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	   Mainframe_GlobalFunctionLib.pressKey("F6");
	   Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	   Mainframe_GlobalFunctionLib.pressKey("F3");
	   Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
/*	   Mainframe_GlobalFunctionLib.pressKey("F3");
	   Reporter.addScreenCaptureFromPath(Screenshot.screenshot());*/
	}
	
	@Then("^I select option Adjustment in MemberDetailList Screen$")
	public void i_select_option_Adjustment_in_MemberDetailList_Screen() throws Throwable {
		 Mainframe_GlobalFunctionLib.sendText(4, 20, "13");
		   Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		   Mainframe_GlobalFunctionLib.pressKey("Enter");
		   Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	}
	
	@Then("^I select option Member Accumulation Adjustments in Adjustment screen$")
	public void i_select_option_Member_Accumulation_Adjustments_in_Adjustment_screen() throws Throwable {
		   Mainframe_GlobalFunctionLib.sendText(5, 20, "1");
		   Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		   Mainframe_GlobalFunctionLib.pressKey("Enter");
		   Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	}
	
	//CORE/BOOKA i.e YWRKF
	@Then("^I add record in CORE with \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\",\"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
	public void i_add_record_in_CORE_with(String cmdWorkWithFile, String FileName, String Library, String Carrier, String Account, String Group, String MemberID, String AdjustmentDate, String ReasonCode, String AdjustmentAmount, String AdjustmentType, String RecordTimestamp, String RecordOrder, String AmountType, String SenderType, String SENDERTIMESTAMP, String AdjustmentTime, String AdjustmentTimeMS)throws Throwable {
		 Mainframe_GlobalFunctionLib.pressKey("F9");
	      String pushRecord=Carrier+Account+"  "+Group+"  "+MemberID+"  "+AdjustmentDate+"  "+ReasonCode+"00000"+AdjustmentAmount+"00  "+AdjustmentType+RecordTimestamp+RecordOrder+"  "+AdjustmentAmount+"  "+SENDERTIMESTAMP+AdjustmentTime+"   "+AdjustmentTimeMS;
	      String searchRecord=Carrier+Account;
	      System.out.println("Data is: "+pushRecord);
		  Reporter.addStepLog("Data is: "+pushRecord);
		  if(cmdWorkWithFile.contains("YWRKF"))
			{
		    	 //Mainframe_GlobalFunctionLib.sendText(8, 41, pushRecord);
				Mainframe_GlobalFunctionLib.sendText(8, 41, Carrier);
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				Mainframe_GlobalFunctionLib.sendText(8, 50, Account);
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				Mainframe_GlobalFunctionLib.sendText(8, 65, Group);
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				Mainframe_GlobalFunctionLib.sendText(8, 80, MemberID);
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				Mainframe_GlobalFunctionLib.sendText(9, 68, AdjustmentDate);
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				Mainframe_GlobalFunctionLib.sendText(10, 45, ReasonCode);
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				Mainframe_GlobalFunctionLib.sendText(10, 55, AdjustmentAmount);
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				Mainframe_GlobalFunctionLib.sendText(10, 65, AdjustmentType);
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				Mainframe_GlobalFunctionLib.sendText(10, 66, RecordTimestamp);
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				Mainframe_GlobalFunctionLib.sendText(11, 53, RecordOrder);
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				Mainframe_GlobalFunctionLib.sendText(12, 67, AmountType);
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				Mainframe_GlobalFunctionLib.sendText(12, 68, SenderType);
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				Mainframe_GlobalFunctionLib.sendText(15, 65, SENDERTIMESTAMP);
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				Mainframe_GlobalFunctionLib.sendText(16, 51, AdjustmentTime);
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				Mainframe_GlobalFunctionLib.sendText(16, 57, AdjustmentTimeMS);
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				 Mainframe_GlobalFunctionLib.pressKey("Enter");
				 Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				 Mainframe_GlobalFunctionLib.sendText(24, 73, "Y");
				 Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				Thread.sleep(6000);
				Mainframe_GlobalFunctionLib.pressKey("F13");
				Mainframe_GlobalFunctionLib.pressKey("F5");
				Thread.sleep(5000);
				Mainframe_GlobalFunctionLib.pressKey("F5");
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				try{
					label3: for(int i=8; i<=21; i++)
					{
						String ActualRecordData=Mainframe_GlobalFunctionLib.getText(i, 4);
						Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
						System.out.println("Actual Record is: "+ActualRecordData);
						Reporter.addStepLog("Actual Record is: "+ActualRecordData);
						 if(ActualRecordData.length()==0)
							{
								System.out.println("Actual Record is BLANK");
								Reporter.addStepLog("Actual Record is BLANK");
							}
				  		 if(ActualRecordData.contains(searchRecord))
							{
								System.out.println("Added Record is: "+ActualRecordData);
								Reporter.addStepLog("Added Record is: "+ActualRecordData);
								Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
								 Mainframe_GlobalFunctionLib.sendText(i, 2, "8");
								 Mainframe_GlobalFunctionLib.pressKey("Enter");
								 Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
								 Mainframe_GlobalFunctionLib.pressKey("F3");
								 Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
								break label3;
							 }
					  	if(i==21)
					  		 {
					  			 Mainframe_GlobalFunctionLib.pressKey("PageDown");
								 Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
								 i=8;
								 System.out.println("i value is: "+i);
								 Reporter.addStepLog("i value is: "+i);
					  		 }
					  		  //end of For loop
				      } 
	    			}catch (Exception e)
							{
					    	  	System.out.println("Exception: "+e);
								Reporter.addStepLog("Exception: "+e);
								Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
							}
						Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
						Mainframe_GlobalFunctionLib.pressKey("F3");
						 Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
						Mainframe_GlobalFunctionLib.pressKey("F3");
						Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
						
					}
		}						
			

//BOOK1 i.e UPDDTA FILE(VENKATLIBR/VM341711)	
	@Then("^I add record in book one with \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\",\"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
	public void i_add_record_in_book_one_with(String cmdWorkWithFile, String FileName, String Library, String Carrier, String Account, String Group, String MemberID, String AdjustmentDate, String ReasonCode, String AdjustmentAmount, String AdjustmentType, String RecordTimestamp, String RecordOrder, String AmountType, String SenderType, String SENDERTIMESTAMP, String AdjustmentTime, String AdjustmentTimeMS)throws Throwable {
			// String data="JZTEST341JZ3417TESTLOAD JZ3417TESTING  JZ3417MBR1  1181120    COMMERCIAL000003100 52018-11-02-15.29.03.09000000001   BC 143050123";
	         String pushRecord=Carrier+Account+"  "+Group+"  "+MemberID+"  "+AdjustmentDate+"  "+ReasonCode+"00000"+AdjustmentAmount+"00  "+AdjustmentType+RecordTimestamp+RecordOrder+"  "+AdjustmentAmount+"  "+SENDERTIMESTAMP+AdjustmentTime+"   "+AdjustmentTimeMS;
	         String searchRecord=Carrier+Account;
	         System.out.println("Data is: "+pushRecord);
			 Reporter.addStepLog("Data is: "+pushRecord);
			 Mainframe_GlobalFunctionLib.pressKey("F9");
			 if(cmdWorkWithFile.contains("UPDDTA FILE"))
			      {
			    	// Mainframe_GlobalFunctionLib.sendText(5, 12, pushRecord);
			    	 Mainframe_GlobalFunctionLib.sendText(5, 12, Carrier);
						Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
						Mainframe_GlobalFunctionLib.sendText(5, 21, Account);
						Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
						Mainframe_GlobalFunctionLib.sendText(5, 36, Group);
						Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
						Mainframe_GlobalFunctionLib.sendText(5, 51, MemberID);
						Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
						Mainframe_GlobalFunctionLib.sendText(5, 79, AdjustmentDate);
						Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
						Mainframe_GlobalFunctionLib.sendText(6, 16, ReasonCode);
						Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
						
						Mainframe_GlobalFunctionLib.sendText(6, 26, AdjustmentAmount);
						Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
						Mainframe_GlobalFunctionLib.sendText(6, 36, AdjustmentType);
						Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
						Mainframe_GlobalFunctionLib.sendText(6, 37, RecordTimestamp);
						Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
						Mainframe_GlobalFunctionLib.sendText(6, 63, RecordOrder);
						Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
						Mainframe_GlobalFunctionLib.sendText(7, 38, AmountType);
						Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
						Mainframe_GlobalFunctionLib.sendText(7, 39, SenderType);
						Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
						Mainframe_GlobalFunctionLib.sendText(8, 75, SENDERTIMESTAMP);
						Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
						Mainframe_GlobalFunctionLib.sendText(9, 21, AdjustmentTime);
						Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
						Mainframe_GlobalFunctionLib.sendText(9, 27, AdjustmentTimeMS);
					 Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
					 Mainframe_GlobalFunctionLib.pressKey("Enter");
					 Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
					 Mainframe_GlobalFunctionLib.pressKey("F3");
					 Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
					 Mainframe_GlobalFunctionLib.sendText(14, 37, "Y");
					 Mainframe_GlobalFunctionLib.pressKey("Enter");
					 Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
					 Mainframe_GlobalFunctionLib.sendText(21, 7, "            ");
					 Mainframe_GlobalFunctionLib.sendText(21, 7, "WRKF");
					 Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
					 Mainframe_GlobalFunctionLib.pressKey("Enter");
					 Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
					 Mainframe_GlobalFunctionLib.sendText(5, 37, FileName);
					 Mainframe_GlobalFunctionLib.sendText(6, 39, "          ");
					 Mainframe_GlobalFunctionLib.sendText(6, 39,Library);
					 Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
					 Mainframe_GlobalFunctionLib.pressKey("Enter");
					 Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
					 try{
						    label4: for(int i=8; i <15; i++)
							{
							  String actualFileName=Mainframe_GlobalFunctionLib.getText(i, 7);
							  System.out.println("Actual File Name in Work with Files screen is: "+actualFileName);
							  Reporter.addStepLog("Actual File Name in Work with Files screen is: "+actualFileName);
							  if(actualFileName.length()==0)
							  {
								  System.out.println("Actual File Name in Work with Files screen is BLANK ");
								  Reporter.addStepLog("Actual File Name in Work with Files screen is BLANK ");
								  Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
							  }
							  else if(actualFileName.equals(FileName))
							  {
								  System.out.println("Expected File Name in Work with Files screen is found "+actualFileName);
								  Reporter.addStepLog("Expected File Name in Work with Files screen is found "+actualFileName);
								  Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
								  Mainframe_GlobalFunctionLib.sendText(i, 2,"5");
								  Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
								  Mainframe_GlobalFunctionLib.pressKey("Enter");
								  Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
								  Mainframe_GlobalFunctionLib.pressKey("Enter");
								  Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
								  try{
									    //String searchRecordData=Carrier+Account+"  "+Group+"  "+MemberID;
									    String searchRecordData=Carrier;
									    System.out.println("Actual searchRecordData is: "+searchRecordData);
										Reporter.addStepLog("Actual searchRecordData is: "+searchRecordData);
									    Mainframe_GlobalFunctionLib.sendText(5, 23, searchRecordData);
										Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
										Mainframe_GlobalFunctionLib.pressKey("F16");
										Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
								
										String ActualRecordData=Mainframe_GlobalFunctionLib.getText(7, 3);
										Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
										System.out.println("Actual Record is: "+ActualRecordData);
										Reporter.addStepLog("Actual Record is: "+ActualRecordData);
											if (ActualRecordData.contains(searchRecordData))
											{
												System.out.println("Expected Record is: "+ActualRecordData);
												Reporter.addStepLog("Expected Record is: "+ActualRecordData);
											}
											else
											{
												System.out.println("Expected Record not shown");
												Reporter.addStepLog("Expected Record not shown");
											}
						          	/*	label5: for(int j=7; j <21; j++)
										{
											String ActualRecordData=Mainframe_GlobalFunctionLib.getText(j, 2);
											Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
											System.out.println("Actual Record is: "+ActualRecordData);
											Reporter.addStepLog("Actual Record is: "+ActualRecordData);
											 if(ActualRecordData.length()==0)
												{
													System.out.println("Actual Record is BLANK");
													Reporter.addStepLog("Actual Record is BLANK");
												}
									  		 if(pushRecord.contains(ActualRecordData))
												{
													System.out.println("Added Record is: "+ActualRecordData);
													Reporter.addStepLog("Added Record is: "+ActualRecordData);
													Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
													 Mainframe_GlobalFunctionLib.sendText(j, 2, "8");
													 Mainframe_GlobalFunctionLib.pressKey("Enter");
													 Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
													break label5;
													
												}//end of For loop
									      } */
								         }
										   catch (Exception e)
										   {
											  System.out.println("Exception is: "+e);
											  Reporter.addStepLog("Exception is: "+e);
											  System.out.println("Expected Record not found");
											Reporter.addStepLog("Expected Record not found");
										   }
								  	break label4;
							     }//end of else if
							  }//end of for loop i.e label4
					        }
							catch (Exception e)
							   {
								  Mainframe_GlobalFunctionLib.pressKey("F3");
								  System.out.println("Exception is: "+e);
								  Reporter.addStepLog("Exception is: "+e);
							   }
						Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
						Mainframe_GlobalFunctionLib.pressKey("F3");
						Mainframe_GlobalFunctionLib.pressKey("F3");
			             }
				 else
				 {
					  Mainframe_GlobalFunctionLib.pressKey("F3");
					  System.out.println("Unknown Command to work with File");
					  Reporter.addStepLog("Unknown Command to work with File");
					  System.exit(0);
				 }
		        }
		
@Then("^I validate Manual Adjustment details page with \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\",\"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
public void i_validate_Manual_Adjustment_details_page_with(String Carrier, String Account, String Group, String MemberID, String AdjustmentDate, String ReasonCode, String AdjustmentAmount, String AdjustmentType, String RecordTimestamp, String RecordOrder, String AmountType, String SenderType, String SENDERTIMESTAMP, String AdjustmentTime, String AdjustmentTimeMS) throws Throwable {
	   	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	   //	Mainframe_GlobalFunctionLib.pressKey("F8");
	   	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		try {
			    int i;
				label5: for(i=15; i<22; i++)
				{
				  String actualAmountValue=Mainframe_GlobalFunctionLib.getText(i, 66);
				  System.out.println("@RCMAD001-Active Manual Adjustment Page: Actual Amount Value is: "+actualAmountValue);
				  Reporter.addStepLog("@RCMAD001-Active Manual Adjustment Page: Actual Amount Value is: "+actualAmountValue);
				  //if(actualAmountValue!= null && actualAmountValue!="")
					if(actualAmountValue!= null && actualAmountValue!="")
					 {
						  int lengthAmountValue = actualAmountValue.length();
						  String finalAmountValue=actualAmountValue.substring(0,lengthAmountValue-3);
						  System.out.println("@RCMAD001-Active Manual Adjustment Page:-Actual Amount value is: "+finalAmountValue);
						  Reporter.addStepLog("@RCMAD001-Active Manual Adjustment Page:-Actual Amount value is: "+finalAmountValue);
						  System.out.println("@Pushed Amount value is: "+AdjustmentAmount);
						  Reporter.addStepLog("@Pushed Amount value is: "+AdjustmentAmount);
						  if(AdjustmentAmount.contains(finalAmountValue))
						  {
							 System.out.println("@RCMAD001-Active Manual Adjustment Page-Expected Amount value is: "+finalAmountValue);
							 Reporter.addStepLog("@RCMAD001-Active Manual Adjustment Page-Expected Amount value is: "+finalAmountValue);
							 Mainframe_GlobalFunctionLib.sendText(i, 2, "5");
							 Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
							 Mainframe_GlobalFunctionLib.pressKey("Enter");
							 Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
							 String actualCarrier= Mainframe_GlobalFunctionLib.getText(5, 11);
							 System.out.println("@RCMAD0033-Manual Adjustment Detail Page-Carrier is: "+actualCarrier);
							 Reporter.addStepLog("@RCMAD0033-Manual Adjustment Detail Page-Carrier is: "+actualCarrier);
								 if(actualCarrier.equals(Carrier))
								 {
									 System.out.println("@RCMAD0033-Manual Adjustment Detail Page-Expected Carrier shown ie: "+actualCarrier);
									 Reporter.addStepLog("@RCMAD0033-Manual Adjustment Detail Page-Expected Carrier shown ie: "+actualCarrier);
								 }
								 else
								 {
									 System.out.println("@RCMAD0033-Manual Adjustment Detail Page-Expected Carrier not shown ie: "+Carrier);
									 Reporter.addStepLog("@RCMAD0033-Manual Adjustment Detail Page-Expected Carrier not shown ie: "+Carrier);
								 }
								 
							 String actualAccount= Mainframe_GlobalFunctionLib.getText(6, 11);
							 System.out.println("@RCMAD0033-Manual Adjustment Detail Page-Account is: "+actualAccount);
							 Reporter.addStepLog("@RCMAD0033-Manual Adjustment Detail Page-Account is: "+actualAccount);
								 if(actualAccount.equals(Account))
								 {
									 System.out.println("@RCMAD0033-Manual Adjustment Detail Page-Expected Account shown ie: "+actualAccount);
									 Reporter.addStepLog("@RCMAD0033-Manual Adjustment Detail Page-Expected Account shown ie: "+actualAccount);
								 }
								 else
								 {
									 System.out.println("@RCMAD0033-Manual Adjustment Detail Page-Expected Account not shown ie: "+Account);
									 Reporter.addStepLog("@RCMAD0033-Manual Adjustment Detail Page-Expected Account not shown ie: "+Account);
								 }
								 
							 String actualGroup= Mainframe_GlobalFunctionLib.getText(7, 11);
							 System.out.println("@RCMAD0033-Manual Adjustment Detail Page-Group is: "+actualGroup);
							 Reporter.addStepLog("@RCMAD0033-Manual Adjustment Detail Page-Group is: "+actualGroup);
								 if(actualGroup.equals(Group))
								 {
									 System.out.println("@RCMAD0033-Manual Adjustment Detail Page-Expected Group shown ie: "+actualGroup);
									 Reporter.addStepLog("@RCMAD0033-Manual Adjustment Detail Page-Expected Group shown ie: "+actualGroup);
								 }
								 else
								 {
									 System.out.println("@RCMAD0033-Manual Adjustment Detail Page-Expected Group not shown ie: "+Group);
									 Reporter.addStepLog("@RCMAD0033-Manual Adjustment Detail Page-Expected Group not shown ie: "+Group);
								 }
								 
							 String actualMemberID= Mainframe_GlobalFunctionLib.getText(8, 11);
							 System.out.println("@RCMAD0033-Manual Adjustment Detail Page-MemberID is: "+actualMemberID);
							 Reporter.addStepLog("@RCMAD0033-Manual Adjustment Detail Page-MemberID is: "+actualMemberID);
									 if(actualMemberID.equals(MemberID))
									 {
										 System.out.println("@RCMAD0033-Manual Adjustment Detail Page-Expected MemberID shown ie: "+actualMemberID);
										 Reporter.addStepLog("@RCMAD0033-Manual Adjustment Detail Page-Expected MemberID shown ie: "+actualMemberID);
									 }
									 else
									 {
										 System.out.println("@RCMAD0033-Manual Adjustment Detail Page-Expected MemberID not shown ie: "+MemberID);
										 Reporter.addStepLog("@RCMAD0033-Manual Adjustment Detail Page-Expected MemberID not shown ie: "+MemberID);
									 }
									 
							 String actualAdjustmentDate= Mainframe_GlobalFunctionLib.getText(10, 24);
							 System.out.println("@RCMAD0033-Manual Adjustment Detail Page-Adjustment Date is: "+actualAdjustmentDate);
							 Reporter.addStepLog("@RCMAD0033-Manual Adjustment Detail Page-Adjustment Date is: "+actualAdjustmentDate);
									 if(actualAdjustmentDate.contains(AdjustmentDate))
									 {
										 System.out.println("@RCMAD0033-Manual Adjustment Detail Page-Expected Adjustment Date shown ie: "+actualAdjustmentDate);
										 Reporter.addStepLog("@RCMAD0033-Manual Adjustment Detail Page-Expected Adjustment Date shown ie: "+actualAdjustmentDate);
									 }
									 else
									 {
										 System.out.println("@RCMAD0033-Manual Adjustment Detail Page-Expected Adjustment Date not shown ie: "+AdjustmentDate);
										 Reporter.addStepLog("@RCMAD0033-Manual Adjustment Detail Page-Expected Adjustment Date not shown ie: "+AdjustmentDate);
									 }
							
							 String actualReasonCode= Mainframe_GlobalFunctionLib.getText(13, 24);
							 System.out.println("@RCMAD0033-Manual Adjustment Detail Page-Reason Code is: "+actualReasonCode);
							 Reporter.addStepLog("@RCMAD0033-Manual Adjustment Detail Page-Reason Code is: "+actualReasonCode);
									 if(actualReasonCode.contains(ReasonCode))
									 {
										 System.out.println("@RCMAD0033-Manual Adjustment Detail Page-Expected Reason Code shown ie: "+actualReasonCode);
										 Reporter.addStepLog("@RCMAD0033-Manual Adjustment Detail Page-Expected Reason Code shown ie: "+actualReasonCode);
									 }
									 else
									 {
										 System.out.println("@RCMAD0033-Manual Adjustment Detail Page-Expected Reason Code not shown ie: "+ReasonCode);
										 Reporter.addStepLog("@RCMAD0033-Manual Adjustment Detail Page-Expected Reason Code not shown ie: "+ReasonCode);
									 }
											 
							 String actualAmount= Mainframe_GlobalFunctionLib.getText(14, 24);
							 System.out.println("@RCMAD0033-Manual Adjustment Detail Page-Amount is: "+actualAmount);
							 Reporter.addStepLog("@RCMAD0033-Manual Adjustment Detail Page-Amount is: "+actualAmount);
									 if(AdjustmentAmount.contains(finalAmountValue))
									 {
										 System.out.println("@RCMAD0033-Manual Adjustment Detail Page-Expected Amount shown ie: "+actualAmount);
										 Reporter.addStepLog("@RCMAD0033-Manual Adjustment Detail Page-Expected Amount shown ie: "+actualAmount);
									 }
									 else
									 {
										 System.out.println("@RCMAD0033-Manual Adjustment Detail Page-Expected Amount not shown ie: "+AdjustmentAmount);
										 Reporter.addStepLog("@RCMAD0033-Manual Adjustment Detail Page-Expected Amount not shown ie: "+AdjustmentAmount);
									 }
				 
									 
							 String actualTimeStamp= Mainframe_GlobalFunctionLib.getText(18, 24);
							 System.out.println("@RCMAD0033-Manual Adjustment Detail Page-Actual Time Stamp is: "+actualTimeStamp);
							 Reporter.addStepLog("@RCMAD0033-Manual Adjustment Detail Page-Actual Time Stamp is: "+actualTimeStamp);
									 if(actualTimeStamp.equalsIgnoreCase(RecordTimestamp))
									 {
										 System.out.println("@RCMAD0033-Manual Adjustment Detail Page-Expected Time Stamp shown ie: "+actualTimeStamp);
										 Reporter.addStepLog("@RCMAD0033-Manual Adjustment Detail Page-Expected Time Stamp shown ie: "+actualTimeStamp);
									 }
									 else
									 {
										 System.out.println("@RCMAD0033-Manual Adjustment Detail Page-Expected Time Stamp not shown ie: "+RecordTimestamp);
										 Reporter.addStepLog("@RCMAD0033-Manual Adjustment Detail Page-Expected Time Stamp not shown ie: "+RecordTimestamp);
									 }			 
								
								 
							String actualAmountType= Mainframe_GlobalFunctionLib.getText(15, 24);
							System.out.println("@RCMAD0033-Manual Adjustment Detail Page-Actual Amount Type is: "+actualAmountType);
							Reporter.addStepLog("@RCMAD0033-Manual Adjustment Detail Page-Actual Amount Type is: "+actualAmountType);
									 if(actualAmountType.equalsIgnoreCase(AmountType))
									 {
										 System.out.println("@RCMAD0033-Manual Adjustment Detail Page-Expected Amount Type shown ie: "+actualAmountType);
										 Reporter.addStepLog("@RCMAD0033-Manual Adjustment Detail Page-Expected Amount Type shown ie: "+actualAmountType);
									 }
									 else
									 {
										 System.out.println("@RCMAD0033-Manual Adjustment Detail Page-Expected Amount Type not shown ie: "+AmountType);
										 Reporter.addStepLog("@RCMAD0033-Manual Adjustment Detail Page-Expected Amount Type not shown ie: "+AmountType);
									 }
										 
							 String actualAdjustmentTime= Mainframe_GlobalFunctionLib.getText(10, 52);
							 System.out.println("@RCMAD0033-Manual Adjustment Detail Page-Actual Adjustment Time is: "+actualAdjustmentTime);
							 Reporter.addStepLog("@RCMAD0033-Manual Adjustment Detail Page-Actual Adjustment Time is: "+actualAdjustmentTime);
									 if(actualAdjustmentTime.equalsIgnoreCase(AdjustmentTime))
									 {
										System.out.println("@RCMAD0033-Manual Adjustment Detail Page-Expected Adjustment Time shown ie: "+actualAdjustmentTime);
										Reporter.addStepLog("@RCMAD0033-Manual Adjustment Detail Page-Expected Adjustment Time shown ie: "+actualAdjustmentTime);
									}
									else
									{
										System.out.println("@RCMAD0033-Manual Adjustment Detail Page-Expected Adjustment Time not shown ie: "+AdjustmentTime);
										Reporter.addStepLog("@RCMAD0033-Manual Adjustment Detail Page-Expected Adjustment Time not shown ie: "+AdjustmentTime);
									}
										 
							 String actualAdjustmentTimeMS= Mainframe_GlobalFunctionLib.getText(10, 64);
							 System.out.println("@RCMAD0033-Manual Adjustment Detail Page-Actual Adjustment Time in MS is: "+actualAdjustmentTimeMS);
							 Reporter.addStepLog("@RCMAD0033-Manual Adjustment Detail Page-Actual Adjustment Time in MS is: "+actualAdjustmentTime);
									 if(actualAdjustmentTimeMS.equalsIgnoreCase(AdjustmentTimeMS))
									 {
										System.out.println("@RCMAD0033-Manual Adjustment Detail Page-Expected Adjustment Time in MS shown ie: "+actualAdjustmentTimeMS);
										Reporter.addStepLog("@RCMAD0033-Manual Adjustment Detail Page-Expected Adjustment Time in MS shown ie: "+actualAdjustmentTimeMS);
									}
									else
									{
										System.out.println("@RCMAD0033-Manual Adjustment Detail Page-Expected Adjustment Time in MS not shown ie: "+AdjustmentTimeMS);
										Reporter.addStepLog("@RCMAD0033-Manual Adjustment Detail Page-Expected Adjustment Time in MS not shown ie: "+AdjustmentTimeMS);
									}
									 break label5;
						  }
						  else
						  {	 
							  System.out.println("@RCMAD001-Manual Adjustment screen-Expected Amount value not found ie: "+AdjustmentAmount);
							  Reporter.addStepLog("@RCMAD001-Manual Adjustment screen-Expected Amount value not found ie: "+AdjustmentAmount);
						  }
					 	  }
					else
					  {				
						Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
						System.out.println("No records @ RCMAD001-Active Manual Adjustment Page");
					    Reporter.addStepLog("No records @ RCMAD001-Active Manual Adjustment Page");
					    System.exit(0);
						  }
					 }
				}
		      catch (Exception e)
					{
			    	  	System.out.println("Exception: "+e);
						Reporter.addStepLog("Exception: "+e);
						/*System.out.println("No Records Found @RCMAD0033-Manual Adjustment Detail Page");
						Reporter.addStepLog("No Records Found@RCMAD0033-Manual Adjustment Detail Page");*/
		    		}
			FunctionalLibrary.navigateToRxClaimPlanAdministrator();
		 }//end of for loop
			
	@Then("^I call member details \"([^\"]*)\"$")
	public void i_call_member_details(String MemberID) throws Throwable {
		if(UpdatesToTheDrugDataProcessingSystem.func_SearchForMemberID1("4,4" ,MemberID ,"10,4" , MemberID)){
			System.out.println("Expected Member is : "+MemberID);
			Reporter.addStepLog("Expected Member is : "+MemberID);
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		  /*  Mainframe_GlobalFunctionLib.sendText(10, 2, "2");
			Mainframe_GlobalFunctionLib.pressKey("enter");*/
		}
		else
		{
			System.out.println("Expected Member not found : "+MemberID);
			Reporter.addStepLog("Expected Member not found : "+MemberID);
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			System.exit(0);
		}
	}


}
