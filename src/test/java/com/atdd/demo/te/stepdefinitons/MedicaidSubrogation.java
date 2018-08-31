package com.atdd.demo.te.stepdefinitons;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import com.atdd.te.screenHelpers.FunctionalLibrary;
import com.cucumber.listener.Reporter;
import com.optumrx.autofusion.core.te.util.Mainframe_GlobalFunctionLib;
import com.optumrx.autofusion.core.te.util.Screenshot;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MedicaidSubrogation {

	@When("^I create subrogation CAG with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_create_subrogation_CAG_with(String carrierID, String carrierName, String processor, String mail, String city, String state, String zip, String contractFromDate, String contractThruDate, String contractEnt, String businessType,String accountID,String accountName ,String groupID,String groupName,String gFromDate,String gThruDate, String subflag) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		try {
			FunctionalLibrary.navigateToRxClaimPlanAdministrator();
		} catch (Exception e) {
			// TODO Auto-generated catch block
		}
		FunctionalLibrary.navigateToScreen("1");
		FunctionalLibrary.navigateToScreen("1");
		FunctionalLibrary.navigateToScreen("1");
		
		if(!(FunctionalLibrary.func_SearchAndSelectADataEditMode("4,6" ,carrierID ,"10,6" , carrierID))){
			Mainframe_GlobalFunctionLib.pressKey("F6");
			
			Mainframe_GlobalFunctionLib.sendText("13", "014", carrierID);
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			
			Mainframe_GlobalFunctionLib.sendText("04", "024", carrierName);
			Mainframe_GlobalFunctionLib.sendText("05", "012", processor);
			Mainframe_GlobalFunctionLib.sendText("011", "015", mail);
			Mainframe_GlobalFunctionLib.sendText("12", "015", city);
			Mainframe_GlobalFunctionLib.sendText("12", "047", state);
			Mainframe_GlobalFunctionLib.sendText("12", "056", zip);
                                
			Mainframe_GlobalFunctionLib.sendText("19", "027", contractFromDate);
			Mainframe_GlobalFunctionLib.sendText("19", "042", contractThruDate);
			Mainframe_GlobalFunctionLib.sendText("19", "065", contractEnt);
			Mainframe_GlobalFunctionLib.pressKey("Enter");
            
			Mainframe_GlobalFunctionLib.pressKey("F15");
			Mainframe_GlobalFunctionLib.sendText("06", "077", subflag);
			Mainframe_GlobalFunctionLib.pressKey("PageDown");
			TimeUnit.SECONDS.sleep(10);
			Mainframe_GlobalFunctionLib.sendText("12", "061", businessType);
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.pressKey("PageUp");
			Mainframe_GlobalFunctionLib.pressKey("F12");
			}else
			{
				Mainframe_GlobalFunctionLib.pressKey("F12");
			}
			
			//Create new account
				Thread.sleep(5000);
				//Mainframe_GlobalFunctionLib.sendText("04", "006", carrierID);
				//Mainframe_GlobalFunctionLib.pressKey("Enter");
					Mainframe_GlobalFunctionLib.sendText("10", "002", "7");
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					
					if(!(FunctionalLibrary.func_SearchAndSelectADataEditMode("6,5" ,accountID ,"11,5" , accountID))){
						
						Mainframe_GlobalFunctionLib.pressKey("F6");
						
						Mainframe_GlobalFunctionLib.sendText(15, 32, accountID);
						Mainframe_GlobalFunctionLib.pressKey("Enter");	
						Mainframe_GlobalFunctionLib.sendText(6, 27, accountName);
						Mainframe_GlobalFunctionLib.pressKey("Enter");
					}
					else
					{
						Mainframe_GlobalFunctionLib.pressKey("F12");
					}
			
			//Create new group
					Thread.sleep(5000);
					//Mainframe_GlobalFunctionLib.sendText("06","005",accountID);
					//Mainframe_GlobalFunctionLib.pressKey("Enter");
					Mainframe_GlobalFunctionLib.sendText("11", "002", "7");
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					if(!(FunctionalLibrary.func_SearchAndSelectADataEditMode("7,4" ,groupID ,"12,4" , groupID))){
					
						Mainframe_GlobalFunctionLib.pressKey("F6");				
						Mainframe_GlobalFunctionLib.sendText(16, 15, groupID);
						Mainframe_GlobalFunctionLib.pressKey("Enter");					
						Mainframe_GlobalFunctionLib.sendText(7, 27, groupName);
						Mainframe_GlobalFunctionLib.sendText(17, 2, gFromDate);
						//Mainframe_GlobalFunctionLib.Transmit();
						
						Mainframe_GlobalFunctionLib.sendText(17, 12, gThruDate);
						//Mainframe_GlobalFunctionLib.Transmit();
						Mainframe_GlobalFunctionLib.sendText("17", "022","*MEMBER");
						Mainframe_GlobalFunctionLib.pressKey("Enter");
						Mainframe_GlobalFunctionLib.sendText("16", "064", "Y");
						Mainframe_GlobalFunctionLib.pressKey("F12");
						Thread.sleep(2000);
						Mainframe_GlobalFunctionLib.sendText("12", "002", "5");				
						//Mainframe_GlobalFunctionLib.Transmit();
						Mainframe_GlobalFunctionLib.pressKey("Enter");		
			
	}
}
	
	@When("^I create new subrogation CAG with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_create_new_subrogation_CAG_with(String carrierID, String carrierName, String processor, String mail, String city, String state, String zip, String contractFromDate, String contractThruDate, String contractEnt, String businessType,String accountID,String accountName ,String groupID,String groupName,String gFromDate,String gThruDate, String subflag, String plancode) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		try {
			FunctionalLibrary.navigateToRxClaimPlanAdministrator();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		FunctionalLibrary.navigateToScreen("1");
		FunctionalLibrary.navigateToScreen("1");
		FunctionalLibrary.navigateToScreen("1");
		
		if(!(FunctionalLibrary.func_SearchAndSelectADataEditMode("4,6" ,carrierID ,"10,6" , carrierID))){
			Mainframe_GlobalFunctionLib.pressKey("F6");
			
			Mainframe_GlobalFunctionLib.sendText("13", "014", carrierID);
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			
			Mainframe_GlobalFunctionLib.sendText("04", "024", carrierName);
			Mainframe_GlobalFunctionLib.sendText("05", "012", processor);
			Mainframe_GlobalFunctionLib.sendText("011", "015", mail);
			Mainframe_GlobalFunctionLib.sendText("12", "015", city);
			Mainframe_GlobalFunctionLib.sendText("12", "047", state);
			Mainframe_GlobalFunctionLib.sendText("12", "056", zip);
                                
			Mainframe_GlobalFunctionLib.sendText("19", "027", contractFromDate);
			Mainframe_GlobalFunctionLib.sendText("19", "042", contractThruDate);
			Mainframe_GlobalFunctionLib.sendText("19", "065", contractEnt);
			Mainframe_GlobalFunctionLib.pressKey("Enter");
            
			Mainframe_GlobalFunctionLib.pressKey("F15");
			Mainframe_GlobalFunctionLib.sendText("06", "077", subflag);
			Mainframe_GlobalFunctionLib.pressKey("PageDown");
			TimeUnit.SECONDS.sleep(10);
			Mainframe_GlobalFunctionLib.sendText("12", "061", businessType);
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.pressKey("PageUp");
			Mainframe_GlobalFunctionLib.pressKey("F12");
			}else
			{
				Mainframe_GlobalFunctionLib.pressKey("F12");
			}
			
			//Create new account
				Thread.sleep(5000);
				//Mainframe_GlobalFunctionLib.sendText("04", "006", carrierID);
				//Mainframe_GlobalFunctionLib.pressKey("Enter");
					Mainframe_GlobalFunctionLib.sendText("10", "002", "7");
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					
					if(!(FunctionalLibrary.func_SearchAndSelectADataEditMode("6,5" ,accountID ,"11,5" , accountID))){
						
						Mainframe_GlobalFunctionLib.pressKey("F6");
						
						Mainframe_GlobalFunctionLib.sendText(15, 32, accountID);
						Mainframe_GlobalFunctionLib.pressKey("Enter");	
						Mainframe_GlobalFunctionLib.sendText(6, 27, accountName);
						Mainframe_GlobalFunctionLib.pressKey("Enter");
					}
					else
					{
						Mainframe_GlobalFunctionLib.pressKey("F12");
					}
			
			//Create new group
					Thread.sleep(5000);
					//Mainframe_GlobalFunctionLib.sendText("06","005",accountID);
					//Mainframe_GlobalFunctionLib.pressKey("Enter");
					Mainframe_GlobalFunctionLib.sendText("11", "002", "7");
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					if(!(FunctionalLibrary.func_SearchAndSelectADataEditMode("7,4" ,groupID ,"12,4" , groupID))){
					
						Mainframe_GlobalFunctionLib.pressKey("F6");				
						Mainframe_GlobalFunctionLib.sendText(16, 15, groupID);
						Mainframe_GlobalFunctionLib.pressKey("Enter");					
						Mainframe_GlobalFunctionLib.sendText(7, 27, groupName);
						Mainframe_GlobalFunctionLib.sendText(17, 2, gFromDate);
						//Mainframe_GlobalFunctionLib.Transmit();
						
						Mainframe_GlobalFunctionLib.sendText(17, 12, gThruDate);
						//Mainframe_GlobalFunctionLib.Transmit();
						Mainframe_GlobalFunctionLib.sendText("17", "022",plancode);
						Mainframe_GlobalFunctionLib.pressKey("Enter");
						Mainframe_GlobalFunctionLib.sendText("16", "064", "Y");
						Mainframe_GlobalFunctionLib.pressKey("F12");
						Thread.sleep(2000);
						Mainframe_GlobalFunctionLib.sendText("12", "002", "5");				
						//Mainframe_GlobalFunctionLib.Transmit();
						Mainframe_GlobalFunctionLib.pressKey("Enter");		
			
	} 
	}

	@Then("^I create Payee with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_create_Payee_with(String payee, String name, String carrier, String account, String group) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Mainframe_GlobalFunctionLib.sendText("04", "010", payee);	
		Mainframe_GlobalFunctionLib.sendText("05", "010", name);
		Mainframe_GlobalFunctionLib.sendText("06", "010", carrier);
		Mainframe_GlobalFunctionLib.sendText("07", "010", account);
		Mainframe_GlobalFunctionLib.sendText("08", "010", group);
		Mainframe_GlobalFunctionLib.pressKey("Enter");	
		Mainframe_GlobalFunctionLib.sendText("11", "010", "Optum");
		Mainframe_GlobalFunctionLib.sendText("13", "010", "Hyd");
		Mainframe_GlobalFunctionLib.sendText("13", "044", "CA");
		Mainframe_GlobalFunctionLib.sendText("13", "053", "12345");
		Mainframe_GlobalFunctionLib.pressKey("Enter");	
		TimeUnit.SECONDS.sleep(10);
		Mainframe_GlobalFunctionLib.sendText("04", "005", payee);	
		Mainframe_GlobalFunctionLib.pressKey("Enter");	
		Mainframe_GlobalFunctionLib.sendText("10", "002", "5");	
		Mainframe_GlobalFunctionLib.pressKey("Enter");	
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");
	}	
	

