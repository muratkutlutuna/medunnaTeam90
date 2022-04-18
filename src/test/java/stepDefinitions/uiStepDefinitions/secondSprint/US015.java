package stepDefinitions.uiStepDefinitions.secondSprint;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.interactions.Actions;
import pages.MehlikaPage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class US015 {
    MehlikaPage locator=new MehlikaPage();
    Actions action=new Actions(Driver.getDriver());

    @Before
    @Given("mb Launch web browser and navigate to the home page")
    public void mb_launch_web_browser_and_navigate_to_the_home_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("medunnaUrl"));
    }
    @Given("mb Click Account Menu dropbox sign and click Sign In Text")
    public void mb_click_account_menu_dropbox_sign_and_click_sign_in_text() {
        locator.accountMenu.click();
        locator.accountSignMenu.click();
    }
    @Given("mb Click User Name textbox and enter admin user name {string}")
    public void mb_click_user_name_textbox_and_enter_admin_user_name(String adminUsername) {
        locator.signInUsername.sendKeys(adminUsername);
    }
    @Given("mb Click Password textbox and enter admin password {string}")
    public void mb_click_password_textbox_and_enter_admin_password(String adminPassword) {
        locator.signInPassword.sendKeys(adminPassword);
    }
    @Given("mb Click Sign In button")
    public void mb_click_sign_in_button() {
        locator.signInSubmit.click();
    }
    @Then("mb Verify sign in is successfully")
    public void mb_verify_sign_in_is_successfully() {
        Assert.assertTrue(locator.verifySignedInAdmin.getText().contains("Team90"));
    }
    @Then("mb Click Items&Titles button and Patient from dropdown box")
    public void mb_click_items_titles_button_and_patient_from_dropdown_box() {
        locator.itemsTitlesMenuButton.click();
    }
    @Then("mb Click Create a new Patient button")
    public void mb_click_create_a_new_patient_button() {
        locator.itemsTitlesPatient.click();
    }
    @Then("mb Fill in all information {string},{string},{string},{string},{string},{string},{string}")
    public void mb_fill_in_all_information(String firstname, String lastname, String phone, String email, String address, String description) {
        locator.newPatientFirstNameInput.sendKeys(firstname);
        locator.newPatientLastNameInput.sendKeys(lastname);
        locator.newPatientBirthDateInput.sendKeys("01,01,2001");    // ???
        locator.newPatientPhoneInput.sendKeys(phone);
        locator.newUserEmailInput.sendKeys(email);
        locator.newPatientGenderSelect.click();
        locator.newPatientBloodSelect.click();
        locator.newPatientAddressInput.sendKeys(address);
        locator.newPatientDescriptionTextarea.sendKeys(description);
        locator.newPatientUserSelect.click();
        locator.newPatientCountrySelect.click();
        locator.newPatientStateSelect.click();

    }
    @Then("mb Verify the new user created successfully Toast Container")
    public void mb_verify_the_new_user_created_successfully_toast_container() {

    }
    @Then("mb Verify new patient was created by admin")
    public void mb_verify_new_patient_was_created_by_admin() {

    }
}
