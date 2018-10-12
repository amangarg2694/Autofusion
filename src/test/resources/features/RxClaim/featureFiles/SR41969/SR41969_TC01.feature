Feature: Update the pharmacy load prgm to load web address when credential date is blank
  As a RxClaim User validating the functionality whether web address is getting loaded when credential date is valid or invalid
  
##TC02 - TC07

Scenario Outline: Copying the file from one library to other
	Given I am on RxClaim PlanAdministrator Menu
  When I copy the file to library with "<CopyFromFile>","<CopyFromLibrary>","<CopyToFile>","<CopyToLibrary>"
	
Examples:
| CopyFromFile |CopyFromLibrary|CopyToFile|CopyToLibrary|
| SR41969BK|PHERLIB|SR41969C|USRPRIYA|


Scenario Outline: Creating pharmacy for modifying the input file
	Given I am on RxClaim PlanAdministrator Menu
	When creating Pharmacy with "<Pharmacy>","<PharmacyName>"
	
Examples:
|Pharmacy|PharmacyName|
|41969P1|Testing|
|41969P2|Testing|
|41969P3|Testing|
|41969P4|Testing|
|41969P5|Testing|
|41969P6|Testing|


Scenario Outline: Verifying the functionality whether web address is getting loaded when credential date is valid or invalid
	Given I am on RxClaim PlanAdministrator Menu
  When modifying the values of credential dates in input file with "<CopyToFile>","<CopyToLibrary>","<CredentialDate1>","<NextCredentialDate1>","<Pharmacy1>","<WebAddress1>","<CredentialDate2>","<NextCredentialDate2>","<Pharmacy2>","<WebAddress2>","<CredentialDate3>","<NextCredentialDate3>","<Pharmacy3>","<WebAddress3>","<CredentialDate4>","<NextCredentialDate4>","<Pharmacy4>","<WebAddress4>","<CredentialDate5>","<NextCredentialDate5>","<Pharmacy5>","<WebAddress5>","<CredentialDate6>","<NextCredentialDate6>","<Pharmacy6>","<WebAddress6>"
	When triggering the pharmacy load program job with "<CopyToFile>","<CopyToLibrary>"
	Then Validating the data in input file with Pharmacy screen having "<CopyToFile>","<CopyToLibrary>"
Examples:
|CopyToFile|CopyToLibrary|CredentialDate1|NextCredentialDate1|Pharmacy1|WebAddress1|CredentialDate2|NextCredentialDate2|Pharmacy2|WebAddress2|CredentialDate3|NextCredentialDate3|Pharmacy3|WebAddress3|CredentialDate4|NextCredentialDate4|Pharmacy4|WebAddress4|CredentialDate5|NextCredentialDate5|Pharmacy5|WebAddress5|CredentialDate6|NextCredentialDate6|Pharmacy6|WebAddress6|
|SR41969C|USRPRIYA|        |10012018|41969P1|WWW.HEALTHMARC.COM|13102018|10012018|41969P2|WWW.MARC.COM|10012018|        |41969P3|WWW.HEALTH.COM|10012018|02302018|41969P4|WWW.OGS.COM|10012018|10282018|41969P5|               |10012018|11012018|41969P6|WWW.KAISER.COM|

