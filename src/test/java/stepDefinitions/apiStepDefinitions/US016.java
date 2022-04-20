package stepDefinitions.apiStepDefinitions;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;

import io.restassured.response.Response;
import org.junit.Assert;
import pojos.Room;
import utilities.ConfigurationReader;

import static hooks.Hooks.spec;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.port;
import static utilities.Authentication.generateToken;
import static utilities.WriteToTxt.saveRoomData;

public class US016 {

     static Room expectedRoom =new Room();
     static Response response;
     static Faker faker =new Faker();

    public static void main(String[] args) throws JsonProcessingException {

        spec = new RequestSpecBuilder().setBaseUri(ConfigurationReader.getProperty("medunnaUrl")).build();
        spec.pathParams("1", "api", "2", "rooms");
        expectedRoom.setRoomNumber(faker.number().numberBetween(9999, 99999));
        expectedRoom.setRoomType("TWIN");
        expectedRoom.setStatus(true);
        expectedRoom.setPrice(200.00);
        expectedRoom.setDescription("with TV");

        response = given().spec(spec)
                .header("Authorization", "Bearer " + generateToken())
                .contentType(ContentType.JSON)
                .body(expectedRoom)
                .when()
                .post("/{1}/{2}");
        saveRoomData(expectedRoom);
        response.prettyPrint();
        response.then().statusCode(201);
        ObjectMapper obj = new ObjectMapper();
        Room actualRoomData = obj.readValue(response.asString(), Room.class);
        System.out.println("Room Data: " + actualRoomData);
        Assert.assertEquals(expectedRoom.getRoomNumber(), actualRoomData.getRoomNumber());
        Assert.assertEquals(expectedRoom.getRoomType(), actualRoomData.getRoomType());
        Assert.assertEquals(expectedRoom.getStatus(), actualRoomData.getStatus());
        Assert.assertEquals(expectedRoom.getPrice(), actualRoomData.getPrice());
        Assert.assertEquals(expectedRoom.getDescription(), actualRoomData.getDescription());

    }

    @Given("AY User set path params for room creation")
    public void ay_user_set_path_params_for_room_creation() {
        spec.pathParams("1", "api", "2", "rooms");
    }

    @Given("AY User enters expected data for room creation")
    public void ay_user_enters_expected_data_for_room_creation() {
        expectedRoom.setRoomNumber(faker.number().numberBetween(9999,99999));
        expectedRoom.setRoomType("TWIN");
        expectedRoom.setStatus(true);
        expectedRoom.setPrice(200.00);
        expectedRoom.setDescription("with TV");
    }

    @Given("AY User sends request and receives response for room creation")
    public void ay_user_sends_request_and_receives_response_for_room_creation() {
        response = given().spec(spec)
                .header("Authorization","Bearer "+generateToken())
                .contentType(ContentType.JSON)
                .body(expectedRoom)
                .when()
                .post("/{1}/{2}");
        try {
            response.then().statusCode(201);
        } catch (Exception e){
            ay_user_enters_expected_data_for_room_creation();
            ay_user_sends_request_and_receives_response_for_room_creation();
        }
        response.prettyPrint();

    }

    @Given("AY User save all API information for room creation")
    public void ay_user_save_all_api_information_for_room_creation() {
        saveRoomData(expectedRoom);
    }

    @Given("AY User verify API records for room creation")
    public void ay_user_verify_api_records_for_room_creation() throws JsonProcessingException {
        ObjectMapper obj = new ObjectMapper();
        Room actualRoomData = obj.readValue(response.asString(),Room.class);
        System.out.println("Room Data: " + actualRoomData);
        Assert.assertEquals(expectedRoom.getRoomNumber(),actualRoomData.getRoomNumber());
        Assert.assertEquals(expectedRoom.getRoomType(),actualRoomData.getRoomType());
        Assert.assertEquals(expectedRoom.getStatus(),actualRoomData.getStatus());
        Assert.assertEquals(expectedRoom.getPrice(), actualRoomData.getPrice());
        Assert.assertEquals(expectedRoom.getDescription(),actualRoomData.getDescription());
    }







}
