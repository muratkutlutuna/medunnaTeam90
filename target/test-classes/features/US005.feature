Feature: US005 :  New customers (patients) should make an appoinment
                  to processed in hospital Validate with API and DB

  @UIMehlika
  Scenario Outline: Make an Appointment Testi

    Given MB Launch web browser and navigate to the home page
  And MB Click the Make an Appointment button.
  Then MB Verify the Make an Appointment button is visible clickable.
  Then MB Verify Make an Appointment request form can be seen.
  And MB Click the First Name textbox.
  And MB Enter "<firstname>" in the First Name textbox.
  Then MB Verify 'First Name' textbox is not blank.   (Your FirstName is required.)
  Then MB Verify user is using characters for the First Name textbox.
  And MB Click the Last Name textbox.
  And MB Enter "<lastname>" in the Last Name textbox.
  Then MB Verify 'Last Name' textbox is not blank.(Your LastName is required.)
  Then MB Verify user is using characters for the 'Last Name' textbox.
  And MB Click the 'SSN' textbox.
  And MB Enter "<SSN>" number in the 'SSN' textbox.
  Then MB Verify 'SSN' textbox is not blank. (Your SSN is required.)
  Then MB Verify user is using numbers for 'SSN' textbox.
  Then MB Verify this SSN is.same as a registered SSN
  And MB Click the 'Email' textbox.
  And MB Enter a valid "<email>" address.
  Then MB Verify 'Email' textbox is not blank. (Your Email is required.)
  Then MB Verify user uses '@' and '.' sign.
  Then MB Verify this number have '-' after 3th and 6th digits.
  And MB Click the 'Phone' textbox.
  And MB Enter a valid "<phone>"
  Then MB Verify that user is using digits for 'Phone' textbox.
  Then MB Verify that this 'Phone' textbox is not blank.
  And MB Select valid "<date>" from 'Appointment DateTime' dropbox.
  Then MB Verify selected date is one of following days.
  And MB Click 'Send An Appointment Request' button
  Then MB Verify appointment success message which is "Appointment Registration saved. We will you call you as soon as possible."
  And MB Click Account Menu sign
  And MB Click 'Sign In' text
  And MB Click 'User Name' textbox
  And MB Enter a valid "<username>"
  And MB Click 'Password' textbox
  And MB Enter a valid "<password>"
  And MB Click 'Sign In' button
  Then MB Verify sign in is successfully.

    Examples: test data
      |firstname|lastname|  SSN   |      email         |phone       |date     |username|password|
      |Melinda|Patient|100.20.3105|mehlindapt@gmail.com|100-200-3000|4/12/2022|MelindaPt|Pt.3114|
