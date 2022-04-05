Feature: US11_My Appointments Edit portal by Physician(Doctor)

  @TC001
  Scenario: TC001_Create a new appointment
    Given go to Medunna website
    Then user logins as doctor
    Then user goes to my page and clicks my appointments
    And user clicks edit button for a patient
    And user asserts that he can go to create and edit appointment page
    Then close the page

