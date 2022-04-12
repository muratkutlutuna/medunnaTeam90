package stepDefinitions.apiStepDefinitions;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.response.Response;
import org.junit.Assert;
import pojos.Appointment;
import utilities.ConfigurationReader;

import static hooks.Hooks.spec;
import static io.restassured.RestAssured.given;
import static utilities.Authentication.generateToken;
import static utilities.WriteToTxt.saveAppointmentData;


public class US007 {
    static Faker faker = new Faker();
    static Response response;
    static Appointment appointment=new Appointment();
    public static void main(String[] args) throws JsonProcessingException {
        spec = new RequestSpecBuilder().setBaseUri(ConfigurationReader.getProperty("medunnaUrl")).build();
        spec.pathParams("1", "api", "2", "appointments");
        String FirstName = faker.name().firstName();
        String LastName=faker.name().lastName();
        String SSN=faker.idNumber().ssnValid();
        String Email =faker.internet().emailAddress();
        String Phone = "8572659314";
        String Date = "11.11.2022";
        appointment.setFirstName(FirstName);
        appointment.setLastName(LastName);
        appointment.setSsn(SSN);
        appointment.setEmail(Email);
        appointment.setPhone(Phone);
        appointment.setStartDate(Date);
        response = given().spec(spec).header("Authorization","Bearer "+generateToken())
                .contentType(ContentType.JSON)
                .body(appointment)
                .when()
                .get("/{1}/{2}");
        saveAppointmentData(appointment);
        response.prettyPrint();
        response.then().statusCode(200);
        ObjectMapper obj = new ObjectMapper();
        Appointment actualAppointment = obj.readValue(response.asString(),Appointment.class);
        System.out.println("Actual Data: " + actualAppointment);
        Assert.assertEquals(appointment.getFirstName(),actualAppointment.getFirstName());
        Assert.assertEquals(appointment.getLastName(),actualAppointment.getLastName());
        Assert.assertEquals(appointment.getSsn(),actualAppointment.getSsn());
        Assert.assertEquals(appointment.getEmail(),actualAppointment.getEmail());
        Assert.assertEquals(appointment.getPhone(),actualAppointment.getPhone());
        Assert.assertEquals(appointment.getStartDate(),actualAppointment.getStartDate());

    }

    @Given("AG user set path params")
    public void ag_user_set_path_params() {
        spec.pathParams("1", "api", "2", "appointments");
    }
    @Given("AG user enter expected data {string} {string} {string} {string} {string} {string}")
    public void ag_user_enter_expected_data(String FirstName, String LastName, String SSN, String Email, String Phone, String Date) {
         FirstName = faker.name().firstName();
         LastName=faker.name().lastName();
         SSN=faker.idNumber().ssnValid();
         Email =faker.internet().emailAddress();
         Phone = "8572659314";
         Date = "11.11.2022";

        appointment.setFirstName(FirstName);
        appointment.setLastName(LastName);
        appointment.setSsn(SSN);
        appointment.setEmail(Email);
        appointment.setPhone(Phone);
        appointment.setStartDate(Date);

    }
    @Given("AG user send request and get response")
    public void ag_user_send_request_and_get_response() {
        response = given().spec(spec).contentType(ContentType.JSON)
                .body(appointment)
                .when()
                .post("/{1}/{2}");
    }
    @Then("AG user save API data to file")
    public void ag_user_save_apı_data_to_file() {
        try {
            response.then().statusCode(201);
            saveAppointmentData(appointment);
            System.out.println(appointment.toString());
        } catch (Exception e) {

        }

    }
    @Then("AG user verify  API data")
    public void ag_user_verify_apı_data() throws JsonProcessingException {
        response.then().statusCode(201);
        response.prettyPrint();
        ObjectMapper obj = new ObjectMapper();
        Appointment actualAppointment = obj.readValue(response.asString(),Appointment.class);
        System.out.println("Actual Data: " + actualAppointment);
        Assert.assertEquals(appointment.getFirstName(),actualAppointment.getFirstName());
        Assert.assertEquals(appointment.getLastName(),actualAppointment.getLastName());
        Assert.assertEquals(appointment.getSsn(),actualAppointment.getSsn());
        Assert.assertEquals(appointment.getEmail(),actualAppointment.getEmail());
        Assert.assertEquals(appointment.getPhone(),actualAppointment.getPhone());
        Assert.assertEquals(appointment.getStartDate(),actualAppointment.getStartDate());

    }


}
