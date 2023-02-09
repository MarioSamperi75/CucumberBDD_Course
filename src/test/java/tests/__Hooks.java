package tests;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class __Hooks {
	
	
	
	/*
	 * @Before public void setup() { System.out.println("Browser got opened"); }
	 * 
	 * @After public void tearDown() { System.out.println("Browser got closed");
	 * 
	 * }
	 * 
	 * @Before(("@login")) public void onlyForBeforeLogin() {
	 * System.out.println("onlyForBeforeLogin"); }
	 * 
	 * @After(("@login")) public void onlyForAfterLogin() {
	 * System.out.println("onlyForAfterLogin");
	 * 
	 * }
	 * 
	 * @BeforeStep(("@register")) public void onlyForBeforeStepRegister() {
	 * System.out.println("onlyForBeforeStepRegister"); }
	 * 
	 * @AfterStep(("@register")) public void onlyForAfterStepRegister() {
	 * System.out.println("onlyForAfterStepRegister"); }
	 */
	
	
	
	@Before(order=1)
	public void before1() {
		System.out.println("++ Starting before 1");
	}
	
	@Before(order=2)
	public void before2() {
		System.out.println("++ Starting before 2");
	}
	
	@Before(order=3)
	public void before3() {
		System.out.println("++ Starting before 3");
	}
	
	
	
	
	@After(order=1)
	public void after1() {
		System.out.println("++ Starting after 1");
	}
	
	@After(order=2)
	public void after2() {
		System.out.println("++ Starting after 2");
	}
	
	@After(order=3)
	public void after3() {
		System.out.println("++ Starting after 3");
	}
	
}
