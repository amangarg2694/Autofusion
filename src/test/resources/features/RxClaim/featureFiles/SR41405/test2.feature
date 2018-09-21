#Author: Venkateshwarlu M

Feature: SN003280_SR41405_TS001_Req 7.3: verify when  Claim is submitted with PA MSC Override =N and Pat pay MSC override is not Y
Scenario Outline: Add Product Override in Product with existing CAG
    When I select Option "2" to navigate to "RxClaim Product Information Maintenance"
    And I select Option "1" to navigate to "Active Products"
    And I press "F15" Key 
    And I search Product by "<ProductID>"
    And I search for existing Active Product Override "<CarrierID>"
    And I Add Product Override with "<CarrierID>","<AccountID>","<GroupID>"
    And I select Patient Pay MSC "<PatientPay_MSC>" value
    Then I verify added Product Override Details with "<CarrierID>"
    And I press "F12" Key 
		And I press "F12" Key
		And I press "F12" Key 
		And I press "F12" Key
		And I press "F12" Key
		
   #Note: ProductID=NDC_ID
    Examples:
    | ProductID 	| CarrierID | AccountID    | GroupID     |PatientPay_MSC| 
    |	00002850101 | SN003280  | SN003280ACC1 | SN003280GRP1|Y				      |