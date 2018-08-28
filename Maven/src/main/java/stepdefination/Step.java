package stepdefination;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step {
	@Given("^I want to visit Github$")
	public void i_want_to_visit_Github() throws Throwable {
		System.out.println("A");
	    
	}

	@When("^Entered Login page$")
	public void entered_Login_page() throws Throwable {
		System.out.println("B");
	    
	}

	@Then("^Login successfully$")
	public void login_successfully() throws Throwable {
		System.out.println("C");
	   
	}



}
