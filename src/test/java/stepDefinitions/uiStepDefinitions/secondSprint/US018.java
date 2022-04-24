package stepDefinitions.uiStepDefinitions.secondSprint;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import pages.PhysicianPage;
import runners.DBRunner;
import utilities.Driver;

public class US018 {

    PhysicianPage physicianPage = new PhysicianPage();

    @Then("click on Item&Titles DropDownMenu and select Physician")
    public void click_on_item_titles_drop_down_menu_and_select_physician() {
        Driver.waitAndClick(physicianPage.itemsTitelsDropdown);
        Driver.wait(2);
        Driver.waitAndClick(physicianPage.physicianDropdown);
    }

    @Then("Verify that Physicians Page Header is visible")
    public void verify_that_physicians_page_header_is_visible() {
        Driver.wait(2);
        Assert.assertTrue(physicianPage.phyisiciansHeader.isDisplayed());
    }

    @Then("click on new physician button")
    public void click_on_new_physician_button() {
        Driver.waitAndClick(physicianPage.createNewPhysician);
    }

    @Then("Verify that Create or edit a Physician Page is displayed")
    public void verify_that_create_or_edit_a_physician_page_is_displayed() {
        Assert.assertTrue(physicianPage.createOrEditPhysician.isDisplayed());
    }

    @Then("click on Use Search checkbox.")
    public void click_on_use_search_checkbox() {
        Driver.waitAndClick(physicianPage.useSSNSearchceckbox);
    }

    @Then("Click on SSN text box")
    public void click_on_ssn_text_box() {
        Driver.waitAndClick(physicianPage.inputSNNTextbox);
    }

    @Then("Enter the {string} number and click search user button")
    public void enter_the_number_and_click_search_user_button(String ssn) {
        physicianPage.inputSNNTextbox.sendKeys(ssn);
        Driver.waitAndClick(physicianPage.searchUserButton);
        Driver.wait(3);
    }

    @Then("Verify that User found with search SSN message is displayed")
    public void verify_that_user_found_with_search_ssn_message_is_displayed() {
        Assert.assertTrue(physicianPage.userFoundWithSearchSSN.isDisplayed());
    }


    @And("Verify that Physicians' info  is visible")
    public void verifyThatPhysiciansInfoIsVisible() {
        Driver.wait(3);
        Assert.assertTrue(physicianPage.PhysiciansPageHeader.isDisplayed());

    }

    @And("click Edit Button")
    public void clickEditButton() throws InterruptedException {
        Driver.wait(5);
       Driver.waitAndClick(physicianPage.editButton);
       // ((JavascriptExecutor)physicianPage).executeScript("arguments[0].scrollIntoView(true);", physicianPage.editButton);
      // Thread.sleep(800);

    }
    @And("click on Delete Button")
    public void clickOnDeleteButton() throws InterruptedException {
        Driver.wait(5);
        Driver.waitAndClick(physicianPage.deleteButton);


    }
}
