Feature: Verify the notes from the valid type A records for an existing Plan GPI List and valid type B records for an existing GPI and MSC combination on a Plan GPI List.

Scenario Outline:Verify the notes from the valid type A records for an existing Plan GPI List and valid type B records for an existing GPI and MSC combination on a Plan GPI List.

Given I am on RxClaim PlanAdministrator Menu
When  I select Option "CCT700" to navigate to "RxClaim Operations Menu"
And I select Option "2" to navigate to "RxClaim Batch Transaction Loads Menu" 
And I select Option "6" to navigate to "NDC/GPI List Loads"
And I select Option "1" to navigate to "Plan GPI List Load"
And I enter "<Library>","<File>","<Format>"in Plan GPI List Load screen
And I press "F6" Key
And I select Option "CCT600" to navigate to "RxClaim Plan Administrator Menu" 
And I select Option "4" to navigate to "RxClaim Plan Maintenance"
And I select Option "2" to navigate to "RxClaim Product List"
And I select Option "1" to navigate to "Active Plan GPI List by List"
Then I validate the notes "<Note>" in GPIlist "<GpiList>","<Date>"

Examples:
|Library |File    |Format  |Note                                              |GpiList| Date|
|usrmadhu|sr41697g|RCPGO038|Plan GPI List SN002715; Plan GPI List Note Line 2.|S41697G |9/11/18|



Scenario Outline: Verify the notes from the valid type B records for an existing Plan GPI List and valid type B records for an existing GPI and MSC combination on a Plan GPI List.

Given I am on RxClaim PlanAdministrator Menu
When  I select Option "CCT700" to navigate to "RxClaim Operations Menu"
And I select Option "2" to navigate to "RxClaim Batch Transaction Loads Menu" 
And I select Option "6" to navigate to "NDC/GPI List Loads"
And I select Option "1" to navigate to "Plan GPI List Load"
And I enter "<Library>","<File>","<Format>"in Plan GPI List Load screen
And I press "F6" Key
And I select Option "CCT600" to navigate to "RxClaim Plan Administrator Menu" 
And I select Option "4" to navigate to "RxClaim Plan Maintenance"
And I select Option "2" to navigate to "RxClaim Product List"
And I select Option "1" to navigate to "Active Plan GPI List by List"
Then I validate the notes B "<Note>" in GPIlist "<GpiList>","<Date>"

Examples:
|Library |File    |Format   |Note                            |GpiList| Date|
|usrmadhu|sr41697bg|RCPGO038|PLAN GPI LISTB List Note Line 3.|S41697G |9/10/18|






Scenario Outline: Validate the output from the load file which include type A record that is invalid or for a nonexistent Plan GPI List 
Given I am on RxClaim PlanAdministrator Menu
When  I select Option "CCT700" to navigate to "RxClaim Operations Menu"
And I select Option "2" to navigate to "RxClaim Batch Transaction Loads Menu" 
And I select Option "6" to navigate to "NDC/GPI List Loads"
And I select Option "1" to navigate to "Plan GPI List Load"
And I enter "<Library>","<File>","<Format>"in Plan GPI List Load screen
And I press "F6" Key
Then I validate the spool file for "INVALID GPI LIST NAME" message
And I goback to PlanAdministrator Menu

Examples:
|Library |File    |Format  |
|usrmadhu|sr41697G1|RCPGO038|

Scenario Outline: Validate the output from the load file which include type B record that is invalid or for a nonexistent Plan GPI List 
Given I am on RxClaim PlanAdministrator Menu
When  I select Option "CCT700" to navigate to "RxClaim Operations Menu"
And I select Option "2" to navigate to "RxClaim Batch Transaction Loads Menu" 
And I select Option "6" to navigate to "NDC/GPI List Loads"
And I select Option "1" to navigate to "Plan GPI List Load"
And I enter "<Library>","<File>","<Format>"in Plan GPI List Load screen
And I press "F6" Key
Then I validate the spool file for "INVALID GPI LIST NAME" message
And I goback to PlanAdministrator Menu

Examples:
|Library |File      |Format  |
|usrmadhu|sr41697bg1|RCPGO038|


