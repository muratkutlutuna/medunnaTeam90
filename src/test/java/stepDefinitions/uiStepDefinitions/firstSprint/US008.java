package stepDefinitions.uiStepDefinitions.firstSprint;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.FatihPage;
import utilities.Driver;

public class US008 {
    FatihPage fP=new FatihPage();

    @Given("FY User clicks on sign in button under human icon at homepage")
    public void fy_user_clicks_on_sign_in_button_under_human_icon_at_homepage() {
        Driver.waitAndClick(fP.homePageSignIn,2);
        Driver.wait(2);
    }
    @Given("FY User sends username {string} and password {string} in sign in page")
    public void fy_user_sends_username_and_password_in_sign_in_page(String username, String password) {
        Driver.waitAndSendText(fP.doctorUserName,username,1);
        Driver.waitAndSendText(fP.doctorPassword,password,1);

    }
    @Given("FY User clicks on sign in button in sign in page")
    public void fy_user_clicks_on_sign_in_button_in_sign_in_page() {
        Driver.waitAndClick(fP.doctorSignInButton,2);
        Driver.wait(3);
    }
    @Given("FY User clicks on human icon account menu in userPage")
    public void fy_user_clicks_on_human_icon_account_menu_in_user_page() {
        Driver.waitAndClick(fP.userPageAccounMenu,2);
    }
    @Given("FY User clicks on password button in dropdown menu")
    public void fy_user_clicks_on_password_button_in_dropdown_menu() {
        Driver.waitAndClick(fP.userPagePasswordButton,2);
        Driver.wait(3);
    }
    @Given("FY User sends his current password {string} to current password part")
    public void fy_user_sends_his_current_password_to_current_password_part(String currentPassword) {
        Driver.waitAndSendText(fP.userCurrentPassword,currentPassword,1);
    }
    @Given("FY User sends his new password {string} to new password part")
    public void fy_user_sends_his_new_password_to_new_password_part(String newPassword) {
        Driver.waitAndSendText(fP.userNewPassword,newPassword,1);
    }
    @Given("FY User sends his confirmation password {string} to confirmation password part")
    public void fy_user_sends_his_confirmation_password_to_confirmation_password_part(String confirmationPassword) {
        Driver.waitAndSendText(fP.userConfirmationPassword,confirmationPassword,1);
    }
    @Given("FY User clicks on the save button in password page")
    public void fy_user_clicks_on_the_save_button_in_password_page() {
        Driver.waitAndClick(fP.userPasswordSaveButton,3);
    }
    @Given("FY User validates toast container success message")
    public void fy_user_validates_toast_container_success_message() {
        Driver.wait(2);
        Assert.assertTrue(fP.passwordChangedToastContainerSuccessMessage.isDisplayed());
        Driver.wait(5);
    }

    @Then("FY User clicks on Sign out button")
    public void fyUserClicksOnSignOutButton() {
        Driver.waitAndClick(fP.userPageAccounMenu,1);
        Driver.waitAndClick(fP.userSignOutButton,1);
    }

    @And("FY User validates toast container failure message")
    public void fyUserValidatesToastContainerFailureMessage() {
        Driver.wait(2);
        Assert.assertFalse(fP.passwordChangedToastContainerSuccessMessage.isDisplayed());
        Driver.wait(5);
    }
}
