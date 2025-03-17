package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

import java.time.Duration;

public class ProductPage {

    private WebDriver driver;
    private By pagetitle = By.xpath("//*[@id=\"header_container\"]/div[2]/span");
    private By dropdown = By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select");
    private By addItem = By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]");
    private By cart = By.xpath("//*[@id=\"shopping_cart_container\"]/a");
    private By removeItem = By.xpath("//*[@id=\"remove-sauce-labs-backpack\"]");


    public ProductPage(WebDriver driver){
        this.driver = driver;
    }

    public String getPageTitle(){
       return driver.findElement(pagetitle).getText();
    }
//
//    public void filterProducts(int options){
////        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
////        wait.until(ExpectedConditions.presenceOfElementLocated(dropdown));
////        driver.manage().timeouts().implicitlyWait(10, java.util.concurrent.TimeUnit.SECONDS);
//        Select dropDownElement = new Select(driver.findElement(dropdown));
//        dropDownElement.selectByIndex(options);
//
//
//
//    }

    public String addToCart(){
        driver.findElement(addItem).click();
        return driver.findElement(removeItem).getText();


    }

}