Scenario Outline: Validate the Plan GPI List Export File by submitting with a range that includes Plan GPI Lists which have both Plan GPI List Notes and Plan GPI Notes
Given I am on RxClaim PlanAdministrator Menu
When  I select Option "CCT700" to navigate to "RxClaim Operations Menu"
And I select Option "2" to navigate to "RxClaim Batch Transaction Loads Menu" 
And I select Option "11" to navigate to "Create Export Files"
And I select Option "30" to navigate to "NDC/GPI List Exports"
And I select Option "5" to navigate to "Plan GPI List Export File"
And I enter "<GpiListFrom>","<GpiListThru>","<ExportVer>","<Library>","<File>"in Plan GPI List Load screen
And I press "F6" Key
Then I validate the output file "<Library>","<File>" with notes
And I press "F12" Key
And  I select Option "CCT600" to navigate to "RxClaim Plan Administrator Menu"
Examples:
|GpiListFrom|GpiListThru|ExportVer|Library |File     |
|S41697G     |S41697G     |83       |usrmadhu|S41697_O1|






Scenario Outline: Validate the notes from the valid type A records for an existing Plan NDC List

Given I am on RxClaim PlanAdministrator Menu
When  I select Option "CCT700" to navigate to "RxClaim Operations Menu"
And I select Option "2" to navigate to "RxClaim Batch Transaction Loads Menu" 
And I select Option "6" to navigate to "NDC/GPI List Loads"
And I select Option "3" to navigate to "Plan NDC List Load"
And I enter "<NdcList>","<Status>","<Format>","<Library>","<File>" in Plan NDC List Load screen
And I press "F6" Key
And I select Option "CCT600" to navigate to "RxClaim Plan Administrator Menu" 
And I select Option "4" to navigate to "RxClaim Plan Maintenance"
And I select Option "2" to navigate to "RxClaim Product List"
And I select Option "2" to navigate to "Active Plan NDC List by List"
Then I validate the notes "<Note>" in GPIlist "<NdcList>","<Date>"

Examples:
|NdcList|Status|Format|Library |File     | Date  |Note                                           |
|S41697|U    |83    |USRMADHU|SR41697AN|9/11/18|Plan NDC List T2715; Plan NDC LIST Note Line 4.|


Scenario Outline: Validate the notes from the valid type B records for an existing Plan NDC List
Given I am on RxClaim PlanAdministrator Menu
When  I select Option "CCT700" to navigate to "RxClaim Operations Menu"
And I select Option "2" to navigate to "RxClaim Batch Transaction Loads Menu"
And I select Option "6" to navigate to "NDC/GPI List Loads"
And I select Option "3" to navigate to "Plan NDC List Load"
And I enter "<NdcList>","<Status>","<Format>","<Library>","<File>" in Plan NDC List Load screen
And I press "F6" Key
And I select Option "CCT600" to navigate to "RxClaim Plan Administrator Menu" 
And I select Option "4" to navigate to "RxClaim Plan Maintenance"
And I select Option "2" to navigate to "RxClaim Product List"
And I select Option "2" to navigate to "Active Plan NDC List by List"
Then I validate the notes B "<Note>" in NDClist "<NdcList>","<Date>"

Examples: 
|NdcList|Status|Format  |Library   |File      | Note        | Date  |
|S41697 |U     |83       |usrmadhu |SR41697BN |TEST NDC LIST| 9/11/18|

Scenario Outline: Validate the Plan NDC List Export File by submitting with a range that includes Plan GPI Lists which have both Plan GPI List Notes and Plan GPI Notes
Given I am on RxClaim PlanAdministrator Menu
When  I select Option "CCT700" to navigate to "RxClaim Operations Menu"
And I select Option "2" to navigate to "RxClaim Batch Transaction Loads Menu" 
And I select Option "11" to navigate to "Create Export Files"
And I select Option "30" to navigate to "NDC/GPI List Exports"
And I select Option "6" to navigate to "Plan NDC List Export File"
And I enter "<NdcListFrom>","<NdcListThru>","<ExportVer>","<Library>","<File>"in Plan NDC List Export File screen
And I press "F6" Key
Then I validate the output file "<Library>","<File>" with notes
And I press "F12" Key
And  I select Option "CCT600" to navigate to "RxClaim Plan Administrator Menu"

Examples: 
|NdcListFrom|NdcListThru|ExportVer  |Library   |File      |
|S41697     |S41697     |83       |usrmadhu  |S41697_O2 |





