package stepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MainSteps {
	
	
	@Given("User is on netbanking landing page")
	public void user_is_on_netbanking_landing_page() {
			//throws InterruptedException {
		//driver.get("http://Gmail.com")
	 //Thread.sleep(10000);
		System.out.println("User landed on netbanking page");		
	}

	@When("User login to the application and enter username and password")
	public void user_login_to_the_application_and_enter_username_and_password() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("User login to the application and enter username and password");
	}

	@Then("Home page should be populated")
	public void home_page_should_be_populated() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Home page should be populated");
	}

	@Then("Cards are displayed")
	public void cards_are_displayed() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Cards are displayed");
	}
	
	@When("User login to the application with Username {string} and Password {string}")
	public void user_login_to_the_application_with_username_and_password(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}



}
