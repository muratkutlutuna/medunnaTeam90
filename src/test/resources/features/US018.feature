Feature: admin assign user to physician role

 #Background:

  @TC01
  Scenario Outline: Admin can choose/search an existing registered person by SSN id
    Given C navigate to Medduna Home Page
    When  C Verify that home page is visible successfully
    When C Click on Account DropDownMenu button
    When C Click on Sign in
    And C Verify Sign in Header is visible
    Then C Click on Username input box.
    Then C Enter Valid "<username>" Username
    Then C Click on Password input box.
    Then C Enter Valid "<password>" Password
    Then C Click on Sign in button
    And click on Item&Titles DropDownMenu and select Physician
    And Verify that Physicians Page Header is visible
    And click on new physician button
    And Verify that Create or edit a Physician Page is displayed
    And click on Use Search checkbox.
    And Click on SSN text box
    And Enter the "<Ssn>" number and click search user button
    And Verify that User found with search SSN message is displayed

    Examples:
      | Ssn         | username    | password        |
      | 321-54-0003 | admincemile | AdminCemile123! |


    Scenario Outline: Admin can view all Physicians' info populated on view portal
Given C navigate to Medduna Home Page
    When  C Verify that home page is visible successfully
    When C Click on Account DropDownMenu button
    When C Click on Sign in
    And C Verify Sign in Header is visible
    Then C Click on Username input box.
    Then C Enter Valid "<username>" Username
    Then C Click on Password input box.
    Then C Enter Valid "<password>" Password
    Then C Click on Sign in button
    And click on Item&Titles DropDownMenu and select Physician
    And Verify that Physicians' info  is visible

      Examples:
    | username    | password        |
    | admincemile | AdminCemile123! |

  Scenario Outline: Admin can edit existing Physicians' info using new data
Given C navigate to Medduna Home Page
    When  C Verify that home page is visible successfully
    When C Click on Account DropDownMenu button
    When C Click on Sign in
    And C Verify Sign in Header is visible
    Then C Click on Username input box.
    Then C Enter Valid "<username>" Username
    Then C Click on Password input box.
    Then C Enter Valid "<password>" Password
    Then C Click on Sign in button
    And click on Item&Titles DropDownMenu and select Physician
      And click Edit Button
    # And Admin should provide the Exam fee of the doctor

   # And Verify that Create or edit a Physician Page is displayed

   # And update speciality as Nuclear Medicine
   # And Admin can provide a profile picture of the doctor

      Examples:
    | username    | password        |
    | admincemile | AdminCemile123! |



    Scenario Outline: Admin can delete existing Physicians
Given C navigate to Medduna Home Page
    When  C Verify that home page is visible successfully
    When C Click on Account DropDownMenu button
    When C Click on Sign in
    And C Verify Sign in Header is visible
    Then C Click on Username input box.
    Then C Enter Valid "<username>" Username
    Then C Click on Password input box.
    Then C Enter Valid "<password>" Password
    Then C Click on Sign in button
    And click on Item&Titles DropDownMenu and select Physician
    #And Verify that Physicians' info  is visible
   And click on Delete Button
      And  Verify Confirm delete operation message is displayed

    Examples:
    | username    | password        |
    | admincemile | AdminCemile123! |

@TC_01805
  Scenario Outline: Admin should choose the doctor among existing users
  Given C navigate to Medduna Home Page
    When  C Verify that home page is visible successfully
    When C Click on Account DropDownMenu button
    When C Click on Sign in
    And C Verify Sign in Header is visible
    Then C Click on Username input box.
    Then C Enter Valid "<username>" Username
    Then C Click on Password input box.
    Then C Enter Valid "<password>" Password
    Then C Click on Sign in button
    And click on Item&Titles DropDownMenu and select Physician
  And Verify that Physicians Page Header is visible

    Examples:
    | username    | password        |
    | admincemile | AdminCemile123! |

  Scenario Outline: create physician by user registrant

    Given user is on the common  page
    And user navigates to registration page
    And user provides physician ssn id "<ssn>"
    And  user provides physician firstname and lastname "<firstName>" and "<lastName>"
    And user creates physician username "<username>"
    And user provides physician email "<email>"
    And user generates the password "<password>"
    And user cliskc register button
    And Verify that Registration saved message is visible
    #Then user creates the records to a correspondent file

    Examples: test user data
      | ssn         | firstName | lastName | username    | email              | password    |
      | 321-54-0014 | Aaab      | Aaali    | aaabaaali11 | aaabaaal@gmail.com | aaabaaali1! |

  Scenario Outline: admin edit

    Given C navigate to Medduna Home Page
    When  C Verify that home page is visible successfully
    When C Click on Account DropDownMenu button
    When C Click on Sign in
    And C Verify Sign in Header is visible
    Then C Click on Username input box.
    Then C Enter Valid "<username>" Username
    Then C Click on Password input box.
    Then C Enter Valid "<password>" Password
    Then C Click on Sign in button
    And click on Administration Button

     # And Click on user Management Button
     # And click on MyPhyisician and  click Edit button
  #And Get SSN row
      #And edit phyisician

    Examples:
      | username    | password        |
      | admincemile | AdminCemile123! |


  Scenario Outline: Verify that Physicians Page Header is visible

    Given C navigate to Medduna Home Page
    When  C Verify that home page is visible successfully
    When C Click on Account DropDownMenu button
    When C Click on Sign in
    And C Verify Sign in Header is visible
    Then C Click on Username input box.
    Then C Enter Valid "<username>" Username
    Then C Click on Password input box.
    Then C Enter Valid "<password>" Password
    Then C Click on Sign in button
    And click on Item&Titles DropDownMenu and select Physician
    And Verify that Physicians Page Header is visible

    And Get SSN row
  #And Find existing SSN



     # And Click on user Management Button
     # And click on MyPhyisician and  click Edit button
      #And edit phyisician

    Examples:
      | username    | password        |
      | admincemile | AdminCemile123! |

  @AdmCreatePhysician
  Scenario Outline: admin activate user and assign physician roll
    When User navigates to the home page
    And user clicks sign in button at the home page and navigates to sign in page
    Then user verifies that sign in page header is visible
    And user enters admin "<username>" and password "<password>"
    And user clicks sign in button
    Then user verifies that sign in is successful
    And user clicks administration dropdown button on admin page
    And user clicks user management button on admin page
    And user clicks go to last int page button on admin page
    And user clicks Deactivated button to activate physician on admin page
    Then user clicks edit button on admin page
    And user clicks rollPhysician on profiles iframe
    And user clicks save physician button




      #
    And user clicks go to last int page button on admin page
    Given User navigates to the home page
    And user clicks sign in button at the home page and navigates to sign in page
    And user clicks administration dropdown button on admin page
    And user clicks user management button on admin page
    And user verifies user page is visible
    And user clicks to create a new user button
    And user verifies create or edit page visible
    And user creates username "<user>"
    And  user provides firstname and lastname "<firstName>" and "<lastName>"
    And user provides also email "<email>"
    And user provides ssn id "<ssn>"
    And user clicks rollPhysician on profiles iframe
    Then user clicks save physician button
    And user clicks go to last int page button on admin page
    And user clicks delete button on admin page
    Then user clicks confirm deletebutton on admin page


    Examples: test user data
      | ssn         | firstName | lastName | user      | email               | password    |
      | 321-54-0011 | Aaab      | Aaali    | aaabaaali | aaabaaali@gmail.com | aaabaaali1! |













