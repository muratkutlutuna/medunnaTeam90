package stepDefinitions.apiStepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.json.JSONObject;
import org.junit.Assert;
import pojos.Country;
import utilities.WriteToTxt;

import java.util.HashMap;
import java.util.Map;

import static hooks.Hooks.spec;
import static io.restassured.RestAssured.given;
import static utilities.Authentication.generateToken;

public class US028 {
    Response response1;
    Response response2;
    Response response3;
    Response response4;
    Country countries = new Country();
    Country actualData;
    Country updatedActualData;

    @Given("FY Admin sets the path params for countries")
    public void fy_admin_sets_the_path_params_for_countries() {
        spec.pathParams("1","api","2","countries","3",77138);
    }
    @Given("FY Admin sends GET request and receives response for created country")
    public void fy_admin_sends_get_request_and_receives_response_for_created_country() {
        response1=given().spec(spec).auth().oauth2(generateToken()).contentType(ContentType.JSON).when().get("/{1}/{2}/{3}");
        response1.prettyPrint();

    }
    @Given("FY Admin saves GET API information for created country")
    public void fy_admin_saves_get_api_information_for_created_country() {
        actualData=response1.as(Country.class);
        System.out.println("actualData = " + actualData);
        WriteToTxt.saveCountriesData(actualData);


    }
    @Then("FY Admin verifies GET API records for created country")
    public void fy_admin_verifies_get_api_records_for_created_country() {
        actualData=response1.as(Country.class);
        System.out.println("actualData.getId() = " + actualData.getId());
        System.out.println("actualData.getName() = " + actualData.getName());
        Assert.assertEquals((int)77138,actualData.getId());
        Assert.assertEquals("The United Kingdom",actualData.getName());
    }

    @Given("FY Admin sets PUT request path params for countries")
    public void fyAdminSetsPUTRequestPathParamsForCountries() {
        spec.pathParams("1","api","2","countries");
    }

    @Given("FY Admin sends PUT request and receives response for any existing country")
    public void fy_admin_sends_put_request_and_receives_response_for_any_existing_country() {

        //body update first way
        Map<String,Object> requestBodyMap=new HashMap<>();
        requestBodyMap.put("id",77108);
        requestBodyMap.put("name","The United Gurhan's Kingdom");
       //body update second way
        Country requestBody=new Country(77108,"The United Gurhan's Kingdom");
        System.out.println("requestBody = " + requestBody);
        //body update third way
        response2 = given().
                spec(spec).auth().oauth2(generateToken()).
                contentType(ContentType.JSON).
                body("{\n" +
                        "    \"id\": 80073,\n" +
                        "    \"name\": \"Kingdom of HADI BAKALIM TESTERLAR (name updated)\"\n" +
                        "}").
                when().
                put("/{1}/{2}");
       response2.prettyPrint();

    }

    @Given("FY Admin saves PUT API information for updated country")
    public void fy_admin_saves_put_api_information_for_updated_country() {
        updatedActualData=response2.as(Country.class);
     //   System.out.println("updatedActualData = " + updatedActualData);
        WriteToTxt.saveCountriesData(updatedActualData);

    }

    @Then("FY Admin verifies PUT API records for updated country")
    public void fy_admin_verifies_put_api_records_for_updated_country() {
        Assert.assertEquals(200,response2.getStatusCode());
       //assertion first way
        JsonPath json= new JsonPath(response2.asString());
        Assert.assertEquals("Kingdom of HADI BAKALIM TESTERLAR (name updated)",json.getString("name"));
        //assertion second way
        JsonPath json1=response2.jsonPath();
       JSONObject jsObject=new JSONObject();
        jsObject.put("name","Kingdom of HADI BAKALIM TESTERLAR (name updated)");
        Assert.assertEquals(jsObject.getString("name"),json1.getString("name"));

    }


    @Given("FY Admin sets DELETE request path params for any country")
    public void fyAdminSetsDELETERequestPathParamsForAnyCountry() {
        spec.pathParams("1","api","2","countries");
        response3 = given().spec(spec).auth().oauth2(generateToken())
                .contentType(ContentType.JSON).body("{\n" +
                        " \n" +
                        "  \"name\": \"Republic Of Testers\"\n" +
                        "}").when().post("/{1}/{2}");
        response3.prettyPrint();

        Country countryData=response3.as(Country.class);
        Integer id= countryData.getId();
        System.out.println("id = " + id);
        spec.pathParams("1","api","2","countries","3",id);
        response4=given().spec(spec).contentType(ContentType.JSON).auth().oauth2(generateToken()).when().delete("/{1}/{2}/{3}");
        response4.prettyPrint();
    }

    @Then("FY Admin verifies DELETE API records for deleted country")
    public void fy_admin_verifies_delete_api_records_for_deleted_country() {
        Assert.assertTrue(response4.asString().contains(""));

    }



}
