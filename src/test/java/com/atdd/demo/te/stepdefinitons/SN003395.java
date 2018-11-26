package com.atdd.demo.te.stepdefinitons;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.tools.ant.types.CommandlineJava.SysProperties;

import com.atdd.te.screenHelpers.FunctionalLibrary;
import com.cucumber.listener.Reporter;
import com.google.common.collect.Streams.DoubleFunctionWithIndex;
import com.optumrx.autofusion.core.te.util.Mainframe_GlobalFunctionLib;
import com.optumrx.autofusion.core.te.util.Screenshot;

import cucumber.api.java.en.Then;

public class SN003395 {
	String A;
	//TC001
	@Then("^Verify if 'No data to display' message appears on Rejection Report Detail screen with \"([^\"]*)\"$")
	public void verify_if_No_data_to_display_message_appears_on_Rejection_Report_Detail_screen_with(String CarrierID) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		Mainframe_GlobalFunctionLib.sendText(4,4, CarrierID);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText("10","2", "5");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F17");
		A=Mainframe_GlobalFunctionLib.getText(24,2);
		if(A.equals("No data to display."))
		{
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
		}
		else
		{
			System.out.println("Records are available to display, so no data to display message do not appear");
		}
		
	}
	String B, C;
	//TC002
	@Then("^Verify if F seven Sort by Date of File is available at bottom of the Rejection Report Detail screen with \"([^\"]*)\"$")
	public void verify_if_F_seven_Sort_by_Date_of_File_is_available_at_bottom_of_the_Rejection_Report_Detail_screen_with(String CarrierID) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		Mainframe_GlobalFunctionLib.sendText(4,4, CarrierID);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText("10","2", "2");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F17");
		B=Mainframe_GlobalFunctionLib.getText(23,2);
		C=B.substring(10,33);
		
		if(C.contains("F7=Sort by Date of File"))
		{
			System.out.println("Value of C is "+C);
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());	
		}
		else{
			System.out.println("F7=Sort by Date of File is not available");
		}
	}
	String D;
	@Then("^Verify if page removes the \"([^\"]*)\" sign at the bottom right when there are no more pages to page down in Rejection Report Detail screen with \"([^\"]*)\"$")
	public void verify_if_page_removes_the_sign_at_the_bottom_right_when_there_are_no_more_pages_to_page_down_in_Rejection_Report_Detail_screen_with(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		Mainframe_GlobalFunctionLib.sendText(4,4, "PDPIND");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText("10","2", "2");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F17");
		D=Mainframe_GlobalFunctionLib.getText(21,79);
		
		while(D.equals("+"))
		{
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());	
			Mainframe_GlobalFunctionLib.pressKey("PageDown");
			D=Mainframe_GlobalFunctionLib.getText(21,79);
			
		}
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());		
	}
	String E;
	@Then("^Verify if page brings back the \"([^\"]*)\" sign at the bottom right sign when user clicks Page up button in Rejection Report Detail screen with \"([^\"]*)\"$")
	public void verify_if_page_brings_back_the_sign_at_the_bottom_right_sign_when_user_clicks_Page_up_button_in_Rejection_Report_Detail_screen_with(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		Mainframe_GlobalFunctionLib.sendText(4,4, "PDPIND");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText("10","2", "2");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F17");
		E=Mainframe_GlobalFunctionLib.getText(21,79);
		while(E.equals("+"))
		{
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());	
			Mainframe_GlobalFunctionLib.pressKey("PageDown");
			E=Mainframe_GlobalFunctionLib.getText(21,79);	
		}
		
		
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());	
		Mainframe_GlobalFunctionLib.pressKey("PageUp");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());	
	}
	String F,G,H,I,J,K;
	@Then("^Verify when 'clicks F(\\d+)=Sort by Date of File' detail records will be sorted in descending order first by Date of File then by CAGM in Rejection Report Detail screen with \"([^\"]*)\"$")
	public void verify_when_clicks_F_Sort_by_Date_of_File_detail_records_will_be_sorted_in_descending_order_first_by_Date_of_File_then_by_CAGM_in_Rejection_Report_Detail_screen_with(int arg1, String CarrierID) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		Mainframe_GlobalFunctionLib.sendText(4,4, CarrierID);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText("10","2", "2");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F17");
		F=Mainframe_GlobalFunctionLib.getText(23,2);
		G=F.substring(10,33);
		if(G.equals("F7=Sort by Date of File"))
		{
			Reporter.addScreenCaptureFromPath(Screenshot.screenshot());	
			Mainframe_GlobalFunctionLib.pressKey("F7");
			H=Mainframe_GlobalFunctionLib.getText(9,2);
			I=H.substring(0,13).trim();
			System.out.println(I);
			J=Mainframe_GlobalFunctionLib.getText(10,2);
			for(int l=10; l<=20; l++){
				K=Mainframe_GlobalFunctionLib.getText(l,2);
				if(J.equals(K)){
					if(l==20){
						String M=Mainframe_GlobalFunctionLib.getText(21, 79).trim();
						if(M.equals("+")){
							Mainframe_GlobalFunctionLib.pressKey("PageDown");
							l=8;
						}
					}
					l=l+1;
				}
				else{
					break;
				}
				
			}
			
			//K="11/21/2017";
			System.out.println("Value of J; "+J);
			System.out.println("Value of K; "+K);
			Date d1=sdf.parse(J);
			Date d2=sdf.parse(K);
			if(I.equals("Date of File"))
			{
				Reporter.addScreenCaptureFromPath(Screenshot.screenshot());	
		        if (d1.after(d2)) 
		        {
		            System.out.println("J is after K");
		        }

		        if (d1.before(d2)) 
		        {
		            System.out.println("J is before K");
		        }
				
			}
			
			else{
				System.out.println("Date of File is not available");
			}
		}
		else{
			System.out.println("F7=Sort by Date of File is not available");
		}
	}
	String N,O,P,Q,r,s;
	@Then("^Verify when 'clicks F(\\d+)=Track Rejections' records are displayed in ascending alphabetical order based on CAG and Member Rejection Report Detail screen with \"([^\"]*)\"$")
	public void verify_when_clicks_F_Track_Rejections_records_are_displayed_in_ascending_alphabetical_order_based_on_CAG_and_Member_Rejection_Report_Detail_screen_with(int arg1, String CarrierID) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		Mainframe_GlobalFunctionLib.sendText(4,4, CarrierID);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText("10","2", "2");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F17");
		Reporter.addScreenCaptureFromPath(Screenshot.screenshot());	
		N=Mainframe_GlobalFunctionLib.getText(10,21);
		O=N.substring(0,1);
		System.out.println("Value of O; "+O);
		for(int i=12; i<21;i++){
		P=Mainframe_GlobalFunctionLib.getText(i,21);
		Q=P.substring(0,1);
		System.out.println("Value of Q; "+Q);
		
		if(!(O.equals(Q))){
		if(O.compareTo(Q) >0)
		{
			
			System.out.println("O value is greater than Q, so its in assending order; "+Q);
		}
		else{
			System.out.println("O value is equal to Q, so its not in assending order; "+Q);
			
		}
		}
		
		else
		{
		i=i+1;	
		System.out.println("I value "+i);
		r=Mainframe_GlobalFunctionLib.getText(21,79).trim();
		if(r.equals("+"))
		{
		if(i==21){
			//r=Mainframe_GlobalFunctionLib.getText(21,79).trim();
			
			
				//Reporter.addScreenCaptureFromPath(Screenshot.screenshot());	
				System.out.println("in loop after r value");
				Mainframe_GlobalFunctionLib.pressKey("PageDown");
				//r=Mainframe_GlobalFunctionLib.getText(21,79);	
				i=11;
			}
			
		}
			else{
				FunctionalLibrary.pressKey("F12");
				FunctionalLibrary.pressKey("F17");
				System.out.println("Hi I am below f17");
				String acc=Mainframe_GlobalFunctionLib.getText(10,31);
				System.out.println("The value of acc"+acc);
				String ac=acc.substring(0,1);
				System.out.println("Value of O; "+ac);
				for(int j=12; j<21;j++){
					String acc2=Mainframe_GlobalFunctionLib.getText(j,31);
					String ac2=acc2.substring(0,1);
					System.out.println("Value of Q; "+ac2);
				
				if(!(ac.equals(ac2))){
					if(ac.compareTo(ac2) >0)
					{
						
						System.out.println("ac1 value is greater than ac2, so its in dessending order; "+ac2);
					}
					else{
						System.out.println("ac1 value is less than to ac2, so its  in assending order; "+ac2);
						Reporter.addScreenCaptureFromPath(Screenshot.screenshot());	
					}
					}
					
					else
					{
					j=j+1;	
					
					if(j==21){
						r=Mainframe_GlobalFunctionLib.getText(21,79);
						
						if(r.equals("+"))
						{
							Reporter.addScreenCaptureFromPath(Screenshot.screenshot());	
							Mainframe_GlobalFunctionLib.pressKey("PageDown");
							r=Mainframe_GlobalFunctionLib.getText(21,79);	
							j=11;
						}
						
			}
			
		}
			
		}
		}
		
		
	}
}
		}
		
	}




