Feature: US022 Patient Test results by Staff  (Laboratory technician)
@TC02201 @SmokeTest2
  Scenario Outline: TC02201  User (Staff) can search about patient by SSN id
    Given MKT user enter the mainpage
    And MKT user click the left top user sign in button
    And MKT user inputs his or her "<validStaffUsername>" to username
    And MKT user inputs his or her "<validStaffPassword>" to password
    And MKT user click the Sign in button
    And MKT user click mypages
    And MKT user click search patient
    And MKT user click patient SSN textbox
    And MKT user input the "<validPatientSsnNumber>"
    And MKT user verify "<validPatientFirstname>" in the list
    Examples:
      | validStaffUsername | validStaffPassword | validPatientSsnNumber | validPatientFirstname |
      |Team90userstory06staff|Team90userstory06|631-94-5204|Kary|

