package stepDefinitions.dbStepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utilities.DBUtils;

import java.util.HashMap;
import java.util.Map;

import static utilities.ReadText.readAllRegistrantInDBDataMap;
import static utilities.WriteToTxt.saveRegistrantDataDB;

public class US001 {
    Map<String, Object> registrantMap = new HashMap<String, Object>();

    @Given("MKT user creates a connection with db")
    public void mkt_user_creates_a_connection_with_db() {
        DBUtils.createConnection();
    }

    @Given("MKT user sends the query to db and gets the user data with ssn number {string}")
    public void mkt_user_sends_the_query_to_db_and_gets_the_user_data_with_ssn_number(String ssn) {
        String query = "select * from jhi_user where ssn=\'" + ssn + "\'";
        registrantMap.putAll(DBUtils.getRowMap(query));
        System.out.println("registrantMap = " + registrantMap);
    }


    @Then("MKT validates db registrant data  {string}")
    public void mktValidatesDbRegistrantData(String ssn) {
        Map<String, Object>expectedData = new HashMap<String, Object>();
        expectedData.put("ssn", ssn);
        try {
            readAllRegistrantInDBDataMap(expectedData);
            saveRegistrantDataDB(registrantMap);
        }catch (Exception e) {
            System.out.println("data is already in the list");
        }
        Assert.assertTrue(registrantMap.entrySet().containsAll(expectedData.entrySet()));

    }

    @Then("MKT user validates db registrant data {string}, {string}, {string}, {string} is wrong")
    public void mktUserValidatesDbRegistrantDataIsWrong(String firstName, String lastName, String login, String email) {
        Map<String, Object>expectedData = new HashMap<String, Object>();
        expectedData.put("first_name", firstName);
        expectedData.put("last_name", lastName);
        expectedData.put("login", login);
        expectedData.put("email", email);
        Assert.assertFalse(registrantMap.entrySet().containsAll(expectedData.entrySet()));
    }
}
