package stepDefinitions.apiStepDefinitions;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import lombok.*;
import org.junit.Assert;
import org.junit.Test;
import pojos.*;
import utilities.ConfigurationReader;

import static hooks.Hooks.spec;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.preemptive;
import static utilities.Authentication.generateToken;
import static utilities.WriteToTxt.saveRegistrantData;

public class US015 {
        static RequestSpecification specMed;
        static Response response;
        static Patient expectedPatient;

        public static void main(String[] args) throws JsonProcessingException {

            specMed=new RequestSpecBuilder().
                    setBaseUri(ConfigurationReader.getProperty("medunnaUrl")).
                    build();

            specMed.pathParams("param1","api","param2","patients","param3","91930");

            expectedPatient=new Patient("","",91930
                                ,"Mehlika","Patient","2022-04-28T07:00:00Z","100-200-1501","FEMALE","Bpositive","1232 Sandia ave. Fremont","mehlikapatient@mail.com","MehlikaPatient",null,null,null);

            System.out.println("expectedPatient = " + expectedPatient);

                        response=given().contentType(ContentType.JSON)
                    .spec(specMed)
                    .header("Authorization","Bearer "+generateToken())
                    .when().get("/{param1}/{param2}/{param3}");

            response.prettyPrint();

            response.then().statusCode(200);
            ObjectMapper obj=new ObjectMapper();
            Patient actualPatient=obj.readValue(response.asString(), Patient.class);
            System.out.println("actualPatient = " + actualPatient);
            Assert.assertEquals(expectedPatient.getId(),actualPatient.getId());
            Assert.assertEquals(expectedPatient.getFirstName(),actualPatient.getFirstName());
            Assert.assertEquals(expectedPatient.getLastName(),actualPatient.getLastName());
            Assert.assertEquals(expectedPatient.getBirthDate(),actualPatient.getBirthDate());
            Assert.assertEquals(expectedPatient.getPhone(),actualPatient.getPhone());
            Assert.assertEquals(expectedPatient.getGender(),actualPatient.getGender());
            Assert.assertEquals(expectedPatient.getBloodGroup(),actualPatient.getBloodGroup());
            Assert.assertEquals(expectedPatient.getAdress(),actualPatient.getAdress());
            Assert.assertEquals(expectedPatient.getEmail(),actualPatient.getEmail());
            Assert.assertEquals(expectedPatient.getDescription(),actualPatient.getDescription());

        }

    //////  TC01506
    @Given("mbApi Sign in as an Admin and set the path params for register")
    public void mb_api_sign_in_as_an_admin_and_set_the_path_params_for_register() {
        specMed=new RequestSpecBuilder().
                setBaseUri(ConfigurationReader.getProperty("medunnaUrl")).
                build();
        specMed.pathParams("param1","api","param2","patients");
    }

    @Given("mbApi Enter expected data for patient")
    public void mb_api_enter_expected_data_for_patient() {
        expectedPatient.setFirstName("PostMehlika");
        expectedPatient.setLastName("PostPatient");
        expectedPatient.setPhone("111-222-1501");
        expectedPatient.setAdress("Yeni adres; San Francisco");
        expectedPatient.setEmail("PostMEhlika@mail.com");
        expectedPatient.setDescription("Post Description");
       // response.prettyPrint();
    }

    @Given("mbApi End request and receives response for register")
    public void mb_api_end_request_and_receives_response_for_register() {

        response = given().spec(spec).contentType(ContentType.JSON)
                .body(expectedPatient)
                .when()
                .post("/{param1}/{param2}");
        System.out.println("actual " +expectedPatient);
        response.prettyPrint();
    }

    @Given("mbApi Save all API information for register")
    public void mb_api_save_all_api_information_for_register() {
        try {
            response.then().statusCode(201);
            System.out.println(expectedPatient.toString());
        } catch (Exception e) {

        }
    }

    @Then("mbApi Verify API records for register")
    public void mb_api_verify_api_records_for_register() throws JsonProcessingException {
        response.then().statusCode(201);
        response.prettyPrint();

        ObjectMapper obj = new ObjectMapper();
        Patient actualPatient = obj.readValue(response.asString(),Patient.class);
        System.out.println("Actual Data: " + actualPatient);
        Assert.assertEquals(expectedPatient.getFirstName(),actualPatient.getFirstName());
        Assert.assertEquals(expectedPatient.getLastName(),actualPatient.getLastName());
        Assert.assertEquals(expectedPatient.getEmail(),actualPatient.getEmail());
        Assert.assertEquals(expectedPatient.getDescription(),actualPatient.getDescription());
        Assert.assertEquals(expectedPatient.getAdress(),actualPatient.getAdress());
        Assert.assertEquals(expectedPatient.getGender(),actualPatient.getGender());
    }

    @Then("mbApi There are no swagger documantation for register")
    public void mb_api_there_are_no_swagger_documantation_for_register() {
        System.out.println("there are no swagger documantation for register");
    }
}

