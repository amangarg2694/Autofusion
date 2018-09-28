package com.atdd.demo.te.stepdefinitons;

import java.awt.Robot; 
import java.awt.event.KeyEvent; 
import java.text.DateFormat; 
import java.text.SimpleDateFormat; 
import java.util.Date; 
import java.util.concurrent.TimeUnit; 


import org.junit.Assert; 


import com.atdd.te.screenHelpers.FunctionalLibrary; 
import com.cucumber.listener.Reporter; 
import com.optumrx.autofusion.core.te.util.Mainframe_GlobalFunctionLib; 
import com.optumrx.autofusion.core.te.util.Screenshot;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then; 

public class FIRTransactionAndRejectedTransaction {
  
	public void defaultv() throws Exception
	{
		
		String getcarrierfrom = Mainframe_GlobalFunctionLib.getText(7, 22);
		String getcarrierthru = Mainframe_GlobalFunctionLib.getText(7, 41);
		String getcontract = Mainframe_GlobalFunctionLib.getText(11, 22);
		String getpbp = Mainframe_GlobalFunctionLib.getText(12, 22);
		String getconpbplist = Mainframe_GlobalFunctionLib.getText(13, 60);
		if(getcarrierfrom.length()==0 & getcarrierthru.length()==0 & getcontract.length()==0 & getpbp.length()==0 & getconpbplist.length()==0  ) 
		{ 
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
			System.out.println("Default value of CarrierFrom, CarrierThru, Contract, PBP, Contract PBP List is Blank");
			Reporter.addStepLog("Default value of CarrierFrom, CarrierThru, Contract, PBP, Contract PBP List is Blank");
		} 
		else 
		{ 
			Assert.fail("Default value of CarrierFrom, CarrierThru, Contract, PBP, Contract PBP List is Not Blank"); 
		}
		
		String getconpbpliststs = Mainframe_GlobalFunctionLib.getText(13, 73);
		if(getconpbpliststs.equals("A"))
		{
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
			System.out.println("Default value of Contract PBP List Status :"+getconpbpliststs);
			Reporter.addStepLog("Default value of Contract PBP List Status :"+getconpbpliststs);
		}
		else 
		{ 
			Assert.fail("Default value of Contract PBP List Status is not :"+getconpbpliststs);
		}
	}

	public void validationerrmsg_cagrange_cont_pbp_conbplist(String FIRFdate, String FIRTdate, String CarrierFrom, String CarrierThru, String AccountFrom, String AccountThru, String GroupFrom, String GroupThru, String Contract, String PBP, String ConPBPList, String ConPBPListsts, String Filename, String Library) throws Exception
	{
		Mainframe_GlobalFunctionLib.sendText(5,22,FIRFdate); 
		Mainframe_GlobalFunctionLib.sendText(5,41,FIRTdate);
		Mainframe_GlobalFunctionLib.sendText(7,22,CarrierFrom);
		Mainframe_GlobalFunctionLib.sendText(7,41,CarrierThru);
		Mainframe_GlobalFunctionLib.sendText(8,22,AccountFrom);
		Mainframe_GlobalFunctionLib.sendText(8,41,AccountThru);
		Mainframe_GlobalFunctionLib.sendText(9,22,GroupFrom);
		Mainframe_GlobalFunctionLib.sendText(9,41,GroupThru);
		Mainframe_GlobalFunctionLib.sendText(11,22,Contract);
		Mainframe_GlobalFunctionLib.sendText(12,22,PBP);		
		Mainframe_GlobalFunctionLib.sendText(13,60,ConPBPList);
		Mainframe_GlobalFunctionLib.sendText(13,73,ConPBPListsts);
		if(Mainframe_GlobalFunctionLib.getText(1, 2).trim().equals("PRCPD2290"))
		{	    
			    Mainframe_GlobalFunctionLib.sendText(17,22,Filename);
				Mainframe_GlobalFunctionLib.sendText(18,22,Library);
		}
		else
		{
			  Mainframe_GlobalFunctionLib.sendText(15,22,Filename);
			  Mainframe_GlobalFunctionLib.sendText(16,22,Library);
		}
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
		Mainframe_GlobalFunctionLib.pressKey("Enter");

		String msg = Mainframe_GlobalFunctionLib.getText(24, 2).trim();
		if(msg.equals("Either C/A/G, Contract or Contract/PBP List should be entered, NOT all")) 
		{ 
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
			System.out.println("Error message appearing as: "+msg );
			Reporter.addStepLog("Error message appearing as: "+msg);
			
		} 
		else 
		{ 
				Assert.fail("Message not appearing as expected "); 
		}
		
		
	}
	
	public void Toplanadminmenu() throws Exception
	{
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.pressKey("F3");
	}
	
	public void validationerrmsg_caglist_contract_pbp_conpbplist(String FIRFdate, String FIRTdate, String CarrierList, String AccountList, String GroupList, String CAGListsts, String Contract, String PBP, String ConPBPList, String ConPBPListsts,String Filename, String Library) throws Exception
	{
		Mainframe_GlobalFunctionLib.sendText(5,22,FIRFdate); 
		Mainframe_GlobalFunctionLib.sendText(5,41,FIRTdate);	

		
		Mainframe_GlobalFunctionLib.sendText(7,60,CarrierList);
		Mainframe_GlobalFunctionLib.sendText(8,60,AccountList);
		Mainframe_GlobalFunctionLib.sendText(9,60,GroupList);
		Mainframe_GlobalFunctionLib.sendText(7,73,CAGListsts);
		Mainframe_GlobalFunctionLib.sendText(8,73,CAGListsts);
		Mainframe_GlobalFunctionLib.sendText(9,73,CAGListsts);
		
		Mainframe_GlobalFunctionLib.sendText(11,22,Contract);
		Mainframe_GlobalFunctionLib.sendText(12,22,PBP);		
		
		Mainframe_GlobalFunctionLib.sendText(13,60,ConPBPList);
		Mainframe_GlobalFunctionLib.sendText(13,73,ConPBPListsts);
		
		if(Mainframe_GlobalFunctionLib.getText(1, 2).trim().equals("PRCPD2290"))
		{	    
			    Mainframe_GlobalFunctionLib.sendText(17,22,Filename);
				Mainframe_GlobalFunctionLib.sendText(18,22,Library);
		}
		else
		{
			  Mainframe_GlobalFunctionLib.sendText(15,22,Filename);
			  Mainframe_GlobalFunctionLib.sendText(16,22,Library);
		}
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		
		String msg = Mainframe_GlobalFunctionLib.getText(24, 2).trim();
		if(msg.equals("Either C/A/G, Contract or Contract/PBP List should be entered, NOT all")) 
		{ 
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
			System.out.println("Error message appearing as: "+msg );
			Reporter.addStepLog("Error message appearing as: "+msg);
			
		} 
		else 
		{ 
				Assert.fail("Message not appearing as expected "); 
		}

	}
	
	public void validationerrmsg_contract_cagrange_conpbplist(String FIRFdate, String FIRTdate, String CarrierFrom, String CarrierThru, String AccountFrom, String AccountThru, String GroupFrom, String GroupThru, String CarrierList, String AccountList, String GroupList, String CAGListsts, String Contract, String ConPBPList, String ConPBPListsts,String Filename, String Library) throws Exception
	{
		Mainframe_GlobalFunctionLib.sendText(5,22,FIRFdate); 
		Mainframe_GlobalFunctionLib.sendText(5,41,FIRTdate);
		
		Mainframe_GlobalFunctionLib.sendText(7,22,CarrierFrom);
		Mainframe_GlobalFunctionLib.sendText(7,41,CarrierThru);
		Mainframe_GlobalFunctionLib.sendText(8,22,AccountFrom);
		Mainframe_GlobalFunctionLib.sendText(8,41,AccountThru);
		Mainframe_GlobalFunctionLib.sendText(9,22,GroupFrom);
		Mainframe_GlobalFunctionLib.sendText(9,41,GroupThru);
		
		Mainframe_GlobalFunctionLib.sendText(7,60,CarrierList);
		Mainframe_GlobalFunctionLib.sendText(8,60,AccountList);
		Mainframe_GlobalFunctionLib.sendText(9,60,GroupList);
		Mainframe_GlobalFunctionLib.sendText(7,73,CAGListsts);
		Mainframe_GlobalFunctionLib.sendText(8,73,CAGListsts);
		Mainframe_GlobalFunctionLib.sendText(9,73,CAGListsts);
		
		Mainframe_GlobalFunctionLib.sendText(11,22,Contract);
		Mainframe_GlobalFunctionLib.sendText(13,60,ConPBPList);
		Mainframe_GlobalFunctionLib.sendText(13,73,ConPBPListsts);
		
		if(Mainframe_GlobalFunctionLib.getText(1, 2).trim().equals("PRCPD2290"))
		{	    
			    Mainframe_GlobalFunctionLib.sendText(17,22,Filename);
				Mainframe_GlobalFunctionLib.sendText(18,22,Library);
		}
		else
		{
			  Mainframe_GlobalFunctionLib.sendText(15,22,Filename);
			  Mainframe_GlobalFunctionLib.sendText(16,22,Library);
		}
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		
		String msg = Mainframe_GlobalFunctionLib.getText(24, 2).trim();
		if(msg.equals("Either C/A/G, Contract or Contract/PBP List should be entered, NOT all")) 
		{ 
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
			System.out.println("Error message appearing as: "+msg );
			Reporter.addStepLog("Error message appearing as: "+msg);
			
		} 
		else 
		{ 
				Assert.fail("Message not appearing as expected "); 
		}

	}
	
