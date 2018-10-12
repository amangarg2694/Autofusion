Feature: Adding GPI list
As a RxClaim User I want to create GPI List
   
   #Adding GPI list
   @TC01         
   Scenario Outline: Verify GPI list is added
    
    Given I am on RxClaim PlanAdministrator Menu
    When I select Option "4" to navigate to "RxClaim Plan Maintenance"
    And I select Option "2" to navigate to "RxClaim Product List"
    And I select Option "1" to navigate to "Active Plan GPI List by List"
    And I Add list with "<List>","<Description>"
    And I add GPIlist and messages with "<sublistname>","<Qtype>","<days>","<Quantity>","<FromDate>","<ThruDate>","<MsgCode>","<MsgType>"
    Then validate List with "<List>"
    
    
    
    
    
     Examples:
   |List     |Description|sublistname|Qtype|days|Quantity|FromDate|ThruDate| MsgCode| MsgType|  
   |TestGPI92| Test GPI  |  PROZAC   |  D  | 71 |63      |010118  |123118  | test   |R       |
   
   #Adding NDC list
   @TC02         
   Scenario Outline: Verify NDC list is added
    
    Given I am on RxClaim PlanAdministrator Menu
    When I select Option "4" to navigate to "RxClaim Plan Maintenance"
    And I select Option "2" to navigate to "RxClaim Product List"
    And I select Option "2" to navigate to "Active Plan GPI List by List"
    And I Add list with "<List>","<Description>"
    And I add NDClist and messages with "<sublistname>","<Qtype>","<days>","<Quantity>","<FromDate>","<ThruDate>","<MsgCode>","<MsgType>"
    Then validate List with "<List>"
    
    
    
    
     Examples:
   |List |Description|sublistname|Qtype|days|Quantity|FromDate|ThruDate| MsgCode| MsgType| 
   |NDC66| Test GPI  |LIPITOR   |  D  | 71 |63      |010118  |123118  | test   |R       |
   
   @TC03         
    Scenario Outline: Verify message code added to the NDC list at plan level
    
    Given I am on RxClaim PlanAdministrator Menu
    When I select Option "4" to navigate to " RxClaim Plan Maintenance"
    And I select Option "1" to navigate to "Active Plan by Plan Code"
    And I verify the message code with "<plancode>","<NDC>","<MsgCode>"
    Then display the msgCode
    
    
    Examples:
    |plancode |NDC   | MemberID |
    |SR41706E6|EX4176GL4|SR41706MM6|
    |SR41706E5|EX00T3|SR41706MM5|
    |SR41706S1|EX4176GL5|SR41706MB5|
    |SR41706S4|EX4176GL8|SR41706MB8|
    |SR41706S7|EX4176GL9|SR41706MR1|
    #|SR41706S2|EX00T6|SR41706MB6|
    #|SR41706S3|EX00T7|SR41706MB7|
    #|SR41706S8|EX00T8|SR41706MR2|
   