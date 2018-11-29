package com.atdd.demo.te.stepdefinitons;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.StringTokenizer;

import com.atdd.te.screenHelpers.FunctionalLibrary;
import com.itextpdf.text.log.SysoCounter;
import com.optumrx.autofusion.core.te.util.Mainframe_GlobalFunctionLib;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ContingentTherapy {	
	
	@When("^I create Active Contingent Therapy Schedule with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_create_Active_Contingent_Therapy_Schedule_with(String Schedule1, String desc, String mmsgcde, String mmstyp, String umsgcde, String umsgtyp) throws Throwable {
	   //FunctionalLibrary.createACTS(Schedule1,desc,mmsgcde,mmstyp,umsgcde,umsgtyp);
		Mainframe_GlobalFunctionLib.sendText(4, 6, Schedule1);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Thread.sleep(1000);
		if(!(Mainframe_GlobalFunctionLib.getText(4, 6).trim().equals(Mainframe_GlobalFunctionLib.getText(10, 6).trim()))){
		//if(!(func_SearchAndSelectADataEditMode("4,6" ,Schedule1 ,"10,6" , Schedule1))){
            Mainframe_GlobalFunctionLib.pressKey("F6");
            Mainframe_GlobalFunctionLib.sendText(5, 11, Schedule1);
            Mainframe_GlobalFunctionLib.sendText(5, 33, desc);
            Mainframe_GlobalFunctionLib.sendText(8, 17, mmsgcde);
            Mainframe_GlobalFunctionLib.sendText(9, 17, mmstyp);
            Mainframe_GlobalFunctionLib.sendText(12, 17, umsgcde);
            Mainframe_GlobalFunctionLib.sendText(13, 17, umsgtyp);
            Mainframe_GlobalFunctionLib.pressKey("Enter");
		}
		else{
			System.out.println("Out of  create sch loop");
		}
	}

	@And("^I navigate to  Contingent Therapy Schedule Protocol Sequence with \"([^\"]*)\" for \"([^\"]*)\"$")
	public void i_navigate_to_Contingent_Therapy_Schedule_Protocol_Sequence_with_for(String seq, String Schedule1) throws Throwable {
	    //FunctionalLibrary.createACTSseq(seq, Schedule1);
		Mainframe_GlobalFunctionLib.sendText(4, 6, Schedule1);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Thread.sleep(2000);
			Mainframe_GlobalFunctionLib.sendText("10","002", "7");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			//Mainframe_GlobalFunctionLib.sendText("6", "004", seq);
			//Mainframe_GlobalFunctionLib.pressKey("Enter");
			Thread.sleep(1000);
			if(!(Mainframe_GlobalFunctionLib.getText(24, 2).trim().equals("No data to display."))){
		
			if(!(Mainframe_GlobalFunctionLib.getText(6, 4).trim().equals(Mainframe_GlobalFunctionLib.getText(11, 4).trim()))){
			if(!(FunctionalLibrary.func_SearchAndSelectADataEditMode("6,4" ,seq ,"11,4" , seq))){
				Mainframe_GlobalFunctionLib.pressKey("F6");
				Mainframe_GlobalFunctionLib.sendText(13, 19, seq);
				Mainframe_GlobalFunctionLib.pressKey("Enter");
			}
			else{
				System.out.println("Out of  navigate seq loop");
			}
			}
			else if(Mainframe_GlobalFunctionLib.getText(24, 2).trim().equals("No data to display.")){
				Mainframe_GlobalFunctionLib.pressKey("F6");
				Mainframe_GlobalFunctionLib.sendText(13, 19, seq);
				Mainframe_GlobalFunctionLib.pressKey("Enter");
			}
			}
	}

	@Then("^Validate the new fields added  in \"([^\"]*)\"$")
	public void validate_the_new_fields_added_in(String arg1) throws Throwable {
		Mainframe_GlobalFunctionLib.pressKey("PageDown");
		//Mainframe_GlobalFunctionLib.validateText("6" , "2", "Exclude Claims");
		Mainframe_GlobalFunctionLib.validateText("7" , "4", "Level");
		Mainframe_GlobalFunctionLib.validateText("7" , "21", "Wildcard");
		
	}
	@Given("^I navigate to  Contingent Therapy Schedule Protocol Sequence Screen$")
	public void i_navigate_to_Contingent_Therapy_Schedule_Protocol_Sequence_Screen() throws Throwable {
	   
	
	}

	@When("^I navigate to second page in Contingent Therapy Schedule Protocol Sequence Screen\"$")
	public void i_navigate_to_second_page_in_Contingent_Therapy_Schedule_Protocol_Sequence_Screen() throws Throwable {
	   
	  
	}
	@Then("^Validate the title of the screen for both pages$")
	public void validate_the_title_of_the_screen_for_both_pages() throws Throwable {
	   Mainframe_GlobalFunctionLib.validateText("2", "17", "Contingent Therapy Sched Protocol Seq Page 2 of 2");
	   Mainframe_GlobalFunctionLib.pressKey("up");
	   Mainframe_GlobalFunctionLib.validateText("2", "17", "Contingent Therapy Sched Protocol Seq Page 1 of 2");
	   
	}

	@Then("^Validate the \"([^\"]*)\" and \"([^\"]*)\" fields  are moved to \"([^\"]*)\"$")
	public void validate_the_and_fields_are_moved_to(String field1, String field2, String Screen) throws Throwable {
		Mainframe_GlobalFunctionLib.validateText("6" , "002", field1);
		Mainframe_GlobalFunctionLib.validateText("5" , "002", field2);
		Mainframe_GlobalFunctionLib.validateText("2" , "017", Screen);
	    
	}
	@When("^Add PriorAuthorization to  member \"([^\"]*)\" with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void add_PriorAuthorization_to_member_with(String mem,String num, String ndclist, String type, String msc, String date1, String agt, String rsn) throws Throwable {
		String Date11=date1+"  ";
		//String memThruDate1=memThruDate+"  ";
		//String num="222225555";
		/*try {
			FunctionalLibrary.navigateToRxClaimPlanAdministrator();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		FunctionalLibrary.navigateToScreen("1");
		FunctionalLibrary.navigateToScreen("2");
		//if((FunctionalLibrary.func_SearchAndSelectADataEditMode("4,6" ,mem ,"10,6" , mem))){
		Mainframe_GlobalFunctionLib.sendText(4, 4,mem);
		Mainframe_GlobalFunctionLib.pressKey("Enter");	
		Thread.sleep(1000);
		Mainframe_GlobalFunctionLib.sendText(10, 2, "2");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.waitTillReady();
		Mainframe_GlobalFunctionLib.pressKey("F8");
			Mainframe_GlobalFunctionLib.sendText(4, 20, "9");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Thread.sleep(500);
			//if(!(FunctionalLibrary.func_SearchAndSelectADataEditMode("9,5" ,num ,"16,5" , num))){
				Mainframe_GlobalFunctionLib.pressKey("F6");	
				Mainframe_GlobalFunctionLib.pressKey("F6");	
				Mainframe_GlobalFunctionLib.sendText(16, 5, num);
				Mainframe_GlobalFunctionLib.sendText(16, 18, type);
				Mainframe_GlobalFunctionLib.sendText(16, 23, msc);
				Mainframe_GlobalFunctionLib.sendText(16, 26, ndclist);
				Mainframe_GlobalFunctionLib.sendText(16, 42, Date11);
				Mainframe_GlobalFunctionLib.sendText(16, 51, Date11);
				//Mainframe_GlobalFunctionLib.sendText(16, 51, date1);
				Mainframe_GlobalFunctionLib.sendText(16, 61, agt);
				Mainframe_GlobalFunctionLib.sendText(16, 66, rsn);
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				
		}
@Then("^I Validate the Plan Contingent Therapy as \"([^\"]*)\" and status  as \"([^\"]*)\"of the claim$")
	public void i_Validate_the_Plan_Contingent_Therapy_as_and_status_as_of_the_claim(String CT, String CS) throws Throwable {
		Mainframe_GlobalFunctionLib.sendText(04, 23, "8");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F9");
		Thread.sleep(1000);
		FunctionalLibrary.validateText("10" ,"079", CT);
		FunctionalLibrary.validateText("11" ,"079", CS);
		//Mainframe_GlobalFunctionLib.validateText("10" ,"079", CT);
	//	Mainframe_GlobalFunctionLib.validateText("11" ,"079", CS);
		
	}
	
	@When("^I create Active Contingent Therapy Schedule Protocol with \"([^\"]*)\" for \"([^\"]*)\" and having \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_create_Active_Contingent_Therapy_Schedule_Protocol_with_for_and_having(String seq,String Schedule1,String ndcList,String perioddays,String mindur,String Inccurcl,String exccl ,String level,String wildcard) throws Throwable {
		Mainframe_GlobalFunctionLib.sendText(4, 6, Schedule1);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Thread.sleep(2000);
		Thread.sleep(1000);
			Mainframe_GlobalFunctionLib.sendText("10","002", "7");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			/*Mainframe_GlobalFunctionLib.sendText("6", "004", "1");
			Mainframe_GlobalFunctionLib.pressKey("Enter");*/
		//	Mainframe_GlobalFunctionLib.waitTillReady();
			Thread.sleep(2000);
			//if(!(FunctionalLibrary.func_SearchAndSelectADataEditMode("6,4" ,seq ,"11,4" , seq))){
			Mainframe_GlobalFunctionLib.sendText(6, 4, seq);
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Thread.sleep(1000);
			if(!(Mainframe_GlobalFunctionLib.getText(24, 2).trim().equals("No data to display."))){
		
			if(!(Mainframe_GlobalFunctionLib.getText(6, 4).trim().equals(Mainframe_GlobalFunctionLib.getText(11, 4).trim()))){	
			    Mainframe_GlobalFunctionLib.pressKey("F6");
				Mainframe_GlobalFunctionLib.sendText(13, 19, seq);
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.waitTillReady();
				Mainframe_GlobalFunctionLib.click(5, 6 );
				Mainframe_GlobalFunctionLib.pressKey("F4");
				Thread.sleep(2000);
				kPress("F16");
				Mainframe_GlobalFunctionLib.waitTillReady();
				Mainframe_GlobalFunctionLib.sendText(4, 4, ndcList);
				/*Mainframe_GlobalFunctionLib.sendText(5, 12, ndc2);
				Mainframe_GlobalFunctionLib.sendText(5, 17, ndc3);*/
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.waitTillReady();	
				Mainframe_GlobalFunctionLib.sendText(9, 2, "1");
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.waitTillReady();
				Mainframe_GlobalFunctionLib.sendText(10, 15,"P");
				Mainframe_GlobalFunctionLib.sendText(11, 20, perioddays);
				Mainframe_GlobalFunctionLib.sendText(13, 19, mindur);
				Mainframe_GlobalFunctionLib.sendText(17, 15, "F");
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.pressKey("PageDown");
				Mainframe_GlobalFunctionLib.waitTillReady();
				Mainframe_GlobalFunctionLib.sendText(5, 24, Inccurcl);
				Mainframe_GlobalFunctionLib.sendText(6, 17, exccl);
				Mainframe_GlobalFunctionLib.sendText(7, 10, level);
				Mainframe_GlobalFunctionLib.sendText(7, 30, wildcard);
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				
				
			}
					else{
				System.out.println("Out of  create seq loop");
			}
			}
				
				else if(Mainframe_GlobalFunctionLib.getText(24, 2).trim().equals("No data to display.")){
					
					Mainframe_GlobalFunctionLib.pressKey("F6");
					Mainframe_GlobalFunctionLib.sendText(13, 19, seq);
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					Mainframe_GlobalFunctionLib.waitTillReady();
					Mainframe_GlobalFunctionLib.click(5, 6 );
					Mainframe_GlobalFunctionLib.pressKey("F4");
					Thread.sleep(2000);
					kPress("F16");
					Thread.sleep(2000);
					Mainframe_GlobalFunctionLib.waitTillReady();
					Mainframe_GlobalFunctionLib.sendText(4, 4, ndcList);
					/*Mainframe_GlobalFunctionLib.sendText(5, 12, ndc2);
					Mainframe_GlobalFunctionLib.sendText(5, 17, ndc3);*/
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					Mainframe_GlobalFunctionLib.waitTillReady();	
					Mainframe_GlobalFunctionLib.sendText(9, 2, "1");
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					Mainframe_GlobalFunctionLib.waitTillReady();
					Mainframe_GlobalFunctionLib.sendText(10, 15,"P");
					Mainframe_GlobalFunctionLib.sendText(11, 20, perioddays);
					Mainframe_GlobalFunctionLib.sendText(13, 19, mindur);
					Mainframe_GlobalFunctionLib.sendText(17, 15, "F");
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					Mainframe_GlobalFunctionLib.pressKey("PageDown");
					Mainframe_GlobalFunctionLib.waitTillReady();
					Mainframe_GlobalFunctionLib.sendText(5, 24, Inccurcl);
					Mainframe_GlobalFunctionLib.sendText(6, 17, exccl);
					Mainframe_GlobalFunctionLib.sendText(7, 10, level);
					Mainframe_GlobalFunctionLib.sendText(7, 30, wildcard);
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					
					
				}
				else{
					
				}
			}
			
				
	
	public static void kPress(String arg1) throws Throwable{
	Robot r=new Robot();
	if(arg1.equals("F1")){
		r.keyPress(KeyEvent.VK_F1);
		r.keyRelease(KeyEvent.VK_F1);
		Thread.sleep(3000);
	}
    if(arg1.equals("F21"))
    {
    r.keyPress(KeyEvent.VK_SHIFT);
    r.keyPress(KeyEvent.VK_F9);
    r.keyRelease(KeyEvent.VK_F9);
    r.keyRelease(KeyEvent.VK_SHIFT);
    Thread.sleep(3000);
    }
    else if(arg1.equals("F19"))
    {
           r.keyPress(KeyEvent.VK_SHIFT);
           r.keyPress(KeyEvent.VK_F7);
           r.keyRelease(KeyEvent.VK_F7);
           r.keyRelease(KeyEvent.VK_SHIFT);
           Thread.sleep(3000);
    }
    else if(arg1.equals("F16")){
    	  r.keyPress(KeyEvent.VK_SHIFT);
          r.keyPress(KeyEvent.VK_F4);
          r.keyRelease(KeyEvent.VK_F4);
          r.keyRelease(KeyEvent.VK_SHIFT);
          Thread.sleep(3000);
    }
	}
/*	public String func_GetCurrentMonth( )throws Throwable
	{
		try
		{


			Calendar calendar = Calendar.getInstance();

			return(String.format("%02d",calendar.get(Calendar.MONTH)+1));

		}
		catch(Throwable e)
		{
			//logInfo("<font size=2 face=Tahoma Color=Red>File Name:SAPDate,Error at Line Number: " + Thread.currentThread().getStackTrace()[2].getLineNumber()+"</font>");
			throw e;
		}
	}
	public String func_GetCurrentDay( )throws Throwable
	{
		try
		{


			Calendar calendar = Calendar.getInstance();

			return(String.format("%02d",calendar.get(Calendar.DATE)));

		}
		catch(Throwable e)
		{
			//logInfo("<font size=2 face=Tahoma Color=Red>File Name:SAPDate,Error at Line Number: " + Thread.currentThread().getStackTrace()[2].getLineNumber()+"</font>");
			throw e;
		}
	}

	public String func_GetCurrentYear( )throws Throwable
	{
		try

		{
			Calendar calendar = Calendar.getInstance();
			int iSAPDate=calendar.get(Calendar.YEAR);
			return (Integer.toString(iSAPDate));
		}
		catch(Throwable e)
		{
			//logInfo("<font size=2 face=Tahoma Color=Red>File Name:SAPDate,Error at Line Number: " + Thread.currentThread().getStackTrace()[2].getLineNumber()+"</font>");
			throw e;
		}
	}
	
	public String func_GetJulianDateFromCurrentDate() throws Throwable
	{

		int M=Integer.valueOf(func_GetCurrentMonth());
		int Y=Integer.valueOf(func_GetCurrentYear());
		int D=Integer.valueOf(func_GetCurrentDay());

		int M1 = (M-14)/12;
		int Y1 = Y + 4800 ;

		//Then the Julian date J is

		int J = 1451*(Y1+M1)/4 + 367*(M-2-12*M1)/12 - (3*((Y1+M1+100)/100))/4
		+ D - 32075  ;
		return Integer.toString(J);

	}
	public String func_GenerateRxNo()throws Throwable
	{

		long seconds = 1299671538L;
		Calendar currentDate = Calendar.getInstance();
		SimpleDateFormat formatter = new SimpleDateFormat("hmmss", Locale.getDefault());
		String dateString = formatter.format(currentDate.getTime());
		return (func_GetJulianDateFromCurrentDate()+dateString);

	}*/
	@Given("^I am on RxClaim Operations Menu$")
	public void i_am_on_RxClaim_Operations_Menu() throws Throwable {
		/*if(Mainframe_GlobalFunctionLib.getText(1, 19).trim().equals("RxClaim Batch Transaction Loads Menu")){
			Mainframe_GlobalFunctionLib.pressKey("F3");
		}*/
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.sendText(21,7,"21");
		Mainframe_GlobalFunctionLib.pressKey("Enter");		    
	}
	@When("^I create Contingent Therapy Schedule Batch Export file with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_create_Contingent_Therapy_Schedule_Batch_Export_file_with(String arg1, String arg2, String arg3, String arg4) throws Throwable {
		Mainframe_GlobalFunctionLib.sendText(7,13,arg1);
		Mainframe_GlobalFunctionLib.sendText(7,35,arg2);
		Mainframe_GlobalFunctionLib.sendText(10,13,arg3);
		Mainframe_GlobalFunctionLib.sendText(11,13,arg4);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("f6");	
		Mainframe_GlobalFunctionLib.pressKey("f3");
		Thread.sleep(1000);
		/*Mainframe_GlobalFunctionLib.sendText(21,7,"wrksplf");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		
		Mainframe_GlobalFunctionLib.pressKey("f18");
		Mainframe_GlobalFunctionLib.sendText(18,3,"5");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(3,22,"w20");
		Mainframe_GlobalFunctionLib.pressKey("Enter");*/
		//Mainframe_GlobalFunctionLib.pressKey("f3");
	}

	@Then("^Validate the Contingent Therapy Schedule Batch Export file export file with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
//	public void validate_the_Contingent_Therapy_Schedule_Batch_Export_file_export_file_with(String arg1, String arg2, String arg3, String arg4) throws Throwable {
	public void validate_the_Contingent_Therapy_Schedule_Batch_Export_file_export_file_with(String lib, String file, String lvl,String wildcard) throws Throwable {
	   String q1="addlible dbu10";
	   Mainframe_GlobalFunctionLib.sendText(21,7,q1);
	   Mainframe_GlobalFunctionLib.pressKey("Enter");
	   String q2="dbu "+lib+"/"+file;
	   Mainframe_GlobalFunctionLib.sendText(21,7,q2);
	   Mainframe_GlobalFunctionLib.pressKey("Enter");
	   Thread.sleep(1000);
	   Mainframe_GlobalFunctionLib.pressKey("F21");
	   //kPress("F21");
	   Thread.sleep(1000);
	   Mainframe_GlobalFunctionLib.sendText(6,16,"CHG");
	   Mainframe_GlobalFunctionLib.pressKey("Enter");
	   Thread.sleep(2000);	   
	   Mainframe_GlobalFunctionLib.sendText(6,16,"w360");
	   Thread.sleep(1000);
	   Mainframe_GlobalFunctionLib.pressKey("Enter");
	  String s= Mainframe_GlobalFunctionLib.getText(9, 13).trim().substring(0, 1);
	  String s1=Mainframe_GlobalFunctionLib.getText(9, 13).trim().substring(1, 2);
	  Mainframe_GlobalFunctionLib.pressKey("F3");
	  Mainframe_GlobalFunctionLib.pressKey("F3");
	 if(s1.equals(wildcard)){
		 System.out.println("Passed wildcard validation");
	 }
	 if(s.equals(lvl)){
		 System.out.println("Passed level validation");
		 }
	
	   
	   
	   
	}
	@When("^I create Contingent Therapy Schedule Batch load  with \"([^\"]*)\",\"([^\"]*)\"$")
	public void i_create_Contingent_Therapy_Schedule_Batch_load_with(String file, String lib) throws Throwable {
		 Mainframe_GlobalFunctionLib.sendText(5,20,file);
		 Mainframe_GlobalFunctionLib.sendText(6,20,lib);
		 Mainframe_GlobalFunctionLib.pressKey("Enter");
		 Mainframe_GlobalFunctionLib.pressKey("F6");
		 Mainframe_GlobalFunctionLib.sendText(21,7,"wrkjob PRUS/LDRCCTS");
		 Mainframe_GlobalFunctionLib.pressKey("Enter");
		 String status=Mainframe_GlobalFunctionLib.getText(8, 52).trim();
		 if(status.equals("JOBQ")){
			 String jobN=Mainframe_GlobalFunctionLib.getText(8,34);
			 Mainframe_GlobalFunctionLib.pressKey("F12");
			 Mainframe_GlobalFunctionLib.pressKey("F12");
		    	String qry1="CHGJOB";
		    	 Mainframe_GlobalFunctionLib.sendText(21,7,qry1);
		    	 Mainframe_GlobalFunctionLib.pressKey("F4");
		    	 Mainframe_GlobalFunctionLib.sendText(5,37,"LDRCCTS");
		    	 Mainframe_GlobalFunctionLib.sendText(6,39,"PRUS");
		    	 Mainframe_GlobalFunctionLib.sendText(7,39,jobN);
		    	 Mainframe_GlobalFunctionLib.pressKey("Enter");
		    	 Mainframe_GlobalFunctionLib.pressKey("F10");
		    	 Thread.sleep(1000);
		    	 Mainframe_GlobalFunctionLib.sendText(17, 37,"QPGMR");
		    	 Mainframe_GlobalFunctionLib.pressKey("Enter");
				  Thread.sleep(1000);
		 }
		 else{
			 Mainframe_GlobalFunctionLib.pressKey("F12");
		 }
			 
		 
	   
	}

	@Then("^Validate the Contingent Therapy Schedule is created with \"([^\"]*)\",\"([^\"]*)\"$")
	public void validate_the_Contingent_Therapy_Schedule_is_created_with(String sch, String seq) throws Throwable {
	   
		 Mainframe_GlobalFunctionLib.pressKey("F3");
		 Mainframe_GlobalFunctionLib.sendText(21,7,"20");
		 Mainframe_GlobalFunctionLib.pressKey("Enter");
		 Mainframe_GlobalFunctionLib.sendText(21,7,"4");
		 Mainframe_GlobalFunctionLib.pressKey("Enter");
		 Mainframe_GlobalFunctionLib.sendText(21,7,"3");
		 Mainframe_GlobalFunctionLib.pressKey("Enter");
		 Mainframe_GlobalFunctionLib.sendText(4,6,sch);
		 Mainframe_GlobalFunctionLib.pressKey("Enter");
		 
		 Thread.sleep(1000);
		 
		 if((Mainframe_GlobalFunctionLib.getText(4, 6).trim().equals(Mainframe_GlobalFunctionLib.getText(10, 6).trim()))){ 
			 Mainframe_GlobalFunctionLib.sendText("10","002", "7");
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				/*Mainframe_GlobalFunctionLib.sendText("6", "004", "1");
				Mainframe_GlobalFunctionLib.pressKey("Enter");*/
			//	Mainframe_GlobalFunctionLib.waitTillReady();
				Thread.sleep(2000);
				//if(!(FunctionalLibrary.func_SearchAndSelectADataEditMode("6,4" ,seq ,"11,4" , seq))){
				Mainframe_GlobalFunctionLib.sendText(6, 4, seq);
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Thread.sleep(1000);
				if(!(Mainframe_GlobalFunctionLib.getText(24, 2).trim().equals("No data to display."))){
			
				if((Mainframe_GlobalFunctionLib.getText(6, 4).trim().equals(Mainframe_GlobalFunctionLib.getText(11, 4).trim()))){	
		 
		 System.out.println("Passed");
		 
		 
	}


}
		 }
	}
	@Then("^I Validate the level field and its conditions with \"([^\"]*)\",\"([^\"]*)\"$")
	public void i_Validate_the_level_field_and_its_conditions_with(String GPI, String NDC) throws Throwable {
		 Mainframe_GlobalFunctionLib.pressKey("PageDown");
		 Thread.sleep(1000);
		 Mainframe_GlobalFunctionLib.click(7, 10);
		 Mainframe_GlobalFunctionLib.pressKey("f4");
		 Mainframe_GlobalFunctionLib.validateText("13","005",GPI);
		 Mainframe_GlobalFunctionLib.validateText("13","031","GPI");
		 Mainframe_GlobalFunctionLib.validateText("14","005",NDC);
		 Mainframe_GlobalFunctionLib.validateText("14","031","NDC");
		 //FunctionalLibrary.navigateToRxClaimPlanAdministrator();
		 }

	@Then("^I Validate the wildcard field and its conditions with the required options$")
	public void i_Validate_the_wildcard_field_and_its_conditions_with_the_required_options() throws Throwable {
		Mainframe_GlobalFunctionLib.pressKey("PageDown");
		 Thread.sleep(1000);
		 Mainframe_GlobalFunctionLib.click(7, 30);
		 Mainframe_GlobalFunctionLib.pressKey("f4");
		 Mainframe_GlobalFunctionLib.validateText("13","005","0");
		 Mainframe_GlobalFunctionLib.validateText("13","031","Zero");
		 Mainframe_GlobalFunctionLib.validateText("14","005","10");
		 Mainframe_GlobalFunctionLib.validateText("14","031","Ten");  
		 Mainframe_GlobalFunctionLib.validateText("15","005","12");
		 Mainframe_GlobalFunctionLib.validateText("15","031","Twelve");
		 Mainframe_GlobalFunctionLib.validateText("16","005","2");
		 Mainframe_GlobalFunctionLib.validateText("16","031","Two"); 
		 Mainframe_GlobalFunctionLib.validateText("17","005","4");
		 Mainframe_GlobalFunctionLib.validateText("17","031","Four");
		 Mainframe_GlobalFunctionLib.validateText("18","005","6");
		 Mainframe_GlobalFunctionLib.validateText("18","031","Six"); 
		 Mainframe_GlobalFunctionLib.validateText("19","005","8");
		 Mainframe_GlobalFunctionLib.validateText("19","031","Eight"); 
	}
	@Then("^I Validate \"([^\"]*)\" option for wildcard field help display$")
	public void i_Validate_option_for_wildcard_field_help_display(String arg1) throws Throwable {
		Mainframe_GlobalFunctionLib.click(7, 30);
		 Mainframe_GlobalFunctionLib.pressKey("F1");
		 Thread.sleep(1000);;
		 Mainframe_GlobalFunctionLib.validateText("11","019","Wildcard");
	}
	@Then("^I Validate \"([^\"]*)\" option for level field help display$")
	public void i_Validate_option_for_level_field_help_display(String arg1) throws Throwable {
		Mainframe_GlobalFunctionLib.click(7, 10);
		 Mainframe_GlobalFunctionLib.pressKey("F1");
		 Thread.sleep(1000);;
		 Mainframe_GlobalFunctionLib.validateText("11","013","Level");
	}
	@When("^I validate the error message for  Active Contingent Therapy Schedule Protocol with \"([^\"]*)\" for \"([^\"]*)\" and having \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_validate_the_error_message_for_Active_Contingent_Therapy_Schedule_Protocol_with_for_and_having(String seq,String Schedule1,String ndcList,String perioddays,String mindur,String Inccurcl,String exccl ,String level,String wildcard) throws Throwable {

		Mainframe_GlobalFunctionLib.sendText(4, 6, Schedule1);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Thread.sleep(2000);
		Thread.sleep(1000);
			Mainframe_GlobalFunctionLib.sendText("10","002", "7");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			/*Mainframe_GlobalFunctionLib.sendText("6", "004", "1");
			Mainframe_GlobalFunctionLib.pressKey("Enter");*/
		//	Mainframe_GlobalFunctionLib.waitTillReady();
			Thread.sleep(2000);
			//if(!(FunctionalLibrary.func_SearchAndSelectADataEditMode("6,4" ,seq ,"11,4" , seq))){
			Mainframe_GlobalFunctionLib.sendText(6, 4, seq);
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Thread.sleep(1000);
			if(!(Mainframe_GlobalFunctionLib.getText(24, 2).trim().equals("No data to display."))){
		
			if(!(Mainframe_GlobalFunctionLib.getText(6, 4).trim().equals(Mainframe_GlobalFunctionLib.getText(11, 4).trim()))){	
			    Mainframe_GlobalFunctionLib.pressKey("F6");
				Mainframe_GlobalFunctionLib.sendText(13, 19, seq);
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.waitTillReady();
				Mainframe_GlobalFunctionLib.click(5, 6 );
				Mainframe_GlobalFunctionLib.pressKey("F4");
				Thread.sleep(2000);
				kPress("F16");
				Mainframe_GlobalFunctionLib.waitTillReady();
				Mainframe_GlobalFunctionLib.sendText(4, 4, ndcList);
				/*Mainframe_GlobalFunctionLib.sendText(5, 12, ndc2);
				Mainframe_GlobalFunctionLib.sendText(5, 17, ndc3);*/
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.waitTillReady();	
				Mainframe_GlobalFunctionLib.sendText(9, 2, "1");
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.waitTillReady();
				Mainframe_GlobalFunctionLib.sendText(10, 15,"P");
				Mainframe_GlobalFunctionLib.sendText(11, 20, perioddays);
				Mainframe_GlobalFunctionLib.sendText(13, 19, mindur);
				Mainframe_GlobalFunctionLib.sendText(17, 15, "F");
				Thread.sleep(1000);
				Mainframe_GlobalFunctionLib.pressKey("PageDown");
				Thread.sleep(500);
				Mainframe_GlobalFunctionLib.sendText(5, 24, Inccurcl);
				Mainframe_GlobalFunctionLib.sendText(6, 17, exccl);
				Mainframe_GlobalFunctionLib.sendText(7, 10, level);
				Mainframe_GlobalFunctionLib.sendText(7, 30, wildcard);
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Thread.sleep(1000);
				
				Mainframe_GlobalFunctionLib.validateText("24", "002", "Value Required");
				
			}
					else{
				System.out.println("Out of  create seq loop");
			}
			}
				
				else if(Mainframe_GlobalFunctionLib.getText(24, 2).trim().equals("No data to display.")){
					
					Mainframe_GlobalFunctionLib.pressKey("F6");
					Mainframe_GlobalFunctionLib.sendText(13, 19, seq);
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					Mainframe_GlobalFunctionLib.waitTillReady();
					Mainframe_GlobalFunctionLib.click(5, 6 );
					Mainframe_GlobalFunctionLib.pressKey("F4");
					Thread.sleep(2000);
					kPress("F16");
					Thread.sleep(2000);
					Mainframe_GlobalFunctionLib.waitTillReady();
					Mainframe_GlobalFunctionLib.sendText(4, 4, ndcList);
					/*Mainframe_GlobalFunctionLib.sendText(5, 12, ndc2);
					Mainframe_GlobalFunctionLib.sendText(5, 17, ndc3);*/
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					Mainframe_GlobalFunctionLib.waitTillReady();	
					Mainframe_GlobalFunctionLib.sendText(9, 2, "1");
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					Mainframe_GlobalFunctionLib.waitTillReady();
					Mainframe_GlobalFunctionLib.sendText(10, 15,"P");
					Mainframe_GlobalFunctionLib.sendText(11, 20, perioddays);
					Mainframe_GlobalFunctionLib.sendText(13, 19, mindur);
					Mainframe_GlobalFunctionLib.sendText(17, 15, "F");
					//Mainframe_GlobalFunctionLib.pressKey("Enter");
					Mainframe_GlobalFunctionLib.pressKey("PageDown");
					Mainframe_GlobalFunctionLib.waitTillReady();
					Mainframe_GlobalFunctionLib.sendText(5, 24, Inccurcl);
					Mainframe_GlobalFunctionLib.sendText(6, 17, exccl);
					Mainframe_GlobalFunctionLib.sendText(7, 10, level);
					//Mainframe_GlobalFunctionLib.sendText(7, 30, wildcard);
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					Mainframe_GlobalFunctionLib.validateText("24", "002", "Value Required");
					
				}
				else{
					
				}
		
	

	
}

	@When("^I Validate  the error message Value required is displayed when level empty and Wildcard is entered with \"([^\"]*)\" for \"([^\"]*)\" and having \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
public void i_Validate_the_error_message_is_displayed_when_level_empty_and_Wildcard_is_entered_with_for_and_having(String seq,String Schedule1,String ndcList,String perioddays,String mindur,String Inccurcl,String exccl ,String level,String wildcard) throws Throwable {


	Mainframe_GlobalFunctionLib.sendText(4, 6, Schedule1);
	Mainframe_GlobalFunctionLib.pressKey("Enter");
	Thread.sleep(2000);
	Thread.sleep(1000);
		Mainframe_GlobalFunctionLib.sendText("10","002", "7");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		/*Mainframe_GlobalFunctionLib.sendText("6", "004", "1");
		Mainframe_GlobalFunctionLib.pressKey("Enter");*/
	//	Mainframe_GlobalFunctionLib.waitTillReady();
		Thread.sleep(2000);
		//if(!(FunctionalLibrary.func_SearchAndSelectADataEditMode("6,4" ,seq ,"11,4" , seq))){
		Mainframe_GlobalFunctionLib.sendText(6, 4, seq);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Thread.sleep(1000);
		if(!(Mainframe_GlobalFunctionLib.getText(24, 2).trim().equals("No data to display."))){
	
		if(!(Mainframe_GlobalFunctionLib.getText(6, 4).trim().equals(Mainframe_GlobalFunctionLib.getText(11, 4).trim()))){	
		    Mainframe_GlobalFunctionLib.pressKey("F6");
			Mainframe_GlobalFunctionLib.sendText(13, 19, seq);
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.waitTillReady();
			Mainframe_GlobalFunctionLib.click(5, 6 );
			Mainframe_GlobalFunctionLib.pressKey("F4");
			Thread.sleep(2000);
			kPress("F16");
			Mainframe_GlobalFunctionLib.waitTillReady();
			Mainframe_GlobalFunctionLib.sendText(4, 4, ndcList);
			/*Mainframe_GlobalFunctionLib.sendText(5, 12, ndc2);
			Mainframe_GlobalFunctionLib.sendText(5, 17, ndc3);*/
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.waitTillReady();	
			Mainframe_GlobalFunctionLib.sendText(9, 2, "1");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.waitTillReady();
			Mainframe_GlobalFunctionLib.sendText(10, 15,"P");
			Mainframe_GlobalFunctionLib.sendText(11, 20, perioddays);
			Mainframe_GlobalFunctionLib.sendText(13, 19, mindur);
			Mainframe_GlobalFunctionLib.sendText(17, 15, "F");
			Thread.sleep(1000);
			Mainframe_GlobalFunctionLib.pressKey("PageDown");
			Thread.sleep(500);
			Mainframe_GlobalFunctionLib.sendText(5, 24, Inccurcl);
			Mainframe_GlobalFunctionLib.sendText(6, 17, exccl);
			Mainframe_GlobalFunctionLib.sendText(7, 10, level);
			//Mainframe_GlobalFunctionLib.sendText(7, 30, wildcard);
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Thread.sleep(1000);
			
			Mainframe_GlobalFunctionLib.validateText("24", "002", "Value Required");
			
		}
				else{
			System.out.println("Out of  create seq loop");
		}
		}
			
			else if(Mainframe_GlobalFunctionLib.getText(24, 2).trim().equals("No data to display.")){
				
				Mainframe_GlobalFunctionLib.pressKey("F6");
				Mainframe_GlobalFunctionLib.sendText(13, 19, seq);
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.waitTillReady();
				Mainframe_GlobalFunctionLib.click(5, 6 );
				Mainframe_GlobalFunctionLib.pressKey("F4");
				Thread.sleep(2000);
				kPress("F16");
				Thread.sleep(2000);
				Mainframe_GlobalFunctionLib.waitTillReady();
				Mainframe_GlobalFunctionLib.sendText(4, 4, ndcList);
				/*Mainframe_GlobalFunctionLib.sendText(5, 12, ndc2);
				Mainframe_GlobalFunctionLib.sendText(5, 17, ndc3);*/
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.waitTillReady();	
				Mainframe_GlobalFunctionLib.sendText(9, 2, "1");
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.waitTillReady();
				Mainframe_GlobalFunctionLib.sendText(10, 15,"P");
				Mainframe_GlobalFunctionLib.sendText(11, 20, perioddays);
				Mainframe_GlobalFunctionLib.sendText(13, 19, mindur);
				Mainframe_GlobalFunctionLib.sendText(17, 15, "F");
				//Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.pressKey("PageDown");
				Mainframe_GlobalFunctionLib.waitTillReady();
				Mainframe_GlobalFunctionLib.sendText(5, 24, Inccurcl);
				Mainframe_GlobalFunctionLib.sendText(6, 17, exccl);
				//Mainframe_GlobalFunctionLib.sendText(7, 10, level);
				Mainframe_GlobalFunctionLib.sendText(7, 30, wildcard);
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.validateText("24", "002", "Value Required");
				
			}
			else{
				
			}
	




}
	@When("^I Validate  the error message is displayed when Exclude Claims is Blank or not S is entered with \"([^\"]*)\" for \"([^\"]*)\" and having \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
public void i_Validate_the_error_message_is_displayed_when_Exclude_Claims_is_Blank_or_not_S_is_entered_with_for_and_having(String seq,String Schedule1,String ndcList,String perioddays,String mindur,String Inccurcl,String exccl ,String level,String wildcard) throws Throwable {



	Mainframe_GlobalFunctionLib.sendText(4, 6, Schedule1);
	Mainframe_GlobalFunctionLib.pressKey("Enter");
	Thread.sleep(2000);
	Thread.sleep(1000);
		Mainframe_GlobalFunctionLib.sendText("10","002", "7");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		/*Mainframe_GlobalFunctionLib.sendText("6", "004", "1");
		Mainframe_GlobalFunctionLib.pressKey("Enter");*/
	//	Mainframe_GlobalFunctionLib.waitTillReady();
		Thread.sleep(2000);
		//if(!(FunctionalLibrary.func_SearchAndSelectADataEditMode("6,4" ,seq ,"11,4" , seq))){
		Mainframe_GlobalFunctionLib.sendText(6, 4, seq);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Thread.sleep(1000);
		if(!(Mainframe_GlobalFunctionLib.getText(24, 2).trim().equals("No data to display."))){
	
		if(!(Mainframe_GlobalFunctionLib.getText(6, 4).trim().equals(Mainframe_GlobalFunctionLib.getText(11, 4).trim()))){	
		    Mainframe_GlobalFunctionLib.pressKey("F6");
			Mainframe_GlobalFunctionLib.sendText(13, 19, seq);
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.waitTillReady();
			Mainframe_GlobalFunctionLib.click(5, 6 );
			Mainframe_GlobalFunctionLib.pressKey("F4");
			Thread.sleep(2000);
			kPress("F16");
			Mainframe_GlobalFunctionLib.waitTillReady();
			Mainframe_GlobalFunctionLib.sendText(4, 4, ndcList);
			/*Mainframe_GlobalFunctionLib.sendText(5, 12, ndc2);
			Mainframe_GlobalFunctionLib.sendText(5, 17, ndc3);*/
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.waitTillReady();	
			Mainframe_GlobalFunctionLib.sendText(9, 2, "1");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.waitTillReady();
			Mainframe_GlobalFunctionLib.sendText(10, 15,"P");
			Mainframe_GlobalFunctionLib.sendText(11, 20, perioddays);
			Mainframe_GlobalFunctionLib.sendText(13, 19, mindur);
			Mainframe_GlobalFunctionLib.sendText(17, 15, "F");
			Thread.sleep(1000);
			Mainframe_GlobalFunctionLib.pressKey("PageDown");
			Thread.sleep(500);
			Mainframe_GlobalFunctionLib.sendText(5, 24, Inccurcl);
			Mainframe_GlobalFunctionLib.sendText(6, 17, exccl);
			Mainframe_GlobalFunctionLib.sendText(7, 10, level);
			Mainframe_GlobalFunctionLib.sendText(7, 30, wildcard);
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Thread.sleep(1000);
			
			Mainframe_GlobalFunctionLib.validateText("24", "002", "Value Required");
			
		}
				else{
			System.out.println("Out of  create seq loop");
		}
		}
			
			else if(Mainframe_GlobalFunctionLib.getText(24, 2).trim().equals("No data to display.")){
				
				Mainframe_GlobalFunctionLib.pressKey("F6");
				Mainframe_GlobalFunctionLib.sendText(13, 19, seq);
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.waitTillReady();
				Mainframe_GlobalFunctionLib.click(5, 6 );
				Mainframe_GlobalFunctionLib.pressKey("F4");
				Thread.sleep(2000);
				kPress("F16");
				Thread.sleep(2000);
				Mainframe_GlobalFunctionLib.waitTillReady();
				Mainframe_GlobalFunctionLib.sendText(4, 4, ndcList);
				/*Mainframe_GlobalFunctionLib.sendText(5, 12, ndc2);
				Mainframe_GlobalFunctionLib.sendText(5, 17, ndc3);*/
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.waitTillReady();	
				Mainframe_GlobalFunctionLib.sendText(9, 2, "1");
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.waitTillReady();
				Mainframe_GlobalFunctionLib.sendText(10, 15,"P");
				Mainframe_GlobalFunctionLib.sendText(11, 20, perioddays);
				Mainframe_GlobalFunctionLib.sendText(13, 19, mindur);
				Mainframe_GlobalFunctionLib.sendText(17, 15, "F");
				//Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.pressKey("PageDown");
				Mainframe_GlobalFunctionLib.waitTillReady();
				Mainframe_GlobalFunctionLib.sendText(5, 24, Inccurcl);
				Mainframe_GlobalFunctionLib.sendText(6, 17, exccl);
				Mainframe_GlobalFunctionLib.sendText(7, 10, level);
				Mainframe_GlobalFunctionLib.sendText(7, 30, wildcard);
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.validateText("24", "002", "Level and Wildcard valid only for Exclude Claims S");
				
			}
			else{
				
			}
		
	
}
@When("^I Validate  the error message is displayed  when Level is entered and Exclude Claims is Blank or not S is entered with \"([^\"]*)\" for \"([^\"]*)\" and having \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
public void i_Validate_the_error_message_Value_required_is_displayed_when_Level_is_entered_and_Exclude_Claims_is_Blank_or_not_S_is_entered_with_for_and_having(String seq,String Schedule1,String ndcList,String perioddays,String mindur,String Inccurcl,String exccl ,String level,String wildcard) throws Throwable {
	Mainframe_GlobalFunctionLib.sendText(4, 6, Schedule1);
	Mainframe_GlobalFunctionLib.pressKey("Enter");
	Thread.sleep(2000);
	Thread.sleep(1000);
		Mainframe_GlobalFunctionLib.sendText("10","002", "7");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		/*Mainframe_GlobalFunctionLib.sendText("6", "004", "1");
		Mainframe_GlobalFunctionLib.pressKey("Enter");*/
	//	Mainframe_GlobalFunctionLib.waitTillReady();
		Thread.sleep(2000);
		//if(!(FunctionalLibrary.func_SearchAndSelectADataEditMode("6,4" ,seq ,"11,4" , seq))){
		Mainframe_GlobalFunctionLib.sendText(6, 4, seq);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Thread.sleep(1000);
		if(!(Mainframe_GlobalFunctionLib.getText(24, 2).trim().equals("No data to display."))){
	
		if(!(Mainframe_GlobalFunctionLib.getText(6, 4).trim().equals(Mainframe_GlobalFunctionLib.getText(11, 4).trim()))){	
		    Mainframe_GlobalFunctionLib.pressKey("F6");
			Mainframe_GlobalFunctionLib.sendText(13, 19, seq);
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.waitTillReady();
			Mainframe_GlobalFunctionLib.click(5, 6 );
			Mainframe_GlobalFunctionLib.pressKey("F4");
			Thread.sleep(2000);
			kPress("F16");
			Mainframe_GlobalFunctionLib.waitTillReady();
			Mainframe_GlobalFunctionLib.sendText(4, 4, ndcList);
			/*Mainframe_GlobalFunctionLib.sendText(5, 12, ndc2);
			Mainframe_GlobalFunctionLib.sendText(5, 17, ndc3);*/
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.waitTillReady();	
			Mainframe_GlobalFunctionLib.sendText(9, 2, "1");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.waitTillReady();
			Mainframe_GlobalFunctionLib.sendText(10, 15,"P");
			Mainframe_GlobalFunctionLib.sendText(11, 20, perioddays);
			Mainframe_GlobalFunctionLib.sendText(13, 19, mindur);
			Mainframe_GlobalFunctionLib.sendText(17, 15, "F");
			Thread.sleep(1000);
			Mainframe_GlobalFunctionLib.pressKey("PageDown");
			Thread.sleep(500);
			Mainframe_GlobalFunctionLib.sendText(5, 24, Inccurcl);
			//Mainframe_GlobalFunctionLib.sendText(6, 17, exccl);
			Mainframe_GlobalFunctionLib.sendText(7, 10, level);
			//Mainframe_GlobalFunctionLib.sendText(7, 30, wildcard);
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Thread.sleep(1000);
			
			Mainframe_GlobalFunctionLib.validateText("24", "002", "Level and Wildcard valid only for Exclude Claims S");
			
		}
				else{
			System.out.println("Out of  create seq loop");
		}
		}
			
			else if(Mainframe_GlobalFunctionLib.getText(24, 2).trim().equals("No data to display.")){
				
				Mainframe_GlobalFunctionLib.pressKey("F6");
				Mainframe_GlobalFunctionLib.sendText(13, 19, seq);
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.waitTillReady();
				Mainframe_GlobalFunctionLib.click(5, 6 );
				Mainframe_GlobalFunctionLib.pressKey("F4");
				Thread.sleep(2000);
				kPress("F16");
				Thread.sleep(2000);
				Mainframe_GlobalFunctionLib.waitTillReady();
				Mainframe_GlobalFunctionLib.sendText(4, 4, ndcList);
				/*Mainframe_GlobalFunctionLib.sendText(5, 12, ndc2);
				Mainframe_GlobalFunctionLib.sendText(5, 17, ndc3);*/
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.waitTillReady();	
				Mainframe_GlobalFunctionLib.sendText(9, 2, "1");
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.waitTillReady();
				Mainframe_GlobalFunctionLib.sendText(10, 15,"P");
				Mainframe_GlobalFunctionLib.sendText(11, 20, perioddays);
				Mainframe_GlobalFunctionLib.sendText(13, 19, mindur);
				Mainframe_GlobalFunctionLib.sendText(17, 15, "F");
				//Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.pressKey("PageDown");
				Mainframe_GlobalFunctionLib.waitTillReady();
				Mainframe_GlobalFunctionLib.sendText(5, 24, Inccurcl);
				//Mainframe_GlobalFunctionLib.sendText(6, 17, exccl);
				Mainframe_GlobalFunctionLib.sendText(7, 10, level);
				//Mainframe_GlobalFunctionLib.sendText(7, 30, wildcard);
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.validateText("24", "002", "Level and Wildcard valid only for Exclude Claims S");
				
			}
			else{
				
			}
    
}
@When("^I Validate  the error message Invalid Wildcard for selected Level is displayed when Level is NDC and Exclude Claims is Blank or not S is entered with \"([^\"]*)\" for \"([^\"]*)\" and having \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
public void i_Validate_the_error_message_Invalid_Wildcard_for_selected_Level_is_displayed_when_Level_is_NDC_and_Exclude_Claims_is_Blank_or_not_S_is_entered_with_for_and_having(String seq,String Schedule1,String ndcList,String perioddays,String mindur,String Inccurcl,String exccl ,String level,String wildcard) throws Throwable {

	Mainframe_GlobalFunctionLib.sendText(4, 6, Schedule1);
	Mainframe_GlobalFunctionLib.pressKey("Enter");
	Thread.sleep(2000);
	Thread.sleep(1000);
		Mainframe_GlobalFunctionLib.sendText("10","002", "7");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		/*Mainframe_GlobalFunctionLib.sendText("6", "004", "1");
		Mainframe_GlobalFunctionLib.pressKey("Enter");*/
	//	Mainframe_GlobalFunctionLib.waitTillReady();
		Thread.sleep(2000);
		//if(!(FunctionalLibrary.func_SearchAndSelectADataEditMode("6,4" ,seq ,"11,4" , seq))){
		Mainframe_GlobalFunctionLib.sendText(6, 4, seq);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Thread.sleep(1000);
		if(!(Mainframe_GlobalFunctionLib.getText(24, 2).trim().equals("No data to display."))){
	
		if(!(Mainframe_GlobalFunctionLib.getText(6, 4).trim().equals(Mainframe_GlobalFunctionLib.getText(11, 4).trim()))){	
		    Mainframe_GlobalFunctionLib.pressKey("F6");
			Mainframe_GlobalFunctionLib.sendText(13, 19, seq);
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.waitTillReady();
			Mainframe_GlobalFunctionLib.click(5, 6 );
			Mainframe_GlobalFunctionLib.pressKey("F4");
			Thread.sleep(2000);
			kPress("F16");
			Mainframe_GlobalFunctionLib.waitTillReady();
			Mainframe_GlobalFunctionLib.sendText(4, 4, ndcList);
			/*Mainframe_GlobalFunctionLib.sendText(5, 12, ndc2);
			Mainframe_GlobalFunctionLib.sendText(5, 17, ndc3);*/
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.waitTillReady();	
			Mainframe_GlobalFunctionLib.sendText(9, 2, "1");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.waitTillReady();
			Mainframe_GlobalFunctionLib.sendText(10, 15,"P");
			Mainframe_GlobalFunctionLib.sendText(11, 20, perioddays);
			Mainframe_GlobalFunctionLib.sendText(13, 19, mindur);
			Mainframe_GlobalFunctionLib.sendText(17, 15, "F");
			Thread.sleep(1000);
			Mainframe_GlobalFunctionLib.pressKey("PageDown");
			Thread.sleep(500);
			Mainframe_GlobalFunctionLib.sendText(5, 24, Inccurcl);
			Mainframe_GlobalFunctionLib.sendText(6, 17, exccl);
			Mainframe_GlobalFunctionLib.sendText(7, 10, level);
			Mainframe_GlobalFunctionLib.sendText(7, 30, wildcard);
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Thread.sleep(1000);
			
			Mainframe_GlobalFunctionLib.validateText("24", "002", "Invalid Wildcard for selected Level");
			
		}
				else{
			System.out.println("Out of  create seq loop");
		}
		}
			
			else if(Mainframe_GlobalFunctionLib.getText(24, 2).trim().equals("No data to display.")){
				
				Mainframe_GlobalFunctionLib.pressKey("F6");
				Mainframe_GlobalFunctionLib.sendText(13, 19, seq);
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.waitTillReady();
				Mainframe_GlobalFunctionLib.click(5, 6 );
				Mainframe_GlobalFunctionLib.pressKey("F4");
				Thread.sleep(2000);
				kPress("F16");
				Thread.sleep(2000);
				Mainframe_GlobalFunctionLib.waitTillReady();
				Mainframe_GlobalFunctionLib.sendText(4, 4, ndcList);
				/*Mainframe_GlobalFunctionLib.sendText(5, 12, ndc2);
				Mainframe_GlobalFunctionLib.sendText(5, 17, ndc3);*/
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.waitTillReady();	
				Mainframe_GlobalFunctionLib.sendText(9, 2, "1");
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.waitTillReady();
				Mainframe_GlobalFunctionLib.sendText(10, 15,"P");
				Mainframe_GlobalFunctionLib.sendText(11, 20, perioddays);
				Mainframe_GlobalFunctionLib.sendText(13, 19, mindur);
				Mainframe_GlobalFunctionLib.sendText(17, 15, "F");
				//Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.pressKey("PageDown");
				Mainframe_GlobalFunctionLib.waitTillReady();
				Mainframe_GlobalFunctionLib.sendText(5, 24, Inccurcl);
				Mainframe_GlobalFunctionLib.sendText(6, 17, exccl);
				Mainframe_GlobalFunctionLib.sendText(7, 10, level);
				Mainframe_GlobalFunctionLib.sendText(7, 30, wildcard);
				Mainframe_GlobalFunctionLib.pressKey("Enter");
				Mainframe_GlobalFunctionLib.validateText("24", "002", "Invalid Wildcard for selected Level");
				
			}
			else{
				
			}
    

}
//-----------drugfilealignment
@Then("^I Validate the new screen \"([^\"]*)\" is added$")
public void i_Validate_the_new_screen_is_added(String arg1) throws Throwable {
 // String s= Mainframe_GlobalFunctionLib.getText(10, 24).trim();
  Mainframe_GlobalFunctionLib.validateText("10", "24", "5.");
  Mainframe_GlobalFunctionLib.validateText("10", "27", arg1);
}
@Then("^I Validate the another screen \"([^\"]*)\" is added$")
public void i_Validate_the_another_screen_is_added(String arg1) throws Throwable {
	//String s= Mainframe_GlobalFunctionLib.getText(10, 24).trim();
	  Mainframe_GlobalFunctionLib.validateText("11", "24", "6.");
	  Mainframe_GlobalFunctionLib.validateText("11", "27", arg1);
    
}

@Then("^I Validate the another screen \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" is added$")
public void i_Validate_the_another_screen_is_added(String arg1, String arg2, String arg3, String arg4) throws Throwable {
	  Mainframe_GlobalFunctionLib.validateText("6", "24", "1.");
	  Mainframe_GlobalFunctionLib.validateText("6", "27", arg1);
	  Mainframe_GlobalFunctionLib.validateText("7", "24", "2.");
	  Mainframe_GlobalFunctionLib.validateText("7", "27", arg2);
	  Mainframe_GlobalFunctionLib.validateText("8", "24", "3.");
	  Mainframe_GlobalFunctionLib.validateText("8", "27", arg3);
	  Mainframe_GlobalFunctionLib.validateText("9", "24", "4.");
	  Mainframe_GlobalFunctionLib.validateText("9", "27", arg4);
}

@Then("^I Validate the new screen \"([^\"]*)\" on Lists menu$")
public void i_Validate_the_new_screen_on_Lists_menu(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    
}
public static boolean func_SearchAndSelectADataEditMode1(String RowColOfData,String Data,String StartRowColToSearch,String DataSearch)
{
StringTokenizer stData=new StringTokenizer(RowColOfData,",");
StringTokenizer stDataSearch=new StringTokenizer(StartRowColToSearch,",");
int row=Integer.valueOf(stDataSearch.nextToken());
String col=stDataSearch.nextToken();
boolean bRes=false;
try {
	Mainframe_GlobalFunctionLib.sendText(stData.nextToken(),stData.nextToken(), Data);
	Mainframe_GlobalFunctionLib.pressKey("Enter");
	Thread.sleep(2000);
} catch (Exception e1) {
// TODO Auto-generated catch block
e1.printStackTrace();
}	
//Loop:for(int i =row;i<=21;i++)
//{
System.out.println("check the row value"+row);
try {
if(Mainframe_GlobalFunctionLib.getText(row, Integer.parseInt(col)).trim().toLowerCase().contentEquals(DataSearch.trim().toLowerCase()))
{

bRes=true;
//func_SetValue(Integer.toString(i), "2", "2");
//Mainframe_GlobalFunctionLib.sendText(row, 2, "1");
//func_SetENTER();
//Mainframe_GlobalFunctionLib.pressKey("Enter");
//break Loop;
}

} catch (Exception e) {
//break Loop;
//}
}
return bRes;
}

public static void CreateTransaction1(String bin, String proc, String group, String pharmacyID, String rxNbr, String refill, String fillDate, String memberID, String productId, String dspQty, String ds, String psc, String cost) throws Throwable
{	
	try {
		FunctionalLibrary.navigateToRxClaimPlanAdministrator();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	FunctionalLibrary.navigateToScreen("3");
	FunctionalLibrary.navigateToScreen("2");
	FunctionalLibrary.navigateToScreen("1");
	
	if(!(func_SearchAndSelectADataEditMode1("4,4" ,memberID ,"9,4" , memberID))){
		
		Mainframe_GlobalFunctionLib.pressKey("F6");
		Thread.sleep(1000);
		Mainframe_GlobalFunctionLib.sendText(11, 14,bin );
		Mainframe_GlobalFunctionLib.sendText(11, 41,proc );
		Mainframe_GlobalFunctionLib.sendText(11, 59,group );
		Mainframe_GlobalFunctionLib.sendText(12, 14,pharmacyID );
		Mainframe_GlobalFunctionLib.sendText(12, 41,FunctionalLibrary.func_GenerateDynamicRxNo());
		Mainframe_GlobalFunctionLib.sendText(12, 59,refill );
		Mainframe_GlobalFunctionLib.sendText(14, 41,memberID );
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		//Mainframe_GlobalFunctionLib.click(7, 12 );
		//Mainframe_GlobalFunctionLib.pressKey("F4");
		//Thread.sleep(1000);
		//Mainframe_GlobalFunctionLib.sendText(3, 4, memberID);
		//Mainframe_GlobalFunctionLib.pressKey("Enter");
		//Mainframe_GlobalFunctionLib.sendText(8, 2,"1" );
		//Mainframe_GlobalFunctionLib.pressKey("Enter");
		//Mainframe_GlobalFunctionLib.sendText(4 , 65 ,"          ");
		Thread.sleep(1000);
		Mainframe_GlobalFunctionLib.sendText(4, 65, fillDate+"    ");			
		Mainframe_GlobalFunctionLib.sendText(11, 20,productId );
		Mainframe_GlobalFunctionLib.sendText(12, 11,dspQty );
		Mainframe_GlobalFunctionLib.sendText(12, 26,ds );
		Mainframe_GlobalFunctionLib.sendText(14, 6,psc );
		Mainframe_GlobalFunctionLib.sendText(10, 47,"         " );
		Mainframe_GlobalFunctionLib.sendText(10, 47,cost );
		
	}
	else{
		
	Mainframe_GlobalFunctionLib.sendText(9, 2,"1" );
	Mainframe_GlobalFunctionLib.pressKey("Enter");
	Thread.sleep(1000);
	Mainframe_GlobalFunctionLib.click(4, 29 );
		Mainframe_GlobalFunctionLib.sendText(4, 29, pharmacyID);
		///Thread.sleep(3000);
		Mainframe_GlobalFunctionLib.sendText(4 , 65 ,"          ");
		Mainframe_GlobalFunctionLib.sendText(4, 65, fillDate);
		Mainframe_GlobalFunctionLib.sendText(5,29, FunctionalLibrary.func_GenerateDynamicRxNo());
		Mainframe_GlobalFunctionLib.sendText(5, 47, refill);			
		//Mainframe_GlobalFunctionLib.click(7, 12 );
		Mainframe_GlobalFunctionLib.sendText(7, 12, memberID);
		//Mainframe_GlobalFunctionLib.pressKey("F4");
		//Mainframe_GlobalFunctionLib.sendText(3, 4, memberID);
		//Mainframe_GlobalFunctionLib.pressKey("Enter");         
		//Mainframe_GlobalFunctionLib.sendText(8, 2,"1" );
		//Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(11, 20,productId );
		Mainframe_GlobalFunctionLib.sendText(12, 11,"           " );
		Mainframe_GlobalFunctionLib.sendText(12, 11,dspQty );
		Mainframe_GlobalFunctionLib.sendText(12, 26,"   " );
		Mainframe_GlobalFunctionLib.sendText(12, 26,ds);
		Mainframe_GlobalFunctionLib.sendText(14, 6,psc );
		Mainframe_GlobalFunctionLib.sendText(10, 47,"         " );
		Mainframe_GlobalFunctionLib.sendText(10, 47,cost );
		//Mainframe_GlobalFunctionLib.pressKey("F6");
        
	}
	
		System.out.println("Claim is created");
		
	
	
	
	
}
@Then("^I submitt a claim with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
public void i_submitt_a_claim_with(String bin, String proc, String group, String pharmacyID, String rxNbr, String refill, String fillDate, String memberID, String productID, String dspQty, String ds, String psc, String cost) throws Throwable {
	CreateTransaction1(bin, proc, group, pharmacyID, rxNbr, refill, fillDate, memberID, productID, dspQty, ds, psc, cost);
    FunctionalLibrary.submitClaim();
  
}

/*public static void createACTSseq(String seq,String Schedule1) throws Throwable{
	//if((func_SearchAndSelectADataEditMode("4,6" ,Schedule1 ,"10,6" , Schedule1))){
	//	Thread.sleep(2000);
	Mainframe_GlobalFunctionLib.sendText(4, 6, Schedule1);
	Mainframe_GlobalFunctionLib.pressKey("Enter");
	Thread.sleep(2000);
		Mainframe_GlobalFunctionLib.sendText("10","002", "7");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText("6", "004", "1");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		if(!(FunctionalLibrary.func_SearchAndSelectADataEditMode("6,4" ,seq ,"11,4" , seq))){
			Mainframe_GlobalFunctionLib.pressKey("F6");
			Mainframe_GlobalFunctionLib.sendText(13, 19, seq);
			Mainframe_GlobalFunctionLib.pressKey("Enter");
		}
}*/
@Given("^I am on OptumRx RxClaim/RxServer Main Menu$")
public void i_am_on_OptumRx_RxClaim_RxServer_Main_Menu() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    
}




	}