package com.atdd.demo.te.stepdefinitons;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

import org.testng.Assert;

import com.atdd.te.screenHelpers.FunctionalLibrary;
import com.optumrx.autofusion.core.te.util.Mainframe_GlobalFunctionLib;
import cucumber.api.java.en.Then;

public class PAPharmacyAndSuperNetworkIdAndQualifier {
	
	@Then("^Capture the MemberID and write in text file$")
	public void capture_the_MemberID_and_write_in_text_file() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String Member_ID = Mainframe_GlobalFunctionLib.getText(20, 12); 
	    Path FileName = Paths.get("C:\\Users\\pswathi3\\git\\RxClaim_ATDD\\src\\test\\resources\\features\\RxClaim\\SWATHI\\SN003621\\TestData.txt"); 
        BufferedWriter writer = Files.newBufferedWriter(FileName , StandardOpenOption.TRUNCATE_EXISTING); 
	writer.write(Member_ID); 
	writer.close(); 
	}
	
	@Then("^I validate the Network and Qualifier in the PA \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_validate_the_Network_and_Qualifier_in_the_PA(String PANumber, String Ntwk, String NetworkID, String Qualifier) throws Throwable {
	Path readFile = Paths.get("C:\\Users\\pswathi3\\git\\RxClaim_ATDD\\src\\test\\resources\\features\\RxClaim\\SWATHI\\SN003621\\TestData.txt"); 
		String Member_ID = ""; 
		try (BufferedReader reader =  
              Files.newBufferedReader(readFile, StandardCharsets.UTF_8)) { 
         String data; 
         while ((data = reader.readLine()) != null) { 
        	 Member_ID = data; 
         } 
     } catch (Exception e) { 
         e.printStackTrace(); 
     } 
	
	FunctionalLibrary.enterText(21,7,"1");
	FunctionalLibrary.pressEnter();
	FunctionalLibrary.enterText(21,7,"2");
	FunctionalLibrary.pressEnter();
	FunctionalLibrary.enterText(4,4,Member_ID);   
	FunctionalLibrary.validateText("10", "4", Member_ID);
	FunctionalLibrary.enterText(10,2,"5");
	FunctionalLibrary.pressEnter();
	FunctionalLibrary.pressKey("F8");
	FunctionalLibrary.enterText(4,20,"9");
	FunctionalLibrary.pressEnter();
	FunctionalLibrary.enterText(9,5,PANumber);
	FunctionalLibrary.pressEnter();
	FunctionalLibrary.validateText("16", "5", PANumber);
	FunctionalLibrary.enterText(16,2,"5");
	FunctionalLibrary.pressEnter();
	FunctionalLibrary.pressKey("F7");
	FunctionalLibrary.pressKey("PageDown");	
	FunctionalLibrary.pressKey("PageDown");
	if (Ntwk.equalsIgnoreCase("Pharmacy") )
		{
		  	String PharmacyNetwork = FunctionalLibrary.getText(15, 21);
		  	String PharmacyQualifier = FunctionalLibrary.getText(15, 64);
		  	if(NetworkID.equalsIgnoreCase(PharmacyNetwork) && (Qualifier.equalsIgnoreCase(PharmacyQualifier)))
		  	{
		  		System.out.println("The Pharmacy Network Id is" +PharmacyNetwork+ "and Qualifier is " + PharmacyQualifier);
		  	}
		  	else
		  	{
		  		Assert.fail();
		  	}
		}
	else if (Ntwk.equalsIgnoreCase("Super") )
		{
		    String SuperNetwork = FunctionalLibrary.getText(16, 21);
		    String SuperQualifier=FunctionalLibrary.getText(16, 64);
		    if(NetworkID.equalsIgnoreCase(SuperNetwork) && (Qualifier.equalsIgnoreCase(SuperQualifier)))
		  	{
		  		System.out.println("The Super Network Id is" +SuperNetwork+ "and Qualifier is " + SuperQualifier);
		  	}
		  	else
		  	{
		  		Assert.fail();
		  	}
		}
	
	}

}
