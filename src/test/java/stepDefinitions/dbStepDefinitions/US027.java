package stepDefinitions.dbStepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.ui.Select;
import utilities.DBUtils;
import utilities.DatabaseUtility;

import java.sql.SQLException;

public class US027 {

    @Given("FY Admin connects to the database")
    public void fy_admin_connects_to_the_database() {
        DBUtils.createConnection();
    }

    @And("FY Admin creates a new message data with these values {string}")
    public void fyAdminCreatesANewMessageDataWithTheseValues(String messageTable) {

        String myQuery= " INSERT INTO cmessage (id,name,email,subject,message) VALUES ("+messageTable+"); ";
       // DBUtils.executeQuery(myQuery);
    }

    @Then("FY Admin verifies the creation is successfull using DB")
    public void fy_admin_verifies_the_creation_is_successfull_using_db() throws SQLException {


    }


    @And("FY Admin reads all of the {string} column data from {int} row")
    public void fyAdminReadsAllOfTheColumnDataFromRow(String messageColumn, int rowNumber) throws SQLException {
       Object result= DatabaseUtility.getCellValuewithRowsAndCells("Select * from cmessage;",100,5);
        System.out.println("result = " + result);
//        DBUtils.getResultset().absolute(rowNumber);
//        Object column =DBUtils.getResultset().getObject(messageColumn);
//        System.out.println("column = " + column);
//
    }
}
