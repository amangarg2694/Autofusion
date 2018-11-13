Feature: Verify GAM ACS Provider File
 As a RxClaim User I want to Verify GAM ACS Provider File
 
 Scenario Outline: Verify GAM ACS Provider File
 Given I am on RxClaim PlanAdministrator Menu
 When  I select Option "CCT700" to navigate to "RxClaim Operations Menu"
 And I select Option "Edtlibl" to navigate to "Edit Library List"
 And I add "CLMV25GAM" library in library list  
 And I select Option "10" to navigate to "GAM Client Specific Menu"
 And I select Option "16" to navigate to "GAM ACS Provider File Load"
 And I enter input file "<inputfile>","<library1>","<pharvarfile>","<pharvarlib>","<presfile>","<preslib>","<pharstgfile>","<pharstglib>"
 And I press "F6" Key
 And I wait until the job "<jobname>","<user>" moves to "OUTQ"
 Then I validate the time  taken to load the data set
 And I go back to RxClaim PlanAdministrator Menu
 
 Examples: 
 |inputfile|library1|pharvarfile|pharvarlib |presfile |preslib |pharstgfile |pharstglib| jobname |user|
 |GAM180417|SR41386 |OUT_P1      |USRMADHU  |OUT_P2  |USRMADHU|OUT_P3     |USRMADHU  |GAMACSPVD|PRUS| 
 |GAM180330|SR41386 |OUT_P4      |USRMADHU  |OUT_P5  |USRMADHU|OUT_P6     |USRMADHU  |GAMACSPVD|PRUS|
 |GAM180401|SR41386 |OUT_P7      |USRMADHU  |OUT_P8  |USRMADHU|OUT_P9     |USRMADHU  |GAMACSPVD|PRUS|
 |GAM180403|SR41386 |OUT_P10     |USRMADHU  |OUT_P11 |USRMADHU|OUT_P12    |USRMADHU  |GAMACSPVD|PRUS|
 |GAM180413|SR41386 |OUT_P13     |USRMADHU  |OUT_P14 |USRMADHU|OUT_P15    |USRMADHU  |GAMACSPVD|PRUS|
 |GMA_F1   |SR41386 |OUT_P16     |USRMADHU  |OUT_P17 |USRMADHU|OUT_P18    |USRMADHU  |GAMACSPVD|PRUS|
 |GMA_F    |SR41386 |OUT_P19     |USRMADHU  |OUT_P20 |USRMADHU|OUT_P21    |USRMADHU  |GAMACSPVD|PRUS|
