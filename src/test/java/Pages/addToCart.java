package Pages;

import org.openqa.selenium.By;

import static Pages.logIn.*;

public class addToCart {
    public static By addItem2 = By.xpath("//*[@id=\"add-to-cart-sauce-labs-bike-light\"]");
    public static By item2name = By.xpath("//*[@id=\"item_0_title_link\"]/div");
    public static By cartCount = By.xpath("//*[@id=\"shopping_cart_container\"]/a/span");
    public static By cart = By.xpath("//*[@id=\"shopping_cart_container\"]/a");



    public static void addItemtoCart(){

        driver.findElement(addItem2).click();
    }

    public static String getItemName(){
        return driver.findElement(item2name).getText();

    }

    public static String verifyCartCount(){
       return driver.findElement(cartCount).getText();

    }

    public static void clickCart(){
        driver.findElement(cart).click();


    }







    

}
