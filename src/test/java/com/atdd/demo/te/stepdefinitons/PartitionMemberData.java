package com.atdd.demo.te.stepdefinitons;

import org.testng.Assert;

import com.atdd.te.screenHelpers.FunctionalLibrary;
import com.cucumber.listener.Reporter;
import com.optumrx.autofusion.core.te.util.Screenshot;

import cucumber.api.java.en.Then; 
import cucumber.api.java.en.When;
import cucumber.api.java.en.Given;
import cucumber.api.PendingException;
import com.optumrx.autofusion.core.te.util.Mainframe_GlobalFunctionLib;

public class PartitionMemberData {
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
	

	@Then("^Validate ExistingPartitionMemberData$")
	public void validate_ExistingPartitionMemberData() throws Throwable {
		String EPartitionCount = FunctionalLibrary.getText(7,28);
		String[] SplitPC=EPartitionCount.split(":");
		if(SplitPC[1].trim().contains("7"))
		{
		System.out.println("Total number of members before Partition: "+ " " + EPartitionCount);
		}
		else
		{
		System.out.println("Total number of members not shown in Spool file");
		Assert.fail();
		}
		FunctionalLibrary.pressKey("F12");
		}
		
  
	
	
	
	@Then("^Validate AfterPartitionMemberDataforPPCPBT$")
	public void validate_AfterPartitionMemberDataforPPCPBT() throws Throwable {
		String AfterPartitionCount = FunctionalLibrary.getText(7,28);
		String[] SplitPC1=AfterPartitionCount.split(":");
		if(SplitPC1[1].trim().contains("19"))
		{
		System.out.println("Total number of members after Partition: "+ " " + AfterPartitionCount);
		}
		else
		{
		System.out.println("Total number of members not shown in Spool file");
		//Assert.fail()
		}
		}
	@Then("^Validate AfterPartitionMemberDataforPPCPY(\\d+)$")
	public void validate_AfterPartitionMemberDataforPPCPY(int arg1) throws Throwable {
		String AfterPartitionCount = FunctionalLibrary.getText(7,28);
		String[] SplitPC1=AfterPartitionCount.split(":");
		if(SplitPC1[1].trim().contains("19"))
		{
		System.out.println("Total number of members after Partition: "+ " " + AfterPartitionCount);
		}
		else
		{
		System.out.println("Total number of members not shown in Spool file");
		//Assert.fail()
		}
		}
	

	@Then("^Validate AfterPartitionMbrDataforPPCPY(\\d+)$")
	public void validate_AfterPartitionMbrDataforPPCPY(int arg1) throws Throwable {
		String AfterPartitionCount = FunctionalLibrary.getText(7,28);
		String[] SplitPC1=AfterPartitionCount.split(":");
		if(SplitPC1[1].trim().contains("11"))
		{
		System.out.println("Total number of members after Partition: "+ " " + AfterPartitionCount);
		}
		else
		{
		System.out.println("Total number of members not shown in Spool file");
		//Assert.fail()
		}
		}
	
	@Then("^Validate AfterPartitionMemberDataforPPCVCD$")
	public void validate_AfterPartitionMemberDataforPPCVCD() throws Throwable {
		String AfterPartitionCount = FunctionalLibrary.getText(7,28);
		String[] SplitPC1=AfterPartitionCount.split(":");
		if(SplitPC1[1].trim().contains("21"))
		{
		System.out.println("Total number of members after Partition: "+ " " + AfterPartitionCount);
		}
		else
		{
		System.out.println("Total number of members not shown in Spool file");
		//Assert.fail()
		}
		}
	
