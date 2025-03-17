package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


import static Pages.addToCart.*;
import static Pages.logIn.*;

public class addToCart {

    @Given("user has successfully loged in")
    public void user_Has_successfully_logedIn(){
        navigateToHomePage();
        setUsername("standard_user");
        setPassword("secret_sauce");
        clickBtn();

    }


    @When("user clicks add to cart")
    public void userClicksAddToCart() {
        addItemtoCart();
    }

    @And("user is able to view cart")
    public void userIsAbleToViewCart() {
        clickCart();


    }

    @Then("user can see added item in the cart")
    public void userCanSeeAddedItemInTheCart() {
        Assert.assertEquals(getItemName(), "Sauce Labs Bike Light");
    }
}
