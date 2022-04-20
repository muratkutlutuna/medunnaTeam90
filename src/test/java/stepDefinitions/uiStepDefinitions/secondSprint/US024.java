package stepDefinitions.uiStepDefinitions.secondSprint;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.RanaPageSecond;
import utilities.Driver;

public class US024 {
    RanaPageSecond rP = new RanaPageSecond();

    @Given("RT Patient goes to home page")
    public void rt2_patient_goes_to_home_page() {
        Driver.getDriver().get("https://www.medunna.com");
    }

    @And("RT Patient sign in with valid credentials")
    public void rt2_patient_sign_in_with_valid_credentials() {
        Driver.waitAndClick(rP.loginDropdown);
        Driver.waitAndClick(rP.signInButton);
        Driver.waitAndSendText(rP.username,"kurt890");
        Driver.waitAndSendText(rP.password,"kurt890");
        Driver.waitAndClick(rP.loginButton);
    }

    @Then("RT Patient click on my appointment")
    public void rt2_patient_click_on_my_appointment() {
      Driver.waitAndClick(rP.myAppointmentsPage);
      Driver.waitAndClick(rP.dropDownMyAppointments);

    }

    @And("RT Patient click show test results button")
    public void rt2_patient_click_show_test_results_button() {
       Driver.waitAndClick(rP.showTestsButton);
    }

    @And("RT Patient click view results button")
    public void rt2_patient_click_view_results_button() {
      Driver.waitAndClick(rP.viewResultsButton);
    }

    @And("RT Patient see ordered tests and results")
    public void rt2_patient_see_ordered_tests_and_results() {
        Driver.wait(1);
        Assert.assertTrue(rP.testIdUrea.isDisplayed());
        Assert.assertTrue(rP.testNameUrea.isDisplayed());
        Assert.assertTrue(rP.minValueUrea.isDisplayed());
        Assert.assertTrue(rP.maxValueUrea.isDisplayed());
        Assert.assertTrue(rP.descriptionUrea.isDisplayed());
    }

    @Then("RT Patient navigate back to tests page")
    public void rt2_patient_navigate_back_to_tests_page() {
      Driver.getDriver().navigate().back();
    }

    @And("RT Patient navigate back to appointments page")
    public void rt2_patient_navigate_back_to_appointments_page() {
      Driver.getDriver().navigate().back();
    }

    @Then("RT Patient click on show invoice button")
    public void rt2_patient_click_on_show_invoice_button() {
        Driver.waitAndClick(rP.showInvoiceButton);
    }

    @Then("RT Patient views invoice")
    public void rt2_patient_views_invoice() {
        Assert.assertTrue(rP.totalCostText.isDisplayed());
    }
}
