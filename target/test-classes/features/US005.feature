Feature: US005 :  New customers (patients) should make an appoinment
                  to processed in hospital Validate with API and DB

  @UIMehlika
  Scenario Outline: Make an Appointment Testi

  Given MB Launch web browser and navigate to the home page
  Then MB Verify the Make an Appointment button is visible and clickable
  And MB Click the Make an Appointment button
  Then MB Verify Make an Appointment request form can be seen
  And MB Click First Name textbox and Enter First Name "<firstname>"
  Then MB Verify First Name textbox is not blank
  Then MB Verify user is using characters for the First Name textbox
  And MB Click the Last Name textbox and enter Last Name "<lastname>"
  Then MB Verify Last Name textbox is not blank
  Then MB Verify user is using characters for the Last Name textbox
  And MB Click the SSN textbox and enter SSN number "<SSN>"
  Then MB Verify SSN textbox is not blank
  Then MB Verify user is using digits for SSN textbox
  Then MB Verify this SSN is same as a registered SSN
  And MB Click Email textbox and enter a valid Email address "<email>"
  Then MB Verify Email textbox is not blank
  Then MB Verify user uses @ and . sign
  Then MB Verify this number have - after 3th and 6th digits
  And MB Click the Phone textbox and enter a valid Phone number "<phone>"
  Then MB Verify that user is using digits for Phone textbox
  Then MB Verify that this Phone textbox is not blank
  And MB Click the Appointment DateTime dropbox and select a valid date"<date>"
  Then MB Verify selected date is one of following days
  And MB Click Send An Appointment Request button
  Then MB Verify appointment success message which is "Appointment Registration saved. We will you call you as soon as possible."
  And MB Click Account Menu dropbox sign and click Sign In
  And MB Click User Name textbox and enter a valid user name "<username>"
  And MB Click Password textbox and enter a valid password "<password>"
  And MB Click Sign In button
  Then MB Verify sign in is successfully





    Examples: test data
      |firstname|lastname|  SSN   |      email         |phone       |date     |username|password|
      |Melinda|Patient|100.20.3105|mehlindapt@gmail.com|100-200-3000|4/12/2022|MelindaPt|Pt.3114|
