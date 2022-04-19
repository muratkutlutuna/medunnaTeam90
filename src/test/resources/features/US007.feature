Feature: Appointment Test

  @UIAppointment
  Scenario: Appointment Testing

    Given AG user enter the mainpage
    Given AG user enter FirstName and LastName "<FirstName>" and "<LastName>"
    And AG user enter SNN "<SSN>"
    Then AG user enter email "<Email>"
    And AG user enter phone "<Phone>"
    Then AG user enter date "<Date>"
    And AG  confirm appointment request


