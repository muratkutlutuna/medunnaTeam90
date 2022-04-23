package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ArifPage extends BasePage {

    @FindBy(xpath = "//input[@id='firstName']")
    public WebElement AppointmentFirstNameTextBox;

    @FindBy(xpath = "//input[@id='lastName']")
    public WebElement AppointmentLastNameTextBox;

    @FindBy(xpath = "//input[@id='ssn']")
    public WebElement AppointmentSSNTextBox;

    @FindBy(xpath = "//input[@id='email']")
    public WebElement AppointmentEmailTextBox;

    @FindBy(xpath = "//input[@id='phone']")
    public WebElement AppointmentPhoneTextBox;

    @FindBy(xpath = "//input[@id='appoDate']")
    public WebElement AppointmentDateTimeTextBox;

    @FindBy(xpath = "//button[@id='register-submit']")
    public WebElement AppointmentRegisterButton;

    @FindBy(xpath = "//*[contains(text(), 'Appointment registration saved!')]")
    public WebElement AppointmentToastContainerMassage;

    @FindBy(xpath = "//*[@href='/contact']")
    public WebElement ContactButton;

    @FindBy(xpath = "//input[@name='name']")
    public WebElement ContactNameTextBox;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement ContactEmailTextBox;

    @FindBy(xpath = "//input[@name='subject']")
    public WebElement ContactSubjectTextBox;

    @FindBy(xpath = "//textarea[@name='message']")
    public WebElement ContactMessageTextBox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement ContactSubmitButton;

    @FindBy(xpath = "//*[@class='Toastify__toast Toastify__toast--success toastify-toast']")
    public WebElement ContactToastContainerMassage;




}