	@When("^I add \"([^\"]*)\" library in lib list$")
	public void i_add_library_in_lib_list(String lib) throws Throwable {
		if(!(FunctionalLibrary.getText(8, 12).trim().equals(lib))){
		      FunctionalLibrary.enterText(7, 12, lib);
		      FunctionalLibrary.enterText(7, 4, "    ");
		      FunctionalLibrary.enterText(7, 4, "11");
		   FunctionalLibrary.pressEnter();
		   FunctionalLibrary.pressKey("F3");
		   }
	}
    //Code for Creating Library
	@When("^I Create Library \"([^\"]*)\", \"([^\"]*)\",\"([^\"]*)\"$")
	public void i_Create_Library(String Library, String LibType, String LibDesc) throws Throwable {
	FunctionalLibrary.enterText(21,7,"CRTLIB");
	FunctionalLibrary.pressEnter();
	FunctionalLibrary.enterText(5,37,Library);
	FunctionalLibrary.enterText(6,37,LibType);
	FunctionalLibrary.enterText(7,37,LibDesc);
	FunctionalLibrary.pressEnter();
	} 
	//Code for Copying Files and Programs
	@When("^I Copy files CRTDUPOBJ\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_Copy_files_CRTDUPOBJ(String FromObject, String FromLibrary, String ObjectType, String ToLibrary) throws Throwable {
	FunctionalLibrary.enterText(21,7,"CRTDUPOBJ");
	FunctionalLibrary.pressEnter();
	FunctionalLibrary.enterText(5,37,FromObject);
	FunctionalLibrary.enterText(6,37,FromLibrary);
	FunctionalLibrary.enterText(7,37,ObjectType);
	FunctionalLibrary.enterText(9,37,ToLibrary);
	FunctionalLibrary.pressEnter();
	FunctionalLibrary.pressEnter();
	}
	//Code for Validating Date range for PBT File
	@Given("^I enter the command and validate for PBT\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_enter_the_command_and_validate_for_PBT(String NewLibrary, int PBTVariable) throws Throwable {
		int i;
	    for (i=7;i <= PBTVariable; i++)
	    {
	        if (i<=9)
	        {
	        	FunctionalLibrary.enterText(21,7,"ywrkf FILE("+NewLibrary+"/PBPBTP) MBR(PART00000" + i +")");
	        }
	        else
	        {
	        	
	       FunctionalLibrary.enterText(21,7,"ywrkf FILE("+NewLibrary+"/PBPBTP) MBR(PART0000" + i +")");
	        }
	    	FunctionalLibrary.pressEnter();
	    	PartitionMemberDataRange.forValidatingPBTDaterange();
	    	    	  	
	    }
	}
	
	
	//Code for Validating Date range for PY2 File
	@Given("^I enter the command and validate for PYTwoFile\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_enter_the_command_and_validate_for_PYTwoFile(String NewLibrary, int PY2Variable) throws Throwable {
		int i;
	    for (i=7;i <= PY2Variable; i++)
	    {
	    	if (i<=9)
	    	{	
	    	FunctionalLibrary.enterText(21,7,"ywrkf FILE("+NewLibrary+"/PBPY2P) MBR(PART00000" + i +")");
	    	}
	    	else
	    	{
	    	FunctionalLibrary.enterText(21,7,"ywrkf FILE("+NewLibrary+"/PBPY2P) MBR(PART0000" + i +")");	
	    	}
	    	FunctionalLibrary.pressEnter();
	    	PartitionMemberDataRange.forValidatingPY2Daterange();
	    	  	
	    }
	}
	
	//Code for Validating Date range for PY4 File
	@Given("^I enter the command and validate for PYFour \"([^\"]*)\",\"([^\"]*)\"$")
	public void i_enter_the_command_and_validate_for_PYFour(String NewLibrary, int PY4Variable) throws Throwable {
		int i;
	    for (i=7;i <= PY4Variable; i++)
	    {
	    	if (i<=9)
	    	{	
	    	FunctionalLibrary.enterText(21,7,"ywrkf FILE("+NewLibrary+"/PBPY4P) MBR(PART00000" + i +")");
	    	}
	    	else
	    	{
	    	FunctionalLibrary.enterText(21,7,"ywrkf FILE("+NewLibrary+"/PBPY4P) MBR(PART0000" + i +")");		
	    	}
	    	FunctionalLibrary.pressEnter();
	    	PartitionMemberDataRange.forValidatingPY4Daterange();
	    	  	
	    }
	}

//Code for Validating Date range for VCD File
@Given("^I enter the command and validate for VCD\"([^\"]*)\",\"([^\"]*)\"$")
public void i_enter_the_command_and_validate_for_VCD(String NewLibrary, int VCDVariable) throws Throwable {
	int i;
    for (i=7;i <= VCDVariable; i++)
    {
    	if (i<=9)
    	{	
    	FunctionalLibrary.enterText(21,7,"ywrkf FILE("+NewLibrary+"/PBVCDP) MBR(PART00000" + i +")");
    	}
    	else
    	{
    	FunctionalLibrary.enterText(21,7,"ywrkf FILE("+NewLibrary+"/PBVCDP) MBR(PART0000" + i +")");	
    	}	
    	
    	FunctionalLibrary.pressEnter();
    	PartitionMemberDataRange.forValidatingVCDDaterange();
    	  	
    }
	}
}


