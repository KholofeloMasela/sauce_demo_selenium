package stepDefinition;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import static Pages.logIn.*;

public class login {
//   logIn login = new logIn(driver);


    @Given("User navigates to login page")
    public void user_navigates_to_login_page(){
        navigateToHomePage();

    }

    @When("User successfully enters credentials {string} and {string}")
    public void user_successfully_enters_credentials(String username, String password) {
        setUsername(username);
        setPassword(password);
    }


    @Then("user should be able to view product page")
    public void user_should_be_able_to_view_productPage() {
        clickBtn();
        Assert.assertEquals("Products", productPage());
    }

}
