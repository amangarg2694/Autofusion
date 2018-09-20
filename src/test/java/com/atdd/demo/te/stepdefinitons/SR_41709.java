package com.atdd.demo.te.stepdefinitons;

import java.util.concurrent.TimeUnit;

import com.atdd.te.screenHelpers.FunctionalLibrary;
import com.cucumber.listener.Reporter;
import com.optumrx.autofusion.core.te.util.Mainframe_GlobalFunctionLib;
import com.optumrx.autofusion.core.te.util.Screenshot;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SR_41709 {
	
	@When("^I Navigate to Cost-Sharing In Gap screen \"([^\"]*)\"$")
	public void i_Navigate_to_Cost_Sharing_In_Gap_screen(String plancode) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		FunctionalLibrary.func_NavigateToAScreen("4-1");
		Mainframe_GlobalFunctionLib.sendText(4 , 5 ,plancode);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(11 , 2 ,"2");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F19");
		Mainframe_GlobalFunctionLib.pressKey("F7");
		Mainframe_GlobalFunctionLib.sendText(8 , 21 ,"11");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
	}

	@Then("^Validate Enrtries of 2019 and 2020 \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void validate_Enrtries_of_2019_and_2020(String year, String beneficiarypercentage, String planpercentage, String beneficiarypercentagecosttax, String beneficiaryfee, String planpercentagecosttax, String planfee, String mfrdiscpercentage) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		if(year.contentEquals("2019"))
		{
		FunctionalLibrary.validateText("18" ,"5" , year );
		FunctionalLibrary.validateText("18" ,"15" , beneficiarypercentage );
		FunctionalLibrary.validateText("18" ,"27" , planpercentage );
		FunctionalLibrary.validateText("18" ,"40" , beneficiarypercentagecosttax );
		FunctionalLibrary.validateText("18" ,"47" , beneficiaryfee );
		FunctionalLibrary.validateText("18" ,"56" , planpercentagecosttax );
		FunctionalLibrary.validateText("18" ,"63" , planfee );
		FunctionalLibrary.validateText("18" ,"72" , mfrdiscpercentage );
		}
		if(year.contentEquals("2020"))
		{
		FunctionalLibrary.validateText("19" ,"5" , year );
		FunctionalLibrary.validateText("19" ,"15" , beneficiarypercentage );
		FunctionalLibrary.validateText("19" ,"27" , planpercentage );
		FunctionalLibrary.validateText("19" ,"40" , beneficiarypercentagecosttax );
		FunctionalLibrary.validateText("19" ,"47" , beneficiaryfee );
		FunctionalLibrary.validateText("19" ,"56" , planpercentagecosttax );
		FunctionalLibrary.validateText("19" ,"63" , planfee );
		FunctionalLibrary.validateText("19" ,"72" , mfrdiscpercentage );
		}
	}

	@When("^I am on Plan Medicare Screen$")
	public void i_am_on_Plan_Medicare_Screen() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");
	}

	@Then("^Verify Biosimilar Product List options and Help Function Key \"([^\"]*)\"$")
	public void verify_Biosimilar_Product_List_options_and_Help_Function_Key(String biosimilarproductlistF1text) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		FunctionalLibrary.validateText("10" ,"37" , "Biosimilar Product List" );
		Mainframe_GlobalFunctionLib.click(10, 65);
		Mainframe_GlobalFunctionLib.pressKey("F4");
		Mainframe_GlobalFunctionLib.sendText(7, 4 ," ");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		FunctionalLibrary.validateText("13" ,"5" , "N" );
		FunctionalLibrary.validateText("13" ,"31" , "No" );
		FunctionalLibrary.validateText("14" ,"5" , "Y" );
		FunctionalLibrary.validateText("14" ,"31" , "Yes" );
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F1");
		String F1Text1=Mainframe_GlobalFunctionLib.getText(16, 19);
		String F1Text2=Mainframe_GlobalFunctionLib.getText(17, 19);
		String F1Text3=Mainframe_GlobalFunctionLib.getText(18, 19);
		String F1Text4=Mainframe_GlobalFunctionLib.getText(19, 19);
		Mainframe_GlobalFunctionLib.pressKey("PageDown");
		String F1Text5=Mainframe_GlobalFunctionLib.getText(15, 19);
		String actualvalue=F1Text1+" "+F1Text2+" "+F1Text3+" "+F1Text4+" "+F1Text5;
		FunctionalLibrary.func_CompareStrings(actualvalue,biosimilarproductlistF1text);	
	}
	
	@When("^I am on Active Plan Biosimilar Product List Screen$")
	public void i_am_on_Active_Plan_Biosimilar_Product_List_Screen() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F7");
		Mainframe_GlobalFunctionLib.sendText(8, 21 ,"15");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
	}

	@Then("^Verify active records are displayed \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void verify_active_records_are_displayed(String fromdate, String thrudate, String ndclist, String gpilist, String coveragegapdiscount, String licsgenericcostshare, String nonlicscatastrophicgenericcostshare) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		FunctionalLibrary.validateText("11" ,"5" , fromdate );
		FunctionalLibrary.validateText("11" ,"15" , thrudate );
		FunctionalLibrary.validateText("11" ,"24" , ndclist );
		FunctionalLibrary.validateText("11" ,"36" , gpilist );
		FunctionalLibrary.validateText("11" ,"50" , coveragegapdiscount );
		FunctionalLibrary.validateText("11" ,"58" , licsgenericcostshare );
		FunctionalLibrary.validateText("11" ,"68" , nonlicscatastrophicgenericcostshare );
	}
	@Then("^Verify From Date field and Help Function Key \"([^\"]*)\"$")
	public void verify_From_Date_field_and_Help_Function_Key(String fromdateF1text) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.click(11, 5);
		Mainframe_GlobalFunctionLib.pressKey("F1");
		String F1Text1=Mainframe_GlobalFunctionLib.getText(17, 8);
		String F1Text2=Mainframe_GlobalFunctionLib.getText(18, 8);
		String actualvalue=F1Text1+" "+F1Text2;
		FunctionalLibrary.func_CompareStrings(actualvalue,fromdateF1text);	
	}

	@Then("^Verify Thru Date field and Help Function Key \"([^\"]*)\"$")
	public void verify_Thru_Date_field_and_Help_Function_Key(String thrudateF1text) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.click(11, 15);
		Mainframe_GlobalFunctionLib.pressKey("F1");
		String F1Text1=Mainframe_GlobalFunctionLib.getText(17, 18);
		String F1Text2=Mainframe_GlobalFunctionLib.getText(18, 18);
		String F1Text3=Mainframe_GlobalFunctionLib.getText(19, 18);
		String actualvalue=F1Text1+" "+F1Text2+" "+F1Text3;
		FunctionalLibrary.func_CompareStrings(actualvalue,thrudateF1text);	
	}
	@Then("^Verify NDC List field and Help Function Key \"([^\"]*)\"$")
	public void verify_NDC_List_field_and_Help_Function_Key(String ndclist) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.click(11, 24);
		Mainframe_GlobalFunctionLib.pressKey("F1");
		String F1Text1=Mainframe_GlobalFunctionLib.getText(17, 19);
		String F1Text2=Mainframe_GlobalFunctionLib.getText(18, 19);
		String actualvalue=F1Text1+" "+F1Text2;
		FunctionalLibrary.func_CompareStrings(actualvalue,ndclist);	
	}

	@Then("^Verify GPI List field and Help Function Key \"([^\"]*)\"$")
	public void verify_GPI_List_field_and_Help_Function_Key(String gpilist) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.click(11, 36);
		Mainframe_GlobalFunctionLib.pressKey("F1");
		String F1Text1=Mainframe_GlobalFunctionLib.getText(17, 19);
		String F1Text2=Mainframe_GlobalFunctionLib.getText(18, 19);
		String actualvalue=F1Text1+" "+F1Text2;
		FunctionalLibrary.func_CompareStrings(actualvalue,gpilist);	
	}

	@Then("^Verify Coverage Gap Discount field and Help Function Key \"([^\"]*)\"$")
	public void verify_Coverage_Gap_Discount_field_and_Help_Function_Key(String CoverageGapDiscount) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.click(11, 50);
		Mainframe_GlobalFunctionLib.pressKey("F1");
		String F1Text1=Mainframe_GlobalFunctionLib.getText(14, 5);
		String F1Text2=Mainframe_GlobalFunctionLib.getText(15, 5);
		String F1Text3=Mainframe_GlobalFunctionLib.getText(16, 5);
		String F1Text4=Mainframe_GlobalFunctionLib.getText(18, 5);
		String F1Text5=Mainframe_GlobalFunctionLib.getText(19, 5);
		Mainframe_GlobalFunctionLib.pressKey("PageDown");
		String F1Text6=Mainframe_GlobalFunctionLib.getText(12, 5).toString().trim();
		String F1Text7=Mainframe_GlobalFunctionLib.getText(13, 5);
		String F1Text8=Mainframe_GlobalFunctionLib.getText(14, 5);
		String F1Text9=Mainframe_GlobalFunctionLib.getText(15, 5).toString().trim();
		String F1Text10=Mainframe_GlobalFunctionLib.getText(16, 5);
		String actualvalue=F1Text1+F1Text2+" "+F1Text3+" "+F1Text4+" "+F1Text5+" "+F1Text6+F1Text7+" "+F1Text8+" "+F1Text9+F1Text10;
		FunctionalLibrary.func_CompareStrings(actualvalue,CoverageGapDiscount);	
	}

	@Then("^Verify LICS Generic Cost Share field and Help Function Key \"([^\"]*)\"$")
	public void verify_LICS_Generic_Cost_Share_field_and_Help_Function_Key(String licsgenericcostshare) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.click(11, 58);
		Mainframe_GlobalFunctionLib.pressKey("F1");
		String F1Text1=Mainframe_GlobalFunctionLib.getText(14, 5);
		String F1Text2=Mainframe_GlobalFunctionLib.getText(15, 5);
		String F1Text3=Mainframe_GlobalFunctionLib.getText(16, 5);
		String F1Text4=Mainframe_GlobalFunctionLib.getText(18, 5);
		String F1Text5=Mainframe_GlobalFunctionLib.getText(19, 5);
		Mainframe_GlobalFunctionLib.pressKey("PageDown");
		String F1Text6=Mainframe_GlobalFunctionLib.getText(12, 5).toString().trim();
		String F1Text7=Mainframe_GlobalFunctionLib.getText(13, 5);
		String F1Text8=Mainframe_GlobalFunctionLib.getText(14, 5).toString().trim();
		String F1Text9=Mainframe_GlobalFunctionLib.getText(15, 5);
		String F1Text10=Mainframe_GlobalFunctionLib.getText(16, 5).toString().trim();
		String actualvalue=F1Text1+" "+F1Text2+" "+F1Text3+" "+F1Text4+" "+F1Text5+" "+F1Text6+F1Text7+" "+F1Text8+" "+F1Text9+" "+F1Text10;
		FunctionalLibrary.func_CompareStrings(actualvalue,licsgenericcostshare);	
	}

	@Then("^Verify Non LICS Catastrophic Generic Cost Share field and Help Function Key \"([^\"]*)\"$")
	public void verify_Non_LICS_Catastrophic_Generic_Cost_Share_field_and_Help_Function_Key(String nonlicscatastrophicgenericcostshare) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.click(11, 68);
		Mainframe_GlobalFunctionLib.pressKey("F1");
		String F1Text1=Mainframe_GlobalFunctionLib.getText(14, 5);
		String F1Text2=Mainframe_GlobalFunctionLib.getText(15, 5);
		String F1Text3=Mainframe_GlobalFunctionLib.getText(16, 5);
		String F1Text4=Mainframe_GlobalFunctionLib.getText(18, 5);
		String F1Text5=Mainframe_GlobalFunctionLib.getText(19, 5);
		Mainframe_GlobalFunctionLib.pressKey("PageDown");
		String F1Text6=Mainframe_GlobalFunctionLib.getText(12, 5).toString().trim();
		String F1Text7=Mainframe_GlobalFunctionLib.getText(13, 5);
		String F1Text8=Mainframe_GlobalFunctionLib.getText(14, 5).toString().trim();
		String F1Text9=Mainframe_GlobalFunctionLib.getText(15, 5);
		String F1Text10=Mainframe_GlobalFunctionLib.getText(16, 5).toString().trim();
		String actualvalue=F1Text1+F1Text2+" "+F1Text3+" "+F1Text4+" "+F1Text5+" "+F1Text6+" "+F1Text7+" "+F1Text8+" "+F1Text9+" "+F1Text10;
		FunctionalLibrary.func_CompareStrings(actualvalue,nonlicscatastrophicgenericcostshare);
	}
	
	@Then("^Verify all records are displayed \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void verify_all_records_are_displayed(String fromdate, String thrudate, String ndclist, String gpilist, String coveragegapdiscount, String licsgenericcostshare, String nonlicscatastrophicgenericcostshare, String status) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F8");
		FunctionalLibrary.validateText("11" ,"5" , fromdate );
		FunctionalLibrary.validateText("11" ,"15" , thrudate );
		FunctionalLibrary.validateText("11" ,"24" , ndclist );
		FunctionalLibrary.validateText("11" ,"36" , gpilist );
		FunctionalLibrary.validateText("11" ,"50" , coveragegapdiscount );
		FunctionalLibrary.validateText("11" ,"58" , licsgenericcostshare );
		FunctionalLibrary.validateText("11" ,"68" , nonlicscatastrophicgenericcostshare );
		FunctionalLibrary.validateText("11" ,"78" , status );
	}

	@Then("^Verify Status field and Help Function Key \"([^\"]*)\"$")
	public void verify_Status_field_and_Help_Function_Key(String status) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.click(11, 78);
		Mainframe_GlobalFunctionLib.pressKey("F1");
		String F1Text1=Mainframe_GlobalFunctionLib.getText(15, 5);
		FunctionalLibrary.func_CompareStrings(F1Text1,status);
	}
	

	@Then("^Verify error message on inactive record of Biosimilar Product Lists in Edit mode \"([^\"]*)\"$")
	public void verify_error_message_on_inactive_record_of_Biosimilar_Product_Lists_in_Edit_mode(String editerrormsg) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.sendText(12 , 2 ,"2");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		FunctionalLibrary.validateText("24" ,"2" , editerrormsg );
	}

	@Then("^Verify error message on inactive record of Biosimilar Product Lists in Inactivate mode \"([^\"]*)\"$")
	public void verify_error_message_on_inactive_record_of_Biosimilar_Product_Lists_in_Inactivate_mode(String inactiveerrormsg) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.sendText(12 , 2 ,"4");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		FunctionalLibrary.validateText("24" ,"2" , inactiveerrormsg );
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");
	}
	@When("^I am on Add Plan Biosimilar Product List Screen \"([^\"]*)\"$")
	public void i_am_on_Add_Plan_Biosimilar_Product_List_Screen(String plancode) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		FunctionalLibrary.func_NavigateToAScreen("4-1");
		Mainframe_GlobalFunctionLib.sendText(4 , 5 ,plancode);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(11 , 2 ,"2");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F19");
		Mainframe_GlobalFunctionLib.pressKey("F7");
		Mainframe_GlobalFunctionLib.sendText(8 , 21 ,"15");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F6");
	}

	@Then("^Verify all the fields on the screen \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void verify_all_the_fields_on_the_screen(String fromdate, String thrudate, String ndclist, String gpilist, String coveragegapdiscount, String licsgenericcostshare, String nonlicscatastrophicgenericcostshare) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.sendText("7" ,"13" , "        " );
		Mainframe_GlobalFunctionLib.sendText("7" ,"13" , fromdate );
		Mainframe_GlobalFunctionLib.sendText("7" ,"41" , "        " );
		Mainframe_GlobalFunctionLib.sendText("7" ,"41" , thrudate );
		Mainframe_GlobalFunctionLib.sendText("8" ,"28" , ndclist );
		Mainframe_GlobalFunctionLib.sendText("9" ,"28" , gpilist );
		Mainframe_GlobalFunctionLib.sendText("10" ,"28" , coveragegapdiscount );
		Mainframe_GlobalFunctionLib.sendText("12" ,"28" , licsgenericcostshare );
		Mainframe_GlobalFunctionLib.sendText("13" ,"28" , nonlicscatastrophicgenericcostshare );
		FunctionalLibrary.validateText("7" ,"13" , fromdate );
		FunctionalLibrary.validateText("7" ,"41" , thrudate );
		FunctionalLibrary.validateText("8" ,"28" , ndclist );
		FunctionalLibrary.validateText("9" ,"28" , gpilist );
		FunctionalLibrary.validateText("10" ,"28" , coveragegapdiscount );
		FunctionalLibrary.validateText("12" ,"28" , licsgenericcostshare );
		FunctionalLibrary.validateText("13" ,"28" , nonlicscatastrophicgenericcostshare );
//		Mainframe_GlobalFunctionLib.pressKey("Enter");
	}
	
	@Then("^Verify all the fields on the display screen \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void verify_all_the_fields_on_the_display_screen(String fromdate, String thrudate, String ndclist, String gpilist, String coveragegapdiscount, String licsgenericcostshare, String nonlicscatastrophicgenericcostshare) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		FunctionalLibrary.validateText("7" ,"13" , fromdate );
		FunctionalLibrary.validateText("7" ,"41" , thrudate );
		FunctionalLibrary.validateText("8" ,"28" , ndclist );
		FunctionalLibrary.validateText("9" ,"28" , gpilist );
		FunctionalLibrary.validateText("10" ,"28" , coveragegapdiscount );
		FunctionalLibrary.validateText("12" ,"28" , licsgenericcostshare );
		FunctionalLibrary.validateText("13" ,"28" , nonlicscatastrophicgenericcostshare );
	}
	
	@Then("^Verify From Date field and Help Function Key on Add Plan Biosimilar Product List screen \"([^\"]*)\"$")
	public void verify_From_Date_field_and_Help_Function_Key_on_Add_Plan_Biosimilar_Product_List_screen(String fromdateF1text) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
