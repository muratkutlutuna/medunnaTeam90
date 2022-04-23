Feature: Appointment Api Test

  @ApiAppointment
  Scenario: Appointment Api Testing

    Given AG user set path params
    Given AG user enter expected data FirstName LastName SSN Email Phone Date
    And AG user send request and get response
    Then AG user save API data to file
    And AG user verify  API data

