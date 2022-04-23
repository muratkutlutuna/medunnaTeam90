package stepDefinitions.dbStepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import utilities.DBUtils;
import utilities.DatabaseUtility;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class US027 {

    @Given("FY Admin connects to the database")
    public void fy_admin_connects_to_the_database() {
        DBUtils.createConnection();
    }

    @And("FY Admin creates a new message data with these values {string}")
    public void fyAdminCreatesANewMessageDataWithTheseValues(String messageTable) {

        String myQuery= " INSERT INTO cmessage (id,name,email,subject,message) VALUES ("+messageTable+"); ";

    }


    @And("FY Admin reads all of the {string} column data from {string} table")
    public void fyAdminReadsAllOfTheColumnDataFromTable(String messageColumn, String messageTable) throws SQLException {
        String myQuery= " select " +messageColumn+ " from " + messageTable;
        DBUtils.executeQuery(myQuery);

        List<Object> allData=new ArrayList<>();
        while (DBUtils.getResultset().next()){
            Object eachColumnData=DBUtils.getResultset().getObject(messageColumn);
            System.out.println(eachColumnData);
            allData.add(eachColumnData);
        }
        System.out.println("allData = " + allData);
        Assert.assertTrue(allData.contains("databasede mesaj yazdirma"));
    }


    List<Object> Id;
    List<Object> Name;
    List<Object> Email;
    List<Object> Subject;
    List<Object> Message;

    @And("FY Admin reads all of the {string} and {string} and {string} and {string} and {string} and {string} column data")
    public void fyAdminReadsAllOfTheAndAndAndAndAndColumnDataFromTable(String query, String id, String name, String email, String subject, String message) {
        Id=DBUtils.getColumnData(query,id);
        System.out.println("Id = " + Id);
        Name=DBUtils.getColumnData(query,name);
        Email=DBUtils.getColumnData(query,email);
        Subject=DBUtils.getColumnData(query,subject);
        Message=DBUtils.getColumnData(query,message);
        System.out.println("Name = " + Name);
        System.out.println("Email = " + Email);
        System.out.println("Subject = " + Subject);
        System.out.println("Message = " + Message);


    }
    @Then("FY Admin verifies the creation is successfull using DB")
    public void fy_admin_verifies_the_creation_is_successfull_using_db() throws SQLException {
        for ( Object w : Id    ) {
            if (w.toString().contains("77100")){
                Assert.assertTrue(w.toString().contains("77100"));
            }
        }

        Assert.assertTrue("Name is not found",Name.contains("Taner Baba"));
        Assert.assertTrue("Email is not found",Email.contains("tbaba@baba.com"));
        Assert.assertTrue("Subject is not found",Subject.contains("baba"));
        Assert.assertTrue("Message is not found",Message.contains("databasede mesaj yazdirma"));

    }

}
