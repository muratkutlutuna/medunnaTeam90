@UImehlika05
Feature: US005 : New customers (patients) should make an appoinment
  to processed in hospital Validate with API and DB

  @US005positive
  Scenario Outline: Test01:Make an Appointment - Verify Button, First Name and Last Name
                    TC00501 - TC00502 - TC00503
    Given MB Launch web browser and navigate to the home page
    Then MB Verify the Make an Appointment button is visible and clickable
    And MB Click the Make an Appointment button
    Then MB Verify Make an Appointment request form can be seen
    And MB Click First Name textbox and Enter First Name "<mfirstname>"
    Then MB Verify First Name textbox is not blank
    Then MB Verify user is using characters for the First Name textbox
    And MB Click the Last Name textbox and enter Last Name "<mlastname>"
    Then MB Verify Last Name textbox is not blank
    Then MB Verify user is using characters for the Last Name textbox
    Examples:
      |mfirstname| mlastname |
      |Melinda   | Patient   |

  @US005positive
  Scenario Outline: Test02: Make an Appointment - Verify SSN and Email
                    TC00504 - TC00505
    Given MB Launch web browser and navigate to the home page
    And MB Click the Make an Appointment button
    And MB Click First Name textbox and Enter First Name "<mfirstname>"
    And MB Click the Last Name textbox and enter Last Name "<mlastname>"
    And MB Click the SSN textbox and enter SSN number "<mssn>"
    Then MB Verify SSN textbox is not blank
    Then MB Verify user is using digits for SSN textbox
    Then MB Verify this SSN is same as a registered SSN
    And MB Click Email textbox and enter a valid Email address "<memail>"
    Then MB Verify Email textbox is not blank
    Then MB Verify user uses @ and . sign

    Examples:
      |mfirstname|mlastname|mssn       |memail             |
      |Melinda   |Patient  |100-20-3105|melindapt@gmail.com|

  @US005positive
  Scenario Outline: Test03: Make an Appointment - Verify Phone and Date
                    TC00506 - TC00507 - TC00508 - TC00509
    Given MB Launch web browser and navigate to the home page
    And MB Click the Make an Appointment button
    And MB Click First Name textbox and Enter First Name "<mfirstname>"
    And MB Click the Last Name textbox and enter Last Name "<mlastname>"
    And MB Click the SSN textbox and enter SSN number "<mssn>"
    And MB Click Email textbox and enter a valid Email address "<memail>"
    And MB Click the Phone textbox and enter a valid Phone number "<mphone>"
    Then MB Verify that this Phone textbox is not blank
    Then MB Verify that user is using digits for Phone textbox
    And MB Click the Appointment DateTime dropbox and select a valid date
    Then MB Verify selected date is one of following days
    And MB Click Send An Appointment Request button and verify appointment success message which contains Registration saved

    Examples:
      |mfirstname|mlastname|mssn       |memail             |mphone      |
      |Melinda   |Patient  |100-20-3105|melindapt@gmail.com|100-200-3000|

  @US005positive
  Scenario Outline: Test04: Make an Appointment - Verify Sign In Check
                    TC00510
    Given MB Launch web browser and navigate to the home page
    And MB Click Account Menu dropbox sign and click Sign In
    And MB Click User Name textbox and enter a valid user name "<musername>"
    And MB Click Password textbox and enter a valid password "<mpassword>"
    And MB Click Sign In button
    Then MB Verify sign in is successfully
    Examples:
      |musername |mpassword|
      |Melindapt |Pt.3114  |

  @US005negative
  Scenario Outline: Test01N : Make an Appointment- Non-character sign used for First Name and Last Name
                    TC00501 - TC00502 - TC00503
    Given MB Launch web browser and navigate to the home page
    And MB Click the Make an Appointment button
    And MB Click First Name textbox and Enter First Name "<mwfirstname>"
    Then MB Verify user is using non-character for the First Name textbox - Negative
    And MB Click the Last Name textbox and enter Last Name "<mwlastname>"
    Then MB Verify user is using non-character for the Last Name textbox - Negative
    Examples: Appointment test data
      |mwfirstname|mwlastname|
      |Melis5aa|Patie-001|

  @US005negative
  Scenario Outline: Test02N : Make an Appointment - Non-digit for SSN and '@' and '.' for Email
                    TC00504 - TC00505
    Given MB Launch web browser and navigate to the home page
    And MB Click the Make an Appointment button
    And MB Click First Name textbox and Enter First Name "<mwfirstname>"
    And MB Click the Last Name textbox and enter Last Name "<mwlastname>"
    And MB Click the SSN textbox and enter SSN number "<mwssn>"
    Then MB Verify user also uses non-digit for SSN textbox Negative
    And MB Click Email textbox and enter a valid Email address "<mwemail>"
    Then MB Verify user doesn't use @ and . sign Negative
    Examples: Appointment test data
      |mwfirstname | mwlastname | mwssn        | mwemail          |
      |Melinda  |Patient      |10a-20b-310b |melike^mailcom |

  @US005negative
  Scenario Outline: Test03N : Make an Appointment - Non-digit for Phone
                    TC00506 - TC00507 - TC00508 - TC00509
    Given MB Launch web browser and navigate to the home page
    And MB Click the Make an Appointment button
    And MB Click First Name textbox and Enter First Name "<mwfirstname>"
    And MB Click the Last Name textbox and enter Last Name "<mwlastname>"
    And MB Click the SSN textbox and enter SSN number "<mwssn>"
    And MB Click Email textbox and enter a valid Email address "<mwemail>"
    And MB Click the Phone textbox and enter a valid Phone number "<mwphone>"
    Then MB Verify that user is also using non-digit for Phone textbox Negative
    And MB Click the Appointment DateTime dropbox and select a valid date
    And MB Click Send An Appointment Request button and verify appointment success message which contains Registration saved

    Examples: Appointment test data
      |mwfirstname | mwlastname | mwssn       | mwemail          |  mwphone    |
      |Melinda    |Patient    | 100-200-3105| melindapt@gmail.com |1a0-3m5-33cc|


