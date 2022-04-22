package stepDefinitions.uiStepDefinitions.secondSprint;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.ArifPage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class US026 {

    ArifPage cP= new ArifPage();
    Faker faker = new Faker();

    @Given("AG user enter the MainPage")
    public void ag_user_enter_the_main_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("medunnaUrl"));
    }
    @Given("AG user click Contact Button")
    public void ag_user_click_contact_button() {
        Driver.waitAndClick(cP.ContactButton);
    }
    @Given("AG user enter Name  {string}")
    public void ag_user_enter_name(String Name) {
        Name = faker.name().fullName();
        Driver.waitAndSendText(cP.ContactNameTextBox,Name);

    }
    @Then("AG user enter Email {string}")
    public void ag_user_enter_email(String Email) {
        Email=faker.internet().emailAddress();
        Driver.waitAndSendText(cP.ContactEmailTextBox,Email);
    }
    @Then("AG user enter Subject {string}")
    public void ag_user_enter_subject(String Subject) {
        Subject="Cancel Appointment";
        Driver.waitAndSendText(cP.ContactSubjectTextBox,Subject);
    }
    @Then("AG user enter Message {string}")
    public void ag_user_enter_message(String Message) {
        Message="Hello , I want to cancel my appointment,Can you send me email about cancel policy ";
        Driver.waitAndSendText(cP.ContactMessageTextBox,Message);

    }
    @Then("AG user click Send Button")
    public void ag_user_click_send_button() {
        Driver.waitAndClick(cP.ContactSubmitButton);

        Driver.waitForVisibility(cP.ContactToastContainerMassage,10);
        Assert.assertTrue(cP.ContactToastContainerMassage.isDisplayed());
    }

}
