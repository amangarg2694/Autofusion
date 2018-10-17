package com.atdd.demo.te.stepdefinitons;

import java.io.IOException;

import org.testng.Assert;

import com.atdd.te.screenHelpers.FunctionalLibrary;
import com.cucumber.listener.Reporter;
import com.optumrx.autofusion.core.te.util.Screenshot;

public class PartitionDateRangeforVCHandVSRFiles {
	
	//Code for Comparing the value is in Range or not
	public static void compareDate(String PartMember,int low,int high,int Value1) throws IOException
	{
		if (Value1 >= low && Value1 <=high)
		{
			System.out.println("The Value is in the range of" + PartMember + "is" + " " + Value1);
		}
	}	
	// Code for validating date range for VCH and VSR File
			public static void validateDateRange(String PartMember,String FN) throws IOException
			
			{			
				try{
					if (PartMember.equals("PART000001"))
					{
						int low= 0;
						int high=1199999;
						if (FN.equals("VCH"))
						{
						String Date1 = FunctionalLibrary.getText(9,41);
						int Value1=Integer.parseInt(Date1);
						PartitionDateRangeforVCHandVSRFiles.compareDate(PartMember,low,high,Value1);	
						}
						else if (FN.equals("VSR"))
						{
						String Date1 = FunctionalLibrary.getText(18,41);
						int Value1=Integer.parseInt(Date1);	
						PartitionDateRangeforVCHandVSRFiles.compareDate(PartMember,low,high,Value1);
						}
									
					}
					else if (PartMember.equals("PART000002"))
					{
						int low= 1200000;
						int high=1209999;
						if (FN.equals("VCH"))
						{
						String Date1 = FunctionalLibrary.getText(9,41);
						int Value1=Integer.parseInt(Date1);
						PartitionDateRangeforVCHandVSRFiles.compareDate(PartMember,low,high,Value1);	
						}
						else if (FN.equals("VSR"))
						{
						String Date1 = FunctionalLibrary.getText(18,41);
						int Value1=Integer.parseInt(Date1);	
						PartitionDateRangeforVCHandVSRFiles.compareDate(PartMember,low,high,Value1);
						}
					}
					else if (PartMember.equals("PART000003"))
					{
						int low= 1210000;
						int high=1219999;
						if (FN.equals("VCH"))
						{
						String Date1 = FunctionalLibrary.getText(9,41);
						int Value1=Integer.parseInt(Date1);
						PartitionDateRangeforVCHandVSRFiles.compareDate(PartMember,low,high,Value1);	
						}
						else if (FN.equals("VSR"))
						{
						String Date1 = FunctionalLibrary.getText(18,41);
						int Value1=Integer.parseInt(Date1);	
						PartitionDateRangeforVCHandVSRFiles.compareDate(PartMember,low,high,Value1);
						}
					}
					else if (PartMember.equals("PART000004"))
					{
						int low= 1220000;
						int high=1229999;
						if (FN.equals("VCH"))
						{
						String Date1 = FunctionalLibrary.getText(9,41);
						int Value1=Integer.parseInt(Date1);
						PartitionDateRangeforVCHandVSRFiles.compareDate(PartMember,low,high,Value1);	
						}
						else if (FN.equals("VSR"))
						{
						String Date1 = FunctionalLibrary.getText(18,41);
						int Value1=Integer.parseInt(Date1);	
						PartitionDateRangeforVCHandVSRFiles.compareDate(PartMember,low,high,Value1);
						}
					}
					else if (PartMember.equals("PART000005"))
					{
						int low= 1230000;
						int high=1239999;
						if (FN.equals("VCH"))
						{
						String Date1 = FunctionalLibrary.getText(9,41);
						int Value1=Integer.parseInt(Date1);
						PartitionDateRangeforVCHandVSRFiles.compareDate(PartMember,low,high,Value1);	
						}
						else if (FN.equals("VSR"))
						{
						String Date1 = FunctionalLibrary.getText(18,41);
						int Value1=Integer.parseInt(Date1);	
						PartitionDateRangeforVCHandVSRFiles.compareDate(PartMember,low,high,Value1);
						}
					}
					else if (PartMember.equals("PART000006"))
					{
						int low= 1240000;
						int high=9999999;
						if (FN.equals("VCH"))
						{
						String Date1 = FunctionalLibrary.getText(9,41);
						int Value1=Integer.parseInt(Date1);
						PartitionDateRangeforVCHandVSRFiles.compareDate(PartMember,low,high,Value1);	
						}
						else if (FN.equals("VSR"))
						{
						String Date1 = FunctionalLibrary.getText(18,41);
						int Value1=Integer.parseInt(Date1);	
						PartitionDateRangeforVCHandVSRFiles.compareDate(PartMember,low,high,Value1);
						}
					}
					
					else
					{
						System.out.println("Partition Not Found");
						Assert.fail();
						
					}
					FunctionalLibrary.pressKey("F3");
					FunctionalLibrary.pressKey("F3");
				}
				catch(Exception e)
						{	Reporter.addScreenCaptureFromPath(Screenshot.screenshot());
				e.printStackTrace();
					Assert.fail("Partition Not Found.Screenshot is captured");
						}
			}	
			
			
		

}
