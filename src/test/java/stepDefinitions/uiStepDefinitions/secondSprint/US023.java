package stepDefinitions.uiStepDefinitions.secondSprint;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.RanaPageSecond;
import utilities.Driver;

public class US023 {
    RanaPageSecond rP = new RanaPageSecond();

    @Given("user navigates to medunna home page")
    public void userNavigatesToMedunnaHomePage() {

        Driver.getDriver().get("https://www.medunna.com");
    }

    @Given("user signs in with staff credentials")
    public void user_signs_in_with_staff_credentials() {
        Driver.waitAndClick(rP.loginDropdown);
        Driver.waitAndClick(rP.signInButton);
        Driver.waitAndSendText(rP.username,"fatihstaffabi");//Staff username
        Driver.waitAndSendText(rP.password,"1211402301");
        Driver.waitAndClick(rP.loginButton);
    }
    @Given("user clicks my pages dropdown")
    public void user_clicks_my_pages_dropdown() {
        Driver.waitAndClick(rP.myPagesDropdown);
    }
    @Given("user clicks search patient button")
    public void user_clicks_search_patient_button() {
        Driver.waitAndClick(rP.searchPatientButton);
        Driver.wait(2);
    }
    @Then("user searchs patient with SSN {string} in the search box")
    public void user_searchs_patient_with_ssn_in_the_search_box(String ssn) {
        Driver.waitAndSendText(rP.patientSSNTextBox,ssn);
        Driver.wait(3);
    }
    @Then("user clicks show appointment button")
    public void user_clicks_show_appointment_button() {
        Driver.waitAndClick(rP.showAppointmentsButton);
    }
    @Then("user verifies patient's status completed or cancelled")
    public void user_verifies_patient_s_status_completed_or_cancelled() {
        Assert.assertTrue(Driver.waitForVisibility(rP.completedText,5).isDisplayed());
        Driver.wait(3);
    }
    @Then("user clicks payment invoice process")
    public void user_clicks_payment_invoice_process() {
        Driver.waitAndClick(rP.paymentInvoiceButton);
    }
    @Then("user sees the following fields in the invoice page")
    public void user_sees_the_following_fields_in_the_invoice_page() {
        Driver.wait(3);
        Assert.assertTrue(rP.examFeeTxt.isDisplayed());
        Assert.assertTrue(rP.examFeePrice.isDisplayed());
        Assert.assertTrue(rP.diabetesFee.isDisplayed());
        Assert.assertTrue(rP.theoTestFee.isDisplayed());
        Assert.assertTrue(rP.nickyTestFee.isDisplayed());
        Driver.wait(3);
    }
    @Then("user clicks create invoice button")
    public void user_clicks_create_invoice_button() {
        Driver.waitAndClick(rP.createInvoiceButton);
    }
    @Then("user clicks save button")
    public void user_clicks_save_button() {
        Driver.waitAndClick(rP.saveButton);
    }
    @Then("user verifies success message")
    public void user_verifies_success_message() {
        Assert.assertTrue(Driver.waitForVisibility(rP.invoiceSuccessMessage,5).isDisplayed());
    }
    @Then("user search patient with SSN {string} in the search box again")
    public void user_search_patient_with_ssn_in_the_search_box_again(String ssn) {
        Driver.waitAndSendText(rP.patientSSNTextBox,ssn);
    }
    @Then("user clicks show appointment")
    public void user_clicks_show_appointment() {
        Driver.waitAndClick(rP.showAppointmentsButton);
        Driver.wait(3);
    }
    @Then("user clicks again for payment invoice")
    public void user_clicks_again_for_payment_invoice() {
        Driver.waitAndClick(rP.paymentInvoiceButton);
        Driver.wait(3);
    }
    @Then("user clicks show invoice button")
    public void user_clicks_show_invoice_button() {
        Driver.wait(3);
        Driver.waitAndClick(rP.showInvoiceButton);
    }
    @Then("user verifies the invoice page")
    public void user_verifies_the_invoice_page() {
        Driver.wait(3);
        Assert.assertTrue(rP.invoicePageHeader.isDisplayed());
        Driver.closeDriver();
    }
}