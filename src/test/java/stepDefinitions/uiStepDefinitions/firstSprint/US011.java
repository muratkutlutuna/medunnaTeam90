package stepDefinitions.uiStepDefinitions.firstSprint;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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
    Actions actions= new Actions(Driver.getDriver());

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




    @Given("S go to Medunna website")
    public void go_to_medunna_website() {
        Driver.getDriver().get(ConfigurationReader.getProperty("medunnaUrl"));
    }
    @Then("S user logins as doctor")
    public void user_logins_as_doctor() {
        sezginPage.userItemTop.click();
        sezginPage.signinEl.click();
        sezginPage.usernameBox.sendKeys(ConfigurationReader.getProperty("MedValidUsernameDoctor"));
        sezginPage.passwordBox.sendKeys(ConfigurationReader.getProperty("MedValidPasswordDoctor"));
        sezginPage.signinButton.click();

    }
    @Then("S user goes to my page and clicks my appointments")
    public void user_goes_to_my_page_and_clicks_my_appointments() {
        Driver.waitAndClick(sezginPage.myPagesIconDoctor);
        Driver.waitAndClick(sezginPage.myAppointmentsDoctor);

    }
    @Then("S user clicks edit button for a patient")
    public void user_clicks_edit_button_for_a_patient() throws InterruptedException {
       Driver.waitForClickablility(sezginPage.editPatientButton, 8).click();
        //Thread.sleep(5000);
    }
    @Then("S user asserts that he can go to create and edit appointment page")
    public void user_asserts_that_he_can_go_to_create_and_edit_appointment_page() throws InterruptedException {

        sezginPage.createOrEditAppointmentTextEl.isDisplayed();
    }
    @Then("S close the page")
    public void close_the_page() {
        Driver.closeDriver();
    }




    @Then("S user sends text for anamnesis textbox")
    public void user_sends_text_for_anamnesis_textbox() {
Driver.waitAndSendText(sezginPage.anamnesisTextArea, ConfigurationReader.getProperty("Anamnesis"));
    }
    @Then("S user sends text for treatment textbox")
    public void user_sends_text_for_treatment_textbox() {
Driver.waitAndSendText(sezginPage.treatmentTextArea, ConfigurationReader.getProperty("Treatment"));
    }
    @Then("S user sends text for diagnosis textbox")
    public void user_sends_text_for_diagnosis_textbox() {
Driver.waitAndSendText(sezginPage.diagnosisTextArea, ConfigurationReader.getProperty("Diagnosis"));
    }

    @Then("S user clicks anamnesis textbox but doesn't send text")
    public void user_clicks_anamnesis_textbox_but_doesn_t_send_text() throws InterruptedException {
Driver.waitAndSendText(sezginPage.anamnesisTextArea, "");
Thread.sleep(3000);
    }
    @Then("S user clicks treatment textbox but doesn't send text")
    public void user_clicks_treatment_textbox_but_doesn_t_send_text() {
Driver.waitAndSendText(sezginPage.treatmentTextArea, "");
    }
    @Then("S user gets invalid feedback warning")
    public void user_gets_invalid_feedback_warning() {
sezginPage.anamnesisThisFieldisRequiredText.isDisplayed();
    }
    @Then("S user clicks diagnosis textbox  but doesn't send text")
    public void user_clicks_diagnosis_textbox_but_doesn_t_send_text() {
Driver.waitAndSendText(sezginPage.diagnosisTextArea,"");
    }
    @Then("S user clicks prescription text box but doesn't send text")
    public void user_clicks_prescription_text_box_but_doesn_t_send_text() {
Driver.waitAndSendText(sezginPage.prescriptionTextArea,"");
    }

    @Then("S user sends text for prescription textbox")
    public void userSendsTextForPrescriptionTextbox() {
        Driver.waitAndSendText(sezginPage.prescriptionTextArea, "Dafalgan, Nurofen");
    }

    @Then("S user sends text for description textbox")
    public void userSendsTextForDescriptionTextbox() {
        Driver.waitAndSendText(sezginPage.descriptionTextArea, "needs to rest");
    }

    @Then("S user selects pending as status")
    public void userSelectsPendingAsStatus() throws IOException, InterruptedException {
       WebElement dropdownEl= sezginPage.statusDropdownEl;
        Driver.waitForVisibility(dropdownEl, 5);
       Select select = new Select(dropdownEl);
Thread.sleep(3000);
select.selectByValue("PENDING");
getScreenshot("pending");

    }

    @Then("S user selects completed as status")
    public void userSelectsCompletedAsStatus() throws IOException, InterruptedException {
        WebElement dropdownEl= sezginPage.statusDropdownEl;
        Driver.waitForVisibility(dropdownEl, 5);
        Select select=new Select(dropdownEl);
        Thread.sleep(3000);
        select.selectByVisibleText("COMPLETED");
getScreenshot("completed");
    }

    @Then("S user selects cancelled as status")
    public void userSelectsCancelledAsStatus() throws IOException, InterruptedException {
        WebElement dropdownEl= sezginPage.statusDropdownEl;
        Driver.waitForVisibility(dropdownEl, 5);
        Select select=new Select(dropdownEl);
        Thread.sleep(3000);
        select.selectByVisibleText("CANCELLED");
        getScreenshot("cancelled");
    }

    @And("S user asserts the visibility of the patients' id")
    public void sUserAssertsTheVisibilityOfThePatientsInformation() throws InterruptedException {
        Thread.sleep(7000);
       Driver.waitForVisibility(sezginPage.patientIdBox, 3);
       sezginPage.patientIdBox.isDisplayed();



    }

    @And("S user asserts the visibility of the patients' appointment start date")
    public void sUserAssertsTheVisibilityOfThePatientsAppointmentStartDate() {
        sezginPage.appointmentStartDate.isDisplayed();
    }

    @And("S user asserts the visibility of the patients' appointment end date")
    public void sUserAssertsTheVisibilityOfThePatientsAppointmentEndDate() {
        sezginPage.appointmentEndDate.isDisplayed();
    }


    @And("S user asserts the visibility of the patients' appointment status")
    public void sUserAssertsTheVisibilityOfThePatientsAppointmentStatus() throws InterruptedException {
        sezginPage.statusDropdownEl.isDisplayed();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(3000);
    }

    @And("S user asserts the visibility of the patients' doctor name")
    public void sUserAssertsTheVisibilityOfThePatientsDoctorSName() throws InterruptedException {

        Driver.waitForVisibility(sezginPage.physiciansNameBox,5);
        sezginPage.physiciansNameBox.isDisplayed();
    }

    @And("S user asserts the visibility of the patients' name")
    public void sUserAssertsTheVisibilityOfThePatientsName() {
        Driver.waitForVisibility(sezginPage.patientIdBox,5);
        sezginPage.patientNameBox.isDisplayed();
    }


}
