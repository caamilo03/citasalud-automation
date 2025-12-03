# Authors: Your Name
# language: en

Feature: PQRS Management in CitaSalud
  As a CitaSalud user
  I want to submit a PQRS (Request, Complaint, Claim, or Suggestion)
  So that I can manage my inquiries effectively.

  Background:
    Given the user opens the CitaSalud page
    When the user tries to sign in with "usuario" and "123456"
    Then the user should see the PQRS main page

  @smoke
  Scenario Outline: Successful PQRS submission
    Given the user navigates to the CitaSalud PQRS page
    When the user fills out the PQRS form with the following information
      | field       | value          |
      | name        | <name>         |
      | email       | <email>        |
      | phone       | <phone>        |
      | type        | <type>         |
      | description | <description>  |
    And the user submits the form
    Then the user should see a successful confirmation message

    Examples:
      | name        | email                  | phone       | type      | description                |
      | Juan Perez  | juan.perez@example.com | 3001234567  | Request   | Information request        |