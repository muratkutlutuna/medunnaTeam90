package stepDefinitions.uiStepDefinitions.firstSprint;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import pages.SezginPage;
import utilities.ConfigurationReader;
import utilities.Driver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class US011 {

    SezginPage sezginPage=new SezginPage();

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




    @Given("go to Medunna website")
    public void go_to_medunna_website() {
        Driver.getDriver().get(ConfigurationReader.getProperty("medunnaUrl"));
    }
    @Then("user logins as doctor")
    public void user_logins_as_doctor() {
        sezginPage.userItemTop.click();
        sezginPage.signinEl.click();
        sezginPage.usernameBox.sendKeys(ConfigurationReader.getProperty("MedValidUsernameDoctor"));
        sezginPage.passwordBox.sendKeys(ConfigurationReader.getProperty("MedValidPasswordDoctor"));
        sezginPage.signinButton.click();

    }
    @Then("user goes to my page and clicks my appointments")
    public void user_goes_to_my_page_and_clicks_my_appointments() {
        Driver.waitAndClick(sezginPage.myPagesIconDoctor);
        Driver.waitAndClick(sezginPage.myAppointmentsDoctor);

    }
    @Then("user clicks edit button for a patient")
    public void user_clicks_edit_button_for_a_patient() throws InterruptedException {
       Driver.waitForClickablility(sezginPage.editPatientButton, 8).click();
        //Thread.sleep(5000);
    }
    @Then("user asserts that he can go to create and edit appointment page")
    public void user_asserts_that_he_can_go_to_create_and_edit_appointment_page() throws InterruptedException {

        sezginPage.createOrEditAppointmentTextEl.isDisplayed();
    }
    @Then("close the page")
    public void close_the_page() {
        Driver.closeDriver();
    }


    @And("user asserts the visibility of the appointment table")
    public void userAssertsTheVisibilityOfTheAppointmentTable() throws IOException, InterruptedException {
        Thread.sleep(5000);
        getScreenshot("appointment table");
    }

    @Then("user sends text for anamnesis textbox")
    public void user_sends_text_for_anamnesis_textbox() {
Driver.waitAndSendText(sezginPage.anamnesisTextArea, ConfigurationReader.getProperty("Anamnesis"));
    }
    @Then("user sends text for treatment textbox")
    public void user_sends_text_for_treatment_textbox() {
Driver.waitAndSendText(sezginPage.treatmentTextArea, ConfigurationReader.getProperty("Treatment"));
    }
    @Then("user sends text for diagnosis textbox")
    public void user_sends_text_for_diagnosis_textbox() {
Driver.waitAndSendText(sezginPage.diagnosisTextArea, ConfigurationReader.getProperty("Diagnosis"));
    }

    @Then("user clicks anamnesis textbox but doesn't send text")
    public void user_clicks_anamnesis_textbox_but_doesn_t_send_text() throws InterruptedException {
Driver.waitAndSendText(sezginPage.anamnesisTextArea, "");
Thread.sleep(3000);
    }
    @Then("user clicks treatment textbox but doesn't send text")
    public void user_clicks_treatment_textbox_but_doesn_t_send_text() {
Driver.waitAndSendText(sezginPage.treatmentTextArea, "");
    }
    @Then("user gets invalid feedback warning")
    public void user_gets_invalid_feedback_warning() {
sezginPage.anamnesisThisFieldisRequiredText.isDisplayed();
    }
    @Then("user clicks diagnosis textbox  but doesn't send text")
    public void user_clicks_diagnosis_textbox_but_doesn_t_send_text() {
Driver.waitAndSendText(sezginPage.diagnosisTextArea,"");
    }
    @Then("user clicks prescription text box but doesn't send text")
    public void user_clicks_prescription_text_box_but_doesn_t_send_text() {
Driver.waitAndSendText(sezginPage.prescriptionTextArea,"");
    }

    @Then("user sends text for prescription textbox")
    public void userSendsTextForPrescriptionTextbox() {
        Driver.waitAndSendText(sezginPage.prescriptionTextArea, "Dafalgan, Nurofen");
    }

    @Then("user sends text for description textbox")
    public void userSendsTextForDescriptionTextbox() {
        Driver.waitAndSendText(sezginPage.descriptionTextArea, "needs to rest");
    }

    @Then("user selects pending as status")
    public void userSelectsPendingAsStatus() throws IOException, InterruptedException {
       WebElement dropdownEl= sezginPage.statusDropdownEl;
        Driver.waitForVisibility(dropdownEl, 5);
       Select select = new Select(dropdownEl);
Thread.sleep(3000);
select.selectByValue("PENDING");
getScreenshot("pending");
    }

    @Then("user selects completed as status")
    public void userSelectsCompletedAsStatus() throws IOException, InterruptedException {
        WebElement dropdownEl= sezginPage.statusDropdownEl;
        Driver.waitForVisibility(dropdownEl, 5);
        Select select=new Select(dropdownEl);
        Thread.sleep(3000);
        select.selectByVisibleText("COMPLETED");
getScreenshot("completed");
    }

    @Then("user selects cancelled as status")
    public void userSelectsCancelledAsStatus() throws IOException, InterruptedException {
        WebElement dropdownEl= sezginPage.statusDropdownEl;
        Driver.waitForVisibility(dropdownEl, 5);
        Select select=new Select(dropdownEl);
        Thread.sleep(3000);
        select.selectByVisibleText("CANCELLED");
        getScreenshot("cancelled");
    }
}
