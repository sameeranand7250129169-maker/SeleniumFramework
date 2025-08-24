package Tests;

import Base.BaseTest;
import Pages.LoginPage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void testValidLogin() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername("admin@yourstore.com");
        loginPage.enterPassword("admin");
        loginPage.clickLogin();

        String actualTitle = driver.getTitle();
        System.out.println("Title of the page is: " + actualTitle);

        Assert.assertEquals(actualTitle, "Dashboard / nopCommerce administration");
    }
}

