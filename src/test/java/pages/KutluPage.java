package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class KutluPage extends BasePage {

    @FindBy(xpath = "//li[@id='account-menu']")
    public WebElement accountMenuIcon;

    @FindBy(xpath = "//a[contains(@href,'register')]")
    public WebElement dropdownRegisterButton;

    @FindBy(xpath = "//a[contains(@href,'login')]")
    public WebElement dropdownSignInButton;

    @FindBy(xpath = "//a[contains(@href,'logout')]")
    public WebElement dropdownSignOutButton;

    @FindBy(xpath = "//input[@id='username']")
    public WebElement signInUsernameTextBox;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement signInPasswordTextBox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement submitButton;

    @FindBy(xpath = "//li[@id='account-menu']")
    public WebElement accountMenu;

    @FindBy(xpath = "(//a[@class='dropdown-item'])[1]")
    public WebElement accountSettings;

    @FindBy(xpath = "//input[@id='email']")
    public WebElement emailTextBox;

    @FindBy(xpath = "//*[contains(text(),'language')]")
    public WebElement anyLanguageElementOnPage;

    @FindBy(xpath = "//input[@id='ssn']")
    public WebElement registerSSNTextBox;

    @FindBy(xpath = "//input[@id='firstName']")
    public WebElement firstNameTextBox;

    @FindBy(xpath = "//div[1]/div[@class='invalid-feedback']")
    public WebElement registerSSNInvalidFeedbackText;

    @FindBy(xpath = "//div[2]/div[@class='invalid-feedback']")
    public WebElement registerFirstNameInvalidFeedbackText;

    @FindBy(xpath = "//input[@id='lastName']")
    public WebElement lastNameTextBox;

    @FindBy(xpath = "//div[3]/div[@class='invalid-feedback']")
    public WebElement registerLastNameInvalidFeedbackText;

    @FindBy(xpath = "//span[text()='MY PAGES']/..")
    public WebElement myPages;

    @FindBy(xpath = "//span[text()='Search Patient']/..")
    public WebElement searchPatient;

    @FindBy(xpath = "//input[@name='ssn']")
    public WebElement searchSsnTextBox;

    @FindBy(xpath = "(//tr/td)[3]")
    public List<WebElement> patientFirstNameList;
}
