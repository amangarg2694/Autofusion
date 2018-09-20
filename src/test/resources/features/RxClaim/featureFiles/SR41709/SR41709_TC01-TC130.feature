Feature: Part D Update Manufacturer Discount and Biosimilar Coverage in Gap
As a RxClaim User I want to Verify the Part D Update Manufacturer Discount and Biosimilar Coverage in Gap
    
     #@TC01_01        
   #Scenario Outline: Verify the enrtries of 2019 and 2020 on the Cost-Sharing In Gap screen
    #Given I am on RxClaim PlanAdministrator Menu 
    #When I Navigate to Cost-Sharing In Gap screen "<PlanCode>"
    #
    #Examples:
   #|PlanCode  |
   #|SN003565P1|
   #
     #@TC01_02
    #Scenario Outline: Verify the enrtries of 2019 and 2020 on the Cost-Sharing In Gap screen
    #Then Validate Enrtries of 2019 and 2020 "<Year>","<BeneficiaryPercentage>","<PlanPercentage>","<BeneficiaryPercentageCostTax>","<BeneficiaryFee>","<PlanPercentageCostTax>","<PlanFee>","<MfrDiscPercentage>"
   #
    #Examples:
   #| Year|BeneficiaryPercentage| PlanPercentage | BeneficiaryPercentageCostTax |BeneficiaryFee| PlanPercentageCostTax | PlanFee | MfrDiscPercentage|
