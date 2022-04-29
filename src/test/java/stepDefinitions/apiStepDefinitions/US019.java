package stepDefinitions.apiStepDefinitions;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;
import org.junit.Test;
import pojos.Patient;

import static hooks.Hooks.spec;
import static io.restassured.RestAssured.given;
import static utilities.Authentication.generateToken;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;
import org.junit.Test;
import pojos.*;
import utilities.ConfigurationReader;

import static io.restassured.RestAssured.given;
import static utilities.Authentication.generateToken;

public class US019 {
        static RequestSpecification specMed;
        static Staff expectedStaff;
        static Response response;
        static Staff actualStaff;

    public static void main(String[] args) throws JsonProcessingException {

        specMed=new RequestSpecBuilder().
                setBaseUri(ConfigurationReader.getProperty("medunnaUrl")).
                build();

        specMed.pathParams("param1","api","param2","staff","param3","91134");

        expectedStaff=new Staff("Mehlika","Staff","2022-04-28T07:00:00Z","100-200-3000","FEMALE","Apositive","1232 Sandia ave. Fremont","staffmehlika@mail.com","StaffMehlika");

        System.out.println("expectedStaff = " + expectedStaff);

        response=given().contentType(ContentType.JSON)
                .spec(specMed)
                .header("Authorization","Bearer "+generateToken())
                .when().get("/{param1}/{param2}/{param3}");

        response.prettyPrint();

        response.then().statusCode(200);
        ObjectMapper obj=new ObjectMapper();
        actualStaff=obj.readValue(response.asString(), Staff.class);
        System.out.println("actualStaff = " + actualStaff);

        Assert.assertEquals(expectedStaff.getFirstName(),actualStaff.getFirstName());
        Assert.assertEquals(expectedStaff.getLastName(),actualStaff.getLastName());
        Assert.assertEquals(expectedStaff.getBirthDate(),actualStaff.getBirthDate());
        Assert.assertEquals(expectedStaff.getGender(),actualStaff.getGender());
        Assert.assertEquals(expectedStaff.getBloodGroup(),actualStaff.getBloodGroup());
        Assert.assertEquals(expectedStaff.getAdress(),actualStaff.getAdress());
        Assert.assertEquals(expectedStaff.getDescription(),actualStaff.getDescription());

    }

    @Given("mbApi Sign in as an Admin and set the path params for staff")
    public void mb_api_sign_in_as_an_admin_and_set_the_path_params_for_staff() {
        specMed=new RequestSpecBuilder().
                setBaseUri(ConfigurationReader.getProperty("medunnaUrl")).
                build();
        specMed.pathParams("param1","api","param2","staff");
    }

    @Given("mbApi Enter expected data for staff")
    public void mb_api_enter_expected_data_for_staff() {
        expectedStaff.setFirstName("PostMehlika");
        expectedStaff.setLastName("PostStaff");
        expectedStaff.setPhone("111-222-1501");
        expectedStaff.setAdress("Yeni adres; San Francisco");
        expectedStaff.setDescription("Post Description");
        // response.prettyPrint();
    }

    @Given("mbApi End request and receives response for staff")
    public void mb_api_end_request_and_receives_response_for_staff() {

        response = given().spec(spec).contentType(ContentType.JSON)
                .body(expectedStaff)
                .when()
                .post("/{param1}/{param2}");
        System.out.println("actual " +expectedStaff);
        response.prettyPrint();
    }



}


