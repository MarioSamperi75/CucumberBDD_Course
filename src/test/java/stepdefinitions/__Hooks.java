package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class __Hooks {
	
	
	
	//The tag needs attribute "value" in case of multiple attributes
	//e.g. 	@Before(order=1, value="@search")
	@Before("@search")
	public void setup() {
		System.out.println("++ before hook - Setup method got executed ++");
	}

	@After("@search")
	public void tearDown() {
		System.out.println("-- before hook - TearDown method got executed --");

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
