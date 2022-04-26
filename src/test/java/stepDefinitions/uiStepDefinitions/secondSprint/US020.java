package stepDefinitions.uiStepDefinitions.secondSprint;



import io.cucumber.java.en.Then;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.SezginPage;
import utilities.ConfigurationReader;
import utilities.Driver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class US020 {
    SezginPage sezginPage=new SezginPage();
    Select select;
    public static String getScreenshot(String name) throws IOException {
        // naming the screenshot with the current date to avoid duplication
        String date = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
        // TakesScreenshot is an interface of selenium that takes the screenshot
        TakesScreenshot ts = (TakesScreenshot) Driver.getDriver();
        File source = ts.getScreenshotAs(OutputType.FILE);
        // full path to the screenshot location
        String target = System.getProperty("user.dir") + "/test-output/Screenshots/" + name + date + ".png";
        File finalDestination = new File(target);
        // save the screenshot to the path given
        FileUtils.copyFile(source, finalDestination);
        return target;
    }


    @Then("S user logins as admin")
    public void s_user_logins_as_admin() {
        sezginPage.userItemTop.click();
        sezginPage.signinEl.click();
        sezginPage.usernameBox.sendKeys(ConfigurationReader.getProperty("MedValidUsernameAdmin"));
        sezginPage.passwordBox.sendKeys(ConfigurationReader.getProperty("MedValidPasswordAdmin"));
        sezginPage.signinButton.click();
    }
    @Then("S user clicks administration button")
    public void s_user_clicks_administration_button() {
        Driver.waitAndClick(sezginPage.administrationElement);

    }
    @Then("S user clicks user management button")
    public void s_user_clicks_user_management_button() {
        Driver.waitAndClick(sezginPage.userManagementElement);
    }
    @Then("S user clicks view button for a registered person")
    public void s_user_clicks_view_button_for_a_registered_person() throws InterruptedException {
        Driver.waitAndClick(sezginPage.userViewButton);
        Thread.sleep(3000);
    }
    @Then("S user asserts the visibility of info page")
    public void s_user_asserts_the_visibility_of_info_page() throws IOException {
        getScreenshot("UserInfo");
    }
    @Then("S user navigates back")
    public void s_user_navigates_back() {
        Driver.getDriver().navigate().back();
    }

    @Then("S user clicks edit button for a registered person")
    public void s_user_clicks_edit_button_for_a_registered_person() {
        Driver.waitAndClick(sezginPage.userEditButton);

    }
    @Then("S user clicks activate checkbox to activate the person")
    public void s_user_clicks_activate_checkbox_to_activate_the_person() {
        Driver.waitAndClick(sezginPage.activatedCheckBox);
    }
    @Then("S user gives the person admin role from the profiles")
    public void s_user_gives_the_person_admin_role_from_the_profiles() {
        WebElement dropdownEl= sezginPage.profilesDropdownEl;
        Driver.waitForVisibility(dropdownEl, 5);
        select = new Select(dropdownEl);
        select.selectByValue("ROLE_ADMIN");

    }
    @Then("S user saves the changes")
    public void s_user_saves_the_changes() {
        Driver.waitAndClick(sezginPage.saveUserChangesButton);

    }

    @Then("S user gives the person user role from the profiles")
    public void s_user_gives_the_person_user_role_from_the_profiles() {
        WebElement dropdownEl= sezginPage.profilesDropdownEl;
        Driver.waitForVisibility(dropdownEl, 5);
        select = new Select(dropdownEl);
        select.selectByValue("ROLE_USER");
    }

    @Then("S user gives the person patient role from the profiles")
    public void s_user_gives_the_person_patient_role_from_the_profiles() {
        WebElement dropdownEl= sezginPage.profilesDropdownEl;
        Driver.waitForVisibility(dropdownEl, 5);
        select = new Select(dropdownEl);
        select.selectByValue("ROLE_PATIENT");
    }

    @Then("S user gives the person staff role from the profiles")
    public void s_user_gives_the_person_staff_role_from_the_profiles() {
        WebElement dropdownEl= sezginPage.profilesDropdownEl;
        Driver.waitForVisibility(dropdownEl, 5);
        select = new Select(dropdownEl);
        select.selectByValue("ROLE_STAFF");
    }

    @Then("S user gives the person physician role from the profiles")
    public void s_user_gives_the_person_physician_role_from_the_profiles() {
        WebElement dropdownEl= sezginPage.profilesDropdownEl;
        Driver.waitForVisibility(dropdownEl, 5);
        select = new Select(dropdownEl);
        select.selectByValue("ROLE_PHYSICIAN");
    }

    @Then("S user clicks delete button for a registered person")
    public void s_user_clicks_delete_button_for_a_registered_person() {

    }
    @Then("S user confirms the delete operation")
    public void s_user_confirms_the_delete_operation() {

    }
    @Then("S user asserts that he can delete the user")
    public void s_user_asserts_that_he_can_delete_the_user() {

    }




}
