Feature: Appointment Api Test

  @ApiAppointment
  Scenario Outline: Appointment Api Testing

    Given AG user set path params
    Given AG user enter expected data "<FirstName>" "<LastName>" "<SSN>" "<Email>" "<Phone>" "<Date>"
    And AG user send request and get response
    Then AG user save API data to file
    And AG user verify  API data

    Examples:
      | FirstName | LastName | SSN | Email | Phone | Date |
      |Api        |API       |386-34-4161|av.arifgungorur|8572659314|11.11.2022|