	public void validationerrmsg_pbp_contract(String FIRFdate, String FIRTdate, String PBP, String Filename, String Library) throws Exception
	{
		Mainframe_GlobalFunctionLib.sendText(5,22,FIRFdate); 
		Mainframe_GlobalFunctionLib.sendText(5,41,FIRTdate);
		Mainframe_GlobalFunctionLib.sendText(12,22,PBP);		
		if(Mainframe_GlobalFunctionLib.getText(1, 2).trim().equals("PRCPD2290"))
		{	    
			    Mainframe_GlobalFunctionLib.sendText(17,22,Filename);
				Mainframe_GlobalFunctionLib.sendText(18,22,Library);
		}
		else
		{
			  Mainframe_GlobalFunctionLib.sendText(15,22,Filename);
			  Mainframe_GlobalFunctionLib.sendText(16,22,Library);
		}

		Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		
		String msg = Mainframe_GlobalFunctionLib.getText(24, 2).trim();
		if(msg.equals("Value Required")) 
		{ 
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
			System.out.println("Error message appearing as: "+msg );
			Reporter.addStepLog("Error message appearing as: "+msg);
			
		} 
		else 
		{ 
				Assert.fail("Message not appearing as expected "); 
		}

	}
	
	public void Contract_pbp_cagrange(String FIRFdate, String FIRTdate, String CarrierFrom, String CarrierThru, String AccountFrom, String AccountThru, String GroupFrom, String GroupThru, String Contract, String PBP, String Filename, String Library) throws Exception
	{
		Mainframe_GlobalFunctionLib.sendText(5,22,FIRFdate); 
		Mainframe_GlobalFunctionLib.sendText(5,41,FIRTdate);
		
		Mainframe_GlobalFunctionLib.sendText(7,22,CarrierFrom);
		Mainframe_GlobalFunctionLib.sendText(7,41,CarrierThru);
		Mainframe_GlobalFunctionLib.sendText(8,22,AccountFrom);
		Mainframe_GlobalFunctionLib.sendText(8,41,AccountThru);
		Mainframe_GlobalFunctionLib.sendText(9,22,GroupFrom);
		Mainframe_GlobalFunctionLib.sendText(9,41,GroupThru);
		
		Mainframe_GlobalFunctionLib.sendText(11,22,Contract);
		Mainframe_GlobalFunctionLib.sendText(12,22,PBP);		
								
		if(Mainframe_GlobalFunctionLib.getText(1, 2).trim().equals("PRCPD2290"))
		{	    
			    Mainframe_GlobalFunctionLib.sendText(17,22,Filename);
				Mainframe_GlobalFunctionLib.sendText(18,22,Library);
		}
		else
		{
			  Mainframe_GlobalFunctionLib.sendText(15,22,Filename);
			  Mainframe_GlobalFunctionLib.sendText(16,22,Library);
		}
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
		Mainframe_GlobalFunctionLib.pressKey("Enter");

		String msg = Mainframe_GlobalFunctionLib.getText(24, 2).trim();
		if(msg.equals("Either C/A/G, Contract or Contract/PBP List should be entered, NOT all")) 
		{ 
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
			System.out.println("Error message appearing as: "+msg );
			Reporter.addStepLog("Error message appearing as: "+msg);
			
		} 
		else 
		{ 
				Assert.fail("Message not appearing as expected "); 
		}

	}
	
	public void contract_pbp_caglist(String FIRFdate, String FIRTdate, String CarrierList, String AccountList, String GroupList, String CAGListsts, String Contract, String PBP, String Filename, String Library) throws Exception
	{
		Mainframe_GlobalFunctionLib.sendText(5,22,FIRFdate); 
		Mainframe_GlobalFunctionLib.sendText(5,41,FIRTdate);	
		Mainframe_GlobalFunctionLib.sendText(7,60,CarrierList);
		Mainframe_GlobalFunctionLib.sendText(8,60,AccountList);
		Mainframe_GlobalFunctionLib.sendText(9,60,GroupList);
		Mainframe_GlobalFunctionLib.sendText(7,73,CAGListsts);
		Mainframe_GlobalFunctionLib.sendText(8,73,CAGListsts);
		Mainframe_GlobalFunctionLib.sendText(9,73,CAGListsts);
		Mainframe_GlobalFunctionLib.sendText(11,22,Contract);
		Mainframe_GlobalFunctionLib.sendText(12,22,PBP);		
		if(Mainframe_GlobalFunctionLib.getText(1, 2).trim().equals("PRCPD2290"))
		{	    
			    Mainframe_GlobalFunctionLib.sendText(17,22,Filename);
				Mainframe_GlobalFunctionLib.sendText(18,22,Library);
		}
		else
		{
			  Mainframe_GlobalFunctionLib.sendText(15,22,Filename);
			  Mainframe_GlobalFunctionLib.sendText(16,22,Library);
		}		
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		
		String msg = Mainframe_GlobalFunctionLib.getText(24, 2).trim();
		if(msg.equals("Either C/A/G, Contract or Contract/PBP List should be entered, NOT all")) 
		{ 
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
			System.out.println("Error message appearing as: "+msg );
			Reporter.addStepLog("Error message appearing as: "+msg);
			
		} 
		else 
		{ 
				Assert.fail("Message not appearing as expected "); 
		}

	}
	
