package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MehlikaPage extends BasePage {

    public MehlikaPage()    { PageFactory.initElements(Driver.getDriver(),this); }
    // -- > US005
    @FindBy (xpath = "(//img[@alt='Logo'])")               // <-- home page
    public WebElement homePageLogo;
    @FindBy(xpath = "(//span[text()='Make an'])")
    public WebElement makeAnAppointmentButton;
        @FindBy(xpath = "//h2[text()='Make an Appointment']")
        public WebElement makeAppoinmentTitle;
        @FindBy(xpath = "//input[@name='firstName']")
        public WebElement firstNameInputBox;
        @FindBy(xpath = "//input[@name='lastName']")
        public WebElement lastNameInputBox;
        @FindBy(xpath = "//input[@name='ssn']")
        public WebElement ssnInputBox;
        @FindBy(xpath = "//input[@name='email']")
        public WebElement emailInputBox;
        @FindBy(xpath = "//input[@name='phone']")
        public WebElement phoneInputBox;
        @FindBy(xpath = "//input[@name='appoDate']")
        public WebElement dateTimeInputBox;
        @FindBy(xpath ="//button/span[text()='Send an Appointment Request']" )
        public WebElement appointmentRequestButton;
        @FindBy(id = "app-view-container")
        public WebElement appointmentSavedToast;


    @FindBy(xpath = "//li[@id='account-menu']")
    public WebElement accountMenu;
        @FindBy(xpath = "//a[@id='login-item']")
        public WebElement signInButton;                 //US05-US015
        @FindBy(xpath = "//input[@name='username']")
        public WebElement signInUsername;
        @FindBy(xpath = "//input[@name='password']")
        public WebElement signInPassword;
        @FindBy(xpath = "//button[@type='submit']")
        public WebElement signInSubmit;
        @FindBy(xpath = "//span[text()='Team90 Admin']")
        public WebElement verifySignedInAdmin;

    @FindBy(id = "account-menu")
    public WebElement accountSignMenu;
    @FindBy(xpath = "//span[text()='Sign out']")
    public WebElement signOut;

    @FindBy(xpath = "//span[text()='Melinda Patient']")    // -->verify sign in is successfully
    public WebElement melindaPatientAccount;

    //  -->  US015 - US19
    @FindBy(xpath = "//span[text()='Administration']")
    public WebElement administrationButton;
    @FindBy(xpath ="//span[text()='User management']" )
    public WebElement userManagementButton;

    @FindBy(xpath = "//span[text()='Create a new user']")
    public WebElement createANewUser;
        @FindBy(xpath = "//input[@name='login']")
        public WebElement newUserLoginInput;
        @FindBy(xpath = "//input[@name='firstName']")
        public WebElement newUserFirstNameInput;
        @FindBy(xpath = "//input[@name='lastName']")
        public WebElement newUserLastNameInput;
        @FindBy(xpath = "//input[@name='email']")
        public WebElement newUserEmailInput;
        @FindBy(xpath = "//input[@name='ssn']")
        public WebElement newUserSsnInput;
        @FindBy(xpath = "//select[@name='langKey']")
        public WebElement newUserLanguageDropdown;
        @FindBy(id = "authorities")    //@FindBy(xpath = "//select[@name='authorities']")
        public WebElement newUserProfilesOptions;
        // ayri ayri locate edilebilir
            @FindBy(xpath = "//option[text()='ROLE_ADMIN']")
            public WebElement newUserProfilesAdminOption;
            @FindBy(xpath = "//option[text()='ROLE_USER']")
            public WebElement newUserProfilesUserOption;
            @FindBy(xpath = "//option[text()='ROLE_PATIENT']")
            public WebElement newUserProfilesPatientOption;
            @FindBy(xpath = "//option[text()='ROLE_STAFF']")
            public WebElement newUserProfilesStaffOption;
            @FindBy(xpath = "//option[text()='ROLE_PHYSICIAN']")
            public WebElement newUserProfilesPhysicianOption;
        @FindBy(xpath = "//button[@type='submit']")
        public WebElement newUserSaveButton;

    @FindBy(id = "app-view-container")
    public WebElement newUserSavedToast;           // successful message

    @FindBy(xpath = "//span[text()='Items&Titles']")
    public WebElement itemsTitlesMenuButton;
        @FindBy(xpath = "//span[text()='Patient']")
        public WebElement itemsTitlesPatient;
            @FindBy(xpath = "//span[text()='Create a new Patient']")
            public WebElement patientCreateANewPatient;
            @FindBy(xpath = "//input[@name='firstName']")
            public WebElement newPatientFirstNameInput;
            @FindBy(xpath = "//input[@name='lastName']")
            public WebElement newPatientLastNameInput;
            @FindBy(xpath = "//input[@name='birthDate']")
            public WebElement newPatientBirthDateInput;
            @FindBy(xpath = "//input[@name='phone']")
            public WebElement newPatientPhoneInput;
            @FindBy(xpath = "//select[@name='gender']")
            public WebElement newPatientGenderSelect;
            @FindBy(xpath = "//select[@name='bloodGroup']")
            public WebElement newPatientBloodSelect;
            @FindBy(xpath ="//input[@name='adress']" )
            public WebElement newPatientAddressInput;
            @FindBy(xpath ="//textarea[@name='description']" )
            public WebElement newPatientDescriptionTextarea;
            @FindBy(xpath = "//select[@name='user.id']")
            public WebElement newPatientUserSelect;
            @FindBy(xpath = "//select[@name='country.id']")
            public WebElement newPatientCountrySelect;
            @FindBy(xpath = "//select[@name='cstate.id']")
            public WebElement newPatientStateSelect;
            @FindBy(xpath = "//span[text()='Save']")
            public WebElement newPatientSaveButton;
    @FindBy(id = "app-view-container")
    public WebElement newPatientSavedToast;           // successful message

        @FindBy(xpath = "//span[text()='Staff']")
        public WebElement itemsTitlesStaff;
            @FindBy(id = "jh-create-entity")
            public WebElement createANewStaff;
            @FindBy(id = "searchSSN")
            public WebElement staffSsnInput;
            @FindBy(id = "useSSNSearch")
            public WebElement useSearchSsnCheckbox;
            @FindBy(xpath = "//button[text()='Search User']")
            public WebElement ssnSearchUserButton;
            @FindBy(id = "app-view-container")
            public WebElement staffFoundwithSsnToast;   //user found with search Ssn



}
