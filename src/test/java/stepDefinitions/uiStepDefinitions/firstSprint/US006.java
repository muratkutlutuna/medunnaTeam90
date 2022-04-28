package stepDefinitions.uiStepDefinitions.firstSprint;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.KutluPage;
import utilities.Driver;

public class US006 {

    KutluPage kP = new KutluPage();

    @Given("MKT user click the left top user sign in button")
    public void mkt_user_click_the_left_top_user_sign_in_button() {
        Driver.waitAndClick(kP.accountMenuIcon);
        Driver.waitAndClick(kP.dropdownSignInButton);

    }
    @Then("MKT user inputs his or her {string} to username")
    public void mktUserInputsHisOrHerToUsername(String username) {
        Driver.waitAndClick(kP.signInUsernameTextBox);
        kP.signInUsernameTextBox.clear();
        kP.signInUsernameTextBox.sendKeys(username);
    }

    @And("MKT user inputs his or her {string} to password")
    public void mktUserInputsHisOrHerToPassword(String password) {
        Driver.waitAndClick(kP.signInPasswordTextBox);
        kP.signInPasswordTextBox.clear();
        kP.signInPasswordTextBox.sendKeys(password);
    }

    @Then("MKT user click the Sign in button")
    public void mkt_user_click_the_sign_in_button() {
        Driver.waitAndClick(kP.submitButton);
    }
    @Then("MKT user click the top left the button that have same name with username")
    public void mkt_user_click_the_top_left_the_button_that_have_same_name_with_username() {
        Driver.waitAndClick(kP.accountMenu);
    }
    @Then("MKT user click settings at dropdown window")
    public void mkt_user_click_settings_at_dropdown_window() {
        Driver.waitAndClick(kP.accountSettings);
    }
    @Then("MKT user click firstname textbox")
    public void mkt_user_click_firstname_textbox() {
        Driver.waitAndClick(kP.firstNameTextBox);
    }
    @Then("MKT user clear firstname textbox")
    public void mkt_user_clear_firstname_textbox() {
        kP.firstNameTextBox.clear();
    }
    @Then("MKT user input {string} in firstname textbox")
    public void mkt_user_input_in_firstname_textbox(String firstName) {
        kP.firstNameTextBox.sendKeys(firstName);
    }
    @Then("MKT user click lastname textbox")
    public void mkt_user_click_lastname_textbox() {
        Driver.waitAndClick(kP.lastNameTextBox);
    }
    @Then("MKT user clear lastname textbox")
    public void mkt_user_clear_lastname_textbox() {
        kP.lastNameTextBox.clear();
    }
    @Then("MKT user input {string} in lastname textbox")
    public void mkt_user_input_in_lastname_textbox(String lastName) {
        kP.lastNameTextBox.sendKeys(lastName);
    }
    @Then("MKT user click email textbox")
    public void mkt_user_click_email_textbox() {
        Driver.waitAndClick(kP.emailTextBox);
        kP.emailTextBox.clear();
    }
    @Then("MKT user input {string} in email textbox")
    public void mkt_user_input_in_email_textbox(String email) {
        kP.emailTextBox.sendKeys(email);
    }
    @Then("MKT user clicks save button")
    public void mkt_user_clicks_save_button() {
        Driver.waitAndClick(kP.submitButton);
    }
    @Then("MKT user click signout button in dropdown page")
    public void mkt_user_click_signout_button_in_dropdown_page() {
        Driver.waitAndClick(kP.dropdownSignOutButton);
    }
    @Then("MKT verify firstname textbox has {string} value")
    public void mkt_verify_firstname_textbox_has_value(String firstName) {
        String expectedFirstNameValue = kP.firstNameTextBox.getAttribute("value");
        System.out.println("expectedFirstNameValue = " + expectedFirstNameValue);
        Assert.assertEquals(firstName,expectedFirstNameValue);

    }
    @Then("MKT verify lastname textbox has {string} value")
    public void mkt_verify_lastname_textbox_has_value(String lastName) {
        String expectedLastNameValue = kP.lastNameTextBox.getAttribute("value");
        System.out.println("expectedLastNameValue = " + expectedLastNameValue);
        Assert.assertEquals(lastName,expectedLastNameValue);
    }
    @Then("MKT verify email textbox has {string} value")
    public void mkt_verify_email_textbox_has_value(String email) {
        String expectedEmailValue = kP.emailTextBox.getAttribute("value");
        System.out.println("expectedEmailValue = " + expectedEmailValue);
        Assert.assertEquals(email,expectedEmailValue);
    }

    @And("MKT user check there no any language textbox in page")
    public void mktUserCheckThereNoAnyLanguageTextboxInPage() {
        Driver.waitForPageToLoad(10);
        boolean flag = true;
        try {
            kP.anyLanguageElementOnPage.isDisplayed();
        }catch (Exception e) {
            flag=false;
        }
        Assert.assertFalse(flag);
    }
}
