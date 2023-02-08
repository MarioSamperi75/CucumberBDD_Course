package tests;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class __Hooks {
	@Before
	public void setup() {
		System.out.println("Browser got opened");
	}
	
	@After
	public void tearDown() {
		System.out.println("Browser got closed");
	
	}
	
	@Before(("@login"))
	public void onlyForBeforeLogin() {
		System.out.println("onlyForBeforeLogin");
	}
	
	@After(("@login"))
	public void onlyForAfterLogin() {
		System.out.println("onlyForAfterLogin");
	
	}
	
	@BeforeStep(("@register"))
	public void onlyForBeforeStepRegister() {
		System.out.println("onlyForBeforeStepRegister");
	}
	
	@AfterStep(("@register"))
	public void onlyForAfterStepRegister() {
		System.out.println("onlyForAfterStepRegister");
	
	}

}
