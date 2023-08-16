Feature: Test Guru99 Telecom Application

  Scenario: Test Add Customer Page Fuctionality
    Given User is on home page and click on add customer link
    Then User valiadte background check radio button
    And User enter firstname and lastname and email and address and mobile number
    And User click on submit button
    Then Capture customer id
    And click on home button

  Scenario: Test Add Tariff plan page fuctionality
    When User is on home page then click on add tariff plan link
    Then user enter monthly rental and free local minutes and free international minutes
    And user enter free sms pack and local per minutes charges and international per minutes charges and sms per charges
    And click on submit button
    And click on home button
    
    Scenario: Test Add Tariff Plan to Customer
    When User is on Home page then click on add tariff to customer plan link
    Then user enter customer id 
    And clicked on submit button
