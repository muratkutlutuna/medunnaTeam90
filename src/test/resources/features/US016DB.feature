
Feature: Validate Room with DB

  Background: db connection set up
    Given AY user creates a connection with DB using "jdbc:postgresql://medunna.com:5432/medunna_db" and "medunnadb_user" , "Medunnadb_@129"

  @DBAppointmentTest
  Scenario Outline: db validation

    Given AY user sends the query to DB and gets the room data "<query>" and "<columnName>"
    And AY user saves DB records to correspondent files
    Then AY user validates DB Room data

    Examples: test data
      |query|columnName|
      |Select * from Room |room_number|