Feature: Country Functionality

  Scenario: Create Country
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfuly
    And Navigate to Country page
    When create a country
    Then Success message should be displayed

