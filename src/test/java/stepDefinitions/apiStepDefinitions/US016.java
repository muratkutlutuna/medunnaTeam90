package stepDefinitions.apiStepDefinitions;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.javafaker.Faker;
import io.cucumber.java.bs.A;
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
        expectedRoom.setRoomNumber(faker.number().numberBetween(9999,99999));
        expectedRoom.setRoomType("TWIN");
        expectedRoom.setStatus(true);
        expectedRoom.setPrice(200.00);
        expectedRoom.setDescription("with TV");

         response = given()
                .contentType(ContentType.JSON)
                .spec(spec)
                .header("Authorization","Bearer "+generateToken())
                .body(expectedRoom)
                .when()
                .post("/{1}/{2}");

        response.prettyPrint();
        response.then().statusCode(201);
        System.out.println("response.getStatusCode() = " + response.getStatusCode());
        

    //   ObjectMapper obj = new ObjectMapper();
    //   Room actualRoomData = obj.readValue(response.asString(),Room.class);
        Room actualRoomData=response.as(Room.class);
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
        System.out.println("response.getStatusCode() = " + response.getStatusCode());

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
  /* {
    "createdBy": "team90admin",
    "createdDate": "2022-04-19T09:23:56.232704Z",
    "id": 77452,
    "roomNumber": 22404,
    "roomType": "TWIN",
    "status": true,
    "price": 200.0,
    "description": "with TV"
}
*/

   @And("AY User set path params for room read")
    public void ayUserSetPathParamsForRoomRead() {
        spec.pathParams("1", "api", "2", "rooms","3","77463");
    }

    @And("AY User enters expected data for room read")
    public void ayUserEntersExpectedDataForRoomRead() {
       expectedRoom.setRoomNumber(67663);
       expectedRoom.setRoomType("TWIN");
       expectedRoom.setStatus(true);
       expectedRoom.setPrice(200.00);
       expectedRoom.setDescription("with TV");
    }

    @And("AY User sends request and receives response for room read")
    public void ayUserSendsRequestAndReceivesResponseForRoomRead() {
        response = given().spec(spec)
                .header("Authorization","Bearer "+generateToken())
                .contentType(ContentType.JSON)
                .when()
                .get("/{1}/{2}/{3}");

        try {
            response.then().statusCode(200);
        } catch (Exception e){
            ayUserEntersExpectedDataForRoomRead();
            ayUserSendsRequestAndReceivesResponseForRoomRead();
        }

        response.prettyPrint();
        System.out.println("response.getStatusCode() = " + response.getStatusCode());
    }

    @And("AY User save all API information for room read")
    public void ayUserSaveAllAPIInformationForRoomRead() {
        saveRoomData(expectedRoom);
    }

    @And("AY User verify API records for room read")
    public void ayUserVerifyAPIRecordsForRoomRead() throws JsonProcessingException {
        ObjectMapper obj = new ObjectMapper();
        Room actualRoomData = obj.readValue(response.asString(),Room.class);
        System.out.println("Room Data: " + actualRoomData);
        Assert.assertEquals(expectedRoom.getRoomNumber(),actualRoomData.getRoomNumber());
        Assert.assertEquals(expectedRoom.getRoomType(),actualRoomData.getRoomType());
        Assert.assertEquals(expectedRoom.getStatus(),actualRoomData.getStatus());
        Assert.assertEquals(expectedRoom.getPrice(), actualRoomData.getPrice());
        Assert.assertEquals(expectedRoom.getDescription(),actualRoomData.getDescription());

    }

    @And("AY User set path params for room update")
    public void ayUserSetPathParamsForRoomUpdate() {
       spec.pathParams("1","api","2","rooms");
    }
   /* {
        "createdBy": "adminrecep",
        "createdDate": "2022-03-21T19:09:28.378528Z",
        "id": 35703,
        "roomNumber": 14729,
        "roomType": "SUITE",
        "status": true,
        "price": 108.00,
        "description": "with TV"
    }*/

    @And("AY User enters expected data for room update")
    public void ayUserEntersExpectedDataForRoomUpdate() {
       expectedRoom.setCreatedBy("team90admin");
       expectedRoom.setCreatedDate("2022-04-16T15:27:37.657228Z");
       expectedRoom.setId(35703);
       expectedRoom.setRoomNumber(15629);
       expectedRoom.setRoomType("DELUXE");
       expectedRoom.setStatus(true);
       expectedRoom.setPrice(500.00);
       expectedRoom.setDescription("without TV");
    }

    @And("AY User sends request and receives response for room update")
    public void ayUserSendsRequestAndReceivesResponseForRoomUpdate() {

       response=given().spec(spec)
               .header("Authorization","Bearer "+ generateToken())
               .contentType(ContentType.JSON)
               .body(expectedRoom)
               .when()
               .put("/{1}/{2}");
        try {
            response.then().statusCode(200);
        } catch (Exception e){
            ayUserEntersExpectedDataForRoomRead();
            ayUserSendsRequestAndReceivesResponseForRoomRead();
        }
      response.prettyPrint();
        System.out.println("response.getStatusCode() = " + response.getStatusCode());

    }

    @And("AY User save all API information for room update")
    public void ayUserSaveAllAPIInformationForRoomUpdate() {
       saveRoomData(expectedRoom);
    }

    @And("AY User verify API records for room update")
    public void ayUserVerifyAPIRecordsForRoomUpdate() {
       Room actualDataUpdate=response.as(Room.class);
        System.out.println("actualDataUpdate = " + actualDataUpdate);
       Assert.assertEquals(expectedRoom.getRoomNumber(),actualDataUpdate.getRoomNumber());
       Assert.assertEquals(expectedRoom.getRoomType(),actualDataUpdate.getRoomType());
       Assert.assertEquals(expectedRoom.getStatus(),actualDataUpdate.getStatus());
       Assert.assertEquals(expectedRoom.getPrice(), actualDataUpdate.getPrice());
       Assert.assertEquals(expectedRoom.getDescription(), actualDataUpdate.getDescription());

    }

    @And("AY User set path params for room delete")
    public void ayUserSetPathParamsForRoomDelete() {
        spec.pathParams("1","api","2","rooms","3","86926");
    }


    @And("AY User sends request and receives response for room delete")
    public void ayUserSendsRequestAndReceivesResponseForRoomDelete() {

        response=given().spec(spec)
                .header("Authorization","Bearer "+ generateToken())
                .contentType(ContentType.JSON)
                .when()
                .delete("/{1}/{2}/{3}");

        System.out.println("response.getStatusCode() = " + response.getStatusCode());

    }


    @And("AY User verify API records for room delete")
    public void ayUserVerifyAPIRecordsForRoomDelete() {
       Assert.assertEquals(response.getStatusCode(),204);
    }
}
