package stepDefinitions.uiStepDefinitions.firstSprint;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.MehlikaPage;
import utilities.ConfigurationReader;
import utilities.Driver;

import java.time.LocalDate;

public class US005{
    MehlikaPage mehlikaPage = new MehlikaPage();

    @Before
    @Given("MB Launch web browser and navigate to the home page")
    public void mb_launch_web_browser_and_navigate_to_the_home_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("medunnaUrl"));
    }

    @Then("MB Verify the Make an Appointment button is visible and clickable")
    public void mb_verify_the_make_an_appointment_button_is_visible_and_clickable() {
        Assert.assertTrue(mehlikaPage.makeAnAppointmentButton.isDisplayed());
        Assert.assertTrue(mehlikaPage.makeAnAppointmentButton.isEnabled());
    }

    @Given("MB Click the Make an Appointment button")
    public void mb_click_the_make_an_appointment_button() {
        mehlikaPage.makeAnAppointmentButton.click();
    }

    @Then("MB Verify Make an Appointment request form can be seen")
    public void mb_verify_make_an_appointment_request_form_can_be_seen() {
        Assert.assertTrue(mehlikaPage.makeAppoinmentTitle.isDisplayed());
        Assert.assertTrue(mehlikaPage.appointmentRequestButton.isDisplayed());
    }

    @Then("MB Click First Name textbox and Enter First Name {string}")
    public void mb_click_first_name_textbox_and_enter_first_name(String mfirstname) {
        Driver.wait(1);
        Actions actions=new Actions(Driver.getDriver());
        actions.moveToElement(mehlikaPage.appointmentRequestForm).perform();
        mehlikaPage.lastNameInputBox.click();
        mehlikaPage.firstNameInputBox.sendKeys(ConfigurationReader.getProperty(mfirstname));
    }

    @Then("MB Verify First Name textbox is not blank")
    public void mb_verify_first_name_textbox_is_not_blank() {
        //Driver.wait(1);
        Assert.assertFalse(mehlikaPage.firstNameInputBox.getAttribute("value").isBlank());
      }

    @Then("MB Verify user is using characters for the First Name textbox")
    public void mb_verify_user_is_using_characters_for_the_first_name_textbox() {
//        String firstNameIsBlank=mehlikaPage.firstNameInputBox.getAttribute("value").replaceAll("\\w","");
//        Assert.assertEquals(0,firstNameIsBlank.length());
        Assert.assertEquals(0,(mehlikaPage.firstNameInputBox.getAttribute("value").replaceAll("\\w","")).length());
    }

    @Then("MB Click the Last Name textbox and enter Last Name {string}")
    public void mb_click_the_last_name_textbox_and_enter_last_name(String mlastname) {
        mehlikaPage.lastNameInputBox.click();
        mehlikaPage.lastNameInputBox.sendKeys(ConfigurationReader.getProperty(mlastname)+Keys.ENTER);
    }

    @Then("MB Verify Last Name textbox is not blank")
    public void mb_verify_last_name_textbox_is_not_blank_warning() {
        Assert.assertFalse(mehlikaPage.lastNameInputBox.getAttribute("value").isEmpty());
    }

    @Then("MB Verify user is using characters for the Last Name textbox")
    public void mb_verify_user_is_using_characters_for_the_last_name_textbox() {
        Assert.assertEquals(0,(mehlikaPage.lastNameInputBox.getAttribute("value").replaceAll("\\w","")).length());
    }

    @Then("MB Click the SSN textbox and enter SSN number {string}")
    public void mb_click_the_ssn_textbox_and_enter_ssn_number(String mssn) {
        mehlikaPage.ssnInputBox.click();
        mehlikaPage.ssnInputBox.sendKeys(ConfigurationReader.getProperty(mssn));
    }

    @Then("MB Verify SSN textbox is not blank")
    public void mb_verify_ssn_textbox_is_not_blank() {
        Assert.assertFalse(mehlikaPage.ssnInputBox.getAttribute("value").isEmpty());
    }

    @Then("MB Verify user is using digits for SSN textbox")
    public void mb_verify_user_is_using_digits_for_ssn_textbox() {
        Assert.assertEquals(0,mehlikaPage.ssnInputBox.getAttribute("value").replaceAll("[\\d,-]","").length());
    }

    @Then("MB Verify this SSN is same as a registered SSN")
    public void mb_verify_this_ssn_is_same_as_a_registered_ssn() {

    }

    @Then("MB Click Email textbox and enter a valid Email address {string}")
    public void mb_click_email_textbox_and_enter_a_valid_email_address(String memail) {
        mehlikaPage.emailInputBox.click();
        mehlikaPage.emailInputBox.sendKeys(ConfigurationReader.getProperty(memail));
    }

    @Then("MB Verify Email textbox is not blank")
    public void mb_verify_email_textbox_is_not_blank() {
        Assert.assertFalse(mehlikaPage.emailInputBox.getAttribute("value").isEmpty());
    }

    @Then("MB Verify user uses @ and . sign")
    public void mb_verify_user_uses_and_sign() {
        String emailInputBoxAttribute= mehlikaPage.emailInputBox.getAttribute("value");
        Assert.assertTrue(emailInputBoxAttribute.contains("@")&&emailInputBoxAttribute.contains("."));
        Assert.assertTrue(mehlikaPage.emailInputBox.getAttribute("value").contains("@")&&emailInputBoxAttribute.contains("."));
    }

    @Then("MB Verify this number have dash after third and sixth digits")
    public void mb_verify_this_number_have_dash_after_third_and_sixth_digits() {

    }

    @Then("MB Click the Phone textbox and enter a valid Phone number {string}")
    public void mb_click_the_phone_textbox_and_enter_a_valid_phone_number(String mphone) throws InterruptedException {
        mehlikaPage.phoneInputBox.click();
        mehlikaPage.phoneInputBox.sendKeys(ConfigurationReader.getProperty(mphone));
    }

    @Then("MB Verify that user is using digits for Phone textbox")
    public void mb_verify_that_user_is_using_digits_for_phone_textbox() {
        Assert.assertEquals(0,mehlikaPage.phoneInputBox.getAttribute("value").replaceAll("[\\d,-]","").length());
    }

    @Then("MB Verify that this Phone textbox is not blank")
    public void mb_verify_that_this_phone_textbox_is_not_blank() {
        Assert.assertFalse(mehlikaPage.phoneInputBox.getAttribute("value").isEmpty());
    }

    @Then("MB Click the Appointment DateTime dropbox and select a valid date")
    public void mb_click_the_appointment_datetime_dropbox_and_select_a_valid_date(){
        mehlikaPage.dateTimeInputBox.click();
        mehlikaPage.dateTimeInputBox.sendKeys("6"+"25"+Keys.TAB);
    }

    @Then("MB Verify selected date is one of following days")
    public void mb_verify_selected_date_is_one_of_following_days() {
        String date=mehlikaPage.dateTimeInputBox.getAttribute("value");
        String year=date.substring(0,4);
        String month=date.substring(5,7);
        String day=date.substring(8,10);
        System.out.println("date = " + date+"\nyear = " + year+"\nmonth = " + month+"\nday = " + day);
        LocalDate actualDate= LocalDate.now();
        System.out.println("actual year = " + actualDate.getYear()+"\nactual month "+actualDate.getMonthValue()+"\nactual day "+actualDate.getDayOfMonth());


        if (Integer.parseInt(year)==actualDate.getYear()){
            Assert.assertTrue(Integer.parseInt(year)==actualDate.getYear());
            Assert.assertTrue(Integer.parseInt(month)>= actualDate.getMonthValue());
            Assert.assertTrue(Integer.parseInt(day)>= actualDate.getDayOfMonth());
        } else if(Integer.parseInt(year)<actualDate.getYear()){
            Assert.assertTrue(Integer.parseInt(year)==actualDate.getYear());
        }else{
            Assert.assertTrue(Integer.parseInt(year)==actualDate.getYear());
        }
    }

    @Then("MB Click Send An Appointment Request button")
    public void mb_click_send_an_appointment_request_button() {
        mehlikaPage.appointmentRequestButton.click();
    }

    @Then("MB Verify appointment success message which is {string}")
    public void mb_verify_appointment_success_message_which_is(String string) throws InterruptedException {
        Assert.assertTrue(mehlikaPage.appointmentSavedToast.isDisplayed());
    }
