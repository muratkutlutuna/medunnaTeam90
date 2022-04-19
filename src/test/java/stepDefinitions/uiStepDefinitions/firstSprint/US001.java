package stepDefinitions.uiStepDefinitions.firstSprint;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.KutluPage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class US001 {

    KutluPage kP = new KutluPage();
    @Given("MKT user enter the mainpage")
    public void mkt_user_enter_the_mainpage() {Driver.getDriver().get(ConfigurationReader.getProperty("medunnaUrl"));
    }
    @Given("MKT user click the top user button")
    public void mkt_user_click_the_top_user_button() {
        kP.accountMenuIcon.click();

    }
    @Then("MKT user click the register button")
    public void mkt_user_click_the_register_button() {
        kP.dropdownRegisterButton.click();
    }
    @Then("MKT user click SSN textbox")
    public void mkt_user_click_ssn_textbox() {
        kP.registerSSNTextBox.click();
    }
    @Then("MKT user input  {string} number in SSN textbox")
    public void mkt_user_input_number_in_SSN_textbox(String invalidSSN) {
        kP.registerSSNTextBox.sendKeys(invalidSSN);
    }
    @Then("MKT user click the First Name textbox")
    public void mkt_user_click_the_first_name_textbox() {
        kP.registerFirstNameTextBox.click();
    }

    @And("MKT verify that {string} text appears")
    public void mktVerifyThatTextAppears(String expectedOutput) {
        String actualOutput = kP.registerSSNInvalidFeedbackText.getText();
        Assert.assertEquals(expectedOutput,actualOutput);
    }

    @And("MKT verify that -Your FirstName is required.- text didn't appear")
    public void mktVerifyThatYourFirstNameIsRequiredTextDidnTAppear() {
        boolean assertionFlag = true;
        try {
            kP.registerFirstNameInvalidFeedbackText.isDisplayed();
        } catch (Exception e) {
            assertionFlag = false;
        }
        Assert.assertFalse(assertionFlag);
    }

    @And("MKT verify that -Your FirstName is required.- text appears")
    public void mktVerifyThatYourFirstNameIsRequiredTextAppears() {
        Assert.assertTrue(kP.registerFirstNameInvalidFeedbackText.isDisplayed());
    }

    @And("MKT verify that -Your SSN is invalid- text didn't appear")
    public void mktVerifyThatYourSSNIsInvalidTextDidnTAppear() {
        boolean assertionFlag = true;
        try {
            kP.registerSSNInvalidFeedbackText.isDisplayed();
        } catch (Exception e) {
            assertionFlag = false;
        }
        Assert.assertFalse(assertionFlag);
    }

    @Then("MKT user input  {string} in firstname textbox")
    public void mktUserInputInFirstnameTextbox(String firstname) {
        kP.registerFirstNameTextBox.sendKeys(firstname);
    }

    @And("MKT user click the Last Name textbox")
    public void mktUserClickTheLastNameTextbox() {
        kP.registerLastNameTextBox.click();
    }

    @Then("MKT user input  {string} in lastName textbox")
    public void mktUserInputInLastNameTextbox(String lastName) {
        kP.registerLastNameTextBox.sendKeys(lastName);
    }

    @And("MKT verify that -Your LastName is required.- text didn't appear")
    public void mktVerifyThatYourLastNameIsRequiredTextDidnTAppear() {
        boolean assertionFlag = true;
        try {
            kP.registerLastNameInvalidFeedbackText.isDisplayed();
        } catch (Exception e) {
            assertionFlag = false;
        }
        Assert.assertFalse(assertionFlag);
    }

    @And("MKT verify that -Your LastName is required.- text appears")
    public void mktVerifyThatYourLastNameIsRequiredTextAppears() {
        Assert.assertTrue(kP.registerLastNameInvalidFeedbackText.isDisplayed());
    }
}
