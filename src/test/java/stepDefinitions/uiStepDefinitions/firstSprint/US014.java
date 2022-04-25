package stepDefinitions.uiStepDefinitions.firstSprint;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.FatihPage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class US014 {

    FatihPage fP = new FatihPage();

    @Given("FY Doctor navigates to Medunna homepage")
    public void fy_doctor_navigates_to_medunna_homepage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("medunnaUrl"));

    }
    @Given("FY Doctor clicks on human icon")
    public void fy_doctor_clicks_on_human_icon() {
        fP.accountmenu.click();

    }
    @Given("FY Doctor clicks on signIn button  under human icon at homepage")
    public void fy_doctor_clicks_on_sign_in_button_under_human_icon_at_homepage() {
        fP.homePageSignIn.click();

    }
    @Given("FY Doctor sends username {string} and password {string} in sign in page")
    public void fy_doctor_sends_username_and_password_in_sign_in_page(String username, String password) {
        fP.doctorUserName.sendKeys(username);
        fP.doctorPassword.sendKeys(password);

    }
    @Given("FY Doctor clicks on signIn button in sign in page")
    public void fy_doctor_clicks_on_sign_in_button_in_sign_in_page() {
        fP.doctorSignInButton.click();
    Driver.wait(3);
    }

    @Given("FY Doctor validates he is in doctorpage")
    public void fy_doctor_validates_he_is_in_doctorpage() {
        Assert.assertTrue(fP.doctorMyPages.isDisplayed());

    }
    @Given("FY Doctor clicks on MY PAGES button")
    public void fy_doctor_clicks_on_my_pages_button() {
        fP.doctorMyPages.click();

    }
    @Given("FY Doctor clicks on My inpatients button")
    public void fy_doctor_clicks_on_my_inpatients_button() {
        fP.myInpatientsButton.click();
    }
    @Given("FY Doctor validates he is in In Patients page")
    public void fy_doctor_validates_he_is_in_in_patients_page() {
        Assert.assertTrue(fP.inPatientsText.isDisplayed());
    Driver.wait(3);
    }
    @Given("FY Doctor sees all inpatients informations")
    public void fy_doctor_sees_all_inpatients_informations() throws InterruptedException {

        Thread.sleep(2000);
        Assert.assertTrue(fP.inPatientsID.isDisplayed());
        Assert.assertTrue(fP.inPatientsStartDate.isDisplayed());
        Assert.assertTrue(fP.inPatientsEndDate.isDisplayed());
        Assert.assertTrue(fP.inPatientsStatus.isDisplayed());
        Assert.assertTrue(fP.inPatientsDescription.isDisplayed());
        Assert.assertTrue(fP.inPatientsCreatedDate.isDisplayed());
        Assert.assertTrue(fP.inPatientsRoom.isDisplayed());
        Assert.assertTrue(fP.inPatientsAppointment.isDisplayed());
        Assert.assertTrue(fP.inPatientsPatient.isDisplayed());


    }


    @And("FY Doctor clicks on edit button in inpatient page")
    public void fyDoctorClicksOnEditButtonInInpatientPage() {
        Driver.waitAndClick(fP.inPatientsEditButton,3);
        Driver.wait(5);
    }

    @And("FY Doctor validate he is in inpatient create or edit page")
    public void fyDoctorValidateHeIsInInpatientCreateOrEditPage() {
        String expectedResult="Create or edit a In Patient";
        String actualResult= fP.inPatientEditPageText.getText();
        Driver.wait(5);
        Assert.assertEquals(expectedResult,actualResult);
    }

    @Given("FY Doctor is able to update start date part")
    public void fy_doctor_is_able_to_update_start_date_part() {
        Assert.assertFalse( fP.editInPatientStartDate.isSelected());

    }
    @Given("FY Doctor is able to update end date part")
    public void fy_doctor_is_able_to_update_end_date_part() {
        Assert.assertFalse(fP.editInPatientEndDate.isSelected());

    }
    @Given("FY Doctor is able to update description part")
    public void fy_doctor_is_able_to_update_description_part() {
        Driver.waitAndClick(fP.editInPatientDescription,2);
        fP.editInPatientDescription.clear();
        Driver.waitAndSendText(fP.editInPatientDescription,"toothache");

    }
    @Given("FY Doctor is able to update created date part")
    public void fy_doctor_is_able_to_update_created_date_part() {
        fP.editInPatientCreatedDate.clear();
        Driver.waitAndSendText(fP.editInPatientCreatedDate,"06040020222030");

    }
    @Given("FY Doctor is able to update appointment part")
    public void fy_doctor_is_able_to_update_appointment_part() {
        Assert.assertFalse(fP.editInPatientAppointment.isSelected());

    }

    @And("FY Doctor clicks on save button in inpatient edit page")
    public void fyDoctorClicksOnSaveButtonInInpatientEditPage() {
        Driver.waitAndClick(fP.editInPatientSaveButton,2);
        Driver.wait(5);

    }

    @Then("FY Doctor should verify toast container success message")
    public void fyDoctorShouldVerifyToastContainerSuccessMessage() {
        Assert.assertTrue(fP.editInPatientSuccessMessageToastContainer.isDisplayed());
    }

    @And("FY Doctor should be able to update inpatient status")
    public void fyDoctorShouldBeAbleToUpdateInpatientStatus() {
        Driver.selectAnItemFromDropdown(fP.editInPatientStatusDropDown,"UNAPPROVED");
        Driver.selectAnItemFromDropdown(fP.editInPatientStatusDropDown,"STAYING");
        Driver.selectAnItemFromDropdown(fP.editInPatientStatusDropDown,"DISCHARGED");
        Driver.selectAnItemFromDropdown(fP.editInPatientStatusDropDown,"CANCELLED");
    }

    @And("FY Doctor should be able to update inpatient room")
    public void fyDoctorShouldBeAbleToUpdateInpatientRoom() {
        Driver.selectAnItemFromDropdown(fP.editInPatientRoomDropDown,"14724:DAYCARE FULL-UNAVAILABLE");
        Driver.selectAnItemFromDropdown(fP.editInPatientRoomDropDown,"234405:TWIN FULL-UNAVAILABLE");
        Driver.selectAnItemFromDropdown(fP.editInPatientRoomDropDown,"7406:DELUXE FULL-UNAVAILABLE");
    }

    @And("FY Doctor changes fromDate and toDate to see his inpatients")
    public void fyDoctorChangesFromDateAndToDateToSeeHisInpatients() throws InterruptedException {
        fP.inPatientstoDate.clear();
        Driver.waitAndSendText(fP.inPatientstoDate,"12042022");
        Driver.wait(2);
        fP.inPatientsFromDate.clear();
        Driver.waitAndSendText(fP.inPatientsFromDate,"31032022");


        Thread.sleep(5000);
    }
}
