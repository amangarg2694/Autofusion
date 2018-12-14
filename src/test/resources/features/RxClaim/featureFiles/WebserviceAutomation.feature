Feature: As a RxClaim user , I want to send a soap request and validate the response

  Scenario Outline: As a user , I want to send a soap request and validate the response 
   Given the API running at "https://aesystestproxy-vm.uhc.com:22443/upm4/soap/optumrx/member/ReadBenefitAndDrugEligibilityV8"
   When I send the GET request "<InputRequest XML>" with "<Carrier>","<Account>","<Group>","<Plan>","<Gpi>","<NDC>","<Claim Number>","<Seq>" and save the response to "<OutputFileName>" 
   Then I validate the response file "<OutputFileName>" for tags "<ExpectedTag FileName>" with values "<Expected TagValue>"
    
    
    Examples:
   |InputRequest XML                      |Carrier  |Account   |Group     |Plan    |Gpi            |NDC         |Claim Number    |Seq|OutputFileName                          |ExpectedTag FileName                      |Expected TagValue                        |
   |ReadBenefitAndDrugEligibility_Request1|SN003531A|SN003531B |SN003531G |SR42243 |47100030201505 |00187420304 |183321616215000 |999|ReadBenefitAndDrugEligibility_Response1 |ReadBenefitAndDrugEligibility_Response1   |tag1= ,tag2= ,tag3= ,tag4= ,tag5= ,tag6=N| 
    
     
    
    
       