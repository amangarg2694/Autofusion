Feature: Create a DUR Table
As a RxClaim User I want to create a New DUR Table
    
             
   Scenario Outline: Create a new DUR Table in RxClaim 
    Given I am on RxClaim PlanAdministrator Menu 
    When I create DUR Table with "<DUR Table>","<Description>","<DUR Status>","<DURPPSRequired>","<ServiceOverrideTable>","<DUR ServiceType>","<MED GPI List>","<Excl Pat Res Code List>","<MED Look Back Period>","<Per Fill DS>","<Per Fill Response>","<PerFill Message Code>","<Excl Diagnosis Code List>","<Excl Diagnosi Code>","<Excl GPI List>","<Excl Taxonomy List>","<Taxonomy MedLimit>","<DUR PharmacyResponse>","<MED TaxonomyList>","<Percentage Therapeutic>","<MED Limit>","<DUR Service Response>","<Message Code>","<Prescriber Threshold>","<Pharmacy Threshold>","<Service Qualifier>","<Service New Member>","<Service IR>"
    Then Validate DUR Table "<DUR Table>" created
    
    Examples:
    | DUR Table| Description |DUR Status| DURPPSRequired | ServiceOverrideTable |DUR ServiceType | MED GPI List| Excl Pat Res Code List | MED Look Back Period | Per Fill DS | Per Fill Response |PerFill Message Code | Excl Diagnosis Code List |Excl Diagnosi Code | Excl GPI List | Excl Taxonomy List | Taxonomy MedLimit |DUR PharmacyResponse | MED TaxonomyList | Percentage Therapeutic| MED Limit| DUR Service Response| Message Code      | Prescriber Threshold| Pharmacy Threshold| Service Qualifier| Service New Member| Service IR |
		| Sep1007  | Test Dur    |ON        | No             |                      |MEDLIMIT        | FTAUTODUR   | AUTODUR                | 120                  | 7           | S                 |                     | AUTOL1                   |B                  | AUTODUR       | AUTOL1             | 500               |S                    | AUTOL1           | 10                    |90,49,.01 | H,S,S               | , ,IRYMSG,TESTMSG | 2,0,0               |2,0,0              | S, , ,           | , ,Y,Y            | , ,Y, ,    |
		