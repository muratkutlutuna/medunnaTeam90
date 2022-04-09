package stepDefinitions.uiStepDefinitions.firstSprint;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.FatihPage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class US003 {
    FatihPage fP=new FatihPage();

    @Given("FY User navigates to Medunna home page")
    public void fy_user_navigates_to_medunna_home_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("medunnaUrl"));
        Driver.wait(3);
    }
    @Given("FY User clicks on human icon")
    public void fy_user_clicks_on_human_icon() {
        fP.accountmenu.click();
        Driver.wait(2);
    }
    @Given("FY User clicks on Register button")
    public void fy_user_clicks_on_register_button() {
        fP.accountMenuRegisterButton.click();
        Driver.wait(2);
    }
    @Given("FY User provides the new password {string}")
    public void fy_user_provides_the_new_password(String password) {
        Driver.waitAndSendText(fP.registerPagePasswordBox,password);
        Driver.wait(2);
    }
    @Then("FY User validates the password strength {string}")
    public void fy_user_validates_the_password_strength(String level) {
        if(1==Integer.parseInt(level)){
            Assert.assertTrue(fP.passwordStrength1.isDisplayed());
        }else if (2==Integer.parseInt(level)){
            Assert.assertTrue(fP.passwordStrength2.isDisplayed());
        }else if (4==Integer.parseInt(level)){
            Assert.assertTrue(fP.passwordStrength4.isDisplayed());
        }else if (5==Integer.parseInt(level)){
            Assert.assertTrue(fP.passwordStrength5.isDisplayed());
        }

    }

}
