package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ArifPage extends BasePage{

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
}
