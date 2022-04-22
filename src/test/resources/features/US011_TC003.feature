Feature: US11_My Appointments Edit portal by Physician(Doctor)

@US011
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












