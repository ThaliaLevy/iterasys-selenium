package steps;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        dryRun = false,
        monochrome = false,
        features = "src/test/resources/features",
        glue = "steps",
        plugin = {
                "pretty",
                "html:target/relatorioSimples",
                "json:target/relatorioSimples.json",
                "com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:target/dashboard.html"
        }
)

public class Runner {


}
