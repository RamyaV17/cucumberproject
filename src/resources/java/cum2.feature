 Feature: performance of function
 
    @Login
    Scenario: User Login
    Given User must be registered
    When User enters credentials and performs login
    Then User must be in the home page
@Register
    Scenario: User Registeration
     Given User must be registered
    When User enter details
    Then  User Registeration
       
      @Search
      Scenario: Search
        Given User must be logged in
    When search for a product
    Then product detail must be displayed
       
