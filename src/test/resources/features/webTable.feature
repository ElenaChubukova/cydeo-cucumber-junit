Feature: user should be able to login using correct credentials

  Background: user is on on the login page
    Given user in on login page of web table app

  Scenario: Positive login
    When user enters username "Test"
    And user enters password "Tester"
    And user clicks login button
    Then user should see url contains orders

  Scenario: Positive login
    When user enters username "Test" password "tester" and clicks logInButton
    Then user should see url contains orders


  Scenario: User should be able to see all 12 months in months dropdown
    When User enters below credentials
      | username | Test   |
      | password | Tester |
    Then user should see url contains orders



