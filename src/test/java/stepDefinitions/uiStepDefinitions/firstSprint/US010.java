package stepDefinitions.uiStepDefinitions.firstSprint;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.SezginPage;
import utilities.Driver;

import java.io.IOException;
import java.util.List;

import static stepDefinitions.uiStepDefinitions.firstSprint.US011.getScreenshot;

public class US010 {
    SezginPage sezginPage=new SezginPage();



    @And("S user asserts the visibility of the appointment table")
    public void userAssertsTheVisibilityOfTheAppointmentTable() throws IOException, InterruptedException {
        Thread.sleep(7000);
        getScreenshot("appointment table");
    }

    @Then("S user asserts the visibility of time slot_from")
    public void s_user_asserts_the_visibility_of_time_slot_from() {
        Driver.waitForVisibility(sezginPage.timeSlotFrom,5);
        sezginPage.timeSlotFrom.isDisplayed();

    }
    @Then("S user asserts the visibility of time slot_to")
    public void s_user_asserts_the_visibility_of_time_slot_to() {
Driver.waitForVisibility(sezginPage.timeSlotTo,5);
sezginPage.timeSlotTo.isDisplayed();
    }


    @Then("S user asserts the id of the patient")
    public void s_user_asserts_the_id_of_the_patient() throws InterruptedException {
    String expectedId="49681";
   Thread.sleep(8000);
   String rowData= sezginPage.satirYazdir().getText();
   Assert.assertTrue(rowData.contains(expectedId));

    }
    @Then("S user asserts start date of the appointment")
    public void s_user_asserts_start_date_of_the_appointment() {
        String expectedStartDate= "04/04/22 02:00";
        String rowData= sezginPage.satirYazdir().getText();
        Assert.assertTrue(rowData.contains(expectedStartDate));

    }
    @Then("S user asserts end date of the appointment")
    public void s_user_asserts_end_date_of_the_appointment() {
        String expectedEndDate= "04/04/22 03:00";
        String rowData= sezginPage.satirYazdir().getText();
        Assert.assertTrue(rowData.contains(expectedEndDate));
    }
    @Then("S user asserts the status of the appointment")
    public void s_user_asserts_the_status_of_the_appointment() {
        String expectedStatus="UNAPPROVED";
        String rowData= sezginPage.satirYazdir().getText();
        Assert.assertTrue(rowData.contains(expectedStatus));
    }


}
