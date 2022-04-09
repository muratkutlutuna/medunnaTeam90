package stepDefinitions.uiStepDefinitions.firstSprint;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.AinagulPage;

import utilities.Driver;

import java.security.Key;


public class US012 {
    AinagulPage page=new AinagulPage();
    Actions actions = new Actions(Driver.getDriver());

    @Given("AY Navigate to url")
    public void navigate_to_url() {
        Driver.getDriver().get("https://medunna.com/");
    }

    @Given("AY Click on human figure")
    public void click_on_human_figure() {

        page.humanFigure.click();
    }

    @Then("AY Click on Sign in")
    public void click_on_sign_in() {
    Driver.wait(5);
        page.signIn.click();
    }

    @Then("AY Click on {string} input box and enter valid Username")
    public void click_on_input_box_and_enter_valid_username(String Username) {

        page.userName.sendKeys(Username);
    }

    @Then("AY Click on {string}  input box and enter valid Password")
    public void click_on_input_box_and_enter_valid_password(String Password) {

        page.password.sendKeys(Password);
    }

    @Then("AY Click on Sign in buton")
    public void click_on_sign_in_buton() {
        Driver.wait(3);
      page.signInButon.click();

    }

    @Then("AY Click on My page")
    public void click_on_my_page() {
        Driver.wait(3);
        page.myPage.click();

    }

    @Then("AY Click on My appointements")
    public void click_on_my_appointements() {
        page.myAppointments.click();
    }

    @Then("AY Select the patient and click on Edit")
    public void select_the_patient_and_click_on_edit() {
        Driver.wait(3);
        page.Edit.click();

    }

    @Then("AY Click on Request a test")
    public void click_on_request_a_test() {
        Driver.wait(3);
        page.requestATest.click();

    }
        @Then("AY Verify that Test Items is visible")
        public void verify_that_test_items_is_visible () {
        Driver.wait(3);
        String actualText = page.testItemsText.getText();
        String expectedText="Test Items";
        Assert.assertEquals(expectedText, actualText);


        }

        @Then("AY Click on account menu")
        public void click_on_account_menu () {
        page.accountMenu.click();

        }

        @Then("AY Click Sign out")
        public void click_sign_out () {
        Driver.wait(3);
        page.signOut.click();

        }


    @And("AY Click on the buttons to the right of the selected tests")
    public void clickOnTheButtonsToTheRightOfTheSelectedTests() {
        Driver.wait(3);
        page.ureaTest.click();
        Driver.wait(3);
        page.creatinineTes.click();
        Driver.wait(3);
        page.sodiumTest.click();
        Driver.wait(3);
        page.potassiumTest.click();
        Driver.wait(3);
        page.totalproteinTest.click();
        Driver.wait(3);
        page.hemoglobinTest.click();
        Driver.wait(3);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Driver.wait(2);
        page.albuminTest.click();
        Driver.wait(3);
        page.scrollToWebelementVisible(page.glucoseTest);
        Driver.waitAndClick(page.glucoseTest);


    }


    @And("AY Click on Save")
    public void clickOnSave() {

        Driver.wait(3);
        page.scrollToWebelementVisible(page.saveButton);
        Driver.wait(3);
        Driver.waitAndClick(page.saveButton);


    }


    @And("AY Verify that {string} is visible")
    public void verifyThatIsVisible(String string) {

       Assert.assertTrue(page.verifyText.isDisplayed());

    }

    @And("AY Click on {string} input box and enter valid username")
    public void clickOnInputBoxAndEnterValidUsername(String StaffUsername) {
        page.userName.sendKeys(StaffUsername);

    }

    @And("AY Click on {string} input box and enter valid password")
    public void clickOnInputBoxAndEnterValidPassword(String StaffPassword) {
        page.password.sendKeys(StaffPassword);
    }

    @And("AY Click on Search patient")
    public void clickOnSearchPatient() {
        page.searchPatient.click();
    }

    @And("AY Click on Patient {string} input box and enter patient's  SSN")
    public void clickOnPatientInputBoxAndEnterPatientSSSN(String SSN) {
    page.ssnBox.sendKeys(SSN);
    Driver.wait(3);
    }

    @And("AY Click on Show appointements")
    public void clickOnShowAppointements() {
        page.showAppointments.click();
    }

    @And("AY Click on Show tests")
    public void clickOnShowTests() {
        Driver.wait(3);
        page.showTests.click();
    }

    @And("AY Click on View results")
    public void clickOnViewResults() {
        Driver.wait(3);
        page.viewResults.click();
        Driver.wait(2);
    }


    @And("AY Click on Edit tests Staff updates and click on Save")
    public void clickOnEditTestsStaffUpdatesAndClickOnSave() {
        page.edit1.click();
        Driver.wait(1);
        page.save.click();
        Driver.wait(1);
        page.edit2.click();
        Driver.wait(1);
        page.save.click();
        Driver.wait(1);
        page.edit3.click();
        Driver.wait(1);
        page.save.click();
        Driver.wait(1);
        page.edit4.click();
        Driver.wait(1);
        page.save.click();
        Driver.wait(1);
        page.edit5.click();
        Driver.wait(1);
        page.save.click();
        Driver.wait(1);
        page.edit6.click();
        Driver.wait(1);
        page.save.click();
        Driver.wait(1);
        page.edit7.click();
        Driver.wait(1);
        page.save.click();
        Driver.wait(3);


    }

    @And("AY Click on Show Test Results")
    public void clickOnShowTestResults() {
        page.showTestResults.click();
    }


    @And("AY Click on View Results of the patient")
    public void clickOnViewResultsOfThePatient() {
        page.viewResults.click();
    }

    @And("AY Verify that Test Results is visible")
    public void verifyThatTestResultsIsVisible() {

        Assert.assertTrue(page.verifyTestResults.isDisplayed());

    }

    @And("AY Click on Request inpatient")
    public void clickOnRequestInpatient() {
    page.requestInpatient.click();

    }
}