package com.atdd.demo.te.stepdefinitons;




import com.atdd.te.screenHelpers.CommonHelper;
import com.atdd.te.screenHelpers.FunctionalLibrary;
import com.optumrx.autofusion.core.te.util.Mainframe_GlobalFunctionLib;


public class PlanGpiDailyDoseSetup extends CommonHelper {
	
	String fromdate;
	String thrudate;
	String PlanCode;
	String Rxclaim_number;
	String rxnumber_seq;
	
	public void verify_plan_is_updated_with_GPI_Daily_Dose_setup(String PlanCode,String fromdate,String description,String thrudate, String Dailydose1, String Dailydose2, String gpilist, String ProductID, String DrugStatus, String lookback, String LDdaysSupply) throws Throwable {

		try {
			FunctionalLibrary.navigateToRxClaimPlanAdministrator();
		} catch (Exception e) {
			e.printStackTrace();
		}
		Mainframe_GlobalFunctionLib.sendText(21, 7, "4");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(21, 7, "1");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Mainframe_GlobalFunctionLib.sendText(13, 19, PlanCode);
		Mainframe_GlobalFunctionLib.sendText(14, 19, fromdate);
		Mainframe_GlobalFunctionLib.sendText(15, 19, description);
		Mainframe_GlobalFunctionLib.pressKey("Enter");	
		Mainframe_GlobalFunctionLib.sendText(16, 64, "Y");
		Mainframe_GlobalFunctionLib.sendText(6, 51, "Y");
		Mainframe_GlobalFunctionLib.sendText(13, 77, "Y");
		Mainframe_GlobalFunctionLib.pressKey("Enter");	
		Mainframe_GlobalFunctionLib.sendText(16, 64, "Y");
		Mainframe_GlobalFunctionLib.pressKey("F7");
		Mainframe_GlobalFunctionLib.sendText(7, 21, "11");
		Mainframe_GlobalFunctionLib.pressKey("Enter");		
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Mainframe_GlobalFunctionLib.sendText(7, 21, gpilist);
		Mainframe_GlobalFunctionLib.pressKey("Enter");		
		Mainframe_GlobalFunctionLib.sendText(9, 2, "1");
		Mainframe_GlobalFunctionLib.pressKey("Enter");		
		Mainframe_GlobalFunctionLib.sendText(13, 17, "10");
		Mainframe_GlobalFunctionLib.sendText(14, 17, fromdate);
		Mainframe_GlobalFunctionLib.sendText(14, 41, thrudate);
		Mainframe_GlobalFunctionLib.pressKey("Enter");	
		Mainframe_GlobalFunctionLib.sendText(16, 64, "Y");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.sendText(11, 2, "7");
		Mainframe_GlobalFunctionLib.pressKey("Enter");	
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Mainframe_GlobalFunctionLib.pressKey("F17");
		Mainframe_GlobalFunctionLib.sendText(6, 4, ProductID);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		
		if(FunctionalLibrary.getText(11, 4)== ProductID) {
			Mainframe_GlobalFunctionLib.sendText(11, 2, "1");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
		} else {
	System.out.println("Product not found");
		}
			Mainframe_GlobalFunctionLib.pressKey("Enter");				
			Mainframe_GlobalFunctionLib.sendText(6, 58, fromdate);
			Mainframe_GlobalFunctionLib.sendText(6, 67, thrudate);
			Mainframe_GlobalFunctionLib.sendText(6, 78, DrugStatus);
			Mainframe_GlobalFunctionLib.sendText(14, 18, "S");
			Mainframe_GlobalFunctionLib.sendText(14, 33, Dailydose1);
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.pressKey("F2");
			Mainframe_GlobalFunctionLib.sendText(11, 12, "3");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.pressKey("F6");
			Mainframe_GlobalFunctionLib.sendText(8, 24, fromdate);
			Mainframe_GlobalFunctionLib.sendText(9, 24, thrudate);
			Mainframe_GlobalFunctionLib.sendText(10, 24, lookback);
			Mainframe_GlobalFunctionLib.sendText(11, 24, LDdaysSupply);
			Mainframe_GlobalFunctionLib.sendText(12, 24, gpilist);
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(8, 79, "*");
			Mainframe_GlobalFunctionLib.sendText(17, 17, "S");
			Mainframe_GlobalFunctionLib.sendText(17, 33, Dailydose2);
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.pressKey("F3");
			Mainframe_GlobalFunctionLib.pressKey("F3");
			Mainframe_GlobalFunctionLib.pressKey("F3");
			Mainframe_GlobalFunctionLib.sendText(7, 21, "28");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(21, 12, "1");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.pressKey("F6");
			Mainframe_GlobalFunctionLib.sendText(8, 12, fromdate);
			Mainframe_GlobalFunctionLib.sendText(8, 36, thrudate);
			Mainframe_GlobalFunctionLib.sendText(10, 26, "SN001396");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.pressKey("F12");
			Mainframe_GlobalFunctionLib.sendText(21, 12, "3");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.pressKey("F6");
			Mainframe_GlobalFunctionLib.sendText(9, 2, fromdate);
			Mainframe_GlobalFunctionLib.sendText(9, 12, thrudate);
			Mainframe_GlobalFunctionLib.sendText(9, 22, "SN001396");
			Mainframe_GlobalFunctionLib.sendText(16, 64, "Y");
			Mainframe_GlobalFunctionLib.pressKey("F12");
			Mainframe_GlobalFunctionLib.pressKey("F3");
			Mainframe_GlobalFunctionLib.pressKey("F3");
			Mainframe_GlobalFunctionLib.pressKey("F3");
			Mainframe_GlobalFunctionLib.sendText(21, 7, "CCT600");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			
		
			
	}
	
