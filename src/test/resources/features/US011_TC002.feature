Feature: US11_My Appointments Edit portal by Physician(Doctor)

  @US011
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
    And S user asserts the visibility of the patients' name

