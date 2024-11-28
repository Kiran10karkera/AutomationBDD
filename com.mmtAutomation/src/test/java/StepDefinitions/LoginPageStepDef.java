package StepDefinitions;

import Steps.LoginPageSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageStepDef {
	
	LoginPageSteps loginPageSteps= new LoginPageSteps();

	
	@Given("user opens the url {string}")
	public void user_opens_the_url(String string) {
		loginPageSteps.openTheUrl();
	}

	

	
}
