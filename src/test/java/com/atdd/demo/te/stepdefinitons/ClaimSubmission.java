package com.atdd.demo.te.stepdefinitons;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

import com.cucumber.listener.Reporter;
import com.optumrx.autofusion.core.te.util.Mainframe_GlobalFunctionLib;
import com.optumrx.autofusion.core.te.util.Screenshot;

import cucumber.api.java.en.Then;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ClaimSubmission {
	
	String user = System.getProperty("user.dir");
    String filepath = user+"\\src\\test\\resources\\features\\datafolder\\TestData.xls";
   
	@Then("^I submit the claim for multiple members with \"([^\"]*)\"$")
	public void i_submit_the_claim_for_multiple_members_with(String modname) throws BiffException,Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 FileInputStream fs = new FileInputStream(filepath);
		 Workbook wb = Workbook.getWorkbook(fs);
		 Sheet sh = wb.getSheet(modname);
		 int rowcount = sh.getRows();
		 int colcount = sh.getColumns();
		 
	    	for(int col =0;col<colcount;col++)
	    	{
	    	String text = sh.getCell(col,0).getContents();
	    	if(text.equals("MemberID"))
	    	{
	    		
	    		
	    		for(int rows=1;rows<rowcount;rows++)
	    		{
	    			String Memberid = sh.getCell(col,rows).getContents();
	    			Mainframe_GlobalFunctionLib.sendText("04", "004", Memberid);
	    			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	    			Mainframe_GlobalFunctionLib.pressKey("Enter");
	    			Mainframe_GlobalFunctionLib.sendText("09", "002", "1");
	    			Mainframe_GlobalFunctionLib.pressKey("Enter");
	    			
	    				int cols = colindex("RxNo",modname);
	    				String data = sh.getCell(cols,rows).getContents();
		    		
	    			Mainframe_GlobalFunctionLib.sendText("05", "029", data);
	    			Mainframe_GlobalFunctionLib.click(4,65);
	    			Robot ro = new Robot();
	    			for(int itr = 0;itr<13;itr++)
	    			{
	    				ro.keyPress(KeyEvent.VK_DELETE);
	    				ro.keyRelease(KeyEvent.VK_DELETE);
	    			}
	    			
	    			final DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
	    			Date currdate = new Date();
	    			String currentdate = dateFormat.format(currdate);
	    			String curr_date = currentdate.replace("/","");
	    			Mainframe_GlobalFunctionLib.sendText("04", "065",curr_date);
	    			Mainframe_GlobalFunctionLib.pressKey("Enter");
	    			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	    			Mainframe_GlobalFunctionLib.pressKey("F6");
	    			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	    			Mainframe_GlobalFunctionLib.pressKey("F7");
	    			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	    			Mainframe_GlobalFunctionLib.pressKey("F12");
	    			Mainframe_GlobalFunctionLib.pressKey("F12");
	    			
	    		}
	    		
	    	}
	    	}
	   
	    //Mainframe_GlobalFunctionLib.sendText("04", "004", MemberID);
	    }
	
	public int colindex(String colname,String sheetname) throws BiffException, IOException
	{
		FileInputStream fso = new FileInputStream(filepath);
		 Workbook wbook = Workbook.getWorkbook(fso);
		 Sheet she = wbook.getSheet(sheetname);
		 int colcounts = she.getColumns();
		 int col;
		 for(col =0;col<colcounts;col++)
	    	{
			 String colindex = she.getCell(col,0).getContents();
			 if(colindex.equals(colname))
			 {
				
				 System.out.println(colindex);
				 break;
			 }
			 
	    	}
		return col;
		
	}
}
    

