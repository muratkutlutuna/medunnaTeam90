package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",
                "html:target/cucumber-reports3.html",
                "html:target/default-cucumber-reports3.html",
                "json:target/json-reports/cucumber3.json",
                "junit:target/xml-report/cucumber3.xml",
                "rerun:target/failedRerun3.txt"
        },
        features = "src/test/resources/features",
        glue = {"stepDefinitions","hooks"},
        tags = "@Db",
        dryRun = false
)
public class TestRunner3 {
}
