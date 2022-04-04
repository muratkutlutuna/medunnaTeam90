Feature: US005 : New customers (patients) should make
  appoinment to processed in hospital
  Validate with API and DB

  Scenario: Make an Appointment Testi

  Given Launch web browser and navigate to the home page
  And Click the 'Make an Appointment' button.
  Then Verify the 'Make an Appointment' button is visible clickable.
  Then Verify 'Make an Appointment' request form can be see.
  And Click the 'First Name' textbox.
  And Enter first name in the 'First Name' textbox.
  Then Verify 'First Name' textbox is not blank.   (Your FirstName is required.)
  Then Verify user is using characters for the 'First Name' textbox.
  And Enter last name in the 'Last Name' textbox.
  And Enter SSN number in the 'SSN' textbox.
  And Enter a valid email address.
  And Enter a valid phone number
  And Select a valid date from 'Appointment DateTime' dropbox.
  And Click 'Send An Appointment Request' button
  Then Verify appointment success message which is "Appointment Registration saved. We will you call you as soon as possible."
