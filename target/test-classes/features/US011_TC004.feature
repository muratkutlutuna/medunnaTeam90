Feature: US11_My Appointments Edit portal by Physician(Doctor)

  @US011
  Scenario: TC004_Prescription and description can be optional
    Given S go to Medunna website
    Then S user logins as doctor
    Then S user goes to my page and clicks my appointments
    And S user clicks edit button for a patient
    Then S user sends text for prescription textbox
    Then S user sends text for description textbox
    And S close the page
