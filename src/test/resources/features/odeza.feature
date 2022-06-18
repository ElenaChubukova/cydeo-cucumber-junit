
Feature: Odeza app features verify

  User Story: As a user, when I'm on Odeza page
              I should be able to do different manipulations and see relevant information
Background:
  Given user is on Odeza homepage

  Scenario: Odeza url verification
    Then user sees Odeza in the url
@wip
  Scenario: Odeza functionality verification
    Given user is on Odeza homepage
    When user navigates to the Solutions menu
    And user clicks Appointment Autofill from the drop-down menu
    Then user sees Appointment Autofill in the url

  Scenario: Odeza address verification
    Given user is on Odeza homepage
    When user navigates to Contact in the footer
    Then users should see address presented in the page

