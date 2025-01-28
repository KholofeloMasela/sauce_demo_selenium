package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductPage {

    private WebDriver driver;
    private By pagetitle = By.xpath("//*[@id=\"header_container\"]/div[2]/span");
    private By dropdown = By.className("product_sort_container");


    public ProductPage(WebDriver driver){
        this.driver = driver;
    }

    public String getPageTitle(){
       return driver.findElement(pagetitle).getText();
    }

    public void filterProducts(int options){
//        WebDriverWait wait = new WebDriverWait(driver, 100);
        Select dropDownElement = new Select(driver.findElement(dropdown));
        dropDownElement.selectByIndex(options);
        


    }
}
