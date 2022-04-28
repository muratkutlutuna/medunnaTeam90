package stepDefinitions.uiStepDefinitions.firstSprint;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.MehlikaPage;
import utilities.ConfigurationReader;
import utilities.Driver;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class US005{
    MehlikaPage locator = new MehlikaPage();
    Actions actions=new Actions(Driver.getDriver());
    static String appointmentMessage;

    @Given("MB Launch web browser and navigate to the home page")
    public void mb_launch_web_browser_and_navigate_to_the_home_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("medunnaUrl"));
    }

    @Then("MB Verify the Make an Appointment button is visible and clickable")
    public void mb_verify_the_make_an_appointment_button_is_visible_and_clickable() {
        Assert.assertTrue(locator.makeAnAppointmentButton.isDisplayed());
        Assert.assertTrue(locator.makeAnAppointmentButton.isEnabled());
    }

    @Given("MB Click the Make an Appointment button")
    public void mb_click_the_make_an_appointment_button() {
        Driver.waitAndClick(locator.makeAnAppointmentButton);
        Driver.wait(1);
    }

    @Then("MB Verify Make an Appointment request form can be seen")
    public void mb_verify_make_an_appointment_request_form_can_be_seen() {
        Assert.assertTrue(locator.makeAppoinmentTitle.isDisplayed());
        Assert.assertTrue(locator.appointmentRequestButton.isDisplayed());
    }

    @Then("MB Click First Name textbox and Enter First Name {string}")
    public void mb_click_first_name_textbox_and_enter_first_name(String mfirstname) {
        locator.lastNameInputBox.click();
        locator.firstNameInputBox.sendKeys(mfirstname);
    }

    @Then("MB Verify First Name textbox is not blank")
    public void mb_verify_first_name_textbox_is_not_blank() {
        Assert.assertFalse(locator.firstNameInputBox.getAttribute("value").isBlank());
      }

    @Then("MB Verify user is using characters for the First Name textbox")
    public void mb_verify_user_is_using_characters_for_the_first_name_textbox() {
        Assert.assertEquals(0,(locator.firstNameInputBox.getAttribute("value").replaceAll("\\w","")).length());
    }

    @Then("MB Click the Last Name textbox and enter Last Name {string}")
    public void mb_click_the_last_name_textbox_and_enter_last_name(String mlastname) {
        locator.lastNameInputBox.click();
        locator.lastNameInputBox.sendKeys(mlastname);
    }

    @Then("MB Verify Last Name textbox is not blank")
    public void mb_verify_last_name_textbox_is_not_blank_warning() {
        Assert.assertFalse(locator.lastNameInputBox.getAttribute("value").isEmpty());
    }

    @Then("MB Verify user is using characters for the Last Name textbox")
    public void mb_verify_user_is_using_characters_for_the_last_name_textbox() {
        Assert.assertEquals(0,(locator.lastNameInputBox.getAttribute("value").replaceAll("\\w","")).length());
    }

    @Then("MB Click the SSN textbox and enter SSN number {string}")
    public void mb_click_the_ssn_textbox_and_enter_ssn_number(String mssn) {
        locator.ssnInputBox.click();
        locator.ssnInputBox.sendKeys(mssn);
    }

    @Then("MB Verify SSN textbox is not blank")
    public void mb_verify_ssn_textbox_is_not_blank() {
        Assert.assertFalse(locator.ssnInputBox.getAttribute("value").isEmpty());
    }

    @Then("MB Verify user is using digits for SSN textbox")
    public void mb_verify_user_is_using_digits_for_ssn_textbox() {
        Assert.assertEquals(0, locator.ssnInputBox.getAttribute("value").replaceAll("[\\d,-]","").length());
    }

    @Then("MB Verify this SSN is same as a registered SSN")
    public void mb_verify_this_ssn_is_same_as_a_registered_ssn() {
        Assert.assertEquals("100-20-3105", locator.ssnInputBox.getAttribute("value"));
    }

    @Then("MB Click Email textbox and enter a valid Email address {string}")
    public void mb_click_email_textbox_and_enter_a_valid_email_address(String memail) {
        locator.emailInputBox.click();
        locator.emailInputBox.sendKeys(memail);
    }

    @Then("MB Verify Email textbox is not blank")
    public void mb_verify_email_textbox_is_not_blank() {
        Assert.assertFalse(locator.emailInputBox.getAttribute("value").isEmpty());
    }

    @Then("MB Verify user uses @ and . sign")
    public void mb_verify_user_uses_and_sign() {
        Assert.assertTrue(locator.emailInputBox.getAttribute("value").contains("@")&& locator.emailInputBox.getAttribute("value").contains("."));
    }

    @Then("MB Click the Phone textbox and enter a valid Phone number {string}")
    public void mb_click_the_phone_textbox_and_enter_a_valid_phone_number(String mphone) {
        locator.phoneInputBox.click();
        locator.phoneInputBox.sendKeys(mphone);
    }

    @Then("MB Verify this number have dash after third and sixth digits")
    public void mb_verify_this_number_have_dash_after_third_and_sixth_digits() {
        System.out.println("mehlikaPage."+ locator.phoneInputBox.getAttribute("value").substring(3,4));
        System.out.println("mehlikaPage.phoneInputBox.  : "+ locator.phoneInputBox.getAttribute("value").substring(7,8));
        Assert.assertEquals("-", locator.phoneInputBox.getAttribute("value").substring(3,4));
        Assert.assertEquals("-", locator.phoneInputBox.getAttribute("value").substring(7,8));
    }

    @Then("MB Verify that user is using digits for Phone textbox")
    public void mb_verify_that_user_is_using_digits_for_phone_textbox() {
        Assert.assertEquals(0, locator.phoneInputBox.getAttribute("value").replaceAll("[\\d,-]","").length());
    }

    @Then("MB Verify that this Phone textbox is not blank")
    public void mb_verify_that_this_phone_textbox_is_not_blank() {
        Assert.assertFalse(locator.phoneInputBox.getAttribute("value").isEmpty());
    }

    @Then("MB Click the Appointment DateTime dropbox and select a valid date")
    public void mb_click_the_appointment_datetime_dropbox_and_select_a_valid_date(){
        locator.dateTimeInputBox.click();
        locator.dateTimeInputBox.sendKeys("7"+"25"+Keys.TAB);
        Driver.wait(1);
    }

    @Then("MB Verify selected date is one of following days")
    public void mb_verify_selected_date_is_one_of_following_days() {
        String date= locator.dateTimeInputBox.getAttribute("value");
        System.out.println("date = " + date);
        String year=date.substring(0,4);
        String month=date.substring(5,7);
        String day=date.substring(8,10);

        LocalDate actualDate= LocalDate.now();
        if (Integer.parseInt(year)==actualDate.getYear()){
            Assert.assertEquals(Integer.parseInt(year), actualDate.getYear());
            Assert.assertTrue(Integer.parseInt(month)>= actualDate.getMonthValue());
            //Assert.assertTrue(Integer.parseInt(day)>= actualDate.getDayOfMonth());
        } else if(Integer.parseInt(year)<actualDate.getYear()){
            Assert.assertTrue(Integer.parseInt(year)>=actualDate.getYear());
        }else{
            Assert.assertTrue(Integer.parseInt(year)>=actualDate.getYear());
        }
    }

    @Then("MB Click Send An Appointment Request button and verify appointment success message which contains Registration saved")
    public void mb_click_send_an_appointment_request_button_and_verify_appointment_success_message_which_contains_registration_saved() {
        locator.appointmentRequestButton.click();
        //Driver.wait(1);

        System.out.println("toast " + locator.savedToastContainer.getText());
        List<String> savedToastList= Arrays.asList(locator.savedToastContainer.getText().split("\\s"));
        System.out.println("savedToastList = " + savedToastList);
        Assert.assertTrue(locator.savedToastContainer.getText().contains("saved"));
        Driver.wait(1);
    }


    @Then("MB Click Account Menu dropbox sign and click Sign In")
    public void mb_click_account_menu_dropbox_sign_and_click_sign_in() {
        locator.accountMenu.click();
        locator.signInButton.click();
        Driver.wait(1);
    }

    @Then("MB Click User Name textbox and enter a valid user name {string}")
    public void mb_click_user_name_textbox_and_enter_a_valid_user_name(String musername) {
        locator.signInUsername.click();
        locator.signInUsername.sendKeys(musername);
    }

    @Then("MB Click Password textbox and enter a valid password {string}")
    public void mb_click_password_textbox_and_enter_a_valid_password(String mpassword) {
        locator.signInPassword.click();
        locator.signInPassword.sendKeys(mpassword);
        Driver.wait(1);
    }

    @Then("MB Click Sign In button")
    public void mb_click_sign_in_button() {
        locator.signInSubmit.click();
    }

    @Then("MB Verify sign in is successfully")
    public void mb_verify_sign_in_is_successfully() {
        Driver.wait(1);
        Assert.assertTrue((locator.melindaPatientAccount.getText()).contains(locator.firstNameInputBox.getAttribute("value")));
        locator.melindaPatientAccount.click();
        locator.signOut.click();
        Driver.closeDriver();
    }
     //------------- N e g a t i v e       T e s t s -------------
    @Then("MB Verify user is using non-character for the First Name textbox - Negative")
    public void mbVerifyUserIsUsingNonCharacterForTheFirstNameTextboxNegative() {
        System.out.println(locator.firstNameInputBox.getAttribute("value").replaceAll("\\D", "").length());
        
        String wrongName= locator.firstNameInputBox.getAttribute("value");
        System.out.println("wrongName = " + wrongName);
                Assert.assertNotEquals(0,(wrongName.replaceAll("\\D", "").length()));
    }
    @Then("MB Verify user is using non-character for the Last Name textbox - Negative")
    public void mbVerifyUserIsUsingNonCharacterForTheLastNameTextboxNegative() {
        Driver.wait(1);
        Assert.assertNotEquals(0, (locator.lastNameInputBox.getAttribute("value").replaceAll("\\D", "")).length());
    }

    @Then("MB Verify that user is also using non-digit for Phone textbox Negative")
    public void mbVerifyThatUserIsAlsoUsingNonDigitForPhoneTextboxNegative() {
        Driver.wait(1);
        Assert.assertTrue(0!= locator.phoneInputBox.getAttribute("value").replaceAll("[\\W,-]","").length());
    }

    @Then("MB Verify user also uses non-digit for SSN textbox Negative")
    public void mbVerifyUserAlsoUsesNonDigitForSSNTextboxNegative() {
        Driver.wait(1);
        Assert.assertTrue(0!= locator.ssnInputBox.getAttribute("value").replaceAll("[\\W,-]","").length());
    }

    @Then("MB Verify user doesn't use @ and . sign Negative")
    public void mbVerifyUserDoesnTUseAndSignNegative() {
        Driver.wait(1);
        Assert.assertFalse(locator.emailInputBox.getAttribute("value").contains("@")&& locator.emailInputBox.getAttribute("value").contains("."));
    }// ------------------------------------------------
}