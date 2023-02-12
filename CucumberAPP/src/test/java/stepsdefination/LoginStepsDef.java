package stepsdefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepsDef {
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
	   System.out.println("user is on login page");
	}

	@When("user enter username and password")
	public void user_enter_username_and_password() {
		 System.out.println("user enter username and password");
	   
	}

	@When("click on loing button")
	public void click_on_loing_button() {
		 System.out.println("click on loing button");
	  
	}

	@Then("user is navigated to home page")
	public void user_is_navigated_to_home_page() {
		 System.out.println("user is navigated to home page");

	}


}
