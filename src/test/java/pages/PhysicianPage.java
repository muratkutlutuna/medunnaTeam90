package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.security.cert.X509Certificate;
import java.util.List;

public class PhysicianPage {

    public PhysicianPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "(//a[@class='btn btn-info btn-sm'])[1]")
    public WebElement viewButton;

    @FindBy(xpath = "(//a[@class='btn btn-primary btn-sm'])[1]")
    public WebElement editButton;

    @FindBy(xpath = "//select[@name='speciality']")
    public WebElement selectSpeciality;

    @FindBy(xpath = "(//a[@class='btn btn-danger btn-sm'])[1]")
    public WebElement deleteButton;

    @FindBy(xpath = "//*[contains(text(),'User found with search SSN')]")
    public WebElement userFoundWithSearchSSN;

    @FindBy(xpath = "//span[text()='Items&Titles']")
    public WebElement itemsTitelsDropdown;

    @FindBy(xpath = "//a[@class='dropdown-item']//span[text()='Physician']")
    public WebElement physicianDropdown;

    @FindBy(xpath = "//h2[@id='physician-heading']")
    public WebElement phyisiciansHeader;

    @FindBy(xpath = "//a[@class='btn btn-primary float-right jh-create-entity']")
    public WebElement createNewPhysician;

    @FindBy(xpath = "//span[text()='Create or edit a Physician']")
    public WebElement createOrEditPhysician;

    @FindBy(xpath = "//input[@placeholder='000-00-0000']")
    public WebElement inputSNNTextbox;

    @FindBy(xpath = "//button[@class='btn btn-secondary']")
    public WebElement searchUserButton;


    @FindBy(id = "useSSNSearch")
    public WebElement useSSNSearchceckbox;

    @FindBy(id = "physician-heading")
    public WebElement PhysiciansPageHeader;

    @FindBy(id = "physician-examFee")
    public WebElement examFeeInput;

    @FindBy(xpath = "//select[@name='bloodGroup']")
    public WebElement bloodGroup;

    @FindBy(xpath = "//input[@name='description']")
    public WebElement description;


    @FindBy(xpath = "//input[@id='file_image']")
    public WebElement chooseFile;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement saveButton;

    @FindBy(id = "jhi-confirm-delete-physician")
    public WebElement deletePhyisician;

    @FindBy(id = "app-view-container")
    public WebElement physicianUpdatedMessage;

}
