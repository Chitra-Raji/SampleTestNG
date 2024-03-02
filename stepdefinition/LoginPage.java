package stepdefinition;

import com.pageexe.LoginPageExecution;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPage extends LoginPageExecution{


@Given("Login to Application")
public void login_to_application() {
	browserLaunch();
}

@When("Enter the Username {string}")
public void enter_the_username(String user) {
	username(user);
}

@When("Enter the Password {string}")
public void enter_the_password(String pass) {
	password(pass);
}

@When("Enter the Login Button")
public void enter_the_login_button() {
	loginButton();
}

@Then("Validate the home page")
public void validate_the_home_page() {
	System.out.println("homepage");
}
}
