Feature: US11_My Appointments Edit portal by Physician(Doctor)

  @US011
  Scenario: Status can be only selected as PENDING, COMPLETED or CANCELLED by Doctor

    Given go to Medunna website
    Then user logins as doctor
    Then user goes to my page and clicks my appointments
    And user clicks edit button for a patient
    Then user selects pending as status
    Then user selects completed as status
    Then user selects cancelled as status
