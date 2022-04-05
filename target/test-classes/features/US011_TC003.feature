Feature: US11_My Appointments Edit portal by Physician(Doctor)

@US011
Scenario: TC003_Doctor should type in Anamnesis, Treatment, and Diagnosis as required fields positive test
    Given go to Medunna website
    Then user logins as doctor
   Then user goes to my page and clicks my appointments
  And user clicks edit button for a patient
  And user sends text for anamnesis textbox
  Then user sends text for treatment textbox
  Then user sends text for diagnosis textbox
  And close the page

  Scenario: TC003_Doctor should type in Anamnesis, Treatment, and Diagnosis as required fields negative test
    Given go to Medunna website
    Then user logins as doctor
    Then user goes to my page and clicks my appointments
    And user clicks edit button for a patient
    Then user clicks anamnesis textbox but doesn't send text
    Then user clicks treatment textbox but doesn't send text
    And user gets invalid feedback warning
    Then user clicks diagnosis textbox  but doesn't send text
    And user gets invalid feedback warning
    Then user clicks prescription text box but doesn't send text
    And user gets invalid feedback warning
    #And close the page











