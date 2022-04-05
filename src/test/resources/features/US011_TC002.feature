Feature: US11_My Appointments Edit portal by Physician(Doctor)

  @US011
  Scenario: TC002_If you are updating an appointment, then user (doctor) should see patient's info such as
  id, start and end date, Status, physician and patient

    Given go to Medunna website
    Then user logins as doctor
    Then user goes to my page and clicks my appointments
    And user asserts the visibility of the appointment table
    And close the page