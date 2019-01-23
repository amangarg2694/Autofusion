Feature: Jobsubmission

Scenario Outline: Check the valid job submission
Given I am on RxClaim PlanAdministrator Menu
When I submit job "<sbmjob1>" 
Then  I wait until the job "<jobname>","<user>" moves to "OUTQ"
Then I validate the job "<jobname>","<user>".



Examples:
|sbmjob1                                                                                                                                                                                                                                                                                                                              |jobname  |user|
|SBMJOB CMD(CALL PGM(RX331421C2) PARM('CLAIM' ' ' '3025' '004336' '*' 'B1' 'BABU05' ' ' ' ' '1' '1' '1' '19910101' '07' '1476969' '01' '1184718744' '03' '57894064001' '10' '   ' '10' '0' '00' '20180505' '123456789011' '000129.99 ' '  ' '  ' '  ' '  ' '  ' '  ' '  ' '     ' '  ' '  ' '  ' '  ' '123459997951')) JOB(RX331421C2)|sbm_claim|PRUS|
