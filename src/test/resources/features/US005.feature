@UI_US005
Feature: US005 : New customers (patients) should make an appoinment
                 to processed in hospital Validate with API and DB

  @positive
  Scenario: Test01 : Make an Appointment Button - First Name and Last Name
  TC00501 - TC00502 - TC00503
    Given MB Launch web browser and navigate to the home page
    Then MB Verify the Make an Appointment button is visible and clickable
    And MB Click the Make an Appointment button
    Then MB Verify Make an Appointment request form can be seen
    And MB Click First Name textbox and Enter First Name "mfirstname"
    Then MB Verify First Name textbox is not blank
    Then MB Verify user is using characters for the First Name textbox
    And MB Click the Last Name textbox and enter Last Name "mlastname"
    Then MB Verify Last Name textbox is not blank
    Then MB Verify user is using characters for the Last Name textbox

  @positive
  Scenario: Test02 : Make an Appointment - SSN and Email
  TC00504 - TC00505
    And MB Click the SSN textbox and enter SSN number "mssn"
    Then MB Verify SSN textbox is not blank
    Then MB Verify user is using digits for SSN textbox
    Then MB Verify this SSN is same as a registered SSN
    And MB Click Email textbox and enter a valid Email address "memail"
    Then MB Verify Email textbox is not blank
    Then MB Verify user uses @ and . sign


  Scenario: Test03 : Make an Appointment - Phone and Date
  TC00506 - TC00507 - TC00508 - TC00509
    And MB Click the Phone textbox and enter a valid Phone number "mphone"
    Then MB Verify that this Phone textbox is not blank
    Then MB Verify that user is using digits for Phone textbox
    And MB Click the Appointment DateTime dropbox and select a valid date
    Then MB Verify selected date is one of following days
    And MB Click Send An Appointment Request button
    Then MB Verify appointment success message which is "Appointment Registration saved. We will you call you as soon as possible."

  Scenario: Test04 : Make an Appointment - Sign In Check
  TC00510
    And MB Click Account Menu dropbox sign and click Sign In
    And MB Click User Name textbox and enter a valid user name "musername"
    And MB Click Password textbox and enter a valid password "mpassword"
    And MB Click Sign In button
    Then MB Verify sign in is successfully
