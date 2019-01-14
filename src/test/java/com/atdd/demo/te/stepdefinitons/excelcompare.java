package com.atdd.demo.te.stepdefinitons;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class excelcompare {
	static String   res;
	
	@Then("^result found$")
	public void result_found() throws Throwable {
	} 
	@When("^the user compares \"([^\"]*)\" with \"([^\"]*)\"$")
	public void the_user_compares_with(String Actualfile, String Expectedfile) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
			 try {
	            // get input excel files
				 String File1="C:\\Users\\ymadhur1\\"+Actualfile+".xls";
				 String File2="C:\\Users\\ymadhur1\\"+Expectedfile+".xls";
	            FileInputStream excellFile1 = new FileInputStream(new File(File1));
	            FileInputStream excellFile2 = new FileInputStream(new File(File2));

	            // Create Workbook instance holding reference to .xlsx file
	            HSSFWorkbook workbook1 = new HSSFWorkbook(excellFile1);
	            HSSFWorkbook workbook2 = new HSSFWorkbook(excellFile2);

	            // Get first/desired sheet from the workbook
	            HSSFSheet sheet1 = workbook1.getSheetAt(0);
	            HSSFSheet sheet2 = workbook2.getSheetAt(0);

	            // Compare sheets
	            if(compareTwoSheets(sheet1, sheet2)) {
	                System.out.println("\n\nThe two excel sheets are Equal");
	            } else {
	                System.out.println("\n\nThe two excel sheets are Not Equal");
	            }
	            
	        
	            
	            try (FileOutputStream outputStream = new FileOutputStream(File1)) {
	                workbook1.write(outputStream);
	            
	            //close files
	            excellFile1.close();
	            excellFile2.close();
	            }

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
			
	    
	}
	

	    
	    // Compare Two Sheets
	    public static boolean compareTwoSheets(HSSFSheet sheet1, HSSFSheet sheet2) {
	        int firstRow1 = sheet1.getFirstRowNum();
	        int lastRow1 = sheet1.getLastRowNum();
	        boolean equalSheets = true;
	        HSSFRow rowlabel = sheet1.getRow(firstRow1);
	       // Cell cell1=rowlabel.createCell(26);
  	         //cell1.setCellValue("Result");
	        for(int i=firstRow1; i <= lastRow1; i++) {
	            
	            System.out.println("\n\nComparing Row "+i);
	            
	            HSSFRow row1 = sheet1.getRow(i);
	            HSSFRow row2 = sheet2.getRow(i);
	            if(!compareTwoRows(row1, row2)) {
	                equalSheets = false;
	                System.out.println("Row "+i+" - Not Equal");
	             
	                Cell cell2=row1.createCell(26);
	   	         cell2.setCellValue(res);
	               // break;
	            } else {
	                System.out.println("Row "+i+" - Equal");
	                Cell cell3=row1.createCell(26);
	                cell3.setCellValue("Row "+i+" - Equal");
	            }
	        }
	        return equalSheets;
	       
            }
	    
	    public static boolean compareTwoRows(HSSFRow row1, HSSFRow row2) {
	        if((row1 == null) && (row2 == null)) {
	            return true;
	        } else if((row1 == null) || (row2 == null)) {
	            return false;
	        }
	        
	        int firstCell1 = row1.getFirstCellNum();
	        int lastCell1 = row1.getLastCellNum();
	        boolean equalRows = true;
	   
	        
	        // Compare all cells in a row
	        for(int i=firstCell1; i <= lastCell1; i++) {
	            HSSFCell cell1 = row1.getCell(i);
	            HSSFCell cell2 = row2.getCell(i);
	            if(!compareTwoCells(cell1, cell2)) {
	                equalRows = false;
	                System.err.println("Cell "+i+" - Not Equal");
	               res="Cell "+i+" - Not Equal";
	                break;
	            } else {
	                System.out.println("Cell "+i+" - Equal");
	            }
	        }
	        return equalRows;
	        
	       
	    }

	    // Compare Two Cells
	    public static boolean compareTwoCells(HSSFCell cell1, HSSFCell cell2) {
	        if((cell1 == null) && (cell2 == null)) {
	            return true;
	        } else if((cell1 == null) || (cell2 == null)) {
	            return false;
	        }
	        
	        boolean equalCells = false;
	        int type1 = cell1.getCellType();
	        int type2 = cell2.getCellType();
	        if (type1 == type2) {
	            if (cell1.getCellStyle().equals(cell2.getCellStyle())) {
	                // Compare cells based on its type
	                switch (cell1.getCellType()) {
	                case HSSFCell.CELL_TYPE_FORMULA:
	                    if (cell1.getCellFormula().equals(cell2.getCellFormula())) {
	                        equalCells = true;
	                    }
	                    break;
	                case HSSFCell.CELL_TYPE_NUMERIC:
	                    if (cell1.getNumericCellValue() == cell2
	                            .getNumericCellValue()) {
	                        equalCells = true;
	                    }
	                    break;
	                case HSSFCell.CELL_TYPE_STRING:
	                    if (cell1.getStringCellValue().equals(cell2
	                            .getStringCellValue())) {
	                        equalCells = true;
	                    }
	                    break;
	                case HSSFCell.CELL_TYPE_BLANK:
	                    if (cell2.getCellType() == HSSFCell.CELL_TYPE_BLANK) {
	                        equalCells = true;
	                    }
	                    break;
	                case HSSFCell.CELL_TYPE_BOOLEAN:
	                    if (cell1.getBooleanCellValue() == cell2
	                            .getBooleanCellValue()) {
	                        equalCells = true;
	                    }
	                    break;
	                case HSSFCell.CELL_TYPE_ERROR:
	                    if (cell1.getErrorCellValue() == cell2.getErrorCellValue()) {
	                        equalCells = true;
	                    }
	                    break;
	                default:
	                    if (cell1.getStringCellValue().equals(
	                            cell2.getStringCellValue())) {
	                        equalCells = true;
	                    }
	                    break;
	                }
	            } else {
	                return false;
	            }
	        } else {
	            return false;
	        }
	        return equalCells;
	    }
	
	}


