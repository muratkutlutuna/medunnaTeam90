
Feature: US024 :Patient display test results and invoice
  @UIRana2Test

  Scenario: Patient should be able to see test results and invoice.

    Given RT Patient goes to home page
    And RT Patient sign in with valid credentials
    Then RT Patient click on my appointment
    And RT Patient click show test results button
    And RT Patient click view results button
    And RT Patient see ordered tests and results
    Then RT Patient navigate back to tests page
    And RT Patient navigate back to appointments page
    Then RT Patient click on show invoice button
    Then RT Patient views invoice

