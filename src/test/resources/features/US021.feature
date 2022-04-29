@US021
Feature: US021_Show appointments for patients by Staff

  Background: Go for the patient
    Given S go to Medunna website
    Then S user logins as staff
    And S user clicks my pages, search patient
    Then S user sends a patient ssn for the search box

  Scenario: TC001_Staff can only update appointments

    Then S user clicks show appointments button
    Then S user clicks edit button
    And S user asserts the visibility of appointment page

    Scenario: TC002_Staff can make the status UNAPPROVED, PENDING or CANCELLED, but cannot make
    it COMPLETED
      Then S user clicks show appointments button
      Then S user clicks edit button
      Then S user selects unapproved as status and takes ss
      Then S user selects pending as status and takes ss
      Then S user selects cancelled as status and takes ss

      Scenario: TC003_Staff does not need to provide Anamnesis, Treatment or Diagnosis as required fields
        Then S user clicks show appointments button
        Then S user clicks edit button
        Then S user clicks anamnesis box without writing anything
        Then S user clicks treatment box without writing anything
        Then S user clicks diagnosis box without writing anything
        Then S user clicks save button

        Scenario: TC004_They can select the current doctor that needs to be selected for the patient
          Then S user clicks show appointments button
          Then S user clicks edit button
          Then S user goes to physician dropdown and chooses  a doctor
          Then S user clicks save button
          And S user asserts that changes have been saved

  @SmokeTest2
          Scenario: TC005_They can view the patients test results
            Then S user clicks show appointments button
            And S user clicks show tests button
            Then S user chooses a test and clicks on view results
            Then S user asserts the visibility of test results