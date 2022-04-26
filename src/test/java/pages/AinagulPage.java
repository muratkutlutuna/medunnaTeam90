package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.Driver;

import java.util.List;

public class AinagulPage extends BasePage {

    @FindBy(id = "account-menu")
    public WebElement humanFigure;

    @FindBy(xpath = "//span[text()='Sign in']")
    public WebElement signIn;

    @FindBy(id = "username")
    public WebElement userName;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signInButon;


    @FindBy(xpath = "//li[@id='entity-menu']")
    public WebElement myPage;

    @FindBy(xpath = "//span[text()='My Appointments']")
    public WebElement myAppointments;

    @FindBy(xpath = "//span[text()='Edit']")
    public WebElement Edit;

    @FindBy(xpath = "//a[@class='btn btn-success btn-sm']")
    public WebElement requestATest;

    @FindBy(xpath = "//h2[text()='Test Items']")
    public WebElement testItemsTextVisible;

    @FindBy(xpath = "//li[@id='account-menu']")
    public WebElement accountMenu;

    @FindBy(xpath = "//span[text()='Sign out']")
    public WebElement signOut;

    @FindBy(xpath = "//thead//tr//th[2]")
    public WebElement tests;

    @FindBy(xpath = "//input[@name='1402']")
    public WebElement ureaTest;

    @FindBy(xpath = "//input[@name='1403']")
    public WebElement creatinineTes;

    @FindBy(xpath = "//input[@name='1404']")
    public WebElement sodiumTest;

    @FindBy(xpath = "//input[@name='1405']")
    public WebElement potassiumTest;

    @FindBy(xpath = "//input[@name='1406']")
    public WebElement totalproteinTest;

    @FindBy(xpath = "//input[@name='1408']")
    public WebElement hemoglobinTest;

    @FindBy(xpath = "//input[@name='1407']")
    public WebElement albuminTest;

    @FindBy(xpath = "//input[@name='1401']")
    public WebElement glucoseTest;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement saveButton;

    @FindBy(id = "app-view-container")
    public WebElement verifyTextAlert;

    @FindBy(xpath = "//span[text()='Search Patient']")
    public WebElement searchPatient;

    @FindBy(xpath = "//input[@name='ssn']")
    public WebElement ssnBox;

    @FindBy(xpath = "//span[text()='Show Appointments']")
    public WebElement showAppointments;

    @FindBy(xpath = "(//span[text()='Show Tests'])[2]")
    public WebElement showTests;

    @FindBy(xpath = "(//span[text()='View Results'])[4]")
    public WebElement viewResults;

    @FindBy(xpath = "(//span[@class='d-none d-md-inline'])[1]")
    public WebElement edit1;

    @FindBy(xpath = "//span[text()='Save']")
    public WebElement save;

    @FindBy(xpath = "(//span[@class='d-none d-md-inline'])[2]")
    public WebElement edit2;

    @FindBy(xpath = "(//span[@class='d-none d-md-inline'])[3]")
    public WebElement edit3;

    @FindBy(xpath = "(//span[@class='d-none d-md-inline'])[4]")
    public WebElement edit4;

    @FindBy(xpath = "(//span[@class='d-none d-md-inline'])[5]")
    public WebElement edit5;

    @FindBy(xpath = "(//span[@class='d-none d-md-inline'])[6]")
    public WebElement edit6;

    @FindBy(xpath = "(//span[@class='d-none d-md-inline'])[7]")
    public WebElement edit7;

    @FindBy(xpath = "//a[text()='Show Test Results']")
    public WebElement showTestResults;

    @FindBy(xpath = "//span[text()='Test Results']")
    public WebElement verifyTestResults;

    @FindBy(xpath = "//button[text()='Request Inpatient']")
    public WebElement requestInpatient;

    public void scrollToWebelementVisible(WebElement webElement) {
        JavascriptExecutor jss = (JavascriptExecutor) Driver.getDriver();
        jss.executeScript("arguments[0].scrollIntoView(true);", webElement);
    }
// US16
    @FindBy(xpath = "//span[text()='Items&Titles']")
    public WebElement itemsTitles;

    @FindBy(xpath = "//span[text()='Room']")
    public WebElement dropDownRoom;

    @FindBy(xpath = "//span[text()='Create a new Room']")
    public WebElement createRoomButon;

    @FindBy(xpath = "//span[text()='Create or edit a Room']")
    public WebElement createRoomText;

    @FindBy(xpath = "//input[@name='roomNumber']")
    public WebElement roomNumberBox;

    @FindBy(xpath = "//select[@name='roomType']")
    public WebElement roomTypeBox;

    @FindBy(xpath = "//input[@name='status']")
    public WebElement statusButon;

    @FindBy(xpath = "//input[@name='price']")
    public WebElement priceBox;

    @FindBy(xpath = "//input[@name='description']")
    public WebElement descriptionBox;

    @FindBy(xpath = "//input[@name='createdDate']")
    public WebElement createdDateBox;

    @FindBy(xpath = "//*[text()='A new Room is created']")
    public WebElement alertRoomIsCreated;

    @FindBy(xpath = "//span[text()='Room Type']")
    public WebElement roomType;

    @FindBy(xpath = "//span[text()='TWIN']")
    public WebElement twinType;

    @FindBy(xpath = "//span[text()='Edit']")
    public WebElement editButon;

    @FindBy(xpath = "//span[text()='Delete']")
    public WebElement deleteButon;

    @FindBy(xpath = "(//button[@type='button'])[4]")
    public WebElement deletButonAlertRoom;

    @FindBy(xpath = "//button[@class='close']")
    public WebElement closeButtonRoom;

   // US17
    //(//td[text()='mustafatekin'])[1]/../td/div/a[2] :example

   @FindBy(xpath = "//span[text()='Test Item']")
   public WebElement testItemButon;

    @FindBy(xpath = "//span[text()='Create a new Test Item']")
    public WebElement createNewTestItemButon;

    @FindBy(xpath = "//span[text()='Create or edit a Test Item']")
    public WebElement createEditTestItemIsVisible;

    @FindBy(xpath = "//span[text()='Test Items']")
    public WebElement testItemsTextVisibleAdmin;

    @FindBy(xpath = "//button[@id='jhi-confirm-delete-cTestItem']")
    public WebElement deletButonAlertTestItem;

    @FindBy(xpath = "//button[@class='close']")
    public WebElement closeButtonAlert;

    @FindBy(xpath = "//input[@name='name']")
    public WebElement nameBox;

    @FindBy(xpath = "//input[@name='description']")
    public WebElement descriptionBoxTestItem;

    @FindBy(xpath = "//input[@name='price']")
    public WebElement priceBoxTestItem;

    @FindBy(xpath = "//input[@name='defaultValMin']")
    public WebElement defaultValMin;

    @FindBy(xpath = "//input[@name='defaultValMax']")
    public WebElement defaultValMax;



}