//		FunctionalLibrary.validateText("11" ,"2" , "2" );
//		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.click(7, 13);
		Mainframe_GlobalFunctionLib.pressKey("F1");
		String F1Text1=Mainframe_GlobalFunctionLib.getText(13, 16);
		String F1Text2=Mainframe_GlobalFunctionLib.getText(14, 16);
		String F1Text3=Mainframe_GlobalFunctionLib.getText(15, 16);
		String actualvalue=F1Text1+F1Text2+" "+F1Text3;
		FunctionalLibrary.func_CompareStrings(actualvalue,fromdateF1text);	
	}
	
	@Then("^Verify Thru Date field and Help Function Key on Add Plan Biosimilar Product List screen \"([^\"]*)\"$")
	public void verify_Thru_Date_field_and_Help_Function_Key_on_Add_Plan_Biosimilar_Product_List_screen(String thrudateF1text) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.click(7, 41);
		Mainframe_GlobalFunctionLib.pressKey("F1");
		String F1Text1=Mainframe_GlobalFunctionLib.getText(13, 19);
		String F1Text2=Mainframe_GlobalFunctionLib.getText(14, 19).toString().trim();
		String F1Text3=Mainframe_GlobalFunctionLib.getText(15, 19);
		String actualvalue=F1Text1+" "+F1Text2+" "+F1Text3;
		FunctionalLibrary.func_CompareStrings(actualvalue,thrudateF1text);
	}
	
	@Then("^Verify NDC List field and Help Function Key on Add Plan Biosimilar Product List screen \"([^\"]*)\"$")
	public void verify_NDC_List_field_and_Help_Function_Key_on_Add_Plan_Biosimilar_Product_List_screen(String ndclist) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.click(8, 28);
		Mainframe_GlobalFunctionLib.pressKey("F1");
		String F1Text1=Mainframe_GlobalFunctionLib.getText(14, 19);
		String F1Text2=Mainframe_GlobalFunctionLib.getText(15, 19);
		String actualvalue=F1Text1+" "+F1Text2;
		FunctionalLibrary.func_CompareStrings(actualvalue,ndclist);	
	}
	
	@Then("^Verify GPI List field and Help Function Key on Add Plan Biosimilar Product List screen \"([^\"]*)\"$")
	public void verify_GPI_List_field_and_Help_Function_Key_on_Add_Plan_Biosimilar_Product_List_screen(String gpilist) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.click(9, 28);
		Mainframe_GlobalFunctionLib.pressKey("F1");
		String F1Text1=Mainframe_GlobalFunctionLib.getText(15, 19);
		String F1Text2=Mainframe_GlobalFunctionLib.getText(16, 19);
		String actualvalue=F1Text1+" "+F1Text2;
		FunctionalLibrary.func_CompareStrings(actualvalue,gpilist);	
	}
	
	@Then("^Verify Coverage Gap Discount field and Help Function Key on Add Plan Biosimilar Product List screen \"([^\"]*)\"$")
	public void verify_Coverage_Gap_Discount_field_and_Help_Function_Key_on_Add_Plan_Biosimilar_Product_List_screen(String CoverageGapDiscount) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.click(10, 28);
		Mainframe_GlobalFunctionLib.pressKey("F1");
		String F1Text1=Mainframe_GlobalFunctionLib.getText(16, 19);
		String F1Text2=Mainframe_GlobalFunctionLib.getText(17, 19);
		String F1Text3=Mainframe_GlobalFunctionLib.getText(19, 19);
		Mainframe_GlobalFunctionLib.pressKey("PageDown");
		String F1Text4=Mainframe_GlobalFunctionLib.getText(14, 19);
		String F1Text5=Mainframe_GlobalFunctionLib.getText(15, 19).toString().trim();
		String F1Text6=Mainframe_GlobalFunctionLib.getText(16, 19);
		String F1Text7=Mainframe_GlobalFunctionLib.getText(17, 19).toString().trim();
		String actualvalue=F1Text1+" "+F1Text2+" "+F1Text3+" "+F1Text4+" "+F1Text5+" "+F1Text6+" "+F1Text7;
		FunctionalLibrary.func_CompareStrings(actualvalue,CoverageGapDiscount);	
	}
	
	@Then("^Verify LICS Generic Cost Share field and Help Function Key on Add Plan Biosimilar Product List screen \"([^\"]*)\"$")
	public void verify_LICS_Generic_Cost_Share_field_and_Help_Function_Key_on_Add_Plan_Biosimilar_Product_List_screen(String licsgenericcostshare) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.click(12, 28);
		Mainframe_GlobalFunctionLib.pressKey("F1");
		String F1Text1=Mainframe_GlobalFunctionLib.getText(18, 19);
		String F1Text2=Mainframe_GlobalFunctionLib.getText(19, 19);
		Mainframe_GlobalFunctionLib.pressKey("PageDown");
		String F1Text3=Mainframe_GlobalFunctionLib.getText(16, 19);
		String F1Text4=Mainframe_GlobalFunctionLib.getText(18, 19);
		String F1Text5=Mainframe_GlobalFunctionLib.getText(19, 19);
		Mainframe_GlobalFunctionLib.pressKey("PageDown");
		String F1Text6=Mainframe_GlobalFunctionLib.getText(16, 19).toString().trim();
		String F1Text7=Mainframe_GlobalFunctionLib.getText(17, 19).toString().trim();
		String F1Text8=Mainframe_GlobalFunctionLib.getText(18, 19).toString().trim();
		String F1Text9=Mainframe_GlobalFunctionLib.getText(19, 19);
		Mainframe_GlobalFunctionLib.pressKey("PageDown");
		String F1Text10=Mainframe_GlobalFunctionLib.getText(16, 19).toString().trim();
		String actualvalue=F1Text1+F1Text2+" "+F1Text3+" "+F1Text4+" "+F1Text5+" "+F1Text6+" "+F1Text7+" "+F1Text8+" "+F1Text9+" "+F1Text10;
		FunctionalLibrary.func_CompareStrings(actualvalue,licsgenericcostshare);
	}
	
	@Then("^Verify Non LICS Catastrophic Generic Cost Share field and Help Function Key on Add Plan Biosimilar Product List screen \"([^\"]*)\"$")
	public void verify_Non_LICS_Catastrophic_Generic_Cost_Share_field_and_Help_Function_Key_on_Add_Plan_Biosimilar_Product_List_screen(String nonlicscatastrophicgenericcostshare) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.click(13, 28);
		Mainframe_GlobalFunctionLib.pressKey("F1");
		String F1Text1=Mainframe_GlobalFunctionLib.getText(19, 19);
		Mainframe_GlobalFunctionLib.pressKey("PageDown");
		String F1Text2=Mainframe_GlobalFunctionLib.getText(17, 19);
		String F1Text3=Mainframe_GlobalFunctionLib.getText(18, 19);
		Mainframe_GlobalFunctionLib.pressKey("PageDown");
		String F1Text4=Mainframe_GlobalFunctionLib.getText(17, 19);
		String F1Text5=Mainframe_GlobalFunctionLib.getText(18, 19);
		String F1Text6=Mainframe_GlobalFunctionLib.getText(19, 19).toString().trim();
		Mainframe_GlobalFunctionLib.pressKey("PageDown");
		String F1Text7=Mainframe_GlobalFunctionLib.getText(17, 19).toString().trim();
		String F1Text8=Mainframe_GlobalFunctionLib.getText(18, 19).toString().trim();
		String F1Text9=Mainframe_GlobalFunctionLib.getText(19, 19);
		Mainframe_GlobalFunctionLib.pressKey("PageDown");
		String F1Text10=Mainframe_GlobalFunctionLib.getText(17, 19).toString().trim();
		String actualvalue=F1Text1+" "+F1Text2+" "+F1Text3+" "+F1Text4+" "+F1Text5+" "+F1Text6+" "+F1Text7+" "+F1Text8+" "+F1Text9+" "+F1Text10;
		FunctionalLibrary.func_CompareStrings(actualvalue,nonlicscatastrophicgenericcostshare);
	}
	
	@Then("^Verify Thru Date field on Add Plan Biosimilar Product List screen \"([^\"]*)\", \"([^\"]*)\"$")
	public void verify_Thru_Date_field_on_Add_Plan_Biosimilar_Product_List_screen(String thrudate, String errormsg) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.sendText(7 , 41 ,"        ");
		Mainframe_GlobalFunctionLib.sendText(7 , 41 ,thrudate);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		FunctionalLibrary.validateText("24" ,"2" , errormsg );
	}
	
	@Then("^Verify Both NDC List and GPI List are blank fields on Add Plan Biosimilar Product List screen \"([^\"]*)\"$")
	public void verify_Both_NDC_List_and_GPI_List_are_blank_fields_on_Add_Plan_Biosimilar_Product_List_screen(String errormsg) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.sendText(7 , 41 ,"        ");
		Mainframe_GlobalFunctionLib.sendText(7 , 41 ,"123118");
		Mainframe_GlobalFunctionLib.sendText(8 , 28 ,"         ");
		Mainframe_GlobalFunctionLib.sendText(9 , 28 ,"         ");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		FunctionalLibrary.validateText("24" ,"2" , errormsg );
	}
	
	@Then("^Verify NDC List field which is not in master file  on Add Plan Biosimilar Product List screen \"([^\"]*)\", \"([^\"]*)\"$")
	public void verify_NDC_List_field_which_is_not_in_master_file_on_Add_Plan_Biosimilar_Product_List_screen(String ndclist, String errormsg) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.sendText(8 , 28 ,ndclist);
		Mainframe_GlobalFunctionLib.sendText(9 , 28 ,"MPD BIOS");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		FunctionalLibrary.validateText("24" ,"2" , errormsg );
	}
	
	@Then("^Verify GPI List field which is not in master file  on Add Plan Biosimilar Product List screen  \"([^\"]*)\",\"([^\"]*)\", \"([^\"]*)\"$")
	public void verify_GPI_List_field_which_is_not_in_master_file_on_Add_Plan_Biosimilar_Product_List_screen(String ndclist, String gpilist, String errormsg) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.sendText(8 , 28 ,ndclist);
		Mainframe_GlobalFunctionLib.sendText(9 , 28 ,gpilist);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		FunctionalLibrary.validateText("24" ,"2" , errormsg );
	}
	
	@Then("^Verify A required field is blank on Add Plan Biosimilar Product List screen   \"([^\"]*)\"$")
	public void verify_A_required_field_is_blank_on_Add_Plan_Biosimilar_Product_List_screen(String errormsg) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.sendText(9 , 28 ,"MPD BIOS");
		Mainframe_GlobalFunctionLib.sendText(13, 28 ," ");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		FunctionalLibrary.validateText("24" ,"2" , errormsg );
	}
	

	@When("^I am on Edit Option of Plan Biosimilar Product List screen$")
	public void i_am_on_Edit_Option_of_Plan_Biosimilar_Product_List_screen() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.sendText(13, 28 ,"N");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(11, 2 ,"2");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
	}

	@When("^I am on Display Option of Plan Biosimilar Product List screen$")
	public void i_am_on_Display_Option_of_Plan_Biosimilar_Product_List_screen() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.sendText(13, 28 ,"N");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.sendText(11, 2 ,"5");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
	}
	@Then("^Verify Status field and Help Function Key on Edit Option Plan Biosimilar Product List screen \"([^\"]*)\"$")
	public void verify_Status_field_and_Help_Function_Key_on_Edit_Option_Plan_Biosimilar_Product_List_screen(String status) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.click(7, 61);
		Mainframe_GlobalFunctionLib.pressKey("F1");
		String F1Text1=Mainframe_GlobalFunctionLib.getText(13, 19);
		FunctionalLibrary.func_CompareStrings(F1Text1,status);
