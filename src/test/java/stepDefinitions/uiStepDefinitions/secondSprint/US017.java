package stepDefinitions.uiStepDefinitions.secondSprint;

import io.cucumber.java.en.And;
import org.junit.Assert;
import pages.AinagulPage;
import utilities.Driver;

public class US017 {

    AinagulPage page=new AinagulPage();

    @And("AY Select Test Item from drop down menu and click")
    public void aySelectTestItemFromDropDownMenuAndClick() {
            page.testItemButon.click();

    }

    @And("AY Click on Create a new Test Item")
    public void ayClickOnCreateANewTestItem() {
        page.createNewTestItemButon.click();

    }

    @And("AY Verify that Create or edit aTest Items is visible")
    public void ayVerifyThatCreateOrEditATestItemsIsVisible() {
        Driver.wait(2);
        Assert.assertTrue(page.createEditTestItemIsVisible.isDisplayed());
    }

    @And("AY Verify that Test Items is Visible Admin")
    public void ayVerifyThatTestItemsIsVisibleAdmin() {
        page.testItemsTextVisibleAdmin.click();
    }

    @And("AY Click on Delete in alert window Test Item")
    public void ayClickOnDeleteInAlertWindowTestItem() {
        Driver.wait(2);
        page.deletButonAlertTestItem.click();
        Driver.wait(2);

    }

    @And("AY Verify that deleted successfully Test Item")
    public void ayVerifyThatDeletedSuccessfullyTestItem() {
       Assert.assertTrue(page.verifyTextAlert.isDisplayed());
       Driver.wait(2);
        page.closeButtonAlert.click();
    }


    @And("AY Click on Name box and enter test name")
    public void ayClickOnNameBoxAndEnterTestName() {
        Driver.wait(3);
        page.nameBox.sendKeys("Selenium");
        Driver.wait(1);
    }


    @And("AY Click on Description box and enter description of Test Item")
    public void ayClickOnDescriptionBoxAndEnterDescriptionOfTestItem() {
        page.descriptionBoxTestItem.sendKeys("Total");
        Driver.wait(1);
    }

    @And("AY Click on Price box and enter price of Test Item")
    public void ayClickOnPriceBoxAndEnterPriceOfTestItem() {
        page.priceBoxTestItem.sendKeys("38");
        Driver.wait(1);
    }


    @And("AY Click on Default Min. Value box and enter Min.Value")
    public void ayClickOnDefaultMinValueBoxAndEnterMinValue() {
        page.defaultValMin.sendKeys("200");
        Driver.wait(1);
    }

    @And("AY Click on Default Max. Value box and enter Max.Value")
    public void ayClickOnDefaultMaxValueBoxAndEnterMaxValue() {
        page.defaultValMax.sendKeys("500");
        Driver.wait(1);
    }

    @And("AY Verify that  A new Test Item is created is visible")
    public void ayVerifyThatANewTestItemIsCreatedIsVisible() {
       Assert.assertTrue(page.verifyTextAlert.isDisplayed());
       Driver.wait(2);
    }
}
