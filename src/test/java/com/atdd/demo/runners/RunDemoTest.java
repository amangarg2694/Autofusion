package com.atdd.demo.runners;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.atdd.te.screenHelpers.CommonHelper;
//import com.atdd.te.screenHelpers.CommonHelper;
import com.cucumber.listener.ExtentProperties;
import com.cucumber.listener.Reporter;
import com.hp.lft.sdk.SDK;
import com.optumrx.autofusion.core.te.util.Mainframe_GlobalFunctionLib;
import com.optumrx.autofusion.core.util.ReadPropertyFile;
import com.optumrx.autofusion.core.util.ReportHelper;



import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(format = { "pretty", "json:target/cucumber.json" },


<<<<<<< HEAD
		features = { "classpath:features/RxClaim/featureFiles/CHFValidation.feature" },
=======

<<<<<<< HEAD
		features = { "classpath:features/RxClaim/featureFiles/SR41709/SR41709_TC01-TC130.feature" },
=======
		features = { "classpath:features/RxClaim/featureFiles/CHFFileValidation.feature" },
>>>>>>> af5c398ad1a9fa9ec869dfe53476096bc1b855b4
>>>>>>> f0f2c4dc0e631436fb939c182ee20b42f31e3412

		plugin = { "rerun:target/rerun.txt", "com.cucumber.listener.ExtentCucumberFormatter:", "html:target/cucumber",
				"json:target/cucumber.json" },

		glue = { "com.atdd.demo.te" }/*,
		tags ={"@TC01_01,@TC01_02,@TC02,@TC03,@TC04,@TC05,@TC06,@TC07,@TC08,@TC09,@TC10"}*/
		
)
public class RunDemoTest extends AbstractTestNGCucumberTests { 

	 
	public static String reportname; 
 
 
 	@Parameters({ "configFile" , "scrOption" }) 
	@BeforeClass 
	public static void setup(String configFile , String scrOption) throws IOException { 

 
		System.out.println("The file  from testNG test  is " + configFile); 
		ExtentProperties extentProperties = ExtentProperties.INSTANCE; 
		extentProperties.setReportPath("output/MyReport.html");   		 
   		System.out.println("Starting @before clas"); 
   		ReadPropertyFile.setPropertyMap(System.getProperty("user.dir")+"//src//test//resources//features//RxClaim//OR");  		 
   		ReadPropertyFile.configFileReader(configFile); 
    	CommonHelper.ScreenshotOption = scrOption; 
   		CommonHelper.login(); 
    		 
 }	 

 

 
	@AfterClass 
	public static void teardown() throws Exception { 
 
 
 //		Mainframe_GlobalFunctionLib.closeTE(); 
		SDK.cleanup(); 
		 
 
 
		try { 
			Reporter.loadXMLConfig(new File("src/test/resources/extentConfig/extent-config.xml")); 
			Reporter.setSystemInfo("user", System.getProperty("user.name")); 
			Reporter.setSystemInfo("os", "Window OS"); 
			Reporter.setTestRunnerOutput("RxClaim Leanft Report"); 

 
		} 

 
		catch (Exception e) { 

 
 			System.out.println("The report could not be generated for this run"); 
		} 

 
 	} 

 
 	@AfterSuite 
 
 
	public static void parser() throws Exception { 

 
		// PageObjectBase.extentReportParser("output/"+reportname); 

 
		ReportHelper.createCucumberHTMLReport("target", "target//cucumber.json", "ATDD_LEANFT_DEMO"); 

 
	} 
 	 
 /*	public void testMain(Object[] args) throws Exception 
 	{ 
		Mainframe_GlobalFunctionLib.closeTE(); 
 	 
	}*/ 

 
 } 


