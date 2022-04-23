package stepDefinitions.uiStepDefinitions.secondSprint;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.MehlikaPage;
import utilities.ConfigurationReader;
import utilities.Driver;

import javax.lang.model.SourceVersion;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class US015 {
    MehlikaPage locator = new MehlikaPage();
    Actions action = new Actions(Driver.getDriver());
    static String idKeeper;

    @Given("mb Launch web browser and navigate to the home page")
    public void mb_launch_web_browser_and_navigate_to_the_home_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("medunnaUrl"));
    }

    @Given("mb Click Account Menu dropbox sign and click Sign In Text")
    public void mb_click_account_menu_dropbox_sign_and_click_sign_in_text() {
        Driver.waitAndClick(locator.accountMenu, 1);
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
        Driver.wait(1);
        locator.signInSubmit.click();
    }

    @Then("mb Click Items&Titles button and Patient from dropdown box")
    public void mb_click_items_titles_button_and_patient_from_dropdown_box() {
        Driver.waitAndClick(locator.itemsTitlesMenuButton, 2);
        Driver.waitAndClick(locator.itemsTitlesPatient, 1);
        Driver.wait(1);
    }

    @Then("mb Click Create a new Patient button")
    public void mb_click_create_a_new_patient_button() {
        locator.patientCreateANewPatient.click();
        Driver.wait(1);
    }

    @And("mb Fill in or select these informations {string},{string},{string},{string},{string},{string},{string}")
    public void mb_fill_in_or_select_these_informations(String firstname, String lastname, String birthdate, String email, String phone, String address, String description) {

        locator.newPatientFirstNameInput.sendKeys(firstname);
        locator.newPatientLastNameInput.sendKeys(lastname);
        locator.newPatientBirthDateInput.sendKeys(birthdate);
        Driver.wait(1);
        locator.newUserEmailInput.sendKeys(email);
        locator.newPatientPhoneInput.sendKeys(phone);
        Driver.wait(1);
        Select selectGender = new Select(locator.newPatientGenderSelect);
        selectGender.selectByVisibleText("FEMALE");
        Select selectBlood = new Select(locator.newPatientBloodSelect);
        selectBlood.selectByVisibleText("B+");
        Driver.wait(1);
        locator.newPatientAddressInput.sendKeys(address);
        locator.newPatientDescriptionTextarea.sendKeys(description);
        Driver.wait(1);
        Select selectCountry = new Select(locator.newPatientCountrySelect);
        selectCountry.selectByVisibleText("USA");
        Select selectState = new Select(locator.newPatientStateSelect);
        Driver.wait(1);
        selectState.selectByVisibleText("California");
        Driver.wait(1);
        locator.newPatientSaveButton.click();
        Driver.wait(1);
    }

    @Then("mb Verify the new patient was created by admin successfully Toast Container")
    public void mb_verify_the_new_patient_was_created_by_admin_successfully_toast_container() {
        Driver.wait(1);
        System.out.println("toast " + locator.createdToastContainer.getText());
        List<String> createdToastList= Arrays.asList(locator.createdToastContainer.getText().split("\\s"));
        idKeeper= createdToastList.get(7);
        System.out.println("idkeeper = " + idKeeper);
        System.out.println("list sonu id"+ createdToastList.get(7));
        Assert.assertTrue(locator.createdToastContainer.getText().contains("created"));
        Driver.wait(1);

        //--------------
//        System.out.println("toast " + locator.deletedToastContainer.getText());
//        List<String> deletedToastList= Arrays.asList(locator.deletedToastContainer.getText().split("\\s"));
//        System.out.println("deletedToastList = " + deletedToastList);
//
//        System.out.println("list sonu id"+ deletedToastList.get(7));
//        System.out.println("idkeeper  "+idKeeper);
//        Assert.assertTrue(locator.deletedToastContainer.getText().contains("deleted"));
//        Driver.wait(1);

    }

    ////////// TC01502
    @Given("mb Click Items&Titles button and select Patient from dropdown box")
    public void mb_click_items_titles_button_and_select_patient_from_dropdown_box() {
        Driver.wait(1);
        Driver.clickWithJS(locator.itemsTitlesMenuButton);
        Driver.wait(1);
        locator.itemsTitlesPatient.click();
        Driver.wait(1);
    }

    @Given("mb Select id of any patient and click")
    public void mb_select_id_of_any_patient_and_click() {
        Driver.wait(1);
        click_created_date_and_click_first_patient_s_id_number();
        Driver.wait(1);
    }

    @Then("mb Verify admin can see patient SSN")
    public void mb_verify_admin_can_see_patient_ssn() {
        System.out.println("locator.ssnCanSee.getText() = " + locator.ssnCanSee.getText());
        Assert.assertTrue(locator.ssnCanSee.isDisplayed());
    }

    @Then("mb Verify admin can see patient First Name and Last Name")
    public void mb_verify_admin_can_see_patient_first_name_and_last_name() {
        System.out.println("locator.firstnameCanSee.getText() = " + locator.firstnameCanSee.getText());
        Assert.assertTrue(locator.firstnameCanSee.isDisplayed());
        System.out.println("locator.lastnameCanSee.getText() = " + locator.lastnameCanSee.getText());
        Assert.assertTrue(locator.lastnameCanSee.isDisplayed());
    }

    @Then("mb Verify admin can see patient Birth Date and Phone")
    public void mb_verify_admin_can_see_patient_birth_date_and_phone() {
        System.out.println("locator.birthdateCanSee.getText() = " + locator.birthdateCanSee.getText());
        Assert.assertTrue(locator.birthdateCanSee.isDisplayed());
        System.out.println("locator.phoneCanSee.getText() = " + locator.phoneCanSee.getText());
        Assert.assertTrue(locator.phoneCanSee.isDisplayed());
    }

    @Then("mb Verify admin can see patient Gender and Blood Group")
    public void mb_verify_admin_can_see_patient_gender_and_blood_group() {
        System.out.println("locator.genderCanSee.getText() = " + locator.genderCanSee.getText());
        Assert.assertTrue(locator.genderCanSee.isDisplayed());
        System.out.println("locator.bloodCanSee.getText() = " + locator.bloodCanSee.getText());
        Assert.assertTrue(locator.bloodCanSee.isDisplayed());
    }

    @Then("mb Verify admin can see patient Address and Description")
    public void mb_verify_admin_can_see_patient_address_and_description() {
        System.out.println("locator.addressCanSee.getText() = " + locator.addressCanSee.getText());
        Assert.assertTrue(locator.addressCanSee.isDisplayed());
        System.out.println("locator.descriptionCanSee.getText() = " + locator.descriptionCanSee.getText());
        Assert.assertTrue(locator.descriptionCanSee.isDisplayed());
    }

    @Then("mb Verify admin can see patient Created Date and User")
    public void mb_verify_admin_can_see_patient_created_date_and_user() {
        System.out.println("locator.createdateCanSee.getText() = " + locator.createdateCanSee.getText());
        Assert.assertTrue(locator.createdateCanSee.isDisplayed());
        System.out.println("locator.userCanSee.getText() = " + locator.userCanSee.getText());
        Assert.assertTrue(locator.userCanSee.isDisplayed());
    }

    @Then("mb Verify admin can see patient Country and State City")
    public void mb_verify_admin_can_see_patient_country_and_state_city() {
        System.out.println("locator.countryCanSee.getText() = " + locator.countryCanSee.getText());
        Assert.assertTrue(locator.countryCanSee.isDisplayed());
        System.out.println("locator.stateCanSee.getText() = " + locator.stateCanSee.getText());
        Assert.assertTrue(locator.stateCanSee.isDisplayed());
    }
