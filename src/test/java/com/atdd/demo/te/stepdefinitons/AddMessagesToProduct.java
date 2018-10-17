package com.atdd.demo.te.stepdefinitons;

import java.io.IOException;

import org.testng.Assert;

import com.atdd.te.screenHelpers.FunctionalLibrary;
import com.cucumber.listener.Reporter;
import com.optumrx.autofusion.core.te.util.Mainframe_GlobalFunctionLib;
import com.optumrx.autofusion.core.te.util.Screenshot;

public class AddMessagesToProduct {
	// Code for Adding Messages to Product
		public static void addMessagesProduct(String ProductID,String FromDate,String ThruDate,String Carrier,String MessageCode,String Seqno,String MessageType) throws IOException
		
		{			
			try {
				FunctionalLibrary.navigateToRxClaimPlanAdministrator();
			} catch (Exception e) {
				e.printStackTrace();
			}
			try{
						FunctionalLibrary.enterText(21, 7, "2" );
						FunctionalLibrary.pressKey("Enter");
						FunctionalLibrary.enterText(21, 7, "1" );
						FunctionalLibrary.pressKey("Enter");
						FunctionalLibrary.pressKey("F15");
						FunctionalLibrary.enterText(4, 5, ProductID );
						FunctionalLibrary.pressKey("Enter");
						String ProdId = FunctionalLibrary.getText(11, 5);
						String ProdctId = ProdId.replace("-","");
						if (ProductID.equals(ProdctId))
						{
						//FunctionalLibrary.validateText("11" ,"5" , ProdctId );
						FunctionalLibrary.enterText(11, 2, "16" );
						FunctionalLibrary.pressKey("Enter");
						FunctionalLibrary.pressKey("F6");
						FunctionalLibrary.enterText(11, 17, FromDate );
						FunctionalLibrary.enterText(12, 17, ThruDate );
						Mainframe_GlobalFunctionLib.click(13, 17 );
						Mainframe_GlobalFunctionLib.pressKey("F4");	
						FunctionalLibrary.enterText(4, 6, Carrier );
						FunctionalLibrary.pressKey("Enter");
						FunctionalLibrary.validateText("9" ,"6" , Carrier );
						FunctionalLibrary.enterText(9, 2, "1" );
						FunctionalLibrary.pressKey("Enter");
						Mainframe_GlobalFunctionLib.click(15, 17 );
						Mainframe_GlobalFunctionLib.pressKey("F4");
						FunctionalLibrary.enterText(3, 6, MessageCode );
						FunctionalLibrary.pressKey("Enter");
						FunctionalLibrary.validateText("7" ,"5" , MessageCode );
						FunctionalLibrary.enterText(7, 2, "1" );
						FunctionalLibrary.pressKey("Enter");
						FunctionalLibrary.enterText(16, 17, Seqno );
						Mainframe_GlobalFunctionLib.click(17, 17 );
						Mainframe_GlobalFunctionLib.pressKey("F4");	
						FunctionalLibrary.enterText(7, 4, MessageType );
						FunctionalLibrary.pressKey("Enter");
						FunctionalLibrary.validateText("13" ,"5" , MessageType );
						FunctionalLibrary.enterText(13, 3, "X" );
						FunctionalLibrary.pressKey("Enter");
						FunctionalLibrary.pressKey("Enter");
						FunctionalLibrary.enterText(24, 73, "Y" );
						}
						else
						{
							System.out.println("Product Id is not found");
						}
											
				}
			catch(Exception e)
					{	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
			e.printStackTrace();
				Assert.fail("Message is not added to the Product.Screenshot is captured");
					}
		}	

}
