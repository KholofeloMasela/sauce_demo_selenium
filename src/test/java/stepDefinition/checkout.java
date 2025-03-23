package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import static Pages.addToCart.*;
import static Pages.logIn.*;
import static Pages.checkOut.*;

public class checkout {

    @Given("user is in the cart")
    public void user_is_in_the_cart(){
        navigateToHomePage();
        setUsername("standard_user");
        setPassword("secret_sauce");
        clickBtn();
        addItemtoCart();
        clickCart();
    }


    @When("user clicks checkout button")
    public void userClicksCheckoutButton() {
        clickCheckoutBtn();

    }

    @And("checkout information page is filled with {string}, {string} and {string}")
    public void checkoutInformationPageIsFilledWithAnd(String name, String lastname, String zipcode) {
        setFirstname(name);
        setLastname(lastname);
        setZipCode(zipcode);
        clickContinueBtn();

    }

    @Then("user can finish transaction")
    public void userCanFinishTransaction() {
        clickFinishBtn();
        Assert.assertEquals(getConfirmation(), "Thank you for your order!");
    }
}
