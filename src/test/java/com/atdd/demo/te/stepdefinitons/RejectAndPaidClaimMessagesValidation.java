package com.atdd.demo.te.stepdefinitons;
import org.apache.xpath.operations.Plus;
import java.io.BufferedReader; 
import java.io.BufferedWriter; 
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets; 
import java.nio.file.Files; 
import java.nio.file.Path; 
import java.nio.file.Paths; 
import java.nio.file.StandardOpenOption; 

import java.util.HashMap; 
import java.util.Map; 

import org.testng.Assert;
import com.atdd.te.screenHelpers.FunctionalLibrary;
import com.cucumber.listener.Reporter;
import com.optumrx.autofusion.core.te.util.Screenshot;

import cucumber.api.java.en.Then; 
import cucumber.api.java.en.When;
import cucumber.api.java.en.Given;
import cucumber.api.PendingException;
import com.optumrx.autofusion.core.te.util.Mainframe_GlobalFunctionLib;
public class RejectAndPaidClaimMessagesValidation {
	Map< Integer,String> map = new HashMap< Integer,String>(); 
		
	@When("^I add messages to Product \"([^\"]*)\", \"([^\"]*)\",\"([^\"]*)\", \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_add_messages_to_Product(String ProductID, String FromDate, String ThruDate, String Carrier, String MessageCode, String Seqno, String MessageType) throws Throwable {
	    // To Add messages to Product
		AddMessagesToProduct.addMessagesProduct(ProductID,FromDate,ThruDate,Carrier,MessageCode,Seqno,MessageType);
		
	}
	
	@When("^Capture the Claim Number and Status and write in text file$")
	public void capture_the_Claim_Number_and_Status_and_write_in_text_file() throws Throwable { 
	 // Write code here that turns the phrase above into concrete actions 
	        String RxClaim_Number = Mainframe_GlobalFunctionLib.getText(20, 12); 
		    Path FileName = Paths.get("C:\\Users\\pswathi3\\git\\RxClaim_ATDD\\src\\test\\resources\\features\\RxClaim\\SWATHI\\SN003292\\TestData.txt"); 
	        BufferedWriter writer = Files.newBufferedWriter(FileName , StandardOpenOption.TRUNCATE_EXISTING); 
		writer.write(RxClaim_Number); 
		writer.close(); 
	 	} 
		
	@When("^I add messages to Paid claim \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_add_messages_to_Paid_claim(int Rel,String FileName,String Lib,int maxMsgCount,int minMsgCount) throws Throwable {
		// Write code here that turns the phrase above into concrete actions 
		Path readFile = Paths.get("C:\\Users\\pswathi3\\git\\RxClaim_ATDD\\src\\test\\resources\\features\\RxClaim\\SWATHI\\SN003292\\TestData.txt"); 
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
		for (int i= minMsgCount; i <= maxMsgCount; i++ )
		{
			FunctionalLibrary.pressKey("F12");
			FunctionalLibrary.enterText(5,31,"2");
			FunctionalLibrary.pressEnter();
			FunctionalLibrary.enterText(21,7,"STRSQL");
			FunctionalLibrary.pressEnter();
			String Query1 = "INSERT INTO "+Lib+Rel+"FIL/"+FileName+ "(DUP2NB, DUOINB, DUODNB, DUJHOD,DULPTX, DUK1PP,DUM2HF) VALUES('" +RxClaimNumber+"', '999', '"+i+"', '"+i+"', '"+i+"Msg', ' ', 'TESTSTRNG3')";
			FunctionalLibrary.enterText(5,7,Query1);
			FunctionalLibrary.pressEnter();
			String Actualmsg= FunctionalLibrary.getText(7, 7);
			String expectedmsg= "1 rows inserted in RCPDMP in "+Lib+Rel+"FIL.";
			Assert.assertEquals(Actualmsg, expectedmsg,"Data is not inserted");
			System.out.println("Total number of messages added is"+ i); 
		}
	}
	
	@When("^I add messages to Reject claim \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_add_messages_to_Reject_claim(int Rel,String FileName,String Lib,int maxMsgCount,int minMsgCount) throws Throwable {
		// Write code here that turns the phrase above into concrete actions 
		Path readFile = Paths.get("C:\\Users\\pswathi3\\git\\RxClaim_ATDD\\src\\test\\resources\\features\\RxClaim\\SWATHI\\SN003292\\TestData.txt"); 
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
		for (int i= minMsgCount; i <= maxMsgCount; i++ )
		{
			FunctionalLibrary.pressKey("F12");
			FunctionalLibrary.enterText(5,31,"2");
			FunctionalLibrary.pressEnter();
			FunctionalLibrary.enterText(21,7,"STRSQL");
			FunctionalLibrary.pressEnter();
			if (minMsgCount<=9)
			{
			String Query1 = "INSERT INTO "+Lib+Rel+"FIL/"+FileName+ "(E8P2NB, E8OINB, E8PQNB, E8JKOD,E8QYTX, E8K4PP, E8M3HF) VALUES('" +RxClaimNumber+"', '999', '"+i+"', '"+i+"', '"+i+"ToValidatethateachlineshouldaccept40cha', ' ', 'TESTSTRNG3')";
			FunctionalLibrary.enterText(5,7,Query1);
			}
			else if (minMsgCount<=99)
			{
				String Query1 = "INSERT INTO "+Lib+Rel+"FIL/"+FileName+ "(E8P2NB, E8OINB, E8PQNB, E8JKOD,E8QYTX, E8K4PP, E8M3HF) VALUES('" +RxClaimNumber+"', '999', '"+i+"', '"+i+"', '"+i+"ToValidatethateachlineshouldaccept40ch', ' ', 'TESTSTRNG3')";
				FunctionalLibrary.enterText(5,7,Query1);
			}
			else if (minMsgCount<=999)
			{
				String Query1 = "INSERT INTO "+Lib+Rel+"FIL/"+FileName+ "(E8P2NB, E8OINB, E8PQNB, E8JKOD,E8QYTX, E8K4PP, E8M3HF) VALUES('" +RxClaimNumber+"', '999', '"+i+"', '"+i+"', '"+i+"ToValidatethateachlineshouldaccept40c', ' ', 'TESTSTRNG3')";
				FunctionalLibrary.enterText(5,7,Query1);
			}
			FunctionalLibrary.pressEnter();
			String Actualmsg= FunctionalLibrary.getText(7, 7);
			String expectedmsg= "1 rows inserted in RCRCMP in "+Lib+Rel+"FIL.";
			Assert.assertEquals(Actualmsg, expectedmsg,"Data is not inserted");
			System.out.println("Total number of messages added is"+ i); 
			}
		}
	}
