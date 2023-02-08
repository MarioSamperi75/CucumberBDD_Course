package tests;

import io.cucumber.java.en.*;

public class Login {

	@Given("^User navigates to Login page$")
	public void user_navigates_to_login_page() {
		System.out.println(">> User got navigated to Login Page");
	}

	@When("^User enters valid email address (.+)$")
	public void user_enters_valid_email_address_email(String email) {
		System.out.println(">> User entered valid email address: " + email);
	}

	@And("^Enters valid password (.+)$")
	public void enters_valid_password_password(String password) {
		System.out.println(">> User entered valid password: " + password);
	}

	@When("^Clicks on Login button$")
	public void clicks_on_login_button() {
		System.out.println(">> User clicked on Login Button");
	}

	@Then("^User should login successfully$")
	public void user_should_login_successfully() {
		System.out.println(">> User got Logged In Successfully");
	}

	@When("^User enters invalid email address \"([^@])*\"$")
	public void user_enters_invalid_email_address(String invalidEmailAddress) {
		System.out.println(">> User entered invalid emailAddress: " + invalidEmailAddress);
	}

	@When("^Enters invalid password \"(.+)*\"$")
	public void enters_invalid_password(String invalidPassword) {
		System.out.println(">> User entered invalid password: " + invalidPassword);
	}

	@Then("^User should get a proper warning message$")
	public void user_should_get_a_proper_warning_message() {
		System.out.println(">> User got a proper warning message");
	}

	@When("^User does not enter any credentials$")
	public void user_does_not_enter_any_credentials() {
		System.out.println(">> User did not enter any credentials");
	}

}
