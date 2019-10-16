
Feature: Screen Validation for State Medicaid Program 
  As a RxClaim User I want to check two fields for Prescriber and Pharmacy Network
  
@TC01
Scenario Outline: Verify RCPNR001 screen for Medicaid network field for type and length (ADD Mode)
	Given I am on RxClaim PlanAdministrator Menu
  When I select Option "4" to navigate to "RxClaim Plan Maintenance"
	And I select Option "1" to navigate to "Active Plan by Plan Code"
	And I press "F6" Key
	Then I enter the values for Prescriber Plan creation with "<PlanCode>","<PlanFromDt>","<PlanDesc>"
	
	
Examples:
| PlanCode | PlanFromDt | PlanDesc |
| 41010AB2 | 010110 | Testing |

@TC02
Scenario Outline: Verify RCPNR001 screen for Medicaid network field for type and length (ADD Mode)
	Given I am on RxClaim PlanAdministrator Menu
  When I select Option "4" to navigate to "RxClaim Plan Maintenance"
	And I select Option "1" to navigate to "Active Plan by Plan Code"
	And I enter "<PlanCode>" in field "PlanCode" on "ActivePlanbyPlanCodeScreen"
	And I press "Enter" Key
	And I enter "2" in field "Selection" on "ActivePlanbyPlanCodeScreen"
	And I press "Enter" Key
	And I press "F7" Key
	And I enter "6" in field "Selection" on "PlanOptionsScreen"
	And I press "Enter" Key
	And I press "F9" Key
	Then Validate the "F4" functionality of Medicaid Network
Examples:
| PlanCode |
| 41010AB2 |

@TC03
Scenario Outline:  Verify RCPNR001 screen for Medicaid network field for  F1 option (ADD Mode)
	Given I am on RxClaim PlanAdministrator Menu
  When I select Option "4" to navigate to "RxClaim Plan Maintenance"
	And I select Option "1" to navigate to "Active Plan by Plan Code"
	And I enter "<PlanCode>" in field "PlanCode" on "ActivePlanbyPlanCodeScreen"
	And I press "Enter" Key
	And I enter "2" in field "Selection" on "ActivePlanbyPlanCodeScreen"
	And I press "Enter" Key
	And I press "F7" Key
	And I enter "6" in field "Selection" on "PlanOptionsScreen"
	And I press "Enter" Key
	And I press "F9" Key
	Then Validate the "F1" functionality of Medicaid Network
Examples:
| PlanCode |
| 41010AB2 |

@TC04
Scenario Outline: Verify RCPNR001 screen for Medicaid network field for type and length (CHANGE Mode)
	Given I am on RxClaim PlanAdministrator Menu
  When I select Option "4" to navigate to "RxClaim Plan Maintenance"
	And I select Option "1" to navigate to "Active Plan by Plan Code"
	And I enter "<PlanCode>" in field "PlanCode" on "ActivePlanbyPlanCodeScreen"
	And I press "Enter" Key
	And I enter "2" in field "Selection" on "ActivePlanbyPlanCodeScreen"
	And I press "Enter" Key
	And I press "F7" Key
	And I enter "6" in field "Selection" on "PlanOptionsScreen"
	And I press "Enter" Key
	And I press "F9" Key
	
Examples:
| PlanCode |
| SR41010P8 |

@TC05
Scenario Outline: Verify RCPNR001 screen for Medicaid network field for  F4 pink option (CHANGE Mode)
	Given I am on RxClaim PlanAdministrator Menu
  When I select Option "4" to navigate to "RxClaim Plan Maintenance"
	And I select Option "1" to navigate to "Active Plan by Plan Code"
	And I enter "<PlanCode>" in field "PlanCode" on "ActivePlanbyPlanCodeScreen"
	And I press "Enter" Key
	And I enter "2" in field "Selection" on "ActivePlanbyPlanCodeScreen"
	And I press "Enter" Key
	And I press "F7" Key
	And I enter "6" in field "Selection" on "PlanOptionsScreen"
	And I press "Enter" Key
	And I press "F9" Key
	Then Validate the "F4" functionality of Medicaid Network
	
