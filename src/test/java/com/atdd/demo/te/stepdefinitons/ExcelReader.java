package com.atdd.demo.te.stepdefinitons;

import java.io.IOException;
import java.sql.SQLException;

import com.hp.lft.report.ReportException;
import com.hp.lft.sdk.GeneralLeanFtException;

public class ExcelReader {

	public static void main(String[] args) throws Exception {
		//Main function is calling readExcel function to read data from excel file
	     
	        
	    	//Prepare the path of excel file

	        String filePath = "C:/Users/Agarg131/Desktop/Automation testing";
	    	
	    	Read_excel_file objExcelFile = new Read_excel_file();
	    	
	    	System.out.println("Before");
	    	 //Call read file method of the class to read data
	    	objExcelFile.read_excel_file(filePath,"ExcelGuru99Demo.xlsx","Sheet1");
	    	System.out.println("After");
	     	CommonHelper2 a = new CommonHelper2();
	    	a.login();
	    	
	    	//MenuPathFinder obj = new MenuPathFinder();
	    	//obj.go_to_menu_path();
	    	
	    	//Call write file method of the class to write data
	    	objExcelFile.write_excel_file();    
	           

	    }

	

}
