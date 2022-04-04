package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MehlikaPage extends BasePage{

    public MehlikaPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    // ---- home page
    @FindBy (xpath = "(//img[@alt='Logo'])")
    public WebElement homePageLogo;
    @FindBy (xpath = "(//span[text()='Make an'])")
    public WebElement MakeAnAppointmentButton;

    // ---- first name
    @FindBy(xpath = "(//label[text()='First Name']")
    public WebElement firstNameTag;
    @FindBy(xpath = "//input[@name='firstName']")
    public WebElement firstNameInputBox;
    @FindBy(xpath = "//div[text()='Your FirstName is required.']")
    public WebElement firstNameWarning;

    // ---- last name
    @FindBy(xpath ="//label[text()='Last Name']" )
    public WebElement lastNameTag;
    @FindBy(xpath = "//input[@name='lastName']")
    public WebElement lastNameInputBox;
    @FindBy(xpath ="//div[text()='Your LastName is required.']" )
    public WebElement lastNameWarning;

    // ---- SSN
    @FindBy(xpath ="//label[text()='SSN']" )
    public WebElement ssnTag;
    @FindBy(xpath = "//input[@name='ssn']")
    public WebElement ssnInputBox;
    @FindBy(xpath ="//div[text()='Your SSN is required.']" )
    public WebElement ssnWarning;

    // ---- email
    @FindBy(xpath ="//label[text()='Email']" )
    public WebElement emailTag;
    @FindBy(xpath = "//input[@name='email']")
    public WebElement emailInputBox;
    @FindBy(xpath ="//div[text()='Your email is required.']" )
    public WebElement emailWarning;

    // ---- phone
    @FindBy(xpath ="//label[text()='Phone']" )
    public WebElement phoneTag;
    @FindBy(xpath = "//input[@name='phone']")
    public WebElement phoneInputBox;
    @FindBy(xpath ="//div[text()='Phone number is required.']" )
    public WebElement phoneWarning;

    // ---- Appointment DateTime
    @FindBy(xpath ="//span[text()='Appointment DateTime']" )
    public WebElement dateTimeTag;
    @FindBy(xpath = "//input[@name='appoDate']")
    public WebElement dateTimeInputBox;
    @FindBy(xpath ="//span[text()='Appointment date can not be past date!']" )
    public WebElement dateTimeWarning;

    @FindBy(xpath ="//button/span[text()='Send an Appointment Request']" )
    //@FindBy(xpath ="//button[@type='submit']"]            // alternatif
    public WebElement appointmentRequestButton;

    @FindBy(xpath ="//span/strong[text()='Appointment registration saved!']" )
    // @FindBy(xpath =" //span[text()=' We will call you as soon as possible.']")            // alternatif
    // @FindBy(xpath ="//div/span[text()=' We will call you as soon as possible.']")
    public WebElement appointmentSavedAlert;


}
