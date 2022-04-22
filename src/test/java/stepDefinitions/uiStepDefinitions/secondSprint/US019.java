package stepDefinitions.uiStepDefinitions.secondSprint;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.MehlikaPage;

public class US019 {
    MehlikaPage locator=new MehlikaPage();

    @Then("mb Click Administration and User Management button")
    public void mb_click_administration_and_user_management_button() {
        locator.administrationButton.click();
        locator.userManagementButton.click();
    }

    @Then("mb Click Create a new user button")
    public void mb_click_create_a_new_user_button() {
        locator.createANewUser.click();
    }

    @Then("mb Fill in the form {string},{string},{string},{string},{string}")
    public void mb_fill_in_the_form(String login, String firstname, String lastname, String email, String ssn) {
        locator.newUserLoginInput.sendKeys(login);
        locator.newUserFirstNameInput.sendKeys(firstname);
        locator.newUserLastNameInput.sendKeys(lastname);
        locator.newUserEmailInput.sendKeys(email);
        locator.newUserSsnInput.sendKeys(ssn);
        locator.newUserLanguageDropdown.click();   //check
        locator.newUserProfilesStaffOption.click();
        locator.newUserSaveButton.click();
    }

    @Then("mb Verify created is successfully toast container message")
    public void mb_verify_created_is_successfully_toast_container_message() {
        if(locator.newUserSavedToast.isDisplayed())
            Assert.assertTrue(locator.newUserSavedToast.getText().contains("created"));
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
        Assert.assertTrue(locator.staffFoundwithSsnToast.isDisplayed());
        Assert.assertEquals("User found",locator.staffFoundwithSsnToast.getText());
    }
}
