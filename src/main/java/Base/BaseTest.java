package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    protected WebDriver driver;

    @BeforeMethod
    public void setup() {
        // System.setProperty can be used if WebDriverManager is not used
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
           // driver.quit();
        }
    }
}
