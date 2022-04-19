package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RanaPageSecond extends BasePage {

        @FindBy(xpath = "//*[contains(text(),'Exam Fee')]")
        public WebElement examFeeTxt;

        @FindBy(xpath = "//*[contains(text(),'500')]")
        public WebElement examFeePrice;

        @FindBy(xpath = "//*[contains(text(),'98.5')]")
        public WebElement diabetesFee;

        @FindBy(xpath = "//*[contains(text(),'116')]")
        public WebElement theoTestFee;

        @FindBy(xpath = "//*[contains(text(),'119')]")
        public WebElement nickyTestFee;

        @FindBy(xpath = "//*[contains(text(),'Create')]")
        public WebElement createInvoiceButton;

        @FindBy(id = "save-entity")
        public WebElement saveButton;

        @FindBy(xpath = "//*[@class='Toastify__toast-body']")
        public WebElement invoiceSuccessMessage;

        @FindBy(xpath = "//*[contains(text(),'Invoice')]")
        public WebElement showInvoiceButton;

        @FindBy(xpath = "//*[text()='INVOICE']")
        public WebElement invoicePageHeader;

        @FindBy (xpath = "//*[text()='MY PAGES']")
        public WebElement myPagesDropdown;

        @FindBy (xpath = "(//*[@role='menuitem'])[1]")
        public WebElement searchPatientButton;

        @FindBy (name = "ssn")
        public WebElement patientSSNTextBox;

        @FindBy (xpath = "//*[contains(text(),'Appointments')]")
        public WebElement showAppointmentsButton;

        @FindBy (xpath = "(//*[text()='COMPLETED'])[1]")
        public WebElement completedText;

        @FindBy (xpath = "(//*[contains(text(),'Payment')])[1]")
        public WebElement paymentInvoiceButton;

        @FindBy(id="account-menu")
        public WebElement loginDropdown;

        @FindBy(xpath = "(//*[text()='Sign in'])[1]")
        public WebElement signInButton;

        @FindBy(id = "username")
        public WebElement username;

        @FindBy(id = "password")
        public WebElement password;

        @FindBy(xpath = "//button[@type='submit']")
        public WebElement loginButton;

        @FindBy(xpath = "//span[.='Cancel']")
        public WebElement cancel;

        @FindBy(id = "rememberMe")
        public WebElement rememberMe;

        @FindBy(xpath = "//span[.='Did you forget your password?']")
        public WebElement forgetPassword;

        @FindBy(xpath = "(//*[text()='Register'])[1]")
        public WebElement registerButton;

        @FindBy(xpath= "//*[@id=\"entity-menu\"]/a/span")
        public WebElement myAppointmentsPage;

        @FindBy (xpath = "//*[@id=\"entity-menu\"]/div/a[1]/span")
        public WebElement dropDownMyAppointments;

        @FindBy(xpath = "//*[@id=\"app-view-container\"]/div/div/div/div/div/table/tbody/tr/td[8]/div/a")
        public WebElement showTestsButton;

        @FindBy(xpath = "//*[@id=\"app-view-container\"]/div/div/div/div/div/table/tbody/tr/td[7]/div/a/span")
        public WebElement viewResultsButton;

        @FindBy(xpath = "//*[@id=\"app-view-container\"]/div/div/div/div/div/table/tbody/tr[4]/td[1]/a")
        public WebElement testIdUrea;

        @FindBy(xpath = "//*[@id=\"app-view-container\"]/div/div/div/div/div/table/tbody/tr[4]/td[2]")
        public WebElement testNameUrea;

        @FindBy(xpath = "//*[@id=\"app-view-container\"]/div/div/div/div/div/table/tbody/tr[4]/td[4]")
        public WebElement minValueUrea;

        @FindBy(xpath = "//*[@id=\"app-view-container\"]/div/div/div/div/div/table/tbody/tr[4]/td[5]")
        public WebElement maxValueUrea;

        @FindBy(xpath = "//*[@id=\"app-view-container\"]/div/div/div/div/div/table/tbody/tr[4]/td[7]")
        public WebElement descriptionUrea;

        @FindBy(xpath = "//*[@id=\"app-view-container\"]/div/div/div/div/div/table/tbody/tr[4]/td[8]/span")
        public WebElement dateUrea;

        @FindBy (xpath = "//*[@id=\"app-view-container\"]/div/div/div/div/div/table/tbody/tr/td[8]/div/a[2]/span/span")
        public WebElement patientShowInvoiceButton;

        @FindBy (xpath = "//*[@id=\"app-view-container\"]/div/div/div/div/table/thead/tr[7]/th[1]")
        public WebElement totalCostText;


        public void loginApplication(String userName, String pass){
                loginDropdown.click();
                signInButton.click();
                username.sendKeys(userName);
                password.sendKeys(pass);
                loginButton.click();
                cancel.click();
                rememberMe.click();
                forgetPassword.click();
                registerButton.click();
        }
    }
