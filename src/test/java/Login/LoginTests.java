package Login;

import Pages.ProductPage;
import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class LoginTests extends BaseTests {

    @Test
    public void testSuccessfullLogin(){
        login.SetUserName("standard_user");
        login.SetPassword("secret_sauce");
        ProductPage productPage = login.ClickLogin();

        assertEquals(productPage.getPageTitle(),
                "Products",
                "Alert text is incorrect");
    }
}
