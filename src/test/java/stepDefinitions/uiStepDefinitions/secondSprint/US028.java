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
    public void fyAdminEntersAnyCountryNameIntoNameTextBox(String countryName) {
        Driver.waitAndSendText(fP.createOrEditACountryPageNameTextBox,countryName,1);
    }

    @Then("FY Admin verifies a new country is not created message is displayed")
    public void fyAdminVerifiesANewCountryIsNotCreatedMessageIsDisplayed() {
        Driver.wait(2);
        Assert.assertFalse(fP.successfullyCreatedANewCountryText.isDisplayed());
    }


    @Then("FY Admin clicks on StateCity button")
    public void fy_admin_clicks_on_state_city_button() {
        Driver.waitAndClick(fP.adminItemsAndTitlesDropdownStateCityButton,1);
    }

    @Then("FY Admin verifies the StatesCities page is displayed")
    public void fy_admin_verifies_the_states_cities_page_is_displayed() {
        Driver.wait(2);
        Assert.assertTrue(fP.stateCityPageStatesCitiesText.isDisplayed());
    }

    @Then("FY Admin clicks on the create a new StateCity button")
    public void fy_admin_clicks_on_the_create_a_new_state_city_button() {
        Driver.waitAndClick(fP.createANewStateCityButton,1);
    }

    @Then("FY Admin verifies the Create or edit a StateCity page is displayed")
    public void fy_admin_verifies_the_create_or_edit_a_state_city_page_is_displayed() {
        Driver.wait(2);
        Assert.assertTrue(fP.createOrEditAStateCityText.isDisplayed());
    }

    @And("FY Admin enters any StateCity name {string} into name text box")
    public void fyAdminEntersAnyStateCityNameIntoNameTextBox(String stateCity) {
        Driver.waitAndSendText(fP.createOrEditAStateCityPageNameTextBox,stateCity,1);
    }


    @Then("FY Admin clicks on StateCity dropdown")
    public void fy_admin_clicks_on_state_city_dropdown() {
        Driver.waitAndClick(fP.createOrEditAStateCityDropDownStateCityBox,1);
    }

    @Then("FY Admin clicks on one country {string}")
    public void fy_admin_clicks_on_one_country(String country) {
        Driver.waitAndClick(fP.aSelectedCountryFromStateCityDropDown,2);
    }

    @Then("FY Admin clicks on save button in Create or edit a StateCity page")
    public void fy_admin_clicks_on_save_button_in_create_or_edit_a_state_city_page() {
        Driver.waitAndClick(fP.createOrEditAStateCityPageSaveButton,1);
    }

    @Then("FY Admin verifies a new StateCity is created message is displayed")
    public void fy_admin_verifies_a_new_state_city_is_created_message_is_displayed() {
        Driver.wait(2);
        String actualData= fP.successfullyCreatedANewStateCityText.getText();
        String expectedData="A new State/City is created";
        Assert.assertTrue("User can not create a new state/city",actualData.contains(expectedData));

     //   Assert.assertFalse(fP.successfullyCreatedANewStateCityText.isDisplayed());

    }



}
