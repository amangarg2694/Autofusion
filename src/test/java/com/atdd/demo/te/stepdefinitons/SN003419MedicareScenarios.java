package com.atdd.demo.te.stepdefinitons;

import java.io.IOException;
import java.util.StringTokenizer;

import com.atdd.te.screenHelpers.FunctionalLibrary;
import com.optumrx.autofusion.core.te.util.Mainframe_GlobalFunctionLib;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SN003419MedicareScenarios {
	
	@When("^I submit a claim with residence \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\", \"([^\"]*)\"$")
	public void i_submit_a_claim_with_residence(String bin, String proc, String group, String pharmacyID, String rxNbr, String refill, String fillDate, String memberID, String productID, String dspQty, String ds, String psc, String cost, String residence) throws Throwable {
		 FunctionalLibrary.CreateTransaction(bin, proc, group, pharmacyID, rxNbr, refill, fillDate, memberID, productID, dspQty, ds, psc, cost);
		 if(residence.length()==0) {  
				Mainframe_GlobalFunctionLib.sendText(7, 68, " ");  
			}
			else{
				 Mainframe_GlobalFunctionLib.sendText(7, 68, residence);
			}	
		    FunctionalLibrary.submitClaim();  
	}
	
	@Then("^Update Plan Process Qualifier and Drug Status and Turnon NDC Options \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\", \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void update_Plan_Process_Qualifier_and_Drug_Status_and_Turnon_NDC_Options(String plancode, String checknegformchangeonproduct,String NDCList, String processQualifier, String productid, String qualquantity, String minquantity, String maxquantity, String qualdailydose, String mindailydose, String maxdailydose, String ptdquantitytype, String ptdquantitydays, String ptdquantitymax, String ptddayssupplytype, String ptddaysssupplymin, String ptddaysssupplymax, String ptd4thqtrdstype, String ptd4thqtrdsdays, String ptd4thqtrdsmax, String qtydscomp, String negativeformularyfhange, String minmaxquantity, String minmaxdailydose, String quantitydaysupplyptd) throws Throwable { 
		Mainframe_GlobalFunctionLib.sendText(21, 7 ,"4");
	    Mainframe_GlobalFunctionLib.pressKey("Enter");
	    Mainframe_GlobalFunctionLib.sendText(21, 7 ,"1");
	    Mainframe_GlobalFunctionLib.pressKey("Enter");
	    Mainframe_GlobalFunctionLib.sendText(4, 5 ,plancode);
	    Mainframe_GlobalFunctionLib.pressKey("Enter");
	    Mainframe_GlobalFunctionLib.sendText(11, 2 ,"2");
	    Mainframe_GlobalFunctionLib.pressKey("Enter");
	    Mainframe_GlobalFunctionLib.sendText(15, 24 ,"Y");
	    Mainframe_GlobalFunctionLib.sendText(17, 17 ,"8");
	    Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(16, 64 ,"Y");
		Mainframe_GlobalFunctionLib.pressKey("F19");
		Mainframe_GlobalFunctionLib.pressKey("F7");
	    Mainframe_GlobalFunctionLib.sendText(8, 21 ,"9");
	    Mainframe_GlobalFunctionLib.pressKey("Enter");
	    Mainframe_GlobalFunctionLib.pressKey("PageDown");
	    Mainframe_GlobalFunctionLib.sendText(8, 78 ,checknegformchangeonproduct );
	    Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F7");
		Mainframe_GlobalFunctionLib.sendText(7, 21 ,"10");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		/*Mainframe_GlobalFunctionLib.sendText(11, 2 ,"7");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F16");
		Mainframe_GlobalFunctionLib.sendText(6, 4 , productid );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(11, 2 ,"2");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(6, 78 ,"F");*/
		
		FunctionalLibrary.func_SearchAndSelectADataEditMode("7,8" ,NDCList ,"11,8" , NDCList);
		Mainframe_GlobalFunctionLib.pressKey("PageDown");
		Mainframe_GlobalFunctionLib.sendText(11, 24 ,processQualifier);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(16, 64 ,"Y");
		Thread.sleep(3000);
		Mainframe_GlobalFunctionLib.sendText(11, 2 ,"7");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F16");
		Mainframe_GlobalFunctionLib.sendText(6, 4 , productid );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(11, 2 ,"2");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(6, 78 ,"F");
		
			 /* if(qualquantity.length()==0) {  
			Mainframe_GlobalFunctionLib.sendText(9, 18, " ");  
		}
		else{
			Mainframe_GlobalFunctionLib.sendText(9, 18, qualquantity);
		}*/
	    if(minquantity.length()==0) {  
			Mainframe_GlobalFunctionLib.sendText(9, 20, "            ");  
		}
		else{
			Mainframe_GlobalFunctionLib.sendText(9, 20, "            ");
			Mainframe_GlobalFunctionLib.sendText(9, 20, minquantity);
		}
	    if(maxquantity.length()==0) {  
			Mainframe_GlobalFunctionLib.sendText(9, 33, "            ");  
		}
		else{
			Mainframe_GlobalFunctionLib.sendText(9, 33, "            ");
			Mainframe_GlobalFunctionLib.sendText(9, 33, maxquantity);
		}
	    if(qualdailydose.length()==0) {  
			Mainframe_GlobalFunctionLib.sendText(14, 18, " ");  
		}
		else{
			Mainframe_GlobalFunctionLib.sendText(14, 18 ,qualdailydose);
		}
	    if(mindailydose.length()==0) {  
			Mainframe_GlobalFunctionLib.sendText(14, 20, "            ");  
		}
		else{
			Mainframe_GlobalFunctionLib.sendText(14, 20, "            ");
			Mainframe_GlobalFunctionLib.sendText(14, 20, mindailydose);
		}
	    if(maxdailydose.length()==0) {  
			Mainframe_GlobalFunctionLib.sendText(14, 33, "            ");  
		}
		else{
			Mainframe_GlobalFunctionLib.sendText(14, 33, "            ");
			Mainframe_GlobalFunctionLib.sendText(14, 33, maxdailydose);
		}
	    if(ptdquantitytype.length()==0) {  
			Mainframe_GlobalFunctionLib.sendText(12, 58, " ");  
		}
		else{
			Mainframe_GlobalFunctionLib.sendText(12, 58 ,ptdquantitytype);
		}
	    if(ptdquantitydays.length()==0) {  
			Mainframe_GlobalFunctionLib.sendText(12, 61, "   ");  
		}
		else{
			Mainframe_GlobalFunctionLib.sendText(12, 61, "   ");
			Mainframe_GlobalFunctionLib.sendText(12, 61, ptdquantitydays);
		}
	    if(ptdquantitymax.length()==0) {  
			Mainframe_GlobalFunctionLib.sendText(12, 65, "            ");  
		}
		else{
			Mainframe_GlobalFunctionLib.sendText(12, 65, "            ");
			Mainframe_GlobalFunctionLib.sendText(12, 65, ptdquantitymax);
		}
	    if(ptddayssupplytype.length()==0) {  
			Mainframe_GlobalFunctionLib.sendText(13, 58, " ");  
		}
		else{
			Mainframe_GlobalFunctionLib.sendText(13, 58 ,ptddayssupplytype);
		}
	    if(ptddaysssupplymin.length()==0) {  
			Mainframe_GlobalFunctionLib.sendText(13, 61, "   ");  
		}
		else{
			Mainframe_GlobalFunctionLib.sendText(13, 61, "   ");
			Mainframe_GlobalFunctionLib.sendText(13, 61, ptddaysssupplymin);
		}
	    if(ptddaysssupplymax.length()==0) {  
			Mainframe_GlobalFunctionLib.sendText(13, 65, "   ");  
		}
		else{
			Mainframe_GlobalFunctionLib.sendText(13, 65, "   ");
			Mainframe_GlobalFunctionLib.sendText(13, 65, ptddaysssupplymax);
		}
	    if(ptd4thqtrdstype.length()==0) {  
			Mainframe_GlobalFunctionLib.sendText(14, 58, " ");  
		}
		else{
			Mainframe_GlobalFunctionLib.sendText(14, 58 ,ptd4thqtrdstype);
		}
	    if(ptd4thqtrdsdays.length()==0) {  
			Mainframe_GlobalFunctionLib.sendText(14, 61, "   ");  
		}
		else{
			Mainframe_GlobalFunctionLib.sendText(14, 61, "   ");
			Mainframe_GlobalFunctionLib.sendText(14, 61, ptd4thqtrdsdays);
		}
	    if(ptd4thqtrdsmax.length()==0) {  
			Mainframe_GlobalFunctionLib.sendText(14, 65, "   ");  
		}
		else{
			Mainframe_GlobalFunctionLib.sendText(14, 65, "   ");
			Mainframe_GlobalFunctionLib.sendText(14, 65, ptd4thqtrdsmax);
		}
	    if(qtydscomp.length()==0) {  
			Mainframe_GlobalFunctionLib.sendText(11, 58, " ");  
		}
		else{
			Mainframe_GlobalFunctionLib.sendText(11, 58 ,qtydscomp);
		}
	    Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F20");
		Mainframe_GlobalFunctionLib.sendText(10, 21 ,"1");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(14, 2 ,"2");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(10, 75 , negativeformularyfhange);
		Mainframe_GlobalFunctionLib.sendText(12, 27 , minmaxquantity);
		Mainframe_GlobalFunctionLib.sendText(13, 27 , minmaxdailydose);
		Mainframe_GlobalFunctionLib.sendText(14, 27 , quantitydaysupplyptd);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		/*My codeFunctionalLibrary.navigateToRxClaimPlanAdministrator();
		Mainframe_GlobalFunctionLib.sendText(21, 7 ,"4");
	    Mainframe_GlobalFunctionLib.pressKey("Enter");
	    Mainframe_GlobalFunctionLib.sendText(21, 7 ,"1");
	    Mainframe_GlobalFunctionLib.pressKey("Enter");
	    Mainframe_GlobalFunctionLib.sendText(4, 5 ,plancode);
	    Mainframe_GlobalFunctionLib.pressKey("Enter");
	    Mainframe_GlobalFunctionLib.sendText(11, 2 ,"2");
	    Mainframe_GlobalFunctionLib.pressKey("Enter");
	    Mainframe_GlobalFunctionLib.sendText(15, 24 ,"Y");
	    //Mainframe_GlobalFunctionLib.sendText(17, 17 ,"F");
	    Mainframe_GlobalFunctionLib.pressKey("F7");
	    Mainframe_GlobalFunctionLib.sendText(7, 21 ,"10");
	    Mainframe_GlobalFunctionLib.pressKey("Enter");
		 FunctionalLibrary.func_SearchAndSelectADataEditMode("7,8" ,NDCList ,"11,8" , NDCList);
		    Mainframe_GlobalFunctionLib.pressKey("PageDown");
		    Mainframe_GlobalFunctionLib.sendText(11, 24 ,processQualifier);
		    Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(16, 64 ,"Y");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");*/
	}
	
	public static boolean func_SearchAndSelectADataEditMode(String RowColOfData,String Data,String StartRowColToSearch,String DataSearch) throws IOException
	{
	boolean bRes=false;
	try{
	
	StringTokenizer stData=new StringTokenizer(RowColOfData,",");
	StringTokenizer stDataSearch=new StringTokenizer(StartRowColToSearch,",");
	int row=Integer.valueOf(stDataSearch.nextToken());
	String col=stDataSearch.nextToken();
	
	
		Mainframe_GlobalFunctionLib.sendText(stData.nextToken(),stData.nextToken(), Data);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
	
		System.out.println("check the row value"+row);
	
		if(Mainframe_GlobalFunctionLib.getText(row, Integer.parseInt(col)).trim().toLowerCase().contentEquals(DataSearch.trim().toLowerCase()))
	{
	
	bRes=true;
	Mainframe_GlobalFunctionLib.sendText(row, 2, "2");
	Mainframe_GlobalFunctionLib.pressKey("Enter");
	Thread.sleep(1000);
	}
	}
	catch(Exception e){
		
		return bRes;
		
	}
	
	
	 return bRes;
	}
	
	@When("^Update Plan Drug Status and Turnoff NDC Options for Multiple List Plan \"([^\"]*)\"$")
	public void update_Plan_Drug_Status_and_Turnoff_NDC_Options_for_Multiple_List_Plan(String plancode) throws Throwable {
	
		
		
		Mainframe_GlobalFunctionLib.sendText(21, 7 ,"4");
	    Mainframe_GlobalFunctionLib.pressKey("Enter");
	    Mainframe_GlobalFunctionLib.sendText(21, 7 ,"1");
	    Mainframe_GlobalFunctionLib.pressKey("Enter");
	    Mainframe_GlobalFunctionLib.sendText(4, 5 ,plancode);
	    Mainframe_GlobalFunctionLib.pressKey("Enter");
	    Mainframe_GlobalFunctionLib.sendText(11, 2 ,"2");
	    Mainframe_GlobalFunctionLib.pressKey("Enter");
	    Mainframe_GlobalFunctionLib.sendText(15, 24 ,"N");
	    Mainframe_GlobalFunctionLib.sendText(17, 17 ,"F");
	    Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(16, 64 ,"Y");
		Mainframe_GlobalFunctionLib.pressKey("F12");
		Mainframe_GlobalFunctionLib.pressKey("F12");
	}

}
