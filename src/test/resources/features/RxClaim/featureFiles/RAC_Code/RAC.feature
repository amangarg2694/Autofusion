Feature: RAC CODE implementation	
Scenario Outline: RAC code implementation

 Given I am on RxClaim PlanAdministrator Menu  
 When I select Option "1" to navigate to "Eligibility/Claim Transaction Maintenance" 
 And I select Option "2" to navigate to "Active/Eligible Member by ID"
 Then I enter "<MemberID>" in Active/Eligible Member by ID screen  to extract data for "<Iterations>" members
 
 Examples:
 |MemberID|Iterations|
 #|SR42440-H1652|
 #|SR42440-P143|20|
 #|SR42440-P208|20|
 #|SR42440-P231|20|
 #|SR42440-P293|20|
 #|SR42440-P315|20|
 #|SR42440-P755|20|
 #|SR42440-P781|20|
 #|SR42440-P818|20|
# |SR42440-P845|20|
# |SR42440-P873|20|  
 #|SR42440-L1|42|
 #|SR42440-K0|194|
 #|SR42440-S93|
# |SR42440-R1|42|
 #|SR42440-P1|30|
# |SR42440-P53|11|
# |SR42440-P131|12|

 
# |SR42440-H314|577|
# |SR42440-S892|
 #|SR42440-C46|4|
 #|SR42440-A170|5|
 # |SR42440-S977|23|
 # |SR42440-S2081|176|
  ##|SR42440-S3005|564|
 # |SR42440-H142|21|
 #|SR42440-H208|20|
 #|SR42440-H231|20|
 #|SR42440-H293|42|
 # |SR42440-H767|18|
 #|SR42440-H781|20|
# |SR42440-H818|20|
 #|SR42440-H845|20|
 #|SR42440-H873|20|
 #|SR42440-P1014|11|
#  |SR42440-P1053|9|
 # |SR42440-P1086|30|
  #|SR42440-P1141|20|
  #|SR42440-P1177|11|
  #|SR42440-P1234|20|
  #|SR42440-P1268|21|
 # |SR42440-P1309|10|
  # |SR42440-P1360|22|
   #|SR42440-P1401|20|
   #|SR42440-P1461|2|
   #|SR42440-P1495|20|
   #|SR42440-P1548|20|
   #|SR42440-P1591|20|
   #|SR42440-P1611|20|
  #|SR42440-P1674|20|
 # |SR42440-P1697|12|
 # |SR42440-P1710|29|
  # |SR42440-P1742|10|
   #|SR42440-P1761|29|
   #|SR42440-P1793|8|
 #|SR42440-P1811|15|
  #|SR42440-P1827|7|
