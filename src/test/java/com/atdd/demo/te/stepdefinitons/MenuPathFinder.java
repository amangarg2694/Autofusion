package com.atdd.demo.te.stepdefinitons;
import java.sql.SQLException;

import com.hp.lft.report.ReportException;
import com.hp.lft.sdk.GeneralLeanFtException;
import com.optumrx.autofusion.core.te.util.Mainframe_GlobalFunctionLib;

import cucumber.api.java.en.When;

public class MenuPathFinder {
       public String var = null;;
       public String path = null;
	private String screen = null;
	//String Username = "NSIN";
	//String Password ="Admin000";
	//String env = "SXCD1";
	   @When("^Go to menu path$")
	   public void go_to_menu_path()
			throws ClassNotFoundException, GeneralLeanFtException, SQLException, ReportException, InterruptedException {
		   Read_excel_file s = new Read_excel_file();
			screen = s.screen;
		Mainframe_GlobalFunctionLib.sendText(21, 7, "1");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(21, 7, "1");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.sendText(15, 30, "1");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F3");
		Mainframe_GlobalFunctionLib.sendText(21, 7, "5");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(21, 7, "96");
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.sendText(21, 7, "26");
		Mainframe_GlobalFunctionLib.pressKey("Enter");	
		Mainframe_GlobalFunctionLib.sendText(14, 36, screen);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		Mainframe_GlobalFunctionLib.pressKey("F6");
		
		if(Mainframe_GlobalFunctionLib.getText(19,21) != "Press F8 to see the result.") {
		  //TimeUnit s;
		  //WebDriverWait d = new WebDriverWait(driver, 20);
		  //d.withTimeout(60, s);
			Thread.sleep(6000);;
		} else {
			Mainframe_GlobalFunctionLib.pressKey("F8");
				}
		
					
		if(Mainframe_GlobalFunctionLib.getText(7, 3).contains("CCT600") || Mainframe_GlobalFunctionLib.getText(7,3).contains("CCT700") || Mainframe_GlobalFunctionLib.getText(7,3).contains("CCT800")) {
           
			 path = Mainframe_GlobalFunctionLib.getText(7, 3);
			
				}
		else if(Mainframe_GlobalFunctionLib.getText(8, 3).contains("CCT600") || Mainframe_GlobalFunctionLib.getText(8,3).contains("CCT700") || Mainframe_GlobalFunctionLib.getText(8,3).contains("CCT800")){
			 path = Mainframe_GlobalFunctionLib.getText(8, 3);
						
		}
		else if(Mainframe_GlobalFunctionLib.getText(9, 3) == "CCT600" || Mainframe_GlobalFunctionLib.getText(9,3) == "CCT700" || Mainframe_GlobalFunctionLib.getText(9,3) == "CCT800"){
			 path = Mainframe_GlobalFunctionLib.getText(9, 3);
						
		}
		else if(Mainframe_GlobalFunctionLib.getText(10, 3) == "CCT600" || Mainframe_GlobalFunctionLib.getText(10,3) == "CCT700" || Mainframe_GlobalFunctionLib.getText(10,3) == "CCT800"){
			 path = Mainframe_GlobalFunctionLib.getText(10, 3);
					
		}
		else if(Mainframe_GlobalFunctionLib.getText(11, 3) == "CCT600" || Mainframe_GlobalFunctionLib.getText(11,3) == "CCT700" || Mainframe_GlobalFunctionLib.getText(11,3) == "CCT800"){
			 path = Mainframe_GlobalFunctionLib.getText(11, 3);
						
		}
		else if(Mainframe_GlobalFunctionLib.getText(12, 3) == "CCT600" || Mainframe_GlobalFunctionLib.getText(12,3) == "CCT700" || Mainframe_GlobalFunctionLib.getText(12,3) == "CCT800"){
			 path = Mainframe_GlobalFunctionLib.getText(12, 3);
						
         }
		else if(Mainframe_GlobalFunctionLib.getText(13, 3) == "CCT600" || Mainframe_GlobalFunctionLib.getText(13,3) == "CCT700" || Mainframe_GlobalFunctionLib.getText(13,3) == "CCT800"){
			 path = Mainframe_GlobalFunctionLib.getText(13, 3);
						
         }
		else if(Mainframe_GlobalFunctionLib.getText(14, 3) == "CCT600" || Mainframe_GlobalFunctionLib.getText(14,3) == "CCT700" || Mainframe_GlobalFunctionLib.getText(14,3) == "CCT800"){
			 path = Mainframe_GlobalFunctionLib.getText(14, 3);
					
         }
		else if(Mainframe_GlobalFunctionLib.getText(15, 3) == "CCT600" || Mainframe_GlobalFunctionLib.getText(15,3) == "CCT700" || Mainframe_GlobalFunctionLib.getText(15,3) == "CCT800"){
			 path = Mainframe_GlobalFunctionLib.getText(15, 3);
						
         }
		else if(Mainframe_GlobalFunctionLib.getText(16, 3) == "CCT600" || Mainframe_GlobalFunctionLib.getText(16,3) == "CCT700" || Mainframe_GlobalFunctionLib.getText(16,3) == "CCT800"){
			 path = Mainframe_GlobalFunctionLib.getText(16, 3);
						
         }
		else if(Mainframe_GlobalFunctionLib.getText(17, 3) == "CCT600" || Mainframe_GlobalFunctionLib.getText(17,3) == "CCT700" || Mainframe_GlobalFunctionLib.getText(17,3) == "CCT800"){
			 path = Mainframe_GlobalFunctionLib.getText(17, 3);
						
         }
		else if(Mainframe_GlobalFunctionLib.getText(18, 3).contains("CCT600") || Mainframe_GlobalFunctionLib.getText(18,3) == "CCT700" || Mainframe_GlobalFunctionLib.getText(18,3) == "CCT800"){
			 path = Mainframe_GlobalFunctionLib.getText(18, 3);
					
         }
		else if(Mainframe_GlobalFunctionLib.getText(19, 3) == "CCT600" || Mainframe_GlobalFunctionLib.getText(19,3) == "CCT700" || Mainframe_GlobalFunctionLib.getText(19,3) == "CCT800"){
			 path = Mainframe_GlobalFunctionLib.getText(19, 3);
						
         }
		else if(Mainframe_GlobalFunctionLib.getText(20, 3) == "CCT600" || Mainframe_GlobalFunctionLib.getText(20,3) == "CCT700" || Mainframe_GlobalFunctionLib.getText(20,3) == "CCT800"){
			 path = Mainframe_GlobalFunctionLib.getText(20, 3);
						
         }
		else {
			System.out.println("No path found");
		}
		
		Mainframe_GlobalFunctionLib.pressKey("F7");
		while(Mainframe_GlobalFunctionLib.getText(20, 3)!= "  ") {
		if(Mainframe_GlobalFunctionLib.getText(7, 3) == "CCT600" || Mainframe_GlobalFunctionLib.getText(7,3) == "CCT700" || Mainframe_GlobalFunctionLib.getText(7,3) == "CCT800" ) {
	           
			 path = Mainframe_GlobalFunctionLib.getText(7, 3);
			
				}
		else if(Mainframe_GlobalFunctionLib.getText(8, 3) == "CCT600" || Mainframe_GlobalFunctionLib.getText(8,3) == "CCT700" || Mainframe_GlobalFunctionLib.getText(8,3) == "CCT800"){
			 path = Mainframe_GlobalFunctionLib.getText(8, 3);
						
		}
		else if(Mainframe_GlobalFunctionLib.getText(9, 3) == "CCT600" || Mainframe_GlobalFunctionLib.getText(9,3) == "CCT700" || Mainframe_GlobalFunctionLib.getText(9,3) == "CCT800"){
			 path = Mainframe_GlobalFunctionLib.getText(9, 3);
						
		}
		else if(Mainframe_GlobalFunctionLib.getText(10, 3) == "CCT600" || Mainframe_GlobalFunctionLib.getText(10,3) == "CCT700" || Mainframe_GlobalFunctionLib.getText(10,3) == "CCT800"){
			 path = Mainframe_GlobalFunctionLib.getText(10, 3);
					
		}
		else if(Mainframe_GlobalFunctionLib.getText(11, 3) == "CCT600" || Mainframe_GlobalFunctionLib.getText(11,3) == "CCT700" || Mainframe_GlobalFunctionLib.getText(11,3) == "CCT800"){
			 path = Mainframe_GlobalFunctionLib.getText(11, 3);
						
		}
		else if(Mainframe_GlobalFunctionLib.getText(12, 3) == "CCT600" || Mainframe_GlobalFunctionLib.getText(12,3) == "CCT700" || Mainframe_GlobalFunctionLib.getText(12,3) == "CCT800"){
			 path = Mainframe_GlobalFunctionLib.getText(12, 3);
						
         }
		else if(Mainframe_GlobalFunctionLib.getText(13, 3) == "CCT600" || Mainframe_GlobalFunctionLib.getText(13,3) == "CCT700" || Mainframe_GlobalFunctionLib.getText(13,3) == "CCT800"){
			 path = Mainframe_GlobalFunctionLib.getText(13, 3);
						
         }
		else if(Mainframe_GlobalFunctionLib.getText(14, 3) == "CCT600" || Mainframe_GlobalFunctionLib.getText(14,3) == "CCT700" || Mainframe_GlobalFunctionLib.getText(14,3) == "CCT800"){
			 path = Mainframe_GlobalFunctionLib.getText(14, 3);
					
         }
		else if(Mainframe_GlobalFunctionLib.getText(15, 3) == "CCT600" || Mainframe_GlobalFunctionLib.getText(15,3) == "CCT700" || Mainframe_GlobalFunctionLib.getText(15,3) == "CCT800"){
			 path = Mainframe_GlobalFunctionLib.getText(15, 3);
						
         }
		else if(Mainframe_GlobalFunctionLib.getText(16, 3) == "CCT600" || Mainframe_GlobalFunctionLib.getText(16,3) == "CCT700" || Mainframe_GlobalFunctionLib.getText(16,3) == "CCT800"){
			 path = Mainframe_GlobalFunctionLib.getText(16, 3);
						
         }
		else if(Mainframe_GlobalFunctionLib.getText(17, 3) == "CCT600" || Mainframe_GlobalFunctionLib.getText(17,3) == "CCT700" || Mainframe_GlobalFunctionLib.getText(17,3) == "CCT800"){
			 path = Mainframe_GlobalFunctionLib.getText(17, 3);
						
         }
		else if(Mainframe_GlobalFunctionLib.getText(18, 3) == "CCT600" || Mainframe_GlobalFunctionLib.getText(18,3) == "CCT700" || Mainframe_GlobalFunctionLib.getText(18,3) == "CCT800"){
			 path = Mainframe_GlobalFunctionLib.getText(18, 3);
					
         }
		else if(Mainframe_GlobalFunctionLib.getText(19, 3) == "CCT600" || Mainframe_GlobalFunctionLib.getText(19,3) == "CCT700" || Mainframe_GlobalFunctionLib.getText(19,3) == "CCT800"){
			 path = Mainframe_GlobalFunctionLib.getText(19, 3);
						
         }
		else if(Mainframe_GlobalFunctionLib.getText(20, 3) == "CCT600" || Mainframe_GlobalFunctionLib.getText(20,3) == "CCT700" || Mainframe_GlobalFunctionLib.getText(20,3) == "CCT800"){
			 path = Mainframe_GlobalFunctionLib.getText(20, 3);
						
         }
		else {
			System.out.println("No path found");
		}
		}
		
		
	}
	   
   
}