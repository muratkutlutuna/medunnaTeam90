package stepDefinitions.uiStepDefinitions.secondSprint;

import io.cucumber.java.en.Given;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.Keys;
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
        Driver.waitAndClick(locator.accountMenu,1);
        Driver.wait(1);
        locator.signInButton.click();
        Driver.wait(1);
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

    @Then("mb Click Items&Titles button and Patient from dropdown box")
    public void mb_click_items_titles_button_and_patient_from_dropdown_box() {
        Driver.waitAndClick(locator.itemsTitlesMenuButton,2);
        Driver.wait(1);
        Driver.waitAndClick(locator.itemsTitlesPatient,1);
        Driver.wait(1);
    }
    @Then("mb Click Create a new Patient button")
    public void mb_click_create_a_new_patient_button() {
        locator.patientCreateANewPatient.click();
        Driver.wait(1);
    }


    @Then("mb Fill in all information {string},{string},{string},{string},{string},{string}")
    public void mb_fill_in_all_information(String firstname, String lastname, String phone, String email, String address, String description) {
        Driver.wait(1);
        locator.newPatientFirstNameInput.click();
            locator.newPatientFirstNameInput.sendKeys(firstname);
        locator.newPatientLastNameInput.click();
            locator.newPatientLastNameInput.sendKeys(lastname);
        locator.newPatientBirthDateInput.click();
            locator.newPatientBirthDateInput.sendKeys("01,01,2001");    // ???
        locator.newUserEmailInput.click();
            locator.newUserEmailInput.sendKeys(email);
        locator.newPatientPhoneInput.click();
            locator.newPatientPhoneInput.sendKeys(phone,Keys.TAB);
        //locator.newPatientGenderSelect.click();

            locator.newPatientGenderSelect.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
            //locator.newPatientGenderSelect.
        Driver.wait(1);
        locator.newPatientBloodSelect.click();
            locator.newPatientBloodSelect.sendKeys(Keys.ENTER);
        locator.newPatientAddressInput.click();
            locator.newPatientAddressInput.sendKeys(address);
        locator.newPatientDescriptionTextarea.click();
            locator.newPatientDescriptionTextarea.sendKeys(description);
        locator.newPatientUserSelect.click();
            locator.newPatientUserSelect.sendKeys(Keys.ENTER);
        locator.newPatientCountrySelect.click();
            locator.newPatientCountrySelect.sendKeys(Keys.ENTER);
        locator.newPatientStateSelect.click();
            locator.newPatientStateSelect.sendKeys(Keys.ENTER);
        Driver.wait(2);
        locator.newPatientSaveButton.click();
    }
    @Then("mb Verify the new user created successfully Toast Container")
    public void mb_verify_the_new_user_created_successfully_toast_container() {
        Assert.assertTrue(locator.newPatientSavedToast.getText().contains("saved"));
    }
    @Then("mb Verify new patient was created by admin")
    public void mb_verify_new_patient_was_created_by_admin() {

    }
}
