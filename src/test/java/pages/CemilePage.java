package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CemilePage {
    public CemilePage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@aria-haspopup='true']")
    public WebElement dropDownmenu;

    @FindBy(xpath = "//img[@alt='Logo']")
    public WebElement mainPageLogo;

    @FindBy(xpath = "(//*[@class='dropdown-item'])[1]")
    public WebElement signIn;

    @FindBy(xpath = "//div[@id='login-title']")
    public WebElement signInHeader;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement userNameInputBox;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement passwordInputBox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signInButton;

    @FindBy(xpath = "//span[text()='Sign out']")
    public WebElement signOut;

    @FindBy(xpath = "//input[@class='is-touched is-dirty av-valid form-check-input']")
    public WebElement rememberMeCheckbox;
    @FindBy(xpath = "//input[@value='ture']")
    public WebElement rememberMeCheck;

    @FindBy(xpath = " //span[text()='Did you forget your password?']")
    public WebElement didYouForgetYourPassword;

    @FindBy(xpath = "//span[text()='Cemile Turkmen']")
    public WebElement accountName;

    @FindBy(xpath = "//span[text()='Cancel']")
    public WebElement cancelButton;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement resetYourPasswordButton;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement emailInputBox;

    @FindBy(xpath = "//*[contains(text(),'Check your email for details on how to reset your password.')]")
    public WebElement container;

    @FindBy(xpath = "//strong[text()='Failed to sign in!']")
    public WebElement failedToSignIn;

    @FindBy(xpath = "//span[text()='Register a new account']")
    public WebElement registerNewAccount;

    @FindBy(xpath = "//span[text()='Reset your password']")
    public WebElement resetYourPasswordHeader;

    @FindBy(xpath = "//span[text()='Registration']")
    public WebElement registrationPage;

    @FindBy(xpath = "//*[contains(text(),'Authentication information not correct.')]")
    public WebElement containerFailed;


}
