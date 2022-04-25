package stepDefinitions.uiStepDefinitions.secondSprint;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.KutluPage;
import utilities.Driver;

import java.util.List;

public class US022 {

    KutluPage kP = new KutluPage();

    @Given("MKT user click mypages")
    public void mkt_user_click_mypages() {
        Driver.waitAndClick(kP.myPages);
    }
    @Given("MKT user click search patient")
    public void mkt_user_click_search_patient() {
        Driver.waitAndClick(kP.searchPatient);
    }
    @Given("MKT user click patient SSN textbox")
    public void mkt_user_click_patient_ssn_textbox() {
        Driver.waitAndClick(kP.searchSsnTextBox);
    }
    @Given("MKT user input the {string}")
    public void mkt_user_input_the(String ssn) {
        Driver.waitAndSendText(kP.searchSsnTextBox,ssn);
    }
    @Given("MKT user verify {string} in the list")
    public void mkt_user_verify_in_the_list(String firstName) {
        List<WebElement> patientFirstNameList = kP.patientFirstNameList;
        boolean flag = false;
        for (WebElement w : patientFirstNameList) {
            if (w.getText().equals(firstName)) {
                flag=true;
                break;
            }
        }
        Assert.assertTrue(flag);
    }

}
