@run
  Feature:US013  My Appointments/Edit/Test Results by Physician (Doctor))

  Scenario Outline:TC01301 After test results request and staff updates for test results,
          doctor can see all test information such as; id,name(Urea, Sodium, Glucose etc..),
          default max value, default min value, test, description and the date

  Given AY Navigate to url
  And AY Click on human figure
  Then AY Click on Sign in
  And AY Click on "<StaffUsername>" input box and enter valid username
  And AY Click on "<StaffPassword>" input box and enter valid password
  And AY Click on Sign in button
  And AY Click on My page
  And AY Click on Search patient
  And AY Click on Patient "<SSN>" input box and enter patient's  SSN
  And  AY Click on Show appointements
  And  AY Click on Show tests
  And  AY Click on View results
  And AY Click on Edit tests Staff updates and click on Save
  And  AY Click on account menu
  Then  AY Click Sign out
    Examples:
      |StaffUsername|StaffPassword|SSN|
      |StaffAina    |staffaina33! |125-14-6548|


    Scenario Outline:

  Given AY Navigate to url
  And  AY Click on human figure
  Then AY Click on Sign in
  And AY Click on "<Username>" input box and enter valid username
  And AY Click on "<Password>" input box and enter valid password
  And AY Click on Sign in button
  And  AY Click on My page
  And  AY Click on My appointements
  And  AY Select the patient and click on Edit
  And  AY Click on Show Test Results
  And  AY Click on View Results of the patient
  And  AY Verify that Test Results is visible
  And AY Click on account menu
  Then  AY Click Sign out

   Examples:
  | Username|Password|
  |DrAina  |draina33!|

  Scenario Outline: TC01302 Doctor and also request Impatient (patient can stay in hospital)

   Given AY Navigate to url
   And AY Click on human figure
   Then AY Click on Sign in
   And AY Click on "<Username>" input box and enter valid Username
   And AY Click on "<Password>"  input box and enter valid Password
   And AY Click on Sign in button
   And AY Click on My page
   And AY Click on My appointements
   And AY Select the patient and click on Edit
   And AY Click on Request inpatient
   And AY Verify that "A new in Patient is created with identifier 47768" is visible
   And AY Click on account menu
   Then  AY Click Sign out

   Examples:
    |Username|Password|
    |DrAina|draina33!|
