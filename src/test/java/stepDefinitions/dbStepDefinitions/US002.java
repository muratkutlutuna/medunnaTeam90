package stepDefinitions.dbStepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utilities.DBUtils;

import java.util.HashMap;
import java.util.Map;

public class US002 {
    Map<String,Object>registrantMap=new HashMap<>();

    @Given("RT user creates a connection with db")
    public void rt_user_creates_a_connection_with_db() {
        DBUtils.createConnection();
    }

    @Given("RT user sends the query to db and gets the user data with login {string}")
    public void rt_user_sends_the_query_to_db_and_gets_the_user_data_with_login(String login) {
     String query="select * from jhi_user where login=\'"+login+"\'";
     registrantMap.putAll(DBUtils.getRowMap(query));
        System.out.println("registrantMap = " + registrantMap);
    }

    @Then("RT validates db registrant data  {string}")
    public void rt_validates_db_registrant_data(String email) {
        Map<String,Object>expectedData=new HashMap<>();
        expectedData.put("email",email);
        Assert.assertTrue(registrantMap.entrySet().containsAll(expectedData.entrySet()));

    }

}
