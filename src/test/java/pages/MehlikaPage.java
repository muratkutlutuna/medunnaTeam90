package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MehlikaPage extends BasePage{
//Toast Container: (xpath = "//*[contains(text(),'Registration Saved')]")
    public MehlikaPage()    { PageFactory.initElements(Driver.getDriver(),this); }

    @FindBy (xpath = "(//img[@alt='Logo'])")               // <-- home page
    public WebElement homePageLogo;
    @FindBy (xpath = "(//span[text()='Make an'])")
    public WebElement makeAnAppointmentButton;

    @FindBy(xpath = "//h2[text()='Make an Appointment']")
    public WebElement makeAppoinmentTitle;

    @FindBy(xpath = "//input[@name='firstName']")
    public WebElement firstNameInputBox;
    @FindBy(xpath ="//input[@value='Melinda']" )
    public WebElement getFirstNameInputBoxValue;
    @FindBy(xpath = "//div[text()='Your FirstName is required.']")
    public WebElement firstNameWarning;

    @FindBy(xpath = "//input[@name='lastName']")
    public WebElement lastNameInputBox;
    @FindBy(xpath ="//div[text()='Your LastName is required.']" )
    public WebElement lastNameWarning;

    @FindBy(xpath = "//input[@name='ssn']")
    public WebElement ssnInputBox;
    @FindBy(xpath ="//div[text()='Your SSN is required.']" )
    public WebElement ssnWarning;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement emailInputBox;
    @FindBy(xpath ="//div[text()='Your email is required.']" )
    public WebElement emailWarning;

    @FindBy(xpath = "//input[@name='phone']")
    public WebElement phoneInputBox;
    @FindBy(xpath ="//div[text()='Phone number is required.']" )
    public WebElement phoneWarning;

    @FindBy(xpath = "//input[@name='appoDate']")
    public WebElement dateTimeInputBox;
    @FindBy(xpath ="//span[text()='Appointment date can not be past date!']" )
    public WebElement dateTimeWarning;

    @FindBy(xpath ="//button/span[text()='Send an Appointment Request']" )
    public WebElement appointmentRequestButton;

    @FindBy(xpath = "//form[@id='register-form']")
    public WebElement appointmentRequestForm;

    @FindBy(id = "app-view-container")
    //@FindBy(xpath = "//*[contains(text(),'Appointment registration saved!')]")
    //@FindBy(xpath ="//span/strong[text()='Appointment registration saved!']" )
    public WebElement appointmentSavedToast;

    @FindBy(xpath = "//div/span[text()='If you want to see your appointment and test result information, you must register by using your SSN after appointment submission']")
    public WebElement requestWarning;

    @FindBy(xpath = "//li[@id='account-menu']")
    public WebElement accountMenu;
    @FindBy(xpath = "//a[@id='login-item']")
    public WebElement signInButton;
    @FindBy(xpath = "//input[@name='username']")
    public WebElement signInUsername;
    @FindBy(xpath = "//input[@name='password']")
    public WebElement signInPassword;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signInSubmit;

    @FindBy(xpath = "//span[text()='Melinda Patient']")    // -->verify sign in is successfully
    public WebElement melindaPatientAccount;

    @FindBy(xpath = "//span[text()='MY PAGES(PATIENT)']")
    public WebElement myPagesPatient;
    @FindBy(xpath = "//span[text()='My Appointments']")
    public WebElement patientMyAppointment;

}
