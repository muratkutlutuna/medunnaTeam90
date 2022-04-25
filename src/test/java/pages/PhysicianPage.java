package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.security.cert.X509Certificate;
import java.util.List;

public class PhysicianPage {

     public PhysicianPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//input[@id='ssn']")
    public WebElement inputSsn;

     @FindBy(xpath = "//*[@id=\"account-menu\"]/div/a[2]")
     public WebElement registerDropDownButton;

     @FindBy(xpath = "//button[@id='register-submit']")
     public WebElement registerSubmitButton;

     @FindBy (xpath = "//input[@name='firstName']")
     public WebElement inputFirstName;

      @FindBy (xpath = "//input[@name='lastName']")
     public WebElement inputLastName;

  @FindBy (xpath = "//input[@name='username']")
     public WebElement inputUsername;

  @FindBy (xpath = "//input[@name='email']")
     public WebElement inputEmail;

  @FindBy (xpath = "//input[@name='firstPassword']")
     public WebElement inputFPassword;

@FindBy (xpath = "//input[@name='secondPassword']")
     public WebElement inputSecPassword;

@FindBy (xpath = "//a[@class='d-flex align-items-center dropdown-toggle nav-link']")
public WebElement dropDownMenu;

@FindBy (xpath = "//div[@class='Toastify__toast-container Toastify__toast-container--top-left toastify-container']")
public WebElement toastContainer;

@FindBy (xpath = "//tbody//tr")
public List<WebElement> rowList;

@FindBy (xpath = "(//a[@class='d-flex align-items-center dropdown-toggle nav-link'])[2]")
public WebElement administration;

@FindBy (xpath = "//*[@id=\"admin-menu\"]/div")
public WebElement userManagement;

@FindBy (xpath = "//td[text()='321-54-0808']")
public WebElement physician1;

@FindBy (xpath = "//span[text()='Deactivated']")
public WebElement deactivatedButton;

@FindBy(xpath = "//span[text()='View']")
public WebElement viewButton;

@FindBy(xpath = "(//a[@class='btn btn-primary btn-sm'])[1]")

public WebElement editButton;

@FindBy (xpath = "(//(//span[text()='Edit'])[1]")

public WebElement editButtonFirst;

@FindBy(xpath = "//select[@name='speciality']")
public WebElement selectSpeciality;

@FindBy(id = "physician-speciality")
public WebElement specialityId;

@FindBy (xpath = "//input[@name='examFee']")
public WebElement examFee;

@FindBy(xpath = "//*[@id=\"app-view-container\"]/div/div/div/div/div[1]/div/table/thead")
public WebElement phyisiciansInfo;

@FindBy(xpath = "//*[contains(text(),'A user is updated with idintifier systema')]")
    public WebElement containerMessage;

@FindBy(xpath = "(//a[@class='btn btn-danger btn-sm'])[1]")
public WebElement deleteButton;



    @FindBy(xpath = "//*[@name='login']")
    public WebElement logInTextBoxAd;

    @FindBy(xpath = "//span[text()='Administration']")
    public WebElement administrationDropdown;

    @FindBy(xpath = "//body")
    public WebElement tumBodyWebelementi;

    @FindBy(xpath = "//body//td")
    public List<WebElement> tumBodyDtalariList;

    @FindBy(xpath = "//tbody//tr") //table/tbody/tr[2]
    public List<WebElement> satirlarListesi;
@FindBy(xpath ="//*[@id=\"app-view-container\"]/div/div/div/div/div[1]/div/table/tbody/tr")
public List<WebElement> rowL;

     public WebElement satirGetir(int satirNo){
        String satirDianmikXpath="//tbody//tr["+satirNo+"]";
         return Driver.getDriver().findElement(By.xpath(satirDianmikXpath));
    }



    public String  hucreWebelementGetir(int satir, int sutun) {
        // 2.satirin 4.datasi   //tbody//tr[2]//td[4]
        // 4.satirin 5.datasi   //tbody//tr[4]//td[5]

        String dinamikHucreXpath="//tbody//tr["+ satir  +"]//td["+ sutun  +"]";
        WebElement istenenHucreElementi=Driver.getDriver().findElement(By.xpath(dinamikHucreXpath));

        return istenenHucreElementi.getText();
    }

    public void sutunYazdir(int sutun) {

        int satirsayisi = rowList.size();

        for (int i = 1; i <= satirsayisi; i++) {
            System.out.println(hucreWebelementGetir(i, sutun));
        }
    }

