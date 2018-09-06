package com.atdd.demo.te.stepdefinitons;

import java.util.concurrent.TimeUnit;

import com.cucumber.listener.Reporter;
import com.optumrx.autofusion.core.te.util.Mainframe_GlobalFunctionLib;
import com.optumrx.autofusion.core.te.util.Screenshot;

import cucumber.api.java.en.Then;

public class PricingScreenSR41360 {

	@Then("^Validating the price table screen options and functionality with \"([^\"]*)\"$")
	public void validating_the_price_table_screen_options_and_functionality_with(String env) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   if((env.equals("8402")) || (env.equals("8403")))
	   {
		   Mainframe_GlobalFunctionLib.pressKey("F15");
		   Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
	   }
	  
	   else if(env.equals("8401"))
	   {
		   Mainframe_GlobalFunctionLib.sendText("21","07","6");
		   Mainframe_GlobalFunctionLib.pressKey("Enter");
		   Mainframe_GlobalFunctionLib.sendText("06","041",env);
		   Mainframe_GlobalFunctionLib.pressKey("Enter");
		   Mainframe_GlobalFunctionLib.sendText("21","07","20");
		   Mainframe_GlobalFunctionLib.pressKey("Enter");
		   Mainframe_GlobalFunctionLib.sendText("21","07","5");
		   Mainframe_GlobalFunctionLib.pressKey("Enter");
		   Mainframe_GlobalFunctionLib.sendText("21","07","1");
		   Mainframe_GlobalFunctionLib.pressKey("Enter");
		   Mainframe_GlobalFunctionLib.sendText("21","07","2");
		   Mainframe_GlobalFunctionLib.pressKey("Enter");
		   Mainframe_GlobalFunctionLib.pressKey("F15");
		   Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		   Mainframe_GlobalFunctionLib.closeTE();
	   }
	}
	
	@Then("^Verifying the Display functionality on price table screen with \"([^\"]*)\"$")
	public void verifying_the_Display_functionality_on_price_table_screen_with(String env) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 if((env.equals("8402")) || (env.equals("8403")))
		   {
			   Mainframe_GlobalFunctionLib.pressKey("F15");
			   Mainframe_GlobalFunctionLib.pressKey("F8");
			   Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		   }
		  
		   else if(env.equals("8401"))
		   {
			   Mainframe_GlobalFunctionLib.sendText("21","07","6");
			   Mainframe_GlobalFunctionLib.pressKey("Enter");
			   Mainframe_GlobalFunctionLib.sendText("06","041",env);
			   Mainframe_GlobalFunctionLib.pressKey("Enter");
			   Mainframe_GlobalFunctionLib.sendText("21","07","20");
			   Mainframe_GlobalFunctionLib.pressKey("Enter");
			   Mainframe_GlobalFunctionLib.sendText("21","07","5");
			   Mainframe_GlobalFunctionLib.pressKey("Enter");
			   Mainframe_GlobalFunctionLib.sendText("21","07","1");
			   Mainframe_GlobalFunctionLib.pressKey("Enter");
			   Mainframe_GlobalFunctionLib.sendText("21","07","2");
			   Mainframe_GlobalFunctionLib.pressKey("Enter");
			   Mainframe_GlobalFunctionLib.pressKey("F15");
			   Mainframe_GlobalFunctionLib.pressKey("F8");
			   Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			   //Mainframe_GlobalFunctionLib.closeTE();
		   } 
	}
	
	@Then("^Verifying the edit functionality on price table screen with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void verifying_the_edit_functionality_on_price_table_screen_with_and(String env, String tablename) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		if((env.equals("8402") || env.equals("8403")))
		   {
			 Mainframe_GlobalFunctionLib.sendText("04","25",tablename);
			 Mainframe_GlobalFunctionLib.pressKey("Enter");
			 Mainframe_GlobalFunctionLib.sendText("10","02","2");
			 Mainframe_GlobalFunctionLib.pressKey("Enter");
			 Mainframe_GlobalFunctionLib.sendText("04","26","TESTING");
			 Mainframe_GlobalFunctionLib.pressKey("Enter");
			 Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
			 Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
		   }
		else if(env.equals("8401"))
		{
			   Mainframe_GlobalFunctionLib.sendText("21","07","6");
			   Mainframe_GlobalFunctionLib.pressKey("Enter");
			   Mainframe_GlobalFunctionLib.sendText("06","41",env);
			   Mainframe_GlobalFunctionLib.pressKey("Enter");
			   Mainframe_GlobalFunctionLib.sendText("21","07","20");
			   Mainframe_GlobalFunctionLib.pressKey("Enter");
			   Mainframe_GlobalFunctionLib.sendText("21","07","5");
			   Mainframe_GlobalFunctionLib.pressKey("Enter");
			   Mainframe_GlobalFunctionLib.sendText("21","07","1");
			   Mainframe_GlobalFunctionLib.pressKey("Enter");
			   Mainframe_GlobalFunctionLib.sendText("21","07","2");
			   Mainframe_GlobalFunctionLib.pressKey("Enter");
			   Mainframe_GlobalFunctionLib.sendText("04","25",tablename);
			   Mainframe_GlobalFunctionLib.pressKey("Enter");
			   Mainframe_GlobalFunctionLib.sendText("10","02","2");
			   Mainframe_GlobalFunctionLib.pressKey("Enter");
			   Mainframe_GlobalFunctionLib.sendText("04","26","TESTING");
			   Mainframe_GlobalFunctionLib.pressKey("Enter");
			   Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
			   Mainframe_GlobalFunctionLib.closeTE();
		}
		
	}
	
	@Then("^Verifying the edit functionality using function key on price table screen with \"([^\"]*)\"$")
	public void verifying_the_edit_functionality_using_function_key_on_price_table_screen_with_and(String env) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		if((env.equals("8402") || env.equals("8403")))
		   {
			 Mainframe_GlobalFunctionLib.pressKey("F15");
			 Mainframe_GlobalFunctionLib.pressKey("F8");
			 Mainframe_GlobalFunctionLib.sendText("10","02","2");
			 Mainframe_GlobalFunctionLib.pressKey("Enter");
			 Mainframe_GlobalFunctionLib.sendText("04","26","TESTING");
			 Mainframe_GlobalFunctionLib.pressKey("Enter");
			 Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
		   }
		else if(env.equals("8401"))
		{
			   Mainframe_GlobalFunctionLib.sendText("21","07","6");
			   Mainframe_GlobalFunctionLib.pressKey("Enter");
			   Mainframe_GlobalFunctionLib.sendText("06","41",env);
			   Mainframe_GlobalFunctionLib.pressKey("Enter");
			   Mainframe_GlobalFunctionLib.sendText("21","07","20");
			   Mainframe_GlobalFunctionLib.pressKey("Enter");
			   Mainframe_GlobalFunctionLib.sendText("21","07","5");
			   Mainframe_GlobalFunctionLib.pressKey("Enter");
			   Mainframe_GlobalFunctionLib.sendText("21","07","1");
			   Mainframe_GlobalFunctionLib.pressKey("Enter");
			   Mainframe_GlobalFunctionLib.sendText("21","07","2");
			   Mainframe_GlobalFunctionLib.pressKey("Enter");
			   Mainframe_GlobalFunctionLib.pressKey("F15");
			   Mainframe_GlobalFunctionLib.pressKey("F8");
			   Mainframe_GlobalFunctionLib.sendText("10","02","2");
			   Mainframe_GlobalFunctionLib.pressKey("Enter");
			   Mainframe_GlobalFunctionLib.sendText("04","26","TESTING");
			   Mainframe_GlobalFunctionLib.pressKey("Enter");
			   Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
			   Mainframe_GlobalFunctionLib.closeTE();
		} 
	}
	
	@Then("^Verifying the copy functionality on price table screen with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void verifying_the_copy_functionality_on_price_table_screen_with(String env, String pricetable, String newtable) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		if((env.equals("8402") || env.equals("8403")))
		   {
			 Mainframe_GlobalFunctionLib.sendText("04","25",pricetable);
			 Mainframe_GlobalFunctionLib.pressKey("Enter");
			 Mainframe_GlobalFunctionLib.sendText("10","02","3");
			 Mainframe_GlobalFunctionLib.pressKey("Enter");
			 TimeUnit.SECONDS.sleep(3);
			 Mainframe_GlobalFunctionLib.sendText("09","22",newtable);
			 Mainframe_GlobalFunctionLib.sendText("10","22",newtable);
			 Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
			 Mainframe_GlobalFunctionLib.pressKey("Enter");
			 Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
		   }
		
		else if(env.equals("8401"))
		{
			   Mainframe_GlobalFunctionLib.sendText("21","07","6");
			   Mainframe_GlobalFunctionLib.pressKey("Enter");
			   Mainframe_GlobalFunctionLib.sendText("06","41",env);
			   Mainframe_GlobalFunctionLib.pressKey("Enter");
			   Mainframe_GlobalFunctionLib.sendText("21","07","20");
			   Mainframe_GlobalFunctionLib.pressKey("Enter");
			   Mainframe_GlobalFunctionLib.sendText("21","07","5");
			   Mainframe_GlobalFunctionLib.pressKey("Enter");
			   Mainframe_GlobalFunctionLib.sendText("21","07","1");
			   Mainframe_GlobalFunctionLib.pressKey("Enter");
			   Mainframe_GlobalFunctionLib.sendText("21","07","2");
			   Mainframe_GlobalFunctionLib.pressKey("Enter");
			   Mainframe_GlobalFunctionLib.sendText("04","25",pricetable);
			   Mainframe_GlobalFunctionLib.pressKey("Enter");
			   Mainframe_GlobalFunctionLib.sendText("10","02","3");
			   Mainframe_GlobalFunctionLib.pressKey("Enter");
			   TimeUnit.SECONDS.sleep(3);
			   Mainframe_GlobalFunctionLib.sendText("09","22",newtable);
			   Mainframe_GlobalFunctionLib.sendText("10","22",newtable);
			   Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
			   Mainframe_GlobalFunctionLib.pressKey("Enter");
			   Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
			   Mainframe_GlobalFunctionLib.closeTE();
		}
	}
	
	@Then("^Verifying the copy functionality using key on price table screen with \"([^\"]*)\",\"([^\"]*)\"$")
	public void verifying_the_copy_functionality_using_key_on_price_table_screen_with(String env, String newtable) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		if((env.equals("8402") || env.equals("8403")))
		   {
			 Mainframe_GlobalFunctionLib.pressKey("F15");
			 Mainframe_GlobalFunctionLib.pressKey("F8");
			 Mainframe_GlobalFunctionLib.sendText("10","02","3");
			 Mainframe_GlobalFunctionLib.pressKey("Enter");
			 TimeUnit.SECONDS.sleep(3);
			 Mainframe_GlobalFunctionLib.sendText("09","22",newtable);
			 Mainframe_GlobalFunctionLib.sendText("10","22",newtable);
			 Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
			 Mainframe_GlobalFunctionLib.pressKey("Enter");
			 Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
		   }
		
		else if(env.equals("8401"))
		{
			   Mainframe_GlobalFunctionLib.sendText("21","07","6");
			   Mainframe_GlobalFunctionLib.pressKey("Enter");
			   Mainframe_GlobalFunctionLib.sendText("06","41",env);
			   Mainframe_GlobalFunctionLib.pressKey("Enter");
			   Mainframe_GlobalFunctionLib.sendText("21","07","20");
			   Mainframe_GlobalFunctionLib.pressKey("Enter");
			   Mainframe_GlobalFunctionLib.sendText("21","07","5");
			   Mainframe_GlobalFunctionLib.pressKey("Enter");
			   Mainframe_GlobalFunctionLib.sendText("21","07","1");
			   Mainframe_GlobalFunctionLib.pressKey("Enter");
			   Mainframe_GlobalFunctionLib.sendText("21","07","2");
			   Mainframe_GlobalFunctionLib.pressKey("Enter");
			   Mainframe_GlobalFunctionLib.pressKey("F15");
			   Mainframe_GlobalFunctionLib.pressKey("F8");
			   Mainframe_GlobalFunctionLib.sendText("10","02","3");
			   Mainframe_GlobalFunctionLib.pressKey("Enter");
			   TimeUnit.SECONDS.sleep(3);
			   Mainframe_GlobalFunctionLib.sendText("09","22",newtable);
			   Mainframe_GlobalFunctionLib.sendText("10","22",newtable);
			   Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
			   Mainframe_GlobalFunctionLib.pressKey("Enter");
			   Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
			   //Mainframe_GlobalFunctionLib.closeTE();
		}
	}
	
	@Then("^Verifying the Inactivate functionality on price table screen with \"([^\"]*)\",\"([^\"]*)\"$")
	public void verifying_the_Inactivate_functionality_on_price_table_screen_with(String env, String pricetable) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		if((env.equals("8402") || env.equals("8403")))
		   {
			 Mainframe_GlobalFunctionLib.sendText("04","25",pricetable);
			 Mainframe_GlobalFunctionLib.pressKey("Enter");
			 Mainframe_GlobalFunctionLib.sendText("10","02","4");
			 Mainframe_GlobalFunctionLib.pressKey("Enter");
			 Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
			 Mainframe_GlobalFunctionLib.sendText("16","64","N");
		   }
		
		else if(env.equals("8401"))
		{
			   Mainframe_GlobalFunctionLib.sendText("21","07","6");
			   Mainframe_GlobalFunctionLib.pressKey("Enter");
			   Mainframe_GlobalFunctionLib.sendText("06","41",env);
			   Mainframe_GlobalFunctionLib.pressKey("Enter");
			   Mainframe_GlobalFunctionLib.sendText("21","07","20");
			   Mainframe_GlobalFunctionLib.pressKey("Enter");
			   Mainframe_GlobalFunctionLib.sendText("21","07","5");
			   Mainframe_GlobalFunctionLib.pressKey("Enter");
			   Mainframe_GlobalFunctionLib.sendText("21","07","1");
			   Mainframe_GlobalFunctionLib.pressKey("Enter");
			   Mainframe_GlobalFunctionLib.sendText("21","07","2");
			   Mainframe_GlobalFunctionLib.pressKey("Enter");
			   Mainframe_GlobalFunctionLib.sendText("04","25",pricetable);
			   Mainframe_GlobalFunctionLib.pressKey("Enter");
			   Mainframe_GlobalFunctionLib.sendText("10","02","4");
			   Mainframe_GlobalFunctionLib.pressKey("Enter");
			   Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
			   Mainframe_GlobalFunctionLib.sendText("16","64","N");
			   Mainframe_GlobalFunctionLib.closeTE();
			   
		}
	}
	
	@Then("^Verifying the inactivate functionality using key on price table screen with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void verifying_the_inactivate_functionality_using_key_on_price_table_screen_with(String env, String PriceTable,String Table) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		if((env.equals("8402") || env.equals("8403")))
		   {
			Mainframe_GlobalFunctionLib.pressKey("F15");
			Mainframe_GlobalFunctionLib.pressKey("F8");
			Mainframe_GlobalFunctionLib.sendText("04","052",Table); 
			Mainframe_GlobalFunctionLib.pressKey("Enter"); 
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
			for(int i=10;i>0;i++)
				 {
				 String status = Mainframe_GlobalFunctionLib.getText(i, 68);
				 if(status.equals("A"))
				 {
					 String val = String.valueOf(i);
					 Mainframe_GlobalFunctionLib.sendText(val,"002","4");
					 Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
					 Mainframe_GlobalFunctionLib.pressKey("Enter");
					 Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
					 Mainframe_GlobalFunctionLib.sendText("16","64","N");
					 Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
					 break;
				 }
				 }
			
			}
		
		else if(env.equals("8401"))
		{
			   Mainframe_GlobalFunctionLib.sendText("21","07","6");
			   Mainframe_GlobalFunctionLib.pressKey("Enter");
			   Mainframe_GlobalFunctionLib.sendText("06","41",env);
			   Mainframe_GlobalFunctionLib.pressKey("Enter");
			   Mainframe_GlobalFunctionLib.sendText("21","07","20");
			   Mainframe_GlobalFunctionLib.pressKey("Enter");
			   Mainframe_GlobalFunctionLib.sendText("21","07","5");
			   Mainframe_GlobalFunctionLib.pressKey("Enter");
			   Mainframe_GlobalFunctionLib.sendText("21","07","1");
			   Mainframe_GlobalFunctionLib.pressKey("Enter");
			   Mainframe_GlobalFunctionLib.sendText("21","07","2");
			   Mainframe_GlobalFunctionLib.pressKey("Enter");
			   Mainframe_GlobalFunctionLib.pressKey("F15");
				Mainframe_GlobalFunctionLib.pressKey("F8");
				Mainframe_GlobalFunctionLib.sendText("04","052",PriceTable); 
				Mainframe_GlobalFunctionLib.pressKey("Enter"); 
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
				for(int i=10;i>0;i++)
					 {
					 String status = Mainframe_GlobalFunctionLib.getText(i, 68);
					 if(status.equals("A"))
					 {
						 String val = String.valueOf(i);
						 Mainframe_GlobalFunctionLib.sendText(val,"002","4");
						 Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
						 Mainframe_GlobalFunctionLib.pressKey("Enter");
						 Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
						 Mainframe_GlobalFunctionLib.sendText("16","64","N"); 
						 Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
						 break;
					 }
					 } 
				 Mainframe_GlobalFunctionLib.closeTE();
		}
	}
	
	@Then("^Verifying the Display functionality on price table screen with \"([^\"]*)\",\"([^\"]*)\"$")
	public void verifying_the_Display_functionality_on_price_table_screen_with(String env, String pricetable) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		if((env.equals("8402") || env.equals("8403")))
		   {
			 Mainframe_GlobalFunctionLib.sendText("04","25",pricetable);
			 Mainframe_GlobalFunctionLib.pressKey("Enter");
			 Mainframe_GlobalFunctionLib.sendText("10","02","5");
			 Mainframe_GlobalFunctionLib.pressKey("Enter");
			 Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
			}
		else if(env.equals("8401"))
		{
			   Mainframe_GlobalFunctionLib.sendText("21","07","6");
			   Mainframe_GlobalFunctionLib.pressKey("Enter");
			   Mainframe_GlobalFunctionLib.sendText("06","41",env);
			   Mainframe_GlobalFunctionLib.pressKey("Enter");
			   Mainframe_GlobalFunctionLib.sendText("21","07","20");
			   Mainframe_GlobalFunctionLib.pressKey("Enter");
			   Mainframe_GlobalFunctionLib.sendText("21","07","5");
			   Mainframe_GlobalFunctionLib.pressKey("Enter");
			   Mainframe_GlobalFunctionLib.sendText("21","07","1");
			   Mainframe_GlobalFunctionLib.pressKey("Enter");
			   Mainframe_GlobalFunctionLib.sendText("21","07","2");
			   Mainframe_GlobalFunctionLib.pressKey("Enter");
			   Mainframe_GlobalFunctionLib.sendText("04","25",pricetable);
			   Mainframe_GlobalFunctionLib.pressKey("Enter");
			   Mainframe_GlobalFunctionLib.sendText("10","02","5");
			   Mainframe_GlobalFunctionLib.pressKey("Enter");
			   Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
			   Mainframe_GlobalFunctionLib.closeTE();
		}
		
	}
	
	@Then("^Verifying the display functionality using key on price table screen with \"([^\"]*)\"$")
	public void verifying_the_display_functionality_using_key_on_price_table_screen_with(String env) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
		if((env.equals("8402") || env.equals("8403")))
		   {
			Mainframe_GlobalFunctionLib.pressKey("F15");
			 Mainframe_GlobalFunctionLib.pressKey("F8");
			 Mainframe_GlobalFunctionLib.sendText("10","02","5");
			 Mainframe_GlobalFunctionLib.pressKey("Enter");
			 Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
			}
		else if(env.equals("8401"))
		{
			   Mainframe_GlobalFunctionLib.sendText("21","07","6");
			   Mainframe_GlobalFunctionLib.pressKey("Enter");
			   Mainframe_GlobalFunctionLib.sendText("06","41",env);
			   Mainframe_GlobalFunctionLib.pressKey("Enter");
			   Mainframe_GlobalFunctionLib.sendText("21","07","20");
			   Mainframe_GlobalFunctionLib.pressKey("Enter");
			   Mainframe_GlobalFunctionLib.sendText("21","07","5");
			   Mainframe_GlobalFunctionLib.pressKey("Enter");
			   Mainframe_GlobalFunctionLib.sendText("21","07","1");
			   Mainframe_GlobalFunctionLib.pressKey("Enter");
			   Mainframe_GlobalFunctionLib.sendText("21","07","2");
			   Mainframe_GlobalFunctionLib.pressKey("Enter");
			   Mainframe_GlobalFunctionLib.pressKey("F15");
			   Mainframe_GlobalFunctionLib.pressKey("F8");
			   Mainframe_GlobalFunctionLib.sendText("10","02","5");
			   Mainframe_GlobalFunctionLib.pressKey("Enter");
			   Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
			   Mainframe_GlobalFunctionLib.closeTE();
		}
	}
	
	@Then("^Navigating to price schedule criteria screen with \"([^\"]*)\"$")
	public void navigating_to_price_schedule_criteria_screen_with(String env) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		if((env.equals("8402") || env.equals("8403")))
		   {
			
			 Mainframe_GlobalFunctionLib.sendText("10","002","15");
			 Mainframe_GlobalFunctionLib.pressKey("Enter");
			 Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
			}
		
		else if(env.equals("8401"))
		{
			   Mainframe_GlobalFunctionLib.sendText("21","07","6");
			   Mainframe_GlobalFunctionLib.pressKey("Enter");
			   Mainframe_GlobalFunctionLib.sendText("06","41",env);
			   Mainframe_GlobalFunctionLib.pressKey("Enter");
			   Mainframe_GlobalFunctionLib.sendText("21","07","20");
			   Mainframe_GlobalFunctionLib.pressKey("Enter");
			   Mainframe_GlobalFunctionLib.sendText("21","07","5");
			   Mainframe_GlobalFunctionLib.pressKey("Enter");
			   Mainframe_GlobalFunctionLib.sendText("21","07","1");
			   Mainframe_GlobalFunctionLib.pressKey("Enter");
			   Mainframe_GlobalFunctionLib.sendText("21","07","1");
			   Mainframe_GlobalFunctionLib.pressKey("Enter");
			   Mainframe_GlobalFunctionLib.sendText("10","002","15");
			   Mainframe_GlobalFunctionLib.pressKey("Enter");
			   Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
			   Mainframe_GlobalFunctionLib.closeTE();
		}
	}
	
	
	@Then("^editing the fields in Price Schedule criteria screen with \"([^\"]*)\",\"([^\"]*)\"$")
	public void editing_the_fields_in_Price_Schedule_criteria_screen_with(String env, String data) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		if((env.equals("8402") || env.equals("8403")))
		   {
			
			 Mainframe_GlobalFunctionLib.sendText("10","002","15");
			 Mainframe_GlobalFunctionLib.pressKey("Enter");
			 Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
			 Mainframe_GlobalFunctionLib.sendText("12","002","2");
			 Mainframe_GlobalFunctionLib.pressKey("Enter");
			 Mainframe_GlobalFunctionLib.sendText("16","021",data);
			 Mainframe_GlobalFunctionLib.pressKey("Enter");
			 Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			}
		
		else if(env.equals("8401"))
		{
			   Mainframe_GlobalFunctionLib.sendText("21","07","6");
			   Mainframe_GlobalFunctionLib.pressKey("Enter");
			   Mainframe_GlobalFunctionLib.sendText("06","41",env);
			   Mainframe_GlobalFunctionLib.pressKey("Enter");
			   Mainframe_GlobalFunctionLib.sendText("21","07","20");
			   Mainframe_GlobalFunctionLib.pressKey("Enter");
			   Mainframe_GlobalFunctionLib.sendText("21","07","5");
			   Mainframe_GlobalFunctionLib.pressKey("Enter");
			   Mainframe_GlobalFunctionLib.sendText("21","07","1");
			   Mainframe_GlobalFunctionLib.pressKey("Enter");
			   Mainframe_GlobalFunctionLib.sendText("21","07","1");
			   Mainframe_GlobalFunctionLib.pressKey("Enter");
			   Mainframe_GlobalFunctionLib.sendText("10","002","15");
			   Mainframe_GlobalFunctionLib.pressKey("Enter");
			   Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
			   Mainframe_GlobalFunctionLib.sendText("12","002","2");
				 Mainframe_GlobalFunctionLib.pressKey("Enter");
				 Mainframe_GlobalFunctionLib.sendText("16","021",data);
				 Mainframe_GlobalFunctionLib.pressKey("Enter");
				 Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				 Mainframe_GlobalFunctionLib.closeTE();
	}
	}
	
	@Then("^Verify the inactivate functionality in price schedule criteria screen using \"([^\"]*)\"$")
	public void verify_the_inactivate_functionality_in_price_schedule_criteria_screen_using(String env) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		if((env.equals("8402") || env.equals("8403")))
		   {
			
			 Mainframe_GlobalFunctionLib.sendText("10","002","15");
			 Mainframe_GlobalFunctionLib.pressKey("Enter");
			 Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
			 Mainframe_GlobalFunctionLib.sendText("12","002","4");
			 Mainframe_GlobalFunctionLib.pressKey("Enter");
			 Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
			 Mainframe_GlobalFunctionLib.sendText("16","064","N");
			 Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			}
		
		else if(env.equals("8401"))
		{
			   Mainframe_GlobalFunctionLib.sendText("21","07","6");
			   Mainframe_GlobalFunctionLib.pressKey("Enter");
			   Mainframe_GlobalFunctionLib.sendText("06","41",env);
			   Mainframe_GlobalFunctionLib.pressKey("Enter");
			   Mainframe_GlobalFunctionLib.sendText("21","07","20");
			   Mainframe_GlobalFunctionLib.pressKey("Enter");
			   Mainframe_GlobalFunctionLib.sendText("21","07","5");
			   Mainframe_GlobalFunctionLib.pressKey("Enter");
			   Mainframe_GlobalFunctionLib.sendText("21","07","1");
			   Mainframe_GlobalFunctionLib.pressKey("Enter");
			   Mainframe_GlobalFunctionLib.sendText("21","07","1");
			   Mainframe_GlobalFunctionLib.pressKey("Enter");
			   Mainframe_GlobalFunctionLib.sendText("10","002","15");
			   Mainframe_GlobalFunctionLib.pressKey("Enter");
			   Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
			   Mainframe_GlobalFunctionLib.sendText("12","002","4");
			   Mainframe_GlobalFunctionLib.pressKey("Enter");
			   Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			   Mainframe_GlobalFunctionLib.sendText("16","064","N");
			   Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			   Mainframe_GlobalFunctionLib.closeTE();
	}
	}
	
	@Then("^Verify the display functionality in price schedule criteria screen using \"([^\"]*)\"$")
	public void verify_the_display_functionality_in_price_schedule_criteria_screen_using(String env) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		if((env.equals("8402") || env.equals("8403")))
		   {
			
			 Mainframe_GlobalFunctionLib.sendText("10","002","15");
			 Mainframe_GlobalFunctionLib.pressKey("Enter");
			 Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
			 Mainframe_GlobalFunctionLib.sendText("12","002","5");
			 Mainframe_GlobalFunctionLib.pressKey("Enter");
			 Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
			 
			}
		else if(env.equals("8401"))
		{
			   Mainframe_GlobalFunctionLib.sendText("21","07","6");
			   Mainframe_GlobalFunctionLib.pressKey("Enter");
			   Mainframe_GlobalFunctionLib.sendText("06","41",env);
			   Mainframe_GlobalFunctionLib.pressKey("Enter");
			   Mainframe_GlobalFunctionLib.sendText("21","07","20");
			   Mainframe_GlobalFunctionLib.pressKey("Enter");
			   Mainframe_GlobalFunctionLib.sendText("21","07","5");
			   Mainframe_GlobalFunctionLib.pressKey("Enter");
			   Mainframe_GlobalFunctionLib.sendText("21","07","1");
			   Mainframe_GlobalFunctionLib.pressKey("Enter");
			   Mainframe_GlobalFunctionLib.sendText("21","07","1");
			   Mainframe_GlobalFunctionLib.pressKey("Enter");
			   Mainframe_GlobalFunctionLib.sendText("10","002","15");
			   Mainframe_GlobalFunctionLib.pressKey("Enter");
			   Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
			   Mainframe_GlobalFunctionLib.sendText("12","002","5");
			   Mainframe_GlobalFunctionLib.pressKey("Enter");
			   Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			   Mainframe_GlobalFunctionLib.closeTE();
	}
	}
	
	
	@Then("^I navigate to price schedule criteria screen through price schedule detail with \"([^\"]*)\"$")
	public void i_navigate_to_price_schedule_criteria_screen_through_price_schedule_detail_with(String env) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		if((env.equals("8402") || env.equals("8403")))
		   {
			
			 Mainframe_GlobalFunctionLib.sendText("10","002","5");
			 Mainframe_GlobalFunctionLib.pressKey("Enter");
			 Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
			 Mainframe_GlobalFunctionLib.pressKey("F7");
			 Mainframe_GlobalFunctionLib.click(10, 27);
			 Mainframe_GlobalFunctionLib.pressKey("F4");
			 Mainframe_GlobalFunctionLib.pressKey("F15");
			 Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
			}
		else if(env.equals("8401"))
		{
			   Mainframe_GlobalFunctionLib.sendText("21","07","6");
			   Mainframe_GlobalFunctionLib.pressKey("Enter");
			   Mainframe_GlobalFunctionLib.sendText("06","41",env);
			   Mainframe_GlobalFunctionLib.pressKey("Enter");
			   Mainframe_GlobalFunctionLib.sendText("21","07","20");
			   Mainframe_GlobalFunctionLib.pressKey("Enter");
			   Mainframe_GlobalFunctionLib.sendText("21","07","5");
			   Mainframe_GlobalFunctionLib.pressKey("Enter");
			   Mainframe_GlobalFunctionLib.sendText("21","07","1");
			   Mainframe_GlobalFunctionLib.pressKey("Enter");
			   Mainframe_GlobalFunctionLib.sendText("21","07","1");
			   Mainframe_GlobalFunctionLib.pressKey("Enter");
			   Mainframe_GlobalFunctionLib.sendText("10","002","5");
			   Mainframe_GlobalFunctionLib.pressKey("Enter");
			   Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			   Mainframe_GlobalFunctionLib.pressKey("F7");
				 Mainframe_GlobalFunctionLib.click(10, 27);
				 Mainframe_GlobalFunctionLib.pressKey("F4");
			   Mainframe_GlobalFunctionLib.pressKey("F15");
			   Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			Mainframe_GlobalFunctionLib.closeTE();
		}
	}
	
	@Then("^validating the display functionality on RCPSC(\\d+)I screen with \"([^\"]*)\"$")
	public void validating_the_display_functionality_on_RCPSC_I_screen_with(int screen, String env) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		if((env.equals("8402") || env.equals("8403")))
		   {
			
			 Mainframe_GlobalFunctionLib.sendText("10","002","5");
			 Mainframe_GlobalFunctionLib.pressKey("Enter");
			 Mainframe_GlobalFunctionLib.pressKey("F7");
			 Mainframe_GlobalFunctionLib.click(10, 27);
			 Mainframe_GlobalFunctionLib.pressKey("F4");
			 Mainframe_GlobalFunctionLib.pressKey("F15");
			 Mainframe_GlobalFunctionLib.sendText("12","002","5");
			 Mainframe_GlobalFunctionLib.pressKey("Enter");
			 Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
			}
		else if(env.equals("8401"))
		{
			   Mainframe_GlobalFunctionLib.sendText("21","07","6");
			   Mainframe_GlobalFunctionLib.pressKey("Enter");
			   Mainframe_GlobalFunctionLib.sendText("06","41",env);
			   Mainframe_GlobalFunctionLib.pressKey("Enter");
			   Mainframe_GlobalFunctionLib.sendText("21","07","20");
			   Mainframe_GlobalFunctionLib.pressKey("Enter");
			   Mainframe_GlobalFunctionLib.sendText("21","07","5");
			   Mainframe_GlobalFunctionLib.pressKey("Enter");
			   Mainframe_GlobalFunctionLib.sendText("21","07","1");
			   Mainframe_GlobalFunctionLib.pressKey("Enter");
			   Mainframe_GlobalFunctionLib.sendText("21","07","1");
			   Mainframe_GlobalFunctionLib.pressKey("Enter");
			   Mainframe_GlobalFunctionLib.sendText("10","002","5");
			   Mainframe_GlobalFunctionLib.pressKey("Enter");
			  Mainframe_GlobalFunctionLib.pressKey("F7");
				 Mainframe_GlobalFunctionLib.click(10, 27);
				 Mainframe_GlobalFunctionLib.pressKey("F4");
			   Mainframe_GlobalFunctionLib.pressKey("F15");
			   Mainframe_GlobalFunctionLib.sendText("12","002","5");
				 Mainframe_GlobalFunctionLib.pressKey("Enter");
			   Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			Mainframe_GlobalFunctionLib.closeTE();
		}
	}
	
	
	
	@Then("^Validating RCPTF(\\d+)I screen options and functionality with \"([^\"]*)\",\"([^\"]*)\"$")
	public void validating_RCPTF_I_screen_options_and_functionality_with(int screen, String env, String memid) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		if((env.equals("8402") || env.equals("8403")))
		   {
			Mainframe_GlobalFunctionLib.click(13,16);
			 Mainframe_GlobalFunctionLib.pressKey("F4");
			 Mainframe_GlobalFunctionLib.pressKey("F15");
			 Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
			}
		else if(env.equals("8401"))
		   {
			Mainframe_GlobalFunctionLib.sendText("21","07","6");
			   Mainframe_GlobalFunctionLib.pressKey("Enter");
			   Mainframe_GlobalFunctionLib.sendText("06","41",env);
			   Mainframe_GlobalFunctionLib.pressKey("Enter");
			   Mainframe_GlobalFunctionLib.sendText("21","07","20");
			   Mainframe_GlobalFunctionLib.pressKey("Enter");
			   Mainframe_GlobalFunctionLib.sendText("21","07","1");
			   Mainframe_GlobalFunctionLib.pressKey("Enter");
			   Mainframe_GlobalFunctionLib.sendText("21","07","2");
			   Mainframe_GlobalFunctionLib.pressKey("Enter");
			   Mainframe_GlobalFunctionLib.sendText("04","004",memid);
			   Mainframe_GlobalFunctionLib.pressKey("Enter");
			   Mainframe_GlobalFunctionLib.pressKey("F8");
			   Mainframe_GlobalFunctionLib.sendText("10","02","2");
			   Mainframe_GlobalFunctionLib.pressKey("Enter");
			   Mainframe_GlobalFunctionLib.pressKey("F10");
			   Mainframe_GlobalFunctionLib.sendText("14","02","5");
			   Mainframe_GlobalFunctionLib.pressKey("Enter");
			   Mainframe_GlobalFunctionLib.pressKey("F15");
			   Mainframe_GlobalFunctionLib.pressKey("PageDown");
			   Mainframe_GlobalFunctionLib.click(13,16);
			   Mainframe_GlobalFunctionLib.pressKey("F4");
			   Mainframe_GlobalFunctionLib.pressKey("F15");
			   Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
			 //Mainframe_GlobalFunctionLib.closeTE();
			}
		
	}
	
	@Then("^Validating display functionality on RCPTF(\\d+)I screen options and functionality with \"([^\"]*)\",\"([^\"]*)\"$")
	public void validating_display_functionality_on_RCPTF_I_screen_options_and_functionality_with(int screen, String env, String memid) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		if((env.equals("8402") || env.equals("8403")))
		   {
			 Mainframe_GlobalFunctionLib.click(13,16);
			 Mainframe_GlobalFunctionLib.pressKey("F4");
			 Mainframe_GlobalFunctionLib.pressKey("F15");
			 Mainframe_GlobalFunctionLib.sendText("10","02","5");
			 Mainframe_GlobalFunctionLib.pressKey("Enter");
			 Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
			}
		else if(env.equals("8401"))
		   {
			   Mainframe_GlobalFunctionLib.sendText("21","07","6");
			   Mainframe_GlobalFunctionLib.pressKey("Enter");
			   Mainframe_GlobalFunctionLib.sendText("06","41",env);
			   Mainframe_GlobalFunctionLib.pressKey("Enter");
			   Mainframe_GlobalFunctionLib.sendText("21","07","20");
			   Mainframe_GlobalFunctionLib.pressKey("Enter");
			   Mainframe_GlobalFunctionLib.sendText("21","07","1");
			   Mainframe_GlobalFunctionLib.pressKey("Enter");
			   Mainframe_GlobalFunctionLib.sendText("21","07","2");
			   Mainframe_GlobalFunctionLib.pressKey("Enter");
			   Mainframe_GlobalFunctionLib.sendText("04","004",memid);
			   Mainframe_GlobalFunctionLib.pressKey("Enter");
			   Mainframe_GlobalFunctionLib.pressKey("F8");
			   Mainframe_GlobalFunctionLib.sendText("10","02","2");
			   Mainframe_GlobalFunctionLib.pressKey("Enter");
			   Mainframe_GlobalFunctionLib.pressKey("F10");
			   Mainframe_GlobalFunctionLib.sendText("14","02","5");
			   Mainframe_GlobalFunctionLib.pressKey("Enter");
			   Mainframe_GlobalFunctionLib.pressKey("F15");
			   Mainframe_GlobalFunctionLib.pressKey("PageDown");
			   Mainframe_GlobalFunctionLib.click(13,16);
			   Mainframe_GlobalFunctionLib.pressKey("F4");
			   Mainframe_GlobalFunctionLib.pressKey("F15");
			   Mainframe_GlobalFunctionLib.sendText("10","02","5");
			   Mainframe_GlobalFunctionLib.pressKey("Enter");
			   Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
			 Mainframe_GlobalFunctionLib.closeTE();
			}
		
	}
	
	@Then("^Validating display functionality on RCPTF(\\d+)I and RCPTF(\\d+)  screen options and functionality with \"([^\"]*)\",\"([^\"]*)\"$")
	public void validating_display_functionality_on_RCPTF_I_and_RCPTF_screen_options_and_functionality_with(int screen1, int screen2, String env, String memid) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		if((env.equals("8402") || env.equals("8403")))
		   {
			 Mainframe_GlobalFunctionLib.click(13,16);
			 Mainframe_GlobalFunctionLib.pressKey("F4");
			 Mainframe_GlobalFunctionLib.pressKey("F15");
			 Mainframe_GlobalFunctionLib.pressKey("F8");
			 Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
			 Mainframe_GlobalFunctionLib.sendText("10","02","5");
			 Mainframe_GlobalFunctionLib.pressKey("Enter");
			 Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
			}
		else if(env.equals("8401"))
		   {
			   Mainframe_GlobalFunctionLib.sendText("21","07","6");
			   Mainframe_GlobalFunctionLib.pressKey("Enter");
			   Mainframe_GlobalFunctionLib.sendText("06","41",env);
			   Mainframe_GlobalFunctionLib.pressKey("Enter");
			   Mainframe_GlobalFunctionLib.sendText("21","07","20");
			   Mainframe_GlobalFunctionLib.pressKey("Enter");
			   Mainframe_GlobalFunctionLib.sendText("21","07","1");
			   Mainframe_GlobalFunctionLib.pressKey("Enter");
			   Mainframe_GlobalFunctionLib.sendText("21","07","2");
			   Mainframe_GlobalFunctionLib.pressKey("Enter");
			   Mainframe_GlobalFunctionLib.sendText("04","004",memid);
			   Mainframe_GlobalFunctionLib.pressKey("Enter");
			   Mainframe_GlobalFunctionLib.pressKey("F8");
			   Mainframe_GlobalFunctionLib.sendText("10","02","2");
			   Mainframe_GlobalFunctionLib.pressKey("Enter");
			   Mainframe_GlobalFunctionLib.pressKey("F10");
			   Mainframe_GlobalFunctionLib.sendText("14","02","5");
			   Mainframe_GlobalFunctionLib.pressKey("Enter");
			   Mainframe_GlobalFunctionLib.pressKey("F15");
			   Mainframe_GlobalFunctionLib.pressKey("PageDown");
			   Mainframe_GlobalFunctionLib.click(13,16);
			   Mainframe_GlobalFunctionLib.pressKey("F4");
			   Mainframe_GlobalFunctionLib.pressKey("F15");
			   Mainframe_GlobalFunctionLib.pressKey("F8");
			   Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
			   Mainframe_GlobalFunctionLib.sendText("10","02","5");
			   Mainframe_GlobalFunctionLib.pressKey("Enter");
			   Reporter.addScreenCaptureFromPath(Screenshot.screenshot()); 
			   Mainframe_GlobalFunctionLib.closeTE();
			}
	}
	
	@Then("^Validating the RCPSC(\\d+) screen with \"([^\"]*)\"$")
	public void validating_the_RCPSC_screen_with(int screen, String env) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		if((env.equals("8402") || env.equals("8403")))
		   {
		
		Mainframe_GlobalFunctionLib.sendText("10","02","5");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F15");
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		   }
		else if(env.equals("8401"))
		   {
			   Mainframe_GlobalFunctionLib.sendText("21","07","6");
			   Mainframe_GlobalFunctionLib.pressKey("Enter");
			   Mainframe_GlobalFunctionLib.sendText("06","41",env);
			   Mainframe_GlobalFunctionLib.pressKey("Enter");
			   Mainframe_GlobalFunctionLib.sendText("21","07","20");
			   Mainframe_GlobalFunctionLib.pressKey("Enter");
			   Mainframe_GlobalFunctionLib.sendText("21","07","5");
			   Mainframe_GlobalFunctionLib.pressKey("Enter");
			   Mainframe_GlobalFunctionLib.sendText("21","07","1");
			   Mainframe_GlobalFunctionLib.pressKey("Enter");
			   Mainframe_GlobalFunctionLib.sendText("21","07","1");
			   Mainframe_GlobalFunctionLib.pressKey("Enter");
			   Mainframe_GlobalFunctionLib.sendText("10","02","5");
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.pressKey("F15");
				Mainframe_GlobalFunctionLib.pressKey("F6");
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				Mainframe_GlobalFunctionLib.closeTE();
			   
	}
	}
	
	@Then("^Validating the RCPID(\\d+) and RCPID(\\d+) screen with \"([^\"]*)\"$")
	public void validating_the_RCPID_and_RCPID_screen_with(int arg1, int arg2, String env) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		if((env.equals("8402") || env.equals("8403")))
		   {
		Mainframe_GlobalFunctionLib.sendText("10","02","7");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F15");
		Mainframe_GlobalFunctionLib.sendText("09","02","1");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("F8");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		   }
		else if(env.equals("8401"))
		   {
			Mainframe_GlobalFunctionLib.sendText("21","07","6");
			   Mainframe_GlobalFunctionLib.pressKey("Enter");
			   Mainframe_GlobalFunctionLib.sendText("06","41",env);
			   Mainframe_GlobalFunctionLib.pressKey("Enter");
			   Mainframe_GlobalFunctionLib.sendText("21","07","20");
			   Mainframe_GlobalFunctionLib.pressKey("Enter");
			   Mainframe_GlobalFunctionLib.sendText("21","07","2");
			   Mainframe_GlobalFunctionLib.pressKey("Enter");
			   Mainframe_GlobalFunctionLib.sendText("21","07","2");
			   Mainframe_GlobalFunctionLib.pressKey("Enter");
			   Mainframe_GlobalFunctionLib.sendText("10","02","7");
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.pressKey("F15");
				Mainframe_GlobalFunctionLib.sendText("09","02","1");
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				Mainframe_GlobalFunctionLib.pressKey("F8");
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				Mainframe_GlobalFunctionLib.closeTE();
		   }
	}	
	
	@Then("^Validating the display functionality on RCPID(\\d+) and RCPID(\\d+) screen with \"([^\"]*)\"$")
	public void validating_the_display_functionality_on_RCPID_and_RCPID_screen_with(int arg1, int arg2, String env) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		if((env.equals("8402") || env.equals("8403")))
		   {
		Mainframe_GlobalFunctionLib.sendText("10","02","7");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F15");
		Mainframe_GlobalFunctionLib.sendText("09","02","1");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText("14","02","5");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F8");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		Mainframe_GlobalFunctionLib.sendText("14","02","5");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		   }
		
		else if(env.equals("8401"))
		   {
			Mainframe_GlobalFunctionLib.sendText("21","07","6");
			   Mainframe_GlobalFunctionLib.pressKey("Enter");
			   Mainframe_GlobalFunctionLib.sendText("06","41",env);
			   Mainframe_GlobalFunctionLib.pressKey("Enter");
			   Mainframe_GlobalFunctionLib.sendText("21","07","20");
			   Mainframe_GlobalFunctionLib.pressKey("Enter");
			   Mainframe_GlobalFunctionLib.sendText("21","07","2");
			   Mainframe_GlobalFunctionLib.pressKey("Enter");
			   Mainframe_GlobalFunctionLib.sendText("21","07","2");
			   Mainframe_GlobalFunctionLib.pressKey("Enter");
			   Mainframe_GlobalFunctionLib.sendText("10","02","7");
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.pressKey("F15");
				Mainframe_GlobalFunctionLib.sendText("09","02","1");
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.sendText("14","02","5");
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				Mainframe_GlobalFunctionLib.pressKey("F12");
				Mainframe_GlobalFunctionLib.pressKey("F8");
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				Mainframe_GlobalFunctionLib.sendText("14","02","5");
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				//Mainframe_GlobalFunctionLib.closeTE();
		   }
	}
}
