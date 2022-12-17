
Feature: Test delete tweet functionality
  Scenario: Verify that user can delete tweet after posting
    Given User is already logged in
    And User clicks on tweet options
    And User clicks on delete tweet option
    When User confirms deleting tweet
    Then Tweet should be deleted