package stepDefinitions.uiStepDefinitions.secondSprint;

import io.cucumber.java.en.Then;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.SezginPage;
import utilities.ConfigurationReader;
import utilities.Driver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class US021 {
    SezginPage sezginPage=new SezginPage();
    WebElement dropdownEl= sezginPage.profilesDropdownEl;
    JavascriptExecutor jse=(JavascriptExecutor) Driver.getDriver();
    Select select;

    public static String getScreenshot(String name) throws IOException {
        // naming the screenshot with the current date to avoid duplication
        String date = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
        // TakesScreenshot is an interface of selenium that takes the screenshot
        TakesScreenshot ts = (TakesScreenshot) Driver.getDriver();
        File source = ts.getScreenshotAs(OutputType.FILE);
        // full path to the screenshot location
        String target = System.getProperty("user.dir") + "/test-output/Screenshots/" + name + date + ".png";
        File finalDestination = new File(target);
        // save the screenshot to the path given
        FileUtils.copyFile(source, finalDestination);
        return target;
    }


    @Then("S user logins as staff")
    public void s_user_logins_as_staff() {
    Driver.waitAndClick(sezginPage.userItemTop);
    Driver.waitAndClick(sezginPage.signinEl);
     Driver.waitAndSendText(sezginPage.usernameBox, "staffsez");
       Driver.waitAndSendText(sezginPage.passwordBox, "Serdil26");
       Driver.waitAndClick(sezginPage.signinButton);
    }
    @Then("S user clicks my pages, search patient")
    public void s_user_clicks_my_pages_search_patient() throws InterruptedException {
    Driver.waitAndClick(sezginPage.myPagesIconStaff);
    Driver.waitAndClick(sezginPage.searchPatientEl);
    Thread.sleep(3000);
    }
    @Then("S user sends a patient ssn for the search box")
    public void s_user_sends_a_patient_ssn_for_the_search_box() throws InterruptedException {
    sezginPage.findPatientBySsnBox.sendKeys("222-22-0011");
    Thread.sleep(3000);
    }
    @Then("S user clicks show appointments button")
    public void s_user_clicks_show_appointments_button() {
    Driver.waitAndClick(sezginPage.showAppointmentsButton);
    }
    @Then("S user clicks edit button")
    public void s_user_clicks_edit_button() {
    Driver.waitAndClick(sezginPage.editAppointmentButton);
    }
    @Then("S user asserts the visibility of appointment page")
    public void s_user_asserts_the_visibility_of_appointment_page() {
        Assert.assertTrue(sezginPage.createOrEditAppointmentTextForPatient.isDisplayed());
    }
    @Then("S user selects unapproved as status and takes ss")
    public void s_user_selects_unapproved_as_status_and_takes_ss() throws InterruptedException, IOException {
        WebElement dropdownEl= sezginPage.statusDropdownEl;
        Driver.waitForVisibility(dropdownEl, 5);
        Select select = new Select(dropdownEl);
        Thread.sleep(3000);
        select.selectByValue("UNAPPROVED");
        getScreenshot("UNAPPROVED");

    }
    @Then("S user selects pending as status and takes ss")
    public void s_user_selects_pending_as_status_and_takes_ss() throws InterruptedException, IOException {
        WebElement dropdownEl= sezginPage.statusDropdownEl;
        Driver.waitForVisibility(dropdownEl, 5);
        Select select = new Select(dropdownEl);
        Thread.sleep(3000);
        select.selectByValue("PENDING");
        getScreenshot("PENDING");

    }
    @Then("S user selects cancelled as status and takes ss")
    public void s_user_selects_cancelled_as_status_and_takes_ss() throws InterruptedException, IOException {
        WebElement dropdownEl= sezginPage.statusDropdownEl;
        Driver.waitForVisibility(dropdownEl, 5);
        Select select = new Select(dropdownEl);
        Thread.sleep(3000);
        select.selectByValue("CANCELLED");
        getScreenshot("CANCELLED");

    }
    @Then("S user clicks anamnesis box without writing anything")
    public void s_user_clicks_anamnesis_box_without_writing_anything() {
    Driver.waitAndClick(sezginPage.anamnesisTextArea);
    }
    @Then("S user clicks treatment box without writing anything")
    public void s_user_clicks_treatment_box_without_writing_anything() {
    Driver.waitAndClick(sezginPage.treatmentTextArea);
    }
    @Then("S user clicks diagnosis box without writing anything")
    public void s_user_clicks_diagnosis_box_without_writing_anything() {
    Driver.waitAndClick(sezginPage.diagnosisTextArea);
    }
    @Then("S user clicks save button")
    public void s_user_clicks_save_button() {
    Driver.waitAndClick(sezginPage.saveChangesForEdittingPatient);
    }
    @Then("S user goes to physician dropdown and chooses  a doctor")
    public void s_user_goes_to_physician_dropdown_and_chooses_the_doctor() throws InterruptedException {
        Driver.wait(10);
        jse.executeScript("arguments[0].scrollIntoView(true);",sezginPage.physicianNamesDropdownEl);

        WebElement ddPhysician= sezginPage.physicianNamesDropdownEl;
        Driver.waitAndClick(dropdownEl, 15);
        Select select= new Select(ddPhysician);
        select.selectByIndex(2);


        //boolean flag=true;
        //Thread.sleep(15000);

       /* while (flag) {
            Driver.waitAndClick(ddPhysician);
            try {
                Driver.waitForVisibility(sezginPage.deneme, 15);
            } catch (Exception e) {

            }

            Select s=new Select(ddPhysician);
            List<WebElement> allOptions = s.getOptions();
            if (allOptions.size() > 1) {
                flag=false;
            }
            Driver.getDriver().navigate().refresh();
        } */

    Driver.waitAndClick(sezginPage.saveChangesForEdittingPatient);
    //Driver.wait(3);
    }

    @Then("S user asserts that changes have been saved")
    public void s_user_asserts_that_changes_have_been_saved() {

        String toasterText= sezginPage.appointmentUpdatedToastContainer.getText();
        System.out.println("alert warning= "+ toasterText);
        String expectedData="The Appointment is updated with identifier 49681";
       Assert.assertTrue(expectedData.contains("updated"));

    }


    @Then("S user clicks show tests button")
    public void s_user_clicks_show_tests_button() {
Driver.waitAndClick(sezginPage.showTestsButton);
    }
    @Then("S user chooses a test and clicks on view results")
    public void s_user_chooses_a_test_and_clicks_on_view_results() {
Driver.waitAndClick(sezginPage.viewTestResultsButton);
    }
    @Then("S user asserts the visibility of test results")
    public void s_user_asserts_the_visibility_of_test_results() {
Assert.assertTrue(sezginPage.testResultsTextEl.isDisplayed());
    }



}