	public void contract_pbp_conpbplist(String FIRFdate, String FIRTdate, String Contract, String PBP, String ConPBPList, String ConPBPListsts, String Filename, String Library)throws Exception
	{
		Mainframe_GlobalFunctionLib.sendText(5,22,FIRFdate); 
		Mainframe_GlobalFunctionLib.sendText(5,41,FIRTdate);		
		
		Mainframe_GlobalFunctionLib.sendText(11,22,Contract);
		Mainframe_GlobalFunctionLib.sendText(12,22,PBP);		
		
		Mainframe_GlobalFunctionLib.sendText(13,60,ConPBPList);
		Mainframe_GlobalFunctionLib.sendText(13,73,ConPBPListsts);
		
		if(Mainframe_GlobalFunctionLib.getText(1, 2).trim().equals("PRCPD2290"))
		{	    
			    Mainframe_GlobalFunctionLib.sendText(17,22,Filename);
				Mainframe_GlobalFunctionLib.sendText(18,22,Library);
		}
		else
		{
			  Mainframe_GlobalFunctionLib.sendText(15,22,Filename);
			  Mainframe_GlobalFunctionLib.sendText(16,22,Library);
		}
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		
		String msg = Mainframe_GlobalFunctionLib.getText(24, 2).trim();
		if(msg.equals("Either C/A/G, Contract or Contract/PBP List should be entered, NOT all")) 
		{ 
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
			System.out.println("Error message appearing as: "+msg );
			Reporter.addStepLog("Error message appearing as: "+msg);
			
		} 
		else 
		{ 
				Assert.fail("Message not appearing as expected "); 
		}

	}
	public void contpbplist_cag(String FIRFdate, String FIRTdate, String CarrierFrom, String CarrierThru, String AccountFrom, String AccountThru, String GroupFrom, String GroupThru, String ConPBPList, String ConPBPListsts, String Filename, String Library) throws Exception
	{
		Mainframe_GlobalFunctionLib.sendText(5,22,FIRFdate); 
		Mainframe_GlobalFunctionLib.sendText(5,41,FIRTdate);
		Mainframe_GlobalFunctionLib.sendText(7,22,CarrierFrom);
		Mainframe_GlobalFunctionLib.sendText(7,41,CarrierThru);
		Mainframe_GlobalFunctionLib.sendText(8,22,AccountFrom);
		Mainframe_GlobalFunctionLib.sendText(8,41,AccountThru);
		Mainframe_GlobalFunctionLib.sendText(9,22,GroupFrom);
		Mainframe_GlobalFunctionLib.sendText(9,41,GroupThru);					
		Mainframe_GlobalFunctionLib.sendText(13,60,ConPBPList);
		Mainframe_GlobalFunctionLib.sendText(13,73,ConPBPListsts);
		if(Mainframe_GlobalFunctionLib.getText(1, 2).trim().equals("PRCPD2290"))
		{	    
			    Mainframe_GlobalFunctionLib.sendText(17,22,Filename);
				Mainframe_GlobalFunctionLib.sendText(18,22,Library);
		}
		else
		{
			  Mainframe_GlobalFunctionLib.sendText(15,22,Filename);
			  Mainframe_GlobalFunctionLib.sendText(16,22,Library);
		}
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
		Mainframe_GlobalFunctionLib.pressKey("Enter");

		String msg = Mainframe_GlobalFunctionLib.getText(24, 2).trim();
		if(msg.equals("Either C/A/G, Contract or Contract/PBP List should be entered, NOT all")) 
		{ 
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
			System.out.println("Error message appearing as: "+msg );
			Reporter.addStepLog("Error message appearing as: "+msg);
			
		} 
		else 
		{ 
				Assert.fail("Message not appearing as expected "); 
		}

	}
	public void contpbplist_caglist(String FIRFdate, String FIRTdate, String CarrierList, String AccountList, String GroupList, String CAGListsts, String ConPBPList, String ConPBPListsts, String Filename, String Library) throws Exception
	{
		Mainframe_GlobalFunctionLib.sendText(5,22,FIRFdate); 
		Mainframe_GlobalFunctionLib.sendText(5,41,FIRTdate);		
		Mainframe_GlobalFunctionLib.sendText(7,60,CarrierList);
		Mainframe_GlobalFunctionLib.sendText(8,60,AccountList);
		Mainframe_GlobalFunctionLib.sendText(9,60,GroupList);
		Mainframe_GlobalFunctionLib.sendText(7,73,CAGListsts);
		Mainframe_GlobalFunctionLib.sendText(8,73,CAGListsts);
		Mainframe_GlobalFunctionLib.sendText(9,73,CAGListsts);			
		Mainframe_GlobalFunctionLib.sendText(13,60,ConPBPList);
		Mainframe_GlobalFunctionLib.sendText(13,73,ConPBPListsts);
		
		if(Mainframe_GlobalFunctionLib.getText(1, 2).trim().equals("PRCPD2290"))
		{	    
			    Mainframe_GlobalFunctionLib.sendText(17,22,Filename);
				Mainframe_GlobalFunctionLib.sendText(18,22,Library);
		}
		else
		{
			  Mainframe_GlobalFunctionLib.sendText(15,22,Filename);
			  Mainframe_GlobalFunctionLib.sendText(16,22,Library);
		}
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		
		String msg = Mainframe_GlobalFunctionLib.getText(24, 2).trim();
		if(msg.equals("Either C/A/G, Contract or Contract/PBP List should be entered, NOT all")) 
		{ 
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
			System.out.println("Error message appearing as: "+msg );
			Reporter.addStepLog("Error message appearing as: "+msg);
			
		} 
		else 
		{ 
				Assert.fail("Message not appearing as expected "); 
		}

	}
	public void contpbplist_cont(String FIRFdate, String FIRTdate, String Contract, String ConPBPList, String ConPBPListsts, String Filename, String Library) throws Exception
	{
		Mainframe_GlobalFunctionLib.sendText(5,22,FIRFdate); 
		Mainframe_GlobalFunctionLib.sendText(5,41,FIRTdate);					
		Mainframe_GlobalFunctionLib.sendText(11,22,Contract);						
		Mainframe_GlobalFunctionLib.sendText(13,60,ConPBPList);
		Mainframe_GlobalFunctionLib.sendText(13,73,ConPBPListsts);
		
		if(Mainframe_GlobalFunctionLib.getText(1, 2).trim().equals("PRCPD2290"))
		{	    
			    Mainframe_GlobalFunctionLib.sendText(17,22,Filename);
				Mainframe_GlobalFunctionLib.sendText(18,22,Library);
		}
		else
		{
			  Mainframe_GlobalFunctionLib.sendText(15,22,Filename);
			  Mainframe_GlobalFunctionLib.sendText(16,22,Library);
		}
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		
		String msg = Mainframe_GlobalFunctionLib.getText(24, 2).trim();
		if(msg.equals("Either C/A/G, Contract or Contract/PBP List should be entered, NOT all")) 
		{ 
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
			System.out.println("Error message appearing as: "+msg );
			Reporter.addStepLog("Error message appearing as: "+msg);
			
		} 
		else 
		{ 
				Assert.fail("Message not appearing as expected "); 
		}

	}
	public void contpbplist_pbp( String FIRFdate, String FIRTdate, String PBP, String ConPBPList, String ConPBPListsts, String Filename, String Library) throws Exception
	{
		Mainframe_GlobalFunctionLib.sendText(5,22,FIRFdate); 
		Mainframe_GlobalFunctionLib.sendText(5,41,FIRTdate);					
		Mainframe_GlobalFunctionLib.sendText(12,22,PBP);						
		Mainframe_GlobalFunctionLib.sendText(13,60,ConPBPList);
		Mainframe_GlobalFunctionLib.sendText(13,73,ConPBPListsts);
		
		if(Mainframe_GlobalFunctionLib.getText(1, 2).trim().equals("PRCPD2290"))
		{	    
			    Mainframe_GlobalFunctionLib.sendText(17,22,Filename);
				Mainframe_GlobalFunctionLib.sendText(18,22,Library);
		}
		else
		{
			  Mainframe_GlobalFunctionLib.sendText(15,22,Filename);
			  Mainframe_GlobalFunctionLib.sendText(16,22,Library);
		}
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		
		String msg = Mainframe_GlobalFunctionLib.getText(24, 2).trim();
		if(msg.equals("Either C/A/G, Contract or Contract/PBP List should be entered, NOT all")) 
		{ 
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
			System.out.println("Error message appearing as: "+msg );
			Reporter.addStepLog("Error message appearing as: "+msg);
			
		} 
		else 
		{ 
				Assert.fail("Message not appearing as expected "); 
		}
	}
	public void filemissing( String FIRFdate, String FIRTdate, String Contract, String Library) throws Exception
	{
		Mainframe_GlobalFunctionLib.sendText(5,22,FIRFdate); 
		Mainframe_GlobalFunctionLib.sendText(5,41,FIRTdate);
		Mainframe_GlobalFunctionLib.sendText(11,22,Contract);
		if(Mainframe_GlobalFunctionLib.getText(1, 2).trim().equals("PRCPD2290"))
		{	    
			   
				Mainframe_GlobalFunctionLib.sendText(18,22,Library);
		}
		else
		{
			  
			  Mainframe_GlobalFunctionLib.sendText(16,22,Library);
		}
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
		Mainframe_GlobalFunctionLib.pressKey("Enter");							
		
		String msg = Mainframe_GlobalFunctionLib.getText(24, 2).trim();
		if(msg.equals("File Name Required")) 
			{ 
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
				System.out.println("Error message appearing as: "+msg );
				Reporter.addStepLog("Error message appearing as: "+msg);
			} 
		else 
			{ 
					Assert.fail("Message not appearing as expected "); 
			} 
	}
	public void Librarymissing(String FIRFdate, String FIRTdate, String Contract, String Filename) throws Exception
	{
		Mainframe_GlobalFunctionLib.sendText(5,22,FIRFdate); 
		Mainframe_GlobalFunctionLib.sendText(5,41,FIRTdate);
		Mainframe_GlobalFunctionLib.sendText(11,22,Contract);
		if(Mainframe_GlobalFunctionLib.getText(1, 2).trim().equals("PRCPD2290"))
		{	    
			    Mainframe_GlobalFunctionLib.sendText(17,22,Filename);
				
		}
		else
		{
			  Mainframe_GlobalFunctionLib.sendText(15,22,Filename);
			 
		}
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
		Mainframe_GlobalFunctionLib.pressKey("Enter");							
		
		String msg = Mainframe_GlobalFunctionLib.getText(24, 2).trim();
		if(msg.equals("Library Required")) 
			{ 
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
				System.out.println("Error message appearing as: "+msg );
				Reporter.addStepLog("Error message appearing as: "+msg);
			} 
		else 
			{ 
					Assert.fail("Message not appearing as expected "); 
			} 
	}
	public void FileLibrarymissing(String FIRFdate, String FIRTdate, String Contract) throws Exception
	{
				
		Mainframe_GlobalFunctionLib.sendText(5,22,FIRFdate); 
		Mainframe_GlobalFunctionLib.sendText(5,41,FIRTdate);
		Mainframe_GlobalFunctionLib.sendText(11,22,Contract);
		
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
		Mainframe_GlobalFunctionLib.pressKey("Enter");							
		
		String msg = Mainframe_GlobalFunctionLib.getText(24, 2).trim();
		if(msg.equals("File Name Required. Library Required")) 
			{ 
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
				System.out.println("Error message appearing as: "+msg );
				Reporter.addStepLog("Error message appearing as: "+msg);
			} 
		else 
			{ 
					Assert.fail("Message not appearing as expected "); 
			} 
	}
	@Then("^I validate the alpha numeric for Carrier from field \"([^\"]*)\" and Carrier thru field \"([^\"]*)\" with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_validate_the_alpha_numeric_for_Carrier_from_field_and_Carrier_thru_field_with(String CarrierFrom, String CarrierThru, String FIRFdate, String FIRTdate, String Filename, String Library) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
				Mainframe_GlobalFunctionLib.sendText(5,22,FIRFdate); 
				Mainframe_GlobalFunctionLib.sendText(5,41,FIRTdate);
				
				Mainframe_GlobalFunctionLib.sendText(7,22,CarrierFrom);
				Mainframe_GlobalFunctionLib.sendText(7,41,CarrierThru);
				
				if(Mainframe_GlobalFunctionLib.getText(1, 2).trim().equals("PRCPD2290"))
				{	    
					    Mainframe_GlobalFunctionLib.sendText(17,22,Filename);
						Mainframe_GlobalFunctionLib.sendText(18,22,Library);
				}
				else
				{
					  Mainframe_GlobalFunctionLib.sendText(15,22,Filename);
					  Mainframe_GlobalFunctionLib.sendText(16,22,Library);
				}
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				
				String msg = Mainframe_GlobalFunctionLib.getText(24, 2).trim();
				if(msg.equals("Press F6 to Submit to Batch")) 
					{ 
						Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
						System.out.println("System accepts alpha numerics in Carrier From field: "+CarrierFrom +"& System accepts alpha numerics in Carrier Thru field:"+CarrierThru);					
						System.out.println("FIR Rejected Transaction Detail File screen accept data Carrier From/Thru Fields when Contract and Contract PBP List are not entered");
					} 
				else 
					{ 
							Assert.fail("System not accepting alpha numerics for Carrier fields "); 
					} 	
		
	}
	@Then("^I validate the help text for Carrier from field and Carrier thru field$")
	public void i_validate_the_help_text_for_Carrier_from_field_and_Carrier_thru_field() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
				Mainframe_GlobalFunctionLib.click(7,22); 
				Thread.sleep(1000);
				Robot rob = new Robot(); 
				rob.keyPress(KeyEvent.VK_F1); 
				rob.keyRelease(KeyEvent.VK_F1); 
				Thread.sleep(1000);
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
				String CarrierHelp1 = Mainframe_GlobalFunctionLib.getText(13, 19).trim();
				String CarrierHelp2 = Mainframe_GlobalFunctionLib.getText(14, 19).trim();
				String ActCarrierFHelptext=CarrierHelp1+" "+CarrierHelp2;
				System.out.println(ActCarrierFHelptext);
				String ExpCarrierHelptext=("Type the nine character identifier of the owner of the accounts, groups, and members.");
				if(ExpCarrierHelptext.equals(ActCarrierFHelptext))
				{	
					System.out.println("Text matching");						
				}
				else
				{   
					System.out.println("Text is not same");
					Assert.fail("The text "+ ExpCarrierHelptext +" does not match on the screen.Screenshot captured.");	
			    }
				
