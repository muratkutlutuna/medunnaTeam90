

@Api @apiAina
 Feature:  US_017 Validate test items with API


  Scenario: TC_01705 Validate all test items with API reading(get)

  Given AY User set path params for test items read
  And AY User enters expected data for test items read
  And AY User sends request and receives response for test items read
  And AY User save all API information for test items read
  And AY User verify API records for test items read

Scenario: TC_01706 Create test items using api
 Given AY User set path params for test item creation
 And AY User enters expected data for test item creation
 And AY User sends request and receives response for test item creation
 And AY User save all API information for test item creation
 And AY User verify API records for test item creation


