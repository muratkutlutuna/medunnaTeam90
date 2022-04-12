package stepDefinitions.apiStepDefinitions;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Test;
import pojos.Appointment_TC005;

import java.util.HashMap;

import static io.restassured.RestAssured.given;

public class US005  {
    RequestSpecification specMed;
    public static String tokenAl() {
        String url = "https://www.medunna.com";
        HashMap<String, String> requestBody = new HashMap<>();
        requestBody.put("username","Team90Admin");
        requestBody.put("password","Batch44+");
        System.out.println("requestBody = " + requestBody);
        Response response=given().accept(ContentType.JSON)  //contentType("application/json")
                .body(requestBody)  //.auth().//basic("admin","password");   // body icerisinde kullanici adi ve sifreyi gonderip izin istegi gondermis oluyorum.
                .when().post(url);        //post request kullanacagim, bodyye ihtiyac var
        response.prettyPrint();
        JsonPath jsonPath=response.jsonPath();
        String token=jsonPath.getString("token");
        System.out.println("token = " + token);
        return token;
    }

    @Test
    public void testMed01(){
        specMed=new RequestSpecBuilder().
                setBaseUri("https://www.medunna.com").
                build();

        specMed.pathParams("param1","api","param2","appointments");
        Appointment_TC005 expectedRequest=new Appointment_TC005("Melinda","Patient",100-20-3105,
                "melindapt@gmail.com",100-200-3000,2022-25-06);
//
//        expectedRequest.setFirstname("Melinda");
//        expectedRequest.setLastname("Patient");
//        expectedRequest.setSsn(100-20-3105);
//        expectedRequest.setEmail("melindapt@gmail.com");
//        expectedRequest.setPhone(100-200-3000);
//        expectedRequest.setDate(2022-25-06);

        Response response=given().contentType(ContentType.JSON)
                .spec(specMed)
                .auth().basic("Team90Admin","Batch44+")
                .header("Authorization","Bearer"+tokenAl())
                .body(expectedRequest)
                .when().get("/{param1}/{param2}");
        response.prettyPrint();


    }
}
