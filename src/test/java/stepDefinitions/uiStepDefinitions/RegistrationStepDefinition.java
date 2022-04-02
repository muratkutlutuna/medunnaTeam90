package stepDefinitions.uiStepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.AccountRegisterPage;
import pojos.Registrant;
import utilities.Driver;

import static utilities.WriteToTxt.saveRegistrantData;

public class RegistrationStepDefinition {

    Registrant registrant = new Registrant();
    Faker faker = new Faker();
    AccountRegisterPage rp = new AccountRegisterPage();

    @Given("kullanici SNN girer {string}")
    public void kullanici_snn_girer(String ssn) {
        ssn = faker.idNumber().ssnValid();
        registrant.setSSN(ssn);

        Driver.waitAndSendText(rp.ssnTextBox, ssn);
    }

    @Given("kulanici firstname ve lastname girer {string} ve {string}")
    public void kulanici_firstname_ve_lastname_girer_ve(String firstname, String lastname) {
        firstname = faker.name().firstName();
        lastname = faker.name().lastName();

        registrant.setFirstName(firstname);
        registrant.setLastName(lastname);

        Driver.waitAndSendText(rp.firstNameTextBox, firstname);
        Driver.waitAndSendText(rp.lastNameTextBox, lastname);
    }

    @Given("kullanici username girer {string}")
    public void kullanici_username_girer(String username) {
        username = registrant.getFirstName() + registrant.getLastName();
        registrant.setUsername(username);

        Driver.waitAndSendText(rp.usernameTextBox,username);

    }

    @Then("kullanici email girer {string}")
    public void kullanici_email_girer(String email) {
        email = faker.internet().emailAddress();
        registrant.setEmail(email);

        Driver.waitAndSendText(rp.emailTextBox,email);
    }

    @Then("kullanici password girer {string}")
    public void kullanici_password_girer(String password) {

        password = faker.internet().password(8, 20,true,true);

        registrant.setPassword(password);

        Driver.waitAndSendText(rp.firstPasswordTextBox, password);
        Driver.waitAndSendText(rp.secondPasswordTextBox, password);
    }

    @Then("kullanicinin kayit yaptigini dogrula")
    public void kullanicinin_kayit_yaptigini_dogrula() {
        Driver.waitAndClick(rp.registerButton);

        Driver.sleep(1000);
        Assert.assertTrue(rp.toastContainerMassage.isDisplayed());
    }

    @Then("kayit olan kullanicinin datalarini kaydet")
    public void kayit_olan_kullanicinin_datalarini_kaydet() {
        saveRegistrantData(registrant);
    }
}