Feature: Part D: Enhance performance of data selection job for PDE Management Tool
  I want to verify the performance

  @tag1
  Scenario Outline: Submit PDE for Management
    # When we have ONLY Contract PBP and CMS RESPONSE selected
    Given I am PDE Management Screen
    When I Enter Values in "<Claim Date of Service From>","<Claim Date of Service Thru>","<Contract From>","<Contract Thru>","<PBP From>","<PBP Thru>","<CMS Response Status ACC>","<CMS Response Status REJ>","<CMS Response Status INF>","<Batch or Interactive>"
    Then Submit PDE JOB
    And Validate Extract Count of the Job Number Generated after PDE Submission

    Examples: 
      | Claim Date of Service From | Claim Date of Service Thru | Contract From | Contract Thru | PBP From | PBP Thru | CMS Response Status ACC | CMS Response Status REJ | CMS Response Status INF | Batch or Interactive |
      |                     010218 |                     123118 | A5050         | A5050         |      399 |      399 | I                       | I                       | I                       | B                    |

  @tag2
  Scenario Outline: Submit PDE for Management Claims for Reprocessing
    Given I am on Record selection screen
    When I take function key to select all records
    Then I select all records  to process
    And I Process the Claims on PDE for Action Summary by Member "<Action Code>", "<Reprocess Reason Code>", "<Reprocess Note">

    Examples: 
      | Action Code | Reprocess Reason Code | Reprocess Note |
      | AGR         | PBP                   | TEST           |

  @tag3
  Scenario Outline: Submit PDE for Management
    # When we have Contract PBP , Edit Code ONLY
    Given I am PDE Management Screen
    When I Enter Values in "<Claim Date of Service From>","<Claim Date of Service Thru>","<Contract From>","<Contract Thru>","<PBP From>","<PBP Thru>","<CMS Response Status ACC>","<CMS Response Status REJ>","<CMS Response Status INF>","<Edit Category>",  "<Batch or Interactive>"
    Then Submit PDE JOB
    And Validate Extract Count of the Job Number Generated after PDE Submission

    Examples: 
      | Claim Date of Service From | Claim Date of Service Thru | Contract From | Contract Thru | PBP From | PBP Thru | CMS Response Status ACC | CMS Response Status REJ | CMS Response Status INF | Edit Category | Batch or Interactive |
      |                     010218 |                     123118 | A5050         | A5050         |      399 |      399 | I                       | I                       | I                       |             1 | B                    |

  #After this we will proceed for reprocessing and spool file validation of the batch job, then come back to PDE SCREEN
  #and run the Job again. But this time with Action Code and reprocess. The next scenario outline is for that
  @tag4
  Scenario Outline: Submit PDE for Management
    #  When we have Contract PBP , Edit Code and Action code from here
    Given I am PDE Management Screen
    When I Enter Values in "<Claim Date of Service From>","<Claim Date of Service Thru>","<Contract From>","<Contract Thru>","<PBP From>","<PBP Thru>","<CMS Response Status ACC>","<CMS Response Status REJ>","<CMS Response Status INF>","<Edit Category>", "<Action Code>", "<Batch or Interactive>"
    Then Submit PDE JOB
    And Validate Extract Count of the Job Number Generated after PDE Submission

    Examples: 
      | Claim Date of Service From | Claim Date of Service Thru | Contract From | Contract Thru | PBP From | PBP Thru | CMS Response Status ACC | CMS Response Status REJ | CMS Response Status INF | Edit Category | Action Code | Batch or Interactive |
      |                     010218 |                     123118 | A5050         | A5050         |      399 |      399 | E                       | I                       | E                       |             1 |           1 | B                    |

  @tag5
  Scenario Outline: Submit PDE for Management
    #  When we have Contract PBP , Edit Code & Exclusion Code
    Given I am PDE Management Screen
    When I Enter Values inn "<Claim Date of Service From>","<Claim Date of Service Thru>","<Contract From>","<Contract Thru>","<PBP From>","<PBP Thru>","<CMS Response Status ACC>","<CMS Response Status REJ>","<CMS Response Status INF>","<Edit Category>", "<Exclusion Code>",  "<Batch or Interactive>"
    Then Submit PDE JOB
    And Validate Extract Count of the Job Number Generated after PDE Submission

    Examples: 
      | Claim Date of Service From | Claim Date of Service Thru | Contract From | Contract Thru | PBP From | PBP Thru | CMS Response Status ACC | CMS Response Status REJ | CMS Response Status INF | Edit Category | Exclusion Code | Batch or Interactive |
      |                     010218 |                     123118 | A5050         | A5050         |      399 |      399 | E                       | I                       | E                       |             1 |              1 | B                    |
