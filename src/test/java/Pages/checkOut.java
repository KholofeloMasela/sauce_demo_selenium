package Pages;

import org.openqa.selenium.By;
import static Pages.logIn.*;

public class checkOut {

    public static By checkoutBtn = By.xpath("//*[@id=\"checkout\"]");
    public static By firstname = By.xpath("//*[@id=\"first-name\"]");
    public static By lastname = By.xpath("//*[@id=\"last-name\"]");
    public static By zipCode = By.xpath("//*[@id=\"postal-code\"]");
    public static By continueBtn = By.xpath("//*[@id=\"continue\"]");
    public static By finishBtn = By.xpath("//*[@id=\"finish\"]");
    public static By orderConfirmation = By.xpath("//*[@id=\"checkout_complete_container\"]/h2");

    public static void setFirstname(String firstName){
        driver.findElement(firstname).sendKeys(firstName);


    }

    public static void setLastname(String lastName){
        driver.findElement(lastname).sendKeys(lastName);

    }

    public static void setZipCode(String zipcode){
        driver.findElement(zipCode).sendKeys(zipcode);

    }


    public static void clickCheckoutBtn(){
        driver.findElement(checkoutBtn).click();

    }

    public static void clickContinueBtn(){
        driver.findElement(continueBtn).click();

    }

    public static void clickFinishBtn(){
        driver.findElement(finishBtn).click();

    }
    public static String getConfirmation(){
        return driver.findElement(orderConfirmation).getText();
    }

}
