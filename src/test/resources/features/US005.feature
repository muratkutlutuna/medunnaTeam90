Feature: US005 : New customers (patients) should make
  appoinment to processed in hospital
  Validate with API and DB

  Scenario: Make an Appointment Testi

  Given MB Launch web browser and navigate to the home page
  And MB Click the 'Make an Appointment' button.
  Then MB Verify the 'Make an Appointment' button is visible clickable.
  Then MB Verify 'Make an Appointment' request form can be see.
  And MB Click the 'First Name' textbox.
  And MB Enter first name in the 'First Name' textbox.
  Then MB Verify 'First Name' textbox is not blank.   (Your FirstName is required.)
  Then MB Verify user is using characters for the 'First Name' textbox.
  And MB Enter last name in the 'Last Name' textbox.
  And MB Enter SSN number in the 'SSN' textbox.
  And MB Enter a valid email address.
  And MB Enter a valid phone number
  And MB Select a valid date from 'Appointment DateTime' dropbox.
  And MB Click 'Send An Appointment Request' button
  Then MB Verify appointment success message which is "Appointment Registration saved. We will you call you as soon as possible."