				Mainframe_GlobalFunctionLib.pressKey("F3");
				
				Mainframe_GlobalFunctionLib.click(7,41); 
				Thread.sleep(1000);
				Robot rob1 = new Robot(); 
				rob1.keyPress(KeyEvent.VK_F1); 
				rob1.keyRelease(KeyEvent.VK_F1); 
				Thread.sleep(1000);
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
				 				
				String CarrierTHelp3 = Mainframe_GlobalFunctionLib.getText(13, 19).trim();
				String CarrierTHelp4 = Mainframe_GlobalFunctionLib.getText(14, 19).trim();
				String CarrierTHelp5 = Mainframe_GlobalFunctionLib.getText(15, 19).trim();
				
				String ActCarrierTHelptext=CarrierTHelp3+" "+CarrierTHelp4+" "+CarrierTHelp5;
				System.out.println(ActCarrierTHelptext);
				String ExpCarrierTHelptext=("The From and Thru Carrier fields are used to select claims within the range specified based on the Carrier ID on the claim.");
				if(ExpCarrierTHelptext.equals(ActCarrierTHelptext))
				{	
					System.out.println("Text matching");				
				}
				else
				{   
					System.out.println("Text is not same");
					Assert.fail("The text "+ ExpCarrierTHelptext +" does not match on the screen.Screenshot captured.");
				}
				Mainframe_GlobalFunctionLib.pressKey("F3");
	}

	@Then("^I validate the function key Ffour for Carrier from field and Carrier thru field$")
	public void i_validate_the_function_key_Ffour_for_Carrier_from_field_and_Carrier_thru_field() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
				Mainframe_GlobalFunctionLib.click(7,22); 
				Thread.sleep(1000);
				Mainframe_GlobalFunctionLib.pressKey("F4");
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
				Mainframe_GlobalFunctionLib.validateText("2", "38", "Carrier");
				Mainframe_GlobalFunctionLib.pressKey("F3");
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
				Mainframe_GlobalFunctionLib.click(7,41); 
				Thread.sleep(1000);
				Mainframe_GlobalFunctionLib.pressKey("F4");
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
				Mainframe_GlobalFunctionLib.validateText("2", "38", "Carrier");
				Mainframe_GlobalFunctionLib.pressKey("F3");
				Mainframe_GlobalFunctionLib.pressKey("F3");
	}
	@Then("^I validate the length of CarrierFrom \"([^\"]*)\" and CarrierThru\"([^\"]*)\" field$")
	public void i_validate_the_length_of_CarrierFrom_and_CarrierThru_field(String CarrierFrom1, String CarrierThru2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  
				Mainframe_GlobalFunctionLib.sendText(21,7,"1");
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(7,22,CarrierFrom1);
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
				Mainframe_GlobalFunctionLib.sendText(7,41,CarrierThru2);
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
				
				String getcarrf = Mainframe_GlobalFunctionLib.getText(7, 22);
				String getcarrt = Mainframe_GlobalFunctionLib.getText(7, 41);
				
				if(getcarrf.length()==9 & getcarrt.length()==9) 
				{ 
					Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
					System.out.println("Length of Carrier From Field: "+getcarrf.length() +"& Length of Carrier Thru Field:"+getcarrt.length()); 
				} 
				else 
				{ 
					Assert.fail("Length of carrierfrom and carrierthru field is not equal to 9"); 
				} 
						
				Toplanadminmenu();
	}
	
	@Then("^I validate the length of CarrierFrom \"([^\"]*)\" and CarrierThru\"([^\"]*)\" field in FIR Transaction Detail File screen$")
	public void i_validate_the_length_of_CarrierFrom_and_CarrierThru_field_in_FIR_Transaction_Detail_File_screen(String CarrierFrom1, String CarrierThru2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
				Mainframe_GlobalFunctionLib.sendText(21,7,"3");
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(7,22,CarrierFrom1);
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
				Mainframe_GlobalFunctionLib.sendText(7,41,CarrierThru2);
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
				String getcarrf = Mainframe_GlobalFunctionLib.getText(7, 22);
				String getcarrt = Mainframe_GlobalFunctionLib.getText(7, 41);
				
				if(getcarrf.length()==9 & getcarrt.length()==9) 
				{ 
					Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
					System.out.println("Length of Carrier From Field: "+getcarrf.length() +"& Length of Carrier Thru Field:"+getcarrt.length()); 
				} 
				else 
				{ 
					Assert.fail("Length of carrierfrom and carrierthru field is not equal to 9"); 
				} 
				
				Toplanadminmenu();

	}

	@Then("^I validate the Contract field \"([^\"]*)\" with for type, help text, function key Ffour with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_validate_the_Contract_field_with_for_type_help_text_function_key_Ffour_with(String Contract, String FIRFdate, String FIRTdate, String Filename, String Library) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		//TC005, TC006
		Mainframe_GlobalFunctionLib.sendText(5,22,FIRFdate); 
		Mainframe_GlobalFunctionLib.sendText(5,41,FIRTdate);
		Mainframe_GlobalFunctionLib.sendText(11,22,Contract);
				
		if(Mainframe_GlobalFunctionLib.getText(1, 2).trim().equals("PRCPD2290"))
		{	    
			    Mainframe_GlobalFunctionLib.sendText(17,22,Filename);
				Mainframe_GlobalFunctionLib.sendText(18,22,Library);
		}
		else
		{
			  Mainframe_GlobalFunctionLib.sendText(15,22,Filename);
			  Mainframe_GlobalFunctionLib.sendText(16,22,Library);
		}
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
		Mainframe_GlobalFunctionLib.pressKey("Enter");
				
		String msg = Mainframe_GlobalFunctionLib.getText(24, 2).trim();
		if(msg.equals("Press F6 to Submit to Batch")) 
			{ 
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
				System.out.println("System accepts alpha numerics in contract field: "+Contract );					
				//System.out.println("FIR Rejected Transaction Detail File screen accept data Carrier From/Thru Fields when Contract and Contract PBP List are not entered");
			} 
		else 
			{ 
					Assert.fail("System not accepting alpha numerics for Contract fields "); 
			} 

				
		//TC008
		Mainframe_GlobalFunctionLib.click(11,22); 
		Thread.sleep(1000);
		Robot rob = new Robot(); 
		rob.keyPress(KeyEvent.VK_F1); 
		rob.keyRelease(KeyEvent.VK_F1); 
		Thread.sleep(3000);
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
		Thread.sleep(1000);		
		String ActContractHelp = Mainframe_GlobalFunctionLib.getText(17, 19).trim();			
		System.out.println(ActContractHelp);
		String ExpContracttext=("Contract ID that is used for report selection.");
		if(ExpContracttext.equals(ActContractHelp))
		{	
			System.out.println("Text matching");
		}
		else
		{   
			System.out.println("Text is not same");
			Assert.fail("The text "+ ExpContracttext +" does not match on the screen.Screenshot captured.");			
		}
		
		//TC007
		Mainframe_GlobalFunctionLib.pressKey("F3");
		
		Mainframe_GlobalFunctionLib.click(11,22); 
		Thread.sleep(1000);	
		Mainframe_GlobalFunctionLib.pressKey("F4");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
		Mainframe_GlobalFunctionLib.validateText("2", "32", "Contract PBP Table");
		Mainframe_GlobalFunctionLib.pressKey("F3");		
		Mainframe_GlobalFunctionLib.pressKey("F3");		

	}
	@Then("^I validate the length of Contract field \"([^\"]*)\"$")
	public void i_validate_the_length_of_Contract_field(String Contract2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
				Mainframe_GlobalFunctionLib.sendText(21,7,"1");
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(11,22,Contract2);
				String getcontract = Mainframe_GlobalFunctionLib.getText(11, 22);
				if(getcontract.length()==5) 
				{ 
					Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
					System.out.println("Length of Contract Field: "+getcontract.length()); 
				} 
				else 
				{ 
					Assert.fail("Length of Contract field is not equal to 5"); 
				} 
				
				Toplanadminmenu();
	}
	
	@Then("^I validate the length of Contract field \"([^\"]*)\" in FIR Transaction Detail File screen$")
	public void i_validate_the_length_of_Contract_field_in_FIR_Transaction_Detail_File_screen(String Contract2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
				Mainframe_GlobalFunctionLib.sendText(21,7,"3");
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(11,22,Contract2);
				String getcontract = Mainframe_GlobalFunctionLib.getText(11, 22);
				if(getcontract.length()==5) 
				{ 
					Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
					System.out.println("Length of Contract Field: "+getcontract.length()); 
				} 
				else 
				{ 
					Assert.fail("Length of Contract field is not equal to 5"); 
				} 
				
				Toplanadminmenu();
	}
	
	@Then("^I validate the PBP field \"([^\"]*)\" for type, help text, function key Ffour with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_validate_the_PBP_field_for_type_help_text_function_key_Ffour_with(String PBP, String FIRFdate, String FIRTdate, String Contract, String Filename, String Library) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		//TC009-type
		Mainframe_GlobalFunctionLib.sendText(5,22,FIRFdate); 
		Mainframe_GlobalFunctionLib.sendText(5,41,FIRTdate);
		Mainframe_GlobalFunctionLib.sendText(11,22,Contract);
		Mainframe_GlobalFunctionLib.sendText(12,22,PBP);		
		if(Mainframe_GlobalFunctionLib.getText(1, 2).trim().equals("PRCPD2290"))
		{	    
			    Mainframe_GlobalFunctionLib.sendText(17,22,Filename);
				Mainframe_GlobalFunctionLib.sendText(18,22,Library);
		}
		else
		{
			  Mainframe_GlobalFunctionLib.sendText(15,22,Filename);
			  Mainframe_GlobalFunctionLib.sendText(16,22,Library);
		}
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		
		//String getpbp = Mainframe_GlobalFunctionLib.getText(12, 22);
		
		String msg = Mainframe_GlobalFunctionLib.getText(24, 2).trim();
				if(msg.equals("Press F6 to Submit to Batch")) 
				{ 
					Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
					System.out.println("System accepts alpha numerics in PBP field: "+PBP );					
					//System.out.println("FIR Rejected Transaction Detail File screen accept data Carrier From/Thru Fields when Contract and Contract PBP List are not entered");
				} 
				else 
				{ 
						Assert.fail("System not accepting alpha numerics for PBP fields "); 
				} 
		
				//TC010
				Mainframe_GlobalFunctionLib.click(12,22); 
				Thread.sleep(1000);
				Mainframe_GlobalFunctionLib.pressKey("F4");
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
				Mainframe_GlobalFunctionLib.validateText("2", "32", "Contract PBP Table");
				Mainframe_GlobalFunctionLib.pressKey("F3");
				
				//TC011
				Mainframe_GlobalFunctionLib.click(12,22); 
				Thread.sleep(1000);
				Robot rob1 = new Robot(); 
				rob1.keyPress(KeyEvent.VK_F1); 
				rob1.keyRelease(KeyEvent.VK_F1); 
				Thread.sleep(1000);
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
							
				String ActpbpHelp1 = Mainframe_GlobalFunctionLib.getText(18, 19).trim();
				String ActpbpHelp2 = Mainframe_GlobalFunctionLib.getText(19, 19).trim();
				String ActPBPHelptext=ActpbpHelp1+" "+ActpbpHelp2;
				System.out.println(ActPBPHelptext);
				String ExpPBPtext=("PBP that is used for report selection. Contract ID must be entered to select by PBP.");
				if(ExpPBPtext.equals(ActPBPHelptext))
				{	
					System.out.println("Text matching");
						
				}
				else
				{   
					System.out.println("Text is not same");
					Assert.fail("The text "+ ExpPBPtext +" does not match on the screen.Screenshot captured.");			
						
				}
				Mainframe_GlobalFunctionLib.pressKey("F3");
				Mainframe_GlobalFunctionLib.pressKey("F3");
	    
	}
	@Then("^I validate the PBP field \"([^\"]*)\" length$")
	public void i_validate_the_PBP_field_length(String PBP2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    		//TC009 
				Mainframe_GlobalFunctionLib.sendText(21,7,"1");
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(12,22,PBP2);
				String getpbp2 = Mainframe_GlobalFunctionLib.getText(12, 22);
				
				if(getpbp2.length()==3) 
				{ 
					Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
					System.out.println("Length of PBP Field: "+getpbp2.length()); 
				} 
				else 
				{ 
					Assert.fail("Length of PBP field is not equal to 3"); 
				} 							
				
				Toplanadminmenu();
				
	}
	
	@Then("^I validate the PBP field \"([^\"]*)\" length in FIR Transaction Detail File screen$")
	public void i_validate_the_PBP_field_length_in_FIR_Transaction_Detail_File_screen(String PBP2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
				Mainframe_GlobalFunctionLib.sendText(21,7,"3");
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(12,22,PBP2);
				String getpbp2 = Mainframe_GlobalFunctionLib.getText(12, 22);
				
				if(getpbp2.length()==3) 
				{ 
					Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
					System.out.println("Length of PBP Field: "+getpbp2.length()); 
				} 
				else 
				{ 
					Assert.fail("Length of PBP field is not equal to 3"); 
				} 
				
				Toplanadminmenu();				

	}

	@Then("^I validate the Contract/PBP List field \"([^\"]*)\" for type, help text, function key Ffour with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_validate_the_Contract_PBP_List_field_for_type_help_text_function_key_Ffour_with(String ConPBPList, String FIRFdate, String FIRTdate, String ConPBPListsts, String Filename, String Library) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
				//TC012 Type and TC013
				Mainframe_GlobalFunctionLib.sendText(5,22,FIRFdate); 
				Mainframe_GlobalFunctionLib.sendText(5,41,FIRTdate);
				Mainframe_GlobalFunctionLib.sendText(13,60,ConPBPList);
				Mainframe_GlobalFunctionLib.sendText(13,73,ConPBPListsts);		
				if(Mainframe_GlobalFunctionLib.getText(1, 2).trim().equals("PRCPD2290"))
				{	    
					    Mainframe_GlobalFunctionLib.sendText(17,22,Filename);
						Mainframe_GlobalFunctionLib.sendText(18,22,Library);
				}
				else
				{
					  Mainframe_GlobalFunctionLib.sendText(15,22,Filename);
					  Mainframe_GlobalFunctionLib.sendText(16,22,Library);
				}
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Thread.sleep(500);
				
				String msg = Mainframe_GlobalFunctionLib.getText(24, 2).trim();
				if(msg.equals("Press F6 to Submit to Batch")) 
				{ 
					Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
					System.out.println("System accepts alpha numerics in Contract/PBP List field: "+ConPBPList );					
					System.out.println("FIR Rejected Transaction Detail File screen accept data Contract/PBP List field When C/A/G and Contract are not entered.");
				} 
				else 
				{ 
						Assert.fail("System not accepting alpha numerics for Contract/PBP List fields "); 
				} 

				
				//TC014
				Mainframe_GlobalFunctionLib.click(13,60); 
				Thread.sleep(1000);
				Mainframe_GlobalFunctionLib.pressKey("F4");
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
				Mainframe_GlobalFunctionLib.validateText("2", "33", "Contract PBP list");
				Mainframe_GlobalFunctionLib.pressKey("F3");
				
				//TC015
				Mainframe_GlobalFunctionLib.click(13,60); 
				Thread.sleep(1000);
				Robot rob1 = new Robot(); 
				rob1.keyPress(KeyEvent.VK_F1); 
				rob1.keyRelease(KeyEvent.VK_F1); 
				Thread.sleep(1000);
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
				
				
				String ActConPbplistHelp = Mainframe_GlobalFunctionLib.getText(19, 19).trim();
								
				System.out.println(ActConPbplistHelp);
				String ExpConpbplisttext=("Contract/PBP list that is used for report selection.");
				if(ExpConpbplisttext.equals(ActConPbplistHelp))
				{	
					System.out.println("Text matching");
						
				}
				else
				{   
					System.out.println("Text is not same");
					Assert.fail("The text "+ ExpConpbplisttext +" does not match on the screen.Screenshot captured.");			
						
				}
				Mainframe_GlobalFunctionLib.pressKey("F3");
				Mainframe_GlobalFunctionLib.pressKey("F3");
				
	}
	@Then("^I validate the Contract/PBP List field \"([^\"]*)\" length$")
	public void i_validate_the_Contract_PBP_List_field_length(String ConPBPList2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    	
				//TC012 part2
				Mainframe_GlobalFunctionLib.sendText(21,7,"1");
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(13,60,ConPBPList2);
				String getconpbplist = Mainframe_GlobalFunctionLib.getText(13, 60);
				
				if(getconpbplist.length()==10) 
				{ 
					Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
					System.out.println("Length of Contract PBP list Field: "+getconpbplist.length()); 
				} 
				else 
				{ 
					Assert.fail("Length of Contract PBP list field is not equal to 10"); 
				} 
								
				Toplanadminmenu();
  }	
	
	@Then("^I validate the Contract/PBP List field \"([^\"]*)\" length in FIR Transaction Detail File Screen$")
	public void i_validate_the_Contract_PBP_List_field_length_in_FIR_Transaction_Detail_File_Screen(String ConPBPList2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
				Mainframe_GlobalFunctionLib.sendText(21,7,"3");
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(13,60,ConPBPList2);
				String getconpbplist = Mainframe_GlobalFunctionLib.getText(13, 60);
				
				if(getconpbplist.length()==10) 
				{ 
					Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
					System.out.println("Length of Contract PBP list Field: "+getconpbplist.length()); 
				} 
				else 
				{ 
					Assert.fail("Length of Contract PBP list field is not equal to 10"); 
				} 
							
				Toplanadminmenu();
	}
	@Then("^I validate the Contract/PBP List Status field \"([^\"]*)\" for type, help text, function key Ffour with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_validate_the_Contract_PBP_List_Status_field_for_type_help_text_function_key_Ffour_with(String ConPBPListsts, String FIRFdate, String FIRTdate, String ConPBPList, String Filename, String Library) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    		//TC016 and TC017
				Mainframe_GlobalFunctionLib.sendText(5,22,FIRFdate); 
				Mainframe_GlobalFunctionLib.sendText(5,41,FIRTdate);
				Mainframe_GlobalFunctionLib.sendText(13,60,ConPBPList);
				Mainframe_GlobalFunctionLib.sendText(13,73,ConPBPListsts);		
				if(Mainframe_GlobalFunctionLib.getText(1, 2).trim().equals("PRCPD2290"))
				{	    
					    Mainframe_GlobalFunctionLib.sendText(17,22,Filename);
						Mainframe_GlobalFunctionLib.sendText(18,22,Library);
				}
				else
				{
					  Mainframe_GlobalFunctionLib.sendText(15,22,Filename);
					  Mainframe_GlobalFunctionLib.sendText(16,22,Library);
				}
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Thread.sleep(500);
				
				String msg = Mainframe_GlobalFunctionLib.getText(24, 2).trim();
				if(msg.equals("Press F6 to Submit to Batch")) 
				{ 
					Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
					System.out.println("System accepts alpha chars in Contract/PBP List status field: "+ConPBPListsts );					
					System.out.println("FIR Rejected Transaction Detail File screen accept data Contract/PBP List status Only when Contract/PBP List is specified, E or I is required.");
				} 
				else 
				{ 
						Assert.fail("System not accepting alpha numerics for Contract/PBP List status fields "); 
				} 
				Thread.sleep(500);
				Mainframe_GlobalFunctionLib.sendText(13,73,"1");
				String getnum = Mainframe_GlobalFunctionLib.getText(13, 73);
				System.out.println("System allows to enter numeric value:"+getnum);
				
				//TC0018
				Mainframe_GlobalFunctionLib.sendText(13,73," ");
				Mainframe_GlobalFunctionLib.click(13,73); 
				Thread.sleep(1000);
				Mainframe_GlobalFunctionLib.pressKey("F4");
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
				Mainframe_GlobalFunctionLib.validateText("2", "30", "Display Allowed Values");
				
				Mainframe_GlobalFunctionLib.sendText(7, 4,"I");
				Thread.sleep(2000);
			    Mainframe_GlobalFunctionLib.pressKey("Enter");
				
				String ActConpbpliststsValue1 = Mainframe_GlobalFunctionLib.getText(13, 5);
				String ExpConpbpliststsValue1 = "I";
				if(ExpConpbpliststsValue1.equals(ActConpbpliststsValue1.trim()))
				{
					System.out.println("Text matching");
					Reporter.addStepLog("Contract PBP List value "+ActConpbpliststsValue1);
				}
				else
				{
					System.out.println("Text is not same");
					Assert.fail("The text "+ ExpConpbpliststsValue1 +" does not match on the screen.Screenshot captured.");	
				}
					
				Mainframe_GlobalFunctionLib.sendText(7, 4,"  ");
				Mainframe_GlobalFunctionLib.sendText(7, 4,"E");				
			    Mainframe_GlobalFunctionLib.pressKey("Enter");
			    String ActConpbpliststsValue2 = Mainframe_GlobalFunctionLib.getText(13, 5);
				String ExpConpbpliststsValue2 = "E";
				if(ExpConpbpliststsValue2.equals(ActConpbpliststsValue2.trim()))
				{
					System.out.println("Text matching");
					Reporter.addStepLog("Contract PBP List value "+ActConpbpliststsValue2);
				}
				else
				{
					System.out.println("Text is not same");
					Assert.fail("The text "+ ExpConpbpliststsValue1 +" does not match on the screen.Screenshot captured.");	
				}
				
				Mainframe_GlobalFunctionLib.sendText(7, 4,"  ");
				Mainframe_GlobalFunctionLib.sendText(7, 4,"A");
				Mainframe_GlobalFunctionLib.pressKey("Enter");
			    String ActConpbpliststsValue3 = Mainframe_GlobalFunctionLib.getText(13, 5);
				String ExpConpbpliststsValue3 = "A";
				if(ExpConpbpliststsValue3.equals(ActConpbpliststsValue3.trim()))
				{
					System.out.println("Text matching");
					Reporter.addStepLog("Contract PBP List value "+ActConpbpliststsValue3);
				}
				else
				{
					System.out.println("Text is not same");
					Assert.fail("The text "+ ExpConpbpliststsValue3 +" does not match on the screen.Screenshot captured.");	
				}
				Mainframe_GlobalFunctionLib.pressKey("F3");
							
				//TC019
				Mainframe_GlobalFunctionLib.click(13,73); 
				Thread.sleep(1000);
				Robot rob1 = new Robot(); 
				rob1.keyPress(KeyEvent.VK_F1); 
				rob1.keyRelease(KeyEvent.VK_F1); 
				Thread.sleep(1000);
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
							
				String Sts1 = Mainframe_GlobalFunctionLib.getText(14, 5);
				String Sts2 = Mainframe_GlobalFunctionLib.getText(14, 26);
				
				String Sts3 = Mainframe_GlobalFunctionLib.getText(15, 5).trim();
				String Sts4 = Mainframe_GlobalFunctionLib.getText(15, 17).substring(0,3).trim();
				
				String Sts5 = Mainframe_GlobalFunctionLib.getText(16, 5).trim();
				String Sts6 = Mainframe_GlobalFunctionLib.getText(16, 17).substring(0,5).trim();;
				
				String Sts7 = Mainframe_GlobalFunctionLib.getText(17, 5).trim();
				String Sts8 = Mainframe_GlobalFunctionLib.getText(17, 17).substring(0,7).trim();
				
				String Sts9 = Mainframe_GlobalFunctionLib.getText(18, 5).trim();
				String Sts10 = Mainframe_GlobalFunctionLib.getText(18, 17).substring(0,7).trim();
				
				String ActstsHelptext=Sts1+" "+Sts2+": "+Sts3+" "+Sts4+","+Sts5+" "+Sts6+","+Sts7+" "+Sts8+","+Sts9+" "+Sts10;
							
				System.out.println(ActstsHelptext);
				String ExpstsHelptext=("Contract PBP ListI/E REQUIRED: A All,*BLANK Blank,E Exclude,I Include");
				if(ExpstsHelptext.equals(ActstsHelptext))
				{	
					System.out.println("Text matching");
					Reporter.addStepLog("Help message content displaying for Contract PBP List status "+ActstsHelptext);
				}
				else
				{   
					System.out.println("Text is not same");
					Assert.fail("The text "+ ExpstsHelptext +" does not match on the screen.Screenshot captured.");			
						
				}

								
				Mainframe_GlobalFunctionLib.pressKey("F3");
				Mainframe_GlobalFunctionLib.pressKey("F3");
	}
	
	@Then("^I validate the Contract/PBP List status field \"([^\"]*)\" length$")
	public void i_validate_the_Contract_PBP_List_status_field_length(String ConPBPListsts2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
				//TC016 part2
				Mainframe_GlobalFunctionLib.sendText(21,7,"1");
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(13,73,ConPBPListsts2);
				String getconpbpliststs = Mainframe_GlobalFunctionLib.getText(13, 73);
				
				if(getconpbpliststs.length()==1) 
				{ 
					Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
					System.out.println("Length of Contract PBP list status Field: "+getconpbpliststs.length()); 
				} 
				else 
				{ 
					Assert.fail("Length of Contract PBP list status field is not equal to 1"); 
				}
	
				Toplanadminmenu();
	}
	
	@Then("^I validate the Contract/PBP List status field \"([^\"]*)\" length in FIR Transaction Detail File Screen$")
	public void i_validate_the_Contract_PBP_List_status_field_length_in_FIR_Transaction_Detail_File_Screen(String ConPBPListsts2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
				Mainframe_GlobalFunctionLib.sendText(21,7,"3");
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(13,73,ConPBPListsts2);
				String getconpbpliststs = Mainframe_GlobalFunctionLib.getText(13, 73);
				
				if(getconpbpliststs.length()==1) 
				{ 
					Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
					System.out.println("Length of Contract PBP list status Field: "+getconpbpliststs.length()); 
				} 
				else 
				{ 
					Assert.fail("Length of Contract PBP list status field is not equal to 1"); 
				}
		
				Toplanadminmenu();
	}

	@Then("^I validate the error message when C/A/G range is entered and Contract, PBP and Contract/PBP List  is also entered with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_validate_the_the_error_message_when_C_A_G_range_is_entered_and_Contract_PBP_and_Contract_PBP_List_is_also_entered_with(String FIRFdate, String FIRTdate, String CarrierFrom, String CarrierThru, String AccountFrom, String AccountThru, String GroupFrom, String GroupThru, String Contract, String PBP, String ConPBPList, String ConPBPListsts,String Filename, String Library) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
		validationerrmsg_cagrange_cont_pbp_conbplist(FIRFdate, FIRTdate, CarrierFrom, CarrierThru, AccountFrom, AccountThru, GroupFrom, GroupThru, Contract, PBP, ConPBPList, ConPBPListsts, Filename, Library);
		Mainframe_GlobalFunctionLib.pressKey("F3");
	}
	
	@Then("^I validate the error message when CAG list is entered and Contract, PBP and Contract/PBP List  is also entered with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_validate_the_error_message_when_CAG_list_is_entered_and_Contract_PBP_and_Contract_PBP_List_is_also_entered_with(String FIRFdate, String FIRTdate, String CarrierList, String AccountList, String GroupList, String CAGListsts, String Contract, String PBP, String ConPBPList, String ConPBPListsts,String Filename, String Library) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
				Mainframe_GlobalFunctionLib.sendText(21,7,"1");
				Mainframe_GlobalFunctionLib.pressKey("Enter");			
				validationerrmsg_caglist_contract_pbp_conpbplist(FIRFdate, FIRTdate, CarrierList, AccountList, GroupList, CAGListsts, Contract, PBP, ConPBPList, ConPBPListsts, Filename, Library);
				Mainframe_GlobalFunctionLib.pressKey("F3");	
				
	}

	@Then("^I validate the error message when Contract is entered and Enter C/A/G range and C/A/G List and Contract/PBP List is also entered with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_validate_the_error_message_when_Contract_is_entered_and_Enter_C_A_G_range_and_C_A_G_List_and_Contract_PBP_List_is_also_entered_with(String FIRFdate, String FIRTdate, String CarrierFrom, String CarrierThru, String AccountFrom, String AccountThru, String GroupFrom, String GroupThru, String CarrierList, String AccountList, String GroupList, String CAGListsts, String Contract, String ConPBPList, String ConPBPListsts,String Filename, String Library) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
				Mainframe_GlobalFunctionLib.sendText(21,7,"1");
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				validationerrmsg_contract_cagrange_conpbplist(FIRFdate, FIRTdate, CarrierFrom, CarrierThru, AccountFrom, AccountThru, GroupFrom, GroupThru, CarrierList, AccountList, GroupList, CAGListsts, Contract, ConPBPList, ConPBPListsts,Filename, Library);
				Mainframe_GlobalFunctionLib.pressKey("F3");
		
	}
	
	@Then("^I validate the error message when PBP is entered but Contract is not entered with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_validate_the_error_message_when_PBP_is_entered_but_Contract_is_not_entered_with(String FIRFdate, String FIRTdate, String PBP, String Filename, String Library) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
				Mainframe_GlobalFunctionLib.sendText(21,7,"1");
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				validationerrmsg_pbp_contract(FIRFdate, FIRTdate, PBP, Filename, Library);
				Mainframe_GlobalFunctionLib.pressKey("F3");
				
	}
	@Then("^I validate the error message when Contract and PBP are entered and C/A/G is also entered with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_validate_the_error_message_when_Contract_and_PBP_are_entered_and_C_A_G_is_also_entered_with(String FIRFdate, String FIRTdate, String CarrierFrom, String CarrierThru, String AccountFrom, String AccountThru, String GroupFrom, String GroupThru, String Contract, String PBP, String Filename, String Library) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    		
				Mainframe_GlobalFunctionLib.sendText(21,7,"1");
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Contract_pbp_cagrange(FIRFdate, FIRTdate, CarrierFrom, CarrierThru, AccountFrom, AccountThru, GroupFrom, GroupThru, Contract, PBP, Filename, Library);
				Mainframe_GlobalFunctionLib.pressKey("F3");
			
	}
	
	@Then("^I validate the error message when Contract and PBP are entered and CAG List is also entered with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_validate_the_error_message_when_Contract_and_PBP_are_entered_and_CAG_List_is_also_entered_with(String FIRFdate, String FIRTdate, String CarrierList, String AccountList, String GroupList, String CAGListsts, String Contract, String PBP, String Filename, String Library) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
				Mainframe_GlobalFunctionLib.sendText(21,7,"1");
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				contract_pbp_caglist(FIRFdate, FIRTdate, CarrierList, AccountList, GroupList, CAGListsts, Contract, PBP, Filename, Library);
				Mainframe_GlobalFunctionLib.pressKey("F3");
				
	}
	
	@Then("^I validate the error mesage when Contract and PBP are entered and Contract/PBP List is also entered with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_validate_the_error_mesage_when_Contract_and_PBP_are_entered_and_Contract_PBP_List_is_also_entered_with(String FIRFdate, String FIRTdate, String Contract, String PBP, String ConPBPList, String ConPBPListsts, String Filename, String Library) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
				Mainframe_GlobalFunctionLib.sendText(21,7,"1");
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				contract_pbp_conpbplist(FIRFdate, FIRTdate, Contract, PBP, ConPBPList, ConPBPListsts, Filename, Library);		
				Mainframe_GlobalFunctionLib.pressKey("F3");
					
	}
	@Then("^I validate the error message when Contract/PBP List is entered and C/A/G is also entered with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_validate_the_error_message_when_Contract_PBP_List_is_entered_and_C_A_G_is_also_entered_with(String FIRFdate, String FIRTdate, String CarrierFrom, String CarrierThru, String AccountFrom, String AccountThru, String GroupFrom, String GroupThru, String ConPBPList, String ConPBPListsts, String Filename, String Library) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
				Mainframe_GlobalFunctionLib.sendText(21,7,"1");
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				contpbplist_cag(FIRFdate, FIRTdate, CarrierFrom, CarrierThru, AccountFrom, AccountThru, GroupFrom, GroupThru, ConPBPList, ConPBPListsts, Filename, Library);				
				Mainframe_GlobalFunctionLib.pressKey("F3");
	
	}
	
	@Then("^I validate the error message when Contract/PBP List is entered and CAG List is also entered with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_validate_the_error_message_when_Contract_PBP_List_is_entered_and_CAG_List_is_also_entered_with(String FIRFdate, String FIRTdate, String CarrierList, String AccountList, String GroupList, String CAGListsts, String ConPBPList, String ConPBPListsts, String Filename, String Library) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
				Mainframe_GlobalFunctionLib.sendText(21,7,"1");
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				contpbplist_caglist(FIRFdate, FIRTdate, CarrierList, AccountList, GroupList, CAGListsts, ConPBPList, ConPBPListsts, Filename, Library);		
				Mainframe_GlobalFunctionLib.pressKey("F3");
			
	}
	@Then("^I validate the error message when Contract/PBP List is entered and Contract is also enetered with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_validate_the_error_message_when_Contract_PBP_List_is_entered_and_Contract_is_also_enetered_with(String FIRFdate, String FIRTdate, String Contract, String ConPBPList, String ConPBPListsts, String Filename, String Library) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
					Mainframe_GlobalFunctionLib.sendText(21,7,"1");
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					contpbplist_cont(FIRFdate, FIRTdate, Contract, ConPBPList, ConPBPListsts, Filename, Library);			
					Mainframe_GlobalFunctionLib.pressKey("F3");
	}
	
	@Then("^I validate the error message when Contract/PBP List is entered and PBP is also enetered with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_validate_the_error_message_when_Contract_PBP_List_is_entered_and_PBP_is_also_enetered_with(String FIRFdate, String FIRTdate, String PBP, String ConPBPList, String ConPBPListsts, String Filename, String Library) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
					Mainframe_GlobalFunctionLib.sendText(21,7,"1");
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					contpbplist_pbp(FIRFdate, FIRTdate, PBP, ConPBPList, ConPBPListsts, Filename, Library);
					Mainframe_GlobalFunctionLib.pressKey("F3");
					
	}
	
	@Then("^I validate the error message when File Name is missing with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_validate_the_error_message_when_File_Name_is_missing_with(String FIRFdate, String FIRTdate, String Contract, String Library) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
				Mainframe_GlobalFunctionLib.sendText(21,7,"1");
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				filemissing( FIRFdate, FIRTdate, Contract, Library);			
				Mainframe_GlobalFunctionLib.pressKey("F3");
	}
	
	@Then("^I validate the error message when Library is missing with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_validate_the_error_message_when_Library_is_missing_with(String FIRFdate, String FIRTdate, String Contract, String Filename) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
				Mainframe_GlobalFunctionLib.sendText(21,7,"1");
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Librarymissing(FIRFdate, FIRTdate, Contract, Filename);				
				Mainframe_GlobalFunctionLib.pressKey("F3");
	}

