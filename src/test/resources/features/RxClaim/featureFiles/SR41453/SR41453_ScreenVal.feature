Feature: Screen Validation for Reprocessing Claim Screens
  As a RxClaim User I want to validate error messages for manual and batch claim reprocessing
  
##TC01
Scenario Outline: Verify that when No Qualifier exists when Cost Fee, Tax Inc is Y then error message “Qualifier field must be populated” is displayed for Manual claim reprocessing
	Given I am on RxClaim PlanAdministrator Menu
  When I select Option "4" to navigate to "RxClaim Plan Maintenance"
	And I select Option "30" to navigate to "Health Insurance Exchange Processing"
	And I select Option "2" to navigate to "HIX Reprocessing"
	And I select Option "1" to navigate to "Open HIX Claim Reprocessing"
	Then Validating the error message when qualifier does not exist when CFT is Y with "<Flag>"
	
Examples:
| Flag |
| Y |

##TC02
Scenario Outline: Verify that when when Cost, Fee, Tax Inc is set to N and Qualifier is not blank then error message “Qualifier field is applicable only when Retain is Y” is displayed

Then Validating the error message when qualifier does not exist when CFT is N with "<Flag>","<Qualifier>"

Examples:
| Flag | Qualifier |
| N | O |

##TC03
Scenario Outline: Verify that when No Qualifier exists when Cost Fee, Tax Inc is Y then error message “Qualifier field must be populated” is displayed for Batch claim reprocessing

And I press "F12" Key
And I press "F12" Key
When I select Option "2" to navigate to "HIX Batch Claim Reprocessing"
Then Validating the error message when CFT is Y and no qualifier exists with "<FromDate>","<ThruDate>","<Flag>"

Examples:
| FromDate | ThruDate | Flag |
| 010101 | 123139 | Y |

##TC04
Scenario Outline: Verify that when Cost Fee Tax Inc is set to N and qualifier field is not blank then error message “Qualifier field must be blank” is displayed for Batch claim reprocessing

Then Validating the error message for batch when qualifier does not exist when CFT is N with "<Flag>","<Qualifier>"

Examples:
| Flag | Qualifier |
| N | O |

