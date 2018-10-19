Feature: Perform a Eligibility Profile Setup 
Scenario Outline: Perform a Eligibility Stage
  
 Given I am on RxClaim PlanAdministrator Menu 
   When  I select Option "CCT700" to navigate to "RxClaim Operations Menu "
     And I select Option "2" to navigate to "RxClaim Batch Transaction Loads Menu" 
     And I select Option "1" to navigate to "RxClaim Eligibility Master Menu"
 #    And I select Option "2" to navigate to "Eligibility Stage"
   #  And I enter "<Carrier>" in field "Carrier" on "EligibilityStageScreen" 
   #  And I enter "<Account>" in field "Account" on "EligibilityStageScreen" 
   #  And I enter "<Group>" in field "Group" on "EligibilityStageScreen" 
   #  And I enter "S" in field "StageOption" on "EligibilityStageScreen" 
   #  And I press "F6" Key  
    # And I select Option "wrksbmjob" to navigate to "Work with Submitted Jobs" 
     #And I press "8" Key  
     #And I press "Enter" Key   
     #And I press "Tab" Key  
     #And I press "Tab" Key  
     #And I press "Tab" Key  
     #And I press "5" Key  
     #And I press "Enter" Key   
     And I select Option "wrksbmjob" to navigate to "Work with Submitted Jobs" 
     And I enter "8" in field "Opt" on "WorkWithSubmittedJobsScreen"   
     And I press "Enter" Key  
     And I enter "5" in field "Opt3" on "WorkWithJobSpooledFilesScreen" 
     And I press "Enter" Key 
     And I enter "B" in field "Control" on "DisplaySpooledFileScreen"
     And I press "Enter" Key 
     Then I capture a screenshot
    
      
     
  #Members Input:   
  #Members Accepted:
  #Members Rejected:
  
 Examples:
 |Carrier|Account|Group|
  |AZM|SN003730|SN003730|

                    

  # Scenario Outline: Perform Eligibility Load 

  # Given I am on RxClaim PlanAdministrator Menu 
  #  When  I select Option "CCT700" to navigate to "RxClaim Operations Menu "
   #   And I select Option "2" to navigate to "RxClaim Batch Transaction Loads Menu" 
   #   And I select Option "1" to navigate to "RxClaim Eligibility Master Menu"
    #   And I select Option "3" to navigate to "Eligibility Load"
    #   And I enter Carrier "<Carrier>" within EligibilityLoadScreen 
    #   And I enter Account "<Account>" within EligibilityLoadScreen
    #   And I enter Group  "<Group>" within EligibilityLoadScreen
  #    And I press "F6" Key    
  #    And I select Option "ws" to navigate to "Work with Submitted Jobs" 
 # Examples:
 #    |Carrier|Account|Group|         
  #  |AZM|SN003730|SN003730|           
       

 
 
 
 #not needed 
 
  #  Scenario Outline: Perform a Eligibility Profile Setup by either creating a new profile or copy a existing profile 
  
     #   Given I am on RxClaim PlanAdministrator Menu 
      #   When I select Option "CCT700" to navigate to "RxClaim Operations Menu"
        #     And I select Option "2" to navigate to "RxClaim Batch Transaction Loads Menu" 
        #       And I select Option "1" to navigate to "RxClaim Eligibility Master Menu"
         #     And I enter "1" in field "SelectionorCommand" on "EligibilityMasterMenu" 
         #     And I press "Enter" Key
         #     And I enter "<CarrierName>" in field "Search" on "ActiveEligibilityProfileScreen"   
         #     And I press "Enter" Key
         #     And I enter "3" in field "Select" on "ActiveEligibilityProfileScreen" 
         #     And I press "Enter" Key
          #    And I enter "<Carrier>" in field "Carrier" on "CopyEligibilityProfileCarrierScreen"  
         #     And I press "Tab" Key  
         #     And I enter "<Account>" in field "Account" on "CopyEligibilityProfileCarrierScreen" 
          #    And I press "Tab" Key  
          #    And I enter "<Group>" in field "Group" on "CopyEligibilityProfileCarrierScreen"   
          #    And I press "Tab" Key   
          #   And I enter "<Identifier>" in field "Identifier" on "CopyEligibilityProfileCarrierScreen"       
           #  And I press "Enter" Key
            #  And I enter "<LibraryName>" in field "LibraryName" on "EligibilityProfileDetailScreen"  
          #    And I press "Enter" Key

         #   Examples: 
       # |CarrierName|Carrier|Account|Group|Identifier|LibraryName |FileName|
         #    |AZM|AZM|SN003730|SN003730|SN003730 |SPAL|AHCAMZMB|  
     