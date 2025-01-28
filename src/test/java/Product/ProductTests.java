package Product;

import Pages.ProductPage;
import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ProductTests extends BaseTests {


    @Test
    public void testSuccessfullLogin(){
        login.SetUserName("standard_user");
        login.SetPassword("secret_sauce");
        ProductPage productPage = login.ClickLogin();

        assertEquals(productPage.getPageTitle(),
                "Products",
                "Alert text is incorrect");
    }

    @Test
    public void filterOptions(){
        ProductPage productPage = login.ClickLogin();

        productPage.filterProducts(2);


    }
}
