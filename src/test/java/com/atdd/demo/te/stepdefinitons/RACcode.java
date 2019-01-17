package com.atdd.demo.te.stepdefinitons;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.atdd.te.screenHelpers.*;
import com.optumrx.autofusion.core.te.util.Mainframe_GlobalFunctionLib;

import cucumber.api.java.en.Then;

public class RACcode {
	
	HSSFWorkbook workbook = new HSSFWorkbook();
    HSSFSheet sheet = workbook.createSheet("RACCode");
    
    int rowCount = 0;
	String outputfile=System.getProperty("user.dir")+"\\src\\test\\resources\\features\\RxClaim\\featureFiles\\RAC_Code\\RACCode"+ExcelWriter.GetCurrentTimeStamp().replace(":","_").replace(".","_")+".xls";
	
	static int a=0;
	static String Memidnew;

	@Then("^I enter \"([^\"]*)\" in Active/Eligible Member by ID screen  to extract data for \"([^\"]*)\" members$")
	public void i_enter_in_Active_Eligible_Member_by_ID_screen_to_extract_data_for_members(String Memid, String itr) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Memidnew=Memid;
		String Memincr;
		String Memstr=Memidnew.substring(0, 9);
		Memincr	=Memidnew.substring(9);
		//String Memstr=Memidnew.substring(0, 10);
		//Memincr	=Memidnew.substring(10);
		 Map < String, Object[] > empinfo = new TreeMap < String, Object[] >();
	      empinfo.put( "1", new Object[] {
	         "Member ID", "From1", "From2","From3","From4","From5","Thru1","Thru2","Thru3","Thru4","Thru5","Oplan1","Oplan2","Oplan3","Oplan4","Oplan5","Product1","Product2","Product3","Product4","Product5","Rider1","Rider2","Rider3","Rider4","Rider5", });
	      
	      
	int	Iterations=Integer.parseInt(itr);
		
		for(int num=0;num<Iterations;num++){
			Memincr	=Memidnew.substring(9);
			String	numberString = Integer.toString((Integer.parseInt(Memincr) + 1));
			if(num==0){
				Memidnew=Memstr+Memincr;
			}
			else{
				Memidnew=Memstr+numberString;
			}
		String[] from=new String[5];
		String[] thru=new String[5];
		String[] Oplan1=new String[5];
		String[] product=new String[5];
		String[] Rider=new String[5];
			
		Mainframe_GlobalFunctionLib.sendText(4, 4, Memidnew);
		Mainframe_GlobalFunctionLib.pressKey("Enter");
		//if(Mainframe_GlobalFunctionLib.getText(22, 45).equals("F8=All")){
		Mainframe_GlobalFunctionLib.pressKey("F8");
		
	  String getValue1=null;
	  try{
		  getValue1= Mainframe_GlobalFunctionLib.getText(10, 4);
					}catch(Exception e){
						getValue1="";
			}
	  
	  if(getValue1.equals(Memidnew)){
		  Mainframe_GlobalFunctionLib.sendText(10, 2, "5");
		  Mainframe_GlobalFunctionLib.pressKey("Enter");
		  Mainframe_GlobalFunctionLib.pressKey("F7");
		  	  
		  a=0;
		  String getValue=null;
		  for(int i=14;i<19;i++,a++){
			  try{
				  getValue= Mainframe_GlobalFunctionLib.getText(i, 4);
							}catch(Exception e){
								getValue="";
					}
			
			if(getValue != null && getValue !="" && !getValue.isEmpty()  && !getValue.trim().isEmpty()){
		 from[a]=Mainframe_GlobalFunctionLib.getText(i, 4).trim();
		   thru[a]=Mainframe_GlobalFunctionLib.getText(i, 13).trim();
		   Oplan1[a]=Mainframe_GlobalFunctionLib.getText(i, 22).trim();
		  product[a]=Mainframe_GlobalFunctionLib.getText(i, 62).trim();
		  Rider[a]=Mainframe_GlobalFunctionLib.getText(i, 70).trim();
		  }
			else{
				System.out.println("Empty");
				break;
			}
		  }	
		  FunctionalLibrary.pressKey("F8");
		  Mainframe_GlobalFunctionLib.pressKey("F3");
		  Mainframe_GlobalFunctionLib.pressKey("F3");
		  Mainframe_GlobalFunctionLib.pressKey("F12");
		  Mainframe_GlobalFunctionLib.pressKey("F12");
	
	      Set < String > keyid = empinfo.keySet();
	      int rowid = 0;
	      
	      for (String key : keyid) {
	         Row row = sheet.createRow(rowid);
	         Object [] objectArr = empinfo.get(key);
	         int cellid = 0;
	         
	         for (Object obj : objectArr){
	            Cell cell = row.createCell(cellid++);
	            cell.setCellValue((String)obj);
	         }
	      }
	 
	            Row row = sheet.createRow(++rowCount);
	             
	            int columnCount = 0;
	         Cell cell1=row.createCell(columnCount);
	         cell1.setCellValue(Memidnew);
	             
	            for (Object field : from) {
	            	
	                Cell cell = row.createCell(++columnCount);
	                if (field instanceof String) {
	                    cell.setCellValue((String) field);
	                } else if (field instanceof Integer) {
	                    cell.setCellValue((Integer) field);
	                }
	            }
	           // columnCount = 0;
	            for (Object field : thru) {
	                Cell cell = row.createCell(++columnCount);
	                if (field instanceof String) {
	                    cell.setCellValue((String) field);
	                } else if (field instanceof Integer) {
	                    cell.setCellValue((Integer) field);
	                }
	            }
	            
	            for (Object field : Oplan1) {
	                Cell cell = row.createCell(++columnCount);
	                if (field instanceof String) {
	                    cell.setCellValue((String) field);
	                } else if (field instanceof Integer) {
	                    cell.setCellValue((Integer) field);
	                }
	            }
	            
	            for (Object field : product) {
	                Cell cell = row.createCell(++columnCount);
	                if (field instanceof String) {
	                    cell.setCellValue((String) field);
	                } else if (field instanceof Integer) {
	                    cell.setCellValue((Integer) field);
	                }
	            }
	            
	            for (Object field : Rider) {
	                Cell cell = row.createCell(++columnCount);
	                if (field instanceof String) {
	                    cell.setCellValue((String) field);
	                } else if (field instanceof Integer) {
	                    cell.setCellValue((Integer) field);
	                }
	            }
	           
	            
	         //   try (FileOutputStream outputStream = new FileOutputStream("C:\\Users\\ymadhur1\\RACCode.xls")) {
	            try (FileOutputStream outputStream = new FileOutputStream(outputfile)){
	                workbook.write(outputStream);
	            }
	             
	        }
	  
	  else{
	  }
	  
	  
	  }
	}
}
	
	