@Then("^I create medicaid subrogation profile with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
public void i_create_medicaid_subrogation_profile_with(String ProfileID, String Description, String SDWD, String MCSDWD, String Code, String payee) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	//String data = Mainframe_GlobalFunctionLib.getText(8,37);
	Mainframe_GlobalFunctionLib.sendText("04", "005",ProfileID);
	Mainframe_GlobalFunctionLib.pressKey("Enter");	
	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	String msg = Mainframe_GlobalFunctionLib.getText(24,2);
	
	if(msg.equals(""))
	{
		
		
		Mainframe_GlobalFunctionLib.sendText("09", "002","2");
		Mainframe_GlobalFunctionLib.pressKey("Enter");	
		Mainframe_GlobalFunctionLib.sendText("17", "041",Code);
		Mainframe_GlobalFunctionLib.pressKey("Enter");	
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("F12");
		TimeUnit.SECONDS.sleep(3);
		Mainframe_GlobalFunctionLib.sendText("09", "002","7");
		Mainframe_GlobalFunctionLib.pressKey("Enter");	
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		
	}
	else{
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Mainframe_GlobalFunctionLib.sendText("14", "019",ProfileID);
		Mainframe_GlobalFunctionLib.sendText("14", "035",Description);
		Mainframe_GlobalFunctionLib.pressKey("Enter");	
		Mainframe_GlobalFunctionLib.sendText("11", "041",SDWD);
		Mainframe_GlobalFunctionLib.sendText("15", "041",MCSDWD);
		Mainframe_GlobalFunctionLib.sendText("17", "041",Code);
		Mainframe_GlobalFunctionLib.pressKey("Enter");	
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		//Payee Add
		Mainframe_GlobalFunctionLib.pressKey("F7");
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Mainframe_GlobalFunctionLib.click(7, 12);
		Mainframe_GlobalFunctionLib.pressKey("F4");
		Mainframe_GlobalFunctionLib.sendText("03", "006",payee);
		Mainframe_GlobalFunctionLib.pressKey("Enter");	
		Mainframe_GlobalFunctionLib.sendText("08", "002","1");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("Enter");	
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("F12");	
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F3");
	}
}

