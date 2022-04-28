package stepDefinitions.uiStepDefinitions.secondSprint;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.ArifPage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class US025 {


    ArifPage aP= new ArifPage();
    Faker faker = new Faker();


    @Given("AG user enter the mainpage")
    public void AG_user_enter_the_mainpage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("medunnaUrl"));

    }

    @Given("AG user enter FirstName and LastName {string} and {string}")
    public void AG_user_enter_firstname_and_lastname(String FirstName, String LastName) {
        FirstName = faker.name().firstName();
        LastName = faker.name().lastName();
        Driver.waitAndSendText(aP.AppointmentFirstNameTextBox,FirstName);
        Driver.waitAndSendText(aP.AppointmentLastNameTextBox,LastName);

    }

    @And("AG user enter SNN {string}")
    public void AG_user_enter_SNN(String SSN) {
        SSN = faker.idNumber().ssnValid();
        Driver.waitAndSendText(aP.AppointmentSSNTextBox, SSN);
    }

    @Then("AG user enter email {string}")
    public void AG_user_enter_email(String Email) {
        Email = faker.internet().emailAddress();
        Driver.waitAndSendText(aP.AppointmentEmailTextBox,Email);
    }

    @And("AG user enter phone {string}")
    public void AG_user_enter_phone(String Phone) {

        Phone = "8572659314";
        Driver.waitAndSendText(aP.AppointmentPhoneTextBox, Phone);
    }

    @Then("AG user enter date {string}")
    public void AG_user_enter_date(String Date) {

        Date = "12.12.2022";
        Driver.waitAndSendText(aP.AppointmentDateTimeTextBox, Date);

    }

    @Then("AG  confirm appointment request")
    public void AG_confirm_appointment_request() {
        Driver.waitAndClick(aP.AppointmentRegisterButton);

        Driver.waitForVisibility(aP.AppointmentToastContainerMassage,10);
        Assert.assertTrue(aP.AppointmentToastContainerMassage.isDisplayed());
    }



}

