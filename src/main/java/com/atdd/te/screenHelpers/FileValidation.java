package com.atdd.te.screenHelpers;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Scanner;

import com.cucumber.listener.Reporter;
import com.opencsv.CSVReader;
import com.optumrx.autofusion.core.util.ReadPropertyFile;

public class FileValidation {
	private static Properties properties;
	ExcelWriter excelwrite = new ExcelWriter();
	static LinkedHashMap<String, List<Integer>> positionMap = new LinkedHashMap<>();
	//static final String CHF_ACTUAL_FILE = "C:/RxClaims/CHF/UHCCOMM20180903_RXCHF70CL.txt";
	//static final String CHF_EXPECTED_FILE = "C:/RxClaims/CHF/Expected CHF Data.csv";
	static String CHF_ACTUAL_FILE = "C:\\RxClaims\\CHF";
	static String CHF_EXPECTED_FILE = "C:\\RxClaims\\CHF";
	static final String OUTPUT_POSITION_FILE = System.getProperty("user.dir") + "\\src\\test\\resources\\te\\CHF\\CHF_FieldPositions.properties";
	
	
	public static void createReportTemplate() {
		String columnName;
		int i = 0;
		ExcelWriter.createWorkBookSheet("CHF File Comparison Result");
		ExcelWriter.createRow(0);
		for (Map.Entry<String, List<Integer>> entry : positionMap.entrySet()) {
			columnName = entry.getKey();
			ExcelWriter.setCellValue(i, columnName, true);
			i++;
		}
	}

	public static void compareFile(String actualFile, String expectedFile) throws IOException {
		String fieldName = null;
		String fieldValue = null;
		StringBuilder nLine = new StringBuilder();
		CHF_EXPECTED_FILE = CHF_EXPECTED_FILE +"\\"+expectedFile;
		System.out.println("CHF_EXPECTED_FILE :" +CHF_EXPECTED_FILE);
		CHF_ACTUAL_FILE= CHF_ACTUAL_FILE +"\\"+actualFile;
		System.out.println("CHF_ACTUAL_FILE :" + CHF_ACTUAL_FILE);
		positionMap = getPositionData(new File(OUTPUT_POSITION_FILE));		
		File file = new File(CHF_ACTUAL_FILE);
		//Reading CSV File generated from AS400 Database
		CSVReader csvReader = new CSVReader(new FileReader(CHF_EXPECTED_FILE));
		List<String[]> records = csvReader.readAll();
		Scanner sc = new Scanner(file);
		Boolean flag = true;
		int i = 0;
		createReportTemplate();
		while (sc.hasNextLine() && i < records.size()) {

			nLine.setLength(0);
			nLine.append(sc.nextLine());
			if (nLine.toString().startsWith("4")) {
				for (String[] row : records) {
					if (nLine.toString().substring(1056, 1071).trim().contentEquals(row[0].trim())) {
						System.out.println("Claim Number:"+row[0]+ " found.Matching the record in actual CHF file with expected file");
						ExcelWriter.createRow(i + 1);
						int j = 0;
						for (Map.Entry<String, List<Integer>> entry : positionMap.entrySet()) {
							fieldName = entry.getKey();
							fieldValue = nLine.toString()
									.substring(entry.getValue().get(0) - 1, entry.getValue().get(1) - 1).trim();
							String cell = row[j];
							if (fieldValue.trim().equalsIgnoreCase(cell.trim())) {
								System.out.println("Field:"+fieldName+" Actual Value:"+fieldValue.trim()+" Expected Value:"+cell.trim());
								System.out.println("Value Matched.");
								//Reporter.addStepLog("Field:"+fieldName+" Actual Value:"+fieldValue.trim()+" Expected Value:"+cell.trim()+" Value Matched.");
								
								flag = true;
								ExcelWriter.setCellValue(j, cell, flag);

							} else {
								System.out.println("Field:"+fieldName+" Actual Value:"+fieldValue.trim()+" Expected Value:"+cell.trim());
								System.out.println("Value Matched.");
								//Reporter.addStepLog("Field:"+fieldName+" Actual CHF File Value:"+fieldValue.trim()+" Expected Value:"+cell.trim()+" Value Not Matched.");
								
								flag = false;
								ExcelWriter.setCellValue(j, cell, flag);
							}
							j++;
						}
						break;
					}
				}
				i++;
			}}
		sc.close();
		ExcelWriter.closeWorkBook();

	}

	public static LinkedHashMap<String, List<Integer>> getPositionData(File fileName) throws FileNotFoundException {

		LinkedHashMap<String, List<Integer>> positionMap = new LinkedHashMap<>();
		List<Integer> position = null;
		Scanner sc = null;
		String nLine = null;
		String fieldName = null;
		sc = new Scanner(fileName);

		while (sc.hasNextLine()) {
			nLine = sc.nextLine();
			fieldName = nLine.split("=")[0];

			position = new ArrayList<Integer>();
			position.add(Integer.parseInt(nLine.split("=")[1].split(",")[0]));
			position.add(Integer.parseInt(nLine.split("=")[1].split(",")[1]));

			positionMap.put(fieldName, position);
		}
		sc.close();
		return positionMap;
	}

	public static void main(String args[]) throws IOException {
		String actualFileName="UHCCOMM20180903_RXCHF70CL.txt";
		String expectedFileName="Expected CHF Data.csv";
		compareFile(actualFileName, expectedFileName);
	}

}

