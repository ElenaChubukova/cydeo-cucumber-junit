Feature: Etsy Title Verification

  User story TC#51
Background:
  Given user is on homepage

  Scenario: Etsy title verification
    Then user sees title is as expected

  Scenario: Etsy search functionality title verification
    When user types Wooden Spoon in the search box
    And user clicks search button
    Then user sees Wooden Spoon is in the title

  Scenario: Etsy Search Functionality Title Verification (with parameterization)
    When user types "Wooden Spoon" in the search box
    And user clicks search button
    Then user sees "Wooden spoon" is in the title

