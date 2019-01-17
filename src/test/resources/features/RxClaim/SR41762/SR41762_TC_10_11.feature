Feature: ADD POS Rebate List
As a RxClaim User I want to ADD POS Rebate List
               
    Scenario Outline: ADD POS Rebate List Vlidations
    Given I am on RxClaim PlanAdministrator Menu  
    When I select Option "5" to navigate to "RxClaim Price Maintenance"
    And I select Option "1" to navigate to "RxClaim Price Schedule Maintenance"
    And I select Option "19" to navigate to "RxClaim 8.4.02 QA"
    And I press "F6" Key 
    And I enter "<ListName>" in field "List" on "AddPOSRebateList"
    And I enter "<Description>" in field "Desc" on "AddPOSRebateList"
    And I enter "<LineofBusiness>" in field "lob" on "AddPOSRebateList"
    And I enter "<Formulary>" in field "form" on "AddPOSRebateList"
    #And I enter "<Specialty>" in field "spec" on "AddPOSRebateList"
    And I enter "<BaseRate>" in field "Brate" on "AddPOSRebateList"
    And I enter "<AdminRate>" in field "AdminRate" on "AddPOSRebateList"
    And I enter "<PriceProtectionRate>" in field "PricePR" on "AddPOSRebateList"
    And I enter "<BrandforGeneric>" in field "Brandfg" on "AddPOSRebateList"
    And I enter "<CRSpecialty>" in field "Crspec" on "AddPOSRebateList"
    And I enter "<Comprehensive>" in field "compre" on "AddPOSRebateList"
    And I enter "<Limited>" in field "ltd" on "AddPOSRebateList"
    Then validate the range with "<AdminRate>","<BaseRate>","<PriceProtectionRate>"            
          
          
       
    Examples:
    
    
    |ListName |Description|LineofBusiness|Formulary|BaseRate|AdminRate|PriceProtectionRate|BrandforGeneric|CRSpecialty|Comprehensive|Limited|
    |Test804  | testR07   |E             |A        |  100.00|101.00   |099.99              |    Y          |   Y       |     Y       |   Y   |
    |Test805  | testS05   |E             |A        |  100.10|100.00   |099.99              |    Y          |   Y       |     Y       |   Y   |
    |Test806  | testS06   |E             |A        |  121.00|122.00   |434.00             |    Y          |   Y       |     Y       |   Y   | 