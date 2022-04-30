package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",
                "html:target/cucumber-reports1.html",
                "html:target/default-cucumber-reports1.html",
                "json:target/json-reports/cucumber1.json",
                "junit:target/xml-report/cucumber1.xml",
                "rerun:target/failedRerun1.txt"
        },
        features = "src/test/resources/features",
        glue = {"stepDefinitions","hooks"},
        tags = "@kutluapi",
        dryRun = false
)
public class TestRunner1 {
}
