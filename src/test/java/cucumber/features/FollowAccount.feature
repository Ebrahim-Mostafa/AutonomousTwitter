
Feature: Test search on twitter account and follow functionality
  Scenario: Verify that user can search on account and follow it
    Given User is already logged in
    And User clicks on search icon
    And User clicks on search field
    When User type searched account
    Then User can see the searched account
    Then User clicks on searched account
    Then User click on follow button