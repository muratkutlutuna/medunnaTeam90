@APImehlika
Feature: Api_US019 - Create, edit or delete Staff by just Admin and Validate with API

  @ApiUS019
  Scenario: TC01506 - Validate patient info with API

    Given mbApi Sign in as an Admin and set the path params for staff
    Then mbApi Enter expected data for staff
    And mbApi End request and receives response for register
    Then mbApi Verify API records for register