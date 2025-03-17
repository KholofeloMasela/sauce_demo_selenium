package Pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utility.BrowserDriver;

public class logIn extends BrowserDriver {

    public static WebDriver driver;
    public static By username = By.xpath("//*[@id=\"user-name\"]");
    public static By password = By.xpath("//*[@id=\"password\"]");
    public static By loginBtn = By.xpath("//*[@id=\"login-button\"]");
    public static By logo = By.xpath("//*[@id=\"root\"]/div/div[1]");
    public static By product = By.xpath("//*[@id=\"header_container\"]/div[2]/span");

//    public logIn(WebDriver driver) {
//        super();
//    }


    public static void navigateToHomePage(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com");

        driver.findElement(logo).getText();


    }


    public static void setUsername(String userName){
        driver.findElement(username).sendKeys(userName);
    }

    public static void setPassword(String passWord){
        driver.findElement(password).sendKeys(passWord);
    }

    public static void clickBtn(){
        driver.findElement(loginBtn).click();

    }

    public static String productPage(){
        return driver.findElement(product).getText();
    }


}
