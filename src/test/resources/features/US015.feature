@UImehlika15
Feature: US015 - Create or Edit Patient by just Admin and Validate with API

  @TC01501
  Scenario Outline: TC01501 - New patients can only be created by admin
    Given mb Launch web browser and navigate to the home page
    And mb Click Account Menu dropbox sign and click Sign In Text
    And mb Click User Name textbox and enter admin user name "<mbAdminUsername>"
    And mb Click Password textbox and enter admin password "<mbAdminPassword>"
    And mb Click Sign In button
#    Then mb Verify sign in is successfully
    And mb Click Items&Titles button and Patient from dropdown box
    And mb Click Create a new Patient button
    And mb Fill in these informations "<firstname>","<lastname>","<birthdate>","<email>","<phone>"
#    And mb Select these Gender, Blood Group, User, Country, State
    And mb Fill in these informations "<address>","<description>"
    Then mb Verify the new user created successfully Toast Container
    Then mb Verify new patient was created by admin

    Examples:
    |mbAdminUsername|mbAdminPassword|firstname|lastname|birthdate|email               |phone       |    address             |description    |
    |Team90Admin    |Batch44+       |Mehlika  |Patient |01/01/2001|mehlikapt@gmail.com|100-200-1501|1232 Sandia ave. Fremont|Mehlika Patient|

  @TC01502
  Scenario Outline: TC01502 - Admin can see patient's all information such as; SSN, First Name, Last Name, Birth Date,
                    Phone, Gender, Blood Group, Address, Description, Created Date, User, Country and state / City

    Given mb Launch web browser and navigate to the home page
    And mb Click Account Menu dropbox sign and click Sign In Text
    And mb Click User Name textbox and enter admin user name "<mbAdminUsername>"
    And mb Click Password textbox and enter admin password "<mbAdminPassword>"
    And mb Click Sign In button
    Given mb Click Items&Titles button and select Patient from dropdown box
    And mb Select id of any patient and click
    Then mb Verify admin can see patient SSN
    Then mb Verify admin can see patient First Name and Last Name
    Then mb Verify admin can see patient Birth Date and Phone
    Then mb Verify admin can see patient Gender and Blood Group
    Then mb Verify admin can see patient Address and Description
    Then mb Verify admin can see patient Created Date and User
    Then mb Verify admin can see patient Country and State/City

    Examples: |mbAdminUsername|mbAdminPassword|
              |Team90Admin    |Batch44+       |

  @TC01503
  Scenario Outline: TC01503 - When creating or updating patient data, you have above items and following new item;  id.
                              Also Only admin can assign patient their doctor.

    Given mb Click Create a new Patient button
    And mb Enter First Name and Last Name "<mbptfirstname><mbptlastname>"
    And mb Select an available following day and time (mm/dd/yyyy, hh:mm am/pm)
    And mb Enter Email from and Phone number "<mbptemail><mbptphone>"
    And mb Select Gender and Blood Group
    And mb Enter Address and Description "<mbptaddress><mbptdescription>"
    And mb Select User, Country and State/City
    And mb Click Save button
    Then mb Verify form is saved and created a patient successfully
    And mb Click Created Date and click first patient's ID number
    Then mb Verify id number have same First Name with new patient

    Examples:
    |mbptfirstname|mbptlastname|mbptemail          |mbptphone               |mbptaddress             |mbptdescription|
    |Mehlika      |Patient     |mehlikapt@gmail.com|100-200-1501            |1232 Sandia ave. Fremont|Patient Mehlika|

    Scenario: TC01504 - State should be provided country as US and cannot be blank

      Given mb Click Items&Titles button and select Patient from dropdown box
      And mb Click Created Date and click first patient's ID number
      And mb Select first id and click Edit button under the informations
      Then mb Verify Country is selected  US
      Then mb Verify Country data is not blank

    Scenario:  TC01505 - Admin can delete any patient

      Given mb Click Items&Titles button and select Patient from dropdown box
      And mb Click any patient's Delete button
      And mb Click Delete button on the alert
      Then mb Verify patient is deleted successfully message
      Then mb Verify the fail message internal server error
      And mb Report this bug

      Scenario: TC01506 - Validate patient info with API
        Given User signs in as an Admin
        And User sends the get request for Patient data
        And User deserializes data to Java for Patient
        And Set the neccessary path params
        And Enter post data for patient
        Then Verify API records
        Then Verify the fail message
