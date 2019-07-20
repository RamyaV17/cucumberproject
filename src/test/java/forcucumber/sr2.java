package forcucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\ramyavenkit\\workspace\\cucumber1\\src\\resources\\java\\cum2.feature",
plugin={"html:target/Reports"},tags={"@Login,@Search,@Register"})


public class sr2 {
}
