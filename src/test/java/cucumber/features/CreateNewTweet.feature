
Feature: Test create new tweet with logged in account
  Scenario: Verify that user can post new tweet from his account
    Given User is already logged in
    And User clicks on twitter plus icon on home screen
    And User clicks on create new tweet
    And User clicks write new tweet from his account
    And User write tweet
    When User clicks on tweet button
    Then User clicks on new tweet toast