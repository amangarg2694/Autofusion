Feature: Newly added Level fields in  Contingent Therapy Sched Protocol screen
  As a RxClaim User I want to Verify that Level fields were added to Contingent Therapy Sched Protocol screen


  Scenario Outline: Verify that Level fields were added to Contingent Therapy Sched Protocol screen
    Given I am on RxClaim PlanAdministrator Menu  
    When  I select Option "4" to navigate to "RxClaim Plan Maintenance"
    And I select Option "3" to navigate to "Active Contingent Therapy Schedule"
    And I create Active Contingent Therapy Schedule with "<Schedule1>","<desc>","<mmsgcde>","<mmstyp>","<umsgcde>","<umsgtyp>"
    And I navigate to  Contingent Therapy Schedule Protocol Sequence with "<seq>" for "<Schedule1>"
    Then Validate the new fields added  in "Contingent Therapy Sched Protocol Seq screen"

    Examples: 
      | Schedule1     | desc       | mmsgcde  |mmstyp|umsgcde|umsgtyp|seq|
      | SR41397SCH    | SR41397SCH | 2        |A     |2      |A      |1  |
      
      
      Scenario: Verify that fields Exclude Claims and Include Current Claim fields are moved to second page  in  Contingent Therapy Sched Protocol screen
      Given I navigate to  Contingent Therapy Schedule Protocol Sequence Screen
      When  I navigate to second page in Contingent Therapy Schedule Protocol Sequence Screen"
      Then Validate the "Exclude Claims" and "Include Current Claim" fields  are moved to "Contingent Therapy Sched Protocol Seq Page 2 of 2"
      
      Scenario: Verify the title of the screen 
      Given I navigate to  Contingent Therapy Schedule Protocol Sequence Screen
      When  I navigate to second page in Contingent Therapy Schedule Protocol Sequence Screen"
      Then Validate the title of the screen for both pages
      
    
      Scenario Outline: Verify the level field is F4 promptable,check conditions of the field and F1 help option
      Given I am on RxClaim PlanAdministrator Menu  
      When  I select Option "4" to navigate to "RxClaim Plan Maintenance"
    	And I select Option "3" to navigate to "Active Contingent Therapy Schedule"
   	  And I create Active Contingent Therapy Schedule with "<Schedule1>","<desc>","<mmsgcde>","<mmstyp>","<umsgcde>","<umsgtyp>"
    	And I navigate to  Contingent Therapy Schedule Protocol Sequence with "<seq>" for "<Schedule1>"
    	Then I Validate the level field and its conditions with "<GPI>","<NDC>"
    	And I press "F12" Key 
    	Then I Validate "F1" option for level field help display
    	Examples: 
    	| Schedule1     | desc       | mmsgcde  |mmstyp|umsgcde|umsgtyp|seq|GPI|NDC|
      | SR41397SCH    | SR41397SCH | 2        |A     |2      |A      |100  |G|N|
      
      Scenario Outline: Verify the Wildcard field is F4 promptable,check conditions of the field and F1 help option
      Given I am on RxClaim PlanAdministrator Menu  
      When  I select Option "4" to navigate to "RxClaim Plan Maintenance"
    	And I select Option "3" to navigate to "Active Contingent Therapy Schedule"
   	  And I create Active Contingent Therapy Schedule with "<Schedule1>","<desc>","<mmsgcde>","<mmstyp>","<umsgcde>","<umsgtyp>"
    	And I navigate to  Contingent Therapy Schedule Protocol Sequence with "<seq>" for "<Schedule1>"
    	Then I Validate the wildcard field and its conditions with the required options
      And I press "F12" Key 
    	Then I Validate "F1" option for wildcard field help display
    	
    	Examples: 
    	| Schedule1     | desc       | mmsgcde  |mmstyp|umsgcde|umsgtyp|seq  |
      | SR41397SCH    | SR41397SCH | 2        |A     |2      |A      |100  |
      
  

