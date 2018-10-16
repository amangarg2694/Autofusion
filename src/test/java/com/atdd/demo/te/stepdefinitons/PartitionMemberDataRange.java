package com.atdd.demo.te.stepdefinitons;

import java.io.IOException;

import org.testng.Assert;

import com.atdd.te.screenHelpers.FunctionalLibrary;
import com.cucumber.listener.Reporter;
import com.optumrx.autofusion.core.te.util.Screenshot;

import cucumber.api.java.en.Then; 
import cucumber.api.java.en.When;
import cucumber.api.java.en.Given;
import cucumber.api.PendingException;
import com.optumrx.autofusion.core.te.util.Mainframe_GlobalFunctionLib;


public class PartitionMemberDataRange
{

public static void forValidatingPBTDaterange() throws IOException{
	try{
		FunctionalLibrary.enterText(9,2,"8");
		String PartMember = FunctionalLibrary.getText(4,17);
		FunctionalLibrary.pressEnter();
		FunctionalLibrary.pressKey("PageDown");
		FunctionalLibrary.pressKey("PageDown");
		FunctionalLibrary.pressKey("PageDown");
		FunctionalLibrary.pressKey("PageDown");
		FunctionalLibrary.pressKey("PageDown");
		FunctionalLibrary.pressKey("PageDown");
		FunctionalLibrary.pressKey("PageDown");
		FunctionalLibrary.pressKey("PageDown");
		FunctionalLibrary.pressKey("PageDown");
		FunctionalLibrary.pressKey("PageDown");
		
		if (PartMember.equals("PART000007"))
		{
			String Date1 = FunctionalLibrary.getText(17,41);
			int Value1=Integer.parseInt(Date1);
			int low= 1190000;
			int high=1190699;
			if (Value1 >= low && Value1 <=high)
			{
				System.out.println("The Value is in the range of PART000007" + "is" + " " + Value1);
			}			
		}
		else if (PartMember.equals("PART000008"))
		{
			String Date2 = FunctionalLibrary.getText(17,41);
			int Value2=Integer.parseInt(Date2);
			int low= 1190700;
			int high=1199999;
			if (Value2 >= low && Value2 <=high)
			{
				System.out.println("The Value is in the range of PART000008" + "is" + " " + Value2);
			}
		}
		else if (PartMember.equals("PART000009"))
		{
			String Date3 = FunctionalLibrary.getText(17,41);
			int Value3=Integer.parseInt(Date3);
			int low= 1200000;
			int high=1200699;
			if (Value3 >= low && Value3 <=high)
			{
				System.out.println("The Value is in the range of PART000009" + "is" + " " + Value3);
			}
		}
		else if (PartMember.equals("PART000010"))
		{
			String Date4 = FunctionalLibrary.getText(17,41);
			int Value4=Integer.parseInt(Date4);
			int low= 1200700;
			int high=1209999;
			if (Value4 >= low && Value4 <=high)
			{
				System.out.println("The Value is in the range of PART000010" + "is" + " " + Value4);
			}
		}
		else if (PartMember.equals("PART000011"))
		{
			String Date5 = FunctionalLibrary.getText(17,41);
			int Value5=Integer.parseInt(Date5);
			int low= 1210000;
			int high=1210499;
			if (Value5 >= low && Value5 <=high)
			{
				System.out.println("The Value is in the range of PART000011" + "is" + " " + Value5);
			}
		}
		else if (PartMember.equals("PART000012"))
		{
			String Date6 = FunctionalLibrary.getText(17,41);
			int Value6=Integer.parseInt(Date6);
			int low= 1210500;
			int high=1210899;
			if (Value6 >= low && Value6 <=high)
			{
				System.out.println("The Value is in the range of PART000012" + "is" + " " + Value6);
			}
		}
		else if (PartMember.equals("PART000013"))
		{
			String Date6 = FunctionalLibrary.getText(17,41);
			int Value6=Integer.parseInt(Date6);
			int low= 1210900;
			int high=1219999;
			if (Value6 >= low && Value6 <=high)
			{
				System.out.println("The Value is in the range of PART000013" + "is" + " " + Value6);
			}
		}
		else if (PartMember.equals("PART000014"))
		{
			String Date6 = FunctionalLibrary.getText(17,41);
			int Value6=Integer.parseInt(Date6);
			int low= 1220000;
			int high=1220499;
			if (Value6 >= low && Value6 <=high)
			{
				System.out.println("The Value is in the range of PART000014" + "is" + " " + Value6);
			}
		}
		else if (PartMember.equals("PART000015"))
		{
			String Date6 = FunctionalLibrary.getText(17,41);
			int Value6=Integer.parseInt(Date6);
			int low= 1220500;
			int high=1220899;
			if (Value6 >= low && Value6 <=high)
			{
				System.out.println("The Value is in the range of PART000015" + "is" + " " + Value6);
			}
		}
		else if (PartMember.equals("PART000016"))
		{
			String Date6 = FunctionalLibrary.getText(17,41);
			int Value6=Integer.parseInt(Date6);
			int low= 1220900;
			int high=1229999;
			if (Value6 >= low && Value6 <=high)
			{
				System.out.println("The Value is in the range of PART000016" + "is" + " " + Value6);
			}
		}
		else if (PartMember.equals("PART000017"))
		{
			String Date6 = FunctionalLibrary.getText(17,41);
			int Value6=Integer.parseInt(Date6);
			int low= 1230000;
			int high=1230499;
			if (Value6 >= low && Value6 <=high)
			{
				System.out.println("The Value is in the range of PART000017" + "is" + " " + Value6);
			}
		}
		else if (PartMember.equals("PART000018"))
		{
			String Date6 = FunctionalLibrary.getText(17,41);
			int Value6=Integer.parseInt(Date6);
			int low= 1230500;
			int high=1230899;
			if (Value6 >= low && Value6 <=high)
			{
				System.out.println("The Value is in the range of PART000018" + "is" + " " + Value6);
			}
		}
		else if (PartMember.equals("PART000019"))
		{
			String Date6 = FunctionalLibrary.getText(17,41);
			int Value6=Integer.parseInt(Date6);
			int low= 1230900;
			int high=9999999;
			if (Value6 >= low && Value6 <=high)
			{
				System.out.println("The Value is in the range of PART000019" + "is" + " " + Value6);
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

public static void forValidatingPY2Daterange() throws IOException{
	try{
		FunctionalLibrary.enterText(9,2,"8");
		String PartMember = FunctionalLibrary.getText(4,17);
		FunctionalLibrary.pressEnter();
		FunctionalLibrary.pressKey("PageDown");
		FunctionalLibrary.pressKey("PageDown");
		FunctionalLibrary.pressKey("PageDown");
		FunctionalLibrary.pressKey("PageDown");
		FunctionalLibrary.pressKey("PageDown");
		
		
		if (PartMember.equals("PART000007"))
		{
			String Date1 = FunctionalLibrary.getText(17,41);
			int Value1=Integer.parseInt(Date1);
			int low= 1190000;
			int high=1190699;
			if (Value1 >= low && Value1 <=high)
			{
				System.out.println("The Value is in the range of PART000007" + "is" + " " + Value1);
			}			
		}
		else if (PartMember.equals("PART000008"))
		{
			String Date2 = FunctionalLibrary.getText(17,41);
			int Value2=Integer.parseInt(Date2);
			int low= 1190700;
			int high=1199999;
			if (Value2 >= low && Value2 <=high)
			{
				System.out.println("The Value is in the range of PART000008" + "is" + " " + Value2);
			}
		}
		else if (PartMember.equals("PART000009"))
		{
			String Date3 = FunctionalLibrary.getText(17,41);
			int Value3=Integer.parseInt(Date3);
			int low= 1200000;
			int high=1200699;
			if (Value3 >= low && Value3 <=high)
			{
				System.out.println("The Value is in the range of PART000009" + "is" + " " + Value3);
			}
		}
		else if (PartMember.equals("PART000010"))
		{
			String Date4 = FunctionalLibrary.getText(17,41);
			int Value4=Integer.parseInt(Date4);
			int low= 1200700;
			int high=1209999;
			if (Value4 >= low && Value4 <=high)
			{
				System.out.println("The Value is in the range of PART000010" + "is" + " " + Value4);
			}
		}
		else if (PartMember.equals("PART000011"))
		{
			String Date5 = FunctionalLibrary.getText(17,41);
			int Value5=Integer.parseInt(Date5);
			int low= 1210000;
			int high=1210499;
			if (Value5 >= low && Value5 <=high)
			{
				System.out.println("The Value is in the range of PART000011" + "is" + " " + Value5);
			}
		}
		else if (PartMember.equals("PART000012"))
		{
			String Date6 = FunctionalLibrary.getText(17,41);
			int Value6=Integer.parseInt(Date6);
			int low= 1210500;
			int high=1210899;
			if (Value6 >= low && Value6 <=high)
			{
				System.out.println("The Value is in the range of PART000012" + " is " + " " + Value6);
			}
		}
		else if (PartMember.equals("PART000013"))
		{
			String Date6 = FunctionalLibrary.getText(17,41);
			int Value6=Integer.parseInt(Date6);
			int low= 1210900;
			int high=1219999;
			if (Value6 >= low && Value6 <=high)
			{
				System.out.println("The Value is in the range of PART000013" + " is " + " " + Value6);
			}
		}
		else if (PartMember.equals("PART000014"))
		{
			String Date6 = FunctionalLibrary.getText(17,41);
			int Value6=Integer.parseInt(Date6);
			int low= 1220000;
			int high=1220499;
			if (Value6 >= low && Value6 <=high)
			{
				System.out.println("The Value is in the range of PART000014" + " is " + " " + Value6);
			}
		}
		else if (PartMember.equals("PART000015"))
		{
			String Date6 = FunctionalLibrary.getText(17,41);
			int Value6=Integer.parseInt(Date6);
			int low= 1220500;
			int high=1220899;
			if (Value6 >= low && Value6 <=high)
			{
				System.out.println("The Value is in the range of PART000015" + " is " + " " + Value6);
			}
		}
		else if (PartMember.equals("PART000016"))
		{
			String Date6 = FunctionalLibrary.getText(17,41);
			int Value6=Integer.parseInt(Date6);
			int low= 1220900;
			int high=1229999;
			if (Value6 >= low && Value6 <=high)
			{
				System.out.println("The Value is in the range of PART000016" + " is " + " " + Value6);
			}
		}
		else if (PartMember.equals("PART000017"))
		{
			String Date6 = FunctionalLibrary.getText(17,41);
			int Value6=Integer.parseInt(Date6);
			int low= 1230000;
			int high=1230499;
			if (Value6 >= low && Value6 <=high)
			{
				System.out.println("The Value is in the range of PART000017" + " is " + " " + Value6);
			}
		}
		else if (PartMember.equals("PART000018"))
		{
			String Date6 = FunctionalLibrary.getText(17,41);
			int Value6=Integer.parseInt(Date6);
			int low= 1230500;
			int high=1230899;
			if (Value6 >= low && Value6 <=high)
			{
				System.out.println("The Value is in the range of PART000018" + " is " + " " + Value6);
			}
		}
		else if (PartMember.equals("PART000019"))
		{
			String Date6 = FunctionalLibrary.getText(17,41);
			int Value6=Integer.parseInt(Date6);
			int low= 1230900;
			int high=9999999;
			if (Value6 >= low && Value6 <=high)
			{
				System.out.println("The Value is in the range of PART000019" + "is" + " " + Value6);
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

	
public static void forValidatingPY4Daterange() throws IOException{
	try{
		FunctionalLibrary.enterText(9,2,"8");
		String PartMember = FunctionalLibrary.getText(4,17);
		FunctionalLibrary.pressEnter();
		FunctionalLibrary.pressKey("PageDown");
		FunctionalLibrary.pressKey("PageDown");
		FunctionalLibrary.pressKey("PageDown");
		FunctionalLibrary.pressKey("PageDown");
		
		if (PartMember.equals("PART000007"))
		{
			String Date1 = FunctionalLibrary.getText(9,41);
			int Value1=Integer.parseInt(Date1);
			int low= 1190000;
			int high=1199999;
			if (Value1 >= low && Value1 <=high)
			{
				System.out.println("The Value is in the range of PART000007" + "is" + " " + Value1);
			}			
		}
		else if (PartMember.equals("PART000008"))
		{
			String Date2 = FunctionalLibrary.getText(9,41);
			int Value2=Integer.parseInt(Date2);
			int low= 1200000;
			int high=1209999;
			if (Value2 >= low && Value2 <=high)
			{
				System.out.println("The Value is in the range of PART000008" + "is" + " " + Value2);
			}
		}
		else if (PartMember.equals("PART000009"))
		{
			String Date3 = FunctionalLibrary.getText(9,41);
			int Value3=Integer.parseInt(Date3);
			int low= 1210000;
			int high=1219999;
			if (Value3 >= low && Value3 <=high)
			{
				System.out.println("The Value is in the range of PART000009" + "is" + " " + Value3);
			}
		}
		else if (PartMember.equals("PART000010"))
		{
			String Date4 = FunctionalLibrary.getText(9,41);
			int Value4=Integer.parseInt(Date4);
			int low= 1220000;
			int high=1229999;
			if (Value4 >= low && Value4 <=high)
			{
				System.out.println("The Value is in the range of PART000010" + "is" + " " + Value4);
			}
		}
		else if (PartMember.equals("PART000011"))
		{
			String Date5 = FunctionalLibrary.getText(9,41);
			int Value5=Integer.parseInt(Date5);
			int low= 1230000;
			int high=9999999;
			if (Value5 >= low && Value5 <=high)
			{
				System.out.println("The Value is in the range of PART000011" + "is" + " " + Value5);
			}
		}
		else
		{
			System.out.println("Partition Not Found");
			
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

public static void forValidatingVCDDaterange() throws IOException{
	try{
		FunctionalLibrary.enterText(8,2,"8");
		String PartMember = FunctionalLibrary.getText(4,17);
		FunctionalLibrary.pressEnter();
		FunctionalLibrary.pressKey("PageDown");
		FunctionalLibrary.pressKey("PageDown");
		FunctionalLibrary.pressKey("PageDown");
		FunctionalLibrary.pressKey("PageDown");
		FunctionalLibrary.pressKey("PageDown");
		FunctionalLibrary.pressKey("PageDown");
		FunctionalLibrary.pressKey("PageDown");
		FunctionalLibrary.pressKey("PageDown");
		FunctionalLibrary.pressKey("PageDown");
		FunctionalLibrary.pressKey("PageDown");
		FunctionalLibrary.pressKey("PageDown");
		FunctionalLibrary.pressKey("PageDown");
		
		
		if (PartMember.equals("PART000007"))
		{
			String Date1 = FunctionalLibrary.getText(13,41);
			int Value1=Integer.parseInt(Date1);
			int low= 1190000;
			int high=1190499;
			if (Value1 >= low && Value1 <=high)
			{
				System.out.println("The Value is in the range of PART000007" + "is" + " " + Value1);
			}			
		}
		else if (PartMember.equals("PART000008"))
		{
			String Date2 = FunctionalLibrary.getText(13,41);
			int Value2=Integer.parseInt(Date2);
			int low= 1190500;
			int high=1190899;
			if (Value2 >= low && Value2 <=high)
			{
				System.out.println("The Value is in the range of PART000008" + "is" + " " + Value2);
			}
		}
		else if (PartMember.equals("PART000009"))
		{
			String Date3 = FunctionalLibrary.getText(13,41);
			int Value3=Integer.parseInt(Date3);
			int low= 1190900;
			int high=1199999;
			if (Value3 >= low && Value3 <=high)
			{
				System.out.println("The Value is in the range of PART000009" + "is" + " " + Value3);
			}
		}
		else if (PartMember.equals("PART000010"))
		{
			String Date4 = FunctionalLibrary.getText(13,41);
			int Value4=Integer.parseInt(Date4);
			int low= 1200000;
			int high=1200499;
			if (Value4 >= low && Value4 <=high)
			{
				System.out.println("The Value is in the range of PART000010" + "is" + " " + Value4);
			}
		}
		else if (PartMember.equals("PART000011"))
		{
			String Date5 = FunctionalLibrary.getText(13,41);
			int Value5=Integer.parseInt(Date5);
			int low= 1200500;
			int high=1200899;
			if (Value5 >= low && Value5 <=high)
			{
				System.out.println("The Value is in the range of PART000011" + "is" + " " + Value5);
			}
		}
		else if (PartMember.equals("PART000012"))
		{
			String Date6 = FunctionalLibrary.getText(13,41);
			int Value6=Integer.parseInt(Date6);
			int low= 1200900;
			int high=1200999;
			if (Value6 >= low && Value6 <=high)
			{
				System.out.println("The Value is in the range of PART000012" + " is " + " " + Value6);
			}
		}
		else if (PartMember.equals("PART000013"))
		{
			String Date6 = FunctionalLibrary.getText(13,41);
			int Value6=Integer.parseInt(Date6);
			int low= 1210000;
			int high=1210499;
			if (Value6 >= low && Value6 <=high)
			{
				System.out.println("The Value is in the range of PART000013" + " is " + " " + Value6);
			}
		}
		else if (PartMember.equals("PART000014"))
		{
			String Date6 = FunctionalLibrary.getText(13,41);
			int Value6=Integer.parseInt(Date6);
			int low= 1210500;
			int high=1210899;
			if (Value6 >= low && Value6 <=high)
			{
				System.out.println("The Value is in the range of PART000014" + " is " + " " + Value6);
			}
		}
		else if (PartMember.equals("PART000015"))
		{
			String Date6 = FunctionalLibrary.getText(13,41);
			int Value6=Integer.parseInt(Date6);
			int low= 1210900;
			int high=1219999;
			if (Value6 >= low && Value6 <=high)
			{
				System.out.println("The Value is in the range of PART000015" + " is " + " " + Value6);
			}
		}
		else if (PartMember.equals("PART000016"))
		{
			String Date6 = FunctionalLibrary.getText(13,41);
			int Value6=Integer.parseInt(Date6);
			int low= 1220000;
			int high=1220499;
			if (Value6 >= low && Value6 <=high)
			{
				System.out.println("The Value is in the range of PART000016" + " is " + " " + Value6);
			}
		}
		else if (PartMember.equals("PART000017"))
		{
			String Date6 = FunctionalLibrary.getText(13,41);
			int Value6=Integer.parseInt(Date6);
			int low= 1220500;
			int high=1220899;
			if (Value6 >= low && Value6 <=high)
			{
				System.out.println("The Value is in the range of PART000017" + " is " + " " + Value6);
			}
		}
		else if (PartMember.equals("PART000018"))
		{
			String Date6 = FunctionalLibrary.getText(13,41);
			int Value6=Integer.parseInt(Date6);
			int low= 1220900;
			int high=1229999;
			if (Value6 >= low && Value6 <=high)
			{
				System.out.println("The Value is in the range of PART000018" + " is " + " " + Value6);
			}
		}
		else if (PartMember.equals("PART000019"))
		{
			String Date6 = FunctionalLibrary.getText(13,41);
			int Value6=Integer.parseInt(Date6);
			int low= 1230000;
			int high=1230499;
			if (Value6 >= low && Value6 <=high)
			{
				System.out.println("The Value is in the range of PART000019" + " is " + " " + Value6);
			}
		}
		else if (PartMember.equals("PART000020"))
		{
			String Date6 = FunctionalLibrary.getText(13,41);
			int Value6=Integer.parseInt(Date6);
			int low= 1230500;
			int high=1230899;
			if (Value6 >= low && Value6 <=high)
			{
				System.out.println("The Value is in the range of PART000020" + " is " + " " + Value6);
			}
		}
		else if (PartMember.equals("PART000021"))
		{
			String Date6 = FunctionalLibrary.getText(13,41);
			int Value6=Integer.parseInt(Date6);
			int low= 1230900;
			int high=9999999;
			if (Value6 >= low && Value6 <=high)
			{
				System.out.println("The Value is in the range of PART000021" + " is " + " " + Value6);
			}
		}
		
		else
		{
			System.out.println("Partition Not Found");
			
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