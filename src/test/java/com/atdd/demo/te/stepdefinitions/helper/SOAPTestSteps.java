package com.atdd.demo.te.stepdefinitions.helper;


import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import javax.xml.soap.SOAPMessage;

import org.testng.Assert;

import com.atdd.te.screenHelpers.FunctionalLibrary;
import com.cucumber.listener.Reporter;
import com.optumrx.autofusion.core.api.util.PatternMatcher;
import com.optumrx.autofusion.core.util.ReadPropertyFile;
import com.optumrx.autofusion.core.util.SOAPHelper;
import com.optumrx.autofusion.core.util.XMLHelper;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SOAPTestSteps {
	String endPoint_API = null;
	String expectedResponseFolder = "src/test/resources/api/testdata/input/Expected Response/";
	String outputDataFolder = "src/test/resources/api/testdata/output/";
	String inputDataFolder = "src/test/resources/api/testdata/input/Request XML/";

	HashMap<String, String> headerParameters = new HashMap<String, String>();

	XMLHelper xmlHelper = new XMLHelper();

	SOAPHelper soapHelper = new SOAPHelper();

	/**
	 * Execute soap request verify response.
	 *
	 * @throws Exception
	 *             the exception
	 */
	

	@Given("^the API running at \"([^\"]*)\"$")
	public void the_API_running_at(String endPoint) throws Throwable {
	   endPoint_API = endPoint;
	}

	@When("^I send the GET request \"([^\"]*)\" with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" and save the response to \"([^\"]*)\"$")
	public void i_send_the_GET_request_with_and_save_the_response_to(String inputRequestXML, String carrierID, String accountID, String groupID, String plan, String gpi, String ndc, String claimNumber, String seq, String outputXML) throws Throwable {
	   	SOAPHelper soapHelper = new SOAPHelper();	   	
        HashMap<String, String> requestValues= new HashMap<String, String>();		
		requestValues.put("CarCode", carrierID);
		requestValues.put("AccCode", accountID);
		requestValues.put("GrpCode", groupID);
		requestValues.put("Plan", plan);
		requestValues.put("gpi", gpi);
		requestValues.put("ndc", ndc);
		requestValues.put("clm", claimNumber);
		requestValues.put("seq", seq);
		 
		SOAPMessage req = SOAPHelper.updateXmlAndBuildSOAPRequest(inputDataFolder+""+inputRequestXML+".xml", requestValues);		
		SOAPMessage response=  soapHelper.sendSoapMessage(req,endPoint_API);
		System.out.println("Response :");
		soapHelper.printSOAPResponse(response);		
		soapHelper.writeSOAPResponse(response, outputDataFolder+outputXML+".xml");
	}  
	
	@Then("^I validate the response file \"([^\"]*)\" for tags \"([^\"]*)\" with values \"([^\"]*)\"$")
	public void i_validate_the_response_file_for_tags_with_values(String outputFile, String responseTagfile, String expectedTagValues) throws Throwable {
	   
		String filePath = expectedResponseFolder+""+responseTagfile+".properties";
		Map<String, String> tagNames= ReadPropertyFile.getFileProperties(filePath);		
		outputFile = outputDataFolder+outputFile+".xml";
		String tagValues[] = expectedTagValues.split(",");
		for(int i = 0 ; i < tagValues.length ;i++)
		{
			String expectedTag = tagNames.get(tagValues[i].split("=")[0]);
			Reporter.addStepLog("Tag Name :"+ expectedTag);
			String expectedTagValue = tagValues[i].split("=")[1];
			String actualValue = (String) XMLHelper.getValueByXPATH(outputFile,expectedTag );
			FunctionalLibrary.func_CompareStrings(actualValue.trim(), expectedTagValue.trim());			
		}
		
		}
		
	@Then("^the request is sucessful with response code (\\d+)$")
	public void the_request_is_sucessful_with_response_code(int arg1) throws Throwable {
	    System.out.println("Executed");
	}
}
