@ainaDB
Feature: database

  Scenario: Validate room with Data Base

    Given user connectts to the database
    And user gets the "*" from "room" table
      # Select * from jhi_user
    And user read all of the "room-number" column data
    And verify "room" table "room_number" column contains 5649
      # And verify "country" table "name column contains "senegal"
      # And verify "c_test_item" table "name column contains "Potassium"
    Then close the database connection

