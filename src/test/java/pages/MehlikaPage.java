package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

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
//        @FindBy(id = "app-view-container")
//        public WebElement appointmentSavedToast;


    @FindBy(xpath ="//li[@id='account-menu']/a")          //"//li[@id='account-menu']")
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

    // @FindBy(id = "app-view-container")
    //@FindBy(xpath = "@FindBy(xpath = \"//div[contains(text(),'A new Patient is created')]\")")   //ozkanil 15
//    @FindBy (xpath = "//div[@class='Toastify__toast-container Toastify__toast-container--top-left toastify-container']")  //ozkanil 19
//    public WebElement newUserSavedToast;           // successful message

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
                    @FindBy(xpath = "//input[@name='description']")         //for staff
                    public WebElement descriptionInput;
            @FindBy(xpath = "//select[@name='user.id']")
            public WebElement newPatientUserSelect;
            @FindBy(xpath = "//select[@name='country.id']")
            public WebElement newPatientCountrySelect;
            @FindBy(xpath = "//select[@name='cstate.id']")
            public WebElement newPatientStateSelect;
            @FindBy(xpath = "//span[text()='Save']")
            public WebElement newPatientSaveButton;

    // TOAST Container        //@FindBy(id = "app-view-container")
    @FindBy(xpath = "//div[contains(text(),'created')]")
    public WebElement createdToastContainer;
    @FindBy(xpath = "//div[contains(text(),'deleted')]")
    public WebElement deletedToastContainer;
    @FindBy(xpath = "//div[contains(text(),'found')]")
    public WebElement foundToastContainer;
    @FindBy(xpath = "//div[contains(text(),'success')]")
    public WebElement successToastContainer;
    @FindBy(xpath = "//div[contains(text(),'Saved')]")
    public WebElement savedToastContainer;


    @FindBy(xpath = "//thead/tr/th[8]/span[text()='Created date']")    //"//thead//tr[1]//th[12]") //    //span[text()='Created Date']") //thead//tr[1]//th[12]
    public WebElement createdDateColumnTitle;

    @FindBy(xpath = "//tbody//tr[1]/td[1]/a")
    public WebElement firstPatient;
    @FindBy(xpath = "//tbody/tr/td//span[text()='View']")
    public WebElement viewPatient;
            @FindBy(xpath = "//h2/b")
            public WebElement idCansee;
            @FindBy(xpath = "//dd[1]")
            public WebElement ssnCanSee;
            @FindBy(xpath = "//dd[2]")
            public WebElement firstnameCanSee;
            @FindBy(xpath = "//dd[3]")
            public WebElement lastnameCanSee;
            @FindBy(xpath = "//dd[4]")
            public WebElement birthdateCanSee;
            @FindBy(xpath = "//dd[5]")
            public WebElement phoneCanSee;
            @FindBy(xpath = "//dd[6]")
            public WebElement genderCanSee;
            @FindBy(xpath = "//dd[7]")
            public WebElement bloodCanSee;
            @FindBy(xpath = "//dd[8]")
            public WebElement addressCanSee;
            @FindBy(xpath = "//dd[9]")
            public WebElement descriptionCanSee;
            @FindBy(xpath = "//dd[10]")
            public WebElement createdateCanSee;
            @FindBy(xpath = "//dd[11]")
            public WebElement userCanSee;
            @FindBy(xpath = "//dd[12]")
            public WebElement countryCanSee;
            @FindBy(xpath = "//dd[13]")
            public WebElement stateCanSee;

    @FindBy(xpath = "//tbody/tr[1]//td[16]/div/a[3]")
    public WebElement deletePatientButton;
    @FindBy(xpath = "//button/span[text()='Delete']")
    public WebElement deleteButtonFromAlert;
    //@FindBy(xpath ="//div/div/div/a[2]/span/span[text()='Edit']")
    //@FindBy(xpath = "//span[contains(text(),'Edit')]")
    //@FindBy(xpath = "(//*[contains(text(),'Edit')])[1]")

    //@FindBy(xpath = "//a/span/span[text()='Edit']")
                                //  //*[@id=\"app-view-container\"]/div/div/div/div/div/a[2]/svg")    //"//div/div/div/a[2]")
    @FindBy(xpath = "(//td[text()='mustafatekin'])[1]/../td/div/a[2]")
    public WebElement patientEditButton;
                                                //(//*[contains(text(),'Edit')])[1]/../..
    //@FindBy(xpath = "//h3[text()='Medunna']")
    @FindBy(xpath = "//thead/tr[1]/th[16]")
    public WebElement forEditButton;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement editPatientSubmitButton;
    @FindBy(xpath = "//tbody/tr[1]/td[3]")
    public WebElement firstNameVerify;
    @FindBy(xpath = "//span[text()='Back']")
    public WebElement patientBackEditButton;

    // --> Create Staff
    @FindBy(xpath = "//a/span[text()='Register']")
    public WebElement accountRegisterButton;
    @FindBy(name = "ssn")
    public WebElement registrationSsn;
    @FindBy(name = "firstName")
    public WebElement registrationFirstname;
    @FindBy(name = "lastName")
    public WebElement registrationLastname;
    @FindBy(name = "username")
    public WebElement registrationUsername;
    @FindBy(name = "email")
    public WebElement registrationEmail;
    @FindBy(name = "firstPassword")
    public WebElement registrationNewPassword;
    @FindBy(name = "secondPassword")
    public WebElement registrationConfirmPassword;
    @FindBy(xpath = "//div/div[2]/div/p")   //"//div/div/div/div[2]/div/p")
    public WebElement pageDowntoRegister;
    @FindBy(id = "register-submit")
    public WebElement registrationRegisterButton;

    @FindBy(xpath = "//div/ul/li[7]/a")
    public WebElement accountMenuAfterSignout;

    //savedToast kullanilir
    @FindBy(xpath = "//td[text()='stmelisa']/../td[5]/button/span")
    public WebElement deactivatedActivatedButton;

        @FindBy(xpath = "//span[text()='Staff']")
        public WebElement itemsTitlesStaff;
            @FindBy(id = "jh-create-entity")
            public WebElement createANewStaffButton;
            @FindBy(id = "searchSSN")
            public WebElement staffSsnInput;
            @FindBy(id = "useSSNSearch")
            public WebElement useSearchSsnCheckbox;
            @FindBy(xpath = "//button[text()='Search User']")
            public WebElement ssnSearchUserButton;


                //populated Staff Informations
//                @FindBy(xpath = "")

//staff check
        @FindBy(xpath = "//body/div/div/div/div[4]/div/div/div/div/div//dl/dd[1]")
        public WebElement staffIDCheck;





//    // Add Country and State
//    @FindBy(xpath = "//span[text()='Country']")
//    public WebElement itemsTitlesCountry;
//    @FindBy(xpath = "//span[text()='Create a new Country']")
//    public WebElement createANewCountryButton;
//            @FindBy(id = "country-name")
//            public WebElement createCountryNameInput;
//    @FindBy(xpath = "//span[text()='Create a new State/City']")
//    public WebElement createANewStateButton;
//            @FindBy(id = "c-state-name")
//            public WebElement createStateNameInput;
//            @FindBy(name = "state.id")
//            public WebElement createStateStateCityInput;
//            @FindBy(xpath = "//span[text()='Save']")
//            public WebElement createStateSaveButton;
    @FindBy(xpath = "//dd[text()='USA']")    //     //tbody/tr[1]/td[14]/a")
    public WebElement verifyCountryUSA;


}