	public void i_create_CAG_with(String carrierID, String carrierName,String fromdate, String thrudate, String accountID, String accountName, String groupID, String groupName, String PlanCode) throws Throwable {
		
		try {
			FunctionalLibrary.navigateToRxClaimPlanAdministrator();
		} catch (Exception e) {
			e.printStackTrace();
		}
		Mainframe_GlobalFunctionLib.sendText(21, 7 ,"1" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(21, 7 ,"1" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(21, 7 ,"1" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		
			Mainframe_GlobalFunctionLib.pressKey("F6");			
			Mainframe_GlobalFunctionLib.sendText(13, 14, carrierID);
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(4, 24, carrierName);
			Mainframe_GlobalFunctionLib.sendText(5, 12, "1234567890");
			Mainframe_GlobalFunctionLib.sendText("11", "15", "TEST");			
			Mainframe_GlobalFunctionLib.sendText("12", "15", "TEST");          
			Mainframe_GlobalFunctionLib.sendText("12", "47", "AK");          
			Mainframe_GlobalFunctionLib.sendText("12", "56", "123456");                               
			Mainframe_GlobalFunctionLib.sendText("19", "27", fromdate);
			Mainframe_GlobalFunctionLib.sendText("19", "42", thrudate);
			Mainframe_GlobalFunctionLib.sendText("19", "65", "*DEFAULT");
			Mainframe_GlobalFunctionLib.pressKey("Enter");       
			Mainframe_GlobalFunctionLib.sendText(6, 30, "*TEST");
			Mainframe_GlobalFunctionLib.pressKey("Enter");       
			Mainframe_GlobalFunctionLib.pressKey("F15");
			Mainframe_GlobalFunctionLib.pressKey("PageDown");
			Mainframe_GlobalFunctionLib.sendText("12", "61", "*DEFAULT");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.pressKey("PageUp");
			Mainframe_GlobalFunctionLib.pressKey("F12");
			
            
			
			
		//Create new account
		
		Mainframe_GlobalFunctionLib.sendText("4", "6", carrierID);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		
			Mainframe_GlobalFunctionLib.sendText("10", "2", "7");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			
				Mainframe_GlobalFunctionLib.pressKey("F6");
				Mainframe_GlobalFunctionLib.sendText(15, 32, accountID);
				Mainframe_GlobalFunctionLib.pressKey("Enter");	
				Mainframe_GlobalFunctionLib.sendText(6, 27, accountName);
				Mainframe_GlobalFunctionLib.pressKey("Enter");
			
			//Create new group
			Mainframe_GlobalFunctionLib.sendText("11", "2", "7");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			
				Mainframe_GlobalFunctionLib.pressKey("F6");				
				Mainframe_GlobalFunctionLib.sendText(16, 15, groupID);
				Mainframe_GlobalFunctionLib.pressKey("Enter");					
				Mainframe_GlobalFunctionLib.sendText(7, 27, groupName);
				Mainframe_GlobalFunctionLib.sendText(17, 2, fromdate);
				Mainframe_GlobalFunctionLib.sendText(17, 12, thrudate);
				Mainframe_GlobalFunctionLib.click(17, 22 );
  				Mainframe_GlobalFunctionLib.pressKey("F4");				
				Mainframe_GlobalFunctionLib.sendText(4, 5, PlanCode);
				Mainframe_GlobalFunctionLib.pressKey("Enter");				
				Mainframe_GlobalFunctionLib.sendText(10, 2, "1");
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.pressKey("Enter");				
				Mainframe_GlobalFunctionLib.sendText(16, 64, "Y");
				Mainframe_GlobalFunctionLib.pressKey("F12");
				Thread.sleep(1000);
				Mainframe_GlobalFunctionLib.sendText(12, 2, "2");				
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				
				
				
						}
     FunctionalLibrary submit = new FunctionalLibrary();
     
	public void validate_Claim_drugStatus_is() throws Throwable {
		try {
			FunctionalLibrary.navigateToRxClaimPlanAdministrator();
		} catch (Exception e) {
			e.printStackTrace();
		}
		FunctionalLibrary.submitClaim();
	    Rxclaim_number = FunctionalLibrary.getText(20, 12);
	    rxnumber_seq = FunctionalLibrary.getText(20, 30);
	    Mainframe_GlobalFunctionLib.pressKey("F7");				
	    Mainframe_GlobalFunctionLib.pressKey("F7");				
		Mainframe_GlobalFunctionLib.sendText(4, 23, "8");
		String drugstatus = FunctionalLibrary.getText(7 ,22);
		if( drugstatus == "*") {
			System.out.println("Drug status is equivalent to *, FAIL");
		}else {
			System.out.println("Drug status is not equivalent to *, PASS");
		}
	}
		
	
		}

		

