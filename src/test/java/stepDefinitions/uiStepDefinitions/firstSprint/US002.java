package stepDefinitions.uiStepDefinitions.firstSprint;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.RanaPage;
import pojos.Registrant;
import utilities.ConfigurationReader;
import utilities.Driver;


public class US002 {
    Registrant registrant = new Registrant();
    Actions actions = new Actions(Driver.getDriver());
    RanaPage rP = new RanaPage();
    Faker faker = new Faker();


    @Given("RT goes to the home page")
    public void rt_goes_to_the_home_page() {
        Driver.getDriver().get("https://www.medunna.com");
    }

    @And("RT Click the profile icon on the top of the right")
    public void rt_click_the_profile_icon_on_the_top_of_the_right() {
        Driver.wait(1);
        Driver.waitAndClick(rP.dropDownmenu);
    }

    @And("RT Click on registration")
    public void rt_click_on_registration() {
        rP.registerButton.click();
        Driver.wait(1);
    }

    @And("RT Enter {string} in SSN box")
    public void rtEnterInSSNBox(String SSN) {
        rP.ssnTextBox.sendKeys(SSN);
    }

    @And("RT Enter the {string} in firstname box")
    public void rtEnterTheInFirstnameBox(String firstname) {
        rP.firstNameTextBox.sendKeys(firstname);
    }

    @Then("RT Enter {string} in lastname box")
    public void rtEnterInLastnameBox(String lastname) {
        rP.lastNameTextBox.sendKeys(lastname);
    }

    @Then("RT Enter {string} in username box")
    public void rtEnterInUsernameBox(String username) {
        rP.userNameTextBox.sendKeys(username);
    }

    @Then("RT Enter {string} in an email box")
    public void rtEnterInAnEmailBox(String email) {
        rP.emailTextBox.sendKeys(email);
    }

    @And("RT Enter the {string} in password box")
    public void rtEnterTheInPasswordBox(String password){
        rP.firstPasswordTextBox.sendKeys(password);
    }

    @And("Enter the same {string} in new password confirmation box")
    public void enterTheSameInNewPasswordConfirmationBox(String password) {
        rP.secondPasswordTextBox.sendKeys(password);
    }

    @Then("RT clicks on the register button")
    public void rtClicksOnTheRegisterButton() {
       Driver.waitAndClick (rP.registerSubmitButton);
    }

   // @Then("RT Success message displayed")
   // public void rtsuccessMessageDisplayed() {
      //  rP.successMessageToastContainer.isDisplayed();
   // }

    @Then("RT Do not enter username in username box")
    public void rtDoNotEnterUsernameInUsernameBox() {
        rP.userNameTextBox.sendKeys("");
    }

    @And("RT Warning message Your username is required is displayed")
    public void rtWarningMessageYourUsernameIsRequiredIsDisplayed() {
        Assert.assertTrue(Driver.waitForVisibility(rP.usernameIsRequiredMessage, 8).isDisplayed());
    }

    @Then("RT Enter invalid email in email box")
    public void rtEnterInEmailBox() {
        rP.emailTextBox.sendKeys("kurt01hotmailcom");
    }

    @And("RT Verify Warning message this field is invalid displayed")
    public void rtVerifyWarningMessageThisFieldIsInvalidDisplayed() {
        Assert.assertTrue(rP.thisFieldIsInvalidMessage.isDisplayed());
    }

    @Then("RT leaves email box blank")
    public void rtLeavesEmailBoxBlank() {
        rP.emailTextBox.sendKeys(" ");
    }

    @And("RT Verify warning message Your email is required is displayed")
    public void rtVerifyWarningMessageYourEmailIsRequiredIsDisplayed() {
        Assert.assertTrue(Driver.waitForVisibility(rP.yourEmailIsRequiredMessage,4).isDisplayed());

    }
}

