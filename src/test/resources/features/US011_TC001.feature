
Feature: US11_My Appointments Edit portal by Physician(Doctor)

@US11
  Scenario: TC001_Create a new appointment
    Given S go to Medunna website
    Then  S user logins as doctor
    Then S user goes to my page and clicks my appointments
    And S user clicks edit button for a patient
    And S user asserts that he can go to create and edit appointment page


