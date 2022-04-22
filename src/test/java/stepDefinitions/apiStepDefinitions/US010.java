package stepDefinitions.apiStepDefinitions;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import pojos.Account;
import pojos.Appointment;
import utilities.ConfigurationReader;

import static hooks.Hooks.spec;
import static io.restassured.RestAssured.given;
import static stepDefinitions.apiStepDefinitions.US001.faker;
import static utilities.Authentication.generateToken;
import static utilities.WriteToTxt.saveAppointData;
import static utilities.WriteToTxt.saveRegistrantData;

public class US010 {
 static Appointment appointment= new Appointment();
 static Response response;
   static Appointment actualAppointment;
    public static void main(String[] args) throws JsonProcessingException {
        spec = new RequestSpecBuilder().setBaseUri(ConfigurationReader.getProperty("medunnaUrl")).build();
        spec.pathParams("1", "api", "2", "appointments", "3", "49681");

        response = given().spec(spec).header("Authorization", "Bearer "+ generateToken("doctorSez","Serdil26"))
                .contentType(ContentType.JSON)
                .when()
                .get("/{1}/{2}/{3}/");
        response.prettyPrint();
        response.then().statusCode(200);
        ObjectMapper obj = new ObjectMapper();
        Appointment actualAppointment = obj.readValue(response.asString(),Appointment.class);
        System.out.println("Actual Data: " + actualAppointment);
       Assert.assertEquals(49040, actualAppointment.getPatient().getId());
       Assert.assertEquals("2022-04-04T00:00:00Z", actualAppointment.getStartDate());
       Assert.assertEquals("2022-04-04T01:00:00Z", actualAppointment.getEndDate());
       Assert.assertEquals("PENDING",actualAppointment.getStatus());


    }
    @When("Doctor set Medunna base url with id {int}")
    public void doctorSetMedunnaBaseUrlWithId(int id) {
        spec.pathParams("1", "api", "2", "appointments", "3", id);
    }

    @When("Doctor send the GET request and GET the response")
    public void doctor_send_the_get_request_and_get_the_response() {
        response = given().spec(spec).header("Authorization", "Bearer "+ generateToken("doctorSez","Serdil26"))
                .contentType(ContentType.JSON)
                .when()
                .get("/{1}/{2}/{3}/");
        response.prettyPrint();

    }
    @When("Doctor deserialize data json to java")
    public void doctor_deserialize_data_json_to_java() throws JsonProcessingException {
        ObjectMapper obj = new ObjectMapper();
        actualAppointment = obj.readValue(response.asString(),Appointment.class);
        System.out.println("Actual Data: " + actualAppointment);
    }
    @When("Doctor saves the appointment data to correspondent files")
    public void doctor_saves_the_appointment_data_to_correspondent_files() {

        saveAppointData(actualAppointment);
    }



    @And("Doctor validates expected data with API {int}, {string},{string},{string}")
    public void doctorValidatesExpectedDataWithAPI(int patientId, String startDate, String endDate, String status) {
        Assert.assertEquals(patientId, actualAppointment.getPatient().getId());
        Assert.assertEquals(startDate, actualAppointment.getStartDate());
        Assert.assertEquals(endDate, actualAppointment.getEndDate());
        Assert.assertEquals(status,actualAppointment.getStatus());
    }
}
