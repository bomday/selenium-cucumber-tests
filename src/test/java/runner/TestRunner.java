package runner;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import utils.BrowserDriver;

@RunWith(Cucumber.class)
@CucumberOptions(
        // This specifies the path to the feature files
        features = "src/test/java/features",
        // This specifies the package(s) where Cucumber should look for the step definitions
        glue = {"utils", "stepDefinition"},
        // This specifies the formats and destinations for the test reports
        plugin = {"pretty", "html:target/cucumber-html-report", "json:cucumber.json"}
)
public class TestRunner {
}
