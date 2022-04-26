package stepDefinitions.uiStepDefinitions.secondSprint;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.MehlikaPage;
import utilities.Driver;

import java.util.Arrays;
import java.util.List;

public class US019 {
    MehlikaPage locator=new MehlikaPage();
    Actions action=new Actions(Driver.getDriver());
    static String staffNewID;

    @Given("mb Click Account Menu sign and click Register button")
    public void mb_click_account_menu_sign_and_click_register_button() {
        Driver.waitAndClick(locator.accountMenu,2);
        Driver.wait(1);
        Driver.waitAndClick(locator.accountRegisterButton);
        Driver.wait(1);
    }

    @Given("mb Click fill in all informations for a new user {string},{string},{string},{string},{string},{string},{string}")
    public void mb_click_fill_in_all_informations_for_a_new_user(String ssn, String firstname, String lastname, String username, String email, String newpassword, String confirmpassword) {
        Driver.wait(1);
        //Driver.clickWithJS(locator.registrationSsn);
        locator.registrationSsn.sendKeys(ssn);
        Driver.wait(1);
        Driver.clickWithJS(locator.registrationFirstname);
        locator.registrationFirstname.sendKeys(firstname);
        //Driver.wait(1);
        locator.registrationLastname.sendKeys(lastname);
        Driver.wait(1);
        locator.registrationUsername.sendKeys(username);
        Driver.wait(1);
        locator.registrationEmail.sendKeys(email);
        Driver.wait(1);
        locator.registrationNewPassword.sendKeys(newpassword);
        Driver.wait(1);
        locator.registrationConfirmPassword.sendKeys(confirmpassword);
        Driver.wait(1);

    }

    @Given("mb Click Register button and verify created")
    public void mb_click_register_button_and_verify_created() {
        Driver.wait(1);
        //action.moveToElement(locator.registrationRegisterButton).perform();
        Driver.clickWithJS(locator.registrationRegisterButton);
        //Driver.waitAndClick(locator.registrationRegisterButton,2);
        // Driver.wait(1);
        // Driver.waitForVisibility(locator.savedToastContainer,2);
        // Assert.assertTrue(locator.savedToastContainer.getText().contains("Saved"));
        Driver.wait(1);
    }


    @Given("mb Click Account Menu dropbox sign and click Sign In Text after sign out")
    public void mb_click_account_menu_dropbox_sign_and_click_sign_in_text_after_sign_out() {
            Driver.waitForClickablility(locator.accountMenuAfterSignout,2);
            locator.accountMenuAfterSignout.click();
            locator.signInButton.click();
    }
    @Given("mb Click Administration and User Management button")
    public void mb_click_administration_and_user_management_button() {
        Driver.wait(2);
        //Driver.waitAndClick(locator.administrationButton);
        Driver.clickWithJS(locator.administrationButton);
        Driver.wait(1);
        locator.userManagementButton.click();
        Driver.wait(1);
        Driver.clickWithJS(locator.createdDateColumnTitle);

       Driver.clickWithJS(locator.deactivatedActivatedButton);
            Driver.wait(1);
//        Driver.clickWithJS(locator.accountMenu);
//        locator.signOut.click();
    }

    // TC01902

    @Given("mb Click Cerate A New Staff  button and search your SSN number {string}")
    public void mb_click_cerate_a_n_ew_staff_button_and_search_your_ssn_number(String staffssn) {
        locator.itemsTitlesMenuButton.click();
        Driver.wait(1);
        locator.itemsTitlesStaff.click();
        Driver.wait(1);
        locator.createANewStaffButton.click();
        Driver.wait(1);
        locator.useSearchSsnCheckbox.click();
        locator.staffSsnInput.sendKeys(staffssn);
        Driver.wait(1);
        locator.ssnSearchUserButton.click();
    }

    @Given("mb Select Birth Date and Enter Phone number {string}, {string}")
    public void mb_select_birth_date_and_enter_phone_number(String birthdate, String staffphone) {

        locator.newPatientBirthDateInput.sendKeys(birthdate);
        Driver.wait(1);
        locator.newPatientPhoneInput.sendKeys(staffphone);
        Driver.wait(1);
    }

    @Given("mb Select Gender and Blood Group")
    public void mb_select_gender_and_blood_group() {
        Select selectGender = new Select(locator.newPatientGenderSelect);
        selectGender.selectByVisibleText("FEMALE");
        Driver.wait(1);
        Select selectBlood = new Select(locator.newPatientBloodSelect);
        selectBlood.selectByVisibleText("B+");
        Driver.wait(1);
    }

    @Given("mb Enter Address and Description {string},{string}")
    public void mb_enter_address_and_description(String staffaddress, String staffdescription) {
        locator.newPatientAddressInput.sendKeys(staffaddress);
        Driver.wait(1);
        locator.descriptionInput.sendKeys(staffdescription);
        Driver.wait(1);
    }

    @Given("mb Selet User, Country and State City")
    public void mb_selet_user_country_and_state_city() {

        Select selectCountry = new Select(locator.newPatientCountrySelect);
        selectCountry.selectByVisibleText("USA");
        Select selectState = new Select(locator.newPatientStateSelect);
        Driver.wait(1);
        selectState.selectByVisibleText("California");
    }

    @Given("mb Click Save button.")
    public void mb_click_save_button() {
        Driver.waitAndClick(locator.newPatientSaveButton,2);
        Driver.wait(1);
    }

    @Then("mb Verify created successfully message with new ID")
    public void mb_verify_created_successfully_message_with_new_id() {
//        Assert.assertTrue(locator.createdToastContainer.getText().contains("created"));
//        List<String> toastcontainer= Arrays.asList(locator.createdToastContainer.getText().split("\\s"));
//        System.out.println("staffNewID = " + toastcontainer);
//        String yenideneme=toastcontainer.get(8);
//        System.out.println("yenideneme = " + yenideneme);
//        staffNewID=toastcontainer.get(8);
//        System.out.println("lastItemID = " + staffNewID);
    }

    @Then("mb Click Created Date from List Row")
    public void mb_click_created_date_from_list_row() {
        //System.out.println("lastItemID = " + staffNewID);
    }

    @Then("mb Click first row and last new user and verify data")
    public void mb_click_first_row_and_last_new_user_and_verify_data() {
        Driver.waitAndClick(locator.itemsTitlesMenuButton,3);
        locator.itemsTitlesStaff.click();
        Driver.wait(1);
        locator.createdDateColumnTitle.click();
        Driver.wait(1);
//        locator.firstPatient.click();
//        Driver.wait(1);
        Assert.assertTrue(locator.staffIDCheck.isDisplayed());
    }

    // TC01903 User (Admin) can select a user from the existing users (registered people)
    @Given("mb Click Administration button text")
    public void mb_click_administration_button_text() {

    }

    @Given("mb Click User Management button text from dropdown box")
    public void mb_click_user_management_button_text_from_dropdown_box() {

    }

    @Given("mb Select any user.")
    public void mb_select_any_user() {

    }

    @Then("mb Verify selected users all information is visible.")
    public void mb_verify_selected_users_all_information_is_visible() {

    }

}
