package forcucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\ramyavenkit\\workspace\\cucumber1\\src\\resources\\java\\cum1.feature",
plugin={"html:target/Reports"})

public class sr1 {
  
}