Examples:
| PlanCode |
| SR41010P8 |

@TC06
Scenario Outline: Verify RCPNR001 screen for Medicaid network field for  F1 option (CHANGE Mode)
	Given I am on RxClaim PlanAdministrator Menu
  When I select Option "4" to navigate to "RxClaim Plan Maintenance"
	And I select Option "1" to navigate to "Active Plan by Plan Code"
	And I enter "<PlanCode>" in field "PlanCode" on "ActivePlanbyPlanCodeScreen"
	And I press "Enter" Key
	And I enter "2" in field "Selection" on "ActivePlanbyPlanCodeScreen"
	And I press "Enter" Key
	And I press "F7" Key
	And I enter "6" in field "Selection" on "PlanOptionsScreen"
	And I press "Enter" Key
	And I press "F9" Key
	Then Validate the "F1" functionality of Medicaid Network
	
	Examples:
| PlanCode |
| SR41010P8 |

@TC07
Scenario Outline: Verify RCPNR001 screen for Clarification Code Recognition  field for type and length (ADD Mode)
	Given I am on RxClaim PlanAdministrator Menu
  When I select Option "4" to navigate to "RxClaim Plan Maintenance"
	And I select Option "1" to navigate to "Active Plan by Plan Code"
	And I press "F6" Key
	Then I enter the values for Prescriber Plan creation with "<PlanCode>","<PlanFromDt>","<PlanDesc>"
	
	
Examples:
| PlanCode | PlanFromDt | PlanDesc |
| 41010AC1 | 010110 | Testing |

@TC08
Scenario Outline: Verify RCPNR001 screen for Clarification Code Recognition  field for  F4 pink option (ADD Mode)
	Given I am on RxClaim PlanAdministrator Menu
  When I select Option "4" to navigate to "RxClaim Plan Maintenance"
	And I select Option "1" to navigate to "Active Plan by Plan Code"
	And I enter "<PlanCode>" in field "PlanCode" on "ActivePlanbyPlanCodeScreen"
	And I press "Enter" Key
	And I enter "2" in field "Selection" on "ActivePlanbyPlanCodeScreen"
	And I press "Enter" Key
	And I press "F7" Key
	And I enter "6" in field "Selection" on "PlanOptionsScreen"
	And I press "Enter" Key
	And I press "F9" Key
	Then Validate the "F4" functionality of Clarification Code Recognition 
Examples:
| PlanCode |
| 41010AC1 |

@TC09
Scenario Outline: Verify RCPNR001 screen for Clarification Code Recognition  field for  F1 option (ADD Mode)
	Given I am on RxClaim PlanAdministrator Menu
  When I select Option "4" to navigate to "RxClaim Plan Maintenance"
	And I select Option "1" to navigate to "Active Plan by Plan Code"
	And I enter "<PlanCode>" in field "PlanCode" on "ActivePlanbyPlanCodeScreen"
	And I press "Enter" Key
	And I enter "2" in field "Selection" on "ActivePlanbyPlanCodeScreen"
	And I press "Enter" Key
	And I press "F7" Key
	And I enter "6" in field "Selection" on "PlanOptionsScreen"
	And I press "Enter" Key
	And I press "F9" Key
	Then Validate the "F1" functionality of Clarification Code Recognition 
Examples:
| PlanCode |
| 41010AC1 |

@TC10
Scenario Outline: Verify RCPNR001 screen for Clarification Code Recognition  field for type and length (CHANGE Mode)
	Given I am on RxClaim PlanAdministrator Menu
  When I select Option "4" to navigate to "RxClaim Plan Maintenance"
	And I select Option "1" to navigate to "Active Plan by Plan Code"
	And I enter "<PlanCode>" in field "PlanCode" on "ActivePlanbyPlanCodeScreen"
	And I press "Enter" Key
	And I enter "2" in field "Selection" on "ActivePlanbyPlanCodeScreen"
	And I press "Enter" Key
	And I press "F7" Key
	And I enter "6" in field "Selection" on "PlanOptionsScreen"
	And I press "Enter" Key
	And I press "F9" Key
	
