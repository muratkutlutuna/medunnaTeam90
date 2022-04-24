package stepDefinitions.dbStepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utilities.DBUtils;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class US017 {

    @And("verify {string} table {string} column contains {string}")
    public void verifyTableColumnContains(String table, String column, String data) {
        List<Object> allColumnData = DBUtils.getColumnData("Select * from " + table, column);
        System.out.println(allColumnData);

        List<Object> expectedData = new ArrayList<>();
        expectedData.add(data);

        Assert.assertTrue(allColumnData.containsAll(expectedData));
    }


}