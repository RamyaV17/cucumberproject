package forcucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class sd1 {
	@Given("^Sign up$")
	public void sign_up() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println("try it");
	}

	@When("^I have to sign up with details$")
	public void i_have_to_sign_up_with_details() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
		System.out.println("try it");

	}

	@Then("^receive confirmation  mail$")
	public void receive_confirmation_mail() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new PendingException();
		System.out.println("try it");

	}

	@Then("^greeting message$")
	public void greeting_message() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new PendingException();
		System.out.println("try it");

	}


}
