Feature: Part D Approved total DFTI not equal to submitted DFTI when OON differential is applied
As a RxClaim User I want to check claim is paid and validate the DFTI

  Scenario Outline: Verify that the logic for Additional Patient Pay Schedule Basis ‘C’ in DMR processing is updated for Plan type A- OON differential applied, Vaccine fee applied, Dispensing Fee calculated, Submitted DFT < Calculated DFT and Drug Spend Total is correct in TrOOP/Drug Spend Accumulation Phase for Plan type A- OON differential applied
   	Given I am on RxClaim PlanAdministrator Menu
   	When I select Option "4" to navigate to "RxClaim Plan Maintenance"
   	And I select Option "2" to navigate to "RxClaim Product List"
   	And I select Option "1" to navigate to "Active Plan GPI List by List"
   	Then I create GPI list with "<GPIList>","<AuditFlag>","<GPIName1>","<GPIName2>"
   	And I press "F12" Key
   	When I select Option "5" to navigate to "RxClaim Price Maintenance"
   	And I select Option "2" to navigate to "RxClaim Patient Pay Maintenance"
   	And I select Option "2" to navigate to "Patient Pay Table"
   	Then creating patient pay table with "<PATname>","<DueFlag>","<Code>","<BrandAmt>","<BrandCopay>","<GenericAmt>","<GenericCopay>"
   	And I press "F12" Key
   	And I select Option "1" to navigate to "Patient Pay Schedule"
   	Then create patient pay schedule with "<PATschedule>","<PATname>","<Sequence>"
   	And I press "F12" Key
   	When I select Option "1" to navigate to "RxClaim Price Schedule Maintenance"
   	And I select Option "13" to navigate to "Professional Service Fee Schedule"
   	Then creating PS fee schedule with "<PSFSchedule>","<Steps>","<Basis>","<Amount>","<Percent>","<PercentBasis>","<Feetable>","<FeeQualifier>","<FTSeq>"
   	When I select Option "4" to navigate to "Active Drug Cost Comparison Schedule"
   	Then copying the drug cost comparison schedule with "<DCSchedule>","<NewDCS>","<MedRate>","<SubRate>"
   	And I press "F12" Key
   	When I select Option "3" to navigate to "Drug Cost Schedule"
   	Then copying the drug cost schedule with "<DSchedule>","<NewDS>","<NewDCS>"
   	When I select Option "2" to navigate to "Active Price Table"
   	Then creating price table with "<PriceTable>","<FromDate>","<ThruDate>","<Source>","<PTCode>","<PricePercent>","<NewDS>","<Feetable>","<Taxschedule>","<PriceCode>","<DispFee>"
   	And I press "F12" Key
   	When I select Option "1" to navigate to "Price Schedule"
   	Then creating price schedule with "<Pricesched>","<Override>","<Seq>","<PriceTable>"
   	And I press "F12" Key
   	When I select Option "4" to navigate to "RxClaim Plan Maintenance"
   	And I select Option "1" to navigate to "Active Plan by Plan Code"
   	Then creating base plan and override plan with "<BasePlan>","<OverridePlan>","<FromDate>","<NDCList>","<ThruDate>","<NGSequence>","<GPIList>","<PriceFromDate>","<PriceThruDate>","<Pricesched>","<PATschedule>","<TroopSched>","<CMSList>"
   	And I press "F12" Key
   	When I create CarrierAccountGroup with "<CarrierID>","<CarrierName>","<Processor>","<MailingAdd>","<City>","<State>","<Zip>","<ContractFromDt>","<ContractThruDt>","<ContractEnt>","<BusinessType>","<AccountID>","<AccountName>","<GroupID>","<GroupName>","<GroupFromDt>","<GroupThruDt>","<BasePlan>"
		And I press "F12" Key
    And I press "F12" Key
    And I press "F12" Key
    And I press "F12" Key
    And I press "F12" Key
    And I press "F12" Key
    When I select Option "1" to navigate to "Eligibility/Claim Transaction Maintenance"
    And I select Option "2" to navigate to "Active/Eligible Member by ID"
    And I press "F6" Key
    And I enter "<CarrierID>" in field "CarrierID" on "AddMemberScreen"
    And I enter "<AccountID>" in field "AccountID" on "AddMemberScreen"
    And I enter "<GroupID>" in field "GroupID" on "AddMemberScreen"
    And I enter "<MemberID>" in field "MemberID" on "AddMemberScreen"
    And I press "Enter" Key
    And I enter "<First Name>" in field "FirstName" on "MemberDetailScreen"
    And I enter "<Last Name>" in field "LastName" on "MemberDetailScreen"
    And I enter "<DOB>" in field "DOB" on "MemberDetailScreen"
    And I enter "<ContractFromDt>" in field "FromDate" on "MemberDetailScreen"
    And I enter "<ContractThruDt>" in field "ThruDate" on "MemberDetailScreen"
    And I enter "Y" in field "FamilyFlag" on "MemberDetailScreen"
    And I press "F4" Key
    And I enter "X" in field "FtypeOption" on "MemberDetailScreen"
    And I press "Enter" Key
    And I enter "12001200" in field "ID" on "MemberDetailScreen"
    And I press "Enter" Key
    And I enter "Y" in field "CommandPrompt" on "MemberDetailScreen"
    And I press "F12" Key
    Then Validate "Member Added." message should displayed on "AddMemberScreen"
    And I press "F12" Key
    And I press "F3" Key
    And I press "F12" Key
    When I select Option "4" to navigate to "RxClaim Plan Maintenance"
    And I select Option "14" to navigate to "Medicare Part D Processing"
    And I select Option "16" to navigate to "Active Contract PBP Table"
    And I press "F6" Key
    When I create Contract PBP with "<CarrierID>","<Contract>","<PBP>","<FormularyID>","<Benefit_Year>","<SubmitterID>"
    And I select Option "1" to navigate to "Active Part D Master Profile"
    And I press "F6" Key
    When I create Part D profile with "<CarrierID>","<ContractFromDt>","<ContractThruDt>","<Contract>","<PBP>","<Benefit_Year>","<BasePlan>"
    And I press "F3" Key
    And I select Option "cct600" to navigate to "RxClaim Plan Administrator Menu"
    When I select Option "1" to navigate to "RxClaim Eligibility/Claim Transaction Maintenance"
    And I select Option "2" to navigate to "Active/Eligible Member by ID"
    And I enter "<MemberID>" in field "MemberID" on "ActiveEligibleMemberbyIDScreen"
    And I press "Enter" Key
    And I enter "2" in field "Selection" on "ActiveEligibleMemberbyIDScreen"
    And I press "Enter" Key
    And I press "F8" Key
    And I enter "10" in field "Selection" on "MemberDetailListScreen"
    And I press "Enter" Key
    And I enter "3" in field "Selection" on "MemberDetailListScreen"
    And I press "Enter" Key
    When I create active supplemental ID by type with "<ContractFromDt>","<ContractThruDt>","<SupplementalID>"
    And I enter "17" in field "Selection" on "MemberDetailListScreen"
    And I press "Enter" Key
    And I enter "4" in field "Selection" on "MemberDetailListScreen"
    And I press "Enter" Key 
    When I create active medicare part D with "<ContractFromDt>","<ContractThruDt>","<Contract>","<PBP>"
    And I press "F3" Key
    And I press "F3" Key
    And I press "F3" Key
    And I press "F12" Key
   	Then creating DMR claim with "<BIN>","<PCN>","<Group>","<Pharmacy>","<RxNbr>","<MemberID>","<First Name>","<Last Name>","<ProductID>","<DispQty>","<DS>","<PSC>","<Due>","<UCW>","<Cost>","<Inc>"
   	And Validating the price information screen
   	And I press "F3" Key
   	Then Validating the Drug spend total in Accum phase screen
   	
