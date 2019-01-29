package com.atdd.demo.te.stepdefinitons;

import org.apache.tools.ant.filters.TokenFilter.Trim;
import org.testng.Assert;

import com.atdd.te.screenHelpers.FunctionalLibrary;
import com.cucumber.listener.Reporter;
import com.optumrx.autofusion.core.te.util.Screenshot;

import cucumber.api.java.en.Then; 
import cucumber.api.java.en.When;
import cucumber.api.java.en.Given;
import cucumber.api.PendingException;
import com.optumrx.autofusion.core.te.util.Mainframe_GlobalFunctionLib;

public class PartitionMemberDataForVSRandVCHFiles {
	@Then("^Validate PartitionMemberData$")
	public void validate_PartitionMemberData() throws Throwable {
	
	String PartitionCount = FunctionalLibrary.getText(7,28);
	String[] SplitPC=PartitionCount.split(":");
	if(SplitPC[1].trim().contains("1"))
	{
	System.out.println("Total number of members before Partition: "+ " " + PartitionCount);
	}
	else
	{
	System.out.println("Total number of members not shown in Spool file");
	Assert.fail();
	}
	FunctionalLibrary.pressKey("F12");
	}
	
	@When("^I Create Library \"([^\"]*)\", \"([^\"]*)\",\"([^\"]*)\"$")
	public void i_Create_Library(String Library, String LibType, String LibDesc) throws Throwable {
		FunctionalLibrary.enterText(21,7,"CRTLIB");
		FunctionalLibrary.pressEnter();
		FunctionalLibrary.enterText(5,37,Library);
		FunctionalLibrary.enterText(6,37,LibType);
		FunctionalLibrary.enterText(7,37,LibDesc);
		FunctionalLibrary.pressEnter();
		String Texttovalidate= FunctionalLibrary.getText(24,02);
		String ExpTexttovalidate = "Library "+Library+" created.";
		Assert.assertEquals(Texttovalidate, ExpTexttovalidate, "Library not Created");
		
	}
	
	@When("^I Copy files CRTDUPOBJ\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_Copy_files_CRTDUPOBJ(String FromObject, String FromLibrary, String ObjectType, String ToLibrary) throws Throwable {
		FunctionalLibrary.enterText(21,7,"CRTDUPOBJ");
		FunctionalLibrary.pressEnter();
		FunctionalLibrary.enterText(5,37,FromObject);
		FunctionalLibrary.enterText(6,37,FromLibrary);
		FunctionalLibrary.enterText(7,37,ObjectType);
		FunctionalLibrary.enterText(9,37,ToLibrary);
	    if (ObjectType.equals("*FILE"))
	    {
	    	FunctionalLibrary.pressEnter();
			FunctionalLibrary.pressEnter();
	    }
	    else if (ObjectType.equals("*PGM"))
	    {
	    	FunctionalLibrary.pressEnter();
	    }
	    else
	    {
	    	FunctionalLibrary.pressEnter();
	    }
		
		// to verify whether file or program is added or not
		String Texttovalidate=FunctionalLibrary.getText(24,02);
		String ExpTexttovalidate = "Object "+FromObject+" in "+ToLibrary+" type "+ObjectType +" created.";
		Assert.assertEquals(Texttovalidate, ExpTexttovalidate, "File/Program not Copied");
	}
	
	@Then("^Enter the Find String\"([^\"]*)\", \"([^\"]*)\"$")
	public void enter_the_Find_String(String Control, String FIND) throws Throwable {
		FunctionalLibrary.enterText(3,22,Control);
		FunctionalLibrary.pressEnter();
		FunctionalLibrary.enterText(4,22,FIND);
		FunctionalLibrary.pressKey("F16");
	}
		
	@Then("^Validate AfterPartitionMemberData$")
	public void validate_AfterPartitionMemberData() throws Throwable {
	
	String AfterPartitionCount = FunctionalLibrary.getText(7,28);
	String[] SplitPC1=AfterPartitionCount.split(":");
	if(SplitPC1[1].trim().contains("6"))
	{
	System.out.println("Total number of members after Partition: "+ " " + AfterPartitionCount);
	}
	else
	{
	System.out.println("Total number of members not shown in Spool file");
	//Assert.fail()
	}
	FunctionalLibrary.pressKey("F12");
	}
		
	@Then("^Edit the library List\"([^\"]*)\"$")
	public void edit_the_library_List(String EdtLib) throws Throwable {
		FunctionalLibrary.enterText(21,7,"EDTLIBL");
		FunctionalLibrary.pressEnter();
		if(!(FunctionalLibrary.getText(8, 12).trim().equals(EdtLib))){
			   FunctionalLibrary.enterText(7, 12, EdtLib);
			   FunctionalLibrary.pressEnter();
			   FunctionalLibrary.pressKey("F3");
			   }
	}
	
	@Given("^I enter the command and validate for VCH\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_enter_the_command_and_validate_for_VCH(String NewLibrary, int loopVariable) throws Throwable {
		int i;
	    for (i=1;i <= loopVariable; i++)
	    {
	    	FunctionalLibrary.enterText(21,7,"ywrkf FILE("+NewLibrary+"/PBVCHP) MBR(PART00000" + i +")");
	    	FunctionalLibrary.pressEnter();
	    	FunctionalLibrary.enterText(8,2,"8");
			String PartMember = FunctionalLibrary.getText(4,17);
			FunctionalLibrary.pressEnter();
			FunctionalLibrary.pressKey("PageDown");
			FunctionalLibrary.pressKey("PageDown");
			String FN = "VCH"; 
			PartitionDateRangeforVCHandVSRFiles.validateDateRange(PartMember,FN);
	    	
	    }
	}
	
	@Given("^I enter the command and validate for VSR\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_enter_the_command_and_validate_for_VSR(String NewLibrary, int loopVariable) throws Throwable {
		int i;
	    for (i=1;i <= loopVariable; i++)
	    {
	    	FunctionalLibrary.enterText(21,7,"ywrkf FILE("+NewLibrary+"/PBVSRP) MBR(PART00000" + i +")");
	    	FunctionalLibrary.pressEnter();
	    	FunctionalLibrary.enterText(8,2,"8");
			String PartMember = FunctionalLibrary.getText(4,17);
			FunctionalLibrary.pressEnter();
			FunctionalLibrary.pressKey("PageDown");
			FunctionalLibrary.pressKey("PageDown");
			FunctionalLibrary.pressKey("PageDown");
			FunctionalLibrary.pressKey("PageDown");
			FunctionalLibrary.pressKey("PageDown");
			String FN = "VSR"; 
			PartitionDateRangeforVCHandVSRFiles.validateDateRange(PartMember,FN);
	    	
	    }
	}
	
	
}
