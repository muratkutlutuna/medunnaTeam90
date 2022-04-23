@UImehlika
  Feature: US019 - Create new Staff-Update existing Staff-View and Delete the Staff-Validate with API and DB

    Scenario Outline: TC01901 - Admin can search new Staff among registered people using their SSN
      Given mb Launch web browser and navigate to the home page
      And mb Click Account Menu dropbox sign and click Sign In Text
      And mb Click User Name textbox and enter admin user name "<mbadminusername>"
      And mb Click Password textbox and enter admin password "<mbadminpassword>"
      And mb Click Sign In button

      And mb Click Administration and User Management button
      And mb Click Create a new user button
      And mb Fill in the form "<mbstlogin>","<mbstfirstname>","<mbstlastname>","<mbstemail>","<mbstssn>"
      Then mb Verify created is successfully toast container message
      And mb Click Items&Titles and Staff button
      And mb Click Create a new staff button
      And mb Enter SSN number and click Use Search checkbox
      Then mb Verify User found with search SSN message

      Examples:
      |mbadminusername|mbadminpassword|mbstlogin   |mbstfirstname|mbstlastname|mbstemail             |mbstssn    |
      |Team90Admin    |Batch44+       |mehlikastaff|Mehlika      |Staff       |mehlikastaff@gmail.com|100-20-1903|

    Scenario Outline: TC01902 - All their information should be populated
      Given mb Launch web browser and navigate to the home page
      And mb Click Account Menu dropbox sign and click Sign In Text
      And mb Click User Name textbox and enter admin user name "<mbadminusername>"
      And mb Click Password textbox and enter admin password "<mbadminpassword>"
      And mb Click Sign In button
        Given mb Select Birth Date and Enter Phone number "<mbstphone>"
        And mb Select Gender and Blood Group
        And mb Enter Address and Description "<mbstaddress><mbstdescription>"
        And mb Selet User, Country and State City
        And mb Click Save button.
        Then mb Verify created successfully message with new ID
        And mb Click Created Date from List Row
        And mb Click first row and last new user
        Then mb Verify data

      Examples:
        |mbadminusername|mbadminpassword|mbstphone   |mbstaddress             |mbstdescription|
        |Team90Admin    |Batch44+       |100-200-1902|1232 Sandia ave. Fremont|Mehlika Staff  |

    Scenario: TC01903 - User (Admin) can select a user from the existing users (registered people)

      Given mb Click Administration button text
      And mb Click User Management button text from dropdown box
      And mb Select any user.
      Then mb Verify selected users all information is visible.


    Scenario Outline: TC01904 - User can edit their info

      Given mb Click button text
      And mb Click User Management button text from dropdown box
      And mb Select any user and click to Edit button
      And mb Change Login, First name, Last name, Email, SSN and Language "<mbstlogin><mbstfirstname><mbstlastname><mbstemail><mbstssn>"
      Then mb Verify activated is selected.
      And mb Click Save button
      Then mb Verify that succesfully message is A user is updated identifier (*changed item)

      Examples:
      |mbstlogin    |mbstfirstname|mbstlastname|mbstemail       |mbstssn    |
      |Yeniisimmerve|Merveye      |Degisti    |merveye@gmail.com|100-20-1902|

    Scenario: TC01905 - User can delete their info

      Given mb Navigate to the home page
      And mb Click Administration and User Management button text from dropdown box
      And mb Select any user and click 'Delete' button.
      And mb Click Delete from pop up
      Then mb Verify user see deleted successfully message A user is deleted identifier (*deleted item))

    Scenario: TC01906 - Validate them all with API

      Given mb User sends the get request for Staff data
      And mb User deserializes data to Java for Staf
      And mb User saves the users data to correspondent files for Staff

    Scenario: TC01907 - Validate them all with DB

      Given mb User connects to the Staff database
      And mb User selects all Staff id column dat
      Then mb User verifies Staff ID with the database     id
      And mb User closes the connection
