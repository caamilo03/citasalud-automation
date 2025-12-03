# Authors: Camilo y Luis
# language: en

Feature: CitaSalud User Authentication
  As a CitaSalud user
  I want to log in with my credentials
  So that I can access my healthcare account


  @smoke
  Scenario Outline: User Logs in with valid credentials
    Given the user opens the CitaSalud page
    When the user tries to sign in with "<user>" and "<password>"
    Then the user should see the PQRS main page

    Examples:
      | user     | password  |
      | usuario  | 123456    |
      | luiscruz | luis123   |

  @smoke
  Scenario Outline: User Logs in with invalid credentials
    Given the user opens the CitaSalud page
    When the user tries to sign in with "<user>" and "<password>"
    Then the user should see the PQRS main page

    Examples:
      | user     | password  |
      | usuario2 | 123456    |
      | usuario  | 1234567   |
      | luiscruz |           |
      |          | 123456    |

