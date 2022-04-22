
Feature:US012  My Appointments/Edit/Request a test only by Physician(Doctor)

  @SmokeTest
  Scenario Outline: TC01201 Doctor may request a test

  Given AY Navigate to url
  And AY Click on human figure
  Then AY Click on Sign in
  And AY Click on "<Username>" input box and enter valid Username
  And AY Click on "<Password>"  input box and enter valid Password
  Then AY Click on Sign in button
  And AY Click on My page
  And AY Click on My appointements
  And AY Select the patient and click on Edit
  And AY Click on Request a test
  And AY Verify that Test Items is visible
  And AY Click on account menu
  Then AY Click Sign out

  Examples:
    |Username|Password|
    |DrAina|draina33!|


  @wip
  Scenario Outline: TC01202 Test should have following items as checkmark options; Glucose, Urea, Creatinine, Sodium
             Potassium, Total protein, Albumin, Hemoglobin

    Given AY Navigate to url
    And AY Click on human figure
    Then AY Click on Sign in
    And AY Click on "<Username>" input box and enter valid Username
    And AY Click on "<Password>"  input box and enter valid Password
    And AY Click on Sign in button
    And AY Click on My page
    And AY Click on My appointements
    And AY Select the patient and click on Edit
    And  AY Click on Request a test
    And  AY Click on the buttons to the right of the selected tests
    And  AY Click on Save
    And  AY Verify that "A new is created with identifier 42783" is visible
    And  AY Click on account menu
    And  AY Click Sign out

      Examples:
        |Username|Password|
        |DrAina|draina33!|