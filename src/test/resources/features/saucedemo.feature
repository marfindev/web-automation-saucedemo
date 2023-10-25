Feature: Saucedemo Website Automation

  Scenario: User logs in successfully
    Given User is on the Saucedemo login page
    When User enters username "standard_user" and password "secret_sauce"
    And User clicks on the login button
    Then User is redirected to the products page

#  Scenario: User logs in with invalid credentials
#    Given User is on the Saucedemo login page
#    When User enters username "invalid_user" and password "invalid_password"
#    And User clicks on the login button
#    Then User should see an error message