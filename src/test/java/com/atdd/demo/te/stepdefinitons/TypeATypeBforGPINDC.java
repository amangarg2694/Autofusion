package com.atdd.demo.te.stepdefinitons;

import com.atdd.te.screenHelpers.FunctionalLibrary;
import com.optumrx.autofusion.core.te.util.Mainframe_GlobalFunctionLib;
import com.optumrx.autofusion.core.te.util.Screenshot;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TypeATypeBforGPINDC {

	@When("^I enter \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"in Plan GPI List Load screen$")
	public void i_enter_in_Plan_GPI_List_Load_screen(String Library, String File, String Format) throws Throwable {
	FunctionalLibrary.enterText(7, 32, "     ");
	FunctionalLibrary.enterText(9, 32, Library);
	FunctionalLibrary.enterText(9, 58, File);
	Mainframe_GlobalFunctionLib.click(11, 32);
	FunctionalLibrary.pressKey("F4");
	FunctionalLibrary.enterText(7, 4,Format);
	FunctionalLibrary.pressEnter();
	FunctionalLibrary.enterText(13, 3,"X");
	FunctionalLibrary.pressEnter();
	FunctionalLibrary.pressEnter();
	//FunctionalLibrary.pressKey("F6");
	
	}

	//@Then("^I validate the notes \"([^\"]*)\" in GPIlist \"([^\"]*)\"$")
	@Then("^I validate the notes \"([^\"]*)\" in GPIlist \"([^\"]*)\",\"([^\"]*)\"$")
	public void i_validate_the_notes_in_GPIlist(String Note, String GpiList, String date) throws Throwable {
	  FunctionalLibrary.enterText(4, 6, GpiList);
	  FunctionalLibrary.pressEnter();
	  String actgpi=FunctionalLibrary.getText(11, 6).trim();
	  if(actgpi.equals(GpiList)){
		  FunctionalLibrary.enterText(11, 2, "0");
		  FunctionalLibrary.pressEnter();
		  
		  for (int i=8;i<21;i++){
			  if(FunctionalLibrary.getText(21,79).trim().equals("+")){
				  FunctionalLibrary.pressKey("PageDown");
			  }
			  if(FunctionalLibrary.getText(i, 54).trim().equals(date))	  
			  {	
			 String note1= FunctionalLibrary.getText(i, 2).trim();
			 if(note1.equals(Note)){
				 System.out.println("Note is generated");
			  break;
			 }
			 else
			 {
				 
			 }
			  }
		  }
	  }
	}
	
	@Then("^I validate the notes B \"([^\"]*)\" in GPIlist \"([^\"]*)\",\"([^\"]*)\"$")
	public void i_validate_the_notes_B_in_GPIlist(String note, String GpiList, String date) throws Throwable {
		FunctionalLibrary.enterText(4, 6, GpiList);
		  FunctionalLibrary.pressEnter();
		  String actgpi=FunctionalLibrary.getText(11, 6).trim();
		  
		  if(actgpi.equals(GpiList)){
			  FunctionalLibrary.enterText(11, 2,"7");
			  FunctionalLibrary.pressEnter();
			  FunctionalLibrary.enterText(12, 2, "0");
			  FunctionalLibrary.pressEnter();
			  
		  for (int i=10;i<21;i++){
				  if(FunctionalLibrary.getText(21,79).trim().equals("+")){
					  FunctionalLibrary.pressKey("PageDown");
				  }
				  if(FunctionalLibrary.getText(i, 54).trim().equals(date))	  
				  {	
				 String note1= FunctionalLibrary.getText(i, 2).trim();
				 if(note1.equals(note)){
					 System.out.println("Note is generated");
				  break;
				 }
				 else
				 {
					 
				 }
				  }
			  }
		  }
	}
	
	@Then("^I validate the spool file for \"([^\"]*)\" message$")
	public void i_validate_the_spool_file_for_message(String msg) throws Throwable {
	    FunctionalLibrary.enterText(21, 7, "WS");
	    FunctionalLibrary.pressEnter();
	    
	    FunctionalLibrary.enterText(13, 3, "8");
	    FunctionalLibrary.pressEnter();
	    FunctionalLibrary.enterText(11, 3, "5");
	    FunctionalLibrary.pressEnter();
	    FunctionalLibrary.enterText(4, 22, msg);
	    FunctionalLibrary.pressKey("F16");
	    FunctionalLibrary.validateText("7", "8", msg);
	}
	
	@Then("^I goback to PlanAdministrator Menu$")
	public void i_goback_to_PlanAdministrator_Menu() throws Throwable {
	 FunctionalLibrary.pressKey("F12");
	 FunctionalLibrary.enterText(22, 7, "CCT600");
	 FunctionalLibrary.pressEnter();
	}
	@When("^I enter \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"in Plan GPI List Load screen$")
	public void i_enter_in_Plan_GPI_List_Load_screen(String GpiListFrom, String GpiListThru, String ExportVer, String Library, String File) throws Throwable {
	 Mainframe_GlobalFunctionLib.click(6, 35);
     FunctionalLibrary.pressKey("F4");
     FunctionalLibrary.enterText(4,5,GpiListFrom);
     FunctionalLibrary.pressEnter();
     String s1=FunctionalLibrary.getText(9, 5).trim();
     if(s1.equals(GpiListFrom)){
    	 FunctionalLibrary.enterText(9, 2, "1");
    	 FunctionalLibrary.pressEnter();
     }
     Mainframe_GlobalFunctionLib.click(6, 49);
     FunctionalLibrary.pressKey("F4");
     FunctionalLibrary.enterText(4,5,GpiListThru);
     FunctionalLibrary.pressEnter();
     String s2=FunctionalLibrary.getText(9, 5).trim();
     if(s1.equals(GpiListFrom)){
    	 FunctionalLibrary.enterText(9, 2, "1");
    	 FunctionalLibrary.pressEnter();
     }
    	
     FunctionalLibrary.enterText(8, 41, ExportVer);
     FunctionalLibrary.enterText(12, 36, File);
     FunctionalLibrary.enterText(13, 36,Library);
     FunctionalLibrary.pressEnter();
	}

	@Then("^I validate the output file \"([^\"]*)\",\"([^\"]*)\" with notes$")
	public void i_validate_the_output_file_with_notes(String Library, String File) throws Throwable {
	    String qry="Runqry () "+Library+"/"+File;
		FunctionalLibrary.enterText(21, 7, qry);
		FunctionalLibrary.pressEnter();
		FunctionalLibrary.enterText(03, 32, "B");
		FunctionalLibrary.pressEnter();
		Screenshot.screenshot();
	}
	
	@When("^I enter \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"in Plan NDC List Export File screen$")
	public void i_enter_in_Plan_NDC_List_Export_File_screen(String NdcListFrom, String NdcListThru, String ExportVer, String Library, String File) throws Throwable {
	    FunctionalLibrary.enterText(6, 35,NdcListFrom);
	    FunctionalLibrary.enterText(6, 45,NdcListThru);
	    FunctionalLibrary.enterText(8, 41,ExportVer);
	    FunctionalLibrary.enterText(12,36,File);
	    FunctionalLibrary.enterText(13,36,Library);
	    FunctionalLibrary.pressEnter();
	   // FunctionalLibrary.pressKey("F6");	    	    
	    
	}
	
	@Then("^I validate the notes B \"([^\"]*)\" in NDClist \"([^\"]*)\",\"([^\"]*)\"$")
	public void i_validate_the_notes_B_in_NDClist(String Note, String NdcList, String Date) throws Throwable {
		FunctionalLibrary.enterText(4, 6, NdcList);
		  FunctionalLibrary.pressEnter();
		  String actgpi=FunctionalLibrary.getText(11, 6).trim();
		  
		  if(actgpi.equals(NdcList)){
			  FunctionalLibrary.enterText(11, 2,"7");
			  FunctionalLibrary.pressEnter();
			  FunctionalLibrary.enterText(11, 2, "0");
			  FunctionalLibrary.pressEnter();
			  
		  for (int i=8;i<21;i++){
				  if(FunctionalLibrary.getText(21,79).trim().equals("+")){
					  FunctionalLibrary.pressKey("PageDown");
				  }
				  if(FunctionalLibrary.getText(i, 54).trim().equals(Date))	  
				  {	
				 String note1= FunctionalLibrary.getText(i, 2).trim();
				 if(note1.equals(Note)){
					 System.out.println("Note is generated");
				  break;
				 }
				 else
				 {
					 
				 }
				  }
			  }
		  }
	}

	@When("^I enter \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" in Plan NDC List Load screen$")
	public void i_enter_in_Plan_NDC_List_Load_screen(String NdcList, String Status, String Format, String Library, String File) throws Throwable {
	    FunctionalLibrary.enterText(6, 38,File);
	    FunctionalLibrary.enterText(7, 38,Library);
	    FunctionalLibrary.enterText(10, 38,NdcList);
	    FunctionalLibrary.enterText(14,38,Status);
	    FunctionalLibrary.enterText(15,38,Format);
	    FunctionalLibrary.pressEnter();
	   // FunctionalLibrary.pressKey("F6");
	}

}
