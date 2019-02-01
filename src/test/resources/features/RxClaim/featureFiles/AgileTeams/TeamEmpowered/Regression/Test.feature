Feature: Create DPA

  Scenario Outline: Create DPA 
   
   	Given I am on RxClaim PlanAdministrator Menu   	
   	When I select Option "4" to navigate to "RxClaim Plan Maintenance"
    And I select Option "4" to navigate to "RxClaim Dynamic Prior authorization"
    And I select Option "1" to navigate to "Dynamic Prior authorization"
    And I create Dynamic Prior Authorization "<Carrier>","<Submitted PA MC Code>","<Submitted PA>","<Description>","<Nbr Fills>","<Usage Type>","<Apply MIC>","<Type>","<From Basis>","<Thru Basis>","<Reason Code>","<Agent>","<Utilisation>","<WildCard>","<Write PA>","<Ignore Drug Sts>"
   # And I enter "<Usage Type>" in field "UsageType" on "DynamicPriorAuthorizationDetailScreen"
   # And I enter "<Apply MIC>" in field "ApplyMIC" on "DynamicPriorAuthorizationDetailScreen"
   # And I enter "<Type>" in field "Type" on "DynamicPriorAuthorizationDetailScreen"
   # And I enter "<From Basis>" in field "FromBasis" on "DynamicPriorAuthorizationDetailScreen"
   # And I enter "<Thru Basis>" in field "ThruBasis" on "DynamicPriorAuthorizationDetailScreen"
   # And I enter "<Reason Code>" in field "ReasonCode" on "DynamicPriorAuthorizationDetailScreen"
   # And I enter "<Agent>" in field "Agent" on "DynamicPriorAuthorizationDetailScreen"
   # And I enter "<Utilisation>" in field "Utilisation" on "DynamicPriorAuthorizationDetailScreen"
   # And I enter "<WildCard>" in field "WildCard" on "DynamicPriorAuthorizationDetailScreen"
   # And I enter "<Write PA>" in field "WritePA" on "DynamicPriorAuthorizationDetailScreen"
   # And I enter "<Ignore Drug Sts>" in field "IgnoreDrugSts" on "DynamicPriorAuthorizationDetailScreen"
   # And I press "Enter" Key
    And I press "F7" Key 
    And I press "PageDown" Key  
    And I set "DURFlag" to "<DUR Flag>"
    And I press "F8" Key 
    And I set "HighDoseFlag" to "<High Dose Flag>"
    And I press "PageDown" Key 
    And I set "OverrideFlag" to "<Override Flag>"
    And I set "MEDLIMITOverride" to "<Medlimit Override>"
    And I set "NTTPerFillDS" to "<NTT Per Fill DS>"
     
    Examples:
   |Submitted PA |Carrier   |Account   | Group    |Submitted PA MC Code |Description    |Nbr Fills|Usage Type |Apply MIC  |Type|From Basis|Thru Basis|Reason Code  |Agent|Utilisation |WildCard|Write PA|Ignore Drug Sts|PA NDC List|PA GPI List   |DUR Flag|High Dose Flag |Override Flag |Medlimit Override |NTT Per Fill DS|List       |List Name      |From Date |Thru Date |Submitted PA Flag |Provider |Prescriber |Prescription |Member |Max List Fills|
   |36909280001  |AUTOC3690	|AUTO3690A |AUTO3690G |1                    |DPA Automation |         |1          |N          |G   |D         |D         |AA           |a    |Y           |0       |Y       |N              |           |              |Y       |Y              |Y             |                  |                |DPA928RJ1 |DUR Automation |010101    |123139    |N                 |N        |N          |N            |N      |0             |
   |36909280002  |AUTOC3690	|AUTO3690A |AUTO3690G |1                    |DPA Automation |         |1          |N          |G   |D         |D         |AA           |a    |Y           |0       |Y       |N              |           |              |T       |               |Y             |                  |                |DPA928RJ1 |DUR Automation |010101    |123139    |N                 |N        |N          |N            |N      |0             |
   |36909220001  |AUTOC3690	|AUTO3690A |AUTO3690G |1                    |DPA Automation |         |1          |N          |G   |D         |D         |AA           |a    |Y           |0       |Y       |N              |           |              |Y       |               |Y             |                  |                |DPA928RJ1 |DUR Automation |010101    |123139    |N                 |N        |N          |N            |N      |0             |
   |36909220002  |AUTOC3690	|AUTO3690A |AUTO3690G |1                    |DPA Automation |         |1          |N          |G   |D         |D         |AA           |a    |Y           |0       |Y       |N              |           |              |T       |               |Y             |                  |                |DPA928RJ1 |DUR Automation |010101    |123139    |N                 |N        |N          |N            |N      |0             |  
   |36909220003  |AUTOC3690	|AUTO3690A |AUTO3690G |1                    |DPA Automation |         |1          |N          |G   |D         |D         |AA           |a    |Y           |0       |Y       |N              |           |              |T       |               |O             |                  |                |DPA928RJ1 |DUR Automation |010101    |123139    |N                 |N        |N          |N            |N      |0             |  
   |DPTEST123    |AUTOC3690	|AUTO3690A |AUTO3690G |1                    |DPA Automation |         |1          |N          |G   |D         |D         |OJ           |T    |Y           |0       |Y       |N              |           |              |Y       |               |Y             |                  |                |DPA928RJ1 |DUR Automation |010101    |123139    |N                 |N        |N          |N            |N      |0             |
   |DPTEST124    |AUTOC3690	|AUTO3690A |AUTO3690G |1                    |DPA Automation |         |1          |N          |G   |D         |D         |OJ           |T    |Y           |0       |Y       |N              |           |              |        |               |Y             |                  |                |DPA928RJ1 |DUR Automation |010101    |123139    |N                 |N        |N          |N            |N      |0             |
   |DPTEST125    |AUTOC3690	|AUTO3690A |AUTO3690G |1                    |DPA Automation |         |1          |N          |G   |D         |D         |OJ           |T    |Y           |0       |Y       |N              |           |              |        |               |O             |500               |                |DPA928RJ1 |DUR Automation |010101    |123139    |N                 |N        |N          |N            |N      |0             |
   |DPTEST126    |AUTOC3690	|AUTO3690A |AUTO3690G |1                    |DPA Automation |         |1          |N          |G   |D         |D         |OJ           |T    |Y           |0       |Y       |N              |           |              |        |               |O             |500               |12              |DPA928RJ1 |DUR Automation |010101    |123139    |N                 |N        |N          |N            |N      |0             |
   |DPTEST127    |AUTOC3690	|AUTO3690A |AUTO3690G |1                    |DPA Automation |         |1          |N          |G   |D         |D         |OJ           |T    |Y           |0       |Y       |N              |           |              |        |               |O             |500               |                |DPA928RJ1 |DUR Automation |010101    |123139    |N                 |N        |N          |N            |N      |0             |
  