#	 | 2019|37                   |	63             | 95.00/                       | 25.00        | 5.00/                 | 75.00   | 70.00            |
   #| 2020|25                   |	75             | 95.00/                       | 25.00        | 5.00/                 | 75.00   | 70.00            |
   #
  #	@TC02        
   #Scenario Outline: Verify the label Coverage Gap Product List is changed to Biosimilar Product List in Plan Medicare screen
    #When I am on Plan Medicare Screen
    #Then Verify Biosimilar Product List options and Help Function Key "<BiosimilarProductListF1Text>"
    #
    #Examples:
   #|BiosimilarProductListF1Text  |
   #|Client selects the option to attach Product List to apply different Cost-Share rules for those specific products to the Medicare Plan. Flag 'Y' will allow attachment of Product List. Default is 'N' = NO |
        #
   #@TC03        
   #Scenario Outline: Verify active records are displayed on Active Plan Biosimilar Product List screen
    #When I am on Active Plan Biosimilar Product List Screen
    #Then Verify active records are displayed "<FromDate>","<ThruDate>","<NDCList>","<GPIList>","<CoverageGapDiscount>","<LICSGenericCostShare>","<NonLICSCatastrophicGenericCostShare>"
    #Examples:
   #|FromDate|ThruDate|NDCList|GPIList|CoverageGapDiscount|LICSGenericCostShare|NonLICSCatastrophicGenericCostShare|
   #|1/01/18|12/31/18|MPD BIOS|MPD BIOS|N|N|N|
   #
   #@TC04        
   #Scenario Outline: Verify the from date field active records of Biosimilar Product Lists attached to Plan
    #Then Verify From Date field and Help Function Key "<FromDateF1Text>"
    #
    #Examples:
   #|FromDateF1Text|
   #|The first date Biosimilar Product List is effective for the selected plan.|
   #
   #@TC05        
   #Scenario Outline: Verify the thru date field active records of Biosimilar Product Lists attached to Plan
    #Then Verify Thru Date field and Help Function Key "<ThruDateF1Text>"
    #
    #Examples:
   #|ThruDateF1Text|
   #|The last date Biosimilar Product List is effective for the selected plan.|
   #
    #@TC06        
   #Scenario Outline: Verify the NDC List field active records of Biosimilar Product Lists attached to Plan
    #Then Verify NDC List field and Help Function Key "<NDCListF1Text>"
    #
    #Examples:
   #|NDCListF1Text|
   #|NDC List used to identify biosimilar or interchangeable biological products.|
   #
   #@TC07        
   #Scenario Outline: Verify the GPI List field active records of Biosimilar Product Lists attached to Plan
    #Then Verify GPI List field and Help Function Key "<GPIListF1Text>"
    #
    #Examples:
   #|GPIListF1Text|
   #|GPI List used to identify biosimilar or interchangeable biological products.|
   #
   #@TC08        
   #Scenario Outline: Verify the Coverage Gap Discount field active records of Biosimilar Product Lists attached to Plan
    #Then Verify Coverage Gap Discount field and Help Function Key "<CoverageGapDiscountF1Text>"
    #
    #Examples:
   #|CoverageGapDiscountF1Text|
   #|Indicates if Manufacturer Discount is applicable to Non-LICS claim in coverage gap phase. Valid values are: N - No Coverage Gap discount is not applicable. Y - Yes Coverage Gap discount is applicable.|
   #
   #@TC09        
   #Scenario Outline: Verify the LICS Generic Cost Share field active records of Biosimilar Product Lists attached to Plan
    #Then Verify LICS Generic Cost Share field and Help Function Key "<LICSGenericCostShareF1Text>"
    #
    #Examples:
   #|LICSGenericCostShareF1Text|
   #|Indicates if Generic Cost-Share is applicable to LICS-eligible claim in all phases. Valid values are: N - No Cost-share is based on product attribute as defined by Plan, Medispan or Marketing Category. Y - Yes Generic Cost-Share is applicable.|
   #
   #@TC10        
   #Scenario Outline: Verify the Non LICS Catastrophic Generic Cost Share field active records of Biosimilar Product Lists attached to Plan
    #Then Verify Non LICS Catastrophic Generic Cost Share field and Help Function Key "<NonLICSCatastrophicGenericCostShareF1Text>"
    #
    #Examples:
   #|NonLICSCatastrophicGenericCostShareF1Text|
   #|Indicates if Generic Cost-Share is applicable to Non-LICS claim in catastrophic phase. Valid values are: N - No Cost-share is based on product attribute as defined by Plan, Medispan or Marketing Category. Y - Yes Generic Cost-Share is applicable.|
   #
   #@TC11        
   #Scenario Outline: Verify all records are displayed on Plan Biosimilar Product List screen
    #Then Verify all records are displayed "<FromDate>","<ThruDate>","<NDCList>","<GPIList>","<CoverageGapDiscount>","<LICSGenericCostShare>","<NonLICSCatastrophicGenericCostShare>","<Status>"
    #Examples:
   #|FromDate|ThruDate|NDCList|GPIList|CoverageGapDiscount|LICSGenericCostShare|NonLICSCatastrophicGenericCostShare|Status|
   #|1/01/18|12/31/18|MPD BIOS|MPD BIOS|N|N|N|A|
   #
   #@TC12        
   #Scenario Outline: Verify the from date field on all records of Biosimilar Product Lists attached to Plan
    #Then Verify From Date field and Help Function Key "<FromDateF1Text>"
    #
    #Examples:
   #|FromDateF1Text|
   #|The first date Biosimilar Product List is effective for the selected plan.|
   #
   #@TC13        
   #Scenario Outline: Verify the thru date field on all records of Biosimilar Product Lists attached to Plan
    #Then Verify Thru Date field and Help Function Key "<ThruDateF1Text>"
    #
    #Examples:
   #|ThruDateF1Text|
   #|The last date Biosimilar Product List is effective for the selected plan.|
   #
    #@TC14        
   #Scenario Outline: Verify the NDC List field on all records of Biosimilar Product Lists attached to Plan
    #Then Verify NDC List field and Help Function Key "<NDCListF1Text>"
    #
    #Examples:
   #|NDCListF1Text|
   #|NDC List used to identify biosimilar or interchangeable biological products.|
   #
   #@TC15        
   #Scenario Outline: Verify the GPI List field on all records of Biosimilar Product Lists attached to Plan
    #Then Verify GPI List field and Help Function Key "<GPIListF1Text>"
    #
    #Examples:
   #|GPIListF1Text|
   #|GPI List used to identify biosimilar or interchangeable biological products.|
   #
   #@TC16        
   #Scenario Outline: Verify the Coverage Gap Discount field on all records of Biosimilar Product Lists attached to Plan
    #Then Verify Coverage Gap Discount field and Help Function Key "<CoverageGapDiscountF1Text>"
    #
    #Examples:
   #|CoverageGapDiscountF1Text|
   #|Indicates if Manufacturer Discount is applicable to Non-LICS claim in coverage gap phase. Valid values are: N - No Coverage Gap discount is not applicable. Y - Yes Coverage Gap discount is applicable.|
   #
   #@TC17        
   #Scenario Outline: Verify the LICS Generic Cost Share field on all records of Biosimilar Product Lists attached to Plan
    #Then Verify LICS Generic Cost Share field and Help Function Key "<LICSGenericCostShareF1Text>"
    #
    #Examples:
   #|LICSGenericCostShareF1Text|
   #|Indicates if Generic Cost-Share is applicable to LICS-eligible claim in all phases. Valid values are: N - No Cost-share is based on product attribute as defined by Plan, Medispan or Marketing Category. Y - Yes Generic Cost-Share is applicable.|
   #
   #@TC18        
   #Scenario Outline: Verify the Non LICS Catastrophic Generic Cost Share field on all records of Biosimilar Product Lists attached to Plan
    #Then Verify Non LICS Catastrophic Generic Cost Share field and Help Function Key "<NonLICSCatastrophicGenericCostShareF1Text>"
    #
    #Examples:
   #|NonLICSCatastrophicGenericCostShareF1Text|
   #|Indicates if Generic Cost-Share is applicable to Non-LICS claim in catastrophic phase. Valid values are: N - No Cost-share is based on product attribute as defined by Plan, Medispan or Marketing Category. Y - Yes Generic Cost-Share is applicable.|
   #
   #@TC19        
   #Scenario Outline: Verify the Status field on all records of Biosimilar Product Lists attached to Plan
    #Then Verify Status field and Help Function Key "<StatusF1Text>"
    #
    #Examples:
   #|StatusF1Text|
   #|Value that indicates if record is Active or Inactive.|
   #
   #@TC20        
   #Scenario Outline: Verify error message on all records of Biosimilar Product Lists attached to Plan
    #Then Verify error message on inactive record of Biosimilar Product Lists in Edit mode "<Editerrormsg>"
    #
    #Examples:
   #|Editerrormsg|
   #|Cannot edit inactive record.|
    #@TC21        
   #Scenario Outline: Verify error message on all records of Biosimilar Product Lists attached to Plan
    #Then Verify error message on inactive record of Biosimilar Product Lists in Inactivate mode "<Inactiveerrormsg>"
    #
    #Examples:
   #|Inactiveerrormsg|
   #|Record is already inactive|
   #
    #@TC22        
   #Scenario Outline: Verify all the fields on Add Plan Biosimilar Product List screen
    #Given I am on RxClaim PlanAdministrator Menu
    #When I am on Add Plan Biosimilar Product List Screen "<PlanCode>"
    #Then  Verify all the fields on the screen "<FromDate>","<ThruDate>","<NDCList>","<GPIList>","<CoverageGapDiscount>","<LICSGenericCostShare>","<NonLICSCatastrophicGenericCostShare>"
    #Examples:
   #|PlanCode|FromDate|ThruDate|NDCList|GPIList|CoverageGapDiscount|LICSGenericCostShare|NonLICSCatastrophicGenericCostShare|
   #|SN003565P2|010118|123118|MPD BIOS|MPD BIOS|N|N|N|
   #
   #@TC23        
   #Scenario Outline: Verify the from date field on Add Biosimilar Product Lists attached to Plan
    #Then Verify From Date field and Help Function Key on Add Plan Biosimilar Product List screen "<FromDateF1Text>"
    #
    #Examples:
   #|FromDateF1Text|
   #|The first date Biosimilar Product List is effective for the selected plan.|
   #
   #@TC24        
   #Scenario Outline: Verify the thru date field on Add Biosimilar Product Lists attached to Plan
    #Then Verify Thru Date field and Help Function Key on Add Plan Biosimilar Product List screen "<ThruDateF1Text>"
    #
    #Examples:
   #|ThruDateF1Text|
   #|The last date Biosimilar Product List is effective for the selected plan.|
   #
    #@TC25        
   #Scenario Outline: Verify the NDC List field on Add Biosimilar Product Lists attached to Plan
    #Then Verify NDC List field and Help Function Key on Add Plan Biosimilar Product List screen "<NDCListF1Text>"
    #
    #Examples:
   #|NDCListF1Text|
   #|NDC List used to identify biosimilar or interchangeable biological products.|
   #
   #@TC26        
   #Scenario Outline: Verify the GPI List field on Add Biosimilar Product Lists attached to Plan
    #Then Verify GPI List field and Help Function Key on Add Plan Biosimilar Product List screen "<GPIListF1Text>"
    #
    #Examples:
   #|GPIListF1Text|
   #|GPI List used to identify biosimilar or interchangeable biological products.|
   #
   #@TC27        
   #Scenario Outline: Verify the Coverage Gap Discount field on Add Biosimilar Product Lists attached to Plan
    #Then Verify Coverage Gap Discount field and Help Function Key on Add Plan Biosimilar Product List screen "<CoverageGapDiscountF1Text>"
    #
    #Examples:
   #|CoverageGapDiscountF1Text|
   #|Indicates if Manufacturer Discount is applicable to Non-LICS claim in coverage gap phase. Valid values are: N - No Coverage Gap discount is not applicable. Y - Yes Coverage Gap discount is applicable.|
   #
   #@TC28        
   #Scenario Outline: Verify the LICS Generic Cost Share field on Add Biosimilar Product Lists attached to Plan
    #Then Verify LICS Generic Cost Share field and Help Function Key on Add Plan Biosimilar Product List screen "<LICSGenericCostShareF1Text>"
    #
    #Examples:
   #|LICSGenericCostShareF1Text|
   #|Indicates if Generic Cost-Share is applicable to LICS-eligible claim in all phases. Valid values are: N - No Cost-share is based on product attribute as defined by Plan, Medispan or Marketing Category. Y - Yes Generic Cost-Share is applicable.|
   #
   #@TC29        
   #Scenario Outline: Verify the Non LICS Catastrophic Generic Cost Share field on Add Biosimilar Product Lists attached to Plan
    #Then Verify Non LICS Catastrophic Generic Cost Share field and Help Function Key on Add Plan Biosimilar Product List screen "<NonLICSCatastrophicGenericCostShareF1Text>"
    #
    #Examples:
   #|NonLICSCatastrophicGenericCostShareF1Text|
   #|Indicates if Generic Cost-Share is applicable to Non-LICS claim in catastrophic phase. Valid values are: N - No Cost-share is based on product attribute as defined by Plan, Medispan or Marketing Category. Y - Yes Generic Cost-Share is applicable.|
   #
   #@TC30        
   #Scenario Outline: Verify error message on Add Plan Biosimilar Product List screen for Thru date field
    #Then Verify Thru Date field on Add Plan Biosimilar Product List screen "<ThruDate>", "<Errormsg>"
    #
    #Examples:
   #|ThruDate|Errormsg|
   #|010117|Date Thru cannot be more than one day less than Date From|
   #
   #@TC31        
   #Scenario Outline: Verify error message on Add Plan Biosimilar Product List screen for Both NDC List and GPI List are blank fields
    #Then Verify Both NDC List and GPI List are blank fields on Add Plan Biosimilar Product List screen "<Errormsg>"
    #
    #Examples:
   #|Errormsg|
   #|At least one list must be populated.|
   #
    #@TC32        
   #Scenario Outline: Verify error message on Add Plan Biosimilar Product List screen for Thru date field
    #Then Verify NDC List field which is not in master file  on Add Plan Biosimilar Product List screen "<NDCList>", "<Errormsg>"
    #
    #Examples:
   #|NDCList|Errormsg|
   #|NDCTEST|NDC List not found.|
   #
    #@TC33        
   #Scenario Outline: Verify error message on Add Plan Biosimilar Product List screen for Thru date field
    #Then Verify GPI List field which is not in master file  on Add Plan Biosimilar Product List screen  "<NDCList>","<GPIList>", "<Errormsg>"
    #
    #Examples:
   #|NDCList|GPIList|Errormsg|
   #|MPD BIOS|GPI TEST|GPI List GPI TEST not found.|
   #
   #@TC34        
   #Scenario Outline: Verify error message on Add Plan Biosimilar Product List screen for Thru date field
    #Then Verify A required field is blank on Add Plan Biosimilar Product List screen   "<Errormsg>"
    #
    #Examples:
   #|Errormsg|
   #|Value Required|
   #
    #@TC35        
   #Scenario Outline: Verify all the fields on Edit Option of Plan Biosimilar Product List screen 
    #When I am on Edit Option of Plan Biosimilar Product List screen
    #Then  Verify all the fields on the screen "<FromDate>","<ThruDate>","<NDCList>","<GPIList>","<CoverageGapDiscount>","<LICSGenericCostShare>","<NonLICSCatastrophicGenericCostShare>"
    #Examples:
   #|FromDate|ThruDate|NDCList|GPIList|CoverageGapDiscount|LICSGenericCostShare|NonLICSCatastrophicGenericCostShare|
   #|10118|123118|MPD BIOS|MPD BIOS|N|N|N|
   #
   #@TC36        
   #Scenario Outline: Verify the from date field on Edit Option Biosimilar Product Lists attached to Plan
    #Then Verify From Date field and Help Function Key on Add Plan Biosimilar Product List screen "<FromDateF1Text>"
    #
    #Examples:
   #|FromDateF1Text|
   #|The first date Biosimilar Product List is effective for the selected plan.|
   #
   #@TC37        
   #Scenario Outline: Verify the thru date field on Edit Option Biosimilar Product Lists attached to Plan
    #Then Verify Thru Date field and Help Function Key on Add Plan Biosimilar Product List screen "<ThruDateF1Text>"
    #
    #Examples:
   #|ThruDateF1Text|
   #|The last date Biosimilar Product List is effective for the selected plan.|
   #
    #@TC38        
   #Scenario Outline: Verify the NDC List field on Edit Option Biosimilar Product Lists attached to Plan
    #Then Verify NDC List field and Help Function Key on Add Plan Biosimilar Product List screen "<NDCListF1Text>"
    #
    #Examples:
   #|NDCListF1Text|
   #|NDC List used to identify biosimilar or interchangeable biological products.|
   #
   #@TC39        
   #Scenario Outline: Verify the GPI List field on Edit Option Biosimilar Product Lists attached to Plan
    #Then Verify GPI List field and Help Function Key on Add Plan Biosimilar Product List screen "<GPIListF1Text>"
    #
    #Examples:
   #|GPIListF1Text|
   #|GPI List used to identify biosimilar or interchangeable biological products.|
   #
   #@TC40        
   #Scenario Outline: Verify the Coverage Gap Discount field on Edit Option Biosimilar Product Lists attached to Plan
    #Then Verify Coverage Gap Discount field and Help Function Key on Add Plan Biosimilar Product List screen "<CoverageGapDiscountF1Text>"
    #
    #Examples:
   #|CoverageGapDiscountF1Text|
   #|Indicates if Manufacturer Discount is applicable to Non-LICS claim in coverage gap phase. Valid values are: N - No Coverage Gap discount is not applicable. Y - Yes Coverage Gap discount is applicable.|
   #
   #@TC41        
   #Scenario Outline: Verify the LICS Generic Cost Share field on Edit Option Biosimilar Product Lists attached to Plan
    #Then Verify LICS Generic Cost Share field and Help Function Key on Add Plan Biosimilar Product List screen "<LICSGenericCostShareF1Text>"
    #
    #Examples:
   #|LICSGenericCostShareF1Text|
   #|Indicates if Generic Cost-Share is applicable to LICS-eligible claim in all phases. Valid values are: N - No Cost-share is based on product attribute as defined by Plan, Medispan or Marketing Category. Y - Yes Generic Cost-Share is applicable.|
   #
   #@TC42        
   #Scenario Outline: Verify the Non LICS Catastrophic Generic Cost Share field on Edit Option Biosimilar Product Lists attached to Plan
    #Then Verify Non LICS Catastrophic Generic Cost Share field and Help Function Key on Add Plan Biosimilar Product List screen "<NonLICSCatastrophicGenericCostShareF1Text>"
    #
    #Examples:
   #|NonLICSCatastrophicGenericCostShareF1Text|
   #|Indicates if Generic Cost-Share is applicable to Non-LICS claim in catastrophic phase. Valid values are: N - No Cost-share is based on product attribute as defined by Plan, Medispan or Marketing Category. Y - Yes Generic Cost-Share is applicable.|
   #
   #@TC43        
   #Scenario Outline: Verify the Status field on Edit Option Biosimilar Product Lists attached to Plan
    #Then Verify Status field and Help Function Key on Edit Option Plan Biosimilar Product List screen "<StatusF1Text>"
    #
    #Examples:
   #|StatusF1Text|
   #|Value that indicates if record is Active or Inactive.|
   #
   #@TC44        
   #Scenario Outline: Verify error message on Edit Option Plan Biosimilar Product List screen for Thru date field
    #Then Verify Thru Date field on Add Plan Biosimilar Product List screen "<ThruDate>", "<Errormsg>"
    #
    #Examples:
   #|ThruDate|Errormsg|
   #|010117|Date Thru cannot be more than one day less than Date From|
   #
   #@TC45        
   #Scenario Outline: Verify error message on Edit Option Plan Biosimilar Product List screen for Both NDC List and GPI List are blank fields
    #Then Verify Both NDC List and GPI List are blank fields on Add Plan Biosimilar Product List screen "<Errormsg>"
    #
    #Examples:
   #|Errormsg|
   #|At least one list must be populated.|
   #
    #@TC46        
   #Scenario Outline: Verify error message on Edit Option Plan Biosimilar Product List screen for Thru date field
    #Then Verify NDC List field which is not in master file  on Add Plan Biosimilar Product List screen "<NDCList>", "<Errormsg>"
    #
    #Examples:
   #|NDCList|Errormsg|
   #|NDCTEST|NDC List not found.|
   #
    #@TC47        
   #Scenario Outline: Verify error message on Edit Option Plan Biosimilar Product List screen for Thru date field
    #Then Verify GPI List field which is not in master file  on Add Plan Biosimilar Product List screen  "<NDCList>","<GPIList>", "<Errormsg>"
    #
    #Examples:
   #|NDCList|GPIList|Errormsg|
   #|MPD BIOS|GPI TEST|GPI List GPI TEST not found.|
   #
   #@TC48        
   #Scenario Outline: Verify error message on Edit Option Plan Biosimilar Product List screen for Thru date field
    #Then Verify A required field is blank on Add Plan Biosimilar Product List screen   "<Errormsg>"
    #
    #Examples:
   #|Errormsg|
   #|Value Required|
   #
   #@TC49        
   #Scenario Outline: Verify all the fields on Dispay Option of Plan Biosimilar Product List screen 
    #When I am on Display Option of Plan Biosimilar Product List screen
    #Then  Verify all the fields on the display screen "<FromDate>","<ThruDate>","<NDCList>","<GPIList>","<CoverageGapDiscount>","<LICSGenericCostShare>","<NonLICSCatastrophicGenericCostShare>"
    #Examples:
   #|FromDate|ThruDate|NDCList|GPIList|CoverageGapDiscount|LICSGenericCostShare|NonLICSCatastrophicGenericCostShare|
   #|1/01/18|12/31/18|MPD BIOS|MPD BIOS|N|N|N|
   #
    #@TC50        
   #Scenario Outline: Verify the from date field on Dispay Option Biosimilar Product Lists attached to Plan
    #Then Verify From Date field and Help Function Key on Add Plan Biosimilar Product List screen "<FromDateF1Text>"
    #
    #Examples:
   #|FromDateF1Text|
   #|The first date Biosimilar Product List is effective for the selected plan.|
   #
   #@TC51        
   #Scenario Outline: Verify the thru date field on Dispay Option Biosimilar Product Lists attached to Plan
    #Then Verify Thru Date field and Help Function Key on Add Plan Biosimilar Product List screen "<ThruDateF1Text>"
    #
    #Examples:
   #|ThruDateF1Text|
   #|The last date Biosimilar Product List is effective for the selected plan.|
   #
    #@TC52        
   #Scenario Outline: Verify the NDC List field on Dispay Option Biosimilar Product Lists attached to Plan
    #Then Verify NDC List field and Help Function Key on Add Plan Biosimilar Product List screen "<NDCListF1Text>"
    #
    #Examples:
   #|NDCListF1Text|
   #|NDC List used to identify biosimilar or interchangeable biological products.|
   #
   #@TC53        
   #Scenario Outline: Verify the GPI List field on Dispay Option Biosimilar Product Lists attached to Plan
    #Then Verify GPI List field and Help Function Key on Add Plan Biosimilar Product List screen "<GPIListF1Text>"
    #
    #Examples:
   #|GPIListF1Text|
   #|GPI List used to identify biosimilar or interchangeable biological products.|
   #
   #@TC54        
   #Scenario Outline: Verify the Coverage Gap Discount field on Dispay Option Biosimilar Product Lists attached to Plan
    #Then Verify Coverage Gap Discount field and Help Function Key on Add Plan Biosimilar Product List screen "<CoverageGapDiscountF1Text>"
    #
    #Examples:
   #|CoverageGapDiscountF1Text|
   #|Indicates if Manufacturer Discount is applicable to Non-LICS claim in coverage gap phase. Valid values are: N - No Coverage Gap discount is not applicable. Y - Yes Coverage Gap discount is applicable.|
   #
   #@TC55        
   #Scenario Outline: Verify the LICS Generic Cost Share field on Dispay Option Biosimilar Product Lists attached to Plan
    #Then Verify LICS Generic Cost Share field and Help Function Key on Add Plan Biosimilar Product List screen "<LICSGenericCostShareF1Text>"
    #
    #Examples:
   #|LICSGenericCostShareF1Text|
   #|Indicates if Generic Cost-Share is applicable to LICS-eligible claim in all phases. Valid values are: N - No Cost-share is based on product attribute as defined by Plan, Medispan or Marketing Category. Y - Yes Generic Cost-Share is applicable.|
   #
   #@TC56        
   #Scenario Outline: Verify the Non LICS Catastrophic Generic Cost Share field on Dispay Option Biosimilar Product Lists attached to Plan
    #Then Verify Non LICS Catastrophic Generic Cost Share field and Help Function Key on Add Plan Biosimilar Product List screen "<NonLICSCatastrophicGenericCostShareF1Text>"
    #
    #Examples:
   #|NonLICSCatastrophicGenericCostShareF1Text|
   #|Indicates if Generic Cost-Share is applicable to Non-LICS claim in catastrophic phase. Valid values are: N - No Cost-share is based on product attribute as defined by Plan, Medispan or Marketing Category. Y - Yes Generic Cost-Share is applicable.|
   #
   #@TC57        
   #Scenario Outline: Verify the Status field on Dispay Option Biosimilar Product Lists attached to Plan
    #Then Verify Status field and Help Function Key on Edit Option Plan Biosimilar Product List screen "<StatusF1Text>"
    #
    #Examples:
   #|StatusF1Text|
   #|Value that indicates if record is Active or Inactive.|
   #
    #@TC58        
   #Scenario Outline: Verify the copy plan function is updated
    #Then Verify the copy plan function is updated "<SourcePlan>","<TargetPlan>"
    #Then Verify active records are displayed "<FromDate>","<ThruDate>","<NDCList>","<GPIList>","<CoverageGapDiscount>","<LICSGenericCostShare>","<NonLICSCatastrophicGenericCostShare>"
    #Examples:
   #|SourcePlan|TargetPlan|FromDate|ThruDate|NDCList|GPIList|CoverageGapDiscount|LICSGenericCostShare|NonLICSCatastrophicGenericCostShare|
   #|SN003565P1|SRTSTCOPY2|1/01/18|12/31/18|MPD BIOS|MPD BIOS|N|N|N|
   
   @TC59        
   Scenario Outline: Verify label Coverage Gap Product List is changed to Biosimilar Product List
    Given I am on RxClaim PlanAdministrator Menu
    When I am on Plan Medicare Maintenance Utility Options screen
    Then Verify label Coverage Gap Product List is changed to Biosimilar Product List "<BiosimilarProductListText>"
    
    Examples:
   |BiosimilarProductListText|
   |Biosimilar Product List|
      
  	@TC60        
   Scenario Outline: Verify label Coverage Gap Product List is changed to Biosimilar Product List in add, edit and display versions of Plan Medicare Create record screens.
    When I am on Plan Medicare Create Record Detail Page one of two  screen
    Then Verify label Coverage Gap Product List is changed to Biosimilar Product List in edit  and display versions"<BiosimilarProductListText>"
    
    Examples:
   |BiosimilarProductListText|
   |Biosimilar Product List| 
   
   	@TC61        
   Scenario Outline: Verify screen title changed from Plan Medicare Cov Gap Maintenance Utility to Plan Biosimilar Product List Maintenance Utility 
    Then Verify screen title changed from Plan Medicare Cov Gap Maintenance Utility to Plan Biosimilar Product List Maintenance Utility  "<ScreenTitle>"
    
    Examples:
   |ScreenTitle|
   |Plan Biosimilar Product List Maintenance Utility| 
   
   @TC62        
   Scenario Outline: Verify From date field is displayed on Plan Biosimilar Product List Maintenance Utility screen 
    Then Verify From date field with help text is displayed on Plan Biosimilar Product List Maintenance Utility screen  "<FromDate>","<FromDateF1Text>"
    
    Examples:
   |FromDate|FromDateF1Text|
   |1/01/01|The first date Biosimilar Product List is effective for the selected plan.| 
   
   @TC63        
   Scenario Outline: Verify the existing title of the screen is changed into Plan Bio Product List Create Record and From Date Field is added 
    Then Verify the existing title of the screen is changed into Plan Bio Product List Create Record and From Date Field is added with help text  "<FromDate>","<FromDateF1Text>"
    
    Examples:
   |FromDate|FromDateF1Text|
   |010101|The first date Biosimilar Product List is effective for the selected plan.| 
  
  	@TC64        
   Scenario Outline: Verify the error message is dislayed 
    Then Verify the error message is dislayed "<ErrorMsg>"
    
    Examples:
   |ErrorMsg|
   |Plan Biosimilar Product List already exists.|
   
    @TC65        
   Scenario Outline: Verify is there a change in the title of existing screen Plan Biosimilar Product List maintenance fields with Action = Replace
    Then Verify is there a change in the title of existing screen  "<ScreenTitle>"
    
    Examples:
   |ScreenTitle|
   |Plan Biosimilar Product List Create Record Detail|
   
    @TC66        
   Scenario Outline: Verify From date field on Plan Biosimilar Product List Create Record Detail screen with Action = Replace. 
    Then Verify From date field on Plan Biosimilar Product List Create Record Detail screen  "<FromDate>","<FromDateF1Text>"
    
    Examples:
   |FromDate|FromDateF1Text|
   |1/01/01|The first date Biosimilar Product List is effective for the selected plan.| 
   
    @TC67        
   Scenario Outline: Verify Thru date Process field on Plan Biosimilar Product List Create Record Detail screen with Action = Replace 
    Then Verify Thru date Process field on Plan Biosimilar Product List Create Record Detail screen  "<ThruDateProcess>","<ThruDateProcessF1Text>"
    
    Examples:
   |ThruDateProcess|ThruDateProcessF1Text|
   |C|Indicator used to specify the applicable condition when a field can be updated.|
   
    @TC68        
   Scenario Outline: Verify Thru date Existing field on Plan Biosimilar Product List Create Record Detail screen with Action = Replace 
    Then Verify Thru date Existing field on Plan Biosimilar Product List Create Record Detail screen  "<ThruDateExisting>","<ThruDateExistingF1Text>"
    
    Examples:
   |ThruDateExisting|ThruDateExistingF1Text|
   |1/01/01|Value of existing Plan Biosimilar Product List Thru Date to be updated.|
   
    @TC69        
   Scenario Outline: Verify Thru date New field on Plan Biosimilar Product List Create Record Detail screen with Action = Replace. 
    Then Verify Thru date New field on Plan Biosimilar Product List Create Record Detail screen  "<ThruDateNew>","<ThruDateNewF1Text>"
    
    Examples:
   |ThruDateNew|ThruDateNewF1Text|
   |1/01/18|New value of Plan Biosimilar Product List Thru Date.|
   
    @TC70        
   Scenario Outline: Verify NDC List Process field on Plan Biosimilar Product List Create Record Detail screen with Action = Replace. 
    Then Verify NDC List Process field on Plan Biosimilar Product List Create Record Detail screen  "<NDCListProcess>","<NDCListProcessF1Text>"
    
    Examples:
   |NDCListProcess|NDCListProcessF1Text|
   |C|Indicator used to specify the applicable condition when a field can be updated.|
   
    @TC71        
   Scenario Outline: Verify NDC List Existing field on Plan Biosimilar Product List Create Record Detail screen with Action = Replace 
    Then Verify NDC List Existing field on Plan Biosimilar Product List Create Record Detail screen  "<NDCListExisting>","<NDCListExistingF1Text>"
    
    Examples:
   |NDCListExisting|NDCListExistingF1Text|
   |TESTNDCEXC|Value of existing NDC List to be updated.|
   
    @TC72        
   Scenario Outline: Verify NDC List New field on Plan Biosimilar Product List Create Record Detail screen with Action = Replace. 
    Then Verify NDC List New field on Plan Biosimilar Product List Create Record Detail screen  "<NDCListNew>","<NDCListNewF1Text>"
    
    Examples:
   |NDCListNew|NDCListNewF1Text|
   |TESTNDCEXC|New value of NDC List.|
   
    @TC73        
   Scenario Outline: Verify GPI List Process field on Plan Biosimilar Product List Create Record Detail screen with Action = Replace. 
    Then Verify GPI List Process field on Plan Biosimilar Product List Create Record Detail screen  "<GPIListProcess>","<GPIListProcessF1Text>"
    
    Examples:
   |GPIListProcess|GPIListProcessF1Text|
   |C|Indicator used to specify the applicable condition when a field can be updated.|
   
    @TC74        
   Scenario Outline: Verify GPI List Existing field on Plan Biosimilar Product List Create Record Detail screen with Action = Replace 
    Then Verify GPI List Existing field on Plan Biosimilar Product List Create Record Detail screen  "<GPIListExisting>","<GPIListExistingF1Text>"
    
    Examples:
   |GPIListExisting|GPIListExistingF1Text|
   |TESTBSAM01|Value of existing GPI List to be updated.|
   
    @TC75        
   Scenario Outline: Verify GPI List New field on Plan Biosimilar Product List Create Record Detail screen with Action = Replace. 
    Then Verify GPI List New field on Plan Biosimilar Product List Create Record Detail screen  "<GPIListNew>","<GPIListNewF1Text>"
    
    Examples:
   |GPIListNew|GPIListNewF1Text|
   |TESTBSAM01|New value of GPI List.|
   
   @TC76        
   Scenario Outline: Verify Coverage Gap Discount Process field on Plan Biosimilar Product List Create Record Detail screen with Action = Replace 
    Then Verify Coverage Gap Discount Process field on Plan Biosimilar Product List Create Record Detail screen  "<CoverageGapDiscountProcess>","<CoverageGapDiscountProcessF1Text>"
    
    Examples:
   |CoverageGapDiscountProcess|CoverageGapDiscountProcessF1Text|
   |C|Indicator used to specify the applicable condition when a field can be updated.|
   
    @TC77        
   Scenario Outline: Verify Coverage Gap Discount Existing field on Plan Biosimilar Product List Create Record Detail screen with Action = Replace 
    Then Verify Coverage Gap Discount Existing field on Plan Biosimilar Product List Create Record Detail screen  "<CoverageGapDiscountExisting>","<CoverageGapDiscountExistingF1Text>"
    
    Examples:
   |CoverageGapDiscountExisting|CoverageGapDiscountExistingF1Text|
   |N|Value of existing Coverage Gap Discount to be updated.|
   
    @TC78        
   Scenario Outline: Verify Coverage Gap Discount New field on Plan Biosimilar Product List Create Record Detail screen with Action = Replace. 
    Then Verify Coverage Gap Discount New field on Plan Biosimilar Product List Create Record Detail screen  "<CoverageGapDiscountNew>","<CoverageGapDiscountNewF1Text>"
    
    Examples:
   |CoverageGapDiscountNew|CoverageGapDiscountNewF1Text|
   |N|New value of of Coverage Gap Discount.|
   
    @TC79        
   Scenario Outline: Verify LICS Generic Cost–Share Process field on Plan Biosimilar Product List Create Record Detail screen with Action = Replace 
    Then Verify LICS Generic Cost Share Process field on Plan Biosimilar Product List Create Record Detail screen  "<LICSGenericCostShareProcess>","<LICSGenericCostShareProcessF1Text>"
    
    Examples:
   |LICSGenericCostShareProcess|LICSGenericCostShareProcessF1Text|
   |C|Indicator used to specify the applicable condition when a field can be updated.|
   
    @TC80        
   Scenario Outline: Verify LICS Generic Cost–Share Existing field on Plan Biosimilar Product List Create Record Detail screen with Action = Replace 
    Then Verify LICS Generic Cost Share Existing field on Plan Biosimilar Product List Create Record Detail screen  "<LICSGenericCostShareExisting>","<LICSGenericCostShareExistF1Text>"
    
    Examples:
   |LICSGenericCostShareExisting|LICSGenericCostShareExistF1Text|
   |N|Value of existing LICS Generic Cost-Share to be updated.|
   
    @TC81        
   Scenario Outline: Verify LICS Generic Cost–Share New field on Plan Biosimilar Product List Create Record Detail screen with Action = Replace. 
    Then Verify LICS Generic Cost Share New field on Plan Biosimilar Product List Create Record Detail screen  "<LICSGenericCostShareNew>","<LICSGenericCostShareNewF1Text>"
    
    Examples:
   |LICSGenericCostShareNew|LICSGenericCostShareNewF1Text|
   |N|New value of of LICS Generic Cost-Share.|
   
    @TC82        
   Scenario Outline: Verify Non LICS Catastrophic Generic Cost–Share  Process field on Plan Biosimilar Product List Create Record Detail screen with Action = Replace 
    Then Verify Non LICS Generic Cost Share Process field on Plan Biosimilar Product List Create Record Detail screen  "<NonLICSGenericCostShareProcess>","<NonLICSGenericCostShareProcessF1Text>"
    
    Examples:
   |NonLICSGenericCostShareProcess|NonLICSGenericCostShareProcessF1Text|
   |C|Indicator used to specify the applicable condition when a field can be updated.|
   
    @TC83        
   Scenario Outline: Verify Non LICS Generic Cost–Share Existing field on Plan Biosimilar Product List Create Record Detail screen with Action = Replace 
    Then Verify Non LICS Generic Cost Share Existing field on Plan Biosimilar Product List Create Record Detail screen  "<NonLICSGenericCostShareExisting>","<NonLICSGenericCostShareProcessExistF1Text>"
    
    Examples:
   |NonLICSGenericCostShareExisting|NonLICSGenericCostShareProcessExistF1Text|
   |N|Value of existing Non-LICS Catastrophic Generic Cost-Share to be updated.|
   
    @TC84        
   Scenario Outline: Verify Non LICS Generic Cost–Share New field on Plan Biosimilar Product List Create Record Detail screen with Action = Replace. 
    Then Verify Non LICS Generic Cost Share New field on Plan Biosimilar Product List Create Record Detail screen  "<NonLICSGenericCostShareNew>","<NonLICSGenericCostShareNewF1Text>"
    
    Examples:
   |NonLICSGenericCostShareNew|NonLICSGenericCostShareNewF1Text|
   |N|New value of of Non-LICS Catastrophic Generic Cost-Share.|
   
    @TC85        
   Scenario Outline: Verify Thru Date New error message on Plan Biosimilar Product List Create Record Detail screen with Action = Replace 
    Then Verify Thru Date New error message on Plan Biosimilar Product List Create Record Detail screen  "<ThruDate>","<ErrorMsg>"
    
    Examples:
   |ThruDate|ErrorMsg|
   |10199|Date Thru cannot be more than one day less than Date From.|
   
    @TC86        
   Scenario Outline: Verify error message on Plan Biosimilar Product List Create Record Detail screen with Action = Replace. 
    Then Verify error message on Plan Biosimilar Product List Create Record Detail screen  "<ThruDateProcess>","<ErrorMsg>"
    
    Examples:
   |ThruDateProcess|ErrorMsg|
   |C|Value Required for Process Thru Date|
   
    @TC87        
   Scenario Outline: Verify is there a change in the title of existing screen Plan Biosimilar Product List maintenance fields with Action = Add
    Then Verify is there a change in the title of existing screen with Add Action  "<ScreenTitle>"
    
    Examples:
   |ScreenTitle|
   |Plan Biosimilar Product List Create Record Detail|
   
    @TC88        
   Scenario Outline: Verify From date field on Plan Biosimilar Product List Create Record Detail screen with Action = Add. 
    Then Verify From date field on Plan Biosimilar Product List Create Record Detail screen with Add Action  "<FromDate>","<FromDateF1Text>"
    
    Examples:
   |FromDate|FromDateF1Text|
   |1/01/01|The first date Biosimilar Product List is effective for the selected plan.| 
   
    @TC89        
   Scenario Outline: Verify Thru date Process field on Plan Biosimilar Product List Create Record Detail screen with Action = Add. 
    Then Verify Thru date Process field on Plan Biosimilar Product List Create Record Detail screen with Add Action  "<ThruDateProcessF1Text>"
    
    Examples:
   |ThruDateProcessF1Text|
   |Indicator used to specify the applicable condition when a field can be updated.|
   
    @TC90        
   Scenario Outline: Verify Thru date Existing field on Plan Biosimilar Product List Create Record Detail screen with Action = Add 
    Then Verify Thru date Existing field on Plan Biosimilar Product List Create Record Detail screen with Add Action "<ThruDateExistingF1Text>"
    
    Examples:
   |ThruDateExistingF1Text|
   |Value of existing Plan Biosimilar Product List Thru Date to be updated.|
   
    @TC91        
   Scenario Outline: Verify Thru date New field on Plan Biosimilar Product List Create Record Detail screen with Action = Add. 
    Then Verify Thru date New field on Plan Biosimilar Product List Create Record Detail screen with Add Action  "<ThruDateNew>","<ThruDateNewF1Text>"
    
    Examples:
   |ThruDateNew|ThruDateNewF1Text|
   |1/01/18|New value of Plan Biosimilar Product List Thru Date.|
   
    @TC92        
   Scenario Outline: Verify NDC List Process field on Plan Biosimilar Product List Create Record Detail screen with Action = Add. 
    Then Verify NDC List Process field on Plan Biosimilar Product List Create Record Detail screen with Add Action "<NDCListProcessF1Text>"
    
    Examples:
   |NDCListProcessF1Text|
   |Indicator used to specify the applicable condition when a field can be updated.|
   
    @TC93        
   Scenario Outline: Verify NDC List Existing field on Plan Biosimilar Product List Create Record Detail screen with Action = Add 
    Then Verify NDC List Existing field on Plan Biosimilar Product List Create Record Detail screen with Add Action "<NDCListExistingF1Text>"
    
    Examples:
   |NDCListExistingF1Text|
   |Value of existing NDC List to be updated.|
   
    @TC94        
   Scenario Outline: Verify NDC List New field on Plan Biosimilar Product List Create Record Detail screen with Action = Add. 
    Then Verify NDC List New field on Plan Biosimilar Product List Create Record Detail screen with Add Action "<NDCListNew>","<NDCListNewF1Text>"
    
    Examples:
   |NDCListNew|NDCListNewF1Text|
   |TESTNDCEXC|New value of NDC List.|
   
    @TC95        
   Scenario Outline: Verify GPI List Process field on Plan Biosimilar Product List Create Record Detail screen with Action = Add. 
    Then Verify GPI List Process field on Plan Biosimilar Product List Create Record Detail screen with Add Action "<GPIListProcessF1Text>"
    
    Examples:
   |GPIListProcessF1Text|
   |Indicator used to specify the applicable condition when a field can be updated.|
   
    @TC96        
   Scenario Outline: Verify GPI List Existing field on Plan Biosimilar Product List Create Record Detail screen with Action = Add 
    Then Verify GPI List Existing field on Plan Biosimilar Product List Create Record Detail screen  with Add Action "<GPIListExistingF1Text>"
    
    Examples:
   |GPIListExistingF1Text|
   |Value of existing GPI List to be updated.|
   
    @TC97        
   Scenario Outline: Verify GPI List New field on Plan Biosimilar Product List Create Record Detail screen with Action = Add. 
    Then Verify GPI List New field on Plan Biosimilar Product List Create Record Detail screen with Add Action "<GPIListNew>","<GPIListNewF1Text>"
    
    Examples:
   |GPIListNew|GPIListNewF1Text|
   |TESTBSAM01|New value of GPI List.|
   
   @TC98        
   Scenario Outline: Verify Coverage Gap Discount Process field on Plan Biosimilar Product List Create Record Detail screen with Action = Add 
    Then Verify Coverage Gap Discount Process field on Plan Biosimilar Product List Create Record Detail screen with Add Action "<CoverageGapDiscountProcessF1Text>"
    
    Examples:
   |CoverageGapDiscountProcessF1Text|
   |Indicator used to specify the applicable condition when a field can be updated.|
   
    @TC99        
   Scenario Outline: Verify Coverage Gap Discount Existing field on Plan Biosimilar Product List Create Record Detail screen with Action = Add 
    Then Verify Coverage Gap Discount Existing field on Plan Biosimilar Product List Create Record Detail screen  with Add Action "<CoverageGapDiscountExistingF1Text>"
    
    Examples:
   |CoverageGapDiscountExistingF1Text|
   |Value of existing Coverage Gap Discount to be updated.|
   
    @TC100        
   Scenario Outline: Verify Coverage Gap Discount New field on Plan Biosimilar Product List Create Record Detail screen with Action = Add. 
    Then Verify Coverage Gap Discount New field on Plan Biosimilar Product List Create Record Detail screen with Add Action "<CoverageGapDiscountNew>","<CoverageGapDiscountNewF1Text>"
    
    Examples:
   |CoverageGapDiscountNew|CoverageGapDiscountNewF1Text|
   |N|New value of of Coverage Gap Discount.|
   
    @TC101        
   Scenario Outline: Verify LICS Generic Cost–Share Process field on Plan Biosimilar Product List Create Record Detail screen with Action = Add 
    Then Verify LICS Generic Cost Share Process field on Plan Biosimilar Product List Create Record Detail screen  with Add Action "<LICSGenericCostShareProcessF1Text>"
    
    Examples:
   |LICSGenericCostShareProcessF1Text|
   |Indicator used to specify the applicable condition when a field can be updated.|
   
    @TC102        
   Scenario Outline: Verify LICS Generic Cost–Share Existing field on Plan Biosimilar Product List Create Record Detail screen with Action = Add 
    Then Verify LICS Generic Cost Share Existing field on Plan Biosimilar Product List Create Record Detail screen with Add Action "<LICSGenericCostShareExistF1Text>"
    
    Examples:
   |LICSGenericCostShareExistF1Text|
   |Value of existing LICS Generic Cost-Share to be updated.|
   
    @TC103        
   Scenario Outline: Verify LICS Generic Cost–Share New field on Plan Biosimilar Product List Create Record Detail screen with Action = Add. 
    Then Verify LICS Generic Cost Share New field on Plan Biosimilar Product List Create Record Detail screen with Add Action "<LICSGenericCostShareNew>","<LICSGenericCostShareNewF1Text>"
    
    Examples:
   |LICSGenericCostShareNew|LICSGenericCostShareNewF1Text|
   |N|New value of of LICS Generic Cost-Share.|
   
    @TC104        
   Scenario Outline: Verify Non LICS Catastrophic Generic Cost–Share  Process field on Plan Biosimilar Product List Create Record Detail screen with Action = Add 
    Then Verify Non LICS Generic Cost Share Process field on Plan Biosimilar Product List Create Record Detail screen with Add Action "<NonLICSGenericCostShareProcessF1Text>"
    
    Examples:
   |NonLICSGenericCostShareProcessF1Text|
   |Indicator used to specify the applicable condition when a field can be updated.|
   
    @TC105        
   Scenario Outline: Verify Non LICS Generic Cost–Share Existing field on Plan Biosimilar Product List Create Record Detail screen with Action = Add 
    Then Verify Non LICS Generic Cost Share Existing field on Plan Biosimilar Product List Create Record Detail screen with Add Action "<NonLICSGenericCostShareProcessExistF1Text>"
    
    Examples:
   |NonLICSGenericCostShareProcessExistF1Text|
   |Value of existing Non-LICS Catastrophic Generic Cost-Share to be updated.|
   
    @TC106        
   Scenario Outline: Verify Non LICS Generic Cost–Share New field on Plan Biosimilar Product List Create Record Detail screen with Action = Add. 
    Then Verify Non LICS Generic Cost Share New field on Plan Biosimilar Product List Create Record Detail screen with Add Action "<NonLICSGenericCostShareNew>","<NonLICSGenericCostShareNewF1Text>"
    
    Examples:
   |NonLICSGenericCostShareNew|NonLICSGenericCostShareNewF1Text|
   |N|New value of of Non-LICS Catastrophic Generic Cost-Share.|
   
    @TC107        
   Scenario Outline: Verify Thru Date New error message on Plan Biosimilar Product List Create Record Detail screen with Action = Add 
    Then Verify Thru Date New error message on Plan Biosimilar Product List Create Record Detail screen with Add Action "<ThruDate>","<ErrorMsg>"
    
    Examples:
   |ThruDate|ErrorMsg|
   |10199|Date Thru cannot be more than one day less than Date From.|
   
    @TC108        
   Scenario Outline: Verify error message on Plan Biosimilar Product List Create Record Detail screen with Action = Add. 
    Then Verify for Required field blank error message on Plan Biosimilar Product List Create Record Detail screen with Add Action "<LICSNew>","<ErrorMsg>"
    
    Examples:
   |LICSNew|ErrorMsg|
   |N|Value Required for LICS (All Phases)|
   
    @TC109        
   Scenario Outline: Verify error message on Plan Biosimilar Product List Create Record Detail screen with Action = Add 
    Then Verify for both NDC and GPI blank error message on Plan Biosimilar Product List Create Record Detail screen with Add Action "<NDCList>","<GPIList>","<ErrorMsg>"
    
    Examples:
   |NDCList|GPIList|ErrorMsg|
   |TESTNDCEXC|TESTBSAM01|Value Required for Process Thru Date|