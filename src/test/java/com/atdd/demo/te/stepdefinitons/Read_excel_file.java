package com.atdd.demo.te.stepdefinitons;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.gargoylesoftware.htmlunit.javascript.host.Iterator;

import cucumber.api.java.en.When;

public class Read_excel_file {

	   	
		public String screen;
		private String filePath = null;
		private String fileName = null;
		
		@When("^Read excel file \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
		public void read_excel_file(String filePath,String fileName,String sheetName) throws IOException{

	    //Create an object of File class to open xlsx file
        
	    File file =    new File(filePath+"\\"+fileName);

	    //Create an object of FileInputStream class to read excel file

	    FileInputStream inputStream = new FileInputStream(file);

	    Workbook Menupath = null;

	    //Find the file extension by splitting file name in substring  and getting only extension name

	    String fileExtensionName = fileName.substring(fileName.indexOf("."));

	    //Check condition if the file is xlsx file

	    if(fileExtensionName.equals(".xlsx")){

	    //If it is xlsx file then create object of XSSFWorkbook class

	    Menupath = new XSSFWorkbook(inputStream);

	    }

	    //Check condition if the file is xls file

	    else if(fileExtensionName.equals(".xls")){

	        //If it is xls file then create object of HSSFWorkbook class

	        Menupath = new HSSFWorkbook(inputStream);

	    }

	    //Read sheet inside the workbook by its name

	    Sheet Sheet1 = Menupath.getSheet(sheetName);

	        int count = Sheet1.getLastRowNum();  
		    for (int rowNumber = 1; rowNumber < count +1 ; rowNumber++) {
	        //Create a loop to print cell values in a row
		    	Row row = Sheet1.getRow(rowNumber);  
	        for (int columnNumber = 0; columnNumber <  1; columnNumber++) {
	            //Print Excel data in console
	        	Cell cell = row.getCell(columnNumber); 
	        	      	     	
	            if(cell != null) {
	                    String val = row.getCell(columnNumber).toString();
	                    HashMap<Integer, String> map = new HashMap<Integer, String>();
	                    map.put(rowNumber, val);  
	                    String screen = map.get(rowNumber);
	            	  	System.out.println(screen);
	            } 
	        }	

	        
	    	
	       } 

	    } 
		@When("^write excel file \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
		public void write_excel_file() throws IOException, InvalidFormatException{ 
	        //Create an object of File class to open xlsx file
try {
			FileInputStream fIPS= new FileInputStream("C:/Users/Agarg131/Desktop/Automation testing/ExcelGuru99Demo.xlsx"); //Read the spreadsheet that needs to be updated
	        XSSFWorkbook wb;
	        XSSFSheet Sheet1;
	             wb = new XSSFWorkbook(fIPS); //If there is already data in a workbook
	            Sheet1 = wb.getSheetAt(0);
	        
	        Cell cell = null;
	        int count = Sheet1.getLastRowNum();
	        for (int rowNumber =1; rowNumber < count +1; rowNumber ++) {
	              for(int cellNumber = 1; cellNumber <3; cellNumber++) {
	        	if(cell == null) {
	            	  cell = Sheet1.getRow(2).getCell(2,Row.CREATE_NULL_AS_BLANK);
	        	}
	        	cell.setCellValue("212");
	            fIPS.close();    
	        }
	        }
	        
	        FileOutputStream output_file =new FileOutputStream("C:/Users/Agarg131/Desktop/Automation testing/ExcelGuru99Demo.xlsx");//Open FileOutputStream to write updates
	        wb.write(output_file); //write changes
	        output_file.close();
} catch(NullPointerException e){
	
	e.printStackTrace();
}catch(IOException e) {
	e.printStackTrace();
}
	        //String filename = null;
/*	        
			File file = new File(filePath+"\\"+fileName);
            System.out.println("first");
	        //Create an object of FileInputStream class to read excel file

	        FileInputStream inputStream = new FileInputStream(file);

	        Workbook Menupath = WorkbookFactory.create(inputStream);
	        System.out.println("2");
	        //Find the file extension by splitting file name in substring  and getting only extension name

	        Sheet Sheet1 = Menupath.getSheet(sheetName);
	        System.out.println("6");
	     */       
	            /*
	            
	            int count = Sheet1.getLastRowNum();
	    	    for (int rowNumber = 1; rowNumber < count +1 ; rowNumber++) {
	            //Create a loop to print cell values in a row
	    	    	System.out.println("7");
	    	    	Row row = Sheet1.getRow(rowNumber);  
	            for (int columnNumber = 2; columnNumber <  3; columnNumber++) {
	                //Print Excel data in console
	            	System.out.println("9");
	            	Cell cell = row.getCell(rowNumber);
	            	System.out.println("10");
	            	      	     	

	                	System.out.println("11");
	                	  	//This data needs to be written (Object[])
	                        HashMap < Integer, String > data = new HashMap < Integer, String >();
	                        MenuPathFinder obj = new MenuPathFinder();
	                          
							//String x = obj.path;
	                        data.get(rowNumber);
	                        System.out.println(columnNumber);
	                        System.out.println(cell);
	                        System.out.println(rowNumber);
	                        if(cell.getStringCellValue()== null){
	                            cell.setCellValue("xxx");
	  	                      System.out.println("xxx");
	                        }
	                       // String x ="hkewhe";
	                        
	                      //  data.put(rowNumber, x);
	                       
	                      
	                
	            }	
	            
	        	

	            
	        } */
	 	  	   
	 	   
	    }
	    
}



