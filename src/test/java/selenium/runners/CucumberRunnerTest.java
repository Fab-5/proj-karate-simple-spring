package selenium.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/selenium/features",
        glue = "selenium.stepdefinitions"
)
public class CucumberRunnerTest {}
