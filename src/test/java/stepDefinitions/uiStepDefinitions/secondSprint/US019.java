package stepDefinitions.uiStepDefinitions.secondSprint;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.MehlikaPage;
import utilities.Driver;

import java.util.*;

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
        Driver.wait(1);
        Driver.waitAndClick(locator.administrationButton,2);
        Driver.wait(1);
        locator.userManagementButton.click();
        Driver.wait(1);
        Driver.waitAndClick(locator.staffCeratedDate,2);
        Driver.wait(1);
        action.moveToElement(locator.deactivatedActivatedButton);
        Driver.wait(2);
        Driver.waitAndClick(locator.deactivatedActivatedButton,2);
            Driver.wait(1);
    }

    // TC01902
    @Given("mb Click Cerate A New Staff  button and search your SSN number {string}")
    public void mb_click_cerate_a_n_ew_staff_button_and_search_your_ssn_number(String staffssn) {
        Driver.wait(1);
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
        Driver.wait(1);
    }

    @Given("mb Select Birth Date and Enter Phone number {string}, {string}")
    public void mb_select_birth_date_and_enter_phone_number(String birthdate, String staffphone) {
        locator.newBirthDateInput.sendKeys(birthdate);
        Driver.wait(1);
        locator.newPhoneInput.sendKeys(staffphone);
        Driver.wait(1);
    }

    @Given("mb Select Gender and Blood Group")
    public void mb_select_gender_and_blood_group() {
        Select selectGender = new Select(locator.newGenderSelect);
        selectGender.selectByVisibleText("FEMALE");
        Driver.wait(1);
        Select selectBlood = new Select(locator.newBloodSelect);
        selectBlood.selectByVisibleText("B+");
        Driver.wait(1);
    }

    @Given("mb Enter Address and Description {string},{string}")
    public void mb_enter_address_and_description(String staffaddress, String staffdescription) {
        locator.newAddressInput.sendKeys(staffaddress);
        Driver.wait(1);
        locator.descriptionInput.sendKeys(staffdescription);
        Driver.wait(1);
    }

    @Given("mb Selet User, Country and State City")
    public void mb_selet_user_country_and_state_city() {
        Driver.wait(1);
        Select selectCountry = new Select(locator.newCountrySelect);
        selectCountry.selectByVisibleText("USA");
        Driver.wait(1);
        Select selectState = new Select(locator.newStateSelect);
        selectState.selectByVisibleText("California");
        Driver.wait(1);
        locator.newSaveButton.click();
    }

    @Given("mb Click Save button.")
    public void mb_click_save_button() {
        Driver.waitAndClick(locator.newSaveButton,2);
        Driver.wait(1);
    }

    @Then("mb Verify created successfully message with new ID")
    public void mb_verify_created_successfully_message_with_new_id() {
        Assert.assertTrue(locator.createdToastContainer.getText().contains("created"));
        List<String> toastcontainer= Arrays.asList(locator.createdToastContainer.getText().split("\\s"));
        System.out.println("staffNewID = " + toastcontainer);
        staffNewID=toastcontainer.get(7);
        System.out.println("lastItemID = " + staffNewID);
    }

    @Then("mb Click Created Date from List Row")
    public void mb_click_created_date_from_list_row() {
        Driver.waitAndClick(locator.itemsTitlesMenuButton,3);
        Driver.wait(1);
        locator.itemsTitlesStaff.click();
        Driver.wait(1);
        Driver.waitAndClick(locator.staffCeratedDate,2);
        Driver.wait(1);
    }

    @Then("mb Click first row and last new user and verify data")
    public void mb_click_first_row_and_last_new_user_and_verify_data() {
        Driver.wait(1);
        locator.firstPatientID.click();
        //System.out.println("First id "+ locator.firststaffIDCheck.getText());
        Driver.wait(1);
        //Assert.assertTrue(locator.firststaffIDCheck.isDisplayed());
        System.out.println("Staff New id " +staffNewID);
        System.out.println("Staff id "+locator.staffPageIDCheck.getText());
        Assert.assertEquals(staffNewID,locator.staffPageIDCheck.getText());
        //Assert.assertEquals(staffNewID,locator.firststaffIDCheck.getText());
    }

    // TC01903 User (Admin) can select a user from the existing users (registered people)
    @Given("mb Click Administration button text")
    public void mb_click_administration_button_text() {
        Driver.wait(1);
        Driver.waitAndClick(locator.administrationButton,4);
    }

    @Given("mb Click User Management button text from dropdown box")
    public void mb_click_user_management_button_text_from_dropdown_box() {
        Driver.wait(1);
        Driver.waitAndClick(locator.userManagementButton,2);
        Driver.wait(1);
    }

    @Given("mb Select any user.")
    public void mb_select_any_user() {
        Driver.wait(1);
        Driver.waitAndClick(locator.staffCeratedDate,3);
        Driver.wait(3);
        locator.firststaffIDCheck.click();
        Driver.wait(1);
        System.out.println("staffnewid "+staffNewID);
    }

    @Then("mb Verify selected users all information is visible.")
    public void mb_verify_selected_users_all_information_is_visible() {
//        System.out.println("locator.staffPageIDCheck.getText() = " + locator.staffPageIDCheck.getText());
//        Assert.assertEquals(staffNewID,locator.staffPageIDCheck.getText());
        Assert.assertTrue(locator.idCansee.isDisplayed());
        //Assert.assertTrue(login );
        Assert.assertTrue(locator.firstnameCanSee.isDisplayed());
        Assert.assertTrue(locator.lastnameCanSee.isDisplayed());
        //Assert.assertTrue(locator.cansee);
    }

    // TC01904 - User can edit their info
    @Given("mb Click Items Titles button and Staff button from dropdown box")
    public void mb_click_items_titles_button_and_staff_button_from_dropdown_box() {
        Driver.wait(1);
        Driver.waitAndClick(locator.itemsTitlesMenuButton,2);
        Driver.waitAndClick(locator.itemsTitlesStaff,2);
        Driver.wait(1);
    }

    @Given("mb Find my new staff and click to Edit button")
    public void mb_find_my_new_staff_and_click_to_edit_button() {
        Driver.wait(2);
        Driver.waitAndClick(locator.staffCeratedDate,2);
        Driver.wait(1);
        //locator.firststaffIDCheck.click();
        action.moveToElement(locator.staffEditButton);
        Driver.wait(1);
        Driver.waitAndClick(locator.staffEditButton,2);
        Driver.wait(1);
    }

    @Given("mb Change First name, Last name, Phone and Description {string},{string},{string},{string}")
    public void mb_change_first_name_last_name_phone_and_description (String firstname, String lastname, String phone, String description) {
        Driver.wait(1);
        locator.firstNameInputBox.clear();
        Driver.wait(1);
        locator.firstNameInputBox.sendKeys(firstname);
        Driver.wait(1);
        locator.lastNameInputBox.clear();
        Driver.wait(1);
        locator.lastNameInputBox.sendKeys(lastname);
        Driver.wait(1);
        locator.phoneInputBox.clear();
        Driver.wait(1);
        locator.phoneInputBox.sendKeys(phone);
        Driver.wait(1);
        locator.descriptionInput.clear();
        Driver.wait(1);
        locator.descriptionInput.sendKeys(description);
        Driver.wait(1);
    }