@Then("^I create payee override claim with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
public void i_create_payee_override_claim_with(String BIN, String PCN, String Group, String Pharmacy, String RxNo, String Refill, String MemberID, String Payee, String Code, String ProductID, String DspQty, String DS, String PSC, String Cost, String Fee, String UCW, String Type, String PANum) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	FunctionalLibrary.navigateToScreen("3");
	FunctionalLibrary.navigateToScreen("2");
	FunctionalLibrary.navigateToScreen("10");
	Mainframe_GlobalFunctionLib.pressKey("F6");
	Mainframe_GlobalFunctionLib.sendText("11", "014",BIN);
	Mainframe_GlobalFunctionLib.sendText("11", "041",PCN);
	Mainframe_GlobalFunctionLib.sendText("11", "059",Group);
	Mainframe_GlobalFunctionLib.sendText("12", "014",Pharmacy);
	Mainframe_GlobalFunctionLib.sendText("12", "041",RxNo);
	Mainframe_GlobalFunctionLib.sendText("12", "059",Refill);
	Mainframe_GlobalFunctionLib.sendText("14", "041",MemberID);
	Mainframe_GlobalFunctionLib.sendText("16", "020",Payee);
	Mainframe_GlobalFunctionLib.sendText("17", "026",Code);
	Mainframe_GlobalFunctionLib.pressKey("Enter");	
	TimeUnit.SECONDS.sleep(10);
	Mainframe_GlobalFunctionLib.sendText("08", "012","AUTOMEM");
	Mainframe_GlobalFunctionLib.sendText("08", "030","AUTOMEM");
	Mainframe_GlobalFunctionLib.sendText("09", "012","12251987");
	Mainframe_GlobalFunctionLib.sendText("11", "020",ProductID);
	Mainframe_GlobalFunctionLib.sendText("12", "011",DspQty);
	Mainframe_GlobalFunctionLib.sendText("12", "026",DS);
	Mainframe_GlobalFunctionLib.sendText("14", "006",PSC);
	Mainframe_GlobalFunctionLib.sendText("17", "019",Type);
	Mainframe_GlobalFunctionLib.sendText("17", "026",PANum);
	Mainframe_GlobalFunctionLib.sendText("10", "047",Cost);
	Mainframe_GlobalFunctionLib.sendText("11", "047",Fee);
	Mainframe_GlobalFunctionLib.sendText("20", "047",UCW);
	Mainframe_GlobalFunctionLib.pressKey("PageDown");	
	TimeUnit.SECONDS.sleep(10);
	Mainframe_GlobalFunctionLib.click(4, 55);
	Mainframe_GlobalFunctionLib.sendText("04", "055","5");
	Mainframe_GlobalFunctionLib.pressKey("Enter");	
	Mainframe_GlobalFunctionLib.pressKey("F6");	
	Mainframe_GlobalFunctionLib.pressKey("F7");	
	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
}