Examples:
| PlanCode |
| SR41010P8 |

@TC11
Scenario Outline: Verify RCPNR001 screen for Clarification Code Recognition  field for  F4 pink option (CHANGE Mode)
	Given I am on RxClaim PlanAdministrator Menu
  When I select Option "4" to navigate to "RxClaim Plan Maintenance"
	And I select Option "1" to navigate to "Active Plan by Plan Code"
	And I enter "<PlanCode>" in field "PlanCode" on "ActivePlanbyPlanCodeScreen"
	And I press "Enter" Key
	And I enter "2" in field "Selection" on "ActivePlanbyPlanCodeScreen"
	And I press "Enter" Key
	And I press "F7" Key
	And I enter "6" in field "Selection" on "PlanOptionsScreen"
	And I press "Enter" Key
	And I press "F9" Key
	Then Validate the "F4" functionality of Clarification Code Recognition
	
Examples:
| PlanCode |
| SR41010P8 |

@TC12
Scenario Outline: Verify RCPNR001 screen for Clarification Code Recognition  field for  F1 option (CHANGE Mode)
	Given I am on RxClaim PlanAdministrator Menu
  When I select Option "4" to navigate to "RxClaim Plan Maintenance"
	And I select Option "1" to navigate to "Active Plan by Plan Code"
	And I enter "<PlanCode>" in field "PlanCode" on "ActivePlanbyPlanCodeScreen"
	And I press "Enter" Key
	And I enter "2" in field "Selection" on "ActivePlanbyPlanCodeScreen"
	And I press "Enter" Key
	And I press "F7" Key
	And I enter "6" in field "Selection" on "PlanOptionsScreen"
	And I press "Enter" Key
	And I press "F9" Key
	Then Validate the "F1" functionality of Clarification Code Recognition
	
	Examples:
| PlanCode |
| SR41010P8 |

@TC13
Scenario Outline: Verify RCPNR001 screen  for Clarification Code Recognition  field when Medicaid Network field set Y
	Given I am on RxClaim PlanAdministrator Menu
  When I select Option "4" to navigate to "RxClaim Plan Maintenance"
	And I select Option "1" to navigate to "Active Plan by Plan Code"
	And I enter "<PlanCode>" in field "PlanCode" on "ActivePlanbyPlanCodeScreen"
	And I press "Enter" Key
	And I enter "2" in field "Selection" on "ActivePlanbyPlanCodeScreen"
	And I press "Enter" Key
	And I press "F7" Key
	And I enter "6" in field "Selection" on "PlanOptionsScreen"
	And I press "Enter" Key
	When I enter details in Prescriber Network Override screen with "<Medicaid Network>","<CCR>"
	Then Validate "Record changed." message should displayed on "PharmacyNetworkOverride"
Examples:
| PlanCode | Medicaid Network | CCR |
| SR41010P8 | Y | Y |



@TC14
Scenario Outline: Verify RCPNR001 screen  for Clarification Code Recognition  field when Medicaid Network field not Y
	Given I am on RxClaim PlanAdministrator Menu
  When I select Option "4" to navigate to "RxClaim Plan Maintenance"
	And I select Option "1" to navigate to "Active Plan by Plan Code"
	And I enter "<PlanCode>" in field "PlanCode" on "ActivePlanbyPlanCodeScreen"
	And I press "Enter" Key
	And I enter "2" in field "Selection" on "ActivePlanbyPlanCodeScreen"
	And I press "Enter" Key
	And I press "F7" Key
	And I enter "6" in field "Selection" on "PlanOptionsScreen"
	And I press "Enter" Key
	When I enter details in Prescriber Network Override screen with "<Medicaid Network>","<CCR>"
	Then Validate error message displayed on Prescriber Network Override screen
	
	Examples:
| PlanCode | Medicaid Network | CCR |
| SR41010P8 | N | Y |