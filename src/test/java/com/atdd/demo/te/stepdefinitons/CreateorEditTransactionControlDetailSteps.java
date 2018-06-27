package com.atdd.demo.te.stepdefinitons;

import com.atdd.te.screenHelpers.FunctionalLibrary;
import com.optumrx.autofusion.core.te.util.Mainframe_GlobalFunctionLib;
import com.optumrx.autofusion.core.util.ReadPropertyFile;

import cucumber.api.java.en.Then;

public class CreateorEditTransactionControlDetailSteps {

	
	
	@Then("^Validate record added with details \"([^\"]*)\" , \"([^\"]*)\" ,\"([^\"]*)\" ,\"([^\"]*)\",\"([^\"]*)\"$")
	public void validate_record_added_with_details(String bin, String pcn, String carrier, String account, String group) throws Throwable {
		String[] coordinates;
		coordinates= ReadPropertyFile.getProperty("ActiveTransactionControlScreen" , "BIN");
		FunctionalLibrary.validateText(coordinates[0] ,coordinates[1] , bin );
		coordinates = ReadPropertyFile.getProperty("ActiveTransactionControlScreen" , "PCN");
		FunctionalLibrary.validateText(coordinates[0] ,coordinates[1] , pcn );
		coordinates = ReadPropertyFile.getProperty("ActiveTransactionControlScreen" , "CarrierID");
		FunctionalLibrary.validateText(coordinates[0] ,coordinates[1] , carrier );
		coordinates = ReadPropertyFile.getProperty("ActiveTransactionControlScreen" , "AccountID");
		FunctionalLibrary.validateText(coordinates[0] ,coordinates[1] , account );
		coordinates = ReadPropertyFile.getProperty("ActiveTransactionControlScreen" , "GroupID");
		FunctionalLibrary.validateText(coordinates[0] ,coordinates[1] , group );
		coordinates = ReadPropertyFile.getProperty("ActiveTransactionControlScreen" , "GroupNo");
		FunctionalLibrary.validateText(coordinates[0] ,coordinates[1] , group );
		
		
	}
	
}
