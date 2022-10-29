@ignore
Feature: Login Funtionality

  Scenario: lOgin with invalid credentials should return the error message

    Given I am on the landing page
    When I select the sign in link
    And I enter Correct Username
    And I enter Incorrect password
    When I click the login button
    Then I should get the correct error message
