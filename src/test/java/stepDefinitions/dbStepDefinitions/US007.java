package stepDefinitions.dbStepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pojos.Messages;
import utilities.ConfigurationReader;
import utilities.DatabaseUtility;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import static utilities.ReadTxt.getDateIDs;
import static utilities.WriteToTxt.saveAppointmentDataBase;


public class US007 {

    List< Object> allDBDates;
    @Given("user creates a connection with DB using {string} and {string} , {string}")
    public void user_creates_a_connection_with_db_using_and(String url, String username, String password) {
        DatabaseUtility.createConnection(url, username,password);
    }
    @Given("user sends the query to DB and gets the column data {string} and {string}")
    public void user_sends_the_query_to_db_and_gets_the_column_data_and(String query, String columnName) {
        allDBDates=DatabaseUtility.getColumnData(query,columnName);
        System.out.println(allDBDates);
    }
    @Given("user saves DB records to correspondent files")
    public void user_saves_db_records_to_correspondent_files() {
        saveAppointmentDataBase(allDBDates);
    }

    @Then("user validates DB Appointment data")
    public void user_validates_db_appointment_data() {
        List<String> expectedDateIDs = new ArrayList<>();
        expectedDateIDs.add("2021-12-22 17:00:00");
        expectedDateIDs.add("2021-12-25 00:00:00");
        expectedDateIDs.add("2022-01-07 06:00:00");

        List<String> actualData = getDateIDs();
        Assert.assertTrue(actualData.containsAll(expectedDateIDs));


    }



}
