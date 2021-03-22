package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pages.LoginPage;

public class LoginAsGenericParentStepDefinitions {
	LoginPage driver;
	
	public LoginAsGenericParentStepDefinitions(LoginPage driver) {
		this.driver = driver;
	}
	
	
	@Given("I am on the happy for parents page")
	public void i_am_on_the_happy_for_parents_page() {
        driver.navigateToHappyForParents();
	}

	@When("I login with email")
	public void i_login_with_email() {
        driver.enterCredentials();
	}

	@Then("I should see the happy home page")
	public void i_should_see_the_happy_home_page() {
        driver.siteHomePage();
	}
}
