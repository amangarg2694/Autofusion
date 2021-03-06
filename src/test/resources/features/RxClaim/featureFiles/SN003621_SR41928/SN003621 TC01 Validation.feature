#Author: swathi_palla@optum.com
#Pre-Requisite : Trigger the "A4990CRX.D1QA_SERVICE_PRIORAUTH_REQ " service using Autopilot.Then check the results in RXClaim by running the below scripts.
Feature: Check the Pharmacy Network and Qualifier in the PA.

  Scenario Outline: After the service is triggered from Autopilot and Check the Pharmacy Network and Qualifier in the PA
  Given I am on RxClaim PlanAdministrator Menu  
  Then I validate the Network and Qualifier in the PA "<PANumber>","<Ntwk>","<NetworkID>","<Qualifier>"
  
  Examples:
  |PANumber|Ntwk|NetworkID|Qualifier|
  |PAGPISUPER|Pharmacy|Arjun1|1|