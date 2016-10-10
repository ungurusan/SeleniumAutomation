package Tests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;


public class TestConfig {


        WebDriver driver;
        WebDriverWait delay;

    @BeforeSuite
    public void testBeforeSuite() {
        System.out.println("Starting driver!");
        driver = new FirefoxDriver();
        delay = new WebDriverWait(driver, 5);

    }

    @AfterSuite
    public void testAfterSuite() {
        System.out.println("Closing driver!");
        driver.close();
        driver.quit();
    }

    @BeforeTest
    public void testBeforeTest() {

    }

    @AfterTest
    public void testAfterTest() {

    }

}
