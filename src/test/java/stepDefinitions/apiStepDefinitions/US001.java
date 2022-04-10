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
import pojos.Account;
import pojos.Registrant;
import utilities.ConfigurationReader;

import static hooks.Hooks.spec;
import static io.restassured.RestAssured.given;
import static utilities.Authentication.generateToken;
import static utilities.WriteToTxt.saveRegistrantData;

public class US001 {
    static Faker faker = new Faker();
    static Response response;
    static Registrant registrant = new Registrant();

    public static void main(String[] args) throws JsonProcessingException {
        spec = new RequestSpecBuilder().setBaseUri(ConfigurationReader.getProperty("medunnaUrl")).build();
        spec.pathParams("1", "api", "2", "register");
        String firstname = faker.name().firstName();
        String lastname=faker.name().lastName();
        String SSN=faker.idNumber().ssnValid();
        registrant.setFirstName(firstname);
        registrant.setLastName(lastname);
        registrant.setSsn(SSN);
        registrant.setLogin(firstname+lastname);
        registrant.setPassword(SSN+firstname);
        registrant.setEmail(faker.internet().emailAddress(firstname+lastname));
        response = given().spec(spec)
                .contentType(ContentType.JSON)
                .body(registrant)
                .when()
                .post("/{1}/{2}");
        saveRegistrantData(registrant);
        response.prettyPrint();
        response.then().statusCode(201);
        ObjectMapper obj = new ObjectMapper();
        Account actualRegistrant = obj.readValue(response.asString(),Account.class);
        System.out.println("Actual Data: " + actualRegistrant);
        Assert.assertEquals(registrant.getFirstName(),actualRegistrant.getFirstName());
        Assert.assertEquals(registrant.getLastName(),actualRegistrant.getLastName());
        Assert.assertEquals(registrant.getSsn(),actualRegistrant.getSsn());

    }

    @Given("MKT User set the path params for register")
    public void mkt_user_set_the_path_params_for_register() {
        spec.pathParams("1", "api", "2", "register");

    }
    @Given("MKT user enters expected data for register")
    public void mkt_user_enters_expected_data_for_register() {
        registrant.setSsn(faker.idNumber().ssnValid());
        registrant.setFirstName(faker.name().firstName()+"Team90");
        registrant.setLastName(faker.name().lastName()+"Team90");
        registrant.setLogin(registrant.getFirstName()+registrant.getLastName()+"Team90");
        registrant.setEmail(faker.internet().safeEmailAddress(registrant.getFirstName()+registrant.getLastName()));
        registrant.setPassword(faker.internet().password(8,10,true,true,true)+"Team90");
    }
    @Given("MKT user sends request and receives response for register")
    public void mkt_user_sends_request_and_receives_response_for_register() {
        response = given().spec(spec).contentType(ContentType.JSON)
                .body(registrant)
                .when()
                .post("/{1}/{2}");
    }
    @Then("MKT user save all API information for register")
    public void mkt_user_save_all_api_information_for_register() {
        try {
            response.then().statusCode(201);
            saveRegistrantData(registrant);
            System.out.println(registrant.toString());
        } catch (Exception e) {

        }

    }
    @Then("MKT user verify API records for register")
    public void mkt_user_verify_api_records_for_register() throws JsonProcessingException {
        response.then().statusCode(201);
        response.prettyPrint();
        ObjectMapper obj = new ObjectMapper();
        Registrant actualRegistrant = obj.readValue(response.asString(),Registrant.class);
        System.out.println("Actual Data: " + actualRegistrant);
        Assert.assertEquals(registrant.getFirstName(),actualRegistrant.getFirstName());
        Assert.assertEquals(registrant.getLastName(),actualRegistrant.getLastName());
        Assert.assertEquals(registrant.getSsn(),actualRegistrant.getSsn());

    }

    @Given("MKT there are no swagger documantation for register")
    public void mktThereAreNoSwaggerDocumantetionForRegister() {
        System.out.println("MKT there are no swagger documantetion for register");
    }
}
