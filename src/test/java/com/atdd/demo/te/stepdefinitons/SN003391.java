	package com.atdd.demo.te.stepdefinitons;

	import com.optumrx.autofusion.core.te.util.Mainframe_GlobalFunctionLib;

	import cucumber.api.java.en.When;

	public class SN003391 {

		public String RxNumber =null;

		//#1-Carrier Id is part of the CAMS Carrier list -Menu Path – CCT600/9/6/1 - Carrier List
		@When("^I verify adding \"([^\"]*)\" into CAMS Carrier list$")
		public void i_verify_adding_into_CAMS_Carrier_list(String carrier) throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
		    Mainframe_GlobalFunctionLib.sendText(21, 7, "20");
		    Mainframe_GlobalFunctionLib.pressKey("Enter");
		    Mainframe_GlobalFunctionLib.sendText(21, 7, "9");
		    Mainframe_GlobalFunctionLib.pressKey("Enter");
		    Mainframe_GlobalFunctionLib.sendText(21, 7, "6");
		    Mainframe_GlobalFunctionLib.pressKey("Enter");
		    Mainframe_GlobalFunctionLib.sendText(21, 7, "1");
		    Mainframe_GlobalFunctionLib.pressKey("Enter");
		    Mainframe_GlobalFunctionLib.sendText(4, 5, carrier);
		    Mainframe_GlobalFunctionLib.pressKey("Enter");
		    String carrierList=Mainframe_GlobalFunctionLib.getText(10, 5);
		    if(carrierList.equals(carrier))
			    {
			    	System.out.println("Carrier already added in list"+carrier);
			    }
			    else
			    {
			    	Mainframe_GlobalFunctionLib.pressKey("F6");
			    	Mainframe_GlobalFunctionLib.sendText(11, 18, carrier);
			    	Mainframe_GlobalFunctionLib.sendText(12, 18, "Test Carrier");
			    	Mainframe_GlobalFunctionLib.pressKey("Enter");
			    }
			Mainframe_GlobalFunctionLib.pressKey("F3");
			Mainframe_GlobalFunctionLib.pressKey("F3");
		}
		
		//#2-Add Library 'DBU10' to library list
		@When("^I enter DBU \"([^\"]*)\" to library list$")
		public void i_enter_DBU_to_library_list(String Library) throws Throwable {
			 String addlibQuery="addlible"+" "+Library;
			 Mainframe_GlobalFunctionLib.sendText(21, 7,addlibQuery);
			 Mainframe_GlobalFunctionLib.pressKey("Enter");
			 Mainframe_GlobalFunctionLib.sendText(21, 7,"               ");
		}
		
		//#3-CAG details added to file ACMP240T file
		@When("^I enter cag details \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" into DBU$")
		public void i_enter_cag_details_into_DBU(String ACMPTable, String carrier, String account, String group)throws Throwable {
			Mainframe_GlobalFunctionLib.click(21, 7);
			String adddbuQuery="DBU"+" "+ACMPTable;
			Mainframe_GlobalFunctionLib.sendText(21, 7,adddbuQuery);
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(6, 16,"ADD");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.sendText(10, 29,carrier);
			Mainframe_GlobalFunctionLib.sendText(11, 29,account);
			Mainframe_GlobalFunctionLib.sendText(12, 29,group);
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Mainframe_GlobalFunctionLib.pressKey("F3");
			Mainframe_GlobalFunctionLib.sendText(8, 7,"1");
			Mainframe_GlobalFunctionLib.pressKey("Enter");
		}
		
		//#4-Menu Path – CCT600/1/2/option 2 on member/Attach Savings Account Schedule
		@When("^I verify \"([^\"]*)\",\"([^\"]*)\"and attach Savings Account Schedule$")
		public void i_verify_and_attach_Savings_Account_Schedule(String member, String plan) throws Throwable {
			Mainframe_GlobalFunctionLib.sendText(21, 7, "20");
		    Mainframe_GlobalFunctionLib.pressKey("Enter");
		    Mainframe_GlobalFunctionLib.sendText(21, 7, "1");
		    Mainframe_GlobalFunctionLib.pressKey("Enter");
		    Mainframe_GlobalFunctionLib.sendText(21, 7, "2");
		    Mainframe_GlobalFunctionLib.pressKey("Enter");
		    Mainframe_GlobalFunctionLib.sendText(4, 4, member);
		    Mainframe_GlobalFunctionLib.pressKey("Enter");
		    String SearchResultMem=Mainframe_GlobalFunctionLib.getText(10, 4);
		    if(SearchResultMem.equals(member))
			    {
			    	System.out.println("Member found in list "+member);
			    	Mainframe_GlobalFunctionLib.sendText(10, 2, "2");
				    Mainframe_GlobalFunctionLib.pressKey("Enter");
			    }
			    else
			    {
			    	System.out.println("Member ID:"+member+" not found in list");
			    	System.exit(0);
			    }
			    
		    String PlanSearch=Mainframe_GlobalFunctionLib.getText(5, 69);
		    if(PlanSearch.equals(plan))
			    {
			    	System.out.println("Plan "+plan+" added in member");
			    	Mainframe_GlobalFunctionLib.click(5, 69);
			    	Mainframe_GlobalFunctionLib.pressKey("F8");
			        Mainframe_GlobalFunctionLib.sendText(4, 20, "18");
				    Mainframe_GlobalFunctionLib.pressKey("Enter");
				    Mainframe_GlobalFunctionLib.sendText(4, 20, "1");
				    Mainframe_GlobalFunctionLib.pressKey("Enter");
				    Thread.sleep(3000);
				    //String FromDate=Mainframe_GlobalFunctionLib.getText(14, 7);
				   // String ThruDate=Mainframe_GlobalFunctionLib.getText(14, 17);
				    String Type=Mainframe_GlobalFunctionLib.getText(14, 28);
				    //System.out.println("Member Savings Account History exists: FromDate: "+FromDate+", ThruDate: "+ThruDate+", Type: "+Type);
				    System.out.println("Member Savings Account History exists: Type: "+Type);
				     }
		    else
			    {
			    	System.out.println("Plan "+plan+" not found in member");
			    }
		    Mainframe_GlobalFunctionLib.pressKey("F3");
		    Mainframe_GlobalFunctionLib.pressKey("F3");
		    Mainframe_GlobalFunctionLib.pressKey("F3");
		    Mainframe_GlobalFunctionLib.pressKey("F3");
		    Mainframe_GlobalFunctionLib.pressKey("F3");
		    Mainframe_GlobalFunctionLib.pressKey("F3");	
		}
		
		
		//#5-Submit Claim adjudicated for HRA amount
		@When("^I submit claim with \"([^\"]*)\" by updating \"([^\"]*)\"$")
		public void i_submit_claim_with_by_updating(String member, String RxNo) throws Throwable {
				    // Write code here that turns the phrase above into concrete actions
					Mainframe_GlobalFunctionLib.sendText(21, 7, "20");
				    Mainframe_GlobalFunctionLib.pressKey("Enter");
				    Mainframe_GlobalFunctionLib.sendText(21, 7, "3");
				    Mainframe_GlobalFunctionLib.pressKey("Enter");
				    Mainframe_GlobalFunctionLib.sendText(21, 7, "2");
				    Mainframe_GlobalFunctionLib.pressKey("Enter");
				    Mainframe_GlobalFunctionLib.sendText(21, 7, "1");
				    Mainframe_GlobalFunctionLib.pressKey("Enter");
				    Mainframe_GlobalFunctionLib.sendText(4, 4, member);
				    Mainframe_GlobalFunctionLib.pressKey("Enter");
				    String SearchResultMem=Mainframe_GlobalFunctionLib.getText(9, 4);
				    if(SearchResultMem.equals(member))
				    {
				    	System.out.println("Member found in list, Member-ID: "+member);
				    	Mainframe_GlobalFunctionLib.sendText(9, 2, "1");
					    Mainframe_GlobalFunctionLib.pressKey("Enter");
					    Mainframe_GlobalFunctionLib.sendText(5, 29, RxNo);
					    Mainframe_GlobalFunctionLib.pressKey("F18");
					    Thread.sleep(3000);
						    String Status=Mainframe_GlobalFunctionLib.getText(21, 6);
						    if(Status.equals("P"))
						    {
							    RxNumber=Mainframe_GlobalFunctionLib.getText(20, 12);
							    System.out.println("Claim Submitted and RxNumber Generated: "+RxNumber);
							    //return;
							    Mainframe_GlobalFunctionLib.pressKey("F3");
								Mainframe_GlobalFunctionLib.pressKey("F3");
								Mainframe_GlobalFunctionLib.pressKey("F3");
								
						    }
						    else
						    {
						    	String RejCode=Mainframe_GlobalFunctionLib.getText(21, 12);
							    System.out.println("Claim Rejected and Code is: "+RejCode);
							    System.exit(1);
						    }
						 
					  }
				    else
				    {
				    	System.out.println("Member ID:"+member+" not found in list");
				    	System.exit(0);
				    }
				}	
		
		//#6-Run SQL Query retrieve data from "<ACMP_Table>" for the "<carrier>"
		@When("^I run sql Query to retrieve data from \"([^\"]*)\" for the \"([^\"]*)\"$")
		public void i_run_sql_Query_to_retrieve_data_from_for_the(String ACMPTable, String carrier) throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			String strQuery="strsql";
			Mainframe_GlobalFunctionLib.sendText(21, 7,strQuery);
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Thread.sleep(3000);
			String GetDataQuery="select * from "+ACMPTable+" where carrier = '"+carrier+"'";
			Mainframe_GlobalFunctionLib.sendText(19, 7,GetDataQuery);
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Thread.sleep(3000);
			/*int i;
			for(i=5;	i<=20;	i++)
			{
				//Mainframe_GlobalFunctionLib.click(i, 7);
				String getdata=Mainframe_GlobalFunctionLib.getText(i, 7);
				System.out.println("data .....is...."+getdata);
				if(getdata.length()>0)
				{
					Thread.sleep(3000);
					System.out.println("data .....is...."+getdata);
					String GetDataQuery="select * from "+ACMPTable+" where carrier = '"+carrier+"'";
					Mainframe_GlobalFunctionLib.sendText(i, 7,GetDataQuery);
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					break;
				}
				else
				{
					System.out.println("Not able to hit Query.");
				}
				i++;*/
			}
			
		//#6-Run SQL Query delete data from "<ACMP_Table>" for the "<carrier>"
		@When("^I run sql Query to delete data from \"([^\"]*)\" for the \"([^\"]*)\"$")
		public void i_run_sql_Query_to_delete_data_from_for_the(String ACMPTable, String carrier) throws Throwable {
				    // Write code here that turns the phrase above into concrete actions
					String strQuery="strsql";
					Mainframe_GlobalFunctionLib.sendText(21, 7,strQuery);
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					Thread.sleep(3000);
					String GetDataQuery="delete from "+ACMPTable+" where carrier = '"+carrier+"'";
					Mainframe_GlobalFunctionLib.sendText(19, 7,GetDataQuery);
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					Thread.sleep(3000);
					Mainframe_GlobalFunctionLib.pressKey("F3");
					Mainframe_GlobalFunctionLib.sendText(5, 31,"2");
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					
				}
			
		//#7-verify the claims are added in the CAMS Dashboard		
		@When("^I submit query and verify  CAMS Dashboard \"([^\"]*)\"$")
		public void i_submit_query_and_verify_CAMS_Dashboard(String CAMSTable) throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			/*String strQuery="strsql";
			Mainframe_GlobalFunctionLib.sendText(21, 7,strQuery);
			Mainframe_GlobalFunctionLib.pressKey("Enter");*/
			
			Thread.sleep(3000);
			String CamsQuery="select * from "+CAMSTable+" where LGCLAIM# = '"+RxNumber+"'";
			Mainframe_GlobalFunctionLib.sendText(19, 7, CamsQuery);
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Thread.sleep(3000);
			
			/*int i;
			for( i=5; i<20; i++)
			{
				String QueryColum=Mainframe_GlobalFunctionLib.getText(i, 7);
				if(QueryColum.length()>0)
				{
					String CamsQuery="select * from "+CAMSTable+" where LGCLAIM# = '"+RxNumber+"'";
					Mainframe_GlobalFunctionLib.sendText(i, 7, CamsQuery);
					Mainframe_GlobalFunctionLib.pressKey("Enter");
					break;
				}
				else
				{
					System.out.println("Not able to hit Query.");
				}
				i++;
			}	*/
		}	
		
		// #7-verify the claims are added in the CAMS Dashboard after deletion
		@When("^I submit query after deletion and verify  CAMS Dashboard \"([^\"]*)\"$")
		public void i_submit_query_after_deletion_and_verify_CAMS_Dashboard(String CAMSTable) throws Throwable {
		    String strQuery="strsql";
			Mainframe_GlobalFunctionLib.sendText(21, 7,strQuery);
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Thread.sleep(3000);
			String CamsQuery="select * from "+CAMSTable+" where LGCLAIM# = '"+RxNumber+"'";
			Mainframe_GlobalFunctionLib.sendText(19, 7, CamsQuery);
			Mainframe_GlobalFunctionLib.pressKey("Enter");
			Thread.sleep(3000);
		}
		
		@When("^I verify \"([^\"]*)\" exists or not$")
		public void i_verify_exists_or_not(String carrier) throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
		   String Output=Mainframe_GlobalFunctionLib.getText(7, 2);
		   System.out.println("The CAG Details from the Table are: "+Output);
		   //String Output=Mainframe_GlobalFunctionLib.getText(7, 31);
		   
		   if(Output.contains(carrier))
			   {
				   System.out.println("Carrier found in Table: "+carrier);
				   Mainframe_GlobalFunctionLib.pressKey("F3");
			   }
			   else
			   {
				   System.out.println("Carrier not found in Table: "+carrier);
				   Mainframe_GlobalFunctionLib.pressKey("F3");
			   }
		 }
		
		
	}	
		
		
		
		




