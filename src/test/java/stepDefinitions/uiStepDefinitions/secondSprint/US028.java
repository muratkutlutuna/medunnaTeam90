package stepDefinitions.uiStepDefinitions.secondSprint;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.FatihPage;
import utilities.Driver;

public class US028 {

    FatihPage fP=new FatihPage();

    @Then("FY Admin clicks on Country button")
    public void fy_admin_clicks_on_country_button() {
        Driver.waitAndClick(fP.adminItemsAndTitlesDropdownCountryButton);
    }
    @Then("FY Admin verifies the Countries page is displayed")
    public void fy_admin_verifies_the_countries_page_is_displayed() {
        Driver.wait(2);
        Assert.assertTrue(fP.countryPageCountriesText.isDisplayed());
    }
    @Then("FY Admin clicks on the create a new Country button")
    public void fy_admin_clicks_on_the_create_a_new_country_button() {
        Driver.waitAndClick(fP.createANewCountryButton,1);
    }
    @Then("FY Admin verifies the Create or edit a Country page is displayed")
    public void fy_admin_verifies_the_create_or_edit_a_country_page_is_displayed() {
        Driver.wait(2);
        Assert.assertTrue(fP.createOrEditACountryText.isDisplayed());
    }
    @Then("FY Admin enters any country name into name text box")
    public void fy_admin_enters_any_country_name_into_name_text_box() {
        Driver.waitAndSendText(fP.createOrEditACountryPageNameTextBox,"The United Kingdom",1);
    }
    @Then("FY Admin clicks on save button in Create or edit a Country page")
    public void fy_admin_clicks_on_save_button_in_create_or_edit_a_country_page() {
        Driver.waitAndClick(fP.createOrEditACountryPageSaveButton,1);
    }
    @Then("FY Admin verifies a new country is created message is displayed")
    public void fy_admin_verifies_a_new_country_is_created_message_is_displayed() {
        Driver.wait(2);
        Assert.assertTrue(fP.successfullyCreatedANewCountryText.isDisplayed());
    }


    @And("FY Admin enters any country name {string} into name text box")
    public void fyAdminEntersAnyCountryNameIntoNameTextBox(String arg0) {
    }


    @Then("FY Admin clicks on StateCity button")
    public void fy_admin_clicks_on_state_city_button() {

    }

    @Then("FY Admin verifies the StatesCities page is displayed")
    public void fy_admin_verifies_the_states_cities_page_is_displayed() {

    }

    @Then("FY Admin clicks on the create a new StateCity button")
    public void fy_admin_clicks_on_the_create_a_new_state_city_button() {

    }

    @Then("FY Admin verifies the Create or edit a StateCity page is displayed")
    public void fy_admin_verifies_the_create_or_edit_a_state_city_page_is_displayed() {

    }

    @Then("FY Admin enters any StateCity name \"Liverpoolinto name text box")
    public void fy_admin_enters_any_state_city_name_liverpoolinto_name_text_box() {

    }

    @Then("FY Admin clicks on StateCity dropdown")
    public void fy_admin_clicks_on_state_city_dropdown() {

    }

    @Then("FY Admin clicks on one country {string}")
    public void fy_admin_clicks_on_one_country(String string) {

    }

    @Then("FY Admin clicks on save button in Create or edit a StateCity page")
    public void fy_admin_clicks_on_save_button_in_create_or_edit_a_state_city_page() {

    }

    @Then("FY Admin verifies a new StateCity is created message is displayed")
    public void fy_admin_verifies_a_new_state_city_is_created_message_is_displayed() {

    }


}
