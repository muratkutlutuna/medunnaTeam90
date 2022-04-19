package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.ConfigurationReader;
import utilities.Driver;

public class Hooks {
    public static RequestSpecification spec;
    @Before(value="@Api")
    public void setUp(){
        spec = new RequestSpecBuilder().setBaseUri(ConfigurationReader.getProperty("medunnaUrl")).build();
    }
    @Before(value="@Db")
    public void setUpDb(){
    }

    @Before(order = 1, value = "@UIRegistration")
    public void navigateToRegistration(){
        Driver.getDriver().get(ConfigurationReader.getProperty("medunnaRegistration"));
    }

    @After
    public void tearDown(Scenario scenario){

        if (scenario.isFailed()) {
            final byte[] screenshot=((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png","screenshots");
            //Driver.getDriver().get("https://www.medunna.com/logout");
        }
        //Driver.closeDriver();
    }
}