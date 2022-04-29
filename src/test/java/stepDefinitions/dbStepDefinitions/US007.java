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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static utilities.ReadTxt.getDateIDs;
import static utilities.WriteToTxt.saveAppointmentDataBase;


public class US007 {
    public static void main(String[] args) {
        DBUtils.createConnection();
        String query = "select * from appointment";
        List<Object> startDate = DBUtils.getColumnData(query, "start_date");

        System.out.println("startDate = " + startDate);

    }

    static List<Object>startDate=new ArrayList<>();
    @Given("AGuser creates a connection with DB")
    public void a_guser_creates_a_connection_with_db() {
        DBUtils.createConnection();

    }
    @Given("AGuser gets the {string} from {string} table")
    public void a_guser_gets_the_from_table(String column, String table) {
        String myDynamicQuery = "Select * from " + table;
        startDate = DBUtils.getColumnData(myDynamicQuery, column);
        DBUtils.executeQuery(myDynamicQuery);
    }

    @Given("AGuser verify {string} table   {string} column contains {string}")
    public void a_guser_verify_table_column_contains(String table, String column, String data) {
        boolean flag = false;
        for (Object w:startDate) {
            if (w.toString().equals(data)) {
                flag=true;
                break;
            }
        }
        System.out.println(startDate.toString());

        Assert.assertTrue(flag);

    }
    @Then("AGuser close DB connection")
    public void a_guser_close_db_connection() {
        DBUtils.closeConnection();
    }


}
