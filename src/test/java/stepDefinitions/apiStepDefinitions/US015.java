package stepDefinitions.apiStepDefinitions;

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

public class US015 {
        RequestSpecification specMed;

        @Test
        public void testMed01() throws JsonProcessingException {
            specMed=new RequestSpecBuilder().
                    setBaseUri("https://www.medunna.com").
                    build();

            specMed.pathParams("param1","api","param2","patients","param3","1051"); //50654
            Patient expectedPatient=new Patient("","",
                                1051,"Melinda","Patient","01/01/2001","100-200-3000","Male","A+","1232 Sandia ave. Fremont","melindapt@gmail.com","Melinda Patient");

            Response response=given().contentType(ContentType.JSON)
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
    }
