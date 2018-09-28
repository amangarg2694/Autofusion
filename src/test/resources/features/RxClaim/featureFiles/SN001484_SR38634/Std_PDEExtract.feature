Feature: SN001484_SR38634 - Part D: Enhance performance of data selection job for PDE Management Tool
I want to use this feature file to execute SR38634
Scenario Outline: Run Standard Extract IN CCT700

Given I am on RxClaim PlanAdministrator Menu 
When I navigate to standard extract screen
And Enter today's date as "<Extract Date>"
Then Validate Screen Name iss "CCT710"
Examples:
| Extract Date |  
| 082818 | 

 Scenario Outline: Std extract Spool File Validation
 Given I am on Batch Extract Process Menu 
 When I take ws in command prompt
 Then Validate Status is "OUTQ"
 And Validate Job Name is "EXTRACTJOB"

   Examples:
| Test Field|  
| Test Data |

 Scenario Outline: PDE File Generation
    Given I am on RxClaim Operations Menu 
    When I submit a PDE extract "<Date From>","<Date Thru>","<Carrier From>","<Carrier Thru>","<Library>","<DDPS Filter Process>","<Include Missing HICN>","<Submitter ID>"
    Then I Submit to Batch
  Examples:
| Date From|Date Thru|Carrier From|Carrier Thru|Library|DDPS Filter Process|Include Missing HICN|Submitter ID|
| 010118|123118  |EVUSHMIC|EVUSHMIC|USRSHMI87|N|Y|SHMI|

 Scenario Outline: PDE Spool File Validation
 Given I am on RxClaim Operations Menu CCT Section
 When I take ws in command prompt section
 Then I Validate Status is "OUTQ"
 And I Validate Job Name is "RCPD1080"

   Examples:
| Test Field|  
| Test Data |

 Scenario Outline: Update PDE File with ACC, INF, REJ 
 Given I am on RxClaim Section
 When I run STRSQL in command prompt
 Then Update the PDE File with ACC REJ INF should be successful
 

   Examples:
| Test Field|  
| Test Data |

 Scenario Outline: Submit PDE for Management
 Given I am PDE Management Screen
 When I Enter Values in "<Claim Date of Service From>","<Claim Date of Service Thru>","<Contract From>","<Contract Thru>","<PBP From>","<PBP Thru>","<CMS Response Status ACC>","<CMS Response Status REJ>","<CMS Response Status INF>","<Edit Category>", "<Action Code>", "<Batch or Interactive>"
 Then Submit PDE JOB
 And Validate Extract Count of the Job Number Generated after PDE Submission


   Examples:
| Claim Date of Service From|Claim Date of Service Thru|Contract From|Contract Thru|PBP From|PBP Thru|CMS Response Status ACC|CMS Response Status REJ|CMS Response Status INF|Edit Category|Exclusion Code|Action Code|Batch or Interactive|
| 010118|123118|A1987|A1987|121|121|I|I|I|1|1|1|B|









