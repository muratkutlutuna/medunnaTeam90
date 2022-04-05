Feature: US11_My Appointments Edit portal by Physician(Doctor)

  @US011
  Scenario: TC004_Prescription and description can be optional
    Given go to Medunna website
    Then user logins as doctor
    Then user goes to my page and clicks my appointments
    And user clicks edit button for a patient
    Then user sends text for prescription textbox
    Then user sends text for description textbox
    And close the page
