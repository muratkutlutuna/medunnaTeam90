package stepDefinitions.uiStepDefinitions.secondSprint;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.MehlikaPage;
import utilities.Driver;

public class US019 {
    MehlikaPage locator=new MehlikaPage();

    @Then("mb Click Administration and User Management button")
    public void mb_click_administration_and_user_management_button() {
        Driver.waitAndClick(locator.administrationButton,3);
        Driver.wait(1);
        locator.userManagementButton.click();
        Driver.wait(1);
    }

    @Then("mb Click Create a new user button")
    public void mb_click_create_a_new_user_button() {
        Driver.clickWithJS(locator.createANewUser);
        Driver.wait(1);
    }

    @Then("mb Fill in the form {string},{string},{string},{string},{string}")
    public void mb_fill_in_the_form(String login, String firstname, String lastname, String email, String ssn) {
        Driver.waitAndSendText(locator.newUserLoginInput,login);
        Driver.wait(1);
        Driver.waitAndSendText(locator.newUserFirstNameInput,firstname);
        Driver.wait(1);
        Driver.waitAndSendText(locator.newUserLastNameInput,lastname);
        Driver.wait(1);
        Driver.waitAndSendText(locator.newUserEmailInput,email);
        Driver.wait(1);
        Driver.waitAndSendText(locator.newUserSsnInput,ssn);
        Driver.wait(1);
        Driver.waitAndClick(locator.newUserLanguageDropdown);   //check
        Driver.wait(1);
        Driver.waitAndClick(locator.newUserProfilesStaffOption);
        Driver.wait(1);
        Driver.waitAndClick(locator.newUserSaveButton);
        Driver.wait(1);
    }

    @Then("mb Verify created is successfully toast container message")
    public void mb_verify_created_is_successfully_toast_container_message() {
        //locator.toastContainer.getCssValue("Color").contains("Green");
        //System.out.println("locator.toastContainer.getCssValue(\"Color\").contains(\"Green\")=  " + locator.createdToastContainer.getCssValue("Color").contains("Green"));
        if(locator.createdToastContainer.isDisplayed())
            Assert.assertTrue(locator.createdToastContainer.getText().contains("created"));
        else
            System.out.println("ERROR - New User Olusturulamadi.");
    }

    @Then("mb Click Items&Titles and Staff button")
    public void mb_click_items_titles_and_staff_button() {
        locator.itemsTitlesStaff.click();
    }

    @Then("mb Click Create a new staff button")
    public void mb_click_create_a_new_staff_button() {
        locator.createANewStaff.click();
    }

    @Then("mb Enter SSN number and click Use Search checkbox")
    public void mb_enter_ssn_number_and_click_use_search_checkbox() {
        locator.staffSsnInput.sendKeys("100-20-1902");
        locator.useSearchSsnCheckbox.click();
        locator.ssnSearchUserButton.click();
    }

    @Then("mb Verify User found with search SSN message")
    public void mb_verify_user_found_with_search_ssn_message() {
        Assert.assertTrue(locator.foundToastContainer.isDisplayed());
        Assert.assertEquals("User found",locator.foundToastContainer.getText());
    }

    // TC01902
    @Given("mb Select Birth Date and Enter Phone number {string}")
    public void mb_select_birth_date_and_enter_phone_number(String string) {
        Driver.wait(1);
        Driver.clickWithJS(locator.itemsTitlesMenuButton);
        Driver.wait(1);
        locator.itemsTitlesStaff.click();
        Driver.wait(1);
        Driver.waitAndSendText(locator.newPatientBirthDateInput,"01/01/2001");


    }

    @Given("mb Select Gender and Blood Group")
    public void mb_select_gender_and_blood_group() {

    }

    @Given("mb Enter Address and Description {string}")
    public void mb_enter_address_and_description(String string) {


    }

    @Given("mb Selet User, Country and State City")
    public void mb_selet_user_country_and_state_city() {

    }

    @Given("mb Click Save button.")
    public void mb_click_save_button() {

    }

    @Then("mb Verify created successfully message with new ID")
    public void mb_verify_created_successfully_message_with_new_id() {

    }

    @Then("mb Click Created Date from List Row")
    public void mb_click_created_date_from_list_row() {

    }

    @Then("mb Click first row and last new user")
    public void mb_click_first_row_and_last_new_user() {

    }

    @Then("mb Verify data")
    public void mb_verify_data() {

    }

}
