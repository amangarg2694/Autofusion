package com.atdd.demo.te.stepdefinitons;

import com.atdd.te.screenHelpers.FunctionalLibrary;
import com.atdd.te.screenHelpers.PlanByPlanCode;
import com.optumrx.autofusion.core.te.util.Mainframe_GlobalFunctionLib;

import cucumber.api.java.en.When;

public class DynamicPriorAuthorization {

	@When("^I create Dynamic Prior Authorization \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_create_Dynamic_Prior_Authorization(String carrierID, String submittedPACode, String submittedPA, String description, String nbrFills, String usageType, String applyMIC, String type, String fromBasis, String thruBasis, String reasonCode, String agent, String utilisation, String wildCard, String writePA, String ignoreDrugSts) throws Throwable {   
		Mainframe_GlobalFunctionLib.sendText(4, 4 ,carrierID );
		Mainframe_GlobalFunctionLib.sendText(4,14 ,submittedPACode );
		Mainframe_GlobalFunctionLib.sendText(4, 16 ,submittedPA );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		if((Mainframe_GlobalFunctionLib.getText(9, 4).equalsIgnoreCase(carrierID)) && (Mainframe_GlobalFunctionLib.getText(9, 14).equalsIgnoreCase(submittedPACode)) &&(Mainframe_GlobalFunctionLib.getText(9, 16).equalsIgnoreCase(submittedPA)))
		{	Mainframe_GlobalFunctionLib.sendText(9, 2 ,"2" );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
		}
		else{			
			Mainframe_GlobalFunctionLib.pressKey("F6");
			Mainframe_GlobalFunctionLib.sendText(4,25 ,carrierID );
			Mainframe_GlobalFunctionLib.sendText(5,25 ,submittedPACode);
			Mainframe_GlobalFunctionLib.sendText(5,27,submittedPA);
			Mainframe_GlobalFunctionLib.sendText(6,14,description );
			if(nbrFills.length()!=0)
			Mainframe_GlobalFunctionLib.sendText(7,36,nbrFills );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			FunctionalLibrary.enterText( type,  "Type",  "DynamicPriorAuthorizationDetailScreen");
		}
		FunctionalLibrary.enterText(usageType,"UsageType","DynamicPriorAuthorizationDetailScreen");
		FunctionalLibrary.enterText(applyMIC,"ApplyMIC","DynamicPriorAuthorizationDetailScreen");
		FunctionalLibrary.enterText(fromBasis,"FromBasis","DynamicPriorAuthorizationDetailScreen");
		FunctionalLibrary.enterText(thruBasis ,"ThruBasis", "DynamicPriorAuthorizationDetailScreen");
		FunctionalLibrary.enterText(reasonCode,"ReasonCode","DynamicPriorAuthorizationDetailScreen");
		FunctionalLibrary.enterText(agent,"Agent", "DynamicPriorAuthorizationDetailScreen");
		FunctionalLibrary.enterText(utilisation,"Utilisation" ,"DynamicPriorAuthorizationDetailScreen");
		FunctionalLibrary.enterText(wildCard, "WildCard" , "DynamicPriorAuthorizationDetailScreen");
		FunctionalLibrary.enterText(writePA, "WritePA" , "DynamicPriorAuthorizationDetailScreen");
		FunctionalLibrary.enterText(ignoreDrugSts,"IgnoreDrugSts" , "DynamicPriorAuthorizationDetailScreen");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
	    
	}
	
