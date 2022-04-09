package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class KutluPage extends BasePage {

    @FindBy(xpath = "//li[@id='account-menu']")
    public WebElement accountMenuIcon;

    @FindBy(xpath = "(//a[@class='dropdown-item'])[2]")
    public WebElement dropdownRegisterButton;

    @FindBy(xpath = "//input[@id='ssn']")
    public WebElement registerSSNTextBox;

    @FindBy(xpath = "//input[@id='firstName']")
    public WebElement registerFirstNameTextBox;

    @FindBy(xpath = "//div[1]/div[@class='invalid-feedback']")
    public WebElement registerSSNInvalidFeedbackText;

    @FindBy(xpath = "//div[2]/div[@class='invalid-feedback']")
    public WebElement registerFirstNameInvalidFeedbackText;

    @FindBy(xpath = "//input[@id='lastName']")
    public WebElement registerLastNameTextBox;

    @FindBy(xpath = "//div[3]/div[@class='invalid-feedback']")
    public WebElement registerLastNameInvalidFeedbackText;
}