@Then("^I create a Carrier List with \"([^\"]*)\"$")
public void i_create_a_Carrier_List_with(String carrierid) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	Mainframe_GlobalFunctionLib.sendText("04", "005",carrierid);
	Mainframe_GlobalFunctionLib.pressKey("Enter");	
	String carrierlist = Mainframe_GlobalFunctionLib.getText(10,5);
	if(carrierlist.equals(carrierid))
	{
		
		Mainframe_GlobalFunctionLib.sendText("10", "002","7");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");
	}
	else
	{
	Mainframe_GlobalFunctionLib.pressKey("F6");	
	Mainframe_GlobalFunctionLib.sendText("11", "018",carrierid);
	Mainframe_GlobalFunctionLib.sendText("12", "018","Testing");
	Mainframe_GlobalFunctionLib.pressKey("Enter");	
	TimeUnit.SECONDS.sleep(3);
	Mainframe_GlobalFunctionLib.sendText("04", "005",carrierid);
	Mainframe_GlobalFunctionLib.pressKey("Enter");	
	Mainframe_GlobalFunctionLib.sendText("10", "002","7");
	Mainframe_GlobalFunctionLib.pressKey("Enter");	
	Mainframe_GlobalFunctionLib.pressKey("F6");	
	Mainframe_GlobalFunctionLib.click(16,11);
	Mainframe_GlobalFunctionLib.pressKey("F4");
	Mainframe_GlobalFunctionLib.sendText("04", "006",carrierid);
	Mainframe_GlobalFunctionLib.pressKey("Enter");
	Mainframe_GlobalFunctionLib.sendText("09", "002","1");
	Mainframe_GlobalFunctionLib.pressKey("Enter");
	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	Mainframe_GlobalFunctionLib.pressKey("F3");
	Mainframe_GlobalFunctionLib.pressKey("F12");
	Mainframe_GlobalFunctionLib.pressKey("F12");
	}
}

