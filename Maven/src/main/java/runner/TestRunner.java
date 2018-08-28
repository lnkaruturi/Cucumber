package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="features", glue= {"stepdefination"},format= {"pretty","html:target/report"})
public class TestRunner {

}
