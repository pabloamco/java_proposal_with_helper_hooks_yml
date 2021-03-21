package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pages.LoginPage;

public class LoginAsGenericParentStepDefinitions {
	LoginPage loginPage;
	
	public LoginAsGenericParentStepDefinitions(LoginPage loginPage) {
		this.loginPage = loginPage;
	}
	
	
	@Given("I am on the happy for parents page")
	public void i_am_on_the_happy_for_parents_page() {
        loginPage.navigateToHappyForParents();
	}

	@When("I login with email")
	public void i_login_with_email() {
        loginPage.enterCredentials();
	}

	@Then("I should see the happy home page")
	public void i_should_see_the_happy_home_page() {
        loginPage.siteHomePage();
	}
}