@Then("^I edit the subrogation profile with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
public void i_edit_the_subrogation_profile_with(String profileid, String flag, String carrierid) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	Mainframe_GlobalFunctionLib.sendText("04", "005",profileid);
	Mainframe_GlobalFunctionLib.pressKey("Enter");
	Mainframe_GlobalFunctionLib.sendText("09", "002","2");
	Mainframe_GlobalFunctionLib.pressKey("Enter");
	TimeUnit.SECONDS.sleep(3);
	Mainframe_GlobalFunctionLib.sendText("17", "041",flag);
	String carrier = Mainframe_GlobalFunctionLib.getText(18, 30);
	if(carrier.equals(""))
	{
		Mainframe_GlobalFunctionLib.sendText("18", "030",carrierid);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());	
	}
	else
	{
		Mainframe_GlobalFunctionLib.click(18, 30);
		Robot ro = new Robot();
		for(int j=0;j<11;j++)
		{
		ro.keyPress(KeyEvent.VK_DELETE);
		ro.keyRelease(KeyEvent.VK_DELETE);
		}
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());	
	}
	Mainframe_GlobalFunctionLib.pressKey("F12");
	Mainframe_GlobalFunctionLib.pressKey("F12");
}

@Then("^I create payee claim with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
public void i_create_payee_claim_with(String RxNo, String Payee, String SubrogationFlag, String ProductID, String DspQty, String DS, String PSC, String Cost, String Fee, String MemberID, String Type, String PANum) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	FunctionalLibrary.navigateToScreen("3");
	FunctionalLibrary.navigateToScreen("2");
	FunctionalLibrary.navigateToScreen("10");
	Mainframe_GlobalFunctionLib.sendText("04", "004",MemberID);
	Mainframe_GlobalFunctionLib.pressKey("Enter");
	Mainframe_GlobalFunctionLib.sendText("09", "002","1");
	Mainframe_GlobalFunctionLib.pressKey("Enter");
	Mainframe_GlobalFunctionLib.sendText("13", "021",Payee);
	Mainframe_GlobalFunctionLib.sendText("16", "026",SubrogationFlag);
	Mainframe_GlobalFunctionLib.pressKey("Enter");
	Mainframe_GlobalFunctionLib.sendText("16", "064","Y");
	TimeUnit.SECONDS.sleep(4);
	Mainframe_GlobalFunctionLib.sendText("05", "024",RxNo);
	final DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
	Date currdate = new Date();
	String currentdate = dateFormat.format(currdate);
	String curr_date = currentdate.replace("/","");
	Mainframe_GlobalFunctionLib.sendText("04", "053",curr_date);
	Mainframe_GlobalFunctionLib.click(4,61);
	Robot r=new Robot();
	for(int i=0;i<3;i++)
	{
		r.keyPress(KeyEvent.VK_DELETE);
		r.keyRelease(KeyEvent.VK_DELETE);
	}
	Mainframe_GlobalFunctionLib.sendText("11", "020",ProductID);
	//Mainframe_GlobalFunctionLib.sendText("12", "011",DspQty);
	//Mainframe_GlobalFunctionLib.sendText("12", "026",DS);
	Mainframe_GlobalFunctionLib.sendText("14", "006",PSC);
	Mainframe_GlobalFunctionLib.sendText("17", "019",Type);
	Mainframe_GlobalFunctionLib.sendText("17", "026",PANum);
	Mainframe_GlobalFunctionLib.sendText("10", "051",Cost);
	Mainframe_GlobalFunctionLib.sendText("11", "051",Fee);
	Mainframe_GlobalFunctionLib.pressKey("PageDown");	
	TimeUnit.SECONDS.sleep(10);
	Mainframe_GlobalFunctionLib.click(4, 55);
	Mainframe_GlobalFunctionLib.sendText("04", "055","5");
	Mainframe_GlobalFunctionLib.pressKey("Enter");	
	Mainframe_GlobalFunctionLib.pressKey("F6");	
	Mainframe_GlobalFunctionLib.pressKey("F7");	
	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
}

