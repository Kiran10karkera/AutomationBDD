package StepDefinitions;

import Steps.LoginPageSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageStepDef {
	
	LoginPageSteps loginPageSteps= new LoginPageSteps();

	
	@Given("user opens the url makemytrip")
	public void user_opens_the_url() {
		loginPageSteps.openTheUrl();
	}
	
	@Then("user should be able to see {string} page")
	public void user_should_be_able_to_see_page(String MakeMyTrip) {
		loginPageSteps.verifyPageLoaded(MakeMyTrip);
		
		
	}
	@Then("verify {string} tab is selected")
	public void verifyExpectedTabSelected(String expectedTabName) {
		loginPageSteps.verifyExpectedTabSelected(expectedTabName);
		
	}
	
	@Then("user clicks on {string} button")
	public void userClicksOnEmailButton(String string) {
		loginPageSteps.userClicksOnEmailButton();
		
	}
	
	@Then("verify {string} button enabled {string}")
	public void verifyContinueButtonEnabled(String string, String string2) {
		loginPageSteps.verifyContinueButtonEnabled(string,string2);
		
	}

	@Then("user clicks on {string} text field")
	public void userClicksOnEmailTextField(String string) {
		loginPageSteps.userClicksOnEmailTextField(string);
		
	}
	

	
}