//    @Then("mb Verify activated is selected.")
//    public void mb_verify_activated_is_selected() {
//
//        if(locator.staffEditActivatedCehckbox.getAttribute("value")!="true"){
//            locator.staffEditActivatedCehckbox.click();
//        }
//        Assert.assertEquals("true",locator.staffEditActivatedCehckbox.getAttribute("value"));
//
//    }

    @Then("mbs Click Save button")
    public void mbs_click_save_button() {
        Driver.wait(1);
        Driver.clickWithJS(locator.staffEditSaveButton);
        Driver.wait(1);
    }

    @Then("mb Verify that succesfully message is A user is updated identifier-changed item")
    public void mb_verify_that_succesfully_message_is_a_user_is_updated_identifier_changed_item() {
        System.out.println("Updated Toast = "+locator.updatedToastContainer.getText());
        Driver.wait(1);
        Assert.assertTrue(locator.updatedToastContainer.getText().contains("updated"));
        Driver.wait(1);
    }

    // TC01905 - User can delete their info

    @Given("mb Find my new Staff and click Delete button from Staff Page")
    public void mb_find_my_new_staff_and_click_delete_button_from_staff_page() {
        Driver.wait(1);
        locator.staffCeratedDate.click();
        Driver.wait(1);
        action.moveToElement(locator.staffDeleteButton);
        Driver.wait(1);
        locator.staffDeleteButton.click();
        Driver.wait(1);
        locator.deleteButtonFromAlert.click();
        Driver.wait(1);
        String deletedToast=locator.deletedToastContainer.getText();
        System.out.println("locator.deletedToastContainer.getText() = "+deletedToast);
        Assert.assertTrue(deletedToast.contains("deleted"));

        List<String> deletedToastList= Arrays.asList(locator.deletedToastContainer.getText().split("\\s"));
        System.out.println("deletedToastList = " + deletedToastList);
        System.out.println("idkeep " + staffNewID+"  deleted staff id  " +deletedToastList.get(6));
        Assert.assertEquals(staffNewID,deletedToastList.get(6));
        Driver.wait(1);

    }
    @Given("mb Click Administration and User Management button text from dropdown box")
    public void mb_click_administration_and_user_management_button_text_from_dropdown_box() {
        Driver.waitAndClick(locator.administrationButton,2);
        Driver.waitAndClick(locator.userManagementButton,2);
    }
    @Given("mb Find my new Staff and click Delete button from Users Page")
    public void mb_find_my_new_staff_and_click_delete_button_from_users_page() {
        Driver.wait(1);
        action.moveToElement(locator.administrationCreatedDateColumn);
        Driver.waitAndClick(locator.administrationCreatedDateColumn,1);
        Driver.waitAndClick(locator.administrationUserDeleteButton,2);
        Driver.wait(1);
    }
    @Then("mb Verify user see deleted successfully message A user is deleted identifier - deleted item")
    public void mb_verify_user_see_deleted_successfully_message_a_user_is_deleted_identifier_deleted_item() {
        System.out.println("Administration user deleted = "+locator.deletedToastContainer.getText());
        Assert.assertTrue(locator.deletedToastContainer.getText().contains("deleted"));
        Driver.wait(1);
    }

}
