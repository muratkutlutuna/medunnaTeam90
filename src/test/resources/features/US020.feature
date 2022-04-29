@US020
Feature: US20_User management Activate a new user and provide necessary roles ONLY for Doctors and Staff by Admin
  Background: User goes to user management page
    Given S go to Medunna website
    Then S user logins as admin
    And S user clicks administration button
    Then S user clicks user management button

  @SmokeTest2
  Scenario: TC001_Admin can view registered people info as firstname, lastname, email etc..

    Then S user clicks view button for a registered person
    And S user asserts the visibility of info page
    Then S user navigates back

    Scenario: TC002_Admin can edit existing user info such as activated user, giving them roles as ADMIN, USER
    PATIENT, STAFF and PHYSICIAN

      Then S user clicks edit button for a registered person
      Then S user clicks activate checkbox to activate the person
      And S user gives the person admin role from the profiles
      Then S user saves the changes


  Scenario: TC003_Admin can edit existing user info such as activated user, giving them roles as ADMIN, USER
  PATIENT, STAFF and PHYSICIAN

    Then S user clicks edit button for a registered person
    And S user gives the person user role from the profiles
    Then S user saves the changes

  Scenario: TC004_Admin can edit existing user info such as activated user, giving them roles as ADMIN, USER
  PATIENT, STAFF and PHYSICIAN

    Then S user clicks edit button for a registered person
    And S user gives the person patient role from the profiles
    Then S user saves the changes

  Scenario: TC005_Admin can edit existing user info such as activated user, giving them roles as ADMIN, USER
  PATIENT, STAFF and PHYSICIAN

    Then S user clicks edit button for a registered person
    And S user gives the person staff role from the profiles
    Then S user saves the changes

  Scenario: TC006_Admin can edit existing user info such as activated user, giving them roles as ADMIN, USER
  PATIENT, STAFF and PHYSICIAN

    Then S user clicks edit button for a registered person
    And S user gives the person physician role from the profiles
    Then S user saves the changes



      Scenario: TC007_Admin cannot delete users

        Then S user clicks delete button for a registered person
        And S user confirms the delete operation
        Then S user asserts that he cannot delete the user

