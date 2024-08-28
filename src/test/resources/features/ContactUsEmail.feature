Feature: Email Address field in Contact US Page

  Scenario: Valid Email Address
    Given User is on Contact Us Page
    When When the user enters a valid email address
      |user@example.com|
    And the user submits the form
    Then the form should be submitted successfully

  Scenario: Email Address with Missing '@' Symbol
    Given User is on Contact Us Page
    When the user enters an email address missing the @ symbol
      |useratexample.com|
    And the user submits the form
    Then user should see an error message indicating that the email address is invalid

  Scenario: Email Address with Missing Domain
    Given User is on Contact Us Page
    When the user enters an email address missing the domain part
      |user@.com|
    And the user submits the form
    Then user should see an error message indicating that the email address is invalid

  Scenario: Email Address with Multiple '@' Symbols
    Given User is on Contact Us Page
    When the user enters an email address with multiple @ symbols
      |user@@example.com|
    And the user submits the form
    Then user should see an error message indicating that the email address is invalid