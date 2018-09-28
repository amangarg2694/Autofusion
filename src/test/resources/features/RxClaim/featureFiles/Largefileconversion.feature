Feature: Large File Conversion Setup
Large File Conversion Setup to test conversion scenarios
    
             
    Scenario Outline: Large File Conversion Setup in staging area
    
    Given I am on RxClaim PlanAdministrator Menu 
    When I create a prod library stage library "<Prod Library>" ,"<Stage Library>"  
    When I copy objects from prod library "<File>", "<TCLlibrary1>" ,"<Prod Library>"     
    And I copy objects from stage library "<File>", "<TCLlibrary2>" ,"<Stage Library>"   
    And I copy Data Program Conversion program to stage library  "<sr>","<Stage Library>"
    And I copy CV file to stage library with data "<CV File>","<BL Library>","<Stage Library>"
    And I create Journal Receiver "<Journal Receiver>","<Prod Library>"
    And I create Journal  "<Journal>","<Prod Library>","<Journal Receiver>","<Prod Library1>"
    And I start Journal "<Physical File>","<Prod Library>", "<Journal>","<Prod Library1>"
    And I navigate to staging area to create a new stg area "<Stage Area>" ,"<Stage Library>" ,"<Prod Library>"
    Then I start conversion process 
    And Validate if Copy is hundred percent

 

    Examples: 
   |Prod Library|Stage Library|File|TCLlibrary1|Prod Library|File|TCLlibrary2|Stage Library|sr|Stage Library|CV File|BL Library|Stage Library|Journal Receiver|Prod Library|Journal|Prod Library|Journal Receiver|Prod Library|Physical File|Prod Library|Journal|Prod Library|Stage Area|Stage Library|Prod Library|
   |USRPF1|USRSF1|RCPGO*|TCL8402FIL|USRPF1|RCPGO*|TCL8403FIL|USRSF1|SR41698|USRSF1|CV41698PNO|BLCLM8403F|USRSF1|JRNRCV|USRPF1|JRN|USRPF1|JRNRCV|USRPF1|RCPGOP|USRPF1|JRN|USRPF1|STGPOP|USRSF1|USRPF1|