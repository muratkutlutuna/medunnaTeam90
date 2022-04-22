package pages;

import org.apache.commons.compress.archivers.zip.X000A_NTFS;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

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


    //-----------US027 locators------------------
    @FindBy (xpath = "(//*[.='Administration'])[2]")
    public WebElement adminPageAdministrationDropDown;

    @FindBy (xpath = "(//*[.='Items&Titles'])[2]")
    public WebElement adminPageItemsAndTitlesDropDown;

    @FindBy (xpath = "(//*[.='Messages'])[1]")
    public WebElement adminItemsAndTitlesDropdownMessagesButton;

    @FindBy (xpath = "(//*[.='Messages'])[2]")
    public WebElement messagePageMessagesText;

    //(//table//tbody//tr)[position()<=last()] -->  webtabledaki tum datalar
    @FindBy (xpath = "(//table//tbody//tr[position()<=last()])//td[position()<6]")
    public List<WebElement> allMessagesInfo;

    @FindBy (xpath = "//table//tbody//tr//td[1]")
    public List<WebElement> messagesIdColumn;

    @FindBy (xpath = "//table//tbody//tr//td[2]")
    public List<WebElement> messagesNameColumn;

    @FindBy (xpath = "//table//tbody//tr//td[3]")
    public List<WebElement> messagesEmailColumn;

    @FindBy (xpath = "//table//tbody//tr//td[4]")
    public List<WebElement> messagesSubjectColumn;

    @FindBy (xpath = "//table//tbody//tr//td[5]")
    public List<WebElement> messagesMessageColumn;

////table//tbody//tr//td[position()= 1 or position() = 2 or position()= 3 or position() = 4 or  position() = 5]

    //------------TC027002------------------------
    @FindBy (xpath = "//*[.='Create a new Message']")
    public WebElement creatingANewMessage;

    @FindBy (xpath = "(//*[.='Create or edit a Message'])[4]")
    public WebElement createOrEditAMessagePageText;

    @FindBy (id ="c-message-name")
    public WebElement messageNameTextBox;

    @FindBy (id = "c-message-email")
    public WebElement messageEmailTextBox;

    @FindBy (id = "c-message-subject")
    public WebElement messageSubjectTextBox;

    @FindBy (id = "c-message-message")
    public WebElement messageMessageTextBox;

    @FindBy (xpath = "//*[.='Save']")
    public WebElement createOrEditAMessagePageSaveButton;

    @FindBy (xpath = "//*[contains(text(),'A new Message is created with identifier')]")
    public WebElement successfullyCreatedANewMessageText;


    //------------TC027003------------------------
    @FindBy (xpath = "(//*[.='Edit'])[1]")
    public WebElement messagePageFirstEditButton;

    @FindBy (xpath = "//*[contains(text(),'A Message is updated with identifier')]")
    public WebElement succesfullyUpdatedMessageText;


    //------------TC027005,6,7,8,9,10------------------------
    @FindBy(xpath = "(//*[.='Delete'])[1]")
    public WebElement messagePageFirstDeleteButton;

    @FindBy(xpath = "//*[contains(text(),'Are you sure you want to delete Message')]")
    public WebElement deleteConfirmationToastContainerText;

    @FindBy(id="jhi-confirm-delete-cMessage")
    public WebElement deleteConfirmationToastContainerDeleteButton;

    @FindBy (xpath = "//*[contains(text(),'Message is deleted with identifier')]")
    public WebElement succesfullyDeletedMessageText;

    @FindBy (xpath = "(//*[.='This field is required.'])[2]")
    public WebElement warningMessageUnderNameTextBox;

    @FindBy (xpath = "(//*[.='Your email is required.'])[2]")
    public WebElement warningMessageUnderEmailTextBox;

    @FindBy (xpath = "(//*[.='This field is required.'])[2]")
    public WebElement warningMessageUnderSubjectTextBox;

    @FindBy (xpath = "(//*[.='This field is invalid'])[2]")
    public WebElement invalidEmailWarningMessageUnderEmailTextBox;


    //=========================US028=======================================
    @FindBy (xpath = "(//*[.='Country'])[1]")
    public WebElement adminItemsAndTitlesDropdownCountryButton;

    @FindBy (xpath = "//*[.='Countries']")
    public WebElement countryPageCountriesText;

    @FindBy (xpath = "//*[.='Create a new Country']")
    public WebElement createANewCountryButton;

    @FindBy (xpath = "(//*[.='Create or edit a Country'])[4]")
    public WebElement createOrEditACountryText;

    @FindBy (xpath = "//input[@id='country-name']")
    public WebElement createOrEditACountryPageNameTextBox;

    @FindBy (xpath = "//*[.='Save']")
    public WebElement createOrEditACountryPageSaveButton;

    @FindBy (xpath = "//*[contains(text(),'A new Country is created with identifier')]")
    public WebElement successfullyCreatedANewCountryText;

    @FindBy (xpath = "(//*[.='State/City'])[1]")
    public WebElement adminItemsAndTitlesDropdownStateCityButton;

    @FindBy (xpath = "(//*[.='States/Cities'])[1]")
    public WebElement stateCityPageStatesCitiesText;

    @FindBy (xpath = "//*[.='Create a new State/City']")
    public WebElement createANewStateCityButton;

    @FindBy (xpath = "(//*[.='Create or edit a State/City'])[4]")
    public WebElement createOrEditAStateCityText;

    @FindBy (xpath = "//input[@id='c-state-name']")
    public WebElement createOrEditAStateCityPageNameTextBox;

    @FindBy (xpath = "//select[@id='c-state-state']")
    public WebElement createOrEditAStateCityDropDownStateCityBox;

    @FindBy (xpath = "//*[.='The United Kingdom'] ")
    public WebElement aSelectedCountryFromStateCityDropDown;

    @FindBy (xpath = "//button[@id='save-entity']")
    public WebElement createOrEditAStateCityPageSaveButton;

    @FindBy (xpath = "//*[.='Field translation-not-found[hospitalmsappfrontendApp.CState.country] cannot be empty!']")
    public WebElement successfullyCreatedANewStateCityText;















}
