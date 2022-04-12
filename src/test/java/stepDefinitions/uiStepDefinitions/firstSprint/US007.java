package stepDefinitions.uiStepDefinitions.firstSprint;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.ArifPage;
import pojos.Appointment;
import utilities.ConfigurationReader;
import utilities.Driver;

public class US007 {

    ArifPage aP= new ArifPage();
    Faker faker = new Faker();
    Appointment appointment = new Appointment();


    @Given("AG user enter the mainpage")
    public void AG_user_enter_the_mainpage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("medunnaUrl"));

    }

    @Given("AG user enter FirstName and LastName {string} and {string}")
    public void AG_user_enter_firstname_and_lastname(String FirstName, String LastName) {
        FirstName = faker.name().firstName();
        LastName = faker.name().lastName();
        appointment.setFirstName(FirstName);
        appointment.setLastName(LastName);
        Driver.waitAndSendText(aP.AppointmentFirstNameTextBox,FirstName);
        Driver.waitAndSendText(aP.AppointmentLastNameTextBox,LastName);

    }

    @And("AG user enter SNN {string}")
    public void AG_user_enter_SNN(String SSN) {
        SSN = faker.idNumber().ssnValid();
        appointment.setSsn(SSN);
        Driver.waitAndSendText(aP.AppointmentSSNTextBox, SSN);
    }

    @Then("AG user enter email {string}")
    public void AG_user_enter_email(String Email) {
        Email = faker.internet().emailAddress();
        appointment.setEmail(Email);
        Driver.waitAndSendText(aP.AppointmentEmailTextBox,Email);
    }

    @And("AG user enter phone {string}")
    public void AG_user_enter_phone(String Phone) {

        Phone = faker.phoneNumber().cellPhone();
        appointment.setPhone(Phone);
        Driver.waitAndSendText(aP.AppointmentPhoneTextBox, Phone);
    }

    @Then("AG user enter date {string}")
    public void AG_user_enter_date(String Date) {

        Date = "12.12.2022";
        appointment.setDate(Date);
        Driver.waitAndSendText(aP.AppointmentDateTimeTextBox, Date);

    }

    @Then("AG  confirm appointment request")
    public void AG_confirm_appointment_request() {
        Driver.waitAndClick(aP.AppointmentRegisterButton);

        Driver.sleep(1000);
        Assert.assertTrue(aP.AppointmentToastContainerMassage.isDisplayed());
    }

}
