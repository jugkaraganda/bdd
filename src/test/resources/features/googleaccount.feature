Feature: Using emails to access google account

  @ignore
  Scenario: Creating a new email
    Given user is on 'google accounts' page

  Scenario: Login succeeds using existing email
    Given user is on 'google accounts' page
    When user enters 'jugkaraganda' email
    And user submits email
    And user enters their password
    And user submits password
    Then 'my account' page is open

  Scenario: Login fails using not existing email
    Given user is on 'google accounts' page
    When user enters 'jugkrgfake' email
    And user submits email
    Then 'google accounts' page is open
    And unknown email message is present