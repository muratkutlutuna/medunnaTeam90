
Feature: US_017 Create / Update / delete test items Use api and DB validation

  Background:
              Given AY Navigate to url
              And AY Click on human figure
              And AY Click on Sign in
              And AY Click on "Team90Admin" input box and enter valid Username
              And AY Click on "Batch44+"  input box and enter valid Password
              And AY Click on Sign in button
              And AY Click on Items&Titles
              And AY Select Test Item from drop down menu and click

      Scenario: TC_01701 Must be able to access the test item creation page

              And AY Click on Create a new Test Item
              And AY Verify that Create or edit aTest Items is visible
              And AY Click on account menu
              Then AY Click Sign out

      Scenario: TC_01702 Admin can create new test items
                "there should be following items for creating/ updating  test items; Name, Description, price
                Default min value, Default max value and created date as MM/DAY/YEAR"

              And AY Click on Create a new Test Item
              And AY Click on Name box and enter test name
              And AY Click on Description box and enter description of Test Item
              And AY Click on Price box and enter price of Test Item
              And AY Click on Default Min. Value box and enter Min.Value
              And AY Click on Default Max. Value box and enter Max.Value
              And AY Click on date corresponds to the day created
              And AY Click on Save
              And AY Verify that  A new Test Item is created is visible
              And AY Click on account menu
              Then AY Click Sign out

      Scenario: TC_01703 Admin can view test items

              And AY Verify that Test Items is Visible Admin
              And AY Click on account menu
              Then AY Click Sign out

      Scenario: TC_01704 Admin can delete test items

              And AY Click on Delete
              And AY Click on Delete in alert window Test Item
              And AY Verify that deleted successfully Test Item
              And AY Click on account menu
              Then AY Click Sign out

      Scenario: TC_01705 Validate them with api


      Scenario: TC_01706 Create test items using api


      Scenario: TC_01707 Validate them with DB