Feature: US11_My Appointments Edit portal by Physician(Doctor)

  @US011
  Scenario: Status can be only selected as PENDING, COMPLETED or CANCELLED by Doctor

    Given S go to Medunna website
    Then S user logins as doctor
    Then S user goes to my page and clicks my appointments
    And S user clicks edit button for a patient
    Then S user selects pending as status
    Then S user selects completed as status
    Then S user selects cancelled as status
