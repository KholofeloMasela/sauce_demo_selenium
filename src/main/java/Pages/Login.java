package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {

    private WebDriver driver;
    private By userName = By.xpath("//*[@id=\"user-name\"]");
    private By Password = By.xpath("//*[@id=\"password\"]");
    private By loginBtn = By.xpath("//*[@id=\"login-button\"]");


    public Login(WebDriver driver){
        this.driver = driver;

    }


    public void SetUserName(String username){
        driver.findElement(userName).sendKeys(username);

    };

    public void SetPassword(String password){
        driver.findElement(Password).sendKeys(password);

    };

    public ProductPage ClickLogin(){
        driver.findElement(loginBtn).click();
        return new ProductPage(driver);

    };
}
