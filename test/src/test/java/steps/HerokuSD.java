package steps;

import com.herokuapp.PageElements;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class HerokuSD extends start.driver.DriverWrapper {
	
	PageElements locator = new PageElements();
	
	
	@Given("^User is on the Threely login page$")
	public void iClickOnSubmitButton() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		initializeWebDriver("https://floating-anchorage-58495.herokuapp.com/login");
	}
	
	@When("^I enter username as \"([^\"]*)\" and password as \"([^\"]*)\"$")
	public void i_enter_username_as_and_password_as(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    locator.clickOnEmail();
	    locator.setEmail(arg1);
	    locator.clickOnPassword();
	    locator.setPassword(arg2);
	}

	@When("^I click on submit button$")
	public void i_click_on_submit_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    locator.clickOnEmail();
	}

	@Then("^I verify logout button is displayed$")
	public void i_verify_logout_button_is_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    locator.clickOnAvitar();
		locator.checkLogout();
	}

}
