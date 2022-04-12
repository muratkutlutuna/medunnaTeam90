package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FatihPage extends BasePage {
    //-----------US003 locators------------------

    @FindBy(xpath = "(//*[.='Register'])[1]")
    public WebElement accountMenuRegisterButton;

    @FindBy(id = "firstPassword")
    public WebElement registerPagePasswordBox;

    @FindBy(xpath = "//li[@style='background-color: rgb(255, 0, 0);']")
    public WebElement passwordStrength1;

    @FindBy(xpath = "(//li[@style='background-color: rgb(255, 153, 0);'])[2]")
    public WebElement passwordStrength2;

    @FindBy(xpath = "(//li[@style='background-color: rgb(153, 255, 0);'])[4]")
    public WebElement passwordStrength4;

    @FindBy(xpath = "(//li[@style='background-color: rgb(0, 255, 0);'])[5]")
    public WebElement passwordStrength5;


    //-----------US008 locators------------------
    @FindBy (id="account-menu")
    public WebElement userPageAccounMenu;

    @FindBy (xpath = "//*[.='Password']")
    public WebElement userPagePasswordButton;

    @FindBy (id="currentPassword")
    public WebElement userCurrentPassword;

    @FindBy (id="newPassword")
    public WebElement userNewPassword;

    @FindBy (id="confirmPassword")
    public WebElement userConfirmationPassword;

    @FindBy (xpath = "(//*[.='Save'])[2]")
    public WebElement userPasswordSaveButton;

    @FindBy (xpath = "(//*[.='Password changed!'])[3]")
    public WebElement passwordChangedToastContainerSuccessMessage;

    @FindBy (xpath = "//*[.='Sign out']")
    public WebElement userSignOutButton;



    //-----------US014 locators------------------

    @FindBy(xpath = "//li[@id='account-menu']")
    public WebElement accountmenu;

    @FindBy(xpath = "//a[@id='login-item']")
    public WebElement homePageSignIn;

    @FindBy(xpath = "//input[@id='username']")
    public WebElement doctorUserName;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement doctorPassword;

    @FindBy(xpath = "(//*[.='Sign in'])[4]")
    public WebElement doctorSignInButton;

    @FindBy(id = "fromDate")
    public WebElement inPatientsFromDate;

    @FindBy(id = "toDate")
    public WebElement inPatientstoDate;

    @FindBy(xpath = "(//*[.='MY PAGES'])[2]")
    public WebElement doctorMyPages;

    @FindBy(xpath = "//*[.='My Inpatients']")
    public WebElement myInpatientsButton;

    @FindBy(xpath = "(//*[.='In Patients'])[2]")
    public WebElement inPatientsText;

    @FindBy(xpath = "(//tbody/tr/td[1])[1]")
    public WebElement inPatientsID;

    @FindBy(xpath = "(//tbody/tr/td[2])[1]")
    public WebElement inPatientsStartDate;

    @FindBy(xpath = "(//tbody/tr/td[3])[1]")
    public WebElement inPatientsEndDate;

    @FindBy(xpath = "(//tbody/tr/td[4])[1]")
    public WebElement inPatientsStatus;

    @FindBy(xpath = "(//tbody/tr/td[5])[1]")
    public WebElement inPatientsDescription;

    @FindBy(xpath = "(//tbody/tr/td[6])[1]")
    public WebElement inPatientsCreatedDate;

    @FindBy(xpath = "(//tbody/tr/td[7])[1]")
    public WebElement inPatientsRoom;

    @FindBy(xpath = "(//tbody/tr/td[8])[1]")
    public WebElement inPatientsAppointment;

    @FindBy(xpath = "(//tbody/tr/td[9])[1]")
    public WebElement inPatientsPatient;

    @FindBy(css = ".btn-primary")
    public WebElement inPatientsEditButton;

    @FindBy(xpath = "(//*[.='Create or edit a In Patient'])[4]")
    public WebElement inPatientEditPageText;

    @FindBy(xpath = "//input[@id='in-patient-id']")
    public WebElement editInPatientID;

    @FindBy(xpath = "//input[@name='startDate']")
    public WebElement editInPatientStartDate;

    @FindBy(xpath = "//input[@name='endDate']")
    public WebElement editInPatientEndDate;

    @FindBy(xpath = "//input[@name='description']")
    public WebElement editInPatientDescription;

    @FindBy(xpath = "//input[@name='createdDate']")
    public WebElement editInPatientCreatedDate;

    @FindBy(xpath = "//select[@id='in-patient-appointment']")
    public WebElement editInPatientAppointment;

    @FindBy(xpath = "//select[@name='status']")
    public WebElement editInPatientStatusDropDown;

    @FindBy(xpath = "//select[@id='in-patient-room']")
    public WebElement editInPatientRoomDropDown;

    @FindBy(xpath = "//select[@id='in-patient-patient']")
    public WebElement editInPatientPatient;

    @FindBy(xpath = "//button[@id='save-entity']")
    public WebElement editInPatientSaveButton;

    @FindBy(xpath = "//*[.='InPatient status can not be changed with this type of status']")
    public WebElement editInPatientSuccessMessageToastContainer;


}