@Then("^I enter Part D plan with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
public void i_enter_Part_D_plan_with(String fdate, String tdate, String plancode) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	Mainframe_GlobalFunctionLib.pressKey("F7");	
	Mainframe_GlobalFunctionLib.pressKey("F6");	
	Mainframe_GlobalFunctionLib.sendText("10", "014",fdate);
	Mainframe_GlobalFunctionLib.sendText("10", "038",tdate);
	Mainframe_GlobalFunctionLib.click(12,14);
	Mainframe_GlobalFunctionLib.pressKey("F4");	
	Mainframe_GlobalFunctionLib.sendText("04", "005",plancode);
	Mainframe_GlobalFunctionLib.pressKey("Enter");
	Mainframe_GlobalFunctionLib.sendText("10", "002","1");
	Mainframe_GlobalFunctionLib.pressKey("Enter");
	Mainframe_GlobalFunctionLib.pressKey("Enter");
	Mainframe_GlobalFunctionLib.pressKey("F12");
	Mainframe_GlobalFunctionLib.pressKey("F12");	
	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
}

@Then("^Validating the Plan details with \"([^\"]*)\",\"([^\"]*)\"$")
public void validating_the_Plan_details_with(String plancode, String plancode1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	Mainframe_GlobalFunctionLib.sendText("04", "005",plancode);
	Mainframe_GlobalFunctionLib.pressKey("Enter");
	Mainframe_GlobalFunctionLib.sendText("11", "002","5");
	Mainframe_GlobalFunctionLib.pressKey("Enter");
	Mainframe_GlobalFunctionLib.pressKey("F7");
	Mainframe_GlobalFunctionLib.sendText("07", "021","29");
	Mainframe_GlobalFunctionLib.pressKey("Enter");
	Mainframe_GlobalFunctionLib.sendText("15", "012","6");
	Mainframe_GlobalFunctionLib.pressKey("Enter");
	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	Mainframe_GlobalFunctionLib.pressKey("F3");
	Mainframe_GlobalFunctionLib.pressKey("F12");
	Mainframe_GlobalFunctionLib.pressKey("F12");
	Mainframe_GlobalFunctionLib.sendText("04", "005",plancode1);
	Mainframe_GlobalFunctionLib.pressKey("Enter");
	Mainframe_GlobalFunctionLib.sendText("11", "002","2");
	Mainframe_GlobalFunctionLib.pressKey("Enter");
	TimeUnit.SECONDS.sleep(10);
	Mainframe_GlobalFunctionLib.sendText("14", "077","Y");
	Mainframe_GlobalFunctionLib.pressKey("Enter");
	Mainframe_GlobalFunctionLib.sendText("16", "064","Y");
	TimeUnit.SECONDS.sleep(10);
	Mainframe_GlobalFunctionLib.pressKey("F7");
	Mainframe_GlobalFunctionLib.sendText("07", "021","29");
	Mainframe_GlobalFunctionLib.pressKey("Enter");
	Mainframe_GlobalFunctionLib.sendText("15", "012","6");
	Mainframe_GlobalFunctionLib.pressKey("Enter");
	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	Mainframe_GlobalFunctionLib.pressKey("F12");
	Mainframe_GlobalFunctionLib.pressKey("F12");
	Mainframe_GlobalFunctionLib.pressKey("F12");
	Mainframe_GlobalFunctionLib.sendText("14", "077","N");
	Mainframe_GlobalFunctionLib.pressKey("Enter");
	Mainframe_GlobalFunctionLib.sendText("16", "064","Y");
	Mainframe_GlobalFunctionLib.pressKey("F12");
	Mainframe_GlobalFunctionLib.pressKey("F12");
	Mainframe_GlobalFunctionLib.pressKey("F12");
}