    @FindBy(xpath = "//span[text()='User management']")
    public WebElement userManagementButton;

  @FindBy(xpath = "//*[@name='ssn']")
  public WebElement ssnTextBox;

  @FindBy(xpath = "//*[@name='firstName']")
  public WebElement firstNameTextBox;

  @FindBy(xpath = "//*[@name='lastName']")
  public WebElement lastNameTextBox;

  @FindBy(xpath = "//*[@name='login']")
  public WebElement userTextBox;

  @FindBy(xpath = "//*[@name='email']")
  public WebElement emailTextBox;

  @FindBy(xpath = "//*[@id='register-submit']")
  public WebElement registerButton;


  //  @FindBy(xpath = "(//*[@class='page-item'])[last()]")
 //    @FindBy(xpath = "(//li[@class='page-item'])[6]")
    @FindBy(xpath = "(//li[@class='page-item'])[last()]//a")
    public WebElement clickGoToLastInt;

    //((//*[.='Deactivated'])//span)[last()]
    @FindBy(xpath = "(//*[@class='btn btn-danger'])[last()]")
    public WebElement clickLastDeactivatedButton;

    @FindBy(xpath = "((//*[.='Activated'])//span)[last()]")
    public WebElement verifyActivatedUser;

    // edit page start
    @FindBy(xpath = "((//*[.='Edit'])//span)[last()]")
    public WebElement clickLastEditButton;

    @FindBy(xpath = "//span[text()='Create or edit a user']")
    public WebElement verifyEditPage;

    @FindBy(xpath = "//div[@class='form-group'][last()]//*[@id='authorities']//*[contains(text(),'ROLE_PHYSICIAN')]")
    public WebElement physicianRollactivate;

    @FindBy(xpath = "//*[@class='btn btn-primary']")
    public WebElement saveRollButton;

    @FindBy(xpath = "//div[@class='Toastify__toast-container Toastify__toast-container--top-left toastify-container']")
    public WebElement verifyTextRole;

    @FindBy(id = "user-management-page-heading")
    public WebElement userPageVerifyAdmin;

    @FindBy(xpath = "//a[@class='btn btn-primary float-right jh-create-entity']")
    public WebElement createNewUserBtnAdPg;

    @FindBy(xpath = "//span[text()='Create or edit a user']")
    public WebElement verifyCreateOrEditPg;

   @FindBy(xpath = "//*[contains(text(),'User found with search SSN')]")
    public WebElement userFoundWithSearchSSN;


//    @FindBy(xpath = "//div[@class='table-responsive']//*[@id='aldoaldoni']")
//    public WebElement deletePhisicialAftRoll;

    //delete page start when log first time and its appears at down
    @FindBy(xpath = "((//*[.='Delete'])//span)[last()-1]")
    public WebElement clickBfrLastDeleteButton;

    @FindBy(xpath = "//div[@class='modal-footer']//span[text()='Delete']")
    public WebElement confirmDeleteButton;


    @FindBy(xpath = "//span[text()='Items&Titles']")
    public WebElement itemsTitelsDropdown;

    @FindBy(xpath = "//a[@class='dropdown-item']//span[text()='Physician']")
    public WebElement physicianDropdown;

    @FindBy(xpath ="//h2[@id='physician-heading']")
    public WebElement phyisiciansHeader;

    @FindBy(xpath = "//h2[@id='physician-heading']//span[text()='Physicians']")
    public WebElement physicianPageVerify;

//    @FindBy(xpath = "//a[@class='btn btn-primary float-right jh-create-entity']//span[text()='Create a new Physician']")
//    public WebElement createNewPhysician;
    @FindBy(xpath = "//a[@class='btn btn-primary float-right jh-create-entity']")
    public WebElement createNewPhysician;

    @FindBy(xpath = "//span[text()='Create or edit a Physician']")
    public WebElement createOrEditPhysician;

    @FindBy(xpath = "//input[@name='useSSNSearch']")
    public WebElement useSSNSearchCheckbox;

    @FindBy(xpath = "//input[@placeholder='000-00-0000']")
    public WebElement inputSNNTextbox;

    @FindBy(xpath = "//button[@class='btn btn-secondary']")
    public WebElement searchUserButton;
    @FindBy(id="useSSNSearch")
    public WebElement useSSNSearchceckbox;

@FindBy(id="physician-heading")
    public WebElement PhysiciansPageHeader;


}
