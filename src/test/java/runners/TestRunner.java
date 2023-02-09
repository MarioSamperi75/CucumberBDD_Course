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
		glue = "stepdefinitions",
		tags = "@smoke",
		plugin = {"pretty","html:target/CucumberHTMLReport.html"}/*, tags="@login"*/
		)
public class TestRunner {

}

// you can use or/and/not operator for tags

//@CucumberOptions(plugin = {"pretty","html:target/CucumberHTMLReport.html"}, tags="@login or @register")
//@CucumberOptions(plugin = {"pretty","html:target/CucumberHTMLReport.html"}, tags="@smoke and @login")
//@CucumberOptions(plugin = {"pretty","html:target/CucumberHTMLReport.html"}, tags=not "@nocredentials")
