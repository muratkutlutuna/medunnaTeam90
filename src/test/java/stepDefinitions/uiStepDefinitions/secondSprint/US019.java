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
        Driver.waitAndClick(locator.patientCreatedDateColumnTitle,2);
        Driver.wait(1);
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
        Select selectState = new Select(locator.newStateSelect);
        Driver.wait(1);
        selectState.selectByVisibleText("California");
        Driver.wait(1);
        locator.newSaveButton.click();

//        //action.moveToElement(locator.newStateSelect).perform();
//        //Driver.selectAnItemFromDropdown(locator.newUserSelect,"mehlikauser");

//        //Select selectUser=new Select(locator.newUserSelect);
//        //selectUser.selectByValue("89840");
//        //selectUser.selectByVisibleText("mehlikauser");
//        //selectUser.selectByValue("melindaUser");

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
        locator.staffCeratedDate.click();
        Driver.wait(1);
//        Set<String> idSet=new HashSet<>();
//        //List<WebElement> idlist=new ArrayList<>();
//        for(int i=0;i<21;i++) {
//            idSet.add(String.valueOf(locator.staffIDs.get(i)));
//        }
//        System.out.println("idlist = " + idSet);

//        List<WebElement> ids = Driver.getDriver().findElements(By.xpath("//tbody/tr/td[1]/a"));
//        ArrayList <Integer> idArray = new ArrayList<>();
//        for (WebElement id:ids
//        ) {
//            //String fiyatStr = fiyat.getText().replaceAll("$", "");
//            String idss= id.getText().replaceAll("^\\D", "");
//            idArray.add(Integer.parseInt(idss));
//        }
//        for (Integer idList:idArray){
//            idArray.add(idList);
//        }
//        System.out.println("ids = " + ids.get(0));
//        System.out.println("idArray = " + idArray);

//        Set<String> idlerim = new HashSet<>();

//        for (int i=0;i>21;i++){
//            String x= String.valueOf(locator.staffIDs.get(i));
//                    //Driver.getDriver().findElements(By.xpath("//tbody/tr/td[1]/a"))..get(i);
//            idlerim.add(x);
//        }
//        System.out.println("idlerim = " + idlerim);

//        By mySelector = By.xpath("//tbody/tr/td[1]/a\")");
//        List<WebElement> myids = Driver.getDriver().findElements(mySelector);
//        for(WebElement e : myids) {
//            System.out.println(e.getText());
//        }

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
        Driver.waitAndClick(locator.userManagementButton,3);
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
        Assert.assertEquals(staffNewID,locator.staffPageIDCheck.getText());
        Assert.assertTrue(locator.idCansee.isDisplayed());
        Assert.assertTrue(locator.firstnameCanSee.isDisplayed());
    }

    // TC01904 - User can edit their info
    @Given("mb Click Administration button and User Management button from dropdown box")
    public void mb_click_administration_button_and_user_management_button_from_dropdown_box() {
        Driver.wait(1);
        Driver.waitAndClick(locator.administrationButton,2);
        Driver.waitAndClick(locator.userManagementButton,2);
        Driver.wait(1);


    }

    @Given("mb Select any user and click to Edit button")
    public void mb_select_any_user_and_click_to_edit_button() {
        Driver.wait(2);
        Driver.waitAndClick(locator.staffCeratedDate,2);
        Driver.wait(1);
        locator.firststaffIDCheck.click();
        action.moveToElement(locator.staffEditButton);
        Driver.wait(1);
        Driver.waitAndClick(locator.staffEditButton,2);
    }

    @Given("mb Change Login, First name, Last name, Email, SSN and Language {string},{string},{string},{string},{string}")
    public void mb_change_login_first_name_last_name_email_ssn_and_language(String login, String firstname, String lastname, String email, String ssn) {

    }

    @Then("mb Verify activated is selected.")
    public void mb_verify_activated_is_selected() {

    }

    @Then("mbs Click Save button")
    public void mbs_click_save_button() {

    }

    @Then("mb Verify that succesfully message is A user is updated identifier-changed item")
    public void mb_verify_that_succesfully_message_is_a_user_is_updated_identifier_changed_item() {

    }

    // TC01905 - User can delete their info
    @Given("mb Navigate to the home page")
    public void mb_navigate_to_the_home_page() {

    }

    @Given("mb Click Administration and User Management button text from dropdown box")
    public void mb_click_administration_and_user_management_button_text_from_dropdown_box() {

    }

    @Given("mb Select any user and click Delete button.")
    public void mb_select_any_user_and_click__delete_button() {

    }

    @Given("mb Click Delete from pop up")
    public void mb_click_delete_from_pop_up() {

    }

    @Then("mb Verify user see deleted successfully message A user is deleted identifier - deleted item")
    public void mb_verify_user_see_deleted_successfully_message_a_user_is_deleted_identifier_deleted_item() {

    }


}
