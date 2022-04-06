package stepDefinitions.uiStepDefinitions.firstSprint;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.MehlikaPage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class US005{
    MehlikaPage mehlikaPage = new MehlikaPage();

    @Before
    @Given("MB Launch web browser and navigate to the home page")
    public void mb_launch_web_browser_and_navigate_to_the_home_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("medunnaUrl"));
    }

    @Then("MB Verify the Make an Appointment button is visible and clickable")
    public void mb_verify_the_make_an_appointment_button_is_visible_and_clickable() {
        Assert.assertTrue(mehlikaPage.makeAnAppointmentButton.isDisplayed());
        Assert.assertTrue(mehlikaPage.makeAnAppointmentButton.isEnabled());
    }

    @Given("MB Click the Make an Appointment button")
    public void mb_click_the_make_an_appointment_button() {
        mehlikaPage.makeAnAppointmentButton.click();
    }

    @Then("MB Verify Make an Appointment request form can be seen")
    public void mb_verify_make_an_appointment_request_form_can_be_seen() {
        mehlikaPage.makeAppoinmentTitle.isDisplayed();
    }

    @Then("MB Click First Name textbox and Enter First Name {string}")
    public void mb_click_first_name_textbox_and_enter_first_name(String firstname) {
        mehlikaPage.firstNameInputBox.click();
        mehlikaPage.firstNameInputBox.sendKeys(firstname + Keys.ENTER);
    }

    @Then("MB Verify First Name textbox is not blank")
    public void mb_verify_first_name_textbox_is_not_blank() {
        String expfirstNameWarning = "FirstName is required";
        String actFirstNameWarning = mehlikaPage.firstNameWarning.getText();
        Assert.assertEquals(expfirstNameWarning, actFirstNameWarning);
        Assert.assertTrue(actFirstNameWarning.contains(expfirstNameWarning));
    }

    @Then("MB Verify user is using characters for the First Name textbox")
    public void mb_verify_user_is_using_characters_for_the_first_name_textbox() {
        String firstName=mehlikaPage.firstNameInputBox.getText();
        ///////////////
    }

    @Then("MB Click the Last Name textbox and enter Last Name {string}")
    public void mb_click_the_last_name_textbox_and_enter_last_name(String lastname) {
        mehlikaPage.lastNameInputBox.click();
        mehlikaPage.lastNameInputBox.sendKeys(lastname+Keys.ENTER);
    }

    @Then("MB Verify Last Name textbox is not blank")
    public void mb_verify_last_name_textbox_is_not_blank_warning() {
        Assert.assertFalse(mehlikaPage.lastNameInputBox.getText().isEmpty());
        Assert.assertTrue(mehlikaPage.lastNameWarning.getText().contains("LastName is required"));

    }

    @Then("MB Verify user is using characters for the Last Name textbox")
    public void mb_verify_user_is_using_characters_for_the_last_name_textbox() {

    }

    @Then("MB Click the SSN textbox and enter SSN number {string}")
    public void mb_click_the_ssn_textbox_and_enter_ssn_number(String ssn) {
        mehlikaPage.ssnInputBox.click();
        mehlikaPage.ssnInputBox.sendKeys(ssn);
    }

    @Then("MB Verify SSN textbox is not blank")
    public void mb_verify_ssn_textbox_is_not_blank() {

    }

    @Then("MB Verify user is using digits for SSN textbox")
    public void mb_verify_user_is_using_digits_for_ssn_textbox() {

    }

    @Then("MB Verify this SSN is same as a registered SSN")
    public void mb_verify_this_ssn_is_same_as_a_registered_ssn() {

    }

    @Then("MB Click Email textbox and enter a valid Email address {string}")
    public void mb_click_email_textbox_and_enter_a_valid_email_address(String email) {
        mehlikaPage.emailInputBox.click();
        mehlikaPage.emailInputBox.sendKeys(email);
    }

    @Then("MB Verify Email textbox is not blank")
    public void mb_verify_email_textbox_is_not_blank() {

    }

    @Then("MB Verify user uses @ and . sign")
    public void mb_verify_user_uses_and_sign() {

    }

    @Then("MB Verify this number have - after 3th and 6th digits")
    public void mb_verify_this_number_have_after_3th_and_6th_digits(Double double1) {

    }

    @Then("MB Click the Phone textbox and enter a valid Phone number {string}")
    public void mb_click_the_phone_textbox_and_enter_a_valid_phone_number(String phone) {
        mehlikaPage.phoneInputBox.click();
        mehlikaPage.phoneInputBox.sendKeys(phone);
    }

    @Then("MB Verify that user is using digits for Phone textbox")
    public void mb_verify_that_user_is_using_digits_for_phone_textbox() {

    }

    @Then("MB Verify that this Phone textbox is not blank")
    public void mb_verify_that_this_phone_textbox_is_not_blank() {

    }

    @Then("MB Click the Appointment DateTime dropbox and select a valid date\"{int}\\/{int}\\/{int}\"")
    public void mb_click_the_dropbox_and_select_a_valid_date(String string, Integer month, Integer day, Integer year) {
        mehlikaPage.dateTimeInputBox.click();
        mehlikaPage.dateTimeInputBox.sendKeys("4"+"12"+Keys.TAB);


    }

    @Then("MB Verify selected date is one of following days")
    public void mb_verify_selected_date_is_one_of_following_days() {

    }

    @Then("MB Click Send An Appointment Request button")
    public void mb_click_send_an_appointment_request_button() {
        mehlikaPage.appointmentRequestButton.click();
    }

    @Then("MB Verify appointment success message which is {string}")
    public void mb_verify_appointment_success_message_which_is(String string) {
        String exVerifySuccessWarning="registration Saved";
        String acVerifySuccessWarning=mehlikaPage.appointmentSavedAlert.getText();
        Assert.assertTrue(acVerifySuccessWarning.contains(exVerifySuccessWarning));
    }

    @Then("MB Click Account Menu dropbox sign and click Sign In")
    public void mb_click_account_menu_dropbox_sign_and_click_sign_in() {
        mehlikaPage.accountMenu.click();
        //Actions actions=new Actions();

        //////
    }

    @Then("MB Click User Name textbox and enter a valid user name {string}")
    public void mb_click_user_name_textbox_and_enter_a_valid_user_name(String username) {
        mehlikaPage.signInUsername.click();
        mehlikaPage.signInUsername.sendKeys(username);
    }

    @Then("MB Click Password textbox and enter a valid password {string}")
    public void mb_click_password_textbox_and_enter_a_valid_password(String password) {
        mehlikaPage.signInPassword.click();
        mehlikaPage.signInPassword.sendKeys(password);
    }

    @Then("MB Click Sign In button")
    public void mb_click_sign_in_button() {
        mehlikaPage.signInSubmit.click();
    }

    @Then("MB Verify sign in is successfully")
    public void mb_verify_sign_in_is_successfully() {
        //Driver.getDriver().get(ConfigurationReader.getProperty("https://www.medunna.com/"));
        String exSignInSuccessWarning="Melinda Patient";
        String actSignInSuccessWarning=mehlikaPage.melindaPatientAccount.getText();
        System.out.println("actSignInSuccessWarning = " + actSignInSuccessWarning);
    }

}