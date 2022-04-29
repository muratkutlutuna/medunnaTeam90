@DBAppointmentTest
Feature: DB Appointment test

  Scenario: db validation
    Given AGuser creates a connection with DB
    Given AGuser gets the "start_date" from "appointment" table
      # Select * from appointment
    And AGuser verify "appointment" table   "start_date" column contains "2022-01-01 00:00:00.0"
      # And verify "appointment" table "start_date" column contains "2022-01-16 00:00:00"
    Then AGuser close DB connection