////// TC01503

    @Given("Click Created Date and click first patient's ID number which is new created patient")
    public void click_created_date_and_click_first_patient_s_id_number_which_is_new_created_patient() {
        Driver.waitAndClick(locator.createdDateColumnTitle,1);
        Driver.wait(1);
        System.out.println(locator.firstPatient.getText());
        Driver.wait(1);

    }

    @Then("Verify it has correct id number and same First Name with new created patient.")
    public void verify_it_has_correct_id_number_and_same_first_name_with_new_created_patient() {

        //System.out.println(locator.idCansee.getText());
        locator.firstPatient.isDisplayed();
        //System.out.println(locator.firstnameCanSee.getText());
        //locator.idCansee.isDisplayed();
        locator.firstNameVerify.isDisplayed();  //???
        locator.firstPatient.click();
    }

    @Then("Click Edit button, Enter a new data to Description and save")
    public void click_edit_button_enter_a_new_data_to_description_and_save() {
        Driver.wait(1);
        action.moveToElement(locator.forEditButton).perform();
        Driver.wait(2);
        //locator.patientEditButton.click();
        action.click(locator.patientEditButton).perform();
        Driver.wait(2);
        locator.newPatientDescriptionTextarea.sendKeys("Yenilendi");
        Driver.wait(2);
        Driver.waitAndClick(locator.editPatientSubmitButton,2);
    }

    @Then("Verify admin can not assign patient to a doctor. Negative test BUG there is not a Doctor Assign web element")
    public void verify_admin_can_not_assign_patient_to_a_doctor_negative_test_bug_there_is_not_a_doctor_assign_web_element() {
        System.out.println("Admin can not assign patient to a doctor. BUG, there is not a Doctor Assign web element, I can not verify");
    }

    @Then("Click Items&Titles and click Patients")
    public void click_items_titles_and_click_patients() {
        Driver.waitAndClick(locator.itemsTitlesMenuButton);
        Driver.wait(1);
        Driver.waitAndClick(locator.itemsTitlesPatient);
        Driver.wait(1);
    }

    @Then("Click Created Date and click first patient's ID number")
    public void click_created_date_and_click_first_patient_s_id_number() {
        Driver.clickWithJS(locator.createdDateColumnTitle);
        Driver.wait(1);
        locator.firstPatient.click();
    }

    @Then("Verify ID is correct")
    public void verify_id_is_correct() {
        Assert.assertTrue(locator.idCansee.isEnabled());    //???
    }

    //TC01504
    @Given("mb Click Created Date and select first id which is new created patient")
    public void mb_click_created_date_and_select_first_id_which_is_new_created_patient() {
        action.moveToElement(locator.createdDateColumnTitle);
        Driver.wait(1);
        Driver.clickWithJS(locator.createdDateColumnTitle);
        Driver.wait(1);
        locator.firstPatient.click();
    }

    @Then("mb Verify Country is selected USA")
    public void mb_verify_country_is_selected_usa() {
        action.moveToElement(locator.verifyCountryUSA);
        Driver.wait(1);
        Assert.assertTrue(locator.verifyCountryUSA.getText().contains("USA"));
        Driver.wait(1);
    }

    @Then("mb Verify Country data is not blank")
    public void mb_verify_country_data_is_not_blank() {
        Assert.assertFalse(locator.verifyCountryUSA.getText().isBlank());
        Driver.wait(2);
    }

    //////TC01505
    @Given("mb Click Created Date and click first patient's ID number which is new created patient")
    public void mb_click_created_date_and_click_first_patients_id_number_which_is_new_created_patient() {
        Driver.clickWithJS(locator.createdDateColumnTitle);
        Driver.wait(1);
    }

    @Given("mb Click Delete button and click Delete button on the alert")
    public void mb_click_delete_button_and_click_delete_button_on_the_alert() {
        action.moveToElement(locator.deletePatientButton).perform();
        Driver.wait(2);
        Driver.clickWithJS(locator.deletePatientButton);
        Driver.wait(1);
        locator.deleteButtonFromAlert.click();
        Driver.wait(2);
    }

    @Then("mb Verify if you get a successful deleted message")
    public void mb_verify_if_you_get_a_successful_deleted_message() {
        System.out.println("toast " + locator.deletedToastContainer.getText());
        List<String> deletedToastList= Arrays.asList(locator.deletedToastContainer.getText().split("\\s"));
        System.out.println("deletedToastList = " + deletedToastList);
        //System.out.println("list sonu id"+ deletedToastList.get(7));
        //System.out.println("idkeeper  "+idKeeper);
        Assert.assertTrue(locator.deletedToastContainer.getText().contains("deleted"));
        Driver.wait(1);

    }

    @Then("mb Report this bug")
    public void mb_report_this_bug() {
        // I don/t know how I can report
    }
}
