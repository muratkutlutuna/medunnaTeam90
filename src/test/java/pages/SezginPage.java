package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.Driver;

import java.util.List;

public class SezginPage extends BasePage {
    @FindBy(xpath = "//span[text()=\"HOME\"]")
    public WebElement homeItemTop;

    //MAIN PAGE
    @FindBy(xpath = "//span[text()=\"DOCTORS\"]")
    public WebElement doctorsItemTop;

    @FindBy(xpath = "//span[text()=\"CONTACT\"]")
    public WebElement contactItemTop;

    @FindBy(xpath = "//a[@class=\"d-flex align-items-center dropdown-toggle nav-link\"]")
    public WebElement userItemTop;

    @FindBy(xpath = "//div[@class=\"dropdown-menu dropdown-menu-right show\"]")
    public WebElement userDropdownEl;

    @FindBy(id = "login-item")
    public WebElement signinEl;

    @FindBy(xpath = "//input[@name=\"username\"]")
    public WebElement usernameBox;

    @FindBy(xpath = "//input[@name=\"password\"]")
    public WebElement passwordBox;

    @FindBy(xpath = "//button[@type=\"submit\"]")
    public WebElement signinButton;

    //after log in to go to the "appointments"
    @FindBy(xpath = "//li[@id=\"entity-menu\"]")
    public WebElement myPagesIconDoctor;

    @FindBy(xpath = "//span[text()=\"My Appointments\"]")
    public WebElement myAppointmentsDoctor;

    @FindBy(xpath = "//body//tr[2]//td[13]")
    public WebElement editPatientButton;

    @FindBy(xpath = "//h2[@id=\"hospitalmsappfrontendApp.appointment.home.createOrEditLabel\"]")
    public WebElement createOrEditAppointmentTextEl;


    //Doctor's "appointment" page
    @FindBy(xpath = "//tbody//tr")
    public List<WebElement> appointmentTableList;

    @FindBy(id = "toDate")
    public WebElement timeSlotFrom;

    @FindBy(id = "fromDate")
    public WebElement timeSlotTo;

    @FindBy(xpath = "//tbody")
    public List<WebElement> appointmentTableListData;

    //Doctor's "create or edit an appointment" page
    @FindBy(xpath = "//input[@name=\"id\"]")
    public WebElement patientIdBox;

    @FindBy(xpath = "//input[@name=\"startDate\"]")
    public WebElement appointmentStartDate;

    @FindBy(xpath = "//input[@name=\"endDate\"]")
    public WebElement appointmentEndDate;

    @FindBy(xpath = "//select[@name=\"physician.id\"]")
    public WebElement physiciansNameBox;

    @FindBy(xpath = "//select[@name=\"patient.id\"]")
    public WebElement patientNameBox;


    @FindBy(xpath = "//textarea[@name=\"anamnesis\"]")
    public WebElement anamnesisTextArea;

    @FindBy(xpath = "(//div[@class=\"invalid-feedback\"])[1]")
    public WebElement anamnesisThisFieldisRequiredText;

    @FindBy(xpath = "//textarea[@name=\"treatment\"]")
    public WebElement treatmentTextArea;

    @FindBy(xpath = "(//div[@class=\"invalid-feedback\"])[2]")
    public WebElement treatmentThisFieldisRequiredText;

    @FindBy(xpath = "//textarea[@name=\"diagnosis\"]")
    public WebElement diagnosisTextArea;

    @FindBy(xpath = "(//div[@class=\"invalid-feedback\"])[3]")
    public WebElement diagnosisThisFieldisRequiredText;

    @FindBy(xpath = "//textarea[@name=\"prescription\"]")
    public WebElement prescriptionTextArea;

    @FindBy(xpath = "//textarea[@name=\"description\"]")
    public WebElement descriptionTextArea;

    @FindBy(xpath = "//select[@id=\"appointment-status\"]")
    public WebElement statusDropdownEl;


    public WebElement satirYazdir() {
        String satirDinamikXpath = "//tbody//tr[1]";
        WebElement satirElementi = Driver.getDriver().findElement(By.xpath(satirDinamikXpath));

        return satirElementi;
    }

    ////////////////////////////////////////////
    //US20 LOCATIONS
    @FindBy (xpath = "//span[text()=\"Administration\"]")
    public WebElement administrationElement;

    @FindBy (xpath = "//span[text()=\"User management\"]")
    public WebElement userManagementElement;

    @FindBy (xpath = "(//a[@class=\"btn btn-info btn-sm\"])[1]")
    public WebElement userViewButton;

    //USER EDIT PAGE
    @FindBy (xpath = "(//a[@class=\"btn btn-primary btn-sm\"])[1]")
    public WebElement userEditButton;

    @FindBy (xpath = "//input[@name=\"activated\"]")
    public WebElement activatedCheckBox;

    @FindBy (xpath = "//select[@id=\"authorities\"]")
    public WebElement profilesDropdownEl;

    @FindBy (xpath = "//button[@type=\"submit\"]")
    public WebElement saveUserChangesButton;

    @FindBy (xpath = "(//span[text()=\"Delete\"])[2]")
    public WebElement deleteUserButton;

    @FindBy (xpath = "(//span[text()=\"Delete\"])[21]")
    public WebElement deleteUserConfirmationButton;

    @FindBy (xpath = "//div[contains(text()=\"Internal server error\"])")
    public WebElement internalServerErrorAlert;




    //US21 LOCATIONS
    @FindBy (xpath = "//span[text()=\"MY PAGES\"]")
    public WebElement myPagesIconStaff;

    @FindBy (xpath = "//span[text()=\"Search Patient\"]")
    public WebElement searchPatientEl;

    @FindBy (xpath = "//input[@name=\"ssn\"]")
    public WebElement findPatientBySsnBox;

    @FindBy (xpath = "//span[text()=\"Show Appointments\"]")
    public WebElement showAppointmentsButton;

    @FindBy (xpath = "//a[@class=\"btn btn-warning btn-sm\"]")
    public WebElement editAppointmentButton;

    @FindBy (xpath = "//span[text()=\"Create or Edit an Appointment\"]")
    public WebElement createOrEditAppointmentTextForPatient;

    @FindBy (xpath = "//span[text()=\"Save\"]")
    public WebElement saveChangesForEdittingPatient;

    @FindBy(xpath = "//select[@name=\"physician.id\"]")
    public WebElement physicianNamesDropdownEl;

    @FindBy (xpath = "//option[@value=\"10520\"]")
    public WebElement deneme;

    @FindBy (xpath = "//div[@class=\"Toastify__toast Toastify__toast--success toastify-toast\"]")
    public WebElement appointmentUpdatedText;

    //TEST RESULTS
    @FindBy (xpath = "//span[text()=\"Show Tests\"]")
    public WebElement showTestsButton;

    @FindBy (xpath = "(//span[text()=\"View Results\"])[1]")
    public WebElement viewTestResultsButton;

    @FindBy (xpath = "//span[text()=\"Test Results\"]")
    public WebElement testResultsTextEl;

    @FindBy (xpath = "//div[contains(text(),'The Appointment is updated with identifier 49681')]")
    public WebElement appointmentUpdatedToastContainer;



}
