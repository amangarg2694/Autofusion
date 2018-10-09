Feature: CHF file Validation
As a RxClaim User I want to Validate CHF file
    
             
   Scenario Outline: CHF file Validation
    Given I am on RxClaim PlanAdministrator Menu 
    When I submit a SQLQuery and FTP the file "<FileName>","<LibraryName>","<FTPCMD>"
    And I submit job CMD  for Expected File
    Examples:
    | FileName | LibraryName| FTPCMD |
	  | CHFRUP9  | VMANCHU_LI |	PUTDBFFTP FROMFILE(VMANCHU_LI/CHFRUP9) RMTFIL(TEST14.txt) FMTOPT(*YES) |

        