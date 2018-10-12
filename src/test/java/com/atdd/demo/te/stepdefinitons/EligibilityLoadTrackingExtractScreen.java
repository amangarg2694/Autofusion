package com.atdd.demo.te.stepdefinitons;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import com.atdd.te.screenHelpers.FunctionalLibrary;
import com.cucumber.listener.Reporter;
import com.optumrx.autofusion.core.te.util.Mainframe_GlobalFunctionLib;
import com.optumrx.autofusion.core.te.util.Screenshot;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EligibilityLoadTrackingExtractScreen {
	/*
	@Then("^I create Deductible and OOP schedule with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_create_Deductible_and_OOP_schedule_with(String Schedule, String ScheduleDesc, String Basis, String StepNo, String DedCompCode, String OOPCompCode, String Ind, String Family, String MaxInd, String MaxFamily, String BrandCopay, String GenericCopay, String PercentBasis) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		//Deductible Schedule
		FunctionalLibrary.navigateToScreen("1");
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Mainframe_GlobalFunctionLib.sendText(5, 14,Schedule );
		Mainframe_GlobalFunctionLib.sendText(5, 28,ScheduleDesc );
		Mainframe_GlobalFunctionLib.sendText(7, 14,Basis );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(4, 5,Schedule );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(10,2,"7" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Mainframe_GlobalFunctionLib.sendText(9,14,StepNo );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(8,24,DedCompCode );
		Mainframe_GlobalFunctionLib.sendText(10,24,Ind );
		Mainframe_GlobalFunctionLib.sendText(11,24,Family );
		Mainframe_GlobalFunctionLib.sendText(12,24,"B" );
		Mainframe_GlobalFunctionLib.sendText(14,26,BrandCopay );
		Mainframe_GlobalFunctionLib.sendText(14,46,GenericCopay );
		Mainframe_GlobalFunctionLib.sendText(15,24,PercentBasis );
		Mainframe_GlobalFunctionLib.sendText(16,24,"D" );
		Mainframe_GlobalFunctionLib.sendText(20,24,"Y" );
		Mainframe_GlobalFunctionLib.sendText(20,68,"1" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		
		int stepnum = Integer.parseInt(StepNo);
		int steps = stepnum +1;
		String stepnumb = String.valueOf(steps);
		
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Mainframe_GlobalFunctionLib.sendText(9,14,stepnumb );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(8,24,DedCompCode );
		Mainframe_GlobalFunctionLib.sendText(10,24,MaxInd );
		Mainframe_GlobalFunctionLib.sendText(11,24,MaxFamily );
		Mainframe_GlobalFunctionLib.sendText(12,24,"N" );
		Mainframe_GlobalFunctionLib.sendText(16,24,"C" );
		Mainframe_GlobalFunctionLib.sendText(20,24,"N" );
		Mainframe_GlobalFunctionLib.sendText(20,68,"N" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		
		//OOP Schedule
		FunctionalLibrary.navigateToScreen("2");
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Mainframe_GlobalFunctionLib.sendText(5, 14,Schedule );
		Mainframe_GlobalFunctionLib.sendText(5, 28,ScheduleDesc );
		Mainframe_GlobalFunctionLib.sendText(7, 14,Basis );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(4, 5,Schedule );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(10,2,"7" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Mainframe_GlobalFunctionLib.sendText(9,14,StepNo );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(8,23,OOPCompCode );
		Mainframe_GlobalFunctionLib.sendText(10,23,Ind );
		Mainframe_GlobalFunctionLib.sendText(11,23,Family );
		Mainframe_GlobalFunctionLib.sendText(12,23,"Y" );
		Mainframe_GlobalFunctionLib.sendText(16,23,"C" );
		Mainframe_GlobalFunctionLib.sendText(19,23,"Y" );
		Mainframe_GlobalFunctionLib.sendText(19,66,"2" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Mainframe_GlobalFunctionLib.sendText(9,14,stepnumb );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(8,23,OOPCompCode );
		Mainframe_GlobalFunctionLib.sendText(10,23,MaxInd );
		Mainframe_GlobalFunctionLib.sendText(11,23,MaxFamily );
		Mainframe_GlobalFunctionLib.sendText(12,23,"3" );
		Mainframe_GlobalFunctionLib.sendText(16,23,"C" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");
	}
	*/
	/*
	@Then("^Adding the deductible OOP and accumulator sequencing with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void adding_the_deductible_OOP_and_accumulator_sequencing_with(String fdate, String tdate, String schedule, String oop, String bmx) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.sendText(7,21,"29" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		//Deductible
		Mainframe_GlobalFunctionLib.sendText(15,12,"1" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(11,2,"4" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(16,64,"Y" );
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Mainframe_GlobalFunctionLib.sendText(7,13,fdate);
		Mainframe_GlobalFunctionLib.sendText(7,41,tdate);
		Mainframe_GlobalFunctionLib.sendText(9,29,"C");
		Mainframe_GlobalFunctionLib.sendText(14,29,schedule);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("F12");
		//OOP
		Mainframe_GlobalFunctionLib.sendText(15,12,"2" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(11,2,"4" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(16,64,"Y" );
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Mainframe_GlobalFunctionLib.sendText(7,13,fdate);
		Mainframe_GlobalFunctionLib.sendText(7,41,tdate);
		Mainframe_GlobalFunctionLib.sendText(9,29,"C");
		Mainframe_GlobalFunctionLib.sendText(14,29,schedule);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("F12");
		//Accumulator Sequencing
		Mainframe_GlobalFunctionLib.sendText(15,12,"5" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Mainframe_GlobalFunctionLib.sendText(7,12,fdate);
		Mainframe_GlobalFunctionLib.sendText(7,38,tdate);
		Mainframe_GlobalFunctionLib.sendText(8,18,oop);
		Mainframe_GlobalFunctionLib.sendText(9,18,bmx);
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F12");
	}
	*/
	/*
	@Then("^create cardholder member with \"([^\"]*)\">,\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void create_cardholder_member_with(String fname, String lname, String DOB, String FamilyID, String frdate, String todate, String plancode) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.sendText(6,29,fname);
		Mainframe_GlobalFunctionLib.sendText(6,57,lname);
		Mainframe_GlobalFunctionLib.sendText(7,10,"001");
		Mainframe_GlobalFunctionLib.sendText(7,18,"1");
		Mainframe_GlobalFunctionLib.sendText(7,40,DOB);
		Mainframe_GlobalFunctionLib.sendText(14,27,FamilyID);
		Mainframe_GlobalFunctionLib.sendText(20,2,frdate);
		Mainframe_GlobalFunctionLib.sendText(20,12,todate);
		Mainframe_GlobalFunctionLib.sendText(20,22,plancode);
		Mainframe_GlobalFunctionLib.sendText(16,64,"Y");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	}
	*/
	
/*
	@When("^I submit a claim with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_submit_a_claim_with(String bin, String proc, String group, String pharmacyID, String rxNbr, String refill, String fillDate, String memberID, String productID, String dspQty, String ds, String psc, String cost, String fee, String due, String ucw) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		try {
			FunctionalLibrary.navigateToRxClaimPlanAdministrator();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		FunctionalLibrary.navigateToScreen("3");
		FunctionalLibrary.navigateToScreen("2");
		FunctionalLibrary.navigateToScreen("1");
		
		if(!(FunctionalLibrary.func_SearchAndSelectADataEditMode("4,4" ,memberID ,"9,4" , memberID))){
			
			Mainframe_GlobalFunctionLib.pressKey("F6");
			Mainframe_GlobalFunctionLib.sendText(11, 14,bin );
			Mainframe_GlobalFunctionLib.sendText(11, 41,proc );
			Mainframe_GlobalFunctionLib.sendText(11, 59,group );
			Mainframe_GlobalFunctionLib.sendText(12, 14,pharmacyID );
			Mainframe_GlobalFunctionLib.sendText(12, 41,rxNbr );
			Mainframe_GlobalFunctionLib.sendText(12, 59,refill );
			Mainframe_GlobalFunctionLib.sendText(14, 41,memberID );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Thread.sleep(4000);
			//Mainframe_GlobalFunctionLib.click(7, 12 );
			//Mainframe_GlobalFunctionLib.pressKey("F4");
			//Thread.sleep(1000);
			//Mainframe_GlobalFunctionLib.sendText(3, 4, memberID);
			//Mainframe_GlobalFunctionLib.pressKey("Enter");
			//Mainframe_GlobalFunctionLib.sendText(8, 2,"1" );
			//Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText("04" , "065" ,"          ");
			Mainframe_GlobalFunctionLib.sendText("04", "065", fillDate);			
			Mainframe_GlobalFunctionLib.sendText("11", "020",productID );
			Mainframe_GlobalFunctionLib.sendText("12", "011",dspQty );
			Mainframe_GlobalFunctionLib.sendText("12", "026",ds );
			Mainframe_GlobalFunctionLib.sendText("14", "006",psc );
			Mainframe_GlobalFunctionLib.sendText("10", "047","         " );
			Mainframe_GlobalFunctionLib.sendText("10", "047",cost );
			Mainframe_GlobalFunctionLib.sendText("11", "047","         " );
			Mainframe_GlobalFunctionLib.sendText("11", "047",fee);
			Mainframe_GlobalFunctionLib.sendText("19", "047","         " );
			Mainframe_GlobalFunctionLib.sendText("19", "047",due );
			Mainframe_GlobalFunctionLib.sendText("20", "047","         " );
			Mainframe_GlobalFunctionLib.sendText("20", "047",ucw );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			
		}
		else{
			
		Mainframe_GlobalFunctionLib.sendText("09", "002","1" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Thread.sleep(1000);
		Mainframe_GlobalFunctionLib.click(4, 29 );
			Mainframe_GlobalFunctionLib.sendText("04", "029", pharmacyID);
			///Thread.sleep(3000);
			Mainframe_GlobalFunctionLib.sendText("04" , "065" ,"          ");
			Mainframe_GlobalFunctionLib.sendText("04" , "065", fillDate);
			Mainframe_GlobalFunctionLib.sendText("05","029", rxNbr);
			Mainframe_GlobalFunctionLib.sendText("05", "047", refill);			
			//Mainframe_GlobalFunctionLib.click(7, 12 );
			Mainframe_GlobalFunctionLib.sendText("07", "012", memberID);
			//Mainframe_GlobalFunctionLib.pressKey("F4");
			//Mainframe_GlobalFunctionLib.sendText(3, 4, memberID);
			//Mainframe_GlobalFunctionLib.pressKey("Enter");         
			//Mainframe_GlobalFunctionLib.sendText(8, 2,"1" );
			//Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText("11", "020",productID );
			Mainframe_GlobalFunctionLib.sendText("12", "011","           " );
			Mainframe_GlobalFunctionLib.sendText("12", "011",dspQty );
			Mainframe_GlobalFunctionLib.sendText("12", "026","   " );
			Mainframe_GlobalFunctionLib.sendText("12", "026",ds);
			Mainframe_GlobalFunctionLib.sendText("14", "006",psc );
			Mainframe_GlobalFunctionLib.sendText("10", "047","         " );
			Mainframe_GlobalFunctionLib.sendText("10", "047",cost );
			Mainframe_GlobalFunctionLib.sendText("11", "047","         " );
			Mainframe_GlobalFunctionLib.sendText("11", "047",fee);
			Mainframe_GlobalFunctionLib.sendText("19", "047","         " );
			Mainframe_GlobalFunctionLib.sendText("19", "047",due );
			Mainframe_GlobalFunctionLib.sendText("20", "047","         " );
			Mainframe_GlobalFunctionLib.sendText("20", "047",ucw );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			 
		}
		
			System.out.println("Claim is created");	
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			Mainframe_GlobalFunctionLib.pressKey("F6");
			 Thread.sleep(2000);
			 Mainframe_GlobalFunctionLib.pressKey("F7");
			 Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			 
			 
	}
	
*/
	/*
@When("^Capturing claim number writing it to text file with \"([^\"]*)\"$")
	public void capturing_claim_number_writing_it_to_text_file_with(String memid) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		FunctionalLibrary.navigateToScreen("1");
		FunctionalLibrary.navigateToScreen("2");
		Mainframe_GlobalFunctionLib.sendText(4,4,memid );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(10,2,"5" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F10");
		Mainframe_GlobalFunctionLib.sendText(19,2,"5" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		String RxClaim_Number = Mainframe_GlobalFunctionLib.getText(3, 12);
		Path FileName = Paths.get("C:\\Users\\spriya7\\git\\RxClaim_ATDD\\src\\test\\resources\\features\\RxClaim\\featureFiles\\SR41901\\TestData.txt");
		BufferedWriter writer = Files.newBufferedWriter(FileName , StandardOpenOption.TRUNCATE_EXISTING);
		writer.write(RxClaim_Number);
		writer.close();
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		
	}
*/
	/*
@When("^Capturing claim number family member writing it to text file with \"([^\"]*)\"$")
public void capturing_claim_number_family_member_writing_it_to_text_file_with(String memid) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	FunctionalLibrary.navigateToScreen("1");
	FunctionalLibrary.navigateToScreen("2");
	Mainframe_GlobalFunctionLib.sendText(4,4,memid );
	Mainframe_GlobalFunctionLib.pressKey("Enter");
	Mainframe_GlobalFunctionLib.sendText(10,2,"5" );
	Mainframe_GlobalFunctionLib.pressKey("Enter");
	Mainframe_GlobalFunctionLib.pressKey("F10");
	Mainframe_GlobalFunctionLib.pressKey("PageDown");
	Mainframe_GlobalFunctionLib.sendText(15,2,"5" );
	Mainframe_GlobalFunctionLib.pressKey("Enter");
	String RxClaim_Number = Mainframe_GlobalFunctionLib.getText(3, 12);
	Path FileName = Paths.get("C:\\Users\\spriya7\\git\\RxClaim_ATDD\\src\\test\\resources\\features\\RxClaim\\featureFiles\\SR41901\\TestData.txt");
	BufferedWriter writer = Files.newBufferedWriter(FileName , StandardOpenOption.TRUNCATE_EXISTING);
	writer.write(RxClaim_Number);
	writer.close();
	Mainframe_GlobalFunctionLib.pressKey("F3");
	Mainframe_GlobalFunctionLib.pressKey("F3");
	Mainframe_GlobalFunctionLib.pressKey("F3");
	Mainframe_GlobalFunctionLib.pressKey("F3");
	
}
*/	
	/*
	@Then("^Validate the accumulator savings account send log file$")
	public void validate_the_accumulator_savings_account_send_log_file() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Path readFile = Paths.get("C:\\Users\\spriya7\\git\\RxClaim_ATDD\\src\\test\\resources\\features\\RxClaim\\featureFiles\\SR41901\\TestData.txt");
		String RxClaimNumber = "";
		try (BufferedReader reader = 
                 Files.newBufferedReader(readFile, StandardCharsets.UTF_8)) {
            String data;
            while ((data = reader.readLine()) != null) {
            	RxClaimNumber = data;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
		if(RxClaimNumber!="")
		{
			Mainframe_GlobalFunctionLib.sendText("04", "04",RxClaimNumber );
			 Mainframe_GlobalFunctionLib.pressKey("Enter");
			 Mainframe_GlobalFunctionLib.sendText("10", "02","7");
			 Mainframe_GlobalFunctionLib.pressKey("Enter");
			 Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		}
	}
	*/
	/*
	@Then("^Validate the accumulator information in member screen with \"([^\"]*)\"$")
	public void validate_the_accumulator_information_in_member_screen_with(String memid) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		FunctionalLibrary.navigateToScreen("1");
		FunctionalLibrary.navigateToScreen("2");
		Mainframe_GlobalFunctionLib.sendText(4,4,memid );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(10,2,"5" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F8");
		Mainframe_GlobalFunctionLib.sendText(4,20,"19" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(4,20,"1" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(10,2,"7" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(11,2,"5" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("PageDown");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.sendText(4,20,"2" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(10,2,"7" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(11,2,"5" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("PageDown");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F3");
	}
	*/
	/*
	@Then("^adding the adjustment details in the member screen with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void adding_the_adjustment_details_in_the_member_screen_with(String memid, String filldate, String code, String amttype, String type, String amt, String typea) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		FunctionalLibrary.navigateToScreen("1");
		FunctionalLibrary.navigateToScreen("2");
		Mainframe_GlobalFunctionLib.sendText(4,4,memid );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(10,2,"2" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F8");
		Mainframe_GlobalFunctionLib.sendText(4,20,"13" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(5,20,"1" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Mainframe_GlobalFunctionLib.sendText(10,24,filldate );
		Mainframe_GlobalFunctionLib.sendText(13,24,code );
		Mainframe_GlobalFunctionLib.sendText(14,24,amt );
		Mainframe_GlobalFunctionLib.sendText(15,24,amttype );
		Mainframe_GlobalFunctionLib.sendText(16,24,type );
		Mainframe_GlobalFunctionLib.pressKey("PageDown");
		Mainframe_GlobalFunctionLib.sendText(13,17,"M" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Mainframe_GlobalFunctionLib.sendText(10,24,filldate );
		Mainframe_GlobalFunctionLib.sendText(13,24,code );
		Mainframe_GlobalFunctionLib.sendText(14,24,amt );
		Mainframe_GlobalFunctionLib.sendText(15,24,amttype );
		Mainframe_GlobalFunctionLib.sendText(16,24,typea );
		Mainframe_GlobalFunctionLib.pressKey("PageDown");
		Mainframe_GlobalFunctionLib.sendText(13,17,"M" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F3");
	}
*/	
/*	
	@When("^adjudicating the claim multiple times with \"([^\"]*)\",\"([^\"]*)\"$")
	public void adjudicating_the_claim_multiple_times_with(String memid, String rxno) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		FunctionalLibrary.navigateToScreen("3");
		FunctionalLibrary.navigateToScreen("2");
		FunctionalLibrary.navigateToScreen("1");
		Mainframe_GlobalFunctionLib.sendText(4,4,memid );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(9,2,"1" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(5,29,rxno );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Mainframe_GlobalFunctionLib.pressKey("F7");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("F12");
		
		for(int i=0;i<2;i++)
		{
			String rxno1 = Mainframe_GlobalFunctionLib.getText(5, 29);
			Long rxnum = Long.parseLong(rxno1);
			Long rxnumber = rxnum+1;
			String rxnom = rxnumber.toString();
			Mainframe_GlobalFunctionLib.sendText(5,29,rxnom );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.pressKey("F6");
			Mainframe_GlobalFunctionLib.pressKey("F7");
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			Mainframe_GlobalFunctionLib.pressKey("F12");
		}
		
		String rxno2 = Mainframe_GlobalFunctionLib.getText(5, 29);
		Long rxnum1 = Long.parseLong(rxno2);
		Long rxnumber1 = rxnum1+1;
		String rxnom1 = rxnumber1.toString();
		Mainframe_GlobalFunctionLib.sendText(5,29,rxnom1 );
		Mainframe_GlobalFunctionLib.sendText("10", "047","         " );
		Mainframe_GlobalFunctionLib.sendText("10", "047","999999.99" );
		Mainframe_GlobalFunctionLib.sendText("11", "047","         " );
		Mainframe_GlobalFunctionLib.sendText("11", "047","1.5");
		Mainframe_GlobalFunctionLib.sendText("19", "047","         " );
		Mainframe_GlobalFunctionLib.sendText("19", "047","100" );
		Mainframe_GlobalFunctionLib.sendText("20", "047","         " );
		Mainframe_GlobalFunctionLib.sendText("20", "047","999999.99" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Mainframe_GlobalFunctionLib.pressKey("F7");
		
	}
	*/
	/*
	@Then("^Validating the deductible and OOP information in claim screen$")
	public void validating_the_deductible_and_OOP_information_in_claim_screen() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Path readFile = Paths.get("C:\\Users\\spriya7\\git\\RxClaim_ATDD\\src\\test\\resources\\features\\RxClaim\\featureFiles\\SR41901\\TestData.txt");
		String RxClaimNumber = "";
		try (BufferedReader reader = 
                 Files.newBufferedReader(readFile, StandardCharsets.UTF_8)) {
            String data;
            while ((data = reader.readLine()) != null) {
            	RxClaimNumber = data;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
		if(RxClaimNumber!="")
		{
			Mainframe_GlobalFunctionLib.pressKey("F8");
			Mainframe_GlobalFunctionLib.sendText(4,4,RxClaimNumber );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(10,2,"5" );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.pressKey("F7");
			Mainframe_GlobalFunctionLib.sendText(4,23,"1");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.pressKey("F10");
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			Mainframe_GlobalFunctionLib.pressKey("F10");
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			Mainframe_GlobalFunctionLib.pressKey("PageDown");
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			Mainframe_GlobalFunctionLib.pressKey("F3");
			Mainframe_GlobalFunctionLib.pressKey("F3");
			Mainframe_GlobalFunctionLib.pressKey("F3");
		}
	}
	*/
	/*
	@Then("^Validating the calculations from accumulator and communication log screen with \"([^\"]*)\",\"([^\"]*)\"$")
	public void validating_the_calculations_from_accumulator_and_communication_log_screen_with(String schedule, String memid) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		FunctionalLibrary.navigateToScreen("5");
		FunctionalLibrary.navigateToScreen("3");
		FunctionalLibrary.navigateToScreen("1");
		Mainframe_GlobalFunctionLib.sendText(4, 5, schedule);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(10, 2,"7");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		String dedsched = Mainframe_GlobalFunctionLib.getText(14, 12).trim();
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		FunctionalLibrary.navigateToScreen("2");
		Mainframe_GlobalFunctionLib.sendText(4, 5, schedule);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(10, 2,"7");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		String oopsched = Mainframe_GlobalFunctionLib.getText(15, 12).trim(); //2700.00
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		FunctionalLibrary.navigateToScreen("1");
		FunctionalLibrary.navigateToScreen("2");
		Mainframe_GlobalFunctionLib.sendText(4, 4, memid);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(10, 2, "5");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F8");
		Mainframe_GlobalFunctionLib.sendText(4, 20, "13");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(5, 20, "1");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		String adjustment = Mainframe_GlobalFunctionLib.getText(15, 66).trim();
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		FunctionalLibrary.navigateToScreen("6");
		Path readFile = Paths.get("C:\\Users\\spriya7\\git\\RxClaim_ATDD\\src\\test\\resources\\features\\RxClaim\\featureFiles\\SR41901\\TestData.txt");
		String RxClaimNumber = "";
		try (BufferedReader reader = 
                 Files.newBufferedReader(readFile, StandardCharsets.UTF_8)) {
            String data;
            while ((data = reader.readLine()) != null) {
            	RxClaimNumber = data;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
		if(RxClaimNumber!="")
		{
			Mainframe_GlobalFunctionLib.pressKey("F8");
			Mainframe_GlobalFunctionLib.sendText(4,4,RxClaimNumber );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(10,2,"5" );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.pressKey("F7");
			Mainframe_GlobalFunctionLib.sendText(4,23,"1");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
		}
		String pat = Mainframe_GlobalFunctionLib.getText(16, 32).trim();
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.sendText(21,7,"cct800");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(21,7,"13");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(21,7,"6");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F16");
		Mainframe_GlobalFunctionLib.sendText("04", "04",RxClaimNumber );
		 Mainframe_GlobalFunctionLib.pressKey("Enter");
		 Mainframe_GlobalFunctionLib.sendText("10", "02","7");
		 Mainframe_GlobalFunctionLib.pressKey("Enter");
		 String dtype = Mainframe_GlobalFunctionLib.getText(9, 2);
		 String dedtype = dtype.substring(37, 40).trim();
		 String otype = Mainframe_GlobalFunctionLib.getText(16, 2);
		 String ooptype = otype.substring(37, 40).trim();
		 String dpatamt = Mainframe_GlobalFunctionLib.getText(10, 2);
		 String dedpatamount = dpatamt.substring(48, 54).trim();
		 String opatamt = Mainframe_GlobalFunctionLib.getText(17, 2);
		 String ooppatamount = opatamt.substring(48, 54).trim();
		 String dedamt = Mainframe_GlobalFunctionLib.getText(11, 2);
		 String dedamount = dedamt.substring(12, 19).trim();
		 String oopamt = Mainframe_GlobalFunctionLib.getText(18, 2);
		 String oopamount = oopamt.substring(12, 19).trim();
		 String dclmtotal = Mainframe_GlobalFunctionLib.getText(11, 2);
		 String dedclmtotal=dclmtotal.substring(34, 41).trim();
		 String oclmtotal = Mainframe_GlobalFunctionLib.getText(18, 2);
		 String oopclmtotal=oclmtotal.substring(34, 41).trim();
		 String dadj = Mainframe_GlobalFunctionLib.getText(11, 2);
		 String dedadj=dadj.substring(70, 77).trim();
		 String oadj = Mainframe_GlobalFunctionLib.getText(18, 2);
		 String oopadj=oadj.substring(70, 77).trim();
		 
		 if(dedtype.equals("D"))
		 {
			 if(dedsched.equals(dedamount))
			 {
				 System.out.println("Deductible amount is validated properly");
				 
				 if(pat.equals(dedpatamount))
				 {
					 System.out.println("PAT for Deductible is validated properly");
					 
					 if(adjustment.equals(dedadj))
					 {
						 System.out.println("Adjustment for Deductible is validated properly");
						 Double ded = Double.parseDouble(dedsched);
						 Double adj = Double.parseDouble(adjustment);
						 Double claimtot = ded-adj;
						 String claimtotal = String.format("%.2f", claimtot);
						 if(claimtotal.equals(dedclmtotal))
						 {
							 System.out.println("Validation is successful for deductible type");
						 }
						 
					 }
				 }
			 }
		 }
		 else
		 {
			System.out.println("Validation is not successful for deductible"); 
		 }
		 
		 if(ooptype.equals("O"))
		 {
			 if(oopsched.equals(oopamount))
			 {
				 System.out.println("OOP amount is validated properly");
				 
				 if(pat.equals(ooppatamount))
				 {
					 System.out.println("PAT for OOP is validated properly");
					 
					 if(adjustment.equals(oopadj))
					 {
						 System.out.println("Adjustment for OOP is validated properly");
						 Double ded = Double.parseDouble(oopsched);
						 Double adj = Double.parseDouble(adjustment);
						 Double oclaimtot = ded-adj;
						 String oopclaimtotal = String.format("%.2f", oclaimtot);
								 
						 if(oopclaimtotal.equals(oopclmtotal))
						 {
							 System.out.println("Validation is successful for OOP type");
						 }
						 
					 }
				 }
			 } 
		 }
		 else
		 {
			 System.out.println("Validation is not successful for OOP"); 
		 }
	}
	*/
	/*
	@Then("^Validating the calculations for individual and family from accumulator and communication log screen with \"([^\"]*)\",\"([^\"]*)\"$")
	public void validating_the_calculations_for_individual_and_family_from_accumulator_and_communication_log_screen_with(String schedule, String memid) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		FunctionalLibrary.navigateToScreen("5");
		FunctionalLibrary.navigateToScreen("3");
		FunctionalLibrary.navigateToScreen("1");
		Mainframe_GlobalFunctionLib.sendText(4, 5, schedule);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(10, 2,"7");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		String dedsched = Mainframe_GlobalFunctionLib.getText(14, 12).trim();
		//String fdedsched = Mainframe_GlobalFunctionLib.getText(14, 23).trim();
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		FunctionalLibrary.navigateToScreen("2");
		Mainframe_GlobalFunctionLib.sendText(4, 5, schedule);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(10, 2,"7");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		String oopsched = Mainframe_GlobalFunctionLib.getText(15, 12).trim();//2700.00
		//String foopsched = Mainframe_GlobalFunctionLib.getText(15, 23).trim();
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		FunctionalLibrary.navigateToScreen("1");
		FunctionalLibrary.navigateToScreen("2");
		Mainframe_GlobalFunctionLib.sendText(4, 4, memid);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(10, 2, "5");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F8");
		Mainframe_GlobalFunctionLib.sendText(4, 20, "13");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(5, 20, "1");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		String adjustment = Mainframe_GlobalFunctionLib.getText(15, 66).trim();
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		FunctionalLibrary.navigateToScreen("6");
		Path readFile = Paths.get("C:\\Users\\spriya7\\git\\RxClaim_ATDD\\src\\test\\resources\\features\\RxClaim\\featureFiles\\SR41901\\TestData.txt");
		String RxClaimNumber = "";
		try (BufferedReader reader = 
                 Files.newBufferedReader(readFile, StandardCharsets.UTF_8)) {
            String data;
            while ((data = reader.readLine()) != null) {
            	RxClaimNumber = data;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
		if(RxClaimNumber!="")
		{
			Mainframe_GlobalFunctionLib.pressKey("F8");
			Mainframe_GlobalFunctionLib.sendText(4,4,RxClaimNumber );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(10,2,"5" );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.pressKey("F7");
			Mainframe_GlobalFunctionLib.sendText(4,23,"1");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
		}
		String pat = Mainframe_GlobalFunctionLib.getText(16, 32).trim();
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.sendText(21,7,"cct800");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(21,7,"13");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(21,7,"6");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F16");
		Mainframe_GlobalFunctionLib.sendText("04", "04",RxClaimNumber );
		 Mainframe_GlobalFunctionLib.pressKey("Enter");
		 Mainframe_GlobalFunctionLib.sendText("10", "02","7");
		 Mainframe_GlobalFunctionLib.pressKey("Enter");
		 String dtype = Mainframe_GlobalFunctionLib.getText(9, 2);
		 String dedtype = dtype.substring(37, 40).trim();
		 String otype = Mainframe_GlobalFunctionLib.getText(16, 2);
		 String ooptype = otype.substring(37, 40).trim();
		 String dpatamt = Mainframe_GlobalFunctionLib.getText(10, 2);
		 String dedpatamount = dpatamt.substring(48, 54).trim();
		 String opatamt = Mainframe_GlobalFunctionLib.getText(17, 2);
		 String ooppatamount = opatamt.substring(48, 54).trim();
		 String dedamt = Mainframe_GlobalFunctionLib.getText(11, 2);
		 String dedamount = dedamt.substring(12, 19).trim();
		 String oopamt = Mainframe_GlobalFunctionLib.getText(18, 2);
		 String oopamount = oopamt.substring(12, 19).trim();
		 String dclmtotal = Mainframe_GlobalFunctionLib.getText(11, 2);
		 String dedclmtotal=dclmtotal.substring(34, 41).trim();
		 String oclmtotal = Mainframe_GlobalFunctionLib.getText(18, 2);
		 String oopclmtotal=oclmtotal.substring(34, 41).trim();
		 String dadj = Mainframe_GlobalFunctionLib.getText(11, 2);
		 String dedadj=dadj.substring(71, 77).trim();
		 String oadj = Mainframe_GlobalFunctionLib.getText(18, 2);
		 String oopadj=oadj.substring(71, 77).trim();
		 
		 String fdedclaimtot = Mainframe_GlobalFunctionLib.getText(12, 2);
		 String fdedclaimtotal =fdedclaimtot.substring(70, 77).trim();
		 
		 String foopclaimtot = Mainframe_GlobalFunctionLib.getText(19, 2);
		 String foopclaimtotal =foopclaimtot.substring(70, 77).trim();
		
		 if(dedtype.equals("D"))
		 {
			 if(dedsched.equals(dedamount))
			 {
				 System.out.println("Deductible amount is validated properly");
				 
				 if(pat.equals(dedpatamount))
				 {
					 System.out.println("PAT for Deductible is validated properly");
					 
					 if(adjustment.equals(dedadj))
					 {
						
						 System.out.println("Adjustment for Deductible is validated properly");
						 Double ded = Double.parseDouble(dedsched);
						 Double adj = Double.parseDouble(adjustment);
						 Double claimtot = ded-adj;
						 String claimtotal = String.format("%.2f", claimtot);
						 
						 if(claimtotal.equals(dedclmtotal) & claimtotal.equals(fdedclaimtotal))
						 {
							 System.out.println("Validation is successful for Individual & family member deductible type");
						 }
						
					 }
				 }
			 }
		 }
		 else
		 {
			System.out.println("Validation is not successful for deductible"); 
		 }
		 
		 if(ooptype.equals("O"))
		 {
			 if(oopsched.equals(oopamount))
			 {
				 System.out.println("OOP amount is validated properly");
				 
				 if(pat.equals(ooppatamount))
				 {
					 System.out.println("PAT for OOP is validated properly");
					 
					 if(adjustment.equals(oopadj))
					 {
						 System.out.println("Adjustment for OOP is validated properly");
						 Double ded = Double.parseDouble(oopsched);
						 Double adj = Double.parseDouble(adjustment);
						 Double oclaimtot = ded-adj;
						 String oopclaimtotal = String.format("%.2f", oclaimtot);
						 
						 if(oopclaimtotal.equals(oopclmtotal) & oopclaimtotal.equals(foopclaimtotal))
						 {
							 System.out.println("Validation is successful for Individual & Family member OOP type");
						 }
						 
					 }
				 }
			 } 
			 
			 
		 }
		 else
		 {
			 System.out.println("Validation is not successful for OOP"); 
		 }
	}
	*/
	/*
	@Then("^modifying the value of OOP in accumulator sequencing in plan with \"([^\"]*)\"$")
	public void modifying_the_value_of_OOP_in_accumulator_sequencing_in_plan_with(String oop) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.sendText(11, 2, "2");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F7");
		Mainframe_GlobalFunctionLib.sendText(7, 21, "29");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(15, 12, "5");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(12, 2, "2");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(8, 18, oop);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F3");
	}
	*/
}
