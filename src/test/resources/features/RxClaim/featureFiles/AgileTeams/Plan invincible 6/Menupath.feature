Feature: Need to run automation script to get path of different screens

  Scenario Outline: Excel write
    When Read excel file "<filePath>","<fileName>","<sheetName>"
    And Go to menu path
    And write excel file "<filePath>","<fileName>","<sheetName>"

    Examples: 
      | filePath | fileName | sheetName |
      |C:/Users/Agarg131/Desktop/Automation testing|ExcelGuru99Demo.xlsx|Sheet1|
