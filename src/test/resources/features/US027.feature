@US027
Feature: US027 Admin should be able to go to messages portal and view all messages, their authors and emails

  @US027_TC001
  Scenario: Admin verifies all names, emails and messages are displayed
    Given FY Admin navigates to Medunna home page
    And FY Admin clicks on human icon
    And FY Admin clicks on sign in button under human icon at homepage
    And FY Admin sends username "adminfatih" and password "Batch44+" in sign in page
    And FY Admin clicks on sign in button in sign in page
    Then FY Admin verifies the admin page is displayed
    Then FY Admin clicks on items and titles dropdown
    Given FY Admin clicks on messages button
    Then FY Admin verifies the messages page is displayed
    Then FY Admin verifies all names, emails and messages are displayed


  @US027_TC002
  Scenario Outline: Admin should be able to create messages
    Given FY Admin navigates to Medunna home page
    And FY Admin clicks on human icon
    And FY Admin clicks on sign in button under human icon at homepage
    And FY Admin sends username "adminfatih" and password "Batch44+" in sign in page
    And FY Admin clicks on sign in button in sign in page
    Then FY Admin verifies the admin page is displayed
    Then FY Admin clicks on items and titles dropdown
    And FY Admin clicks on messages button
    Then FY Admin verifies the messages page is displayed
    And FY Admin clicks on the create a new message button
    Then FY Admin verifies the Create or edit a Message page is displayed
    And FY Admin enters name "<Name>" into name text box
    And FY Admin enters email "<Email>" into email text box
    And FY Admin enters subject "<Subject>" into subject text box
    And FY Admin enters message "<Message>" into message text box
    And FY Admin clicks on save button in create or edit a message page
    Then FY Admin verifies successfully created message is displayed

    Examples:
      | Name        | Email          | Subject          | Message                |
      | Azer Bulbul | azer@gmail.com | Titreme problemi | Sanatci titrerken oldu |


  @US027_TC003
  Scenario Outline:Admin should be able to update messages
    Given FY Admin navigates to Medunna home page
    And FY Admin clicks on human icon
    And FY Admin clicks on sign in button under human icon at homepage
    And FY Admin sends username "adminfatih" and password "Batch44+" in sign in page
    And FY Admin clicks on sign in button in sign in page
    Then FY Admin verifies the admin page is displayed
    Then FY Admin clicks on items and titles dropdown
    And FY Admin clicks on messages button
    Then FY Admin verifies the messages page is displayed
    And FY Admin clicks on the edit button in the message page
    Then FY Admin verifies the Create or edit a Message page is displayed
    And FY Admin updates the name "<Name>" into name text box
    And FY Admin updates the email "<Email>" into email text box
    And FY Admin updates the subject "<Subject>" into subject text box
    And FY Admin updates the message "<Message>" into message text box
    And FY Admin clicks on save button in create or edit a message page
    Then FY Admin verifies successfully updated message is displayed


    Examples:
      | Name        | Email           | Subject | Message             |
      | Gurhan Baba | gurhan@baba.com | Ramazan | Oruc tut sihhat bul |

  @US027_TC004
  Scenario Outline: Admin should not be able to update messages by sending invalid name and email
    Given FY Admin navigates to Medunna home page
    And FY Admin clicks on human icon
    And FY Admin clicks on sign in button under human icon at homepage
    And FY Admin sends username "adminfatih" and password "Batch44+" in sign in page
    And FY Admin clicks on sign in button in sign in page
    Then FY Admin verifies the admin page is displayed
    Then FY Admin clicks on items and titles dropdown
    And FY Admin clicks on messages button
    Then FY Admin verifies the messages page is displayed
    And FY Admin clicks on the edit button in the message page
    Then FY Admin verifies the Create or edit a Message page is displayed
    And FY Admin updates the name "<Name>" into name text box
    And FY Admin updates the email "<Email>" into email text box
    And FY Admin updates the subject "<Subject>" into subject text box
    And FY Admin updates the message "<Message>" into message text box
    And FY Admin clicks on save button in create or edit a message page
    Then FY Admin verifies failure message is displayed

    Examples:
      | Name     | Email       | Subject | Message             |
      | fatih123 | 666777@89.0 | Bayram  | Bayramda oruc tutma |

  @US027_TC005

  Scenario: Admin should be able to delete messages
    Given FY Admin navigates to Medunna home page
    And FY Admin clicks on human icon
    And FY Admin clicks on sign in button under human icon at homepage
    And FY Admin sends username "adminfatih" and password "Batch44+" in sign in page
    And FY Admin clicks on sign in button in sign in page
    Then FY Admin verifies the admin page is displayed
    Then FY Admin clicks on items and titles dropdown
    And FY Admin clicks on messages button
    Then FY Admin verifies the messages page is displayed
    And FY Admin clicks on the delete button in the message page
    Then FY Admin verifies the delete confirmation toast container is displayed
    And FY Admin clicks the delete button in the toast container
    Then FY Admin verifies successfully deleted message is displayed


  @US027_TC006
  Scenario Outline: There should be a warning message under name text box by leaving the name text box empty
    Given FY Admin navigates to Medunna home page
    And FY Admin clicks on human icon
    And FY Admin clicks on sign in button under human icon at homepage
    And FY Admin sends username "adminfatih" and password "Batch44+" in sign in page
    And FY Admin clicks on sign in button in sign in page
    Then FY Admin verifies the admin page is displayed
    Then FY Admin clicks on items and titles dropdown
  And FY Admin clicks on messages button
  Then FY Admin verifies the messages page is displayed
  And FY Admin clicks on the create a new message button
  Then FY Admin verifies the Create or edit a Message page is displayed
    And FY Admin enters name "<Name>" into name text box
    And FY Admin enters email "<Email>" into email text box
    And FY Admin enters subject "<Subject>" into subject text box
    And FY Admin enters message "<Message>" into message text box
  And FY Admin clicks on save button in create or edit a message page
  Then FY Admin verifies the warning message under name text box is displayed

    Examples:
      | Name         | Email           | Subject          | Message                |
      |              | azer@gmail.com  | Titreme problemi | Sanatci titrerken oldu |



  @US027_TC007
  Scenario Outline: There should be a warning message under email text box by leaving the email text box empty
    Given FY Admin navigates to Medunna home page
    And FY Admin clicks on human icon
    And FY Admin clicks on sign in button under human icon at homepage
    And FY Admin sends username "adminfatih" and password "Batch44+" in sign in page
    And FY Admin clicks on sign in button in sign in page
    Then FY Admin verifies the admin page is displayed
    Then FY Admin clicks on items and titles dropdown
    And FY Admin clicks on messages button
    Then FY Admin verifies the messages page is displayed
    And FY Admin clicks on the create a new message button
    Then FY Admin verifies the Create or edit a Message page is displayed
    And FY Admin enters name "<Name>" into name text box
    And FY Admin enters email "<Email>" into email text box
    And FY Admin enters subject "<Subject>" into subject text box
    And FY Admin enters message "<Message>" into message text box
    And FY Admin clicks on save button in create or edit a message page
    Then FY Admin verifies the warning message under email text box is displayed


    Examples:
      | Name         | Email           | Subject          | Message                |
      | Azer Keklik  |                 | Titreme problemi | Sanatci titrerken oldu |

  @US027_TC008
  Scenario Outline: There should be a warning message under subject text box by leaving the subject text box empty
    Given FY Admin navigates to Medunna home page
    And FY Admin clicks on human icon
    And FY Admin clicks on sign in button under human icon at homepage
    And FY Admin sends username "adminfatih" and password "Batch44+" in sign in page
    And FY Admin clicks on sign in button in sign in page
    Then FY Admin verifies the admin page is displayed
    Then FY Admin clicks on items and titles dropdown
    And FY Admin clicks on messages button
    Then FY Admin verifies the messages page is displayed
    And FY Admin clicks on the create a new message button
    Then FY Admin verifies the Create or edit a Message page is displayed
    And FY Admin enters name "<Name>" into name text box
    And FY Admin enters email "<Email>" into email text box
    And FY Admin enters subject "<Subject>" into subject text box
    And FY Admin enters message "<Message>" into message text box
    And FY Admin clicks on save button in create or edit a message page
    Then FY Admin verifies the warning message under subject text box is displayed

    Examples:
      | Name         | Email           | Subject          | Message                |
      | Azer Kumru   | azer2@gmail.com |                  | Sanatci titrerken oldu |


  @US027_TC009
  Scenario Outline: There should be a warning message under email text box by sending an invalid
  email by deleting "@"
    Given FY Admin navigates to Medunna home page
    And FY Admin clicks on human icon
    And FY Admin clicks on sign in button under human icon at homepage
    And FY Admin sends username "adminfatih" and password "Batch44+" in sign in page
    And FY Admin clicks on sign in button in sign in page
    Then FY Admin verifies the admin page is displayed
    Then FY Admin clicks on items and titles dropdown
    And FY Admin clicks on messages button
    Then FY Admin verifies the messages page is displayed
    And FY Admin clicks on the create a new message button
    Then FY Admin verifies the Create or edit a Message page is displayed
    And FY Admin enters name "<Name>" into name text box
    And FY Admin enters email "<Email>" into email text box
    And FY Admin enters subject "<Subject>" into subject text box
    And FY Admin enters message "<Message>" into message text box
    And FY Admin clicks on save button in create or edit a message page
    Then FY Admin verifies the invalid message warning under email text box is displayed


    Examples:
      | Name         | Email           | Subject          | Message                |
      | Baba Hayri   | bahgmail.com    | Titreme problemi | Sanatci titrerken oldu |


  @US027_TC010
  Scenario Outline: There should be a warning message under email text box by sending an invalid
  email by deleting "." between "gmail" and "com"
    Given FY Admin navigates to Medunna home page
    And FY Admin clicks on human icon
    And FY Admin clicks on sign in button under human icon at homepage
    And FY Admin sends username "adminfatih" and password "Batch44+" in sign in page
    And FY Admin clicks on sign in button in sign in page
    Then FY Admin verifies the admin page is displayed
    Then FY Admin clicks on items and titles dropdown
    And FY Admin clicks on messages button
    Then FY Admin verifies the messages page is displayed
    And FY Admin clicks on the create a new message button
    Then FY Admin verifies the Create or edit a Message page is displayed
    And FY Admin enters name "<Name>" into name text box
    And FY Admin enters email "<Email>" into email text box
    And FY Admin enters subject "<Subject>" into subject text box
    And FY Admin enters message "<Message>" into message text box
    And FY Admin clicks on save button in create or edit a message page
    Then FY Admin verifies the invalid message warning under email text box is displayed


    Examples:
      | Name         | Email           | Subject          | Message                |
      | Adama Throre | adama@gmailcom  | Titreme problemi | Sanatci titrerken oldu |



  @US027_TC011 @Api
  Scenario: Admin should validate creating messages using API

    Given FY Admin set the path params for message
    And FY Admin enters expected data for message
    And FY Admin sends POST request and receives response for message
    Then FY Admin save all API information for message
    Then FY Admin verify API records for message


  @US027_TC012 @Api
  Scenario: Admin should validate reading messages using API
    Given FY Admin set the path params for message
    And FY Admin sends GET request and receives response for message
   Then FY Admin save all GET API information for message
    Then FY Admin verify GET API records for message


  @US027_TC013
    Scenario:Admin should validate messages with DB
    Given FY Admin connects to the database
    And FY Admin creates a new message data with these values "'77100','Taner Baba','tbaba@baba.com','baba','databasede mesaj yazdirma'"
    And FY Admin reads all of the "Messsage" column data from 100 row
    Then FY Admin verifies the creation is successfull using DB