@Then("^Validate the Plan details with \"([^\"]*)\",\"([^\"]*)\"$")
public void validate_the_Plan_details_with(String plancode, String plancode1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	Mainframe_GlobalFunctionLib.sendText("04", "005",plancode);
	Mainframe_GlobalFunctionLib.pressKey("Enter");
	Mainframe_GlobalFunctionLib.sendText("11", "002","5");
	Mainframe_GlobalFunctionLib.pressKey("Enter");
	Mainframe_GlobalFunctionLib.pressKey("F7");
	Mainframe_GlobalFunctionLib.sendText("07", "021","29");
	Mainframe_GlobalFunctionLib.pressKey("Enter");
	Mainframe_GlobalFunctionLib.sendText("15", "012","6");
	Mainframe_GlobalFunctionLib.pressKey("Enter");
	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	Mainframe_GlobalFunctionLib.pressKey("F3");
	Mainframe_GlobalFunctionLib.pressKey("F12");
	Mainframe_GlobalFunctionLib.pressKey("F12");
	Mainframe_GlobalFunctionLib.click(4,5);
	Robot f = new Robot();
	for(int i=0;i<11;i++)
	{
		f.keyPress(KeyEvent.VK_DELETE);
		f.keyRelease(KeyEvent.VK_DELETE);
	}
	Mainframe_GlobalFunctionLib.sendText("04", "005",plancode1);
	Mainframe_GlobalFunctionLib.pressKey("Enter");
	Mainframe_GlobalFunctionLib.sendText("11", "002","5");
	Mainframe_GlobalFunctionLib.pressKey("Enter");
	Mainframe_GlobalFunctionLib.pressKey("F7");
	Mainframe_GlobalFunctionLib.sendText("07", "021","29");
	Mainframe_GlobalFunctionLib.pressKey("Enter");
	Mainframe_GlobalFunctionLib.sendText("15", "012","6");
	Mainframe_GlobalFunctionLib.pressKey("Enter");
	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	Mainframe_GlobalFunctionLib.pressKey("F3");
	Mainframe_GlobalFunctionLib.pressKey("F12");
	Mainframe_GlobalFunctionLib.pressKey("F12");
	Mainframe_GlobalFunctionLib.pressKey("F12");
}



@Then("^I Validate the Group and Member details with \"([^\"]*)\" and \"([^\"]*)\"$")
public void i_Validate_the_Group_and_Member_details_with_and(String groupid, String memberid) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	Mainframe_GlobalFunctionLib.sendText("21", "007","1");
	Mainframe_GlobalFunctionLib.pressKey("Enter");
	Mainframe_GlobalFunctionLib.sendText("21", "007","1");
	Mainframe_GlobalFunctionLib.pressKey("Enter");
	Mainframe_GlobalFunctionLib.sendText("21", "007","3");
	Mainframe_GlobalFunctionLib.pressKey("Enter");
	Mainframe_GlobalFunctionLib.sendText("04", "004",groupid);
	Mainframe_GlobalFunctionLib.pressKey("Enter");
	Mainframe_GlobalFunctionLib.sendText("09", "002","5");
	Mainframe_GlobalFunctionLib.pressKey("Enter");
	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	Mainframe_GlobalFunctionLib.pressKey("F12");
	Mainframe_GlobalFunctionLib.sendText("09", "002","7");
	Mainframe_GlobalFunctionLib.pressKey("Enter");
	Mainframe_GlobalFunctionLib.sendText("07", "004",memberid);
	Mainframe_GlobalFunctionLib.pressKey("Enter");
	String memid = Mainframe_GlobalFunctionLib.getText(12, 4).trim();
	if(memid.equals(memberid))
	{
		Mainframe_GlobalFunctionLib.sendText("12", "002","5");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	}
	Mainframe_GlobalFunctionLib.pressKey("F3");
	Mainframe_GlobalFunctionLib.pressKey("F12");
	
}

}