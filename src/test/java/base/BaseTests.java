package base;

import Pages.Login;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTests {

    private WebDriver driver;
    protected Login login;

    @BeforeClass
    public void setup(){
        System.setProperty("webdriver.chrome.driver", "resources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        login = new Login(driver);

    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }


//    public static void main(String[] args) {
//        BaseTests tests = new BaseTests();
//        tests.setup();
//    }
}
