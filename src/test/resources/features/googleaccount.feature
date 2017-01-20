Feature: Using emails to access google account

  @ignore
  Scenario: Creating a new email
    Given user is on google accounts page

  Scenario: Login succeeds using existing email
    Given user is on google accounts page
    When user enters 'jugkaraganda' email
    And user goes to next page
    And user enters their password
    And user clicks Enter button
    Then user appears on myaccount page

  Scenario: Login fails using not existing email
    Given user is on google accounts page
    When user enters 'jugkrgfake' email
    And user goes to next page
    Then login fails with message about unknown email