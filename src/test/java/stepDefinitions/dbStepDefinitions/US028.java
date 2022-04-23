package stepDefinitions.dbStepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utilities.DBUtils;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class US028 {
    List<Object> allData;
    @And("FY Admin gets all of the {string} column data from {string} table")
    public void fyAdminGetsAllOfTheColumnDataFromTable(String columnName, String tableName) throws SQLException {
        String myQuery= " select " +columnName+ " from " + tableName;
        DBUtils.executeQuery(myQuery);

        allData=new ArrayList<>();
        while (DBUtils.getResultset().next()){
            Object eachColumnData=DBUtils.getResultset().getObject(columnName);
            System.out.println(eachColumnData);
            allData.add(eachColumnData);
        }
        System.out.println("allData = " + allData);

    }

    @Then("FY Admin verifies the country name successfully using DB")
    public void fyAdminVerifiesTheCountryNameSuccessfullyUsingDB() {
        Assert.assertTrue(allData.contains("Kingdom of Taner Baba"));
    }


}
