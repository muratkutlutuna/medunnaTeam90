package stepDefinitions.uiStepDefinitions.secondSprint;

import io.cucumber.java.en.And;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.AinagulPage;
import utilities.DataUtils;
import utilities.Driver;

import java.util.ArrayList;
import java.util.List;

public class US016 {

    AinagulPage page=new AinagulPage();


    @And("AY Click on Items&Titles")
    public void ayClickOnItemsTitles() {
       Driver.waitAndClick(page.itemsTitles);
    }

    @And("AY Select Room from drop down menu and click")
    public void aySelectRoomFromDropDownMenuAndClick() {

        Driver.waitAndClick(page.dropDownRoom);

    }

    @And("AY Click on Create a new Room")
    public void ayclickOnCreatANewRoom() {
        Driver.waitAndClick(page.createRoomButon);
    }

    @And("AY Verify that Create or edit a Room is visible")
    public void ayverifyThatCreateOrEditARoomIsVisible() {
        Assert.assertTrue(page.verifyTextAlert.isDisplayed());
    }

    @And("AY Click on Room Number box and enter room number")
    public void ayclickOnRoomNumberBoxAndEnterRoomNumber() {
        page.roomNumberBox.sendKeys("12125");
    }

    @And("AY Click on Room Type box and select room type")
    public void ayclickOnRoomTypeBoxAndSelectRoomType() {
        Select select=new Select(page.roomTypeBox);
        select.selectByValue("SUITE");
    }

    @And("AY Click on Status")
    public void ayclickOnStatus() {
        Driver.waitAndClick(page.statusButon);
    }

    @And("AY Click on Price box and enter price")
    public void ayclickOnPriceBoxAndEnterPrice() {
        page.priceBox.sendKeys("150");
    }

    @And("AY Click on Description box and enter description")
    public void ayclickOnDescriptionBoxAndEnterDescription() {
        page.descriptionBox.sendKeys("Room with TV and Fridge");
    }

    @And("AY Click on date corresponds to the day created")
    public void ayclickOnDateCorrespondsToTheDayCreated() {
        page.createdDateBox.sendKeys(DataUtils.getDate());
    }

    @And("AY Verify that  A new Room is created is visible")
    public void ayVerifyThatANewRoomIsCreatedIsVisible() {
        page.verifyTextAlert.isDisplayed();
        //page.alertRoomIsCreated.isDisplayed();

    }

    @And("AY Click on Room Type")
    public void ayClickOnRoomType() {
        Driver.waitAndClick(page.roomType);
    }

    @And("AY Verify that Twin type rooms is visible")
    public void ayVerifyThatTwinTypeRoomsIsVisible() {
        String actualRoomType=page.twinType.getText();
        System.out.println(actualRoomType);
        String expectedRoomType="TWIN";
        Assert.assertEquals(expectedRoomType,actualRoomType);

    }

    @And("AY Click on Edit and update rooms")
    public void ayClickOnEditAndUpdateRooms() {
        Driver.waitAndClick(page.editButon);
    }


    @And("AY Click on Room Number box, delete information and enter room number")
    public void ayClickOnRoomNumberBoxDeleteInformationAndEnterRoomNumber() {
        Driver.wait(1);
        page.roomNumberBox.clear();
        Driver.wait(1);
        page.roomNumberBox.sendKeys("157946");
    }


    @And("AY Click on Room Type box and change room type")
    public void ayClickOnRoomTypeBoxAndChangeRoomType() {
        Select select=new Select(page.roomTypeBox);
        select.selectByValue("DELUXE");
    }

    @And("AY Click on Price box, delete information and enter price")
    public void ayClickOnPriceBoxDeleteInformationAndEnterPrice() {
        Driver.wait(1);
        page.priceBox.clear();
        Driver.wait(1);
        page.priceBox.sendKeys("320");
        Driver.wait(1);
    }

    @And("AY Click on Description box,delete information and enter description")
    public void ayClickOnDescriptionBoxDeleteInformationAndEnterDescription() {
        page.descriptionBox.clear();
        Driver.wait(1);
        page.descriptionBox.sendKeys("with TV");
    }

    @And("AY Verify that updated successfully")
    public void ayVerifyThatUpdatedSuccessfully() {
        Assert.assertTrue(page.verifyTextAlert.isDisplayed());
    }

    @And("AY Click on Delete")
    public void clickOnDelete() {
        Driver.wait(1);
        page.deleteButon.click();
    }

    @And("AY Click on Delete in alert window")
    public void clickOnDeleteInAlertWindow() {
        Driver.wait(2);
        page.deletButonAlertRoom.click();
        Driver.wait(2);
    }

    @And("AY Verify that deleted successfully")
    public void verifyThatDeletedSuccessfully() {
        Assert.assertTrue(page.verifyTextAlert.isDisplayed());
        Driver.wait(2);
        page.closeButtonRoom.click();
    }
}

