package stepDefinitions.dbStepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utilities.DatabaseUtility;

import java.util.ArrayList;
import java.util.List;

public class US016 {

    List<Object> allDataBaseDates;
    @Given("AY user creates a connection with DB using {string} and {string} , {string}")
    public void ayUserCreatesAConnectionWithDBUsingAnd(String url, String username, String password) {
        DatabaseUtility.createConnection(url,username,password);
    }

    @Given("AY user sends the query to DB and gets the room data {string} and {string}")
    public void ayUserSendsTheQueryToDBAndGetsTheRoomDataAnd(String query, String columnName) {
        allDataBaseDates=DatabaseUtility.getColumnData(query,columnName);
        System.out.println("allDataBaseDates = " + allDataBaseDates);
    }

    @And("AY user saves DB records to correspondent files")
    public void ayUserSavesDBRecordsToCorrespondentFiles() {

    }

    @Then("AY user validates DB Room data")
    public void ayUserValidatesDBRoomData() {
        List<String>expectedDataId=new ArrayList<>();
        expectedDataId.add("71771");
        expectedDataId.add("35703");
        expectedDataId.add("3752");



    }
}