# |SR42440-P1843|48|
   # |SR42440-P1892|31|
    # |SR42440-P1927|12|
    #|SR42440-P1940|16|
     #|SR42440-P1968|61|
    # |SR42440-P1996|33|
     #|SR42440-P2001|28|
      #|SR42440-P2035|10|
     # |SR42440-P2051|2|
      # |SR42440-P2072|10|
      #|SR42440-K1|28|
      #|SR42440-B1|28|
     # |SR42440-C1|28|
      #|SR42440-M1|28|
      #|SR42440-D1|28|
      #|SR42440-E1|28|
       #|SR42440-F1|28|
       # |SR42440-G1|28|
        #|SR42440-J1|28|
        #|SR42440-O1|28|
       # |SR42440-T1|28|
        #|SR42440-U1|28|
        #|SR42440-V1|28|
        #|SR42440-W1|28|
        #|SR42440-X1|28|
        #|SR42440-Y1|28|
        #|SR42440-Z1|28|
        #|SR42440-B100|27|
       # |SR42440-C100|27|
        #|SR42440-D100|27|
          #|SR42440-E100|11|
          #|SR42440-F100|11|
          #|SR42440-G100|11|
          #|SR42440-J100|11|
          #|SR42440-K200|17|
           # |SR42440-A1|175|
           #|SR42440-M200|16|
           #|SR42440-N200|16|
           #|SR42440-O200|16|
           #|SR42440-T200|11|
           #|SR42440-U200|11|
           #|SR42440-V200|16|
           #|SR42440-W200|16|
           #|SR42440-X200|11|
           #|SR42440-Y200|11|
           #|SR42440-B300|3|
           #|SR42440-C300|3|
           #|SR42440-D300|3|
           #|SR42440-E300|3|
           #|SR42440-F300|3|
           #|SR42440-G300|3|
           #|SR42440-J300|3|
           #|SR42440-K300|3|
           #|SR42440-M300|2|
           #|SR42440-N300|3|
           #|SR42440-O300|3|
           #|SR42440-T300|3|
           #|SR42440-U300|3|
           #|SR42440-V300|10|
           #|SR42440-M400|3|
           #|SR42440-M404|2|
           #|SR42440-M407|8|  
           #|SR42440-Q126|49|  
           #|SR42440-L1|10|
           #|SR42440-R11|10|  
           #|SR42440-P20|11|
           #|SR42440-P53|11|  
           #|SR42440-P131|12|
           #|SR42440-H143|11|
           #|SR42440-H218|10|
           #|SR42440-H241|10|
          # |SR42440-H300|11|
           #|SR42440-H1014|11|
           #|SR42440-H1041|10|
           #|SR42440-H1096|10|
           #|SR42440-H1151|10|
           #|SR42440-H1177|11|
           #|SR42440-H1234|11|
           #|SR42440-H1278|11|
           #|SR42440-H1309|10|
           #|SR42440-H1360|11|
           #|SR42440-H1401|10|
           #|SR42440-H1471|10|
           #|SR42440-H1495|10|
          #|SR42440-H1548|11|
          #|SR42440-H1591|10|
         # |SR42440-H1621|10|
         # |SR42440-H1684|10|
          #|SR42440-H1697|11|
          #|SR42440-H1710|16|
         # |SR42440-H1726|13|
         # |SR42440-H1742|10|  
        #  |SR42440-H1761|12|
          #|SR42440-H1774|16|  
         # |SR42440-H1793|8|
         # |SR42440-H1811|15|
          #|SR42440-H1827|7|   
          #|SR42440-H1843|16| 
         # |SR42440-H1865|11|
           #|SR42440-H1876|15|
           #|SR42440-H1892|16|
           #|SR42440-H1925|14|
           #|SR42440-H1940|16|
           #|SR42440-H1968|4|
           #|SR42440-H1972|11|
           #|SR42440-H1993|11|
          # |SR42440-H2004|11|
          # |SR42440-H2019|10|
           #|SR42440-H2035|10|
           #|SR42440-H2051|2|
           #|SR42440-H2072|10|
           #|SR42440-H315|10|
           #|SR42440-H763|12|
           #|SR42440-H781|10|
           #|SR42440-H826|10|
           #|SR42440-H845|10|
           #|SR42440-H882|10|	 
           #|SR42440-K1|10|
            #|SR42440-B11|10|   
             # |SR42440-C1|10|    
            # |SR42440-M11|10|  
             # |SR42440-D1|10|   
              # |SR42440-E11|10| 
               # |SR42440-F1|10| 
                 #|SR42440-G11|10| 
                 # |SR42440-J1|10| 
                   #|SR42440-O11|10| 
                   #|SR42440-J1|10| 
                   #|SR42440-U11|10|
                  # |SR42440-V1|10|  
                  # |SR42440-W11|10| 
                   #|SR42440-X11|10| 
                  # |SR42440-Y1|10| 
                  # |SR42440-Z11|10| 
                   # |SR42440-B100|10|
                    #|SR42440-C100|10|
                    #|SR42440-D100|10|
                    #|SR42440-E100|10|
                    #|SR42440-F100|10|
                    ## |SR42440-G100|10|
                   #  |SR42440-J100|10|
                   #  |SR42440-K200|10|
                     #|SR42440-S2098|10|
                     #|SR42440-S2114|10|
                     #|SR42440-S2130|10|
                     #|SR42440-S2146|10|
                     #|SR42440-C2162|10| 
                    # |SR42440-F2178|10|
                     #|SR42440-F2194|10|
                     #|SR42440-F2210|10|
                    # |SR42440-F2227|9|
                   # |SR42440-T91|3|
                    #|SR42440-M160|13|
                    #|SR42440-R100|49|
                      |SR42440-F2243|15|
                   
                    
                    
                   
                   
                   
                   
          