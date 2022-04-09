@US014
Feature: Doctor should be able to see and update inpatients informations

  @US014_TC001
  Scenario: Doctor should be able to see and update inpatients informations
    Given FY Doctor navigates to Medunna homepage
    And FY Doctor clicks on human icon
    And FY Doctor clicks on signIn button  under human icon at homepage
    And FY Doctor sends username "fatihmustafa" and password "Batch44+" in sign in page
    And  FY Doctor clicks on signIn button in sign in page
    And FY Doctor validates he is in doctorpage
    And FY Doctor clicks on MY PAGES button
    And FY Doctor clicks on My inpatients button
    And FY Doctor validates he is in In Patients page
    And FY Doctor changes fromDate and toDate to see his inpatients
    And FY Doctor sees all inpatients informations
    And FY Doctor clicks on edit button in inpatient page
    And FY Doctor validate he is in inpatient create or edit page
    And FY Doctor is able to update start date part
    And FY Doctor is able to update end date part
    And FY Doctor is able to update description part
    And FY Doctor is able to update created date part
    And FY Doctor is able to update appointment part
    And FY Doctor clicks on save button in inpatient edit page
    Then FY Doctor should verify toast container success message


    @US014_TC002

    Scenario: Doctor should be able to update inpatient status
      Given FY Doctor navigates to Medunna homepage
      And FY Doctor clicks on human icon
      And FY Doctor clicks on signIn button  under human icon at homepage
      And FY Doctor sends username "fatihmustafa" and password "Batch44+" in sign in page
      And  FY Doctor clicks on signIn button in sign in page
      And FY Doctor validates he is in doctorpage
      And FY Doctor clicks on MY PAGES button
      And FY Doctor clicks on My inpatients button
      And FY Doctor validates he is in In Patients page
      And FY Doctor changes fromDate and toDate to see his inpatients
      And FY Doctor clicks on edit button in inpatient page
      And FY Doctor validate he is in inpatient create or edit page
      And FY Doctor should be able to update inpatient status
      And FY Doctor clicks on save button in inpatient edit page
      Then FY Doctor should verify toast container success message


  @US014_TC003

  Scenario: Doctor should be able to update inpatient room
    Given FY Doctor navigates to Medunna homepage
    And FY Doctor clicks on human icon
    And FY Doctor clicks on signIn button  under human icon at homepage
    And FY Doctor sends username "fatihmustafa" and password "Batch44+" in sign in page
    And  FY Doctor clicks on signIn button in sign in page
    And FY Doctor validates he is in doctorpage
    And FY Doctor clicks on MY PAGES button
    And FY Doctor clicks on My inpatients button
    And FY Doctor validates he is in In Patients page
    And FY Doctor changes fromDate and toDate to see his inpatients
    And FY Doctor clicks on edit button in inpatient page
    And FY Doctor validate he is in inpatient create or edit page
    And FY Doctor should be able to update inpatient room
    And FY Doctor clicks on save button in inpatient edit page
    Then FY Doctor should verify toast container success message







