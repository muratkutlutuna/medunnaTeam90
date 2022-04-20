package stepDefinitions.apiStepDefinitions;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import pojos.Account;
import utilities.ConfigurationReader;

import static hooks.Hooks.spec;
import static io.restassured.RestAssured.given;
import static utilities.Authentication.generateToken;

public class US002 {
    static Response response;

   public static void main(String[] args) throws JsonProcessingException {
        spec = new RequestSpecBuilder().setBaseUri(ConfigurationReader.getProperty("medunnaUrl")).build();
       spec.pathParams("1","api","2","account");
       response = given().spec(spec)
               .header("Authorization","Bearer "+ generateToken("kurt890","kurt890"))
               .contentType(ContentType.JSON)
               .when()
               .get("/{1}/{2}/");
        response.prettyPrint();
        response.then().statusCode(401);
       ObjectMapper obj = new ObjectMapper();
       Account actualUserData = obj.readValue(response.asString(),Account.class);
       System.out.println("actualUserData = " + actualUserData.toString());
        String email= "kurt89@hotmail.com";
       Assert.assertNull(actualUserData.getEmail());
    }


    @Given("RT User sets the path params for account information")
    public void rt_user_sets_the_path_params_for_account_information() {
        spec.pathParams("1","api","2","account");

    }
    @Given("RT User enters expected data for account information")
    public void rt_user_enters_expected_data_for_account_information() {

    }
    @Given("RT User sends request and receives response for account information with {string},{string}")
    public void rt_user_sends_request_and_receives_response_for_account_information_with(String username, String password) {
   response = given().spec(spec)
           .header("Authorization","Bearer "+ generateToken(username,password))
           .contentType(ContentType.JSON)
           .when()
           .get("/{1}/{2}/");
    }

    @Then("RT User verify Api email records is null")
    public void rtUserVerifyApiRecordsIsNull() throws JsonProcessingException {
        response.prettyPrint();
        response.then().statusCode(401);
        ObjectMapper obj = new ObjectMapper();
        Account actualUserData = obj.readValue(response.asString(),Account.class);
        Assert.assertNull(actualUserData.getEmail());
    }

    @Then("RT User verify Api {string} records")
    public void rtUserVerifyApiRecords(String email) throws JsonProcessingException {
        response.prettyPrint();
        response.then().statusCode(200);
        ObjectMapper obj = new ObjectMapper();
        Account actualUserData = obj.readValue(response.asString(),Account.class);
        Assert.assertEquals(email,actualUserData.getEmail());
    }
}
