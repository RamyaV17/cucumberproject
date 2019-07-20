package forcucumber;

import java.util.List;
//import java.awt.List;
import java.util.Map;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class sd5 {
	@Given("^user must login$")
	public void user_must_login() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  // throw new PendingException();
		System.out.println("try it");

	}

	@When("^Use enters and login$")
	public void use_enters_and_login(DataTable arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
	    //throw new PendingException();
		//List<Map<String, String>>credential=arg1.asMaps(String.class,String.class);
		 List<Map<String, String>> credential =arg1.asMaps(String.class,String.class);


		for(int i=0; i<credential.size();i++)
		{
			System.out.println(credential.get(i).get("username")+"\t"+credential.get(i).get("password"));
		}
	}

	@Then("^Usr mut be in the home page$")
	public void usr_mut_be_in_the_home_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new PendingException();
		System.out.println("try it");

	}


}