Scenario Outline: Verify whether the error message Value required is displayed when level is entered and Wildcard is empty.
     Given I am on RxClaim PlanAdministrator Menu  
    When  I select Option "4" to navigate to "RxClaim Plan Maintenance"
    And I select Option "3" to navigate to "Active Contingent Therapy Schedule"
    And I create Active Contingent Therapy Schedule with "<Schedule1>","<desc>","<mmsgcde>","<mmstyp>","<umsgcde>","<umsgtyp>"
    And I validate the error message for  Active Contingent Therapy Schedule Protocol with "<seq>" for "<Schedule1>" and having "<NDCListId>","<perioddays>","<mindur>","<Inccurcl>","<exccl>","<level>","<wildcard>"
    
    Examples:
    | Schedule1     | desc       |perioddays|mindur|Inccurcl|exccl|level|wildcard|mmsgcde  |mmstyp|umsgcde|umsgtyp|seq|NDCListId|
    | SR41397SCH   | SR41397SCH | 180|30|Y|S|N| |2        |A     |2      |A      |100  |43353086030|
    
    
    Scenario Outline: Verify whether the error message Value required is displayed when level is entered and Wildcard is empty.
    Given I am on RxClaim PlanAdministrator Menu  
    When  I select Option "4" to navigate to "RxClaim Plan Maintenance"
    And I select Option "3" to navigate to "Active Contingent Therapy Schedule"
    And I create Active Contingent Therapy Schedule with "<Schedule1>","<desc>","<mmsgcde>","<mmstyp>","<umsgcde>","<umsgtyp>"
    And I Validate  the error message Value required is displayed when level empty and Wildcard is entered with "<seq>" for "<Schedule1>" and having "<NDCListId>","<perioddays>","<mindur>","<Inccurcl>","<exccl>","<level>","<wildcard>"
    
    Examples:
    | Schedule1     | desc       |perioddays|mindur|Inccurcl|exccl|level|wildcard|mmsgcde  |mmstyp|umsgcde|umsgtyp|seq|NDCListId|
    | SR41397SCH   | SR41397SCH | 180|30|Y|S||12 |2        |A     |2      |A      |100  |43353086030|
    
    Scenario Outline: Verify whether the error message Value required is displayed when Exclude Claims is Blank or not S
    Given I am on RxClaim PlanAdministrator Menu  
    When  I select Option "4" to navigate to "RxClaim Plan Maintenance"
    And I select Option "3" to navigate to "Active Contingent Therapy Schedule"
    And I create Active Contingent Therapy Schedule with "<Schedule1>","<desc>","<mmsgcde>","<mmstyp>","<umsgcde>","<umsgtyp>"
    And I Validate  the error message is displayed when Exclude Claims is Blank or not S is entered with "<seq>" for "<Schedule1>" and having "<NDCListId>","<perioddays>","<mindur>","<Inccurcl>","<exccl>","<level>","<wildcard>"
    
    Examples:
    | Schedule1     | desc       |perioddays|mindur|Inccurcl|exccl|level|wildcard|mmsgcde  |mmstyp|umsgcde|umsgtyp|seq|NDCListId|
    | SR41397SCH   | SR41397SCH | 180|30|Y|T|N|12 |2        |A     |2      |A      |100  |43353086030|
    
    Scenario Outline: Verify whether the error message Value required is displayed when Level is entered and  Exclude Claims is Blank or not S
    Given I am on RxClaim PlanAdministrator Menu  
    When  I select Option "4" to navigate to "RxClaim Plan Maintenance"
    And I select Option "3" to navigate to "Active Contingent Therapy Schedule"
    And I create Active Contingent Therapy Schedule with "<Schedule1>","<desc>","<mmsgcde>","<mmstyp>","<umsgcde>","<umsgtyp>"
    And I Validate  the error message is displayed  when Level is entered and Exclude Claims is Blank or not S is entered with "<seq>" for "<Schedule1>" and having "<NDCListId>","<perioddays>","<mindur>","<Inccurcl>","<exccl>","<level>","<wildcard>"
    
    Examples:
    | Schedule1     | desc       |perioddays|mindur|Inccurcl|exccl|level|wildcard|mmsgcde  |mmstyp|umsgcde|umsgtyp|seq|NDCListId|
    | SR41397SCH   | SR41397SCH | 180|30|Y||N| |2        |A     |2      |A      |100  |43353086030|
    
    Scenario Outline: Verify whether the error message Invalid Wildcard for selected Level is displayed when Level is entered and  Exclude Claims is Blank or not S
    Given I am on RxClaim PlanAdministrator Menu  
    When  I select Option "4" to navigate to "RxClaim Plan Maintenance"
    And I select Option "3" to navigate to "Active Contingent Therapy Schedule"
    And I create Active Contingent Therapy Schedule with "<Schedule1>","<desc>","<mmsgcde>","<mmstyp>","<umsgcde>","<umsgtyp>"
    And I Validate  the error message Invalid Wildcard for selected Level is displayed when Level is NDC and Exclude Claims is Blank or not S is entered with "<seq>" for "<Schedule1>" and having "<NDCListId>","<perioddays>","<mindur>","<Inccurcl>","<exccl>","<level>","<wildcard>"
    
    Examples:
    | Schedule1     | desc       |perioddays|mindur|Inccurcl|exccl|level|wildcard|mmsgcde  |mmstyp|umsgcde|umsgtyp|seq|NDCListId|
    | SR41397SCH   | SR41397SCH | 180|30|Y|S|N|12 |2        |A     |2      |A      |100  |43353086030|
    
    
    Scenario Outline: Verify whether the error message Invalid Wildcard for selected Level is displayed when Level is entered and  Exclude Claims is Blank or not S
    Given I am on RxClaim PlanAdministrator Menu  
    When  I select Option "4" to navigate to "RxClaim Plan Maintenance"
    And I select Option "3" to navigate to "Active Contingent Therapy Schedule"
    And I create Active Contingent Therapy Schedule with "<Schedule1>","<desc>","<mmsgcde>","<mmstyp>","<umsgcde>","<umsgtyp>"
    And I Validate  the error message Invalid Wildcard for selected Level is displayed when Level is NDC and Exclude Claims is Blank or not S is entered with "<seq>" for "<Schedule1>" and having "<NDCListId>","<perioddays>","<mindur>","<Inccurcl>","<exccl>","<level>","<wildcard>"
    
    Examples:
    | Schedule1     | desc       |perioddays|mindur|Inccurcl|exccl|level|wildcard|mmsgcde  |mmstyp|umsgcde|umsgtyp|seq|NDCListId|
    | SR41397SCH   | SR41397SCH | 180|30|Y|S|N|12 |2        |A     |2      |A      |100  |43353086030|
    
    
    
    