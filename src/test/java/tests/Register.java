package tests;

import io.cucumber.java.en.*;

public class Register {
	
	@Given("User navigates to Register Account page")
	public void user_navigates_to_register_account_page() {
		System.out.println(">> User got navigated to Register Account Page");
	}

	@When("User enters firstname {string} into the Firstname field")
	public void user_enters_firstname_into_the_firstname_field(String firstname) {
		System.out.println(">> User entered firstname: " + firstname + " into the Firstname field");
	}

	@When("Enters lastname {string} into the Lastname field")
	public void enters_lastname_into_the_lastname_field(String lastname) {
		System.out.println(">> User entered lastname: " + lastname + " into the Lastname field");
	}

	@When("Enters email address {string} into the EmailAddress field")
	public void enters_email_address_into_the_email_address_field(String emailAddress) {
		System.out.println(">> User enters email address: " + emailAddress + " into the Email Address field");
	}

	@When("Enters telephone {string} into the Telephone field")
	public void enters_telephone_into_the_telephone_field(String telephone) {
		System.out.println(">> User enters telephone: " + telephone + " into the Telephone field");
	}

	@When("Enters password {string} into the Password field")
	public void enters_password_into_the_password_field(String password) {
		System.out.println(">> User enters password: " + password + " into the Password field");
	}

	@When("Enters password {string} into the Password Confirm field")
	public void enters_password_into_the_password_confirm_field(String password) {
		System.out.println(">> User enters password: " + password + " into the Password Confirm field");
	}

	@When("Selects Privacy Policy field")
	public void selects_privacy_policy_field() {
		System.out.println(">> User has selected the Privacy Policy field");
	}

	@When("Clicks on Continue button")
	public void clicks_on_continue_button() {
		System.out.println(">> User has clicked the Continue button");
	}

	@Then("Account should get successfully created")
	public void account_should_get_successfully_created() {
		System.out.println(">> The account got successfully created");
	}

	@When("Select Yes for Newsletter")
	public void select_yes_for_newsletter() {
		System.out.println(">> User has selected Yes for NewsLetter");
	}

	@When("User do not enter details into any fields")
	public void user_do_not_enter_details_into_any_fields() {
		System.out.println(">> User has kept all fields blank");
	}

	@Then("Warning message should displayed for the mandatory fields")
	public void warning_message_should_displayed_for_the_mandatory_fields() {
		System.out.println(">> Warning message for the mandatory fields was displayed");
	}

	@Then("Warning message informing the User about duplicate email should be displayed")
	public void warning_message_informing_the_user_about_duplicate_email_should_be_displayed() {
		System.out.println(">> Warning message informing the User about duplicate email was displayed");
	}

}
