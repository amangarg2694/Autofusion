Feature: CHF file Validation
As a RxClaim User I want to Validate CHF file
    
             
   Scenario Outline: CHF file Validation
   Given I am on RxClaim PlanAdministrator Menu 
 		When I submit a SQLQuery and FTP the file "<FileName>","<LibraryName>","<FTPCMD>"
    Then Validate Acutal CHF file "<ActualFilePath>" with the expected file "<ExpectedFilePath>"
  
    
    Examples:
    | FileName  | LibraryName| FTPCMD                                                                   |ActualFilePath               |ExpectedFilePath|
	  | CHFRUP17  | VMANCHU_LI |	PUTDBFFTP FROMFILE(VMANCHU_LI/CHFRUP10) RMTFIL(TEST15.csv) FMTOPT(*YES) |UHCCOMM20180903_RXCHF70CL.txt|Expected CHF Data.csv|

        