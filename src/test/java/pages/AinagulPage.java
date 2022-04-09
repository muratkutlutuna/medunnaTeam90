package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.Driver;

public class AinagulPage extends BasePage{


    @FindBy(id = "account-menu")
    public WebElement humanFigure;

    @FindBy(xpath = "//span[text()='Sign in']")
    public WebElement signIn;

    @FindBy(id="username")
    public WebElement userName;

    @FindBy(id="password")
    public WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signInButon;

    @FindBy(xpath = "//span[text()='MY PAGES']")
    public WebElement myPage;

    @FindBy(xpath = "//span[text()='My Appointments']")
    public WebElement myAppointments;

    @FindBy(xpath = "//span[text()='Edit']")
    public WebElement Edit;

    @FindBy(xpath = "//a[@class='btn btn-success btn-sm']")
    public WebElement requestATest;

    @FindBy(xpath = "//h2[@id='c-test-item-heading']")
    public WebElement testItemsText;

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

    @FindBy(xpath = "//input[@name='8163']")
    public WebElement vitaminDTest;


    @FindBy(xpath = "//button[@type='submit']")
    public WebElement saveButton;

    @FindBy(id = "app-view-container")
    public WebElement verifyText;



    public void scrollToWebelementVisible(WebElement webElement){
        JavascriptExecutor jss= (JavascriptExecutor) Driver.getDriver();
        jss.executeScript("arguments[0].scrollIntoView(true);",webElement);
    }

    @FindBy (xpath = "//span[text()='Search Patient']")
    public WebElement searchPatient;

    @FindBy(xpath = "//input[@name='ssn']")
    public WebElement ssnBox;

    @FindBy(xpath = "//span[text()='Show Appointments']")
    public WebElement showAppointments;

    @FindBy(xpath = "//span[text()='Show Tests']")
    public WebElement showTests;

    @FindBy(xpath = "(//span[text()='View Results'])[3]")
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







}
