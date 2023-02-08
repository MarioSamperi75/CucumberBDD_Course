package tests;

import io.cucumber.java.en.*;

public class ForgotPassword {
	
	@When("User clicks on MyAccount")
	public void user_clicks_on_my_account() {
		System.out.println(">> User has Clicked on MyAccount option");
	}

	@When("Selects login option")
	public void selects_login_option() {
		System.out.println(">> User has selected login option");
	}

	@When("Clicks on Forgotten Password option")
	public void clicks_on_forgotten_password_option() {
		System.out.println(">> User has clicked on forgotten password link ");
	}

	@When("Enters valid email address")
	public void enters_valid_email_address() {
		System.out.println(">> User has entered valid email address");
	}
	
	@When("Clicks on Continue button")
	public void clicks_on_continue_button() {
		System.out.println(">> User has clicked the Continue button");
	}

	@Then("Proper confirmation message should be displayed")
	public void proper_confirmation_message_should_be_displayed() {
		System.out.println(">> Proper confirmation message got displayed");
	}

}
