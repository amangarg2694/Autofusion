package com.atdd.demo.te.stepdefinitons;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import com.cucumber.listener.Reporter;
import com.optumrx.autofusion.core.te.util.Mainframe_GlobalFunctionLib;
import com.optumrx.autofusion.core.te.util.Screenshot;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SR41834_TC1 {
	
	public static void f1Press(String arg1) throws Throwable{
		Robot r=new Robot();
		if(arg1.equals("F1")){
		r.keyPress(KeyEvent.VK_F1);
		r.keyRelease(KeyEvent.VK_F1);
		Thread.sleep(2000);
		}
	}

	
	@When("^I verify if extra file formats are added to file format in \"([^\"]*)\"$")
	public void i_verify_if_extra_file_formats_are_added_to_file_format_in(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    Mainframe_GlobalFunctionLib.click(11, 21);
	    Mainframe_GlobalFunctionLib.pressKey("F4");
		Thread.sleep(3000);
	    String actualHistoricalCatamaran="HS";
	   String ExpetHistoricalCatamaran=Mainframe_GlobalFunctionLib.getText(13, 5);
	   Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	   if(actualHistoricalCatamaran.equals(ExpetHistoricalCatamaran))
	   {
		   System.out.println("The File HS: Historical Catamaran is present:"+ExpetHistoricalCatamaran);
	   }
	   else
	   {
		   System.out.println("The File HS: Historical Catamaran is not present:");
	   }
	   
	   String actualHistoricalVerisk="HV";
	   String ExpetHistoricalVerisk=Mainframe_GlobalFunctionLib.getText(14, 5);
	   Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	   if(actualHistoricalVerisk.equals(ExpetHistoricalVerisk))
	   {
		   System.out.println("The File HV: Historical Verisk is present:"+ExpetHistoricalVerisk);
	   }
	   else
	   {
		   System.out.println("The File HV: Historical Verisk is not present:");
	   }
	    
	   Mainframe_GlobalFunctionLib.pressKey("F12");
	   Thread.sleep(30000);
	    
	}
	
	
	@When("^I press \"([^\"]*)\" in file format field$")
	public void i_press_in_file_format_field(String args1) throws Throwable {
	/*	//Mainframe_GlobalFunctionLib.click(11, 21);
	   	Robot r=new Robot();
		//if(F1.equals("F1")){
		r.keyPress(KeyEvent.VK_F1);
		r.keyRelease(KeyEvent.VK_F1);
		Thread.sleep(3000);
		}*/
		Mainframe_GlobalFunctionLib.click(11, 21);
		f1Press("F1");
	}	
	
	@Then("^I verify the message \"([^\"]*)\"$")
	public void i_verify_the_message(String msg) throws Throwable {
	    Mainframe_GlobalFunctionLib.pressKey("PageDown");
	    String msgActual="Wrk File Format PRCHIMEXT - Help";
	    System.out.println("Header test Actual : "+msgActual);
	    String getHeader=Mainframe_GlobalFunctionLib.getText(13, 20);
	    System.out.println("Header test Expected : "+getHeader);
	    if(msgActual.equals(getHeader)){
	    	System.out.println("Header Text file show ");
	    }else
	    {
	    	System.out.println("Header Text file not shown ");
	    }
	    
	}
}


