@ainaDB
Feature: database

  Scenario: TC01707 Validate test item with Data Base

    Given user connectts to the database
    And user gets the "*" from "c_test_item" table
      # Select * from jhi_user
    And user read all of the "name" column data
    And verify "c_test_item" table "name" column contains "Sodium"
      # And verify "country" table "name column contains "senegal"
      # And verify "c_test_item" table "name column contains "Potassium"
    Then close the database connection