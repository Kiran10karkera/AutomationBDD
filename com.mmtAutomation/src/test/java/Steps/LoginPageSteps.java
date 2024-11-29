package Steps;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Assert;

import Pages.LoginPage;
import Util.ConstantMmt;



public class LoginPageSteps {
	ConstantMmt constant=new ConstantMmt();
	LoginPage loginPage=new LoginPage();

	public void openTheUrl() {
		loginPage.openTheUrl();
		
	}

	
	public void verifyPageLoaded(String MakeMyTrip) {
		String expectedTitle="MakeMyTrip";
		String actualTitle=loginPage.verifyPageLoaded();
		Assert.assertTrue(actualTitle.contains(expectedTitle));
				
	}


	public void verifyExpectedTabSelected(String expectedTabName) {
		String actualbgColor=loginPage.verifyExpectedTabSelected(expectedTabName);
		Assert.assertEquals(constant.tabBackgroundColor, actualbgColor);
	}


	public void userClicksOnEmailButton() {
		loginPage.userClicksOnEmailButton();
	}


	public void verifyContinueButtonEnabled(String string, String string2) {
		Boolean expectedContinueButtonState=Boolean.parseBoolean(string2);
		Boolean actualContinueButtonState = loginPage.verifyContinueButtonEnabled();
		Assert.assertEquals(expectedContinueButtonState, actualContinueButtonState);
	}


	public void userClicksOnEmailTextField(String string) {
		loginPage.userClicksOnEmailTextField(string);
	}


	

	
	

}
