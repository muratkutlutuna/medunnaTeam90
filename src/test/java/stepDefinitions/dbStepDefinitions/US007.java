package stepDefinitions.dbStepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pojos.Messages;
import utilities.ConfigurationReader;
import utilities.DBUtils;
import utilities.DatabaseUtility;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import static utilities.ReadTxt.getDateIDs;
import static utilities.WriteToTxt.saveAppointmentDataBase;


public class US007 {

    @Given("AGuser creates a connection with DB")
    public void a_guser_creates_a_connection_with_db() {
        DBUtils.createConnection();

    }
    @Given("AGuser gets the {string} from {string} table")
    public void a_guser_gets_the_from_table(String column, String table) {
        String myDynamicQuery = "Select " + column + " from " + table;
        DBUtils.executeQuery(myDynamicQuery);
    }
    @Given("AGuser read all of the {string} column data")
    public void a_guser_read_all_of_the_column_data(String column) {
        // while (DBUtils.getResultset().next()){
      //      Object eachColumnData = DBUtils.getResultset().getObject(column);
     //       System.out.println(eachColumnData);
    }
    @Given("AGuser verify {string} table   {string} column contains {string}")
    public void a_guser_verify_table_column_contains(String table, String column, String data) {
        List<Object> allColumnData = DBUtils.getColumnData("Select * from appointment", "start_date");
        System.out.println(allColumnData);

        List<Object> expectedDta = new ArrayList<>();
        expectedDta.add(data);

        Assert.assertTrue(allColumnData.containsAll(expectedDta));

    }
    @Then("AGuser close DB connection")
    public void a_guser_close_db_connection() {
        DBUtils.closeConnection();
    }


}
