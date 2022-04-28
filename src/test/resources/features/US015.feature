@UImehlika15
Feature: US015 - Create or Edit Patient by just Admin and Validate with API

  @TC01501
  Scenario Outline: TC01501 - New patients can only be created by admin
    Given mb Launch web browser and navigate to the home page
    And mb Click Account Menu dropbox sign and click Sign In Text
    And mb Click User Name textbox and enter admin user name "<mbAdminUsername>"
    And mb Click Password textbox and enter admin password "<mbAdminPassword>"
    And mb Click Sign In button
    And mb Click Items&Titles button and Patient from dropdown box
    And mb Click Create a new Patient button
    And mb Fill in or select these informations "<firstname>","<lastname>","<birthdate>","<email>","<phone>","<address>","<description>"
    Then mb Verify the new patient was created by admin successfully Toast Container


    Examples:
    |mbAdminUsername|mbAdminPassword|firstname|lastname|birthdate|email               |phone       |    address             |description    |
    |Team90Admin    |Batch44+       |Mehlika  |Patient |01/01/2001|mehlikapt@hotmail.com|100-200-3000|1232 Sandia ave. Fremont|Mehlikapt Patient|

  @TC01502
  Scenario Outline: TC01502 - Admin can see patient's all information such as; SSN, First Name, Last Name, Birth Date,Phone, Gender, Blood Group, Address, Description, Created Date, User, Country and state / City

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
    Then mb Verify admin can see patient Country and State City

    Examples: Test Data
      |mbAdminUsername|mbAdminPassword|
      |Team90Admin    |Batch44+       |

  @TC01503
  Scenario Outline: TC01503 - When creating or updating patient data, you have above items and following new item;  id.
                              Also Only admin can assign patient their doctor.
    Given mb Launch web browser and navigate to the home page
    And mb Click Account Menu dropbox sign and click Sign In Text
    And mb Click User Name textbox and enter admin user name "<mbAdminUsername>"
    And mb Click Password textbox and enter admin password "<mbAdminPassword>"
    And mb Click Sign In button
    Given Click Items&Titles and click Patients
    And Click Created Date and click first patient's ID number which is new created patient
    Then Verify it has correct ID which is same with new created patient's id number
    And Click Edit button, Enter a new data to Description and save
    Then Verify admin can not assign patient to a doctor. Negative test BUG there is not a Doctor Assign web element
    And Click Items&Titles and click Patients
    And Click Created Date and click first patient's ID number
    Then Verify ID is correct

    Examples: Test Data
      |mbAdminUsername|mbAdminPassword|
      |Team90Admin    |Batch44+       |


    Scenario Outline: TC01504 - State should be provided country as USA and cannot be blank

      Given mb Launch web browser and navigate to the home page
      And mb Click Account Menu dropbox sign and click Sign In Text
      And mb Click User Name textbox and enter admin user name "<mbAdminUsername>"
      And mb Click Password textbox and enter admin password "<mbAdminPassword>"
      And mb Click Sign In button
      Given mb Click Items&Titles button and select Patient from dropdown box
      And mb Click Created Date and select first id which is new created patient
      Then mb Verify Country is selected USA
      Then mb Verify Country data is not blank
      Examples: Test Data
        |mbAdminUsername|mbAdminPassword|
        |Team90Admin    |Batch44+       |

  Scenario Outline:  TC01505 - Admin can delete any patient

    Given mb Launch web browser and navigate to the home page
    And mb Click Account Menu dropbox sign and click Sign In Text
    And mb Click User Name textbox and enter admin user name "<mbAdminUsername>"
    And mb Click Password textbox and enter admin password "<mbAdminPassword>"
    And mb Click Sign In button
      Given mb Click Items&Titles button and select Patient from dropdown box
      And mb Click Created Date and click first patient's ID number which is new created patient
      And mb Click Delete button and click Delete button on the alert
      Then mb Verify if you get a successful deleted message

    Examples: Test Data
      |mbAdminUsername|mbAdminPassword|
      |Team90Admin    |Batch44+       |

      Scenario: TC01506 - Validate patient info with API
        Given User signs in as an Admin
        And User sends the get request for Patient data
        And User deserializes data to Java for Patient
        And Set the neccessary path params
        And Enter post data for patient
        Then Verify API records
        Then Verify the fail message
