Feature: US009 "View, edit and delete Patient information Validate them using API and DB"


  @UIRegistration @bt
  Scenario: TC00901 view patient information navigating to view portal

    Given BT  Go to main page
    And   BT  Click the human icon to Sign
    And   BT  Select "Sign in" from drop down menu and click
    And   BT  Enter User name and password
    And   BT  verify that "MY PAGES" text appears


  @UIRegistration @bt
  Scenario: TC00902

    Given BT  Go to main page
    And   BT  Click the human icon to Sign
    And   BT  Select "Sign in" from drop down menu and click
    And   BT  Enter User name and password
    And   bt_ Click the "MY PAGES" and see patient
    And   bt_Send "321-54-0005" to SSN nummer
    And   bt_verift that showing first name and text

  @UIRegistration @bt
    Scenario: TC00903

      Given BT  Go to main page
      And   BT  Click the human icon to Sign
      And   BT  Select "Sign in" from drop down menu and click
      And   BT  Enter User name and password
      And   bt_ Click the "MY PAGES" and see patient
      And   bt_Send "321-54-0005" to SSN nummer
      Then  Bt  Click the Edit
      And   Bt  go til adress og write from faker
      And   Bt  write Norway to country
      And   Bt  click to edit
      And   Bt  verify that Create or edit a Patient text appears
