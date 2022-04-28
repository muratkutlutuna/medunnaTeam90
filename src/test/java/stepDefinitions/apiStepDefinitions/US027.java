package stepDefinitions.apiStepDefinitions;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
//import org.codehaus.jackson.map.util.JSONPObject;
import org.junit.Assert;
import pojos.Messages;
import org.json.JSONObject;
import utilities.WriteToTxt;

import static hooks.Hooks.spec;
import static io.restassured.RestAssured.given;
import static utilities.Authentication.generateToken;
import static utilities.WriteToTxt.saveMessagesData;

public class US027 {

    static Response response;
    static Messages messages = new Messages();

    @Given("FY Admin set the path params for message")
    public void fy_admin_set_the_path_params_for_message() {
        // spec = new RequestSpecBuilder().setBaseUri(ConfigurationReader.getProperty("medunnaUrl")).build();
        spec.pathParams("1", "api", "2", "c-messages");

    }

    @Given("FY Admin enters expected data for message")
    public void fy_admin_enters_expected_data_for_message() {
        messages.setName("Ali Baba");
        messages.setEmail("alibaba@medunna.com");
        messages.setSubject("pop");
        messages.setMessage("Bitsin");
    }

    @Given("FY Admin sends POST request and receives response for message")
    public void fy_admin_sends_post_request_and_receives_response_for_message() {
        response = given().spec(spec).header("Authorization", "Bearer " + generateToken())
                .contentType(ContentType.JSON).body(messages).when().post("/{1}/{2}");
      //  response.prettyPrint();

        Response response2 = given().spec(spec).auth().oauth2(generateToken())
                .contentType(ContentType.JSON).body(messages).when().post("/{1}/{2}");
      //  response2.prettyPrint();

    }

    @Then("FY Admin save all API information for message")
    public void fy_admin_save_all_api_information_for_message() {

        try {
            response.then().statusCode(201);
            saveMessagesData(messages);
            System.out.println(messages.toString());
        } catch (Exception e) {

        }

    }

    @Then("FY Admin verify API records for message")
    public void fy_admin_verify_api_records_for_message() throws JsonProcessingException {
        response.then().statusCode(201);
        response.prettyPrint();
        ObjectMapper obj = new ObjectMapper();
        Messages actualMessages = obj.readValue(response.asString(), Messages.class);
        System.out.println("actualMessages = " + actualMessages);
        Assert.assertEquals(messages.getName(), actualMessages.getName());
        Assert.assertEquals(messages.getEmail(), actualMessages.getEmail());
        Assert.assertEquals(messages.getSubject(), actualMessages.getSubject());
        Assert.assertEquals(messages.getMessage(), actualMessages.getMessage());

    }

    @Then("FY Admin save all GET API information for message")
    public void fyAdminSaveAllGETAPIInformationForMessage() {
        response.then().statusCode(200);
        Messages actualData=response.as(Messages.class);
        System.out.println("actualData = " + actualData);
        WriteToTxt.saveMessagesData(actualData);
    }



    @And("FY Admin sends GET request and receives response for message")
    public void fyAdminSendsGETRequestAndReceivesResponseForMessage() throws JsonProcessingException {
        spec.pathParams("1", "api", "2", "c-messages","3",77082);
        response = given().spec(spec).header("Authorization", "Bearer " + generateToken())
                .contentType(ContentType.JSON).when().get("/{1}/{2}/{3}");
        response.prettyPrint();

    }

    @Then("FY Admin verify GET API records for message")
    public void fyAdminVerifyGETAPIRecordsForMessage() throws JsonProcessingException {

        //first way
          JsonPath json = response.jsonPath();
        Assert.assertEquals("Ali Baba",json.getString("name"));
        Assert.assertEquals("alibaba@medunna.com",json.getString("email"));
        Assert.assertEquals("pop",json.getString("subject"));
        Assert.assertEquals("Bitsin",json.getString("message"));

        //second way
        Messages messages= new Messages(100,"alibaba@medunna.com","Bitsin","Ali Baba","pop");
        messages.setName("Ali Baba");
        messages.setEmail("alibaba@medunna.com");
        messages.setSubject("pop");
        messages.setMessage("Bitsin");

        ObjectMapper obj = new ObjectMapper();
        Messages actualMessages = obj.readValue(response.asString(), Messages.class);
        System.out.println("actualMessages = " + actualMessages);
        Assert.assertEquals(messages.getName(), actualMessages.getName());
        Assert.assertEquals(messages.getEmail(), actualMessages.getEmail());
        Assert.assertEquals(messages.getSubject(), actualMessages.getSubject());
        Assert.assertEquals(messages.getMessage(), actualMessages.getMessage());

        //third way
        JSONObject expectedMessage=new JSONObject();
        expectedMessage.put("name","Ali Baba");
        expectedMessage.put("email", "alibaba@medunna.com");
        expectedMessage.put("subject", "pop");
        expectedMessage.put("message", "Bitsin");
        Assert.assertEquals(expectedMessage.getString("name"), actualMessages.getName());
        Assert.assertEquals(expectedMessage.getString("email"), actualMessages.getEmail());
        Assert.assertEquals(expectedMessage.getString("subject"), actualMessages.getSubject());
        Assert.assertEquals(expectedMessage.getString("message"), actualMessages.getMessage());





    }
}
