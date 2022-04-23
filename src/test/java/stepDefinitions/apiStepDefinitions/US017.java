package stepDefinitions.apiStepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

import io.restassured.http.ContentType;

import io.restassured.response.Response;

import org.junit.Assert;
import pojos.Test;


import static hooks.Hooks.spec;
import static io.restassured.RestAssured.given;

import static utilities.Authentication.generateToken;

import static utilities.WriteToTxt.saveTestData;

public class US017 {

    static Test expectedTest= new Test();
    static Response response;

    // US017

    @Given("AY User set path params for test items read")
    public void ayUserSetPathParamsForTestItemsRead() {
        spec.pathParams("1", "api", "2", "c-test-items","3","30198");
    }

    @And("AY User enters expected data for test items read")
    public void ayUserEntersExpectedDataForTestItemsRead() {

      // expectedTest.setCreatedBy("medunnaadmin");
      // expectedTest.setCreatedDate("2022-03-16T22:55:47.152296Z");
      // expectedTest.setId(30198);
        expectedTest.setName("Na111");
        expectedTest.setDescription("");
        expectedTest.setPrice(50.00);
        expectedTest.setDefaultValMin("66");
        expectedTest.setDefaultValMax("100");
    }

    @And("AY User sends request and receives response for test items read")
    public void ayUserSendsRequestAndReceivesResponseForTestItemsRead() {

        response = given().spec(spec)
                .header("Authorization","Bearer "+generateToken())
                .contentType(ContentType.JSON)
                .when()
                .get("/{1}/{2}/{3}");

        try {
            response.then().statusCode(200);
        }catch (Exception e){
            ayUserEntersExpectedDataForTestItemsRead();
            ayUserSendsRequestAndReceivesResponseForTestItemsRead();
        }
        response.prettyPrint();
        System.out.println("status code = " + response.getStatusCode());


    }

    @And("AY User save all API information for test items read")
    public void ayUserSaveAllAPIInformationForTestItemsRead() {
        saveTestData(expectedTest);

    }


    @And("AY User verify API records for test items read")
    public void ayUserVerifyAPIRecordsForTestItemsRead() {
       // HashMap<String,Object> actualTestData=response.as(HashMap.class);
       Test actualTestData =response.as(Test.class);
        System.out.println("actualTestData = " + actualTestData);

        Assert.assertEquals(expectedTest.getName(), actualTestData.getName());
        Assert.assertEquals(expectedTest.getDescription(),actualTestData.getDescription());
        Assert.assertEquals(expectedTest.getPrice(),actualTestData.getPrice());
        Assert.assertEquals(expectedTest.getDefaultValMin(),actualTestData.getDefaultValMin());
        Assert.assertEquals(expectedTest.getDefaultValMax(),actualTestData.getDefaultValMax());


    }

// US017


    @Given("AY User set path params for test item creation")
    public void ayUserSetPathParamsForTestItemCreation() {
        spec.pathParams("1","api","2","c-test-items");
    }

    @And("AY User enters expected data for test item creation")
    public void ayUserEntersExpectedDataForTestItemCreation() {
        expectedTest.setName("Kyress2");
        expectedTest.setDescription("mg/ml");
        expectedTest.setPrice(35.00);
        expectedTest.setDefaultValMin("200");
        expectedTest.setDefaultValMax("700");
    }


    @And("AY User sends request and receives response for test item creation")
    public void ayUserSendsRequestAndReceivesResponseForTestItemCreation() {
        response = given().spec(spec)
                .header("Authorization","Bearer "+generateToken())
                .contentType(ContentType.JSON)
                .body(expectedTest)
                .when()
                .post("/{1}/{2}");

        try {
            response.then().statusCode(201);
        }catch (Exception e){
            ayUserEntersExpectedDataForTestItemsRead();
            ayUserSendsRequestAndReceivesResponseForTestItemsRead();
        }

        response.prettyPrint();
        System.out.println("response.getStatusCode() = " + response.getStatusCode());

    }

    @And("AY User save all API information for test item creation")
    public void ayUserSaveAllAPIInformationForTestItemCreation() {
    saveTestData(expectedTest);
    }

    @And("AY User verify API records for test item creation")
    public void ayUserVerifyAPIRecordsForTestItemCreation() {
        Test actualTestData=response.as(Test.class);
        System.out.println("actualTestData = " + actualTestData);

       Assert.assertEquals(expectedTest.getName(),actualTestData.getName());
       Assert.assertEquals(expectedTest.getDescription(),actualTestData.getDescription());
       Assert.assertEquals(expectedTest.getPrice(),actualTestData.getPrice());
       Assert.assertEquals(expectedTest.getDefaultValMin(),actualTestData.getDefaultValMin());
       Assert.assertEquals(expectedTest.getDefaultValMax(),actualTestData.getDefaultValMax());
    }


}
