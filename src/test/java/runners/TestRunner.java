package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
// you can specify a single feature to run
// e.g. features = "src/test/java/features/Search.feature",

// you can override the tag from the console
// e.g. from source directory
// mvn test -Dcucumber.filter.tags="@search"

@CucumberOptions(
		features = "src/test/resources/features", 
		glue = { "stepdefinitions",	"hooks" }, 
		tags = "@all", 
		plugin = { 	"pretty", 
					"json:target/cucumber-report/cucumber.json",
					"html:target/cucumber-report/cucumber.html",
					"junit:target/cucumber-report/cucumber.xml"
					})
public class TestRunner {

}

// you can use or/and/not operator for tags

//@CucumberOptions(plugin = {"pretty","html:target/CucumberHTMLReport.html"}, tags="@login or @register")
//@CucumberOptions(plugin = {"pretty","html:target/CucumberHTMLReport.html"}, tags="@smoke and @login")
//@CucumberOptions(plugin = {"pretty","html:target/CucumberHTMLReport.html"}, tags=not "@nocredentials")