	@When("^I create Dynamic Prior Authorization List \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_create_Dynamic_Prior_Authorization_List(String carrier, String list, String listName) throws Throwable {
		Mainframe_GlobalFunctionLib.sendText(21, 7 ,"4" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(21, 7 ,"4" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(21, 7 ,"2" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(4, 5 ,carrier );
		Mainframe_GlobalFunctionLib.sendText(4, 16 ,list );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		System.out.println("List Name" + listName);
		if((Mainframe_GlobalFunctionLib.getText(10, 5).equalsIgnoreCase(carrier)) && (Mainframe_GlobalFunctionLib.getText(10, 16).equalsIgnoreCase(list)))
		{	Mainframe_GlobalFunctionLib.sendText(10, 2 ,"2" );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
		}
		else{			
			Mainframe_GlobalFunctionLib.pressKey("F6");
			Mainframe_GlobalFunctionLib.sendText(5, 19 ,carrier );
			Mainframe_GlobalFunctionLib.sendText(6, 19 ,list );
			Mainframe_GlobalFunctionLib.sendText(6, 36 ,listName );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
		}
	}

	@When("^I set \"([^\"]*)\" to \"([^\"]*)\"$")
	public void i_set_to(String fieldName, String fieldValue) throws Throwable {
		if(fieldValue.length()!=0){
			if(fieldName.equalsIgnoreCase("OverrideFlag"))
				FunctionalLibrary.enterText( "         ",  fieldName,  "DynamicPriorAuthorizationDetailScreen");
		FunctionalLibrary.enterText( fieldValue,  fieldName,  "DynamicPriorAuthorizationDetailScreen");
		//Mainframe_GlobalFunctionLib.pressKey("Enter");
		}}
	
	@When("^I create Dynamic Prior Authorization Profile \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_create_Dynamic_Prior_Authorization_Profile(String carrier, String account, String group, String fromDate, String thruDate, String submittedPA, String provider, String prescriber, String prescription,String member , String maxListFills) throws Throwable {
	  
		Mainframe_GlobalFunctionLib.sendText(21, 7 ,"4" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(21, 7 ,"4" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(21, 7 ,"3" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(4, 5 ,carrier );
		Mainframe_GlobalFunctionLib.sendText(4, 16 ,account );
		Mainframe_GlobalFunctionLib.sendText(4, 33 ,group );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		if((Mainframe_GlobalFunctionLib.getText(9, 5).equalsIgnoreCase(carrier)) && (Mainframe_GlobalFunctionLib.getText(9, 16).equalsIgnoreCase(account)) &&(Mainframe_GlobalFunctionLib.getText(9, 33).equalsIgnoreCase(group)))
		{	Mainframe_GlobalFunctionLib.sendText(9, 2 ,"2" );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
		}
		else{			
			Mainframe_GlobalFunctionLib.pressKey("F6");
			Mainframe_GlobalFunctionLib.sendText(5, 12 ,carrier );
			Mainframe_GlobalFunctionLib.sendText(6, 12 ,account );
			Mainframe_GlobalFunctionLib.sendText(7, 12 ,group );
			Mainframe_GlobalFunctionLib.sendText(12, 2 ,"        " );
			Mainframe_GlobalFunctionLib.sendText(12, 14 ,"        " );
				Mainframe_GlobalFunctionLib.sendText(12, 2 ,fromDate );
				Mainframe_GlobalFunctionLib.sendText(12, 14 ,thruDate );
				Mainframe_GlobalFunctionLib.sendText(15, 17 ,submittedPA );
				Mainframe_GlobalFunctionLib.sendText(16, 17 ,provider );
				Mainframe_GlobalFunctionLib.sendText(17, 17 ,prescriber );
				Mainframe_GlobalFunctionLib.sendText(18, 17 ,prescription );
				Mainframe_GlobalFunctionLib.sendText(19, 17 ,member );
				Mainframe_GlobalFunctionLib.sendText(20, 17 ,maxListFills );
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				FunctionalLibrary.enterText(16, 64, "Y");	
		}
		
	}
	
	@When("^I add List to Dynamic Prior Authorization \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_add_List_to_Dynamic_Prior_Authorization(String carrier, String submittedPAMCCode,String submittedPA,String list,String fromDate,String thruDate ) throws Throwable {
		Mainframe_GlobalFunctionLib.sendText(21, 7 ,"4" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(21, 7 ,"4" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(21, 7 ,"1" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(4, 4 ,carrier );
		Mainframe_GlobalFunctionLib.sendText(4, 14 ,submittedPAMCCode );
		Mainframe_GlobalFunctionLib.sendText(4, 16 ,submittedPA );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		if((Mainframe_GlobalFunctionLib.getText(9, 4).equalsIgnoreCase(carrier)) && (Mainframe_GlobalFunctionLib.getText(9, 14).equalsIgnoreCase(submittedPAMCCode)) &&(Mainframe_GlobalFunctionLib.getText(9, 16).equalsIgnoreCase(submittedPA)))
		{	Mainframe_GlobalFunctionLib.sendText(9, 2 ,"7" );
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(7, 4 ,carrier );
			Mainframe_GlobalFunctionLib.sendText(7, 14 ,list );
			try{
				if(!((Mainframe_GlobalFunctionLib.getText(13, 4).equalsIgnoreCase(carrier)) && (Mainframe_GlobalFunctionLib.getText(13, 14).equalsIgnoreCase(list))))			
			Mainframe_GlobalFunctionLib.pressKey("F6");
				}
				catch(Exception e){
					Mainframe_GlobalFunctionLib.pressKey("F6");
				}



			Mainframe_GlobalFunctionLib.sendText(10, 13 ,fromDate );
			Mainframe_GlobalFunctionLib.sendText(10, 38 ,thruDate );
			Mainframe_GlobalFunctionLib.pressKey("Enter");

			}
			}
	
	@When("^I add DPA List to Plan \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_add_DPA_List_to_Plan(String planCode, String carrier, String list) throws Throwable {
		PlanByPlanCode.openThePlanInEditMode(planCode);	
		//Mainframe_GlobalFunctionLib.sendText(7, 24 ,"Y" );
		//Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F7");
		Mainframe_GlobalFunctionLib.sendText(7, 21 ,"2" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F17");
		Mainframe_GlobalFunctionLib.sendText(8, 5 ,carrier );
		Mainframe_GlobalFunctionLib.sendText(8, 16 ,list );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		try{
			if(!((Mainframe_GlobalFunctionLib.getText(13, 5).equalsIgnoreCase(carrier)) && (Mainframe_GlobalFunctionLib.getText(13, 16).equalsIgnoreCase(list))))
					Mainframe_GlobalFunctionLib.pressKey("F6");
		}catch(Exception e){
			Mainframe_GlobalFunctionLib.pressKey("F6");
		}
		Mainframe_GlobalFunctionLib.click(7, 11  );
		Mainframe_GlobalFunctionLib.pressKey("F4");
		Mainframe_GlobalFunctionLib.sendText(4, 5 ,list );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(9, 2 ,"1" );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
			
	}
}
