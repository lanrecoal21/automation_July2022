Feature: Add a new user address

  Background:
    Given I am on the app homepage
    And I click on SignIn
    And I enter valid username
    And I enter valid password
    When I click the login button

  Scenario: User should be able to add new address

    And I click my addresses
    Then I click add to new address
    Then I fill in the required field
    And I click save button