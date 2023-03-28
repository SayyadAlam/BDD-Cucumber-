package StepDefinations;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features={"src/test/resources/Features/login.feature"}
,glue={"loginStepDefination"},
monochrome=true,
plugin= {"pretty","html:target/htmlReports"}






)




public class TestRunnerClass {

}
