package Runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "/Users/devashishgupta/eclipse-workspace/FreeCrmBDDFramework/src/main/java/Features/login.feature",
		//features="Features",
		glue = {"stepDefinitions"},
		format= {"pretty","html:test-outout"}
		
		
		)

public class TestRunner {

}
