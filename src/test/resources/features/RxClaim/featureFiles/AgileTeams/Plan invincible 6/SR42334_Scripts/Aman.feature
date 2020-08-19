@tag
Feature: Drug_status_Change
  I want to set Drug status

  @tag1
  Scenario: Drug Status Change
    Given I want to navigate to Rxclaim Plan Administrator Menu
    When I create CAG with(String carrierID,String carrierName,String processor,String mailingAdd,String city,String state,String zip,String contractFromDt,String contractThruDt,String contractEnt,String businessType,String accountID,String accountName,String groupID,String groupName,String groupFromDt,String groupThruDt,String planCode)
    Then validate carrier is created
    
     Examples: 
     carrierID |carrierName |
    