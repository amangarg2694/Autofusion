package com.atdd.te.screenHelpers;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Collection;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.Row;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExcelWriter {
	int rownum = 0;
	static HSSFSheet sheet1;
	static Row row ;
	static Cell cell ;
	Collection<File> files;
	static HSSFWorkbook workbook;
	static HSSFFont font ;
	static HSSFCellStyle style;
	static final String OUTPUT_RESULT_FILE = System.getProperty("user.dir")+"\\test-output\\CHFFileValidationReport"+GetCurrentTimeStamp().replace(":","_").replace(".","_")+".xls";

	static { 			
		workbook = new HSSFWorkbook();
		row = null;
		cell = null;
	}

	// Get current system time
	public static String GetCurrentTimeStamp() {
	    SimpleDateFormat sdfDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");// dd/MM/yyyy
	    Date now = new Date();
	    String strDate = sdfDate.format(now);
	    return strDate;
	}

	public static void createWorkBookSheet(String sheetName){			  
		sheet1 = workbook.createSheet(sheetName);
	}

	public static void createRow(int rowNumber){
		row = sheet1.createRow(rowNumber);
	}

	public static void setCellValue(int cellNum , String value , boolean status){	  
		int rowNo = row.getRowNum();		  
		cell = row.createCell(cellNum);  
		font = workbook.createFont();
		// Create a cell style for Headers
		if(rowNo == 0) {
			font.setFontHeightInPoints((short)10);
			font.setBoldweight(Font.BOLDWEIGHT_BOLD);
			font.setColor(HSSFColor.BLACK.index);
			style = workbook.createCellStyle();
			style.setFillForegroundColor(HSSFColor.GREY_25_PERCENT.index);
			style.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);
			style.setFont(font);			  
		}
		// Create a cell style for mismatched value
		else if(status){
			font.setColor(HSSFColor.BLACK.index);
			style = workbook.createCellStyle();
			style.setFont(font);
		}
		// Create a cell style for mismatched value
		else
		{
			font.setColor(HSSFColor.RED.index);
			style = workbook.createCellStyle();
			style.setFillForegroundColor(HSSFColor.YELLOW.index);
			style.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);
			style.setFont(font);
		}
		style.setBorderBottom(HSSFCellStyle.BORDER_THIN);
		style.setBorderTop(HSSFCellStyle.BORDER_THIN);
		style.setBorderRight(HSSFCellStyle.BORDER_THIN);
		style.setBorderLeft(HSSFCellStyle.BORDER_THIN);
		// assign the style to the cell
		cell.setCellStyle(style);
		cell.setCellValue(value); 

	}

	public static void closeWorkBook () throws IOException {
		File fileName = new File(OUTPUT_RESULT_FILE);
		FileOutputStream out = new FileOutputStream(fileName);
		workbook.write(out);			  
		out.close();
	}

}
