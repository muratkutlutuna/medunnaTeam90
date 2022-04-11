package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BestamiPage extends BasePage {


    @FindBy(xpath = "//*[@class='d-flex align-items-center dropdown-toggle nav-link']")
    public WebElement firstLogin;

    @FindBy(xpath = "//span[text()='Sign in']")
    public WebElement signIn;

    @FindBy(xpath = "//input[@id='username']")
    public WebElement userName;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement password;

    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public WebElement signIn2;

    @FindBy(xpath = "//span[text()='MY PAGES']")
    public WebElement MypagesText;

    @FindBy(xpath = "//*[@id=\"entity-menu\"]/div/a[1]/span")
    public WebElement SearchPatient;

    @FindBy(xpath = "//input[@class='form-control']")
    public WebElement PatientSSN;

    @FindBy(xpath = "//*[@id=\"app-view-container\"]/div/div/div/div[2]/div/table/thead/tr/th[3]/span")
    public WebElement FirstName;

    @FindBy(xpath = "//*[contains(text(),'Delete')]")
    public WebElement allDelete;


}