Examples:
|GPIList|AuditFlag|GPIName1|GPIName2|NDCList|PATname|DueFlag|Code|BrandAmt|BrandCopay|GenericAmt|GenericCopay|PATschedule|Sequence|PSFSchedule|Steps|Basis|Amount|Percent|PercentBasis|Feetable|FeeQualifier|FTSeq|DCSchedule|NewDCS|MedRate|SubRate|DSchedule|NewDS|PriceTable|FromDate|ThruDate|Source|PTCode|PricePercent|Taxschedule|PriceCode|DispFee|Pricesched|Override|Seq|BasePlan|OverridePlan|NGSequence|PriceFromDate|PriceThruDate|TroopSched|CMSList| CarrierID | CarrierName | Processor | MailingAdd | City      | State | Zip   | ContractFromDt | ContractThruDt | ContractEnt | BusinessType | AccountID | AccountName | GroupID  | GroupName | GroupFromDt | GroupThruDt | MemberID   | First Name | Last Name | DOB      | Contract | PBP | FormularyID | Benefit_Year | SubmitterID | SupplementalID |BIN|PCN|Group|Pharmacy|RxNbr|ProductID|DispQty|DS|PSC|Due|UCW|Cost|Inc|
|SR41720P|N|TET|ZOSTER|MPDDCS|SR41720PATN|N|L|47|CT30DS|47|CT30DS|SR41720P13|10|SR41720FSK|10|04|10|20|01|SR41720FTJ|C|10|EVUASHEDCCS|SR41720DCI|100|100|EVUASHEDCS|SR41720DI|SR41720PTG|010101|123139|MEDISPAN|AWP|85|IRXMD|p|1.3|SR41720PSG|01|10|41720B3|41720O6|10|010118|123118|SN003493|EVU28523| SR41720A6 | Carrier     |        712 | MAIL ADD   | Hyderabad | IL    | 78654 |         010101 |         123139 | *DEFAULT    | *DEFAULT     | SR41720A2 | Account     | SR41720A6 | Group     |      010101 |      123139 | SR41720A6 | AUTOMEM    | AUTOMEM   | 12251987 | A1004 | 100 | 10000 | 2018 | 10000 | 10001000 |777777|MSINTEST99|*|APHARM|900019901003|49281040015|1|1|0|125|125|80|45|