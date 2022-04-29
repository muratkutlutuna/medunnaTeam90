package stepDefinitions.apiStepDefinitions;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import pojos.Account;
import pojos.Physician;
import pojos.Registrant;
import utilities.ConfigurationReader;

import static hooks.Hooks.spec;
import static io.restassured.RestAssured.given;
import static utilities.Authentication.generateToken;
import static utilities.WriteToTxt.saveRegistrantData;

public class US018 {

    static Response response;
    static Physician physician = new Physician();

    public static void main(String[] args) throws JsonProcessingException {
        spec = new RequestSpecBuilder().setBaseUri(ConfigurationReader.getProperty("medunnaUrl")).build();
        spec.pathParams("1", "api", "2", "physicians","3","2051");
       // https://www.medunna.com/api/physicians/2051

        response = given().spec(spec)
                .header("Authorization","Bearer "+generateToken())
                .contentType(ContentType.JSON)
                .when()
                .get("/{1}/{2}/{3}");
        response.prettyPrint();
        response.then().statusCode(200);
        ObjectMapper obj = new ObjectMapper();
        Physician actualPhisician = obj.readValue(response.asString(),Physician.class);
        System.out.println("Actual Data: " + actualPhisician);
       Assert.assertEquals("Cemile", actualPhisician.getFirstName());
       Assert.assertEquals("Turkmen", actualPhisician.getLastName());
       Assert.assertEquals(2051,actualPhisician.getId());
       Assert.assertEquals("NUCLEAR_MEDICINE",actualPhisician.getSpeciality());
    }

    @Given("C User set the path params for phyisician")
public void c_user_set_the_path_params_for_phyisician() {
       spec = new RequestSpecBuilder().setBaseUri(ConfigurationReader.getProperty("medunnaUrl")).build();
        spec.pathParams("1", "api", "2", "physicians","3","2051");

}
@Given("C user enters expected data for phyisician")
public void c_user_enters_expected_data_for_phyisician() {
    response = given().spec(spec)
                .header("Authorization","Bearer "+generateToken())
                .contentType(ContentType.JSON)
                .when()
                .get("/{1}/{2}/{3}");
}
@Then("C user verify API records for phyisician")
public void c_user_verify_api_records_for_phyisician() throws JsonProcessingException {
         response.prettyPrint();
        response.then().statusCode(200);
        ObjectMapper obj = new ObjectMapper();
        Physician actualPhisician = obj.readValue(response.asString(),Physician.class);
       Assert.assertEquals("Cemile", actualPhisician.getFirstName());
       Assert.assertEquals("Turkmen", actualPhisician.getLastName());
       Assert.assertEquals(2051,actualPhisician.getId());
       Assert.assertEquals("NUCLEAR_MEDICINE",actualPhisician.getSpeciality());
}

}