//		Mainframe_GlobalFunctionLib.pressKey("F12");
	}
	
	@Then("^Verify the copy plan function is updated \"([^\"]*)\",\"([^\"]*)\"$")
	public void verify_the_copy_plan_function_is_updated(String srcplan, String targetplan) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.sendText(4, 5 ,srcplan);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(11, 2 ,"3");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(11, 25 ,targetplan);
		Mainframe_GlobalFunctionLib.sendText(12, 25 ,"010101");
		Mainframe_GlobalFunctionLib.sendText(13, 25 ,"TEST COPIED PLAN");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Thread.sleep(1000);
		FunctionalLibrary.validateText("3" ,"13" , targetplan );
		Mainframe_GlobalFunctionLib.pressKey("F19");
		Mainframe_GlobalFunctionLib.pressKey("F7");
		Mainframe_GlobalFunctionLib.sendText(8 , 21 ,"15");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
	}
	
	@When("^I am on Plan Medicare Maintenance Utility Options screen$")
	public void i_am_on_Plan_Medicare_Maintenance_Utility_Options_screen() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		FunctionalLibrary.func_NavigateToAScreen("13-1");
		Mainframe_GlobalFunctionLib.sendText(4 , 5 ,"SN003565");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(9 , 2 ,"2");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(20 , 51 ,"X");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
	}
	
	@Then("^Verify label Coverage Gap Product List is changed to Biosimilar Product List \"([^\"]*)\"$")
	public void verify_label_Coverage_Gap_Product_List_is_changed_to_Biosimilar_Product_List(String biosimilarproductlist) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String actualbiosimilar=Mainframe_GlobalFunctionLib.getText(12, 2).substring(3, 26);
		FunctionalLibrary.func_CompareStrings(actualbiosimilar , biosimilarproductlist );
	}
	
	@When("^I am on Plan Medicare Create Record Detail Page one of two  screen$")
	public void i_am_on_Plan_Medicare_Create_Record_Detail_Page_one_of_two_screen() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.sendText(15 , 20 ,"1");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(13 , 2 ,"2");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
	}

	@Then("^Verify label Coverage Gap Product List is changed to Biosimilar Product List in edit  and display versions\"([^\"]*)\"$")
	public void verify_label_Coverage_Gap_Product_List_is_changed_to_Biosimilar_Product_List_in_edit_and_display_versions(String biosimilarproductlist) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		FunctionalLibrary.validateText("21" ,"2" , biosimilarproductlist );
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.sendText(13 , 2 ,"5");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		FunctionalLibrary.validateText("21" ,"2" , biosimilarproductlist );
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");
	}
	
	@Then("^Verify screen title changed from Plan Medicare Cov Gap Maintenance Utility to Plan Biosimilar Product List Maintenance Utility  \"([^\"]*)\"$")
	public void verify_screen_title_changed_from_Plan_Medicare_Cov_Gap_Maintenance_Utility_to_Plan_Biosimilar_Product_List_Maintenance_Utility(String screentitle) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.sendText(15 , 20 ,"7");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		FunctionalLibrary.validateText("2" ,"17" , screentitle );
	}
	
	@Then("^Verify From date field with help text is displayed on Plan Biosimilar Product List Maintenance Utility screen  \"([^\"]*)\",\"([^\"]*)\"$")
	public void verify_From_date_field_with_help_text_is_displayed_on_Plan_Biosimilar_Product_List_Maintenance_Utility_screen(String fromdate, String fromdateF1text) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.click(13, 5);
		FunctionalLibrary.validateText("13" ,"5" , fromdate );
		Mainframe_GlobalFunctionLib.pressKey("F1");
		String F1Text1=Mainframe_GlobalFunctionLib.getText(19, 8);
		Mainframe_GlobalFunctionLib.pressKey("PageDown");
		String F1Text2=Mainframe_GlobalFunctionLib.getText(17, 8);
		String actualvalue=F1Text1+" "+F1Text2;
		FunctionalLibrary.func_CompareStrings(actualvalue,fromdateF1text);	
	}
	
	@Then("^Verify the existing title of the screen is changed into Plan Bio Product List Create Record and From Date Field is added with help text  \"([^\"]*)\",\"([^\"]*)\"$")
	public void verify_the_existing_title_of_the_screen_is_changed_into_Plan_Bio_Product_List_Create_Record_and_From_Date_Field_is_added_with_help_text(String fromdate, String fromdateF1text) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Mainframe_GlobalFunctionLib.sendText("13" ,"15" , fromdate );
		Mainframe_GlobalFunctionLib.sendText("14" ,"15" , "R" );
		FunctionalLibrary.validateText("13" ,"15" , fromdate );
		Mainframe_GlobalFunctionLib.click(13, 15);
		Mainframe_GlobalFunctionLib.pressKey("F1");
		String F1Text1=Mainframe_GlobalFunctionLib.getText(19, 18);
		Mainframe_GlobalFunctionLib.pressKey("PageDown");
		String F1Text2=Mainframe_GlobalFunctionLib.getText(17, 18);
		String F1Text3=Mainframe_GlobalFunctionLib.getText(18, 18);
		String actualvalue=F1Text1+" "+F1Text2+" "+F1Text3;
		FunctionalLibrary.func_CompareStrings(actualvalue,fromdateF1text);	
	}
	
	@Then("^Verify the error message is dislayed \"([^\"]*)\"$")
	public void verify_the_error_message_is_dislayed(String errormsg) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		FunctionalLibrary.validateText("20" ,"4" , errormsg );
	}
	
	@Then("^Verify is there a change in the title of existing screen  \"([^\"]*)\"$")
	public void verify_is_there_a_change_in_the_title_of_existing_screen(String screentitle) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.sendText(14 , 2 ,"2");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		FunctionalLibrary.validateText("2" ,"17" , screentitle );
	}
	
	@Then("^Verify From date field on Plan Biosimilar Product List Create Record Detail screen  \"([^\"]*)\",\"([^\"]*)\"$")
	public void verify_From_date_field_on_Plan_Biosimilar_Product_List_Create_Record_Detail_screen(String fromdate, String fromdateF1text) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.click(6, 16);
		FunctionalLibrary.validateText("6" ,"16" , fromdate );
		Mainframe_GlobalFunctionLib.pressKey("F1");
		String F1Text1=Mainframe_GlobalFunctionLib.getText(12, 19);
		String F1Text2=Mainframe_GlobalFunctionLib.getText(13, 19);
		String actualvalue=F1Text1+" "+F1Text2;
		FunctionalLibrary.func_CompareStrings(actualvalue,fromdateF1text);
	}
	
	@Then("^Verify Thru date Process field on Plan Biosimilar Product List Create Record Detail screen  \"([^\"]*)\",\"([^\"]*)\"$")
	public void verify_Thru_date_Process_field_on_Plan_Biosimilar_Product_List_Create_Record_Detail_screen(String thrudateprocess, String thrudateprocessF1text) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.pressKey("F12");
		FunctionalLibrary.validateText("9" ,"39" , thrudateprocess );
		Mainframe_GlobalFunctionLib.click(9, 39);
		Mainframe_GlobalFunctionLib.pressKey("F4");
		FunctionalLibrary.validateText("13" ,"5" , "C" );
		FunctionalLibrary.validateText("14" ,"5" , "N" );
		FunctionalLibrary.validateText("15" ,"5" , "R" );
		FunctionalLibrary.validateText("13" ,"31" , "Conditional" );
		FunctionalLibrary.validateText("14" ,"31" , "Null" );
		FunctionalLibrary.validateText("15" ,"31" , "Replace" );
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.click(9, 39);
		Mainframe_GlobalFunctionLib.pressKey("F1");
		String F1Text1=Mainframe_GlobalFunctionLib.getText(14, 41);
		String F1Text2=Mainframe_GlobalFunctionLib.getText(15, 41);
		String F1Text3=Mainframe_GlobalFunctionLib.getText(16, 41);
		String actualvalue=F1Text1+" "+F1Text2+" "+F1Text3;
		FunctionalLibrary.func_CompareStrings(actualvalue,thrudateprocessF1text);
	}

	@Then("^Verify Thru date Existing field on Plan Biosimilar Product List Create Record Detail screen  \"([^\"]*)\",\"([^\"]*)\"$")
	public void verify_Thru_date_Existing_field_on_Plan_Biosimilar_Product_List_Create_Record_Detail_screen(String thrudateexisting, String thrudateexistingF1text) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.pressKey("F12");
		FunctionalLibrary.validateText("9" ,"46" , thrudateexisting );
		Mainframe_GlobalFunctionLib.click(9, 46);
		Mainframe_GlobalFunctionLib.pressKey("F1");
		String F1Text1=Mainframe_GlobalFunctionLib.getText(15, 19);
		String F1Text2=Mainframe_GlobalFunctionLib.getText(16, 19);
		String actualvalue=F1Text1+" "+F1Text2;
		FunctionalLibrary.func_CompareStrings(actualvalue,thrudateexistingF1text);
	}
	@Then("^Verify Thru date New field on Plan Biosimilar Product List Create Record Detail screen  \"([^\"]*)\",\"([^\"]*)\"$")
	public void verify_Thru_date_New_field_on_Plan_Biosimilar_Product_List_Create_Record_Detail_screen(String thrudatenew, String thrudatenewF1text) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.pressKey("F12");
		FunctionalLibrary.validateText("9" ,"63" , thrudatenew );
		Mainframe_GlobalFunctionLib.click(9, 63);
		Mainframe_GlobalFunctionLib.pressKey("F1");
		String F1Text1=Mainframe_GlobalFunctionLib.getText(15, 19);
		String actualvalue=F1Text1;
		FunctionalLibrary.func_CompareStrings(actualvalue,thrudatenewF1text);
	}
	
	@Then("^Verify NDC List Process field on Plan Biosimilar Product List Create Record Detail screen  \"([^\"]*)\",\"([^\"]*)\"$")
	public void verify_NDC_List_Process_field_on_Plan_Biosimilar_Product_List_Create_Record_Detail_screen(String ndclistprocess, String ndclistprocessF1text) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.pressKey("F12");
		FunctionalLibrary.validateText("10" ,"39" , ndclistprocess );
		Mainframe_GlobalFunctionLib.click(10, 39);
		Mainframe_GlobalFunctionLib.pressKey("F4");
		FunctionalLibrary.validateText("13" ,"5" , "C" );
		FunctionalLibrary.validateText("14" ,"5" , "N" );
		FunctionalLibrary.validateText("15" ,"5" , "R" );
		FunctionalLibrary.validateText("13" ,"31" , "Conditional" );
		FunctionalLibrary.validateText("14" ,"31" , "Null" );
		FunctionalLibrary.validateText("15" ,"31" , "Replace" );
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.click(10, 39);
		Mainframe_GlobalFunctionLib.pressKey("F1");
		String F1Text1=Mainframe_GlobalFunctionLib.getText(14, 41);
		String F1Text2=Mainframe_GlobalFunctionLib.getText(15, 41);
		String F1Text3=Mainframe_GlobalFunctionLib.getText(16, 41);
		String actualvalue=F1Text1+" "+F1Text2+" "+F1Text3;
		FunctionalLibrary.func_CompareStrings(actualvalue,ndclistprocessF1text);
	}

	@Then("^Verify NDC List Existing field on Plan Biosimilar Product List Create Record Detail screen  \"([^\"]*)\",\"([^\"]*)\"$")
	public void verify_NDC_List_Existing_field_on_Plan_Biosimilar_Product_List_Create_Record_Detail_screen(String ndclistexisting, String ndclistexistingF1text) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.pressKey("F12");
		FunctionalLibrary.validateText("10" ,"46" , ndclistexisting );
		Mainframe_GlobalFunctionLib.click(10, 46);
		Mainframe_GlobalFunctionLib.pressKey("F1");
		String F1Text1=Mainframe_GlobalFunctionLib.getText(16, 19);
		String actualvalue=F1Text1;
		FunctionalLibrary.func_CompareStrings(actualvalue,ndclistexistingF1text);
	}

	@Then("^Verify NDC List New field on Plan Biosimilar Product List Create Record Detail screen  \"([^\"]*)\",\"([^\"]*)\"$")
	public void verify_NDC_List_New_field_on_Plan_Biosimilar_Product_List_Create_Record_Detail_screen(String ndclistnew, String ndclistnewF1text) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.pressKey("F12");
		FunctionalLibrary.validateText("10" ,"63" , ndclistnew );
		Mainframe_GlobalFunctionLib.click(10, 63);
		Mainframe_GlobalFunctionLib.pressKey("F1");
		String F1Text1=Mainframe_GlobalFunctionLib.getText(16, 19);
		String actualvalue=F1Text1;
		FunctionalLibrary.func_CompareStrings(actualvalue,ndclistnewF1text);
	}

	@Then("^Verify GPI List Process field on Plan Biosimilar Product List Create Record Detail screen  \"([^\"]*)\",\"([^\"]*)\"$")
	public void verify_GPI_List_Process_field_on_Plan_Biosimilar_Product_List_Create_Record_Detail_screen(String gpilistprocess, String gpilistprocessF1text) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.pressKey("F12");
		FunctionalLibrary.validateText("11" ,"39" , gpilistprocess );
		Mainframe_GlobalFunctionLib.click(11, 39);
		Mainframe_GlobalFunctionLib.pressKey("F4");
		FunctionalLibrary.validateText("13" ,"5" , "C" );
		FunctionalLibrary.validateText("14" ,"5" , "N" );
		FunctionalLibrary.validateText("15" ,"5" , "R" );
		FunctionalLibrary.validateText("13" ,"31" , "Conditional" );
		FunctionalLibrary.validateText("14" ,"31" , "Null" );
		FunctionalLibrary.validateText("15" ,"31" , "Replace" );
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.click(11, 39);
		Mainframe_GlobalFunctionLib.pressKey("F1");
		String F1Text1=Mainframe_GlobalFunctionLib.getText(14, 41);
		String F1Text2=Mainframe_GlobalFunctionLib.getText(15, 41);
		String F1Text3=Mainframe_GlobalFunctionLib.getText(16, 41);
		String actualvalue=F1Text1+" "+F1Text2+" "+F1Text3;
		FunctionalLibrary.func_CompareStrings(actualvalue,gpilistprocessF1text);
	}

	@Then("^Verify GPI List Existing field on Plan Biosimilar Product List Create Record Detail screen  \"([^\"]*)\",\"([^\"]*)\"$")
	public void verify_GPI_List_Existing_field_on_Plan_Biosimilar_Product_List_Create_Record_Detail_screen(String gpilistexisting, String gpilistexistingF1text) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.pressKey("F12");
		FunctionalLibrary.validateText("11" ,"46" , gpilistexisting );
		Mainframe_GlobalFunctionLib.click(11, 46);
		Mainframe_GlobalFunctionLib.pressKey("F1");
		String F1Text1=Mainframe_GlobalFunctionLib.getText(17, 19);
		String actualvalue=F1Text1;
		FunctionalLibrary.func_CompareStrings(actualvalue,gpilistexistingF1text);
	}

	@Then("^Verify GPI List New field on Plan Biosimilar Product List Create Record Detail screen  \"([^\"]*)\",\"([^\"]*)\"$")
	public void verify_GPI_List_New_field_on_Plan_Biosimilar_Product_List_Create_Record_Detail_screen(String gpilistnew, String gpilistnewF1text) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.pressKey("F12");
		FunctionalLibrary.validateText("11" ,"63" , gpilistnew );
		Mainframe_GlobalFunctionLib.click(11, 63);
		Mainframe_GlobalFunctionLib.pressKey("F1");
		String F1Text1=Mainframe_GlobalFunctionLib.getText(17, 19);
		String actualvalue=F1Text1;
		FunctionalLibrary.func_CompareStrings(actualvalue,gpilistnewF1text);
	}
	
	@Then("^Verify Coverage Gap Discount Process field on Plan Biosimilar Product List Create Record Detail screen  \"([^\"]*)\",\"([^\"]*)\"$")
	public void verify_Coverage_Gap_Discount_Process_field_on_Plan_Biosimilar_Product_List_Create_Record_Detail_screen(String coveragegapdiscountprocess, String coveragegapdiscountprocessF1text) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.pressKey("F12");
		FunctionalLibrary.validateText("12" ,"39" , coveragegapdiscountprocess );
		Mainframe_GlobalFunctionLib.click(12, 39);
		Mainframe_GlobalFunctionLib.pressKey("F4");
		FunctionalLibrary.validateText("13" ,"5" , "C" );
		FunctionalLibrary.validateText("14" ,"5" , "N" );
		FunctionalLibrary.validateText("15" ,"5" , "R" );
		FunctionalLibrary.validateText("13" ,"31" , "Conditional" );
		FunctionalLibrary.validateText("14" ,"31" , "Null" );
		FunctionalLibrary.validateText("15" ,"31" , "Replace" );
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.click(12, 39);
		Mainframe_GlobalFunctionLib.pressKey("F1");
		String F1Text1=Mainframe_GlobalFunctionLib.getText(14, 41);
		String F1Text2=Mainframe_GlobalFunctionLib.getText(15, 41);
		String F1Text3=Mainframe_GlobalFunctionLib.getText(16, 41);
		String actualvalue=F1Text1+" "+F1Text2+" "+F1Text3;
		FunctionalLibrary.func_CompareStrings(actualvalue,coveragegapdiscountprocessF1text);
	}

	@Then("^Verify Coverage Gap Discount Existing field on Plan Biosimilar Product List Create Record Detail screen  \"([^\"]*)\",\"([^\"]*)\"$")
	public void verify_Coverage_Gap_Discount_Existing_field_on_Plan_Biosimilar_Product_List_Create_Record_Detail_screen(String coveragegapdiscountexisting, String coveragegapdiscountexistingF1text) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.pressKey("F12");
		FunctionalLibrary.validateText("12" ,"46" , coveragegapdiscountexisting );
		Mainframe_GlobalFunctionLib.click(12, 46);
		Mainframe_GlobalFunctionLib.pressKey("F1");
		String F1Text1=Mainframe_GlobalFunctionLib.getText(17, 5);
		String F1Text2=Mainframe_GlobalFunctionLib.getText(18, 5);
		String actualvalue=F1Text1+" "+F1Text2;
		FunctionalLibrary.func_CompareStrings(actualvalue,coveragegapdiscountexistingF1text);
	}

	@Then("^Verify Coverage Gap Discount New field on Plan Biosimilar Product List Create Record Detail screen  \"([^\"]*)\",\"([^\"]*)\"$")
	public void verify_Coverage_Gap_Discount_New_field_on_Plan_Biosimilar_Product_List_Create_Record_Detail_screen(String coveragegapdiscountnew, String coveragegapdiscountnewF1text) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.pressKey("F12");
		FunctionalLibrary.validateText("12" ,"63" , coveragegapdiscountnew );
		Mainframe_GlobalFunctionLib.click(12, 63);
		Mainframe_GlobalFunctionLib.pressKey("F1");
		String F1Text1=Mainframe_GlobalFunctionLib.getText(18, 5);
		String actualvalue=F1Text1;
		FunctionalLibrary.func_CompareStrings(actualvalue,coveragegapdiscountnewF1text);
	}

	@Then("^Verify LICS Generic Cost Share Process field on Plan Biosimilar Product List Create Record Detail screen  \"([^\"]*)\",\"([^\"]*)\"$")
	public void verify_LICS_Generic_Cost_Share_Process_field_on_Plan_Biosimilar_Product_List_Create_Record_Detail_screen(String licsgenericcostshareprocess, String licsgenericcostshareprocessF1text) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.pressKey("F12");
		FunctionalLibrary.validateText("14" ,"39" , licsgenericcostshareprocess );
		Mainframe_GlobalFunctionLib.click(14, 39);
		Mainframe_GlobalFunctionLib.pressKey("F4");
		FunctionalLibrary.validateText("13" ,"5" , "C" );
		FunctionalLibrary.validateText("14" ,"5" , "N" );
		FunctionalLibrary.validateText("15" ,"5" , "R" );
		FunctionalLibrary.validateText("13" ,"31" , "Conditional" );
		FunctionalLibrary.validateText("14" ,"31" , "Null" );
		FunctionalLibrary.validateText("15" ,"31" , "Replace" );
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.click(14, 39);
		Mainframe_GlobalFunctionLib.pressKey("F1");
		String F1Text1=Mainframe_GlobalFunctionLib.getText(14, 41);
		String F1Text2=Mainframe_GlobalFunctionLib.getText(15, 41);
		String F1Text3=Mainframe_GlobalFunctionLib.getText(16, 41);
		String actualvalue=F1Text1+" "+F1Text2+" "+F1Text3;
		FunctionalLibrary.func_CompareStrings(actualvalue,licsgenericcostshareprocessF1text);
	}

	@Then("^Verify LICS Generic Cost Share Existing field on Plan Biosimilar Product List Create Record Detail screen  \"([^\"]*)\",\"([^\"]*)\"$")
	public void verify_LICS_Generic_Cost_Share_Existing_field_on_Plan_Biosimilar_Product_List_Create_Record_Detail_screen(String licsgenericcostshareexisting, String licsgenericcostshareexistF1text) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.pressKey("F12");
		FunctionalLibrary.validateText("14" ,"46" , licsgenericcostshareexisting );
		Mainframe_GlobalFunctionLib.click(14, 46);
		Mainframe_GlobalFunctionLib.pressKey("F1");
		String F1Text1=Mainframe_GlobalFunctionLib.getText(17, 5);
		String F1Text2=Mainframe_GlobalFunctionLib.getText(18, 5);
		String actualvalue=F1Text1+" "+F1Text2;
		FunctionalLibrary.func_CompareStrings(actualvalue,licsgenericcostshareexistF1text);
	}

	@Then("^Verify LICS Generic Cost Share New field on Plan Biosimilar Product List Create Record Detail screen  \"([^\"]*)\",\"([^\"]*)\"$")
	public void verify_LICS_Generic_Cost_Share_New_field_on_Plan_Biosimilar_Product_List_Create_Record_Detail_screen(String licsgenericcostsharenew, String licsgenericcostsharenewF1text) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.pressKey("F12");
		FunctionalLibrary.validateText("14" ,"63" , licsgenericcostsharenew );
		Mainframe_GlobalFunctionLib.click(14, 63);
		Mainframe_GlobalFunctionLib.pressKey("F1");
		String F1Text1=Mainframe_GlobalFunctionLib.getText(18, 5);
		String actualvalue=F1Text1;
		FunctionalLibrary.func_CompareStrings(actualvalue,licsgenericcostsharenewF1text);
	}

	@Then("^Verify Non LICS Generic Cost Share Process field on Plan Biosimilar Product List Create Record Detail screen  \"([^\"]*)\",\"([^\"]*)\"$")
	public void verify_Non_LICS_Generic_Cost_Share_Process_field_on_Plan_Biosimilar_Product_List_Create_Record_Detail_screen(String nonlicsgenericcostshareprocess, String nonlicsgenericcostshareprocessF1text) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.pressKey("F12");
		FunctionalLibrary.validateText("15" ,"39" , nonlicsgenericcostshareprocess );
		Mainframe_GlobalFunctionLib.click(15, 39);
		Mainframe_GlobalFunctionLib.pressKey("F4");
		FunctionalLibrary.validateText("13" ,"5" , "C" );
		FunctionalLibrary.validateText("14" ,"5" , "N" );
		FunctionalLibrary.validateText("15" ,"5" , "R" );
		FunctionalLibrary.validateText("13" ,"31" , "Conditional" );
		FunctionalLibrary.validateText("14" ,"31" , "Null" );
		FunctionalLibrary.validateText("15" ,"31" , "Replace" );
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.click(15, 39);
		Mainframe_GlobalFunctionLib.pressKey("F1");
		String F1Text1=Mainframe_GlobalFunctionLib.getText(14, 41);
		String F1Text2=Mainframe_GlobalFunctionLib.getText(15, 41);
		String F1Text3=Mainframe_GlobalFunctionLib.getText(16, 41);
		String actualvalue=F1Text1+" "+F1Text2+" "+F1Text3;
		FunctionalLibrary.func_CompareStrings(actualvalue, nonlicsgenericcostshareprocessF1text);
	}

	@Then("^Verify Non LICS Generic Cost Share Existing field on Plan Biosimilar Product List Create Record Detail screen  \"([^\"]*)\",\"([^\"]*)\"$")
	public void verify_Non_LICS_Generic_Cost_Share_Existing_field_on_Plan_Biosimilar_Product_List_Create_Record_Detail_screen(String nonlicsgenericcostshareexisting, String nonlicsgenericcostshareexistF1text) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.pressKey("F12");
		FunctionalLibrary.validateText("15" ,"46" , nonlicsgenericcostshareexisting );
		Mainframe_GlobalFunctionLib.click(15, 46);
		Mainframe_GlobalFunctionLib.pressKey("F1");
		String F1Text1=Mainframe_GlobalFunctionLib.getText(16, 5);
		String F1Text2=Mainframe_GlobalFunctionLib.getText(17, 5);
		String F1Text3=Mainframe_GlobalFunctionLib.getText(18, 5);
		String actualvalue=F1Text1+" "+F1Text2+" "+F1Text3;
		FunctionalLibrary.func_CompareStrings(actualvalue, nonlicsgenericcostshareexistF1text);
	}

	@Then("^Verify Non LICS Generic Cost Share New field on Plan Biosimilar Product List Create Record Detail screen  \"([^\"]*)\",\"([^\"]*)\"$")
	public void verify_Non_LICS_Generic_Cost_Share_New_field_on_Plan_Biosimilar_Product_List_Create_Record_Detail_screen(String nonlicsgenericcostsharenew, String nonlicsgenericcostsharenewF1text) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.pressKey("F12");
		FunctionalLibrary.validateText("15" ,"63" , nonlicsgenericcostsharenew );
		Mainframe_GlobalFunctionLib.click(15, 63);
		Mainframe_GlobalFunctionLib.pressKey("F1");
		String F1Text1=Mainframe_GlobalFunctionLib.getText(17, 5);
		String F1Text2=Mainframe_GlobalFunctionLib.getText(18, 5);
		String actualvalue=F1Text1+" "+F1Text2;
		FunctionalLibrary.func_CompareStrings(actualvalue, nonlicsgenericcostsharenewF1text);
	}

	@Then("^Verify Thru Date New error message on Plan Biosimilar Product List Create Record Detail screen  \"([^\"]*)\",\"([^\"]*)\"$")
	public void verify_Thru_Date_New_error_message_on_Plan_Biosimilar_Product_List_Create_Record_Detail_screen(String thrudate, String errormsg) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.sendText(9 , 63 ,"        ");
		Mainframe_GlobalFunctionLib.sendText(9 , 63 ,thrudate);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		FunctionalLibrary.validateText("24" ,"2" , errormsg );
		Mainframe_GlobalFunctionLib.sendText(9 , 63 ,"        ");
		Mainframe_GlobalFunctionLib.sendText(9 , 63 ,"10118");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
	}
	
	@Then("^Verify error message on Plan Biosimilar Product List Create Record Detail screen  \"([^\"]*)\",\"([^\"]*)\"$")
	public void verify_error_message_on_Plan_Biosimilar_Product_List_Create_Record_Detail_screen(String thrudateprocess, String errormsg) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.sendText(9 , 39 , " ");
		Mainframe_GlobalFunctionLib.sendText(9 , 63 ,"        ");
		Mainframe_GlobalFunctionLib.sendText(9 , 63 ,"10118");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		FunctionalLibrary.validateText("24" ,"2" , errormsg );
		Mainframe_GlobalFunctionLib.sendText(9 , 39 ,thrudateprocess);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
	}
	
	@Then("^Verify is there a change in the title of existing screen with Add Action  \"([^\"]*)\"$")
	public void verify_is_there_a_change_in_the_title_of_existing_screen_with_Add_Action(String screentitle) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.sendText(13 , 2 ,"2");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		FunctionalLibrary.validateText("2" ,"17" , screentitle );
	}

	@Then("^Verify From date field on Plan Biosimilar Product List Create Record Detail screen with Add Action  \"([^\"]*)\",\"([^\"]*)\"$")
	public void verify_From_date_field_on_Plan_Biosimilar_Product_List_Create_Record_Detail_screen_with_Add_Action(String fromdate, String fromdateF1text) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.click(6, 15);
		FunctionalLibrary.validateText("6" ,"15" , fromdate );
		Mainframe_GlobalFunctionLib.pressKey("F1");
		String F1Text1=Mainframe_GlobalFunctionLib.getText(12, 18);
		String F1Text2=Mainframe_GlobalFunctionLib.getText(13, 18);
		String actualvalue=F1Text1+" "+F1Text2;
		FunctionalLibrary.func_CompareStrings(actualvalue,fromdateF1text);
	}

	@Then("^Verify Thru date Process field on Plan Biosimilar Product List Create Record Detail screen with Add Action  \"([^\"]*)\"$")
	public void verify_Thru_date_Process_field_on_Plan_Biosimilar_Product_List_Create_Record_Detail_screen_with_Add_Action(String thrudateprocessF1text) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.click(9, 39);
		Mainframe_GlobalFunctionLib.pressKey("F1");
		String F1Text1=Mainframe_GlobalFunctionLib.getText(14, 41);
		String F1Text2=Mainframe_GlobalFunctionLib.getText(15, 41);
		String F1Text3=Mainframe_GlobalFunctionLib.getText(16, 41);
		String actualvalue=F1Text1+" "+F1Text2+" "+F1Text3;
		FunctionalLibrary.func_CompareStrings(actualvalue,thrudateprocessF1text);
	}

	@Then("^Verify Thru date Existing field on Plan Biosimilar Product List Create Record Detail screen with Add Action \"([^\"]*)\"$")
	public void verify_Thru_date_Existing_field_on_Plan_Biosimilar_Product_List_Create_Record_Detail_screen_with_Add_Action(String thrudateexistingF1text) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.click(9, 46);
		Mainframe_GlobalFunctionLib.pressKey("F1");
		String F1Text1=Mainframe_GlobalFunctionLib.getText(15, 19);
		String F1Text2=Mainframe_GlobalFunctionLib.getText(16, 19);
		String actualvalue=F1Text1+" "+F1Text2;
		FunctionalLibrary.func_CompareStrings(actualvalue,thrudateexistingF1text);
	}

	@Then("^Verify Thru date New field on Plan Biosimilar Product List Create Record Detail screen with Add Action  \"([^\"]*)\",\"([^\"]*)\"$")
	public void verify_Thru_date_New_field_on_Plan_Biosimilar_Product_List_Create_Record_Detail_screen_with_Add_Action(String thrudatenew, String thrudatenewF1text) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.pressKey("F12");
		FunctionalLibrary.validateText("9" ,"63" , thrudatenew );
		Mainframe_GlobalFunctionLib.click(9, 63);
		Mainframe_GlobalFunctionLib.pressKey("F1");
		String F1Text1=Mainframe_GlobalFunctionLib.getText(15, 19);
		String actualvalue=F1Text1;
		FunctionalLibrary.func_CompareStrings(actualvalue,thrudatenewF1text);
	}

	@Then("^Verify NDC List Process field on Plan Biosimilar Product List Create Record Detail screen with Add Action \"([^\"]*)\"$")
	public void verify_NDC_List_Process_field_on_Plan_Biosimilar_Product_List_Create_Record_Detail_screen_with_Add_Action(String ndclistprocessF1text) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.click(10, 39);
		Mainframe_GlobalFunctionLib.pressKey("F1");
		String F1Text1=Mainframe_GlobalFunctionLib.getText(15, 41);
		String F1Text2=Mainframe_GlobalFunctionLib.getText(16, 41);
		String F1Text3=Mainframe_GlobalFunctionLib.getText(17, 41);
		String actualvalue=F1Text1+" "+F1Text2+" "+F1Text3;
		FunctionalLibrary.func_CompareStrings(actualvalue, ndclistprocessF1text);
	}

	@Then("^Verify NDC List Existing field on Plan Biosimilar Product List Create Record Detail screen with Add Action \"([^\"]*)\"$")
	public void verify_NDC_List_Existing_field_on_Plan_Biosimilar_Product_List_Create_Record_Detail_screen_with_Add_Action(String ndclistexistingF1text) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.click(10, 46);
		Mainframe_GlobalFunctionLib.pressKey("F1");
		String F1Text1=Mainframe_GlobalFunctionLib.getText(16, 19);
		String actualvalue=F1Text1;
		FunctionalLibrary.func_CompareStrings(actualvalue, ndclistexistingF1text);
	}

	@Then("^Verify NDC List New field on Plan Biosimilar Product List Create Record Detail screen with Add Action \"([^\"]*)\",\"([^\"]*)\"$")
	public void verify_NDC_List_New_field_on_Plan_Biosimilar_Product_List_Create_Record_Detail_screen_with_Add_Action(String ndclistnew, String ndclistnewF1text) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.pressKey("F12");
		FunctionalLibrary.validateText("10" ,"63" , ndclistnew );
		Mainframe_GlobalFunctionLib.click(10, 63);
		Mainframe_GlobalFunctionLib.pressKey("F1");
		String F1Text1=Mainframe_GlobalFunctionLib.getText(16, 19);
		String actualvalue=F1Text1;
		FunctionalLibrary.func_CompareStrings(actualvalue,ndclistnewF1text);
	}

	@Then("^Verify GPI List Process field on Plan Biosimilar Product List Create Record Detail screen with Add Action \"([^\"]*)\"$")
	public void verify_GPI_List_Process_field_on_Plan_Biosimilar_Product_List_Create_Record_Detail_screen_with_Add_Action(String gpilistprocessF1text) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.click(11, 39);
		Mainframe_GlobalFunctionLib.pressKey("F1");
		String F1Text1=Mainframe_GlobalFunctionLib.getText(15, 41);
		String F1Text2=Mainframe_GlobalFunctionLib.getText(16, 41);
		String F1Text3=Mainframe_GlobalFunctionLib.getText(17, 41);
		String actualvalue=F1Text1+" "+F1Text2+" "+F1Text3;
		FunctionalLibrary.func_CompareStrings(actualvalue,gpilistprocessF1text);
	}

	@Then("^Verify GPI List Existing field on Plan Biosimilar Product List Create Record Detail screen  with Add Action \"([^\"]*)\"$")
	public void verify_GPI_List_Existing_field_on_Plan_Biosimilar_Product_List_Create_Record_Detail_screen_with_Add_Action(String gpilistexistingF1text) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.click(11, 46);
		Mainframe_GlobalFunctionLib.pressKey("F1");
		String F1Text1=Mainframe_GlobalFunctionLib.getText(17, 19);
		String actualvalue=F1Text1;
		FunctionalLibrary.func_CompareStrings(actualvalue,gpilistexistingF1text);
	}

	@Then("^Verify GPI List New field on Plan Biosimilar Product List Create Record Detail screen with Add Action \"([^\"]*)\",\"([^\"]*)\"$")
	public void verify_GPI_List_New_field_on_Plan_Biosimilar_Product_List_Create_Record_Detail_screen_with_Add_Action(String gpilistnew, String gpilistnewF1text) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.pressKey("F12");
		FunctionalLibrary.validateText("11" ,"63" , gpilistnew );
		Mainframe_GlobalFunctionLib.click(11, 63);
		Mainframe_GlobalFunctionLib.pressKey("F1");
		String F1Text1=Mainframe_GlobalFunctionLib.getText(17, 19);
		String actualvalue=F1Text1;
		FunctionalLibrary.func_CompareStrings(actualvalue,gpilistnewF1text);
	}

	@Then("^Verify Coverage Gap Discount Process field on Plan Biosimilar Product List Create Record Detail screen with Add Action \"([^\"]*)\"$")
	public void verify_Coverage_Gap_Discount_Process_field_on_Plan_Biosimilar_Product_List_Create_Record_Detail_screen_with_Add_Action(String coveragegapdiscountprocessF1text) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.click(12, 39);
		Mainframe_GlobalFunctionLib.pressKey("F1");
		String F1Text1=Mainframe_GlobalFunctionLib.getText(14, 41);
		String F1Text2=Mainframe_GlobalFunctionLib.getText(15, 41);
		String F1Text3=Mainframe_GlobalFunctionLib.getText(16, 41);
		String actualvalue=F1Text1+" "+F1Text2+" "+F1Text3;
		FunctionalLibrary.func_CompareStrings(actualvalue,coveragegapdiscountprocessF1text);
	}

	@Then("^Verify Coverage Gap Discount Existing field on Plan Biosimilar Product List Create Record Detail screen  with Add Action \"([^\"]*)\"$")
	public void verify_Coverage_Gap_Discount_Existing_field_on_Plan_Biosimilar_Product_List_Create_Record_Detail_screen_with_Add_Action(String coveragegapdiscountexistingF1text) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.click(12, 46);
		Mainframe_GlobalFunctionLib.pressKey("F1");
		String F1Text1=Mainframe_GlobalFunctionLib.getText(17, 5);
		String F1Text2=Mainframe_GlobalFunctionLib.getText(18, 5);
		String actualvalue=F1Text1+" "+F1Text2;
		FunctionalLibrary.func_CompareStrings(actualvalue,coveragegapdiscountexistingF1text);
	}

	@Then("^Verify Coverage Gap Discount New field on Plan Biosimilar Product List Create Record Detail screen with Add Action \"([^\"]*)\",\"([^\"]*)\"$")
	public void verify_Coverage_Gap_Discount_New_field_on_Plan_Biosimilar_Product_List_Create_Record_Detail_screen_with_Add_Action(String coveragegapdiscountnew, String coveragegapdiscountnewF1text) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.pressKey("F12");
		FunctionalLibrary.validateText("12" ,"63" , coveragegapdiscountnew );
		Mainframe_GlobalFunctionLib.click(12, 63);
		Mainframe_GlobalFunctionLib.pressKey("F1");
		String F1Text1=Mainframe_GlobalFunctionLib.getText(18, 5);
		String actualvalue=F1Text1;
		FunctionalLibrary.func_CompareStrings(actualvalue,coveragegapdiscountnewF1text);
	}

	@Then("^Verify LICS Generic Cost Share Process field on Plan Biosimilar Product List Create Record Detail screen  with Add Action \"([^\"]*)\"$")
	public void verify_LICS_Generic_Cost_Share_Process_field_on_Plan_Biosimilar_Product_List_Create_Record_Detail_screen_with_Add_Action(String licsgenericcostshareprocessF1text) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.click(14, 39);
		Mainframe_GlobalFunctionLib.pressKey("F1");
		String F1Text1=Mainframe_GlobalFunctionLib.getText(14, 41);
		String F1Text2=Mainframe_GlobalFunctionLib.getText(15, 41);
		String F1Text3=Mainframe_GlobalFunctionLib.getText(16, 41);
		String actualvalue=F1Text1+" "+F1Text2+" "+F1Text3;
		FunctionalLibrary.func_CompareStrings(actualvalue, licsgenericcostshareprocessF1text);
	}

	@Then("^Verify LICS Generic Cost Share Existing field on Plan Biosimilar Product List Create Record Detail screen with Add Action \"([^\"]*)\"$")
	public void verify_LICS_Generic_Cost_Share_Existing_field_on_Plan_Biosimilar_Product_List_Create_Record_Detail_screen_with_Add_Action(String licsgenericcostshareexistF1text) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.click(14, 46);
		Mainframe_GlobalFunctionLib.pressKey("F1");
		String F1Text1=Mainframe_GlobalFunctionLib.getText(17, 5);
		String F1Text2=Mainframe_GlobalFunctionLib.getText(18, 5);
		String actualvalue=F1Text1+" "+F1Text2;
		FunctionalLibrary.func_CompareStrings(actualvalue, licsgenericcostshareexistF1text);
	}

	@Then("^Verify LICS Generic Cost Share New field on Plan Biosimilar Product List Create Record Detail screen with Add Action \"([^\"]*)\",\"([^\"]*)\"$")
	public void verify_LICS_Generic_Cost_Share_New_field_on_Plan_Biosimilar_Product_List_Create_Record_Detail_screen_with_Add_Action(String licsgenericcostsharenew, String licsgenericcostsharenewF1text) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.pressKey("F12");
		FunctionalLibrary.validateText("14" ,"63" , licsgenericcostsharenew );
		Mainframe_GlobalFunctionLib.click(14, 63);
		Mainframe_GlobalFunctionLib.pressKey("F1");
		String F1Text1=Mainframe_GlobalFunctionLib.getText(18, 5);
		String actualvalue=F1Text1;
		FunctionalLibrary.func_CompareStrings(actualvalue,licsgenericcostsharenewF1text);
	}

	@Then("^Verify Non LICS Generic Cost Share Process field on Plan Biosimilar Product List Create Record Detail screen with Add Action \"([^\"]*)\"$")
	public void verify_Non_LICS_Generic_Cost_Share_Process_field_on_Plan_Biosimilar_Product_List_Create_Record_Detail_screen_with_Add_Action(String nonlicsgenericcostshareprocessF1text) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.click(15, 39);
		Mainframe_GlobalFunctionLib.pressKey("F1");
		String F1Text1=Mainframe_GlobalFunctionLib.getText(14, 41);
		String F1Text2=Mainframe_GlobalFunctionLib.getText(15, 41);
		String F1Text3=Mainframe_GlobalFunctionLib.getText(16, 41);
		String actualvalue=F1Text1+" "+F1Text2+" "+F1Text3;
		FunctionalLibrary.func_CompareStrings(actualvalue, nonlicsgenericcostshareprocessF1text);
	}

	@Then("^Verify Non LICS Generic Cost Share Existing field on Plan Biosimilar Product List Create Record Detail screen with Add Action \"([^\"]*)\"$")
	public void verify_Non_LICS_Generic_Cost_Share_Existing_field_on_Plan_Biosimilar_Product_List_Create_Record_Detail_screen_with_Add_Action(String nonlicsgenericcostshareexistF1text) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.click(15, 46);
		Mainframe_GlobalFunctionLib.pressKey("F1");
		String F1Text1=Mainframe_GlobalFunctionLib.getText(16, 5);
		String F1Text2=Mainframe_GlobalFunctionLib.getText(17, 5);
		String F1Text3=Mainframe_GlobalFunctionLib.getText(18, 5);
		String actualvalue=F1Text1+" "+F1Text2+" "+F1Text3;
		FunctionalLibrary.func_CompareStrings(actualvalue, nonlicsgenericcostshareexistF1text);
	}

	@Then("^Verify Non LICS Generic Cost Share New field on Plan Biosimilar Product List Create Record Detail screen with Add Action \"([^\"]*)\",\"([^\"]*)\"$")
	public void verify_Non_LICS_Generic_Cost_Share_New_field_on_Plan_Biosimilar_Product_List_Create_Record_Detail_screen_with_Add_Action(String nonlicsgenericcostsharenew, String nonlicsgenericcostsharenewF1text) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.pressKey("F12");
		FunctionalLibrary.validateText("15" ,"63" , nonlicsgenericcostsharenew );
		Mainframe_GlobalFunctionLib.click(15, 63);
		Mainframe_GlobalFunctionLib.pressKey("F1");
		String F1Text1=Mainframe_GlobalFunctionLib.getText(17, 5);
		String F1Text2=Mainframe_GlobalFunctionLib.getText(18, 5);
		String actualvalue=F1Text1+" "+F1Text2;
		FunctionalLibrary.func_CompareStrings(actualvalue, nonlicsgenericcostsharenewF1text);
	}

	@Then("^Verify Thru Date New error message on Plan Biosimilar Product List Create Record Detail screen with Add Action \"([^\"]*)\",\"([^\"]*)\"$")
	public void verify_Thru_Date_New_error_message_on_Plan_Biosimilar_Product_List_Create_Record_Detail_screen_with_Add_Action(String thrudate, String errormsg) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.sendText(9 , 63 ,"        ");
		Mainframe_GlobalFunctionLib.sendText(9 , 63 ,thrudate);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		FunctionalLibrary.validateText("24" ,"2" , errormsg );
		Mainframe_GlobalFunctionLib.sendText(9 , 63 ,"        ");
		Mainframe_GlobalFunctionLib.sendText(9 , 63 ,"10118");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
	}

	@Then("^Verify for Required field blank error message on Plan Biosimilar Product List Create Record Detail screen with Add Action \"([^\"]*)\",\"([^\"]*)\"$")
	public void verify_for_Required_field_blank_error_message_on_Plan_Biosimilar_Product_List_Create_Record_Detail_screen_with_Add_Action(String licsnew, String errormsg) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.sendText(14 , 63 , " ");
		Mainframe_GlobalFunctionLib.sendText(9 , 63 ,"        ");
		Mainframe_GlobalFunctionLib.sendText(9 , 63 ,"10118");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		FunctionalLibrary.validateText("24" ,"2" , errormsg );
		Mainframe_GlobalFunctionLib.sendText(14 , 63 ,licsnew);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
	}

	@Then("^Verify for both NDC and GPI blank error message on Plan Biosimilar Product List Create Record Detail screen with Add Action \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void verify_for_both_NDC_and_GPI_blank_error_message_on_Plan_Biosimilar_Product_List_Create_Record_Detail_screen_with_Add_Action(String ndllist, String gpilist, String errormsg) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mainframe_GlobalFunctionLib.sendText(10 , 63 ,"          ");
		Mainframe_GlobalFunctionLib.sendText(11 , 63 ,"          ");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		FunctionalLibrary.validateText("24" ,"2" , errormsg );
		Mainframe_GlobalFunctionLib.sendText(10 , 63 , ndllist);
		Mainframe_GlobalFunctionLib.sendText(11 , 63 ,gpilist);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
	}
}
