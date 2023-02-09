package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/features",
		glue = "stepdefinitions",
		plugin = {"pretty","html:target/CucumberHTMLReport.html"}/*, tags="@login"*/
		)
public class __Runner {

}

// you can use or/and/not operator for tags

//@CucumberOptions(plugin = {"pretty","html:target/CucumberHTMLReport.html"}, tags="@login or @register")
//@CucumberOptions(plugin = {"pretty","html:target/CucumberHTMLReport.html"}, tags="@smoke and @login")
//@CucumberOptions(plugin = {"pretty","html:target/CucumberHTMLReport.html"}, tags=not "@nocredentials")
