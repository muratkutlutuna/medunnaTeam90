@US028 @UI028fatih
Feature: US028 Country creation / update / read and Delete by Admin

  @US028_TC001 @SmokeTest2
  Scenario: Admin should be able to create a new country
    Given FY Admin navigates to Medunna home page
    And FY Admin clicks on human icon
    And FY Admin clicks on sign in button under human icon at homepage
    And FY Admin sends username "adminfatih" and password "Batch44+" in sign in page
    And FY Admin clicks on sign in button in sign in page
    Then FY Admin verifies the admin page is displayed
    And FY Admin clicks on items and titles dropdown
    And FY Admin clicks on Country button
    Then FY Admin verifies the Countries page is displayed
    And FY Admin clicks on the create a new Country button
    Then FY Admin verifies the Create or edit a Country page is displayed
    And FY Admin enters any country name into name text box
    And FY Admin clicks on save button in Create or edit a Country page
    Then FY Admin verifies a new country is created message is displayed

  @US028_TC002
  Scenario Outline: Admin should not be able to create a new country
  if we use special characters for the country name
    Given FY Admin navigates to Medunna home page
    And FY Admin clicks on human icon
    And FY Admin clicks on sign in button under human icon at homepage
    And FY Admin sends username "<username>" and password "<password>" in sign in page
    And FY Admin clicks on sign in button in sign in page
    Then FY Admin verifies the admin page is displayed
    And FY Admin clicks on items and titles dropdown
    And FY Admin clicks on Country button
    Then FY Admin verifies the Countries page is displayed
    And FY Admin clicks on the create a new Country button
    Then FY Admin verifies the Create or edit a Country page is displayed
    And FY Admin enters any country name "<countryName>" into name text box
    And FY Admin clicks on save button in Create or edit a Country page
    Then FY Admin verifies a new country is not created message is displayed

    Examples:
      | username   | password | countryName |
      | adminfatih | Batch44+ | !@#$%%^     |


  @US028_TC003
  Scenario Outline: Admin should not be able to create a new country if we use digits for the country name
  if we use special characters for the country name
    Given FY Admin navigates to Medunna home page
    And FY Admin clicks on human icon
    And FY Admin clicks on sign in button under human icon at homepage
    And FY Admin sends username "<username>" and password "<password>" in sign in page
    And FY Admin clicks on sign in button in sign in page
    Then FY Admin verifies the admin page is displayed
    And FY Admin clicks on items and titles dropdown
    And FY Admin clicks on Country button
    Then FY Admin verifies the Countries page is displayed
    And FY Admin clicks on the create a new Country button
    Then FY Admin verifies the Create or edit a Country page is displayed
    And FY Admin enters any country name "<countryName>" into name text box
    And FY Admin clicks on save button in Create or edit a Country page
    Then FY Admin verifies a new country is not created message is displayed

    Examples:
      | username   | password | countryName |
      | adminfatih | Batch44+ | 12345       |


  @US028_TC004
  Scenario Outline: Admin should be able to create related states or cities based on the country
    Given FY Admin navigates to Medunna home page
    And FY Admin clicks on human icon
    And FY Admin clicks on sign in button under human icon at homepage
    And FY Admin sends username "<username>" and password "<password>" in sign in page
    And FY Admin clicks on sign in button in sign in page
    Then FY Admin verifies the admin page is displayed
    And FY Admin clicks on items and titles dropdown
    And FY Admin clicks on StateCity button
    Then FY Admin verifies the StatesCities page is displayed
    And FY Admin clicks on the create a new StateCity button
    Then FY Admin verifies the Create or edit a StateCity page is displayed
    And FY Admin enters any StateCity name "<stateCity>" into name text box
    And FY Admin clicks on StateCity dropdown
    And FY Admin clicks on one country "<country>"
    And FY Admin clicks on save button in Create or edit a StateCity page
    Then FY Admin verifies a new StateCity is created message is displayed

    Examples:
      | username   | password | stateCity | country |
      | adminfatih | Batch44+ | Liverpool  | The United Kingdom      |



    @US028_TC005
    Scenario: Admin should validate them with API
      Given FY Admin sets the path params for countries
      And FY Admin sends GET request and receives response for created country
      And FY Admin saves GET API information for created country
      Then FY Admin verifies GET API records for created country


    @US028_TC006
    Scenario: Admin should  update existing countries using API
     Given FY Admin sets PUT request path params for countries
      And FY Admin sends PUT request and receives response for any existing country
      And FY Admin saves PUT API information for updated country
      Then FY Admin verifies PUT API records for updated country


    @US028_TC007
    Scenario: Admin should  DELETE existing countries using API
      Given FY Admin sets DELETE request path params for any country
      Then FY Admin verifies DELETE API records for deleted country


   @US028_TC008
   Scenario: Admin should validate countries with DB
    Given FY Admin connects to the database
     And FY Admin gets all of the "name" column data from "country" table
    Then FY Admin verifies the country name successfully using DB
