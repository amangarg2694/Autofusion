Feature: Part D Update Manufacturer Discount and Biosimilar Coverage in Gap
As a RxClaim User I want to Verify the Part D Update Manufacturer Discount and Biosimilar Coverage in Gap
 
 
 		@TC01_01        
   Scenario Outline: Verify the enrtries of 2019 and 2020 on the Cost-Sharing In Gap screen
    Given I am on RxClaim PlanAdministrator Menu 
    When I Navigate to Cost-Sharing In Gap screen "<PlanCode>"
    
    Examples:
   |PlanCode  |
   |SN003565P1|
   
     @TC01_02
    Scenario Outline: Verify the enrtries of 2019 and 2020 on the Cost-Sharing In Gap screen
    Then Validate Enrtries of 2019 and 2020 "<Year>","<BeneficiaryPercentage>","<PlanPercentage>","<BeneficiaryPercentageCostTax>","<BeneficiaryFee>","<PlanPercentageCostTax>","<PlanFee>","<MfrDiscPercentage>"
   
    Examples:
   | Year|BeneficiaryPercentage| PlanPercentage | BeneficiaryPercentageCostTax |BeneficiaryFee| PlanPercentageCostTax | PlanFee | MfrDiscPercentage|
	 | 2019|37                   |	63             | 95.00/                       | 25.00        | 5.00/                 | 75.00   | 70.00            |
   | 2020|25                   |	75             | 95.00/                       | 25.00        | 5.00/                 | 75.00   | 70.00            |
   
  	@TC02        
   Scenario Outline: Verify the label Coverage Gap Product List is changed to Biosimilar Product List in Plan Medicare screen
    When I am on Plan Medicare Screen
    Then Verify Biosimilar Product List options and Help Function Key "<BiosimilarProductListF1Text>"
    
    Examples:
   |BiosimilarProductListF1Text  |
   |Client selects the option to attach Product List to apply different Cost-Share rules for those specific products to the Medicare Plan. Flag 'Y' will allow attachment of Product List. Default is 'N' = NO |
        
   @TC03        
   Scenario Outline: Verify active records are displayed on Active Plan Biosimilar Product List screen
    When I am on Active Plan Biosimilar Product List Screen
    Then Verify active records are displayed "<FromDate>","<ThruDate>","<NDCList>","<GPIList>","<CoverageGapDiscount>","<LICSGenericCostShare>","<NonLICSCatastrophicGenericCostShare>"
    Examples:
   |FromDate|ThruDate|NDCList|GPIList|CoverageGapDiscount|LICSGenericCostShare|NonLICSCatastrophicGenericCostShare|
   |1/01/18|12/31/18|MPD BIOS|MPD BIOS|N|N|N|
   
   @TC04        
   Scenario Outline: Verify the from date field active records of Biosimilar Product Lists attached to Plan
    Then Verify From Date field and Help Function Key "<FromDateF1Text>"
    
    Examples:
   |FromDateF1Text|
   |The first date Biosimilar Product List is effective for the selected plan.|
   
   @TC05        
   Scenario Outline: Verify the thru date field active records of Biosimilar Product Lists attached to Plan
    Then Verify Thru Date field and Help Function Key "<ThruDateF1Text>"
    
    Examples:
   |ThruDateF1Text|
   |The last date Biosimilar Product List is effective for the selected plan.|
   
    @TC06        
   Scenario Outline: Verify the NDC List field active records of Biosimilar Product Lists attached to Plan
    Then Verify NDC List field and Help Function Key "<NDCListF1Text>"
    
    Examples:
   |NDCListF1Text|
   |NDC List used to identify biosimilar or interchangeable biological products.|
   
   @TC07        
   Scenario Outline: Verify the GPI List field active records of Biosimilar Product Lists attached to Plan
    Then Verify GPI List field and Help Function Key "<GPIListF1Text>"
    
    Examples:
   |GPIListF1Text|
   |GPI List used to identify biosimilar or interchangeable biological products.|
   
   @TC08        
   Scenario Outline: Verify the Coverage Gap Discount field active records of Biosimilar Product Lists attached to Plan
    Then Verify Coverage Gap Discount field and Help Function Key "<CoverageGapDiscountF1Text>"
    
    Examples:
   |CoverageGapDiscountF1Text|
   |Indicates if Manufacturer Discount is applicable to Non-LICS claim in coverage gap phase. Valid values are: N - No Coverage Gap discount is not applicable. Y - Yes Coverage Gap discount is applicable.|
   
   @TC09        
   Scenario Outline: Verify the LICS Generic Cost Share field active records of Biosimilar Product Lists attached to Plan
    Then Verify LICS Generic Cost Share field and Help Function Key "<LICSGenericCostShareF1Text>"
    
    Examples:
   |LICSGenericCostShareF1Text|
   |Indicates if Generic Cost-Share is applicable to LICS-eligible claim in all phases. Valid values are: N - No Cost-share is based on product attribute as defined by Plan, Medispan or Marketing Category. Y - Yes Generic Cost-Share is applicable.|
   
   @TC10        
   Scenario Outline: Verify the Non LICS Catastrophic Generic Cost Share field active records of Biosimilar Product Lists attached to Plan
    Then Verify Non LICS Catastrophic Generic Cost Share field and Help Function Key "<NonLICSCatastrophicGenericCostShareF1Text>"
    
    Examples:
   |NonLICSCatastrophicGenericCostShareF1Text|
   |Indicates if Generic Cost-Share is applicable to Non-LICS claim in catastrophic phase. Valid values are: N - No Cost-share is based on product attribute as defined by Plan, Medispan or Marketing Category. Y - Yes Generic Cost-Share is applicable.|
   
   @TC11        
   Scenario Outline: Verify all records are displayed on Plan Biosimilar Product List screen
    Then Verify all records are displayed "<FromDate>","<ThruDate>","<NDCList>","<GPIList>","<CoverageGapDiscount>","<LICSGenericCostShare>","<NonLICSCatastrophicGenericCostShare>","<Status>"
    Examples:
   |FromDate|ThruDate|NDCList|GPIList|CoverageGapDiscount|LICSGenericCostShare|NonLICSCatastrophicGenericCostShare|Status|
   |1/01/18|12/31/18|MPD BIOS|MPD BIOS|N|N|N|A|
   
   @TC12        
   Scenario Outline: Verify the from date field on all records of Biosimilar Product Lists attached to Plan
    Then Verify From Date field and Help Function Key "<FromDateF1Text>"
    
    Examples:
   |FromDateF1Text|
   |The first date Biosimilar Product List is effective for the selected plan.|
   
   @TC13        
   Scenario Outline: Verify the thru date field on all records of Biosimilar Product Lists attached to Plan
    Then Verify Thru Date field and Help Function Key "<ThruDateF1Text>"
    
    Examples:
   |ThruDateF1Text|
   |The last date Biosimilar Product List is effective for the selected plan.|
   
    @TC14        
   Scenario Outline: Verify the NDC List field on all records of Biosimilar Product Lists attached to Plan
    Then Verify NDC List field and Help Function Key "<NDCListF1Text>"
    
    Examples:
   |NDCListF1Text|
   |NDC List used to identify biosimilar or interchangeable biological products.|
   
   @TC15        
   Scenario Outline: Verify the GPI List field on all records of Biosimilar Product Lists attached to Plan
    Then Verify GPI List field and Help Function Key "<GPIListF1Text>"
    
    Examples:
   |GPIListF1Text|
   |GPI List used to identify biosimilar or interchangeable biological products.|
   
   @TC16        
   Scenario Outline: Verify the Coverage Gap Discount field on all records of Biosimilar Product Lists attached to Plan
    Then Verify Coverage Gap Discount field and Help Function Key "<CoverageGapDiscountF1Text>"
    
    Examples:
   |CoverageGapDiscountF1Text|
   |Indicates if Manufacturer Discount is applicable to Non-LICS claim in coverage gap phase. Valid values are: N - No Coverage Gap discount is not applicable. Y - Yes Coverage Gap discount is applicable.|
   
   @TC17        
   Scenario Outline: Verify the LICS Generic Cost Share field on all records of Biosimilar Product Lists attached to Plan
    Then Verify LICS Generic Cost Share field and Help Function Key "<LICSGenericCostShareF1Text>"
    
    Examples:
   |LICSGenericCostShareF1Text|
   |Indicates if Generic Cost-Share is applicable to LICS-eligible claim in all phases. Valid values are: N - No Cost-share is based on product attribute as defined by Plan, Medispan or Marketing Category. Y - Yes Generic Cost-Share is applicable.|
   
   @TC18        
   Scenario Outline: Verify the Non LICS Catastrophic Generic Cost Share field on all records of Biosimilar Product Lists attached to Plan
    Then Verify Non LICS Catastrophic Generic Cost Share field and Help Function Key "<NonLICSCatastrophicGenericCostShareF1Text>"
    
    Examples:
   |NonLICSCatastrophicGenericCostShareF1Text|
   |Indicates if Generic Cost-Share is applicable to Non-LICS claim in catastrophic phase. Valid values are: N - No Cost-share is based on product attribute as defined by Plan, Medispan or Marketing Category. Y - Yes Generic Cost-Share is applicable.|
   
   @TC19        
   Scenario Outline: Verify the Status field on all records of Biosimilar Product Lists attached to Plan
    Then Verify Status field and Help Function Key "<StatusF1Text>"
    
    Examples:
   |StatusF1Text|
   |Value that indicates if record is Active or Inactive.|
   
   @TC20        
   Scenario Outline: Verify error message on all records of Biosimilar Product Lists attached to Plan
    Then Verify error message on inactive record of Biosimilar Product Lists in Edit mode "<Editerrormsg>"
    
    Examples:
   |Editerrormsg|
   |Cannot edit inactive record.|
    @TC21        
   Scenario Outline: Verify error message on all records of Biosimilar Product Lists attached to Plan
    Then Verify error message on inactive record of Biosimilar Product Lists in Inactivate mode "<Inactiveerrormsg>"
    
    Examples:
   |Inactiveerrormsg|
   |Record is already inactive|
   
    @TC22        
   Scenario Outline: Verify all the fields on Add Plan Biosimilar Product List screen
    Given I am on RxClaim PlanAdministrator Menu
    When I am on Add Plan Biosimilar Product List Screen "<PlanCode>"
    Then  Verify all the fields on the screen "<FromDate>","<ThruDate>","<NDCList>","<GPIList>","<CoverageGapDiscount>","<LICSGenericCostShare>","<NonLICSCatastrophicGenericCostShare>"
    Examples:
   |PlanCode|FromDate|ThruDate|NDCList|GPIList|CoverageGapDiscount|LICSGenericCostShare|NonLICSCatastrophicGenericCostShare|
   |SN003565P2|010118|123118|MPD BIOS|MPD BIOS|N|N|N|
   
   @TC23        
   Scenario Outline: Verify the from date field on Add Biosimilar Product Lists attached to Plan
    Then Verify From Date field and Help Function Key on Add Plan Biosimilar Product List screen "<FromDateF1Text>"
    
    Examples:
   |FromDateF1Text|
   |The first date Biosimilar Product List is effective for the selected plan.|
   
   @TC24        
   Scenario Outline: Verify the thru date field on Add Biosimilar Product Lists attached to Plan
    Then Verify Thru Date field and Help Function Key on Add Plan Biosimilar Product List screen "<ThruDateF1Text>"
    
    Examples:
   |ThruDateF1Text|
   |The last date Biosimilar Product List is effective for the selected plan.|
   
    @TC25        
   Scenario Outline: Verify the NDC List field on Add Biosimilar Product Lists attached to Plan
    Then Verify NDC List field and Help Function Key on Add Plan Biosimilar Product List screen "<NDCListF1Text>"
    
    Examples:
   |NDCListF1Text|
   |NDC List used to identify biosimilar or interchangeable biological products.|
   
   @TC26        
   Scenario Outline: Verify the GPI List field on Add Biosimilar Product Lists attached to Plan
    Then Verify GPI List field and Help Function Key on Add Plan Biosimilar Product List screen "<GPIListF1Text>"
    
    Examples:
   |GPIListF1Text|
   |GPI List used to identify biosimilar or interchangeable biological products.|
   
   @TC27        
   Scenario Outline: Verify the Coverage Gap Discount field on Add Biosimilar Product Lists attached to Plan
    Then Verify Coverage Gap Discount field and Help Function Key on Add Plan Biosimilar Product List screen "<CoverageGapDiscountF1Text>"
    
    Examples:
   |CoverageGapDiscountF1Text|
   |Indicates if Manufacturer Discount is applicable to Non-LICS claim in coverage gap phase. Valid values are: N - No Coverage Gap discount is not applicable. Y - Yes Coverage Gap discount is applicable.|
   
   @TC28        
   Scenario Outline: Verify the LICS Generic Cost Share field on Add Biosimilar Product Lists attached to Plan
    Then Verify LICS Generic Cost Share field and Help Function Key on Add Plan Biosimilar Product List screen "<LICSGenericCostShareF1Text>"
    
    Examples:
   |LICSGenericCostShareF1Text|
   |Indicates if Generic Cost-Share is applicable to LICS-eligible claim in all phases. Valid values are: N - No Cost-share is based on product attribute as defined by Plan, Medispan or Marketing Category. Y - Yes Generic Cost-Share is applicable.|
   
   @TC29        
   Scenario Outline: Verify the Non LICS Catastrophic Generic Cost Share field on Add Biosimilar Product Lists attached to Plan
    Then Verify Non LICS Catastrophic Generic Cost Share field and Help Function Key on Add Plan Biosimilar Product List screen "<NonLICSCatastrophicGenericCostShareF1Text>"
    
    Examples:
   |NonLICSCatastrophicGenericCostShareF1Text|
   |Indicates if Generic Cost-Share is applicable to Non-LICS claim in catastrophic phase. Valid values are: N - No Cost-share is based on product attribute as defined by Plan, Medispan or Marketing Category. Y - Yes Generic Cost-Share is applicable.|
   
   @TC30        
   Scenario Outline: Verify error message on Add Plan Biosimilar Product List screen for Thru date field
    Then Verify Thru Date field on Add Plan Biosimilar Product List screen "<ThruDate>", "<Errormsg>"
    
    Examples:
   |ThruDate|Errormsg|
   |010117|Date Thru cannot be more than one day less than Date From|
   
   @TC31        
   Scenario Outline: Verify error message on Add Plan Biosimilar Product List screen for Both NDC List and GPI List are blank fields
    Then Verify Both NDC List and GPI List are blank fields on Add Plan Biosimilar Product List screen "<Errormsg>"
    
    Examples:
   |Errormsg|
   |At least one list must be populated.|
   
    @TC32        
   Scenario Outline: Verify error message on Add Plan Biosimilar Product List screen for Thru date field
    Then Verify NDC List field which is not in master file  on Add Plan Biosimilar Product List screen "<NDCList>", "<Errormsg>"
    
    Examples:
   |NDCList|Errormsg|
   |NDCTEST|NDC List not found.|
   
    @TC33        
   Scenario Outline: Verify error message on Add Plan Biosimilar Product List screen for Thru date field
    Then Verify GPI List field which is not in master file  on Add Plan Biosimilar Product List screen  "<NDCList>","<GPIList>", "<Errormsg>"
    
    Examples:
   |NDCList|GPIList|Errormsg|
   |MPD BIOS|GPI TEST|GPI List GPI TEST not found.|
   
   @TC34        
   Scenario Outline: Verify error message on Add Plan Biosimilar Product List screen for Thru date field
    Then Verify A required field is blank on Add Plan Biosimilar Product List screen   "<Errormsg>"
    
    Examples:
   |Errormsg|
   |Value Required|
   
    @TC35        
   Scenario Outline: Verify all the fields on Edit Option of Plan Biosimilar Product List screen 
    When I am on Edit Option of Plan Biosimilar Product List screen
    Then  Verify all the fields on the screen "<FromDate>","<ThruDate>","<NDCList>","<GPIList>","<CoverageGapDiscount>","<LICSGenericCostShare>","<NonLICSCatastrophicGenericCostShare>"
    Examples:
   |FromDate|ThruDate|NDCList|GPIList|CoverageGapDiscount|LICSGenericCostShare|NonLICSCatastrophicGenericCostShare|
   |10118|123118|MPD BIOS|MPD BIOS|N|N|N|
   
   @TC36        
   Scenario Outline: Verify the from date field on Edit Option Biosimilar Product Lists attached to Plan
    Then Verify From Date field and Help Function Key on Add Plan Biosimilar Product List screen "<FromDateF1Text>"
    
    Examples:
   |FromDateF1Text|
   |The first date Biosimilar Product List is effective for the selected plan.|
   
   @TC37        
   Scenario Outline: Verify the thru date field on Edit Option Biosimilar Product Lists attached to Plan
    Then Verify Thru Date field and Help Function Key on Add Plan Biosimilar Product List screen "<ThruDateF1Text>"
    
    Examples:
   |ThruDateF1Text|
   |The last date Biosimilar Product List is effective for the selected plan.|
   
    @TC38        
   Scenario Outline: Verify the NDC List field on Edit Option Biosimilar Product Lists attached to Plan
    Then Verify NDC List field and Help Function Key on Add Plan Biosimilar Product List screen "<NDCListF1Text>"
    
    Examples:
   |NDCListF1Text|
   |NDC List used to identify biosimilar or interchangeable biological products.|
   
   @TC39        
   Scenario Outline: Verify the GPI List field on Edit Option Biosimilar Product Lists attached to Plan
    Then Verify GPI List field and Help Function Key on Add Plan Biosimilar Product List screen "<GPIListF1Text>"
    
    Examples:
   |GPIListF1Text|
   |GPI List used to identify biosimilar or interchangeable biological products.|
   
   @TC40        
   Scenario Outline: Verify the Coverage Gap Discount field on Edit Option Biosimilar Product Lists attached to Plan
    Then Verify Coverage Gap Discount field and Help Function Key on Add Plan Biosimilar Product List screen "<CoverageGapDiscountF1Text>"
    
    Examples:
   |CoverageGapDiscountF1Text|
   |Indicates if Manufacturer Discount is applicable to Non-LICS claim in coverage gap phase. Valid values are: N - No Coverage Gap discount is not applicable. Y - Yes Coverage Gap discount is applicable.|
   
   @TC41        
   Scenario Outline: Verify the LICS Generic Cost Share field on Edit Option Biosimilar Product Lists attached to Plan
    Then Verify LICS Generic Cost Share field and Help Function Key on Add Plan Biosimilar Product List screen "<LICSGenericCostShareF1Text>"
    
    Examples:
   |LICSGenericCostShareF1Text|
   |Indicates if Generic Cost-Share is applicable to LICS-eligible claim in all phases. Valid values are: N - No Cost-share is based on product attribute as defined by Plan, Medispan or Marketing Category. Y - Yes Generic Cost-Share is applicable.|
   
   @TC42        
   Scenario Outline: Verify the Non LICS Catastrophic Generic Cost Share field on Edit Option Biosimilar Product Lists attached to Plan
    Then Verify Non LICS Catastrophic Generic Cost Share field and Help Function Key on Add Plan Biosimilar Product List screen "<NonLICSCatastrophicGenericCostShareF1Text>"
    
    Examples:
   |NonLICSCatastrophicGenericCostShareF1Text|
   |Indicates if Generic Cost-Share is applicable to Non-LICS claim in catastrophic phase. Valid values are: N - No Cost-share is based on product attribute as defined by Plan, Medispan or Marketing Category. Y - Yes Generic Cost-Share is applicable.|
   
   @TC43        
   Scenario Outline: Verify the Status field on Edit Option Biosimilar Product Lists attached to Plan
    Then Verify Status field and Help Function Key on Edit Option Plan Biosimilar Product List screen "<StatusF1Text>"
    
    Examples:
   |StatusF1Text|
   |Value that indicates if record is Active or Inactive.|
   
   @TC44        
   Scenario Outline: Verify error message on Edit Option Plan Biosimilar Product List screen for Thru date field
    Then Verify Thru Date field on Add Plan Biosimilar Product List screen "<ThruDate>", "<Errormsg>"
    
    Examples:
   |ThruDate|Errormsg|
   |010117|Date Thru cannot be more than one day less than Date From|
   
   @TC45        
   Scenario Outline: Verify error message on Edit Option Plan Biosimilar Product List screen for Both NDC List and GPI List are blank fields
    Then Verify Both NDC List and GPI List are blank fields on Add Plan Biosimilar Product List screen "<Errormsg>"
    
    Examples:
   |Errormsg|
   |At least one list must be populated.|
   
    @TC46        
   Scenario Outline: Verify error message on Edit Option Plan Biosimilar Product List screen for Thru date field
    Then Verify NDC List field which is not in master file  on Add Plan Biosimilar Product List screen "<NDCList>", "<Errormsg>"
    
    Examples:
   |NDCList|Errormsg|
   |NDCTEST|NDC List not found.|
   
    @TC47        
   Scenario Outline: Verify error message on Edit Option Plan Biosimilar Product List screen for Thru date field
    Then Verify GPI List field which is not in master file  on Add Plan Biosimilar Product List screen  "<NDCList>","<GPIList>", "<Errormsg>"
    
    Examples:
   |NDCList|GPIList|Errormsg|
   |MPD BIOS|GPI TEST|GPI List GPI TEST not found.|
   
   @TC48        
   Scenario Outline: Verify error message on Edit Option Plan Biosimilar Product List screen for Thru date field
    Then Verify A required field is blank on Add Plan Biosimilar Product List screen   "<Errormsg>"
    
    Examples:
   |Errormsg|
   |Value Required|
   
   @TC49        
   Scenario Outline: Verify all the fields on Dispay Option of Plan Biosimilar Product List screen 
    When I am on Display Option of Plan Biosimilar Product List screen
    Then  Verify all the fields on the display screen "<FromDate>","<ThruDate>","<NDCList>","<GPIList>","<CoverageGapDiscount>","<LICSGenericCostShare>","<NonLICSCatastrophicGenericCostShare>"
    Examples:
   |FromDate|ThruDate|NDCList|GPIList|CoverageGapDiscount|LICSGenericCostShare|NonLICSCatastrophicGenericCostShare|
   |1/01/18|12/31/18|MPD BIOS|MPD BIOS|N|N|N|
   
    @TC50        
   Scenario Outline: Verify the from date field on Dispay Option Biosimilar Product Lists attached to Plan
    Then Verify From Date field and Help Function Key on Add Plan Biosimilar Product List screen "<FromDateF1Text>"
    
    Examples:
   |FromDateF1Text|
   |The first date Biosimilar Product List is effective for the selected plan.|
   
   @TC51        
   Scenario Outline: Verify the thru date field on Dispay Option Biosimilar Product Lists attached to Plan
    Then Verify Thru Date field and Help Function Key on Add Plan Biosimilar Product List screen "<ThruDateF1Text>"
    
    Examples:
   |ThruDateF1Text|
   |The last date Biosimilar Product List is effective for the selected plan.|
   
    @TC52        
   Scenario Outline: Verify the NDC List field on Dispay Option Biosimilar Product Lists attached to Plan
    Then Verify NDC List field and Help Function Key on Add Plan Biosimilar Product List screen "<NDCListF1Text>"
    
    Examples:
   |NDCListF1Text|
   |NDC List used to identify biosimilar or interchangeable biological products.|
   
   @TC53        
   Scenario Outline: Verify the GPI List field on Dispay Option Biosimilar Product Lists attached to Plan
    Then Verify GPI List field and Help Function Key on Add Plan Biosimilar Product List screen "<GPIListF1Text>"
    
    Examples:
   |GPIListF1Text|
   |GPI List used to identify biosimilar or interchangeable biological products.|
   
   @TC54        
   Scenario Outline: Verify the Coverage Gap Discount field on Dispay Option Biosimilar Product Lists attached to Plan
    Then Verify Coverage Gap Discount field and Help Function Key on Add Plan Biosimilar Product List screen "<CoverageGapDiscountF1Text>"
    
    Examples:
   |CoverageGapDiscountF1Text|
   |Indicates if Manufacturer Discount is applicable to Non-LICS claim in coverage gap phase. Valid values are: N - No Coverage Gap discount is not applicable. Y - Yes Coverage Gap discount is applicable.|
   
   @TC55        
   Scenario Outline: Verify the LICS Generic Cost Share field on Dispay Option Biosimilar Product Lists attached to Plan
    Then Verify LICS Generic Cost Share field and Help Function Key on Add Plan Biosimilar Product List screen "<LICSGenericCostShareF1Text>"
    
    Examples:
   |LICSGenericCostShareF1Text|
   |Indicates if Generic Cost-Share is applicable to LICS-eligible claim in all phases. Valid values are: N - No Cost-share is based on product attribute as defined by Plan, Medispan or Marketing Category. Y - Yes Generic Cost-Share is applicable.|
   
   @TC56        
   Scenario Outline: Verify the Non LICS Catastrophic Generic Cost Share field on Dispay Option Biosimilar Product Lists attached to Plan
    Then Verify Non LICS Catastrophic Generic Cost Share field and Help Function Key on Add Plan Biosimilar Product List screen "<NonLICSCatastrophicGenericCostShareF1Text>"
    
    Examples:
   |NonLICSCatastrophicGenericCostShareF1Text|
   |Indicates if Generic Cost-Share is applicable to Non-LICS claim in catastrophic phase. Valid values are: N - No Cost-share is based on product attribute as defined by Plan, Medispan or Marketing Category. Y - Yes Generic Cost-Share is applicable.|
   
   @TC57        
   Scenario Outline: Verify the Status field on Dispay Option Biosimilar Product Lists attached to Plan
    Then Verify Status field and Help Function Key on Edit Option Plan Biosimilar Product List screen "<StatusF1Text>"
    
    Examples:
   |StatusF1Text|
   |Value that indicates if record is Active or Inactive.|
   
    @TC58        
   Scenario Outline: Verify the copy plan function is updated
    Then Verify the copy plan function is updated "<SourcePlan>","<TargetPlan>"
    Then Verify active records are displayed "<FromDate>","<ThruDate>","<NDCList>","<GPIList>","<CoverageGapDiscount>","<LICSGenericCostShare>","<NonLICSCatastrophicGenericCostShare>"
    Examples:
   |SourcePlan|TargetPlan|FromDate|ThruDate|NDCList|GPIList|CoverageGapDiscount|LICSGenericCostShare|NonLICSCatastrophicGenericCostShare|
   |SN003565P1|SRTSTCOPY2|1/01/18|12/31/18|MPD BIOS|MPD BIOS|N|N|N|
