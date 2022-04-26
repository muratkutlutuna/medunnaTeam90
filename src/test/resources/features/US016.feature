
Feature: US_016 Room creation / View / Update / Delete Validate them also with API and DB by Admin

  Background:
              Given AY Navigate to url
              And AY Click on human figure
              Then AY Click on Sign in
              And AY Click on "Team90Admin" input box and enter valid Username
              And AY Click on "Batch44+"  input box and enter valid Password
              And AY Click on Sign in button
              And AY Click on Items&Titles
              And AY Select Room from drop down menu and click
  @aina
    Scenario: TC_01601 Must be able to access the room creation page

              And AY Click on Create a new Room
              And AY Verify that Create or edit a Room is visible
              And AY Click on account menu
              Then AY Click Sign out

    Scenario: TC_01602 User (Admin) can create new rooms for impatients.
              Current status can be set for the room  Price can be added and cannot be blank
              Description can be provided optionally  Created date as MM/DAY/YEAR and cannot be typed earlier

               And AY Click on Create a new Room
               And AY Click on Room Number box and enter room number
               And AY Click on Room Type box and select room type
               And AY Click on Status
               And AY Click on Price box and enter price
               And AY Click on Description box and enter description
               And AY Click on date corresponds to the day created
               And AY Click on Save
               And AY Verify that  A new Room is created is visible
               And AY Click on account menu
               Then AY Click Sign out

    Scenario: TC_01603 Admin can view all rooms with same items

               And AY Click on Room Type
               And AY Verify that Twin type rooms is visible
               And AY Click on account menu
               Then AY Click Sign out

    Scenario: TC_01604 Admin can edit(update) existing rooms

              And AY Click on Edit and update rooms
              And AY Click on Room Number box, delete information and enter room number
              And AY Click on Room Type box and change room type
              And AY Click on Status
              And AY Click on Price box, delete information and enter price
              And AY Click on Description box,delete information and enter description
              And AY Click on Save
              And AY Verify that updated successfully
              And AY Click on account menu
              Then AY Click Sign out


    Scenario: TC_01609 Rooms can be Deleted by admin

              And AY Click on Delete
              And AY Click on Delete in alert window
              And AY Verify that deleted successfully
              And AY Click on account menu
              Then AY Click Sign out



