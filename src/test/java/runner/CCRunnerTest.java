package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:target/cucumber.html"},
        features = "src/test/resources/Feature/login.feature",
        glue = "steps"
)
public class CCRunnerTest {
}