@Then("^I validate the error message when File Name and Library is missing with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
public void i_validate_the_error_message_when_File_Name_and_Library_is_missing_with(String FIRFdate, String FIRTdate, String Contract) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    
				Mainframe_GlobalFunctionLib.sendText(21,7,"1");
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				FileLibrarymissing(FIRFdate, FIRTdate, Contract);				
				Mainframe_GlobalFunctionLib.pressKey("F3");
	}
	@Then("^I validate the Sort By field$")
	public void i_validate_the_Sort_By_field() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
				Mainframe_GlobalFunctionLib.sendText(21,7,"1");
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				
				Mainframe_GlobalFunctionLib.click(15, 22 );
				Thread.sleep(2000);
				Mainframe_GlobalFunctionLib.sendText(15, 22," " );
				Mainframe_GlobalFunctionLib.click(15, 22 );
				Thread.sleep(2000);
				Mainframe_GlobalFunctionLib.pressKey("F4");
				Mainframe_GlobalFunctionLib.sendText(7, 4,"R" );
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(13, 3,"X" );
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				String Desc = Mainframe_GlobalFunctionLib.getText(15, 25).trim();
				if(Desc.equals("Sorted by 4RX")) 
					{ 
						Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
						System.out.println("Description appearing for Sort By R: "+Desc );
						Reporter.addStepLog("Description appearing for Sort By R: "+Desc );
					} 
				else 
					{ 
							Assert.fail("Description for Sort By not appearing as expected "); 
					} 
				
				Mainframe_GlobalFunctionLib.sendText(15, 22," " );
				Mainframe_GlobalFunctionLib.click(15, 22 );
				Thread.sleep(1000);
				Mainframe_GlobalFunctionLib.pressKey("F4");
				Mainframe_GlobalFunctionLib.sendText(7, 4,"C" );
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText(13, 3,"X" );
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				String Desc1 = Mainframe_GlobalFunctionLib.getText(15, 25).trim();
				if(Desc1.equals("Sorted by C/A/G")) 
					{ 
						Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
						System.out.println("Description appearing for Sort By C: "+Desc1 );
						Reporter.addStepLog("Description appearing for Sort By C: "+Desc1 );
					} 
				else 
					{ 
							Assert.fail("Description for Sort By not appearing as expected "); 
					}
				Mainframe_GlobalFunctionLib.pressKey("F3");
	}
	
	@Then("^I validate the default values in the screen \"([^\"]*)\"$")
	public void i_validate_the_default_values_in_the_screen(String Screen) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
			//Mainframe_GlobalFunctionLib.sendText(21,7,"1");
			//Mainframe_GlobalFunctionLib.pressKey("Enter");			
			Mainframe_GlobalFunctionLib.validateText("2", "23", Screen);
			defaultv();
					
			
	}
	@Then("^I validate the default values in the FIR Transaction Detail File screen \"([^\"]*)\"$")
	public void i_validate_the_default_values_in_the_FIR_Transaction_Detail_File_screen(String Screen) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
				Mainframe_GlobalFunctionLib.validateText("2", "28", Screen);
				defaultv();
				Toplanadminmenu();
	}
	@Then("^I validate the error message when C/A/G range is entered and Contract, PBP and Contract/PBP List  is also entered in FIR Transaction Detail File with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_validate_the_error_message_when_C_A_G_range_is_entered_and_Contract_PBP_and_Contract_PBP_List_is_also_entered_in_FIR_Transaction_Detail_File_with(String FIRFdate, String FIRTdate, String CarrierFrom, String CarrierThru, String AccountFrom, String AccountThru, String GroupFrom, String GroupThru, String Contract, String PBP, String ConPBPList, String ConPBPListsts, String Filename, String Library) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions   
				validationerrmsg_cagrange_cont_pbp_conbplist(FIRFdate, FIRTdate, CarrierFrom, CarrierThru, AccountFrom, AccountThru, GroupFrom, GroupThru, Contract, PBP, ConPBPList, ConPBPListsts, Filename, Library);
				Mainframe_GlobalFunctionLib.pressKey("F3");
	}
	
	@Then("^I validate the error message when CAG list is entered and Contract, PBP and Contract/PBP List  is also entered with in FIR Transaction Detail File with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_validate_the_error_message_when_CAG_list_is_entered_and_Contract_PBP_and_Contract_PBP_List_is_also_entered_with_in_FIR_Transaction_Detail_File_with(String FIRFdate, String FIRTdate, String CarrierList, String AccountList, String GroupList, String CAGListsts, String Contract, String PBP, String ConPBPList, String ConPBPListsts,String Filename, String Library) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
				Mainframe_GlobalFunctionLib.sendText(21,7,"3");
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				validationerrmsg_caglist_contract_pbp_conpbplist(FIRFdate, FIRTdate, CarrierList, AccountList, GroupList, CAGListsts, Contract, PBP, ConPBPList, ConPBPListsts, Filename, Library);
				Mainframe_GlobalFunctionLib.pressKey("F3");

	}
	@Then("^I validate the error message when Contract is entered and Enter C/A/G range and C/A/G List and Contract/PBP List is also entered in FIR Transaction Detail File with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_validate_the_error_message_when_Contract_is_entered_and_Enter_C_A_G_range_and_C_A_G_List_and_Contract_PBP_List_is_also_entered_in_FIR_Transaction_Detail_File_with(String FIRFdate, String FIRTdate, String CarrierFrom, String CarrierThru, String AccountFrom, String AccountThru, String GroupFrom, String GroupThru, String CarrierList, String AccountList, String GroupList, String CAGListsts, String Contract, String ConPBPList, String ConPBPListsts,String Filename, String Library) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
				Mainframe_GlobalFunctionLib.sendText(21,7,"3");
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				validationerrmsg_contract_cagrange_conpbplist(FIRFdate, FIRTdate, CarrierFrom, CarrierThru, AccountFrom, AccountThru, GroupFrom, GroupThru, CarrierList, AccountList, GroupList, CAGListsts, Contract, ConPBPList, ConPBPListsts,Filename, Library);
				Mainframe_GlobalFunctionLib.pressKey("F3");
	}
	@Then("^I validate the error message when PBP is entered but Contract is not entered in FIR Transaction Detail File with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_validate_the_error_message_when_PBP_is_entered_but_Contract_is_not_entered_in_FIR_Transaction_Detail_File_with(String FIRFdate, String FIRTdate, String PBP, String Filename, String Library) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
				Mainframe_GlobalFunctionLib.sendText(21,7,"3");
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				validationerrmsg_pbp_contract(FIRFdate, FIRTdate, PBP, Filename, Library); 
				Mainframe_GlobalFunctionLib.pressKey("F3");
	}

	@Then("^I validate the error message when Contract and PBP are entered and C/A/G is also entered in FIR Transaction Detail File with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_validate_the_error_message_when_Contract_and_PBP_are_entered_and_C_A_G_is_also_entered_in_FIR_Transaction_Detail_File_with(String FIRFdate, String FIRTdate, String CarrierFrom, String CarrierThru, String AccountFrom, String AccountThru, String GroupFrom, String GroupThru, String Contract, String PBP, String Filename, String Library) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
				Mainframe_GlobalFunctionLib.sendText(21,7,"3");
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Contract_pbp_cagrange(FIRFdate, FIRTdate, CarrierFrom, CarrierThru, AccountFrom, AccountThru, GroupFrom, GroupThru, Contract, PBP, Filename, Library);
				Mainframe_GlobalFunctionLib.pressKey("F3");
	}
	@Then("^I validate the error message when Contract and PBP are entered and CAG List is also entered in FIR Transaction Detail File with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_validate_the_error_message_when_Contract_and_PBP_are_entered_and_CAG_List_is_also_entered_in_FIR_Transaction_Detail_File_with(String FIRFdate, String FIRTdate, String CarrierList, String AccountList, String GroupList, String CAGListsts, String Contract, String PBP, String Filename, String Library) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
				Mainframe_GlobalFunctionLib.sendText(21,7,"3");
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				contract_pbp_caglist(FIRFdate, FIRTdate, CarrierList, AccountList, GroupList, CAGListsts, Contract, PBP, Filename, Library);
				Mainframe_GlobalFunctionLib.pressKey("F3");
	}
	@Then("^I validate the error mesage when Contract and PBP are entered and Contract/PBP List is also entered in FIR Transaction Detail File with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_validate_the_error_mesage_when_Contract_and_PBP_are_entered_and_Contract_PBP_List_is_also_entered_in_FIR_Transaction_Detail_File_with(String FIRFdate, String FIRTdate, String Contract, String PBP, String ConPBPList, String ConPBPListsts, String Filename, String Library) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
				Mainframe_GlobalFunctionLib.sendText(21,7,"3");
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				contract_pbp_conpbplist(FIRFdate, FIRTdate, Contract, PBP, ConPBPList, ConPBPListsts, Filename, Library);
				Mainframe_GlobalFunctionLib.pressKey("F3");
	}
	@Then("^I validate the error message when Contract/PBP List is entered and C/A/G is also entered in FIR Transaction Detail File with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_validate_the_error_message_when_Contract_PBP_List_is_entered_and_C_A_G_is_also_entered_in_FIR_Transaction_Detail_File_with(String FIRFdate, String FIRTdate, String CarrierFrom, String CarrierThru, String AccountFrom, String AccountThru, String GroupFrom, String GroupThru, String ConPBPList, String ConPBPListsts, String Filename, String Library) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
				Mainframe_GlobalFunctionLib.sendText(21,7,"3");
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				contpbplist_cag(FIRFdate, FIRTdate, CarrierFrom, CarrierThru, AccountFrom, AccountThru, GroupFrom, GroupThru, ConPBPList, ConPBPListsts, Filename, Library);
				Mainframe_GlobalFunctionLib.pressKey("F3");
	}
	@Then("^I validate the error message when Contract/PBP List is entered and CAG List is also entered in FIR Transaction Detail File with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_validate_the_error_message_when_Contract_PBP_List_is_entered_and_CAG_List_is_also_entered_in_FIR_Transaction_Detail_File_with(String FIRFdate, String FIRTdate, String CarrierList, String AccountList, String GroupList, String CAGListsts, String ConPBPList, String ConPBPListsts, String Filename, String Library) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
				Mainframe_GlobalFunctionLib.sendText(21,7,"3");
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				contpbplist_caglist(FIRFdate, FIRTdate, CarrierList, AccountList, GroupList, CAGListsts, ConPBPList, ConPBPListsts, Filename, Library);
				Mainframe_GlobalFunctionLib.pressKey("F3");
	}
	@Then("^I validate the error message when Contract/PBP List is entered and Contract is also enetered in FIR Transaction Detail File with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_validate_the_error_message_when_Contract_PBP_List_is_entered_and_Contract_is_also_enetered_in_FIR_Transaction_Detail_File_with(String FIRFdate, String FIRTdate, String Contract, String ConPBPList, String ConPBPListsts, String Filename, String Library) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
				Mainframe_GlobalFunctionLib.sendText(21,7,"3");
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				contpbplist_cont(FIRFdate, FIRTdate, Contract, ConPBPList, ConPBPListsts, Filename, Library);
				Mainframe_GlobalFunctionLib.pressKey("F3");
	}
	@Then("^I validate the error message when Contract/PBP List is entered and PBP is also enetered in FIR Transaction Detail File with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_validate_the_error_message_when_Contract_PBP_List_is_entered_and_PBP_is_also_enetered_in_FIR_Transaction_Detail_File_with(String FIRFdate, String FIRTdate, String PBP, String ConPBPList, String ConPBPListsts, String Filename, String Library) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
				Mainframe_GlobalFunctionLib.sendText(21,7,"3");
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				contpbplist_pbp(FIRFdate, FIRTdate, PBP, ConPBPList, ConPBPListsts, Filename, Library);
				Mainframe_GlobalFunctionLib.pressKey("F3");
	}
	@Then("^I validate the error message when File Name is missing in FIR Transaction Detail File with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_validate_the_error_message_when_File_Name_is_missing_in_FIR_Transaction_Detail_File_with(String FIRFdate, String FIRTdate, String Contract, String Library) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
				Mainframe_GlobalFunctionLib.sendText(21,7,"3");
				Mainframe_GlobalFunctionLib.pressKey("Enter");
		        filemissing( FIRFdate, FIRTdate, Contract, Library);
		        Mainframe_GlobalFunctionLib.pressKey("F3");
	}
	@Then("^I validate the error message when Library is missing in FIR Transaction Detail File with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_validate_the_error_message_when_Library_is_missing_in_FIR_Transaction_Detail_File_with(String FIRFdate, String FIRTdate, String Contract, String Filename) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
				Mainframe_GlobalFunctionLib.sendText(21,7,"3");
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Librarymissing(FIRFdate, FIRTdate, Contract, Filename);
				Mainframe_GlobalFunctionLib.pressKey("F3");
	}
	@Then("^I validate the error message when File Name and Library is missing in FIR Transaction Detail File with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_validate_the_error_message_when_File_Name_and_Library_is_missing_in_FIR_Transaction_Detail_File_with(String FIRFdate, String FIRTdate, String Contract) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
				Mainframe_GlobalFunctionLib.sendText(21,7,"3");
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				FileLibrarymissing(FIRFdate, FIRTdate, Contract);
				Mainframe_GlobalFunctionLib.pressKey("F3");
	}

}	





