@UImehlika
  Feature: US019 - Create new Staff-Update existing Staff-View and Delete the Staff-Validate with API and DB

    Scenario Outline: TC01901 - Admin can search new Staff among registered people using their SSN
      Given mb Launch web browser and navigate to the home page
      Given mb Click Account Menu sign and click Register button
      And mb Click fill in all informations for a new user "<mbstssn>","<mbstfirstname>","<mbstlastname>","<mbstusername>","<mbstemail>","<mbstnewpassword>","<mbstpasswordconfirm>"
      And mb Click Register button and verify created
      And mb Click Account Menu dropbox sign and click Sign In Text after sign out
      And mb Click User Name textbox and enter admin user name "<mbadminusername>"
      And mb Click Password textbox and enter admin password "<mbadminpassword>"
      And mb Click Sign In button
      And mb Click Administration and User Management button

      Examples:
      |mbadminusername|mbadminpassword|mbstssn    |mbstfirstname|mbstlastname|mbstusername|mbstemail           |mbstnewpassword|mbstpasswordconfirm|
      |Team90Admin    |Batch44+       |111-22-1930|StfMehlika     |Staffm       |stfmehlika  |stfmehlika@gmail.com  |Melisast.1     |Melisast.1  |

    Scenario Outline: TC01902 - All their information should be populated
      Given mb Launch web browser and navigate to the home page
      And mb Click Account Menu dropbox sign and click Sign In Text
      And mb Click User Name textbox and enter admin user name "<mbadminusername>"
      And mb Click Password textbox and enter admin password "<mbadminpassword>"
      And mb Click Sign In button
      And mb Click Cerate A New Staff  button and search your SSN number "<mbstssn>"
        Given mb Select Birth Date and Enter Phone number "<mbstbirthdate>", "<mbstphone>"
        And mb Select Gender and Blood Group
        And mb Enter Address and Description "<mbstaddress>","<mbstdescription>"
        And mb Selet User, Country and State City
        And mb Click Save button.
        Then mb Verify created successfully message with new ID
        And mb Click Created Date from List Row
        And mb Click first row and last new user and verify data

      Examples:
        |mbadminusername|mbadminpassword|mbstssn   |mbstbirthdate|mbstphone   |mbstaddress             |mbstdescription|
        |Team90Admin    |Batch44+       |111-22-1930|01/01/2001   |100-200-1902|1232 Sandia ave. Fremont|Mehlika Staff  |
    @SmokeTest2
    Scenario Outline: TC01903 - User (Admin) can select a user from the existing users (registered people)
      Given mb Launch web browser and navigate to the home page
      And mb Click Account Menu dropbox sign and click Sign In Text
      And mb Click User Name textbox and enter admin user name "<mbadminusername>"
      And mb Click Password textbox and enter admin password "<mbadminpassword>"
      And mb Click Sign In button
      Given mb Click Administration button text
      And mb Click User Management button text from dropdown box
      And mb Select any user.
      Then mb Verify selected users all information is visible.

      Examples:
        |mbadminusername|mbadminpassword|
        |Team90Admin    |Batch44+       |



    Scenario Outline: TC01904 - User can edit their info
      Given mb Launch web browser and navigate to the home page
      And mb Click Account Menu dropbox sign and click Sign In Text
      And mb Click User Name textbox and enter admin user name "<mbadminusername>"
      And mb Click Password textbox and enter admin password "<mbadminpassword>"
      And mb Click Sign In button
      Given mb Click Items Titles button and Staff button from dropdown box
      And mb Find my new staff and click to Edit button
      And mb Change First name, Last name, Phone and Description "<mbstfirstname>","<mbstlastname>","<mbstphone>","<mbstdescription>"
      And mbs Click Save button
      Then mb Verify that succesfully message is A user is updated identifier-changed item

      Examples:
        |mbadminusername|mbadminpassword|mbstfirstname       |mbstlastname          |mbstphone    |mbstdescription      |
        |Team90Admin    |Batch44+       |Firstname editlendi | Lastname editlendi  |123-451-6787  |Description yenilendi|

    Scenario Outline: TC01905 - User can delete their info
      Given mb Launch web browser and navigate to the home page
      And mb Click Account Menu dropbox sign and click Sign In Text
      And mb Click User Name textbox and enter admin user name "<mbadminusername>"
      And mb Click Password textbox and enter admin password "<mbadminpassword>"
      And mb Click Sign In button
      And mb Click Items Titles button and Staff button from dropdown box
      And mb Find my new Staff and click Delete button from Staff Page
      And mb Click Administration and User Management button text from dropdown box
      And mb Find my new Staff and click Delete button from Users Page
      Then mb Verify user see deleted successfully message A user is deleted identifier - deleted item
      Examples:
        |mbadminusername|mbadminpassword|
        |Team90Admin    |Batch44+       |

    Scenario: TC01906 - Validate them all with API

      Given mb User sends the get request for Staff data
      And mb User deserializes data to Java for Staf
      And mb User saves the users data to correspondent files for Staff

    Scenario: TC01907 - Validate them all with DB

      Given mb User connects to the Staff database
      And mb User selects all Staff id column dat
      Then mb User verifies Staff ID with the database     id
      And mb User closes the connection
