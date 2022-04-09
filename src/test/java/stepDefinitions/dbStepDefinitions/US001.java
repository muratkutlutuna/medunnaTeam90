package stepDefinitions.dbStepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utilities.DBUtils;

import java.util.HashMap;
import java.util.Map;

import static utilities.WriteToTxt.saveRegistrantDataDB;

public class US001 {
    Map<String, Object> registrantMap = new HashMap<String, Object>();

    @Given("MKT user creates a connection with db")
    public void mkt_user_creates_a_connection_with_db() {
        DBUtils.createConnection();
    }

    @Given("MKT user sends the query to db and gets the user data with ssn number {string}")
    public void mkt_user_sends_the_query_to_db_and_gets_the_user_data_with_ssn_number(String ssn) {
        registrantMap.putAll(DBUtils.getRowMap("select * from jhi_user where ssn='" + ssn + "'"));
        System.out.println("registrantMap = " + registrantMap);
    }

    @Then("MKT user saves the db records to correspondent files")
    public void mkt_user_saves_the_db_records_to_correspondent_files() {
        saveRegistrantDataDB(registrantMap);
    }


    @Then("MKT user validates db registrant data {string}, {string}, {string}, {string}, {string}")
    public void mktUserValidatesDbRegistrantData(String firstName, String lastName, String login, String email, String password) {
        Map<String, Object>expectedData = new HashMap<String, Object>();
        expectedData.put("firstName", firstName);
        expectedData.put("lastName", lastName);
        expectedData.put("login", login);
        expectedData.put("email", email);
        expectedData.put("password", password);
        Assert.assertEquals(expectedData, registrantMap);
    }
}