//
    @Then("MB Click Account Menu dropbox sign and click Sign In")
    public void mb_click_account_menu_dropbox_sign_and_click_sign_in() {
        mehlikaPage.accountMenu.click();
    }

    @Then("MB Click User Name textbox and enter a valid user name {string}")
    public void mb_click_user_name_textbox_and_enter_a_valid_user_name(String musername) {
//        mehlikaPage.signInUsername.click();
//        mehlikaPage.signInUsername.sendKeys(ConfigurationReader.getProperty(musername));
    }
//
    @Then("MB Click Password textbox and enter a valid password {string}")
    public void mb_click_password_textbox_and_enter_a_valid_password(String mpassword) {
//        mehlikaPage.signInPassword.click();
//        mehlikaPage.signInPassword.sendKeys(ConfigurationReader.getProperty(mpassword));
    }

    @Then("MB Click Sign In button")
    public void mb_click_sign_in_button() {
//        mehlikaPage.signInSubmit.click();
    }

    @Then("MB Verify sign in is successfully")
    public void mb_verify_sign_in_is_successfully() {
//        String exSignInSuccessWarning="Melinda Patient";
//        String actSignInSuccessWarning=mehlikaPage.melindaPatientAccount.getText();
//        System.out.println("actSignInSuccessWarning = " + actSignInSuccessWarning);
    }
}