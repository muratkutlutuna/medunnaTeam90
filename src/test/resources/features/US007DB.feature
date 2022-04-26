@DBAppointmentTest
Feature: DB Appointment test

  Scenario: db validation
    Given AGuser creates a connection with DB
    Given AGuser gets the "*" from "appointment" table
      # Select * from appointment
    And AGuser read all of the "start_date" column data
    And AGuser verify "appointment" table   "start_date" column contains "2022-01-15 00:00:00"
      # And verify "appointment" table "start_date" column contains "2022-01-16 00:00:00"
    Then AGuser close DB connection

