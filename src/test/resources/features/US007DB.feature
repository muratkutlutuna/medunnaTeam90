Feature: DB Appointment test

  Background: db connection set up
    Given user creates a connection with DB using "jdbc:postgresql://medunna.com:5432/medunna_db" and "medunnadb_user" , "Medunnadb_@129"

  @DBAppointmentTest
  Scenario Outline: db validation
    Given user sends the query to DB and gets the column data "<query>" and "<columnName>"
    And user saves DB records to correspondent files
    Then user validates DB Appointment data

    Examples: test data
    |query|columnName|
    |Select * from appointment |start_date|