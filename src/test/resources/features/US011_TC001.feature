@US11
Feature: US11_My Appointments Edit portal by Physician(Doctor)


  Scenario: TC001_Create a new appointment
    Given S go to Medunna website
    Then  S user logins as doctor
    Then S user goes to my page and clicks my appointments
    And S user clicks edit button for a patient
    And S user asserts that he can go to create and edit appointment page

  Scenario: TC002_If you are updating an appointment, then user (doctor) should see patient's info such as
  id, start and end date, Status, physician and patient

    Given S go to Medunna website
    Then S user logins as doctor
    Then S user goes to my page and clicks my appointments
    Then S user clicks edit button for a patient
    And S user asserts the visibility of the patients' id
    And S user asserts the visibility of the patients' appointment start date
    And S user asserts the visibility of the patients' appointment end date
    And S user asserts the visibility of the patients' appointment status
    And S user asserts the visibility of the patients' doctor name
    #And S user asserts the visibility of the patients' name


  Scenario: TC003_Doctor should type in Anamnesis, Treatment, and Diagnosis as required fields positive test
    Given S go to Medunna website
    Then S user logins as doctor
    Then S user goes to my page and clicks my appointments
    And S user clicks edit button for a patient
    And S user sends text for anamnesis textbox
    Then S user sends text for treatment textbox
    Then S user sends text for diagnosis textbox


  Scenario: TC003_Doctor should type in Anamnesis, Treatment, and Diagnosis as required fields negative test
    Given S go to Medunna website
    Then S user logins as doctor
    Then S user goes to my page and clicks my appointments
    And S user clicks edit button for a patient
    Then S user clicks anamnesis textbox but doesn't send text
    Then S user clicks treatment textbox but doesn't send text
    And S user gets invalid feedback warning
    Then S user clicks diagnosis textbox  but doesn't send text
    And S user gets invalid feedback warning
    Then S user clicks prescription text box but doesn't send text
    And S user gets invalid feedback warning


  Scenario: TC004_Prescription and description can be optional
    Given S go to Medunna website
    Then S user logins as doctor
    Then S user goes to my page and clicks my appointments
    And S user clicks edit button for a patient
    Then S user sends text for prescription textbox
    Then S user sends text for description textbox

  Scenario: TC005_Status can be only selected as PENDING, COMPLETED or CANCELLED by Doctor

    Given S go to Medunna website
    Then S user logins as doctor
    Then S user goes to my page and clicks my appointments
    And S user clicks edit button for a patient
    Then S user selects pending as status
    Then S user selects completed as status
    Then S user selects cancelled as status



