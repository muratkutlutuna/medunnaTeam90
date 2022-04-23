package stepDefinitions.apiStepDefinitions;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;
import org.junit.Test;
import pojos.Appointment;
import pojos.AppointmentAdminStaff;

import static io.restassured.RestAssured.given;
import static utilities.Authentication.generateToken;

public class US005  {

    RequestSpecification specMed;
//    public static String tokenAl() {
//        String url = "https://www.medunna.com";
//        HashMap<String, String> requestBody = new HashMap<>();
//        requestBody.put("username","Team90Admin");
//        requestBody.put("password","Batch44+");
//        System.out.println("requestBody = " + requestBody);
//        Response response=given().accept(ContentType.JSON)  //contentType("application/json")
//                .body(requestBody)  //.auth().//basic("admin","password");   // body icerisinde kullanici adi ve sifreyi gonderip izin istegi gondermis oluyorum.
//                .when().post(url);        //post request kullanacagim, bodyye ihtiyac var
//        response.prettyPrint();
//        JsonPath jsonPath=response.jsonPath();
//        String token=jsonPath.getString("token");
//        System.out.println("token = " + token);
//        return token;
//    }

    @Test
    public void testMed01() throws JsonProcessingException {
        specMed=new RequestSpecBuilder().
                setBaseUri("https://www.medunna.com/api").
                build();

        specMed.pathParams("param1","api","param2","appointments","param3","50236");
        AppointmentAdminStaff expectedRequest=new AppointmentAdminStaff("Melinda","Patient","100-20-3105",
                "melindapt@gmail.com","100-200-3000","2022-04-14T00:00:00Z");

        Response response=given().contentType(ContentType.JSON)
                .spec(specMed)
                .header("Authorization","Bearer "+generateToken())
                .when().get("/{param1}/{param2}/{param3}");
        response.prettyPrint();

        response.then().statusCode(200);
        ObjectMapper obj=new ObjectMapper();
        Appointment actualPatient=obj.readValue(response.asString(), Appointment.class);
        System.out.println("actualPatient = " + actualPatient);
        Assert.assertEquals(expectedRequest.getFirstName(),actualPatient.getPatient().getFirstName());
        Assert.assertEquals(expectedRequest.getLastName(),actualPatient.getPatient().getLastName());
        //Assert.assertEquals(expectedRequest.getSsn(),actualPatient.getPatient().getSsn());
        Assert.assertEquals(expectedRequest.getEmail(),actualPatient.getPatient().getEmail());
        Assert.assertEquals(expectedRequest.getPhone(),actualPatient.getPatient().getPhone());
        Assert.assertEquals(expectedRequest.getStartDate(),actualPatient.getStartDate());
    }
}
