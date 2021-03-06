Feature: ADD POS Rebate List
As a RxClaim User I want to ADD POS Rebate List
    
             
   Scenario Outline: ADD POS Rebate List in ADD and Edit mode
    Given I am on RxClaim PlanAdministrator Menu  
    When I select Option "5" to navigate to "RxClaim Price Maintenance"
    And I select Option "1" to navigate to "RxClaim Price Schedule Maintenance"
    And I select Option "19" to navigate to "RxClaim 8.4.02 QA"
    And I press "F9" Key 
    And I enter "<FLineofBusiness>" in field "Flob" on "FilterPOSRebateList"
    And I enter "<FFormulary>" in field "Fform" on "FilterPOSRebateList"
    And I enter "<FSpecialty>" in field "Fspec" on "FilterPOSRebateList"
    And I press "Enter" Key
    And I press "F8" Key
    And I press "F6" Key
    And I enter "<ListName>" in field "List" on "AddPOSRebateList"
    And I enter "<Description>" in field "Desc" on "AddPOSRebateList"
    And I enter "<LineofBusiness>" in field "lob" on "AddPOSRebateList"
    And I enter "<Formulary>" in field "form" on "AddPOSRebateList"
    #And I enter "<Specialty>" in field "spec" on "AddPOSRebateList"
    And I enter "<BrandforGeneric>" in field "Brandfg" on "AddPOSRebateList"
    And I enter "<CRSpecialty>" in field "Crspec" on "AddPOSRebateList"
    And I enter "<Comprehensive>" in field "compre" on "AddPOSRebateList"
    And I enter "<Limited>" in field "ltd" on "AddPOSRebateList"
    Then verify zero value can be entered and saved for POS Rebate List with "<ListName>"             
          
       
    Examples:
    |FLineofBusiness|FFormulary|FSpecialty|ListName |Description|LineofBusiness|Formulary|Specialty|BrandforGeneric|CRSpecialty|Comprehensive|Limited|
    |C              |P         |B         |TestR02  | Test      |    E         |   A     |    S    |        Y      |  Y        | Y           | Y     |
