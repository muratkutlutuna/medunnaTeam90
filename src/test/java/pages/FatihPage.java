package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class FatihPage extends BasePage {
    public FatihPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//li[@id='account-menu']")
    public WebElement accountmenu;

    @FindBy (xpath = "//a[@id='login-item']")
    public WebElement homePageSignIn;

    @FindBy (xpath = "//input[@id='username']")
    public WebElement doctorUserName;

    @FindBy (xpath = "//input[@id='password']")
    public WebElement doctorPassword;

    @FindBy (xpath = "(//*[.='Sign in'])[4]")
    public WebElement doctorSignInButton;

    @FindBy (xpath = "(//*[.='MY PAGES'])[2]")
    public WebElement doctorMyPages;

    @FindBy (xpath = "//*[.='My Inpatients']")
    public WebElement myInpatientsButton;

    @FindBy (xpath = "(//*[.='In Patients'])[2]")
    public WebElement inPatientsText;

    @FindBy (xpath = "(//tbody/tr/td[1])[1]")
    public WebElement inPatientsID;

    @FindBy (xpath = "(//tbody/tr/td[2])[1]")
    public WebElement inPatientsStartDate;

    @FindBy (xpath = "(//tbody/tr/td[3])[1]")
    public WebElement inPatientsEndDate;

    @FindBy (xpath = "(//tbody/tr/td[4])[1]")
    public WebElement inPatientsStatus;

    @FindBy (xpath = "(//tbody/tr/td[5])[1]")
    public WebElement inPatientsDescription;

    @FindBy (xpath = "(//tbody/tr/td[6])[1]")
    public WebElement inPatientsCreatedDate;

    @FindBy (xpath = "(//tbody/tr/td[7])[1]")
    public WebElement inPatientsRoom;

    @FindBy (xpath = "(//tbody/tr/td[8])[1]")
    public WebElement inPatientsAppointment;

    @FindBy (xpath = "(//tbody/tr/td[9])[1]")
    public WebElement inPatientsPatient;

    @FindBy (xpath = "(//tbody/tr/td[10])[1]")
    public WebElement inPatientsEditButton;

    @FindBy (xpath = "//h2")
    public WebElement inPatientEditPageText;

    @FindBy (xpath = "//input[@id='in-patient-id']")
    public WebElement editInPatientID;

    @FindBy (xpath = "//input[@name='startDate']")
    public WebElement editInPatientStartDate;

    @FindBy (xpath = "//input[@name='endDate']")
    public WebElement editInPatientEndDate;

    @FindBy (xpath = "//input[@name='description']")
    public WebElement editInPatientDescription;

    @FindBy (xpath = "//input[@name='createdDate']")
    public WebElement editInPatientCreatedDate;

    @FindBy (xpath = "//select[@id='in-patient-appointment']")
    public WebElement editInPatientAppointment;

    @FindBy (xpath = "//select[@name='status']")
    public WebElement editInPatientStatusDropDown;

    @FindBy (xpath = "//select[@id='in-patient-room']")
    public WebElement editInPatientRoomDropDown;

    @FindBy (xpath = "//select[@id='in-patient-patient']")
    public WebElement editInPatientPatient;

    @FindBy (xpath = "//button[@id='save-entity']")
    public WebElement editInPatientSaveButton;

    @FindBy (xpath = "//*[.='The In Patient is updated with identifier 42859']")
    public WebElement editInPatientSuccessMessageToastContainer;


















}
