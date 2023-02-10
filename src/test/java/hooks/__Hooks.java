package hooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;

public class __Hooks {
	
	
	
	//The tag needs attribute "value" in case of multiple attributes
	//e.g. 	@Before(order=1, value="@search")
	@Before
	public void setup(Scenario scenario) {
		System.out.println("** Execution started for scenario - " + scenario.getName()  );
		System.out.println("++ before hook - Setup method got executed ++");
	}

	@After
	public void tearDown(Scenario scenario) {
		System.out.println("-- before hook - TearDown method got executed --");
		System.out.println("** Execution ended for scenario - " + scenario.getName()  );

	}

	/*
	 * @Before(order=1) public void before1() {
	 * System.out.println("++ Starting before 1"); }
	 * 
	 * @Before(order=2) public void before2() {
	 * System.out.println("++ Starting before 2"); }
	 * 
	 * @Before(order=3) public void before3() {
	 * System.out.println("++ Starting before 3"); }
	 * 
	 * 
	 * 
	 * 
	 * @After(order=1) public void after1() {
	 * System.out.println("++ Starting after 1"); }
	 * 
	 * @After(order=2) public void after2() {
	 * System.out.println("++ Starting after 2"); }
	 * 
	 * @After(order=3) public void after3() {
	 * System.out.println("++ Starting after 3"); }
	 */
	
}
