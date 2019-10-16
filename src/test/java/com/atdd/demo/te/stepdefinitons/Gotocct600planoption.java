package com.atdd.demo.te.stepdefinitons;

import java.sql.SQLException;

import com.atdd.te.screenHelpers.FunctionalLibrary;
import com.hp.lft.report.ReportException;
import com.hp.lft.sdk.GeneralLeanFtException;
import com.optumrx.autofusion.core.te.util.Mainframe_GlobalFunctionLib;

public class Gotocct600planoption extends FunctionalLibrary {
	
	
	
	public static void Gotocct600planoption4 () throws ClassNotFoundException, GeneralLeanFtException, SQLException, ReportException, InterruptedException {
		
		try {
			navigateToRxClaimPlanAdministrator();
		} catch (Exception e) {
			e.printStackTrace();
		}

	Mainframe_GlobalFunctionLib.sendText(21, 7 ,"4" );
                
	}
}
	


