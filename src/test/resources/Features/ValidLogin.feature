Feature: Login functionality

  Background:
    Given I am on the  app homepage
    And I click on signin


  Scenario: User should be able to login with valid credentials

    And I enter valid username
    And I enter valid password
    When i Click the login button
    Then I should be logged in successfully

    #The user for test should be ,......