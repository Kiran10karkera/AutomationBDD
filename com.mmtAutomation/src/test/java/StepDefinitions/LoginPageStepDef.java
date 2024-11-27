package StepDefinitions;

import Steps.LoginPageSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageStepDef {
	
	LoginPageSteps loginPageSteps= new LoginPageSteps();

	
	@Given("user opens the url {string}")
	public void user_opens_the_url(String string) {

	
	}
	@Then("user should be able to see {string} page")
	public void user_should_be_able_to_see_page(String string) {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
	}
	@Then("verify {string} tab selected by default")
	public void verify_tab_selected_by_default(String string) {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
	}
	@Then("user clicks on {string} button")
	public void user_clicks_on_button(String string) {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
	}
	@Then("verify {string} button enabled {string}")
	public void verify_button_enabled(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
	}
	@When("user enters username {string}")
	public void user_enters_username(String string) {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
	}
	@Then("{string} button should be enabled'true'")
	public void button_should_be_enabled_true(String string) {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
	}
	@Then("user should be redirected to {string} tab")
	public void user_should_be_redirected_to_tab(String string) {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
	}
	@When("user enters password {string}")
	public void user_enters_password(String string) {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
	}
	@Then("verify that username {string} should be retained {string}")
	public void verify_that_username_should_be_retained(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
	}
	@Then("verify that {string} is not retained")
	public void verify_that_is_not_retained(String string) {
		
		
	}
	
	@Then("verify that the user can {string} successfully")
	public void verify_that_the_user_can_successfully(String string) {
		
		
		
	}


	

	
}
