package stepDefinitions.apiStepDefinitions;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;
import org.junit.Test;
import pojos.Patient;

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
import static io.restassured.RestAssured.given;
import static utilities.Authentication.generateToken;

public class US019 {
        RequestSpecification specMed;

        @Test
        public void testMed01() throws JsonProcessingException {
            specMed=new RequestSpecBuilder().
                    setBaseUri("https://www.medunna.com").
                    build();

            specMed.pathParams("param1","api","param2","staff","param3","43600");
            Staff expectedStaff=new Staff("Melinda","Staff","01/01/2001","100-200-3000","Male","A+","1232 Sandia ave. Fremont","melindapt@gmail.com","Melinda Patient");

            Response response=given().contentType(ContentType.JSON)
                    .spec(specMed)
                    .header("Authorization","Bearer "+generateToken())
                    .when().get("/{param1}/{param2}/{param3}");
            response.prettyPrint();

            response.then().statusCode(200);
            ObjectMapper obj=new ObjectMapper();
            Staff actualStaff=obj.readValue(response.asString(), Staff.class);
            System.out.println("actualStaff = " + actualStaff);

            Assert.assertEquals(expectedStaff.getFirstName(),actualStaff.getFirstName());
        }
    }


