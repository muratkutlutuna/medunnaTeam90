package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MehlikaPage extends BasePage{

    public MehlikaPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    //   @FindBy(id="twotabsearchtextbox")
    //    public WebElement aramaKutusu;

    //    @FindBy(xpath = "(//div[@class='a-section a-spacing-small a-spacing-top-small'])[1]")
    //    public WebElement sonucYazisiElementi;
    @FindBy (xpath = "(//img[@alt='Logo'])")
    public WebElement homePageLogo;

    @FindBy (xpath = "(//span[text()='Make an'])")
    public WebElement MakeAnAppointmentButton;       //Home Page

    @FindBy(xpath = "(//label[text()='First Name']")
    public WebElement firstNameTag;

    @FindBy(xpath = "//input[@name='firstName']")
    public WebElement firstNameInputBox;

    @FindBy(xpath = "//div[text()='Your FirstName is required.']")
    public WebElement firstNameWarning;

    @FindBy(xpath ="//label[text()='Last Name']" )
    public WebElement lastNameTag;

    @FindBy(xpath = "")

}
