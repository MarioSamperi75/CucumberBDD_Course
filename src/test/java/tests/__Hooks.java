package tests;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class __Hooks {
	@Before
	public void setup() {
		System.out.println("Browser got opened");
	}
	
	@After
	public void tearDown() {
		System.out.println("Browser got closed");
	
	}

}
